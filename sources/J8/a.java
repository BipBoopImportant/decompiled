package J8;

import android.util.Base64;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x8.C8958b;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\tB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"LJ8/a;", "", "Lx8/b;", "libraryInterface", "", "privateKey", "<init>", "(Lx8/b;[B)V", "data", "a", "([B)[B", "Lx8/b;", "Ljava/security/PrivateKey;", "b", "Ljava/security/PrivateKey;", "c", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final C0595a f37403c = new C0595a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C8958b f37404a;

    /* renamed from: b  reason: collision with root package name */
    private final PrivateKey f37405b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"LJ8/a$a;", "", "<init>", "()V", "", "MGF1", "Ljava/lang/String;", "RSA_ALGORITHM", "SHA256", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: J8.a$a  reason: collision with other inner class name */
    public static final class C0595a {
        private C0595a() {
        }

        public /* synthetic */ C0595a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a(C8958b bVar, byte[] bArr) {
        PrivateKey privateKey;
        C17542s.j(bVar, "libraryInterface");
        this.f37404a = bVar;
        if (bArr != null) {
            privateKey = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(bArr, 0)));
        } else {
            privateKey = null;
        }
        this.f37405b = privateKey;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r0.b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] a(byte[] r8) {
        /*
            r7 = this;
            x8.b r0 = r7.f37404a
            A8.b r0 = r0.a()
            r1 = 0
            if (r0 == 0) goto L_0x0014
            com.contentsquare.android.core.features.config.model.JsonConfig$ProjectConfiguration r0 = r0.b()
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = r0.h()
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 == 0) goto L_0x004a
            if (r8 != 0) goto L_0x001a
            goto L_0x004a
        L_0x001a:
            java.lang.String r1 = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)
            javax.crypto.spec.OAEPParameterSpec r2 = new javax.crypto.spec.OAEPParameterSpec
            java.security.spec.MGF1ParameterSpec r3 = java.security.spec.MGF1ParameterSpec.SHA256
            javax.crypto.spec.PSource$PSpecified r4 = javax.crypto.spec.PSource.PSpecified.DEFAULT
            java.lang.String r5 = "SHA-256"
            java.lang.String r6 = "MGF1"
            r2.<init>(r5, r6, r3, r4)
            r3 = 0
            byte[] r0 = android.util.Base64.decode(r0, r3)
            java.security.spec.X509EncodedKeySpec r3 = new java.security.spec.X509EncodedKeySpec
            r3.<init>(r0)
            java.lang.String r0 = "RSA"
            java.security.KeyFactory r0 = java.security.KeyFactory.getInstance(r0)
            java.security.PublicKey r0 = r0.generatePublic(r3)
            r3 = 1
            r1.init(r3, r0, r2)
            byte[] r8 = r1.doFinal(r8)
            return r8
        L_0x004a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: J8.a.a(byte[]):byte[]");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(C8958b bVar, byte[] bArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i10 & 2) != 0 ? null : bArr);
    }
}
