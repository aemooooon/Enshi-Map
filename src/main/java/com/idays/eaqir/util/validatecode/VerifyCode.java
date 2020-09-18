package com.idays.eaqir.util.validatecode;

import lombok.Data;
/**
 * @Author: Hua WANG
 * @Date： 2020-09-17
 * @Description: com.idays.eaqir.util.validatecode
 * @version: 1.0
 */
@Data
public class VerifyCode {
    private String code;
    private byte[] imgBytes;
    private long expireTime;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public byte[] getImgBytes() {
        return imgBytes;
    }

    public void setImgBytes(byte[] imgBytes) {
        this.imgBytes = imgBytes;
    }

    public long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(long expireTime) {
        this.expireTime = expireTime;
    }
}
