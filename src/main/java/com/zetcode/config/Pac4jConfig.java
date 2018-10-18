package com.zetcode.config;



import org.pac4j.core.authorization.authorizer.RequireAnyRoleAuthorizer;
import org.pac4j.core.client.Clients;
import org.pac4j.core.config.Config;

/*
import org.pac4j.http.client.direct.DirectBasicAuthClient;
import org.pac4j.http.client.direct.ParameterClient;
import org.pac4j.http.client.indirect.FormClient;
import org.pac4j.http.client.indirect.IndirectBasicAuthClient;
*/
import org.pac4j.oauth.client.FacebookClient;
/* import org.pac4j.oauth.client.GitHubClient; */
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import java.io.File;

@Configuration
public class Pac4jConfig {

    @Value("${salt}")
    private String salt;

        @Bean
	public Config config() {

	    final FacebookClient facebook = new FacebookClient("145278422258960", "be21409ba8f39b5dae2a7de525484da8");
	    
	    final Clients clients = new Clients("http://localhost:8080/callback",
						facebook);

	    final Config config = new Config(clients);
	    config.addAuthorizer("admin",
				 new RequireAnyRoleAuthorizer("ROLE_ADMIN"));
	    config.addAuthorizer("custom",
				 new CustomAuthorizer());
	    return config;
	}
}
