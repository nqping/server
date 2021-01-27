package com.mobile.controller;

import com.mobile.domain.po.Mobile;
import com.mobile.model.Response;
import com.mobile.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @Memo TODO
 * @Author nqp
 **/
@RestController
@RequestMapping("/mobile")
public class MobileController {

    @Autowired
    private MobileService mobileService;

    public Response save(@RequestBody @Valid Mobile mobile){
        mobileService.save(mobile);
        return Response.success("保存成功");

    }


}
