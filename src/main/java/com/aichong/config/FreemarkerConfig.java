package com.aichong.config;

import java.io.IOException;
import java.util.Properties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.freemarker.FreeMarkerConfigurationFactory;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

/**
 * @Author: jingji.lin
 * @Description: 后台管理员页面
 * @Date: 2019/10/28 22:08
 * @Version: 1.0
 */
@Configuration
public class FreeMarkerConfig {


  @Bean
  public ViewResolver viewResolverFtl() {
    FreeMarkerViewResolver resolver = new FreeMarkerViewResolver();
    resolver.setCache(false);
    resolver.setViewClass(org.springframework.web.servlet.view.freemarker.FreeMarkerView.class);
    resolver.setExposeSpringMacroHelpers(true);
//        resolver.setAllowRequestOverride(true);
//        resolver.setAllowSessionOverride(true);
    resolver.setExposeRequestAttributes(true);
    resolver.setExposeSessionAttributes(true);
    resolver.setRequestContextAttribute("request");
    resolver.setSuffix(".ftl");
    resolver.setContentType("text/html;charset=UTF-8");
    resolver.setOrder(0);
    return resolver;
  }

  @Bean
  public ViewResolver viewResolverHtml() {
    FreeMarkerViewResolver resolver = new FreeMarkerViewResolver();
    resolver.setCache(false);
    resolver.setViewClass(org.springframework.web.servlet.view.freemarker.FreeMarkerView.class);
    resolver.setExposeSpringMacroHelpers(true);
//        resolver.setAllowRequestOverride(true);
//        resolver.setAllowSessionOverride(true);
    resolver.setExposeRequestAttributes(true);
    resolver.setExposeSessionAttributes(true);
    resolver.setRequestContextAttribute("request");
    resolver.setOrder(1);
    resolver.setSuffix(".html");
    resolver.setContentType("text/html;charset=UTF-8");
    return resolver;
  }


  @Bean
  public FreeMarkerConfigurer freemarkerConfig() throws IOException, TemplateException {
     FreeMarkerConfigurationFactory factory = new FreeMarkerConfigurationFactory();
    factory.setTemplateLoaderPath("classpath:/templates/");
    factory.setDefaultEncoding("UTF-8");
    factory.setPreferFileSystemAccess(false);
    FreeMarkerConfigurer result = new FreeMarkerConfigurer();
    freemarker.template.Configuration configuration = factory.createConfiguration();
    configuration.setSharedVariable("shiro", new ShiroTags());
    configuration.setClassicCompatible(true);
    result.setConfiguration(configuration);
    Properties settings = new Properties();
    settings.put("template_update_delay", "0");
    settings.put("default_encoding", "UTF-8");
    settings.put("number_format", "0.######");
    settings.put("classic_compatible", true);
    settings.put("template_exception_handler", "ignore");
    result.setFreemarkerSettings(settings);
    return result;
  }

}
