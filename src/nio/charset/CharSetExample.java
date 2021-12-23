package nio.charset;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class CharSetExample {
    public static void main(String[] args) {
        
        Charset utf8 = Charset.forName("UTF-8");
        Charset euckr = Charset.forName("EUC-KR");
        
        String data = "안녕하세요";

        ByteBuffer encode1 = utf8.encode(data);
        ByteBuffer encode2 = euckr.encode(data);

        String decode1 = utf8.decode(encode1).toString();
        String decode2 = euckr.decode(encode2).toString();
        System.out.println(decode1);
        System.out.println(decode2);

    }
}
