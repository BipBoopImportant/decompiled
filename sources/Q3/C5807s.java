package q3;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import jb.g;
import kb.C9925E;
import kb.C9967v;
import mb.C10030a;
import t3.C5950a;
import t3.N;

/* renamed from: q3.s  reason: case insensitive filesystem */
public final class C5807s {

    /* renamed from: O  reason: collision with root package name */
    private static final C5807s f28181O = new b().M();

    /* renamed from: P  reason: collision with root package name */
    private static final String f28182P = N.A0(0);

    /* renamed from: Q  reason: collision with root package name */
    private static final String f28183Q = N.A0(1);

    /* renamed from: R  reason: collision with root package name */
    private static final String f28184R = N.A0(2);

    /* renamed from: S  reason: collision with root package name */
    private static final String f28185S = N.A0(3);

    /* renamed from: T  reason: collision with root package name */
    private static final String f28186T = N.A0(4);

    /* renamed from: U  reason: collision with root package name */
    private static final String f28187U = N.A0(5);

    /* renamed from: V  reason: collision with root package name */
    private static final String f28188V = N.A0(6);

    /* renamed from: W  reason: collision with root package name */
    private static final String f28189W = N.A0(7);

    /* renamed from: X  reason: collision with root package name */
    private static final String f28190X = N.A0(8);

    /* renamed from: Y  reason: collision with root package name */
    private static final String f28191Y = N.A0(9);

    /* renamed from: Z  reason: collision with root package name */
    private static final String f28192Z = N.A0(10);

    /* renamed from: a0  reason: collision with root package name */
    private static final String f28193a0 = N.A0(11);

    /* renamed from: b0  reason: collision with root package name */
    private static final String f28194b0 = N.A0(12);

    /* renamed from: c0  reason: collision with root package name */
    private static final String f28195c0 = N.A0(13);

    /* renamed from: d0  reason: collision with root package name */
    private static final String f28196d0 = N.A0(14);

    /* renamed from: e0  reason: collision with root package name */
    private static final String f28197e0 = N.A0(15);

    /* renamed from: f0  reason: collision with root package name */
    private static final String f28198f0 = N.A0(16);

    /* renamed from: g0  reason: collision with root package name */
    private static final String f28199g0 = N.A0(17);

    /* renamed from: h0  reason: collision with root package name */
    private static final String f28200h0 = N.A0(18);

    /* renamed from: i0  reason: collision with root package name */
    private static final String f28201i0 = N.A0(19);

    /* renamed from: j0  reason: collision with root package name */
    private static final String f28202j0 = N.A0(20);

    /* renamed from: k0  reason: collision with root package name */
    private static final String f28203k0 = N.A0(21);

    /* renamed from: l0  reason: collision with root package name */
    private static final String f28204l0 = N.A0(22);

    /* renamed from: m0  reason: collision with root package name */
    private static final String f28205m0 = N.A0(23);

    /* renamed from: n0  reason: collision with root package name */
    private static final String f28206n0 = N.A0(24);

    /* renamed from: o0  reason: collision with root package name */
    private static final String f28207o0 = N.A0(25);

    /* renamed from: p0  reason: collision with root package name */
    private static final String f28208p0 = N.A0(26);

    /* renamed from: q0  reason: collision with root package name */
    private static final String f28209q0 = N.A0(27);

    /* renamed from: r0  reason: collision with root package name */
    private static final String f28210r0 = N.A0(28);

    /* renamed from: s0  reason: collision with root package name */
    private static final String f28211s0 = N.A0(29);

    /* renamed from: t0  reason: collision with root package name */
    private static final String f28212t0 = N.A0(30);

    /* renamed from: u0  reason: collision with root package name */
    private static final String f28213u0 = N.A0(31);

    /* renamed from: v0  reason: collision with root package name */
    private static final String f28214v0 = N.A0(32);

    /* renamed from: w0  reason: collision with root package name */
    private static final String f28215w0 = N.A0(33);

    /* renamed from: A  reason: collision with root package name */
    public final byte[] f28216A;

    /* renamed from: B  reason: collision with root package name */
    public final int f28217B;

    /* renamed from: C  reason: collision with root package name */
    public final C5798i f28218C;

    /* renamed from: D  reason: collision with root package name */
    public final int f28219D;

    /* renamed from: E  reason: collision with root package name */
    public final int f28220E;

    /* renamed from: F  reason: collision with root package name */
    public final int f28221F;

    /* renamed from: G  reason: collision with root package name */
    public final int f28222G;

