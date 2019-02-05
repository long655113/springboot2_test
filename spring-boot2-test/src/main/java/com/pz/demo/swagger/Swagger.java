package com.pz.demo.swagger;

import com.google.common.base.Predicate;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author zjl
 */
@EnableSwagger2
@Configuration
public class Swagger {

    @Bean
    public Docket createRestApi() {
        Predicate<RequestHandler> predicate = new Predicate<RequestHandler>() {
            @Override
            public boolean apply(RequestHandler input) {
                if (input.isAnnotatedWith(ApiOperation.class))//只有添加了ApiOperation注解的method才在API中显示
                {
                    return true;
                }
                return true;
            }
        };

        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("WebApi-Config")
                .apiInfo(apiInfo())
                .select()
                .apis(predicate)
                .apis(RequestHandlerSelectors.basePackage("com.pz.demo.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("spring-boot2-demo RESTful APIs")
                .description("spring-boot2-demo接口文档")
                .version("2.0")
                .build();
    }

    @Bean
    public Docket createGuardApi() {

        Predicate<RequestHandler> predicate = new Predicate<RequestHandler>() {
            @Override
            public boolean apply(RequestHandler input) {
                if (input.isAnnotatedWith(ApiOperation.class))//只有添加了ApiOperation注解的method才在API中显示
                {
                    return true;
                }
                return true;
            }
        };

        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("WebApi-UnConfig")
                .apiInfo(guardApiInfo())
                .select()
                .apis(predicate)
                .apis(RequestHandlerSelectors.basePackage("com.pz.demo.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo guardApiInfo() {
        return new ApiInfoBuilder()
                .title("spring-boot2-demoRESTful APIs")
                .description("spring-boot2-demo接口文档（未标注）")
                .version("1.0")
                .build();
    }

}
