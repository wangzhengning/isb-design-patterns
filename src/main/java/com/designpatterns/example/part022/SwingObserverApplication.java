package com.designpatterns.example.part022;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zn.wang on 17/5/5.
 */
public class SwingObserverApplication {

    private JFrame jFrame;

    public static void main ( String[] args ) {
        SwingObserverApplication application = new SwingObserverApplication ( );
        //application.go ( );
        application.lambdasGo ();
    }

    public void go ( ) {
        jFrame = new JFrame ( );

        JButton jButton = new JButton ( "Should I do it?" );
        jButton.addActionListener ( new AngelListener ( ) );
        jButton.addActionListener ( new DevilListener ( ) );

        //set frame properties
        jFrame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        jFrame.getContentPane ( ).add ( BorderLayout.CENTER, jButton );
        jFrame.setSize ( 300, 300 );
        jFrame.setVisible ( true );
    }

    public void lambdasGo ( ) {
        jFrame = new JFrame ( );

        JButton jButton = new JButton ( "Should I do it?" );
        jButton.addActionListener ( event -> System.out.println ( "[点击按钮后,Angel say] Don't do it , you might regret it!" ) );
        jButton.addActionListener ( event -> System.out.println ( "[点击按钮后,Devil say] Come on , do it!" ) );

        //set frame properties
        jFrame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        jFrame.getContentPane ( ).add ( BorderLayout.CENTER, jButton );
        jFrame.setSize ( 300, 300 );
        jFrame.setVisible ( true );
    }


    class AngelListener implements ActionListener {

        @Override
        public void actionPerformed ( ActionEvent e ) {
            System.out.println ( "[点击按钮后,Angel say] Don't do it , you might regret it!" );
        }
    }

    class DevilListener implements ActionListener {

        @Override
        public void actionPerformed ( ActionEvent e ) {
            System.out.println ( "[点击按钮后,Devil say] Come on , do it!" );
        }
    }

}
