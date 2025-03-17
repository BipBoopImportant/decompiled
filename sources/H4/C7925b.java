package h4;

import N3.C6656B;
import N3.C6657C;
import N3.C6662H;
import N3.C6663a;
import N3.C6664b;
import N3.C6665c;
import N3.C6666d;
import N3.C6676n;
import N3.C6680s;
import N3.S;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kb.C9967v;
import nb.C10076f;
import q3.C5798i;
import q3.C5803n;
import q3.C5807s;
import q3.z;
import t3.A;
import t3.B;
import t3.C5950a;
import t3.C5954e;
import t3.N;
import t3.q;
import u3.b;
import u3.e;

/* renamed from: h4.b  reason: case insensitive filesystem */
public final class C7925b {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f51431a = N.s0("OpusHead");

    /* renamed from: h4.b$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f51432a;

        /* renamed from: b  reason: collision with root package name */
        public int f51433b;

        /* renamed from: c  reason: collision with root package name */
        public int f51434c;

        /* renamed from: d  reason: collision with root package name */
        public long f51435d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f51436e;

        /* renamed from: f  reason: collision with root package name */
        private final B f51437f;

        /* renamed from: g  reason: collision with root package name */
        private final B f51438g;

        /* renamed from: h  reason: collision with root package name */
        private int f51439h;

        /* renamed from: i  reason: collision with root package name */
        private int f51440i;

        public a(B b10, B b11, boolean z10) {
            this.f51438g = b10;
            this.f51437f = b11;
            this.f51436e = z10;
            b11.W(12);
            this.f51432a = b11.L();
            b10.W(12);
            this.f51440i = b10.L();
            C6680s.a(b10.q() != 1 ? false : true, "first_chunk must be 1");
            this.f51433b = -1;
        }

        public boolean a() {
            int i10 = this.f51433b + 1;
            this.f51433b = i10;
            if (i10 == this.f51432a) {
                return false;
            }
            this.f51435d = this.f51436e ? this.f51437f.O() : this.f51437f.J();
            if (this.f51433b == this.f51439h) {
                this.f51434c = this.f51438g.L();
                this.f51438g.X(4);
                int i11 = this.f51440i - 1;
                this.f51440i = i11;
                this.f51439h = i11 > 0 ? this.f51438g.L() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: h4.b$b  reason: collision with other inner class name */
    private static final class C0848b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final String f51441a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f51442b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final long f51443c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final long f51444d;

        public C0848b(String str, byte[] bArr, long j10, long j11) {
            this.f51441a = str;
            this.f51442b = bArr;
            this.f51443c = j10;
            this.f51444d = j11;
        }
    }

    /* renamed from: h4.b$c */
    private static final class c {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final f f51445a;

        public c(f fVar) {
            this.f51445a = fVar;
        }
    }

    /* renamed from: h4.b$d */
    private static final class d {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final long f51446a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final long f51447b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final String f51448c;

        public d(long j10, long j11, String str) {
            this.f51446a = j10;
            this.f51447b = j11;
            this.f51448c = str;
        }
    }

    /* renamed from: h4.b$e */
    private interface e {
        int a();

        int b();

        int c();
    }

    /* renamed from: h4.b$f */
    private static final class f {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final boolean f51449a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final boolean f51450b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final boolean f51451c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f51452d;

        public f(boolean z10, boolean z11, boolean z12, boolean z13) {
            this.f51449a = z10;
            this.f51450b = z11;
            this.f51451c = z12;
            this.f51452d = z13;
        }
    }

    /* renamed from: h4.b$g */
    private static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final t[] f51453a;

        /* renamed from: b  reason: collision with root package name */
        public C5807s f51454b;

        /* renamed from: c  reason: collision with root package name */
        public int f51455c;

        /* renamed from: d  reason: collision with root package name */
        public int f51456d = 0;

        public g(int i10) {
            this.f51453a = new t[i10];
        }
    }

    /* renamed from: h4.b$h */
    static final class h implements e {

        /* renamed from: a  reason: collision with root package name */
        private final int f51457a;

        /* renamed from: b  reason: collision with root package name */
        private final int f51458b;

        /* renamed from: c  reason: collision with root package name */
        private final B f51459c;

        public h(b.c cVar, C5807s sVar) {
            B b10 = cVar.f30070b;
            this.f51459c = b10;
            b10.W(12);
            int L10 = b10.L();
            if ("audio/raw".equals(sVar.f28244o)) {
                int h02 = N.h0(sVar.f28221F, sVar.f28219D);
                if (L10 == 0 || L10 % h02 != 0) {
                    q.h("BoxParsers", "Audio sample size mismatch. stsd sample size: " + h02 + ", stsz sample size: " + L10);
                    L10 = h02;
                }
            }
            this.f51457a = L10 == 0 ? -1 : L10;
            this.f51458b = b10.L();
        }

        public int a() {
            int i10 = this.f51457a;
            return i10 == -1 ? this.f51459c.L() : i10;
        }

        public int b() {
            return this.f51457a;
        }

        public int c() {
            return this.f51458b;
        }
    }

    /* renamed from: h4.b$i */
    static final class i implements e {

        /* renamed from: a  reason: collision with root package name */
        private final B f51460a;

        /* renamed from: b  reason: collision with root package name */
        private final int f51461b;

        /* renamed from: c  reason: collision with root package name */
        private final int f51462c;

        /* renamed from: d  reason: collision with root package name */
        private int f51463d;

        /* renamed from: e  reason: collision with root package name */
        private int f51464e;

        public i(b.c cVar) {
            B b10 = cVar.f30070b;
            this.f51460a = b10;
            b10.W(12);
            this.f51462c = b10.L() & 255;
            this.f51461b = b10.L();
        }

        public int a() {
            int i10 = this.f51462c;
            if (i10 == 8) {
                return this.f51460a.H();
            }
            if (i10 == 16) {
                return this.f51460a.P();
            }
            int i11 = this.f51463d;
            this.f51463d = i11 + 1;
            if (i11 % 2 != 0) {
                return this.f51464e & 15;
            }
            int H10 = this.f51460a.H();
            this.f51464e = H10;
            return (H10 & 240) >> 4;
        }

        public int b() {
            return -1;
        }

        public int c() {
            return this.f51461b;
        }
    }

    /* renamed from: h4.b$j */
    private static final class j {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f51465a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final long f51466b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final int f51467c;

        public j(int i10, long j10, int i11) {
            this.f51465a = i10;
            this.f51466b = j10;
            this.f51467c = i11;
        }
    }

    /* renamed from: h4.b$k */
    static final class k {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final c f51468a;

        public k(c cVar) {
            this.f51468a = cVar;
        }

        public boolean b() {
            c cVar = this.f51468a;
            return cVar != null && cVar.f51445a.f51449a && this.f51468a.f51445a.f51450b;
        }
    }

    private static void A(B b10, int i10, int i11, int i12, int i13, String str, g gVar) {
        b10.W(i11 + 16);
        String str2 = "application/ttml+xml";
        C9967v vVar = null;
        long j10 = Long.MAX_VALUE;
        if (i10 != 1414810956) {
            if (i10 == 1954034535) {
                int i14 = i12 - 16;
                byte[] bArr = new byte[i14];
                b10.l(bArr, 0, i14);
                vVar = C9967v.F(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i10 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i10 == 1937010800) {
                j10 = 0;
            } else if (i10 == 1664495672) {
                gVar.f51456d = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                throw new IllegalStateException();
            }
        }
        gVar.f51454b = new C5807s.b().d0(i13).s0(str2).i0(str).w0(j10).f0(vVar).M();
    }

    private static j B(B b10) {
        long j10;
        int i10 = 8;
        b10.W(8);
        int m10 = m(b10.q());
        b10.X(m10 == 0 ? 8 : 16);
        int q10 = b10.q();
        b10.X(4);
        int f10 = b10.f();
        if (m10 == 0) {
            i10 = 4;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            j10 = -9223372036854775807L;
            if (i12 >= i10) {
                b10.X(i10);
                break;
            } else if (b10.e()[f10 + i12] != -1) {
                long J10 = m10 == 0 ? b10.J() : b10.O();
                if (J10 != 0) {
                    j10 = J10;
                }
            } else {
                i12++;
            }
        }
        b10.X(16);
        int q11 = b10.q();
        int q12 = b10.q();
        b10.X(4);
        int q13 = b10.q();
        int q14 = b10.q();
        if (q11 == 0 && q12 == 65536 && q13 == -65536 && q14 == 0) {
            i11 = 90;
        } else if (q11 == 0 && q12 == -65536 && q13 == 65536 && q14 == 0) {
            i11 = 270;
        } else if (q11 == -65536 && q12 == 0 && q13 == 0 && q14 == -65536) {
            i11 = 180;
        }
        return new j(q10, j10, i11);
    }

    public static s C(b.C0471b bVar, b.c cVar, long j10, C5803n nVar, boolean z10, boolean z11) {
        long j11;
        b.c cVar2;
        long[] jArr;
        long[] jArr2;
        b.C0471b d10;
        Pair<long[], long[]> i10;
        b.C0471b bVar2 = bVar;
        b.C0471b bVar3 = (b.C0471b) C5950a.e(bVar2.d(1835297121));
        int d11 = d(n(((b.c) C5950a.e(bVar3.e(1751411826))).f30070b));
        if (d11 == -1) {
            return null;
        }
        j B10 = B(((b.c) C5950a.e(bVar2.e(1953196132))).f30070b);
        long j12 = -9223372036854775807L;
        if (j10 == -9223372036854775807L) {
            cVar2 = cVar;
            j11 = B10.f51466b;
        } else {
            cVar2 = cVar;
            j11 = j10;
        }
        long j13 = s(cVar2.f30070b).f30075c;
        if (j11 != -9223372036854775807L) {
            j12 = N.Z0(j11, 1000000, j13);
        }
        long j14 = j12;
        d p10 = p(((b.c) C5950a.e(bVar3.e(1835296868))).f30070b);
        b.c e10 = ((b.C0471b) C5950a.e(((b.C0471b) C5950a.e(bVar3.d(1835626086))).d(1937007212))).e(1937011556);
        if (e10 != null) {
            g z12 = z(e10.f30070b, B10.f51465a, B10.f51467c, p10.f51448c, nVar, z11);
            if (z10 || (d10 = bVar2.d(1701082227)) == null || (i10 = i(d10)) == null) {
                jArr2 = null;
                jArr = null;
            } else {
                jArr = (long[]) i10.second;
                jArr2 = (long[]) i10.first;
            }
            if (z12.f51454b == null) {
                return null;
            }
            g gVar = z12;
            return new s(B10.f51465a, d11, p10.f51446a, j13, j14, p10.f51447b, z12.f51454b, z12.f51456d, gVar.f51453a, gVar.f51455c, jArr2, jArr);
        }
        throw q3.B.a("Malformed sample table (stbl) missing sample description (stsd)", (Throwable) null);
    }

    public static List<v> D(b.C0471b bVar, C6656B b10, long j10, C5803n nVar, boolean z10, boolean z11, jb.f<s, s> fVar) {
        b.C0471b bVar2 = bVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < bVar2.f30069d.size(); i10++) {
            b.C0471b bVar3 = bVar2.f30069d.get(i10);
            if (bVar3.f30066a != 1953653099) {
                C6656B b11 = b10;
                jb.f<s, s> fVar2 = fVar;
            } else {
                s apply = fVar.apply(C(bVar3, (b.c) C5950a.e(bVar.e(1836476516)), j10, nVar, z10, z11));
                if (apply == null) {
                    C6656B b12 = b10;
                } else {
                    C6656B b13 = b10;
                    arrayList.add(x(apply, (b.C0471b) C5950a.e(((b.C0471b) C5950a.e(((b.C0471b) C5950a.e(bVar3.d(1835297121))).d(1835626086))).d(1937007212)), b10));
                }
            }
        }
        return arrayList;
    }

