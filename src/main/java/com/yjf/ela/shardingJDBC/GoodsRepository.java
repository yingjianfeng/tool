package com.yjf.ela.shardingJDBC;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Title: GoodsRepository
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/8/24 11:48
 */
public interface GoodsRepository extends JpaRepository<Goods, Long> {

    List<Goods> findAllByIdBetween(Long id1, Long id2);

    List<Goods> findAllByIdIn(List<Long> ids);
}