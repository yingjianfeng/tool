package com.jpa.dao;

import com.jpa.pojo.TypePojo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Title: TypeDao
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/9/25 17:12
 */
@Repository
public interface TypeDao extends JpaRepository<TypePojo, Long> {
}
