package org.fornever.spring.stepbystep.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

@Configuration
public class FastjsonConfiguration extends WebMvcConfigurerAdapter {
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
		List<MediaType> mts = new ArrayList<MediaType>();
		// use the fastjson when content type == json
		mts.add(MediaType.APPLICATION_JSON);
		mts.add(MediaType.APPLICATION_JSON_UTF8);
		converter.setSupportedMediaTypes(mts);
		converters.add(converter);
	}
}