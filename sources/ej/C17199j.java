package eJ;

import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* renamed from: eJ.j  reason: case insensitive filesystem */
public class C17199j {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f143069a;

    /* renamed from: b  reason: collision with root package name */
    public static final ByteBuffer f143070b;

    /* renamed from: eJ.j$a */
    public interface a {
        int d();
    }

    /* renamed from: eJ.j$b */
    public interface b<T extends a> {
        T a(int i10);
    }

    static {
        byte[] bArr = new byte[0];
        f143069a = bArr;
        f143070b = ByteBuffer.wrap(bArr);
    }

    public static boolean a(byte[] bArr) {
        return C17214y.e(bArr);
    }

    public static String b(byte[] bArr) {
        try {
            return new String(bArr, Constants.ENCODING);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }
}
