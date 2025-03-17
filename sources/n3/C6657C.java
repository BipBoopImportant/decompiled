package N3;

import java.util.Collections;
import java.util.List;
import t3.B;
import t3.C5954e;
import u3.e;

/* renamed from: N3.C  reason: case insensitive filesystem */
public final class C6657C {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f38728a;

    /* renamed from: b  reason: collision with root package name */
    public final int f38729b;

    /* renamed from: c  reason: collision with root package name */
    public final int f38730c;

    /* renamed from: d  reason: collision with root package name */
    public final int f38731d;

    /* renamed from: e  reason: collision with root package name */
    public final int f38732e;

    /* renamed from: f  reason: collision with root package name */
    public final int f38733f;

    /* renamed from: g  reason: collision with root package name */
    public final int f38734g;

    /* renamed from: h  reason: collision with root package name */
    public final int f38735h;

    /* renamed from: i  reason: collision with root package name */
    public final int f38736i;

    /* renamed from: j  reason: collision with root package name */
    public final int f38737j;

    /* renamed from: k  reason: collision with root package name */
    public final float f38738k;

    /* renamed from: l  reason: collision with root package name */
    public final int f38739l;

    /* renamed from: m  reason: collision with root package name */
    public final String f38740m;

    /* renamed from: n  reason: collision with root package name */
    public final e.k f38741n;

    private C6657C(List<byte[]> list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, int i19, String str, e.k kVar) {
        this.f38728a = list;
        this.f38729b = i10;
        this.f38730c = i11;
        this.f38731d = i12;
        this.f38732e = i13;
        this.f38733f = i14;
        this.f38734g = i15;
        this.f38735h = i16;
        this.f38736i = i17;
        this.f38737j = i18;
        this.f38738k = f10;
        this.f38739l = i19;
        this.f38740m = str;
        this.f38741n = kVar;
    }

    public static C6657C a(B b10) {
        return b(b10, false, (e.k) null);
    }

    private static C6657C b(B b10, boolean z10, e.k kVar) {
        int i10;
        int i11;
        e.g q10;
        int i12;
        int i13;
        int i14;
        int i15;
        B b11 = b10;
        if (z10) {
            try {
                b11.X(4);
            } catch (ArrayIndexOutOfBoundsException e10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Error parsing");
                sb2.append(z10 ? "L-HEVC config" : "HEVC config");
                throw q3.B.a(sb2.toString(), e10);
            }
        } else {
            b11.X(21);
        }
        int H10 = b10.H() & 3;
        int H11 = b10.H();
        int f10 = b10.f();
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < H11; i18++) {
            b11.X(1);
            int P10 = b10.P();
            for (int i19 = 0; i19 < P10; i19++) {
                int P11 = b10.P();
                i17 += P11 + 4;
                b11.X(P11);
            }
        }
        b11.W(f10);
        byte[] bArr = new byte[i17];
        e.k kVar2 = kVar;
        int i20 = -1;
        int i21 = -1;
        int i22 = -1;
        int i23 = -1;
        int i24 = -1;
        int i25 = -1;
        int i26 = -1;
        int i27 = -1;
        int i28 = -1;
        float f11 = 1.0f;
        String str = null;
        int i29 = 0;
        int i30 = 0;
        while (i29 < H11) {
            int H12 = b10.H() & 63;
            int P12 = b10.P();
            int i31 = i16;
            e.k kVar3 = kVar2;
            while (i31 < P12) {
                int P13 = b10.P();
                byte[] bArr2 = e.f30076a;
                int i32 = H11;
                System.arraycopy(bArr2, i16, bArr, i30, bArr2.length);
                int length = i30 + bArr2.length;
                System.arraycopy(b10.e(), b10.f(), bArr, length, P13);
                if (H12 == 32 && i31 == 0) {
                    kVar3 = e.v(bArr, length, length + P13);
                    i11 = i16;
                    i10 = P12;
                } else if (H12 == 33 && i31 == 0) {
                    e.h r10 = e.r(bArr, length, length + P13, kVar3);
                    int i33 = r10.f30115g;
                    int i34 = r10.f30116h;
                    i22 = r10.f30112d + 8;
                    i23 = r10.f30113e + 8;
                    int i35 = r10.f30119k;
                    int i36 = r10.f30120l;
                    int i37 = r10.f30121m;
                    float f12 = r10.f30117i;
                    int i38 = r10.f30118j;
                    e.c cVar = r10.f30110b;
                    if (cVar != null) {
                        i15 = i38;
                        i14 = i35;
                        i10 = P12;
                        i13 = i33;
                        i12 = i34;
                        str = C5954e.f(cVar.f30085a, cVar.f30086b, cVar.f30087c, cVar.f30088d, cVar.f30089e, cVar.f30090f);
                    } else {
                        i15 = i38;
                        i14 = i35;
                        i10 = P12;
                        i13 = i33;
                        i12 = i34;
                    }
                    i20 = i13;
                    i21 = i12;
                    i11 = 0;
                    int i39 = i37;
                    i25 = i36;
                    i24 = i14;
                    i28 = i15;
                    f11 = f12;
                    i26 = i39;
                } else {
                    i10 = P12;
                    if (H12 != 39 || i31 != 0 || (q10 = e.q(bArr, length, length + P13)) == null || kVar3 == null) {
                        i11 = 0;
                    } else {
                        i11 = 0;
                        i27 = q10.f30103d == kVar3.f30128b.get(0).f30081b ? 4 : 5;
                    }
                }
                i30 = length + P13;
                b11.X(P13);
                i31++;
                P12 = i10;
                i16 = i11;
                H11 = i32;
            }
            int i40 = H11;
            int i41 = i16;
            i29++;
            kVar2 = kVar3;
        }
        return new C6657C(i17 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), H10 + 1, i20, i21, i22, i23, i24, i25, i26, i27, f11, i28, str, kVar2);
    }

    public static C6657C c(B b10, e.k kVar) {
        return b(b10, true, kVar);
    }
}
