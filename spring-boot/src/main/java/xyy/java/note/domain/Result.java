package xyy.java.note.domain;

/**
 * @author xyy
 * @version 1.0 2017/5/14.
 * @since 1.0
 */
public class Result<T> {
    private Integer code;

    private String msg;

    /** 具体内容*/
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
