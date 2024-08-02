package org.example.design_patterns_demo.tactics;

import cn.hutool.core.collection.CollUtil;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * shein轨迹推送
 * @author shaoke
 * @desc AbstracbTracePush
 * @since 2024/6/12
 */
@Service("shein")
public  class SheinTracePushProcessor extends AbstractTracePushProcessor {


    @Override
    public boolean callApi(List<String> data) {
        //根据shein接口文档推送轨迹数据
        System.out.println("根据shein接口文档推送轨迹数据");
        return true;
    }

    @Override
    public boolean updateTraceStatus(List<String> data) {
        return false;
    }
}
