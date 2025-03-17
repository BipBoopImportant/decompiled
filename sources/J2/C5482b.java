package j2;

import i2.C5438a;
import java.util.HashMap;
import java.util.HashSet;
import k2.n;
import k2.u;

/* renamed from: j2.b  reason: case insensitive filesystem */
public class C5482b extends C5481a {

    /* renamed from: g  reason: collision with root package name */
    private String f24733g;

    /* renamed from: h  reason: collision with root package name */
    private int f24734h = -1;

    /* renamed from: i  reason: collision with root package name */
    private int f24735i = 0;

    /* renamed from: j  reason: collision with root package name */
    private float f24736j = Float.NaN;

    /* renamed from: k  reason: collision with root package name */
    private float f24737k = Float.NaN;

    /* renamed from: l  reason: collision with root package name */
    private float f24738l = Float.NaN;

    /* renamed from: m  reason: collision with root package name */
    private float f24739m = Float.NaN;

    /* renamed from: n  reason: collision with root package name */
    private float f24740n = Float.NaN;

    /* renamed from: o  reason: collision with root package name */
    private float f24741o = Float.NaN;

    /* renamed from: p  reason: collision with root package name */
    private float f24742p = Float.NaN;

    /* renamed from: q  reason: collision with root package name */
    private float f24743q = Float.NaN;

    /* renamed from: r  reason: collision with root package name */
    private float f24744r = Float.NaN;

    /* renamed from: s  reason: collision with root package name */
    private float f24745s = Float.NaN;

    /* renamed from: t  reason: collision with root package name */
    private float f24746t = Float.NaN;

    /* renamed from: u  reason: collision with root package name */
    private float f24747u = Float.NaN;

    /* renamed from: v  reason: collision with root package name */
    private float f24748v = Float.NaN;

    /* renamed from: w  reason: collision with root package name */
    private float f24749w = Float.NaN;

    public C5482b() {
        this.f24731d = 1;
        this.f24732e = new HashMap<>();
    }

    public int a(String str) {
        return u.a.a(str);
    }

    public boolean b(int i10, int i11) {
        if (i10 == 100) {
            this.f24728a = i11;
            return true;
        } else if (i10 == 301) {
            this.f24734h = i11;
            return true;
        } else if (i10 == 302) {
            this.f24735i = i11;
            return true;
        } else if (!b(i10, i11)) {
            return super.b(i10, i11);
        } else {
            return true;
        }
    }

    public boolean c(int i10, float f10) {
        if (i10 != 100) {
            switch (i10) {
                case 303:
                    this.f24736j = f10;
                    return true;
                case 304:
                    this.f24746t = f10;
                    return true;
                case 305:
                    this.f24747u = f10;
                    return true;
                case 306:
                    this.f24748v = f10;
                    return true;
                case 307:
                    this.f24737k = f10;
                    return true;
                case 308:
                    this.f24739m = f10;
                    return true;
                case 309:
                    this.f24740n = f10;
                    return true;
                case 310:
                    this.f24738l = f10;
                    return true;
                case 311:
                    this.f24744r = f10;
                    return true;
                case 312:
                    this.f24745s = f10;
                    return true;
                case 313:
                    this.f24741o = f10;
                    return true;
                case 314:
                    this.f24742p = f10;
                    return true;
                case 315:
                    this.f24749w = f10;
                    return true;
                case 316:
                    this.f24743q = f10;
                    return true;
                default:
                    return super.c(i10, f10);
            }
        } else {
            this.f24743q = f10;
            return true;
        }
    }

    public boolean e(int i10, String str) {
        if (i10 == 101) {
            this.f24730c = str;
            return true;
        } else if (i10 != 317) {
            return super.e(i10, str);
        } else {
            this.f24733g = str;
            return true;
        }
    }

