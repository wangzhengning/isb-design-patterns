package com.designpatterns.example.part032decorator;

import com.google.common.io.Resources;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by zn.wang on 17/5/6.
 */
public class InputApplication {
    public static void main ( String[] args ) {
        int c;
        InputStream inputStream = null;
        try {
            String fileName = Resources.getResource ( "decoratorFile.txt" ).getFile ( );
            inputStream =
                    new LowerCaseInputStream ( new BufferedInputStream ( new FileInputStream ( fileName ) ) );
            while ((c = inputStream.read ( )) > 0) {
                System.out.print ( (char) c );
            }
        } catch (Exception e) {
            e.printStackTrace ( );
        } finally {
            try {
                if (inputStream != null)
                    inputStream.close ( );
            } catch (IOException e) {
                e.printStackTrace ( );
            }
        }
    }
}
