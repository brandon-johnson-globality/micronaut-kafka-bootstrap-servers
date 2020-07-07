package bootstrap.servers.example;

import io.micronaut.configuration.kafka.config.KafkaDefaultConfiguration;
import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.inject.Inject;

@MicronautTest
public class BootstrapServersExampleTest {

    @Inject
    EmbeddedApplication application;

    @Inject
    KafkaDefaultConfiguration kafkaConfiguration;

    @Test
    void testThatBootstrapServersAreSetViaEnvironmentVariable() {
        String bootstrapServersEnv = System.getenv("KAFKA_BOOTSTRAP_SERVERS");
        String bootstrapServers = kafkaConfiguration.getConfig().getProperty("bootstrap.servers");
        assertEquals("setbyenv:1234", bootstrapServersEnv);
        assertEquals(bootstrapServersEnv, bootstrapServers);
    }
}
