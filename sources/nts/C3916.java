package nts;

import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;

/* renamed from: nts.ᖱ  reason: contains not printable characters */
public class C3916 implements ECPrivateKey {

    /* renamed from: ϴ  reason: contains not printable characters */
    public ECParameterSpec f1874;

    /* renamed from: ગ  reason: contains not printable characters */
    public BigInteger f1875;

    /* renamed from: ഇ  reason: contains not printable characters */
    public BigInteger f1876;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public BigInteger f1877;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public String f1878;

    public C3916(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, ECParameterSpec eCParameterSpec, String str) {
        this.f1876 = bigInteger;
        this.f1875 = bigInteger2;
        this.f1877 = bigInteger3;
        this.f1874 = eCParameterSpec;
        this.f1878 = str;
    }

    public String getAlgorithm() {
        return C3971.f2410;
    }

    public byte[] getEncoded() {
        C4151 r02 = new C4151();
        C4136 r12 = new C4136();
        r02.f3779 = r12;
        r12.f3702 = C4136.m3387(this.f1878);
        r02.f3779.f3707 = C4136.m3385(this.f1876.toByteArray(), C4136.m3382(r02.f3779.f3702));
        r02.f3779.f3705 = C4136.m3385(this.f1875.toByteArray(), C4136.m3382(r02.f3779.f3702));
        r02.f3779.f3704 = C4136.m3385(this.f1877.toByteArray(), C4136.m3382(r02.f3779.f3702));
        return r02.m3273();
    }

    public String getFormat() {
        return "";
    }

    public ECParameterSpec getParams() {
        return this.f1874;
    }

    public BigInteger getS() {
        return this.f1876;
    }
}
