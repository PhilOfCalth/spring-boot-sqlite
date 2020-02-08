package phil.poc.springbootsqlite.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import phil.poc.springbootsqlite.projections.CustomerProduct;

@Configuration
public class RestConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration repositoryRestConfiguration) {
        repositoryRestConfiguration.getProjectionConfiguration().addProjection(CustomerProduct.class);
    }
}
