package j2;

import i2.C5438a;
import java.util.HashMap;
import java.util.HashSet;
import k2.g;
import k2.n;

/* renamed from: j2.c  reason: case insensitive filesystem */
public class C5483c extends C5481a {

    /* renamed from: g  reason: collision with root package name */
    private String f24750g = null;

    /* renamed from: h  reason: collision with root package name */
    private int f24751h = 0;

    /* renamed from: i  reason: collision with root package name */
    private int f24752i = -1;

    /* renamed from: j  reason: collision with root package name */
    private String f24753j = null;

    /* renamed from: k  reason: collision with root package name */
    private float f24754k = Float.NaN;

    /* renamed from: l  reason: collision with root package name */
    private float f24755l = 0.0f;

    /* renamed from: m  reason: collision with root package name */
    private float f24756m = 0.0f;

    /* renamed from: n  reason: collision with root package name */
    private float f24757n = Float.NaN;

    /* renamed from: o  reason: collision with root package name */
    private float f24758o = Float.NaN;

    /* renamed from: p  reason: collision with root package name */
    private float f24759p = Float.NaN;

    /* renamed from: q  reason: collision with root package name */
    private float f24760q = Float.NaN;

    /* renamed from: r  reason: collision with root package name */
    private float f24761r = Float.NaN;

    /* renamed from: s  reason: collision with root package name */
    private float f24762s = Float.NaN;

    /* renamed from: t  reason: collision with root package name */
    private float f24763t = Float.NaN;

    /* renamed from: u  reason: collision with root package name */
    private float f24764u = Float.NaN;

    /* renamed from: v  reason: collision with root package name */
    private float f24765v = Float.NaN;

    /* renamed from: w  reason: collision with root package name */
    private float f24766w = Float.NaN;

    /* renamed from: x  reason: collision with root package name */
    private float f24767x = Float.NaN;

    /* renamed from: y  reason: collision with root package name */
    private float f24768y = Float.NaN;