    /* renamed from: H  reason: collision with root package name */
    public final int f28223H;

    /* renamed from: I  reason: collision with root package name */
    public final int f28224I;

    /* renamed from: J  reason: collision with root package name */
    public final int f28225J;

    /* renamed from: K  reason: collision with root package name */
    public final int f28226K;

    /* renamed from: L  reason: collision with root package name */
    public final int f28227L;

    /* renamed from: M  reason: collision with root package name */
    public final int f28228M;

    /* renamed from: N  reason: collision with root package name */
    private int f28229N;

    /* renamed from: a  reason: collision with root package name */
    public final String f28230a;

    /* renamed from: b  reason: collision with root package name */
    public final String f28231b;

    /* renamed from: c  reason: collision with root package name */
    public final List<v> f28232c;

    /* renamed from: d  reason: collision with root package name */
    public final String f28233d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28234e;

    /* renamed from: f  reason: collision with root package name */
    public final int f28235f;

    /* renamed from: g  reason: collision with root package name */
    public final int f28236g;

    /* renamed from: h  reason: collision with root package name */
    public final int f28237h;

    /* renamed from: i  reason: collision with root package name */
    public final int f28238i;

    /* renamed from: j  reason: collision with root package name */
    public final int f28239j;

    /* renamed from: k  reason: collision with root package name */
    public final String f28240k;

    /* renamed from: l  reason: collision with root package name */
    public final z f28241l;

    /* renamed from: m  reason: collision with root package name */
    public final Object f28242m;

    /* renamed from: n  reason: collision with root package name */
    public final String f28243n;

    /* renamed from: o  reason: collision with root package name */
    public final String f28244o;

    /* renamed from: p  reason: collision with root package name */
    public final int f28245p;

    /* renamed from: q  reason: collision with root package name */
    public final int f28246q;

    /* renamed from: r  reason: collision with root package name */
    public final List<byte[]> f28247r;

    /* renamed from: s  reason: collision with root package name */
    public final C5803n f28248s;

    /* renamed from: t  reason: collision with root package name */
    public final long f28249t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f28250u;

    /* renamed from: v  reason: collision with root package name */
    public final int f28251v;

    /* renamed from: w  reason: collision with root package name */
    public final int f28252w;

    /* renamed from: x  reason: collision with root package name */
    public final float f28253x;

    /* renamed from: y  reason: collision with root package name */
    public final int f28254y;

    /* renamed from: z  reason: collision with root package name */
    public final float f28255z;

    /* renamed from: q3.s$b */
    public static final class b {
        /* access modifiers changed from: private */

        /* renamed from: A  reason: collision with root package name */
        public int f28256A;
        /* access modifiers changed from: private */

        /* renamed from: B  reason: collision with root package name */
        public C5798i f28257B;
        /* access modifiers changed from: private */

        /* renamed from: C  reason: collision with root package name */
        public int f28258C;
        /* access modifiers changed from: private */

        /* renamed from: D  reason: collision with root package name */
        public int f28259D;
        /* access modifiers changed from: private */

        /* renamed from: E  reason: collision with root package name */
        public int f28260E;
        /* access modifiers changed from: private */

        /* renamed from: F  reason: collision with root package name */
        public int f28261F;
        /* access modifiers changed from: private */

        /* renamed from: G  reason: collision with root package name */
        public int f28262G;
        /* access modifiers changed from: private */

        /* renamed from: H  reason: collision with root package name */
        public int f28263H;
        /* access modifiers changed from: private */

        /* renamed from: I  reason: collision with root package name */
        public int f28264I;
        /* access modifiers changed from: private */

        /* renamed from: J  reason: collision with root package name */
        public int f28265J;
        /* access modifiers changed from: private */

        /* renamed from: K  reason: collision with root package name */
        public int f28266K;
        /* access modifiers changed from: private */

        /* renamed from: L  reason: collision with root package name */
        public int f28267L;
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f28268a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f28269b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public List<v> f28270c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public String f28271d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f28272e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public int f28273f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public int f28274g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public int f28275h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public int f28276i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public String f28277j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public z f28278k;
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public Object f28279l;
        /* access modifiers changed from: private */

        /* renamed from: m  reason: collision with root package name */
        public String f28280m;
        /* access modifiers changed from: private */

        /* renamed from: n  reason: collision with root package name */
        public String f28281n;
        /* access modifiers changed from: private */

        /* renamed from: o  reason: collision with root package name */
        public int f28282o;
        /* access modifiers changed from: private */

