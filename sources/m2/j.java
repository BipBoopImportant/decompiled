package m2;

import i2.C5438a;
import java.util.HashMap;
import java.util.Set;
import k2.t;
import m2.h;
import p2.d;
import p2.e;

public class j {

    /* renamed from: v  reason: collision with root package name */
    public static float f26225v = Float.NaN;

    /* renamed from: a  reason: collision with root package name */
    public e f26226a = null;

    /* renamed from: b  reason: collision with root package name */
    public int f26227b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f26228c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f26229d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f26230e = 0;

    /* renamed from: f  reason: collision with root package name */
    public float f26231f = Float.NaN;

    /* renamed from: g  reason: collision with root package name */
    public float f26232g = Float.NaN;

    /* renamed from: h  reason: collision with root package name */
    public float f26233h = Float.NaN;

    /* renamed from: i  reason: collision with root package name */
    public float f26234i = Float.NaN;

    /* renamed from: j  reason: collision with root package name */
    public float f26235j = Float.NaN;

    /* renamed from: k  reason: collision with root package name */
    public float f26236k = Float.NaN;

    /* renamed from: l  reason: collision with root package name */
    public float f26237l = Float.NaN;

    /* renamed from: m  reason: collision with root package name */
    public float f26238m = Float.NaN;

    /* renamed from: n  reason: collision with root package name */
    public float f26239n = Float.NaN;

    /* renamed from: o  reason: collision with root package name */
    public float f26240o = Float.NaN;

    /* renamed from: p  reason: collision with root package name */
    public float f26241p = Float.NaN;

    /* renamed from: q  reason: collision with root package name */
    public float f26242q = Float.NaN;

    /* renamed from: r  reason: collision with root package name */
    public int f26243r = 0;

    /* renamed from: s  reason: collision with root package name */
    private final HashMap<String, C5438a> f26244s = new HashMap<>();

    /* renamed from: t  reason: collision with root package name */
    public String f26245t = null;

    /* renamed from: u  reason: collision with root package name */
    t f26246u;

    public j() {
    }

    private static void a(StringBuilder sb2, String str, float f10) {
        if (!Float.isNaN(f10)) {
            sb2.append(str);
            sb2.append(": ");
            sb2.append(f10);
            sb2.append(",\n");
        }
    }

    private static void b(StringBuilder sb2, String str, int i10) {
        sb2.append(str);
        sb2.append(": ");
        sb2.append(i10);
        sb2.append(",\n");
    }

    private static float l(float f10, float f11, float f12, float f13) {
        boolean isNaN = Float.isNaN(f10);
        boolean isNaN2 = Float.isNaN(f11);
        if (isNaN && isNaN2) {
            return Float.NaN;
        }
        if (isNaN) {
            f10 = f12;
        }
        if (isNaN2) {
            f11 = f12;
        }
        return f10 + (f13 * (f11 - f10));
    }

