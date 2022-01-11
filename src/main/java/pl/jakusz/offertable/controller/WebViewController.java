package pl.jakusz.offertable.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class WebViewController implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("silkyCodersOfferTable");
        registry.addViewController("/login").setViewName("login");
//        registry.addViewController("/offer").setViewName("detailedOffer");
    }
}