        /* renamed from: p  reason: collision with root package name */
        public int f28283p;
        /* access modifiers changed from: private */

        /* renamed from: q  reason: collision with root package name */
        public List<byte[]> f28284q;
        /* access modifiers changed from: private */

        /* renamed from: r  reason: collision with root package name */
        public C5803n f28285r;
        /* access modifiers changed from: private */

        /* renamed from: s  reason: collision with root package name */
        public long f28286s;
        /* access modifiers changed from: private */

        /* renamed from: t  reason: collision with root package name */
        public boolean f28287t;
        /* access modifiers changed from: private */

        /* renamed from: u  reason: collision with root package name */
        public int f28288u;
        /* access modifiers changed from: private */

        /* renamed from: v  reason: collision with root package name */
        public int f28289v;
        /* access modifiers changed from: private */

        /* renamed from: w  reason: collision with root package name */
        public float f28290w;
        /* access modifiers changed from: private */

        /* renamed from: x  reason: collision with root package name */
        public int f28291x;
        /* access modifiers changed from: private */

        /* renamed from: y  reason: collision with root package name */
        public float f28292y;
        /* access modifiers changed from: private */

        /* renamed from: z  reason: collision with root package name */
        public byte[] f28293z;

        public C5807s M() {
            return new C5807s(this);
        }

        public b N(int i10) {
            this.f28263H = i10;
            return this;
        }

        public b O(int i10) {
            this.f28274g = i10;
            return this;
        }

        public b P(int i10) {
            this.f28275h = i10;
            return this;
        }

        public b Q(int i10) {
            this.f28258C = i10;
            return this;
        }

        public b R(String str) {
            this.f28277j = str;
            return this;
        }

        public b S(C5798i iVar) {
            this.f28257B = iVar;
            return this;
        }

        public b T(String str) {
            this.f28280m = A.r(str);
            return this;
        }

        public b U(int i10) {
            this.f28267L = i10;
            return this;
        }

        public b V(int i10) {
            this.f28264I = i10;
            return this;
        }

        public b W(Object obj) {
            this.f28279l = obj;
            return this;
        }

        public b X(C5803n nVar) {
            this.f28285r = nVar;
            return this;
        }

        public b Y(int i10) {
            this.f28261F = i10;
            return this;
        }

        public b Z(int i10) {
            this.f28262G = i10;
            return this;
        }

        public b a0(float f10) {
            this.f28290w = f10;
            return this;
        }

        public b b0(boolean z10) {
            this.f28287t = z10;
            return this;
        }

        public b c0(int i10) {
            this.f28289v = i10;
            return this;
        }

        public b d0(int i10) {
            this.f28268a = Integer.toString(i10);
            return this;
        }

        public b e0(String str) {
            this.f28268a = str;
            return this;
        }

        public b f0(List<byte[]> list) {
            this.f28284q = list;
            return this;
        }

        public b g0(String str) {
            this.f28269b = str;
            return this;
        }

        public b h0(List<v> list) {
            this.f28270c = C9967v.A(list);
            return this;
        }

        public b i0(String str) {
            this.f28271d = str;
            return this;
        }

        public b j0(int i10) {
            this.f28282o = i10;
            return this;
        }

        public b k0(int i10) {
            this.f28283p = i10;
            return this;
        }

        public b l0(z zVar) {
            this.f28278k = zVar;
            return this;
        }

        public b m0(int i10) {
            this.f28260E = i10;
            return this;
        }

        public b n0(int i10) {
            this.f28276i = i10;
            return this;
        }

        public b o0(float f10) {
            this.f28292y = f10;
            return this;
        }

        public b p0(byte[] bArr) {
            this.f28293z = bArr;
            return this;
        }

        public b q0(int i10) {
            this.f28273f = i10;
            return this;
        }

        public b r0(int i10) {
            this.f28291x = i10;
            return this;
        }

        public b s0(String str) {
            this.f28281n = A.r(str);
            return this;
        }

        public b t0(int i10) {
            this.f28259D = i10;
            return this;
        }

        public b u0(int i10) {
            this.f28272e = i10;
            return this;
        }

        public b v0(int i10) {
            this.f28256A = i10;
            return this;
        }

        public b w0(long j10) {
            this.f28286s = j10;
            return this;
        }

        public b x0(int i10) {
            this.f28288u = i10;
            return this;
        }

