package a9;

import android.util.Base64;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.t3  reason: case insensitive filesystem */
public final class C6936t3 {
    public static String a(byte[] bArr) {
        C17542s.j(bArr, "imageByteArray");
        String encodeToString = Base64.encodeToString(bArr, 2);
        C17542s.i(encodeToString, "encodeToString(imageByteArray, Base64.NO_WRAP)");
        return encodeToString;
    }
}
