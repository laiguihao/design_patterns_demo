package org.example.design_patterns_demo.chain;

import cn.hutool.core.collection.CollUtil;
import com.google.common.collect.Lists;
import org.example.design_patterns_demo.chain.dto.CreateDTO;

import java.util.List;

/**
 * 下单接口
 * @author lgh
 * @desc AbstracbTracePush
 * @since 2024/6/12
 */
public abstract class AbstractCreateOrderProcessor  {


    protected AbstractCreateOrderProcessor nextHandler;

    public void setNextHandler(AbstractCreateOrderProcessor nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract boolean handle(CreateDTO dto);


}
