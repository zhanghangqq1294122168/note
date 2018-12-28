package utils;

import lombok.Data;


/**
 * @author zh
 */
@Data
public class Result {

    private Integer status;
    private String msg;
    private Object data;

    public Result() {
    }

    private Result(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public static Result build(Integer status, String msg, Object data) {
        return new Result(status, msg, data);
    }

    public static Result ok(Object data) {
        return new Result(data);
    }

    private Result(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

}
