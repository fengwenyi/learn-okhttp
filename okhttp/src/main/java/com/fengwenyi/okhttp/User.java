package com.fengwenyi.okhttp;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Wenyi Feng
 * @since 2019-01-10
 */
@Data
//@Accessors(chain = true)
public class User {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public User setAge(Integer age) {
        this.age = age;
        return this;
    }
}
