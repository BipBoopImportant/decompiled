package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import com.google.ar.core.ImageFormat;
import com.oppwa.mobile.connect.BuildConfig;
import d9.M;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.maplibre.android.log.Logger;
import org.xmlpull.v1.XmlPullParserException;

public class c {
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f20310g = {0, 4, 8};

    /* renamed from: h  reason: collision with root package name */
    private static SparseIntArray f20311h = new SparseIntArray();

    /* renamed from: i  reason: collision with root package name */
    private static SparseIntArray f20312i = new SparseIntArray();

    /* renamed from: a  reason: collision with root package name */
    public String f20313a = "";

    /* renamed from: b  reason: collision with root package name */
    private String[] f20314b = new String[0];

    /* renamed from: c  reason: collision with root package name */
    public int f20315c = 0;

    /* renamed from: d  reason: collision with root package name */
    private HashMap<String, a> f20316d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private boolean f20317e = true;

    /* renamed from: f  reason: collision with root package name */
    private HashMap<Integer, a> f20318f = new HashMap<>();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f20319a;

        /* renamed from: b  reason: collision with root package name */
        String f20320b;

        /* renamed from: c  reason: collision with root package name */
        public final d f20321c = new d();

        /* renamed from: d  reason: collision with root package name */
        public final C0324c f20322d = new C0324c();

        /* renamed from: e  reason: collision with root package name */
        public final b f20323e = new b();

        /* renamed from: f  reason: collision with root package name */
        public final e f20324f = new e();

        /* renamed from: g  reason: collision with root package name */
        public HashMap<String, a> f20325g = new HashMap<>();

        /* renamed from: h  reason: collision with root package name */
        C0323a f20326h;

        /* renamed from: androidx.constraintlayout.widget.c$a$a  reason: collision with other inner class name */
        static class C0323a {

            /* renamed from: a  reason: collision with root package name */
            int[] f20327a = new int[10];

            /* renamed from: b  reason: collision with root package name */
            int[] f20328b = new int[10];

            /* renamed from: c  reason: collision with root package name */
            int f20329c = 0;

            /* renamed from: d  reason: collision with root package name */
            int[] f20330d = new int[10];

            /* renamed from: e  reason: collision with root package name */
            float[] f20331e = new float[10];

            /* renamed from: f  reason: collision with root package name */
            int f20332f = 0;

            /* renamed from: g  reason: collision with root package name */
            int[] f20333g = new int[5];

            /* renamed from: h  reason: collision with root package name */
            String[] f20334h = new String[5];

            /* renamed from: i  reason: collision with root package name */
            int f20335i = 0;

            /* renamed from: j  reason: collision with root package name */
            int[] f20336j = new int[4];

            /* renamed from: k  reason: collision with root package name */
            boolean[] f20337k = new boolean[4];

            /* renamed from: l  reason: collision with root package name */
            int f20338l = 0;

            C0323a() {
            }

