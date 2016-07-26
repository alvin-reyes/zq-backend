/**
 * Class File Name: Datasource.java
 * Author: alvinreyes
 * Date Generate: Jun 28, 2015
 * Description
 */

package com.zatiq.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.zatiq.dao.BaseDao;
 

/**
 * The Class DataSourceFactoryConfig.
 */
@Configuration
@ComponentScan(basePackageClasses = {BaseDao.class})
public class DataSourceFactoryConfig {

	/**
	 * Gets the data source.
	 *
	 * @return the data source
	 */
	@Bean(name="dataSource")
	public DataSource getDataSource() {
		DriverManagerDataSource dm = new DriverManagerDataSource();
		dm.setDriverClassName("com.mysql.jdbc.Driver");
		dm.setUrl("jdbc:mysql://localhost:3306/erload_db");
		dm.setUsername("areyes");
		dm.setPassword("password");
		return dm;
	}
}
