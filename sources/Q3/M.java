package q3;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import kb.C9967v;
import kb.C9968w;
import kb.C9970y;
import t3.C5950a;
import t3.N;

public class M {

    /* renamed from: C  reason: collision with root package name */
    public static final M f27952C;
    @Deprecated

    /* renamed from: D  reason: collision with root package name */
    public static final M f27953D;

    /* renamed from: E  reason: collision with root package name */
    private static final String f27954E = N.A0(1);

    /* renamed from: F  reason: collision with root package name */
    private static final String f27955F = N.A0(2);

    /* renamed from: G  reason: collision with root package name */
    private static final String f27956G = N.A0(3);

    /* renamed from: H  reason: collision with root package name */
    private static final String f27957H = N.A0(4);

    /* renamed from: I  reason: collision with root package name */
    private static final String f27958I = N.A0(5);

    /* renamed from: J  reason: collision with root package name */
    private static final String f27959J = N.A0(6);

    /* renamed from: K  reason: collision with root package name */
    private static final String f27960K = N.A0(7);

    /* renamed from: L  reason: collision with root package name */
    private static final String f27961L = N.A0(8);

    /* renamed from: M  reason: collision with root package name */
    private static final String f27962M = N.A0(9);

    /* renamed from: N  reason: collision with root package name */
    private static final String f27963N = N.A0(10);

    /* renamed from: O  reason: collision with root package name */
    private static final String f27964O = N.A0(11);

    /* renamed from: P  reason: collision with root package name */
    private static final String f27965P = N.A0(12);

    /* renamed from: Q  reason: collision with root package name */
    private static final String f27966Q = N.A0(13);

    /* renamed from: R  reason: collision with root package name */
    private static final String f27967R = N.A0(14);

    /* renamed from: S  reason: collision with root package name */
    private static final String f27968S = N.A0(15);

    /* renamed from: T  reason: collision with root package name */
    private static final String f27969T = N.A0(16);

    /* renamed from: U  reason: collision with root package name */
    private static final String f27970U = N.A0(17);

    /* renamed from: V  reason: collision with root package name */
    private static final String f27971V = N.A0(18);

    /* renamed from: W  reason: collision with root package name */
    private static final String f27972W = N.A0(19);

    /* renamed from: X  reason: collision with root package name */
    private static final String f27973X = N.A0(20);

    /* renamed from: Y  reason: collision with root package name */
    private static final String f27974Y = N.A0(21);

    /* renamed from: Z  reason: collision with root package name */
    private static final String f27975Z = N.A0(22);

    /* renamed from: a0  reason: collision with root package name */
    private static final String f27976a0 = N.A0(23);

    /* renamed from: b0  reason: collision with root package name */
    private static final String f27977b0 = N.A0(24);

    /* renamed from: c0  reason: collision with root package name */
    private static final String f27978c0 = N.A0(25);

    /* renamed from: d0  reason: collision with root package name */
    private static final String f27979d0 = N.A0(26);

    /* renamed from: e0  reason: collision with root package name */
    private static final String f27980e0 = N.A0(27);

    /* renamed from: f0  reason: collision with root package name */
    private static final String f27981f0 = N.A0(28);

    /* renamed from: g0  reason: collision with root package name */
    private static final String f27982g0 = N.A0(29);

    /* renamed from: h0  reason: collision with root package name */
    private static final String f27983h0 = N.A0(30);

    /* renamed from: i0  reason: collision with root package name */
    private static final String f27984i0 = N.A0(31);

    /* renamed from: A  reason: collision with root package name */
    public final C9968w<K, L> f27985A;

    /* renamed from: B  reason: collision with root package name */
    public final C9970y<Integer> f27986B;

    /* renamed from: a  reason: collision with root package name */
    public final int f27987a;

    /* renamed from: b  reason: collision with root package name */
    public final int f27988b;

    /* renamed from: c  reason: collision with root package name */
    public final int f27989c;

    /* renamed from: d  reason: collision with root package name */
    public final int f27990d;

    /* renamed from: e  reason: collision with root package name */
    public final int f27991e;

    /* renamed from: f  reason: collision with root package name */
    public final int f27992f;

