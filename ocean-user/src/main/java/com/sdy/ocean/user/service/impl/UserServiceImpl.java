package com.sdy.ocean.user.service.impl;

import com.sdy.ocean.user.bean.UmsMember;
import com.sdy.ocean.user.bean.UmsMemberReceiveAddress;
import com.sdy.ocean.user.mapper.UmsMemberReceiveAddressMapper;
import com.sdy.ocean.user.mapper.UserMapper;
import com.sdy.ocean.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //容器注入
    @Autowired
    UserMapper userMapper;

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    /**
     * 获得所有用户的实现类
     *
     * @return
     */
    @Override
    public List<UmsMember> getAllUser() {

        List<UmsMember> umsMemberList = userMapper.selectAll();//userMapper.selectAllUser();

        return umsMemberList;
    }

    /**
     * 根据外键查询获取收货地址
     * @param memberId
     * @return
     */
    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {

        //封装的参数对象
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);


        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);

        return umsMemberReceiveAddresses;
    }


    //通过id获取总数量
    @Override
    public String selectUmsMemerCountById(String userId) {
        return this.userMapper.selectUmsMemerCountById(userId);
    }
}
