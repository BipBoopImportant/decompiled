package ZK;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: ZK.c  reason: case insensitive filesystem */
public class C17021c {
    private static String a(byte[] bArr, Charset charset) {
        if (bArr == null) {
            return null;
        }
        return new String(bArr, charset);
    }

    public static String b(byte[] bArr) {
        return a(bArr, StandardCharsets.UTF_8);
    }
}
