package com.fengwenyi.serviceapi;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Wenyi Feng
 * @since 2019-01-10
 */
@Data
@Accessors(chain = true)
public class User {
    private String name;
    private Integer age;
}
