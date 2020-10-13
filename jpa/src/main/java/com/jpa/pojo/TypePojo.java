package com.jpa.pojo;

import lombok.Data;

import javax.persistence.*;

/**
 * Title: TypePojo
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/9/25 17:11
 */
@Entity
@Table(name = "type")
@Data
public class TypePojo {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)     //配置 主键自增返回
    private long id;
    private String name;
}
