package xyy.java.note.webmagic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyy.java.note.webmagic.downloader.Downloader;
import xyy.java.note.webmagic.pipeline.Pipeline;
import xyy.java.note.webmagic.processor.PageProcessor;
import xyy.java.note.webmagic.scheduler.QueueScheduler;
import xyy.java.note.webmagic.scheduler.Scheduler;
import xyy.java.note.webmagic.thread.CountableThreadPool;
import xyy.java.note.webmagic.utils.UrlUtils;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Entrance of a crealer
 * a spider contains four modules : Downloader, Scheduler, PageProcess and Pipline
 * Every module is a field of Spider
 * the modules are defined in interface.
 * You can customize a spider with various implementations of them.
 *
 * ...
 *
 * @author xyy
 * @version 1.0 2017/4/19.
 * @since 1.0
 */
public class Spider implements Runnable, Task{
    protected Logger logger = LoggerFactory.getLogger(getClass());

    protected final static int STAT_INIT = 0;

    protected final static int STAT_RUNNING = 1;

    protected final static int STAT_STOPPED = 2;

    protected Downloader downloader;

    protected List<Pipeline> pipelines = new ArrayList();

    protected PageProcessor pageProcessor;

    protected List<Request> startRequests;

    protected Site site;

    protected String uuid;

    protected Scheduler scheduler = new QueueScheduler();



    /**
     * 线程
     *
     */
    protected CountableThreadPool threadPool;

    protected ExecutorService executorService;

    protected int threadNum = 1;

    protected AtomicInteger stat = new AtomicInteger(STAT_INIT);

    protected boolean exitWhenComplete = true;

    protected boolean spawnUrl = true;

    protected boolean destroyWhenExit = true;

    private ReentrantLock newUrlLock = new ReentrantLock();

    private Condition newUrlCondition = newUrlLock.newCondition();

    private List<SpiderListener> spiderListeners;

    private final AtomicLong pageCount = new AtomicLong(0);

    private Date startTime;

    /**
     * 当请求为空时，等待30秒
     */
    private int emptySleepTime = 30000;

    /**
     * create a spider with pageProcess
     *
     * @param pageProcessor
     * @return
     */
    public static Spider create(PageProcessor pageProcessor){
        return new Spider(pageProcessor);
    }

    /**
     * create a spider with pageProcessor.
     *
     * @param pageProcessor
     */
    public Spider(PageProcessor pageProcessor){
        this.pageProcessor = pageProcessor;
        this.site = pageProcessor.getSite();
    }

    /**
     * set startUrls of Spider.
     * prior to startUrls of Site.
     *
     * @param startUrls
     * @return
     */
    public Spider startUrls(List<String> startUrls){
        checkIfRunning();
        this.startRequests = UrlUtils.convertToRequests(startUrls);
        return this;
    }

    public Spider startRequest(List<Request> startRequests){
        checkIfRunning();
        this.startRequests = UrlUtils.convertToRequests(startRequests);
        return this;
    }

    /**
     * set a uuid for spider.
     *
     * @param uuid
     * @return
     */
    public Spider setUUID(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public Spider setScheduler(Scheduler scheduler){
        checkIfRunning();
        Scheduler oldScheduler = this.scheduler;
        this.scheduler = scheduler;

        //将 原调度器中的 任务放到新的调度器中
        if(oldScheduler!=null){
            Request request;
            while ((request = oldScheduler.poll(this))!=null){
                this.scheduler.push(request, this);
            }
        }
        return this;
    }

    public Spider addPipeline(Pipeline pipeline){
        checkIfRunning();
        this.pipelines.add(pipeline);
        return this;
    }

    public Spider setPipelines(List<Pipeline> pipelines) {
        checkIfRunning();
        this.pipelines = pipelines;
        return this;
    }

    public Spider clearPipeline() {
        pipelines = new ArrayList<Pipeline>();
        return this;
    }

    public Spider setDownloader(Downloader downloader) {
        checkIfRunning();
        this.downloader = downloader;
        return this;
    }

    protected void initComponent(){
        if(downloader == null){
            this.downloader = new Httpdo
        }

        if(pipelines.isEmpty()){

        }
    }


    public void run() {

    }

    public String getUUID() {
        return null;
    }

    public Site getSite() {
        return null;
    }

    protected void checkIfRunning(){
        if(stat.get() == STAT_RUNNING){
            throw new IllegalStateException("Spider is already running.");
        }
    }


}
