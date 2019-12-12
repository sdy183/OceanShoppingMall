package com.sdy.ocean.user.mapper;

import com.sdy.ocean.user.bean.UmsMember;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

//继承的是通用Mapper泛型之中的是对应的bean
public interface UserMapper extends Mapper<UmsMember> {
    /**
     * 查询所有用户信息
     * (所有用户的List集合)
     * @return
     */
    public List<UmsMember> selectAllUser();

    /**
     * 通过id获取所有用户个数
     * @param id
     * @return
     */
    String selectUmsMemerCountById(@Param("id")String id);
}
