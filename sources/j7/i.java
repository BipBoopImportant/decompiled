package j7;

import HJ.C15850p;
import HJ.C15854t;
import YH.C16877v;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import k7.g;
import k7.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import n7.C8587a;
import n7.C8588b;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lj7/i;", "", "<init>", "()V", "", "bytes", "Ljava/security/PublicKey;", "d", "([B)Ljava/security/PublicKey;", "", "keyText", "e", "(Ljava/lang/String;)Ljava/security/PublicKey;", "keyBytes", "b", "([B)Ljava/lang/String;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f54066a = new i();

    private i() {
    }

    /* access modifiers changed from: private */
    public static final String c(C8587a aVar) {
        C17542s.j(aVar, "$this$query");
        return ((C8587a) C16877v.w0(((C8587a) C16877v.w0(aVar.b())).b())).a();
    }

    public final String b(byte[] bArr) {
        C17542s.j(bArr, "keyBytes");
        String str = (String) C8588b.a(g.f(bArr, (h) null, 1, (Object) null), new h());
        switch (str.hashCode()) {
            case -2096004509:
                if (str.equals("1.2.840.113549.1.1.1")) {
                    return "RSA";
                }
                break;
            case -2096002587:
                if (str.equals("1.2.840.113549.1.3.1")) {
                    return "DH";
                }
                break;
            case -902557053:
                if (str.equals("1.2.840.10040.4.1")) {
                    return "DSA";
                }
                break;
            case -897941370:
                if (str.equals("1.2.840.10045.2.1")) {
                    return "EC";
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported key type " + str);
    }

    public final PublicKey d(byte[] bArr) {
        C17542s.j(bArr, "bytes");
        PublicKey generatePublic = KeyFactory.getInstance(b(bArr)).generatePublic(new X509EncodedKeySpec(bArr));
        C17542s.i(generatePublic, "generatePublic(...)");
        return generatePublic;
    }

    public final PublicKey e(String str) {
        C17542s.j(str, "keyText");
        String str2 = str;
        int s02 = C15854t.s0(str2, "-----BEGIN PUBLIC KEY-----", 0, false, 6, (Object) null);
        int s03 = C15854t.s0(str2, "-----END PUBLIC KEY-----", 0, false, 6, (Object) null);
        if (s02 < 0 || s03 < 0) {
            throw new IllegalArgumentException("Missing public key entry in PEM file");
        }
        C8407a aVar = C8407a.f54060a;
        String substring = str.substring(s02 + 26, s03);
        C17542s.i(substring, "substring(...)");
        return d(aVar.a(new C15850p("\\s+").j(substring, "")));
    }
}