    public static void m(int i10, int i11, j jVar, j jVar2, j jVar3, h hVar, float f10) {
        int i12;
        float f11;
        int i13;
        int i14;
        float f12;
        float f13;
        int i15;
        float f14;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22 = i10;
        int i23 = i11;
        j jVar4 = jVar;
        j jVar5 = jVar2;
        j jVar6 = jVar3;
        h hVar2 = hVar;
        float f15 = 100.0f * f10;
        int i24 = (int) f15;
        int i25 = jVar5.f26227b;
        int i26 = jVar5.f26228c;
        int i27 = jVar6.f26227b;
        int i28 = jVar6.f26228c;
        int i29 = jVar6.f26229d - i27;
        int i30 = jVar5.f26229d - i25;
        int i31 = jVar6.f26230e - i28;
        int i32 = jVar5.f26230e - i26;
        float f16 = jVar5.f26241p;
        float f17 = jVar6.f26241p;
        float f18 = f15;
        if (jVar5.f26243r == 8) {
            i26 -= (int) (((float) i31) / 2.0f);
            i12 = i25 - ((int) (((float) i29) / 2.0f));
            if (Float.isNaN(f16)) {
                i13 = i31;
                i14 = i29;
                f11 = 0.0f;
            } else {
                f11 = f16;
                i14 = i29;
                i13 = i31;
            }
        } else {
            i14 = i30;
            f11 = f16;
            i13 = i32;
            i12 = i25;
        }
        if (jVar6.f26243r == 8) {
            i27 -= (int) (((float) i14) / 2.0f);
            i28 -= (int) (((float) i13) / 2.0f);
            i29 = i14;
            i31 = i13;
            if (Float.isNaN(f17)) {
                f17 = 0.0f;
            }
        }
        if (Float.isNaN(f11) && !Float.isNaN(f17)) {
            f11 = 1.0f;
        }
        if (!Float.isNaN(f11) && Float.isNaN(f17)) {
            f17 = 1.0f;
        }
        if (jVar5.f26243r == 4) {
            f12 = f17;
            f13 = 0.0f;
        } else {
            f13 = f11;
            f12 = f17;
        }
        float f19 = jVar6.f26243r == 4 ? 0.0f : f12;
        if (jVar4.f26226a == null || !hVar.F()) {
            i15 = i26;
            f14 = f10;
            i16 = i12;
            i17 = i27;
        } else {
            h.a q10 = hVar2.q(jVar4.f26226a.f27468o, i24);
            i15 = i26;
            h.a p10 = hVar2.p(jVar4.f26226a.f27468o, i24);
            if (q10 == p10) {
                p10 = null;
            }
            if (q10 != null) {
                i12 = (int) (q10.f26185b * ((float) i22));
                i19 = i27;
                i18 = i11;
                i15 = (int) (q10.f26186c * ((float) i18));
                i20 = q10.f26184a;
            } else {
                i18 = i11;
                i19 = i27;
                i20 = 0;
            }
            i16 = i12;
            if (p10 != null) {
                i17 = (int) (p10.f26185b * ((float) i22));
                i28 = (int) (p10.f26186c * ((float) i18));
                i21 = p10.f26184a;
            } else {
                i21 = 100;
                i17 = i19;
            }
            f14 = (f18 - ((float) i20)) / ((float) (i21 - i20));
        }
        int i33 = i15;
        jVar4.f26226a = jVar5.f26226a;
        int i34 = (int) (((float) i16) + (((float) (i17 - i16)) * f14));
        jVar4.f26227b = i34;
        int i35 = (int) (((float) i33) + (f14 * ((float) (i28 - i33))));
        jVar4.f26228c = i35;
        float f20 = f10;
        float f21 = 1.0f - f20;
        jVar4.f26229d = i34 + ((int) ((((float) i14) * f21) + (((float) i29) * f20)));
        jVar4.f26230e = i35 + ((int) ((f21 * ((float) i13)) + (((float) i31) * f20)));
        jVar4.f26231f = l(jVar5.f26231f, jVar6.f26231f, 0.5f, f20);
        jVar4.f26232g = l(jVar5.f26232g, jVar6.f26232g, 0.5f, f20);
        jVar4.f26233h = l(jVar5.f26233h, jVar6.f26233h, 0.0f, f20);
        jVar4.f26234i = l(jVar5.f26234i, jVar6.f26234i, 0.0f, f20);
        jVar4.f26235j = l(jVar5.f26235j, jVar6.f26235j, 0.0f, f20);
        jVar4.f26239n = l(jVar5.f26239n, jVar6.f26239n, 1.0f, f20);
        jVar4.f26240o = l(jVar5.f26240o, jVar6.f26240o, 1.0f, f20);
        jVar4.f26236k = l(jVar5.f26236k, jVar6.f26236k, 0.0f, f20);
        jVar4.f26237l = l(jVar5.f26237l, jVar6.f26237l, 0.0f, f20);
        jVar4.f26238m = l(jVar5.f26238m, jVar6.f26238m, 0.0f, f20);
        jVar4.f26241p = l(f13, f19, 1.0f, f20);
        Set<String> keySet = jVar6.f26244s.keySet();
        jVar4.f26244s.clear();
        for (String next : keySet) {
            if (jVar5.f26244s.containsKey(next)) {
                C5438a aVar = jVar5.f26244s.get(next);
                C5438a aVar2 = jVar6.f26244s.get(next);
                C5438a aVar3 = new C5438a(aVar);
                jVar4.f26244s.put(next, aVar3);
                if (aVar.m() == 1) {
                    aVar3.r(Float.valueOf(l(aVar.j(), aVar2.j(), 0.0f, f20)));
                } else {
                    int m10 = aVar.m();
                    float[] fArr = new float[m10];
                    float[] fArr2 = new float[m10];
                    aVar.k(fArr);
                    aVar2.k(fArr2);
                    for (int i36 = 0; i36 < m10; i36++) {
                        fArr[i36] = l(fArr[i36], fArr2[i36], 0.0f, f20);
                        aVar3.s(fArr);
                    }
                }
            }
        }
    }

