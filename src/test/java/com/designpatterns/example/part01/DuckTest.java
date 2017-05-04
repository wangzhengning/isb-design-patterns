package com.designpatterns.example.part01;

import com.designpatterns.example.part01.fly.FlyNoWay;
import com.designpatterns.example.part01.fly.FlyWithWings;
import com.designpatterns.example.part01.quack.MuteQuack;
import com.designpatterns.example.part01.quack.Quack;
import com.designpatterns.example.part01.quack.Squeak;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zn.wang on 17/5/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/META-INF.spring/spring-shell-plugin.xml"})
public class DuckTest {

    @Autowired
    private DecoyDuck decoyDuck;

    @Autowired
    private MallardDuck mallardDuck;

    @Autowired
    private ReadHeadDuck readHeadDuck;

    @Autowired
    private RubberDuck rubberDuck;

    @Test
    public void testDecoyDuck(){
        //测试诱饵鸭子
        decoyDuck.setFlyBehavior ( new FlyNoWay () );
        decoyDuck.setQuackBehavior ( new Squeak ());

        decoyDuck.display ();
        decoyDuck.performFly ();
        decoyDuck.performQuack ();

    }

    @Test
    public void testMallardDuck(){
        //测试绿头鸭
        mallardDuck.setFlyBehavior ( new FlyWithWings () );
        mallardDuck.setQuackBehavior ( new Quack ());

        mallardDuck.display ();
        mallardDuck.performFly ();
        mallardDuck.performQuack ();

    }

    @Test
    public void testReadHeadDuck(){
        //测试红头鸭
        readHeadDuck.setFlyBehavior ( new FlyWithWings () );
        readHeadDuck.setQuackBehavior ( new MuteQuack ());

        readHeadDuck.display ();
        readHeadDuck.performFly ();
        readHeadDuck.performQuack ();
    }

    @Test
    public void testRubberDuck(){
        //测试橡皮鸭子
        rubberDuck.setFlyBehavior ( new FlyNoWay () );
        rubberDuck.setQuackBehavior ( new MuteQuack ());

        rubberDuck.display ();
        rubberDuck.performFly ();
        rubberDuck.performQuack ();
    }

}