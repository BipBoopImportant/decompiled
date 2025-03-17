package j7;

import com.adjust.sdk.Constants;
import java.security.MessageDigest;
import java.security.PublicKey;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljava/security/PublicKey;", "", "a", "(Ljava/security/PublicKey;)[B", "certificatetransparency"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: j7.g  reason: case insensitive filesystem */
public final class C8413g {
    public static final byte[] a(PublicKey publicKey) {
        C17542s.j(publicKey, "<this>");
        byte[] digest = MessageDigest.getInstance(Constants.SHA256).digest(publicKey.getEncoded());
        C17542s.i(digest, "digest(...)");
        return digest;
    }
}
