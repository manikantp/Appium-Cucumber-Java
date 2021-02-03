$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("loginpage.feature");
formatter.feature({
  "line": 3,
  "name": "Validate Different Options",
  "description": "",
  "id": "validate-different-options",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@appium"
    }
  ]
});
formatter.before({
  "duration": 19648010100,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Validate Custom View",
  "description": "",
  "id": "validate-different-options;validate-custom-view",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I open the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I tap on Accessibility",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I validate Custom View",
  "keyword": "Then "
});
formatter.match({
  "location": "AppiumTests.i_open_the_application()"
});
formatter.result({
  "duration": 623226800,
  "status": "passed"
});
formatter.match({
  "location": "AppiumTests.i_tap_on_accessibility()"
});
formatter.result({
  "duration": 1211724100,
  "status": "passed"
});
formatter.match({
  "location": "AppiumTests.i_validate_custom_view()"
});
formatter.result({
  "duration": 64207600,
  "status": "passed"
});
formatter.after({
  "duration": 1193660800,
  "status": "passed"
});
});