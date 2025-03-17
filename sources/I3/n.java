package I3;

import B3.T;
import G3.C6479C;
import G3.k0;
import I3.C6553a;
import I3.x;
import I3.z;
import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.exoplayer.u0;
import androidx.media3.exoplayer.v0;
import androidx.recyclerview.widget.RecyclerView;
import com.oppwa.mobile.connect.payment.processor.affirm.AffirmProcessorActivity;
import com.oppwa.mobile.connect.payment.processor.cashapppay.CashAppPayProcessorActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import jb.m;
import kb.C9935O;
import kb.C9959n;
import kb.C9967v;
import nb.C10076f;
import q3.C5792c;
import q3.C5807s;
import q3.J;
import q3.K;
import q3.L;
import q3.M;
import t3.C5950a;
import t3.N;
import t3.q;
import z3.H;

public class n extends z implements v0.a {
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final C9935O<Integer> f36713k = C9935O.b(new C6556d());

    /* renamed from: d  reason: collision with root package name */
    private final Object f36714d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f36715e;

    /* renamed from: f  reason: collision with root package name */
    private final x.b f36716f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f36717g;

    /* renamed from: h  reason: collision with root package name */
    private e f36718h;

    /* renamed from: i  reason: collision with root package name */
    private g f36719i;

    /* renamed from: j  reason: collision with root package name */
    private C5792c f36720j;

    private static final class b extends i<b> implements Comparable<b> {

        /* renamed from: e  reason: collision with root package name */
        private final int f36721e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f36722f;

        /* renamed from: g  reason: collision with root package name */
        private final String f36723g;

        /* renamed from: h  reason: collision with root package name */
        private final e f36724h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f36725i;

        /* renamed from: j  reason: collision with root package name */
        private final int f36726j;

        /* renamed from: k  reason: collision with root package name */
        private final int f36727k;

        /* renamed from: l  reason: collision with root package name */
        private final int f36728l;

        /* renamed from: m  reason: collision with root package name */
        private final boolean f36729m;

        /* renamed from: n  reason: collision with root package name */
        private final boolean f36730n;

        /* renamed from: o  reason: collision with root package name */
        private final int f36731o;

        /* renamed from: p  reason: collision with root package name */
        private final int f36732p;

        /* renamed from: q  reason: collision with root package name */
        private final boolean f36733q;

        /* renamed from: r  reason: collision with root package name */
        private final int f36734r;

        /* renamed from: s  reason: collision with root package name */
        private final int f36735s;

        /* renamed from: t  reason: collision with root package name */
        private final int f36736t;

        /* renamed from: u  reason: collision with root package name */
        private final int f36737u;

        /* renamed from: v  reason: collision with root package name */
        private final boolean f36738v;

        /* renamed from: w  reason: collision with root package name */
        private final boolean f36739w;

        /* renamed from: x  reason: collision with root package name */
        private final boolean f36740x;

        public b(int i10, K k10, int i11, e eVar, int i12, boolean z10, m<C5807s> mVar, int i13) {
            super(i10, k10, i11);
            int i14;
            int i15;
            int i16;
            this.f36724h = eVar;
            int i17 = eVar.f36775s0 ? 24 : 16;
            boolean z11 = true;
            this.f36729m = eVar.f36771o0 && (i13 & i17) != 0;
            this.f36723g = n.Y(this.f36824d.f28233d);
            this.f36725i = v0.p(i12, false);
            int i18 = 0;
            while (true) {
                i14 = Integer.MAX_VALUE;
                if (i18 >= eVar.f28000n.size()) {
                    i15 = 0;
                    i18 = Integer.MAX_VALUE;
                    break;
                }
                i15 = n.H(this.f36824d, eVar.f28000n.get(i18), false);
                if (i15 > 0) {
                    break;
                }
                i18++;
            }
            this.f36727k = i18;
            this.f36726j = i15;
            this.f36728l = n.K(this.f36824d.f28235f, eVar.f28001o);
            C5807s sVar = this.f36824d;
            int i19 = sVar.f28235f;
            this.f36730n = i19 == 0 || (i19 & 1) != 0;
            this.f36733q = (sVar.f28234e & 1) != 0;
            this.f36740x = n.O(sVar);
            C5807s sVar2 = this.f36824d;
            int i20 = sVar2.f28219D;
            this.f36734r = i20;
            this.f36735s = sVar2.f28220E;
            int i21 = sVar2.f28239j;
            this.f36736t = i21;
            this.f36722f = (i21 == -1 || i21 <= eVar.f28003q) && (i20 == -1 || i20 <= eVar.f28002p) && mVar.apply(sVar2);
            String[] n02 = N.n0();
            int i22 = 0;
            while (true) {
                if (i22 >= n02.length) {
                    i16 = 0;
                    i22 = Integer.MAX_VALUE;
                    break;
                }
                i16 = n.H(this.f36824d, n02[i22], false);
                if (i16 > 0) {
                    break;
                }
                i22++;
            }
            this.f36731o = i22;
            this.f36732p = i16;
            int i23 = 0;
            while (true) {
                if (i23 < eVar.f28004r.size()) {
                    String str = this.f36824d.f28244o;
                    if (str != null && str.equals(eVar.f28004r.get(i23))) {
                        i14 = i23;
                        break;
                    }
                    i23++;
                } else {
                    break;
                }
            }
            this.f36737u = i14;
            this.f36738v = v0.o(i12) == 128;
            this.f36739w = v0.I(i12) != 64 ? false : z11;
            this.f36721e = v(i12, z10, i17);
        }

        public static int j(List<b> list, List<b> list2) {
            return ((b) Collections.max(list)).compareTo((b) Collections.max(list2));
        }

        public static C9967v<b> n(int i10, K k10, e eVar, int[] iArr, boolean z10, m<C5807s> mVar, int i11) {
            C9967v.a t10 = C9967v.t();
            K k11 = k10;
            for (int i12 = 0; i12 < k11.f27943a; i12++) {
                t10.a(new b(i10, k10, i12, eVar, iArr[i12], z10, mVar, i11));
            }
            return t10.k();
        }

        private int v(int i10, boolean z10, int i11) {
            if (!v0.p(i10, this.f36724h.f36777u0)) {
                return 0;
            }
            if (!this.f36722f && !this.f36724h.f36770n0) {
                return 0;
            }
            e eVar = this.f36724h;
            if (eVar.f28005s.f28017a == 2 && !n.Z(eVar, i10, this.f36824d)) {
                return 0;
            }
            if (v0.p(i10, false) && this.f36722f && this.f36824d.f28239j != -1) {
                e eVar2 = this.f36724h;
                return (eVar2.f28012z || eVar2.f28011y || (!eVar2.f36779w0 && z10) || eVar2.f28005s.f28017a == 2 || (i10 & i11) == 0) ? 1 : 2;
            }
        }

        /* renamed from: B */
        public boolean b(b bVar) {
            int i10;
            String str;
            int i11;
            if ((this.f36724h.f36773q0 || ((i11 = this.f36824d.f28219D) != -1 && i11 == bVar.f36824d.f28219D)) && (this.f36729m || ((str = this.f36824d.f28244o) != null && TextUtils.equals(str, bVar.f36824d.f28244o)))) {
                e eVar = this.f36724h;
                if ((eVar.f36772p0 || ((i10 = this.f36824d.f28220E) != -1 && i10 == bVar.f36824d.f28220E)) && (eVar.f36774r0 || (this.f36738v == bVar.f36738v && this.f36739w == bVar.f36739w))) {
                    return true;
                }
            }
            return false;
        }

        public int a() {
            return this.f36721e;
        }

