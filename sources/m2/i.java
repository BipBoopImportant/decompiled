package m2;

import i2.C5438a;
import java.lang.reflect.Array;
import k2.t;
import l2.C5517a;
import l2.C5518b;
import l2.C5519c;
import l2.C5520d;
import l2.e;
import l2.f;
import l2.h;
import m2.h;

public class i {
    private static int a(String str, String... strArr) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (strArr[i10].equals(str)) {
                return i10;
            }
        }
        return 0;
    }

    private static void b(t tVar, int i10, String str, String... strArr) {
        for (int i11 = 0; i11 < strArr.length; i11++) {
            if (strArr[i11].equals(str)) {
                tVar.b(i10, i11);
            }
        }
    }

    public static void c(f fVar, h hVar) {
        hVar.K();
        String g02 = fVar.g0("pathMotionArc");
        t tVar = new t();
        boolean z10 = true;
        boolean z11 = false;
        if (g02 != null) {
            char c10 = 65535;
            switch (g02.hashCode()) {
                case -1857024520:
                    if (g02.equals("startVertical")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1007052250:
                    if (g02.equals("startHorizontal")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3145837:
                    if (g02.equals("flip")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3387192:
                    if (g02.equals("none")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 92611485:
                    if (g02.equals("above")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 93621297:
                    if (g02.equals("below")) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    tVar.b(509, 1);
                    break;
                case 1:
                    tVar.b(509, 2);
                    break;
                case 2:
                    tVar.b(509, 3);
                    break;
                case 3:
                    tVar.b(509, 0);
                    break;
                case 4:
                    tVar.b(509, 5);
                    break;
                case 5:
                    tVar.b(509, 4);
                    break;
            }
            z11 = true;
        }
        String g03 = fVar.g0("interpolator");
        if (g03 != null) {
            tVar.c(705, g03);
            z11 = true;
        }
        float V10 = fVar.V("staggered");
        if (!Float.isNaN(V10)) {
            tVar.a(706, V10);
        } else {
            z10 = z11;
        }
        if (z10) {
            hVar.M(tVar);
        }
        f Y10 = fVar.Y("onSwipe");
        if (Y10 != null) {
            h(Y10, hVar);
        }
        f(fVar, hVar);
    }

    private static void d(f fVar, h hVar) {
        C5517a R10;
        C5438a[][] aVarArr;
        f fVar2;
        int i10;
        int i11;
        f fVar3 = fVar;
        h hVar2 = hVar;
        int i12 = 9;
        int i13 = 1;
        C5517a R11 = fVar3.R("target");
        if (R11 != null && (R10 = fVar3.R("frames")) != null) {
            String g02 = fVar3.g0("transitionEasing");
            String[] strArr = {"scaleX", "scaleY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "alpha"};
            int[] iArr = {311, 312, 304, 305, 306, 308, 309, 310, 303};
            boolean[] zArr = {false, false, true, true, true, false, false, false, false};
            int size = R10.size();
            t[] tVarArr = new t[size];
            for (int i14 = 0; i14 < R10.size(); i14++) {
                tVarArr[i14] = new t();
            }
            int i15 = 0;
            while (i15 < i12) {
                String str = strArr[i15];
                int i16 = iArr[i15];
                boolean z10 = zArr[i15];
                C5517a R12 = fVar3.R(str);
                if (R12 == null || R12.size() == size) {
                    if (R12 != null) {
                        for (int i17 = 0; i17 < size; i17++) {
                            float S10 = R12.S(i17);
                            if (z10) {
                                S10 = hVar2.f26176k.a(S10);
                            }
                            tVarArr[i17].a(i16, S10);
                            i13 = 1;
                        }
                    } else {
                        float V10 = fVar3.V(str);
                        if (!Float.isNaN(V10)) {
                            if (z10) {
                                V10 = hVar2.f26176k.a(V10);
                            }
                            for (int i18 = 0; i18 < size; i18++) {
                                tVarArr[i18].a(i16, V10);
                            }
                        }
                        i13 = 1;
                    }
                    i15 += i13;
                    i12 = 9;
                } else {
                    throw new h("incorrect size for " + str + " array, not matching targets array!", fVar3);
                }
            }
            C5519c a02 = fVar3.a0("custom");
            if (a02 == null || !(a02 instanceof f)) {
                aVarArr = null;
            } else {
                f fVar4 = (f) a02;
                int size2 = fVar4.size();
                int size3 = R10.size();
                int[] iArr2 = new int[2];
                iArr2[1] = size2;
                iArr2[0] = size3;
                aVarArr = (C5438a[][]) Array.newInstance(C5438a.class, iArr2);
                int i19 = 0;
                while (i19 < size2) {
                    C5520d dVar = (C5520d) fVar4.O(i19);
                    String j10 = dVar.j();
                    if (dVar.r0() instanceof C5517a) {
                        C5517a aVar = (C5517a) dVar.r0();
                        int size4 = aVar.size();
                        if (size4 == size && size4 > 0) {
                            if (aVar.O(0) instanceof e) {
                                int i20 = 0;
                                while (i20 < size) {
                                    aVarArr[i20][i19] = new C5438a(j10, 901, aVar.O(i20).p());
                                    i20++;
                                    fVar4 = fVar4;
                                }
                            } else {
                                fVar2 = fVar4;
                                int i21 = 0;
                                while (i21 < size) {
                                    long g10 = C5574b.g(aVar.O(i21).j());
                                    if (g10 != -1) {
                                        i11 = size2;
                                        aVarArr[i21][i19] = new C5438a(j10, 902, (int) g10);
                                    } else {
                                        i11 = size2;
                                    }
                                    i21++;
                                    size2 = i11;
                                }
                                i10 = size2;
                            }
                        }
                        fVar2 = fVar4;
                        i10 = size2;
                    } else {
                        fVar2 = fVar4;
                        i10 = size2;
                        C5519c r02 = dVar.r0();
                        if (r02 instanceof e) {
                            float p10 = r02.p();
                            for (int i22 = 0; i22 < size; i22++) {
                                aVarArr[i22][i19] = new C5438a(j10, 901, p10);
                            }
                        } else {
                            long g11 = C5574b.g(r02.j());
                            if (g11 != -1) {
                                int i23 = 0;
                                while (i23 < size) {
                                    aVarArr[i23][i19] = new C5438a(j10, 902, (int) g11);
                                    i23++;
                                    g11 = g11;
                                }
                            }
                        }
                    }
                    i19++;
                    fVar4 = fVar2;
                    size2 = i10;
                }
            }
            String g03 = fVar3.g0("curveFit");
            for (int i24 = 0; i24 < R11.size(); i24++) {
                for (int i25 = 0; i25 < size; i25++) {
                    String b02 = R11.b0(i24);
                    t tVar = tVarArr[i25];
                    if (g03 != null) {
                        tVar.b(508, a(g03, "spline", "linear"));
                    }
                    tVar.e(501, g02);
                    tVar.b(100, R10.getInt(i25));
                    hVar2.h(b02, tVar, aVarArr != null ? aVarArr[i25] : null);
                }
            }
        }
    }

    private static void e(f fVar, h hVar) {
        int[] iArr;
        int i10;
        f fVar2 = fVar;
        h hVar2 = hVar;
        C5517a Q10 = fVar2.Q("target");
        C5517a Q11 = fVar2.Q("frames");
        String g02 = fVar2.g0("transitionEasing");
        String[] strArr = {"scaleX", "scaleY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "alpha", "period", "offset", "phase"};
        int i11 = 12;
        int[] iArr2 = {311, 312, 304, 305, 306, 308, 309, 310, 403, 423, 424, 425};
        int[] iArr3 = {0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 2, 0};
        int size = Q11.size();
        t[] tVarArr = new t[size];
        for (int i12 = 0; i12 < size; i12++) {
            tVarArr[i12] = new t();
        }
        boolean z10 = false;
        for (int i13 = 0; i13 < 12; i13++) {
            if (fVar2.h0(strArr[i13]) && iArr3[i13] == 1) {
                z10 = true;
            }
        }
        int i14 = 0;
        while (i14 < i11) {
            String str = strArr[i14];
            int i15 = iArr2[i14];
            int i16 = iArr3[i14];
            C5517a R10 = fVar2.R(str);
            String[] strArr2 = strArr;
            if (R10 == null || R10.size() == size) {
                if (R10 != null) {
                    int i17 = 0;
                    while (i17 < size) {
                        float S10 = R10.S(i17);
                        int[] iArr4 = iArr2;
                        if (i16 == 1) {
                            S10 = hVar2.f26176k.a(S10);
                        } else if (i16 == 2 && z10) {
                            S10 = hVar2.f26176k.a(S10);
                        }
                        tVarArr[i17].a(i15, S10);
                        i17++;
                        iArr2 = iArr4;
                    }
                    iArr = iArr2;
                } else {
                    iArr = iArr2;
                    float V10 = fVar2.V(str);
                    if (!Float.isNaN(V10)) {
                        if (i16 == 1) {
                            V10 = hVar2.f26176k.a(V10);
                        } else if (i16 == 2 && z10) {
                            V10 = hVar2.f26176k.a(V10);
                        }
                        for (int i18 = 0; i18 < size; i18++) {
                            tVarArr[i18].a(i15, V10);
                        }
                    } else {
                        i10 = 1;
                        i14 += i10;
                        strArr = strArr2;
                        iArr2 = iArr;
                        i11 = 12;
                    }
                }
                i10 = 1;
                i14 += i10;
                strArr = strArr2;
                iArr2 = iArr;
                i11 = 12;
            } else {
                throw new h("incorrect size for $attrName array, not matching targets array!", fVar2);
            }
        }
        String g03 = fVar2.g0("curveFit");
        String g04 = fVar2.g0("easing");
        String g05 = fVar2.g0("waveShape");
        String g06 = fVar2.g0("customWave");
        for (int i19 = 0; i19 < Q10.size(); i19++) {
            for (int i20 = 0; i20 < size; i20++) {
                String b02 = Q10.b0(i19);
                t tVar = tVarArr[i20];
                if (g03 != null) {
                    if (g03.equals("linear")) {
                        tVar.b(401, 1);
                    } else if (g03.equals("spline")) {
                        tVar.b(401, 0);
                    }
                }
                tVar.e(501, g02);
                if (g04 != null) {
                    tVar.c(420, g04);
                }
                if (g05 != null) {
                    tVar.c(421, g05);
                }
                if (g06 != null) {
                    tVar.c(422, g06);
                }
                tVar.b(100, Q11.getInt(i20));
                hVar2.i(b02, tVar);
            }
        }
    }

    public static void f(f fVar, h hVar) {
        f Y10 = fVar.Y("KeyFrames");
        if (Y10 != null) {
            C5517a R10 = Y10.R("KeyPositions");
            if (R10 != null) {
                for (int i10 = 0; i10 < R10.size(); i10++) {
                    C5519c O10 = R10.O(i10);
                    if (O10 instanceof f) {
                        g((f) O10, hVar);
                    }
                }
            }
            C5517a R11 = Y10.R("KeyAttributes");
            if (R11 != null) {
                for (int i11 = 0; i11 < R11.size(); i11++) {
                    C5519c O11 = R11.O(i11);
                    if (O11 instanceof f) {
                        d((f) O11, hVar);
                    }
                }
            }
            C5517a R12 = Y10.R("KeyCycles");
            if (R12 != null) {
                for (int i12 = 0; i12 < R12.size(); i12++) {
                    C5519c O12 = R12.O(i12);
                    if (O12 instanceof f) {
                        e((f) O12, hVar);
                    }
                }
            }
        }
    }

    private static void g(f fVar, h hVar) {
        f fVar2 = fVar;
        t tVar = new t();
        C5517a Q10 = fVar2.Q("target");
        C5517a Q11 = fVar2.Q("frames");
        C5517a R10 = fVar2.R("percentX");
        C5517a R11 = fVar2.R("percentY");
        C5517a R12 = fVar2.R("percentWidth");
        C5517a R13 = fVar2.R("percentHeight");
        String g02 = fVar2.g0("pathMotionArc");
        String g03 = fVar2.g0("transitionEasing");
        String g04 = fVar2.g0("curveFit");
        String g05 = fVar2.g0("type");
        if (g05 == null) {
            g05 = "parentRelative";
        }
        if (R10 != null && Q11.size() != R10.size()) {
            return;
        }
        if (R11 == null || Q11.size() == R11.size()) {
            int i10 = 0;
            while (i10 < Q10.size()) {
                String b02 = Q10.b0(i10);
                int a10 = a(g05, "deltaRelative", "pathRelative", "parentRelative");
                tVar.h();
                tVar.b(510, a10);
                if (g04 != null) {
                    b(tVar, 508, g04, "spline", "linear");
                }
                tVar.e(501, g03);
                if (g02 != null) {
                    b(tVar, 509, g02, "none", "startVertical", "startHorizontal", "flip", "below", "above");
                }
                int i11 = 0;
                while (i11 < Q11.size()) {
                    tVar.b(100, Q11.getInt(i11));
                    i(tVar, 506, R10, i11);
                    i(tVar, 507, R11, i11);
                    i(tVar, 503, R12, i11);
                    i(tVar, 504, R13, i11);
                    hVar.j(b02, tVar);
                    i11++;
                    g05 = g05;
                }
                String str = g05;
                h hVar2 = hVar;
                i10++;
                g05 = str;
            }
        }
    }

    private static void h(C5518b bVar, h hVar) {
        C5518b bVar2 = bVar;
        String g02 = bVar2.g0("anchor");
        int a10 = a(bVar2.g0("side"), h.b.f26188u);
        int a11 = a(bVar2.g0("direction"), h.b.f26190w);
        float V10 = bVar2.V("scale");
        float V11 = bVar2.V("threshold");
        float V12 = bVar2.V("maxVelocity");
        float V13 = bVar2.V("maxAccel");
        String g03 = bVar2.g0("limitBounds");
        int a12 = a(bVar2.g0("mode"), h.b.f26191x);
        int a13 = a(bVar2.g0("touchUp"), h.b.f26192y);
        float V14 = bVar2.V("springMass");
        float V15 = bVar2.V("springStiffness");
        float V16 = bVar2.V("springDamping");
        float V17 = bVar2.V("stopThreshold");
        int a14 = a(bVar2.g0("springBoundary"), h.b.f26193z);
        String g04 = bVar2.g0("around");
        h.b n10 = hVar.n();
        n10.h(g02);
        n10.i(a10);
        n10.k(a11);
        n10.l(V10);
        n10.m(V11);
        n10.p(V12);
        n10.o(V13);
        n10.n(g03);
        n10.j(a12);
        n10.q(a13);
        n10.u(V14);
        n10.v(V15);
        n10.t(V16);
        n10.w(V17);
        n10.s(a14);
        n10.r(g04);
    }

    private static void i(t tVar, int i10, C5517a aVar, int i11) {
        if (aVar != null) {
            tVar.a(i10, aVar.S(i11));
        }
    }
}
