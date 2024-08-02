package org.example.design_patterns_demo.tactics;

import cn.hutool.core.collection.CollUtil;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * 轨迹推送模板
 * @author shaoke
 * @desc AbstracbTracePush
 * @since 2024/6/12
 */
public abstract class AbstractTracePushProcessor implements ITracePush {


    /**
     * 1、查询轨迹数据
     * @param orderNo
     * @return
     */
    public List<String> queryTrace(String orderNo) {
        return Lists.newArrayList(orderNo);
    }


    //不同的平台轨迹推送逻辑不同
    public void pushTrace(String orderNo) {
        System.out.println("order_no:" + orderNo);
        //1、根据单号查询轨迹数据
        List<String> traces = queryTrace(orderNo);
        if (CollUtil.isNotEmpty(traces)) {
            //根据平台接口文档调用接口推送轨迹数据
            boolean callApi = callApi(traces);
            if (callApi) {
                //根据推送接口更新推送状态
                updateTraceStatus(traces);
            }
        }
    }

}
