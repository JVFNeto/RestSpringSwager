package com.produtos.RestSpringSwager.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

import static springfox.documentation.builders.PathSelectors.regex;

@EnableSwagger2
@Configuration
public class SwaggerConfig extends WebMvcConfigurationSupport {

    @Bean
    public Docket pAPI(){//productApi
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.produtos.RestSpringSwager"))//pacote onde estão todas as classes java
                .paths(regex("/api.*"))//caminho que pode acessar (definido em ProdutoResouce)
                .build()
                .apiInfo(metaInfo());
    }
    private ApiInfo metaInfo(){
        ApiInfo ai = new ApiInfo(
                "Produtos Api REST",
                "API REST de cadastro de produtos",
                "1.0",
                "Terms of Service",
                new Contact("João Vitor Ferreira Neto", "www.linkedin.com/in/joão-vitor-ferreira-neto-3aa6521a1",
                        "Carryonlink@gmail.com"),
                "Apache License Version 2.0",
                "https://www.apacheorg/license.html", new ArrayList<VendorExtension>()
        );
    return ai;// retorna a ApiInfo
    }

}
