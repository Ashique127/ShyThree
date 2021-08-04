Feature: Check Amazon product search functionality



Scenario: Validate Amazon product search is working
Given browser is open
Then open amazon url and customer is on home page
Then customer enters a product name Phone
Then customer hits Enter search box
Then customer select Samsung Brand
Then customer select specific model
Then customer add to cart 