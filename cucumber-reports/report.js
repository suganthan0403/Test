$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:org/Login1.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Success Login",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Enter \"Sam\" and \"abcd1\"",
  "keyword": "Given "
});
formatter.match({
  "location": "step.credentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login button",
  "keyword": "When "
});
formatter.match({
  "location": "step.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Home Page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "step.home_Page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
});