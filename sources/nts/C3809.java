package nts;

import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;

/* renamed from: nts.ሁ  reason: contains not printable characters */
public class C3809 implements ECPublicKey {

    /* renamed from: ગ  reason: contains not printable characters */
    public ECParameterSpec f1508;

    /* renamed from: ഇ  reason: contains not printable characters */
    public ECPoint f1509;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public String f1510;

    public C3809(BigInteger bigInteger, BigInteger bigInteger2, ECParameterSpec eCParameterSpec, String str) {
        this.f1509 = new ECPoint(bigInteger, bigInteger2);
        this.f1508 = eCParameterSpec;
        this.f1510 = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3809)) {
            return false;
        }
        C3809 r42 = (C3809) obj;
        return this.f1509.getAffineX().equals(r42.f1509.getAffineX()) && this.f1509.getAffineY().equals(r42.f1509.getAffineY()) && this.f1510.equals(r42.f1510);
    }

    public String getAlgorithm() {
        return C3971.f2410;
    }

    public byte[] getEncoded() {
        C4136 r02 = new C4136();
        r02.f3702 = C4136.m3387(this.f1510);
        r02.f3705 = C4136.m3385(this.f1509.getAffineX().toByteArray(), C4136.m3382(r02.f3702));
        r02.f3704 = C4136.m3385(this.f1509.getAffineY().toByteArray(), C4136.m3382(r02.f3702));
        byte[] r03 = r02.m3408(false);
        C4228 r12 = new C4228();
        r12.f4235 = this.f1510;
        r12.f4234 = r03;
        return r12.m3273();
    }

    public String getFormat() {
        return "";
    }

    public ECParameterSpec getParams() {
        return this.f1508;
    }

    public ECPoint getW() {
        return this.f1509;
    }

    public int hashCode() {
        return super.hashCode();
    }
}
