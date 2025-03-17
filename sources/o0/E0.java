package O0;

import XH.C16807N;
import c2.d;
import c2.h;
import c2.y;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import m0.C5546i;
import m0.C5548j;
import m0.M;
import nI.C17631a;
import nI.C17642l;
import o1.C5667g;
import o1.C5668h;
import p0.v;
import z1.C6271a;
import z1.e;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001aC\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014\"\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"LO0/F0;", "sheetState", "Lp0/v;", "orientation", "Lkotlin/Function1;", "", "LXH/N;", "onFling", "Lz1/a;", "a", "(LO0/F0;Lp0/v;LnI/l;)Lz1/a;", "", "skipPartiallyExpanded", "LO0/G0;", "confirmValueChange", "initialValue", "skipHiddenState", "d", "(ZLnI/l;LO0/G0;ZLU0/m;II)LO0/F0;", "Lc2/h;", "F", "DragHandleVerticalPadding", "Lm0/i;", "b", "Lm0/i;", "BottomSheetAnimationSpec", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class E0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final float f9722a = h.B((float) 22);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final C5546i<Float> f9723b = C5548j.j(300, 0, M.d(), 2, (Object) null);

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0002*\u00020\u0006H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0002*\u00020\u0003H\u0003¢\u0006\u0004\b\t\u0010\bJ\"\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H@ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H@ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"O0/E0$a", "Lz1/a;", "", "Lo1/g;", "b", "(F)J", "Lc2/y;", "c", "(J)F", "a", "available", "Lz1/e;", "source", "C1", "(JI)J", "consumed", "N0", "(JJI)J", "E1", "(JLdI/e;)Ljava/lang/Object;", "g0", "(JJLdI/e;)Ljava/lang/Object;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements C6271a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ F0 f9724a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<Float, C16807N> f9725b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ v f9726c;

        a(F0 f02, C17642l<? super Float, C16807N> lVar, v vVar) {
            this.f9724a = f02;
            this.f9725b = lVar;
            this.f9726c = vVar;
        }

        private final float a(long j10) {
            return this.f9726c == v.Horizontal ? C5667g.m(j10) : C5667g.n(j10);
        }

        private final long b(float f10) {
            v vVar = this.f9726c;
            float f11 = vVar == v.Horizontal ? f10 : 0.0f;
            if (vVar != v.Vertical) {
                f10 = 0.0f;
            }
            return C5668h.a(f11, f10);
        }

        private final float c(long j10) {
            return this.f9726c == v.Horizontal ? y.h(j10) : y.i(j10);
        }

        public long C1(long j10, int i10) {
            float a10 = a(j10);
            return (a10 >= 0.0f || !e.d(i10, e.f32374a.b())) ? C5667g.f26701b.c() : b(this.f9724a.d().n(a10));
        }

        public Object E1(long j10, C17164e<? super y> eVar) {
            float c10 = c(j10);
            float n10 = this.f9724a.n();
            float e10 = this.f9724a.d().o().e();
            if (c10 >= 0.0f || n10 <= e10) {
                j10 = y.f23066b.a();
            } else {
                this.f9725b.invoke(kotlin.coroutines.jvm.internal.b.d(c10));
            }
            return y.b(j10);
        }

        public long N0(long j10, long j11, int i10) {
            return e.d(i10, e.f32374a.b()) ? b(this.f9724a.d().n(a(j11))) : C5667g.f26701b.c();
        }

        public Object g0(long j10, long j11, C17164e<? super y> eVar) {
            this.f9725b.invoke(kotlin.coroutines.jvm.internal.b.d(c(j11)));
            return y.b(j11);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends C17544u implements C17642l<G0, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f9727c = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(G0 g02) {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LO0/F0;", "b", "()LO0/F0;"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17631a<F0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f9728c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f9729d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ G0 f9730e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<G0, Boolean> f9731f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f9732g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(boolean z10, d dVar, G0 g02, C17642l<? super G0, Boolean> lVar, boolean z11) {
            super(0);
            this.f9728c = z10;
            this.f9729d = dVar;
            this.f9730e = g02;
            this.f9731f = lVar;
            this.f9732g = z11;
        }

        /* renamed from: b */
        public final F0 invoke() {
            return new F0(this.f9728c, this.f9729d, this.f9730e, this.f9731f, this.f9732g);
        }
    }

    public static final C6271a a(F0 f02, v vVar, C17642l<? super Float, C16807N> lVar) {
        return new a(f02, lVar, vVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: O0.E0$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: O0.E0$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: O0.E0$c} */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ba, code lost:
        if (r2 == U0.C4889m.f14007a.a()) goto L_0x00bc;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final O0.F0 d(boolean r14, nI.C17642l<? super O0.G0, java.lang.Boolean> r15, O0.G0 r16, boolean r17, U0.C4889m r18, int r19, int r20) {
        /*
            r4 = r18
            r0 = r19
            r1 = r20 & 1
            r2 = 0
            if (r1 == 0) goto L_0x000b
            r6 = r2
            goto L_0x000c
        L_0x000b:
            r6 = r14
        L_0x000c:
            r1 = r20 & 2
            if (r1 == 0) goto L_0x0014
            O0.E0$b r1 = O0.E0.b.f9727c
            r9 = r1
            goto L_0x0015
        L_0x0014:
            r9 = r15
        L_0x0015:
            r1 = r20 & 4
            if (r1 == 0) goto L_0x001d
            O0.G0 r1 = O0.G0.Hidden
            r8 = r1
            goto L_0x001f
        L_0x001d:
            r8 = r16
        L_0x001f:
            r1 = r20 & 8
            if (r1 == 0) goto L_0x0025
            r10 = r2
            goto L_0x0027
        L_0x0025:
            r10 = r17
        L_0x0027:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0036
            r1 = -1
            java.lang.String r3 = "androidx.compose.material3.rememberSheetState (SheetDefaults.kt:407)"
            r5 = 1032784200(0x3d8f0948, float:0.06984192)
            U0.C4895p.S(r5, r0, r1, r3)
        L_0x0036:
            U0.I0 r1 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r1 = r4.Q(r1)
            r7 = r1
            c2.d r7 = (c2.d) r7
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r10)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r9, r3}
            O0.F0$a r3 = O0.F0.f9741d
            f1.k r3 = r3.a(r6, r9, r7, r10)
            r5 = r0 & 14
            r5 = r5 ^ 6
            r11 = 4
            r12 = 1
            if (r5 <= r11) goto L_0x0061
            boolean r5 = r4.b(r6)
            if (r5 != 0) goto L_0x0065
        L_0x0061:
            r5 = r0 & 6
            if (r5 != r11) goto L_0x0067
        L_0x0065:
            r5 = r12
            goto L_0x0068
        L_0x0067:
            r5 = r2
        L_0x0068:
            boolean r11 = r4.V(r7)
            r5 = r5 | r11
            r11 = r0 & 896(0x380, float:1.256E-42)
            r11 = r11 ^ 384(0x180, float:5.38E-43)
            r13 = 256(0x100, float:3.59E-43)
            if (r11 <= r13) goto L_0x007b
            boolean r11 = r4.V(r8)
            if (r11 != 0) goto L_0x007f
        L_0x007b:
            r11 = r0 & 384(0x180, float:5.38E-43)
            if (r11 != r13) goto L_0x0081
        L_0x007f:
            r11 = r12
            goto L_0x0082
        L_0x0081:
            r11 = r2
        L_0x0082:
            r5 = r5 | r11
            r11 = r0 & 112(0x70, float:1.57E-43)
            r11 = r11 ^ 48
            r13 = 32
            if (r11 <= r13) goto L_0x0091
            boolean r11 = r4.V(r9)
            if (r11 != 0) goto L_0x0095
        L_0x0091:
            r11 = r0 & 48
            if (r11 != r13) goto L_0x0097
        L_0x0095:
            r11 = r12
            goto L_0x0098
        L_0x0097:
            r11 = r2
        L_0x0098:
            r5 = r5 | r11
            r11 = r0 & 7168(0x1c00, float:1.0045E-41)
            r11 = r11 ^ 3072(0xc00, float:4.305E-42)
            r13 = 2048(0x800, float:2.87E-42)
            if (r11 <= r13) goto L_0x00a7
            boolean r11 = r4.b(r10)
            if (r11 != 0) goto L_0x00ab
        L_0x00a7:
            r0 = r0 & 3072(0xc00, float:4.305E-42)
            if (r0 != r13) goto L_0x00ac
        L_0x00ab:
            r2 = r12
        L_0x00ac:
            r0 = r5 | r2
            java.lang.Object r2 = r18.D()
            if (r0 != 0) goto L_0x00bc
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x00c5
        L_0x00bc:
            O0.E0$c r2 = new O0.E0$c
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            r4.u(r2)
        L_0x00c5:
            r5 = r2
            nI.a r5 = (nI.C17631a) r5
            r6 = 0
            r7 = 4
            r2 = 0
            r0 = r1
            r1 = r3
            r3 = r5
            r4 = r18
            r5 = r6
            r6 = r7
            java.lang.Object r0 = f1.C5301c.e(r0, r1, r2, r3, r4, r5, r6)
            O0.F0 r0 = (O0.F0) r0
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x00e1
            U0.C4895p.R()
        L_0x00e1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.E0.d(boolean, nI.l, O0.G0, boolean, U0.m, int, int):O0.F0");
    }
}
