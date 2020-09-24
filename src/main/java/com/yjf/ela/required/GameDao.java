package com.yjf.ela.required;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Title: GameDao
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/8/25 16:33
 */
@Mapper
public interface GameDao extends BaseMapper<GameDo> {
}
