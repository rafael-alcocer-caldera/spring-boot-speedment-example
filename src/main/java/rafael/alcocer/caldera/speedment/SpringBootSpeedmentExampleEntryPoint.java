package rafael.alcocer.caldera.speedment;

import com.speedment.runtime.connector.postgres.PostgresBundle;

import rafael.alcocer.caldera.speedment.testdb.public_.users.UsersManager;

/**
 * The entry point for the {@link com.speedment.runtime.config.Project} named
 * public
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author Rafael Alcocer Caldera
 */
public final class SpringBootSpeedmentExampleEntryPoint {
    
    public static void main(String... args) {
        final SpringBootSpeedmentExampleApplication application = new SpringBootSpeedmentExampleApplicationBuilder()
            // Add bundles, auth information, etc.
                .withBundle(PostgresBundle.class)
                .withUsername("postgres")
                .withPassword("postgres")
            .build();
        
        // Application logic goes here
        UsersManager users = application.getOrThrow(UsersManager.class);
        System.out.println("##### users: " + users);
        
        users.stream().forEach(System.out::println);
        
        application.stop();
    }
}