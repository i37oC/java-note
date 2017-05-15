package xyy.java.note.hanlde;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import xyy.java.note.domain.Result;
import xyy.java.note.enums.ResultEnums;
import xyy.java.note.exception.GirlException;
import xyy.java.note.utils.ResultUtil;

/**
 * @author xyy
 * @version 1.0 2017/5/14.
 * @since 1.0
 */
@ControllerAdvice
public class ExceptionHandle {
    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Result handle(Exception e){
        if(e instanceof GirlException){
            GirlException girlException = (GirlException) e;
            return ResultUtil.error(girlException.getCode(), girlException.getMessage());
        }
        logger.error("【系统异常】{}", e);
        return ResultUtil.error(ResultEnums.UnknownError.getCode(), ResultEnums.UnknownError.getMsg());
    }
}
