package com.designpatterns.example.part032decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by zn.wang on 17/5/6.
 * jdk中的I/O包中大量使用了装饰者模式.
 * LowerCaseInputStream:相当于装饰器实现
 * FilterInputStream:相当于抽象装饰器
 * InputStream:相当于被装饰器
 */
public class LowerCaseInputStream extends FilterInputStream {

    protected LowerCaseInputStream ( InputStream in ) {
        super ( in );
    }

    public int read ( ) throws IOException {
        int c = in.read ( );
        return (c == -1) ? c : Character.toLowerCase ( (char) c );
    }

    public int read ( byte b[], int off, int len ) throws IOException {
        int result =  in.read ( b, off, len );
        for(int i = off; i< off +result ; i++){
            b[i] = (byte)Character.toLowerCase ( (char) b[i] );
        }
        return result;
    }


}
