package com.yjf.ela.required;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * Title: GameDo
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/8/25 16:24
 */
@Data
@TableName("game")
public class GameDo {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
}