package xyy.java.note.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import xyy.java.note.domain.Girl;
import xyy.java.note.domain.Result;
import xyy.java.note.repository.GrilRepository;
import xyy.java.note.service.GirlsService;
import xyy.java.note.utils.ResultUtil;

import javax.validation.Valid;
import java.util.List;

/**
 * @author xyy
 * @version 1.0 2017/5/11.
 * @since 1.0
 */
@RestController
public class GrilController {
    private final static Logger logger = LoggerFactory.getLogger(GrilController.class);

    @Autowired
    private GrilRepository grilRepository;
    @Autowired
    private GirlsService girlsService;

    /**
     * 查询所有女生列表
     * @return
     */
    @GetMapping(value = "/girls")
    public List<Girl> getGrils(){
        logger.info("查询girls");
        return grilRepository.findAll();
    }

    /**
     *
     * @param girl
     * @return
     */
    @PostMapping(value = "/girls")
    public Result<Girl> girlAdd(@RequestBody @Valid Girl girl, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ResultUtil.error(1, bindingResult.getFieldError().getDefaultMessage());
        }
        Girl girl1 = new Girl();
        girl1.setCupSize(girl.getCupSize());
        girl1.setAge(girl.getAge());
        return ResultUtil.sucess(grilRepository.save(girl));
    }


    /**
     * 查询一个女生
     * @param id
     * @return
     */
    @GetMapping(value = "/girls{id}")
    public Girl girlFindOne(@PathVariable Integer id){
        return grilRepository.findOne(id);
    }

    /**
     * 更新一个女生
     * @param id
     * @param cupSize
     * @param age
     * @return
     */
    @PutMapping(value = "/girls{id}")
    public Girl girlUpdagte(@PathVariable Integer id, @RequestParam("cupSize") String cupSize, @RequestParam Integer age){
        Girl girl = new Girl();
        girl.setId(id);
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return grilRepository.save(girl);
    }

    /**
     * 删除女生
     * @param id
     */
    @DeleteMapping(value = "/girls{id}")
    public void girlDelete(@PathVariable Integer id){
        grilRepository.delete(id);
    }

    @GetMapping(value = "/girls/getAge/{id}")
    public void getAge(@PathVariable Integer id) throws Exception{
        girlsService.getAge(id);
    }
}
