package org.example.design_patterns_demo.tactics;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 轨迹推送接口
 */
public interface ITracePush {






    //1、接口推送调用
    public  boolean callApi(List<String> data);


    //2、更新推送状态,通知下游
    public  boolean updateTraceStatus(List<String> data);

}
