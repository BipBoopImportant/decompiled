package i2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import k2.n;
import k2.v;

/* renamed from: i2.c  reason: case insensitive filesystem */
class C5440c implements Comparable<C5440c> {

    /* renamed from: C  reason: collision with root package name */
    static String[] f24436C = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: A  reason: collision with root package name */
    double[] f24437A = new double[18];

    /* renamed from: B  reason: collision with root package name */
    double[] f24438B = new double[18];

    /* renamed from: a  reason: collision with root package name */
    private float f24439a = 1.0f;

    /* renamed from: b  reason: collision with root package name */
    int f24440b = 0;

    /* renamed from: c  reason: collision with root package name */
    int f24441c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f24442d = false;

    /* renamed from: e  reason: collision with root package name */
    private float f24443e = 0.0f;

    /* renamed from: f  reason: collision with root package name */
    private float f24444f = 0.0f;

    /* renamed from: g  reason: collision with root package name */
    private float f24445g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f24446h = 0.0f;

    /* renamed from: i  reason: collision with root package name */
    private float f24447i = 1.0f;

    /* renamed from: j  reason: collision with root package name */
    private float f24448j = 1.0f;

    /* renamed from: k  reason: collision with root package name */
    private float f24449k = Float.NaN;

    /* renamed from: l  reason: collision with root package name */
    private float f24450l = Float.NaN;

    /* renamed from: m  reason: collision with root package name */
    private float f24451m = 0.0f;

    /* renamed from: n  reason: collision with root package name */
    private float f24452n = 0.0f;

    /* renamed from: o  reason: collision with root package name */
    private float f24453o = 0.0f;

    /* renamed from: p  reason: collision with root package name */
    private int f24454p = 0;

    /* renamed from: q  reason: collision with root package name */
    private float f24455q;

    /* renamed from: r  reason: collision with root package name */
    private float f24456r;

    /* renamed from: s  reason: collision with root package name */
    private float f24457s;

    /* renamed from: t  reason: collision with root package name */
    private float f24458t;

    /* renamed from: u  reason: collision with root package name */
    private float f24459u;

    /* renamed from: v  reason: collision with root package name */
    private float f24460v = Float.NaN;

    /* renamed from: w  reason: collision with root package name */
    private float f24461w = Float.NaN;

    /* renamed from: x  reason: collision with root package name */
    private int f24462x = -1;

    /* renamed from: y  reason: collision with root package name */
    LinkedHashMap<String, C5438a> f24463y = new LinkedHashMap<>();

    /* renamed from: z  reason: collision with root package name */
    int f24464z = 0;

    C5440c() {
    }

    private boolean m(float f10, float f11) {
        return (Float.isNaN(f10) || Float.isNaN(f11)) ? Float.isNaN(f10) != Float.isNaN(f11) : Math.abs(f10 - f11) > 1.0E-6f;
    }

    public void B(C5442e eVar) {
        v((float) eVar.C(), (float) eVar.D(), (float) eVar.B(), (float) eVar.k());
        b(eVar);
    }

