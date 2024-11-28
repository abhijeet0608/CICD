Feature: Search and Place the order for Products

Scenario Outline: Search experience for product search in both home and Offers page.

Given User is on Cart Landing page.
When user searched with shortname <product_name> and extracted same name of product.
Then user searched with shortname <product_name> in offers page to check if product exists.

Examples:
| product_name|
| tom | 
| beet | 


