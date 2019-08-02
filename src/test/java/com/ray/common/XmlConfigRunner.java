package com.ray.common;

import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class XmlConfigRunner extends BlockJUnit4ClassRunner {

    public XmlConfigRunner(Class<?> klass) throws InitializationError {
        super(klass);
        Config.init("mybatis-config");
    }
    
}
