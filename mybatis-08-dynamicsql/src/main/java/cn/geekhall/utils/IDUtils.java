package cn.geekhall.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * IDUtils.java
 *
 * @author yiny
 */
@SuppressWarnings("all")
public class IDUtils {

    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    @Test
    public void getIdTest(){
        System.out.println(IDUtils.getId());
    }
}
