package m2;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import l2.C5517a;
import l2.C5519c;
import l2.C5520d;
import l2.g;
import l2.h;
import l2.i;

/* renamed from: m2.b  reason: case insensitive filesystem */
public class C5574b {

    /* renamed from: m2.b$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        String f26117a;

        /* renamed from: b  reason: collision with root package name */
        String f26118b;

        /* renamed from: c  reason: collision with root package name */
        HashMap<String, String> f26119c;

        a(String str, String str2, HashMap<String, String> hashMap) {
            this.f26117a = str;
            this.f26118b = str2;
            this.f26119c = hashMap;
        }

        public String a() {
            return this.f26117a;
        }

        public HashMap<String, String> b() {
            return this.f26119c;
        }

        public String c() {
            return this.f26118b;
        }
    }

    /* renamed from: m2.b$b  reason: collision with other inner class name */
    static class C0418b implements c {

        /* renamed from: a  reason: collision with root package name */
        float f26120a;

        /* renamed from: b  reason: collision with root package name */
        float f26121b;

        /* renamed from: c  reason: collision with root package name */
        float f26122c;

        /* renamed from: d  reason: collision with root package name */
        boolean f26123d = false;

        /* renamed from: e  reason: collision with root package name */
        String f26124e;

        /* renamed from: f  reason: collision with root package name */
        String f26125f;

        /* renamed from: g  reason: collision with root package name */
        float f26126g = 0.0f;

        /* renamed from: h  reason: collision with root package name */
        float f26127h;

        /* renamed from: i  reason: collision with root package name */
        float f26128i;

        C0418b(float f10, float f11, float f12, String str, String str2) {
            this.f26120a = f10;
            this.f26121b = f11;
            this.f26122c = f12;
            this.f26124e = str == null ? "" : str;
            this.f26125f = str2 == null ? "" : str2;
            this.f26128i = f11;
            this.f26127h = f10;
        }

        public ArrayList<String> a() {
            ArrayList<String> arrayList = new ArrayList<>();
            int i10 = (int) this.f26127h;
            int i11 = (int) this.f26128i;
            int i12 = i10;
            while (i10 <= i11) {
                arrayList.add(this.f26124e + i12 + this.f26125f);
                i12 += (int) this.f26122c;
                i10++;
            }
            return arrayList;
        }

        public float value() {
            float f10 = this.f26126g;
            if (f10 >= this.f26128i) {
                this.f26123d = true;
            }
            if (!this.f26123d) {
                this.f26126g = f10 + this.f26122c;
            }
            return this.f26126g;
        }
    }

    /* renamed from: m2.b$c */
    interface c {
        float value();
    }

    /* renamed from: m2.b$d */
    static class d implements c {

        /* renamed from: a  reason: collision with root package name */
        float f26129a;

        /* renamed from: b  reason: collision with root package name */
        float f26130b;

        /* renamed from: c  reason: collision with root package name */
        float f26131c;

        /* renamed from: d  reason: collision with root package name */
        boolean f26132d = false;

        d(float f10, float f11) {
            this.f26129a = f10;
            this.f26130b = f11;
            this.f26131c = f10;
        }

        public float value() {
            if (!this.f26132d) {
                this.f26131c += this.f26130b;
            }
            return this.f26131c;
        }
    }

    /* renamed from: m2.b$e */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        HashMap<String, Integer> f26133a = new HashMap<>();

        /* renamed from: b  reason: collision with root package name */
        HashMap<String, c> f26134b = new HashMap<>();

        /* renamed from: c  reason: collision with root package name */
        HashMap<String, ArrayList<String>> f26135c = new HashMap<>();

        /* access modifiers changed from: package-private */
        public float a(Object obj) {
            if (obj instanceof i) {
                String j10 = ((i) obj).j();
                if (this.f26134b.containsKey(j10)) {
                    return this.f26134b.get(j10).value();
                }
                if (this.f26133a.containsKey(j10)) {
                    return this.f26133a.get(j10).floatValue();
                }
                return 0.0f;
            } else if (obj instanceof l2.e) {
                return ((l2.e) obj).p();
            } else {
                return 0.0f;
            }
        }

        /* access modifiers changed from: package-private */
        public ArrayList<String> b(String str) {
            if (this.f26135c.containsKey(str)) {
                return this.f26135c.get(str);
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void c(String str, float f10, float f11) {
            if (!this.f26134b.containsKey(str) || !(this.f26134b.get(str) instanceof f)) {
                this.f26134b.put(str, new d(f10, f11));
            }
        }

        /* access modifiers changed from: package-private */
        public void d(String str, float f10, float f11, float f12, String str2, String str3) {
            if (!this.f26134b.containsKey(str) || !(this.f26134b.get(str) instanceof f)) {
                C0418b bVar = new C0418b(f10, f11, f12, str2, str3);
                this.f26134b.put(str, bVar);
                this.f26135c.put(str, bVar.a());
            }
        }

        /* access modifiers changed from: package-private */
        public void e(String str, int i10) {
            this.f26133a.put(str, Integer.valueOf(i10));
        }

        /* access modifiers changed from: package-private */
        public void f(String str, ArrayList<String> arrayList) {
            this.f26135c.put(str, arrayList);
        }

        public void g(String str, float f10) {
            this.f26134b.put(str, new f(f10));
        }
    }

    /* renamed from: m2.b$f */
    static class f implements c {

        /* renamed from: a  reason: collision with root package name */
        float f26136a;

        f(float f10) {
            this.f26136a = f10;
        }

        public float value() {
            return this.f26136a;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0169, code lost:
        if (r8.equals("visible") == false) goto L_0x0161;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(m2.g r8, m2.C5574b.e r9, m2.C5573a r10, l2.f r11, java.lang.String r12) {
        /*
            r0 = 8
            r1 = 4
            r2 = 2
            r3 = 1
            r4 = 0
            r12.hashCode()
            java.lang.String r5 = "parent"
            r6 = -1
            int r7 = r12.hashCode()
            switch(r7) {
                case -1448775240: goto L_0x0140;
                case -1364013995: goto L_0x0134;
                case -1349088399: goto L_0x0128;
                case -1249320806: goto L_0x011c;
                case -1249320805: goto L_0x0110;
                case -1249320804: goto L_0x0104;
                case -1225497657: goto L_0x00f8;
                case -1225497656: goto L_0x00ec;
                case -1225497655: goto L_0x00df;
                case -1221029593: goto L_0x00d1;
                case -1068318794: goto L_0x00c3;
                case -987906986: goto L_0x00b5;
                case -987906985: goto L_0x00a7;
                case -908189618: goto L_0x0099;
                case -908189617: goto L_0x008b;
                case -247669061: goto L_0x007e;
                case -61505906: goto L_0x0071;
                case 92909918: goto L_0x0064;
                case 98116417: goto L_0x0057;
                case 111045711: goto L_0x004a;
                case 113126854: goto L_0x003d;
                case 398344448: goto L_0x0030;
                case 1404070310: goto L_0x0023;
                case 1941332754: goto L_0x0016;
                default: goto L_0x0013;
            }
        L_0x0013:
            r7 = r6
            goto L_0x014b
        L_0x0016:
            java.lang.String r7 = "visibility"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L_0x001f
            goto L_0x0013
        L_0x001f:
            r7 = 23
            goto L_0x014b
        L_0x0023:
            java.lang.String r7 = "centerHorizontally"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L_0x002c
            goto L_0x0013
        L_0x002c:
            r7 = 22
            goto L_0x014b
        L_0x0030:
            java.lang.String r7 = "hWeight"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L_0x0039
            goto L_0x0013
        L_0x0039:
            r7 = 21
            goto L_0x014b
        L_0x003d:
            java.lang.String r7 = "width"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L_0x0046
            goto L_0x0013
        L_0x0046:
            r7 = 20
            goto L_0x014b
        L_0x004a:
            java.lang.String r7 = "vBias"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L_0x0053
            goto L_0x0013
        L_0x0053:
            r7 = 19
            goto L_0x014b
        L_0x0057:
            java.lang.String r7 = "hBias"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L_0x0060
            goto L_0x0013
        L_0x0060:
            r7 = 18
            goto L_0x014b
        L_0x0064:
            java.lang.String r7 = "alpha"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L_0x006d
            goto L_0x0013
        L_0x006d:
            r7 = 17
            goto L_0x014b
        L_0x0071:
            java.lang.String r7 = "vWeight"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L_0x007a
            goto L_0x0013
        L_0x007a:
            r7 = 16
            goto L_0x014b
        L_0x007e:
            java.lang.String r7 = "hRtlBias"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L_0x0087
            goto L_0x0013
        L_0x0087:
            r7 = 15
            goto L_0x014b
        L_0x008b:
            java.lang.String r7 = "scaleY"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L_0x0095
            goto L_0x0013
        L_0x0095:
            r7 = 14
            goto L_0x014b
        L_0x0099:
            java.lang.String r7 = "scaleX"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L_0x00a3
            goto L_0x0013
        L_0x00a3:
            r7 = 13
            goto L_0x014b
        L_0x00a7:
            java.lang.String r7 = "pivotY"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L_0x00b1
            goto L_0x0013
        L_0x00b1:
            r7 = 12
            goto L_0x014b
        L_0x00b5:
            java.lang.String r7 = "pivotX"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L_0x00bf
            goto L_0x0013
        L_0x00bf:
            r7 = 11
            goto L_0x014b
        L_0x00c3:
            java.lang.String r7 = "motion"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L_0x00cd
            goto L_0x0013
        L_0x00cd:
            r7 = 10
            goto L_0x014b
        L_0x00d1:
            java.lang.String r7 = "height"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L_0x00db
            goto L_0x0013
        L_0x00db:
            r7 = 9
            goto L_0x014b
        L_0x00df:
            java.lang.String r7 = "translationZ"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L_0x00e9
            goto L_0x0013
        L_0x00e9:
            r7 = r0
            goto L_0x014b
        L_0x00ec:
            java.lang.String r7 = "translationY"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L_0x00f6
            goto L_0x0013
        L_0x00f6:
            r7 = 7
            goto L_0x014b
        L_0x00f8:
            java.lang.String r7 = "translationX"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L_0x0102
            goto L_0x0013
        L_0x0102:
            r7 = 6
            goto L_0x014b
        L_0x0104:
            java.lang.String r7 = "rotationZ"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L_0x010e
            goto L_0x0013
        L_0x010e:
            r7 = 5
            goto L_0x014b
        L_0x0110:
            java.lang.String r7 = "rotationY"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L_0x011a
            goto L_0x0013
        L_0x011a:
            r7 = r1
            goto L_0x014b
        L_0x011c:
            java.lang.String r7 = "rotationX"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L_0x0126
            goto L_0x0013
        L_0x0126:
            r7 = 3
            goto L_0x014b
        L_0x0128:
            java.lang.String r7 = "custom"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L_0x0132
            goto L_0x0013
        L_0x0132:
            r7 = r2
            goto L_0x014b
        L_0x0134:
            java.lang.String r7 = "center"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L_0x013e
            goto L_0x0013
        L_0x013e:
            r7 = r3
            goto L_0x014b
        L_0x0140:
            java.lang.String r7 = "centerVertically"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L_0x014a
            goto L_0x0013
        L_0x014a:
            r7 = r4
        L_0x014b:
            switch(r7) {
                case 0: goto L_0x02dc;
                case 1: goto L_0x02ba;
                case 2: goto L_0x02b6;
                case 3: goto L_0x02aa;
                case 4: goto L_0x029e;
                case 5: goto L_0x0292;
                case 6: goto L_0x0282;
                case 7: goto L_0x0271;
                case 8: goto L_0x0260;
                case 9: goto L_0x0253;
                case 10: goto L_0x024a;
                case 11: goto L_0x023d;
                case 12: goto L_0x0230;
                case 13: goto L_0x0223;
                case 14: goto L_0x0216;
                case 15: goto L_0x01ff;
                case 16: goto L_0x01f2;
                case 17: goto L_0x01e5;
                case 18: goto L_0x01d8;
                case 19: goto L_0x01cb;
                case 20: goto L_0x01be;
                case 21: goto L_0x01b1;
                case 22: goto L_0x0199;
                case 23: goto L_0x0153;
                default: goto L_0x014e;
            }
        L_0x014e:
            h(r8, r9, r11, r10, r12)
            goto L_0x02f2
        L_0x0153:
            java.lang.String r8 = r11.c0(r12)
            r8.hashCode()
            int r9 = r8.hashCode()
            switch(r9) {
                case -1901805651: goto L_0x0177;
                case 3178655: goto L_0x016c;
                case 466743410: goto L_0x0163;
                default: goto L_0x0161;
            }
        L_0x0161:
            r2 = r6
            goto L_0x0181
        L_0x0163:
            java.lang.String r9 = "visible"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x0181
            goto L_0x0161
        L_0x016c:
            java.lang.String r9 = "gone"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x0175
            goto L_0x0161
        L_0x0175:
            r2 = r3
            goto L_0x0181
        L_0x0177:
            java.lang.String r9 = "invisible"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x0180
            goto L_0x0161
        L_0x0180:
            r2 = r4
        L_0x0181:
            switch(r2) {
                case 0: goto L_0x0190;
                case 1: goto L_0x018b;
                case 2: goto L_0x0186;
                default: goto L_0x0184;
            }
        L_0x0184:
            goto L_0x02f2
        L_0x0186:
            r10.r0(r4)
            goto L_0x02f2
        L_0x018b:
            r10.r0(r0)
            goto L_0x02f2
        L_0x0190:
            r10.r0(r1)
            r8 = 0
            r10.g(r8)
            goto L_0x02f2
        L_0x0199:
            java.lang.String r9 = r11.c0(r12)
            boolean r11 = r9.equals(r5)
            if (r11 == 0) goto L_0x01a5
            java.lang.Integer r9 = m2.g.f26155k
        L_0x01a5:
            m2.a r8 = r8.d(r9)
            r10.i0(r8)
            r10.z(r8)
            goto L_0x02f2
        L_0x01b1:
            l2.c r8 = r11.P(r12)
            float r8 = r9.a(r8)
            r10.a0(r8)
            goto L_0x02f2
        L_0x01be:
            m2.c r9 = r8.h()
            m2.d r8 = k(r11, r12, r8, r9)
            r10.f0(r8)
            goto L_0x02f2
        L_0x01cb:
            l2.c r8 = r11.P(r12)
            float r8 = r9.a(r8)
            r10.q0(r8)
            goto L_0x02f2
        L_0x01d8:
            l2.c r8 = r11.P(r12)
            float r8 = r9.a(r8)
            r10.F(r8)
            goto L_0x02f2
        L_0x01e5:
            l2.c r8 = r11.P(r12)
            float r8 = r9.a(r8)
            r10.g(r8)
            goto L_0x02f2
        L_0x01f2:
            l2.c r8 = r11.P(r12)
            float r8 = r9.a(r8)
            r10.d0(r8)
            goto L_0x02f2
        L_0x01ff:
            l2.c r11 = r11.P(r12)
            float r9 = r9.a(r11)
            boolean r8 = r8.r()
            if (r8 == 0) goto L_0x0211
            r8 = 1065353216(0x3f800000, float:1.0)
            float r9 = r8 - r9
        L_0x0211:
            r10.F(r9)
            goto L_0x02f2
        L_0x0216:
            l2.c r8 = r11.P(r12)
            float r8 = r9.a(r8)
            r10.W(r8)
            goto L_0x02f2
        L_0x0223:
            l2.c r8 = r11.P(r12)
            float r8 = r9.a(r8)
            r10.V(r8)
            goto L_0x02f2
        L_0x0230:
            l2.c r8 = r11.P(r12)
            float r8 = r9.a(r8)
            r10.O(r8)
            goto L_0x02f2
        L_0x023d:
            l2.c r8 = r11.P(r12)
            float r8 = r9.a(r8)
            r10.N(r8)
            goto L_0x02f2
        L_0x024a:
            l2.c r8 = r11.P(r12)
            u(r8, r10)
            goto L_0x02f2
        L_0x0253:
            m2.c r9 = r8.h()
            m2.d r8 = k(r11, r12, r8, r9)
            r10.Y(r8)
            goto L_0x02f2
        L_0x0260:
            l2.c r11 = r11.P(r12)
            float r9 = r9.a(r11)
            float r8 = z(r8, r9)
            r10.p0(r8)
            goto L_0x02f2
        L_0x0271:
            l2.c r11 = r11.P(r12)
            float r9 = r9.a(r11)
            float r8 = z(r8, r9)
            r10.o0(r8)
            goto L_0x02f2
        L_0x0282:
            l2.c r11 = r11.P(r12)
            float r9 = r9.a(r11)
            float r8 = z(r8, r9)
            r10.n0(r8)
            goto L_0x02f2
        L_0x0292:
            l2.c r8 = r11.P(r12)
            float r8 = r9.a(r8)
            r10.U(r8)
            goto L_0x02f2
        L_0x029e:
            l2.c r8 = r11.P(r12)
            float r8 = r9.a(r8)
            r10.T(r8)
            goto L_0x02f2
        L_0x02aa:
            l2.c r8 = r11.P(r12)
            float r8 = r9.a(r8)
            r10.S(r8)
            goto L_0x02f2
        L_0x02b6:
            i(r11, r10, r12)
            goto L_0x02f2
        L_0x02ba:
            java.lang.String r9 = r11.c0(r12)
            boolean r11 = r9.equals(r5)
            if (r11 == 0) goto L_0x02cb
            java.lang.Integer r9 = m2.g.f26155k
            m2.a r8 = r8.d(r9)
            goto L_0x02cf
        L_0x02cb:
            m2.a r8 = r8.d(r9)
        L_0x02cf:
            r10.i0(r8)
            r10.z(r8)
            r10.m0(r8)
            r10.p(r8)
            goto L_0x02f2
        L_0x02dc:
            java.lang.String r9 = r11.c0(r12)
            boolean r11 = r9.equals(r5)
            if (r11 == 0) goto L_0x02e8
            java.lang.Integer r9 = m2.g.f26155k
        L_0x02e8:
            m2.a r8 = r8.d(r9)
            r10.m0(r8)
            r10.p(r8)
        L_0x02f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C5574b.a(m2.g, m2.b$e, m2.a, l2.f, java.lang.String):void");
    }

    private static int b(String str, String... strArr) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (strArr[i10].equals(str)) {
                return i10;
            }
        }
        return -1;
    }

    static String c(l2.f fVar) {
        Iterator<String> it = fVar.i0().iterator();
        while (it.hasNext()) {
            if (it.next().equals("type")) {
                return fVar.c0("type");
            }
        }
        return null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void d(m2.g r9, java.lang.String r10, l2.f r11) {
        /*
            r0 = 2
            r1 = -1
            r2 = 1
            r3 = 0
            boolean r4 = r9.r()
            m2.g$c r5 = m2.g.c.END
            n2.c r10 = r9.b(r10, r5)
            java.util.ArrayList r5 = r11.i0()
            if (r5 != 0) goto L_0x0015
            return
        L_0x0015:
            java.util.Iterator r5 = r5.iterator()
        L_0x0019:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0120
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            r6.hashCode()
            int r7 = r6.hashCode()
            switch(r7) {
                case -1081309778: goto L_0x0047;
                case -962590849: goto L_0x003c;
                case -567445985: goto L_0x0031;
                default: goto L_0x002f;
            }
        L_0x002f:
            r7 = r1
            goto L_0x0051
        L_0x0031:
            java.lang.String r7 = "contains"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L_0x003a
            goto L_0x002f
        L_0x003a:
            r7 = r0
            goto L_0x0051
        L_0x003c:
            java.lang.String r7 = "direction"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L_0x0045
            goto L_0x002f
        L_0x0045:
            r7 = r2
            goto L_0x0051
        L_0x0047:
            java.lang.String r7 = "margin"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L_0x0050
            goto L_0x002f
        L_0x0050:
            r7 = r3
        L_0x0051:
            switch(r7) {
                case 0: goto L_0x0109;
                case 1: goto L_0x0077;
                case 2: goto L_0x0055;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x0019
        L_0x0055:
            l2.a r6 = r11.R(r6)
            if (r6 == 0) goto L_0x0019
            r7 = r3
        L_0x005c:
            int r8 = r6.size()
            if (r7 >= r8) goto L_0x0019
            l2.c r8 = r6.O(r7)
            java.lang.String r8 = r8.j()
            m2.a r8 = r9.d(r8)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            r10.s0(r8)
            int r7 = r7 + r2
            goto L_0x005c
        L_0x0077:
            java.lang.String r6 = r11.c0(r6)
            r6.hashCode()
            int r7 = r6.hashCode()
            switch(r7) {
                case -1383228885: goto L_0x00be;
                case 100571: goto L_0x00b3;
                case 115029: goto L_0x00a8;
                case 3317767: goto L_0x009d;
                case 108511772: goto L_0x0092;
                case 109757538: goto L_0x0087;
                default: goto L_0x0085;
            }
        L_0x0085:
            r6 = r1
            goto L_0x00c8
        L_0x0087:
            java.lang.String r7 = "start"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0090
            goto L_0x0085
        L_0x0090:
            r6 = 5
            goto L_0x00c8
        L_0x0092:
            java.lang.String r7 = "right"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x009b
            goto L_0x0085
        L_0x009b:
            r6 = 4
            goto L_0x00c8
        L_0x009d:
            java.lang.String r7 = "left"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x00a6
            goto L_0x0085
        L_0x00a6:
            r6 = 3
            goto L_0x00c8
        L_0x00a8:
            java.lang.String r7 = "top"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x00b1
            goto L_0x0085
        L_0x00b1:
            r6 = r0
            goto L_0x00c8
        L_0x00b3:
            java.lang.String r7 = "end"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x00bc
            goto L_0x0085
        L_0x00bc:
            r6 = r2
            goto L_0x00c8
        L_0x00be:
            java.lang.String r7 = "bottom"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x00c7
            goto L_0x0085
        L_0x00c7:
            r6 = r3
        L_0x00c8:
            switch(r6) {
                case 0: goto L_0x0102;
                case 1: goto L_0x00f2;
                case 2: goto L_0x00eb;
                case 3: goto L_0x00e4;
                case 4: goto L_0x00dd;
                case 5: goto L_0x00cd;
                default: goto L_0x00cb;
            }
        L_0x00cb:
            goto L_0x0019
        L_0x00cd:
            if (r4 != 0) goto L_0x00d6
            m2.g$c r6 = m2.g.c.LEFT
            r10.w0(r6)
            goto L_0x0019
        L_0x00d6:
            m2.g$c r6 = m2.g.c.RIGHT
            r10.w0(r6)
            goto L_0x0019
        L_0x00dd:
            m2.g$c r6 = m2.g.c.RIGHT
            r10.w0(r6)
            goto L_0x0019
        L_0x00e4:
            m2.g$c r6 = m2.g.c.LEFT
            r10.w0(r6)
            goto L_0x0019
        L_0x00eb:
            m2.g$c r6 = m2.g.c.TOP
            r10.w0(r6)
            goto L_0x0019
        L_0x00f2:
            if (r4 != 0) goto L_0x00fb
            m2.g$c r6 = m2.g.c.RIGHT
            r10.w0(r6)
            goto L_0x0019
        L_0x00fb:
            m2.g$c r6 = m2.g.c.LEFT
            r10.w0(r6)
            goto L_0x0019
        L_0x0102:
            m2.g$c r6 = m2.g.c.BOTTOM
            r10.w0(r6)
            goto L_0x0019
        L_0x0109:
            float r6 = r11.V(r6)
            boolean r7 = java.lang.Float.isNaN(r6)
            if (r7 != 0) goto L_0x0019
            float r6 = z(r9, r6)
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r10.K(r6)
            goto L_0x0019
        L_0x0120:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C5574b.d(m2.g, java.lang.String, l2.f):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void e(int r6, m2.g r7, m2.C5574b.e r8, l2.C5517a r9) {
        /*
            r0 = 1
            if (r6 != 0) goto L_0x0008
            n2.i r6 = r7.o()
            goto L_0x000c
        L_0x0008:
            n2.j r6 = r7.C()
        L_0x000c:
            l2.c r1 = r9.O(r0)
            boolean r2 = r1 instanceof l2.C5517a
            if (r2 == 0) goto L_0x00ae
            l2.a r1 = (l2.C5517a) r1
            int r2 = r1.size()
            if (r2 >= r0) goto L_0x001e
            goto L_0x00ae
        L_0x001e:
            r2 = 0
            r3 = r2
        L_0x0020:
            int r4 = r1.size()
            if (r3 >= r4) goto L_0x0033
            java.lang.String r4 = r1.b0(r3)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r6.s0(r4)
            int r3 = r3 + r0
            goto L_0x0020
        L_0x0033:
            int r1 = r9.size()
            r3 = 2
            if (r1 <= r3) goto L_0x00ae
            l2.c r9 = r9.O(r3)
            boolean r1 = r9 instanceof l2.f
            if (r1 != 0) goto L_0x0043
            return
        L_0x0043:
            l2.f r9 = (l2.f) r9
            java.util.ArrayList r1 = r9.i0()
            java.util.Iterator r1 = r1.iterator()
        L_0x004d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00ae
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            r3.hashCode()
            java.lang.String r4 = "style"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x0068
            h(r7, r8, r9, r6, r3)
            goto L_0x004d
        L_0x0068:
            l2.c r3 = r9.P(r3)
            boolean r4 = r3 instanceof l2.C5517a
            if (r4 == 0) goto L_0x0085
            r4 = r3
            l2.a r4 = (l2.C5517a) r4
            int r5 = r4.size()
            if (r5 <= r0) goto L_0x0085
            java.lang.String r3 = r4.b0(r2)
            float r4 = r4.S(r0)
            r6.x0(r4)
            goto L_0x0089
        L_0x0085:
            java.lang.String r3 = r3.j()
        L_0x0089:
            r3.hashCode()
            java.lang.String r4 = "packed"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x00a8
            java.lang.String r4 = "spread_inside"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00a2
            m2.g$a r3 = m2.g.a.SPREAD
            r6.D0(r3)
            goto L_0x004d
        L_0x00a2:
            m2.g$a r3 = m2.g.a.SPREAD_INSIDE
            r6.D0(r3)
            goto L_0x004d
        L_0x00a8:
            m2.g$a r3 = m2.g.a.PACKED
            r6.D0(r3)
            goto L_0x004d
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C5574b.e(int, m2.g, m2.b$e, l2.a):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void f(java.lang.String r21, m2.g r22, java.lang.String r23, m2.C5574b.e r24, l2.f r25) {
        /*
            r0 = r22
            r1 = r23
            r2 = r25
            r3 = 6
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            r10 = r21
            char r10 = r10.charAt(r9)
            r11 = 104(0x68, float:1.46E-43)
            if (r10 != r11) goto L_0x001c
            n2.i r10 = r22.o()
            goto L_0x0020
        L_0x001c:
            n2.j r10 = r22.C()
        L_0x0020:
            r10.c(r1)
            java.util.ArrayList r11 = r25.i0()
            java.util.Iterator r18 = r11.iterator()
        L_0x002b:
            boolean r11 = r18.hasNext()
            if (r11 == 0) goto L_0x01fc
            java.lang.Object r11 = r18.next()
            java.lang.String r11 = (java.lang.String) r11
            r11.hashCode()
            r12 = -1
            int r13 = r11.hashCode()
            switch(r13) {
                case -1383228885: goto L_0x0092;
                case -567445985: goto L_0x0087;
                case 100571: goto L_0x007c;
                case 115029: goto L_0x0071;
                case 3317767: goto L_0x0066;
                case 108511772: goto L_0x005b;
                case 109757538: goto L_0x0050;
                case 109780401: goto L_0x0044;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x009c
        L_0x0044:
            java.lang.String r13 = "style"
            boolean r13 = r11.equals(r13)
            if (r13 != 0) goto L_0x004e
            goto L_0x009c
        L_0x004e:
            r12 = 7
            goto L_0x009c
        L_0x0050:
            java.lang.String r13 = "start"
            boolean r13 = r11.equals(r13)
            if (r13 != 0) goto L_0x0059
            goto L_0x009c
        L_0x0059:
            r12 = r3
            goto L_0x009c
        L_0x005b:
            java.lang.String r13 = "right"
            boolean r13 = r11.equals(r13)
            if (r13 != 0) goto L_0x0064
            goto L_0x009c
        L_0x0064:
            r12 = r4
            goto L_0x009c
        L_0x0066:
            java.lang.String r13 = "left"
            boolean r13 = r11.equals(r13)
            if (r13 != 0) goto L_0x006f
            goto L_0x009c
        L_0x006f:
            r12 = r5
            goto L_0x009c
        L_0x0071:
            java.lang.String r13 = "top"
            boolean r13 = r11.equals(r13)
            if (r13 != 0) goto L_0x007a
            goto L_0x009c
        L_0x007a:
            r12 = r6
            goto L_0x009c
        L_0x007c:
            java.lang.String r13 = "end"
            boolean r13 = r11.equals(r13)
            if (r13 != 0) goto L_0x0085
            goto L_0x009c
        L_0x0085:
            r12 = r7
            goto L_0x009c
        L_0x0087:
            java.lang.String r13 = "contains"
            boolean r13 = r11.equals(r13)
            if (r13 != 0) goto L_0x0090
            goto L_0x009c
        L_0x0090:
            r12 = r8
            goto L_0x009c
        L_0x0092:
            java.lang.String r13 = "bottom"
            boolean r13 = r11.equals(r13)
            if (r13 != 0) goto L_0x009b
            goto L_0x009c
        L_0x009b:
            r12 = r9
        L_0x009c:
            switch(r12) {
                case 0: goto L_0x01f1;
                case 1: goto L_0x00ea;
                case 2: goto L_0x01f1;
                case 3: goto L_0x01f1;
                case 4: goto L_0x01f1;
                case 5: goto L_0x01f1;
                case 6: goto L_0x01f1;
                case 7: goto L_0x00a4;
                default: goto L_0x009f;
            }
        L_0x009f:
            r3 = r24
            r9 = r6
            goto L_0x01f7
        L_0x00a4:
            l2.c r11 = r2.P(r11)
            boolean r12 = r11 instanceof l2.C5517a
            if (r12 == 0) goto L_0x00c1
            r12 = r11
            l2.a r12 = (l2.C5517a) r12
            int r13 = r12.size()
            if (r13 <= r8) goto L_0x00c1
            java.lang.String r11 = r12.b0(r9)
            float r12 = r12.S(r8)
            r10.x0(r12)
            goto L_0x00c5
        L_0x00c1:
            java.lang.String r11 = r11.j()
        L_0x00c5:
            r11.hashCode()
            java.lang.String r12 = "packed"
            boolean r12 = r11.equals(r12)
            if (r12 != 0) goto L_0x00e4
            java.lang.String r12 = "spread_inside"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x00de
            m2.g$a r11 = m2.g.a.SPREAD
            r10.D0(r11)
            goto L_0x009f
        L_0x00de:
            m2.g$a r11 = m2.g.a.SPREAD_INSIDE
            r10.D0(r11)
            goto L_0x009f
        L_0x00e4:
            m2.g$a r11 = m2.g.a.PACKED
            r10.D0(r11)
            goto L_0x009f
        L_0x00ea:
            l2.c r11 = r2.P(r11)
            boolean r12 = r11 instanceof l2.C5517a
            if (r12 == 0) goto L_0x01ce
            r15 = r11
            l2.a r15 = (l2.C5517a) r15
            int r12 = r15.size()
            if (r12 >= r8) goto L_0x00fd
            goto L_0x01ce
        L_0x00fd:
            r14 = r9
        L_0x00fe:
            int r11 = r15.size()
            if (r14 >= r11) goto L_0x01ca
            l2.c r11 = r15.O(r14)
            boolean r12 = r11 instanceof l2.C5517a
            if (r12 == 0) goto L_0x01b1
            l2.a r11 = (l2.C5517a) r11
            int r12 = r11.size()
            if (r12 <= 0) goto L_0x01ab
            l2.c r12 = r11.O(r9)
            java.lang.String r12 = r12.j()
            int r13 = r11.size()
            r16 = 2143289344(0x7fc00000, float:NaN)
            if (r13 == r7) goto L_0x0192
            if (r13 == r6) goto L_0x017d
            if (r13 == r5) goto L_0x015f
            if (r13 == r3) goto L_0x0133
            r9 = r6
            r3 = r16
            r6 = r3
            r13 = r6
            r17 = r13
            goto L_0x019d
        L_0x0133:
            float r13 = r11.S(r8)
            float r3 = r11.S(r7)
            float r3 = z(r0, r3)
            float r9 = r11.S(r6)
            float r9 = z(r0, r9)
            float r6 = r11.S(r5)
            float r6 = z(r0, r6)
            float r11 = r11.S(r4)
            float r11 = z(r0, r11)
            r16 = r3
            r3 = r6
            r6 = r9
            r17 = r11
            r9 = 3
            goto L_0x019d
        L_0x015f:
            float r3 = r11.S(r8)
            float r6 = r11.S(r7)
            float r6 = z(r0, r6)
            r9 = 3
            float r11 = r11.S(r9)
            float r11 = z(r0, r11)
            r13 = r3
            r3 = r16
            r17 = r3
            r16 = r6
            r6 = r11
            goto L_0x019d
        L_0x017d:
            r9 = r6
            float r3 = r11.S(r8)
            float r6 = r11.S(r7)
            float r6 = z(r0, r6)
            r13 = r3
            r3 = r16
            r17 = r3
            r16 = r6
            goto L_0x019d
        L_0x0192:
            r9 = r6
            float r3 = r11.S(r8)
            r13 = r3
            r3 = r16
            r6 = r3
            r17 = r6
        L_0x019d:
            r11 = r10
            r19 = r14
            r14 = r16
            r20 = r15
            r15 = r6
            r16 = r3
            r11.w0(r12, r13, r14, r15, r16, r17)
            goto L_0x01c1
        L_0x01ab:
            r9 = r6
            r19 = r14
            r20 = r15
            goto L_0x01c1
        L_0x01b1:
            r9 = r6
            r19 = r14
            r20 = r15
            java.lang.String r3 = r11.j()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r10.s0(r3)
        L_0x01c1:
            int r14 = r19 + 1
            r6 = r9
            r15 = r20
            r3 = 6
            r9 = 0
            goto L_0x00fe
        L_0x01ca:
            r9 = r6
            r3 = r24
            goto L_0x01f7
        L_0x01ce:
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " contains should be an array \""
            r2.append(r1)
            java.lang.String r1 = r11.j()
            r2.append(r1)
            java.lang.String r1 = "\""
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.println(r1)
            return
        L_0x01f1:
            r3 = r24
            r9 = r6
            h(r0, r3, r2, r10, r11)
        L_0x01f7:
            r6 = r9
            r3 = 6
            r9 = 0
            goto L_0x002b
        L_0x01fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C5574b.f(java.lang.String, m2.g, java.lang.String, m2.b$e, l2.f):void");
    }

    static long g(String str) {
        if (!str.startsWith("#")) {
            return -1;
        }
        String substring = str.substring(1);
        if (substring.length() == 6) {
            substring = "FF" + substring;
        }
        return Long.parseLong(substring, 16);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01ec, code lost:
        r0 = r15;
        r18 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01ef, code lost:
        if (r18 == false) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01f1, code lost:
        r7.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01f8, code lost:
        switch(r7.hashCode()) {
            case 100571: goto L_0x0218;
            case 3317767: goto L_0x020f;
            case 108511772: goto L_0x0206;
            case 109757538: goto L_0x01fd;
            default: goto L_0x01fb;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01fb, code lost:
        r10 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0201, code lost:
        if (r7.equals("start") != false) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0204, code lost:
        r10 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x020a, code lost:
        if (r7.equals("right") != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x020d, code lost:
        r10 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0213, code lost:
        if (r7.equals("left") != false) goto L_0x0216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0216, code lost:
        r10 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x021c, code lost:
        if (r7.equals("end") != false) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x021f, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0220, code lost:
        switch(r10) {
            case 0: goto L_0x022a;
            case 1: goto L_0x0223;
            case 2: goto L_0x0228;
            case 3: goto L_0x0225;
            default: goto L_0x0223;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0223, code lost:
        r7 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0225, code lost:
        r7 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0228, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x022a, code lost:
        r7 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x022c, code lost:
        if (r0 == false) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x022e, code lost:
        if (r7 == false) goto L_0x0234;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0230, code lost:
        r4.H(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0234, code lost:
        r4.I(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0238, code lost:
        if (r7 == false) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x023a, code lost:
        r4.Q(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x023e, code lost:
        r4.R(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0241, code lost:
        r4.K(java.lang.Float.valueOf(r22)).M(java.lang.Float.valueOf(r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d1, code lost:
        r1 = 2;
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d9, code lost:
        r1 = 2;
        r15 = true;
        r18 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void h(m2.g r20, m2.C5574b.e r21, l2.f r22, m2.C5573a r23, java.lang.String r24) {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            java.lang.String r5 = "right"
            java.lang.String r6 = "left"
            java.lang.String r8 = "start"
            java.lang.String r9 = "end"
            java.lang.String r11 = "top"
            java.lang.String r12 = "bottom"
            java.lang.String r13 = "baseline"
            r7 = 0
            r14 = 1
            boolean r16 = r20.r()
            r17 = r16 ^ 1
            l2.a r10 = r2.R(r4)
            java.lang.String r15 = "parent"
            if (r10 == 0) goto L_0x0252
            int r2 = r10.size()
            if (r2 <= r14) goto L_0x0252
            java.lang.String r2 = r10.b0(r7)
            java.lang.String r7 = r10.d0(r14)
            int r14 = r10.size()
            r19 = 0
            r3 = 2
            if (r14 <= r3) goto L_0x004c
            l2.c r14 = r10.Z(r3)
            float r3 = r1.a(r14)
            float r3 = z(r0, r3)
            goto L_0x004e
        L_0x004c:
            r3 = r19
        L_0x004e:
            int r14 = r10.size()
            r22 = r3
            r3 = 3
            if (r14 <= r3) goto L_0x0064
            l2.c r14 = r10.Z(r3)
            float r14 = r1.a(r14)
            float r14 = z(r0, r14)
            goto L_0x0066
        L_0x0064:
            r14 = r19
        L_0x0066:
            boolean r15 = r2.equals(r15)
            if (r15 == 0) goto L_0x0073
            java.lang.Integer r2 = m2.g.f26155k
            m2.a r2 = r0.d(r2)
            goto L_0x0077
        L_0x0073:
            m2.a r2 = r0.d(r2)
        L_0x0077:
            r24.hashCode()
            int r15 = r24.hashCode()
            switch(r15) {
                case -1720785339: goto L_0x00c4;
                case -1498085729: goto L_0x00b9;
                case -1383228885: goto L_0x00b0;
                case 100571: goto L_0x00a7;
                case 115029: goto L_0x009e;
                case 3317767: goto L_0x0095;
                case 108511772: goto L_0x008c;
                case 109757538: goto L_0x0083;
                default: goto L_0x0081;
            }
        L_0x0081:
            r4 = -1
            goto L_0x00cc
        L_0x0083:
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x008a
            goto L_0x0081
        L_0x008a:
            r4 = 7
            goto L_0x00cc
        L_0x008c:
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0093
            goto L_0x0081
        L_0x0093:
            r4 = 6
            goto L_0x00cc
        L_0x0095:
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x009c
            goto L_0x0081
        L_0x009c:
            r4 = 5
            goto L_0x00cc
        L_0x009e:
            boolean r4 = r4.equals(r11)
            if (r4 != 0) goto L_0x00a5
            goto L_0x0081
        L_0x00a5:
            r4 = 4
            goto L_0x00cc
        L_0x00a7:
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x00ae
            goto L_0x0081
        L_0x00ae:
            r4 = r3
            goto L_0x00cc
        L_0x00b0:
            boolean r4 = r4.equals(r12)
            if (r4 != 0) goto L_0x00b7
            goto L_0x0081
        L_0x00b7:
            r4 = 2
            goto L_0x00cc
        L_0x00b9:
            java.lang.String r15 = "circular"
            boolean r4 = r4.equals(r15)
            if (r4 != 0) goto L_0x00c2
            goto L_0x0081
        L_0x00c2:
            r4 = 1
            goto L_0x00cc
        L_0x00c4:
            boolean r4 = r4.equals(r13)
            if (r4 != 0) goto L_0x00cb
            goto L_0x0081
        L_0x00cb:
            r4 = 0
        L_0x00cc:
            switch(r4) {
                case 0: goto L_0x0197;
                case 1: goto L_0x0172;
                case 2: goto L_0x012f;
                case 3: goto L_0x012a;
                case 4: goto L_0x00e7;
                case 5: goto L_0x00e3;
                case 6: goto L_0x00df;
                case 7: goto L_0x00d5;
                default: goto L_0x00cf;
            }
        L_0x00cf:
            r4 = r23
        L_0x00d1:
            r1 = 2
            r15 = 1
            goto L_0x01ec
        L_0x00d5:
            r4 = r23
            r0 = r17
        L_0x00d9:
            r1 = 2
            r15 = 1
            r18 = 1
            goto L_0x01ef
        L_0x00df:
            r4 = r23
            r0 = 0
            goto L_0x00d9
        L_0x00e3:
            r4 = r23
            r0 = 1
            goto L_0x00d9
        L_0x00e7:
            r7.hashCode()
            int r1 = r7.hashCode()
            switch(r1) {
                case -1720785339: goto L_0x0105;
                case -1383228885: goto L_0x00fc;
                case 115029: goto L_0x00f3;
                default: goto L_0x00f1;
            }
        L_0x00f1:
            r1 = -1
            goto L_0x010d
        L_0x00f3:
            boolean r1 = r7.equals(r11)
            if (r1 != 0) goto L_0x00fa
            goto L_0x00f1
        L_0x00fa:
            r1 = 2
            goto L_0x010d
        L_0x00fc:
            boolean r1 = r7.equals(r12)
            if (r1 != 0) goto L_0x0103
            goto L_0x00f1
        L_0x0103:
            r1 = 1
            goto L_0x010d
        L_0x0105:
            boolean r1 = r7.equals(r13)
            if (r1 != 0) goto L_0x010c
            goto L_0x00f1
        L_0x010c:
            r1 = 0
        L_0x010d:
            switch(r1) {
                case 0: goto L_0x011d;
                case 1: goto L_0x0117;
                case 2: goto L_0x0111;
                default: goto L_0x0110;
            }
        L_0x0110:
            goto L_0x00cf
        L_0x0111:
            r4 = r23
            r4.m0(r2)
            goto L_0x00d1
        L_0x0117:
            r4 = r23
            r4.l0(r2)
            goto L_0x00d1
        L_0x011d:
            r4 = r23
            java.lang.Object r1 = r2.getKey()
            r0.c(r1)
            r4.k0(r2)
            goto L_0x00d1
        L_0x012a:
            r4 = r23
            r0 = r16
            goto L_0x00d9
        L_0x012f:
            r4 = r23
            r7.hashCode()
            int r1 = r7.hashCode()
            switch(r1) {
                case -1720785339: goto L_0x014f;
                case -1383228885: goto L_0x0146;
                case 115029: goto L_0x013d;
                default: goto L_0x013b;
            }
        L_0x013b:
            r1 = -1
            goto L_0x0157
        L_0x013d:
            boolean r1 = r7.equals(r11)
            if (r1 != 0) goto L_0x0144
            goto L_0x013b
        L_0x0144:
            r1 = 2
            goto L_0x0157
        L_0x0146:
            boolean r1 = r7.equals(r12)
            if (r1 != 0) goto L_0x014d
            goto L_0x013b
        L_0x014d:
            r1 = 1
            goto L_0x0157
        L_0x014f:
            boolean r1 = r7.equals(r13)
            if (r1 != 0) goto L_0x0156
            goto L_0x013b
        L_0x0156:
            r1 = 0
        L_0x0157:
            switch(r1) {
                case 0: goto L_0x0166;
                case 1: goto L_0x0161;
                case 2: goto L_0x015c;
                default: goto L_0x015a;
            }
        L_0x015a:
            goto L_0x00d1
        L_0x015c:
            r4.q(r2)
            goto L_0x00d1
        L_0x0161:
            r4.p(r2)
            goto L_0x00d1
        L_0x0166:
            java.lang.Object r1 = r2.getKey()
            r0.c(r1)
            r4.o(r2)
            goto L_0x00d1
        L_0x0172:
            r4 = r23
            r15 = 1
            l2.c r11 = r10.O(r15)
            float r11 = r1.a(r11)
            int r12 = r10.size()
            r13 = 2
            if (r12 <= r13) goto L_0x0190
            l2.c r10 = r10.Z(r13)
            float r1 = r1.a(r10)
            float r19 = z(r0, r1)
        L_0x0190:
            r0 = r19
            r4.r(r2, r11, r0)
            r1 = r13
            goto L_0x01ec
        L_0x0197:
            r4 = r23
            r1 = 2
            r15 = 1
            r7.hashCode()
            int r10 = r7.hashCode()
            switch(r10) {
                case -1720785339: goto L_0x01b9;
                case -1383228885: goto L_0x01b0;
                case 115029: goto L_0x01a7;
                default: goto L_0x01a5;
            }
        L_0x01a5:
            r10 = -1
            goto L_0x01c1
        L_0x01a7:
            boolean r10 = r7.equals(r11)
            if (r10 != 0) goto L_0x01ae
            goto L_0x01a5
        L_0x01ae:
            r10 = r1
            goto L_0x01c1
        L_0x01b0:
            boolean r10 = r7.equals(r12)
            if (r10 != 0) goto L_0x01b7
            goto L_0x01a5
        L_0x01b7:
            r10 = r15
            goto L_0x01c1
        L_0x01b9:
            boolean r10 = r7.equals(r13)
            if (r10 != 0) goto L_0x01c0
            goto L_0x01a5
        L_0x01c0:
            r10 = 0
        L_0x01c1:
            switch(r10) {
                case 0: goto L_0x01db;
                case 1: goto L_0x01d0;
                case 2: goto L_0x01c5;
                default: goto L_0x01c4;
            }
        L_0x01c4:
            goto L_0x01ec
        L_0x01c5:
            java.lang.Object r10 = r23.getKey()
            r0.c(r10)
            r4.m(r2)
            goto L_0x01ec
        L_0x01d0:
            java.lang.Object r10 = r23.getKey()
            r0.c(r10)
            r4.l(r2)
            goto L_0x01ec
        L_0x01db:
            java.lang.Object r10 = r23.getKey()
            r0.c(r10)
            java.lang.Object r10 = r2.getKey()
            r0.c(r10)
            r4.k(r2)
        L_0x01ec:
            r0 = r15
            r18 = 0
        L_0x01ef:
            if (r18 == 0) goto L_0x0241
            r7.hashCode()
            int r10 = r7.hashCode()
            switch(r10) {
                case 100571: goto L_0x0218;
                case 3317767: goto L_0x020f;
                case 108511772: goto L_0x0206;
                case 109757538: goto L_0x01fd;
                default: goto L_0x01fb;
            }
        L_0x01fb:
            r10 = -1
            goto L_0x0220
        L_0x01fd:
            boolean r1 = r7.equals(r8)
            if (r1 != 0) goto L_0x0204
            goto L_0x01fb
        L_0x0204:
            r10 = r3
            goto L_0x0220
        L_0x0206:
            boolean r3 = r7.equals(r5)
            if (r3 != 0) goto L_0x020d
            goto L_0x01fb
        L_0x020d:
            r10 = r1
            goto L_0x0220
        L_0x020f:
            boolean r1 = r7.equals(r6)
            if (r1 != 0) goto L_0x0216
            goto L_0x01fb
        L_0x0216:
            r10 = r15
            goto L_0x0220
        L_0x0218:
            boolean r1 = r7.equals(r9)
            if (r1 != 0) goto L_0x021f
            goto L_0x01fb
        L_0x021f:
            r10 = 0
        L_0x0220:
            switch(r10) {
                case 0: goto L_0x022a;
                case 1: goto L_0x0223;
                case 2: goto L_0x0228;
                case 3: goto L_0x0225;
                default: goto L_0x0223;
            }
        L_0x0223:
            r7 = r15
            goto L_0x022c
        L_0x0225:
            r7 = r17
            goto L_0x022c
        L_0x0228:
            r7 = 0
            goto L_0x022c
        L_0x022a:
            r7 = r16
        L_0x022c:
            if (r0 == 0) goto L_0x0238
            if (r7 == 0) goto L_0x0234
            r4.H(r2)
            goto L_0x0241
        L_0x0234:
            r4.I(r2)
            goto L_0x0241
        L_0x0238:
            if (r7 == 0) goto L_0x023e
            r4.Q(r2)
            goto L_0x0241
        L_0x023e:
            r4.R(r2)
        L_0x0241:
            java.lang.Float r0 = java.lang.Float.valueOf(r22)
            m2.a r0 = r4.K(r0)
            java.lang.Float r1 = java.lang.Float.valueOf(r14)
            r0.M(r1)
            goto L_0x02d8
        L_0x0252:
            r2 = r3
            r5 = r14
            r1 = 2
            r3 = 3
            r6 = r22
            java.lang.String r6 = r6.g0(r4)
            if (r6 == 0) goto L_0x02d8
            boolean r7 = r6.equals(r15)
            if (r7 == 0) goto L_0x026b
            java.lang.Integer r6 = m2.g.f26155k
            m2.a r6 = r0.d(r6)
            goto L_0x026f
        L_0x026b:
            m2.a r6 = r0.d(r6)
        L_0x026f:
            r24.hashCode()
            int r7 = r24.hashCode()
            switch(r7) {
                case -1720785339: goto L_0x029f;
                case -1383228885: goto L_0x0296;
                case 100571: goto L_0x028d;
                case 115029: goto L_0x0284;
                case 109757538: goto L_0x027b;
                default: goto L_0x0279;
            }
        L_0x0279:
            r7 = -1
            goto L_0x02a7
        L_0x027b:
            boolean r1 = r4.equals(r8)
            if (r1 != 0) goto L_0x0282
            goto L_0x0279
        L_0x0282:
            r7 = 4
            goto L_0x02a7
        L_0x0284:
            boolean r1 = r4.equals(r11)
            if (r1 != 0) goto L_0x028b
            goto L_0x0279
        L_0x028b:
            r7 = r3
            goto L_0x02a7
        L_0x028d:
            boolean r3 = r4.equals(r9)
            if (r3 != 0) goto L_0x0294
            goto L_0x0279
        L_0x0294:
            r7 = r1
            goto L_0x02a7
        L_0x0296:
            boolean r1 = r4.equals(r12)
            if (r1 != 0) goto L_0x029d
            goto L_0x0279
        L_0x029d:
            r7 = r5
            goto L_0x02a7
        L_0x029f:
            boolean r1 = r4.equals(r13)
            if (r1 != 0) goto L_0x02a6
            goto L_0x0279
        L_0x02a6:
            r7 = 0
        L_0x02a7:
            switch(r7) {
                case 0: goto L_0x02c7;
                case 1: goto L_0x02c3;
                case 2: goto L_0x02b9;
                case 3: goto L_0x02b5;
                case 4: goto L_0x02ab;
                default: goto L_0x02aa;
            }
        L_0x02aa:
            goto L_0x02d8
        L_0x02ab:
            if (r16 != 0) goto L_0x02b1
            r2.H(r6)
            goto L_0x02d8
        L_0x02b1:
            r2.R(r6)
            goto L_0x02d8
        L_0x02b5:
            r2.m0(r6)
            goto L_0x02d8
        L_0x02b9:
            if (r16 != 0) goto L_0x02bf
            r2.R(r6)
            goto L_0x02d8
        L_0x02bf:
            r2.H(r6)
            goto L_0x02d8
        L_0x02c3:
            r2.p(r6)
            goto L_0x02d8
        L_0x02c7:
            java.lang.Object r1 = r23.getKey()
            r0.c(r1)
            java.lang.Object r1 = r6.getKey()
            r0.c(r1)
            r2.k(r6)
        L_0x02d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C5574b.h(m2.g, m2.b$e, l2.f, m2.a, java.lang.String):void");
    }

    static void i(l2.f fVar, C5573a aVar, String str) {
        ArrayList<String> i02;
        l2.f Y10 = fVar.Y(str);
        if (Y10 != null && (i02 = Y10.i0()) != null) {
            Iterator<String> it = i02.iterator();
            while (it.hasNext()) {
                String next = it.next();
                C5519c P10 = Y10.P(next);
                if (P10 instanceof l2.e) {
                    aVar.f(next, P10.p());
                } else if (P10 instanceof i) {
                    long g10 = g(P10.j());
                    if (g10 != -1) {
                        aVar.e(next, (int) g10);
                    }
                }
            }
        }
    }

    public static void j(String str, ArrayList<a> arrayList) {
        l2.f d10 = g.d(str);
        ArrayList<String> i02 = d10.i0();
        if (i02 != null && i02.size() > 0) {
            String str2 = i02.get(0);
            C5519c P10 = d10.P(str2);
            str2.hashCode();
            if (str2.equals("Design") && (P10 instanceof l2.f)) {
                l2.f fVar = (l2.f) P10;
                ArrayList<String> i03 = fVar.i0();
                for (int i10 = 0; i10 < i03.size(); i10++) {
                    String str3 = i03.get(i10);
                    l2.f fVar2 = (l2.f) fVar.P(str3);
                    System.out.printf("element found " + str3 + "", new Object[0]);
                    String g02 = fVar2.g0("type");
                    if (g02 != null) {
                        HashMap hashMap = new HashMap();
                        int size = fVar2.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            C5520d dVar = (C5520d) fVar2.O(i10);
                            String j10 = dVar.j();
                            String j11 = dVar.r0().j();
                            if (j11 != null) {
                                hashMap.put(j10, j11);
                            }
                        }
                        arrayList.add(new a(str2, g02, hashMap));
                    }
                }
            }
        }
    }

    static d k(l2.f fVar, String str, g gVar, C5575c cVar) {
        C5519c P10 = fVar.P(str);
        d b10 = d.b(0);
        if (P10 instanceof i) {
            return l(P10.j());
        }
        if (P10 instanceof l2.e) {
            return d.b(gVar.e(Float.valueOf(cVar.a(fVar.T(str)))));
        }
        if (!(P10 instanceof l2.f)) {
            return b10;
        }
        l2.f fVar2 = (l2.f) P10;
        String g02 = fVar2.g0("value");
        if (g02 != null) {
            b10 = l(g02);
        }
        C5519c a02 = fVar2.a0("min");
        if (a02 != null) {
            if (a02 instanceof l2.e) {
                b10.o(gVar.e(Float.valueOf(cVar.a(((l2.e) a02).p()))));
            } else if (a02 instanceof i) {
                b10.p(d.f26138j);
            }
        }
        C5519c a03 = fVar2.a0("max");
        if (a03 == null) {
            return b10;
        }
        if (a03 instanceof l2.e) {
            b10.m(gVar.e(Float.valueOf(cVar.a(((l2.e) a03).p()))));
            return b10;
        } else if (!(a03 instanceof i)) {
            return b10;
        } else {
            b10.n(d.f26138j);
            return b10;
        }
    }

    static d l(String str) {
        d b10 = d.b(0);
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1460244870:
                if (str.equals("preferWrap")) {
                    c10 = 0;
                    break;
                }
                break;
            case -995424086:
                if (str.equals("parent")) {
                    c10 = 1;
                    break;
                }
                break;
            case -895684237:
                if (str.equals("spread")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3657802:
                if (str.equals("wrap")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return d.g(d.f26138j);
            case 1:
                return d.d();
            case 2:
                return d.g(d.f26139k);
            case 3:
                return d.h();
            default:
                return str.endsWith("%") ? d.e(0, Float.parseFloat(str.substring(0, str.indexOf(37))) / 100.0f).s(0) : str.contains(":") ? d.f(str).t(d.f26139k) : b10;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x03b8 A[Catch:{ NumberFormatException -> 0x044e }] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03c7 A[Catch:{ NumberFormatException -> 0x044e }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0404  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0411  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x044e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x044e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x044e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x044e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0240 A[Catch:{ NumberFormatException -> 0x044e }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x024f A[Catch:{ NumberFormatException -> 0x044e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m(java.lang.String r17, m2.g r18, java.lang.String r19, m2.C5574b.e r20, l2.f r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r21
            r3 = 4
            r5 = 3
            r6 = 2
            r7 = 0
            r8 = r17
            char r8 = r8.charAt(r7)
            r9 = 118(0x76, float:1.65E-43)
            r10 = 1
            if (r8 != r9) goto L_0x0017
            r8 = r10
            goto L_0x0018
        L_0x0017:
            r8 = r7
        L_0x0018:
            n2.f r8 = r0.i(r1, r8)
            java.util.ArrayList r9 = r21.i0()
            java.util.Iterator r9 = r9.iterator()
        L_0x0024:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x0451
            java.lang.Object r11 = r9.next()
            java.lang.String r11 = (java.lang.String) r11
            r11.hashCode()
            r12 = 1056964608(0x3f000000, float:0.5)
            java.lang.String r13 = ""
            int r14 = r11.hashCode()
            switch(r14) {
                case -1254185091: goto L_0x00d1;
                case -1237307863: goto L_0x00c5;
                case -1198076529: goto L_0x00b9;
                case -853376977: goto L_0x00ae;
                case -836499749: goto L_0x00a3;
                case -806339567: goto L_0x0098;
                case -732635235: goto L_0x008d;
                case -567445985: goto L_0x0082;
                case -488900360: goto L_0x0075;
                case 3169614: goto L_0x0068;
                case 3575610: goto L_0x005b;
                case 3586688: goto L_0x004e;
                case 3657802: goto L_0x0041;
                default: goto L_0x003e;
            }
        L_0x003e:
            r14 = -1
            goto L_0x00dc
        L_0x0041:
            java.lang.String r14 = "wrap"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x004a
            goto L_0x003e
        L_0x004a:
            r14 = 12
            goto L_0x00dc
        L_0x004e:
            java.lang.String r14 = "vGap"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x0057
            goto L_0x003e
        L_0x0057:
            r14 = 11
            goto L_0x00dc
        L_0x005b:
            java.lang.String r14 = "type"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x0064
            goto L_0x003e
        L_0x0064:
            r14 = 10
            goto L_0x00dc
        L_0x0068:
            java.lang.String r14 = "hGap"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x0071
            goto L_0x003e
        L_0x0071:
            r14 = 9
            goto L_0x00dc
        L_0x0075:
            java.lang.String r14 = "maxElement"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x007e
            goto L_0x003e
        L_0x007e:
            r14 = 8
            goto L_0x00dc
        L_0x0082:
            java.lang.String r14 = "contains"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x008b
            goto L_0x003e
        L_0x008b:
            r14 = 7
            goto L_0x00dc
        L_0x008d:
            java.lang.String r14 = "vFlowBias"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x0096
            goto L_0x003e
        L_0x0096:
            r14 = 6
            goto L_0x00dc
        L_0x0098:
            java.lang.String r14 = "padding"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x00a1
            goto L_0x003e
        L_0x00a1:
            r14 = 5
            goto L_0x00dc
        L_0x00a3:
            java.lang.String r14 = "vStyle"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x00ac
            goto L_0x003e
        L_0x00ac:
            r14 = r3
            goto L_0x00dc
        L_0x00ae:
            java.lang.String r14 = "vAlign"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x00b7
            goto L_0x003e
        L_0x00b7:
            r14 = r5
            goto L_0x00dc
        L_0x00b9:
            java.lang.String r14 = "hFlowBias"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x00c3
            goto L_0x003e
        L_0x00c3:
            r14 = r6
            goto L_0x00dc
        L_0x00c5:
            java.lang.String r14 = "hStyle"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x00cf
            goto L_0x003e
        L_0x00cf:
            r14 = r10
            goto L_0x00dc
        L_0x00d1:
            java.lang.String r14 = "hAlign"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L_0x00db
            goto L_0x003e
        L_0x00db:
            r14 = r7
        L_0x00dc:
            switch(r14) {
                case 0: goto L_0x0426;
                case 1: goto L_0x03d0;
                case 2: goto L_0x0367;
                case 3: goto L_0x031a;
                case 4: goto L_0x02c3;
                case 5: goto L_0x0258;
                case 6: goto L_0x01ef;
                case 7: goto L_0x0146;
                case 8: goto L_0x0137;
                case 9: goto L_0x0128;
                case 10: goto L_0x010c;
                case 11: goto L_0x00fd;
                case 12: goto L_0x00ea;
                default: goto L_0x00df;
            }
        L_0x00df:
            m2.a r12 = r18.d(r19)
            r14 = r20
            a(r0, r14, r12, r2, r11)
            goto L_0x044e
        L_0x00ea:
            r14 = r20
            l2.c r11 = r2.P(r11)
            java.lang.String r11 = r11.j()
            int r11 = m2.g.e.b(r11)
            r8.R0(r11)
            goto L_0x044e
        L_0x00fd:
            r14 = r20
            l2.c r11 = r2.P(r11)
            int r11 = r11.r()
            r8.P0(r11)
            goto L_0x044e
        L_0x010c:
            r14 = r20
            l2.c r11 = r2.P(r11)
            java.lang.String r11 = r11.j()
            java.lang.String r12 = "hFlow"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x0123
            r8.J0(r7)
            goto L_0x044e
        L_0x0123:
            r8.J0(r10)
            goto L_0x044e
        L_0x0128:
            r14 = r20
            l2.c r11 = r2.P(r11)
            int r11 = r11.r()
            r8.C0(r11)
            goto L_0x044e
        L_0x0137:
            r14 = r20
            l2.c r11 = r2.P(r11)
            int r11 = r11.r()
            r8.I0(r11)
            goto L_0x044e
        L_0x0146:
            r14 = r20
            l2.c r11 = r2.P(r11)
            boolean r12 = r11 instanceof l2.C5517a
            if (r12 == 0) goto L_0x01cc
            r12 = r11
            l2.a r12 = (l2.C5517a) r12
            int r13 = r12.size()
            if (r13 >= r10) goto L_0x015b
            goto L_0x01cc
        L_0x015b:
            r11 = r7
        L_0x015c:
            int r13 = r12.size()
            if (r11 >= r13) goto L_0x044e
            l2.c r13 = r12.O(r11)
            boolean r15 = r13 instanceof l2.C5517a
            if (r15 == 0) goto L_0x01be
            l2.a r13 = (l2.C5517a) r13
            int r15 = r13.size()
            if (r15 <= 0) goto L_0x01c9
            l2.c r15 = r13.O(r7)
            java.lang.String r15 = r15.j()
            int r4 = r13.size()
            r16 = 2143289344(0x7fc00000, float:NaN)
            if (r4 == r6) goto L_0x01b3
            if (r4 == r5) goto L_0x01a4
            if (r4 == r3) goto L_0x018b
            r3 = r16
            r4 = r3
            r13 = r4
            goto L_0x01ba
        L_0x018b:
            float r16 = r13.S(r10)
            float r4 = r13.S(r6)
            float r4 = z(r0, r4)
            float r13 = r13.S(r5)
            float r13 = z(r0, r13)
            r3 = r13
            r13 = r4
        L_0x01a1:
            r4 = r16
            goto L_0x01ba
        L_0x01a4:
            float r16 = r13.S(r10)
            float r4 = r13.S(r6)
            float r4 = z(r0, r4)
            r3 = r4
            r13 = r3
            goto L_0x01a1
        L_0x01b3:
            float r4 = r13.S(r10)
            r3 = r16
            r13 = r3
        L_0x01ba:
            r8.w0(r15, r4, r13, r3)
            goto L_0x01c9
        L_0x01be:
            java.lang.String r3 = r13.j()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r8.s0(r3)
        L_0x01c9:
            int r11 = r11 + r10
            r3 = 4
            goto L_0x015c
        L_0x01cc:
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " contains should be an array \""
            r2.append(r1)
            java.lang.String r1 = r11.j()
            r2.append(r1)
            java.lang.String r1 = "\""
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.println(r1)
            return
        L_0x01ef:
            r14 = r20
            l2.c r3 = r2.P(r11)
            java.lang.Float r4 = java.lang.Float.valueOf(r12)
            java.lang.Float r11 = java.lang.Float.valueOf(r12)
            boolean r13 = r3 instanceof l2.C5517a
            if (r13 == 0) goto L_0x0229
            r13 = r3
            l2.a r13 = (l2.C5517a) r13
            int r15 = r13.size()
            if (r15 <= r10) goto L_0x0229
            float r3 = r13.S(r7)
            java.lang.Float r4 = java.lang.Float.valueOf(r3)
            float r3 = r13.S(r10)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            int r15 = r13.size()
            if (r15 <= r6) goto L_0x0231
            float r11 = r13.S(r6)
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            goto L_0x0231
        L_0x0229:
            float r3 = r3.p()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
        L_0x0231:
            float r3 = r3.floatValue()     // Catch:{ NumberFormatException -> 0x044e }
            r8.q0(r3)     // Catch:{ NumberFormatException -> 0x044e }
            float r3 = r4.floatValue()     // Catch:{ NumberFormatException -> 0x044e }
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x0247
            float r3 = r4.floatValue()     // Catch:{ NumberFormatException -> 0x044e }
            r8.z0(r3)     // Catch:{ NumberFormatException -> 0x044e }
        L_0x0247:
            float r3 = r11.floatValue()     // Catch:{ NumberFormatException -> 0x044e }
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x044e
            float r3 = r11.floatValue()     // Catch:{ NumberFormatException -> 0x044e }
            r8.G0(r3)     // Catch:{ NumberFormatException -> 0x044e }
            goto L_0x044e
        L_0x0258:
            r14 = r20
            l2.c r3 = r2.P(r11)
            boolean r4 = r3 instanceof l2.C5517a
            if (r4 == 0) goto L_0x028d
            r4 = r3
            l2.a r4 = (l2.C5517a) r4
            int r11 = r4.size()
            if (r11 <= r10) goto L_0x028d
            int r11 = r4.getInt(r7)
            float r11 = (float) r11
            int r12 = r4.getInt(r10)
            float r12 = (float) r12
            int r13 = r4.size()
            if (r13 <= r6) goto L_0x028a
            int r4 = r4.getInt(r6)
            float r4 = (float) r4
            l2.a r3 = (l2.C5517a) r3     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0288 }
            int r3 = r3.getInt(r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0288 }
            float r3 = (float) r3
            goto L_0x0295
        L_0x0288:
            r3 = 0
            goto L_0x0295
        L_0x028a:
            r4 = r11
            r3 = r12
            goto L_0x0295
        L_0x028d:
            int r3 = r3.r()
            float r11 = (float) r3
            r3 = r11
            r4 = r3
            r12 = r4
        L_0x0295:
            float r11 = z(r0, r11)
            int r11 = java.lang.Math.round(r11)
            r8.L0(r11)
            float r11 = z(r0, r12)
            int r11 = java.lang.Math.round(r11)
            r8.N0(r11)
            float r4 = z(r0, r4)
            int r4 = java.lang.Math.round(r4)
            r8.M0(r4)
            float r3 = z(r0, r3)
            int r3 = java.lang.Math.round(r3)
            r8.K0(r3)
            goto L_0x044e
        L_0x02c3:
            r14 = r20
            l2.c r3 = r2.P(r11)
            boolean r4 = r3 instanceof l2.C5517a
            if (r4 == 0) goto L_0x02eb
            r4 = r3
            l2.a r4 = (l2.C5517a) r4
            int r11 = r4.size()
            if (r11 <= r10) goto L_0x02eb
            java.lang.String r3 = r4.b0(r7)
            java.lang.String r11 = r4.b0(r10)
            int r12 = r4.size()
            if (r12 <= r6) goto L_0x02e9
            java.lang.String r4 = r4.b0(r6)
            goto L_0x02f1
        L_0x02e9:
            r4 = r13
            goto L_0x02f1
        L_0x02eb:
            java.lang.String r11 = r3.j()
            r3 = r13
            r4 = r3
        L_0x02f1:
            boolean r12 = r11.equals(r13)
            if (r12 != 0) goto L_0x02fe
            int r11 = m2.g.a.b(r11)
            r8.Q0(r11)
        L_0x02fe:
            boolean r11 = r3.equals(r13)
            if (r11 != 0) goto L_0x030b
            int r3 = m2.g.a.b(r3)
            r8.A0(r3)
        L_0x030b:
            boolean r3 = r4.equals(r13)
            if (r3 != 0) goto L_0x044e
            int r3 = m2.g.a.b(r4)
            r8.H0(r3)
            goto L_0x044e
        L_0x031a:
            r14 = r20
            l2.c r3 = r2.P(r11)
            java.lang.String r3 = r3.j()
            r3.hashCode()
            int r4 = r3.hashCode()
            switch(r4) {
                case -1720785339: goto L_0x0346;
                case -1383228885: goto L_0x033b;
                case 115029: goto L_0x0330;
                default: goto L_0x032e;
            }
        L_0x032e:
            r3 = -1
            goto L_0x0350
        L_0x0330:
            java.lang.String r4 = "top"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0339
            goto L_0x032e
        L_0x0339:
            r3 = r6
            goto L_0x0350
        L_0x033b:
            java.lang.String r4 = "bottom"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0344
            goto L_0x032e
        L_0x0344:
            r3 = r10
            goto L_0x0350
        L_0x0346:
            java.lang.String r4 = "baseline"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x034f
            goto L_0x032e
        L_0x034f:
            r3 = r7
        L_0x0350:
            switch(r3) {
                case 0: goto L_0x0362;
                case 1: goto L_0x035d;
                case 2: goto L_0x0358;
                default: goto L_0x0353;
            }
        L_0x0353:
            r8.O0(r6)
            goto L_0x044e
        L_0x0358:
            r8.O0(r7)
            goto L_0x044e
        L_0x035d:
            r8.O0(r10)
            goto L_0x044e
        L_0x0362:
            r8.O0(r5)
            goto L_0x044e
        L_0x0367:
            r14 = r20
            l2.c r3 = r2.P(r11)
            java.lang.Float r4 = java.lang.Float.valueOf(r12)
            java.lang.Float r11 = java.lang.Float.valueOf(r12)
            boolean r13 = r3 instanceof l2.C5517a
            if (r13 == 0) goto L_0x03a1
            r13 = r3
            l2.a r13 = (l2.C5517a) r13
            int r15 = r13.size()
            if (r15 <= r10) goto L_0x03a1
            float r3 = r13.S(r7)
            java.lang.Float r4 = java.lang.Float.valueOf(r3)
            float r3 = r13.S(r10)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            int r15 = r13.size()
            if (r15 <= r6) goto L_0x03a9
            float r11 = r13.S(r6)
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            goto L_0x03a9
        L_0x03a1:
            float r3 = r3.p()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
        L_0x03a9:
            float r3 = r3.floatValue()     // Catch:{ NumberFormatException -> 0x044e }
            r8.F(r3)     // Catch:{ NumberFormatException -> 0x044e }
            float r3 = r4.floatValue()     // Catch:{ NumberFormatException -> 0x044e }
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x03bf
            float r3 = r4.floatValue()     // Catch:{ NumberFormatException -> 0x044e }
            r8.x0(r3)     // Catch:{ NumberFormatException -> 0x044e }
        L_0x03bf:
            float r3 = r11.floatValue()     // Catch:{ NumberFormatException -> 0x044e }
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x044e
            float r3 = r11.floatValue()     // Catch:{ NumberFormatException -> 0x044e }
            r8.E0(r3)     // Catch:{ NumberFormatException -> 0x044e }
            goto L_0x044e
        L_0x03d0:
            r14 = r20
            l2.c r3 = r2.P(r11)
            boolean r4 = r3 instanceof l2.C5517a
            if (r4 == 0) goto L_0x03f8
            r4 = r3
            l2.a r4 = (l2.C5517a) r4
            int r11 = r4.size()
            if (r11 <= r10) goto L_0x03f8
            java.lang.String r3 = r4.b0(r7)
            java.lang.String r11 = r4.b0(r10)
            int r12 = r4.size()
            if (r12 <= r6) goto L_0x03f6
            java.lang.String r4 = r4.b0(r6)
            goto L_0x03fe
        L_0x03f6:
            r4 = r13
            goto L_0x03fe
        L_0x03f8:
            java.lang.String r11 = r3.j()
            r3 = r13
            r4 = r3
        L_0x03fe:
            boolean r12 = r11.equals(r13)
            if (r12 != 0) goto L_0x040b
            int r11 = m2.g.a.b(r11)
            r8.D0(r11)
        L_0x040b:
            boolean r11 = r3.equals(r13)
            if (r11 != 0) goto L_0x0418
            int r3 = m2.g.a.b(r3)
            r8.y0(r3)
        L_0x0418:
            boolean r3 = r4.equals(r13)
            if (r3 != 0) goto L_0x044e
            int r3 = m2.g.a.b(r4)
            r8.F0(r3)
            goto L_0x044e
        L_0x0426:
            r14 = r20
            l2.c r3 = r2.P(r11)
            java.lang.String r3 = r3.j()
            r3.hashCode()
            java.lang.String r4 = "end"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x044b
            java.lang.String r4 = "start"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0447
            r8.B0(r6)
            goto L_0x044e
        L_0x0447:
            r8.B0(r7)
            goto L_0x044e
        L_0x044b:
            r8.B0(r10)
        L_0x044e:
            r3 = 4
            goto L_0x0024
        L_0x0451:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C5574b.m(java.lang.String, m2.g, java.lang.String, m2.b$e, l2.f):void");
    }

    static void n(g gVar, e eVar, l2.f fVar) {
        ArrayList<String> i02 = fVar.i0();
        if (i02 != null) {
            Iterator<String> it = i02.iterator();
            while (it.hasNext()) {
                String next = it.next();
                C5519c P10 = fVar.P(next);
                ArrayList<String> b10 = eVar.b(next);
                if (b10 != null && (P10 instanceof l2.f)) {
                    Iterator<String> it2 = b10.iterator();
                    while (it2.hasNext()) {
                        w(gVar, eVar, it2.next(), (l2.f) P10);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0165  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void o(java.lang.String r10, m2.g r11, java.lang.String r12, m2.C5574b.e r13, l2.f r14) {
        /*
            r0 = 3
            r1 = 2
            r2 = 0
            r3 = 1
            n2.g r10 = r11.j(r12, r10)
            java.util.ArrayList r4 = r14.i0()
            java.util.Iterator r4 = r4.iterator()
        L_0x0010:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0233
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            r5.hashCode()
            java.lang.String r6 = ":"
            java.lang.String r7 = ","
            r8 = -1
            int r9 = r5.hashCode()
            switch(r9) {
                case -1439500848: goto L_0x00b2;
                case -806339567: goto L_0x00a7;
                case -567445985: goto L_0x009c;
                case 3169614: goto L_0x0091;
                case 3506649: goto L_0x0086;
                case 3586688: goto L_0x007b;
                case 97513095: goto L_0x0070;
                case 109497044: goto L_0x0065;
                case 109638249: goto L_0x0057;
                case 144441793: goto L_0x0049;
                case 949721053: goto L_0x003b;
                case 2033353925: goto L_0x002d;
                default: goto L_0x002b;
            }
        L_0x002b:
            goto L_0x00bc
        L_0x002d:
            java.lang.String r9 = "columnWeights"
            boolean r9 = r5.equals(r9)
            if (r9 != 0) goto L_0x0037
            goto L_0x00bc
        L_0x0037:
            r8 = 11
            goto L_0x00bc
        L_0x003b:
            java.lang.String r9 = "columns"
            boolean r9 = r5.equals(r9)
            if (r9 != 0) goto L_0x0045
            goto L_0x00bc
        L_0x0045:
            r8 = 10
            goto L_0x00bc
        L_0x0049:
            java.lang.String r9 = "rowWeights"
            boolean r9 = r5.equals(r9)
            if (r9 != 0) goto L_0x0053
            goto L_0x00bc
        L_0x0053:
            r8 = 9
            goto L_0x00bc
        L_0x0057:
            java.lang.String r9 = "spans"
            boolean r9 = r5.equals(r9)
            if (r9 != 0) goto L_0x0061
            goto L_0x00bc
        L_0x0061:
            r8 = 8
            goto L_0x00bc
        L_0x0065:
            java.lang.String r9 = "skips"
            boolean r9 = r5.equals(r9)
            if (r9 != 0) goto L_0x006e
            goto L_0x00bc
        L_0x006e:
            r8 = 7
            goto L_0x00bc
        L_0x0070:
            java.lang.String r9 = "flags"
            boolean r9 = r5.equals(r9)
            if (r9 != 0) goto L_0x0079
            goto L_0x00bc
        L_0x0079:
            r8 = 6
            goto L_0x00bc
        L_0x007b:
            java.lang.String r9 = "vGap"
            boolean r9 = r5.equals(r9)
            if (r9 != 0) goto L_0x0084
            goto L_0x00bc
        L_0x0084:
            r8 = 5
            goto L_0x00bc
        L_0x0086:
            java.lang.String r9 = "rows"
            boolean r9 = r5.equals(r9)
            if (r9 != 0) goto L_0x008f
            goto L_0x00bc
        L_0x008f:
            r8 = 4
            goto L_0x00bc
        L_0x0091:
            java.lang.String r9 = "hGap"
            boolean r9 = r5.equals(r9)
            if (r9 != 0) goto L_0x009a
            goto L_0x00bc
        L_0x009a:
            r8 = r0
            goto L_0x00bc
        L_0x009c:
            java.lang.String r9 = "contains"
            boolean r9 = r5.equals(r9)
            if (r9 != 0) goto L_0x00a5
            goto L_0x00bc
        L_0x00a5:
            r8 = r1
            goto L_0x00bc
        L_0x00a7:
            java.lang.String r9 = "padding"
            boolean r9 = r5.equals(r9)
            if (r9 != 0) goto L_0x00b0
            goto L_0x00bc
        L_0x00b0:
            r8 = r3
            goto L_0x00bc
        L_0x00b2:
            java.lang.String r9 = "orientation"
            boolean r9 = r5.equals(r9)
            if (r9 != 0) goto L_0x00bb
            goto L_0x00bc
        L_0x00bb:
            r8 = r2
        L_0x00bc:
            switch(r8) {
                case 0: goto L_0x0226;
                case 1: goto L_0x01bd;
                case 2: goto L_0x019b;
                case 3: goto L_0x018a;
                case 4: goto L_0x017b;
                case 5: goto L_0x016a;
                case 6: goto L_0x012b;
                case 7: goto L_0x0116;
                case 8: goto L_0x0101;
                case 9: goto L_0x00ec;
                case 10: goto L_0x00dd;
                case 11: goto L_0x00c8;
                default: goto L_0x00bf;
            }
        L_0x00bf:
            m2.a r6 = r11.d(r12)
            a(r11, r13, r6, r14, r5)
            goto L_0x0010
        L_0x00c8:
            l2.c r5 = r14.P(r5)
            java.lang.String r5 = r5.j()
            if (r5 == 0) goto L_0x0010
            boolean r6 = r5.contains(r7)
            if (r6 == 0) goto L_0x0010
            r10.w0(r5)
            goto L_0x0010
        L_0x00dd:
            l2.c r5 = r14.P(r5)
            int r5 = r5.r()
            if (r5 <= 0) goto L_0x0010
            r10.x0(r5)
            goto L_0x0010
        L_0x00ec:
            l2.c r5 = r14.P(r5)
            java.lang.String r5 = r5.j()
            if (r5 == 0) goto L_0x0010
            boolean r6 = r5.contains(r7)
            if (r6 == 0) goto L_0x0010
            r10.G0(r5)
            goto L_0x0010
        L_0x0101:
            l2.c r5 = r14.P(r5)
            java.lang.String r5 = r5.j()
            if (r5 == 0) goto L_0x0010
            boolean r6 = r5.contains(r6)
            if (r6 == 0) goto L_0x0010
            r10.J0(r5)
            goto L_0x0010
        L_0x0116:
            l2.c r5 = r14.P(r5)
            java.lang.String r5 = r5.j()
            if (r5 == 0) goto L_0x0010
            boolean r6 = r5.contains(r6)
            if (r6 == 0) goto L_0x0010
            r10.I0(r5)
            goto L_0x0010
        L_0x012b:
            java.lang.String r6 = ""
            l2.c r5 = r14.P(r5)     // Catch:{ Exception -> 0x013a }
            boolean r7 = r5 instanceof l2.e     // Catch:{ Exception -> 0x013a }
            if (r7 == 0) goto L_0x013c
            int r5 = r5.r()     // Catch:{ Exception -> 0x013a }
            goto L_0x0158
        L_0x013a:
            r5 = move-exception
            goto L_0x0141
        L_0x013c:
            java.lang.String r6 = r5.j()     // Catch:{ Exception -> 0x013a }
            goto L_0x0157
        L_0x0141:
            java.io.PrintStream r7 = java.lang.System.err
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Error parsing grid flags "
            r8.append(r9)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r7.println(r5)
        L_0x0157:
            r5 = r2
        L_0x0158:
            if (r6 == 0) goto L_0x0165
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x0165
            r10.z0(r6)
            goto L_0x0010
        L_0x0165:
            r10.y0(r5)
            goto L_0x0010
        L_0x016a:
            l2.c r5 = r14.P(r5)
            float r5 = r5.p()
            float r5 = z(r11, r5)
            r10.K0(r5)
            goto L_0x0010
        L_0x017b:
            l2.c r5 = r14.P(r5)
            int r5 = r5.r()
            if (r5 <= 0) goto L_0x0010
            r10.H0(r5)
            goto L_0x0010
        L_0x018a:
            l2.c r5 = r14.P(r5)
            float r5 = r5.p()
            float r5 = z(r11, r5)
            r10.A0(r5)
            goto L_0x0010
        L_0x019b:
            l2.a r5 = r14.R(r5)
            if (r5 == 0) goto L_0x0010
            r6 = r2
        L_0x01a2:
            int r7 = r5.size()
            if (r6 >= r7) goto L_0x0010
            l2.c r7 = r5.O(r6)
            java.lang.String r7 = r7.j()
            m2.a r7 = r11.d(r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            r10.s0(r7)
            int r6 = r6 + r3
            goto L_0x01a2
        L_0x01bd:
            l2.c r5 = r14.P(r5)
            boolean r6 = r5 instanceof l2.C5517a
            if (r6 == 0) goto L_0x01f0
            r6 = r5
            l2.a r6 = (l2.C5517a) r6
            int r7 = r6.size()
            if (r7 <= r3) goto L_0x01f0
            int r7 = r6.getInt(r2)
            float r7 = (float) r7
            int r8 = r6.getInt(r3)
            float r8 = (float) r8
            int r9 = r6.size()
            if (r9 <= r1) goto L_0x01ed
            int r6 = r6.getInt(r1)
            float r6 = (float) r6
            l2.a r5 = (l2.C5517a) r5     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01eb }
            int r5 = r5.getInt(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01eb }
            float r5 = (float) r5
            goto L_0x01f8
        L_0x01eb:
            r5 = 0
            goto L_0x01f8
        L_0x01ed:
            r6 = r7
            r5 = r8
            goto L_0x01f8
        L_0x01f0:
            int r5 = r5.r()
            float r7 = (float) r5
            r5 = r7
            r6 = r5
            r8 = r6
        L_0x01f8:
            float r7 = z(r11, r7)
            int r7 = java.lang.Math.round(r7)
            r10.E0(r7)
            float r7 = z(r11, r8)
            int r7 = java.lang.Math.round(r7)
            r10.F0(r7)
            float r6 = z(r11, r6)
            int r6 = java.lang.Math.round(r6)
            r10.D0(r6)
            float r5 = z(r11, r5)
            int r5 = java.lang.Math.round(r5)
            r10.C0(r5)
            goto L_0x0010
        L_0x0226:
            l2.c r5 = r14.P(r5)
            int r5 = r5.r()
            r10.B0(r5)
            goto L_0x0010
        L_0x0233:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C5574b.o(java.lang.String, m2.g, java.lang.String, m2.b$e, l2.f):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        r3 = (l2.f) r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void p(int r1, m2.g r2, l2.C5517a r3) {
        /*
            r0 = 1
            l2.c r3 = r3.O(r0)
            boolean r0 = r3 instanceof l2.f
            if (r0 != 0) goto L_0x000a
            return
        L_0x000a:
            l2.f r3 = (l2.f) r3
            java.lang.String r0 = "id"
            java.lang.String r0 = r3.g0(r0)
            if (r0 != 0) goto L_0x0015
            return
        L_0x0015:
            q(r1, r2, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C5574b.p(int, m2.g, l2.a):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010a, code lost:
        r14 = r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void q(int r18, m2.g r19, java.lang.String r20, l2.f r21) {
        /*
            r0 = r19
            r1 = r21
            java.lang.String r2 = "start"
            java.lang.String r4 = "right"
            java.lang.String r6 = "left"
            java.lang.String r7 = "end"
            r8 = -1
            r9 = 0
            r10 = 1
            java.util.ArrayList r11 = r21.i0()
            if (r11 != 0) goto L_0x0016
            return
        L_0x0016:
            m2.a r12 = r19.d(r20)
            if (r18 != 0) goto L_0x0020
            r19.p(r20)
            goto L_0x0023
        L_0x0020:
            r19.D(r20)
        L_0x0023:
            boolean r13 = r19.r()
            if (r13 == 0) goto L_0x002e
            if (r18 != 0) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r13 = r9
            goto L_0x002f
        L_0x002e:
            r13 = r10
        L_0x002f:
            n2.e r12 = r12.d()
            n2.h r12 = (n2.h) r12
            java.util.Iterator r11 = r11.iterator()
            r14 = 0
            r15 = r9
        L_0x003b:
            r16 = r10
        L_0x003d:
            boolean r17 = r11.hasNext()
            if (r17 == 0) goto L_0x011a
            java.lang.Object r17 = r11.next()
            r3 = r17
            java.lang.String r3 = (java.lang.String) r3
            r3.hashCode()
            int r17 = r3.hashCode()
            switch(r17) {
                case -678927291: goto L_0x007e;
                case 100571: goto L_0x0075;
                case 3317767: goto L_0x006c;
                case 108511772: goto L_0x0063;
                case 109757538: goto L_0x0057;
                default: goto L_0x0055;
            }
        L_0x0055:
            r5 = r8
            goto L_0x0088
        L_0x0057:
            boolean r17 = r3.equals(r2)
            if (r17 != 0) goto L_0x005e
            goto L_0x0055
        L_0x005e:
            r17 = 4
            r5 = r17
            goto L_0x0088
        L_0x0063:
            boolean r17 = r3.equals(r4)
            if (r17 != 0) goto L_0x006a
            goto L_0x0055
        L_0x006a:
            r5 = 3
            goto L_0x0088
        L_0x006c:
            boolean r17 = r3.equals(r6)
            if (r17 != 0) goto L_0x0073
            goto L_0x0055
        L_0x0073:
            r5 = 2
            goto L_0x0088
        L_0x0075:
            boolean r17 = r3.equals(r7)
            if (r17 != 0) goto L_0x007c
            goto L_0x0055
        L_0x007c:
            r5 = r10
            goto L_0x0088
        L_0x007e:
            java.lang.String r5 = "percent"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0087
            goto L_0x0055
        L_0x0087:
            r5 = r9
        L_0x0088:
            switch(r5) {
                case 0: goto L_0x00ba;
                case 1: goto L_0x00ae;
                case 2: goto L_0x00a4;
                case 3: goto L_0x0098;
                case 4: goto L_0x008c;
                default: goto L_0x008b;
            }
        L_0x008b:
            goto L_0x003d
        L_0x008c:
            float r3 = r1.T(r3)
            float r3 = z(r0, r3)
            r14 = r3
        L_0x0095:
            r16 = r13
            goto L_0x003d
        L_0x0098:
            float r3 = r1.T(r3)
            float r3 = z(r0, r3)
            r14 = r3
            r16 = r9
            goto L_0x003d
        L_0x00a4:
            float r3 = r1.T(r3)
            float r3 = z(r0, r3)
            r14 = r3
            goto L_0x003b
        L_0x00ae:
            float r3 = r1.T(r3)
            float r3 = z(r0, r3)
            r16 = r13 ^ 1
            r14 = r3
            goto L_0x003d
        L_0x00ba:
            l2.a r5 = r1.R(r3)
            if (r5 != 0) goto L_0x00ca
            float r3 = r1.T(r3)
            r14 = r3
        L_0x00c5:
            r15 = r10
            r16 = r15
            goto L_0x003d
        L_0x00ca:
            int r3 = r5.size()
            if (r3 <= r10) goto L_0x010b
            java.lang.String r3 = r5.b0(r9)
            float r5 = r5.S(r10)
            r3.hashCode()
            int r14 = r3.hashCode()
            switch(r14) {
                case 100571: goto L_0x00ff;
                case 3317767: goto L_0x00f6;
                case 108511772: goto L_0x00ed;
                case 109757538: goto L_0x00e4;
                default: goto L_0x00e2;
            }
        L_0x00e2:
            r3 = r8
            goto L_0x0107
        L_0x00e4:
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x00eb
            goto L_0x00e2
        L_0x00eb:
            r3 = 3
            goto L_0x0107
        L_0x00ed:
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00f4
            goto L_0x00e2
        L_0x00f4:
            r3 = 2
            goto L_0x0107
        L_0x00f6:
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto L_0x00fd
            goto L_0x00e2
        L_0x00fd:
            r3 = r10
            goto L_0x0107
        L_0x00ff:
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x0106
            goto L_0x00e2
        L_0x0106:
            r3 = r9
        L_0x0107:
            switch(r3) {
                case 0: goto L_0x0117;
                case 1: goto L_0x0115;
                case 2: goto L_0x0111;
                case 3: goto L_0x010e;
                default: goto L_0x010a;
            }
        L_0x010a:
            r14 = r5
        L_0x010b:
            r15 = r10
            goto L_0x003d
        L_0x010e:
            r14 = r5
            r15 = r10
            goto L_0x0095
        L_0x0111:
            r14 = r5
            r16 = r9
            goto L_0x010b
        L_0x0115:
            r14 = r5
            goto L_0x00c5
        L_0x0117:
            r16 = r13 ^ 1
            goto L_0x010a
        L_0x011a:
            if (r15 == 0) goto L_0x0129
            if (r16 == 0) goto L_0x0122
            r12.f(r14)
            goto L_0x013a
        L_0x0122:
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r14
            r12.f(r0)
            goto L_0x013a
        L_0x0129:
            if (r16 == 0) goto L_0x0133
            java.lang.Float r0 = java.lang.Float.valueOf(r14)
            r12.h(r0)
            goto L_0x013a
        L_0x0133:
            java.lang.Float r0 = java.lang.Float.valueOf(r14)
            r12.e(r0)
        L_0x013a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C5574b.q(int, m2.g, java.lang.String, l2.f):void");
    }

    static void r(g gVar, e eVar, C5517a aVar) {
        for (int i10 = 0; i10 < aVar.size(); i10++) {
            C5519c O10 = aVar.O(i10);
            if (O10 instanceof C5517a) {
                C5517a aVar2 = (C5517a) O10;
                if (aVar2.size() > 1) {
                    String b02 = aVar2.b0(0);
                    b02.hashCode();
                    char c10 = 65535;
                    switch (b02.hashCode()) {
                        case -1785507558:
                            if (b02.equals("vGuideline")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case -1252464839:
                            if (b02.equals("hChain")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case -851656725:
                            if (b02.equals("vChain")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 965681512:
                            if (b02.equals("hGuideline")) {
                                c10 = 3;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            p(1, gVar, aVar2);
                            break;
                        case 1:
                            e(0, gVar, eVar, aVar2);
                            break;
                        case 2:
                            e(1, gVar, eVar, aVar2);
                            break;
                        case 3:
                            p(0, gVar, aVar2);
                            break;
                    }
                }
            }
        }
    }

    public static void s(String str, g gVar, e eVar) {
        try {
            y(g.d(str), gVar, eVar);
        } catch (h e10) {
            PrintStream printStream = System.err;
            printStream.println("Error parsing JSON " + e10);
        }
    }

    public static void t(String str, h hVar, int i10) {
        l2.f Y10;
        try {
            l2.f d10 = g.d(str);
            ArrayList<String> i02 = d10.i0();
            if (i02 != null) {
                Iterator<String> it = i02.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    C5519c P10 = d10.P(next);
                    if ((P10 instanceof l2.f) && (Y10 = ((l2.f) P10).Y("custom")) != null) {
                        Iterator<String> it2 = Y10.i0().iterator();
                        while (it2.hasNext()) {
                            String next2 = it2.next();
                            C5519c P11 = Y10.P(next2);
                            if (P11 instanceof l2.e) {
                                hVar.g(i10, next, next2, P11.p());
                            } else if (P11 instanceof i) {
                                long g10 = g(P11.j());
                                if (g10 != -1) {
                                    hVar.f(i10, next, next2, (int) g10);
                                }
                            }
                        }
                    }
                }
            }
        } catch (h e10) {
            PrintStream printStream = System.err;
            printStream.println("Error parsing JSON " + e10);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void u(l2.C5519c r13, m2.C5573a r14) {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = -1
            boolean r4 = r13 instanceof l2.f
            if (r4 != 0) goto L_0x0009
            return
        L_0x0009:
            l2.f r13 = (l2.f) r13
            k2.t r4 = new k2.t
            r4.<init>()
            java.util.ArrayList r5 = r13.i0()
            if (r5 != 0) goto L_0x0017
            return
        L_0x0017:
            java.util.Iterator r5 = r5.iterator()
        L_0x001b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x010c
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            r6.hashCode()
            int r7 = r6.hashCode()
            switch(r7) {
                case -1897525331: goto L_0x005f;
                case -1310311125: goto L_0x0054;
                case -1285003983: goto L_0x0049;
                case -791482387: goto L_0x003e;
                case -236944793: goto L_0x0033;
                default: goto L_0x0031;
            }
        L_0x0031:
            r7 = r3
            goto L_0x0069
        L_0x0033:
            java.lang.String r7 = "relativeTo"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L_0x003c
            goto L_0x0031
        L_0x003c:
            r7 = 4
            goto L_0x0069
        L_0x003e:
            java.lang.String r7 = "pathArc"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L_0x0047
            goto L_0x0031
        L_0x0047:
            r7 = 3
            goto L_0x0069
        L_0x0049:
            java.lang.String r7 = "quantize"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L_0x0052
            goto L_0x0031
        L_0x0052:
            r7 = r0
            goto L_0x0069
        L_0x0054:
            java.lang.String r7 = "easing"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L_0x005d
            goto L_0x0031
        L_0x005d:
            r7 = r1
            goto L_0x0069
        L_0x005f:
            java.lang.String r7 = "stagger"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L_0x0068
            goto L_0x0031
        L_0x0068:
            r7 = r2
        L_0x0069:
            switch(r7) {
                case 0: goto L_0x0101;
                case 1: goto L_0x00f6;
                case 2: goto L_0x00bc;
                case 3: goto L_0x0077;
                case 4: goto L_0x006d;
                default: goto L_0x006c;
            }
        L_0x006c:
            goto L_0x001b
        L_0x006d:
            r7 = 605(0x25d, float:8.48E-43)
            java.lang.String r6 = r13.c0(r6)
            r4.c(r7, r6)
            goto L_0x001b
        L_0x0077:
            java.lang.String r6 = r13.c0(r6)
            java.lang.String r11 = "below"
            java.lang.String r12 = "above"
            java.lang.String r7 = "none"
            java.lang.String r8 = "startVertical"
            java.lang.String r9 = "startHorizontal"
            java.lang.String r10 = "flip"
            java.lang.String[] r7 = new java.lang.String[]{r7, r8, r9, r10, r11, r12}
            int r7 = b(r6, r7)
            if (r7 != r3) goto L_0x00b5
            java.io.PrintStream r7 = java.lang.System.err
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            int r9 = r13.y()
            r8.append(r9)
            java.lang.String r9 = " pathArc = '"
            r8.append(r9)
            r8.append(r6)
            java.lang.String r6 = "'"
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.println(r6)
            goto L_0x001b
        L_0x00b5:
            r6 = 607(0x25f, float:8.5E-43)
            r4.b(r6, r7)
            goto L_0x001b
        L_0x00bc:
            l2.c r7 = r13.P(r6)
            boolean r8 = r7 instanceof l2.C5517a
            r9 = 610(0x262, float:8.55E-43)
            if (r8 == 0) goto L_0x00ed
            l2.a r7 = (l2.C5517a) r7
            int r6 = r7.size()
            if (r6 <= 0) goto L_0x001b
            int r8 = r7.getInt(r2)
            r4.b(r9, r8)
            if (r6 <= r1) goto L_0x001b
            r8 = 611(0x263, float:8.56E-43)
            java.lang.String r9 = r7.b0(r1)
            r4.c(r8, r9)
            if (r6 <= r0) goto L_0x001b
            r6 = 602(0x25a, float:8.44E-43)
            float r7 = r7.S(r0)
            r4.a(r6, r7)
            goto L_0x001b
        L_0x00ed:
            int r6 = r13.W(r6)
            r4.b(r9, r6)
            goto L_0x001b
        L_0x00f6:
            r7 = 603(0x25b, float:8.45E-43)
            java.lang.String r6 = r13.c0(r6)
            r4.c(r7, r6)
            goto L_0x001b
        L_0x0101:
            r7 = 600(0x258, float:8.41E-43)
            float r6 = r13.T(r6)
            r4.a(r7, r6)
            goto L_0x001b
        L_0x010c:
            r14.f26101l0 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C5574b.u(l2.c, m2.a):void");
    }

    private static void v(g gVar, e eVar, l2.f fVar) {
        ArrayList<String> i02 = fVar.i0();
        if (i02 != null) {
            Iterator<String> it = i02.iterator();
            while (it.hasNext()) {
                String next = it.next();
                C5519c P10 = fVar.P(next);
                if (P10 instanceof l2.e) {
                    eVar.e(next, P10.r());
                } else if (P10 instanceof l2.f) {
                    l2.f fVar2 = (l2.f) P10;
                    if (fVar2.h0("from") && fVar2.h0("to")) {
                        float a10 = eVar.a(fVar2.P("from"));
                        eVar.d(next, a10, eVar.a(fVar2.P("to")), 1.0f, fVar2.g0("prefix"), fVar2.g0("postfix"));
                    } else if (fVar2.h0("from") && fVar2.h0("step")) {
                        eVar.c(next, eVar.a(fVar2.P("from")), eVar.a(fVar2.P("step")));
                    } else if (fVar2.h0("ids")) {
                        C5517a Q10 = fVar2.Q("ids");
                        ArrayList arrayList = new ArrayList();
                        for (int i10 = 0; i10 < Q10.size(); i10++) {
                            arrayList.add(Q10.b0(i10));
                        }
                        eVar.f(next, arrayList);
                    } else if (fVar2.h0("tag")) {
                        eVar.f(next, gVar.k(fVar2.c0("tag")));
                    }
                }
            }
        }
    }

    static void w(g gVar, e eVar, String str, l2.f fVar) {
        x(gVar, eVar, gVar.d(str), fVar);
    }

    static void x(g gVar, e eVar, C5573a aVar, l2.f fVar) {
        if (aVar.E() == null) {
            aVar.f0(d.h());
        }
        if (aVar.C() == null) {
            aVar.Y(d.h());
        }
        ArrayList<String> i02 = fVar.i0();
        if (i02 != null) {
            Iterator<String> it = i02.iterator();
            while (it.hasNext()) {
                a(gVar, eVar, aVar, fVar, it.next());
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void y(l2.f r9, m2.g r10, m2.C5574b.e r11) {
        /*
            r0 = 2
            r1 = -1
            r2 = 1
            r3 = 0
            java.util.ArrayList r4 = r9.i0()
            if (r4 != 0) goto L_0x000b
            return
        L_0x000b:
            java.util.Iterator r4 = r4.iterator()
        L_0x000f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x012b
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            l2.c r6 = r9.P(r5)
            r5.hashCode()
            int r7 = r5.hashCode()
            switch(r7) {
                case -1824489883: goto L_0x0041;
                case 1875016085: goto L_0x0036;
                case 1921490263: goto L_0x002b;
                default: goto L_0x0029;
            }
        L_0x0029:
            r7 = r1
            goto L_0x004b
        L_0x002b:
            java.lang.String r7 = "Variables"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L_0x0034
            goto L_0x0029
        L_0x0034:
            r7 = r0
            goto L_0x004b
        L_0x0036:
            java.lang.String r7 = "Generate"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L_0x003f
            goto L_0x0029
        L_0x003f:
            r7 = r2
            goto L_0x004b
        L_0x0041:
            java.lang.String r7 = "Helpers"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L_0x004a
            goto L_0x0029
        L_0x004a:
            r7 = r3
        L_0x004b:
            switch(r7) {
                case 0: goto L_0x0120;
                case 1: goto L_0x0115;
                case 2: goto L_0x010a;
                default: goto L_0x004e;
            }
        L_0x004e:
            boolean r7 = r6 instanceof l2.f
            if (r7 == 0) goto L_0x00fd
            l2.f r6 = (l2.f) r6
            java.lang.String r7 = c(r6)
            if (r7 == 0) goto L_0x00f8
            int r8 = r7.hashCode()
            switch(r8) {
                case -1785507558: goto L_0x00cb;
                case -1354837162: goto L_0x00c0;
                case -1252464839: goto L_0x00b5;
                case -851656725: goto L_0x00aa;
                case -333143113: goto L_0x009f;
                case 113114: goto L_0x0094;
                case 3181382: goto L_0x0089;
                case 98238902: goto L_0x007e;
                case 111168196: goto L_0x0071;
                case 965681512: goto L_0x0064;
                default: goto L_0x0061;
            }
        L_0x0061:
            r8 = r1
            goto L_0x00d5
        L_0x0064:
            java.lang.String r8 = "hGuideline"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x006d
            goto L_0x0061
        L_0x006d:
            r8 = 9
            goto L_0x00d5
        L_0x0071:
            java.lang.String r8 = "vFlow"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x007a
            goto L_0x0061
        L_0x007a:
            r8 = 8
            goto L_0x00d5
        L_0x007e:
            java.lang.String r8 = "hFlow"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x0087
            goto L_0x0061
        L_0x0087:
            r8 = 7
            goto L_0x00d5
        L_0x0089:
            java.lang.String r8 = "grid"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x0092
            goto L_0x0061
        L_0x0092:
            r8 = 6
            goto L_0x00d5
        L_0x0094:
            java.lang.String r8 = "row"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x009d
            goto L_0x0061
        L_0x009d:
            r8 = 5
            goto L_0x00d5
        L_0x009f:
            java.lang.String r8 = "barrier"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x00a8
            goto L_0x0061
        L_0x00a8:
            r8 = 4
            goto L_0x00d5
        L_0x00aa:
            java.lang.String r8 = "vChain"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x00b3
            goto L_0x0061
        L_0x00b3:
            r8 = 3
            goto L_0x00d5
        L_0x00b5:
            java.lang.String r8 = "hChain"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x00be
            goto L_0x0061
        L_0x00be:
            r8 = r0
            goto L_0x00d5
        L_0x00c0:
            java.lang.String r8 = "column"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x00c9
            goto L_0x0061
        L_0x00c9:
            r8 = r2
            goto L_0x00d5
        L_0x00cb:
            java.lang.String r8 = "vGuideline"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x00d4
            goto L_0x0061
        L_0x00d4:
            r8 = r3
        L_0x00d5:
            switch(r8) {
                case 0: goto L_0x00f3;
                case 1: goto L_0x00ee;
                case 2: goto L_0x00e9;
                case 3: goto L_0x00e9;
                case 4: goto L_0x00e4;
                case 5: goto L_0x00ee;
                case 6: goto L_0x00ee;
                case 7: goto L_0x00df;
                case 8: goto L_0x00df;
                case 9: goto L_0x00da;
                default: goto L_0x00d8;
            }
        L_0x00d8:
            goto L_0x000f
        L_0x00da:
            q(r3, r10, r5, r6)
            goto L_0x000f
        L_0x00df:
            m(r7, r10, r5, r11, r6)
            goto L_0x000f
        L_0x00e4:
            d(r10, r5, r6)
            goto L_0x000f
        L_0x00e9:
            f(r7, r10, r5, r11, r6)
            goto L_0x000f
        L_0x00ee:
            o(r7, r10, r5, r11, r6)
            goto L_0x000f
        L_0x00f3:
            q(r2, r10, r5, r6)
            goto L_0x000f
        L_0x00f8:
            w(r10, r11, r5, r6)
            goto L_0x000f
        L_0x00fd:
            boolean r7 = r6 instanceof l2.e
            if (r7 == 0) goto L_0x000f
            int r6 = r6.r()
            r11.e(r5, r6)
            goto L_0x000f
        L_0x010a:
            boolean r5 = r6 instanceof l2.f
            if (r5 == 0) goto L_0x000f
            l2.f r6 = (l2.f) r6
            v(r10, r11, r6)
            goto L_0x000f
        L_0x0115:
            boolean r5 = r6 instanceof l2.f
            if (r5 == 0) goto L_0x000f
            l2.f r6 = (l2.f) r6
            n(r10, r11, r6)
            goto L_0x000f
        L_0x0120:
            boolean r5 = r6 instanceof l2.C5517a
            if (r5 == 0) goto L_0x000f
            l2.a r6 = (l2.C5517a) r6
            r(r10, r11, r6)
            goto L_0x000f
        L_0x012b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C5574b.y(l2.f, m2.g, m2.b$e):void");
    }

    private static float z(g gVar, float f10) {
        return gVar.h().a(f10);
    }
}
