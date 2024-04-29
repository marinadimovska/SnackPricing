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
See Table A.

### Client Discounts:
See Table B.

## Input and Output
The application reads input data from external files in the following formats:

- **clients.json**: Contains information about clients.
- **products.json**: Contains information about products.
- **orders.csv**: Contains order details.

The application processes the data from these files and generates an order summary, which is then output to the console.

## Example
![Order Summary](https://github.com/marinadimovska/SnackPricing/assets/110173709/fc7e052f-622e-4f7a-af5c-272e64efde64)

## Unit Tests
The application includes relevant unit tests to ensure its functionality.

## Extra Credit
- **Input from File**: The application can read inputs from a file.
- **Dynamic Data Handling**: The program design allows for future changes in product and client data without modification of the core program.
