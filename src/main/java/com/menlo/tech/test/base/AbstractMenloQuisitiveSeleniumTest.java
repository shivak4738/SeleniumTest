package com.menlo.tech.test.base;

import org.springframework.test.context.ContextConfiguration;
import org.testng.annotations.BeforeClass;

import com.menlo.tech.test.AbstractSeleniumTest;
import com.menlo.tech.test.config.ChromeDriverFactoryConfig;
import com.menlo.tech.test.config.SeleniumConfig;
import com.menlo.tech.test.config.TestConfig;

@ContextConfiguration(
		classes = {
				//BaseConfig.class,
				SeleniumConfig.class,
				ChromeDriverFactoryConfig.class,
				TestConfig.class
		}
)
public class AbstractMenloQuisitiveSeleniumTest extends AbstractSeleniumTest{

	protected String menloURL;

	@BeforeClass
	protected void setup() {
		menloURL = env.getRequiredProperty("menloURL");
	}
}
