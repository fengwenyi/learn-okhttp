package com.fengwenyi.serviceapi;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * API接口
 * @author Wenyi Feng
 * @since 2019-01-10
 */
@RestController
@RequestMapping(value = "/api", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class ApiController {

    @GetMapping("/get")
    public String get() {
        return "this is get data";
    }

    @PostMapping("/post")
    public String post(@RequestBody User user) {
        return user.toString();
    }

}
