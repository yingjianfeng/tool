package com.yjf.ela.shardingJDBC;

/**
 * Title: GoodsController
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/8/24 11:55
 */
import com.dangdang.ddframe.rdb.sharding.keygen.KeyGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


//@RestController
public class GoodsController {

    @Autowired
    private KeyGenerator keyGenerator;

    @Autowired
    private GoodsRepository goodsRepository;

    @GetMapping("save")
    public String save(){
        for(int i= 1 ; i <= 40 ; i ++){
            Goods goods = new Goods();
            goods.setId((long) i);
            goods.setName( "shangpin" + i);
            goods.setType((long) (i+1));
            goodsRepository.save(goods);
        }
        return "success";
    }

//    @GetMapping("select")
//    public String select(){
//        return goodsRepository.findAll().toString();
//    }
//
//    @GetMapping("delete")
//    public void delete(){
//        goodsRepository.deleteAll();
//    }
//
//    @GetMapping("query1")
//    public Object query1(){
//        return goodsRepository.findAllByGoodsIdBetween(10L, 30L);
//    }
//
//    @GetMapping("query2")
//    public Object query2(){
//        List<Long> goodsIds = new ArrayList<>();
//        goodsIds.add(10L);
//        goodsIds.add(15L);
//        goodsIds.add(20L);
//        goodsIds.add(25L);
//        return goodsRepository.findAllByGoodsIdIn(goodsIds);
//    }
}
