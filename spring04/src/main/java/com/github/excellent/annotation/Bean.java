package com.github.excellent.annotation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import java.util.Map;

/**
 * @auther plg
 * @date 2019/7/30 22:27
 */
@Data
@Component
public class Bean {
    private String[] arr;
//    @Autowired
//    @Qualifier(value = "user")
    @Resource(name = "user")
    private User user1;
    private Map map;

    public void he(){}

}
