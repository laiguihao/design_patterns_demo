package org.example.design_patterns_demo.chain.config;

import jakarta.annotation.Resource;
import org.example.design_patterns_demo.chain.AbstractCreateOrderProcessor;
import org.example.design_patterns_demo.chain.OrderNotifyProcessor;
import org.example.design_patterns_demo.chain.OrderSaveProcessor;
import org.example.design_patterns_demo.chain.OrderValidProcessor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *  责任链配置
 * @author shaoke
 * @desc CreateOrderChainConfiguration
 * @since 2024/6/12
 */
@Configuration
public class CreateOrderChainConfiguration {


    /**
     * // 配置责任链:订单 验证 -> 订单保存 -> 订单通知
     * @param orderValidProcessor
     * @param orderSaveProcessor
     * @param orderNotifyProcessor
     * @return
     */
    @Bean("createOrderProcessorChain")
    public AbstractCreateOrderProcessor createOrderChain(@Qualifier("orderValidProcessor") OrderValidProcessor orderValidProcessor,
                                                         @Qualifier("orderSaveProcessor") OrderSaveProcessor orderSaveProcessor,
                                                         @Qualifier("orderNotifyProcessor") OrderNotifyProcessor orderNotifyProcessor) {

        // 配置责任链:订单验证 -> 订单保存 -> 订单通知

        orderSaveProcessor.setNextHandler(orderNotifyProcessor);

        orderValidProcessor.setNextHandler(orderSaveProcessor);

        return orderValidProcessor;
    }

    /**
     * // 配置责任链: 订单保存 -> 订单通知
     * @param orderSaveProcessor
     * @param orderNotifyProcessor
     * @return
     */
    @Bean("createOrderProcessorChain2")
    public AbstractCreateOrderProcessor createOrderChain2(@Qualifier("orderSaveProcessor") OrderSaveProcessor orderSaveProcessor,
                                                          @Qualifier("orderNotifyProcessor") OrderNotifyProcessor orderNotifyProcessor) {

        orderSaveProcessor.setNextHandler(orderNotifyProcessor);

        return orderSaveProcessor;
    }
}
