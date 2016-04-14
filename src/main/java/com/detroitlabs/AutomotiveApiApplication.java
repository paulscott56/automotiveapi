package com.detroitlabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableAutoConfiguration
@ComponentScan("com.detroitlabs.restcontroller")
public class AutomotiveApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutomotiveApiApplication.class, args);
    }

    @Bean
    public Docket automotiveApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.detroitlabs.restcontroller"))
                .paths(PathSelectors.ant("/automotive/*"))
                .build()
                .apiInfo(apiInfo());
    }


    @Bean
    UiConfiguration uiConfig() {
        return new UiConfiguration(
                "validatorUrl",// url
                "none",       // docExpansion          => none | list
                "alpha",      // apiSorter             => alpha
                "schema",     // defaultModelRendering => schema
                false,        // enableJsonEditor      => true | false
                true);        // showRequestHeaders    => true | false
    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "Detroit Labs Automotive REST API",
                "REST API for mobile clients to gather and post information.",
                "Free to use/abuse",
                "This is not a production service!",
                "pscott209@gmail.com",
                "Apache 2",
                "http://www.apache.org/licenses/LICENSE-2.0");
        return apiInfo;
    }
}
