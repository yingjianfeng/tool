package com.yjf.ela.seckill;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * Title: SeckillController
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/8/24 14:27
 */
@RestController
public class SeckillController {

    public static Stack stack = new Stack();
    @GetMapping("start")
    public String  start(){
        if(stack.size()!=0){
            return "已经有货，无需再加";
        }
        for (int i = 0; i < 5; i++) {
            Map map = new HashMap();
            map.put(i,"goods"+i);
            stack.push(map);
        }
        return "补货完成,共计："+stack.size();
    }
    @GetMapping("getgoods")
    public List  getgoods(){
        List list = new ArrayList();
        for(int i =0; i<20; i++){
            if(stack.empty()){
                return list;
            }
            Object pop = stack.pop();
            list.add(pop);
        }
        return list;
    }

}
