//package com.vikas.springwebflow.servlet;
//
//import javax.servlet.ServletRegistration.Dynamic;
//
//import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//
//import com.vikas.springwebflow.config.WebFlowConfig;
//import com.vikas.springwebflow.config.WebMvcConfig;
//
//public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
//
//	public WebInitializer() {
//		super();
//	}
//
//	// API
//	protected Class<?>[] getRootConfigClasses() {
//		return new Class<?>[] { WebMvcConfig.class, WebFlowConfig.class };
//	}
//
//	@Override
//	protected Class<?>[] getServletConfigClasses() {
//		return null;
//	}
//
//	@Override
//	protected String[] getServletMappings() {
//		return new String[] { "/" };
//	}
//
//	@Override
//	protected void customizeRegistration(final Dynamic registration) {
//		super.customizeRegistration(registration);
//	}
//
//}
