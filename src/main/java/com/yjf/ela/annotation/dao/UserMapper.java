package com.yjf.ela.annotation.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yjf.ela.annotation.pojo.User;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Title: UserMapper
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/8/26 11:21
 */
@Mapper
@CacheNamespace
public interface UserMapper extends BaseMapper<User> {
}
