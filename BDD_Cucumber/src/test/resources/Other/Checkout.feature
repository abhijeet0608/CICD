Feature: Search and Place the order for Products
@placeOrder
Scenario Outline: Search experience for product search in both home and Offers page.

Given User is on Cart Landing page.
When user searched with shortname <product_name> and extracted same name of product.
And user added no "3" items of the respective product in the cart.
Then user proceeds with checkout and validate <product_name> in the cart.
And verify the user is able to place the order sucessfully

Examples:
| product_name|
| tom | 