        /* renamed from: m */
        public int compareTo(b bVar) {
            C9935O g10 = (!this.f36722f || !this.f36725i) ? n.f36713k.g() : n.f36713k;
            C9959n f10 = C9959n.j().g(this.f36725i, bVar.f36725i).f(Integer.valueOf(this.f36727k), Integer.valueOf(bVar.f36727k), C9935O.d().g()).d(this.f36726j, bVar.f36726j).d(this.f36728l, bVar.f36728l).g(this.f36733q, bVar.f36733q).g(this.f36730n, bVar.f36730n).f(Integer.valueOf(this.f36731o), Integer.valueOf(bVar.f36731o), C9935O.d().g()).d(this.f36732p, bVar.f36732p).g(this.f36722f, bVar.f36722f).f(Integer.valueOf(this.f36737u), Integer.valueOf(bVar.f36737u), C9935O.d().g());
            if (this.f36724h.f28011y) {
                f10 = f10.f(Integer.valueOf(this.f36736t), Integer.valueOf(bVar.f36736t), n.f36713k.g());
            }
            C9959n f11 = f10.g(this.f36738v, bVar.f36738v).g(this.f36739w, bVar.f36739w).g(this.f36740x, bVar.f36740x).f(Integer.valueOf(this.f36734r), Integer.valueOf(bVar.f36734r), g10).f(Integer.valueOf(this.f36735s), Integer.valueOf(bVar.f36735s), g10);
            if (N.d(this.f36723g, bVar.f36723g)) {
                f11 = f11.f(Integer.valueOf(this.f36736t), Integer.valueOf(bVar.f36736t), g10);
            }
            return f11.i();
        }
    }

    private static final class c extends i<c> implements Comparable<c> {

        /* renamed from: e  reason: collision with root package name */
        private final int f36741e;

        /* renamed from: f  reason: collision with root package name */
        private final int f36742f = this.f36824d.e();

        public c(int i10, K k10, int i11, e eVar, int i12) {
            super(i10, k10, i11);
            this.f36741e = v0.p(i12, eVar.f36777u0) ? 1 : 0;
        }

        public static int j(List<c> list, List<c> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static C9967v<c> n(int i10, K k10, e eVar, int[] iArr) {
            C9967v.a t10 = C9967v.t();
            for (int i11 = 0; i11 < k10.f27943a; i11++) {
                t10.a(new c(i10, k10, i11, eVar, iArr[i11]));
            }
            return t10.k();
        }

        public int a() {
            return this.f36741e;
        }

        /* renamed from: m */
        public int compareTo(c cVar) {
            return Integer.compare(this.f36742f, cVar.f36742f);
        }

        /* renamed from: v */
        public boolean b(c cVar) {
            return false;
        }
    }

    private static final class d implements Comparable<d> {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f36743a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f36744b;

        public d(C5807s sVar, int i10) {
            this.f36743a = (sVar.f28234e & 1) == 0 ? false : true;
            this.f36744b = v0.p(i10, false);
        }

        /* renamed from: a */
        public int compareTo(d dVar) {
            return C9959n.j().g(this.f36744b, dVar.f36744b).g(this.f36743a, dVar.f36743a).i();
        }
    }

    public static final class e extends M {

        /* renamed from: A0  reason: collision with root package name */
        public static final e f36745A0;
        @Deprecated

        /* renamed from: B0  reason: collision with root package name */
        public static final e f36746B0;

        /* renamed from: C0  reason: collision with root package name */
        private static final String f36747C0 = N.A0(1000);

        /* renamed from: D0  reason: collision with root package name */
        private static final String f36748D0 = N.A0(1001);

        /* renamed from: E0  reason: collision with root package name */
        private static final String f36749E0 = N.A0(CashAppPayProcessorActivity.RESULT_ERROR);

        /* renamed from: F0  reason: collision with root package name */
        private static final String f36750F0 = N.A0(AffirmProcessorActivity.RESULT_CODE_ERROR);

        /* renamed from: G0  reason: collision with root package name */
        private static final String f36751G0 = N.A0(1004);

        /* renamed from: H0  reason: collision with root package name */
        private static final String f36752H0 = N.A0(1005);

        /* renamed from: I0  reason: collision with root package name */
        private static final String f36753I0 = N.A0(1006);

        /* renamed from: J0  reason: collision with root package name */
        private static final String f36754J0 = N.A0(1007);

        /* renamed from: K0  reason: collision with root package name */
        private static final String f36755K0 = N.A0(1008);

        /* renamed from: L0  reason: collision with root package name */
        private static final String f36756L0 = N.A0(1009);

        /* renamed from: M0  reason: collision with root package name */
        private static final String f36757M0 = N.A0(1010);

        /* renamed from: N0  reason: collision with root package name */
        private static final String f36758N0 = N.A0(1011);

        /* renamed from: O0  reason: collision with root package name */
        private static final String f36759O0 = N.A0(1012);

        /* renamed from: P0  reason: collision with root package name */
        private static final String f36760P0 = N.A0(1013);

        /* renamed from: Q0  reason: collision with root package name */
        private static final String f36761Q0 = N.A0(1014);

        /* renamed from: R0  reason: collision with root package name */
        private static final String f36762R0 = N.A0(1015);

        /* renamed from: S0  reason: collision with root package name */
        private static final String f36763S0 = N.A0(1016);

        /* renamed from: T0  reason: collision with root package name */
        private static final String f36764T0 = N.A0(1017);

        /* renamed from: U0  reason: collision with root package name */
        private static final String f36765U0 = N.A0(1018);

        /* renamed from: j0  reason: collision with root package name */
        public final boolean f36766j0;

        /* renamed from: k0  reason: collision with root package name */
        public final boolean f36767k0;

        /* renamed from: l0  reason: collision with root package name */
        public final boolean f36768l0;

        /* renamed from: m0  reason: collision with root package name */
        public final boolean f36769m0;

        /* renamed from: n0  reason: collision with root package name */
        public final boolean f36770n0;

        /* renamed from: o0  reason: collision with root package name */
        public final boolean f36771o0;

        /* renamed from: p0  reason: collision with root package name */
        public final boolean f36772p0;

        /* renamed from: q0  reason: collision with root package name */
        public final boolean f36773q0;

        /* renamed from: r0  reason: collision with root package name */
        public final boolean f36774r0;

        /* renamed from: s0  reason: collision with root package name */
        public final boolean f36775s0;

        /* renamed from: t0  reason: collision with root package name */
        public final boolean f36776t0;

        /* renamed from: u0  reason: collision with root package name */
        public final boolean f36777u0;

        /* renamed from: v0  reason: collision with root package name */
        public final boolean f36778v0;

        /* renamed from: w0  reason: collision with root package name */
        public final boolean f36779w0;

        /* renamed from: x0  reason: collision with root package name */
        public final boolean f36780x0;
        /* access modifiers changed from: private */

        /* renamed from: y0  reason: collision with root package name */
        public final SparseArray<Map<k0, f>> f36781y0;
        /* access modifiers changed from: private */

        /* renamed from: z0  reason: collision with root package name */
        public final SparseBooleanArray f36782z0;

        public static final class a extends M.c {
            /* access modifiers changed from: private */

            /* renamed from: C  reason: collision with root package name */
            public boolean f36783C;
            /* access modifiers changed from: private */

            /* renamed from: D  reason: collision with root package name */
            public boolean f36784D;
            /* access modifiers changed from: private */

            /* renamed from: E  reason: collision with root package name */
            public boolean f36785E;
            /* access modifiers changed from: private */

            /* renamed from: F  reason: collision with root package name */
            public boolean f36786F;
            /* access modifiers changed from: private */

