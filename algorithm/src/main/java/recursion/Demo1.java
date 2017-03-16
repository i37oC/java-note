package recursion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by xyy on 2017/2/28.
 *
 * 分批处理一个集合的数据
 *
 *
 */
public class Demo1 {


    /**
     *
     * @param collections 集合
     * @param batch 批次
     * @param process 处理函数
     */
    public void batchProcess(Collection collections, int batch, Process process){

    }

    private void processLogical(List<Long> ids, int batch, Process process){
        int size = ids.size();
        List<Long> processIds;

        if(size<=batch){
            processIds = ids;
            process.process(processIds);
            return;
        }

        //取出前面 batch 个 ids
        processIds = ids.subList(0,batch);
        process.process(processIds);
        List<Long> remainIds = ids.subList(batch,size);
        processLogical(remainIds, batch, process);
    }



    private interface Process{
        boolean process(List<Long> ids);
    }

    public static void main(String[] args) {
        Demo1 digui = new Demo1();
        List<Long> ids = new ArrayList<Long>();
        for(int i=0 ; i<100; i++){
            ids.add(Long.parseLong(String.valueOf(i)));
        }
        System.out.println(ids);

        digui.processLogical(ids, 17, new Process() {
            public boolean process(List<Long> ids) {
                System.out.println(ids);
                return true;
            }
        });
    }
}
