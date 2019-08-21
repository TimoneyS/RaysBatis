package com.ray.common;

import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class AnnoConfigRunner extends BlockJUnit4ClassRunner  {
    
    public AnnoConfigRunner(Class<?> klass) throws InitializationError {
        super(klass);
        Config.init("mybatis-config-anno.xml");
        H2Util.init("schema.sql");
    }
}