            /* access modifiers changed from: package-private */
            public void a(int i10, float f10) {
                int i11 = this.f20332f;
                int[] iArr = this.f20330d;
                if (i11 >= iArr.length) {
                    this.f20330d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f20331e;
                    this.f20331e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f20330d;
                int i12 = this.f20332f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f20331e;
                this.f20332f = i12 + 1;
                fArr2[i12] = f10;
            }

            /* access modifiers changed from: package-private */
            public void b(int i10, int i11) {
                int i12 = this.f20329c;
                int[] iArr = this.f20327a;
                if (i12 >= iArr.length) {
                    this.f20327a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f20328b;
                    this.f20328b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f20327a;
                int i13 = this.f20329c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f20328b;
                this.f20329c = i13 + 1;
                iArr4[i13] = i11;
            }

            /* access modifiers changed from: package-private */
            public void c(int i10, String str) {
                int i11 = this.f20335i;
                int[] iArr = this.f20333g;
                if (i11 >= iArr.length) {
                    this.f20333g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f20334h;
                    this.f20334h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f20333g;
                int i12 = this.f20335i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f20334h;
                this.f20335i = i12 + 1;
                strArr2[i12] = str;
            }

            /* access modifiers changed from: package-private */
            public void d(int i10, boolean z10) {
                int i11 = this.f20338l;
                int[] iArr = this.f20336j;
                if (i11 >= iArr.length) {
                    this.f20336j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f20337k;
                    this.f20337k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f20336j;
                int i12 = this.f20338l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f20337k;
                this.f20338l = i12 + 1;
                zArr2[i12] = z10;
            }
        }

        /* access modifiers changed from: private */
        public void f(int i10, ConstraintLayout.b bVar) {
            this.f20319a = i10;
            b bVar2 = this.f20323e;
            bVar2.f20384j = bVar.f20216e;
            bVar2.f20386k = bVar.f20218f;
            bVar2.f20388l = bVar.f20220g;
            bVar2.f20390m = bVar.f20222h;
            bVar2.f20392n = bVar.f20224i;
            bVar2.f20394o = bVar.f20226j;
            bVar2.f20396p = bVar.f20228k;
            bVar2.f20398q = bVar.f20230l;
            bVar2.f20400r = bVar.f20232m;
            bVar2.f20401s = bVar.f20234n;
            bVar2.f20402t = bVar.f20236o;
            bVar2.f20403u = bVar.f20244s;
            bVar2.f20404v = bVar.f20246t;
            bVar2.f20405w = bVar.f20248u;
            bVar2.f20406x = bVar.f20250v;
            bVar2.f20407y = bVar.f20188G;
            bVar2.f20408z = bVar.f20189H;
            bVar2.f20340A = bVar.f20190I;
            bVar2.f20341B = bVar.f20238p;
            bVar2.f20342C = bVar.f20240q;
            bVar2.f20343D = bVar.f20242r;
            bVar2.f20344E = bVar.f20205X;
            bVar2.f20345F = bVar.f20206Y;
            bVar2.f20346G = bVar.f20207Z;
            bVar2.f20380h = bVar.f20212c;
            bVar2.f20376f = bVar.f20208a;
            bVar2.f20378g = bVar.f20210b;
            bVar2.f20372d = bVar.width;
            bVar2.f20374e = bVar.height;
            bVar2.f20347H = bVar.leftMargin;
            bVar2.f20348I = bVar.rightMargin;
            bVar2.f20349J = bVar.topMargin;
            bVar2.f20350K = bVar.bottomMargin;
            bVar2.f20353N = bVar.f20185D;
            bVar2.f20361V = bVar.f20194M;
            bVar2.f20362W = bVar.f20193L;
            bVar2.f20364Y = bVar.f20196O;
            bVar2.f20363X = bVar.f20195N;
            bVar2.f20393n0 = bVar.f20209a0;
            bVar2.f20395o0 = bVar.f20211b0;
            bVar2.f20365Z = bVar.f20197P;
            bVar2.f20367a0 = bVar.f20198Q;
            bVar2.f20369b0 = bVar.f20201T;
            bVar2.f20371c0 = bVar.f20202U;
            bVar2.f20373d0 = bVar.f20199R;
            bVar2.f20375e0 = bVar.f20200S;
            bVar2.f20377f0 = bVar.f20203V;
            bVar2.f20379g0 = bVar.f20204W;
            bVar2.f20391m0 = bVar.f20213c0;
            bVar2.f20355P = bVar.f20254x;
            bVar2.f20357R = bVar.f20256z;
            bVar2.f20354O = bVar.f20252w;
            bVar2.f20356Q = bVar.f20255y;
            bVar2.f20359T = bVar.f20182A;
            bVar2.f20358S = bVar.f20183B;
            bVar2.f20360U = bVar.f20184C;
            bVar2.f20399q0 = bVar.f20215d0;
            bVar2.f20351L = bVar.getMarginEnd();
            this.f20323e.f20352M = bVar.getMarginStart();
        }

        /* access modifiers changed from: private */
        public void g(int i10, Constraints.a aVar) {
            f(i10, aVar);
            this.f20321c.f20427d = aVar.f20277x0;
            e eVar = this.f20324f;
            eVar.f20431b = aVar.f20267A0;
            eVar.f20432c = aVar.f20268B0;
            eVar.f20433d = aVar.f20269C0;
            eVar.f20434e = aVar.f20270D0;
            eVar.f20435f = aVar.f20271E0;
            eVar.f20436g = aVar.f20272F0;
            eVar.f20437h = aVar.f20273G0;
            eVar.f20439j = aVar.f20274H0;
            eVar.f20440k = aVar.f20275I0;
            eVar.f20441l = aVar.f20276J0;
            eVar.f20443n = aVar.f20279z0;
            eVar.f20442m = aVar.f20278y0;
        }

        /* access modifiers changed from: private */
        public void h(ConstraintHelper constraintHelper, int i10, Constraints.a aVar) {
            g(i10, aVar);
            if (constraintHelper instanceof Barrier) {
                b bVar = this.f20323e;
                bVar.f20385j0 = 1;
                Barrier barrier = (Barrier) constraintHelper;
                bVar.f20381h0 = barrier.getType();
                this.f20323e.f20387k0 = barrier.getReferencedIds();
                this.f20323e.f20383i0 = barrier.getMargin();
            }
        }

        public void d(ConstraintLayout.b bVar) {
            b bVar2 = this.f20323e;
            bVar.f20216e = bVar2.f20384j;
            bVar.f20218f = bVar2.f20386k;
            bVar.f20220g = bVar2.f20388l;
            bVar.f20222h = bVar2.f20390m;
            bVar.f20224i = bVar2.f20392n;
            bVar.f20226j = bVar2.f20394o;
            bVar.f20228k = bVar2.f20396p;
            bVar.f20230l = bVar2.f20398q;
            bVar.f20232m = bVar2.f20400r;
            bVar.f20234n = bVar2.f20401s;
            bVar.f20236o = bVar2.f20402t;
            bVar.f20244s = bVar2.f20403u;
            bVar.f20246t = bVar2.f20404v;
            bVar.f20248u = bVar2.f20405w;
            bVar.f20250v = bVar2.f20406x;
            bVar.leftMargin = bVar2.f20347H;
            bVar.rightMargin = bVar2.f20348I;
            bVar.topMargin = bVar2.f20349J;
            bVar.bottomMargin = bVar2.f20350K;
            bVar.f20182A = bVar2.f20359T;
            bVar.f20183B = bVar2.f20358S;
            bVar.f20254x = bVar2.f20355P;
            bVar.f20256z = bVar2.f20357R;
            bVar.f20188G = bVar2.f20407y;
            bVar.f20189H = bVar2.f20408z;
            bVar.f20238p = bVar2.f20341B;
            bVar.f20240q = bVar2.f20342C;
            bVar.f20242r = bVar2.f20343D;
            bVar.f20190I = bVar2.f20340A;
            bVar.f20205X = bVar2.f20344E;
            bVar.f20206Y = bVar2.f20345F;
            bVar.f20194M = bVar2.f20361V;
            bVar.f20193L = bVar2.f20362W;
            bVar.f20196O = bVar2.f20364Y;
            bVar.f20195N = bVar2.f20363X;
            bVar.f20209a0 = bVar2.f20393n0;
            bVar.f20211b0 = bVar2.f20395o0;
            bVar.f20197P = bVar2.f20365Z;
            bVar.f20198Q = bVar2.f20367a0;
            bVar.f20201T = bVar2.f20369b0;
            bVar.f20202U = bVar2.f20371c0;
            bVar.f20199R = bVar2.f20373d0;
            bVar.f20200S = bVar2.f20375e0;
            bVar.f20203V = bVar2.f20377f0;
            bVar.f20204W = bVar2.f20379g0;
            bVar.f20207Z = bVar2.f20346G;
            bVar.f20212c = bVar2.f20380h;
            bVar.f20208a = bVar2.f20376f;
            bVar.f20210b = bVar2.f20378g;
            bVar.width = bVar2.f20372d;
            bVar.height = bVar2.f20374e;
            String str = bVar2.f20391m0;
            if (str != null) {
                bVar.f20213c0 = str;
            }
            bVar.f20215d0 = bVar2.f20399q0;
            bVar.setMarginStart(bVar2.f20352M);
            bVar.setMarginEnd(this.f20323e.f20351L);
            bVar.a();
        }

        /* renamed from: e */
        public a clone() {
            a aVar = new a();
            aVar.f20323e.a(this.f20323e);
            aVar.f20322d.a(this.f20322d);
            aVar.f20321c.a(this.f20321c);
            aVar.f20324f.a(this.f20324f);
            aVar.f20319a = this.f20319a;
            aVar.f20326h = this.f20326h;
            return aVar;
        }
    }

    public static class b {

        /* renamed from: r0  reason: collision with root package name */
        private static SparseIntArray f20339r0;

        /* renamed from: A  reason: collision with root package name */
        public String f20340A = null;

        /* renamed from: B  reason: collision with root package name */
        public int f20341B = -1;

        /* renamed from: C  reason: collision with root package name */
        public int f20342C = 0;

        /* renamed from: D  reason: collision with root package name */
        public float f20343D = 0.0f;

        /* renamed from: E  reason: collision with root package name */
        public int f20344E = -1;

        /* renamed from: F  reason: collision with root package name */
        public int f20345F = -1;

        /* renamed from: G  reason: collision with root package name */
        public int f20346G = -1;

        /* renamed from: H  reason: collision with root package name */
        public int f20347H = 0;

        /* renamed from: I  reason: collision with root package name */
        public int f20348I = 0;

        /* renamed from: J  reason: collision with root package name */
        public int f20349J = 0;

        /* renamed from: K  reason: collision with root package name */
        public int f20350K = 0;

        /* renamed from: L  reason: collision with root package name */
        public int f20351L = 0;

        /* renamed from: M  reason: collision with root package name */
        public int f20352M = 0;

        /* renamed from: N  reason: collision with root package name */
        public int f20353N = 0;

        /* renamed from: O  reason: collision with root package name */
        public int f20354O = Integer.MIN_VALUE;

        /* renamed from: P  reason: collision with root package name */
        public int f20355P = Integer.MIN_VALUE;

        /* renamed from: Q  reason: collision with root package name */
        public int f20356Q = Integer.MIN_VALUE;

        /* renamed from: R  reason: collision with root package name */
        public int f20357R = Integer.MIN_VALUE;

        /* renamed from: S  reason: collision with root package name */
        public int f20358S = Integer.MIN_VALUE;

        /* renamed from: T  reason: collision with root package name */
        public int f20359T = Integer.MIN_VALUE;

        /* renamed from: U  reason: collision with root package name */
        public int f20360U = Integer.MIN_VALUE;

        /* renamed from: V  reason: collision with root package name */
        public float f20361V = -1.0f;

        /* renamed from: W  reason: collision with root package name */
        public float f20362W = -1.0f;

        /* renamed from: X  reason: collision with root package name */
        public int f20363X = 0;

        /* renamed from: Y  reason: collision with root package name */
        public int f20364Y = 0;

        /* renamed from: Z  reason: collision with root package name */
        public int f20365Z = 0;

        /* renamed from: a  reason: collision with root package name */
        public boolean f20366a = false;

        /* renamed from: a0  reason: collision with root package name */
        public int f20367a0 = 0;

        /* renamed from: b  reason: collision with root package name */
        public boolean f20368b = false;

        /* renamed from: b0  reason: collision with root package name */
        public int f20369b0 = 0;

        /* renamed from: c  reason: collision with root package name */
        public boolean f20370c = false;

        /* renamed from: c0  reason: collision with root package name */
        public int f20371c0 = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f20372d;

        /* renamed from: d0  reason: collision with root package name */
        public int f20373d0 = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f20374e;

        /* renamed from: e0  reason: collision with root package name */
        public int f20375e0 = 0;

        /* renamed from: f  reason: collision with root package name */
        public int f20376f = -1;

        /* renamed from: f0  reason: collision with root package name */
        public float f20377f0 = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public int f20378g = -1;

        /* renamed from: g0  reason: collision with root package name */
        public float f20379g0 = 1.0f;

        /* renamed from: h  reason: collision with root package name */
        public float f20380h = -1.0f;

        /* renamed from: h0  reason: collision with root package name */
        public int f20381h0 = -1;

        /* renamed from: i  reason: collision with root package name */
        public boolean f20382i = true;

        /* renamed from: i0  reason: collision with root package name */
        public int f20383i0 = 0;

        /* renamed from: j  reason: collision with root package name */
        public int f20384j = -1;

        /* renamed from: j0  reason: collision with root package name */
        public int f20385j0 = -1;

        /* renamed from: k  reason: collision with root package name */
        public int f20386k = -1;

        /* renamed from: k0  reason: collision with root package name */
        public int[] f20387k0;

        /* renamed from: l  reason: collision with root package name */
        public int f20388l = -1;

        /* renamed from: l0  reason: collision with root package name */
        public String f20389l0;

        /* renamed from: m  reason: collision with root package name */
        public int f20390m = -1;

        /* renamed from: m0  reason: collision with root package name */
        public String f20391m0;

        /* renamed from: n  reason: collision with root package name */
        public int f20392n = -1;

        /* renamed from: n0  reason: collision with root package name */
        public boolean f20393n0 = false;

        /* renamed from: o  reason: collision with root package name */
        public int f20394o = -1;

        /* renamed from: o0  reason: collision with root package name */
        public boolean f20395o0 = false;

        /* renamed from: p  reason: collision with root package name */
        public int f20396p = -1;

        /* renamed from: p0  reason: collision with root package name */
        public boolean f20397p0 = true;

        /* renamed from: q  reason: collision with root package name */
        public int f20398q = -1;

        /* renamed from: q0  reason: collision with root package name */
        public int f20399q0 = 0;

        /* renamed from: r  reason: collision with root package name */
        public int f20400r = -1;

        /* renamed from: s  reason: collision with root package name */
        public int f20401s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f20402t = -1;

        /* renamed from: u  reason: collision with root package name */
        public int f20403u = -1;

        /* renamed from: v  reason: collision with root package name */
        public int f20404v = -1;

        /* renamed from: w  reason: collision with root package name */
        public int f20405w = -1;

        /* renamed from: x  reason: collision with root package name */
        public int f20406x = -1;

        /* renamed from: y  reason: collision with root package name */
        public float f20407y = 0.5f;

        /* renamed from: z  reason: collision with root package name */
        public float f20408z = 0.5f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f20339r0 = sparseIntArray;
            sparseIntArray.append(f.f20671b6, 24);
            f20339r0.append(f.f20680c6, 25);
            f20339r0.append(f.f20698e6, 28);
            f20339r0.append(f.f20707f6, 29);
            f20339r0.append(f.f20752k6, 35);
            f20339r0.append(f.f20743j6, 34);
            f20339r0.append(f.f20533K5, 4);
            f20339r0.append(f.f20525J5, 3);
            f20339r0.append(f.f20509H5, 1);
            f20339r0.append(f.f20824s6, 6);
            f20339r0.append(f.f20833t6, 7);
            f20339r0.append(f.f20589R5, 17);
            f20339r0.append(f.f20597S5, 18);
            f20339r0.append(f.f20605T5, 19);
            f20339r0.append(f.f20477D5, 90);
            f20339r0.append(f.f20796p5, 26);
            f20339r0.append(f.f20716g6, 31);
            f20339r0.append(f.f20725h6, 32);
            f20339r0.append(f.f20581Q5, 10);
            f20339r0.append(f.f20573P5, 9);
            f20339r0.append(f.f20860w6, 13);
            f20339r0.append(f.f20887z6, 16);
            f20339r0.append(f.f20869x6, 14);
            f20339r0.append(f.f20842u6, 11);
            f20339r0.append(f.f20878y6, 15);
            f20339r0.append(f.f20851v6, 12);
            f20339r0.append(f.f20779n6, 38);
            f20339r0.append(f.f20653Z5, 37);
            f20339r0.append(f.f20645Y5, 39);
            f20339r0.append(f.f20770m6, 40);
            f20339r0.append(f.f20637X5, 20);
            f20339r0.append(f.f20761l6, 36);
            f20339r0.append(f.f20565O5, 5);
            f20339r0.append(f.f20662a6, 91);
            f20339r0.append(f.f20734i6, 91);
            f20339r0.append(f.f20689d6, 91);
            f20339r0.append(f.f20517I5, 91);
            f20339r0.append(f.f20501G5, 91);
            f20339r0.append(f.f20823s5, 23);
            f20339r0.append(f.f20841u5, 27);
            f20339r0.append(f.f20859w5, 30);
            f20339r0.append(f.f20868x5, 8);
            f20339r0.append(f.f20832t5, 33);
            f20339r0.append(f.f20850v5, 2);
            f20339r0.append(f.f20805q5, 22);
            f20339r0.append(f.f20814r5, 21);
            f20339r0.append(f.f20788o6, 41);
            f20339r0.append(f.f20613U5, 42);
            f20339r0.append(f.f20493F5, 87);
            f20339r0.append(f.f20485E5, 88);
            f20339r0.append(f.f20451A6, 76);
            f20339r0.append(f.f20541L5, 61);
            f20339r0.append(f.f20557N5, 62);
            f20339r0.append(f.f20549M5, 63);
            f20339r0.append(f.f20815r6, 69);
            f20339r0.append(f.f20629W5, 70);
            f20339r0.append(f.f20459B5, 71);
            f20339r0.append(f.f20886z5, 72);
            f20339r0.append(f.f20450A5, 73);
            f20339r0.append(f.f20468C5, 74);
            f20339r0.append(f.f20877y5, 75);
            f20339r0.append(f.f20797p6, 84);
            f20339r0.append(f.f20806q6, 86);
            f20339r0.append(f.f20797p6, 83);
            f20339r0.append(f.f20621V5, 85);
            f20339r0.append(f.f20788o6, 87);
            f20339r0.append(f.f20613U5, 88);
            f20339r0.append(f.f20820s2, 89);
            f20339r0.append(f.f20477D5, 90);
        }

        public void a(b bVar) {
            this.f20366a = bVar.f20366a;
            this.f20372d = bVar.f20372d;
            this.f20368b = bVar.f20368b;
            this.f20374e = bVar.f20374e;
            this.f20376f = bVar.f20376f;
            this.f20378g = bVar.f20378g;
            this.f20380h = bVar.f20380h;
            this.f20382i = bVar.f20382i;
            this.f20384j = bVar.f20384j;
            this.f20386k = bVar.f20386k;
            this.f20388l = bVar.f20388l;
            this.f20390m = bVar.f20390m;
            this.f20392n = bVar.f20392n;
            this.f20394o = bVar.f20394o;
            this.f20396p = bVar.f20396p;
            this.f20398q = bVar.f20398q;
            this.f20400r = bVar.f20400r;
            this.f20401s = bVar.f20401s;
            this.f20402t = bVar.f20402t;
            this.f20403u = bVar.f20403u;
            this.f20404v = bVar.f20404v;
            this.f20405w = bVar.f20405w;
            this.f20406x = bVar.f20406x;
            this.f20407y = bVar.f20407y;
            this.f20408z = bVar.f20408z;
            this.f20340A = bVar.f20340A;
            this.f20341B = bVar.f20341B;
            this.f20342C = bVar.f20342C;
            this.f20343D = bVar.f20343D;
            this.f20344E = bVar.f20344E;
            this.f20345F = bVar.f20345F;
            this.f20346G = bVar.f20346G;
            this.f20347H = bVar.f20347H;
            this.f20348I = bVar.f20348I;
            this.f20349J = bVar.f20349J;
            this.f20350K = bVar.f20350K;
            this.f20351L = bVar.f20351L;
            this.f20352M = bVar.f20352M;
            this.f20353N = bVar.f20353N;
            this.f20354O = bVar.f20354O;
            this.f20355P = bVar.f20355P;
            this.f20356Q = bVar.f20356Q;
            this.f20357R = bVar.f20357R;
            this.f20358S = bVar.f20358S;
            this.f20359T = bVar.f20359T;
            this.f20360U = bVar.f20360U;
            this.f20361V = bVar.f20361V;
            this.f20362W = bVar.f20362W;
            this.f20363X = bVar.f20363X;
            this.f20364Y = bVar.f20364Y;
            this.f20365Z = bVar.f20365Z;
            this.f20367a0 = bVar.f20367a0;
            this.f20369b0 = bVar.f20369b0;
            this.f20371c0 = bVar.f20371c0;
            this.f20373d0 = bVar.f20373d0;
            this.f20375e0 = bVar.f20375e0;
            this.f20377f0 = bVar.f20377f0;
            this.f20379g0 = bVar.f20379g0;
            this.f20381h0 = bVar.f20381h0;
            this.f20383i0 = bVar.f20383i0;
            this.f20385j0 = bVar.f20385j0;
            this.f20391m0 = bVar.f20391m0;
            int[] iArr = bVar.f20387k0;
            if (iArr == null || bVar.f20389l0 != null) {
                this.f20387k0 = null;
            } else {
                this.f20387k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f20389l0 = bVar.f20389l0;
            this.f20393n0 = bVar.f20393n0;
            this.f20395o0 = bVar.f20395o0;
            this.f20397p0 = bVar.f20397p0;
            this.f20399q0 = bVar.f20399q0;
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f20787o5);
            this.f20368b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = f20339r0.get(index);
                switch (i11) {
                    case 1:
                        this.f20400r = c.p(obtainStyledAttributes, index, this.f20400r);
                        break;
                    case 2:
                        this.f20350K = obtainStyledAttributes.getDimensionPixelSize(index, this.f20350K);
                        break;
                    case 3:
                        this.f20398q = c.p(obtainStyledAttributes, index, this.f20398q);
                        break;
                    case 4:
                        this.f20396p = c.p(obtainStyledAttributes, index, this.f20396p);
                        break;
                    case 5:
                        this.f20340A = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f20344E = obtainStyledAttributes.getDimensionPixelOffset(index, this.f20344E);
                        break;
                    case 7:
                        this.f20345F = obtainStyledAttributes.getDimensionPixelOffset(index, this.f20345F);
                        break;
                    case 8:
                        this.f20351L = obtainStyledAttributes.getDimensionPixelSize(index, this.f20351L);
                        break;
                    case 9:
                        this.f20406x = c.p(obtainStyledAttributes, index, this.f20406x);
                        break;
                    case 10:
                        this.f20405w = c.p(obtainStyledAttributes, index, this.f20405w);
                        break;
                    case 11:
                        this.f20357R = obtainStyledAttributes.getDimensionPixelSize(index, this.f20357R);
                        break;
                    case 12:
                        this.f20358S = obtainStyledAttributes.getDimensionPixelSize(index, this.f20358S);
                        break;
                    case 13:
                        this.f20354O = obtainStyledAttributes.getDimensionPixelSize(index, this.f20354O);
                        break;
                    case 14:
                        this.f20356Q = obtainStyledAttributes.getDimensionPixelSize(index, this.f20356Q);
                        break;
                    case 15:
                        this.f20359T = obtainStyledAttributes.getDimensionPixelSize(index, this.f20359T);
                        break;
                    case 16:
                        this.f20355P = obtainStyledAttributes.getDimensionPixelSize(index, this.f20355P);
                        break;
                    case 17:
                        this.f20376f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f20376f);
                        break;
                    case 18:
                        this.f20378g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f20378g);
                        break;
                    case 19:
                        this.f20380h = obtainStyledAttributes.getFloat(index, this.f20380h);
                        break;
                    case 20:
                        this.f20407y = obtainStyledAttributes.getFloat(index, this.f20407y);
                        break;
                    case 21:
                        this.f20374e = obtainStyledAttributes.getLayoutDimension(index, this.f20374e);
                        break;
                    case 22:
                        this.f20372d = obtainStyledAttributes.getLayoutDimension(index, this.f20372d);
                        break;
                    case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER /*23*/:
                        this.f20347H = obtainStyledAttributes.getDimensionPixelSize(index, this.f20347H);
                        break;
                    case BuildConfig.MIN_SDK_VERSION /*24*/:
                        this.f20384j = c.p(obtainStyledAttributes, index, this.f20384j);
                        break;
                    case 25:
                        this.f20386k = c.p(obtainStyledAttributes, index, this.f20386k);
                        break;
                    case 26:
                        this.f20346G = obtainStyledAttributes.getInt(index, this.f20346G);
                        break;
                    case 27:
                        this.f20348I = obtainStyledAttributes.getDimensionPixelSize(index, this.f20348I);
                        break;
                    case 28:
                        this.f20388l = c.p(obtainStyledAttributes, index, this.f20388l);
                        break;
                    case 29:
                        this.f20390m = c.p(obtainStyledAttributes, index, this.f20390m);
                        break;
                    case 30:
                        this.f20352M = obtainStyledAttributes.getDimensionPixelSize(index, this.f20352M);
                        break;
                    case 31:
                        this.f20403u = c.p(obtainStyledAttributes, index, this.f20403u);
                        break;
                    case 32:
                        this.f20404v = c.p(obtainStyledAttributes, index, this.f20404v);
                        break;
                    case BuildConfig.TARGET_SDK_VERSION /*33*/:
                        this.f20349J = obtainStyledAttributes.getDimensionPixelSize(index, this.f20349J);
                        break;
                    case 34:
                        this.f20394o = c.p(obtainStyledAttributes, index, this.f20394o);
                        break;
                    case ImageFormat.YUV_420_888 /*35*/:
                        this.f20392n = c.p(obtainStyledAttributes, index, this.f20392n);
                        break;
                    case 36:
                        this.f20408z = obtainStyledAttributes.getFloat(index, this.f20408z);
                        break;
                    case 37:
                        this.f20362W = obtainStyledAttributes.getFloat(index, this.f20362W);
                        break;
                    case 38:
                        this.f20361V = obtainStyledAttributes.getFloat(index, this.f20361V);
                        break;
                    case 39:
                        this.f20363X = obtainStyledAttributes.getInt(index, this.f20363X);
                        break;
                    case 40:
                        this.f20364Y = obtainStyledAttributes.getInt(index, this.f20364Y);
                        break;
                    case 41:
                        c.q(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        c.q(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i11) {
                            case 61:
                                this.f20341B = c.p(obtainStyledAttributes, index, this.f20341B);
                                break;
                            case 62:
                                this.f20342C = obtainStyledAttributes.getDimensionPixelSize(index, this.f20342C);
                                break;
                            case 63:
                                this.f20343D = obtainStyledAttributes.getFloat(index, this.f20343D);
                                break;
                            default:
                                switch (i11) {
                                    case 69:
                                        this.f20377f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f20379g0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f20381h0 = obtainStyledAttributes.getInt(index, this.f20381h0);
                                        break;
                                    case 73:
                                        this.f20383i0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f20383i0);
                                        break;
                                    case 74:
                                        this.f20389l0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f20397p0 = obtainStyledAttributes.getBoolean(index, this.f20397p0);
                                        break;
                                    case 76:
                                        this.f20399q0 = obtainStyledAttributes.getInt(index, this.f20399q0);
                                        break;
                                    case 77:
                                        this.f20401s = c.p(obtainStyledAttributes, index, this.f20401s);
                                        break;
                                    case 78:
                                        this.f20402t = c.p(obtainStyledAttributes, index, this.f20402t);
                                        break;
                                    case 79:
                                        this.f20360U = obtainStyledAttributes.getDimensionPixelSize(index, this.f20360U);
                                        break;
                                    case 80:
                                        this.f20353N = obtainStyledAttributes.getDimensionPixelSize(index, this.f20353N);
                                        break;
                                    case 81:
                                        this.f20365Z = obtainStyledAttributes.getInt(index, this.f20365Z);
                                        break;
                                    case 82:
                                        this.f20367a0 = obtainStyledAttributes.getInt(index, this.f20367a0);
                                        break;
                                    case 83:
                                        this.f20371c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f20371c0);
                                        break;
                                    case 84:
                                        this.f20369b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f20369b0);
                                        break;
                                    case 85:
                                        this.f20375e0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f20375e0);
                                        break;
                                    case 86:
                                        this.f20373d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f20373d0);
                                        break;
                                    case 87:
                                        this.f20393n0 = obtainStyledAttributes.getBoolean(index, this.f20393n0);
                                        break;
                                    case 88:
                                        this.f20395o0 = obtainStyledAttributes.getBoolean(index, this.f20395o0);
                                        break;
                                    case 89:
                                        this.f20391m0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f20382i = obtainStyledAttributes.getBoolean(index, this.f20382i);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f20339r0.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f20339r0.get(index));
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$c  reason: collision with other inner class name */
    public static class C0324c {

