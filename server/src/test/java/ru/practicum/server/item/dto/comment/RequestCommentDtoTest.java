package ru.practicum.server.item.dto.comment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import static org.assertj.core.api.Assertions.assertThat;

@JsonTest
class RequestCommentDtoTest {
    @Autowired
    private JacksonTester<RequestCommentDto> json;

    @Configuration
    static class TestConfig {
        @Bean
        public javax.validation.Validator validator() {
            return new LocalValidatorFactoryBean();
        }
    }

    @Test
    public void testDeserialize() throws Exception {
        String jsonString = "{\"text\":\"Комментарий\"}";

        RequestCommentDto dto = json.parse(jsonString).getObject();

        assertThat(dto.getText()).isEqualTo("Комментарий");
    }
}