package xyy.java.note.exception;

import xyy.java.note.enums.ResultEnums;

/**
 * @author xyy
 * @version 1.0 2017/5/14.
 * @since 1.0
 */
public class GirlException extends RuntimeException {
    private int code;

    private String message;

    public GirlException(ResultEnums enums) {
        super(enums.getMsg());
        this.code = enums.getCode();
    }

    public GirlException(int code, String message) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
