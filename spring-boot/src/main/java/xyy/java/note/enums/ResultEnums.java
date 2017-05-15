package xyy.java.note.enums;

/**
 * @author xyy
 * @version 1.0 2017/5/14.
 * @since 1.0
 */
public enum  ResultEnums {
    UnknownError(-1, "未知错误"),

    LITTLE_SCHOLE(100, "还在上小学"),

    MIDDLE_SCHOLE(101, "还在上初中")

    ;

    private Integer code;

    private String msg;

    ResultEnums(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
