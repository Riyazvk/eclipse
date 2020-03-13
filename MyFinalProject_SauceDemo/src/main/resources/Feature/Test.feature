@SauceDemo
Feature: SauceDemo_Website
@TC01_Login_SauceDemo
Scenario:
Login in SauceDemo Website
Given the user launch the chrome application
When the user open the Sauce_demo Home page 
Then the user login using username and password
Then user close the browser

@TC02_Search_product_in_SauceDemo
Scenario:
Search the product in SauceDemo Website
Given Launching the chrome application for Search Scenario
When Open Home page and login
Then Search the product 
Then Closing the Browser

@TC03_Add_to_cart
Scenario:
Add products into the cart
Given launching the chrome application for Add to cart scenario
When Login the home page
Then Add to cart
Then Close Browser

@TC04_Select_any_one_field_in_about
Scenario:
Select  any one field in about
Given launching the chrome application for Selecting any field in about scenario
When Login to the home page
Then Select any field in about
Then Close the browser 