        /* renamed from: o  reason: collision with root package name */
        private static SparseIntArray f20409o;

        /* renamed from: a  reason: collision with root package name */
        public boolean f20410a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f20411b = -1;

        /* renamed from: c  reason: collision with root package name */
        public int f20412c = 0;

        /* renamed from: d  reason: collision with root package name */
        public String f20413d = null;

        /* renamed from: e  reason: collision with root package name */
        public int f20414e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f20415f = 0;

        /* renamed from: g  reason: collision with root package name */
        public float f20416g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public int f20417h = -1;

        /* renamed from: i  reason: collision with root package name */
        public float f20418i = Float.NaN;

        /* renamed from: j  reason: collision with root package name */
        public float f20419j = Float.NaN;

        /* renamed from: k  reason: collision with root package name */
        public int f20420k = -1;

        /* renamed from: l  reason: collision with root package name */
        public String f20421l = null;

        /* renamed from: m  reason: collision with root package name */
        public int f20422m = -3;

        /* renamed from: n  reason: collision with root package name */
        public int f20423n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f20409o = sparseIntArray;
            sparseIntArray.append(f.f20502G6, 1);
            f20409o.append(f.f20518I6, 2);
            f20409o.append(f.f20550M6, 3);
            f20409o.append(f.f20494F6, 4);
            f20409o.append(f.f20486E6, 5);
            f20409o.append(f.f20478D6, 6);
            f20409o.append(f.f20510H6, 7);
            f20409o.append(f.f20542L6, 8);
            f20409o.append(f.f20534K6, 9);
            f20409o.append(f.f20526J6, 10);
        }

