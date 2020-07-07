## Project Demonstrating that KAFKA_BOOTSTRAP_SERVERS env variable is not being honored

Micronaut Config via Environment Variables no longer works, this was most likely caused by:

https://github.com/micronaut-projects/micronaut-kafka/commit/7a688f5b34c952aa8da2d981f73805458a0110d9

Run BootstrapServersExampleTest.java for demonstration

```gradle test```

