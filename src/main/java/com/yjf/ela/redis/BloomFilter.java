package com.yjf.ela.redis;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Title: BloomFilter
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/9/1 11:10
 */
@TableName("BloomFilter")
@Data
public class BloomFilter {
    int id;
    String name;
}
