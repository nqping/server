package com.mobile.exception;

/**
 * @Memo 异常处理
 * @Author nqp
 **/
public class ServerException extends RuntimeException{

    public ServerException(String msg){
        super(msg);
    }

    public ServerException(Throwable cause) {
        super(cause);
    }
}
