package com.yjf.ela.required;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Title: GameServide
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/8/25 17:05
 */
@Service
public class GameServide {

    @Autowired
    GameDao gameDao;
    @Transactional(propagation = Propagation.REQUIRED)
    public void meanB(){
        GameDo gameDo = new GameDo();
        gameDo.setId(1);
        gameDo.setName("测试");
        gameDao.insert(gameDo);
        if (1==1){
            throw new RuntimeException("异常");
        }
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void meanC(){
        GameDo gameDo = new GameDo();
        gameDo.setName("测试");
        gameDao.insert(gameDo);
    }

}
