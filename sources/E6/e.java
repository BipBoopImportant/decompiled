package E6;

import C6.j;
import C6.k;
import C6.l;
import D6.c;
import D6.h;
import D6.i;
import G6.C6515j;
import java.util.List;
import java.util.Locale;
import w6.C8927i;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private final List<c> f34955a;

    /* renamed from: b  reason: collision with root package name */
    private final C8927i f34956b;

    /* renamed from: c  reason: collision with root package name */
    private final String f34957c;

    /* renamed from: d  reason: collision with root package name */
    private final long f34958d;

    /* renamed from: e  reason: collision with root package name */
    private final a f34959e;

    /* renamed from: f  reason: collision with root package name */
    private final long f34960f;

    /* renamed from: g  reason: collision with root package name */
    private final String f34961g;

    /* renamed from: h  reason: collision with root package name */
    private final List<i> f34962h;

    /* renamed from: i  reason: collision with root package name */
    private final l f34963i;

    /* renamed from: j  reason: collision with root package name */
    private final int f34964j;

    /* renamed from: k  reason: collision with root package name */
    private final int f34965k;

    /* renamed from: l  reason: collision with root package name */
    private final int f34966l;

    /* renamed from: m  reason: collision with root package name */
    private final float f34967m;

    /* renamed from: n  reason: collision with root package name */
    private final float f34968n;

    /* renamed from: o  reason: collision with root package name */
    private final float f34969o;

    /* renamed from: p  reason: collision with root package name */
    private final float f34970p;

    /* renamed from: q  reason: collision with root package name */
    private final j f34971q;

    /* renamed from: r  reason: collision with root package name */
    private final k f34972r;

    /* renamed from: s  reason: collision with root package name */
    private final C6.b f34973s;

    /* renamed from: t  reason: collision with root package name */
    private final List<J6.a<Float>> f34974t;

    /* renamed from: u  reason: collision with root package name */
    private final b f34975u;

    /* renamed from: v  reason: collision with root package name */
    private final boolean f34976v;

    /* renamed from: w  reason: collision with root package name */
    private final D6.a f34977w;

    /* renamed from: x  reason: collision with root package name */
    private final C6515j f34978x;

    /* renamed from: y  reason: collision with root package name */
    private final h f34979y;

    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public e(List<c> list, C8927i iVar, String str, long j10, a aVar, long j11, String str2, List<i> list2, l lVar, int i10, int i11, int i12, float f10, float f11, float f12, float f13, j jVar, k kVar, List<J6.a<Float>> list3, b bVar, C6.b bVar2, boolean z10, D6.a aVar2, C6515j jVar2, h hVar) {
        this.f34955a = list;
        this.f34956b = iVar;
        this.f34957c = str;
        this.f34958d = j10;
        this.f34959e = aVar;
        this.f34960f = j11;
        this.f34961g = str2;
        this.f34962h = list2;
        this.f34963i = lVar;
        this.f34964j = i10;
        this.f34965k = i11;
        this.f34966l = i12;
        this.f34967m = f10;
        this.f34968n = f11;
        this.f34969o = f12;
        this.f34970p = f13;
        this.f34971q = jVar;
        this.f34972r = kVar;
        this.f34974t = list3;
        this.f34975u = bVar;
        this.f34973s = bVar2;
        this.f34976v = z10;
        this.f34977w = aVar2;
        this.f34978x = jVar2;
        this.f34979y = hVar;
    }

    public h a() {
        return this.f34979y;
    }

    public D6.a b() {
        return this.f34977w;
    }

    /* access modifiers changed from: package-private */
    public C8927i c() {
        return this.f34956b;
    }

    public C6515j d() {
        return this.f34978x;
    }

    public long e() {
        return this.f34958d;
    }

    /* access modifiers changed from: package-private */
    public List<J6.a<Float>> f() {
        return this.f34974t;
    }

    public a g() {
        return this.f34959e;
    }

    /* access modifiers changed from: package-private */
    public List<i> h() {
        return this.f34962h;
    }

    /* access modifiers changed from: package-private */
    public b i() {
        return this.f34975u;
    }

    public String j() {
        return this.f34957c;
    }

    /* access modifiers changed from: package-private */
    public long k() {
        return this.f34960f;
    }

    /* access modifiers changed from: package-private */
    public float l() {
        return this.f34970p;
    }

    /* access modifiers changed from: package-private */
    public float m() {
        return this.f34969o;
    }

    public String n() {
        return this.f34961g;
    }

    /* access modifiers changed from: package-private */
    public List<c> o() {
        return this.f34955a;
    }

    /* access modifiers changed from: package-private */
    public int p() {
        return this.f34966l;
    }

    /* access modifiers changed from: package-private */
    public int q() {
        return this.f34965k;
    }

    /* access modifiers changed from: package-private */
    public int r() {
        return this.f34964j;
    }

    /* access modifiers changed from: package-private */
    public float s() {
        return this.f34968n / this.f34956b.e();
    }

    /* access modifiers changed from: package-private */
    public j t() {
        return this.f34971q;
    }

    public String toString() {
        return z("");
    }

    /* access modifiers changed from: package-private */
    public k u() {
        return this.f34972r;
    }

    /* access modifiers changed from: package-private */
    public C6.b v() {
        return this.f34973s;
    }

    /* access modifiers changed from: package-private */
    public float w() {
        return this.f34967m;
    }

    /* access modifiers changed from: package-private */
    public l x() {
        return this.f34963i;
    }

    public boolean y() {
        return this.f34976v;
    }

    public String z(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(j());
        sb2.append("\n");
        e t10 = this.f34956b.t(k());
        if (t10 != null) {
            sb2.append("\t\tParents: ");
            sb2.append(t10.j());
            e t11 = this.f34956b.t(t10.k());
            while (t11 != null) {
                sb2.append("->");
                sb2.append(t11.j());
                t11 = this.f34956b.t(t11.k());
            }
            sb2.append(str);
            sb2.append("\n");
        }
        if (!h().isEmpty()) {
            sb2.append(str);
            sb2.append("\tMasks: ");
            sb2.append(h().size());
            sb2.append("\n");
        }
        if (!(r() == 0 || q() == 0)) {
            sb2.append(str);
            sb2.append("\tBackground: ");
            sb2.append(String.format(Locale.US, "%dx%d %X\n", new Object[]{Integer.valueOf(r()), Integer.valueOf(q()), Integer.valueOf(p())}));
        }
        if (!this.f34955a.isEmpty()) {
            sb2.append(str);
            sb2.append("\tShapes:\n");
            for (c next : this.f34955a) {
                sb2.append(str);
                sb2.append("\t\t");
                sb2.append(next);
                sb2.append("\n");
            }
        }
        return sb2.toString();
    }
}
