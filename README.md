#  Confectionery Management System
## JAVA
## Project Description
This project is a management software for a confectionery shop, including the following components:
- Customer management
- Ingredient inventory management
- Sweets (confectionery items) management
- Transaction processing
- Discount system

## Core Topics Covered
- Basic concepts of loops, conditions, strings, and methods
- Arrays and Linked Lists
- Object-Oriented Programming (OOP)
- Constructors, getters, and setters
- Interfaces

## Main Classes
1. **Confectionery**
   - Manages sweets, ingredients, wallet balance, and discount codes.
2. **Customer**
   - Contains name and unique ID, with functionality to increase account balance.
3. **Warehouse**
   - Stores a single type of ingredient; identified by the ingredient name.
4. **Sweet**
   - Contains name, price, and required ingredients for preparation.
5. **Transaction**
   - Records customer ID, payment amount, and applied discounts (if any).

## Commands Overview
- `create confectionary`: Initializes the confectionery system (must be the first command).
- `add customer id [ID] name [Name]`: Adds a new customer.
- `increase balance customer [ID] amount [Amount]`: Deposits money into a customer's account.
- `add warehouse material [Material Name] amount [Amount]`: Adds a new ingredient warehouse.
- `increase warehouse material [Material Name] amount [Amount]`: Increases the quantity of an ingredient.
- `add sweet name [Name] price [Price] materials: [Material] [Amount], ...`: Defines a new sweet and its required ingredients.
- `increase sweet [Name] amount [Amount]`: Adds more stock of a sweet (consumes ingredients).
- `add discount code [Code] price [Price]`: Creates a new discount code.
- `add discount code [Code] to customer id [ID]`: Assigns a discount code to a customer.
- `sell sweet [Name] amount [Amount] to customer [ID]`: Processes a sale (creates a transaction).
- `accept transaction [ID]`: Finalizes a transaction (transfers money after discount).
- `print transactions list`: Displays all accepted transactions.
- `print income`: Shows the confectionery's total income.
- `end`: Terminates the program.

## Error Handling
- Invalid commands trigger `invalid command`.
- Duplicate entries (customers, ingredients, sweets, discount codes) are rejected with appropriate messages (e.g., `customer with this id already exists`).
- Missing resources (customers, ingredients, sweets) or insufficient quantities trigger specific errors (e.g., `insufficient material(s)`).

## Example Workflow
```plaintext
create confectionary
add customer id 1 name John
increase balance customer 1 amount 50000
add warehouse material sugar amount 1000
add sweet name Cake price 200 materials: sugar 10
increase sweet Cake amount 5
sell sweet Cake amount 2 to customer 1
accept transaction 1
print income
end