            /* renamed from: G  reason: collision with root package name */
            public boolean f36787G;
            /* access modifiers changed from: private */

            /* renamed from: H  reason: collision with root package name */
            public boolean f36788H;
            /* access modifiers changed from: private */

            /* renamed from: I  reason: collision with root package name */
            public boolean f36789I;
            /* access modifiers changed from: private */

            /* renamed from: J  reason: collision with root package name */
            public boolean f36790J;
            /* access modifiers changed from: private */

            /* renamed from: K  reason: collision with root package name */
            public boolean f36791K;
            /* access modifiers changed from: private */

            /* renamed from: L  reason: collision with root package name */
            public boolean f36792L;
            /* access modifiers changed from: private */

            /* renamed from: M  reason: collision with root package name */
            public boolean f36793M;
            /* access modifiers changed from: private */

            /* renamed from: N  reason: collision with root package name */
            public boolean f36794N;
            /* access modifiers changed from: private */

            /* renamed from: O  reason: collision with root package name */
            public boolean f36795O;
            /* access modifiers changed from: private */

            /* renamed from: P  reason: collision with root package name */
            public boolean f36796P;
            /* access modifiers changed from: private */

            /* renamed from: Q  reason: collision with root package name */
            public boolean f36797Q;
            /* access modifiers changed from: private */

            /* renamed from: R  reason: collision with root package name */
            public final SparseArray<Map<k0, f>> f36798R;
            /* access modifiers changed from: private */

            /* renamed from: S  reason: collision with root package name */
            public final SparseBooleanArray f36799S;

            private static SparseArray<Map<k0, f>> j0(SparseArray<Map<k0, f>> sparseArray) {
                SparseArray<Map<k0, f>> sparseArray2 = new SparseArray<>();
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    sparseArray2.put(sparseArray.keyAt(i10), new HashMap(sparseArray.valueAt(i10)));
                }
                return sparseArray2;
            }

            private void k0() {
                this.f36783C = true;
                this.f36784D = false;
                this.f36785E = true;
                this.f36786F = false;
                this.f36787G = true;
                this.f36788H = false;
                this.f36789I = false;
                this.f36790J = false;
                this.f36791K = false;
                this.f36792L = true;
                this.f36793M = true;
                this.f36794N = true;
                this.f36795O = false;
                this.f36796P = true;
                this.f36797Q = false;
            }

            /* renamed from: h0 */
            public e C() {
                return new e(this);
            }

            /* renamed from: i0 */
            public a D(int i10) {
                super.D(i10);
                return this;
            }

            /* access modifiers changed from: protected */
            public a l0(M m10) {
                super.G(m10);
                return this;
            }

            /* renamed from: m0 */
            public a H(int i10) {
                super.H(i10);
                return this;
            }

            /* renamed from: n0 */
            public a I(L l10) {
                super.I(l10);
                return this;
            }

            /* renamed from: o0 */
            public a J(String str) {
                super.J(str);
                return this;
            }

            /* renamed from: p0 */
            public a K(Context context) {
                super.K(context);
                return this;
            }

            /* renamed from: q0 */
            public a L(String... strArr) {
                super.L(strArr);
                return this;
            }

            /* renamed from: r0 */
            public a M(int i10) {
                super.M(i10);
                return this;
            }

            /* renamed from: s0 */
            public a N(int i10, boolean z10) {
                super.N(i10, z10);
                return this;
            }

            /* renamed from: t0 */
            public a O(int i10, int i11, boolean z10) {
                super.O(i10, i11, z10);
                return this;
            }

            /* renamed from: u0 */
            public a P(Context context, boolean z10) {
                super.P(context, z10);
                return this;
            }

            @Deprecated
            public a() {
                this.f36798R = new SparseArray<>();
                this.f36799S = new SparseBooleanArray();
                k0();
            }

            public a(Context context) {
                super(context);
                this.f36798R = new SparseArray<>();
                this.f36799S = new SparseBooleanArray();
                k0();
            }

            private a(e eVar) {
                super((M) eVar);
                this.f36783C = eVar.f36766j0;
                this.f36784D = eVar.f36767k0;
                this.f36785E = eVar.f36768l0;
                this.f36786F = eVar.f36769m0;
                this.f36787G = eVar.f36770n0;
                this.f36788H = eVar.f36771o0;
                this.f36789I = eVar.f36772p0;
                this.f36790J = eVar.f36773q0;
                this.f36791K = eVar.f36774r0;
                this.f36792L = eVar.f36775s0;
                this.f36793M = eVar.f36776t0;
                this.f36794N = eVar.f36777u0;
                this.f36795O = eVar.f36778v0;
                this.f36796P = eVar.f36779w0;
                this.f36797Q = eVar.f36780x0;
                this.f36798R = j0(eVar.f36781y0);
                this.f36799S = eVar.f36782z0.clone();
            }
        }

        static {
            e h02 = new a().C();
            f36745A0 = h02;
            f36746B0 = h02;
        }

