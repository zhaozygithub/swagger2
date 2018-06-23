package com.ssq.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author shaosq
 * @ClassName com.ssq.swagger.Swgger2
 * @Description
 * @date 2018-04-18 12:12:31
 */
@Configuration
public class Swagger2 {

	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				//设置controller的包路径
				.apis(RequestHandlerSelectors.basePackage("com.ssq.swagger.web"))
				.paths(PathSelectors.any())
				.build();
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("springboot利用swagger构建api文档")
				.description("简单优雅的restfun风格，http://blog.didispace.com/springbootswagger2/")
				.termsOfServiceUrl("http://blog.didispace.com/springbootswagger2/")
				.version("1.0")
				.build();
	}
}