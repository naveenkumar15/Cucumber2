$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Gomathi/eclipse-workspace/cucumberbase/src/test/resources/Features/AddCustomer.feature");
formatter.feature({
  "name": "AddCustomer feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "AddCustomer scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AddCust"
    }
  ]
});
formatter.step({
  "name": "The user is in add customer page",
  "keyword": "Given "
});
formatter.match({
  "location": "SampleAddcust.the_user_is_in_add_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user fill in the Customer details",
  "keyword": "When "
});
formatter.match({
  "location": "SampleAddcust.the_user_fill_in_the_Customer_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user clicks the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "SampleAddcust.the_user_clicks_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should see the success message",
  "keyword": "Then "
});
formatter.match({
  "location": "SampleAddcust.the_user_should_see_the_success_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should see the customer ID",
  "keyword": "And "
});
formatter.match({
  "location": "SampleAddcust.the_user_should_see_the_customer_ID()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("C:/Users/Gomathi/eclipse-workspace/cucumberbase/src/test/resources/Features/AddTariffPlan.feature");
formatter.feature({
  "name": "AddTariffPlan feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "AddTariffPlan scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Addtariff"
    }
  ]
});
formatter.step({
  "name": "The user is in AddTariffPlan page",
  "keyword": "Given "
});
formatter.match({
  "location": "SampleAddtariff.the_user_is_in_AddTariffPlan_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user Fill in the Tariff details",
  "keyword": "When "
});
formatter.match({
  "location": "SampleAddtariff.the_user_Fill_in_the_Tariff_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user clicks the Tariffsubmit button",
  "keyword": "And "
});
formatter.match({
  "location": "SampleAddtariff.the_user_clicks_the_Tariffsubmit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should see the Tariffsuccess message",
  "keyword": "Then "
});
formatter.match({
  "location": "SampleAddtariff.the_user_should_see_the_message()"
});
formatter.result({
  "status": "passed"
});
});