    public void a(HashMap<String, n> hashMap, int i10) {
        for (String next : hashMap.keySet()) {
            n nVar = hashMap.get(next);
            next.hashCode();
            float f10 = 1.0f;
            float f11 = 0.0f;
            char c10 = 65535;
            switch (next.hashCode()) {
                case -1249320806:
                    if (next.equals("rotationX")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (next.equals("rotationY")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1249320804:
                    if (next.equals("rotationZ")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1225497657:
                    if (next.equals("translationX")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -1225497656:
                    if (next.equals("translationY")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case -1225497655:
                    if (next.equals("translationZ")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case -1001078227:
                    if (next.equals("progress")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case -987906986:
                    if (next.equals("pivotX")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case -987906985:
                    if (next.equals("pivotY")) {
                        c10 = 8;
                        break;
                    }
                    break;
                case -908189618:
                    if (next.equals("scaleX")) {
                        c10 = 9;
                        break;
                    }
                    break;
                case -908189617:
                    if (next.equals("scaleY")) {
                        c10 = 10;
                        break;
                    }
                    break;
                case 92909918:
                    if (next.equals("alpha")) {
                        c10 = 11;
                        break;
                    }
                    break;
                case 803192288:
                    if (next.equals("pathRotate")) {
                        c10 = 12;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    if (!Float.isNaN(this.f24445g)) {
                        f11 = this.f24445g;
                    }
                    nVar.d(i10, f11);
                    break;
                case 1:
                    if (!Float.isNaN(this.f24446h)) {
                        f11 = this.f24446h;
                    }
                    nVar.d(i10, f11);
                    break;
                case 2:
                    if (!Float.isNaN(this.f24444f)) {
                        f11 = this.f24444f;
                    }
                    nVar.d(i10, f11);
                    break;
                case 3:
                    if (!Float.isNaN(this.f24451m)) {
                        f11 = this.f24451m;
                    }
                    nVar.d(i10, f11);
                    break;
                case 4:
                    if (!Float.isNaN(this.f24452n)) {
                        f11 = this.f24452n;
                    }
                    nVar.d(i10, f11);
                    break;
                case 5:
                    if (!Float.isNaN(this.f24453o)) {
                        f11 = this.f24453o;
                    }
                    nVar.d(i10, f11);
                    break;
                case 6:
                    if (!Float.isNaN(this.f24461w)) {
                        f11 = this.f24461w;
                    }
                    nVar.d(i10, f11);
                    break;
                case 7:
                    if (!Float.isNaN(this.f24449k)) {
                        f11 = this.f24449k;
                    }
                    nVar.d(i10, f11);
                    break;
                case 8:
                    if (!Float.isNaN(this.f24450l)) {
                        f11 = this.f24450l;
                    }
                    nVar.d(i10, f11);
                    break;
                case 9:
                    if (!Float.isNaN(this.f24447i)) {
                        f10 = this.f24447i;
                    }
                    nVar.d(i10, f10);
                    break;
                case 10:
                    if (!Float.isNaN(this.f24448j)) {
                        f10 = this.f24448j;
                    }
                    nVar.d(i10, f10);
                    break;
                case 11:
                    if (!Float.isNaN(this.f24439a)) {
                        f10 = this.f24439a;
                    }
                    nVar.d(i10, f10);
                    break;
                case 12:
                    if (!Float.isNaN(this.f24460v)) {
                        f11 = this.f24460v;
                    }
                    nVar.d(i10, f11);
                    break;
                default:
                    if (!next.startsWith("CUSTOM")) {
                        v.a("MotionPaths", "UNKNOWN spline " + next);
                        break;
                    } else {
                        String str = next.split(",")[1];
                        if (!this.f24463y.containsKey(str)) {
                            break;
                        } else {
                            C5438a aVar = this.f24463y.get(str);
                            if (!(nVar instanceof n.b)) {
                                v.a("MotionPaths", next + " ViewSpline not a CustomSet frame = " + i10 + ", value" + aVar.j() + nVar);
                                break;
                            } else {
                                ((n.b) nVar).h(i10, aVar);
                                break;
                            }
                        }
                    }
            }
        }
    }

    public void b(C5442e eVar) {
        this.f24441c = eVar.z();
        this.f24439a = eVar.z() != 4 ? 0.0f : eVar.g();
        this.f24442d = false;
        this.f24444f = eVar.s();
        this.f24445g = eVar.q();
        this.f24446h = eVar.r();
        this.f24447i = eVar.t();
        this.f24448j = eVar.u();
        this.f24449k = eVar.n();
        this.f24450l = eVar.o();
        this.f24451m = eVar.w();
        this.f24452n = eVar.x();
        this.f24453o = eVar.y();
        for (String next : eVar.j()) {
            C5438a i10 = eVar.i(next);
            if (i10 != null && i10.l()) {
                this.f24463y.put(next, i10);
            }
        }
    }

    /* renamed from: j */
    public int compareTo(C5440c cVar) {
        return Float.compare(this.f24455q, cVar.f24455q);
    }

    /* access modifiers changed from: package-private */
    public void n(C5440c cVar, HashSet<String> hashSet) {
        if (m(this.f24439a, cVar.f24439a)) {
            hashSet.add("alpha");
        }
        if (m(this.f24443e, cVar.f24443e)) {
            hashSet.add("translationZ");
        }
        int i10 = this.f24441c;
        int i11 = cVar.f24441c;
        if (i10 != i11 && this.f24440b == 0 && (i10 == 4 || i11 == 4)) {
            hashSet.add("alpha");
        }
        if (m(this.f24444f, cVar.f24444f)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f24460v) || !Float.isNaN(cVar.f24460v)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f24461w) || !Float.isNaN(cVar.f24461w)) {
            hashSet.add("progress");
        }
        if (m(this.f24445g, cVar.f24445g)) {
            hashSet.add("rotationX");
        }
        if (m(this.f24446h, cVar.f24446h)) {
            hashSet.add("rotationY");
        }
        if (m(this.f24449k, cVar.f24449k)) {
            hashSet.add("pivotX");
        }
        if (m(this.f24450l, cVar.f24450l)) {
            hashSet.add("pivotY");
        }
        if (m(this.f24447i, cVar.f24447i)) {
            hashSet.add("scaleX");
        }
        if (m(this.f24448j, cVar.f24448j)) {
            hashSet.add("scaleY");
        }
        if (m(this.f24451m, cVar.f24451m)) {
            hashSet.add("translationX");
        }
        if (m(this.f24452n, cVar.f24452n)) {
            hashSet.add("translationY");
        }
        if (m(this.f24453o, cVar.f24453o)) {
            hashSet.add("translationZ");
        }
        if (m(this.f24443e, cVar.f24443e)) {
            hashSet.add("elevation");
        }
    }

    /* access modifiers changed from: package-private */
    public void v(float f10, float f11, float f12, float f13) {
        this.f24456r = f10;
        this.f24457s = f11;
        this.f24458t = f12;
        this.f24459u = f13;
    }
}
