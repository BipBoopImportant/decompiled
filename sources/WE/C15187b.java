package wE;

import ZK.C17019a;
import java.io.ByteArrayOutputStream;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

/* renamed from: wE.b  reason: case insensitive filesystem */
public class C15187b {
    public static String a(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bytes = str.getBytes();
        Deflater deflater = new Deflater();
        deflater.setInput(bytes);
        try {
            byteArrayOutputStream = new ByteArrayOutputStream(bytes.length);
            deflater.finish();
            byte[] bArr = new byte[32768];
            while (!deflater.finished()) {
                byteArrayOutputStream.write(bArr, 0, deflater.deflate(bArr));
            }
            String d10 = d(byteArrayOutputStream.toByteArray());
            byteArrayOutputStream.close();
            deflater.end();
            return d10;
        } catch (Throwable th2) {
            deflater.end();
            throw th2;
        }
        throw th;
    }

    static byte[] b(String str) {
        return C17019a.q(str.getBytes());
    }

    public static String c(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] b10 = b(str);
        Inflater inflater = new Inflater();
        inflater.setInput(b10);
        try {
            byteArrayOutputStream = new ByteArrayOutputStream(b10.length);
            byte[] bArr = new byte[32768];
            while (!inflater.finished()) {
                byteArrayOutputStream.write(bArr, 0, inflater.inflate(bArr));
            }
            String byteArrayOutputStream2 = byteArrayOutputStream.toString();
            byteArrayOutputStream.close();
            inflater.end();
            return byteArrayOutputStream2;
        } catch (Throwable th2) {
            inflater.end();
            throw th2;
        }
        throw th;
    }

    static String d(byte[] bArr) {
        return bArr != null ? new String(C17019a.r(bArr)) : "";
    }
}
