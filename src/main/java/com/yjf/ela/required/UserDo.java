package com.yjf.ela.required;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.Table;
import java.util.Date;

/**
 * Title: UserDo
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/8/25 16:24
 */
@Data
@TableName("user")
public class UserDo {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
}

