$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/Vasu/eclipse-workspace/FreeCrmBDDFramework/src/main/java/Features/Hooks.feature");
formatter.feature({
  "line": 1,
  "name": "Hooks with example",
  "description": "",
  "id": "hooks-with-example",
  "keyword": "Feature"
});
formatter.before({
  "duration": 903720,
  "status": "passed"
});
formatter.before({
  "duration": 433642,
  "status": "passed"
});
formatter.before({
  "duration": 396693,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login to facebook",
  "description": "",
  "id": "hooks-with-example;login-to-facebook",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@facebook"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "successfully logged Facebook",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "add a new friend",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksStepDefenition.successfully_logged_Facebook()"
});
formatter.result({
  "duration": 215727400,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefenition.add_a_new_friend()"
});
formatter.result({
  "duration": 358204,
  "status": "passed"
});
formatter.after({
  "duration": 340756,
  "status": "passed"
});
formatter.after({
  "duration": 362309,
  "status": "passed"
});
formatter.before({
  "duration": 218618,
  "status": "passed"
});
formatter.before({
  "duration": 383863,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Login to gmail",
  "description": "",
  "id": "hooks-with-example;login-to-gmail",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@Gmail"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "successfully logged email",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "send a mail",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksStepDefenition.successfully_logged_email()"
});
formatter.result({
  "duration": 249922,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefenition.send_a_mail()"
});
formatter.result({
  "duration": 119572,
  "status": "passed"
});
formatter.after({
  "duration": 310477,
  "status": "passed"
});
formatter.after({
  "duration": 286357,
  "status": "passed"
});
});