package cn.geekhall.anno;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * AnnoDemoTest.java
 *
 * @author yiny
 */
public class AnnoDemoTest {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = Class.forName("cn.geekhall.anno.AnnoDemoSample");
        Method[] methods = clazz.getMethods();
        if (methods != null){
            for (Method method : methods) {
                if (method.isAnnotationPresent(InitMethod.class)){
                    method.invoke(clazz.getConstructor().newInstance(), null);
                }
            }
        }
    }
}
