$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Feature/Test.feature");
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
  "line": 47,
  "name": "",
  "description": "Selecting Resource field in about",
  "id": "saucedemo-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 46,
      "name": "@TC06_Select_resource_field_in_about_option"
    }
  ]
});
formatter.step({
  "line": 49,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 50,
  "name": "the user open the Sauce_demo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "The user login the home page",
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "Select Articles from resource field",
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 11988327900,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_open_the_Sauce_demo_Home_page()"
});
formatter.result({
  "duration": 3922130600,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_login_the_home_page()"
});
formatter.result({
  "duration": 11763748900,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.select_Articles_from_resource_field()"
});
formatter.result({
  "duration": 30180282500,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.close_the_browser()"
});
formatter.result({
  "duration": 7162121900,
  "status": "passed"
});
});