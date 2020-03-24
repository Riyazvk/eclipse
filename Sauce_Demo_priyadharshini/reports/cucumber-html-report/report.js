$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Feature/demo.feature");
formatter.feature({
  "line": 2,
  "name": "SauceDemo_Website",
  "description": "",
  "id": "saucedemo-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SauceDemo"
    }
  ]
});
formatter.scenario({
  "line": 32,
  "name": "",
  "description": "Select Solution field in about",
  "id": "saucedemo-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@TC04_select_solutionfield_in_about_option"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "user launching the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "user opens the Sauce_demo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "logins the home page",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "checking Automated testing option in Solution field",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "Closing the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "sauce_demo_auto_stepdefinition.user_launching_the_chrome_application()"
});
formatter.result({
  "duration": 12236260700,
  "status": "passed"
});
formatter.match({
  "location": "sauce_demo_auto_stepdefinition.user_opens_the_Sauce_demo_Home_page()"
});
formatter.result({
  "duration": 2482610100,
  "status": "passed"
});
formatter.match({
  "location": "sauce_demo_auto_stepdefinition.logins_the_home_page()"
});
formatter.result({
  "duration": 7907846700,
  "status": "passed"
});
formatter.match({
  "location": "sauce_demo_auto_stepdefinition.checking_Automated_testing_option_in_Solution_field()"
});
formatter.result({
  "duration": 14364441800,
  "status": "passed"
});
formatter.match({
  "location": "sauce_demo_auto_stepdefinition.closing_the_browser()"
});
formatter.result({
  "duration": 3375869800,
  "status": "passed"
});
});