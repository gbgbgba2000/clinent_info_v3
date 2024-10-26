package alien.learn.ademo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;


@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .addServersItem(new Server().url("https://cloud-run2-l3gu3u7b2a-de.a.run.app").description("clinent server")) 
                .info(new Info()
                .title("Spring Boot API")
                .version("1.0")
                .description("alien.learn.ademo.controller"));
    }
}