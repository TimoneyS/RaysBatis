package com.ray.common;

import java.io.IOException;
import java.util.Properties;

public class SysUtil {
    
    public static Properties loadProperties(String name) {
        Properties prop = new Properties();
        try {
            prop.load(SysUtil.class.getClassLoader().getResourceAsStream(name));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }
    
}