    public void f(HashMap<String, n> hashMap) {
        for (String next : hashMap.keySet()) {
            n nVar = hashMap.get(next);
            if (nVar != null) {
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
                        case -4379043:
                            if (next.equals("elevation")) {
                                c10 = 11;
                                break;
                            }
                            break;
                        case 92909918:
                            if (next.equals("alpha")) {
                                c10 = 12;
                                break;
                            }
                            break;
                        case 803192288:
                            if (next.equals("pathRotate")) {
                                c10 = 13;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            if (Float.isNaN(this.f24739m)) {
                                break;
                            } else {
                                nVar.d(this.f24728a, this.f24739m);
                                break;
                            }
                        case 1:
                            if (Float.isNaN(this.f24740n)) {
                                break;
                            } else {
                                nVar.d(this.f24728a, this.f24740n);
                                break;
                            }
                        case 2:
                            if (Float.isNaN(this.f24738l)) {
                                break;
                            } else {
                                nVar.d(this.f24728a, this.f24738l);
                                break;
                            }
                        case 3:
                            if (Float.isNaN(this.f24746t)) {
                                break;
                            } else {
                                nVar.d(this.f24728a, this.f24746t);
                                break;
                            }
                        case 4:
                            if (Float.isNaN(this.f24747u)) {
                                break;
                            } else {
                                nVar.d(this.f24728a, this.f24747u);
                                break;
                            }
                        case 5:
                            if (Float.isNaN(this.f24748v)) {
                                break;
                            } else {
                                nVar.d(this.f24728a, this.f24748v);
                                break;
                            }
                        case 6:
                            if (Float.isNaN(this.f24749w)) {
                                break;
                            } else {
                                nVar.d(this.f24728a, this.f24749w);
                                break;
                            }
                        case 7:
                            if (Float.isNaN(this.f24739m)) {
                                break;
                            } else {
                                nVar.d(this.f24728a, this.f24741o);
                                break;
                            }
                        case 8:
                            if (Float.isNaN(this.f24740n)) {
                                break;
                            } else {
                                nVar.d(this.f24728a, this.f24742p);
                                break;
                            }
                        case 9:
                            if (Float.isNaN(this.f24744r)) {
                                break;
                            } else {
                                nVar.d(this.f24728a, this.f24744r);
                                break;
                            }
                        case 10:
                            if (Float.isNaN(this.f24745s)) {
                                break;
                            } else {
                                nVar.d(this.f24728a, this.f24745s);
                                break;
                            }
                        case 11:
                            if (Float.isNaN(this.f24737k)) {
                                break;
                            } else {
                                nVar.d(this.f24728a, this.f24737k);
                                break;
                            }
                        case 12:
                            if (Float.isNaN(this.f24736j)) {
                                break;
                            } else {
                                nVar.d(this.f24728a, this.f24736j);
                                break;
                            }
                        case 13:
                            if (Float.isNaN(this.f24743q)) {
                                break;
                            } else {
                                nVar.d(this.f24728a, this.f24743q);
                                break;
                            }
                        default:
                            System.err.println("not supported by KeyAttributes " + next);
                            break;
                    }
                } else {
                    C5438a aVar = this.f24732e.get(next.substring(7));
                    if (aVar != null) {
                        ((n.b) nVar).h(this.f24728a, aVar);
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public C5481a clone() {
        return null;
    }

    public void i(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f24736j)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f24737k)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f24738l)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f24739m)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f24740n)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f24741o)) {
            hashSet.add("pivotX");
        }
        if (!Float.isNaN(this.f24742p)) {
            hashSet.add("pivotY");
        }
        if (!Float.isNaN(this.f24746t)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f24747u)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f24748v)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f24743q)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f24744r)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f24745s)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f24749w)) {
            hashSet.add("progress");
        }
        if (this.f24732e.size() > 0) {
            for (String str : this.f24732e.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    public void j(HashMap<String, Integer> hashMap) {
        if (!Float.isNaN(this.f24736j)) {
            hashMap.put("alpha", Integer.valueOf(this.f24734h));
        }
        if (!Float.isNaN(this.f24737k)) {
            hashMap.put("elevation", Integer.valueOf(this.f24734h));
        }
        if (!Float.isNaN(this.f24738l)) {
            hashMap.put("rotationZ", Integer.valueOf(this.f24734h));
        }
        if (!Float.isNaN(this.f24739m)) {
            hashMap.put("rotationX", Integer.valueOf(this.f24734h));
        }
        if (!Float.isNaN(this.f24740n)) {
            hashMap.put("rotationY", Integer.valueOf(this.f24734h));
        }
        if (!Float.isNaN(this.f24741o)) {
            hashMap.put("pivotX", Integer.valueOf(this.f24734h));
        }
        if (!Float.isNaN(this.f24742p)) {
            hashMap.put("pivotY", Integer.valueOf(this.f24734h));
        }
        if (!Float.isNaN(this.f24746t)) {
            hashMap.put("translationX", Integer.valueOf(this.f24734h));
        }
        if (!Float.isNaN(this.f24747u)) {
            hashMap.put("translationY", Integer.valueOf(this.f24734h));
        }
        if (!Float.isNaN(this.f24748v)) {
            hashMap.put("translationZ", Integer.valueOf(this.f24734h));
        }
        if (!Float.isNaN(this.f24743q)) {
            hashMap.put("pathRotate", Integer.valueOf(this.f24734h));
        }
        if (!Float.isNaN(this.f24744r)) {
            hashMap.put("scaleX", Integer.valueOf(this.f24734h));
        }
        if (!Float.isNaN(this.f24745s)) {
            hashMap.put("scaleY", Integer.valueOf(this.f24734h));
        }
        if (!Float.isNaN(this.f24749w)) {
            hashMap.put("progress", Integer.valueOf(this.f24734h));
        }
        if (this.f24732e.size() > 0) {
            for (String str : this.f24732e.keySet()) {
                hashMap.put("CUSTOM," + str, Integer.valueOf(this.f24734h));
            }
        }
    }
}
