package L8;

import HJ.C15838d;
import J8.a;
import J8.b;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import x8.C8958b;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LL8/c;", "", "LJ8/b;", "symmetricCryptor", "LJ8/a;", "asymmetricCryptor", "Lx8/b;", "libraryInterface", "<init>", "(LJ8/b;LJ8/a;Lx8/b;)V", "", "details", "b", "([B)[B", "Ly8/b;", "rawEvent", "a", "(Ly8/b;)Ly8/b;", "LJ8/b;", "LJ8/a;", "c", "Lx8/b;", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final b f38456a;

    /* renamed from: b  reason: collision with root package name */
    private final a f38457b;

    /* renamed from: c  reason: collision with root package name */
    private final C8958b f38458c;

    public c(b bVar, a aVar, C8958b bVar2) {
        C17542s.j(bVar, "symmetricCryptor");
        C17542s.j(aVar, "asymmetricCryptor");
        C17542s.j(bVar2, "libraryInterface");
        this.f38456a = bVar;
        this.f38457b = aVar;
        this.f38458c = bVar2;
    }

    private final byte[] b(byte[] bArr) {
        Charset charset = C15838d.f135279b;
        byte[] bytes = "…".getBytes(charset);
        C17542s.i(bytes, "this as java.lang.String).getBytes(charset)");
        if (Arrays.equals(bArr, bytes)) {
            return bArr;
        }
        byte[] bytes2 = "".getBytes(charset);
        C17542s.i(bytes2, "this as java.lang.String).getBytes(charset)");
        return Arrays.equals(bArr, bytes2) ? bArr : this.f38456a.a(bArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0059, code lost:
        r1 = (r1 = r1.b()).i();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final y8.C8993b a(y8.C8993b r37) {
        /*
            r36 = this;
            r0 = r36
            java.lang.String r1 = "rawEvent"
            r2 = r37
            kotlin.jvm.internal.C17542s.j(r2, r1)
            byte[] r1 = r37.p()
            byte[] r12 = r0.b(r1)
            byte[] r1 = r37.u()
            byte[] r14 = r0.b(r1)
            byte[] r1 = r37.d()
            byte[] r18 = r0.b(r1)
            byte[] r1 = r37.e()
            byte[] r19 = r0.b(r1)
            byte[] r1 = r37.o()
            byte[] r20 = r0.b(r1)
            J8.b r1 = r0.f38456a
            javax.crypto.spec.IvParameterSpec r1 = r1.e()
            byte[] r21 = r1.getIV()
            J8.a r1 = r0.f38457b
            J8.b r3 = r0.f38456a
            javax.crypto.spec.SecretKeySpec r3 = r3.f()
            byte[] r3 = r3.getEncoded()
            byte[] r22 = r1.a(r3)
            x8.b r1 = r0.f38458c
            A8.b r1 = r1.a()
            if (r1 == 0) goto L_0x0065
            com.contentsquare.android.core.features.config.model.JsonConfig$ProjectConfiguration r1 = r1.b()
            if (r1 == 0) goto L_0x0065
            java.lang.Integer r1 = r1.i()
            if (r1 == 0) goto L_0x0065
            int r1 = r1.intValue()
            long r3 = (long) r1
            goto L_0x0067
        L_0x0065:
            r3 = 0
        L_0x0067:
            java.lang.Long r23 = java.lang.Long.valueOf(r3)
            r34 = 268177087(0xffc0ebf, float:2.4854799E-29)
            r35 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r2 = r37
            y8.b r1 = y8.C8993b.b(r2, r3, r5, r6, r7, r8, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: L8.c.a(y8.b):y8.b");
    }
}
