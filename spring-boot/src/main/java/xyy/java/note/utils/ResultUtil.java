package xyy.java.note.utils;

import xyy.java.note.domain.Result;

/**
 * @author xyy
 * @version 1.0 2017/5/14.
 * @since 1.0
 */
public class ResultUtil {
    public static Result sucess(Object object){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result sucess(){
        return sucess(null);
    }

    public static Result error(int code, String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
