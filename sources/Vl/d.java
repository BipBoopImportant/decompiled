package Vl;

import HJ.C15838d;
import HJ.C15840f;
import HJ.C15841g;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "b", "(Ljava/lang/String;)Ljava/lang/String;", "linkit-Implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {
    /* access modifiers changed from: private */
    public static final String b(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes(C15838d.f135279b);
            C17542s.i(bytes, "getBytes(...)");
            byte[] digest = instance.digest(bytes);
            C17542s.i(digest, "digest(...)");
            return C15840f.u(digest, (C15841g) null, 1, (Object) null);
        } catch (IllegalArgumentException | NullPointerException | NoSuchAlgorithmException unused) {
            return "Unknown";
        }
    }
}
