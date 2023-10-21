package com.project.service.api.basic;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;


/**
 * 서비스의 기본 설정값 초기화
 */
@Configuration
@Component
@ComponentScan(
        basePackages = {
                "com.project.db",

        }
)
@EntityScan(basePackages = {"com.project.db"})
//@EnableConfigurationProperties(AppProperties.class)
@EnableJpaAuditing
@EnableJpaRepositories(basePackages = {
        "com.project.service.api",
})
//@EnableAspectJAutoProxy
//@EnableScheduling
//@EnableAsync
public class BasicConfiguration {

}
