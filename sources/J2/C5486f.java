package j2;

import i2.C5442e;
import java.util.HashMap;
import java.util.HashSet;
import k2.e;
import k2.n;

/* renamed from: j2.f  reason: case insensitive filesystem */
public class C5486f extends C5481a {

    /* renamed from: g  reason: collision with root package name */
    private int f24800g = -1;

    /* renamed from: h  reason: collision with root package name */
    private String f24801h = null;

    /* renamed from: i  reason: collision with root package name */
    private int f24802i;

    /* renamed from: j  reason: collision with root package name */
    private String f24803j;

    /* renamed from: k  reason: collision with root package name */
    private String f24804k;

    /* renamed from: l  reason: collision with root package name */
    private int f24805l;

    /* renamed from: m  reason: collision with root package name */
    private int f24806m;

    /* renamed from: n  reason: collision with root package name */
    float f24807n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f24808o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f24809p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f24810q;

    /* renamed from: r  reason: collision with root package name */
    private float f24811r;

    /* renamed from: s  reason: collision with root package name */
    private float f24812s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f24813t;

    /* renamed from: u  reason: collision with root package name */
    int f24814u;

    /* renamed from: v  reason: collision with root package name */
    int f24815v;

    /* renamed from: w  reason: collision with root package name */
    int f24816w;

    /* renamed from: x  reason: collision with root package name */
    e f24817x;

    /* renamed from: y  reason: collision with root package name */
    e f24818y;

