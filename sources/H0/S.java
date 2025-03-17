package H0;

import A1.K;
import B0.B;
import B0.C4369m;
import B0.E;
import B0.L;
import B0.N;
import B0.d0;
import E1.C4488v;
import N1.C4669d;
import N1.P;
import N1.W;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import XH.t;
import XH.y;
import Y1.i;
import c2.r;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17544u;
import nI.p;
import o1.C5667g;
import o1.C5668h;
import o1.C5669i;
import tI.C17978n;

@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"", "isStartHandle", "LY1/i;", "direction", "LH0/Q;", "manager", "LXH/N;", "a", "(ZLY1/i;LH0/Q;LU0/m;I)V", "c", "(LH0/Q;Z)Z", "Lc2/r;", "magnifierSize", "Lo1/g;", "b", "(LH0/Q;J)J", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class S {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo1/g;", "<anonymous>", "()Lo1/g;"}, k = 3, mv = {1, 8, 0})
    static final class a implements C4535m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Q f6851a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f6852b;

        a(Q q10, boolean z10) {
            this.f6851a = q10;
            this.f6852b = z10;
        }

        public final long a() {
            return this.f6851a.G(this.f6852b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/K;", "LXH/N;", "<anonymous>", "(LA1/K;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$2$1", f = "TextFieldSelectionManager.kt", l = {1012}, m = "invokeSuspend")
    static final class b extends l implements p<K, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f6853c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f6854d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ N f6855e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(N n10, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f6855e = n10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f6855e, eVar);
            bVar.f6854d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(K k10, C17164e<? super C16807N> eVar) {
            return ((b) create(k10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f6853c;
            if (i10 == 0) {
                y.b(obj);
                N n10 = this.f6855e;
                this.f6853c = 1;
                if (E.c((K) this.f6854d, n10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f6856c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ i f6857d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Q f6858e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f6859f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(boolean z10, i iVar, Q q10, int i10) {
            super(2);
            this.f6856c = z10;
            this.f6857d = iVar;
            this.f6858e = q10;
            this.f6859f = i10;
        }

        public final void a(C4889m mVar, int i10) {
            S.a(this.f6856c, this.f6857d, this.f6858e, mVar, M0.a(this.f6859f | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6860a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                B0.m[] r0 = B0.C4369m.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                B0.m r1 = B0.C4369m.Cursor     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                B0.m r1 = B0.C4369m.SelectionStart     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                B0.m r1 = B0.C4369m.SelectionEnd     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f6860a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: H0.S.d.<clinit>():void");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: H0.m} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(boolean r11, Y1.i r12, H0.Q r13, U0.C4889m r14, int r15) {
        /*
            r0 = -1344558920(0xffffffffafdba8b8, float:-3.995575E-10)
            U0.m r14 = r14.k(r0)
            r1 = r15 & 6
            r2 = 4
            if (r1 != 0) goto L_0x0017
            boolean r1 = r14.b(r11)
            if (r1 == 0) goto L_0x0014
            r1 = r2
            goto L_0x0015
        L_0x0014:
            r1 = 2
        L_0x0015:
            r1 = r1 | r15
            goto L_0x0018
        L_0x0017:
            r1 = r15
        L_0x0018:
            r3 = r15 & 48
            if (r3 != 0) goto L_0x0028
            boolean r3 = r14.V(r12)
            if (r3 == 0) goto L_0x0025
            r3 = 32
            goto L_0x0027
        L_0x0025:
            r3 = 16
        L_0x0027:
            r1 = r1 | r3
        L_0x0028:
            r3 = r15 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0038
            boolean r3 = r14.F(r13)
            if (r3 == 0) goto L_0x0035
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0037
        L_0x0035:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0037:
            r1 = r1 | r3
        L_0x0038:
            r3 = r1 & 147(0x93, float:2.06E-43)
            r4 = 146(0x92, float:2.05E-43)
            if (r3 != r4) goto L_0x004a
            boolean r3 = r14.l()
            if (r3 != 0) goto L_0x0045
            goto L_0x004a
        L_0x0045:
            r14.L()
            goto L_0x00e4
        L_0x004a:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0056
            r3 = -1
            java.lang.String r4 = "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:1000)"
            U0.C4895p.S(r0, r1, r3, r4)
        L_0x0056:
            r0 = r1 & 14
            r3 = 0
            r4 = 1
            if (r0 != r2) goto L_0x005e
            r5 = r4
            goto L_0x005f
        L_0x005e:
            r5 = r3
        L_0x005f:
            boolean r6 = r14.V(r13)
            r5 = r5 | r6
            java.lang.Object r6 = r14.D()
            if (r5 != 0) goto L_0x0072
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x0079
        L_0x0072:
            B0.N r6 = r13.Q(r11)
            r14.u(r6)
        L_0x0079:
            B0.N r6 = (B0.N) r6
            boolean r5 = r14.F(r13)
            if (r0 != r2) goto L_0x0082
            r3 = r4
        L_0x0082:
            r0 = r5 | r3
            java.lang.Object r2 = r14.D()
            if (r0 != 0) goto L_0x0092
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x009a
        L_0x0092:
            H0.S$a r2 = new H0.S$a
            r2.<init>(r13, r11)
            r14.u(r2)
        L_0x009a:
            r0 = r2
            H0.m r0 = (H0.C4535m) r0
            T1.P r2 = r13.O()
            long r2 = r2.h()
            boolean r4 = N1.W.m(r2)
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            boolean r3 = r14.F(r6)
            java.lang.Object r5 = r14.D()
            if (r3 != 0) goto L_0x00bd
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r5 != r3) goto L_0x00c6
        L_0x00bd:
            H0.S$b r5 = new H0.S$b
            r3 = 0
            r5.<init>(r6, r3)
            r14.u(r5)
        L_0x00c6:
            nI.p r5 = (nI.p) r5
            androidx.compose.ui.d r7 = A1.U.d(r2, r6, r5)
            int r1 = r1 << 3
            r9 = r1 & 1008(0x3f0, float:1.413E-42)
            r10 = 16
            r5 = 0
            r1 = r0
            r2 = r11
            r3 = r12
            r8 = r14
            H0.C4523a.b(r1, r2, r3, r4, r5, r7, r8, r9, r10)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00e4
            U0.C4895p.R()
        L_0x00e4:
            U0.Y0 r14 = r14.n()
            if (r14 == 0) goto L_0x00f2
            H0.S$c r0 = new H0.S$c
            r0.<init>(r11, r12, r13, r15)
            r14.a(r0)
        L_0x00f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.S.a(boolean, Y1.i, H0.Q, U0.m, int):void");
    }

    public static final long b(Q q10, long j10) {
        int i10;
        d0 j11;
        L v10;
        C4669d k10;
        C5667g A10 = q10.A();
        if (A10 == null) {
            return C5667g.f26701b.b();
        }
        long v11 = A10.v();
        C4669d N10 = q10.N();
        if (N10 == null || N10.length() == 0) {
            return C5667g.f26701b.b();
        }
        C4369m C10 = q10.C();
        int i11 = C10 == null ? -1 : d.f6860a[C10.ordinal()];
        if (i11 == -1) {
            return C5667g.f26701b.b();
        }
        if (i11 == 1 || i11 == 2) {
            i10 = W.n(q10.O().h());
        } else if (i11 == 3) {
            i10 = W.i(q10.O().h());
        } else {
            throw new t();
        }
        B L10 = q10.L();
        if (L10 == null || (j11 = L10.j()) == null) {
            return C5667g.f26701b.b();
        }
        B L11 = q10.L();
        if (L11 == null || (v10 = L11.v()) == null || (k10 = v10.k()) == null) {
            return C5667g.f26701b.b();
        }
        int m10 = C17978n.m(q10.J().b(i10), 0, k10.length());
        float m11 = C5667g.m(j11.j(v11));
        P f10 = j11.f();
        int q11 = f10.q(m10);
        float s10 = f10.s(q11);
        float t10 = f10.t(q11);
        float l10 = C17978n.l(m11, Math.min(s10, t10), Math.max(s10, t10));
        if (!r.f(j10, r.f23053b.a()) && Math.abs(m11 - l10) > ((float) (r.h(j10) / 2))) {
            return C5667g.f26701b.b();
        }
        float v12 = f10.v(q11);
        return C5668h.a(l10, ((f10.m(q11) - v12) / ((float) 2)) + v12);
    }

    public static final boolean c(Q q10, boolean z10) {
        C4488v i10;
        C5669i i11;
        B L10 = q10.L();
        if (L10 == null || (i10 = L10.i()) == null || (i11 = H.i(i10)) == null) {
            return false;
        }
        return H.d(i11, q10.G(z10));
    }
}
