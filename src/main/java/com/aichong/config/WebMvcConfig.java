package com.aichong.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @Author: jingji.lin
 * @Description: 前端控制器
 * @Date: 2019/10/28 22:03
 * @Version: 1.0
 */
@Configuration
@SuppressWarnings("all")
public class WebMvcConfig extends WebMvcConfigurationSupport {

  @Override
  protected void addViewControllers(ViewControllerRegistry registry) {
    registry.addViewController("/").setViewName("forward:/main");
    registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    super.addViewControllers(registry);
  }

  @Override
  protected void addResourceHandlers(ResourceHandlerRegistry registry) {
    //将所有/static/** 访问都映射到classpath:/static/ 目录下
    registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
  }
}
