package com.my.blog.website.controller.renting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wangq on 2017/3/20.
 */
@Controller
@RequestMapping("/renting")
public class RentingController  {
    private static final Logger LOGGER = LoggerFactory.getLogger(RentingController.class);
    /**
     * 系统设置
     */
    @GetMapping(value = "/index")
    public String setting(HttpServletRequest request) {


        return "renting/index";
    }



}
