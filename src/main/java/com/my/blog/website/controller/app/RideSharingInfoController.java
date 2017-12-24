package com.my.blog.website.controller.app;

import com.my.blog.website.controller.BaseController;
import com.my.blog.website.exception.TipException;
import com.my.blog.website.model.Bo.RestResponseBo;
import com.my.blog.website.model.Vo.RideSharingInfo;
import com.my.blog.website.service.ILogService;
import com.my.blog.website.service.IRideSharingInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 顺风车
 * Created by zhangchenjia on 2017/12/19.
 */
@Controller
@RequestMapping("/ride_sharing")
@Transactional(rollbackFor = TipException.class)
public class RideSharingInfoController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RideSharingInfoController.class);

    @Resource
    private IRideSharingInfoService rideSharingInfoService;

    @Resource
    private ILogService logService;

    @GetMapping(value = "/insert")
    public String insert() {
        return "ride_sharing/insert";
    }

    @PostMapping(value = "insert")
    @ResponseBody
    public RestResponseBo doInsert(RideSharingInfo rideSharingInfo,HttpServletRequest request) {

        try {
            rideSharingInfoService.insertRideSharingInfo(rideSharingInfo);
        } catch (Exception e) {
            String msg = "顺风车信息发布失败";
            if (e instanceof TipException) {
                msg = e.getMessage();
            } else {
                LOGGER.error(msg, e);
            }
            return RestResponseBo.fail(msg);
        }
        return RestResponseBo.ok();
    }

    @GetMapping(value = "/update")
    public String update() {
        return "ride_sharing/update";
    }

    @PostMapping(value = "update")
    @ResponseBody
    public RestResponseBo doUpdate(RideSharingInfo rideSharingInfo,HttpServletRequest request) {

        try {
            rideSharingInfoService.updateRideSharingInfo(rideSharingInfo);
        } catch (Exception e) {
            String msg = "顺风车信息修改失败";
            if (e instanceof TipException) {
                msg = e.getMessage();
            } else {
                LOGGER.error(msg, e);
            }
            return RestResponseBo.fail(msg);
        }
        return RestResponseBo.ok();
    }

    @RequestMapping(value = "update")
    @ResponseBody
    public RestResponseBo doDelete(RideSharingInfo rideSharingInfo,HttpServletRequest request) {

        try {
            rideSharingInfoService.deleteRideSharingInfo(rideSharingInfo);
        } catch (Exception e) {
            String msg = "顺风车信息删除失败";
            if (e instanceof TipException) {
                msg = e.getMessage();
            } else {
                LOGGER.error(msg, e);
            }
            return RestResponseBo.fail(msg);
        }
        return RestResponseBo.ok();
    }

    @RequestMapping(value = "get")
    @ResponseBody
    public String doGet(RideSharingInfo rideSharingInfo,HttpServletRequest request) {

        List<RideSharingInfo> info = rideSharingInfoService.getRideSharingInfo(rideSharingInfo);
        request.setAttribute("rideSharingInfos", info);
        return "ride_sharing/list";

    }


}
