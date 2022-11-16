/**
 * Copyright [2022] [RAFAEL ALCOCER CALDERA]
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package rafael.alcocer.caldera.speedment.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.speedment.runtime.connector.postgres.PostgresBundle;

import lombok.Getter;
import lombok.Setter;
import rafael.alcocer.caldera.speedment.SpringBootSpeedmentExampleApplication;
import rafael.alcocer.caldera.speedment.SpringBootSpeedmentExampleApplicationBuilder;
import rafael.alcocer.caldera.speedment.testdb.public_.users.UsersManager;

@Getter
@Setter
@Configuration
@ConfigurationProperties("spring.datasource")
public class SpeedmentConfiguration {

    private String username;
    private String password;

    @Bean
    public SpringBootSpeedmentExampleApplication springBootSpeedmentExampleApplicationBuilder() {
        return new SpringBootSpeedmentExampleApplicationBuilder()
                .withBundle(PostgresBundle.class)
                .withUsername(getUsername())
                .withPassword(getPassword())
                .build();
    }

    @Bean
    public UsersManager getUsersManager(SpringBootSpeedmentExampleApplication app) {
        return app.getOrThrow(UsersManager.class);
    }
}
