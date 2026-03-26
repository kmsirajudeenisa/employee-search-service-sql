--------------------------------------------------------
1. Deploy Kafka and Zookeeper
--------------------------------------------------------
Use Docker Compose to start Kafka and Zookeeper

    docker compose up -d

--------------------------------------------------------
2. Run the Order Service Kafka Application
--------------------------------------------------------
Build and run the application using Gradle:

    ./gradlew clean build bootRun

--------------------------------------------------------
3. Post a Message to Kafka Topic (orders)
--------------------------------------------------------
Step 1: Access the Kafka container:

    docker exec -it order-service-kafka-kafka-1 sh

Step 2: Use Kafka console producer to send a message:

    kafka-console-producer.sh --bootstrap-server localhost:9092 --topic orders

Step 3: Enter the JSON message:

    {
      "orderId": "ORD12345",
      "product": "Laptop",
      "quantity": 2
    }