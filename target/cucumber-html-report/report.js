$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/cucumber.feature");
formatter.feature({
  "line": 1,
  "name": "imagenecsi login",
  "description": "",
  "id": "imagenecsi-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Register on imagenecsi with valid username and password",
  "description": "",
  "id": "imagenecsi-login;register-on-imagenecsi-with-valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "hit the imageneCsi url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "enter the valid username \"raviiolead@yopmail.com\" and password \"oefhwf\" in the text box",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user should be logged into the application successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefination.hit_the_imageneCsi_url()"
});
formatter.result({
  "duration": 65945484,
  "error_message": "java.lang.NullPointerException\r\n\tat com.stepdefination.Stepdefination.hit_the_imageneCsi_url(Stepdefination.java:33)\r\n\tat ✽.Given hit the imageneCsi url(features/cucumber.feature:4)\r\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "Stepdefination.user_should_be_logged_into_the_application_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "line": 8,
  "name": ": Register on imagenecsi with invalid username and password",
  "description": "",
  "id": "imagenecsi-login;:-register-on-imagenecsi-with-invalid-username-and-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "hit the imageneCsi url",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "enter the invalid \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" in the text box",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "error message should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "imagenecsi-login;:-register-on-imagenecsi-with-invalid-username-and-password;",
  "rows": [
    {
      "cells": [
        "username",
        "",
        "password"
      ],
      "line": 13,
      "id": "imagenecsi-login;:-register-on-imagenecsi-with-invalid-username-and-password;;1"
    },
    {
      "cells": [
        "hgdfsghdfjgs",
        "",
        "g3434treg"
      ],
      "line": 14,
      "id": "imagenecsi-login;:-register-on-imagenecsi-with-invalid-username-and-password;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": ": Register on imagenecsi with invalid username and password",
  "description": "",
  "id": "imagenecsi-login;:-register-on-imagenecsi-with-invalid-username-and-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "hit the imageneCsi url",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "enter the invalid \"hgdfsghdfjgs\" and \"g3434treg\" in the text box",
  "matchedColumns": [
    0,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "error message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefination.hit_the_imageneCsi_url()"
});
formatter.result({
  "duration": 278776,
  "error_message": "java.lang.NullPointerException\r\n\tat com.stepdefination.Stepdefination.hit_the_imageneCsi_url(Stepdefination.java:33)\r\n\tat ✽.Given hit the imageneCsi url(features/cucumber.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "hgdfsghdfjgs",
      "offset": 19
    },
    {
      "val": "g3434treg",
      "offset": 38
    }
  ],
  "location": "Stepdefination.enter_the_invalid_and_in_the_text_box(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefination.error_message_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
});