    public C5483c() {
        this.f24731d = 4;
        this.f24732e = new HashMap<>();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a(java.lang.String r3) {
        /*
            r2 = this;
            r3.hashCode()
            r0 = -1
            int r1 = r3.hashCode()
            switch(r1) {
                case -1581616630: goto L_0x010f;
                case -1310311125: goto L_0x0103;
                case -1249320806: goto L_0x00f7;
                case -1249320805: goto L_0x00eb;
                case -1249320804: goto L_0x00df;
                case -1225497657: goto L_0x00d3;
                case -1225497656: goto L_0x00c7;
                case -1225497655: goto L_0x00bb;
                case -1019779949: goto L_0x00ad;
                case -1001078227: goto L_0x009f;
                case -991726143: goto L_0x0091;
                case -987906986: goto L_0x0083;
                case -987906985: goto L_0x0076;
                case -908189618: goto L_0x0069;
                case -908189617: goto L_0x005c;
                case 92909918: goto L_0x004f;
                case 106629499: goto L_0x0042;
                case 579057826: goto L_0x0035;
                case 803192288: goto L_0x0028;
                case 1532805160: goto L_0x001b;
                case 1941332754: goto L_0x000e;
                default: goto L_0x000b;
            }
        L_0x000b:
            r3 = r0
            goto L_0x011a
        L_0x000e:
            java.lang.String r1 = "visibility"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0017
            goto L_0x000b
        L_0x0017:
            r3 = 20
            goto L_0x011a
        L_0x001b:
            java.lang.String r1 = "waveShape"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0024
            goto L_0x000b
        L_0x0024:
            r3 = 19
            goto L_0x011a
        L_0x0028:
            java.lang.String r1 = "pathRotate"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0031
            goto L_0x000b
        L_0x0031:
            r3 = 18
            goto L_0x011a
        L_0x0035:
            java.lang.String r1 = "curveFit"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x003e
            goto L_0x000b
        L_0x003e:
            r3 = 17
            goto L_0x011a
        L_0x0042:
            java.lang.String r1 = "phase"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x004b
            goto L_0x000b
        L_0x004b:
            r3 = 16
            goto L_0x011a
        L_0x004f:
            java.lang.String r1 = "alpha"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0058
            goto L_0x000b
        L_0x0058:
            r3 = 15
            goto L_0x011a
        L_0x005c:
            java.lang.String r1 = "scaleY"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0065
            goto L_0x000b
        L_0x0065:
            r3 = 14
            goto L_0x011a
        L_0x0069:
            java.lang.String r1 = "scaleX"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0072
            goto L_0x000b
        L_0x0072:
            r3 = 13
            goto L_0x011a
        L_0x0076:
            java.lang.String r1 = "pivotY"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x007f
            goto L_0x000b
        L_0x007f:
            r3 = 12
            goto L_0x011a
        L_0x0083:
            java.lang.String r1 = "pivotX"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x008d
            goto L_0x000b
        L_0x008d:
            r3 = 11
            goto L_0x011a
        L_0x0091:
            java.lang.String r1 = "period"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x009b
            goto L_0x000b
        L_0x009b:
            r3 = 10
            goto L_0x011a
        L_0x009f:
            java.lang.String r1 = "progress"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x00a9
            goto L_0x000b
        L_0x00a9:
            r3 = 9
            goto L_0x011a
        L_0x00ad:
            java.lang.String r1 = "offset"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x00b7
            goto L_0x000b
        L_0x00b7:
            r3 = 8
            goto L_0x011a
        L_0x00bb:
            java.lang.String r1 = "translationZ"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x00c5
            goto L_0x000b
        L_0x00c5:
            r3 = 7
            goto L_0x011a
        L_0x00c7:
            java.lang.String r1 = "translationY"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x00d1
            goto L_0x000b
        L_0x00d1:
            r3 = 6
            goto L_0x011a
        L_0x00d3:
            java.lang.String r1 = "translationX"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x00dd
            goto L_0x000b
        L_0x00dd:
            r3 = 5
            goto L_0x011a
        L_0x00df:
            java.lang.String r1 = "rotationZ"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x00e9
            goto L_0x000b
        L_0x00e9:
            r3 = 4
            goto L_0x011a
        L_0x00eb:
            java.lang.String r1 = "rotationY"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x00f5
            goto L_0x000b
        L_0x00f5:
            r3 = 3
            goto L_0x011a
        L_0x00f7:
            java.lang.String r1 = "rotationX"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0101
            goto L_0x000b
        L_0x0101:
            r3 = 2
            goto L_0x011a
        L_0x0103:
            java.lang.String r1 = "easing"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x010d
            goto L_0x000b
        L_0x010d:
            r3 = 1
            goto L_0x011a
        L_0x010f:
            java.lang.String r1 = "customWave"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0119
            goto L_0x000b
        L_0x0119:
            r3 = 0
        L_0x011a:
            switch(r3) {
                case 0: goto L_0x015a;
                case 1: goto L_0x0157;
                case 2: goto L_0x0154;
                case 3: goto L_0x0151;
                case 4: goto L_0x014e;
                case 5: goto L_0x014b;
                case 6: goto L_0x0148;
                case 7: goto L_0x0145;
                case 8: goto L_0x0142;
                case 9: goto L_0x013f;
                case 10: goto L_0x013c;
                case 11: goto L_0x0139;
                case 12: goto L_0x0136;
                case 13: goto L_0x0133;
                case 14: goto L_0x0130;
                case 15: goto L_0x012d;
                case 16: goto L_0x012a;
                case 17: goto L_0x0127;
                case 18: goto L_0x0124;
                case 19: goto L_0x0121;
                case 20: goto L_0x011e;
                default: goto L_0x011d;
            }
        L_0x011d:
            return r0
        L_0x011e:
            r3 = 402(0x192, float:5.63E-43)
            return r3
        L_0x0121:
            r3 = 421(0x1a5, float:5.9E-43)
            return r3
        L_0x0124:
            r3 = 416(0x1a0, float:5.83E-43)
            return r3
        L_0x0127:
            r3 = 401(0x191, float:5.62E-43)
            return r3
        L_0x012a:
            r3 = 425(0x1a9, float:5.96E-43)
            return r3
        L_0x012d:
            r3 = 403(0x193, float:5.65E-43)
            return r3
        L_0x0130:
            r3 = 312(0x138, float:4.37E-43)
            return r3
        L_0x0133:
            r3 = 311(0x137, float:4.36E-43)
            return r3
        L_0x0136:
            r3 = 314(0x13a, float:4.4E-43)
            return r3
        L_0x0139:
            r3 = 313(0x139, float:4.39E-43)
            return r3
        L_0x013c:
            r3 = 423(0x1a7, float:5.93E-43)
            return r3
        L_0x013f:
            r3 = 315(0x13b, float:4.41E-43)
            return r3
        L_0x0142:
            r3 = 424(0x1a8, float:5.94E-43)
            return r3
        L_0x0145:
            r3 = 306(0x132, float:4.29E-43)
            return r3
        L_0x0148:
            r3 = 305(0x131, float:4.27E-43)
            return r3
        L_0x014b:
            r3 = 304(0x130, float:4.26E-43)
            return r3
        L_0x014e:
            r3 = 310(0x136, float:4.34E-43)
            return r3
        L_0x0151:
            r3 = 309(0x135, float:4.33E-43)
            return r3
        L_0x0154:
            r3 = 308(0x134, float:4.32E-43)
            return r3
        L_0x0157:
            r3 = 420(0x1a4, float:5.89E-43)
            return r3
        L_0x015a:
            r3 = 422(0x1a6, float:5.91E-43)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.C5483c.a(java.lang.String):int");
    }

    public boolean b(int i10, int i11) {
        if (i10 == 401) {
            this.f24751h = i11;
            return true;
        } else if (i10 == 421) {
            this.f24752i = i11;
            return true;
        } else if (c(i10, (float) i11)) {
            return true;
        } else {
            return super.b(i10, i11);
        }
    }

    public boolean c(int i10, float f10) {
        if (i10 == 315) {
            this.f24757n = f10;
            return true;
        } else if (i10 == 403) {
            this.f24758o = f10;
            return true;
        } else if (i10 != 416) {
            switch (i10) {
                case 304:
                    this.f24766w = f10;
                    return true;
                case 305:
                    this.f24767x = f10;
                    return true;
                case 306:
                    this.f24768y = f10;
                    return true;
                case 307:
                    this.f24759p = f10;
                    return true;
                case 308:
                    this.f24762s = f10;
                    return true;
                case 309:
                    this.f24763t = f10;
                    return true;
                case 310:
                    this.f24760q = f10;
                    return true;
                case 311:
                    this.f24764u = f10;
                    return true;
                case 312:
                    this.f24765v = f10;
                    return true;
                default:
                    switch (i10) {
                        case 423:
                            this.f24754k = f10;
                            return true;
                        case 424:
                            this.f24755l = f10;
                            return true;
                        case 425:
                            this.f24756m = f10;
                            return true;
                        default:
                            return super.c(i10, f10);
                    }
            }
        } else {
            this.f24761r = f10;
            return true;
        }
    }

    public boolean e(int i10, String str) {
        if (i10 == 420) {
            this.f24750g = str;
            return true;
        } else if (i10 != 422) {
            return super.e(i10, str);
        } else {
            this.f24753j = str;
            return true;
        }
    }

    public void f(HashMap<String, n> hashMap) {
    }

    /* renamed from: g */
    public C5481a clone() {
        return null;
    }

    public void i(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f24758o)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f24759p)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f24760q)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f24762s)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f24763t)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f24764u)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f24765v)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f24761r)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f24766w)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f24767x)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f24768y)) {
            hashSet.add("translationZ");
        }
        if (this.f24732e.size() > 0) {
            for (String str : this.f24732e.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    public void m(HashMap<String, g> hashMap) {
        g gVar;
        g gVar2;
        HashMap<String, g> hashMap2 = hashMap;
        for (String next : hashMap.keySet()) {
            if (next.startsWith("CUSTOM")) {
                C5438a aVar = this.f24732e.get(next.substring(7));
                if (!(aVar == null || aVar.i() != 901 || (gVar2 = hashMap2.get(next)) == null)) {
                    gVar2.e(this.f24728a, this.f24752i, this.f24753j, -1, this.f24754k, this.f24755l, this.f24756m / 360.0f, aVar.j(), aVar);
                }
            } else {
                float n10 = n(next);
                if (!Float.isNaN(n10) && (gVar = hashMap2.get(next)) != null) {
                    int i10 = this.f24728a;
                    int i11 = this.f24752i;
                    String str = this.f24753j;
                    float f10 = this.f24754k;
                    gVar.d(i10, i11, str, -1, f10, this.f24755l, this.f24756m / 360.0f, n10);
                }
            }
        }
    }

    public float n(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1019779949:
                if (str.equals("offset")) {
                    c10 = 6;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c10 = 7;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c10 = 8;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c10 = 9;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c10 = 10;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c10 = 11;
                    break;
                }
                break;
            case 106629499:
                if (str.equals("phase")) {
                    c10 = 12;
                    break;
                }
                break;
            case 803192288:
                if (str.equals("pathRotate")) {
                    c10 = 13;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return this.f24762s;
            case 1:
                return this.f24763t;
            case 2:
                return this.f24760q;
            case 3:
                return this.f24766w;
            case 4:
                return this.f24767x;
            case 5:
                return this.f24768y;
            case 6:
                return this.f24755l;
            case 7:
                return this.f24757n;
            case 8:
                return this.f24764u;
            case 9:
                return this.f24765v;
            case 10:
                return this.f24759p;
            case 11:
                return this.f24758o;
            case 12:
                return this.f24756m;
            case 13:
                return this.f24761r;
            default:
                return Float.NaN;
        }
    }
}
