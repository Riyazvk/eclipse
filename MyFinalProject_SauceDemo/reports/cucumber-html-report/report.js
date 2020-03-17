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
  "line": 4,
  "name": "",
  "description": "Login in SauceDemo Website",
  "id": "saucedemo-website;",
  "type": "scenario",
  "keyword": "Scenario",
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
  "name": "the user login using username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 6021698567,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_open_the_Sauce_demo_Home_page()"
});
formatter.result({
  "duration": 3114683860,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_login_using_username_and_password()"
});
formatter.result({
  "duration": 26016417379,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.close_the_browser()"
});
formatter.result({
  "duration": 5444352031,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "",
  "description": "Login in SauceDemo Website",
  "id": "saucedemo-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@TC02_InvalidLogin_SauceDemo"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "the user open the Sauce_demo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "the user login using invalid username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 4438558465,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_open_the_Sauce_demo_Home_page()"
});
formatter.result({
  "duration": 1952924431,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_login_using_invalid_username_and_password()"
});
formatter.result({
  "duration": 4892489450,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.close_the_browser()"
});
formatter.result({
  "duration": 5111774941,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "",
  "description": "Search the product in SauceDemo Website",
  "id": "saucedemo-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@TC03_Search_product_in_SauceDemo"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "the user open the Sauce_demo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "The user login the home page",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Search the product",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 4166995105,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_open_the_Sauce_demo_Home_page()"
});
formatter.result({
  "duration": 1632827249,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_login_the_home_page()"
});
formatter.result({
  "duration": 7697008174,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.search_the_product()"
});
formatter.result({
  "duration": 2667698252,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.close_the_browser()"
});
formatter.result({
  "duration": 5402476108,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "",
  "description": "Add products into the cart",
  "id": "saucedemo-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@TC04_Add_to_cart"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "the user open the Sauce_demo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "The user login the home page",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "Add to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 4396196711,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_open_the_Sauce_demo_Home_page()"
});
formatter.result({
  "duration": 1879740647,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_login_the_home_page()"
});
formatter.result({
  "duration": 7563071591,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.add_to_cart()"
});
formatter.result({
  "duration": 20144406797,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.close_the_browser()"
});
formatter.result({
  "duration": 5486171445,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "",
  "description": "Select  any one field in about",
  "id": "saucedemo-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 37,
      "name": "@TC05_Select_any_one_field_in_about"
    }
  ]
});
formatter.step({
  "line": 40,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 41,
  "name": "the user open the Sauce_demo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "The user login the home page",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "Select any field in about",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 4470141668,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_open_the_Sauce_demo_Home_page()"
});
formatter.result({
  "duration": 2065945619,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_login_the_home_page()"
});
formatter.result({
  "duration": 8321506130,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.select_any_field_in_about()"
});
formatter.result({
  "duration": 28995258120,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.close_the_browser()"
});
formatter.result({
  "duration": 5503257838,
  "status": "passed"
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
  "duration": 4719510391,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_open_the_Sauce_demo_Home_page()"
});
formatter.result({
  "duration": 2453337065,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_login_the_home_page()"
});
formatter.result({
  "duration": 8054992987,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.select_Articles_from_resource_field()"
});
formatter.result({
  "duration": 23697860749,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.close_the_browser()"
});
formatter.result({
  "duration": 5158251281,
  "status": "passed"
});
formatter.scenario({
  "line": 56,
  "name": "",
  "description": "Select Platform field in about",
  "id": "saucedemo-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 55,
      "name": "@TC07_Select_Platform_field_in_about_option"
    }
  ]
});
formatter.step({
  "line": 58,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 59,
  "name": "the user open the Sauce_demo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 60,
  "name": "The user login the home page",
  "keyword": "Then "
});
formatter.step({
  "line": 61,
  "name": "checking supported browsers in platform field",
  "keyword": "Then "
});
formatter.step({
  "line": 62,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 3983060380,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_open_the_Sauce_demo_Home_page()"
});
formatter.result({
  "duration": 2029659600,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_login_the_home_page()"
});
formatter.result({
  "duration": 7901840091,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.checking_supported_browsers_in_platform_field()"
});
formatter.result({
  "duration": 25197334338,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.close_the_browser()"
});
formatter.result({
  "duration": 5133144310,
  "status": "passed"
});
formatter.scenario({
  "line": 65,
  "name": "",
  "description": "Select Solution field in about",
  "id": "saucedemo-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 64,
      "name": "@TC08_select_Solutions_field_in_about_option"
    }
  ]
});
formatter.step({
  "line": 67,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 68,
  "name": "the user open the Sauce_demo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 69,
  "name": "The user login the home page",
  "keyword": "Then "
});
formatter.step({
  "line": 70,
  "name": "checking Live testing option in Solution field",
  "keyword": "Then "
});
formatter.step({
  "line": 71,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 4280614764,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_open_the_Sauce_demo_Home_page()"
});
formatter.result({
  "duration": 1996913966,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_login_the_home_page()"
});
formatter.result({
  "duration": 7774687699,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.checking_Live_testing_option_in_Solution_field()"
});
formatter.result({
  "duration": 25753717311,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.close_the_browser()"
});
formatter.result({
  "duration": 5414960568,
  "status": "passed"
});
formatter.scenario({
  "line": 74,
  "name": "",
  "description": "Select Solution field in about",
  "id": "saucedemo-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 73,
      "name": "@TC09_select_solutionfield_in_about_option"
    }
  ]
});
formatter.step({
  "line": 76,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 77,
  "name": "the user open the Sauce_demo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 78,
  "name": "The user login the home page",
  "keyword": "Then "
});
formatter.step({
  "line": 79,
  "name": "checking Automated testing option in Solution field",
  "keyword": "Then "
});
formatter.step({
  "line": 80,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 4197581615,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_open_the_Sauce_demo_Home_page()"
});
formatter.result({
  "duration": 2035007536,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_login_the_home_page()"
});
formatter.result({
  "duration": 7560070512,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.checking_Automated_testing_option_in_Solution_field()"
});
formatter.result({
  "duration": 19236959356,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.close_the_browser()"
});
formatter.result({
  "duration": 3175355499,
  "status": "passed"
});
formatter.scenario({
  "line": 83,
  "name": "",
  "description": "view the about us in company field",
  "id": "saucedemo-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 82,
      "name": "@TC10_Select_the_company_field_in_about_option"
    }
  ]
});
formatter.step({
  "line": 85,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 86,
  "name": "the user open the Sauce_demo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 87,
  "name": "The user login the home page",
  "keyword": "Then "
});
formatter.step({
  "line": 88,
  "name": "check about us in company field",
  "keyword": "Then "
});
formatter.step({
  "line": 89,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 4223270748,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_open_the_Sauce_demo_Home_page()"
});
formatter.result({
  "duration": 1879365180,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_login_the_home_page()"
});
formatter.result({
  "duration": 7851102772,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.check_about_us_in_company_field()"
});
formatter.result({
  "duration": 21287754322,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.close_the_browser()"
});
formatter.result({
  "duration": 3173819120,
  "status": "passed"
});
formatter.scenario({
  "line": 92,
  "name": "",
  "description": "checking company news in company field",
  "id": "saucedemo-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 91,
      "name": "@TC11_Search_latest_company_news_in_companyfield"
    }
  ]
});
formatter.step({
  "line": 94,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 95,
  "name": "the user open the Sauce_demo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 96,
  "name": "The user login the home page",
  "keyword": "Then "
});
formatter.step({
  "line": 97,
  "name": "check company news in company field",
  "keyword": "Then "
});
formatter.step({
  "line": 98,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 4467240335,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_open_the_Sauce_demo_Home_page()"
});
formatter.result({
  "duration": 2635114563,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_login_the_home_page()"
});
formatter.result({
  "duration": 11984588417,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.check_company_news_in_company_field()"
});
formatter.result({
  "duration": 30167520379,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.close_the_browser()"
});
formatter.result({
  "duration": 5116278646,
  "status": "passed"
});
formatter.scenario({
  "line": 101,
  "name": "",
  "description": "checking valid details in company field",
  "id": "saucedemo-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 100,
      "name": "@TC12_valid_partnership_details_in_the_company_field"
    }
  ]
});
formatter.step({
  "line": 103,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 104,
  "name": "the user open the Sauce_demo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 105,
  "name": "The user login the home page",
  "keyword": "Then "
});
formatter.step({
  "line": 106,
  "name": "check valid partnership details in the company field",
  "keyword": "Then "
});
formatter.step({
  "line": 107,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 4620337480,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_open_the_Sauce_demo_Home_page()"
});
formatter.result({
  "duration": 2084369660,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_login_the_home_page()"
});
formatter.result({
  "duration": 7823146806,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.check_valid_partnership_details_in_the_company_field()"
});
formatter.result({
  "duration": 54101036213,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.close_the_browser()"
});
formatter.result({
  "duration": 3126179592,
  "status": "passed"
});
formatter.scenario({
  "line": 111,
  "name": "",
  "description": "checking invalid partnership details in company field",
  "id": "saucedemo-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 110,
      "name": "@TC13_Invalid_partnership_details_in_the_company_field"
    }
  ]
});
formatter.step({
  "line": 113,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 114,
  "name": "the user open the Sauce_demo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 115,
  "name": "The user login the home page",
  "keyword": "Then "
});
formatter.step({
  "line": 116,
  "name": "check Invalid partnership details in the company field",
  "keyword": "Then "
});
formatter.step({
  "line": 117,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 5076701414,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_open_the_Sauce_demo_Home_page()"
});
formatter.result({
  "duration": 2227874957,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.the_user_login_the_home_page()"
});
formatter.result({
  "duration": 7448437034,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.check_Invalid_partnership_details_in_the_company_field()"
});
formatter.result({
  "duration": 86196171908,
  "status": "passed"
});
formatter.match({
  "location": "Sauce_demo_stepdefinition.close_the_browser()"
});
formatter.result({
  "duration": 3127499414,
  "status": "passed"
});
});