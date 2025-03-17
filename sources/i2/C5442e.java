package i2;

import java.util.Set;
import k2.u;
import m2.j;
import p2.e;

/* renamed from: i2.e  reason: case insensitive filesystem */
public class C5442e implements u {

    /* renamed from: a  reason: collision with root package name */
    j f24485a = new j();

    /* renamed from: b  reason: collision with root package name */
    a f24486b = new a();

    /* renamed from: c  reason: collision with root package name */
    b f24487c = new b();

    /* renamed from: d  reason: collision with root package name */
    private float f24488d;

    /* renamed from: e  reason: collision with root package name */
    float f24489e;

    /* renamed from: i2.e$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f24490a = null;

        /* renamed from: b  reason: collision with root package name */
        public int f24491b = 0;

        /* renamed from: c  reason: collision with root package name */
        public String f24492c = null;

        /* renamed from: d  reason: collision with root package name */
        public int f24493d = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f24494e = 0;

        /* renamed from: f  reason: collision with root package name */
        public float f24495f = Float.NaN;

        /* renamed from: g  reason: collision with root package name */
        public int f24496g = -1;

        /* renamed from: h  reason: collision with root package name */
        public float f24497h = Float.NaN;

        /* renamed from: i  reason: collision with root package name */
        public float f24498i = Float.NaN;

        /* renamed from: j  reason: collision with root package name */
        public int f24499j = -1;

        /* renamed from: k  reason: collision with root package name */
        public String f24500k = null;

        /* renamed from: l  reason: collision with root package name */
        public int f24501l = -3;