    public C5486f() {
        int i10 = C5481a.f24727f;
        this.f24802i = i10;
        this.f24803j = null;
        this.f24804k = null;
        this.f24805l = i10;
        this.f24806m = i10;
        this.f24807n = 0.1f;
        this.f24808o = true;
        this.f24809p = true;
        this.f24810q = true;
        this.f24811r = Float.NaN;
        this.f24813t = false;
        this.f24814u = i10;
        this.f24815v = i10;
        this.f24816w = i10;
        this.f24817x = new e();
        this.f24818y = new e();
        this.f24731d = 5;
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
                case -1594793529: goto L_0x0082;
                case -966421266: goto L_0x0077;
                case -786670827: goto L_0x006c;
                case -648752941: goto L_0x0061;
                case -638126837: goto L_0x0056;
                case -76025313: goto L_0x004b;
                case -9754574: goto L_0x0040;
                case 364489912: goto L_0x0035;
                case 1301930599: goto L_0x0028;
                case 1401391082: goto L_0x001b;
                case 1535404999: goto L_0x000e;
                default: goto L_0x000b;
            }
        L_0x000b:
            r3 = r0
            goto L_0x008c
        L_0x000e:
            java.lang.String r1 = "triggerReceiver"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0017
            goto L_0x000b
        L_0x0017:
            r3 = 10
            goto L_0x008c
        L_0x001b:
            java.lang.String r1 = "postLayout"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0024
            goto L_0x000b
        L_0x0024:
            r3 = 9
            goto L_0x008c
        L_0x0028:
            java.lang.String r1 = "viewTransitionOnCross"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0031
            goto L_0x000b
        L_0x0031:
            r3 = 8
            goto L_0x008c
        L_0x0035:
            java.lang.String r1 = "triggerSlack"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x003e
            goto L_0x000b
        L_0x003e:
            r3 = 7
            goto L_0x008c
        L_0x0040:
            java.lang.String r1 = "viewTransitionOnNegativeCross"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0049
            goto L_0x000b
        L_0x0049:
            r3 = 6
            goto L_0x008c
        L_0x004b:
            java.lang.String r1 = "triggerCollisionView"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0054
            goto L_0x000b
        L_0x0054:
            r3 = 5
            goto L_0x008c
        L_0x0056:
            java.lang.String r1 = "negativeCross"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x005f
            goto L_0x000b
        L_0x005f:
            r3 = 4
            goto L_0x008c
        L_0x0061:
            java.lang.String r1 = "triggerID"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x006a
            goto L_0x000b
        L_0x006a:
            r3 = 3
            goto L_0x008c
        L_0x006c:
            java.lang.String r1 = "triggerCollisionId"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0075
            goto L_0x000b
        L_0x0075:
            r3 = 2
            goto L_0x008c
        L_0x0077:
            java.lang.String r1 = "viewTransitionOnPositiveCross"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0080
            goto L_0x000b
        L_0x0080:
            r3 = 1
            goto L_0x008c
        L_0x0082:
            java.lang.String r1 = "positiveCross"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x008b
            goto L_0x000b
        L_0x008b:
            r3 = 0
        L_0x008c:
            switch(r3) {
                case 0: goto L_0x00ae;
                case 1: goto L_0x00ab;
                case 2: goto L_0x00a8;
                case 3: goto L_0x00a5;
                case 4: goto L_0x00a2;
                case 5: goto L_0x009f;
                case 6: goto L_0x009c;
                case 7: goto L_0x0099;
                case 8: goto L_0x0096;
                case 9: goto L_0x0093;
                case 10: goto L_0x0090;
                default: goto L_0x008f;
            }
        L_0x008f:
            return r0
        L_0x0090:
            r3 = 311(0x137, float:4.36E-43)
            return r3
        L_0x0093:
            r3 = 304(0x130, float:4.26E-43)
            return r3
        L_0x0096:
            r3 = 301(0x12d, float:4.22E-43)
            return r3
        L_0x0099:
            r3 = 305(0x131, float:4.27E-43)
            return r3
        L_0x009c:
            r3 = 303(0x12f, float:4.25E-43)
            return r3
        L_0x009f:
            r3 = 306(0x132, float:4.29E-43)
            return r3
        L_0x00a2:
            r3 = 310(0x136, float:4.34E-43)
            return r3
        L_0x00a5:
            r3 = 308(0x134, float:4.32E-43)
            return r3
        L_0x00a8:
            r3 = 307(0x133, float:4.3E-43)
            return r3
        L_0x00ab:
            r3 = 302(0x12e, float:4.23E-43)
            return r3
        L_0x00ae:
            r3 = 309(0x135, float:4.33E-43)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.C5486f.a(java.lang.String):int");
    }

    public boolean b(int i10, int i11) {
        if (i10 == 307) {
            this.f24806m = i11;
            return true;
        } else if (i10 == 308) {
            this.f24805l = l(Integer.valueOf(i11));
            return true;
        } else if (i10 != 311) {
            switch (i10) {
                case 301:
                    this.f24816w = i11;
                    return true;
                case 302:
                    this.f24815v = i11;
                    return true;
                case 303:
                    this.f24814u = i11;
                    return true;
                default:
                    return super.b(i10, i11);
            }
        } else {
            this.f24802i = i11;
            return true;
        }
    }

    public boolean c(int i10, float f10) {
        if (i10 != 305) {
            return super.c(i10, f10);
        }
        this.f24807n = f10;
        return true;
    }

    public boolean d(int i10, boolean z10) {
        if (i10 != 304) {
            return super.d(i10, z10);
        }
        this.f24813t = z10;
        return true;
    }

    public boolean e(int i10, String str) {
        if (i10 == 309) {
            this.f24804k = str;
            return true;
        } else if (i10 == 310) {
            this.f24803j = str;
            return true;
        } else if (i10 != 312) {
            return super.e(i10, str);
        } else {
            this.f24801h = str;
            return true;
        }
    }

    public void f(HashMap<String, n> hashMap) {
    }

    /* renamed from: g */
    public C5481a clone() {
        return new C5486f().n(this);
    }

    public void i(HashSet<String> hashSet) {
    }

    public void m(float f10, C5442e eVar) {
    }

    public C5486f n(C5481a aVar) {
        super.h(aVar);
        C5486f fVar = (C5486f) aVar;
        this.f24800g = fVar.f24800g;
        this.f24801h = fVar.f24801h;
        this.f24802i = fVar.f24802i;
        this.f24803j = fVar.f24803j;
        this.f24804k = fVar.f24804k;
        this.f24805l = fVar.f24805l;
        this.f24806m = fVar.f24806m;
        this.f24807n = fVar.f24807n;
        this.f24808o = fVar.f24808o;
        this.f24809p = fVar.f24809p;
        this.f24810q = fVar.f24810q;
        this.f24811r = fVar.f24811r;
        this.f24812s = fVar.f24812s;
        this.f24813t = fVar.f24813t;
        this.f24817x = fVar.f24817x;
        this.f24818y = fVar.f24818y;
        return this;
    }
}
