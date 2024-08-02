package org.example.design_patterns_demo.chain;

import org.example.design_patterns_demo.chain.dto.CreateDTO;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * 订单保存入库
 * @author lgh
 * @desc AbstracbTracePush
 * @since 2024/6/12
 */
@Service
@Scope("prototype")
public  class OrderSaveProcessor extends AbstractCreateOrderProcessor {


    @Override
    public boolean handle(CreateDTO dto) {
        // todo 订单保存入库逻辑 ,失败返回 false
        System.out.println("订单保存入库");
        return Objects.nonNull(nextHandler) ? nextHandler.handle(dto) : true;
    }
}
