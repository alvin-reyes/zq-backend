/**
 * Class File Name: AppConfig.java
 * Author: alvinreyes
 * Date Generate: Jun 28, 2015
 * Description
 */

package com.zatiq.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


/**
 * The Class AppConfig.
 */
@Configuration
@ComponentScan({"com.zatiq"})
@Import(value = {ServiceConfig.class,DaoConfig.class,DataSourceFactoryConfig.class})
public class AppConfig {
	
}