    public static z E(b.c cVar) {
        B b10 = cVar.f30070b;
        b10.W(8);
        z zVar = new z(new z.b[0]);
        while (b10.a() >= 8) {
            int f10 = b10.f();
            int q10 = b10.q();
            int q11 = b10.q();
            if (q11 == 1835365473) {
                b10.W(f10);
                zVar = zVar.b(F(b10, f10 + q10));
            } else if (q11 == 1936553057) {
                b10.W(f10);
                zVar = zVar.b(q.b(b10, f10 + q10));
            } else if (q11 == -1451722374) {
                zVar = zVar.b(I(b10));
            }
            b10.W(f10 + q10);
        }
        return zVar;
    }

    private static z F(B b10, int i10) {
        b10.X(8);
        e(b10);
        while (b10.f() < i10) {
            int f10 = b10.f();
            int q10 = b10.q();
            if (b10.q() == 1768715124) {
                b10.W(f10);
                return o(b10, f10 + q10);
            }
            b10.W(f10 + q10);
        }
        return null;
    }

    static k G(B b10, int i10, int i11) {
        b10.W(i10 + 8);
        int f10 = b10.f();
        c cVar = null;
        while (f10 - i10 < i11) {
            b10.W(f10);
            int q10 = b10.q();
            C6680s.a(q10 > 0, "childAtomSize must be positive");
            if (b10.q() == 1702454643) {
                cVar = y(b10, f10, q10);
            }
            f10 += q10;
        }
        if (cVar == null) {
            return null;
        }
        return new k(cVar);
    }

