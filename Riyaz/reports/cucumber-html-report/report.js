$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Feature/Sauce_Demo.feature");
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
formatter.scenarioOutline({
  "line": 4,
  "name": "",
  "description": "Login in SauceDemo Website",
  "id": "saucedemo-website;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@TC01_Login_SauceDemo"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user open the Sauce_demo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "The user login using \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" with vaild details",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "saucedemo-website;;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "saucedemo-website;;;1"
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ],
      "line": 14,
      "id": "saucedemo-website;;;2"
    },
    {
      "cells": [
        "performance_glitch_user",
        "secret_sauce"
      ],
      "line": 15,
      "id": "saucedemo-website;;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "",
  "description": "Login in SauceDemo Website",
  "id": "saucedemo-website;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@TC01_Login_SauceDemo"
    },
    {
      "line": 1,
      "name": "@SauceDemo"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user open the Sauce_demo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "The user login using \"standard_user\" and \"secret_sauce\" with vaild details",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Sauce_Demo_login_Stepdefinition.the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 11509372600,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_Demo_login_Stepdefinition.the_user_open_the_Sauce_demo_Home_page()"
});
formatter.result({
  "duration": 2049775400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 22
    },
    {
      "val": "secret_sauce",
      "offset": 42
    }
  ],
  "location": "Sauce_Demo_login_Stepdefinition.the_user_login_using_and_with_vaild_details(String,String)"
});
formatter.result({
  "duration": 11213194001,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_Demo_login_Stepdefinition.close_the_browser()"
});
formatter.result({
  "duration": 3135503101,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "",
  "description": "Login in SauceDemo Website",
  "id": "saucedemo-website;;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@TC01_Login_SauceDemo"
    },
    {
      "line": 1,
      "name": "@SauceDemo"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user open the Sauce_demo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "The user login using \"performance_glitch_user\" and \"secret_sauce\" with vaild details",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Sauce_Demo_login_Stepdefinition.the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 9702538800,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_Demo_login_Stepdefinition.the_user_open_the_Sauce_demo_Home_page()"
});
formatter.result({
  "duration": 2477431499,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "performance_glitch_user",
      "offset": 22
    },
    {
      "val": "secret_sauce",
      "offset": 52
    }
  ],
  "location": "Sauce_Demo_login_Stepdefinition.the_user_login_using_and_with_vaild_details(String,String)"
});
formatter.result({
  "duration": 17614256101,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_Demo_login_Stepdefinition.close_the_browser()"
});
formatter.result({
  "duration": 3065681999,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "",
  "description": "Login in SauceDemo Website",
  "id": "saucedemo-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@TC02_InvalidLogin_SauceDemo"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "the user launching the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "the user opens the Sauce_demo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "the user login using invalid username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Sauce_Demo_Invalidlogin_Stepdefinition.the_user_launching_the_chrome_application()"
});
formatter.result({
  "duration": 10256702399,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_Demo_Invalidlogin_Stepdefinition.the_user_opens_the_Sauce_demo_Home_page()"
});
formatter.result({
  "duration": 2771028700,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_Demo_Invalidlogin_Stepdefinition.the_user_login_using_invalid_username_and_password()"
});
formatter.result({
  "duration": 6077249499,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_Demo_Invalidlogin_Stepdefinition.close_the_browser()"
});
formatter.result({
  "duration": 3081792901,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "",
  "description": "Add products into the cart",
  "id": "saucedemo-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@TC03_Add_to_cart"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "open the Sauce_demo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "user login the home page",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "Add to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "Closing the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Sauce_Demo_Addcart_Stepdefinition.launch_the_chrome_application()"
});
formatter.result({
  "duration": 10083159300,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_Demo_Addcart_Stepdefinition.open_the_Sauce_demo_Home_page()"
});
formatter.result({
  "duration": 3168966900,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_Demo_Addcart_Stepdefinition.user_login_the_home_page()"
});
formatter.result({
  "duration": 10985348400,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_Demo_Addcart_Stepdefinition.add_to_cart()"
});
formatter.result({
  "duration": 18640149199,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_Demo_Addcart_Stepdefinition.closing_the_browser()"
});
formatter.result({
  "duration": 3104504801,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "",
  "description": "checking selenium code in platformfield",
  "id": "saucedemo-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 35,
      "name": "@TC04_checking_selenium_configuration_in_platformfield"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "user open the Sauce_demo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "The user login the home page",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "check selenium configuration",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "closing the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Sauce_Demo_platformfield_Stepdefinition.user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 10054989300,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_Demo_platformfield_Stepdefinition.user_open_the_Sauce_demo_Home_page()"
});
formatter.result({
  "duration": 2723265600,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_Demo_platformfield_Stepdefinition.the_user_login_the_home_page()"
});
formatter.result({
  "duration": 11580200600,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_Demo_platformfield_Stepdefinition.search_the_product()"
});
formatter.result({
  "duration": 35994293000,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_Demo_platformfield_Stepdefinition.closing_the_browser()"
});
formatter.result({
  "duration": 7140294600,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "",
  "description": "Select  any one field in about",
  "id": "saucedemo-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 44,
      "name": "@TC05_Select_any_one_field_in_about"
    }
  ]
});
formatter.step({
  "line": 47,
  "name": "launching  the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 48,
  "name": "opens the Sauce_demo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "login  the home page",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "Select any field in about",
  "keyword": "Then "
});
formatter.step({
  "line": 51,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Sauce_Demo_companycareer_stepdefinition.launching_the_chrome_application()"
});
formatter.result({
  "duration": 10628244700,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_Demo_companycareer_stepdefinition.opens_the_Sauce_demo_Home_page()"
});
formatter.result({
  "duration": 3779579300,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_Demo_companycareer_stepdefinition.login_the_home_page()"
});
formatter.result({
  "duration": 10383708300,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_Demo_companycareer_stepdefinition.select_any_field_in_about()"
});
formatter.result({
  "duration": 18823868300,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_Demo_companycareer_stepdefinition.close_browser()"
});
formatter.result({
  "duration": 3120851900,
  "status": "passed"
});
});