package com.testincrement.testincrement.config;

import com.testincrement.testincrement.regexp.ShareRegexp;
import com.testincrement.testincrement.service.Incrementor;
import com.testincrement.testincrement.service.impl.IncrementorImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Here all beans
 */

@Configuration
public class ConfBeans {

    @Bean
    public ShareRegexp shareRegexp(){
        return new ShareRegexp();
    }

    @Bean
    public Incrementor incrementor(){
        return new IncrementorImpl();
    }

}
