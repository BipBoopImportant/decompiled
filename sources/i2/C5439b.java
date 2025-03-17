package i2;

import j2.C5481a;
import j2.C5486f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import k2.b;
import k2.c;
import k2.d;
import k2.f;
import k2.g;
import k2.l;
import k2.n;
import k2.s;
import k2.t;
import k2.u;
import k2.v;

/* renamed from: i2.b  reason: case insensitive filesystem */
public class C5439b implements u {

    /* renamed from: A  reason: collision with root package name */
    private int f24400A = -1;

    /* renamed from: B  reason: collision with root package name */
    private int f24401B = -1;

    /* renamed from: C  reason: collision with root package name */
    private C5442e f24402C = null;

    /* renamed from: D  reason: collision with root package name */
    private int f24403D = -1;

    /* renamed from: E  reason: collision with root package name */
    private float f24404E = Float.NaN;

    /* renamed from: F  reason: collision with root package name */
    private c f24405F = null;

    /* renamed from: G  reason: collision with root package name */
    private boolean f24406G = false;

    /* renamed from: H  reason: collision with root package name */
    C5439b f24407H;

    /* renamed from: a  reason: collision with root package name */
    l f24408a = new l();

    /* renamed from: b  reason: collision with root package name */
    C5442e f24409b;

    /* renamed from: c  reason: collision with root package name */
    private int f24410c = 0;

    /* renamed from: d  reason: collision with root package name */
    private C5441d f24411d = new C5441d();

    /* renamed from: e  reason: collision with root package name */
    private C5441d f24412e = new C5441d();

    /* renamed from: f  reason: collision with root package name */
    private C5440c f24413f = new C5440c();

    /* renamed from: g  reason: collision with root package name */
    private C5440c f24414g = new C5440c();

    /* renamed from: h  reason: collision with root package name */
    private b[] f24415h;

    /* renamed from: i  reason: collision with root package name */
    private b f24416i;

    /* renamed from: j  reason: collision with root package name */
    float f24417j = Float.NaN;

    /* renamed from: k  reason: collision with root package name */
    float f24418k = 0.0f;

    /* renamed from: l  reason: collision with root package name */
    float f24419l = 1.0f;

    /* renamed from: m  reason: collision with root package name */
    private int[] f24420m;

    /* renamed from: n  reason: collision with root package name */
    private double[] f24421n;

    /* renamed from: o  reason: collision with root package name */
    private double[] f24422o;

    /* renamed from: p  reason: collision with root package name */
    private String[] f24423p;

    /* renamed from: q  reason: collision with root package name */
    private int[] f24424q;

    /* renamed from: r  reason: collision with root package name */
    private int f24425r = 4;

    /* renamed from: s  reason: collision with root package name */
    private float[] f24426s = new float[4];

    /* renamed from: t  reason: collision with root package name */
    private ArrayList<C5441d> f24427t = new ArrayList<>();

    /* renamed from: u  reason: collision with root package name */
    private float[] f24428u = new float[1];

    /* renamed from: v  reason: collision with root package name */
    private ArrayList<C5481a> f24429v = new ArrayList<>();

    /* renamed from: w  reason: collision with root package name */
    private HashMap<String, s> f24430w;

    /* renamed from: x  reason: collision with root package name */
    private HashMap<String, n> f24431x;

    /* renamed from: y  reason: collision with root package name */
    private HashMap<String, g> f24432y;

    /* renamed from: z  reason: collision with root package name */
    private C5486f[] f24433z;

    /* renamed from: i2.b$a */
    class a implements c {

        /* renamed from: a  reason: collision with root package name */
        float f24434a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f24435b;

        a(d dVar) {
            this.f24435b = dVar;
        }

        public float getInterpolation(float f10) {
            this.f24434a = f10;
            return (float) this.f24435b.a((double) f10);
        }
    }

    public C5439b(C5442e eVar) {
        A(eVar);
    }

    private void C() {
        C5439b bVar = this.f24407H;
        if (bVar != null) {
            this.f24411d.M(bVar, bVar.f24411d);
            C5441d dVar = this.f24412e;
            C5439b bVar2 = this.f24407H;
            dVar.M(bVar2, bVar2.f24412e);
        }
    }

