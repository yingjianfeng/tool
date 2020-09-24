package com.yjf.ela.shardingJDBC;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.Entity;

/**
 * Title: Goods
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/8/24 11:42
 */
@Entity
@Table(name="goods")
@Data
public class Goods {
    @Id
    private Long id;

    private String name;

    private Long type;
}
