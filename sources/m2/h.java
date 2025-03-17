package m2;

import com.adjust.sdk.Constants;
import i2.C5438a;
import i2.C5439b;
import i2.C5442e;
import j2.C5482b;
import j2.C5483c;
import j2.C5484d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import k2.d;
import k2.f;
import k2.o;
import k2.q;
import k2.r;
import k2.t;
import k2.u;
import p2.e;

public class h implements u {

    /* renamed from: a  reason: collision with root package name */
    private HashMap<Integer, HashMap<String, a>> f26166a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private HashMap<String, c> f26167b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private t f26168c = new t();

    /* renamed from: d  reason: collision with root package name */
    private int f26169d = 0;

    /* renamed from: e  reason: collision with root package name */
    private String f26170e = null;

    /* renamed from: f  reason: collision with root package name */
    private d f26171f = null;

    /* renamed from: g  reason: collision with root package name */
    private int f26172g = 0;

    /* renamed from: h  reason: collision with root package name */
    private int f26173h = Constants.MINIMAL_ERROR_STATUS_CODE;

    /* renamed from: i  reason: collision with root package name */
    private float f26174i = 0.0f;

    /* renamed from: j  reason: collision with root package name */
    private b f26175j = null;

    /* renamed from: k  reason: collision with root package name */
    final C5575c f26176k;

    /* renamed from: l  reason: collision with root package name */
    int f26177l;

    /* renamed from: m  reason: collision with root package name */
    int f26178m;

    /* renamed from: n  reason: collision with root package name */
    int f26179n;

    /* renamed from: o  reason: collision with root package name */
    int f26180o;

    /* renamed from: p  reason: collision with root package name */
    int f26181p;

    /* renamed from: q  reason: collision with root package name */
    int f26182q;

    /* renamed from: r  reason: collision with root package name */
    boolean f26183r;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f26184a;

        /* renamed from: b  reason: collision with root package name */
        float f26185b;

