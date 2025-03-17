package h7;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import r7.C8706h;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lh7/d;", "", "Ljava/security/PublicKey;", "publicKey", "<init>", "(Ljava/security/PublicKey;)V", "", "message", "signature", "Lr7/h;", "a", "([B[B)Lr7/h;", "Ljava/security/PublicKey;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final PublicKey f51659a;

    public d(PublicKey publicKey) {
        C17542s.j(publicKey, "publicKey");
        this.f51659a = publicKey;
    }

    public final C8706h a(byte[] bArr, byte[] bArr2) {
        C8706h hVar;
        C17542s.j(bArr, "message");
        C17542s.j(bArr2, "signature");
        try {
            Signature instance = Signature.getInstance("SHA256withRSA");
            instance.initVerify(this.f51659a);
            instance.update(bArr);
            return instance.verify(bArr2) ? C8706h.b.f55771a : C8706h.a.c.f55769a;
        } catch (SignatureException e10) {
            hVar = new C8706h.a.d(e10);
            return hVar;
        } catch (InvalidKeyException e11) {
            hVar = new C8706h.a.b(e11);
            return hVar;
        } catch (NoSuchAlgorithmException e12) {
            hVar = new C8706h.a.C0903a(e12);
            return hVar;
        }
    }
}
