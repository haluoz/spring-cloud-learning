package com.lxj.oauth2.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lee
 * @since 2023/2/5
 */
@RestController
@RequestMapping("/role")
public class NoPermissionController {

    @GetMapping("/getRole")
    public String getRole() {
        return "role";
    }
}