    private static void H(B b10, int i10, int i11, int i12, int i13, int i14, C5803n nVar, g gVar, int i15) {
        String str;
        int i16;
        C5803n nVar2;
        int i17;
        int i18;
        int i19;
        float f10;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        C9967v<byte[]> vVar;
        int i25;
        int i26;
        List<byte[]> F10;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        String str2;
        B b11 = b10;
        int i33 = i11;
        int i34 = i12;
        C5803n nVar3 = nVar;
        g gVar2 = gVar;
        b11.W(i33 + 16);
        b11.X(16);
        int P10 = b10.P();
        int P11 = b10.P();
        b11.X(50);
        int f11 = b10.f();
        int i35 = i10;
        if (i35 == 1701733238) {
            Pair<Integer, t> v10 = v(b11, i33, i34);
            if (v10 != null) {
                i35 = ((Integer) v10.first).intValue();
                nVar3 = nVar3 == null ? null : nVar3.b(((t) v10.second).f51605b);
                gVar2.f51453a[i15] = (t) v10.second;
            }
            b11.W(f11);
        }
        String str3 = "video/3gpp";
        String str4 = i35 == 1831958048 ? "video/mpeg" : i35 == 1211250227 ? str3 : null;
        float f12 = 1.0f;
        int i36 = 8;
        int i37 = 8;
        List<byte[]> list = null;
        String str5 = null;
        byte[] bArr = null;
        int i38 = -1;
        int i39 = -1;
        int i40 = -1;
        int i41 = -1;
        int i42 = -1;
        ByteBuffer byteBuffer = null;
        C0848b bVar = null;
        e.k kVar = null;
        boolean z10 = false;
        while (f11 - i33 < i34) {
            b11.W(f11);
            int f13 = b10.f();
            int q10 = b10.q();
            if (q10 == 0) {
                str = str3;
                if (b10.f() - i33 == i34) {
                    break;
                }
            } else {
                str = str3;
            }
            C6680s.a(q10 > 0, "childAtomSize must be positive");
            int q11 = b10.q();
            if (q11 == 1635148611) {
                C6680s.a(str4 == null, (String) null);
                b11.W(f13 + 8);
                C6666d b12 = C6666d.b(b10);
                List<byte[]> list2 = b12.f38839a;
                gVar2.f51455c = b12.f38840b;
                if (!z10) {
                    f12 = b12.f38849k;
                }
                String str6 = b12.f38850l;
                int i43 = b12.f38848j;
                int i44 = b12.f38845g;
                nVar2 = nVar3;
                i16 = P11;
                i17 = i35;
                i39 = i43;
                i41 = b12.f38846h;
                i42 = b12.f38847i;
                i36 = b12.f38843e;
                list = list2;
                str2 = "video/avc";
                str5 = str6;
                i18 = i44;
                i37 = b12.f38844f;
            } else {
                if (q11 == 1752589123) {
                    C6680s.a(str4 == null, (String) null);
                    b11.W(f13 + 8);
                    C6657C a10 = C6657C.a(b10);
                    List<byte[]> list3 = a10.f38728a;
                    gVar2.f51455c = a10.f38729b;
                    if (!z10) {
                        f12 = a10.f38738k;
                    }
                    int i45 = a10.f38739l;
                    String str7 = a10.f38740m;
                    int i46 = a10.f38737j;
                    if (i46 != -1) {
                        i38 = i46;
                    }
                    int i47 = a10.f38734g;
                    int i48 = a10.f38735h;
                    F10 = list3;
                    int i49 = a10.f38736i;
                    int i50 = a10.f38732e;
                    int i51 = a10.f38733f;
                    kVar = a10.f38741n;
                    nVar2 = nVar3;
                    i28 = P11;
                    i29 = i35;
                    i30 = i48;
                    i27 = i49;
                    i36 = i50;
                    i39 = i45;
                    str4 = "video/hevc";
                    str5 = str7;
                    i18 = i47;
                    i37 = i51;
                } else {
                    nVar2 = nVar3;
                    if (q11 == 1818785347) {
                        C6680s.a("video/hevc".equals(str4), "lhvC must follow hvcC atom");
                        e.k kVar2 = kVar;
                        C6680s.a(kVar2 != null && kVar2.f30128b.size() >= 2, "must have at least two layers");
                        b11.W(f13 + 8);
                        C6657C c10 = C6657C.c(b11, (e.k) C5950a.e(kVar2));
                        C6680s.a(gVar2.f51455c == c10.f38729b, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                        int i52 = c10.f38734g;
                        i18 = i40;
                        if (i52 != -1) {
                            C6680s.a(i18 == i52, "colorSpace must be the same for both views");
                        }
                        int i53 = c10.f38735h;
                        int i54 = i41;
                        if (i53 != -1) {
                            C6680s.a(i54 == i53, "colorRange must be the same for both views");
                        }
                        int i55 = c10.f38736i;
                        if (i55 != -1) {
                            int i56 = i42;
                            i32 = i56;
                            C6680s.a(i56 == i55, "colorTransfer must be the same for both views");
                        } else {
                            i32 = i42;
                        }
                        C6680s.a(i36 == c10.f38732e, "bitdepthLuma must be the same for both views");
                        C6680s.a(i37 == c10.f38733f, "bitdepthChroma must be the same for both views");
                        C9967v<byte[]> vVar2 = list;
                        if (vVar2 != null) {
                            list = C9967v.t().j(vVar2).j(c10.f38728a).k();
                        } else {
                            list = vVar2;
                            C6680s.a(false, "initializationData must be already set from hvcC atom");
                        }
                        kVar = kVar2;
                        str2 = "video/mv-hevc";
                        i16 = P11;
                        i17 = i35;
                        i41 = i54;
                        i42 = i32;
                        str5 = c10.f38740m;
                    } else {
                        C9967v<byte[]> vVar3 = list;
                        i18 = i40;
                        int i57 = i41;
                        int i58 = i42;
                        e.k kVar3 = kVar;
                        if (q11 == 1986361461) {
                            k G10 = G(b11, f13, q10);
                            if (!(G10 == null || G10.f51468a == null)) {
                                if (kVar3 == null || kVar3.f30128b.size() < 2) {
                                    i31 = i38;
                                    if (i31 == -1) {
                                        i38 = G10.f51468a.f51445a.f51451c ? 5 : 4;
                                        kVar = kVar3;
                                        i28 = P11;
                                        i29 = i35;
                                        F10 = vVar3;
                                        i30 = i57;
                                        i27 = i58;
                                    }
                                    i38 = i31;
                                    kVar = kVar3;
                                    i28 = P11;
                                    i29 = i35;
                                    F10 = vVar3;
                                    i30 = i57;
                                    i27 = i58;
                                } else {
                                    C6680s.a(G10.b(), "both eye views must be marked as available");
                                    C6680s.a(!G10.f51468a.f51445a.f51451c, "for MV-HEVC, eye_views_reversed must be set to false");
                                }
                            }
                            i31 = i38;
                            i38 = i31;
                            kVar = kVar3;
                            i28 = P11;
                            i29 = i35;
                            F10 = vVar3;
                            i30 = i57;
                            i27 = i58;
                        } else {
                            int i59 = i38;
                            e.k kVar4 = kVar3;
                            if (q11 == 1685480259 || q11 == 1685485123) {
                                i20 = i59;
                                i19 = P11;
                                i23 = i35;
                                i22 = i37;
                                f10 = f12;
                                i21 = i36;
                                i24 = i58;
                                C6676n a11 = C6676n.a(b10);
                                if (a11 != null) {
                                    str4 = "video/dolby-vision";
                                    str5 = a11.f38919c;
                                }
                                i37 = i22;
                                i36 = i21;
                                vVar = vVar3;
                                i25 = i57;
                                f12 = f10;
                                i26 = i24;
                            } else {
                                if (q11 == 1987076931) {
                                    C6680s.a(str4 == null, (String) null);
                                    String str8 = i35 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                    b11.W(f13 + 12);
                                    byte H10 = (byte) b10.H();
                                    byte H11 = (byte) b10.H();
                                    int H12 = b10.H();
                                    i37 = H12 >> 4;
                                    byte b13 = (byte) ((H12 >> 1) & 7);
                                    if (str8.equals("video/x-vnd.on2.vp9")) {
                                        vVar3 = C5954e.h(H10, H11, (byte) i37, b13);
                                    }
                                    boolean z11 = (H12 & 1) != 0;
                                    int H13 = b10.H();
                                    int H14 = b10.H();
                                    int j10 = C5798i.j(H13);
                                    i41 = z11 ? 1 : 2;
                                    i42 = C5798i.k(H14);
                                    str4 = str8;
                                    i16 = P11;
                                    i36 = i37;
                                    kVar = kVar4;
                                    i18 = j10;
                                    list = vVar3;
                                    i38 = i59;
                                    i17 = i35;
                                } else if (q11 == 1635135811) {
                                    int i60 = q10 - 8;
                                    byte[] bArr2 = new byte[i60];
                                    b11.l(bArr2, 0, i60);
                                    F10 = C9967v.F(bArr2);
                                    b11.W(f13 + 8);
                                    C5798i g10 = g(b10);
                                    int i61 = g10.f28146e;
                                    int i62 = g10.f28147f;
                                    int i63 = g10.f28142a;
                                    int i64 = g10.f28143b;
                                    i27 = g10.f28144c;
                                    i28 = P11;
                                    i29 = i35;
                                    i30 = i64;
                                    str4 = "video/av01";
                                    kVar = kVar4;
                                    i36 = i61;
                                    i38 = i59;
                                    i37 = i62;
                                    i18 = i63;
                                } else if (q11 == 1668050025) {
                                    if (byteBuffer == null) {
                                        byteBuffer = a();
                                    }
                                    ByteBuffer byteBuffer2 = byteBuffer;
                                    byteBuffer2.position(21);
                                    byteBuffer2.putShort(b10.D());
                                    byteBuffer2.putShort(b10.D());
                                    byteBuffer = byteBuffer2;
                                    i16 = P11;
                                    i17 = i35;
                                    kVar = kVar4;
                                    list = vVar3;
                                    i41 = i57;
                                    i42 = i58;
                                    i38 = i59;
                                } else if (q11 == 1835295606) {
                                    if (byteBuffer == null) {
                                        byteBuffer = a();
                                    }
                                    ByteBuffer byteBuffer3 = byteBuffer;
                                    short D10 = b10.D();
                                    short D11 = b10.D();
                                    i23 = i35;
                                    short D12 = b10.D();
                                    short D13 = b10.D();
                                    int i65 = i37;
                                    short D14 = b10.D();
                                    int i66 = i36;
                                    short D15 = b10.D();
                                    i20 = i59;
                                    short D16 = b10.D();
                                    float f14 = f12;
                                    short D17 = b10.D();
                                    long J10 = b10.J();
                                    long J11 = b10.J();
                                    i19 = P11;
                                    byteBuffer3.position(1);
                                    byteBuffer3.putShort(D14);
                                    byteBuffer3.putShort(D15);
                                    byteBuffer3.putShort(D10);
                                    byteBuffer3.putShort(D11);
                                    byteBuffer3.putShort(D12);
                                    byteBuffer3.putShort(D13);
                                    byteBuffer3.putShort(D16);
                                    byteBuffer3.putShort(D17);
                                    byteBuffer3.putShort((short) ((int) (J10 / 10000)));
                                    byteBuffer3.putShort((short) ((int) (J11 / 10000)));
                                    byteBuffer = byteBuffer3;
                                    i37 = i65;
                                    i36 = i66;
                                    vVar = vVar3;
                                    i25 = i57;
                                    i26 = i58;
                                    f12 = f14;
                                } else {
                                    i20 = i59;
                                    i19 = P11;
                                    i23 = i35;
                                    i22 = i37;
                                    f10 = f12;
                                    i21 = i36;
                                    if (q11 == 1681012275) {
                                        C6680s.a(str4 == null, (String) null);
                                        str4 = str;
                                    } else if (q11 == 1702061171) {
                                        C6680s.a(str4 == null, (String) null);
                                        bVar = j(b11, f13);
                                        String d10 = bVar.f51441a;
                                        byte[] a12 = bVar.f51442b;
                                        vVar = a12 != null ? C9967v.F(a12) : vVar3;
                                        str4 = d10;
                                        i37 = i22;
                                        i36 = i21;
                                        i25 = i57;
                                        i26 = i58;
                                        f12 = f10;
                                    } else if (q11 == 1885434736) {
                                        f12 = t(b11, f13);
                                        i37 = i22;
                                        i36 = i21;
                                        vVar = vVar3;
                                        i25 = i57;
                                        i26 = i58;
                                        z10 = true;
                                    } else if (q11 == 1937126244) {
                                        bArr = u(b11, f13, q10);
                                    } else if (q11 == 1936995172) {
                                        int H15 = b10.H();
                                        b11.X(3);
                                        if (H15 == 0) {
                                            int H16 = b10.H();
                                            if (H16 == 0) {
                                                i20 = 0;
                                            } else if (H16 == 1) {
                                                i20 = 1;
                                            } else if (H16 == 2) {
                                                i20 = 2;
                                            } else if (H16 == 3) {
                                                i20 = 3;
                                            }
                                        }
                                    } else {
                                        if (q11 == 1668246642) {
                                            i24 = i58;
                                            if (i18 == -1 && i24 == -1) {
                                                int q12 = b10.q();
                                                if (q12 == 1852009592 || q12 == 1852009571) {
                                                    int P12 = b10.P();
                                                    int P13 = b10.P();
                                                    int i67 = 2;
                                                    b11.X(2);
                                                    boolean z12 = q10 == 19 && (b10.H() & 128) != 0;
                                                    int j11 = C5798i.j(P12);
                                                    if (z12) {
                                                        i67 = 1;
                                                    }
                                                    i18 = j11;
                                                    i37 = i22;
                                                    i36 = i21;
                                                    vVar = vVar3;
                                                    f12 = f10;
                                                    i26 = C5798i.k(P13);
                                                    i25 = i67;
                                                } else {
                                                    q.h("BoxParsers", "Unsupported color type: " + b.a(q12));
                                                }
                                            }
                                        } else {
                                            i24 = i58;
                                        }
                                        i37 = i22;
                                        i36 = i21;
                                        vVar = vVar3;
                                        i25 = i57;
                                        f12 = f10;
                                        i26 = i24;
                                    }
                                    i37 = i22;
                                    i36 = i21;
                                    vVar = vVar3;
                                    i25 = i57;
                                    i26 = i58;
                                    f12 = f10;
                                }
                                f11 += q10;
                                i33 = i11;
                                i34 = i12;
                                gVar2 = gVar;
                                i35 = i17;
                                nVar3 = nVar2;
                                P11 = i16;
                                i40 = i18;
                                str3 = str;
                            }
                            int i68 = i20;
                            kVar = kVar4;
                            i38 = i68;
                            f11 += q10;
                            i33 = i11;
                            i34 = i12;
                            gVar2 = gVar;
                            i35 = i17;
                            nVar3 = nVar2;
                            P11 = i16;
                            i40 = i18;
                            str3 = str;
                        }
                    }
                }
                f11 += q10;
                i33 = i11;
                i34 = i12;
                gVar2 = gVar;
                i35 = i17;
                nVar3 = nVar2;
                P11 = i16;
                i40 = i18;
                str3 = str;
            }
            f11 += q10;
            i33 = i11;
            i34 = i12;
            gVar2 = gVar;
            i35 = i17;
            nVar3 = nVar2;
            P11 = i16;
            i40 = i18;
            str3 = str;
        }
        C5803n nVar4 = nVar3;
        int i69 = P11;
        float f15 = f12;
        C9967v<byte[]> vVar4 = list;
        int i70 = i38;
        int i71 = i40;
        int i72 = i41;
        int i73 = i42;
        int i74 = i37;
        int i75 = i36;
        if (str4 != null) {
            C5807s.b S10 = new C5807s.b().d0(i13).s0(str4).R(str5).x0(P10).c0(i69).o0(f15).r0(i14).p0(bArr).v0(i70).f0(vVar4).k0(i39).X(nVar4).S(new C5798i.b().d(i71).c(i72).e(i73).f(byteBuffer != null ? byteBuffer.array() : null).g(i75).b(i74).a());
            if (bVar != null) {
                S10.P(C10076f.k(bVar.f51443c)).n0(C10076f.k(bVar.f51444d));
            }
            gVar.f51454b = S10.M();
        }
    }

    private static z I(B b10) {
        short D10 = b10.D();
        b10.X(2);
        String E10 = b10.E(D10);
        int max = Math.max(E10.lastIndexOf(43), E10.lastIndexOf(45));
        try {
            return new z(new u3.c(Float.parseFloat(E10.substring(0, max)), Float.parseFloat(E10.substring(max, E10.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean b(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        return jArr[0] <= j11 && j11 < jArr[N.p(4, 0, length)] && jArr[N.p(jArr.length - 4, 0, length)] < j12 && j12 <= j10;
    }

    private static int c(B b10, int i10, int i11, int i12) {
        int f10 = b10.f();
        C6680s.a(f10 >= i11, (String) null);
        while (f10 - i11 < i12) {
            b10.W(f10);
            int q10 = b10.q();
            C6680s.a(q10 > 0, "childAtomSize must be positive");
            if (b10.q() == i10) {
                return f10;
            }
            f10 += q10;
        }
        return -1;
    }

    private static int d(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    public static void e(B b10) {
        int f10 = b10.f();
        b10.X(4);
        if (b10.q() != 1751411826) {
            f10 += 4;
        }
        b10.W(f10);
    }

    private static void f(B b10, int i10, int i11, int i12, int i13, String str, boolean z10, C5803n nVar, g gVar, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        String str2;
        String str3;
        B b11 = b10;
        int i20 = i10;
        int i21 = i11;
        int i22 = i12;
        int i23 = i13;
        String str4 = str;
        C5803n nVar2 = nVar;
        g gVar2 = gVar;
        b11.W(i21 + 16);
        if (z10) {
            i15 = b10.P();
            b11.X(6);
        } else {
            b11.X(8);
            i15 = 0;
        }
        if (i15 == 0 || i15 == 1) {
            i17 = b10.P();
            b11.X(6);
            i19 = b10.I();
            b11.W(b10.f() - 4);
            i18 = b10.q();
            if (i15 == 1) {
                b11.X(16);
            }
            i16 = -1;
        } else if (i15 == 2) {
            b11.X(16);
            i19 = (int) Math.round(b10.o());
            i17 = b10.L();
            b11.X(4);
            int L10 = b10.L();
            int L11 = b10.L();
            boolean z11 = (L11 & 1) != 0;
            boolean z12 = (L11 & 2) != 0;
            if (!z11) {
                if (L10 == 8) {
                    i16 = 3;
                } else if (L10 == 16) {
                    i16 = z12 ? 268435456 : 2;
                } else if (L10 == 24) {
                    i16 = z12 ? 1342177280 : 21;
                } else if (L10 == 32) {
                    i16 = z12 ? 1610612736 : 22;
                }
                b11.X(8);
                i18 = 0;
            } else if (L10 == 32) {
                i16 = 4;
                b11.X(8);
                i18 = 0;
            }
            i16 = -1;
            b11.X(8);
            i18 = 0;
        } else {
            return;
        }
        if (i20 == 1767992678) {
            i19 = -1;
            i17 = -1;
        }
        int f10 = b10.f();
        if (i20 == 1701733217) {
            Pair<Integer, t> v10 = v(b11, i21, i22);
            if (v10 != null) {
                i20 = ((Integer) v10.first).intValue();
                nVar2 = nVar2 == null ? null : nVar2.b(((t) v10.second).f51605b);
                gVar2.f51453a[i14] = (t) v10.second;
            }
            b11.W(f10);
        }
        String str5 = "audio/mhm1";
        if (i20 == 1633889587) {
            str2 = "audio/ac3";
        } else if (i20 == 1700998451) {
            str2 = "audio/eac3";
        } else if (i20 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i20 == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (i20 == 1685353320 || i20 == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (i20 == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (i20 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i20 == 1935764850) {
            str2 = "audio/3gpp";
        } else if (i20 == 1935767394) {
            str2 = "audio/amr-wb";
        } else {
            if (i20 != 1936684916) {
                if (i20 == 1953984371) {
                    str2 = "audio/raw";
                    i16 = 268435456;
                } else if (i20 != 1819304813) {
                    str2 = (i20 == 778924082 || i20 == 778924083) ? "audio/mpeg" : i20 == 1835557169 ? "audio/mha1" : i20 == 1835560241 ? str5 : i20 == 1634492771 ? "audio/alac" : i20 == 1634492791 ? "audio/g711-alaw" : i20 == 1970037111 ? "audio/g711-mlaw" : i20 == 1332770163 ? "audio/opus" : i20 == 1716281667 ? "audio/flac" : i20 == 1835823201 ? "audio/true-hd" : i20 == 1767992678 ? "audio/iamf" : null;
                } else if (i16 != -1) {
                    str2 = "audio/raw";
                }
            }
            str2 = "audio/raw";
            i16 = 2;
        }
        int i24 = i16;
        String str6 = null;
        List list = null;
        C0848b bVar = null;
        while (f10 - i21 < i22) {
            b11.W(f10);
            int q10 = b10.q();
            C6680s.a(q10 > 0, "childAtomSize must be positive");
            int q11 = b10.q();
            if (q11 == 1835557187) {
                b11.W(f10 + 8);
                b11.X(1);
                int H10 = b10.H();
                b11.X(1);
                str6 = Objects.equals(str2, str5) ? String.format("mhm1.%02X", new Object[]{Integer.valueOf(H10)}) : String.format("mha1.%02X", new Object[]{Integer.valueOf(H10)});
                int P10 = b10.P();
                byte[] bArr = new byte[P10];
                str3 = str5;
                b11.l(bArr, 0, P10);
                list = list == null ? C9967v.F(bArr) : C9967v.G(bArr, (byte[]) list.get(0));
            } else {
                str3 = str5;
                if (q11 == 1835557200) {
                    b11.W(f10 + 8);
                    int H11 = b10.H();
                    if (H11 > 0) {
                        byte[] bArr2 = new byte[H11];
                        b11.l(bArr2, 0, H11);
                        list = list == null ? C9967v.F(bArr2) : C9967v.G((byte[]) list.get(0), bArr2);
                    }
                } else if (q11 == 1702061171 || (z10 && q11 == 2002876005)) {
                    int c10 = q11 == 1702061171 ? f10 : c(b11, 1702061171, f10, q10);
                    if (c10 != -1) {
                        bVar = j(b11, c10);
                        str2 = bVar.f51441a;
                        byte[] a10 = bVar.f51442b;
                        if (a10 != null) {
                            if ("audio/vorbis".equals(str2)) {
                                list = S.e(a10);
                            } else {
                                if ("audio/mp4a-latm".equals(str2)) {
                                    C6663a.b e10 = C6663a.e(a10);
                                    int i25 = e10.f38811a;
                                    int i26 = e10.f38812b;
                                    str6 = e10.f38813c;
                                    i19 = i25;
                                    i17 = i26;
                                }
                                list = C9967v.F(a10);
                            }
                        }
                    }
                    f10 += q10;
                    i21 = i11;
                    i22 = i12;
                    str5 = str3;
                } else {
                    if (q11 == 1684103987) {
                        b11.W(f10 + 8);
                        gVar2.f51454b = C6664b.d(b11, Integer.toString(i13), str4, nVar2);
                    } else if (q11 == 1684366131) {
                        b11.W(f10 + 8);
                        gVar2.f51454b = C6664b.h(b11, Integer.toString(i13), str4, nVar2);
                    } else if (q11 == 1684103988) {
                        b11.W(f10 + 8);
                        gVar2.f51454b = C6665c.d(b11, Integer.toString(i13), str4, nVar2);
                    } else if (q11 == 1684892784) {
                        if (i18 > 0) {
                            i19 = i18;
                            i17 = 2;
                            f10 += q10;
                            i21 = i11;
                            i22 = i12;
                            str5 = str3;
                        } else {
                            throw q3.B.a("Invalid sample rate for Dolby TrueHD MLP stream: " + i18, (Throwable) null);
                        }
                    } else if (q11 == 1684305011 || q11 == 1969517683) {
                        gVar2.f51454b = new C5807s.b().d0(i23).s0(str2).Q(i17).t0(i19).X(nVar2).i0(str4).M();
                        f10 += q10;
                        i21 = i11;
                        i22 = i12;
                        str5 = str3;
                    } else if (q11 == 1682927731) {
                        int i27 = q10 - 8;
                        byte[] bArr3 = f51431a;
                        byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + i27);
                        b11.W(f10 + 8);
                        b11.l(copyOf, bArr3.length, i27);
                        list = C6662H.a(copyOf);
                    } else if (q11 == 1684425825) {
                        byte[] bArr4 = new byte[(q10 - 8)];
                        bArr4[0] = 102;
                        bArr4[1] = 76;
                        bArr4[2] = 97;
                        bArr4[3] = 67;
                        b11.W(f10 + 12);
                        b11.l(bArr4, 4, q10 - 12);
                        list = C9967v.F(bArr4);
                        f10 += q10;
                        i21 = i11;
                        i22 = i12;
                        str5 = str3;
                    } else {
                        if (q11 == 1634492771) {
                            int i28 = q10 - 12;
                            byte[] bArr5 = new byte[i28];
                            b11.W(f10 + 12);
                            b11.l(bArr5, 0, i28);
                            Pair<Integer, Integer> u10 = C5954e.u(bArr5);
                            int intValue = ((Integer) u10.first).intValue();
                            int intValue2 = ((Integer) u10.second).intValue();
                            list = C9967v.F(bArr5);
                            i19 = intValue;
                            i17 = intValue2;
                        } else if (q11 == 1767990114) {
                            b11.W(f10 + 9);
                            int M10 = b10.M();
                            byte[] bArr6 = new byte[M10];
                            b11.l(bArr6, 0, M10);
                            list = C9967v.F(bArr6);
                        }
                        f10 += q10;
                        i21 = i11;
                        i22 = i12;
                        str5 = str3;
                    }
                    f10 += q10;
                    i21 = i11;
                    i22 = i12;
                    str5 = str3;
                }
            }
            f10 += q10;
            i21 = i11;
            i22 = i12;
            str5 = str3;
        }
        if (gVar2.f51454b == null && str2 != null) {
            C5807s.b i02 = new C5807s.b().d0(i23).s0(str2).R(str6).Q(i17).t0(i19).m0(i24).f0(list).X(nVar2).i0(str4);
            if (bVar != null) {
                i02.P(C10076f.k(bVar.f51443c)).n0(C10076f.k(bVar.f51444d));
            }
            gVar2.f51454b = i02.M();
        }
    }

    private static C5798i g(B b10) {
        C5798i.b bVar = new C5798i.b();
        A a10 = new A(b10.e());
        a10.p(b10.f() * 8);
        int i10 = 1;
        a10.s(1);
        int h10 = a10.h(3);
        a10.r(6);
        boolean g10 = a10.g();
        boolean g11 = a10.g();
        int i11 = 10;
        if (h10 == 2 && g10) {
            bVar.g(g11 ? 12 : 10);
            if (g11) {
                i11 = 12;
            }
            bVar.b(i11);
        } else if (h10 <= 2) {
            bVar.g(g10 ? 10 : 8);
            if (!g10) {
                i11 = 8;
            }
            bVar.b(i11);
        }
        a10.r(13);
        a10.q();
        int h11 = a10.h(4);
        if (h11 != 1) {
            q.f("BoxParsers", "Unsupported obu_type: " + h11);
            return bVar.a();
        } else if (a10.g()) {
            q.f("BoxParsers", "Unsupported obu_extension_flag");
            return bVar.a();
        } else {
            boolean g12 = a10.g();
            a10.q();
            if (!g12 || a10.h(8) <= 127) {
                int h12 = a10.h(3);
                a10.q();
                if (a10.g()) {
                    q.f("BoxParsers", "Unsupported reduced_still_picture_header");
                    return bVar.a();
                } else if (a10.g()) {
                    q.f("BoxParsers", "Unsupported timing_info_present_flag");
                    return bVar.a();
                } else if (a10.g()) {
                    q.f("BoxParsers", "Unsupported initial_display_delay_present_flag");
                    return bVar.a();
                } else {
                    int h13 = a10.h(5);
                    boolean z10 = false;
                    for (int i12 = 0; i12 <= h13; i12++) {
                        a10.r(12);
                        if (a10.h(5) > 7) {
                            a10.q();
                        }
                    }
                    int h14 = a10.h(4);
                    int h15 = a10.h(4);
                    a10.r(h14 + 1);
                    a10.r(h15 + 1);
                    if (a10.g()) {
                        a10.r(7);
                    }
                    a10.r(7);
                    boolean g13 = a10.g();
                    if (g13) {
                        a10.r(2);
                    }
                    if ((a10.g() ? 2 : a10.h(1)) > 0 && !a10.g()) {
                        a10.r(1);
                    }
                    if (g13) {
                        a10.r(3);
                    }
                    a10.r(3);
                    boolean g14 = a10.g();
                    if (h12 == 2 && g14) {
                        a10.q();
                    }
                    if (h12 != 1 && a10.g()) {
                        z10 = true;
                    }
                    if (a10.g()) {
                        int h16 = a10.h(8);
                        int h17 = a10.h(8);
                        int h18 = (!z10 && h16 == 1 && h17 == 13 && a10.h(8) == 0) ? 1 : a10.h(1);
                        C5798i.b d10 = bVar.d(C5798i.j(h16));
                        if (h18 != 1) {
                            i10 = 2;
                        }
                        d10.c(i10).e(C5798i.k(h17));
                    }
                    return bVar.a();
                }
            } else {
                q.f("BoxParsers", "Excessive obu_size");
                return bVar.a();
            }
        }
    }

    static Pair<Integer, t> h(B b10, int i10, int i11) {
        int i12 = i10 + 8;
        boolean z10 = false;
        int i13 = -1;
        int i14 = 0;
        String str = null;
        Integer num = null;
        while (i12 - i10 < i11) {
            b10.W(i12);
            int q10 = b10.q();
            int q11 = b10.q();
            if (q11 == 1718775137) {
                num = Integer.valueOf(b10.q());
            } else if (q11 == 1935894637) {
                b10.X(4);
                str = b10.E(4);
            } else if (q11 == 1935894633) {
                i13 = i12;
                i14 = q10;
            }
            i12 += q10;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        C6680s.a(num != null, "frma atom is mandatory");
        C6680s.a(i13 != -1, "schi atom is mandatory");
        t w10 = w(b10, i13, i14, str);
        if (w10 != null) {
            z10 = true;
        }
        C6680s.a(z10, "tenc atom is mandatory");
        return Pair.create(num, (t) N.i(w10));
    }

    private static Pair<long[], long[]> i(b.C0471b bVar) {
        b.c e10 = bVar.e(1701606260);
        if (e10 == null) {
            return null;
        }
        B b10 = e10.f30070b;
        b10.W(8);
        int m10 = m(b10.q());
        int L10 = b10.L();
        long[] jArr = new long[L10];
        long[] jArr2 = new long[L10];
        int i10 = 0;
        while (i10 < L10) {
            jArr[i10] = m10 == 1 ? b10.O() : b10.J();
            jArr2[i10] = m10 == 1 ? b10.A() : (long) b10.q();
            if (b10.D() == 1) {
                b10.X(2);
                i10++;
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    private static C0848b j(B b10, int i10) {
        b10.W(i10 + 12);
        b10.X(1);
        k(b10);
        b10.X(2);
        int H10 = b10.H();
        if ((H10 & 128) != 0) {
            b10.X(2);
        }
        if ((H10 & 64) != 0) {
            b10.X(b10.H());
        }
        if ((H10 & 32) != 0) {
            b10.X(2);
        }
        b10.X(1);
        k(b10);
        String h10 = q3.A.h(b10.H());
        if ("audio/mpeg".equals(h10) || "audio/vnd.dts".equals(h10) || "audio/vnd.dts.hd".equals(h10)) {
            return new C0848b(h10, (byte[]) null, -1, -1);
        }
        b10.X(4);
        long J10 = b10.J();
        long J11 = b10.J();
        b10.X(1);
        int k10 = k(b10);
        byte[] bArr = new byte[k10];
        b10.l(bArr, 0, k10);
        return new C0848b(h10, bArr, J11 > 0 ? J11 : -1, J10 > 0 ? J10 : -1);
    }

    private static int k(B b10) {
        int H10 = b10.H();
        int i10 = H10 & 127;
        while ((H10 & 128) == 128) {
            H10 = b10.H();
            i10 = (i10 << 7) | (H10 & 127);
        }
        return i10;
    }

    public static int l(int i10) {
        return i10 & 16777215;
    }

    public static int m(int i10) {
        return (i10 >> 24) & 255;
    }

    private static int n(B b10) {
        b10.W(16);
        return b10.q();
    }

    private static z o(B b10, int i10) {
        b10.X(8);
        ArrayList arrayList = new ArrayList();
        while (b10.f() < i10) {
            z.b d10 = j.d(b10);
            if (d10 != null) {
                arrayList.add(d10);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new z((List<? extends z.b>) arrayList);
    }

    private static d p(B b10) {
        long j10;
        int i10 = 8;
        b10.W(8);
        int m10 = m(b10.q());
        b10.X(m10 == 0 ? 8 : 16);
        long J10 = b10.J();
        int f10 = b10.f();
        if (m10 == 0) {
            i10 = 4;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                b10.X(i10);
                break;
            } else if (b10.e()[f10 + i11] != -1) {
                long J11 = m10 == 0 ? b10.J() : b10.O();
                if (J11 != 0) {
                    j10 = N.Z0(J11, 1000000, J10);
                }
            } else {
                i11++;
            }
        }
        j10 = -9223372036854775807L;
        int P10 = b10.P();
        return new d(J10, j10, "" + ((char) (((P10 >> 10) & 31) + 96)) + ((char) (((P10 >> 5) & 31) + 96)) + ((char) ((P10 & 31) + 96)));
    }

    public static z q(b.C0471b bVar) {
        b.c e10 = bVar.e(1751411826);
        b.c e11 = bVar.e(1801812339);
        b.c e12 = bVar.e(1768715124);
        if (e10 == null || e11 == null || e12 == null || n(e10.f30070b) != 1835299937) {
            return null;
        }
        B b10 = e11.f30070b;
        b10.W(12);
        int q10 = b10.q();
        String[] strArr = new String[q10];
        for (int i10 = 0; i10 < q10; i10++) {
            int q11 = b10.q();
            b10.X(4);
            strArr[i10] = b10.E(q11 - 8);
        }
        B b11 = e12.f30070b;
        b11.W(8);
        ArrayList arrayList = new ArrayList();
        while (b11.a() > 8) {
            int f10 = b11.f();
            int q12 = b11.q();
            int q13 = b11.q() - 1;
            if (q13 < 0 || q13 >= q10) {
                q.h("BoxParsers", "Skipped metadata with unknown key index: " + q13);
            } else {
                u3.a i11 = j.i(b11, f10 + q12, strArr[q13]);
                if (i11 != null) {
                    arrayList.add(i11);
                }
            }
            b11.W(f10 + q12);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new z((List<? extends z.b>) arrayList);
    }

    private static void r(B b10, int i10, int i11, int i12, g gVar) {
        b10.W(i11 + 16);
        if (i10 == 1835365492) {
            b10.B();
            String B10 = b10.B();
            if (B10 != null) {
                gVar.f51454b = new C5807s.b().d0(i12).s0(B10).M();
            }
        }
    }

    public static u3.d s(B b10) {
        long A10;
        long A11;
        b10.W(8);
        if (m(b10.q()) == 0) {
            A10 = b10.J();
            A11 = b10.J();
        } else {
            A10 = b10.A();
            A11 = b10.A();
        }
        return new u3.d(A10, A11, b10.J());
    }

    private static float t(B b10, int i10) {
        b10.W(i10 + 8);
        return ((float) b10.L()) / ((float) b10.L());
    }

    private static byte[] u(B b10, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            b10.W(i12);
            int q10 = b10.q();
            if (b10.q() == 1886547818) {
                return Arrays.copyOfRange(b10.e(), i12, q10 + i12);
            }
            i12 += q10;
        }
        return null;
    }

    private static Pair<Integer, t> v(B b10, int i10, int i11) {
        Pair<Integer, t> h10;
        int f10 = b10.f();
        while (f10 - i10 < i11) {
            b10.W(f10);
            int q10 = b10.q();
            C6680s.a(q10 > 0, "childAtomSize must be positive");
            if (b10.q() == 1936289382 && (h10 = h(b10, f10, q10)) != null) {
                return h10;
            }
            f10 += q10;
        }
        return null;
    }

    private static t w(B b10, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            b10.W(i14);
            int q10 = b10.q();
            if (b10.q() == 1952804451) {
                int m10 = m(b10.q());
                b10.X(1);
                if (m10 == 0) {
                    b10.X(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int H10 = b10.H();
                    i12 = H10 & 15;
                    i13 = (H10 & 240) >> 4;
                }
                boolean z10 = b10.H() == 1;
                int H11 = b10.H();
                byte[] bArr2 = new byte[16];
                b10.l(bArr2, 0, 16);
                if (z10 && H11 == 0) {
                    int H12 = b10.H();
                    bArr = new byte[H12];
                    b10.l(bArr, 0, H12);
                }
                return new t(z10, str, H11, bArr2, i13, i12, bArr);
            }
            i14 += q10;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static h4.v x(h4.s r39, u3.b.C0471b r40, N3.C6656B r41) {
        /*
            r1 = r39
            r0 = r40
            r2 = r41
            r3 = 1937011578(0x7374737a, float:1.936741E31)
            u3.b$c r3 = r0.e(r3)
            if (r3 == 0) goto L_0x0017
            h4.b$h r5 = new h4.b$h
            q3.s r6 = r1.f51598g
            r5.<init>(r3, r6)
            goto L_0x0025
        L_0x0017:
            r3 = 1937013298(0x73747a32, float:1.9369489E31)
            u3.b$c r3 = r0.e(r3)
            if (r3 == 0) goto L_0x0576
            h4.b$i r5 = new h4.b$i
            r5.<init>(r3)
        L_0x0025:
            int r3 = r5.c()
            r6 = 0
            if (r3 != 0) goto L_0x0040
            h4.v r9 = new h4.v
            long[] r2 = new long[r6]
            int[] r3 = new int[r6]
            long[] r5 = new long[r6]
            int[] r6 = new int[r6]
            r7 = 0
            r4 = 0
            r0 = r9
            r1 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0040:
            int r7 = r1.f51593b
            r8 = 2
            r9 = 0
            if (r7 != r8) goto L_0x0066
            long r11 = r1.f51597f
            int r7 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x0066
            float r7 = (float) r3
            float r11 = (float) r11
            r12 = 1232348160(0x49742400, float:1000000.0)
            float r11 = r11 / r12
            float r7 = r7 / r11
            q3.s r11 = r1.f51598g
            q3.s$b r11 = r11.b()
            q3.s$b r7 = r11.a0(r7)
            q3.s r7 = r7.M()
            h4.s r1 = r1.a(r7)
        L_0x0066:
            r12 = r1
            r1 = 1937007471(0x7374636f, float:1.9362445E31)
            u3.b$c r1 = r0.e(r1)
            r7 = 1
            if (r1 != 0) goto L_0x0080
            r1 = 1668232756(0x636f3634, float:4.4126776E21)
            u3.b$c r1 = r0.e(r1)
            java.lang.Object r1 = t3.C5950a.e(r1)
            u3.b$c r1 = (u3.b.c) r1
            r11 = r7
            goto L_0x0081
        L_0x0080:
            r11 = r6
        L_0x0081:
            t3.B r1 = r1.f30070b
            r13 = 1937011555(0x73747363, float:1.9367382E31)
            u3.b$c r13 = r0.e(r13)
            java.lang.Object r13 = t3.C5950a.e(r13)
            u3.b$c r13 = (u3.b.c) r13
            t3.B r13 = r13.f30070b
            r14 = 1937011827(0x73747473, float:1.9367711E31)
            u3.b$c r14 = r0.e(r14)
            java.lang.Object r14 = t3.C5950a.e(r14)
            u3.b$c r14 = (u3.b.c) r14
            t3.B r14 = r14.f30070b
            r15 = 1937011571(0x73747373, float:1.9367401E31)
            u3.b$c r15 = r0.e(r15)
            if (r15 == 0) goto L_0x00ad
            t3.B r15 = r15.f30070b
            goto L_0x00ae
        L_0x00ad:
            r15 = 0
        L_0x00ae:
            r4 = 1668576371(0x63747473, float:4.5093966E21)
            u3.b$c r0 = r0.e(r4)
            if (r0 == 0) goto L_0x00ba
            t3.B r0 = r0.f30070b
            goto L_0x00bb
        L_0x00ba:
            r0 = 0
        L_0x00bb:
            h4.b$a r4 = new h4.b$a
            r4.<init>(r13, r1, r11)
            r1 = 12
            r14.W(r1)
            int r11 = r14.L()
            int r11 = r11 - r7
            int r13 = r14.L()
            int r9 = r14.L()
            if (r0 == 0) goto L_0x00dc
            r0.W(r1)
            int r10 = r0.L()
            goto L_0x00dd
        L_0x00dc:
            r10 = r6
        L_0x00dd:
            r6 = -1
            if (r15 == 0) goto L_0x00f4
            r15.W(r1)
            int r1 = r15.L()
            if (r1 <= 0) goto L_0x00f0
            int r16 = r15.L()
            int r16 = r16 + -1
            goto L_0x00f7
        L_0x00f0:
            r16 = r6
            r15 = 0
            goto L_0x00f7
        L_0x00f4:
            r16 = r6
            r1 = 0
        L_0x00f7:
            int r8 = r5.b()
            q3.s r7 = r12.f51598g
            java.lang.String r7 = r7.f28244o
            if (r8 == r6) goto L_0x0121
            java.lang.String r6 = "audio/raw"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0119
            java.lang.String r6 = "audio/g711-mlaw"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0119
            java.lang.String r6 = "audio/g711-alaw"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0121
        L_0x0119:
            if (r11 != 0) goto L_0x0121
            if (r10 != 0) goto L_0x0121
            if (r1 != 0) goto L_0x0121
            r6 = 1
            goto L_0x0122
        L_0x0121:
            r6 = 0
        L_0x0122:
            if (r6 == 0) goto L_0x0154
            int r0 = r4.f51432a
            long[] r1 = new long[r0]
            int[] r0 = new int[r0]
        L_0x012a:
            boolean r5 = r4.a()
            if (r5 == 0) goto L_0x013b
            int r5 = r4.f51433b
            long r6 = r4.f51435d
            r1[r5] = r6
            int r6 = r4.f51434c
            r0[r5] = r6
            goto L_0x012a
        L_0x013b:
            long r4 = (long) r9
            h4.d$b r0 = h4.d.a(r8, r1, r0, r4)
            long[] r1 = r0.f51473a
            int[] r4 = r0.f51474b
            int r5 = r0.f51475c
            long[] r6 = r0.f51476d
            int[] r7 = r0.f51477e
            long r8 = r0.f51478f
            r13 = r1
            r14 = r4
            r15 = r5
            r2 = r6
            r10 = r7
            r0 = r8
            goto L_0x02cf
        L_0x0154:
            long[] r6 = new long[r3]
            int[] r7 = new int[r3]
            long[] r8 = new long[r3]
            r40 = r1
            int[] r1 = new int[r3]
            r29 = r11
            r25 = r12
            r11 = r13
            r28 = r14
            r2 = r16
            r12 = 0
            r14 = 0
            r16 = 0
            r21 = 0
            r23 = 0
            r26 = 0
            r27 = 0
            r38 = r9
            r9 = r40
            r40 = r10
            r10 = r38
        L_0x017b:
            java.lang.String r13 = "BoxParsers"
            if (r12 >= r3) goto L_0x0246
            r30 = r23
            r23 = r16
            r16 = 1
        L_0x0185:
            if (r23 != 0) goto L_0x01a2
            boolean r16 = r4.a()
            if (r16 == 0) goto L_0x01a2
            r24 = r10
            r32 = r11
            long r10 = r4.f51435d
            r33 = r3
            int r3 = r4.f51434c
            r23 = r3
            r30 = r10
            r10 = r24
            r11 = r32
            r3 = r33
            goto L_0x0185
        L_0x01a2:
            r33 = r3
            r24 = r10
            r32 = r11
            if (r16 != 0) goto L_0x01c6
            java.lang.String r2 = "Unexpected end of chunk data"
            t3.q.h(r13, r2)
            long[] r6 = java.util.Arrays.copyOf(r6, r12)
            int[] r7 = java.util.Arrays.copyOf(r7, r12)
            long[] r8 = java.util.Arrays.copyOf(r8, r12)
            int[] r1 = java.util.Arrays.copyOf(r1, r12)
            r3 = r12
            r2 = r23
        L_0x01c2:
            r4 = r26
            goto L_0x024f
        L_0x01c6:
            r11 = r40
            if (r0 == 0) goto L_0x01db
        L_0x01ca:
            if (r27 != 0) goto L_0x01d9
            if (r11 <= 0) goto L_0x01d9
            int r27 = r0.L()
            int r26 = r0.q()
            int r11 = r11 + -1
            goto L_0x01ca
        L_0x01d9:
            int r27 = r27 + -1
        L_0x01db:
            r3 = r26
            r6[r12] = r30
            int r10 = r5.a()
            r7[r12] = r10
            r34 = r4
            if (r10 <= r14) goto L_0x01ea
            r14 = r10
        L_0x01ea:
            r10 = r5
            long r4 = (long) r3
            long r4 = r21 + r4
            r8[r12] = r4
            if (r15 != 0) goto L_0x01f4
            r4 = 1
            goto L_0x01f5
        L_0x01f4:
            r4 = 0
        L_0x01f5:
            r1[r12] = r4
            if (r12 != r2) goto L_0x020b
            r4 = 1
            r1[r12] = r4
            int r9 = r9 + -1
            if (r9 <= 0) goto L_0x020b
            java.lang.Object r2 = t3.C5950a.e(r15)
            t3.B r2 = (t3.B) r2
            int r2 = r2.L()
            int r2 = r2 - r4
        L_0x020b:
            r5 = r1
            r40 = r2
            r4 = r24
            long r1 = (long) r4
            long r21 = r21 + r1
            int r1 = r32 + -1
            if (r1 != 0) goto L_0x0224
            if (r29 <= 0) goto L_0x0224
            int r1 = r28.L()
            int r2 = r28.q()
            int r29 = r29 + -1
            goto L_0x0225
        L_0x0224:
            r2 = r4
        L_0x0225:
            r4 = r7[r12]
            r16 = r1
            r13 = r2
            long r1 = (long) r4
            long r1 = r30 + r1
            int r4 = r23 + -1
            int r12 = r12 + 1
            r23 = r1
            r26 = r3
            r1 = r5
            r5 = r10
            r10 = r13
            r3 = r33
            r2 = r40
            r40 = r11
            r11 = r16
            r16 = r4
            r4 = r34
            goto L_0x017b
        L_0x0246:
            r5 = r1
            r33 = r3
            r32 = r11
            r2 = r16
            goto L_0x01c2
        L_0x024f:
            long r4 = (long) r4
            long r4 = r21 + r4
            if (r0 == 0) goto L_0x0266
            r11 = r40
        L_0x0256:
            if (r11 <= 0) goto L_0x0266
            int r10 = r0.L()
            if (r10 == 0) goto L_0x0260
            r0 = 0
            goto L_0x0267
        L_0x0260:
            r0.q()
            int r11 = r11 + -1
            goto L_0x0256
        L_0x0266:
            r0 = 1
        L_0x0267:
            if (r9 != 0) goto L_0x0279
            if (r32 != 0) goto L_0x0279
            if (r2 != 0) goto L_0x0279
            if (r29 != 0) goto L_0x0279
            r10 = r27
            if (r10 != 0) goto L_0x027b
            if (r0 != 0) goto L_0x0276
            goto L_0x027b
        L_0x0276:
            r12 = r25
            goto L_0x02c9
        L_0x0279:
            r10 = r27
        L_0x027b:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Inconsistent stbl box for track "
            r11.append(r12)
            r12 = r25
            int r15 = r12.f51592a
            r11.append(r15)
            java.lang.String r15 = ": remainingSynchronizationSamples "
            r11.append(r15)
            r11.append(r9)
            java.lang.String r9 = ", remainingSamplesAtTimestampDelta "
            r11.append(r9)
            r9 = r32
            r11.append(r9)
            java.lang.String r9 = ", remainingSamplesInChunk "
            r11.append(r9)
            r11.append(r2)
            java.lang.String r2 = ", remainingTimestampDeltaChanges "
            r11.append(r2)
            r2 = r29
            r11.append(r2)
            java.lang.String r2 = ", remainingSamplesAtTimestampOffset "
            r11.append(r2)
            r11.append(r10)
            if (r0 != 0) goto L_0x02bd
            java.lang.String r0 = ", ctts invalid"
            goto L_0x02bf
        L_0x02bd:
            java.lang.String r0 = ""
        L_0x02bf:
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            t3.q.h(r13, r0)
        L_0x02c9:
            r10 = r1
            r0 = r4
            r13 = r6
            r2 = r8
            r15 = r14
            r14 = r7
        L_0x02cf:
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r12.f51594c
            r4 = r0
            long r4 = t3.N.Z0(r4, r6, r8)
            long[] r6 = r12.f51600i
            r7 = 1000000(0xf4240, double:4.940656E-318)
            if (r6 != 0) goto L_0x02f2
            long r0 = r12.f51594c
            t3.N.a1(r2, r7, r0)
            h4.v r0 = new h4.v
            r11 = r0
            r16 = r2
            r17 = r10
            r18 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            return r0
        L_0x02f2:
            int r4 = r6.length
            r5 = 1
            if (r4 != r5) goto L_0x039d
            int r4 = r12.f51593b
            if (r4 != r5) goto L_0x039d
            int r4 = r2.length
            r5 = 2
            if (r4 < r5) goto L_0x039d
            long[] r4 = r12.f51601j
            java.lang.Object r4 = t3.C5950a.e(r4)
            long[] r4 = (long[]) r4
            r5 = 0
            r21 = r4[r5]
            long[] r4 = r12.f51600i
            r23 = r4[r5]
            long r4 = r12.f51594c
            long r7 = r12.f51595d
            r25 = r4
            r27 = r7
            long r4 = t3.N.Z0(r23, r25, r27)
            long r23 = r21 + r4
            r4 = r2
            r5 = r0
            r40 = r14
            r16 = r15
            r14 = 1000000(0xf4240, double:4.940656E-318)
            r7 = r21
            r11 = r10
            r9 = r23
            boolean r4 = b(r4, r5, r7, r9)
            if (r4 == 0) goto L_0x039a
            long r5 = r0 - r23
            r4 = 0
            r7 = r2[r4]
            long r23 = r21 - r7
            q3.s r4 = r12.f51598g
            int r4 = r4.f28220E
            long r7 = (long) r4
            long r9 = r12.f51594c
            r25 = r7
            r27 = r9
            long r9 = t3.N.Z0(r23, r25, r27)
            q3.s r4 = r12.f51598g
            int r4 = r4.f28220E
            long r7 = (long) r4
            long r14 = r12.f51594c
            r21 = r3
            r3 = r9
            r9 = r14
            long r5 = t3.N.Z0(r5, r7, r9)
            r7 = 0
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0361
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x035f
            goto L_0x0361
        L_0x035f:
            r7 = r11
            goto L_0x03a4
        L_0x0361:
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x035f
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x035f
            int r0 = (int) r3
            r1 = r41
            r1.f38726a = r0
            int r0 = (int) r5
            r1.f38727b = r0
            long r0 = r12.f51594c
            r3 = 1000000(0xf4240, double:4.940656E-318)
            t3.N.a1(r2, r3, r0)
            long[] r0 = r12.f51600i
            r1 = 0
            r3 = r0[r1]
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r12.f51595d
            long r18 = t3.N.Z0(r3, r5, r7)
            h4.v r0 = new h4.v
            r7 = r11
            r11 = r0
            r14 = r40
            r15 = r16
            r16 = r2
            r17 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            return r0
        L_0x039a:
            r21 = r3
            goto L_0x035f
        L_0x039d:
            r21 = r3
            r7 = r10
            r40 = r14
            r16 = r15
        L_0x03a4:
            long[] r3 = r12.f51600i
            int r4 = r3.length
            r5 = 1
            if (r4 != r5) goto L_0x03f1
            r4 = 0
            r5 = r3[r4]
            r8 = 0
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 != 0) goto L_0x03f1
            long[] r3 = r12.f51601j
            java.lang.Object r3 = t3.C5950a.e(r3)
            long[] r3 = (long[]) r3
            r5 = r3[r4]
            r3 = 0
        L_0x03be:
            int r4 = r2.length
            if (r3 >= r4) goto L_0x03d5
            r8 = r2[r3]
            long r17 = r8 - r5
            r19 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r12.f51594c
            r21 = r8
            long r8 = t3.N.Z0(r17, r19, r21)
            r2[r3] = r8
            int r3 = r3 + 1
            goto L_0x03be
        L_0x03d5:
            long r17 = r0 - r5
            r19 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r12.f51594c
            r21 = r0
            long r18 = t3.N.Z0(r17, r19, r21)
            h4.v r0 = new h4.v
            r11 = r0
            r14 = r40
            r15 = r16
            r16 = r2
            r17 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            return r0
        L_0x03f1:
            int r0 = r12.f51593b
            r1 = 1
            if (r0 != r1) goto L_0x03f8
            r4 = 1
            goto L_0x03f9
        L_0x03f8:
            r4 = 0
        L_0x03f9:
            int r0 = r3.length
            int[] r0 = new int[r0]
            int r1 = r3.length
            int[] r1 = new int[r1]
            long[] r3 = r12.f51601j
            java.lang.Object r3 = t3.C5950a.e(r3)
            long[] r3 = (long[]) r3
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
        L_0x040b:
            long[] r10 = r12.f51600i
            int r11 = r10.length
            if (r5 >= r11) goto L_0x0480
            r14 = r3[r5]
            r22 = -1
            int r11 = (r14 > r22 ? 1 : (r14 == r22 ? 0 : -1))
            if (r11 == 0) goto L_0x0475
            r22 = r10[r5]
            long r10 = r12.f51594c
            r41 = r8
            r28 = r9
            long r8 = r12.f51595d
            r24 = r10
            r26 = r8
            long r8 = t3.N.Z0(r22, r24, r26)
            r10 = 1
            int r11 = t3.N.h(r2, r14, r10, r10)
            r0[r5] = r11
        L_0x0431:
            r11 = r0[r5]
            if (r11 < 0) goto L_0x0441
            r22 = r7[r11]
            r22 = r22 & 1
            if (r22 != 0) goto L_0x0441
            int r11 = r11 + -1
            r0[r5] = r11
            r10 = 1
            goto L_0x0431
        L_0x0441:
            long r14 = r14 + r8
            r8 = 0
            int r9 = t3.N.e(r2, r14, r4, r8)
            r1[r5] = r9
            int r9 = r12.f51593b
            r10 = 2
            if (r9 != r10) goto L_0x0464
        L_0x044e:
            r9 = r1[r5]
            int r11 = r2.length
            r19 = 1
            int r11 = r11 + -1
            if (r9 >= r11) goto L_0x0464
            int r11 = r9 + 1
            r19 = r2[r11]
            int r11 = (r19 > r14 ? 1 : (r19 == r14 ? 0 : -1))
            if (r11 > 0) goto L_0x0464
            int r9 = r9 + 1
            r1[r5] = r9
            goto L_0x044e
        L_0x0464:
            r9 = r1[r5]
            r11 = r0[r5]
            int r14 = r9 - r11
            int r14 = r41 + r14
            r15 = r28
            if (r15 == r11) goto L_0x0472
            r11 = 1
            goto L_0x0473
        L_0x0472:
            r11 = r8
        L_0x0473:
            r6 = r6 | r11
            goto L_0x047c
        L_0x0475:
            r41 = r8
            r15 = r9
            r8 = 0
            r10 = 2
            r14 = r41
        L_0x047c:
            int r5 = r5 + 1
            r8 = r14
            goto L_0x040b
        L_0x0480:
            r14 = r8
            r5 = r21
            r8 = 0
            if (r14 == r5) goto L_0x0488
            r4 = 1
            goto L_0x0489
        L_0x0488:
            r4 = r8
        L_0x0489:
            r3 = r6 | r4
            if (r3 == 0) goto L_0x0490
            long[] r4 = new long[r14]
            goto L_0x0491
        L_0x0490:
            r4 = r13
        L_0x0491:
            if (r3 == 0) goto L_0x0496
            int[] r5 = new int[r14]
            goto L_0x0498
        L_0x0496:
            r5 = r40
        L_0x0498:
            if (r3 == 0) goto L_0x049c
            r15 = r8
            goto L_0x049e
        L_0x049c:
            r15 = r16
        L_0x049e:
            if (r3 == 0) goto L_0x04a3
            int[] r10 = new int[r14]
            goto L_0x04a4
        L_0x04a3:
            r10 = r7
        L_0x04a4:
            long[] r6 = new long[r14]
            r41 = r8
            r11 = r41
            r16 = r15
            r14 = 0
        L_0x04ae:
            long[] r9 = r12.f51600i
            int r9 = r9.length
            if (r8 >= r9) goto L_0x0540
            long[] r9 = r12.f51601j
            r25 = r9[r8]
            r9 = r0[r8]
            r27 = r0
            r0 = r1[r8]
            r28 = r1
            if (r3 == 0) goto L_0x04d1
            int r1 = r0 - r9
            java.lang.System.arraycopy(r13, r9, r4, r11, r1)
            r29 = r13
            r13 = r40
            java.lang.System.arraycopy(r13, r9, r5, r11, r1)
            java.lang.System.arraycopy(r7, r9, r10, r11, r1)
            goto L_0x04d5
        L_0x04d1:
            r29 = r13
            r13 = r40
        L_0x04d5:
            r40 = r41
            r1 = r16
        L_0x04d9:
            if (r9 >= r0) goto L_0x0520
            r21 = 1000000(0xf4240, double:4.940656E-318)
            r30 = r7
            r31 = r8
            long r7 = r12.f51595d
            r19 = r14
            r23 = r7
            long r7 = t3.N.Z0(r19, r21, r23)
            r19 = r2[r9]
            long r32 = r19 - r25
            r34 = 1000000(0xf4240, double:4.940656E-318)
            r19 = r14
            long r14 = r12.f51594c
            r36 = r14
            long r14 = t3.N.Z0(r32, r34, r36)
            r17 = 0
            int r16 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r16 >= 0) goto L_0x0506
            r16 = 1
            goto L_0x0508
        L_0x0506:
            r16 = r40
        L_0x0508:
            long r7 = r7 + r14
            r6[r11] = r7
            if (r3 == 0) goto L_0x0513
            r7 = r5[r11]
            if (r7 <= r1) goto L_0x0513
            r1 = r13[r9]
        L_0x0513:
            int r11 = r11 + 1
            int r9 = r9 + 1
            r40 = r16
            r14 = r19
            r7 = r30
            r8 = r31
            goto L_0x04d9
        L_0x0520:
            r30 = r7
            r31 = r8
            r19 = r14
            r17 = 0
            long[] r0 = r12.f51600i
            r7 = r0[r31]
            long r14 = r19 + r7
            int r8 = r31 + 1
            r41 = r40
            r16 = r1
            r40 = r13
            r0 = r27
            r1 = r28
            r13 = r29
            r7 = r30
            goto L_0x04ae
        L_0x0540:
            r19 = r14
            r21 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r12.f51595d
            r23 = r0
            long r26 = t3.N.Z0(r19, r21, r23)
            if (r41 == 0) goto L_0x0562
            q3.s r0 = r12.f51598g
            q3.s$b r0 = r0.b()
            r1 = 1
            q3.s$b r0 = r0.b0(r1)
            q3.s r0 = r0.M()
            h4.s r12 = r12.a(r0)
        L_0x0562:
            r20 = r12
            h4.v r0 = new h4.v
            r19 = r0
            r21 = r4
            r22 = r5
            r23 = r16
            r24 = r6
            r25 = r10
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            return r0
        L_0x0576:
            java.lang.String r0 = "Track has no sample table size information"
            r1 = 0
            q3.B r0 = q3.B.a(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.C7925b.x(h4.s, u3.b$b, N3.B):h4.v");
    }

    private static c y(B b10, int i10, int i11) {
        b10.W(i10 + 8);
        int f10 = b10.f();
        while (f10 - i10 < i11) {
            b10.W(f10);
            int q10 = b10.q();
            boolean z10 = false;
            C6680s.a(q10 > 0, "childAtomSize must be positive");
            if (b10.q() == 1937011305) {
                b10.X(4);
                int H10 = b10.H();
                boolean z11 = (H10 & 1) == 1;
                boolean z12 = (H10 & 2) == 2;
                boolean z13 = (H10 & 8) == 8;
                if ((H10 & 4) == 4) {
                    z10 = true;
                }
                return new c(new f(z11, z12, z13, z10));
            }
            f10 += q10;
        }
        return null;
    }

    private static g z(B b10, int i10, int i11, String str, C5803n nVar, boolean z10) {
        int i12;
        B b11 = b10;
        int i13 = i10;
        b11.W(12);
        int q10 = b10.q();
        g gVar = new g(q10);
        for (int i14 = 0; i14 < q10; i14++) {
            int f10 = b10.f();
            int q11 = b10.q();
            C6680s.a(q11 > 0, "childAtomSize must be positive");
            int q12 = b10.q();
            if (q12 == 1635148593 || q12 == 1635148595 || q12 == 1701733238 || q12 == 1831958048 || q12 == 1836070006 || q12 == 1752589105 || q12 == 1751479857 || q12 == 1932670515 || q12 == 1211250227 || q12 == 1748121139 || q12 == 1987063864 || q12 == 1987063865 || q12 == 1635135537 || q12 == 1685479798 || q12 == 1685479729 || q12 == 1685481573 || q12 == 1685481521) {
                i12 = f10;
                H(b10, q12, i12, q11, i10, i11, nVar, gVar, i14);
            } else if (q12 == 1836069985 || q12 == 1701733217 || q12 == 1633889587 || q12 == 1700998451 || q12 == 1633889588 || q12 == 1835823201 || q12 == 1685353315 || q12 == 1685353317 || q12 == 1685353320 || q12 == 1685353324 || q12 == 1685353336 || q12 == 1935764850 || q12 == 1935767394 || q12 == 1819304813 || q12 == 1936684916 || q12 == 1953984371 || q12 == 778924082 || q12 == 778924083 || q12 == 1835557169 || q12 == 1835560241 || q12 == 1634492771 || q12 == 1634492791 || q12 == 1970037111 || q12 == 1332770163 || q12 == 1716281667 || q12 == 1767992678) {
                i12 = f10;
                f(b10, q12, f10, q11, i10, str, z10, nVar, gVar, i14);
            } else {
                if (q12 == 1414810956 || q12 == 1954034535 || q12 == 2004251764 || q12 == 1937010800 || q12 == 1664495672) {
                    A(b10, q12, f10, q11, i10, str, gVar);
                } else if (q12 == 1835365492) {
                    r(b11, q12, f10, i13, gVar);
                } else if (q12 == 1667329389) {
                    gVar.f51454b = new C5807s.b().d0(i13).s0("application/x-camera-motion").M();
                }
                i12 = f10;
            }
            b11.W(i12 + q11);
        }
        return gVar;
    }
}
