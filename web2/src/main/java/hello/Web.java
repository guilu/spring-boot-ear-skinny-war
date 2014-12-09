package hello;

import org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class Web extends WebMvcConfigurerAdapter {

    @Bean(name = DispatcherServletAutoConfiguration.DEFAULT_DISPATCHER_SERVLET_BEAN_NAME)
    public DispatcherServlet dispatcherServlet(){
        return new DispatcherServlet();
    }

    @Bean
    public ServletRegistrationBean dispatcherRegistration(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(
                dispatcherServlet());
        registrationBean.addUrlMappings("/*");
        return registrationBean;
    }

}
