package org.example.design_patterns_demo.template;

import cn.hutool.json.JSONUtil;

import java.util.List;

/**
 * 轨迹推送模板
 * @author shaoke
 * @desc AbstracbTracePush
 * @since 2024/6/12
 */
public abstract class AbstractTracePushTemplateProcessor<T>  {


    /**
     * 1、查询轨迹数据
     * @param dto
     * @return
     */
    public abstract List<String> queryTrace(T dto);



    //2、接口推送调用
    public  boolean callApi(List<String> data) {
        //推送轨迹数据
        System.out.println("接口推送数据:" + JSONUtil.toJsonStr(data));
        return true;
    }

    public void push(T dto) {
        //查询数据
        List<String> data = queryTrace(dto);
        //推送数据
        callApi(data);
    }



}