        public b() {
            this.f28270c = C9967v.E();
            this.f28275h = -1;
            this.f28276i = -1;
            this.f28282o = -1;
            this.f28283p = -1;
            this.f28286s = Long.MAX_VALUE;
            this.f28288u = -1;
            this.f28289v = -1;
            this.f28290w = -1.0f;
            this.f28292y = 1.0f;
            this.f28256A = -1;
            this.f28258C = -1;
            this.f28259D = -1;
            this.f28260E = -1;
            this.f28263H = -1;
            this.f28264I = 1;
            this.f28265J = -1;
            this.f28266K = -1;
            this.f28267L = 0;
            this.f28274g = 0;
        }

        private b(C5807s sVar) {
            this.f28268a = sVar.f28230a;
            this.f28269b = sVar.f28231b;
            this.f28270c = sVar.f28232c;
            this.f28271d = sVar.f28233d;
            this.f28272e = sVar.f28234e;
            this.f28273f = sVar.f28235f;
            this.f28275h = sVar.f28237h;
            this.f28276i = sVar.f28238i;
            this.f28277j = sVar.f28240k;
            this.f28278k = sVar.f28241l;
            this.f28279l = sVar.f28242m;
            this.f28280m = sVar.f28243n;
            this.f28281n = sVar.f28244o;
            this.f28282o = sVar.f28245p;
            this.f28283p = sVar.f28246q;
            this.f28284q = sVar.f28247r;
            this.f28285r = sVar.f28248s;
            this.f28286s = sVar.f28249t;
            this.f28287t = sVar.f28250u;
            this.f28288u = sVar.f28251v;
            this.f28289v = sVar.f28252w;
            this.f28290w = sVar.f28253x;
            this.f28291x = sVar.f28254y;
            this.f28292y = sVar.f28255z;
            this.f28293z = sVar.f28216A;
            this.f28256A = sVar.f28217B;
            this.f28257B = sVar.f28218C;
            this.f28258C = sVar.f28219D;
            this.f28259D = sVar.f28220E;
            this.f28260E = sVar.f28221F;
            this.f28261F = sVar.f28222G;
            this.f28262G = sVar.f28223H;
            this.f28263H = sVar.f28224I;
            this.f28264I = sVar.f28225J;
            this.f28265J = sVar.f28226K;
            this.f28266K = sVar.f28227L;
            this.f28267L = sVar.f28228M;
        }
    }

    private static String d(List<v> list, String str) {
        for (v next : list) {
            if (TextUtils.equals(next.f28309a, str)) {
                return next.f28310b;
            }
        }
        return list.get(0).f28310b;
    }