    private void q(StringBuilder sb2, d.a aVar) {
        d o10 = this.f26226a.o(aVar);
        if (o10 != null && o10.f27399f != null) {
            sb2.append("Anchor");
            sb2.append(aVar.name());
            sb2.append(": ['");
            String str = o10.f27399f.h().f27468o;
            if (str == null) {
                str = "#PARENT";
            }
            sb2.append(str);
            sb2.append("', '");
            sb2.append(o10.f27399f.k().name());
            sb2.append("', '");
            sb2.append(o10.f27400g);
            sb2.append("'],\n");
        }
    }

    public void c(String str, int i10) {
        s(str, 902, i10);
    }

    public void d(String str, float f10) {
        r(str, 901, f10);
    }

    public float e() {
        int i10 = this.f26227b;
        return ((float) i10) + (((float) (this.f26229d - i10)) / 2.0f);
    }

    public float f() {
        int i10 = this.f26228c;
        return ((float) i10) + (((float) (this.f26230e - i10)) / 2.0f);
    }

    public C5438a g(String str) {
        return this.f26244s.get(str);
    }

    public Set<String> h() {
        return this.f26244s.keySet();
    }

    public String i() {
        e eVar = this.f26226a;
        return eVar == null ? "unknown" : eVar.f27468o;
    }

    public t j() {
        return this.f26246u;
    }

    public int k() {
        return Math.max(0, this.f26230e - this.f26228c);
    }

    public boolean n() {
        return Float.isNaN(this.f26233h) && Float.isNaN(this.f26234i) && Float.isNaN(this.f26235j) && Float.isNaN(this.f26236k) && Float.isNaN(this.f26237l) && Float.isNaN(this.f26238m) && Float.isNaN(this.f26239n) && Float.isNaN(this.f26240o) && Float.isNaN(this.f26241p);
    }

    public StringBuilder o(StringBuilder sb2) {
        return p(sb2, false);
    }

