package com.yjf.ela.index;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Title: pojo
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/8/28 15:12
 */
@TableName("indextest")
@Data
public class pojo {
    @TableId(type = IdType.AUTO)
    int id;
    String name;
    Long age;
    long qq;
}