    private static boolean g(b bVar) {
        if (bVar.f28270c.isEmpty() && bVar.f28269b == null) {
            return true;
        }
        for (int i10 = 0; i10 < bVar.f28270c.size(); i10++) {
            if (((v) bVar.f28270c.get(i10)).f28310b.equals(bVar.f28269b)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String h(v vVar) {
        return vVar.f28309a + ": " + vVar.f28310b;
    }

    public static String i(C5807s sVar) {
        if (sVar == null) {
            return "null";
        }
        g f10 = g.f(',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("id=");
        sb2.append(sVar.f28230a);
        sb2.append(", mimeType=");
        sb2.append(sVar.f28244o);
        if (sVar.f28243n != null) {
            sb2.append(", container=");
            sb2.append(sVar.f28243n);
        }
        if (sVar.f28239j != -1) {
            sb2.append(", bitrate=");
            sb2.append(sVar.f28239j);
        }
        if (sVar.f28240k != null) {
            sb2.append(", codecs=");
            sb2.append(sVar.f28240k);
        }
        if (sVar.f28248s != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i10 = 0;
            while (true) {
                C5803n nVar = sVar.f28248s;
                if (i10 >= nVar.f28172d) {
                    break;
                }
                UUID uuid = nVar.c(i10).f28174b;
                if (uuid.equals(C5797h.f28130b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(C5797h.f28131c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(C5797h.f28133e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(C5797h.f28132d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(C5797h.f28129a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
                i10++;
            }
            sb2.append(", drm=[");
            f10.b(sb2, linkedHashSet);
            sb2.append(']');
        }
        if (!(sVar.f28251v == -1 || sVar.f28252w == -1)) {
            sb2.append(", res=");
            sb2.append(sVar.f28251v);
            sb2.append("x");
            sb2.append(sVar.f28252w);
        }
        if (!C10030a.a((double) sVar.f28255z, 1.0d, 0.001d)) {
            sb2.append(", par=");
            sb2.append(N.G("%.3f", Float.valueOf(sVar.f28255z)));
        }
        C5798i iVar = sVar.f28218C;
        if (iVar != null && iVar.i()) {
            sb2.append(", color=");
            sb2.append(sVar.f28218C.m());
        }
        if (sVar.f28253x != -1.0f) {
            sb2.append(", fps=");
            sb2.append(sVar.f28253x);
        }
        if (sVar.f28219D != -1) {
            sb2.append(", channels=");
            sb2.append(sVar.f28219D);
        }
        if (sVar.f28220E != -1) {
            sb2.append(", sample_rate=");
            sb2.append(sVar.f28220E);
        }
        if (sVar.f28233d != null) {
            sb2.append(", language=");
            sb2.append(sVar.f28233d);
        }
        if (!sVar.f28232c.isEmpty()) {
            sb2.append(", labels=[");
            f10.b(sb2, C9925E.h(sVar.f28232c, new r()));
            sb2.append("]");
        }
        if (sVar.f28234e != 0) {
            sb2.append(", selectionFlags=[");
            f10.b(sb2, N.k0(sVar.f28234e));
            sb2.append("]");
        }
        if (sVar.f28235f != 0) {
            sb2.append(", roleFlags=[");
            f10.b(sb2, N.j0(sVar.f28235f));
            sb2.append("]");
        }
        if (sVar.f28242m != null) {
            sb2.append(", customData=");
            sb2.append(sVar.f28242m);
        }
        if ((sVar.f28235f & 32768) != 0) {
            sb2.append(", auxiliaryTrackType=");
            sb2.append(N.N(sVar.f28236g));
        }
        return sb2.toString();
    }

    public b b() {
        return new b();
    }

    public C5807s c(int i10) {
        return b().U(i10).M();
    }

    public int e() {
        int i10;
        int i11 = this.f28251v;
        if (i11 == -1 || (i10 = this.f28252w) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj == null || C5807s.class != obj.getClass()) {
            return false;
        }
        C5807s sVar = (C5807s) obj;
        int i11 = this.f28229N;
        if (i11 == 0 || (i10 = sVar.f28229N) == 0 || i11 == i10) {
            return this.f28234e == sVar.f28234e && this.f28235f == sVar.f28235f && this.f28236g == sVar.f28236g && this.f28237h == sVar.f28237h && this.f28238i == sVar.f28238i && this.f28245p == sVar.f28245p && this.f28249t == sVar.f28249t && this.f28251v == sVar.f28251v && this.f28252w == sVar.f28252w && this.f28254y == sVar.f28254y && this.f28217B == sVar.f28217B && this.f28219D == sVar.f28219D && this.f28220E == sVar.f28220E && this.f28221F == sVar.f28221F && this.f28222G == sVar.f28222G && this.f28223H == sVar.f28223H && this.f28224I == sVar.f28224I && this.f28226K == sVar.f28226K && this.f28227L == sVar.f28227L && this.f28228M == sVar.f28228M && Float.compare(this.f28253x, sVar.f28253x) == 0 && Float.compare(this.f28255z, sVar.f28255z) == 0 && Objects.equals(this.f28230a, sVar.f28230a) && Objects.equals(this.f28231b, sVar.f28231b) && this.f28232c.equals(sVar.f28232c) && Objects.equals(this.f28240k, sVar.f28240k) && Objects.equals(this.f28243n, sVar.f28243n) && Objects.equals(this.f28244o, sVar.f28244o) && Objects.equals(this.f28233d, sVar.f28233d) && Arrays.equals(this.f28216A, sVar.f28216A) && Objects.equals(this.f28241l, sVar.f28241l) && Objects.equals(this.f28218C, sVar.f28218C) && Objects.equals(this.f28248s, sVar.f28248s) && f(sVar) && Objects.equals(this.f28242m, sVar.f28242m);
        }
        return false;
    }

    public boolean f(C5807s sVar) {
        if (this.f28247r.size() != sVar.f28247r.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f28247r.size(); i10++) {
            if (!Arrays.equals(this.f28247r.get(i10), sVar.f28247r.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (this.f28229N == 0) {
            String str = this.f28230a;
            int i10 = 0;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f28231b;
            int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f28232c.hashCode()) * 31;
            String str3 = this.f28233d;
            int hashCode3 = (((((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f28234e) * 31) + this.f28235f) * 31) + this.f28236g) * 31) + this.f28237h) * 31) + this.f28238i) * 31;
            String str4 = this.f28240k;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            z zVar = this.f28241l;
            int hashCode5 = (hashCode4 + (zVar == null ? 0 : zVar.hashCode())) * 31;
            Object obj = this.f28242m;
            int hashCode6 = (hashCode5 + (obj == null ? 0 : obj.hashCode())) * 31;
            String str5 = this.f28243n;
            int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f28244o;
            if (str6 != null) {
                i10 = str6.hashCode();
            }
            this.f28229N = ((((((((((((((((((((((((((((((((((hashCode7 + i10) * 31) + this.f28245p) * 31) + ((int) this.f28249t)) * 31) + this.f28251v) * 31) + this.f28252w) * 31) + Float.floatToIntBits(this.f28253x)) * 31) + this.f28254y) * 31) + Float.floatToIntBits(this.f28255z)) * 31) + this.f28217B) * 31) + this.f28219D) * 31) + this.f28220E) * 31) + this.f28221F) * 31) + this.f28222G) * 31) + this.f28223H) * 31) + this.f28224I) * 31) + this.f28226K) * 31) + this.f28227L) * 31) + this.f28228M;
        }
        return this.f28229N;
    }

    public String toString() {
        return "Format(" + this.f28230a + ", " + this.f28231b + ", " + this.f28243n + ", " + this.f28244o + ", " + this.f28240k + ", " + this.f28239j + ", " + this.f28233d + ", [" + this.f28251v + ", " + this.f28252w + ", " + this.f28253x + ", " + this.f28218C + "], [" + this.f28219D + ", " + this.f28220E + "])";
    }

    private C5807s(b bVar) {
        this.f28230a = bVar.f28268a;
        String S02 = N.S0(bVar.f28271d);
        this.f28233d = S02;
        if (bVar.f28270c.isEmpty() && bVar.f28269b != null) {
            this.f28232c = C9967v.F(new v(S02, bVar.f28269b));
            this.f28231b = bVar.f28269b;
        } else if (bVar.f28270c.isEmpty() || bVar.f28269b != null) {
            C5950a.g(g(bVar));
            this.f28232c = bVar.f28270c;
            this.f28231b = bVar.f28269b;
        } else {
            this.f28232c = bVar.f28270c;
            this.f28231b = d(bVar.f28270c, S02);
        }
        this.f28234e = bVar.f28272e;
        int i10 = 0;
        C5950a.h(bVar.f28274g == 0 || (bVar.f28273f & 32768) != 0, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.f28235f = bVar.f28273f;
        this.f28236g = bVar.f28274g;
        int K10 = bVar.f28275h;
        this.f28237h = K10;
        int L10 = bVar.f28276i;
        this.f28238i = L10;
        this.f28239j = L10 != -1 ? L10 : K10;
        this.f28240k = bVar.f28277j;
        this.f28241l = bVar.f28278k;
        this.f28242m = bVar.f28279l;
        this.f28243n = bVar.f28280m;
        this.f28244o = bVar.f28281n;
        this.f28245p = bVar.f28282o;
        this.f28246q = bVar.f28283p;
        this.f28247r = bVar.f28284q == null ? Collections.emptyList() : bVar.f28284q;
        C5803n j10 = bVar.f28285r;
        this.f28248s = j10;
        this.f28249t = bVar.f28286s;
        this.f28250u = bVar.f28287t;
        this.f28251v = bVar.f28288u;
        this.f28252w = bVar.f28289v;
        this.f28253x = bVar.f28290w;
        this.f28254y = bVar.f28291x == -1 ? 0 : bVar.f28291x;
        this.f28255z = bVar.f28292y == -1.0f ? 1.0f : bVar.f28292y;
        this.f28216A = bVar.f28293z;
        this.f28217B = bVar.f28256A;
        this.f28218C = bVar.f28257B;
        this.f28219D = bVar.f28258C;
        this.f28220E = bVar.f28259D;
        this.f28221F = bVar.f28260E;
        this.f28222G = bVar.f28261F == -1 ? 0 : bVar.f28261F;
        this.f28223H = bVar.f28262G != -1 ? bVar.f28262G : i10;
        this.f28224I = bVar.f28263H;
        this.f28225J = bVar.f28264I;
        this.f28226K = bVar.f28265J;
        this.f28227L = bVar.f28266K;
        if (bVar.f28267L != 0 || j10 == null) {
            this.f28228M = bVar.f28267L;
        } else {
            this.f28228M = 1;
        }
    }
}
