package a8;

import a8.C6752b;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import com.adjust.sdk.Constants;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class g {

    /* renamed from: g  reason: collision with root package name */
    private static i f41601g = null;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f41602h = true;

    /* renamed from: a  reason: collision with root package name */
    private F f41603a = null;

    /* renamed from: b  reason: collision with root package name */
    private String f41604b = "";

    /* renamed from: c  reason: collision with root package name */
    private String f41605c = "";

    /* renamed from: d  reason: collision with root package name */
    private float f41606d = 96.0f;

    /* renamed from: e  reason: collision with root package name */
    private C6752b.r f41607e = new C6752b.r();

    /* renamed from: f  reason: collision with root package name */
    private Map<String, L> f41608f = new HashMap();

    static class A extends C6779z {
        A() {
        }

        /* access modifiers changed from: package-private */
        public String o() {
            return "polygon";
        }
    }

    static class B extends C6765l {

        /* renamed from: o  reason: collision with root package name */
        C6769p f41609o;

        /* renamed from: p  reason: collision with root package name */
        C6769p f41610p;

        /* renamed from: q  reason: collision with root package name */
        C6769p f41611q;

        /* renamed from: r  reason: collision with root package name */
        C6769p f41612r;

        /* renamed from: s  reason: collision with root package name */
        C6769p f41613s;

        /* renamed from: t  reason: collision with root package name */
        C6769p f41614t;

        B() {
        }

        /* access modifiers changed from: package-private */
        public String o() {
            return "rect";
        }
    }

    static class C extends L implements J {
        C() {
        }

        public void a(N n10) {
        }

        public List<N> e() {
            return Collections.emptyList();
        }

        /* access modifiers changed from: package-private */
        public String o() {
            return "solidColor";
        }
    }

    static class D extends L implements J {

        /* renamed from: h  reason: collision with root package name */
        Float f41615h;

        D() {
        }

        public void a(N n10) {
        }

        public List<N> e() {
            return Collections.emptyList();
        }

        /* access modifiers changed from: package-private */
        public String o() {
            return "stop";
        }
    }

    static class E implements Cloneable {

        /* renamed from: A  reason: collision with root package name */
        Boolean f41616A;

        /* renamed from: B  reason: collision with root package name */
        Boolean f41617B;

        /* renamed from: C  reason: collision with root package name */
        O f41618C;

        /* renamed from: D  reason: collision with root package name */
        Float f41619D;

        /* renamed from: E  reason: collision with root package name */
        String f41620E;

        /* renamed from: F  reason: collision with root package name */
        a f41621F;

        /* renamed from: G  reason: collision with root package name */
        String f41622G;

        /* renamed from: H  reason: collision with root package name */
        O f41623H;

        /* renamed from: I  reason: collision with root package name */
        Float f41624I;

        /* renamed from: J  reason: collision with root package name */
        O f41625J;

        /* renamed from: K  reason: collision with root package name */
        Float f41626K;

        /* renamed from: L  reason: collision with root package name */
        i f41627L;

        /* renamed from: M  reason: collision with root package name */
        e f41628M;

        /* renamed from: a  reason: collision with root package name */
        long f41629a = 0;

        /* renamed from: b  reason: collision with root package name */
        O f41630b;

        /* renamed from: c  reason: collision with root package name */
        a f41631c;

        /* renamed from: d  reason: collision with root package name */
        Float f41632d;

        /* renamed from: e  reason: collision with root package name */
        O f41633e;

        /* renamed from: f  reason: collision with root package name */
        Float f41634f;

        /* renamed from: g  reason: collision with root package name */
        C6769p f41635g;

        /* renamed from: h  reason: collision with root package name */
        c f41636h;

        /* renamed from: i  reason: collision with root package name */
        d f41637i;

        /* renamed from: j  reason: collision with root package name */
        Float f41638j;

        /* renamed from: k  reason: collision with root package name */
        C6769p[] f41639k;

        /* renamed from: l  reason: collision with root package name */
        C6769p f41640l;

        /* renamed from: m  reason: collision with root package name */
        Float f41641m;

        /* renamed from: n  reason: collision with root package name */
        C6760f f41642n;

        /* renamed from: o  reason: collision with root package name */
        List<String> f41643o;

        /* renamed from: p  reason: collision with root package name */
        C6769p f41644p;

        /* renamed from: q  reason: collision with root package name */
        Integer f41645q;

        /* renamed from: r  reason: collision with root package name */
        b f41646r;

        /* renamed from: s  reason: collision with root package name */
        C0735g f41647s;

        /* renamed from: t  reason: collision with root package name */
        h f41648t;

        /* renamed from: u  reason: collision with root package name */
        f f41649u;

        /* renamed from: v  reason: collision with root package name */
        Boolean f41650v;

        /* renamed from: w  reason: collision with root package name */
        C6757c f41651w;

        /* renamed from: x  reason: collision with root package name */
        String f41652x;

        /* renamed from: y  reason: collision with root package name */
        String f41653y;

        /* renamed from: z  reason: collision with root package name */
        String f41654z;

        public enum a {
            NonZero,
            EvenOdd
        }

        public enum b {
            Normal,
            Italic,
            Oblique
        }

        public enum c {
            Butt,
            Round,
            Square
        }

        public enum d {
            Miter,
            Round,
            Bevel
        }

        public enum e {
            auto,
            optimizeQuality,
            optimizeSpeed
        }

        public enum f {
            Start,
            Middle,
            End
        }

        /* renamed from: a8.g$E$g  reason: collision with other inner class name */
        public enum C0735g {
            None,
            Underline,
            Overline,
            LineThrough,
            Blink
        }

        public enum h {
            LTR,
            RTL
        }

        public enum i {
            None,
            NonScalingStroke
        }

        E() {
        }

        static E a() {
            E e10 = new E();
            e10.f41629a = -1;
            C6760f fVar = C6760f.f41729b;
            e10.f41630b = fVar;
            a aVar = a.NonZero;
            e10.f41631c = aVar;
            Float valueOf = Float.valueOf(1.0f);
            e10.f41632d = valueOf;
            e10.f41633e = null;
            e10.f41634f = valueOf;
            e10.f41635g = new C6769p(1.0f);
            e10.f41636h = c.Butt;
            e10.f41637i = d.Miter;
            e10.f41638j = Float.valueOf(4.0f);
            e10.f41639k = null;
            e10.f41640l = new C6769p(0.0f);
            e10.f41641m = valueOf;
            e10.f41642n = fVar;
            e10.f41643o = null;
            e10.f41644p = new C6769p(12.0f, d0.pt);
            e10.f41645q = Integer.valueOf(Constants.MINIMAL_ERROR_STATUS_CODE);
            e10.f41646r = b.Normal;
            e10.f41647s = C0735g.None;
            e10.f41648t = h.LTR;
            e10.f41649u = f.Start;
            Boolean bool = Boolean.TRUE;
            e10.f41650v = bool;
            e10.f41651w = null;
            e10.f41652x = null;
            e10.f41653y = null;
            e10.f41654z = null;
            e10.f41616A = bool;
            e10.f41617B = bool;
            e10.f41618C = fVar;
            e10.f41619D = valueOf;
            e10.f41620E = null;
            e10.f41621F = aVar;
            e10.f41622G = null;
            e10.f41623H = null;
            e10.f41624I = valueOf;
            e10.f41625J = null;
            e10.f41626K = valueOf;
            e10.f41627L = i.None;
            e10.f41628M = e.auto;
            return e10;
        }

        /* access modifiers changed from: package-private */
        public void b(boolean z10) {
            Boolean bool = Boolean.TRUE;
            this.f41616A = bool;
            if (!z10) {
                bool = Boolean.FALSE;
            }
            this.f41650v = bool;
            this.f41651w = null;
            this.f41620E = null;
            this.f41641m = Float.valueOf(1.0f);
            this.f41618C = C6760f.f41729b;
            this.f41619D = Float.valueOf(1.0f);
            this.f41622G = null;
            this.f41623H = null;
            this.f41624I = Float.valueOf(1.0f);
            this.f41625J = null;
            this.f41626K = Float.valueOf(1.0f);
            this.f41627L = i.None;
        }

        /* access modifiers changed from: protected */
        public Object clone() {
            E e10 = (E) super.clone();
            C6769p[] pVarArr = this.f41639k;
            if (pVarArr != null) {
                e10.f41639k = (C6769p[]) pVarArr.clone();
            }
            return e10;
        }
    }

    static class F extends R {

        /* renamed from: q  reason: collision with root package name */
        C6769p f41655q;

        /* renamed from: r  reason: collision with root package name */
        C6769p f41656r;

        /* renamed from: s  reason: collision with root package name */
        C6769p f41657s;

        /* renamed from: t  reason: collision with root package name */
        C6769p f41658t;

        /* renamed from: u  reason: collision with root package name */
        public String f41659u;

        F() {
        }

        /* access modifiers changed from: package-private */
        public String o() {
            return "svg";
        }
    }

    interface G {
        Set<String> b();

        String c();

        void d(Set<String> set);

        void g(Set<String> set);

        Set<String> h();

        void i(Set<String> set);

        void j(Set<String> set);

        void k(String str);

        Set<String> m();

        Set<String> n();
    }

    static abstract class H extends K implements J, G {

        /* renamed from: i  reason: collision with root package name */
        List<N> f41660i = new ArrayList();

        /* renamed from: j  reason: collision with root package name */
        Set<String> f41661j = null;

        /* renamed from: k  reason: collision with root package name */
        String f41662k = null;

        /* renamed from: l  reason: collision with root package name */
        Set<String> f41663l = null;

        /* renamed from: m  reason: collision with root package name */
        Set<String> f41664m = null;

        /* renamed from: n  reason: collision with root package name */
        Set<String> f41665n = null;

        H() {
        }

        public void a(N n10) {
            this.f41660i.add(n10);
        }

        public Set<String> b() {
            return null;
        }

        public String c() {
            return this.f41662k;
        }

        public void d(Set<String> set) {
            this.f41665n = set;
        }

        public List<N> e() {
            return this.f41660i;
        }

        public void g(Set<String> set) {
            this.f41661j = set;
        }

        public Set<String> h() {
            return this.f41661j;
        }

        public void i(Set<String> set) {
            this.f41663l = set;
        }

        public void j(Set<String> set) {
            this.f41664m = set;
        }

        public void k(String str) {
            this.f41662k = str;
        }

        public Set<String> m() {
            return this.f41664m;
        }

        public Set<String> n() {
            return this.f41665n;
        }
    }

    static abstract class I extends K implements G {

        /* renamed from: i  reason: collision with root package name */
        Set<String> f41666i = null;

        /* renamed from: j  reason: collision with root package name */
        String f41667j = null;

        /* renamed from: k  reason: collision with root package name */
        Set<String> f41668k = null;

        /* renamed from: l  reason: collision with root package name */
        Set<String> f41669l = null;

        /* renamed from: m  reason: collision with root package name */
        Set<String> f41670m = null;

        I() {
        }

        public Set<String> b() {
            return this.f41668k;
        }

        public String c() {
            return this.f41667j;
        }

        public void d(Set<String> set) {
            this.f41670m = set;
        }

        public void g(Set<String> set) {
            this.f41666i = set;
        }

        public Set<String> h() {
            return this.f41666i;
        }

        public void i(Set<String> set) {
            this.f41668k = set;
        }

        public void j(Set<String> set) {
            this.f41669l = set;
        }

        public void k(String str) {
            this.f41667j = str;
        }

        public Set<String> m() {
            return this.f41669l;
        }

        public Set<String> n() {
            return this.f41670m;
        }
    }

    interface J {
        void a(N n10);

        List<N> e();
    }

    static abstract class K extends L {

        /* renamed from: h  reason: collision with root package name */
        C6756b f41671h = null;

        K() {
        }
    }

    static abstract class L extends N {

        /* renamed from: c  reason: collision with root package name */
        String f41672c = null;

        /* renamed from: d  reason: collision with root package name */
        Boolean f41673d = null;

        /* renamed from: e  reason: collision with root package name */
        E f41674e = null;

        /* renamed from: f  reason: collision with root package name */
        E f41675f = null;

        /* renamed from: g  reason: collision with root package name */
        List<String> f41676g = null;

        L() {
        }

        public String toString() {
            return o();
        }
    }

    static class M extends C6763j {

        /* renamed from: m  reason: collision with root package name */
        C6769p f41677m;

        /* renamed from: n  reason: collision with root package name */
        C6769p f41678n;

        /* renamed from: o  reason: collision with root package name */
        C6769p f41679o;

        /* renamed from: p  reason: collision with root package name */
        C6769p f41680p;

        M() {
        }

        /* access modifiers changed from: package-private */
        public String o() {
            return "linearGradient";
        }
    }

    static class N {

        /* renamed from: a  reason: collision with root package name */
        g f41681a;

        /* renamed from: b  reason: collision with root package name */
        J f41682b;

        N() {
        }

        /* access modifiers changed from: package-private */
        public String o() {
            return "";
        }
    }

    static abstract class O implements Cloneable {
        O() {
        }
    }

    static abstract class P extends H {

        /* renamed from: o  reason: collision with root package name */
        e f41683o = null;

        P() {
        }
    }

    static class Q extends C6763j {

        /* renamed from: m  reason: collision with root package name */
        C6769p f41684m;

        /* renamed from: n  reason: collision with root package name */
        C6769p f41685n;

        /* renamed from: o  reason: collision with root package name */
        C6769p f41686o;

        /* renamed from: p  reason: collision with root package name */
        C6769p f41687p;

        /* renamed from: q  reason: collision with root package name */
        C6769p f41688q;

        Q() {
        }

        /* access modifiers changed from: package-private */
        public String o() {
            return "radialGradient";
        }
    }

    static abstract class R extends P {

        /* renamed from: p  reason: collision with root package name */
        C6756b f41689p;

        R() {
        }
    }

    static class S extends C6766m {
        S() {
        }

        /* access modifiers changed from: package-private */
        public String o() {
            return "switch";
        }
    }

    static class T extends R implements C6773t {
        T() {
        }

        /* access modifiers changed from: package-private */
        public String o() {
            return "symbol";
        }
    }

    static class U extends Y implements X {

        /* renamed from: o  reason: collision with root package name */
        String f41690o;

        /* renamed from: p  reason: collision with root package name */
        private b0 f41691p;

        U() {
        }

        public b0 f() {
            return this.f41691p;
        }

        /* access modifiers changed from: package-private */
        public String o() {
            return "tref";
        }

        public void p(b0 b0Var) {
            this.f41691p = b0Var;
        }
    }

    static class V extends a0 implements X {

        /* renamed from: s  reason: collision with root package name */
        private b0 f41692s;

        V() {
        }

        public b0 f() {
            return this.f41692s;
        }

        /* access modifiers changed from: package-private */
        public String o() {
            return "tspan";
        }

        public void p(b0 b0Var) {
            this.f41692s = b0Var;
        }
    }

    static class W extends a0 implements b0, C6767n {

        /* renamed from: s  reason: collision with root package name */
        Matrix f41693s;

        W() {
        }

        public void l(Matrix matrix) {
            this.f41693s = matrix;
        }

        /* access modifiers changed from: package-private */
        public String o() {
            return "text";
        }
    }

    interface X {
        b0 f();
    }

    static abstract class Y extends H {
        Y() {
        }

        public void a(N n10) {
            if (n10 instanceof X) {
                this.f41660i.add(n10);
                return;
            }
            throw new j("Text content elements cannot contain " + n10 + " elements.");
        }
    }

    static class Z extends Y implements X {

        /* renamed from: o  reason: collision with root package name */
        String f41694o;

        /* renamed from: p  reason: collision with root package name */
        C6769p f41695p;

        /* renamed from: q  reason: collision with root package name */
        private b0 f41696q;

        Z() {
        }

        public b0 f() {
            return this.f41696q;
        }

        /* access modifiers changed from: package-private */
        public String o() {
            return "textPath";
        }

        public void p(b0 b0Var) {
            this.f41696q = b0Var;
        }
    }

    /* renamed from: a8.g$a  reason: case insensitive filesystem */
    static /* synthetic */ class C6755a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f41697a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                a8.g$d0[] r0 = a8.g.d0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f41697a = r0
                a8.g$d0 r1 = a8.g.d0.px     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f41697a     // Catch:{ NoSuchFieldError -> 0x001d }
                a8.g$d0 r1 = a8.g.d0.em     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f41697a     // Catch:{ NoSuchFieldError -> 0x0028 }
                a8.g$d0 r1 = a8.g.d0.ex     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f41697a     // Catch:{ NoSuchFieldError -> 0x0033 }
                a8.g$d0 r1 = a8.g.d0.in     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f41697a     // Catch:{ NoSuchFieldError -> 0x003e }
                a8.g$d0 r1 = a8.g.d0.cm     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f41697a     // Catch:{ NoSuchFieldError -> 0x0049 }
                a8.g$d0 r1 = a8.g.d0.mm     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f41697a     // Catch:{ NoSuchFieldError -> 0x0054 }
                a8.g$d0 r1 = a8.g.d0.pt     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f41697a     // Catch:{ NoSuchFieldError -> 0x0060 }
                a8.g$d0 r1 = a8.g.d0.pc     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f41697a     // Catch:{ NoSuchFieldError -> 0x006c }
                a8.g$d0 r1 = a8.g.d0.percent     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a8.g.C6755a.<clinit>():void");
        }
    }

    static abstract class a0 extends Y {

        /* renamed from: o  reason: collision with root package name */
        List<C6769p> f41698o;

        /* renamed from: p  reason: collision with root package name */
        List<C6769p> f41699p;

        /* renamed from: q  reason: collision with root package name */
        List<C6769p> f41700q;

        /* renamed from: r  reason: collision with root package name */
        List<C6769p> f41701r;

        a0() {
        }
    }

    interface b0 {
    }

    /* renamed from: a8.g$c  reason: case insensitive filesystem */
    static class C6757c {

        /* renamed from: a  reason: collision with root package name */
        C6769p f41706a;

        /* renamed from: b  reason: collision with root package name */
        C6769p f41707b;

        /* renamed from: c  reason: collision with root package name */
        C6769p f41708c;

        /* renamed from: d  reason: collision with root package name */
        C6769p f41709d;

        C6757c(C6769p pVar, C6769p pVar2, C6769p pVar3, C6769p pVar4) {
            this.f41706a = pVar;
            this.f41707b = pVar2;
            this.f41708c = pVar3;
            this.f41709d = pVar4;
        }
    }

    static class c0 extends N implements X {

        /* renamed from: c  reason: collision with root package name */
        String f41710c;

        /* renamed from: d  reason: collision with root package name */
        private b0 f41711d;

        c0(String str) {
            this.f41710c = str;
        }

        public b0 f() {
            return this.f41711d;
        }

        public String toString() {
            return "TextChild: '" + this.f41710c + "'";
        }
    }

    /* renamed from: a8.g$d  reason: case insensitive filesystem */
    static class C6758d extends C6765l {

        /* renamed from: o  reason: collision with root package name */
        C6769p f41712o;

        /* renamed from: p  reason: collision with root package name */
        C6769p f41713p;

        /* renamed from: q  reason: collision with root package name */
        C6769p f41714q;

        C6758d() {
        }

        /* access modifiers changed from: package-private */
        public String o() {
            return "circle";
        }
    }

    enum d0 {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent
    }

    /* renamed from: a8.g$e  reason: case insensitive filesystem */
    static class C6759e extends C6766m implements C6773t {

        /* renamed from: p  reason: collision with root package name */
        Boolean f41723p;

        C6759e() {
        }

        /* access modifiers changed from: package-private */
        public String o() {
            return "clipPath";
        }
    }

    static class e0 extends C6766m {

        /* renamed from: p  reason: collision with root package name */
        String f41724p;

        /* renamed from: q  reason: collision with root package name */
        C6769p f41725q;

        /* renamed from: r  reason: collision with root package name */
        C6769p f41726r;

        /* renamed from: s  reason: collision with root package name */
        C6769p f41727s;

        /* renamed from: t  reason: collision with root package name */
        C6769p f41728t;

        e0() {
        }

        /* access modifiers changed from: package-private */
        public String o() {
            return "use";
        }
    }

    /* renamed from: a8.g$f  reason: case insensitive filesystem */
    static class C6760f extends O {

        /* renamed from: b  reason: collision with root package name */
        static final C6760f f41729b = new C6760f(-16777216);

        /* renamed from: c  reason: collision with root package name */
        static final C6760f f41730c = new C6760f(0);

        /* renamed from: a  reason: collision with root package name */
        int f41731a;

        C6760f(int i10) {
            this.f41731a = i10;
        }

        public String toString() {
            return String.format("#%08x", new Object[]{Integer.valueOf(this.f41731a)});
        }
    }

    static class f0 extends R implements C6773t {
        f0() {
        }

        /* access modifiers changed from: package-private */
        public String o() {
            return "view";
        }
    }

    /* renamed from: a8.g$g  reason: collision with other inner class name */
    static class C0736g extends O {

        /* renamed from: a  reason: collision with root package name */
        private static C0736g f41732a = new C0736g();

        private C0736g() {
        }

        static C0736g a() {
            return f41732a;
        }
    }

    /* renamed from: a8.g$h  reason: case insensitive filesystem */
    static class C6761h extends C6766m implements C6773t {
        C6761h() {
        }

        /* access modifiers changed from: package-private */
        public String o() {
            return "defs";
        }
    }

    /* renamed from: a8.g$i  reason: case insensitive filesystem */
    static class C6762i extends C6765l {

        /* renamed from: o  reason: collision with root package name */
        C6769p f41733o;

        /* renamed from: p  reason: collision with root package name */
        C6769p f41734p;

        /* renamed from: q  reason: collision with root package name */
        C6769p f41735q;

        /* renamed from: r  reason: collision with root package name */
        C6769p f41736r;

        C6762i() {
        }

        /* access modifiers changed from: package-private */
        public String o() {
            return "ellipse";
        }
    }

    /* renamed from: a8.g$j  reason: case insensitive filesystem */
    static abstract class C6763j extends L implements J {

        /* renamed from: h  reason: collision with root package name */
        List<N> f41737h = new ArrayList();

        /* renamed from: i  reason: collision with root package name */
        Boolean f41738i;

        /* renamed from: j  reason: collision with root package name */
        Matrix f41739j;

        /* renamed from: k  reason: collision with root package name */
        C6764k f41740k;

        /* renamed from: l  reason: collision with root package name */
        String f41741l;

        C6763j() {
        }

        public void a(N n10) {
            if (n10 instanceof D) {
                this.f41737h.add(n10);
                return;
            }
            throw new j("Gradient elements cannot contain " + n10 + " elements.");
        }

        public List<N> e() {
            return this.f41737h;
        }
    }

    /* renamed from: a8.g$k  reason: case insensitive filesystem */
    enum C6764k {
        pad,
        reflect,
        repeat
    }

    /* renamed from: a8.g$l  reason: case insensitive filesystem */
    static abstract class C6765l extends I implements C6767n {

        /* renamed from: n  reason: collision with root package name */
        Matrix f41742n;

        C6765l() {
        }

        public void l(Matrix matrix) {
            this.f41742n = matrix;
        }
    }

    /* renamed from: a8.g$m  reason: case insensitive filesystem */
    static class C6766m extends H implements C6767n {

        /* renamed from: o  reason: collision with root package name */
        Matrix f41743o;

        C6766m() {
        }

        public void l(Matrix matrix) {
            this.f41743o = matrix;
        }

        /* access modifiers changed from: package-private */
        public String o() {
            return "group";
        }
    }

    /* renamed from: a8.g$n  reason: case insensitive filesystem */
    interface C6767n {
        void l(Matrix matrix);
    }

    /* renamed from: a8.g$o  reason: case insensitive filesystem */
    static class C6768o extends P implements C6767n {

        /* renamed from: p  reason: collision with root package name */
        String f41744p;

        /* renamed from: q  reason: collision with root package name */
        C6769p f41745q;

        /* renamed from: r  reason: collision with root package name */
        C6769p f41746r;

        /* renamed from: s  reason: collision with root package name */
        C6769p f41747s;

        /* renamed from: t  reason: collision with root package name */
        C6769p f41748t;

        /* renamed from: u  reason: collision with root package name */
        Matrix f41749u;

        C6768o() {
        }

        public void l(Matrix matrix) {
            this.f41749u = matrix;
        }

        /* access modifiers changed from: package-private */
        public String o() {
            return "image";
        }
    }

    /* renamed from: a8.g$q  reason: case insensitive filesystem */
    static class C6770q extends C6765l {

        /* renamed from: o  reason: collision with root package name */
        C6769p f41752o;

        /* renamed from: p  reason: collision with root package name */
        C6769p f41753p;

        /* renamed from: q  reason: collision with root package name */
        C6769p f41754q;

        /* renamed from: r  reason: collision with root package name */
        C6769p f41755r;

        C6770q() {
        }

        /* access modifiers changed from: package-private */
        public String o() {
            return "line";
        }
    }

    /* renamed from: a8.g$r  reason: case insensitive filesystem */
    static class C6771r extends R implements C6773t {

        /* renamed from: q  reason: collision with root package name */
        boolean f41756q;

        /* renamed from: r  reason: collision with root package name */
        C6769p f41757r;

        /* renamed from: s  reason: collision with root package name */
        C6769p f41758s;

        /* renamed from: t  reason: collision with root package name */
        C6769p f41759t;

        /* renamed from: u  reason: collision with root package name */
        C6769p f41760u;

        /* renamed from: v  reason: collision with root package name */
        Float f41761v;

        C6771r() {
        }

        /* access modifiers changed from: package-private */
        public String o() {
            return "marker";
        }
    }

    /* renamed from: a8.g$s  reason: case insensitive filesystem */
    static class C6772s extends H implements C6773t {

        /* renamed from: o  reason: collision with root package name */
        Boolean f41762o;

        /* renamed from: p  reason: collision with root package name */
        Boolean f41763p;

        /* renamed from: q  reason: collision with root package name */
        C6769p f41764q;

        /* renamed from: r  reason: collision with root package name */
        C6769p f41765r;

        /* renamed from: s  reason: collision with root package name */
        C6769p f41766s;

        /* renamed from: t  reason: collision with root package name */
        C6769p f41767t;

        C6772s() {
        }

        /* access modifiers changed from: package-private */
        public String o() {
            return "mask";
        }
    }

    /* renamed from: a8.g$t  reason: case insensitive filesystem */
    interface C6773t {
    }

    /* renamed from: a8.g$u  reason: case insensitive filesystem */
    static class C6774u extends O {

        /* renamed from: a  reason: collision with root package name */
        String f41768a;

        /* renamed from: b  reason: collision with root package name */
        O f41769b;

        C6774u(String str, O o10) {
            this.f41768a = str;
            this.f41769b = o10;
        }

        public String toString() {
            return this.f41768a + " " + this.f41769b;
        }
    }

    /* renamed from: a8.g$v  reason: case insensitive filesystem */
    static class C6775v extends C6765l {

        /* renamed from: o  reason: collision with root package name */
        C6776w f41770o;

        /* renamed from: p  reason: collision with root package name */
        Float f41771p;

        C6775v() {
        }

        /* access modifiers changed from: package-private */
        public String o() {
            return "path";
        }
    }

    /* renamed from: a8.g$w  reason: case insensitive filesystem */
    static class C6776w implements C6777x {

        /* renamed from: a  reason: collision with root package name */
        private byte[] f41772a = new byte[8];

        /* renamed from: b  reason: collision with root package name */
        private int f41773b = 0;

        /* renamed from: c  reason: collision with root package name */
        private float[] f41774c = new float[16];

        /* renamed from: d  reason: collision with root package name */
        private int f41775d = 0;

        C6776w() {
        }

        private void a(byte b10) {
            int i10 = this.f41773b;
            byte[] bArr = this.f41772a;
            if (i10 == bArr.length) {
                byte[] bArr2 = new byte[(bArr.length * 2)];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f41772a = bArr2;
            }
            byte[] bArr3 = this.f41772a;
            int i11 = this.f41773b;
            this.f41773b = i11 + 1;
            bArr3[i11] = b10;
        }

        private void g(int i10) {
            float[] fArr = this.f41774c;
            if (fArr.length < this.f41775d + i10) {
                float[] fArr2 = new float[(fArr.length * 2)];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f41774c = fArr2;
            }
        }

        public void b(float f10, float f11) {
            a((byte) 0);
            g(2);
            float[] fArr = this.f41774c;
            int i10 = this.f41775d;
            int i11 = i10 + 1;
            this.f41775d = i11;
            fArr[i10] = f10;
            this.f41775d = i10 + 2;
            fArr[i11] = f11;
        }

        public void c(float f10, float f11, float f12, float f13, float f14, float f15) {
            a((byte) 2);
            g(6);
            float[] fArr = this.f41774c;
            int i10 = this.f41775d;
            int i11 = i10 + 1;
            this.f41775d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f41775d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f41775d = i13;
            fArr[i12] = f12;
            int i14 = i10 + 4;
            this.f41775d = i14;
            fArr[i13] = f13;
            int i15 = i10 + 5;
            this.f41775d = i15;
            fArr[i14] = f14;
            this.f41775d = i10 + 6;
            fArr[i15] = f15;
        }

        public void close() {
            a((byte) 8);
        }

        public void d(float f10, float f11) {
            a((byte) 1);
            g(2);
            float[] fArr = this.f41774c;
            int i10 = this.f41775d;
            int i11 = i10 + 1;
            this.f41775d = i11;
            fArr[i10] = f10;
            this.f41775d = i10 + 2;
            fArr[i11] = f11;
        }

        public void e(float f10, float f11, float f12, float f13) {
            a((byte) 3);
            g(4);
            float[] fArr = this.f41774c;
            int i10 = this.f41775d;
            int i11 = i10 + 1;
            this.f41775d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f41775d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f41775d = i13;
            fArr[i12] = f12;
            this.f41775d = i10 + 4;
            fArr[i13] = f13;
        }

        public void f(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            a(((z10 ? (char) 2 : 0) | true) | z11 ? (byte) 1 : 0);
            g(5);
            float[] fArr = this.f41774c;
            int i10 = this.f41775d;
            int i11 = i10 + 1;
            this.f41775d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f41775d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f41775d = i13;
            fArr[i12] = f12;
            int i14 = i10 + 4;
            this.f41775d = i14;
            fArr[i13] = f13;
            this.f41775d = i10 + 5;
            fArr[i14] = f14;
        }

        /* access modifiers changed from: package-private */
        public void h(C6777x xVar) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.f41773b; i11++) {
                byte b10 = this.f41772a[i11];
                if (b10 == 0) {
                    float[] fArr = this.f41774c;
                    int i12 = i10 + 1;
                    float f10 = fArr[i10];
                    i10 += 2;
                    xVar.b(f10, fArr[i12]);
                } else if (b10 == 1) {
                    float[] fArr2 = this.f41774c;
                    int i13 = i10 + 1;
                    float f11 = fArr2[i10];
                    i10 += 2;
                    xVar.d(f11, fArr2[i13]);
                } else if (b10 == 2) {
                    float[] fArr3 = this.f41774c;
                    float f12 = fArr3[i10];
                    float f13 = fArr3[i10 + 1];
                    float f14 = fArr3[i10 + 2];
                    float f15 = fArr3[i10 + 3];
                    int i14 = i10 + 5;
                    i10 += 6;
                    xVar.c(f12, f13, f14, f15, fArr3[i10 + 4], fArr3[i14]);
                } else if (b10 == 3) {
                    float[] fArr4 = this.f41774c;
                    int i15 = i10 + 3;
                    i10 += 4;
                    xVar.e(fArr4[i10], fArr4[i10 + 1], fArr4[i10 + 2], fArr4[i15]);
                } else if (b10 != 8) {
                    boolean z10 = (b10 & 2) != 0;
                    boolean z11 = (b10 & 1) != 0;
                    float[] fArr5 = this.f41774c;
                    float f16 = fArr5[i10];
                    float f17 = fArr5[i10 + 1];
                    float f18 = fArr5[i10 + 2];
                    int i16 = i10 + 4;
                    i10 += 5;
                    xVar.f(f16, f17, f18, z10, z11, fArr5[i10 + 3], fArr5[i16]);
                } else {
                    xVar.close();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean i() {
            return this.f41773b == 0;
        }
    }

    /* renamed from: a8.g$x  reason: case insensitive filesystem */
    interface C6777x {
        void b(float f10, float f11);

        void c(float f10, float f11, float f12, float f13, float f14, float f15);

        void close();

        void d(float f10, float f11);

        void e(float f10, float f11, float f12, float f13);

        void f(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14);
    }

    /* renamed from: a8.g$y  reason: case insensitive filesystem */
    static class C6778y extends R implements C6773t {

        /* renamed from: q  reason: collision with root package name */
        Boolean f41776q;

        /* renamed from: r  reason: collision with root package name */
        Boolean f41777r;

        /* renamed from: s  reason: collision with root package name */
        Matrix f41778s;

        /* renamed from: t  reason: collision with root package name */
        C6769p f41779t;

        /* renamed from: u  reason: collision with root package name */
        C6769p f41780u;

        /* renamed from: v  reason: collision with root package name */
        C6769p f41781v;

        /* renamed from: w  reason: collision with root package name */
        C6769p f41782w;

        /* renamed from: x  reason: collision with root package name */
        String f41783x;

        C6778y() {
        }

        /* access modifiers changed from: package-private */
        public String o() {
            return "pattern";
        }
    }

    /* renamed from: a8.g$z  reason: case insensitive filesystem */
    static class C6779z extends C6765l {

        /* renamed from: o  reason: collision with root package name */
        float[] f41784o;

        C6779z() {
        }

        /* access modifiers changed from: package-private */
        public String o() {
            return "polyline";
        }
    }

    g() {
    }

    public static void B(boolean z10) {
        f41602h = z10;
    }

    private String c(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", "").replace("\\A", "\n");
    }

    private C6756b e(float f10) {
        d0 d0Var;
        d0 d0Var2;
        d0 d0Var3;
        d0 d0Var4;
        float f11;
        d0 d0Var5;
        F f12 = this.f41603a;
        C6769p pVar = f12.f41657s;
        C6769p pVar2 = f12.f41658t;
        if (pVar == null || pVar.k() || (d0Var = pVar.f41751b) == (d0Var2 = d0.percent) || d0Var == (d0Var3 = d0.em) || d0Var == (d0Var4 = d0.ex)) {
            return new C6756b(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float b10 = pVar.b(f10);
        if (pVar2 == null) {
            C6756b bVar = this.f41603a.f41689p;
            f11 = bVar != null ? (bVar.f41705d * b10) / bVar.f41704c : b10;
        } else if (pVar2.k() || (d0Var5 = pVar2.f41751b) == d0Var2 || d0Var5 == d0Var3 || d0Var5 == d0Var4) {
            return new C6756b(-1.0f, -1.0f, -1.0f, -1.0f);
        } else {
            f11 = pVar2.b(f10);
        }
        return new C6756b(0.0f, 0.0f, b10, f11);
    }

    private L i(J j10, String str) {
        L i10;
        L l10 = (L) j10;
        if (str.equals(l10.f41672c)) {
            return l10;
        }
        for (N next : j10.e()) {
            if (next instanceof L) {
                L l11 = (L) next;
                if (str.equals(l11.f41672c)) {
                    return l11;
                }
                if ((next instanceof J) && (i10 = i((J) next, str)) != null) {
                    return i10;
                }
            }
        }
        return null;
    }

    static i k() {
        return f41601g;
    }

    public static g l(InputStream inputStream) {
        return new k().z(inputStream, f41602h);
    }

    public static boolean o() {
        return f41602h;
    }

    public static void p(i iVar) {
        f41601g = iVar;
    }

    public void A(String str) {
        F f10 = this.f41603a;
        if (f10 != null) {
            f10.f41657s = k.o0(str);
            return;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    /* access modifiers changed from: package-private */
    public void C(F f10) {
        this.f41603a = f10;
    }

    /* access modifiers changed from: package-private */
    public void D(String str) {
        this.f41604b = str;
    }

    /* access modifiers changed from: package-private */
    public void a(C6752b.r rVar) {
        this.f41607e.b(rVar);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f41607e.e(C6752b.u.RenderOptions);
    }

    /* access modifiers changed from: package-private */
    public List<C6752b.p> d() {
        return this.f41607e.c();
    }

    public float f() {
        if (this.f41603a != null) {
            return e(this.f41606d).f41705d;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public RectF g() {
        F f10 = this.f41603a;
        if (f10 != null) {
            C6756b bVar = f10.f41689p;
            if (bVar == null) {
                return null;
            }
            return bVar.d();
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public float h() {
        if (this.f41603a != null) {
            return e(this.f41606d).f41704c;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    /* access modifiers changed from: package-private */
    public L j(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.f41603a.f41672c)) {
            return this.f41603a;
        }
        if (this.f41608f.containsKey(str)) {
            return this.f41608f.get(str);
        }
        L i10 = i(this.f41603a, str);
        this.f41608f.put(str, i10);
        return i10;
    }

    /* access modifiers changed from: package-private */
    public F m() {
        return this.f41603a;
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        return !this.f41607e.d();
    }

    public void q(Canvas canvas, f fVar) {
        if (fVar == null) {
            fVar = new f();
        }
        if (!fVar.g()) {
            fVar.h(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight());
        }
        new h(canvas, this.f41606d).G0(this, fVar);
    }

    public Picture r() {
        return t((f) null);
    }

    public Picture s(int i10, int i11, f fVar) {
        Picture picture = new Picture();
        Canvas beginRecording = picture.beginRecording(i10, i11);
        if (fVar == null || fVar.f41600f == null) {
            fVar = fVar == null ? new f() : new f(fVar);
            fVar.h(0.0f, 0.0f, (float) i10, (float) i11);
        }
        new h(beginRecording, this.f41606d).G0(this, fVar);
        picture.endRecording();
        return picture;
    }

    public Picture t(f fVar) {
        d0 d0Var;
        C6769p pVar;
        C6756b bVar = (fVar == null || !fVar.f()) ? this.f41603a.f41689p : fVar.f41598d;
        if (fVar == null || !fVar.g()) {
            F f10 = this.f41603a;
            C6769p pVar2 = f10.f41657s;
            if (pVar2 != null && pVar2.f41751b != (d0Var = d0.percent) && (pVar = f10.f41658t) != null && pVar.f41751b != d0Var) {
                return s((int) Math.ceil((double) pVar2.b(this.f41606d)), (int) Math.ceil((double) this.f41603a.f41658t.b(this.f41606d)), fVar);
            } else if (pVar2 == null || bVar == null) {
                C6769p pVar3 = f10.f41658t;
                if (pVar3 == null || bVar == null) {
                    return s(512, 512, fVar);
                }
                float b10 = pVar3.b(this.f41606d);
                return s((int) Math.ceil((double) ((bVar.f41704c * b10) / bVar.f41705d)), (int) Math.ceil((double) b10), fVar);
            } else {
                float b11 = pVar2.b(this.f41606d);
                return s((int) Math.ceil((double) b11), (int) Math.ceil((double) ((bVar.f41705d * b11) / bVar.f41704c)), fVar);
            }
        } else {
            return s((int) Math.ceil((double) fVar.f41600f.b()), (int) Math.ceil((double) fVar.f41600f.c()), fVar);
        }
    }

    /* access modifiers changed from: package-private */
    public N u(String str) {
        if (str == null) {
            return null;
        }
        String c10 = c(str);
        if (c10.length() <= 1 || !c10.startsWith("#")) {
            return null;
        }
        return j(c10.substring(1));
    }

    /* access modifiers changed from: package-private */
    public void v(String str) {
        this.f41605c = str;
    }

    public void w(float f10) {
        F f11 = this.f41603a;
        if (f11 != null) {
            f11.f41658t = new C6769p(f10);
            return;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public void x(String str) {
        F f10 = this.f41603a;
        if (f10 != null) {
            f10.f41658t = k.o0(str);
            return;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public void y(float f10, float f11, float f12, float f13) {
        F f14 = this.f41603a;
        if (f14 != null) {
            f14.f41689p = new C6756b(f10, f11, f12, f13);
            return;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public void z(float f10) {
        F f11 = this.f41603a;
        if (f11 != null) {
            f11.f41657s = new C6769p(f10);
            return;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    /* renamed from: a8.g$p  reason: case insensitive filesystem */
    static class C6769p implements Cloneable {

        /* renamed from: a  reason: collision with root package name */
        float f41750a;

        /* renamed from: b  reason: collision with root package name */
        d0 f41751b;

        C6769p(float f10, d0 d0Var) {
            this.f41750a = f10;
            this.f41751b = d0Var;
        }

        /* access modifiers changed from: package-private */
        public float a() {
            return this.f41750a;
        }

        /* access modifiers changed from: package-private */
        public float b(float f10) {
            int i10 = C6755a.f41697a[this.f41751b.ordinal()];
            if (i10 == 1) {
                return this.f41750a;
            }
            switch (i10) {
                case 4:
                    return this.f41750a * f10;
                case 5:
                    return (this.f41750a * f10) / 2.54f;
                case 6:
                    return (this.f41750a * f10) / 25.4f;
                case 7:
                    return (this.f41750a * f10) / 72.0f;
                case 8:
                    return (this.f41750a * f10) / 6.0f;
                default:
                    return this.f41750a;
            }
        }

        /* access modifiers changed from: package-private */
        public float c(h hVar) {
            if (this.f41751b != d0.percent) {
                return e(hVar);
            }
            C6756b S10 = hVar.S();
            if (S10 == null) {
                return this.f41750a;
            }
            float f10 = S10.f41704c;
            float f11 = S10.f41705d;
            if (f10 == f11) {
                return (this.f41750a * f10) / 100.0f;
            }
            return (this.f41750a * ((float) (Math.sqrt((double) ((f10 * f10) + (f11 * f11))) / 1.414213562373095d))) / 100.0f;
        }

        /* access modifiers changed from: package-private */
        public float d(h hVar, float f10) {
            return this.f41751b == d0.percent ? (this.f41750a * f10) / 100.0f : e(hVar);
        }

        /* access modifiers changed from: package-private */
        public float e(h hVar) {
            switch (C6755a.f41697a[this.f41751b.ordinal()]) {
                case 1:
                    return this.f41750a;
                case 2:
                    return this.f41750a * hVar.Q();
                case 3:
                    return this.f41750a * hVar.R();
                case 4:
                    return this.f41750a * hVar.T();
                case 5:
                    return (this.f41750a * hVar.T()) / 2.54f;
                case 6:
                    return (this.f41750a * hVar.T()) / 25.4f;
                case 7:
                    return (this.f41750a * hVar.T()) / 72.0f;
                case 8:
                    return (this.f41750a * hVar.T()) / 6.0f;
                case 9:
                    C6756b S10 = hVar.S();
                    return S10 == null ? this.f41750a : (this.f41750a * S10.f41704c) / 100.0f;
                default:
                    return this.f41750a;
            }
        }

        /* access modifiers changed from: package-private */
        public float f(h hVar) {
            if (this.f41751b != d0.percent) {
                return e(hVar);
            }
            C6756b S10 = hVar.S();
            return S10 == null ? this.f41750a : (this.f41750a * S10.f41705d) / 100.0f;
        }

        /* access modifiers changed from: package-private */
        public boolean j() {
            return this.f41750a < 0.0f;
        }

        /* access modifiers changed from: package-private */
        public boolean k() {
            return this.f41750a == 0.0f;
        }

        public String toString() {
            return String.valueOf(this.f41750a) + this.f41751b;
        }

        C6769p(float f10) {
            this.f41750a = f10;
            this.f41751b = d0.px;
        }
    }

    /* renamed from: a8.g$b  reason: case insensitive filesystem */
    static class C6756b {

        /* renamed from: a  reason: collision with root package name */
        float f41702a;

        /* renamed from: b  reason: collision with root package name */
        float f41703b;

        /* renamed from: c  reason: collision with root package name */
        float f41704c;

        /* renamed from: d  reason: collision with root package name */
        float f41705d;

        C6756b(float f10, float f11, float f12, float f13) {
            this.f41702a = f10;
            this.f41703b = f11;
            this.f41704c = f12;
            this.f41705d = f13;
        }

        static C6756b a(float f10, float f11, float f12, float f13) {
            return new C6756b(f10, f11, f12 - f10, f13 - f11);
        }

        /* access modifiers changed from: package-private */
        public float b() {
            return this.f41702a + this.f41704c;
        }

        /* access modifiers changed from: package-private */
        public float c() {
            return this.f41703b + this.f41705d;
        }

        /* access modifiers changed from: package-private */
        public RectF d() {
            return new RectF(this.f41702a, this.f41703b, b(), c());
        }

        /* access modifiers changed from: package-private */
        public void e(C6756b bVar) {
            float f10 = bVar.f41702a;
            if (f10 < this.f41702a) {
                this.f41702a = f10;
            }
            float f11 = bVar.f41703b;
            if (f11 < this.f41703b) {
                this.f41703b = f11;
            }
            if (bVar.b() > b()) {
                this.f41704c = bVar.b() - this.f41702a;
            }
            if (bVar.c() > c()) {
                this.f41705d = bVar.c() - this.f41703b;
            }
        }

        public String toString() {
            return "[" + this.f41702a + " " + this.f41703b + " " + this.f41704c + " " + this.f41705d + "]";
        }

        C6756b(C6756b bVar) {
            this.f41702a = bVar.f41702a;
            this.f41703b = bVar.f41703b;
            this.f41704c = bVar.f41704c;
            this.f41705d = bVar.f41705d;
        }
    }
}
