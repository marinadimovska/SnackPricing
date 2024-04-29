import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EverydaySnacks {
    public static void main(String[] args) {
        List<Product> products = readProductsFromJSON("D:\\prosIntern\\src\\product.json");
        List<Client> clients = readClientsFromJSON("D:\\prosIntern\\src\\client.json");
        List<Order> orders = readOrdersFromCSV("D:\\prosIntern\\src\\orders.csv", products, clients);

        for (Order order : orders) {
            order.generateOrderSummary();
        }
    }

    private static List<Product> readProductsFromJSON(String filename) {
        List<Product> products = new ArrayList<>();
        try (FileReader reader = new FileReader(filename)) {
            Type productListType = new TypeToken<ArrayList<Product>>() {}.getType();
            products = new Gson().fromJson(reader, productListType);
        } catch (IOException e) {
            System.err.println("Error reading products JSON file.");
            e.printStackTrace();
        }
        return products;
    }

    private static List<Client> readClientsFromJSON(String filename) {
        List<Client> clients = new ArrayList<>();
        try (FileReader reader = new FileReader(filename)) {
            Type clientListType = new TypeToken<ArrayList<Client>>() {}.getType();
            clients = new Gson().fromJson(reader, clientListType);
        } catch (IOException e) {
            System.err.println("Error reading clients JSON file.");
            e.printStackTrace();
        }
        return clients;
    }

    private static List<Order> readOrdersFromCSV(String filename, List<Product> products, List<Client> clients) {
        List<Order> orders = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int clientId = Integer.parseInt(parts[0]);
                Map<Product, Integer> productsOrdered = new HashMap<>();
                for (int i = 1; i < parts.length; i++) {
                    String[] productInfo = parts[i].split("=");
                    int productId = Integer.parseInt(productInfo[0]);
                    int quantity = Integer.parseInt(productInfo[1]);
                    Product product = findProductById(products, productId);
                    if (product != null) {
                        productsOrdered.put(product, quantity);
                    } else {
                        System.err.println("Product not found: " + productId);
                    }
                }
                Client client = findClientById(clients, clientId);
                if (client != null) {
                    orders.add(new Order(client, productsOrdered));
                } else {
                    System.err.println("Client not found: " + clientId);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading orders CSV file.");
            e.printStackTrace();
        }
        return orders;
    }

    private static Product findProductById(List<Product> products, int productId) {
        for (Product product : products) {
            if (product.getProductId() == productId) {
                return product;
            }
        }
        return null;
    }

    private static Client findClientById(List<Client> clients, int clientId) {
        for (Client client : clients) {
            if (client.getClientId() == clientId) {
                return client;
            }
        }
        return null;
    }
}