        private static boolean d(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean e(SparseArray<Map<k0, f>> sparseArray, SparseArray<Map<k0, f>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (indexOfKey < 0 || !f(sparseArray.valueAt(i10), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:6:0x001a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static boolean f(java.util.Map<G3.k0, I3.n.f> r4, java.util.Map<G3.k0, I3.n.f> r5) {
            /*
                int r0 = r4.size()
                int r1 = r5.size()
                r2 = 0
                if (r1 == r0) goto L_0x000c
                return r2
            L_0x000c:
                java.util.Set r4 = r4.entrySet()
                java.util.Iterator r4 = r4.iterator()
            L_0x0014:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L_0x003b
                java.lang.Object r0 = r4.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                G3.k0 r1 = (G3.k0) r1
                boolean r3 = r5.containsKey(r1)
                if (r3 == 0) goto L_0x003a
                java.lang.Object r0 = r0.getValue()
                java.lang.Object r1 = r5.get(r1)
                boolean r0 = t3.N.d(r0, r1)
                if (r0 != 0) goto L_0x0014
            L_0x003a:
                return r2
            L_0x003b:
                r4 = 1
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: I3.n.e.f(java.util.Map, java.util.Map):boolean");
        }

        public static e h(Context context) {
            return new a(context).C();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return super.equals(eVar) && this.f36766j0 == eVar.f36766j0 && this.f36767k0 == eVar.f36767k0 && this.f36768l0 == eVar.f36768l0 && this.f36769m0 == eVar.f36769m0 && this.f36770n0 == eVar.f36770n0 && this.f36771o0 == eVar.f36771o0 && this.f36772p0 == eVar.f36772p0 && this.f36773q0 == eVar.f36773q0 && this.f36774r0 == eVar.f36774r0 && this.f36775s0 == eVar.f36775s0 && this.f36776t0 == eVar.f36776t0 && this.f36777u0 == eVar.f36777u0 && this.f36778v0 == eVar.f36778v0 && this.f36779w0 == eVar.f36779w0 && this.f36780x0 == eVar.f36780x0 && d(this.f36782z0, eVar.f36782z0) && e(this.f36781y0, eVar.f36781y0);
        }

        /* renamed from: g */
        public a a() {
            return new a();
        }

        public int hashCode() {
            return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f36766j0 ? 1 : 0)) * 31) + (this.f36767k0 ? 1 : 0)) * 31) + (this.f36768l0 ? 1 : 0)) * 31) + (this.f36769m0 ? 1 : 0)) * 31) + (this.f36770n0 ? 1 : 0)) * 31) + (this.f36771o0 ? 1 : 0)) * 31) + (this.f36772p0 ? 1 : 0)) * 31) + (this.f36773q0 ? 1 : 0)) * 31) + (this.f36774r0 ? 1 : 0)) * 31) + (this.f36775s0 ? 1 : 0)) * 31) + (this.f36776t0 ? 1 : 0)) * 31) + (this.f36777u0 ? 1 : 0)) * 31) + (this.f36778v0 ? 1 : 0)) * 31) + (this.f36779w0 ? 1 : 0)) * 31) + (this.f36780x0 ? 1 : 0);
        }

        public boolean i(int i10) {
            return this.f36782z0.get(i10);
        }

        @Deprecated
        public f j(int i10, k0 k0Var) {
            Map map = this.f36781y0.get(i10);
            if (map != null) {
                return (f) map.get(k0Var);
            }
            return null;
        }

        @Deprecated
        public boolean k(int i10, k0 k0Var) {
            Map map = this.f36781y0.get(i10);
            return map != null && map.containsKey(k0Var);
        }

        private e(a aVar) {
            super(aVar);
            this.f36766j0 = aVar.f36783C;
            this.f36767k0 = aVar.f36784D;
            this.f36768l0 = aVar.f36785E;
            this.f36769m0 = aVar.f36786F;
            this.f36770n0 = aVar.f36787G;
            this.f36771o0 = aVar.f36788H;
            this.f36772p0 = aVar.f36789I;
            this.f36773q0 = aVar.f36790J;
            this.f36774r0 = aVar.f36791K;
            this.f36775s0 = aVar.f36792L;
            this.f36776t0 = aVar.f36793M;
            this.f36777u0 = aVar.f36794N;
            this.f36778v0 = aVar.f36795O;
            this.f36779w0 = aVar.f36796P;
            this.f36780x0 = aVar.f36797Q;
            this.f36781y0 = aVar.f36798R;
            this.f36782z0 = aVar.f36799S;
        }
    }

    public static final class f {

        /* renamed from: d  reason: collision with root package name */
        private static final String f36800d = N.A0(0);

        /* renamed from: e  reason: collision with root package name */
        private static final String f36801e = N.A0(1);

        /* renamed from: f  reason: collision with root package name */
        private static final String f36802f = N.A0(2);

        /* renamed from: a  reason: collision with root package name */
        public final int f36803a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f36804b;

        /* renamed from: c  reason: collision with root package name */
        public final int f36805c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || f.class != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            return this.f36803a == fVar.f36803a && Arrays.equals(this.f36804b, fVar.f36804b) && this.f36805c == fVar.f36805c;
        }

        public int hashCode() {
            return (((this.f36803a * 31) + Arrays.hashCode(this.f36804b)) * 31) + this.f36805c;
        }
    }

    private static class g {

        /* renamed from: a  reason: collision with root package name */
        private final Spatializer f36806a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f36807b;

        /* renamed from: c  reason: collision with root package name */
        private Handler f36808c;

        /* renamed from: d  reason: collision with root package name */
        private Spatializer$OnSpatializerStateChangedListener f36809d;

        class a implements Spatializer$OnSpatializerStateChangedListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ n f36810a;

            a(n nVar) {
                this.f36810a = nVar;
            }

            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
                this.f36810a.W();
            }

            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
                this.f36810a.W();
            }
        }

        private g(Spatializer spatializer) {
            this.f36806a = spatializer;
            this.f36807b = spatializer.getImmersiveAudioLevel() != 0;
        }

        public static g g(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            return new g(audioManager.getSpatializer());
        }

        public boolean a(C5792c cVar, C5807s sVar) {
            int i10;
            if (Objects.equals(sVar.f28244o, "audio/eac3-joc")) {
                i10 = sVar.f28219D;
                if (i10 == 16) {
                    i10 = 12;
                }
            } else if (Objects.equals(sVar.f28244o, "audio/iamf")) {
                i10 = sVar.f28219D;
                if (i10 == -1) {
                    i10 = 6;
                }
            } else if (Objects.equals(sVar.f28244o, "audio/ac4")) {
                i10 = sVar.f28219D;
                if (i10 == 18 || i10 == 21) {
                    i10 = 24;
                }
            } else {
                i10 = sVar.f28219D;
            }
            int M10 = N.M(i10);
            if (M10 == 0) {
                return false;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(M10);
            int i11 = sVar.f28220E;
            if (i11 != -1) {
                channelMask.setSampleRate(i11);
            }
            return this.f36806a.canBeSpatialized(cVar.a().f28120a, channelMask.build());
        }

        public void b(n nVar, Looper looper) {
            if (this.f36809d == null && this.f36808c == null) {
                this.f36809d = new a(nVar);
                Handler handler = new Handler(looper);
                this.f36808c = handler;
                Spatializer spatializer = this.f36806a;
                Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new T(handler), this.f36809d);
            }
        }

        public boolean c() {
            return this.f36806a.isAvailable();
        }

        public boolean d() {
            return this.f36806a.isEnabled();
        }

        public boolean e() {
            return this.f36807b;
        }

        public void f() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.f36809d;
            if (spatializer$OnSpatializerStateChangedListener != null && this.f36808c != null) {
                this.f36806a.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
                ((Handler) N.i(this.f36808c)).removeCallbacksAndMessages((Object) null);
                this.f36808c = null;
                this.f36809d = null;
            }
        }
    }

    private static final class h extends i<h> implements Comparable<h> {

        /* renamed from: e  reason: collision with root package name */
        private final int f36812e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f36813f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f36814g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f36815h;

        /* renamed from: i  reason: collision with root package name */
        private final int f36816i;

        /* renamed from: j  reason: collision with root package name */
        private final int f36817j;

        /* renamed from: k  reason: collision with root package name */
        private final int f36818k;

        /* renamed from: l  reason: collision with root package name */
        private final int f36819l;

        /* renamed from: m  reason: collision with root package name */
        private final boolean f36820m;

        public h(int i10, K k10, int i11, e eVar, int i12, String str) {
            super(i10, k10, i11);
            int i13;
            int i14 = 0;
            this.f36813f = v0.p(i12, false);
            int i15 = this.f36824d.f28234e & (~eVar.f28008v);
            this.f36814g = (i15 & 1) != 0;
            this.f36815h = (i15 & 2) != 0;
            C9967v<String> F10 = eVar.f28006t.isEmpty() ? C9967v.F("") : eVar.f28006t;
            int i16 = 0;
            while (true) {
                if (i16 >= F10.size()) {
                    i16 = Integer.MAX_VALUE;
                    i13 = 0;
                    break;
                }
                i13 = n.H(this.f36824d, F10.get(i16), eVar.f28009w);
                if (i13 > 0) {
                    break;
                }
                i16++;
            }
            this.f36816i = i16;
            this.f36817j = i13;
            int y10 = n.K(this.f36824d.f28235f, eVar.f28007u);
            this.f36818k = y10;
            this.f36820m = (this.f36824d.f28235f & 1088) != 0;
            int H10 = n.H(this.f36824d, str, n.Y(str) == null);
            this.f36819l = H10;
            boolean z10 = i13 > 0 || (eVar.f28006t.isEmpty() && y10 > 0) || this.f36814g || (this.f36815h && H10 > 0);
            if (v0.p(i12, eVar.f36777u0) && z10) {
                i14 = 1;
            }
            this.f36812e = i14;
        }

        public static int j(List<h> list, List<h> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static C9967v<h> n(int i10, K k10, e eVar, int[] iArr, String str) {
            C9967v.a t10 = C9967v.t();
            for (int i11 = 0; i11 < k10.f27943a; i11++) {
                t10.a(new h(i10, k10, i11, eVar, iArr[i11], str));
            }
            return t10.k();
        }

        public int a() {
            return this.f36812e;
        }

        /* renamed from: m */
        public int compareTo(h hVar) {
            C9959n d10 = C9959n.j().g(this.f36813f, hVar.f36813f).f(Integer.valueOf(this.f36816i), Integer.valueOf(hVar.f36816i), C9935O.d().g()).d(this.f36817j, hVar.f36817j).d(this.f36818k, hVar.f36818k).g(this.f36814g, hVar.f36814g).f(Boolean.valueOf(this.f36815h), Boolean.valueOf(hVar.f36815h), this.f36817j == 0 ? C9935O.d() : C9935O.d().g()).d(this.f36819l, hVar.f36819l);
            if (this.f36818k == 0) {
                d10 = d10.h(this.f36820m, hVar.f36820m);
            }
            return d10.i();
        }

        /* renamed from: v */
        public boolean b(h hVar) {
            return false;
        }
    }

    private static abstract class i<T extends i<T>> {

        /* renamed from: a  reason: collision with root package name */
        public final int f36821a;

        /* renamed from: b  reason: collision with root package name */
        public final K f36822b;

        /* renamed from: c  reason: collision with root package name */
        public final int f36823c;

        /* renamed from: d  reason: collision with root package name */
        public final C5807s f36824d;

        public interface a<T extends i<T>> {
            List<T> a(int i10, K k10, int[] iArr);
        }

        public i(int i10, K k10, int i11) {
            this.f36821a = i10;
            this.f36822b = k10;
            this.f36823c = i11;
            this.f36824d = k10.a(i11);
        }

        public abstract int a();

        public abstract boolean b(T t10);
    }

    private static final class j extends i<j> {

        /* renamed from: e  reason: collision with root package name */
        private final boolean f36825e;

        /* renamed from: f  reason: collision with root package name */
        private final e f36826f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f36827g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f36828h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f36829i;

        /* renamed from: j  reason: collision with root package name */
        private final int f36830j;

        /* renamed from: k  reason: collision with root package name */
        private final int f36831k;

        /* renamed from: l  reason: collision with root package name */
        private final int f36832l;

        /* renamed from: m  reason: collision with root package name */
        private final int f36833m;

        /* renamed from: n  reason: collision with root package name */
        private final boolean f36834n;

        /* renamed from: o  reason: collision with root package name */
        private final boolean f36835o;

        /* renamed from: p  reason: collision with root package name */
        private final int f36836p;

        /* renamed from: q  reason: collision with root package name */
        private final boolean f36837q;

        /* renamed from: r  reason: collision with root package name */
        private final boolean f36838r;

        /* renamed from: s  reason: collision with root package name */
        private final int f36839s;

        /* JADX WARNING: Removed duplicated region for block: B:54:0x0090  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0092  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x00b5  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x00b7  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x00c3  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x00e6  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x00e8  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x00f3  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x00d9 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public j(int r5, q3.K r6, int r7, I3.n.e r8, int r9, int r10, boolean r11) {
            /*
                r4 = this;
                r4.<init>(r5, r6, r7)
                r4.f36826f = r8
                boolean r5 = r8.f36768l0
                if (r5 == 0) goto L_0x000c
                r5 = 24
                goto L_0x000e
            L_0x000c:
                r5 = 16
            L_0x000e:
                boolean r6 = r8.f36767k0
                r7 = 0
                r0 = 1
                if (r6 == 0) goto L_0x001a
                r6 = r10 & r5
                if (r6 == 0) goto L_0x001a
                r6 = r0
                goto L_0x001b
            L_0x001a:
                r6 = r7
            L_0x001b:
                r4.f36835o = r6
                r6 = -1082130432(0xffffffffbf800000, float:-1.0)
                r10 = -1
                if (r11 == 0) goto L_0x004b
                q3.s r1 = r4.f36824d
                int r2 = r1.f28251v
                if (r2 == r10) goto L_0x002c
                int r3 = r8.f27987a
                if (r2 > r3) goto L_0x004b
            L_0x002c:
                int r2 = r1.f28252w
                if (r2 == r10) goto L_0x0034
                int r3 = r8.f27988b
                if (r2 > r3) goto L_0x004b
            L_0x0034:
                float r2 = r1.f28253x
                int r3 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r3 == 0) goto L_0x0041
                int r3 = r8.f27989c
                float r3 = (float) r3
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 > 0) goto L_0x004b
            L_0x0041:
                int r1 = r1.f28239j
                if (r1 == r10) goto L_0x0049
                int r2 = r8.f27990d
                if (r1 > r2) goto L_0x004b
            L_0x0049:
                r1 = r0
                goto L_0x004c
            L_0x004b:
                r1 = r7
            L_0x004c:
                r4.f36825e = r1
                if (r11 == 0) goto L_0x0079
                q3.s r11 = r4.f36824d
                int r1 = r11.f28251v
                if (r1 == r10) goto L_0x005a
                int r2 = r8.f27991e
                if (r1 < r2) goto L_0x0079
            L_0x005a:
                int r1 = r11.f28252w
                if (r1 == r10) goto L_0x0062
                int r2 = r8.f27992f
                if (r1 < r2) goto L_0x0079
            L_0x0062:
                float r1 = r11.f28253x
                int r2 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r2 == 0) goto L_0x006f
                int r2 = r8.f27993g
                float r2 = (float) r2
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 < 0) goto L_0x0079
            L_0x006f:
                int r11 = r11.f28239j
                if (r11 == r10) goto L_0x0077
                int r10 = r8.f27994h
                if (r11 < r10) goto L_0x0079
            L_0x0077:
                r10 = r0
                goto L_0x007a
            L_0x0079:
                r10 = r7
            L_0x007a:
                r4.f36827g = r10
                boolean r10 = androidx.media3.exoplayer.v0.p(r9, r7)
                r4.f36828h = r10
                q3.s r10 = r4.f36824d
                float r11 = r10.f28253x
                int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
                if (r6 == 0) goto L_0x0092
                r6 = 1092616192(0x41200000, float:10.0)
                int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
                if (r6 < 0) goto L_0x0092
                r6 = r0
                goto L_0x0093
            L_0x0092:
                r6 = r7
            L_0x0093:
                r4.f36829i = r6
                int r6 = r10.f28239j
                r4.f36830j = r6
                int r6 = r10.e()
                r4.f36831k = r6
                q3.s r6 = r4.f36824d
                int r6 = r6.f28235f
                int r10 = r8.f27999m
                int r6 = I3.n.K(r6, r10)
                r4.f36833m = r6
                q3.s r6 = r4.f36824d
                int r6 = r6.f28235f
                if (r6 == 0) goto L_0x00b7
                r6 = r6 & r0
                if (r6 == 0) goto L_0x00b5
                goto L_0x00b7
            L_0x00b5:
                r6 = r7
                goto L_0x00b8
            L_0x00b7:
                r6 = r0
            L_0x00b8:
                r4.f36834n = r6
                r6 = r7
            L_0x00bb:
                kb.v<java.lang.String> r10 = r8.f27998l
                int r10 = r10.size()
                if (r6 >= r10) goto L_0x00d9
                q3.s r10 = r4.f36824d
                java.lang.String r10 = r10.f28244o
                if (r10 == 0) goto L_0x00d6
                kb.v<java.lang.String> r11 = r8.f27998l
                java.lang.Object r11 = r11.get(r6)
                boolean r10 = r10.equals(r11)
                if (r10 == 0) goto L_0x00d6
                goto L_0x00dc
            L_0x00d6:
                int r6 = r6 + 1
                goto L_0x00bb
            L_0x00d9:
                r6 = 2147483647(0x7fffffff, float:NaN)
            L_0x00dc:
                r4.f36832l = r6
                int r6 = androidx.media3.exoplayer.v0.o(r9)
                r8 = 128(0x80, float:1.794E-43)
                if (r6 != r8) goto L_0x00e8
                r6 = r0
                goto L_0x00e9
            L_0x00e8:
                r6 = r7
            L_0x00e9:
                r4.f36837q = r6
                int r6 = androidx.media3.exoplayer.v0.I(r9)
                r8 = 64
                if (r6 != r8) goto L_0x00f4
                r7 = r0
            L_0x00f4:
                r4.f36838r = r7
                q3.s r6 = r4.f36824d
                java.lang.String r6 = r6.f28244o
                int r6 = I3.n.L(r6)
                r4.f36839s = r6
                int r5 = r4.D(r9, r5)
                r4.f36836p = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: I3.n.j.<init>(int, q3.K, int, I3.n$e, int, int, boolean):void");
        }

        public static int B(List<j> list, List<j> list2) {
            return C9959n.j().f((j) Collections.max(list, new v()), (j) Collections.max(list2, new v()), new v()).d(list.size(), list2.size()).f((j) Collections.max(list, new w()), (j) Collections.max(list2, new w()), new w()).i();
        }

        public static C9967v<j> C(int i10, K k10, e eVar, int[] iArr, int i11) {
            K k11 = k10;
            e eVar2 = eVar;
            int x10 = n.I(k11, eVar2.f27995i, eVar2.f27996j, eVar2.f27997k);
            C9967v.a t10 = C9967v.t();
            for (int i12 = 0; i12 < k11.f27943a; i12++) {
                int e10 = k11.a(i12).e();
                t10.a(new j(i10, k10, i12, eVar, iArr[i12], i11, x10 == Integer.MAX_VALUE || (e10 != -1 && e10 <= x10)));
            }
            return t10.k();
        }

        private int D(int i10, int i11) {
            if ((this.f36824d.f28235f & 16384) != 0 || !v0.p(i10, this.f36826f.f36777u0)) {
                return 0;
            }
            if (!this.f36825e && !this.f36826f.f36766j0) {
                return 0;
            }
            if (v0.p(i10, false) && this.f36827g && this.f36825e && this.f36824d.f28239j != -1) {
                e eVar = this.f36826f;
                return (eVar.f28012z || eVar.f28011y || (i10 & i11) == 0) ? 1 : 2;
            }
        }

        /* access modifiers changed from: private */
        public static int n(j jVar, j jVar2) {
            C9959n g10 = C9959n.j().g(jVar.f36828h, jVar2.f36828h).d(jVar.f36833m, jVar2.f36833m).g(jVar.f36834n, jVar2.f36834n).g(jVar.f36829i, jVar2.f36829i).g(jVar.f36825e, jVar2.f36825e).g(jVar.f36827g, jVar2.f36827g).f(Integer.valueOf(jVar.f36832l), Integer.valueOf(jVar2.f36832l), C9935O.d().g()).g(jVar.f36837q, jVar2.f36837q).g(jVar.f36838r, jVar2.f36838r);
            if (jVar.f36837q && jVar.f36838r) {
                g10 = g10.d(jVar.f36839s, jVar2.f36839s);
            }
            return g10.i();
        }

        /* access modifiers changed from: private */
        public static int v(j jVar, j jVar2) {
            C9935O g10 = (!jVar.f36825e || !jVar.f36828h) ? n.f36713k.g() : n.f36713k;
            C9959n j10 = C9959n.j();
            if (jVar.f36826f.f28011y) {
                j10 = j10.f(Integer.valueOf(jVar.f36830j), Integer.valueOf(jVar2.f36830j), n.f36713k.g());
            }
            return j10.f(Integer.valueOf(jVar.f36831k), Integer.valueOf(jVar2.f36831k), g10).f(Integer.valueOf(jVar.f36830j), Integer.valueOf(jVar2.f36830j), g10).i();
        }

        /* renamed from: E */
        public boolean b(j jVar) {
            return (this.f36835o || N.d(this.f36824d.f28244o, jVar.f36824d.f28244o)) && (this.f36826f.f36769m0 || (this.f36837q == jVar.f36837q && this.f36838r == jVar.f36838r));
        }

        public int a() {
            return this.f36836p;
        }
    }

    public n(Context context) {
        this(context, new C6553a.b());
    }

    private static void E(z.a aVar, e eVar, x.a[] aVarArr) {
        int d10 = aVar.d();
        for (int i10 = 0; i10 < d10; i10++) {
            k0 f10 = aVar.f(i10);
            if (eVar.k(i10, f10)) {
                f j10 = eVar.j(i10, f10);
                aVarArr[i10] = (j10 == null || j10.f36804b.length == 0) ? null : new x.a(f10.b(j10.f36803a), j10.f36804b, j10.f36805c);
            }
        }
    }

    private static void F(z.a aVar, M m10, x.a[] aVarArr) {
        int d10 = aVar.d();
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < d10; i10++) {
            G(aVar.f(i10), m10, hashMap);
        }
        G(aVar.h(), m10, hashMap);
        for (int i11 = 0; i11 < d10; i11++) {
            L l10 = (L) hashMap.get(Integer.valueOf(aVar.e(i11)));
            if (l10 != null) {
                aVarArr[i11] = (l10.f27951b.isEmpty() || aVar.f(i11).d(l10.f27950a) == -1) ? null : new x.a(l10.f27950a, C10076f.l(l10.f27951b));
            }
        }
    }

    private static void G(k0 k0Var, M m10, Map<Integer, L> map) {
        L l10;
        for (int i10 = 0; i10 < k0Var.f35939a; i10++) {
            L l11 = m10.f27985A.get(k0Var.b(i10));
            if (l11 != null && ((l10 = map.get(Integer.valueOf(l11.a()))) == null || (l10.f27951b.isEmpty() && !l11.f27951b.isEmpty()))) {
                map.put(Integer.valueOf(l11.a()), l11);
            }
        }
    }

    protected static int H(C5807s sVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(sVar.f28233d)) {
            return 4;
        }
        String Y10 = Y(str);
        String Y11 = Y(sVar.f28233d);
        if (Y11 == null || Y10 == null) {
            return (!z10 || Y11 != null) ? 0 : 1;
        }
        if (Y11.startsWith(Y10) || Y10.startsWith(Y11)) {
            return 3;
        }
        return N.i1(Y11, "-")[0].equals(N.i1(Y10, "-")[0]) ? 2 : 0;
    }

    /* access modifiers changed from: private */
    public static int I(K k10, int i10, int i11, boolean z10) {
        int i12;
        int i13 = Integer.MAX_VALUE;
        if (!(i10 == Integer.MAX_VALUE || i11 == Integer.MAX_VALUE)) {
            for (int i14 = 0; i14 < k10.f27943a; i14++) {
                C5807s a10 = k10.a(i14);
                int i15 = a10.f28251v;
                if (i15 > 0 && (i12 = a10.f28252w) > 0) {
                    Point c10 = B.c(z10, i10, i11, i15, i12);
                    int i16 = a10.f28251v;
                    int i17 = a10.f28252w;
                    int i18 = i16 * i17;
                    if (i16 >= ((int) (((float) c10.x) * 0.98f)) && i17 >= ((int) (((float) c10.y) * 0.98f)) && i18 < i13) {
                        i13 = i18;
                    }
                }
            }
        }
        return i13;
    }

    /* access modifiers changed from: private */
    public static int K(int i10, int i11) {
        if (i10 == 0 || i10 != i11) {
            return Integer.bitCount(i10 & i11);
        }
        return Integer.MAX_VALUE;
    }

    /* access modifiers changed from: private */
    public static int L(String str) {
        if (str == null) {
            return 0;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1851077871:
                if (str.equals("video/dolby-vision")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1662735862:
                if (str.equals("video/av01")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 5;
            case 1:
                return 4;
            case 2:
                return 3;
            case 3:
                return 1;
            case 4:
                return 2;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: private */
    public boolean M(C5807s sVar) {
        boolean z10;
        int i10;
        g gVar;
        g gVar2;
        synchronized (this.f36714d) {
            try {
                if (this.f36718h.f36776t0 && !this.f36717g && (i10 = sVar.f28219D) != -1 && i10 > 2) {
                    if (N(sVar)) {
                        if (N.f29462a >= 32 && (gVar2 = this.f36719i) != null && gVar2.e()) {
                        }
                    }
                    if (N.f29462a < 32 || (gVar = this.f36719i) == null || !gVar.e() || !this.f36719i.c() || !this.f36719i.d() || !this.f36719i.a(this.f36720j, sVar)) {
                        z10 = false;
                    }
                }
                z10 = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    private static boolean N(C5807s sVar) {
        String str = sVar.f28244o;
        if (str == null) {
            return false;
        }
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    /* access modifiers changed from: private */
    public static boolean O(C5807s sVar) {
        String str = sVar.f28244o;
        if (str == null) {
            return false;
        }
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1504698186:
                if (str.equals("audio/iamf")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
                return true;
            default:
                return false;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List P(e eVar, boolean z10, int[] iArr, int i10, K k10, int[] iArr2) {
        return b.n(i10, k10, eVar, iArr2, z10, new m(this), iArr[i10]);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int T(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    private static void U(e eVar, z.a aVar, int[][][] iArr, H[] hArr, x[] xVarArr) {
        int i10 = -1;
        boolean z10 = false;
        int i11 = 0;
        int i12 = 0;
        while (i11 < aVar.d()) {
            int e10 = aVar.e(i11);
            x xVar = xVarArr[i11];
            if (e10 == 1 || xVar == null) {
                if (e10 == 1 && xVar != null && xVar.length() == 1) {
                    if (Z(eVar, iArr[i11][aVar.f(i11).d(xVar.h())][xVar.b(0)], xVar.l())) {
                        i12++;
                        i10 = i11;
                    }
                }
                i11++;
            } else {
                return;
            }
        }
        if (i12 == 1) {
            int i13 = eVar.f28005s.f28018b ? 1 : 2;
            H h10 = hArr[i10];
            if (h10 != null && h10.f32390b) {
                z10 = true;
            }
            hArr[i10] = new H(i13, z10);
        }
    }

    private static void V(z.a aVar, int[][][] iArr, H[] hArr, x[] xVarArr) {
        boolean z10;
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            if (i12 >= aVar.d()) {
                z10 = true;
                break;
            }
            int e10 = aVar.e(i12);
            x xVar = xVarArr[i12];
            if ((e10 == 1 || e10 == 2) && xVar != null && a0(iArr[i12], aVar.f(i12), xVar)) {
                if (e10 == 1) {
                    if (i11 != -1) {
                        break;
                    }
                    i11 = i12;
                } else if (i10 != -1) {
                    break;
                } else {
                    i10 = i12;
                }
            }
            i12++;
        }
        z10 = false;
        if (z10 && ((i11 == -1 || i10 == -1) ? false : true)) {
            H h10 = new H(0, true);
            hArr[i11] = h10;
            hArr[i10] = h10;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        r1 = r3.f36719i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void W() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f36714d
            monitor-enter(r0)
            I3.n$e r1 = r3.f36718h     // Catch:{ all -> 0x001f }
            boolean r1 = r1.f36776t0     // Catch:{ all -> 0x001f }
            if (r1 == 0) goto L_0x0021
            boolean r1 = r3.f36717g     // Catch:{ all -> 0x001f }
            if (r1 != 0) goto L_0x0021
            int r1 = t3.N.f29462a     // Catch:{ all -> 0x001f }
            r2 = 32
            if (r1 < r2) goto L_0x0021
            I3.n$g r1 = r3.f36719i     // Catch:{ all -> 0x001f }
            if (r1 == 0) goto L_0x0021
            boolean r1 = r1.e()     // Catch:{ all -> 0x001f }
            if (r1 == 0) goto L_0x0021
            r1 = 1
            goto L_0x0022
        L_0x001f:
            r1 = move-exception
            goto L_0x0029
        L_0x0021:
            r1 = 0
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            if (r1 == 0) goto L_0x0028
            r3.f()
        L_0x0028:
            return
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.n.W():void");
    }

    private void X(u0 u0Var) {
        boolean z10;
        synchronized (this.f36714d) {
            z10 = this.f36718h.f36780x0;
        }
        if (z10) {
            g(u0Var);
        }
    }

    protected static String Y(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* access modifiers changed from: private */
    public static boolean Z(e eVar, int i10, C5807s sVar) {
        if (v0.B(i10) == 0) {
            return false;
        }
        if (eVar.f28005s.f28019c && (v0.B(i10) & RecyclerView.n.FLAG_MOVED) == 0) {
            return false;
        }
        if (!eVar.f28005s.f28018b) {
            return true;
        }
        return !(sVar.f28222G != 0 || sVar.f28223H != 0) || ((v0.B(i10) & 1024) != 0);
    }

    private static boolean a0(int[][] iArr, k0 k0Var, x xVar) {
        if (xVar == null) {
            return false;
        }
        int d10 = k0Var.d(xVar.h());
        for (int i10 = 0; i10 < xVar.length(); i10++) {
            if (v0.t(iArr[d10][xVar.b(i10)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private <T extends i<T>> Pair<x.a, Integer> g0(int i10, z.a aVar, int[][][] iArr, i.a<T> aVar2, Comparator<List<T>> comparator) {
        int i11;
        Object obj;
        z.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int d10 = aVar.d();
        int i12 = 0;
        while (i12 < d10) {
            if (i10 == aVar3.e(i12)) {
                k0 f10 = aVar3.f(i12);
                int i13 = 0;
                while (i13 < f10.f35939a) {
                    K b10 = f10.b(i13);
                    List<T> a10 = aVar2.a(i12, b10, iArr[i12][i13]);
                    boolean[] zArr = new boolean[b10.f27943a];
                    int i14 = 0;
                    while (i14 < b10.f27943a) {
                        i iVar = (i) a10.get(i14);
                        int a11 = iVar.a();
                        if (zArr[i14] || a11 == 0) {
                            i11 = d10;
                        } else {
                            if (a11 == 1) {
                                obj = C9967v.F(iVar);
                                i11 = d10;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(iVar);
                                int i15 = i14 + 1;
                                while (i15 < b10.f27943a) {
                                    i iVar2 = (i) a10.get(i15);
                                    int i16 = d10;
                                    if (iVar2.a() == 2 && iVar.b(iVar2)) {
                                        arrayList2.add(iVar2);
                                        zArr[i15] = true;
                                    }
                                    i15++;
                                    z.a aVar4 = aVar;
                                    d10 = i16;
                                }
                                i11 = d10;
                                obj = arrayList2;
                            }
                            arrayList.add(obj);
                        }
                        i14++;
                        z.a aVar5 = aVar;
                        d10 = i11;
                    }
                    int i17 = d10;
                    i13++;
                    z.a aVar6 = aVar;
                }
            }
            i.a<T> aVar7 = aVar2;
            i12++;
            aVar3 = aVar;
            d10 = d10;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i18 = 0; i18 < list.size(); i18++) {
            iArr2[i18] = ((i) list.get(i18)).f36823c;
        }
        i iVar3 = (i) list.get(0);
        return Pair.create(new x.a(iVar3.f36822b, iArr2), Integer.valueOf(iVar3.f36821a));
    }

    private void i0(e eVar) {
        boolean equals;
        C5950a.e(eVar);
        synchronized (this.f36714d) {
            equals = this.f36718h.equals(eVar);
            this.f36718h = eVar;
        }
        if (!equals) {
            if (eVar.f36776t0 && this.f36715e == null) {
                q.h("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            f();
        }
    }

    /* renamed from: J */
    public e c() {
        e eVar;
        synchronized (this.f36714d) {
            eVar = this.f36718h;
        }
        return eVar;
    }

    public void a(u0 u0Var) {
        X(u0Var);
    }

    /* access modifiers changed from: protected */
    public x.a[] b0(z.a aVar, int[][][] iArr, int[] iArr2, e eVar) {
        int d10 = aVar.d();
        x.a[] aVarArr = new x.a[d10];
        Pair<x.a, Integer> h02 = h0(aVar, iArr, iArr2, eVar);
        String str = null;
        Pair<x.a, Integer> d02 = (eVar.f28010x || h02 == null) ? d0(aVar, iArr, eVar) : null;
        if (d02 != null) {
            aVarArr[((Integer) d02.second).intValue()] = (x.a) d02.first;
        } else if (h02 != null) {
            aVarArr[((Integer) h02.second).intValue()] = (x.a) h02.first;
        }
        Pair<x.a, Integer> c02 = c0(aVar, iArr, iArr2, eVar);
        if (c02 != null) {
            aVarArr[((Integer) c02.second).intValue()] = (x.a) c02.first;
        }
        if (c02 != null) {
            Object obj = c02.first;
            str = ((x.a) obj).f36840a.a(((x.a) obj).f36841b[0]).f28233d;
        }
        Pair<x.a, Integer> f02 = f0(aVar, iArr, eVar, str);
        if (f02 != null) {
            aVarArr[((Integer) f02.second).intValue()] = (x.a) f02.first;
        }
        for (int i10 = 0; i10 < d10; i10++) {
            int e10 = aVar.e(i10);
            if (!(e10 == 2 || e10 == 1 || e10 == 3 || e10 == 4)) {
                aVarArr[i10] = e0(e10, aVar.f(i10), iArr[i10], eVar);
            }
        }
        return aVarArr;
    }

    /* access modifiers changed from: protected */
    public Pair<x.a, Integer> c0(z.a aVar, int[][][] iArr, int[] iArr2, e eVar) {
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < aVar.d()) {
                if (2 == aVar.e(i10) && aVar.f(i10).f35939a > 0) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        return g0(1, aVar, iArr, new g(this, eVar, z10, iArr2), new h());
    }

    public v0.a d() {
        return this;
    }

    /* access modifiers changed from: protected */
    public Pair<x.a, Integer> d0(z.a aVar, int[][][] iArr, e eVar) {
        if (eVar.f28005s.f28017a == 2) {
            return null;
        }
        return g0(4, aVar, iArr, new e(eVar), new f());
    }

    /* access modifiers changed from: protected */
    public x.a e0(int i10, k0 k0Var, int[][] iArr, e eVar) {
        if (eVar.f28005s.f28017a == 2) {
            return null;
        }
        int i11 = 0;
        K k10 = null;
        d dVar = null;
        for (int i12 = 0; i12 < k0Var.f35939a; i12++) {
            K b10 = k0Var.b(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < b10.f27943a; i13++) {
                if (v0.p(iArr2[i13], eVar.f36777u0)) {
                    d dVar2 = new d(b10.a(i13), iArr2[i13]);
                    if (dVar == null || dVar2.compareTo(dVar) > 0) {
                        k10 = b10;
                        i11 = i13;
                        dVar = dVar2;
                    }
                }
            }
        }
        if (k10 == null) {
            return null;
        }
        return new x.a(k10, i11);
    }

    /* access modifiers changed from: protected */
    public Pair<x.a, Integer> f0(z.a aVar, int[][][] iArr, e eVar, String str) {
        if (eVar.f28005s.f28017a == 2) {
            return null;
        }
        return g0(3, aVar, iArr, new k(eVar, str), new l());
    }

    public boolean h() {
        return true;
    }

    /* access modifiers changed from: protected */
    public Pair<x.a, Integer> h0(z.a aVar, int[][][] iArr, int[] iArr2, e eVar) {
        if (eVar.f28005s.f28017a == 2) {
            return null;
        }
        return g0(2, aVar, iArr, new i(eVar, iArr2), new j());
    }

    public void j() {
        g gVar;
        synchronized (this.f36714d) {
            try {
                if (N.f29462a >= 32 && (gVar = this.f36719i) != null) {
                    gVar.f();
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        super.j();
    }

    public void l(C5792c cVar) {
        boolean equals;
        synchronized (this.f36714d) {
            equals = this.f36720j.equals(cVar);
            this.f36720j = cVar;
        }
        if (!equals) {
            W();
        }
    }

    public void m(M m10) {
        if (m10 instanceof e) {
            i0((e) m10);
        }
        i0(new e.a().l0(m10).C());
    }

    /* access modifiers changed from: protected */
    public final Pair<H[], x[]> q(z.a aVar, int[][][] iArr, int[] iArr2, C6479C.b bVar, J j10) {
        e eVar;
        g gVar;
        synchronized (this.f36714d) {
            try {
                eVar = this.f36718h;
                if (eVar.f36776t0 && N.f29462a >= 32 && (gVar = this.f36719i) != null) {
                    gVar.b(this, (Looper) C5950a.i(Looper.myLooper()));
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        int d10 = aVar.d();
        x.a[] b02 = b0(aVar, iArr, iArr2, eVar);
        F(aVar, eVar, b02);
        E(aVar, eVar, b02);
        for (int i10 = 0; i10 < d10; i10++) {
            int e10 = aVar.e(i10);
            if (eVar.i(i10) || eVar.f27986B.contains(Integer.valueOf(e10))) {
                b02[i10] = null;
            }
        }
        x[] a10 = this.f36716f.a(b02, b(), bVar, j10);
        H[] hArr = new H[d10];
        for (int i11 = 0; i11 < d10; i11++) {
            hArr[i11] = (eVar.i(i11) || eVar.f27986B.contains(Integer.valueOf(aVar.e(i11))) || (aVar.e(i11) != -2 && a10[i11] == null)) ? null : H.f32388c;
        }
        if (eVar.f36778v0) {
            V(aVar, iArr, hArr, a10);
        }
        if (eVar.f28005s.f28017a != 0) {
            U(eVar, aVar, iArr, hArr, a10);
        }
        return Pair.create(hArr, a10);
    }

    public n(Context context, x.b bVar) {
        this(context, (M) e.h(context), bVar);
    }

    public n(Context context, M m10, x.b bVar) {
        this(m10, bVar, context);
    }

    private n(M m10, x.b bVar, Context context) {
        this.f36714d = new Object();
        this.f36715e = context != null ? context.getApplicationContext() : null;
        this.f36716f = bVar;
        if (m10 instanceof e) {
            this.f36718h = (e) m10;
        } else {
            this.f36718h = (context == null ? e.f36745A0 : e.h(context)).a().l0(m10).C();
        }
        this.f36720j = C5792c.f28108g;
        boolean z10 = context != null && N.I0(context);
        this.f36717g = z10;
        if (!z10 && context != null && N.f29462a >= 32) {
            this.f36719i = g.g(context);
        }
        if (this.f36718h.f36776t0 && context == null) {
            q.h("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }
}
