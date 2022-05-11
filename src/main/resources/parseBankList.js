var response = connector.getVariable("response");
var status = connector.getVariable("statusCode");

if (status < 200 || status > 299) {
    throw new org.camunda.bpm.engine.delegate.BpmnError("Bank List Request Failed");
}

S(response);
