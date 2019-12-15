$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddingOrder.feature");
formatter.feature({
  "line": 2,
  "name": "Adding Order",
  "description": "",
  "id": "adding-order",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@TEC-102"
    }
  ]
});
formatter.scenario({
  "line": 26,
  "name": "Verify delete functionality",
  "description": "",
  "id": "adding-order;verify-delete-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@TECTC-1015"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "Nagivate to login page",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "User logs in with valid credentials username \"Tester\" password \"test\"",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "User deletes \"Mark Smith\" from table",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User validates that \"Mark Smith\" is deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "VerifyLoginFunctionality.nagivate_to_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Tester",
      "offset": 46
    },
    {
      "val": "test",
      "offset": 64
    }
  ],
  "location": "VerifyLoginFunctionality.user_logs_in_with_valid_credentials_username_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});