    /* renamed from: g  reason: collision with root package name */
    public final int f27993g;

    /* renamed from: h  reason: collision with root package name */
    public final int f27994h;

    /* renamed from: i  reason: collision with root package name */
    public final int f27995i;

    /* renamed from: j  reason: collision with root package name */
    public final int f27996j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f27997k;

    /* renamed from: l  reason: collision with root package name */
    public final C9967v<String> f27998l;

    /* renamed from: m  reason: collision with root package name */
    public final int f27999m;

    /* renamed from: n  reason: collision with root package name */
    public final C9967v<String> f28000n;

    /* renamed from: o  reason: collision with root package name */
    public final int f28001o;

    /* renamed from: p  reason: collision with root package name */
    public final int f28002p;

    /* renamed from: q  reason: collision with root package name */
    public final int f28003q;

    /* renamed from: r  reason: collision with root package name */
    public final C9967v<String> f28004r;

    /* renamed from: s  reason: collision with root package name */
    public final b f28005s;

    /* renamed from: t  reason: collision with root package name */
    public final C9967v<String> f28006t;

    /* renamed from: u  reason: collision with root package name */
    public final int f28007u;

    /* renamed from: v  reason: collision with root package name */
    public final int f28008v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f28009w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f28010x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f28011y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f28012z;

    public static final class b {

        /* renamed from: d  reason: collision with root package name */
        public static final b f28013d = new a().d();

        /* renamed from: e  reason: collision with root package name */
        private static final String f28014e = N.A0(1);

        /* renamed from: f  reason: collision with root package name */
        private static final String f28015f = N.A0(2);

        /* renamed from: g  reason: collision with root package name */
        private static final String f28016g = N.A0(3);

        /* renamed from: a  reason: collision with root package name */
        public final int f28017a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f28018b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f28019c;

        public static final class a {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public int f28020a = 0;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public boolean f28021b = false;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public boolean f28022c = false;

            public b d() {
                return new b(this);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f28017a == bVar.f28017a && this.f28018b == bVar.f28018b && this.f28019c == bVar.f28019c;
        }

        public int hashCode() {
            return ((((this.f28017a + 31) * 31) + (this.f28018b ? 1 : 0)) * 31) + (this.f28019c ? 1 : 0);
        }

        private b(a aVar) {
            this.f28017a = aVar.f28020a;
            this.f28018b = aVar.f28021b;
            this.f28019c = aVar.f28022c;
        }
    }

    static {
        M C10 = new c().C();
        f27952C = C10;
        f27953D = C10;
    }

    protected M(c cVar) {
        this.f27987a = cVar.f28025a;
        this.f27988b = cVar.f28026b;
        this.f27989c = cVar.f28027c;
        this.f27990d = cVar.f28028d;
        this.f27991e = cVar.f28029e;
        this.f27992f = cVar.f28030f;
        this.f27993g = cVar.f28031g;
        this.f27994h = cVar.f28032h;
        this.f27995i = cVar.f28033i;
        this.f27996j = cVar.f28034j;
        this.f27997k = cVar.f28035k;
        this.f27998l = cVar.f28036l;
        this.f27999m = cVar.f28037m;
        this.f28000n = cVar.f28038n;
        this.f28001o = cVar.f28039o;
        this.f28002p = cVar.f28040p;
        this.f28003q = cVar.f28041q;
        this.f28004r = cVar.f28042r;
        this.f28005s = cVar.f28043s;
        this.f28006t = cVar.f28044t;
        this.f28007u = cVar.f28045u;
        this.f28008v = cVar.f28046v;
        this.f28009w = cVar.f28047w;
        this.f28010x = cVar.f28048x;
        this.f28011y = cVar.f28049y;
        this.f28012z = cVar.f28050z;
        this.f27985A = C9968w.d(cVar.f28023A);
        this.f27986B = C9970y.A(cVar.f28024B);
    }

