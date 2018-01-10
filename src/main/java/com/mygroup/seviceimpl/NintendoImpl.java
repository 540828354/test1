package main.java.com.mygroup.seviceimpl;

import main.java.com.mygroup.sevice.Nintendo;

/**
 * Created by Administrator on 2018/1/10.
 */
public class NintendoImpl implements Nintendo{

    @Override
    public void sayHello() {
        System.out.print("hello Nintendo");
    }

    @Override
    public void play(String input) {
        System.out.print(input);
    }
    
}
