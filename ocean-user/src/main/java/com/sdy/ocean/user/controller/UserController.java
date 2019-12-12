package com.sdy.ocean.user.controller;

import com.sdy.ocean.user.bean.UmsMember;
import com.sdy.ocean.user.bean.UmsMemberReceiveAddress;
import com.sdy.ocean.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class UserController {

    /**
     * @Autowired如果出现红线有可能是出现误报 修改一下配置就可以解决
     */
    @Autowired
    UserService userService;

    /**
     * 根据外键查询获取
     * 通过用户获取发货地址
     * 我们用注解@RequestBody注解保证能够接收到json字符串
     * @return
     */
    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){

        //在数据库中返回一个UmsMenber的集合
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userService.getReceiveAddressByMemberId(memberId);

        return umsMemberReceiveAddresses;
    }

    /**
     * 获取所有用户信息
     * (需要返回一个所有用户的List集合)
     * @return
     */
    @RequestMapping("getAllUser")
    @ResponseBody                                      //返回json字符串
    public List<UmsMember> getAllUser(){

        //在数据库中返回一个UmsMenber的集合
        List<UmsMember> umsMembers = userService.getAllUser();

        return umsMembers;
    }

    @RequestMapping("index")
    @ResponseBody                                      //返回json字符串
    public String index(){
        return "我是个好人";
    }

    /**
     * 获取所有id
     * @return
     */
    @RequestMapping("getCountByUser")
    @ResponseBody
    public String getCountByUser(String UserId){

         String getCountByUser = this.userService.selectUmsMemerCountById(UserId);

        return getCountByUser;

    }

}