    public c a() {
        return new c(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        M m10 = (M) obj;
        return this.f27987a == m10.f27987a && this.f27988b == m10.f27988b && this.f27989c == m10.f27989c && this.f27990d == m10.f27990d && this.f27991e == m10.f27991e && this.f27992f == m10.f27992f && this.f27993g == m10.f27993g && this.f27994h == m10.f27994h && this.f27997k == m10.f27997k && this.f27995i == m10.f27995i && this.f27996j == m10.f27996j && this.f27998l.equals(m10.f27998l) && this.f27999m == m10.f27999m && this.f28000n.equals(m10.f28000n) && this.f28001o == m10.f28001o && this.f28002p == m10.f28002p && this.f28003q == m10.f28003q && this.f28004r.equals(m10.f28004r) && this.f28005s.equals(m10.f28005s) && this.f28006t.equals(m10.f28006t) && this.f28007u == m10.f28007u && this.f28008v == m10.f28008v && this.f28009w == m10.f28009w && this.f28010x == m10.f28010x && this.f28011y == m10.f28011y && this.f28012z == m10.f28012z && this.f27985A.equals(m10.f27985A) && this.f27986B.equals(m10.f27986B);
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((this.f27987a + 31) * 31) + this.f27988b) * 31) + this.f27989c) * 31) + this.f27990d) * 31) + this.f27991e) * 31) + this.f27992f) * 31) + this.f27993g) * 31) + this.f27994h) * 31) + (this.f27997k ? 1 : 0)) * 31) + this.f27995i) * 31) + this.f27996j) * 31) + this.f27998l.hashCode()) * 31) + this.f27999m) * 31) + this.f28000n.hashCode()) * 31) + this.f28001o) * 31) + this.f28002p) * 31) + this.f28003q) * 31) + this.f28004r.hashCode()) * 31) + this.f28005s.hashCode()) * 31) + this.f28006t.hashCode()) * 31) + this.f28007u) * 31) + this.f28008v) * 31) + (this.f28009w ? 1 : 0)) * 31) + (this.f28010x ? 1 : 0)) * 31) + (this.f28011y ? 1 : 0)) * 31) + (this.f28012z ? 1 : 0)) * 31) + this.f27985A.hashCode()) * 31) + this.f27986B.hashCode();
    }

    public static class c {
        /* access modifiers changed from: private */

        /* renamed from: A  reason: collision with root package name */
        public HashMap<K, L> f28023A;
        /* access modifiers changed from: private */

        /* renamed from: B  reason: collision with root package name */
        public HashSet<Integer> f28024B;
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f28025a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f28026b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f28027c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int f28028d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f28029e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public int f28030f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public int f28031g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public int f28032h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public int f28033i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public int f28034j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public boolean f28035k;
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public C9967v<String> f28036l;
        /* access modifiers changed from: private */

        /* renamed from: m  reason: collision with root package name */
        public int f28037m;
        /* access modifiers changed from: private */

        /* renamed from: n  reason: collision with root package name */
        public C9967v<String> f28038n;
        /* access modifiers changed from: private */

        /* renamed from: o  reason: collision with root package name */
        public int f28039o;
        /* access modifiers changed from: private */

        /* renamed from: p  reason: collision with root package name */
        public int f28040p;
        /* access modifiers changed from: private */

        /* renamed from: q  reason: collision with root package name */
        public int f28041q;
        /* access modifiers changed from: private */

        /* renamed from: r  reason: collision with root package name */
        public C9967v<String> f28042r;
        /* access modifiers changed from: private */

        /* renamed from: s  reason: collision with root package name */
        public b f28043s;
        /* access modifiers changed from: private */

        /* renamed from: t  reason: collision with root package name */
        public C9967v<String> f28044t;
        /* access modifiers changed from: private */

        /* renamed from: u  reason: collision with root package name */
        public int f28045u;
        /* access modifiers changed from: private */

        /* renamed from: v  reason: collision with root package name */
        public int f28046v;
        /* access modifiers changed from: private */

        /* renamed from: w  reason: collision with root package name */
        public boolean f28047w;
        /* access modifiers changed from: private */

        /* renamed from: x  reason: collision with root package name */
        public boolean f28048x;
        /* access modifiers changed from: private */

        /* renamed from: y  reason: collision with root package name */
        public boolean f28049y;
        /* access modifiers changed from: private */

        /* renamed from: z  reason: collision with root package name */
        public boolean f28050z;

        @Deprecated
        public c() {
            this.f28025a = Integer.MAX_VALUE;
            this.f28026b = Integer.MAX_VALUE;
            this.f28027c = Integer.MAX_VALUE;
            this.f28028d = Integer.MAX_VALUE;
            this.f28033i = Integer.MAX_VALUE;
            this.f28034j = Integer.MAX_VALUE;
            this.f28035k = true;
            this.f28036l = C9967v.E();
            this.f28037m = 0;
            this.f28038n = C9967v.E();
            this.f28039o = 0;
            this.f28040p = Integer.MAX_VALUE;
            this.f28041q = Integer.MAX_VALUE;
            this.f28042r = C9967v.E();
            this.f28043s = b.f28013d;
            this.f28044t = C9967v.E();
            this.f28045u = 0;
            this.f28046v = 0;
            this.f28047w = false;
            this.f28048x = false;
            this.f28049y = false;
            this.f28050z = false;
            this.f28023A = new HashMap<>();
            this.f28024B = new HashSet<>();
        }

        private void E(M m10) {
            this.f28025a = m10.f27987a;
            this.f28026b = m10.f27988b;
            this.f28027c = m10.f27989c;
            this.f28028d = m10.f27990d;
            this.f28029e = m10.f27991e;
            this.f28030f = m10.f27992f;
            this.f28031g = m10.f27993g;
            this.f28032h = m10.f27994h;
            this.f28033i = m10.f27995i;
            this.f28034j = m10.f27996j;
            this.f28035k = m10.f27997k;
            this.f28036l = m10.f27998l;
            this.f28037m = m10.f27999m;
            this.f28038n = m10.f28000n;
            this.f28039o = m10.f28001o;
            this.f28040p = m10.f28002p;
            this.f28041q = m10.f28003q;
            this.f28042r = m10.f28004r;
            this.f28043s = m10.f28005s;
            this.f28044t = m10.f28006t;
            this.f28045u = m10.f28007u;
            this.f28046v = m10.f28008v;
            this.f28047w = m10.f28009w;
            this.f28048x = m10.f28010x;
            this.f28049y = m10.f28011y;
            this.f28050z = m10.f28012z;
            this.f28024B = new HashSet<>(m10.f27986B);
            this.f28023A = new HashMap<>(m10.f27985A);
        }

        private static C9967v<String> F(String[] strArr) {
            C9967v.a t10 = C9967v.t();
            for (String e10 : (String[]) C5950a.e(strArr)) {
                t10.a(N.S0((String) C5950a.e(e10)));
            }
            return t10.k();
        }

        public M C() {
            return new M(this);
        }

        public c D(int i10) {
            Iterator<L> it = this.f28023A.values().iterator();
            while (it.hasNext()) {
                if (it.next().a() == i10) {
                    it.remove();
                }
            }
            return this;
        }

        /* access modifiers changed from: protected */
        public c G(M m10) {
            E(m10);
            return this;
        }

        public c H(int i10) {
            this.f28046v = i10;
            return this;
        }

        public c I(L l10) {
            D(l10.a());
            this.f28023A.put(l10.f27950a, l10);
            return this;
        }

        public c J(String str) {
            return str == null ? L(new String[0]) : L(str);
        }

        public c K(Context context) {
            CaptioningManager captioningManager;
            if ((N.f29462a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f28045u = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f28044t = C9967v.F(N.b0(locale));
                }
            }
            return this;
        }

        public c L(String... strArr) {
            this.f28044t = F(strArr);
            return this;
        }

        public c M(int i10) {
            this.f28045u = i10;
            return this;
        }

        public c N(int i10, boolean z10) {
            if (z10) {
                this.f28024B.add(Integer.valueOf(i10));
            } else {
                this.f28024B.remove(Integer.valueOf(i10));
            }
            return this;
        }

        public c O(int i10, int i11, boolean z10) {
            this.f28033i = i10;
            this.f28034j = i11;
            this.f28035k = z10;
            return this;
        }

        public c P(Context context, boolean z10) {
            Point S10 = N.S(context);
            return O(S10.x, S10.y, z10);
        }

        public c(Context context) {
            this();
            K(context);
            P(context, true);
        }

        protected c(M m10) {
            E(m10);
        }
    }
}
