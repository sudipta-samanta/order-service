# order-service
Order service component of a microservice. It's a spring boot project. 
The goal is to communicate with other services using microservice architecture. Here Order Service communicate with Payment Service to place an order. Implemented Service Discovery using Eureka to communicate with [payment-service](https://github.com/sudipta-samanta/payment-service)

## Dependencies

Here are list of dependencies used for this project :
- spring-boot-starter-web
- spring-boot-starter-data-jpa
- h2
- spring-cloud-starter-netflix-eureka-client

Used H2 in memory database for storing data, for project purpose.

## API Usage

- __To place an order__ : localhost:<port>/order/bookOrder
- method : __POST__
- Here is the request body:
```json
{
  "order":{
    "id":1,
    "amount":4000,
    "orderDetails":"ear phone"
  },
  "payment":{}
}
```

- Here is the response body:
```json
{
    "order": {
        "id": 1,
        "status": "order success",
        "amount": 4000.0,
        "orderDetails": "ear phone"
    },
    "payment": {
        "status": "payment success",
        "amount": 4000.0,
        "transactionId": "e97736c4-47ab-404c-b90e-f0c0603a246c",
        "orderId": 1
    }
}
```

### Credits
Want to do a shout out to [Java Techie](https://www.youtube.com/c/JavaTechie) for share this knowledge. Followed the awesome microservice playlist on YouTube. Check it out!