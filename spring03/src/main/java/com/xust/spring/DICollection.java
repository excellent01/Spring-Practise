package com.xust.spring;
import lombok.Data;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 练习集合的注入
 * @auther plg
 * @date 2019/7/29 14:39
 */
@Data
public class DICollection {
    private Thread thread;
    private String[] strArray;
    private List<Integer> list;
    private Set set;
    private Map<String,String> map;
    public DICollection(){
    }
}