        /* renamed from: c  reason: collision with root package name */
        float f26186c;
    }

    static class b {

        /* renamed from: A  reason: collision with root package name */
        private static final float[][] f26187A = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

        /* renamed from: u  reason: collision with root package name */
        public static final String[] f26188u = {"top", "left", "right", "bottom", "middle", "start", "end"};

        /* renamed from: v  reason: collision with root package name */
        private static final float[][] f26189v = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

        /* renamed from: w  reason: collision with root package name */
        public static final String[] f26190w = {"up", "down", "left", "right", "start", "end", "clockwise", "anticlockwise"};

        /* renamed from: x  reason: collision with root package name */
        public static final String[] f26191x = {"velocity", "spring"};

        /* renamed from: y  reason: collision with root package name */
        public static final String[] f26192y = {"autocomplete", "toStart", "toEnd", "stop", "decelerate", "decelerateComplete", "neverCompleteStart", "neverCompleteEnd"};

        /* renamed from: z  reason: collision with root package name */
        public static final String[] f26193z = {"overshoot", "bounceStart", "bounceEnd", "bounceBoth"};

        /* renamed from: a  reason: collision with root package name */
        String f26194a;

        /* renamed from: b  reason: collision with root package name */
        private int f26195b;

        /* renamed from: c  reason: collision with root package name */
        private q f26196c;

        /* renamed from: d  reason: collision with root package name */
        private String f26197d;

        /* renamed from: e  reason: collision with root package name */
        String f26198e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f26199f = true;

        /* renamed from: g  reason: collision with root package name */
        private int f26200g = 0;

        /* renamed from: h  reason: collision with root package name */
        private float f26201h = 1.0f;

        /* renamed from: i  reason: collision with root package name */
        private float f26202i = 10.0f;

        /* renamed from: j  reason: collision with root package name */
        private int f26203j = 0;

        /* renamed from: k  reason: collision with root package name */
        private float f26204k = 4.0f;

        /* renamed from: l  reason: collision with root package name */
        private float f26205l = 1.2f;

        /* renamed from: m  reason: collision with root package name */
        private int f26206m = 0;

        /* renamed from: n  reason: collision with root package name */
        private float f26207n = 1.0f;

        /* renamed from: o  reason: collision with root package name */
        private float f26208o = 400.0f;

        /* renamed from: p  reason: collision with root package name */
        private float f26209p = 10.0f;

        /* renamed from: q  reason: collision with root package name */
        private float f26210q = 0.01f;

        /* renamed from: r  reason: collision with root package name */
        private float f26211r = 0.0f;

        /* renamed from: s  reason: collision with root package name */
        private int f26212s = 0;

        /* renamed from: t  reason: collision with root package name */
        private long f26213t;

        b() {
        }

        /* access modifiers changed from: package-private */
        public void a(float f10, float f11, long j10, float f12) {
            o oVar;
            r rVar;
            r.a aVar;
            this.f26213t = j10;
            float abs = Math.abs(f11);
            float f13 = this.f26204k;
            if (abs > f13) {
                f11 = Math.signum(f11) * f13;
            }
            float f14 = f11;
            float b10 = b(f10, f14, f12);
            this.f26211r = b10;
            if (b10 == f10) {
                this.f26196c = null;
            } else if (this.f26206m == 4 && this.f26203j == 0) {
                q qVar = this.f26196c;
                if (qVar instanceof r.a) {
                    aVar = (r.a) qVar;
                } else {
                    aVar = new r.a();
                    this.f26196c = aVar;
                }
                aVar.b(f10, this.f26211r, f14);
            } else if (this.f26203j == 0) {
                q qVar2 = this.f26196c;
                if (qVar2 instanceof r) {
                    rVar = (r) qVar2;
                } else {
                    rVar = new r();
                    this.f26196c = rVar;
                }
                rVar.c(f10, this.f26211r, f14, f12, this.f26205l, this.f26204k);
            } else {
                q qVar3 = this.f26196c;
                if (qVar3 instanceof o) {
                    oVar = (o) qVar3;
                } else {
                    oVar = new o();
                    this.f26196c = oVar;
                }
                oVar.c(f10, this.f26211r, f14, this.f26207n, this.f26208o, this.f26209p, this.f26210q, this.f26212s);
            }
        }

        /* access modifiers changed from: package-private */
        public float b(float f10, float f11, float f12) {
            float abs = (((Math.abs(f11) * 0.5f) * f11) / this.f26205l) + f10;
            switch (this.f26206m) {
                case 1:
                    return f10 >= 1.0f ? 1.0f : 0.0f;
                case 2:
                    return f10 <= 0.0f ? 0.0f : 1.0f;
                case 3:
                    return Float.NaN;
                case 4:
                    return Math.max(0.0f, Math.min(1.0f, abs));
                case 5:
                    return (abs <= 0.2f || abs >= 0.8f) ? abs > 0.5f ? 1.0f : 0.0f : abs;
                case 6:
                    return 1.0f;
                case 7:
                    return 0.0f;
                default:
                    return ((double) abs) > 0.5d ? 1.0f : 0.0f;
            }
        }

        /* access modifiers changed from: package-private */
        public float[] c() {
            return f26187A[this.f26200g];
        }

        /* access modifiers changed from: package-private */
        public float d() {
            return this.f26201h;
        }

        /* access modifiers changed from: package-private */
        public float[] e() {
            return f26189v[this.f26195b];
        }

        public float f(long j10) {
            return this.f26196c.a() ? this.f26211r : this.f26196c.getInterpolation(((float) (j10 - this.f26213t)) * 1.0E-9f);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
            r3 = r2.f26196c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean g(float r3) {
            /*
                r2 = this;
                int r3 = r2.f26206m
                r0 = 3
                r1 = 0
                if (r3 != r0) goto L_0x0007
                return r1
            L_0x0007:
                k2.q r3 = r2.f26196c
                if (r3 == 0) goto L_0x0012
                boolean r3 = r3.a()
                if (r3 != 0) goto L_0x0012
                r1 = 1
            L_0x0012:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: m2.h.b.g(float):boolean");
        }

        /* access modifiers changed from: package-private */
        public void h(String str) {
            this.f26194a = str;
        }

        /* access modifiers changed from: package-private */
        public void i(int i10) {
            this.f26195b = i10;
        }

        /* access modifiers changed from: package-private */
        public void j(int i10) {
            this.f26203j = i10;
        }

        /* access modifiers changed from: package-private */
        public void k(int i10) {
            this.f26200g = i10;
            this.f26199f = i10 < 2;
        }

        /* access modifiers changed from: package-private */
        public void l(float f10) {
            if (!Float.isNaN(f10)) {
                this.f26201h = f10;
            }
        }

        /* access modifiers changed from: package-private */
        public void m(float f10) {
            if (!Float.isNaN(f10)) {
                this.f26202i = f10;
            }
        }

        /* access modifiers changed from: package-private */
        public void n(String str) {
            this.f26198e = str;
        }

        /* access modifiers changed from: package-private */
        public void o(float f10) {
            if (!Float.isNaN(f10)) {
                this.f26205l = f10;
            }
        }

        /* access modifiers changed from: package-private */
        public void p(float f10) {
            if (!Float.isNaN(f10)) {
                this.f26204k = f10;
            }
        }

        /* access modifiers changed from: package-private */
        public void q(int i10) {
            this.f26206m = i10;
        }

        /* access modifiers changed from: package-private */
        public void r(String str) {
            this.f26197d = str;
        }

        /* access modifiers changed from: package-private */
        public void s(int i10) {
            this.f26212s = i10;
        }

        /* access modifiers changed from: package-private */
        public void t(float f10) {
            if (!Float.isNaN(f10)) {
                this.f26209p = f10;
            }
        }

        /* access modifiers changed from: package-private */
        public void u(float f10) {
            if (!Float.isNaN(f10)) {
                this.f26207n = f10;
            }
        }

        /* access modifiers changed from: package-private */
        public void v(float f10) {
            if (!Float.isNaN(f10)) {
                this.f26208o = f10;
            }
        }

        /* access modifiers changed from: package-private */
        public void w(float f10) {
            if (!Float.isNaN(f10)) {
                this.f26210q = f10;
            }
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        j f26214a = new j();

        /* renamed from: b  reason: collision with root package name */
        j f26215b = new j();

        /* renamed from: c  reason: collision with root package name */
        j f26216c = new j();

        /* renamed from: d  reason: collision with root package name */
        C5439b f26217d;

        /* renamed from: e  reason: collision with root package name */
        boolean f26218e = true;

        /* renamed from: f  reason: collision with root package name */
        C5442e f26219f = new C5442e(this.f26214a);

        /* renamed from: g  reason: collision with root package name */
        C5442e f26220g = new C5442e(this.f26215b);

        /* renamed from: h  reason: collision with root package name */
        C5442e f26221h = new C5442e(this.f26216c);

        /* renamed from: i  reason: collision with root package name */
        f f26222i = new f();

        /* renamed from: j  reason: collision with root package name */
        int f26223j = -1;

        /* renamed from: k  reason: collision with root package name */
        int f26224k = -1;

        public c() {
            C5439b bVar = new C5439b(this.f26219f);
            this.f26217d = bVar;
            bVar.z(this.f26219f);
            this.f26217d.v(this.f26220g);
        }

        public j a(int i10) {
            return i10 == 0 ? this.f26214a : i10 == 1 ? this.f26215b : this.f26216c;
        }

        /* access modifiers changed from: package-private */
        public String b() {
            return this.f26217d.j();
        }

        public void c(int i10, int i11, float f10, h hVar) {
            this.f26223j = i11;
            this.f26224k = i10;
            if (this.f26218e) {
                this.f26217d.B(i10, i11, 1.0f, System.nanoTime());
                this.f26218e = false;
            }
            j.m(i10, i11, this.f26216c, this.f26214a, this.f26215b, hVar, f10);
            this.f26216c.f26242q = f10;
            this.f26217d.t(this.f26221h, f10, System.nanoTime(), this.f26222i);
        }

        public void d(t tVar, C5438a[] aVarArr) {
            C5482b bVar = new C5482b();
            tVar.g(bVar);
            if (aVarArr != null) {
                for (int i10 = 0; i10 < aVarArr.length; i10++) {
                    bVar.f24732e.put(aVarArr[i10].g(), aVarArr[i10]);
                }
            }
            this.f26217d.f(bVar);
        }

        public void e(t tVar) {
            C5483c cVar = new C5483c();
            tVar.g(cVar);
            this.f26217d.f(cVar);
        }

        public void f(t tVar) {
            C5484d dVar = new C5484d();
            tVar.g(dVar);
            this.f26217d.f(dVar);
        }

        public void g(c cVar) {
            this.f26217d.D(cVar.f26217d);
        }

        public void h(e eVar, int i10) {
            if (i10 == 0) {
                this.f26214a.w(eVar);
                C5442e eVar2 = this.f26219f;
                eVar2.R(eVar2);
                this.f26217d.z(this.f26219f);
                this.f26218e = true;
            } else if (i10 == 1) {
                this.f26215b.w(eVar);
                this.f26217d.v(this.f26220g);
                this.f26218e = true;
            }
            this.f26224k = -1;
        }
    }

    public h(C5575c cVar) {
        this.f26176k = cVar;
    }

    private void l(float f10) {
        int i10 = this.f26177l;
        this.f26181p = (int) (((float) i10) + 0.5f + (((float) (this.f26179n - i10)) * f10));
        int i11 = this.f26178m;
        this.f26182q = (int) (((float) i11) + 0.5f + (((float) (this.f26180o - i11)) * f10));
    }

    public j A(String str) {
        c cVar = this.f26167b.get(str);
        if (cVar == null) {
            return null;
        }
        return cVar.f26214a;
    }

    public j B(e eVar) {
        return D(eVar.f27468o, (e) null, 0).f26214a;
    }

    public float C(long j10) {
        b bVar = this.f26175j;
        if (bVar != null) {
            return bVar.f(j10);
        }
        return 0.0f;
    }

    public c D(String str, e eVar, int i10) {
        c cVar = this.f26167b.get(str);
        if (cVar == null) {
            cVar = new c();
            this.f26168c.g(cVar.f26217d);
            cVar.f26219f.R(cVar.f26217d);
            this.f26167b.put(str, cVar);
            if (eVar != null) {
                cVar.h(eVar, i10);
            }
        }
        return cVar;
    }

    public boolean E() {
        return this.f26175j != null;
    }

    public boolean F() {
        return this.f26166a.size() > 0;
    }

    public void G(int i10, int i11, float f10) {
        if (this.f26183r) {
            l(f10);
        }
        d dVar = this.f26171f;
        if (dVar != null) {
            f10 = (float) dVar.a((double) f10);
        }
        for (String str : this.f26167b.keySet()) {
            this.f26167b.get(str).c(i10, i11, f10, this);
        }
    }

    public boolean H() {
        return this.f26167b.isEmpty();
    }

    public boolean I(float f10, float f11) {
        b bVar = this.f26175j;
        if (bVar == null) {
            return false;
        }
        String str = bVar.f26198e;
        if (str == null) {
            return true;
        }
        c cVar = this.f26167b.get(str);
        if (cVar == null) {
            System.err.println("mLimitBoundsTo target is null");
            return false;
        }
        j a10 = cVar.a(2);
        return f10 >= ((float) a10.f26227b) && f10 < ((float) a10.f26229d) && f11 >= ((float) a10.f26228c) && f11 < ((float) a10.f26230e);
    }

    public boolean J(float f10) {
        return this.f26175j.g(f10);
    }

    /* access modifiers changed from: package-private */
    public void K() {
        this.f26175j = null;
        this.f26168c.h();
    }

    public void L(float f10, long j10, float f11, float f12) {
        b bVar = this.f26175j;
        if (bVar != null) {
            float[] fArr = new float[2];
            float[] c10 = this.f26175j.c();
            float[] e10 = this.f26175j.e();
            float f13 = f10;
            this.f26167b.get(bVar.f26194a).f26217d.l(f10, e10[0], e10[1], fArr);
            if (((double) Math.abs((c10[0] * fArr[0]) + (c10[1] * fArr[1]))) < 0.01d) {
                fArr[0] = 0.01f;
                fArr[1] = 0.01f;
            }
            this.f26175j.a(f10, (c10[0] != 0.0f ? f11 / fArr[0] : f12 / fArr[1]) * this.f26175j.d(), j10, ((float) this.f26173h) * 0.001f);
        }
    }

    public void M(t tVar) {
        tVar.f(this.f26168c);
        tVar.g(this);
    }

    public void N(p2.f fVar, int i10) {
        e.b[] bVarArr = fVar.f27439Z;
        e.b bVar = bVarArr[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        boolean z10 = true;
        boolean z11 = bVar == bVar2;
        this.f26183r = z11;
        if (bVarArr[1] != bVar2) {
            z10 = false;
        }
        this.f26183r = z11 | z10;
        if (i10 == 0) {
            int Y10 = fVar.Y();
            this.f26177l = Y10;
            this.f26181p = Y10;
            int x10 = fVar.x();
            this.f26178m = x10;
            this.f26182q = x10;
        } else {
            this.f26179n = fVar.Y();
            this.f26180o = fVar.x();
        }
        ArrayList<e> w12 = fVar.w1();
        int size = w12.size();
        c[] cVarArr = new c[size];
        for (int i11 = 0; i11 < size; i11++) {
            e eVar = w12.get(i11);
            c D10 = D(eVar.f27468o, (e) null, i10);
            cVarArr[i11] = D10;
            D10.h(eVar, i10);
            String b10 = D10.b();
            if (b10 != null) {
                D10.g(D(b10, (e) null, i10));
            }
        }
        k();
    }

    public int a(String str) {
        return 0;
    }

    public boolean b(int i10, int i11) {
        return false;
    }

    public boolean c(int i10, float f10) {
        if (i10 != 706) {
            return false;
        }
        this.f26174i = f10;
        return false;
    }

    public boolean d(int i10, boolean z10) {
        return false;
    }

    public boolean e(int i10, String str) {
        if (i10 != 705) {
            return false;
        }
        this.f26170e = str;
        this.f26171f = d.c(str);
        return false;
    }

    public void f(int i10, String str, String str2, int i11) {
        D(str, (e) null, i10).a(i10).c(str2, i11);
    }

    public void g(int i10, String str, String str2, float f10) {
        D(str, (e) null, i10).a(i10).d(str2, f10);
    }

    public void h(String str, t tVar, C5438a[] aVarArr) {
        D(str, (e) null, 0).d(tVar, aVarArr);
    }

    public void i(String str, t tVar) {
        D(str, (e) null, 0).e(tVar);
    }

    public void j(String str, t tVar) {
        D(str, (e) null, 0).f(tVar);
    }

    public void k() {
        float f10;
        float f11;
        float f12 = this.f26174i;
        if (f12 != 0.0f) {
            boolean z10 = ((double) f12) < 0.0d;
            float abs = Math.abs(f12);
            Iterator<String> it = this.f26167b.keySet().iterator();
            do {
                f10 = Float.MAX_VALUE;
                f11 = -3.4028235E38f;
                if (!it.hasNext()) {
                    for (String str : this.f26167b.keySet()) {
                        C5439b bVar = this.f26167b.get(str).f26217d;
                        float m10 = bVar.m() + bVar.n();
                        f10 = Math.min(f10, m10);
                        f11 = Math.max(f11, m10);
                    }
                    for (String str2 : this.f26167b.keySet()) {
                        C5439b bVar2 = this.f26167b.get(str2).f26217d;
                        float m11 = bVar2.m() + bVar2.n();
                        float f13 = f11 - f10;
                        float f14 = abs - (((m11 - f10) * abs) / f13);
                        if (z10) {
                            f14 = abs - (((f11 - m11) / f13) * abs);
                        }
                        bVar2.y(1.0f / (1.0f - abs));
                        bVar2.x(f14);
                    }
                    return;
                }
            } while (Float.isNaN(this.f26167b.get(it.next()).f26217d.p()));
            for (String str3 : this.f26167b.keySet()) {
                float p10 = this.f26167b.get(str3).f26217d.p();
                if (!Float.isNaN(p10)) {
                    f10 = Math.min(f10, p10);
                    f11 = Math.max(f11, p10);
                }
            }
            for (String str4 : this.f26167b.keySet()) {
                C5439b bVar3 = this.f26167b.get(str4).f26217d;
                float p11 = bVar3.p();
                if (!Float.isNaN(p11)) {
                    float f15 = 1.0f / (1.0f - abs);
                    float f16 = f11 - f10;
                    float f17 = abs - (((p11 - f10) * abs) / f16);
                    if (z10) {
                        f17 = abs - (((f11 - p11) / f16) * abs);
                    }
                    bVar3.y(f15);
                    bVar3.x(f17);
                }
            }
        }
    }

    public void m() {
        this.f26167b.clear();
    }

    /* access modifiers changed from: package-private */
    public b n() {
        b bVar = new b();
        this.f26175j = bVar;
        return bVar;
    }

    public float o(float f10, int i10, int i11, float f11, float f12) {
        float abs;
        float d10;
        Iterator<c> it = this.f26167b.values().iterator();
        c next = it.hasNext() ? it.next() : null;
        b bVar = this.f26175j;
        if (bVar != null && next != null) {
            String str = bVar.f26194a;
            if (str == null) {
                float[] c10 = bVar.c();
                int i12 = next.f26223j;
                float f13 = (float) i12;
                float f14 = (float) i12;
                float f15 = c10[0];
                abs = f15 != 0.0f ? (f11 * Math.abs(f15)) / f13 : (f12 * Math.abs(c10[1])) / f14;
                d10 = this.f26175j.d();
            } else {
                c cVar = this.f26167b.get(str);
                float[] c11 = this.f26175j.c();
                float[] e10 = this.f26175j.e();
                float[] fArr = new float[2];
                cVar.c(i10, i11, f10, this);
                cVar.f26217d.l(f10, e10[0], e10[1], fArr);
                float f16 = c11[0];
                abs = f16 != 0.0f ? (f11 * Math.abs(f16)) / fArr[0] : (f12 * Math.abs(c11[1])) / fArr[1];
                d10 = this.f26175j.d();
            }
            return abs * d10;
        } else if (next != null) {
            return (-f12) / ((float) next.f26223j);
        } else {
            return 1.0f;
        }
    }

    public a p(String str, int i10) {
        a aVar;
        while (i10 <= 100) {
            HashMap hashMap = this.f26166a.get(Integer.valueOf(i10));
            if (hashMap != null && (aVar = (a) hashMap.get(str)) != null) {
                return aVar;
            }
            i10++;
        }
        return null;
    }

    public a q(String str, int i10) {
        a aVar;
        while (i10 >= 0) {
            HashMap hashMap = this.f26166a.get(Integer.valueOf(i10));
            if (hashMap != null && (aVar = (a) hashMap.get(str)) != null) {
                return aVar;
            }
            i10--;
        }
        return null;
    }

    public j r(String str) {
        c cVar = this.f26167b.get(str);
        if (cVar == null) {
            return null;
        }
        return cVar.f26215b;
    }

    public j s(e eVar) {
        return D(eVar.f27468o, (e) null, 1).f26215b;
    }

    public j t(String str) {
        c cVar = this.f26167b.get(str);
        if (cVar == null) {
            return null;
        }
        return cVar.f26216c;
    }

    public j u(e eVar) {
        return D(eVar.f27468o, (e) null, 2).f26216c;
    }

    public int v() {
        return this.f26182q;
    }

    public int w() {
        return this.f26181p;
    }

    public int x(String str, float[] fArr, int[] iArr, int[] iArr2) {
        return this.f26167b.get(str).f26217d.g(fArr, iArr, iArr2);
    }

    public C5439b y(String str) {
        return D(str, (e) null, 0).f26217d;
    }

    public float[] z(String str) {
        float[] fArr = new float[124];
        this.f26167b.get(str).f26217d.h(fArr, 62);
        return fArr;
    }
}
