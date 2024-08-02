package org.example.design_patterns_demo.chain;

import org.example.design_patterns_demo.chain.dto.CreateDTO;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * 订单入库通知下游系统
 * @author shaoke
 * @desc AbstracbTracePush
 * @since 2024/6/12
 */
@Service
@Scope("prototype")
public  class OrderNotifyProcessor extends AbstractCreateOrderProcessor {


    @Override
    public boolean handle(CreateDTO dto) {
        // todo 订单保存入库业务逻辑
        System.out.println("订单入库通知下游系统");
        return Objects.nonNull(nextHandler) ? nextHandler.handle(dto) : true;
    }
}
