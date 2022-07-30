var response = connector.getVariable("response");
var status = connector.getVariable("statusCode");
var bank = connector.getVariable("bank");

var bankId = bank.prop("bankId").value()
if (status < 200 || status > 299) {
    throw new org.camunda.bpm.engine.delegate.BpmnError("Bank " + bankId + " Request Failed");
}

var rate = S(response).prop("rate").value();

connector.setVariable(bankId, S('{"rate":' + rate + '}'));

rate;
