package org.cgoro.camundaloanbroker;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.spring.boot.starter.event.ExecutionEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class LoanBrokerEventListener {

    Logger log = LoggerFactory.getLogger(LoanBrokerEventListener.class);

    @Value("${loan.broker.credit.url.host}")
    String creditHost;

    @Value("${loan.broker.credit.url.port}")
    int creditPort;

    @Autowired
    RuntimeService runtimeService;

    //@EventListener(condition = "#executionEvent.currentActivityId == 'Loan_Broker_Start_Event_1' && #executionEvent.eventName == 'start'")
    public void onExecutionEvent(ExecutionEvent executionEvent) {
        log.info("Injecting workflow environmental variables {} -creditHost={} -creditPort={}", executionEvent.getProcessInstanceId(), creditHost, creditPort);
        Map<String, Object> map = new HashMap<>();
        map.put("creditHost", creditHost);
        map.put("creditPort", creditPort);

 /*       runtimeService
                .createProcessInstanceModification(executionEvent.getProcessInstanceId())
                .startBeforeActivity("get_credit_Score")
                .setVariables(map)
                .execute();*/

    }
}
