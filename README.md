Everyday Snacks Order Calculator

This Java application calculates and prints order details for clients of the company Everyday Snacks. The application handles orders for four products and five clients, applying pricing rules and discounts based on negotiated agreements.

Introduction
Everyday Snacks is a fictional company that sells various snacks to its clients. This Java application automates the process of calculating order details, including pricing, discounts, and generating order summaries.

Products and Clients

Products:
1. Danish Muffin
2. Granny’s Cup Cake
3. Frenchy’s Croissant
4. Crispy Chips

Clients:
1. ABC Distribution
2. DEF Foods
3. GHI Trade
4. JKL Kiosks
5. MNO Vending

# Pricing Rules

Everyday Snacks calculates prices based on different factors, including unit cost, markup, and promotions. The application also applies client-specific discounts based on negotiated agreements.

### Product Pricing:
<img width="470" alt="Screenshot_3" src="https://github.com/marinadimovska/SnackPricing/assets/110173709/3739f40c-b503-4865-a45e-d7da4caeb16f">


### Client Discounts:
<img width="462" alt="Screenshot_4" src="https://github.com/marinadimovska/SnackPricing/assets/110173709/f29f4b33-5265-43d9-b1f2-526932f56adc">


## Input and Output
The application reads input data from external files in the following formats:

- **clients.json**: Contains information about clients.
- **products.json**: Contains information about products.
- **orders.csv**: Contains order details.

The application processes the data from these files and generates an order summary, which is then output to the console.

## Example
![Order Summary](https://github.com/marinadimovska/SnackPricing/assets/110173709/fc7e052f-622e-4f7a-af5c-272e64efde64)

## **Implementation**

The application consists of three main classes: **Client**, **Product**, and **Order**, along with the **EverydaySnacks** class that orchestrates the order processing. Here's a brief overview of each class:

- **Client Class**
  - Represents a client of Everyday Snacks.
  - Contains fields for client ID, name, basic client discount, volume discount above €10,000, and volume discount above €30,000.
  - Provides getter and setter methods for accessing and modifying these fields.

- **Product Class**
  - Represents a product sold by Everyday Snacks.
  - Contains fields for product ID, name, unit cost, markup, and promotion.
  - Provides getter and setter methods for accessing and modifying these fields.

- **Order Class**
  - Represents an order placed by a client.
  - Contains fields for the client making the order and a map of products ordered along with their quantities.
  - Provides methods for calculating the total before discounts, unit price for each product, additional volume discount, and order total.
  - Generates an order summary with detailed information about each product ordered and the final order total.

- **EverydaySnacks Class**
  - Contains the main method, which serves as the entry point for the application.
  - Reads client information from a JSON file (`clients.json`), product information from another JSON file (`products.json`), and order details from a CSV file (`orders.csv`).
  - Processes the orders and generates an order summary for each order, which is then printed to the console.


## Unit Tests
The application includes relevant unit tests to ensure its functionality.

## Extra Credit
- **Input from File**: The application can read inputs from a file.
- **Dynamic Data Handling**: The program design allows for future changes in product and client data without modification of the core program.
