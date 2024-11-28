Feature: Search and Place the order for Products

Scenario: Search experience for product search in both home and Offers page.

Given User is on Cart Landing page.
When user searched with shortname "tom" and extracted same name of product.
Then user searched with shortname "tom" in offers page to check if product exists.