    public StringBuilder p(StringBuilder sb2, boolean z10) {
        sb2.append("{\n");
        b(sb2, "left", this.f26227b);
        b(sb2, "top", this.f26228c);
        b(sb2, "right", this.f26229d);
        b(sb2, "bottom", this.f26230e);
        a(sb2, "pivotX", this.f26231f);
        a(sb2, "pivotY", this.f26232g);
        a(sb2, "rotationX", this.f26233h);
        a(sb2, "rotationY", this.f26234i);
        a(sb2, "rotationZ", this.f26235j);
        a(sb2, "translationX", this.f26236k);
        a(sb2, "translationY", this.f26237l);
        a(sb2, "translationZ", this.f26238m);
        a(sb2, "scaleX", this.f26239n);
        a(sb2, "scaleY", this.f26240o);
        a(sb2, "alpha", this.f26241p);
        b(sb2, "visibility", this.f26243r);
        a(sb2, "interpolatedPos", this.f26242q);
        if (this.f26226a != null) {
            for (d.a q10 : d.a.values()) {
                q(sb2, q10);
            }
        }
        if (z10) {
            a(sb2, "phone_orientation", f26225v);
        }
        if (z10) {
            a(sb2, "phone_orientation", f26225v);
        }
        if (this.f26244s.size() != 0) {
            sb2.append("custom : {\n");
            for (String next : this.f26244s.keySet()) {
                C5438a aVar = this.f26244s.get(next);
                sb2.append(next);
                sb2.append(": ");
                switch (aVar.i()) {
                    case 900:
                        sb2.append(aVar.f());
                        sb2.append(",\n");
                        break;
                    case 901:
                    case 905:
                        sb2.append(aVar.e());
                        sb2.append(",\n");
                        break;
                    case 902:
                        sb2.append("'");
                        sb2.append(C5438a.b(aVar.f()));
                        sb2.append("',\n");
                        break;
                    case 903:
                        sb2.append("'");
                        sb2.append(aVar.h());
                        sb2.append("',\n");
                        break;
                    case 904:
                        sb2.append("'");
                        sb2.append(aVar.d());
                        sb2.append("',\n");
                        break;
                }
            }
            sb2.append("}\n");
        }
        sb2.append("}\n");
        return sb2;
    }

    public void r(String str, int i10, float f10) {
        if (this.f26244s.containsKey(str)) {
            this.f26244s.get(str).o(f10);
        } else {
            this.f26244s.put(str, new C5438a(str, i10, f10));
        }
    }

    public void s(String str, int i10, int i11) {
        if (this.f26244s.containsKey(str)) {
            this.f26244s.get(str).p(i11);
        } else {
            this.f26244s.put(str, new C5438a(str, i10, i11));
        }
    }

    public void t(String str, int i10, boolean z10) {
        if (this.f26244s.containsKey(str)) {
            this.f26244s.get(str).n(z10);
        } else {
            this.f26244s.put(str, new C5438a(str, i10, z10));
        }
    }

    /* access modifiers changed from: package-private */
    public void u(t tVar) {
        this.f26246u = tVar;
    }

    public j v() {
        e eVar = this.f26226a;
        if (eVar != null) {
            this.f26227b = eVar.E();
            this.f26228c = this.f26226a.S();
            this.f26229d = this.f26226a.N();
            this.f26230e = this.f26226a.r();
            x(this.f26226a.f27466n);
        }
        return this;
    }

    public j w(e eVar) {
        if (eVar == null) {
            return this;
        }
        this.f26226a = eVar;
        v();
        return this;
    }

    public void x(j jVar) {
        if (jVar != null) {
            this.f26231f = jVar.f26231f;
            this.f26232g = jVar.f26232g;
            this.f26233h = jVar.f26233h;
            this.f26234i = jVar.f26234i;
            this.f26235j = jVar.f26235j;
            this.f26236k = jVar.f26236k;
            this.f26237l = jVar.f26237l;
            this.f26238m = jVar.f26238m;
            this.f26239n = jVar.f26239n;
            this.f26240o = jVar.f26240o;
            this.f26241p = jVar.f26241p;
            this.f26243r = jVar.f26243r;
            u(jVar.f26246u);
            this.f26244s.clear();
            for (C5438a next : jVar.f26244s.values()) {
                this.f26244s.put(next.g(), next.c());
            }
        }
    }

    public int y() {
        return Math.max(0, this.f26229d - this.f26227b);
    }

    public j(e eVar) {
        this.f26226a = eVar;
    }

    public j(j jVar) {
        this.f26226a = jVar.f26226a;
        this.f26227b = jVar.f26227b;
        this.f26228c = jVar.f26228c;
        this.f26229d = jVar.f26229d;
        this.f26230e = jVar.f26230e;
        x(jVar);
    }
}