        public void a(C0324c cVar) {
            this.f20410a = cVar.f20410a;
            this.f20411b = cVar.f20411b;
            this.f20413d = cVar.f20413d;
            this.f20414e = cVar.f20414e;
            this.f20415f = cVar.f20415f;
            this.f20418i = cVar.f20418i;
            this.f20416g = cVar.f20416g;
            this.f20417h = cVar.f20417h;
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f20469C6);
            this.f20410a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f20409o.get(index)) {
                    case 1:
                        this.f20418i = obtainStyledAttributes.getFloat(index, this.f20418i);
                        break;
                    case 2:
                        this.f20414e = obtainStyledAttributes.getInt(index, this.f20414e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            this.f20413d = k2.d.f25048c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        } else {
                            this.f20413d = obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 4:
                        this.f20415f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f20411b = c.p(obtainStyledAttributes, index, this.f20411b);
                        break;
                    case 6:
                        this.f20412c = obtainStyledAttributes.getInteger(index, this.f20412c);
                        break;
                    case 7:
                        this.f20416g = obtainStyledAttributes.getFloat(index, this.f20416g);
                        break;
                    case 8:
                        this.f20420k = obtainStyledAttributes.getInteger(index, this.f20420k);
                        break;
                    case 9:
                        this.f20419j = obtainStyledAttributes.getFloat(index, this.f20419j);
                        break;
                    case 10:
                        int i11 = obtainStyledAttributes.peekValue(index).type;
                        if (i11 != 1) {
                            if (i11 != 3) {
                                this.f20422m = obtainStyledAttributes.getInteger(index, this.f20423n);
                                break;
                            } else {
                                String string = obtainStyledAttributes.getString(index);
                                this.f20421l = string;
                                if (string.indexOf("/") <= 0) {
                                    this.f20422m = -1;
                                    break;
                                } else {
                                    this.f20423n = obtainStyledAttributes.getResourceId(index, -1);
                                    this.f20422m = -2;
                                    break;
                                }
                            }
                        } else {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f20423n = resourceId;
                            if (resourceId == -1) {
                                break;
                            } else {
                                this.f20422m = -2;
                                break;
                            }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f20424a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f20425b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f20426c = 0;

        /* renamed from: d  reason: collision with root package name */
        public float f20427d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f20428e = Float.NaN;

        public void a(d dVar) {
            this.f20424a = dVar.f20424a;
            this.f20425b = dVar.f20425b;
            this.f20427d = dVar.f20427d;
            this.f20428e = dVar.f20428e;
            this.f20426c = dVar.f20426c;
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f20638X6);
            this.f20424a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == f.f20654Z6) {
                    this.f20427d = obtainStyledAttributes.getFloat(index, this.f20427d);
                } else if (index == f.f20646Y6) {
                    this.f20425b = obtainStyledAttributes.getInt(index, this.f20425b);
                    this.f20425b = c.f20310g[this.f20425b];
                } else if (index == f.f20672b7) {
                    this.f20426c = obtainStyledAttributes.getInt(index, this.f20426c);
                } else if (index == f.f20663a7) {
                    this.f20428e = obtainStyledAttributes.getFloat(index, this.f20428e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class e {

        /* renamed from: o  reason: collision with root package name */
        private static SparseIntArray f20429o;

        /* renamed from: a  reason: collision with root package name */
        public boolean f20430a = false;

        /* renamed from: b  reason: collision with root package name */
        public float f20431b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f20432c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f20433d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f20434e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f20435f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f20436g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public float f20437h = Float.NaN;

        /* renamed from: i  reason: collision with root package name */
        public int f20438i = -1;

        /* renamed from: j  reason: collision with root package name */
        public float f20439j = 0.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f20440k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f20441l = 0.0f;

        /* renamed from: m  reason: collision with root package name */
        public boolean f20442m = false;

        /* renamed from: n  reason: collision with root package name */
        public float f20443n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f20429o = sparseIntArray;
            sparseIntArray.append(f.f20789o7, 1);
            f20429o.append(f.f20798p7, 2);
            f20429o.append(f.f20807q7, 3);
            f20429o.append(f.f20771m7, 4);
            f20429o.append(f.f20780n7, 5);
            f20429o.append(f.f20735i7, 6);
            f20429o.append(f.f20744j7, 7);
            f20429o.append(f.f20753k7, 8);
            f20429o.append(f.f20762l7, 9);
            f20429o.append(f.f20816r7, 10);
            f20429o.append(f.f20825s7, 11);
            f20429o.append(f.f20834t7, 12);
        }

        public void a(e eVar) {
            this.f20430a = eVar.f20430a;
            this.f20431b = eVar.f20431b;
            this.f20432c = eVar.f20432c;
            this.f20433d = eVar.f20433d;
            this.f20434e = eVar.f20434e;
            this.f20435f = eVar.f20435f;
            this.f20436g = eVar.f20436g;
            this.f20437h = eVar.f20437h;
            this.f20438i = eVar.f20438i;
            this.f20439j = eVar.f20439j;
            this.f20440k = eVar.f20440k;
            this.f20441l = eVar.f20441l;
            this.f20442m = eVar.f20442m;
            this.f20443n = eVar.f20443n;
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f20726h7);
            this.f20430a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f20429o.get(index)) {
                    case 1:
                        this.f20431b = obtainStyledAttributes.getFloat(index, this.f20431b);
                        break;
                    case 2:
                        this.f20432c = obtainStyledAttributes.getFloat(index, this.f20432c);
                        break;
                    case 3:
                        this.f20433d = obtainStyledAttributes.getFloat(index, this.f20433d);
                        break;
                    case 4:
                        this.f20434e = obtainStyledAttributes.getFloat(index, this.f20434e);
                        break;
                    case 5:
                        this.f20435f = obtainStyledAttributes.getFloat(index, this.f20435f);
                        break;
                    case 6:
                        this.f20436g = obtainStyledAttributes.getDimension(index, this.f20436g);
                        break;
                    case 7:
                        this.f20437h = obtainStyledAttributes.getDimension(index, this.f20437h);
                        break;
                    case 8:
                        this.f20439j = obtainStyledAttributes.getDimension(index, this.f20439j);
                        break;
                    case 9:
                        this.f20440k = obtainStyledAttributes.getDimension(index, this.f20440k);
                        break;
                    case 10:
                        this.f20441l = obtainStyledAttributes.getDimension(index, this.f20441l);
                        break;
                    case 11:
                        this.f20442m = true;
                        this.f20443n = obtainStyledAttributes.getDimension(index, this.f20443n);
                        break;
                    case 12:
                        this.f20438i = c.p(obtainStyledAttributes, index, this.f20438i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f20311h.append(f.f20728i0, 25);
        f20311h.append(f.f20737j0, 26);
        f20311h.append(f.f20755l0, 29);
        f20311h.append(f.f20764m0, 30);
        f20311h.append(f.f20818s0, 36);
        f20311h.append(f.f20809r0, 35);
        f20311h.append(f.f20567P, 4);
        f20311h.append(f.f20559O, 3);
        f20311h.append(f.f20527K, 1);
        f20311h.append(f.f20543M, 91);
        f20311h.append(f.f20535L, 92);
        f20311h.append(f.f20454B0, 6);
        f20311h.append(f.f20463C0, 7);
        f20311h.append(f.f20623W, 17);
        f20311h.append(f.f20631X, 18);
        f20311h.append(f.f20639Y, 19);
        f20311h.append(f.f20495G, 99);
        f20311h.append(f.f20673c, 27);
        f20311h.append(f.f20773n0, 32);
        f20311h.append(f.f20782o0, 33);
        f20311h.append(f.f20615V, 10);
        f20311h.append(f.f20607U, 9);
        f20311h.append(f.f20488F0, 13);
        f20311h.append(f.f20512I0, 16);
        f20311h.append(f.f20496G0, 14);
        f20311h.append(f.f20472D0, 11);
        f20311h.append(f.f20504H0, 15);
        f20311h.append(f.f20480E0, 12);
        f20311h.append(f.f20845v0, 40);
        f20311h.append(f.f20710g0, 39);
        f20311h.append(f.f20701f0, 41);
        f20311h.append(f.f20836u0, 42);
        f20311h.append(f.f20692e0, 20);
        f20311h.append(f.f20827t0, 37);
        f20311h.append(f.f20599T, 5);
        f20311h.append(f.f20719h0, 87);
        f20311h.append(f.f20800q0, 87);
        f20311h.append(f.f20746k0, 87);
        f20311h.append(f.f20551N, 87);
        f20311h.append(f.f20519J, 87);
        f20311h.append(f.f20718h, 24);
        f20311h.append(f.f20736j, 28);
        f20311h.append(f.f20844v, 31);
        f20311h.append(f.f20853w, 8);
        f20311h.append(f.f20727i, 34);
        f20311h.append(f.f20745k, 2);
        f20311h.append(f.f20700f, 23);
        f20311h.append(f.f20709g, 21);
        f20311h.append(f.f20854w0, 95);
        f20311h.append(f.f20647Z, 96);
        f20311h.append(f.f20691e, 22);
        f20311h.append(f.f20754l, 43);
        f20311h.append(f.f20871y, 44);
        f20311h.append(f.f20826t, 45);
        f20311h.append(f.f20835u, 46);
        f20311h.append(f.f20817s, 60);
        f20311h.append(f.f20799q, 47);
        f20311h.append(f.f20808r, 48);
        f20311h.append(f.f20763m, 49);
        f20311h.append(f.f20772n, 50);
        f20311h.append(f.f20781o, 51);
        f20311h.append(f.f20790p, 52);
        f20311h.append(f.f20862x, 53);
        f20311h.append(f.f20863x0, 54);
        f20311h.append(f.f20656a0, 55);
        f20311h.append(f.f20872y0, 56);
        f20311h.append(f.f20665b0, 57);
        f20311h.append(f.f20881z0, 58);
        f20311h.append(f.f20674c0, 59);
        f20311h.append(f.f20575Q, 61);
        f20311h.append(f.f20591S, 62);
        f20311h.append(f.f20583R, 63);
        f20311h.append(f.f20880z, 64);
        f20311h.append(f.f20592S0, 65);
        f20311h.append(f.f20487F, 66);
        f20311h.append(f.f20600T0, 67);
        f20311h.append(f.f20536L0, 79);
        f20311h.append(f.f20682d, 38);
        f20311h.append(f.f20528K0, 68);
        f20311h.append(f.f20445A0, 69);
        f20311h.append(f.f20683d0, 70);
        f20311h.append(f.f20520J0, 97);
        f20311h.append(f.f20471D, 71);
        f20311h.append(f.f20453B, 72);
        f20311h.append(f.f20462C, 73);
        f20311h.append(f.f20479E, 74);
        f20311h.append(f.f20444A, 75);
        f20311h.append(f.f20544M0, 76);
        f20311h.append(f.f20791p0, 77);
        f20311h.append(f.f20608U0, 78);
        f20311h.append(f.f20511I, 80);
        f20311h.append(f.f20503H, 81);
        f20311h.append(f.f20552N0, 82);
        f20311h.append(f.f20584R0, 83);
        f20311h.append(f.f20576Q0, 84);
        f20311h.append(f.f20568P0, 85);
        f20311h.append(f.f20560O0, 86);
        f20312i.append(f.f20643Y3, 6);
        f20312i.append(f.f20643Y3, 7);
        f20312i.append(f.f20602T2, 27);
        f20312i.append(f.f20669b4, 13);
        f20312i.append(f.f20696e4, 16);
        f20312i.append(f.f20678c4, 14);
        f20312i.append(f.f20651Z3, 11);
        f20312i.append(f.f20687d4, 15);
        f20312i.append(f.f20660a4, 12);
        f20312i.append(f.f20595S3, 40);
        f20312i.append(f.f20539L3, 39);
        f20312i.append(f.f20531K3, 41);
        f20312i.append(f.f20587R3, 42);
        f20312i.append(f.f20523J3, 20);
        f20312i.append(f.f20579Q3, 37);
        f20312i.append(f.f20475D3, 5);
        f20312i.append(f.f20547M3, 87);
        f20312i.append(f.f20571P3, 87);
        f20312i.append(f.f20555N3, 87);
        f20312i.append(f.f20448A3, 87);
        f20312i.append(f.f20884z3, 87);
        f20312i.append(f.f20642Y2, 24);
        f20312i.append(f.f20659a3, 28);
        f20312i.append(f.f20767m3, 31);
        f20312i.append(f.f20776n3, 8);
        f20312i.append(f.f20650Z2, 34);
        f20312i.append(f.f20668b3, 2);
        f20312i.append(f.f20626W2, 23);
        f20312i.append(f.f20634X2, 21);
        f20312i.append(f.f20603T3, 95);
        f20312i.append(f.f20483E3, 96);
        f20312i.append(f.f20618V2, 22);
        f20312i.append(f.f20677c3, 43);
        f20312i.append(f.f20794p3, 44);
        f20312i.append(f.f20749k3, 45);
        f20312i.append(f.f20758l3, 46);
        f20312i.append(f.f20740j3, 60);
        f20312i.append(f.f20722h3, 47);
        f20312i.append(f.f20731i3, 48);
        f20312i.append(f.f20686d3, 49);
        f20312i.append(f.f20695e3, 50);
        f20312i.append(f.f20704f3, 51);
        f20312i.append(f.f20713g3, 52);
        f20312i.append(f.f20785o3, 53);
        f20312i.append(f.f20611U3, 54);
        f20312i.append(f.f20491F3, 55);
        f20312i.append(f.f20619V3, 56);
        f20312i.append(f.f20499G3, 57);
        f20312i.append(f.f20627W3, 58);
        f20312i.append(f.f20507H3, 59);
        f20312i.append(f.f20466C3, 62);
        f20312i.append(f.f20457B3, 63);
        f20312i.append(f.f20803q3, 64);
        f20312i.append(f.f20795p4, 65);
        f20312i.append(f.f20857w3, 66);
        f20312i.append(f.f20804q4, 67);
        f20312i.append(f.f20723h4, 79);
        f20312i.append(f.f20610U2, 38);
        f20312i.append(f.f20732i4, 98);
        f20312i.append(f.f20714g4, 68);
        f20312i.append(f.f20635X3, 69);
        f20312i.append(f.f20515I3, 70);
        f20312i.append(f.f20839u3, 71);
        f20312i.append(f.f20821s3, 72);
        f20312i.append(f.f20830t3, 73);
        f20312i.append(f.f20848v3, 74);
        f20312i.append(f.f20812r3, 75);
        f20312i.append(f.f20741j4, 76);
        f20312i.append(f.f20563O3, 77);
        f20312i.append(f.f20813r4, 78);
        f20312i.append(f.f20875y3, 80);
        f20312i.append(f.f20866x3, 81);
        f20312i.append(f.f20750k4, 82);
        f20312i.append(f.f20786o4, 83);
        f20312i.append(f.f20777n4, 84);
        f20312i.append(f.f20768m4, 85);
        f20312i.append(f.f20759l4, 86);
        f20312i.append(f.f20705f4, 97);
    }

    private int[] k(View view, String str) {
        int i10;
        Object l10;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i11 = 0;
        int i12 = 0;
        while (i11 < split.length) {
            String trim = split[i11].trim();
            try {
                i10 = e.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i10 = 0;
            }
            if (i10 == 0) {
                i10 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i10 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (l10 = ((ConstraintLayout) view.getParent()).l(0, trim)) != null && (l10 instanceof Integer)) {
                i10 = ((Integer) l10).intValue();
            }
            iArr[i12] = i10;
            i11++;
            i12++;
        }
        return i12 != split.length ? Arrays.copyOf(iArr, i12) : iArr;
    }

    private a l(Context context, AttributeSet attributeSet, boolean z10) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? f.f20594S2 : f.f20664b);
        t(aVar, obtainStyledAttributes, z10);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    private a m(int i10) {
        if (!this.f20318f.containsKey(Integer.valueOf(i10))) {
            this.f20318f.put(Integer.valueOf(i10), new a());
        }
        return this.f20318f.get(Integer.valueOf(i10));
    }

    /* access modifiers changed from: private */
    public static int p(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void q(java.lang.Object r4, android.content.res.TypedArray r5, int r6, int r7) {
        /*
            if (r4 != 0) goto L_0x0003
            return
        L_0x0003:
            android.util.TypedValue r0 = r5.peekValue(r6)
            int r0 = r0.type
            r1 = 3
            if (r0 == r1) goto L_0x0071
            r1 = 5
            r2 = 0
            if (r0 == r1) goto L_0x002a
            int r5 = r5.getInt(r6, r2)
            r6 = -4
            r0 = -2
            if (r5 == r6) goto L_0x0026
            r6 = -3
            if (r5 == r6) goto L_0x0020
            if (r5 == r0) goto L_0x0022
            r6 = -1
            if (r5 == r6) goto L_0x0022
        L_0x0020:
            r5 = r2
            goto L_0x002f
        L_0x0022:
            r3 = r2
            r2 = r5
            r5 = r3
            goto L_0x002f
        L_0x0026:
            r2 = 1
            r5 = r2
            r2 = r0
            goto L_0x002f
        L_0x002a:
            int r5 = r5.getDimensionPixelSize(r6, r2)
            goto L_0x0022
        L_0x002f:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.ConstraintLayout.b
            if (r6 == 0) goto L_0x0041
            androidx.constraintlayout.widget.ConstraintLayout$b r4 = (androidx.constraintlayout.widget.ConstraintLayout.b) r4
            if (r7 != 0) goto L_0x003c
            r4.width = r2
            r4.f20209a0 = r5
            goto L_0x0070
        L_0x003c:
            r4.height = r2
            r4.f20211b0 = r5
            goto L_0x0070
        L_0x0041:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.c.b
            if (r6 == 0) goto L_0x0053
            androidx.constraintlayout.widget.c$b r4 = (androidx.constraintlayout.widget.c.b) r4
            if (r7 != 0) goto L_0x004e
            r4.f20372d = r2
            r4.f20393n0 = r5
            goto L_0x0070
        L_0x004e:
            r4.f20374e = r2
            r4.f20395o0 = r5
            goto L_0x0070
        L_0x0053:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.c.a.C0323a
            if (r6 == 0) goto L_0x0070
            androidx.constraintlayout.widget.c$a$a r4 = (androidx.constraintlayout.widget.c.a.C0323a) r4
            if (r7 != 0) goto L_0x0066
            r6 = 23
            r4.b(r6, r2)
            r6 = 80
            r4.d(r6, r5)
            goto L_0x0070
        L_0x0066:
            r6 = 21
            r4.b(r6, r2)
            r6 = 81
            r4.d(r6, r5)
        L_0x0070:
            return
        L_0x0071:
            java.lang.String r5 = r5.getString(r6)
            r(r4, r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.c.q(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    static void r(Object obj, String str, int i10) {
        if (str != null) {
            int indexOf = str.indexOf(61);
            int length = str.length();
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                String substring2 = str.substring(indexOf + 1);
                if (substring2.length() > 0) {
                    String trim = substring.trim();
                    String trim2 = substring2.trim();
                    if ("ratio".equalsIgnoreCase(trim)) {
                        if (obj instanceof ConstraintLayout.b) {
                            ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                            if (i10 == 0) {
                                bVar.width = 0;
                            } else {
                                bVar.height = 0;
                            }
                            s(bVar, trim2);
                        } else if (obj instanceof b) {
                            ((b) obj).f20340A = trim2;
                        } else if (obj instanceof a.C0323a) {
                            ((a.C0323a) obj).c(5, trim2);
                        }
                    } else if ("weight".equalsIgnoreCase(trim)) {
                        try {
                            float parseFloat = Float.parseFloat(trim2);
                            if (obj instanceof ConstraintLayout.b) {
                                ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                                if (i10 == 0) {
                                    bVar2.width = 0;
                                    bVar2.f20193L = parseFloat;
                                    return;
                                }
                                bVar2.height = 0;
                                bVar2.f20194M = parseFloat;
                            } else if (obj instanceof b) {
                                b bVar3 = (b) obj;
                                if (i10 == 0) {
                                    bVar3.f20372d = 0;
                                    bVar3.f20362W = parseFloat;
                                    return;
                                }
                                bVar3.f20374e = 0;
                                bVar3.f20361V = parseFloat;
                            } else if (obj instanceof a.C0323a) {
                                a.C0323a aVar = (a.C0323a) obj;
                                if (i10 == 0) {
                                    aVar.b(23, 0);
                                    aVar.a(39, parseFloat);
                                    return;
                                }
                                aVar.b(21, 0);
                                aVar.a(40, parseFloat);
                            }
                        } catch (NumberFormatException unused) {
                        }
                    } else if ("parent".equalsIgnoreCase(trim)) {
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof ConstraintLayout.b) {
                            ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                            if (i10 == 0) {
                                bVar4.width = 0;
                                bVar4.f20203V = max;
                                bVar4.f20197P = 2;
                                return;
                            }
                            bVar4.height = 0;
                            bVar4.f20204W = max;
                            bVar4.f20198Q = 2;
                        } else if (obj instanceof b) {
                            b bVar5 = (b) obj;
                            if (i10 == 0) {
                                bVar5.f20372d = 0;
                                bVar5.f20377f0 = max;
                                bVar5.f20365Z = 2;
                                return;
                            }
                            bVar5.f20374e = 0;
                            bVar5.f20379g0 = max;
                            bVar5.f20367a0 = 2;
                        } else if (obj instanceof a.C0323a) {
                            a.C0323a aVar2 = (a.C0323a) obj;
                            if (i10 == 0) {
                                aVar2.b(23, 0);
                                aVar2.b(54, 2);
                                return;
                            }
                            aVar2.b(21, 0);
                            aVar2.b(55, 2);
                        }
                    }
                }
            }
        }
    }

    static void s(ConstraintLayout.b bVar, String str) {
        float f10 = Float.NaN;
        int i10 = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i11 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i10 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i10 = 1;
                }
                i11 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - 1) {
                String substring2 = str.substring(i11);
                if (substring2.length() > 0) {
                    f10 = Float.parseFloat(substring2);
                }
            } else {
                String substring3 = str.substring(i11, indexOf2);
                String substring4 = str.substring(indexOf2 + 1);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    try {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            f10 = i10 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        bVar.f20190I = str;
        bVar.f20191J = f10;
        bVar.f20192K = i10;
    }

    private void t(a aVar, TypedArray typedArray, boolean z10) {
        if (z10) {
            u(aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (!(index == f.f20682d || f.f20844v == index || f.f20853w == index)) {
                aVar.f20322d.f20410a = true;
                aVar.f20323e.f20368b = true;
                aVar.f20321c.f20424a = true;
                aVar.f20324f.f20430a = true;
            }
            switch (f20311h.get(index)) {
                case 1:
                    b bVar = aVar.f20323e;
                    bVar.f20400r = p(typedArray, index, bVar.f20400r);
                    break;
                case 2:
                    b bVar2 = aVar.f20323e;
                    bVar2.f20350K = typedArray.getDimensionPixelSize(index, bVar2.f20350K);
                    break;
                case 3:
                    b bVar3 = aVar.f20323e;
                    bVar3.f20398q = p(typedArray, index, bVar3.f20398q);
                    break;
                case 4:
                    b bVar4 = aVar.f20323e;
                    bVar4.f20396p = p(typedArray, index, bVar4.f20396p);
                    break;
                case 5:
                    aVar.f20323e.f20340A = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f20323e;
                    bVar5.f20344E = typedArray.getDimensionPixelOffset(index, bVar5.f20344E);
                    break;
                case 7:
                    b bVar6 = aVar.f20323e;
                    bVar6.f20345F = typedArray.getDimensionPixelOffset(index, bVar6.f20345F);
                    break;
                case 8:
                    b bVar7 = aVar.f20323e;
                    bVar7.f20351L = typedArray.getDimensionPixelSize(index, bVar7.f20351L);
                    break;
                case 9:
                    b bVar8 = aVar.f20323e;
                    bVar8.f20406x = p(typedArray, index, bVar8.f20406x);
                    break;
                case 10:
                    b bVar9 = aVar.f20323e;
                    bVar9.f20405w = p(typedArray, index, bVar9.f20405w);
                    break;
                case 11:
                    b bVar10 = aVar.f20323e;
                    bVar10.f20357R = typedArray.getDimensionPixelSize(index, bVar10.f20357R);
                    break;
                case 12:
                    b bVar11 = aVar.f20323e;
                    bVar11.f20358S = typedArray.getDimensionPixelSize(index, bVar11.f20358S);
                    break;
                case 13:
                    b bVar12 = aVar.f20323e;
                    bVar12.f20354O = typedArray.getDimensionPixelSize(index, bVar12.f20354O);
                    break;
                case 14:
                    b bVar13 = aVar.f20323e;
                    bVar13.f20356Q = typedArray.getDimensionPixelSize(index, bVar13.f20356Q);
                    break;
                case 15:
                    b bVar14 = aVar.f20323e;
                    bVar14.f20359T = typedArray.getDimensionPixelSize(index, bVar14.f20359T);
                    break;
                case 16:
                    b bVar15 = aVar.f20323e;
                    bVar15.f20355P = typedArray.getDimensionPixelSize(index, bVar15.f20355P);
                    break;
                case 17:
                    b bVar16 = aVar.f20323e;
                    bVar16.f20376f = typedArray.getDimensionPixelOffset(index, bVar16.f20376f);
                    break;
                case 18:
                    b bVar17 = aVar.f20323e;
                    bVar17.f20378g = typedArray.getDimensionPixelOffset(index, bVar17.f20378g);
                    break;
                case 19:
                    b bVar18 = aVar.f20323e;
                    bVar18.f20380h = typedArray.getFloat(index, bVar18.f20380h);
                    break;
                case 20:
                    b bVar19 = aVar.f20323e;
                    bVar19.f20407y = typedArray.getFloat(index, bVar19.f20407y);
                    break;
                case 21:
                    b bVar20 = aVar.f20323e;
                    bVar20.f20374e = typedArray.getLayoutDimension(index, bVar20.f20374e);
                    break;
                case 22:
                    d dVar = aVar.f20321c;
                    dVar.f20425b = typedArray.getInt(index, dVar.f20425b);
                    d dVar2 = aVar.f20321c;
                    dVar2.f20425b = f20310g[dVar2.f20425b];
                    break;
                case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER /*23*/:
                    b bVar21 = aVar.f20323e;
                    bVar21.f20372d = typedArray.getLayoutDimension(index, bVar21.f20372d);
                    break;
                case BuildConfig.MIN_SDK_VERSION /*24*/:
                    b bVar22 = aVar.f20323e;
                    bVar22.f20347H = typedArray.getDimensionPixelSize(index, bVar22.f20347H);
                    break;
                case 25:
                    b bVar23 = aVar.f20323e;
                    bVar23.f20384j = p(typedArray, index, bVar23.f20384j);
                    break;
                case 26:
                    b bVar24 = aVar.f20323e;
                    bVar24.f20386k = p(typedArray, index, bVar24.f20386k);
                    break;
                case 27:
                    b bVar25 = aVar.f20323e;
                    bVar25.f20346G = typedArray.getInt(index, bVar25.f20346G);
                    break;
                case 28:
                    b bVar26 = aVar.f20323e;
                    bVar26.f20348I = typedArray.getDimensionPixelSize(index, bVar26.f20348I);
                    break;
                case 29:
                    b bVar27 = aVar.f20323e;
                    bVar27.f20388l = p(typedArray, index, bVar27.f20388l);
                    break;
                case 30:
                    b bVar28 = aVar.f20323e;
                    bVar28.f20390m = p(typedArray, index, bVar28.f20390m);
                    break;
                case 31:
                    b bVar29 = aVar.f20323e;
                    bVar29.f20352M = typedArray.getDimensionPixelSize(index, bVar29.f20352M);
                    break;
                case 32:
                    b bVar30 = aVar.f20323e;
                    bVar30.f20403u = p(typedArray, index, bVar30.f20403u);
                    break;
                case BuildConfig.TARGET_SDK_VERSION /*33*/:
                    b bVar31 = aVar.f20323e;
                    bVar31.f20404v = p(typedArray, index, bVar31.f20404v);
                    break;
                case 34:
                    b bVar32 = aVar.f20323e;
                    bVar32.f20349J = typedArray.getDimensionPixelSize(index, bVar32.f20349J);
                    break;
                case ImageFormat.YUV_420_888 /*35*/:
                    b bVar33 = aVar.f20323e;
                    bVar33.f20394o = p(typedArray, index, bVar33.f20394o);
                    break;
                case 36:
                    b bVar34 = aVar.f20323e;
                    bVar34.f20392n = p(typedArray, index, bVar34.f20392n);
                    break;
                case 37:
                    b bVar35 = aVar.f20323e;
                    bVar35.f20408z = typedArray.getFloat(index, bVar35.f20408z);
                    break;
                case 38:
                    aVar.f20319a = typedArray.getResourceId(index, aVar.f20319a);
                    break;
                case 39:
                    b bVar36 = aVar.f20323e;
                    bVar36.f20362W = typedArray.getFloat(index, bVar36.f20362W);
                    break;
                case 40:
                    b bVar37 = aVar.f20323e;
                    bVar37.f20361V = typedArray.getFloat(index, bVar37.f20361V);
                    break;
                case 41:
                    b bVar38 = aVar.f20323e;
                    bVar38.f20363X = typedArray.getInt(index, bVar38.f20363X);
                    break;
                case 42:
                    b bVar39 = aVar.f20323e;
                    bVar39.f20364Y = typedArray.getInt(index, bVar39.f20364Y);
                    break;
                case 43:
                    d dVar3 = aVar.f20321c;
                    dVar3.f20427d = typedArray.getFloat(index, dVar3.f20427d);
                    break;
                case 44:
                    e eVar = aVar.f20324f;
                    eVar.f20442m = true;
                    eVar.f20443n = typedArray.getDimension(index, eVar.f20443n);
                    break;
                case 45:
                    e eVar2 = aVar.f20324f;
                    eVar2.f20432c = typedArray.getFloat(index, eVar2.f20432c);
                    break;
                case 46:
                    e eVar3 = aVar.f20324f;
                    eVar3.f20433d = typedArray.getFloat(index, eVar3.f20433d);
                    break;
                case 47:
                    e eVar4 = aVar.f20324f;
                    eVar4.f20434e = typedArray.getFloat(index, eVar4.f20434e);
                    break;
                case 48:
                    e eVar5 = aVar.f20324f;
                    eVar5.f20435f = typedArray.getFloat(index, eVar5.f20435f);
                    break;
                case 49:
                    e eVar6 = aVar.f20324f;
                    eVar6.f20436g = typedArray.getDimension(index, eVar6.f20436g);
                    break;
                case 50:
                    e eVar7 = aVar.f20324f;
                    eVar7.f20437h = typedArray.getDimension(index, eVar7.f20437h);
                    break;
                case 51:
                    e eVar8 = aVar.f20324f;
                    eVar8.f20439j = typedArray.getDimension(index, eVar8.f20439j);
                    break;
                case 52:
                    e eVar9 = aVar.f20324f;
                    eVar9.f20440k = typedArray.getDimension(index, eVar9.f20440k);
                    break;
                case 53:
                    e eVar10 = aVar.f20324f;
                    eVar10.f20441l = typedArray.getDimension(index, eVar10.f20441l);
                    break;
                case 54:
                    b bVar40 = aVar.f20323e;
                    bVar40.f20365Z = typedArray.getInt(index, bVar40.f20365Z);
                    break;
                case 55:
                    b bVar41 = aVar.f20323e;
                    bVar41.f20367a0 = typedArray.getInt(index, bVar41.f20367a0);
                    break;
                case 56:
                    b bVar42 = aVar.f20323e;
                    bVar42.f20369b0 = typedArray.getDimensionPixelSize(index, bVar42.f20369b0);
                    break;
                case 57:
                    b bVar43 = aVar.f20323e;
                    bVar43.f20371c0 = typedArray.getDimensionPixelSize(index, bVar43.f20371c0);
                    break;
                case 58:
                    b bVar44 = aVar.f20323e;
                    bVar44.f20373d0 = typedArray.getDimensionPixelSize(index, bVar44.f20373d0);
                    break;
                case 59:
                    b bVar45 = aVar.f20323e;
                    bVar45.f20375e0 = typedArray.getDimensionPixelSize(index, bVar45.f20375e0);
                    break;
                case 60:
                    e eVar11 = aVar.f20324f;
                    eVar11.f20431b = typedArray.getFloat(index, eVar11.f20431b);
                    break;
                case 61:
                    b bVar46 = aVar.f20323e;
                    bVar46.f20341B = p(typedArray, index, bVar46.f20341B);
                    break;
                case 62:
                    b bVar47 = aVar.f20323e;
                    bVar47.f20342C = typedArray.getDimensionPixelSize(index, bVar47.f20342C);
                    break;
                case 63:
                    b bVar48 = aVar.f20323e;
                    bVar48.f20343D = typedArray.getFloat(index, bVar48.f20343D);
                    break;
                case 64:
                    C0324c cVar = aVar.f20322d;
                    cVar.f20411b = p(typedArray, index, cVar.f20411b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type != 3) {
                        aVar.f20322d.f20413d = k2.d.f25048c[typedArray.getInteger(index, 0)];
                        break;
                    } else {
                        aVar.f20322d.f20413d = typedArray.getString(index);
                        break;
                    }
                case 66:
                    aVar.f20322d.f20415f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    C0324c cVar2 = aVar.f20322d;
                    cVar2.f20418i = typedArray.getFloat(index, cVar2.f20418i);
                    break;
                case 68:
                    d dVar4 = aVar.f20321c;
                    dVar4.f20428e = typedArray.getFloat(index, dVar4.f20428e);
                    break;
                case 69:
                    aVar.f20323e.f20377f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f20323e.f20379g0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f20323e;
                    bVar49.f20381h0 = typedArray.getInt(index, bVar49.f20381h0);
                    break;
                case 73:
                    b bVar50 = aVar.f20323e;
                    bVar50.f20383i0 = typedArray.getDimensionPixelSize(index, bVar50.f20383i0);
                    break;
                case 74:
                    aVar.f20323e.f20389l0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f20323e;
                    bVar51.f20397p0 = typedArray.getBoolean(index, bVar51.f20397p0);
                    break;
                case 76:
                    C0324c cVar3 = aVar.f20322d;
                    cVar3.f20414e = typedArray.getInt(index, cVar3.f20414e);
                    break;
                case 77:
                    aVar.f20323e.f20391m0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f20321c;
                    dVar5.f20426c = typedArray.getInt(index, dVar5.f20426c);
                    break;
                case 79:
                    C0324c cVar4 = aVar.f20322d;
                    cVar4.f20416g = typedArray.getFloat(index, cVar4.f20416g);
                    break;
                case 80:
                    b bVar52 = aVar.f20323e;
                    bVar52.f20393n0 = typedArray.getBoolean(index, bVar52.f20393n0);
                    break;
                case 81:
                    b bVar53 = aVar.f20323e;
                    bVar53.f20395o0 = typedArray.getBoolean(index, bVar53.f20395o0);
                    break;
                case 82:
                    C0324c cVar5 = aVar.f20322d;
                    cVar5.f20412c = typedArray.getInteger(index, cVar5.f20412c);
                    break;
                case 83:
                    e eVar12 = aVar.f20324f;
                    eVar12.f20438i = p(typedArray, index, eVar12.f20438i);
                    break;
                case 84:
                    C0324c cVar6 = aVar.f20322d;
                    cVar6.f20420k = typedArray.getInteger(index, cVar6.f20420k);
                    break;
                case 85:
                    C0324c cVar7 = aVar.f20322d;
                    cVar7.f20419j = typedArray.getFloat(index, cVar7.f20419j);
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 != 1) {
                        if (i11 != 3) {
                            C0324c cVar8 = aVar.f20322d;
                            cVar8.f20422m = typedArray.getInteger(index, cVar8.f20423n);
                            break;
                        } else {
                            aVar.f20322d.f20421l = typedArray.getString(index);
                            if (aVar.f20322d.f20421l.indexOf("/") <= 0) {
                                aVar.f20322d.f20422m = -1;
                                break;
                            } else {
                                aVar.f20322d.f20423n = typedArray.getResourceId(index, -1);
                                aVar.f20322d.f20422m = -2;
                                break;
                            }
                        }
                    } else {
                        aVar.f20322d.f20423n = typedArray.getResourceId(index, -1);
                        C0324c cVar9 = aVar.f20322d;
                        if (cVar9.f20423n == -1) {
                            break;
                        } else {
                            cVar9.f20422m = -2;
                            break;
                        }
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f20311h.get(index));
                    break;
                case 91:
                    b bVar54 = aVar.f20323e;
                    bVar54.f20401s = p(typedArray, index, bVar54.f20401s);
                    break;
                case 92:
                    b bVar55 = aVar.f20323e;
                    bVar55.f20402t = p(typedArray, index, bVar55.f20402t);
                    break;
                case 93:
                    b bVar56 = aVar.f20323e;
                    bVar56.f20353N = typedArray.getDimensionPixelSize(index, bVar56.f20353N);
                    break;
                case 94:
                    b bVar57 = aVar.f20323e;
                    bVar57.f20360U = typedArray.getDimensionPixelSize(index, bVar57.f20360U);
                    break;
                case 95:
                    q(aVar.f20323e, typedArray, index, 0);
                    break;
                case 96:
                    q(aVar.f20323e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.f20323e;
                    bVar58.f20399q0 = typedArray.getInt(index, bVar58.f20399q0);
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f20311h.get(index));
                    break;
            }
        }
        b bVar59 = aVar.f20323e;
        if (bVar59.f20389l0 != null) {
            bVar59.f20387k0 = null;
        }
    }

    private static void u(a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0323a aVar2 = new a.C0323a();
        aVar.f20326h = aVar2;
        aVar.f20322d.f20410a = false;
        aVar.f20323e.f20368b = false;
        aVar.f20321c.f20424a = false;
        aVar.f20324f.f20430a = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            switch (f20312i.get(index)) {
                case 2:
                    aVar2.b(2, typedArray.getDimensionPixelSize(index, aVar.f20323e.f20350K));
                    break;
                case 5:
                    aVar2.c(5, typedArray.getString(index));
                    break;
                case 6:
                    aVar2.b(6, typedArray.getDimensionPixelOffset(index, aVar.f20323e.f20344E));
                    break;
                case 7:
                    aVar2.b(7, typedArray.getDimensionPixelOffset(index, aVar.f20323e.f20345F));
                    break;
                case 8:
                    aVar2.b(8, typedArray.getDimensionPixelSize(index, aVar.f20323e.f20351L));
                    break;
                case 11:
                    aVar2.b(11, typedArray.getDimensionPixelSize(index, aVar.f20323e.f20357R));
                    break;
                case 12:
                    aVar2.b(12, typedArray.getDimensionPixelSize(index, aVar.f20323e.f20358S));
                    break;
                case 13:
                    aVar2.b(13, typedArray.getDimensionPixelSize(index, aVar.f20323e.f20354O));
                    break;
                case 14:
                    aVar2.b(14, typedArray.getDimensionPixelSize(index, aVar.f20323e.f20356Q));
                    break;
                case 15:
                    aVar2.b(15, typedArray.getDimensionPixelSize(index, aVar.f20323e.f20359T));
                    break;
                case 16:
                    aVar2.b(16, typedArray.getDimensionPixelSize(index, aVar.f20323e.f20355P));
                    break;
                case 17:
                    aVar2.b(17, typedArray.getDimensionPixelOffset(index, aVar.f20323e.f20376f));
                    break;
                case 18:
                    aVar2.b(18, typedArray.getDimensionPixelOffset(index, aVar.f20323e.f20378g));
                    break;
                case 19:
                    aVar2.a(19, typedArray.getFloat(index, aVar.f20323e.f20380h));
                    break;
                case 20:
                    aVar2.a(20, typedArray.getFloat(index, aVar.f20323e.f20407y));
                    break;
                case 21:
                    aVar2.b(21, typedArray.getLayoutDimension(index, aVar.f20323e.f20374e));
                    break;
                case 22:
                    aVar2.b(22, f20310g[typedArray.getInt(index, aVar.f20321c.f20425b)]);
                    break;
                case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER /*23*/:
                    aVar2.b(23, typedArray.getLayoutDimension(index, aVar.f20323e.f20372d));
                    break;
                case BuildConfig.MIN_SDK_VERSION /*24*/:
                    aVar2.b(24, typedArray.getDimensionPixelSize(index, aVar.f20323e.f20347H));
                    break;
                case 27:
                    aVar2.b(27, typedArray.getInt(index, aVar.f20323e.f20346G));
                    break;
                case 28:
                    aVar2.b(28, typedArray.getDimensionPixelSize(index, aVar.f20323e.f20348I));
                    break;
                case 31:
                    aVar2.b(31, typedArray.getDimensionPixelSize(index, aVar.f20323e.f20352M));
                    break;
                case 34:
                    aVar2.b(34, typedArray.getDimensionPixelSize(index, aVar.f20323e.f20349J));
                    break;
                case 37:
                    aVar2.a(37, typedArray.getFloat(index, aVar.f20323e.f20408z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f20319a);
                    aVar.f20319a = resourceId;
                    aVar2.b(38, resourceId);
                    break;
                case 39:
                    aVar2.a(39, typedArray.getFloat(index, aVar.f20323e.f20362W));
                    break;
                case 40:
                    aVar2.a(40, typedArray.getFloat(index, aVar.f20323e.f20361V));
                    break;
                case 41:
                    aVar2.b(41, typedArray.getInt(index, aVar.f20323e.f20363X));
                    break;
                case 42:
                    aVar2.b(42, typedArray.getInt(index, aVar.f20323e.f20364Y));
                    break;
                case 43:
                    aVar2.a(43, typedArray.getFloat(index, aVar.f20321c.f20427d));
                    break;
                case 44:
                    aVar2.d(44, true);
                    aVar2.a(44, typedArray.getDimension(index, aVar.f20324f.f20443n));
                    break;
                case 45:
                    aVar2.a(45, typedArray.getFloat(index, aVar.f20324f.f20432c));
                    break;
                case 46:
                    aVar2.a(46, typedArray.getFloat(index, aVar.f20324f.f20433d));
                    break;
                case 47:
                    aVar2.a(47, typedArray.getFloat(index, aVar.f20324f.f20434e));
                    break;
                case 48:
                    aVar2.a(48, typedArray.getFloat(index, aVar.f20324f.f20435f));
                    break;
                case 49:
                    aVar2.a(49, typedArray.getDimension(index, aVar.f20324f.f20436g));
                    break;
                case 50:
                    aVar2.a(50, typedArray.getDimension(index, aVar.f20324f.f20437h));
                    break;
                case 51:
                    aVar2.a(51, typedArray.getDimension(index, aVar.f20324f.f20439j));
                    break;
                case 52:
                    aVar2.a(52, typedArray.getDimension(index, aVar.f20324f.f20440k));
                    break;
                case 53:
                    aVar2.a(53, typedArray.getDimension(index, aVar.f20324f.f20441l));
                    break;
                case 54:
                    aVar2.b(54, typedArray.getInt(index, aVar.f20323e.f20365Z));
                    break;
                case 55:
                    aVar2.b(55, typedArray.getInt(index, aVar.f20323e.f20367a0));
                    break;
                case 56:
                    aVar2.b(56, typedArray.getDimensionPixelSize(index, aVar.f20323e.f20369b0));
                    break;
                case 57:
                    aVar2.b(57, typedArray.getDimensionPixelSize(index, aVar.f20323e.f20371c0));
                    break;
                case 58:
                    aVar2.b(58, typedArray.getDimensionPixelSize(index, aVar.f20323e.f20373d0));
                    break;
                case 59:
                    aVar2.b(59, typedArray.getDimensionPixelSize(index, aVar.f20323e.f20375e0));
                    break;
                case 60:
                    aVar2.a(60, typedArray.getFloat(index, aVar.f20324f.f20431b));
                    break;
                case 62:
                    aVar2.b(62, typedArray.getDimensionPixelSize(index, aVar.f20323e.f20342C));
                    break;
                case 63:
                    aVar2.a(63, typedArray.getFloat(index, aVar.f20323e.f20343D));
                    break;
                case 64:
                    aVar2.b(64, p(typedArray, index, aVar.f20322d.f20411b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type != 3) {
                        aVar2.c(65, k2.d.f25048c[typedArray.getInteger(index, 0)]);
                        break;
                    } else {
                        aVar2.c(65, typedArray.getString(index));
                        break;
                    }
                case 66:
                    aVar2.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    aVar2.a(67, typedArray.getFloat(index, aVar.f20322d.f20418i));
                    break;
                case 68:
                    aVar2.a(68, typedArray.getFloat(index, aVar.f20321c.f20428e));
                    break;
                case 69:
                    aVar2.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    aVar2.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    aVar2.b(72, typedArray.getInt(index, aVar.f20323e.f20381h0));
                    break;
                case 73:
                    aVar2.b(73, typedArray.getDimensionPixelSize(index, aVar.f20323e.f20383i0));
                    break;
                case 74:
                    aVar2.c(74, typedArray.getString(index));
                    break;
                case 75:
                    aVar2.d(75, typedArray.getBoolean(index, aVar.f20323e.f20397p0));
                    break;
                case 76:
                    aVar2.b(76, typedArray.getInt(index, aVar.f20322d.f20414e));
                    break;
                case 77:
                    aVar2.c(77, typedArray.getString(index));
                    break;
                case 78:
                    aVar2.b(78, typedArray.getInt(index, aVar.f20321c.f20426c));
                    break;
                case 79:
                    aVar2.a(79, typedArray.getFloat(index, aVar.f20322d.f20416g));
                    break;
                case 80:
                    aVar2.d(80, typedArray.getBoolean(index, aVar.f20323e.f20393n0));
                    break;
                case 81:
                    aVar2.d(81, typedArray.getBoolean(index, aVar.f20323e.f20395o0));
                    break;
                case 82:
                    aVar2.b(82, typedArray.getInteger(index, aVar.f20322d.f20412c));
                    break;
                case 83:
                    aVar2.b(83, p(typedArray, index, aVar.f20324f.f20438i));
                    break;
                case 84:
                    aVar2.b(84, typedArray.getInteger(index, aVar.f20322d.f20420k));
                    break;
                case 85:
                    aVar2.a(85, typedArray.getFloat(index, aVar.f20322d.f20419j));
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 != 1) {
                        if (i11 != 3) {
                            C0324c cVar = aVar.f20322d;
                            cVar.f20422m = typedArray.getInteger(index, cVar.f20423n);
                            aVar2.b(88, aVar.f20322d.f20422m);
                            break;
                        } else {
                            aVar.f20322d.f20421l = typedArray.getString(index);
                            aVar2.c(90, aVar.f20322d.f20421l);
                            if (aVar.f20322d.f20421l.indexOf("/") <= 0) {
                                aVar.f20322d.f20422m = -1;
                                aVar2.b(88, -1);
                                break;
                            } else {
                                aVar.f20322d.f20423n = typedArray.getResourceId(index, -1);
                                aVar2.b(89, aVar.f20322d.f20423n);
                                aVar.f20322d.f20422m = -2;
                                aVar2.b(88, -2);
                                break;
                            }
                        }
                    } else {
                        aVar.f20322d.f20423n = typedArray.getResourceId(index, -1);
                        aVar2.b(89, aVar.f20322d.f20423n);
                        C0324c cVar2 = aVar.f20322d;
                        if (cVar2.f20423n == -1) {
                            break;
                        } else {
                            cVar2.f20422m = -2;
                            aVar2.b(88, -2);
                            break;
                        }
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f20311h.get(index));
                    break;
                case 93:
                    aVar2.b(93, typedArray.getDimensionPixelSize(index, aVar.f20323e.f20353N));
                    break;
                case 94:
                    aVar2.b(94, typedArray.getDimensionPixelSize(index, aVar.f20323e.f20360U));
                    break;
                case 95:
                    q(aVar2, typedArray, index, 0);
                    break;
                case 96:
                    q(aVar2, typedArray, index, 1);
                    break;
                case 97:
                    aVar2.b(97, typedArray.getInt(index, aVar.f20323e.f20399q0));
                    break;
                case 98:
                    if (!MotionLayout.f20008W0) {
                        if (typedArray.peekValue(index).type != 3) {
                            aVar.f20319a = typedArray.getResourceId(index, aVar.f20319a);
                            break;
                        } else {
                            aVar.f20320b = typedArray.getString(index);
                            break;
                        }
                    } else {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f20319a);
                        aVar.f20319a = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            aVar.f20320b = typedArray.getString(index);
                            break;
                        }
                    }
                case Logger.NONE /*99*/:
                    aVar2.d(99, typedArray.getBoolean(index, aVar.f20323e.f20382i));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f20311h.get(index));
                    break;
            }
        }
    }

    private String x(int i10) {
        switch (i10) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet((c) null);
        constraintLayout.requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void d(ConstraintLayout constraintLayout, boolean z10) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f20318f.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f20318f.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + androidx.constraintlayout.motion.widget.a.b(childAt));
            } else if (this.f20317e && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id2 != -1) {
                if (this.f20318f.containsKey(Integer.valueOf(id2))) {
                    hashSet.remove(Integer.valueOf(id2));
                    a aVar = this.f20318f.get(Integer.valueOf(id2));
                    if (aVar != null) {
                        if (childAt instanceof Barrier) {
                            aVar.f20323e.f20385j0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id2);
                            barrier.setType(aVar.f20323e.f20381h0);
                            barrier.setMargin(aVar.f20323e.f20383i0);
                            barrier.setAllowsGoneWidget(aVar.f20323e.f20397p0);
                            b bVar = aVar.f20323e;
                            int[] iArr = bVar.f20387k0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f20389l0;
                                if (str != null) {
                                    bVar.f20387k0 = k(barrier, str);
                                    barrier.setReferencedIds(aVar.f20323e.f20387k0);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.a();
                        aVar.d(bVar2);
                        if (z10) {
                            a.e(childAt, aVar.f20325g);
                        }
                        childAt.setLayoutParams(bVar2);
                        d dVar = aVar.f20321c;
                        if (dVar.f20426c == 0) {
                            childAt.setVisibility(dVar.f20425b);
                        }
                        childAt.setAlpha(aVar.f20321c.f20427d);
                        childAt.setRotation(aVar.f20324f.f20431b);
                        childAt.setRotationX(aVar.f20324f.f20432c);
                        childAt.setRotationY(aVar.f20324f.f20433d);
                        childAt.setScaleX(aVar.f20324f.f20434e);
                        childAt.setScaleY(aVar.f20324f.f20435f);
                        e eVar = aVar.f20324f;
                        if (eVar.f20438i != -1) {
                            View findViewById = ((View) childAt.getParent()).findViewById(aVar.f20324f.f20438i);
                            if (findViewById != null) {
                                float top = ((float) (findViewById.getTop() + findViewById.getBottom())) / 2.0f;
                                float left = ((float) (findViewById.getLeft() + findViewById.getRight())) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(left - ((float) childAt.getLeft()));
                                    childAt.setPivotY(top - ((float) childAt.getTop()));
                                }
                            }
                        } else {
                            if (!Float.isNaN(eVar.f20436g)) {
                                childAt.setPivotX(aVar.f20324f.f20436g);
                            }
                            if (!Float.isNaN(aVar.f20324f.f20437h)) {
                                childAt.setPivotY(aVar.f20324f.f20437h);
                            }
                        }
                        childAt.setTranslationX(aVar.f20324f.f20439j);
                        childAt.setTranslationY(aVar.f20324f.f20440k);
                        childAt.setTranslationZ(aVar.f20324f.f20441l);
                        e eVar2 = aVar.f20324f;
                        if (eVar2.f20442m) {
                            childAt.setElevation(eVar2.f20443n);
                        }
                    }
                } else {
                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = this.f20318f.get(num);
            if (aVar2 != null) {
                if (aVar2.f20323e.f20385j0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar3 = aVar2.f20323e;
                    int[] iArr2 = bVar3.f20387k0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f20389l0;
                        if (str2 != null) {
                            bVar3.f20387k0 = k(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.f20323e.f20387k0);
                        }
                    }
                    barrier2.setType(aVar2.f20323e.f20381h0);
                    barrier2.setMargin(aVar2.f20323e.f20383i0);
                    ConstraintLayout.b g10 = constraintLayout.generateDefaultLayoutParams();
                    barrier2.s();
                    aVar2.d(g10);
                    constraintLayout.addView(barrier2, g10);
                }
                if (aVar2.f20323e.f20366a) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.b g11 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.d(g11);
                    constraintLayout.addView(guideline, g11);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).i(constraintLayout);
            }
        }
    }

    public void e(int i10, int i11) {
        a aVar;
        if (this.f20318f.containsKey(Integer.valueOf(i10)) && (aVar = this.f20318f.get(Integer.valueOf(i10))) != null) {
            switch (i11) {
                case 1:
                    b bVar = aVar.f20323e;
                    bVar.f20386k = -1;
                    bVar.f20384j = -1;
                    bVar.f20347H = -1;
                    bVar.f20354O = Integer.MIN_VALUE;
                    return;
                case 2:
                    b bVar2 = aVar.f20323e;
                    bVar2.f20390m = -1;
                    bVar2.f20388l = -1;
                    bVar2.f20348I = -1;
                    bVar2.f20356Q = Integer.MIN_VALUE;
                    return;
                case 3:
                    b bVar3 = aVar.f20323e;
                    bVar3.f20394o = -1;
                    bVar3.f20392n = -1;
                    bVar3.f20349J = 0;
                    bVar3.f20355P = Integer.MIN_VALUE;
                    return;
                case 4:
                    b bVar4 = aVar.f20323e;
                    bVar4.f20396p = -1;
                    bVar4.f20398q = -1;
                    bVar4.f20350K = 0;
                    bVar4.f20357R = Integer.MIN_VALUE;
                    return;
                case 5:
                    b bVar5 = aVar.f20323e;
                    bVar5.f20400r = -1;
                    bVar5.f20401s = -1;
                    bVar5.f20402t = -1;
                    bVar5.f20353N = 0;
                    bVar5.f20360U = Integer.MIN_VALUE;
                    return;
                case 6:
                    b bVar6 = aVar.f20323e;
                    bVar6.f20403u = -1;
                    bVar6.f20404v = -1;
                    bVar6.f20352M = 0;
                    bVar6.f20359T = Integer.MIN_VALUE;
                    return;
                case 7:
                    b bVar7 = aVar.f20323e;
                    bVar7.f20405w = -1;
                    bVar7.f20406x = -1;
                    bVar7.f20351L = 0;
                    bVar7.f20358S = Integer.MIN_VALUE;
                    return;
                case 8:
                    b bVar8 = aVar.f20323e;
                    bVar8.f20343D = -1.0f;
                    bVar8.f20342C = -1;
                    bVar8.f20341B = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public void f(Context context, int i10) {
        g((ConstraintLayout) LayoutInflater.from(context).inflate(i10, (ViewGroup) null));
    }

    public void g(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f20318f.clear();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (!this.f20317e || id2 != -1) {
                if (!this.f20318f.containsKey(Integer.valueOf(id2))) {
                    this.f20318f.put(Integer.valueOf(id2), new a());
                }
                a aVar = this.f20318f.get(Integer.valueOf(id2));
                if (aVar != null) {
                    aVar.f20325g = a.a(this.f20316d, childAt);
                    aVar.f(id2, bVar);
                    aVar.f20321c.f20425b = childAt.getVisibility();
                    aVar.f20321c.f20427d = childAt.getAlpha();
                    aVar.f20324f.f20431b = childAt.getRotation();
                    aVar.f20324f.f20432c = childAt.getRotationX();
                    aVar.f20324f.f20433d = childAt.getRotationY();
                    aVar.f20324f.f20434e = childAt.getScaleX();
                    aVar.f20324f.f20435f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        e eVar = aVar.f20324f;
                        eVar.f20436g = pivotX;
                        eVar.f20437h = pivotY;
                    }
                    aVar.f20324f.f20439j = childAt.getTranslationX();
                    aVar.f20324f.f20440k = childAt.getTranslationY();
                    aVar.f20324f.f20441l = childAt.getTranslationZ();
                    e eVar2 = aVar.f20324f;
                    if (eVar2.f20442m) {
                        eVar2.f20443n = childAt.getElevation();
                    }
                    if (childAt instanceof Barrier) {
                        Barrier barrier = (Barrier) childAt;
                        aVar.f20323e.f20397p0 = barrier.getAllowsGoneWidget();
                        aVar.f20323e.f20387k0 = barrier.getReferencedIds();
                        aVar.f20323e.f20381h0 = barrier.getType();
                        aVar.f20323e.f20383i0 = barrier.getMargin();
                    }
                }
                i10++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void h(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.f20318f.clear();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = constraints.getChildAt(i10);
            Constraints.a aVar = (Constraints.a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (!this.f20317e || id2 != -1) {
                if (!this.f20318f.containsKey(Integer.valueOf(id2))) {
                    this.f20318f.put(Integer.valueOf(id2), new a());
                }
                a aVar2 = this.f20318f.get(Integer.valueOf(id2));
                if (aVar2 != null) {
                    if (childAt instanceof ConstraintHelper) {
                        aVar2.h((ConstraintHelper) childAt, id2, aVar);
                    }
                    aVar2.g(id2, aVar);
                }
                i10++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void i(int i10, int i11, int i12, int i13) {
        if (!this.f20318f.containsKey(Integer.valueOf(i10))) {
            this.f20318f.put(Integer.valueOf(i10), new a());
        }
        a aVar = this.f20318f.get(Integer.valueOf(i10));
        if (aVar != null) {
            switch (i11) {
                case 1:
                    if (i13 == 1) {
                        b bVar = aVar.f20323e;
                        bVar.f20384j = i12;
                        bVar.f20386k = -1;
                        return;
                    } else if (i13 == 2) {
                        b bVar2 = aVar.f20323e;
                        bVar2.f20386k = i12;
                        bVar2.f20384j = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("left to " + x(i13) + " undefined");
                    }
                case 2:
                    if (i13 == 1) {
                        b bVar3 = aVar.f20323e;
                        bVar3.f20388l = i12;
                        bVar3.f20390m = -1;
                        return;
                    } else if (i13 == 2) {
                        b bVar4 = aVar.f20323e;
                        bVar4.f20390m = i12;
                        bVar4.f20388l = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + x(i13) + " undefined");
                    }
                case 3:
                    if (i13 == 3) {
                        b bVar5 = aVar.f20323e;
                        bVar5.f20392n = i12;
                        bVar5.f20394o = -1;
                        bVar5.f20400r = -1;
                        bVar5.f20401s = -1;
                        bVar5.f20402t = -1;
                        return;
                    } else if (i13 == 4) {
                        b bVar6 = aVar.f20323e;
                        bVar6.f20394o = i12;
                        bVar6.f20392n = -1;
                        bVar6.f20400r = -1;
                        bVar6.f20401s = -1;
                        bVar6.f20402t = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + x(i13) + " undefined");
                    }
                case 4:
                    if (i13 == 4) {
                        b bVar7 = aVar.f20323e;
                        bVar7.f20398q = i12;
                        bVar7.f20396p = -1;
                        bVar7.f20400r = -1;
                        bVar7.f20401s = -1;
                        bVar7.f20402t = -1;
                        return;
                    } else if (i13 == 3) {
                        b bVar8 = aVar.f20323e;
                        bVar8.f20396p = i12;
                        bVar8.f20398q = -1;
                        bVar8.f20400r = -1;
                        bVar8.f20401s = -1;
                        bVar8.f20402t = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + x(i13) + " undefined");
                    }
                case 5:
                    if (i13 == 5) {
                        b bVar9 = aVar.f20323e;
                        bVar9.f20400r = i12;
                        bVar9.f20398q = -1;
                        bVar9.f20396p = -1;
                        bVar9.f20392n = -1;
                        bVar9.f20394o = -1;
                        return;
                    } else if (i13 == 3) {
                        b bVar10 = aVar.f20323e;
                        bVar10.f20401s = i12;
                        bVar10.f20398q = -1;
                        bVar10.f20396p = -1;
                        bVar10.f20392n = -1;
                        bVar10.f20394o = -1;
                        return;
                    } else if (i13 == 4) {
                        b bVar11 = aVar.f20323e;
                        bVar11.f20402t = i12;
                        bVar11.f20398q = -1;
                        bVar11.f20396p = -1;
                        bVar11.f20392n = -1;
                        bVar11.f20394o = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + x(i13) + " undefined");
                    }
                case 6:
                    if (i13 == 6) {
                        b bVar12 = aVar.f20323e;
                        bVar12.f20404v = i12;
                        bVar12.f20403u = -1;
                        return;
                    } else if (i13 == 7) {
                        b bVar13 = aVar.f20323e;
                        bVar13.f20403u = i12;
                        bVar13.f20404v = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + x(i13) + " undefined");
                    }
                case 7:
                    if (i13 == 7) {
                        b bVar14 = aVar.f20323e;
                        bVar14.f20406x = i12;
                        bVar14.f20405w = -1;
                        return;
                    } else if (i13 == 6) {
                        b bVar15 = aVar.f20323e;
                        bVar15.f20405w = i12;
                        bVar15.f20406x = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + x(i13) + " undefined");
                    }
                default:
                    throw new IllegalArgumentException(x(i11) + " to " + x(i13) + " unknown");
            }
        }
    }

    public void j(int i10, int i11, int i12, float f10) {
        b bVar = m(i10).f20323e;
        bVar.f20341B = i11;
        bVar.f20342C = i12;
        bVar.f20343D = f10;
    }

    public void n(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    a l10 = l(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        l10.f20323e.f20366a = true;
                    }
                    this.f20318f.put(Integer.valueOf(l10.f20319a), l10);
                }
            }
        } catch (XmlPullParserException e10) {
            Log.e("ConstraintSet", "Error parsing resource: " + i10, e10);
        } catch (IOException e11) {
            Log.e("ConstraintSet", "Error parsing resource: " + i10, e11);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01d3, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o(android.content.Context r12, org.xmlpull.v1.XmlPullParser r13) {
        /*
            r11 = this;
            java.lang.String r0 = "Error parsing XML resource"
            java.lang.String r1 = "ConstraintSet"
            int r2 = r13.getEventType()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r3 = 0
            r4 = r3
        L_0x000a:
            r5 = 1
            if (r2 == r5) goto L_0x01e0
            if (r2 == 0) goto L_0x01d0
            r6 = -1
            r7 = 3
            r8 = 2
            r9 = 0
            if (r2 == r8) goto L_0x0071
            if (r2 == r7) goto L_0x0019
            goto L_0x01d3
        L_0x0019:
            java.lang.String r2 = r13.getName()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            java.util.Locale r10 = java.util.Locale.ROOT     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            java.lang.String r2 = r2.toLowerCase(r10)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            int r10 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            switch(r10) {
                case -2075718416: goto L_0x004f;
                case -190376483: goto L_0x0045;
                case 426575017: goto L_0x003b;
                case 2146106725: goto L_0x002b;
                default: goto L_0x002a;
            }     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
        L_0x002a:
            goto L_0x0058
        L_0x002b:
            java.lang.String r10 = "constraintset"
            boolean r2 = r2.equals(r10)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            if (r2 == 0) goto L_0x0058
            r6 = r9
            goto L_0x0058
        L_0x0035:
            r12 = move-exception
            goto L_0x01d9
        L_0x0038:
            r12 = move-exception
            goto L_0x01dd
        L_0x003b:
            java.lang.String r9 = "constraintoverride"
            boolean r2 = r2.equals(r9)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            if (r2 == 0) goto L_0x0058
            r6 = r8
            goto L_0x0058
        L_0x0045:
            java.lang.String r9 = "constraint"
            boolean r2 = r2.equals(r9)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            if (r2 == 0) goto L_0x0058
            r6 = r5
            goto L_0x0058
        L_0x004f:
            java.lang.String r9 = "guideline"
            boolean r2 = r2.equals(r9)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            if (r2 == 0) goto L_0x0058
            r6 = r7
        L_0x0058:
            if (r6 == 0) goto L_0x0070
            if (r6 == r5) goto L_0x0062
            if (r6 == r8) goto L_0x0062
            if (r6 == r7) goto L_0x0062
            goto L_0x01d3
        L_0x0062:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.c$a> r2 = r11.f20318f     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            int r5 = r4.f20319a     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r2.put(r5, r4)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r4 = r3
            goto L_0x01d3
        L_0x0070:
            return
        L_0x0071:
            java.lang.String r2 = r13.getName()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            int r10 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            switch(r10) {
                case -2025855158: goto L_0x00da;
                case -1984451626: goto L_0x00d0;
                case -1962203927: goto L_0x00c6;
                case -1269513683: goto L_0x00bc;
                case -1238332596: goto L_0x00b2;
                case -71750448: goto L_0x00a8;
                case 366511058: goto L_0x009d;
                case 1331510167: goto L_0x0093;
                case 1791837707: goto L_0x0088;
                case 1803088381: goto L_0x007e;
                default: goto L_0x007c;
            }     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
        L_0x007c:
            goto L_0x00e3
        L_0x007e:
            java.lang.String r7 = "Constraint"
            boolean r2 = r2.equals(r7)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            if (r2 == 0) goto L_0x00e3
            r6 = r9
            goto L_0x00e3
        L_0x0088:
            java.lang.String r7 = "CustomAttribute"
            boolean r2 = r2.equals(r7)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            if (r2 == 0) goto L_0x00e3
            r6 = 8
            goto L_0x00e3
        L_0x0093:
            java.lang.String r8 = "Barrier"
            boolean r2 = r2.equals(r8)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            if (r2 == 0) goto L_0x00e3
            r6 = r7
            goto L_0x00e3
        L_0x009d:
            java.lang.String r7 = "CustomMethod"
            boolean r2 = r2.equals(r7)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            if (r2 == 0) goto L_0x00e3
            r6 = 9
            goto L_0x00e3
        L_0x00a8:
            java.lang.String r7 = "Guideline"
            boolean r2 = r2.equals(r7)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            if (r2 == 0) goto L_0x00e3
            r6 = r8
            goto L_0x00e3
        L_0x00b2:
            java.lang.String r7 = "Transform"
            boolean r2 = r2.equals(r7)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            if (r2 == 0) goto L_0x00e3
            r6 = 5
            goto L_0x00e3
        L_0x00bc:
            java.lang.String r7 = "PropertySet"
            boolean r2 = r2.equals(r7)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            if (r2 == 0) goto L_0x00e3
            r6 = 4
            goto L_0x00e3
        L_0x00c6:
            java.lang.String r7 = "ConstraintOverride"
            boolean r2 = r2.equals(r7)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            if (r2 == 0) goto L_0x00e3
            r6 = r5
            goto L_0x00e3
        L_0x00d0:
            java.lang.String r7 = "Motion"
            boolean r2 = r2.equals(r7)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            if (r2 == 0) goto L_0x00e3
            r6 = 7
            goto L_0x00e3
        L_0x00da:
            java.lang.String r7 = "Layout"
            boolean r2 = r2.equals(r7)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            if (r2 == 0) goto L_0x00e3
            r6 = 6
        L_0x00e3:
            java.lang.String r2 = "XML parser error must be within a Constraint "
            switch(r6) {
                case 0: goto L_0x01c7;
                case 1: goto L_0x01be;
                case 2: goto L_0x01af;
                case 3: goto L_0x01a2;
                case 4: goto L_0x017d;
                case 5: goto L_0x0158;
                case 6: goto L_0x0132;
                case 7: goto L_0x010c;
                case 8: goto L_0x00ea;
                case 9: goto L_0x00ea;
                default: goto L_0x00e8;
            }
        L_0x00e8:
            goto L_0x01d3
        L_0x00ea:
            if (r4 == 0) goto L_0x00f3
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.a> r2 = r4.f20325g     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            androidx.constraintlayout.widget.a.d(r12, r13, r2)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            goto L_0x01d3
        L_0x00f3:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r3.append(r2)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r3.append(r13)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            java.lang.String r13 = r3.toString()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            throw r12     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
        L_0x010c:
            if (r4 == 0) goto L_0x0119
            androidx.constraintlayout.widget.c$c r2 = r4.f20322d     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r2.b(r12, r5)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            goto L_0x01d3
        L_0x0119:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r3.append(r2)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r3.append(r13)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            java.lang.String r13 = r3.toString()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            throw r12     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
        L_0x0132:
            if (r4 == 0) goto L_0x013f
            androidx.constraintlayout.widget.c$b r2 = r4.f20323e     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r2.b(r12, r5)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            goto L_0x01d3
        L_0x013f:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r3.append(r2)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r3.append(r13)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            java.lang.String r13 = r3.toString()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            throw r12     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
        L_0x0158:
            if (r4 == 0) goto L_0x0164
            androidx.constraintlayout.widget.c$e r2 = r4.f20324f     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r2.b(r12, r5)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            goto L_0x01d3
        L_0x0164:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r3.append(r2)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r3.append(r13)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            java.lang.String r13 = r3.toString()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            throw r12     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
        L_0x017d:
            if (r4 == 0) goto L_0x0189
            androidx.constraintlayout.widget.c$d r2 = r4.f20321c     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r2.b(r12, r5)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            goto L_0x01d3
        L_0x0189:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r3.append(r2)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r3.append(r13)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            java.lang.String r13 = r3.toString()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            throw r12     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
        L_0x01a2:
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            androidx.constraintlayout.widget.c$a r4 = r11.l(r12, r2, r9)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            androidx.constraintlayout.widget.c$b r2 = r4.f20323e     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r2.f20385j0 = r5     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            goto L_0x01d3
        L_0x01af:
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            androidx.constraintlayout.widget.c$a r4 = r11.l(r12, r2, r9)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            androidx.constraintlayout.widget.c$b r2 = r4.f20323e     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r2.f20366a = r5     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            r2.f20368b = r5     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            goto L_0x01d3
        L_0x01be:
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            androidx.constraintlayout.widget.c$a r4 = r11.l(r12, r2, r5)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            goto L_0x01d3
        L_0x01c7:
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            androidx.constraintlayout.widget.c$a r4 = r11.l(r12, r2, r9)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            goto L_0x01d3
        L_0x01d0:
            r13.getName()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
        L_0x01d3:
            int r2 = r13.next()     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x0035 }
            goto L_0x000a
        L_0x01d9:
            android.util.Log.e(r1, r0, r12)
            goto L_0x01e0
        L_0x01dd:
            android.util.Log.e(r1, r0, r12)
        L_0x01e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.c.o(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public void v(int i10, float f10) {
        m(i10).f20323e.f20407y = f10;
    }

    public void w(int i10, int i11) {
        m(i10).f20321c.f20425b = i11;
    }
}