        /* renamed from: m  reason: collision with root package name */
        public int f24502m = -1;
    }

    /* renamed from: i2.e$b */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f24503a = 4;

        /* renamed from: b  reason: collision with root package name */
        public int f24504b = 0;

        /* renamed from: c  reason: collision with root package name */
        public float f24505c = 1.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f24506d = Float.NaN;
    }

    public C5442e() {
    }

    public j A() {
        return this.f24485a;
    }

    public int B() {
        j jVar = this.f24485a;
        return jVar.f26229d - jVar.f26227b;
    }

    public int C() {
        return this.f24485a.f26227b;
    }

    public int D() {
        return this.f24485a.f26228c;
    }

    public void E(int i10, int i11, int i12, int i13) {
        F(i10, i11, i12, i13);
    }

    public void F(int i10, int i11, int i12, int i13) {
        if (this.f24485a == null) {
            this.f24485a = new j((e) null);
        }
        j jVar = this.f24485a;
        jVar.f26228c = i11;
        jVar.f26227b = i10;
        jVar.f26229d = i12;
        jVar.f26230e = i13;
    }

    public void G(String str, int i10, float f10) {
        this.f24485a.r(str, i10, f10);
    }

    public void H(String str, int i10, int i11) {
        this.f24485a.s(str, i10, i11);
    }

    public void I(String str, int i10, boolean z10) {
        this.f24485a.t(str, i10, z10);
    }

    public void J(float f10) {
        this.f24485a.f26231f = f10;
    }

    public void K(float f10) {
        this.f24485a.f26232g = f10;
    }

    public void L(float f10) {
        this.f24485a.f26235j = f10;
    }

    public boolean M(int i10, float f10) {
        switch (i10) {
            case 303:
                this.f24485a.f26241p = f10;
                return true;
            case 304:
                this.f24485a.f26236k = f10;
                return true;
            case 305:
                this.f24485a.f26237l = f10;
                return true;
            case 306:
                this.f24485a.f26238m = f10;
                return true;
            case 308:
                this.f24485a.f26233h = f10;
                return true;
            case 309:
                this.f24485a.f26234i = f10;
                return true;
            case 310:
                this.f24485a.f26235j = f10;
                return true;
            case 311:
                this.f24485a.f26239n = f10;
                return true;
            case 312:
                this.f24485a.f26240o = f10;
                return true;
            case 313:
                this.f24485a.f26231f = f10;
                return true;
            case 314:
                this.f24485a.f26232g = f10;
                return true;
            case 315:
                this.f24488d = f10;
                return true;
            case 316:
                this.f24489e = f10;
                return true;
            default:
                return false;
        }
    }

    public boolean N(int i10, float f10) {
        switch (i10) {
            case 600:
                this.f24486b.f24495f = f10;
                return true;
            case 601:
                this.f24486b.f24497h = f10;
                return true;
            case 602:
                this.f24486b.f24498i = f10;
                return true;
            default:
                return false;
        }
    }

    public boolean O(int i10, int i11) {
        switch (i10) {
            case 606:
                this.f24486b.f24491b = i11;
                return true;
            case 607:
                this.f24486b.f24493d = i11;
                return true;
            case 608:
                this.f24486b.f24494e = i11;
                return true;
            case 609:
                this.f24486b.f24496g = i11;
                return true;
            case 610:
                this.f24486b.f24499j = i11;
                return true;
            case 611:
                this.f24486b.f24501l = i11;
                return true;
            case 612:
                this.f24486b.f24502m = i11;
                return true;
            default:
                return false;
        }
    }

    public boolean P(int i10, String str) {
        if (i10 == 603) {
            this.f24486b.f24492c = str;
            return true;
        } else if (i10 != 604) {
            return false;
        } else {
            this.f24486b.f24500k = str;
            return true;
        }
    }

    public void Q(int i10) {
        this.f24487c.f24503a = i10;
    }

    public void R(u uVar) {
        if (this.f24485a.j() != null) {
            this.f24485a.j().g(uVar);
        }
    }

    public int a(String str) {
        int a10 = u.a.a(str);
        return a10 != -1 ? a10 : u.c.a(str);
    }

    public boolean b(int i10, int i11) {
        if (M(i10, (float) i11)) {
            return true;
        }
        return O(i10, i11);
    }

    public boolean c(int i10, float f10) {
        if (M(i10, f10)) {
            return true;
        }
        return N(i10, f10);
    }

    public boolean d(int i10, boolean z10) {
        return false;
    }

    public boolean e(int i10, String str) {
        if (i10 != 605) {
            return P(i10, str);
        }
        this.f24486b.f24490a = str;
        return true;
    }

    public C5442e f(int i10) {
        return null;
    }

    public float g() {
        return this.f24485a.f26241p;
    }

    public int h() {
        return this.f24485a.f26230e;
    }

    public C5438a i(String str) {
        return this.f24485a.g(str);
    }

    public Set<String> j() {
        return this.f24485a.h();
    }

    public int k() {
        j jVar = this.f24485a;
        return jVar.f26230e - jVar.f26228c;
    }

    public int l() {
        return this.f24485a.f26227b;
    }

    public C5442e m() {
        return null;
    }

    public float n() {
        return this.f24485a.f26231f;
    }

    public float o() {
        return this.f24485a.f26232g;
    }

    public int p() {
        return this.f24485a.f26229d;
    }

    public float q() {
        return this.f24485a.f26233h;
    }

    public float r() {
        return this.f24485a.f26234i;
    }

    public float s() {
        return this.f24485a.f26235j;
    }

    public float t() {
        return this.f24485a.f26239n;
    }

    public String toString() {
        return this.f24485a.f26227b + ", " + this.f24485a.f26228c + ", " + this.f24485a.f26229d + ", " + this.f24485a.f26230e;
    }

    public float u() {
        return this.f24485a.f26240o;
    }

    public int v() {
        return this.f24485a.f26228c;
    }

    public float w() {
        return this.f24485a.f26236k;
    }

    public float x() {
        return this.f24485a.f26237l;
    }

    public float y() {
        return this.f24485a.f26238m;
    }

    public int z() {
        return this.f24487c.f24503a;
    }

    public C5442e(j jVar) {
        this.f24485a = jVar;
    }
}
