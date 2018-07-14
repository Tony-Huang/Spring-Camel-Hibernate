package com.hdp.camel.processor;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;

import java.nio.charset.Charset;

/**
 * Created by admin on 2017/12/30.
 */
public class CharSetTest {
    public static void main(String[]  args) throws  Exception{
        Charset cs = Charset.defaultCharset();
        System.out.println("charset="+cs);
        //System.out.println(CharSet);
        String s1="演示";
        byte[] bytes = s1.getBytes("utf-8");
        System.out.println("bytes.length="+bytes.length);
        for (int i=0; i<bytes.length; i++) {
            System.out.println( bytes[i] +":"+Integer.toHexString(bytes[i]));

        }
        System.out.println(s1);

        String s2= new String(bytes,"utf-8");
        String s3 =URLDecoder.decode(s2,"ASCII");
        System.out.println("s2="+s2);
        System.out.println("s3="+s3);

        String now="date现在是";
        String encodedNow = URLEncoder.encode(now,"utf-8");
        System.out.println("now="+now);
        System.out.println("encodedNow="+encodedNow);

        byte[] strBytes=new byte[]{0x64,0x61,0x74,0x65,(byte)0xe7,(byte)0x8e,(byte)0xb0,(byte)0xe5,(byte)0x9c,(byte)0xa8,(byte)0xe6,(byte)0x98,(byte)0xaf};

        Charset defaultCS = Charset.defaultCharset();
        Charset gbkCS=Charset.forName("GBK");
        Charset gb2312CS=Charset.forName("gb2312");
        Charset utf8CS=Charset.forName("utf-8");
        System.out.println("defaultCharset="+defaultCS);
        System.out.println("GBK Charset="+gbkCS);
        System.out.println("gb2312 Charset="+gb2312CS);
        System.out.println("utf8 Charset="+utf8CS);


        String strDefault= new String(strBytes,defaultCS);
        String strUtf8= new String(strBytes,"utf-8");
        System.out.println("strDefault="+strDefault);
        System.out.println("strUtf8="+strUtf8);

    }
}
