package org.example.design_patterns_demo.tactics;

import cn.hutool.core.collection.CollUtil;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * shopee轨迹推送
 * @author shaoke
 * @desc AbstracbTracePush
 * @since 2024/6/12
 */
@Service("shopee")
public  class ShopeeTracePushProcessor extends AbstractTracePushProcessor {



    @Override
    public boolean callApi(List<String> data) {
        //根据shopee接口文档推送轨迹数据
        System.out.println("根据shopee接口文档推送轨迹数据");
        return true;
    }

    @Override
    public boolean updateTraceStatus(List<String> data) {
        return false;
    }
}
