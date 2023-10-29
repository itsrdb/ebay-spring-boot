# ebay Backend Project
Have a look at this personal project inspired by ebay, having e-commerce functionalities and focusing on Microservices architecture.
<br><br>
This project in currently in work and more features will be added in the future.

## Get Started
1. Launch this project in IntelliJ
2. Create/Run Docker service for KeyCloak
3. Run Docker service for Zipkin (Optional: If you want to enable Distributed Tracing)
4. Run All the modules inside of 'ebay-spring-boot'
5. Let Discovery Server configure for 30s
<br></br>

> [!NOTE]
> <b> Requires API Platform Authentication Token </b> <br>
> You will need an authentical token configured in Postman (or any API Platform) by KeyCloak Client on your new Docker session. <br> 
> <b>More info:</b> https://www.keycloak.org/getting-started/getting-started-docker

## API End-Points
<b>1. API GateWay :-</b> `localhost:8080/`
<br><br>
<b>2. Eureka Server :-</b> `localhost:8761/`
<br><br>
<b>3. Product Service :-</b> `/api/product` <br>
```
GET Mapping :- Provides a list of all the listed products.
```
```
POST Mapping :- Adds a new product to the listed products.
```
<b>4. Inventory Service :-</b> 
` /api/inventory/{skuCode} `
<br>
```
GET Mapping :- Return the number of items in stock provided an Sku-Code.
```
<b>3. Order Service :-</b> `/api/order` <br>
```
POST Mapping :- Performs a Place Order operation on provided items list as given by the customers.
```

> Before placing an order, Order Service calls Inventory service to check if the required items are in stocks otherwise returns an exception message.

## Integration Tests
1. Product Service (1/1)
2. Order Service (TBD)
3. Inventory Service (TBD)
