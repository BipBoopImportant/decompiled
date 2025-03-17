package j2;

import i2.C5438a;
import java.util.HashMap;
import java.util.HashSet;
import k2.n;
import k2.s;
import k2.u;
import k2.v;

/* renamed from: j2.e  reason: case insensitive filesystem */
public class C5485e extends C5481a {

    /* renamed from: g  reason: collision with root package name */
    private String f24782g;

    /* renamed from: h  reason: collision with root package name */
    private int f24783h = -1;

    /* renamed from: i  reason: collision with root package name */
    private float f24784i = Float.NaN;

    /* renamed from: j  reason: collision with root package name */
    private float f24785j = Float.NaN;

    /* renamed from: k  reason: collision with root package name */
    private float f24786k = Float.NaN;

    /* renamed from: l  reason: collision with root package name */
    private float f24787l = Float.NaN;

    /* renamed from: m  reason: collision with root package name */
    private float f24788m = Float.NaN;

    /* renamed from: n  reason: collision with root package name */
    private float f24789n = Float.NaN;

    /* renamed from: o  reason: collision with root package name */
    private float f24790o = Float.NaN;

    /* renamed from: p  reason: collision with root package name */
    private float f24791p = Float.NaN;

    /* renamed from: q  reason: collision with root package name */
    private float f24792q = Float.NaN;

    /* renamed from: r  reason: collision with root package name */
    private float f24793r = Float.NaN;

    /* renamed from: s  reason: collision with root package name */
    private float f24794s = Float.NaN;

    /* renamed from: t  reason: collision with root package name */
    private float f24795t = Float.NaN;

    /* renamed from: u  reason: collision with root package name */
    private int f24796u = 0;

    /* renamed from: v  reason: collision with root package name */
    private String f24797v = null;

    /* renamed from: w  reason: collision with root package name */
    private float f24798w = Float.NaN;

    /* renamed from: x  reason: collision with root package name */
    private float f24799x = 0.0f;

    public C5485e() {
        this.f24731d = 3;
        this.f24732e = new HashMap<>();
    }

    public int a(String str) {
        return u.b.a(str);
    }

    public boolean b(int i10, int i11) {
        if (i10 == 100) {
            this.f24728a = i11;
            return true;
        } else if (i10 != 421) {
            return super.b(i10, i11);
        } else {
            this.f24796u = i11;
            return true;
        }
    }

    public boolean c(int i10, float f10) {
        if (i10 == 315) {
            this.f24795t = k(Float.valueOf(f10));
            return true;
        } else if (i10 == 401) {
            this.f24783h = l(Float.valueOf(f10));
            return true;
        } else if (i10 == 403) {
            this.f24784i = f10;
            return true;
        } else if (i10 == 416) {
            this.f24789n = k(Float.valueOf(f10));
            return true;
        } else if (i10 == 423) {
            this.f24798w = k(Float.valueOf(f10));
            return true;
        } else if (i10 != 424) {
            switch (i10) {
                case 304:
                    this.f24792q = k(Float.valueOf(f10));
                    return true;
                case 305:
                    this.f24793r = k(Float.valueOf(f10));
                    return true;
                case 306:
                    this.f24794s = k(Float.valueOf(f10));
                    return true;
                case 307:
                    this.f24785j = k(Float.valueOf(f10));
                    return true;
                case 308:
                    this.f24787l = k(Float.valueOf(f10));
                    return true;
                case 309:
                    this.f24788m = k(Float.valueOf(f10));
                    return true;
                case 310:
                    this.f24786k = k(Float.valueOf(f10));
                    return true;
                case 311:
                    this.f24790o = k(Float.valueOf(f10));
                    return true;
                case 312:
                    this.f24791p = k(Float.valueOf(f10));
                    return true;
                default:
                    return super.c(i10, f10);
            }
        } else {
            this.f24799x = k(Float.valueOf(f10));
            return true;
        }
    }

    public boolean d(int i10, boolean z10) {
        return super.d(i10, z10);
    }

    public boolean e(int i10, String str) {
        if (i10 == 420) {
            this.f24782g = str;
            return true;
        } else if (i10 != 421) {
            return super.e(i10, str);
        } else {
            this.f24796u = 7;
            this.f24797v = str;
            return true;
        }
    }

    public void f(HashMap<String, n> hashMap) {
    }

    /* renamed from: g */
    public C5481a clone() {
        return new C5485e().n(this);
    }

