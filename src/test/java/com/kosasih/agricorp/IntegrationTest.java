package com.kosasih.agricorp;

import com.kosasih.agricorp.AgricorpApp;
import com.kosasih.agricorp.config.AsyncSyncConfiguration;
import com.kosasih.agricorp.config.EmbeddedElasticsearch;
import com.kosasih.agricorp.config.EmbeddedKafka;
import com.kosasih.agricorp.config.EmbeddedSQL;
import com.kosasih.agricorp.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { AgricorpApp.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@EmbeddedKafka
public @interface IntegrationTest {
}
