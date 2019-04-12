package pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by lihao on 2019/4/11.
 */
@Data
public class Hello implements Serializable {

    private String customer;

    private String service;

    public Hello(String customer, String service) {
        this.customer = customer;
        this.service = service;
    }

    public Hello(String service) {
        this.service = service;
    }



    public Hello() {
    }
}