    public void i(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f24784i)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f24785j)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f24786k)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f24787l)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f24788m)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f24790o)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f24791p)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f24789n)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f24792q)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f24793r)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f24794s)) {
            hashSet.add("translationZ");
        }
        if (this.f24732e.size() > 0) {
            for (String str : this.f24732e.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    public void m(HashMap<String, s> hashMap) {
        for (String next : hashMap.keySet()) {
            s sVar = hashMap.get(next);
            if (sVar != null) {
                if (!next.startsWith("CUSTOM")) {
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
                        case -908189618:
                            if (next.equals("scaleX")) {
                                c10 = 7;
                                break;
                            }
                            break;
                        case -908189617:
                            if (next.equals("scaleY")) {
                                c10 = 8;
                                break;
                            }
                            break;
                        case -4379043:
                            if (next.equals("elevation")) {
                                c10 = 9;
                                break;
                            }
                            break;
                        case 92909918:
                            if (next.equals("alpha")) {
                                c10 = 10;
                                break;
                            }
                            break;
                        case 803192288:
                            if (next.equals("pathRotate")) {
                                c10 = 11;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            if (Float.isNaN(this.f24787l)) {
                                break;
                            } else {
                                sVar.b(this.f24728a, this.f24787l, this.f24798w, this.f24796u, this.f24799x);
                                break;
                            }
                        case 1:
                            if (Float.isNaN(this.f24788m)) {
                                break;
                            } else {
                                sVar.b(this.f24728a, this.f24788m, this.f24798w, this.f24796u, this.f24799x);
                                break;
                            }
                        case 2:
                            if (Float.isNaN(this.f24786k)) {
                                break;
                            } else {
                                sVar.b(this.f24728a, this.f24786k, this.f24798w, this.f24796u, this.f24799x);
                                break;
                            }
                        case 3:
                            if (Float.isNaN(this.f24792q)) {
                                break;
                            } else {
                                sVar.b(this.f24728a, this.f24792q, this.f24798w, this.f24796u, this.f24799x);
                                break;
                            }
                        case 4:
                            if (Float.isNaN(this.f24793r)) {
                                break;
                            } else {
                                sVar.b(this.f24728a, this.f24793r, this.f24798w, this.f24796u, this.f24799x);
                                break;
                            }
                        case 5:
                            if (Float.isNaN(this.f24794s)) {
                                break;
                            } else {
                                sVar.b(this.f24728a, this.f24794s, this.f24798w, this.f24796u, this.f24799x);
                                break;
                            }
                        case 6:
                            if (Float.isNaN(this.f24795t)) {
                                break;
                            } else {
                                sVar.b(this.f24728a, this.f24795t, this.f24798w, this.f24796u, this.f24799x);
                                break;
                            }
                        case 7:
                            if (Float.isNaN(this.f24790o)) {
                                break;
                            } else {
                                sVar.b(this.f24728a, this.f24790o, this.f24798w, this.f24796u, this.f24799x);
                                break;
                            }
                        case 8:
                            if (Float.isNaN(this.f24791p)) {
                                break;
                            } else {
                                sVar.b(this.f24728a, this.f24791p, this.f24798w, this.f24796u, this.f24799x);
                                break;
                            }
                        case 9:
                            if (Float.isNaN(this.f24794s)) {
                                break;
                            } else {
                                sVar.b(this.f24728a, this.f24794s, this.f24798w, this.f24796u, this.f24799x);
                                break;
                            }
                        case 10:
                            if (Float.isNaN(this.f24784i)) {
                                break;
                            } else {
                                sVar.b(this.f24728a, this.f24784i, this.f24798w, this.f24796u, this.f24799x);
                                break;
                            }
                        case 11:
                            if (Float.isNaN(this.f24789n)) {
                                break;
                            } else {
                                sVar.b(this.f24728a, this.f24789n, this.f24798w, this.f24796u, this.f24799x);
                                break;
                            }
                        default:
                            v.a("KeyTimeCycles", "UNKNOWN addValues \"" + next + "\"");
                            break;
                    }
                } else {
                    C5438a aVar = this.f24732e.get(next.substring(7));
                    if (aVar != null) {
                        ((s.a) sVar).d(this.f24728a, aVar, this.f24798w, this.f24796u, this.f24799x);
                    }
                }
            }
        }
    }

    public C5485e n(C5481a aVar) {
        super.h(aVar);
        C5485e eVar = (C5485e) aVar;
        this.f24782g = eVar.f24782g;
        this.f24783h = eVar.f24783h;
        this.f24796u = eVar.f24796u;
        this.f24798w = eVar.f24798w;
        this.f24799x = eVar.f24799x;
        this.f24795t = eVar.f24795t;
        this.f24784i = eVar.f24784i;
        this.f24785j = eVar.f24785j;
        this.f24786k = eVar.f24786k;
        this.f24789n = eVar.f24789n;
        this.f24787l = eVar.f24787l;
        this.f24788m = eVar.f24788m;
        this.f24790o = eVar.f24790o;
        this.f24791p = eVar.f24791p;
        this.f24792q = eVar.f24792q;
        this.f24793r = eVar.f24793r;
        this.f24794s = eVar.f24794s;
        return this;
    }
}
