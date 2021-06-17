package com.luna.tencent.pay.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.luna.tencent.properties.TencentPayConfigProperties;
import com.luna.tencent.pay.api.TencentPayApi;

/**
 * @Package: com.luna.tencent.pay.mq
 * @ClassName: DelayMessageListener
 * @Author: luna
 * @CreateTime: 2020/8/17 17:01
 * @Description:
 */
@Component
@RabbitListener(queues = "orderListenerQueue")
public class DelayMessageListener {

    @Autowired
    private TencentPayConfigProperties configValue;

    /**
     * 延时队列监听
     */
    @RabbitHandler
    public void delayMessage(String msg) {
        TencentPayApi.closeOrder(configValue, msg);
    }
}
