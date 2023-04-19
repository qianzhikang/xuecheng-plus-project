package com.xuecheng.base.exception;

import java.io.Serializable;

/**
 * @Description 统一异常返回
 * @Date 2023-04-17-13-53
 * @Author qianzhikang
 */

public class RestErrorResponse implements Serializable {
    private String errMessage;

    public RestErrorResponse(){
    }
    public RestErrorResponse(String errMessage){
        this.errMessage = errMessage;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }
}