    private float i(float f10, float[] fArr) {
        float f11 = 0.0f;
        float f12 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f13 = this.f24419l;
            if (((double) f13) != 1.0d) {
                float f14 = this.f24418k;
                if (f10 < f14) {
                    f10 = 0.0f;
                }
                if (f10 > f14 && ((double) f10) < 1.0d) {
                    f10 = Math.min((f10 - f14) * f13, 1.0f);
                }
            }
        }
        d dVar = this.f24411d.f24466a;
        Iterator<C5441d> it = this.f24427t.iterator();
        float f15 = Float.NaN;
        while (it.hasNext()) {
            C5441d next = it.next();
            d dVar2 = next.f24466a;
            if (dVar2 != null) {
                float f16 = next.f24468c;
                if (f16 < f10) {
                    dVar = dVar2;
                    f11 = f16;
                } else if (Float.isNaN(f15)) {
                    f15 = next.f24468c;
                }
            }
        }
        if (dVar != null) {
            if (!Float.isNaN(f15)) {
                f12 = f15;
            }
            float f17 = f12 - f11;
            double d10 = (double) ((f10 - f11) / f17);
            f10 = (((float) dVar.a(d10)) * f17) + f11;
            if (fArr != null) {
                fArr[0] = (float) dVar.b(d10);
            }
        }
        return f10;
    }

    private static c o(int i10, String str, int i11) {
        if (i10 != -1) {
            return null;
        }
        return new a(d.c(str));
    }

    private float q() {
        char c10;
        float[] fArr = new float[2];
        float f10 = 1.0f / ((float) 99);
        double d10 = 0.0d;
        double d11 = 0.0d;
        int i10 = 0;
        float f11 = 0.0f;
        while (i10 < 100) {
            float f12 = ((float) i10) * f10;
            double d12 = (double) f12;
            d dVar = this.f24411d.f24466a;
            Iterator<C5441d> it = this.f24427t.iterator();
            float f13 = Float.NaN;
            float f14 = 0.0f;
            while (it.hasNext()) {
                C5441d next = it.next();
                d dVar2 = next.f24466a;
                if (dVar2 != null) {
                    float f15 = next.f24468c;
                    if (f15 < f12) {
                        dVar = dVar2;
                        f14 = f15;
                    } else if (Float.isNaN(f13)) {
                        f13 = next.f24468c;
                    }
                }
            }
            if (dVar != null) {
                if (Float.isNaN(f13)) {
                    f13 = 1.0f;
                }
                float f16 = f13 - f14;
                d12 = (double) ((((float) dVar.a((double) ((f12 - f14) / f16))) * f16) + f14);
            }
            this.f24415h[0].d(d12, this.f24421n);
            int i11 = i10;
            this.f24411d.v(d12, this.f24420m, this.f24421n, fArr, 0);
            if (i11 > 0) {
                c10 = 0;
                f11 += (float) Math.hypot(d11 - ((double) fArr[1]), d10 - ((double) fArr[0]));
            } else {
                c10 = 0;
            }
            d10 = (double) fArr[c10];
            i10 = i11 + 1;
            d11 = (double) fArr[1];
        }
        return f11;
    }

    private void s(C5441d dVar) {
        Iterator<C5441d> it = this.f24427t.iterator();
        C5441d dVar2 = null;
        while (it.hasNext()) {
            C5441d next = it.next();
            if (dVar.f24469d == next.f24469d) {
                dVar2 = next;
            }
        }
        if (dVar2 != null) {
            this.f24427t.remove(dVar2);
        }
        int binarySearch = Collections.binarySearch(this.f24427t, dVar);
        if (binarySearch == 0) {
            v.a("MotionController", " KeyPath position \"" + dVar.f24469d + "\" outside of range");
        }
        this.f24427t.add((-binarySearch) - 1, dVar);
    }

    private void u(C5441d dVar) {
        dVar.J((float) this.f24409b.C(), (float) this.f24409b.D(), (float) this.f24409b.B(), (float) this.f24409b.k());
    }

    public void A(C5442e eVar) {
        this.f24409b = eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0162, code lost:
        r9 = (java.lang.Integer) r6.get(r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B(int r20, int r21, float r22, long r23) {
        /*
            r19 = this;
            r0 = r19
            r1 = r23
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r19.C()
            int r7 = r0.f24400A
            r8 = -1
            if (r7 == r8) goto L_0x002d
            i2.d r9 = r0.f24411d
            int r10 = r9.f24476k
            if (r10 != r8) goto L_0x002d
            r9.f24476k = r7
        L_0x002d:
            i2.c r7 = r0.f24413f
            i2.c r9 = r0.f24414g
            r7.n(r9, r4)
            java.util.ArrayList<j2.a> r7 = r0.f24429v
            if (r7 == 0) goto L_0x0095
            java.util.Iterator r7 = r7.iterator()
            r10 = 0
        L_0x003d:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L_0x0096
            java.lang.Object r11 = r7.next()
            j2.a r11 = (j2.C5481a) r11
            boolean r12 = r11 instanceof j2.C5484d
            if (r12 == 0) goto L_0x006d
            j2.d r11 = (j2.C5484d) r11
            i2.d r12 = new i2.d
            i2.d r15 = r0.f24411d
            i2.d r14 = r0.f24412e
            r13 = r12
            r18 = r14
            r14 = r20
            r17 = r15
            r15 = r21
            r16 = r11
            r13.<init>(r14, r15, r16, r17, r18)
            r0.s(r12)
            int r11 = r11.f24769g
            if (r11 == r8) goto L_0x003d
            r0.f24410c = r11
            goto L_0x003d
        L_0x006d:
            boolean r12 = r11 instanceof j2.C5483c
            if (r12 == 0) goto L_0x0075
            r11.i(r5)
            goto L_0x003d
        L_0x0075:
            boolean r12 = r11 instanceof j2.C5485e
            if (r12 == 0) goto L_0x007d
            r11.i(r3)
            goto L_0x003d
        L_0x007d:
            boolean r12 = r11 instanceof j2.C5486f
            if (r12 == 0) goto L_0x008e
            if (r10 != 0) goto L_0x0088
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x0088:
            j2.f r11 = (j2.C5486f) r11
            r10.add(r11)
            goto L_0x003d
        L_0x008e:
            r11.j(r6)
            r11.i(r4)
            goto L_0x003d
        L_0x0095:
            r10 = 0
        L_0x0096:
            r7 = 0
            if (r10 == 0) goto L_0x00a3
            j2.f[] r11 = new j2.C5486f[r7]
            java.lang.Object[] r10 = r10.toArray(r11)
            j2.f[] r10 = (j2.C5486f[]) r10
            r0.f24433z = r10
        L_0x00a3:
            boolean r10 = r4.isEmpty()
            java.lang.String r11 = ","
            java.lang.String r12 = "CUSTOM,"
            r13 = 1
            if (r10 != 0) goto L_0x017e
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            r0.f24431x = r10
            java.util.Iterator r10 = r4.iterator()
        L_0x00b9:
            boolean r14 = r10.hasNext()
            if (r14 == 0) goto L_0x0117
            java.lang.Object r14 = r10.next()
            java.lang.String r14 = (java.lang.String) r14
            boolean r15 = r14.startsWith(r12)
            if (r15 == 0) goto L_0x0104
            k2.h r15 = new k2.h
            r15.<init>()
            java.lang.String[] r16 = r14.split(r11)
            r9 = r16[r13]
            java.util.ArrayList<j2.a> r8 = r0.f24429v
            java.util.Iterator r8 = r8.iterator()
        L_0x00dc:
            boolean r17 = r8.hasNext()
            if (r17 == 0) goto L_0x00ff
            java.lang.Object r17 = r8.next()
            r13 = r17
            j2.a r13 = (j2.C5481a) r13
            java.util.HashMap<java.lang.String, i2.a> r7 = r13.f24732e
            if (r7 != 0) goto L_0x00f1
        L_0x00ee:
            r7 = 0
            r13 = 1
            goto L_0x00dc
        L_0x00f1:
            java.lang.Object r7 = r7.get(r9)
            i2.a r7 = (i2.C5438a) r7
            if (r7 == 0) goto L_0x00ee
            int r13 = r13.f24728a
            r15.a(r13, r7)
            goto L_0x00ee
        L_0x00ff:
            k2.n r7 = k2.n.b(r14, r15)
            goto L_0x0108
        L_0x0104:
            k2.n r7 = k2.n.c(r14, r1)
        L_0x0108:
            if (r7 != 0) goto L_0x010e
        L_0x010a:
            r7 = 0
            r8 = -1
            r13 = 1
            goto L_0x00b9
        L_0x010e:
            r7.f(r14)
            java.util.HashMap<java.lang.String, k2.n> r8 = r0.f24431x
            r8.put(r14, r7)
            goto L_0x010a
        L_0x0117:
            java.util.ArrayList<j2.a> r7 = r0.f24429v
            if (r7 == 0) goto L_0x0135
            java.util.Iterator r7 = r7.iterator()
        L_0x011f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0135
            java.lang.Object r8 = r7.next()
            j2.a r8 = (j2.C5481a) r8
            boolean r9 = r8 instanceof j2.C5482b
            if (r9 == 0) goto L_0x011f
            java.util.HashMap<java.lang.String, k2.n> r9 = r0.f24431x
            r8.f(r9)
            goto L_0x011f
        L_0x0135:
            i2.c r7 = r0.f24413f
            java.util.HashMap<java.lang.String, k2.n> r8 = r0.f24431x
            r9 = 0
            r7.a(r8, r9)
            i2.c r7 = r0.f24414g
            java.util.HashMap<java.lang.String, k2.n> r8 = r0.f24431x
            r9 = 100
            r7.a(r8, r9)
            java.util.HashMap<java.lang.String, k2.n> r7 = r0.f24431x
            java.util.Set r7 = r7.keySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x0150:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x017e
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            boolean r9 = r6.containsKey(r8)
            if (r9 == 0) goto L_0x016f
            java.lang.Object r9 = r6.get(r8)
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 == 0) goto L_0x016f
            int r9 = r9.intValue()
            goto L_0x0170
        L_0x016f:
            r9 = 0
        L_0x0170:
            java.util.HashMap<java.lang.String, k2.n> r10 = r0.f24431x
            java.lang.Object r8 = r10.get(r8)
            k2.n r8 = (k2.n) r8
            if (r8 == 0) goto L_0x0150
            r8.g(r9)
            goto L_0x0150
        L_0x017e:
            boolean r7 = r3.isEmpty()
            if (r7 != 0) goto L_0x0243
            java.util.HashMap<java.lang.String, k2.s> r7 = r0.f24430w
            if (r7 != 0) goto L_0x018f
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r0.f24430w = r7
        L_0x018f:
            java.util.Iterator r3 = r3.iterator()
        L_0x0193:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x01ef
            java.lang.Object r7 = r3.next()
            java.lang.String r7 = (java.lang.String) r7
            java.util.HashMap<java.lang.String, k2.s> r8 = r0.f24430w
            boolean r8 = r8.containsKey(r7)
            if (r8 == 0) goto L_0x01a8
            goto L_0x0193
        L_0x01a8:
            boolean r8 = r7.startsWith(r12)
            if (r8 == 0) goto L_0x01e4
            k2.h r8 = new k2.h
            r8.<init>()
            java.lang.String[] r9 = r7.split(r11)
            r10 = 1
            r9 = r9[r10]
            java.util.ArrayList<j2.a> r10 = r0.f24429v
            java.util.Iterator r10 = r10.iterator()
        L_0x01c0:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x01df
            java.lang.Object r13 = r10.next()
            j2.a r13 = (j2.C5481a) r13
            java.util.HashMap<java.lang.String, i2.a> r14 = r13.f24732e
            if (r14 != 0) goto L_0x01d1
            goto L_0x01c0
        L_0x01d1:
            java.lang.Object r14 = r14.get(r9)
            i2.a r14 = (i2.C5438a) r14
            if (r14 == 0) goto L_0x01c0
            int r13 = r13.f24728a
            r8.a(r13, r14)
            goto L_0x01c0
        L_0x01df:
            k2.n r8 = k2.n.b(r7, r8)
            goto L_0x01e8
        L_0x01e4:
            k2.n r8 = k2.n.c(r7, r1)
        L_0x01e8:
            if (r8 != 0) goto L_0x01eb
            goto L_0x0193
        L_0x01eb:
            r8.f(r7)
            goto L_0x0193
        L_0x01ef:
            java.util.ArrayList<j2.a> r1 = r0.f24429v
            if (r1 == 0) goto L_0x020f
            java.util.Iterator r1 = r1.iterator()
        L_0x01f7:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x020f
            java.lang.Object r2 = r1.next()
            j2.a r2 = (j2.C5481a) r2
            boolean r3 = r2 instanceof j2.C5485e
            if (r3 == 0) goto L_0x01f7
            j2.e r2 = (j2.C5485e) r2
            java.util.HashMap<java.lang.String, k2.s> r3 = r0.f24430w
            r2.m(r3)
            goto L_0x01f7
        L_0x020f:
            java.util.HashMap<java.lang.String, k2.s> r1 = r0.f24430w
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0219:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0243
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r6.containsKey(r2)
            if (r3 == 0) goto L_0x0236
            java.lang.Object r3 = r6.get(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L_0x0237
        L_0x0236:
            r3 = 0
        L_0x0237:
            java.util.HashMap<java.lang.String, k2.s> r7 = r0.f24430w
            java.lang.Object r2 = r7.get(r2)
            k2.s r2 = (k2.s) r2
            r2.c(r3)
            goto L_0x0219
        L_0x0243:
            java.util.ArrayList<i2.d> r1 = r0.f24427t
            int r1 = r1.size()
            int r2 = r1 + 2
            i2.d[] r3 = new i2.C5441d[r2]
            i2.d r6 = r0.f24411d
            r7 = 0
            r3[r7] = r6
            r6 = 1
            int r1 = r1 + r6
            i2.d r6 = r0.f24412e
            r3[r1] = r6
            java.util.ArrayList<i2.d> r1 = r0.f24427t
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0268
            int r1 = r0.f24410c
            int r6 = j2.C5481a.f24727f
            if (r1 != r6) goto L_0x0268
            r0.f24410c = r7
        L_0x0268:
            java.util.ArrayList<i2.d> r1 = r0.f24427t
            java.util.Iterator r1 = r1.iterator()
            r6 = 1
        L_0x026f:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x0281
            java.lang.Object r7 = r1.next()
            i2.d r7 = (i2.C5441d) r7
            int r8 = r6 + 1
            r3[r6] = r7
            r6 = r8
            goto L_0x026f
        L_0x0281:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            i2.d r6 = r0.f24412e
            java.util.HashMap<java.lang.String, i2.a> r6 = r6.f24480o
            java.util.Set r6 = r6.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0292:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x02c1
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            i2.d r8 = r0.f24411d
            java.util.HashMap<java.lang.String, i2.a> r8 = r8.f24480o
            boolean r8 = r8.containsKey(r7)
            if (r8 == 0) goto L_0x0292
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r12)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            boolean r8 = r4.contains(r8)
            if (r8 != 0) goto L_0x0292
            r1.add(r7)
            goto L_0x0292
        L_0x02c1:
            r7 = 0
            java.lang.String[] r4 = new java.lang.String[r7]
            java.lang.Object[] r1 = r1.toArray(r4)
            java.lang.String[] r1 = (java.lang.String[]) r1
            r0.f24423p = r1
            int r1 = r1.length
            int[] r1 = new int[r1]
            r0.f24424q = r1
            r1 = 0
        L_0x02d2:
            java.lang.String[] r4 = r0.f24423p
            int r6 = r4.length
            if (r1 >= r6) goto L_0x0309
            r4 = r4[r1]
            int[] r6 = r0.f24424q
            r7 = 0
            r6[r1] = r7
            r6 = 0
        L_0x02df:
            if (r6 >= r2) goto L_0x0306
            r7 = r3[r6]
            java.util.HashMap<java.lang.String, i2.a> r7 = r7.f24480o
            boolean r7 = r7.containsKey(r4)
            if (r7 == 0) goto L_0x0303
            r7 = r3[r6]
            java.util.HashMap<java.lang.String, i2.a> r7 = r7.f24480o
            java.lang.Object r7 = r7.get(r4)
            i2.a r7 = (i2.C5438a) r7
            if (r7 == 0) goto L_0x0303
            int[] r4 = r0.f24424q
            r6 = r4[r1]
            int r7 = r7.m()
            int r6 = r6 + r7
            r4[r1] = r6
            goto L_0x0306
        L_0x0303:
            int r6 = r6 + 1
            goto L_0x02df
        L_0x0306:
            int r1 = r1 + 1
            goto L_0x02d2
        L_0x0309:
            r1 = 0
            r6 = r3[r1]
            int r1 = r6.f24476k
            r6 = -1
            if (r1 == r6) goto L_0x0313
            r1 = 1
            goto L_0x0314
        L_0x0313:
            r1 = 0
        L_0x0314:
            int r4 = r4.length
            r6 = 18
            int r6 = r6 + r4
            boolean[] r4 = new boolean[r6]
            r7 = 1
        L_0x031b:
            if (r7 >= r2) goto L_0x032b
            r8 = r3[r7]
            int r9 = r7 + -1
            r9 = r3[r9]
            java.lang.String[] r10 = r0.f24423p
            r8.m(r9, r4, r10, r1)
            int r7 = r7 + 1
            goto L_0x031b
        L_0x032b:
            r1 = 1
            r7 = 0
        L_0x032d:
            if (r1 >= r6) goto L_0x0338
            boolean r8 = r4[r1]
            if (r8 == 0) goto L_0x0335
            int r7 = r7 + 1
        L_0x0335:
            int r1 = r1 + 1
            goto L_0x032d
        L_0x0338:
            int[] r1 = new int[r7]
            r0.f24420m = r1
            r1 = 2
            int r7 = java.lang.Math.max(r1, r7)
            double[] r8 = new double[r7]
            r0.f24421n = r8
            double[] r7 = new double[r7]
            r0.f24422o = r7
            r7 = 1
            r8 = 0
        L_0x034b:
            if (r7 >= r6) goto L_0x035b
            boolean r9 = r4[r7]
            if (r9 == 0) goto L_0x0358
            int[] r9 = r0.f24420m
            int r10 = r8 + 1
            r9[r8] = r7
            r8 = r10
        L_0x0358:
            int r7 = r7 + 1
            goto L_0x034b
        L_0x035b:
            int[] r4 = r0.f24420m
            int r4 = r4.length
            int[] r6 = new int[r1]
            r7 = 1
            r6[r7] = r4
            r4 = 0
            r6[r4] = r2
            java.lang.Class r4 = java.lang.Double.TYPE
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r6)
            double[][] r4 = (double[][]) r4
            double[] r6 = new double[r2]
            r7 = 0
        L_0x0371:
            if (r7 >= r2) goto L_0x0386
            r8 = r3[r7]
            r9 = r4[r7]
            int[] r10 = r0.f24420m
            r8.n(r9, r10)
            r8 = r3[r7]
            float r8 = r8.f24468c
            double r8 = (double) r8
            r6[r7] = r8
            int r7 = r7 + 1
            goto L_0x0371
        L_0x0386:
            r7 = 0
        L_0x0387:
            int[] r8 = r0.f24420m
            int r9 = r8.length
            if (r7 >= r9) goto L_0x03c9
            r8 = r8[r7]
            java.lang.String[] r9 = i2.C5441d.f24465t
            int r9 = r9.length
            if (r8 >= r9) goto L_0x03c6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String[] r9 = i2.C5441d.f24465t
            int[] r10 = r0.f24420m
            r10 = r10[r7]
            r9 = r9[r10]
            r8.append(r9)
            java.lang.String r9 = " ["
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r9 = r8
            r8 = 0
        L_0x03ae:
            if (r8 >= r2) goto L_0x03c6
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r9 = r4[r8]
            r11 = r9[r7]
            r10.append(r11)
            java.lang.String r9 = r10.toString()
            int r8 = r8 + 1
            goto L_0x03ae
        L_0x03c6:
            int r7 = r7 + 1
            goto L_0x0387
        L_0x03c9:
            java.lang.String[] r7 = r0.f24423p
            int r7 = r7.length
            r8 = 1
            int r7 = r7 + r8
            k2.b[] r7 = new k2.b[r7]
            r0.f24415h = r7
            r7 = 0
        L_0x03d3:
            java.lang.String[] r8 = r0.f24423p
            int r9 = r8.length
            if (r7 >= r9) goto L_0x0439
            r8 = r8[r7]
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x03de:
            if (r9 >= r2) goto L_0x041d
            r13 = r3[r9]
            boolean r13 = r13.E(r8)
            if (r13 == 0) goto L_0x0415
            if (r12 != 0) goto L_0x0403
            double[] r11 = new double[r2]
            r12 = r3[r9]
            int r12 = r12.D(r8)
            int[] r13 = new int[r1]
            r14 = 1
            r13[r14] = r12
            r14 = 0
            r13[r14] = r2
            java.lang.Class r12 = java.lang.Double.TYPE
            java.lang.Object r12 = java.lang.reflect.Array.newInstance(r12, r13)
            double[][] r12 = (double[][]) r12
            goto L_0x0404
        L_0x0403:
            r14 = 0
        L_0x0404:
            r13 = r3[r9]
            float r15 = r13.f24468c
            r23 = r2
            double r1 = (double) r15
            r11[r10] = r1
            r1 = r12[r10]
            r13.C(r8, r1, r14)
            int r10 = r10 + 1
            goto L_0x0417
        L_0x0415:
            r23 = r2
        L_0x0417:
            int r9 = r9 + 1
            r2 = r23
            r1 = 2
            goto L_0x03de
        L_0x041d:
            r23 = r2
            double[] r1 = java.util.Arrays.copyOf(r11, r10)
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r12, r10)
            double[][] r2 = (double[][]) r2
            k2.b[] r8 = r0.f24415h
            int r7 = r7 + 1
            int r9 = r0.f24410c
            k2.b r1 = k2.b.a(r9, r1, r2)
            r8[r7] = r1
            r2 = r23
            r1 = 2
            goto L_0x03d3
        L_0x0439:
            r23 = r2
            k2.b[] r1 = r0.f24415h
            int r2 = r0.f24410c
            k2.b r2 = k2.b.a(r2, r6, r4)
            r4 = 0
            r1[r4] = r2
            r1 = r3[r4]
            int r1 = r1.f24476k
            r2 = -1
            if (r1 == r2) goto L_0x0488
            r1 = r23
            int[] r2 = new int[r1]
            double[] r6 = new double[r1]
            r7 = 2
            int[] r8 = new int[r7]
            r9 = 1
            r8[r9] = r7
            r8[r4] = r1
            java.lang.Class r4 = java.lang.Double.TYPE
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r8)
            double[][] r4 = (double[][]) r4
            r9 = 0
        L_0x0464:
            if (r9 >= r1) goto L_0x0482
            r7 = r3[r9]
            int r8 = r7.f24476k
            r2[r9] = r8
            float r8 = r7.f24468c
            double r10 = (double) r8
            r6[r9] = r10
            r8 = r4[r9]
            float r10 = r7.f24470e
            double r10 = (double) r10
            r12 = 0
            r8[r12] = r10
            float r7 = r7.f24471f
            double r10 = (double) r7
            r7 = 1
            r8[r7] = r10
            int r9 = r9 + 1
            goto L_0x0464
        L_0x0482:
            k2.b r1 = k2.b.b(r2, r6, r4)
            r0.f24416i = r1
        L_0x0488:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f24432y = r1
            java.util.ArrayList<j2.a> r1 = r0.f24429v
            if (r1 == 0) goto L_0x04fd
            java.util.Iterator r1 = r5.iterator()
            r2 = 2143289344(0x7fc00000, float:NaN)
        L_0x0499:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x04c5
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            k2.g r4 = k2.g.b(r3)
            if (r4 != 0) goto L_0x04ac
            goto L_0x0499
        L_0x04ac:
            boolean r5 = r4.i()
            if (r5 == 0) goto L_0x04bc
            boolean r5 = java.lang.Float.isNaN(r2)
            if (r5 == 0) goto L_0x04bc
            float r2 = r19.q()
        L_0x04bc:
            r4.g(r3)
            java.util.HashMap<java.lang.String, k2.g> r5 = r0.f24432y
            r5.put(r3, r4)
            goto L_0x0499
        L_0x04c5:
            java.util.ArrayList<j2.a> r1 = r0.f24429v
            java.util.Iterator r1 = r1.iterator()
        L_0x04cb:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x04e3
            java.lang.Object r3 = r1.next()
            j2.a r3 = (j2.C5481a) r3
            boolean r4 = r3 instanceof j2.C5483c
            if (r4 == 0) goto L_0x04cb
            j2.c r3 = (j2.C5483c) r3
            java.util.HashMap<java.lang.String, k2.g> r4 = r0.f24432y
            r3.m(r4)
            goto L_0x04cb
        L_0x04e3:
            java.util.HashMap<java.lang.String, k2.g> r1 = r0.f24432y
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x04ed:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x04fd
            java.lang.Object r3 = r1.next()
            k2.g r3 = (k2.g) r3
            r3.h(r2)
            goto L_0x04ed
        L_0x04fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.C5439b.B(int, int, float, long):void");
    }

    public void D(C5439b bVar) {
        this.f24407H = bVar;
    }

    public int a(String str) {
        return 0;
    }

    public boolean b(int i10, int i11) {
        if (i10 == 509) {
            w(i11);
            return true;
        } else if (i10 != 610) {
            return i10 == 704;
        } else {
            this.f24403D = i11;
            return true;
        }
    }

    public boolean c(int i10, float f10) {
        if (602 == i10) {
            this.f24404E = f10;
            return true;
        } else if (600 != i10) {
            return false;
        } else {
            this.f24417j = f10;
            return true;
        }
    }

    public boolean d(int i10, boolean z10) {
        return false;
    }

    public boolean e(int i10, String str) {
        if (705 == i10 || 611 == i10) {
            this.f24405F = o(-1, str, 0);
            return true;
        } else if (605 != i10) {
            return false;
        } else {
            this.f24411d.f24477l = str;
            return true;
        }
    }

    public void f(C5481a aVar) {
        this.f24429v.add(aVar);
    }

    public int g(float[] fArr, int[] iArr, int[] iArr2) {
        if (fArr == null) {
            return 0;
        }
        double[] g10 = this.f24415h[0].g();
        if (iArr != null) {
            Iterator<C5441d> it = this.f24427t.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                iArr[i10] = it.next().f24481p;
                i10++;
            }
        }
        if (iArr2 != null) {
            Iterator<C5441d> it2 = this.f24427t.iterator();
            int i11 = 0;
            while (it2.hasNext()) {
                iArr2[i11] = (int) (it2.next().f24469d * 100.0f);
                i11++;
            }
        }
        int i12 = 0;
        for (int i13 = 0; i13 < g10.length; i13++) {
            this.f24415h[0].d(g10[i13], this.f24421n);
            this.f24411d.v(g10[i13], this.f24420m, this.f24421n, fArr, i12);
            i12 += 2;
        }
        return i12 / 2;
    }

    public void h(float[] fArr, int i10) {
        int i11 = i10;
        float f10 = 1.0f;
        float f11 = 1.0f / ((float) (i11 - 1));
        HashMap<String, n> hashMap = this.f24431x;
        g gVar = null;
        n nVar = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, n> hashMap2 = this.f24431x;
        n nVar2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, g> hashMap3 = this.f24432y;
        g gVar2 = hashMap3 == null ? null : hashMap3.get("translationX");
        HashMap<String, g> hashMap4 = this.f24432y;
        if (hashMap4 != null) {
            gVar = hashMap4.get("translationY");
        }
        int i12 = 0;
        while (i12 < i11) {
            float f12 = ((float) i12) * f11;
            float f13 = this.f24419l;
            float f14 = 0.0f;
            if (f13 != f10) {
                float f15 = this.f24418k;
                if (f12 < f15) {
                    f12 = 0.0f;
                }
                if (f12 > f15 && ((double) f12) < 1.0d) {
                    f12 = Math.min((f12 - f15) * f13, f10);
                }
            }
            double d10 = (double) f12;
            d dVar = this.f24411d.f24466a;
            Iterator<C5441d> it = this.f24427t.iterator();
            float f16 = Float.NaN;
            while (it.hasNext()) {
                C5441d next = it.next();
                d dVar2 = next.f24466a;
                if (dVar2 != null) {
                    float f17 = next.f24468c;
                    if (f17 < f12) {
                        f14 = f17;
                        dVar = dVar2;
                    } else if (Float.isNaN(f16)) {
                        f16 = next.f24468c;
                    }
                }
                int i13 = i10;
            }
            if (dVar != null) {
                if (Float.isNaN(f16)) {
                    f16 = 1.0f;
                }
                float f18 = f16 - f14;
                d10 = (double) ((((float) dVar.a((double) ((f12 - f14) / f18))) * f18) + f14);
            }
            this.f24415h[0].d(d10, this.f24421n);
            b bVar = this.f24416i;
            if (bVar != null) {
                double[] dArr = this.f24421n;
                if (dArr.length > 0) {
                    bVar.d(d10, dArr);
                }
            }
            int i14 = i12 * 2;
            this.f24411d.v(d10, this.f24420m, this.f24421n, fArr, i14);
            if (gVar2 != null) {
                fArr[i14] = fArr[i14] + gVar2.a(f12);
            } else if (nVar != null) {
                fArr[i14] = fArr[i14] + nVar.a(f12);
            }
            if (gVar != null) {
                int i15 = i14 + 1;
                fArr[i15] = fArr[i15] + gVar.a(f12);
            } else if (nVar2 != null) {
                int i16 = i14 + 1;
                fArr[i16] = fArr[i16] + nVar2.a(f12);
            }
            i12++;
            i11 = i10;
            f10 = 1.0f;
        }
    }

    public String j() {
        return this.f24411d.f24477l;
    }

    public void k(double d10, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f24415h[0].d(d10, dArr);
        this.f24415h[0].f(d10, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f24411d.B(d10, this.f24420m, dArr, fArr, dArr2, fArr2);
    }

    public void l(float f10, float f11, float f12, float[] fArr) {
        double[] dArr;
        float i10 = i(f10, this.f24428u);
        b[] bVarArr = this.f24415h;
        int i11 = 0;
        if (bVarArr != null) {
            double d10 = (double) i10;
            bVarArr[0].f(d10, this.f24422o);
            this.f24415h[0].d(d10, this.f24421n);
            float f13 = this.f24428u[0];
            while (true) {
                dArr = this.f24422o;
                if (i11 >= dArr.length) {
                    break;
                }
                dArr[i11] = dArr[i11] * ((double) f13);
                i11++;
            }
            b bVar = this.f24416i;
            if (bVar != null) {
                double[] dArr2 = this.f24421n;
                if (dArr2.length > 0) {
                    bVar.d(d10, dArr2);
                    this.f24416i.f(d10, this.f24422o);
                    this.f24411d.K(f11, f12, fArr, this.f24420m, this.f24422o, this.f24421n);
                    return;
                }
                return;
            }
            this.f24411d.K(f11, f12, fArr, this.f24420m, dArr, this.f24421n);
            return;
        }
        C5441d dVar = this.f24412e;
        float f14 = dVar.f24470e;
        C5441d dVar2 = this.f24411d;
        float f15 = f14 - dVar2.f24470e;
        float f16 = dVar.f24471f - dVar2.f24471f;
        float f17 = (dVar.f24472g - dVar2.f24472g) + f15;
        float f18 = (dVar.f24473h - dVar2.f24473h) + f16;
        fArr[0] = (f15 * (1.0f - f11)) + (f17 * f11);
        fArr[1] = (f16 * (1.0f - f12)) + (f18 * f12);
    }

    public float m() {
        return this.f24412e.f24470e;
    }

    public float n() {
        return this.f24412e.f24471f;
    }

    public float p() {
        return this.f24417j;
    }

    public C5442e r() {
        return this.f24409b;
    }

    public boolean t(C5442e eVar, float f10, long j10, f fVar) {
        double d10;
        C5442e eVar2 = eVar;
        float i10 = i(f10, (float[]) null);
        int i11 = this.f24403D;
        if (i11 != -1) {
            float f11 = 1.0f / ((float) i11);
            float floor = ((float) Math.floor((double) (i10 / f11))) * f11;
            float f12 = (i10 % f11) / f11;
            if (!Float.isNaN(this.f24404E)) {
                f12 = (f12 + this.f24404E) % 1.0f;
            }
            c cVar = this.f24405F;
            i10 = ((cVar != null ? cVar.getInterpolation(f12) : ((double) f12) > 0.5d ? 1.0f : 0.0f) * f11) + floor;
        }
        float f13 = i10;
        HashMap<String, n> hashMap = this.f24431x;
        if (hashMap != null) {
            for (n e10 : hashMap.values()) {
                e10.e(eVar2, f13);
            }
        }
        b[] bVarArr = this.f24415h;
        if (bVarArr != null) {
            double d11 = (double) f13;
            bVarArr[0].d(d11, this.f24421n);
            this.f24415h[0].f(d11, this.f24422o);
            b bVar = this.f24416i;
            if (bVar != null) {
                double[] dArr = this.f24421n;
                if (dArr.length > 0) {
                    bVar.d(d11, dArr);
                    this.f24416i.f(d11, this.f24422o);
                }
            }
            if (!this.f24406G) {
                d10 = d11;
                this.f24411d.L(f13, eVar, this.f24420m, this.f24421n, this.f24422o, (double[]) null);
            } else {
                d10 = d11;
            }
            if (this.f24401B != -1) {
                if (this.f24402C == null) {
                    this.f24402C = eVar.m().f(this.f24401B);
                }
                C5442e eVar3 = this.f24402C;
                if (eVar3 != null) {
                    float v10 = ((float) (eVar3.v() + this.f24402C.h())) / 2.0f;
                    float l10 = ((float) (this.f24402C.l() + this.f24402C.p())) / 2.0f;
                    if (eVar.p() - eVar.l() > 0 && eVar.h() - eVar.v() > 0) {
                        eVar2.J(l10 - ((float) eVar.l()));
                        eVar2.K(v10 - ((float) eVar.v()));
                    }
                }
            }
            int i12 = 1;
            while (true) {
                b[] bVarArr2 = this.f24415h;
                if (i12 >= bVarArr2.length) {
                    break;
                }
                bVarArr2[i12].e(d10, this.f24426s);
                this.f24411d.f24480o.get(this.f24423p[i12 - 1]).q(eVar2, this.f24426s);
                i12++;
            }
            C5440c cVar2 = this.f24413f;
            if (cVar2.f24440b == 0) {
                if (f13 <= 0.0f) {
                    eVar2.Q(cVar2.f24441c);
                } else if (f13 >= 1.0f) {
                    eVar2.Q(this.f24414g.f24441c);
                } else if (this.f24414g.f24441c != cVar2.f24441c) {
                    eVar2.Q(4);
                }
            }
            if (this.f24433z != null) {
                int i13 = 0;
                while (true) {
                    C5486f[] fVarArr = this.f24433z;
                    if (i13 >= fVarArr.length) {
                        break;
                    }
                    fVarArr[i13].m(f13, eVar2);
                    i13++;
                }
            }
        } else {
            C5441d dVar = this.f24411d;
            float f14 = dVar.f24470e;
            C5441d dVar2 = this.f24412e;
            float f15 = f14 + ((dVar2.f24470e - f14) * f13);
            float f16 = dVar.f24471f;
            float f17 = f16 + ((dVar2.f24471f - f16) * f13);
            float f18 = dVar.f24472g;
            float f19 = f18 + ((dVar2.f24472g - f18) * f13);
            float f20 = dVar.f24473h;
            float f21 = f15 + 0.5f;
            float f22 = f17 + 0.5f;
            eVar2.E((int) f21, (int) f22, (int) (f21 + f19), (int) (f22 + f20 + ((dVar2.f24473h - f20) * f13)));
        }
        HashMap<String, g> hashMap2 = this.f24432y;
        if (hashMap2 == null) {
            return false;
        }
        for (g next : hashMap2.values()) {
            if (next instanceof g.d) {
                double[] dArr2 = this.f24422o;
                ((g.d) next).j(eVar, f13, dArr2[0], dArr2[1]);
            } else {
                next.f(eVar2, f13);
            }
        }
        return false;
    }

    public String toString() {
        return " start: x: " + this.f24411d.f24470e + " y: " + this.f24411d.f24471f + " end: x: " + this.f24412e.f24470e + " y: " + this.f24412e.f24471f;
    }

    public void v(C5442e eVar) {
        C5441d dVar = this.f24412e;
        dVar.f24468c = 1.0f;
        dVar.f24469d = 1.0f;
        u(dVar);
        this.f24412e.J((float) eVar.l(), (float) eVar.v(), (float) eVar.B(), (float) eVar.k());
        this.f24412e.a(eVar);
        this.f24414g.B(eVar);
    }

    public void w(int i10) {
        this.f24400A = i10;
    }

    public void x(float f10) {
        this.f24418k = f10;
    }

    public void y(float f10) {
        this.f24419l = f10;
    }

    public void z(C5442e eVar) {
        C5441d dVar = this.f24411d;
        dVar.f24468c = 0.0f;
        dVar.f24469d = 0.0f;
        dVar.J((float) eVar.C(), (float) eVar.D(), (float) eVar.B(), (float) eVar.k());
        this.f24411d.a(eVar);
        this.f24413f.B(eVar);
        t j10 = eVar.A().j();
        if (j10 != null) {
            j10.g(this);
        }
    }
}
