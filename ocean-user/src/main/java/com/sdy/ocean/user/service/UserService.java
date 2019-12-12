package com.sdy.ocean.user.service;


import com.sdy.ocean.user.bean.UmsMember;
import com.sdy.ocean.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    /**
     * 获取所有的用户信息接口
     * 返回(装备所有用户的List集合)
     * @return
     */
    public List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);

    String selectUmsMemerCountById(String userId);
}
