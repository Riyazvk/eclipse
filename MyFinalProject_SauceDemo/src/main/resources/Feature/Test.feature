@SauceDemo
Feature: SauceDemo_Website
@TC01_Login_SauceDemo
Scenario:
Login in SauceDemo Website
Given the user launch the chrome application
When the user open the Sauce_demo Home page 
Then the user login using username and password
Then close the browser

@TC02_InvalidLogin_SauceDemo
Scenario:
Login in SauceDemo Website
Given the user launch the chrome application
When the user open the Sauce_demo Home page 
Then the user login using invalid username and password
Then close the browser

@TC03_Search_product_in_SauceDemo
Scenario:
Search the product in SauceDemo Website
Given the user launch the chrome application
When the user open the Sauce_demo Home page
Then The user login the home page
Then Search the product 
Then close the browser

@TC04_Add_to_cart
Scenario:
Add products into the cart
Given the user launch the chrome application
When the user open the Sauce_demo Home page
Then The user login the home page
Then Add to cart
Then close the browser

@TC05_Select_any_one_field_in_about
Scenario:
Select  any one field in about
Given the user launch the chrome application
When the user open the Sauce_demo Home page
Then The user login the home page
Then Select any field in about
Then close the browser 

@TC06_Select_resource_field_in_about_option
Scenario:
Selecting Resource field in about
Given the user launch the chrome application
When the user open the Sauce_demo Home page 
Then The user login the home page
Then Select Articles from resource field
Then close the browser

@TC07_Select_Platform_field_in_about_option
Scenario:
Select Platform field in about
Given the user launch the chrome application
When the user open the Sauce_demo Home page 
Then The user login the home page
Then checking supported browsers in platform field
Then close the browser

@TC08_select_Solutions_field_in_about_option
Scenario:
Select Solution field in about
Given the user launch the chrome application
When the user open the Sauce_demo Home page 
Then The user login the home page
Then checking Live testing option in Solution field
Then close the browser 

@TC09_select_solutionfield_in_about_option
Scenario:
Select Solution field in about
Given the user launch the chrome application
When the user open the Sauce_demo Home page 
Then The user login the home page
Then checking Automated testing option in Solution field
Then close the browser 

@TC10_Select_the_company_field_in_about_option
Scenario:
view the about us in company field
Given the user launch the chrome application
When the user open the Sauce_demo Home page 
Then The user login the home page
Then check about us in company field
Then close the browser

@TC11_Search_latest_company_news_in_companyfield
Scenario:
checking company news in company field
Given the user launch the chrome application
When the user open the Sauce_demo Home page 
Then The user login the home page
Then check company news in company field
Then close the browser

@TC12_valid_partnership_details_in_the_company_field
Scenario:
checking valid details in company field
Given the user launch the chrome application
When the user open the Sauce_demo Home page 
Then The user login the home page
Then check valid partnership details in the company field
Then close the browser 


@TC13_Invalid_partnership_details_in_the_company_field
Scenario:
checking invalid partnership details in company field
Given the user launch the chrome application
When the user open the Sauce_demo Home page 
Then The user login the home page
Then check Invalid partnership details in the company field
Then close the browser 