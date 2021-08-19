package cn.geekhall.anno;

/**
 * AnnoDemoSample.java
 *
 * @author yiny
 */

@AnnoDemo
public class AnnoDemoSample {

    @InitMethod
    public void init(){
        System.out.println("Initializing... ");
    }
}
