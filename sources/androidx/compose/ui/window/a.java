package androidx.compose.ui.window;

import E1.I;
import E1.a0;
import G1.C4504g;
import L1.o;
import L1.v;
import L1.x;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.L;
import U0.M;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import c2.t;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r²\u0006\u0012\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\nX\u0002"}, d2 = {"Lkotlin/Function0;", "LXH/N;", "onDismissRequest", "Landroidx/compose/ui/window/h;", "properties", "content", "a", "(LnI/a;Landroidx/compose/ui/window/h;LnI/p;LU0/m;II)V", "Landroidx/compose/ui/d;", "modifier", "c", "(Landroidx/compose/ui/d;LnI/p;LU0/m;II)V", "currentContent", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LU0/M;", "LU0/L;", "a", "(LU0/M;)LU0/L;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.window.a$a  reason: collision with other inner class name */
    static final class C0311a extends C17544u implements C17642l<M, L> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f19877c;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/window/a$a$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.window.a$a$a  reason: collision with other inner class name */
        public static final class C0312a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j f19878a;

            public C0312a(j jVar) {
                this.f19878a = jVar;
            }

            public void b() {
                this.f19878a.dismiss();
                this.f19878a.h();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0311a(j jVar) {
            super(1);
            this.f19877c = jVar;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            this.f19877c.show();
            return new C0312a(this.f19877c);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f19879c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f19880d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h f19881e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ t f19882f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(j jVar, C17631a<C16807N> aVar, h hVar, t tVar) {
            super(0);
            this.f19879c = jVar;
            this.f19880d = aVar;
            this.f19881e = hVar;
            this.f19882f = tVar;
        }

        public final void invoke() {
            this.f19879c.l(this.f19880d, this.f19881e, this.f19882f);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f19883c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h f19884d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f19885e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f19886f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f19887g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C17631a<C16807N> aVar, h hVar, p<? super C4889m, ? super Integer, C16807N> pVar, int i10, int i11) {
            super(2);
            this.f19883c = aVar;
            this.f19884d = hVar;
            this.f19885e = pVar;
            this.f19886f = i10;
            this.f19887g = i11;
        }

        public final void a(C4889m mVar, int i10) {
            a.a(this.f19883c, this.f19884d, this.f19885e, mVar, M0.a(this.f19886f | 1), this.f19887g);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ A1<p<C4889m, Integer, C16807N>> f19888c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LL1/x;", "LXH/N;", "a", "(LL1/x;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.window.a$d$a  reason: collision with other inner class name */
        static final class C0313a extends C17544u implements C17642l<x, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            public static final C0313a f19889c = new C0313a();

            C0313a() {
                super(1);
            }

            public final void a(x xVar) {
                v.k(xVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((x) obj);
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends C17544u implements p<C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ A1<p<C4889m, Integer, C16807N>> f19890c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(A1<? extends p<? super C4889m, ? super Integer, C16807N>> a12) {
                super(2);
                this.f19890c = a12;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-533674951, i10, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:188)");
                    }
                    a.b(this.f19890c).invoke(mVar, 0);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(A1<? extends p<? super C4889m, ? super Integer, C16807N>> a12) {
            super(2);
            this.f19888c = a12;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(488261145, i10, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:185)");
                }
                a.c(o.d(androidx.compose.ui.d.f18749a, false, C0313a.f19889c, 1, (Object) null), c1.c.e(-533674951, true, new b(this.f19888c), mVar, 54), mVar, 48, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/util/UUID;", "kotlin.jvm.PlatformType", "b", "()Ljava/util/UUID;"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements C17631a<UUID> {

        /* renamed from: c  reason: collision with root package name */
        public static final e f19891c = new e();

        e() {
            super(0);
        }

        /* renamed from: b */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LE1/K;", "", "LE1/H;", "measurables", "Lc2/b;", "constraints", "LE1/J;", "i", "(LE1/K;Ljava/util/List;J)LE1/J;"}, k = 3, mv = {1, 8, 0})
    static final class f implements I {

        /* renamed from: a  reason: collision with root package name */
        public static final f f19892a = new f();

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.window.a$f$a  reason: collision with other inner class name */
        static final class C0314a extends C17544u implements C17642l<a0.a, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ List<a0> f19893c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0314a(List<? extends a0> list) {
                super(1);
                this.f19893c = list;
            }

            public final void a(a0.a aVar) {
                List<a0> list = this.f19893c;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    a0.a.m(aVar, list.get(i10), 0, 0, 0.0f, 4, (Object) null);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((a0.a) obj);
                return C16807N.f139792a;
            }
        }

        f() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: E1.a0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final E1.J i(E1.K r12, java.util.List<? extends E1.H> r13, long r14) {
            /*
                r11 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r13.size()
                r0.<init>(r1)
                int r1 = r13.size()
                r2 = 0
                r3 = r2
            L_0x000f:
                if (r3 >= r1) goto L_0x0021
                java.lang.Object r4 = r13.get(r3)
                E1.H r4 = (E1.H) r4
                E1.a0 r4 = r4.i0(r14)
                r0.add(r4)
                int r3 = r3 + 1
                goto L_0x000f
            L_0x0021:
                boolean r13 = r0.isEmpty()
                r1 = 0
                r3 = 1
                if (r13 == 0) goto L_0x002b
                r13 = r1
                goto L_0x0051
            L_0x002b:
                java.lang.Object r13 = r0.get(r2)
                r4 = r13
                E1.a0 r4 = (E1.a0) r4
                int r4 = r4.E0()
                int r5 = YH.C16877v.p(r0)
                if (r3 > r5) goto L_0x0051
                r6 = r3
            L_0x003d:
                java.lang.Object r7 = r0.get(r6)
                r8 = r7
                E1.a0 r8 = (E1.a0) r8
                int r8 = r8.E0()
                if (r4 >= r8) goto L_0x004c
                r13 = r7
                r4 = r8
            L_0x004c:
                if (r6 == r5) goto L_0x0051
                int r6 = r6 + 1
                goto L_0x003d
            L_0x0051:
                E1.a0 r13 = (E1.a0) r13
                if (r13 == 0) goto L_0x005b
                int r13 = r13.E0()
            L_0x0059:
                r5 = r13
                goto L_0x0060
            L_0x005b:
                int r13 = c2.C5267b.n(r14)
                goto L_0x0059
            L_0x0060:
                boolean r13 = r0.isEmpty()
                if (r13 == 0) goto L_0x0067
                goto L_0x008d
            L_0x0067:
                java.lang.Object r13 = r0.get(r2)
                r1 = r13
                E1.a0 r1 = (E1.a0) r1
                int r1 = r1.z0()
                int r2 = YH.C16877v.p(r0)
                if (r3 > r2) goto L_0x008c
            L_0x0078:
                java.lang.Object r4 = r0.get(r3)
                r6 = r4
                E1.a0 r6 = (E1.a0) r6
                int r6 = r6.z0()
                if (r1 >= r6) goto L_0x0087
                r13 = r4
                r1 = r6
            L_0x0087:
                if (r3 == r2) goto L_0x008c
                int r3 = r3 + 1
                goto L_0x0078
            L_0x008c:
                r1 = r13
            L_0x008d:
                E1.a0 r1 = (E1.a0) r1
                if (r1 == 0) goto L_0x0097
                int r13 = r1.z0()
            L_0x0095:
                r6 = r13
                goto L_0x009c
            L_0x0097:
                int r13 = c2.C5267b.m(r14)
                goto L_0x0095
            L_0x009c:
                androidx.compose.ui.window.a$f$a r8 = new androidx.compose.ui.window.a$f$a
                r8.<init>(r0)
                r9 = 4
                r10 = 0
                r7 = 0
                r4 = r12
                E1.J r12 = E1.K.v0(r4, r5, r6, r7, r8, r9, r10)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.a.f.i(E1.K, java.util.List, long):E1.J");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f19894c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f19895d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f19896e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f19897f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(androidx.compose.ui.d dVar, p<? super C4889m, ? super Integer, C16807N> pVar, int i10, int i11) {
            super(2);
            this.f19894c = dVar;
            this.f19895d = pVar;
            this.f19896e = i10;
            this.f19897f = i11;
        }

        public final void a(C4889m mVar, int i10) {
            a.c(this.f19894c, this.f19895d, mVar, M0.a(this.f19896e | 1), this.f19897f);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: androidx.compose.ui.window.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: androidx.compose.ui.window.j} */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(nI.C17631a<XH.C16807N> r23, androidx.compose.ui.window.h r24, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r25, U0.C4889m r26, int r27, int r28) {
        /*
            r7 = r23
            r8 = r25
            r9 = r27
            r0 = -2032877254(0xffffffff86d4c13a, float:-8.002946E-35)
            r1 = r26
            U0.m r6 = r1.k(r0)
            r1 = r28 & 1
            r5 = 4
            if (r1 == 0) goto L_0x0017
            r1 = r9 | 6
            goto L_0x0027
        L_0x0017:
            r1 = r9 & 6
            if (r1 != 0) goto L_0x0026
            boolean r1 = r6.F(r7)
            if (r1 == 0) goto L_0x0023
            r1 = r5
            goto L_0x0024
        L_0x0023:
            r1 = 2
        L_0x0024:
            r1 = r1 | r9
            goto L_0x0027
        L_0x0026:
            r1 = r9
        L_0x0027:
            r2 = r28 & 2
            r4 = 32
            if (r2 == 0) goto L_0x0032
            r1 = r1 | 48
        L_0x002f:
            r3 = r24
            goto L_0x0043
        L_0x0032:
            r3 = r9 & 48
            if (r3 != 0) goto L_0x002f
            r3 = r24
            boolean r10 = r6.V(r3)
            if (r10 == 0) goto L_0x0040
            r10 = r4
            goto L_0x0042
        L_0x0040:
            r10 = 16
        L_0x0042:
            r1 = r1 | r10
        L_0x0043:
            r10 = r28 & 4
            if (r10 == 0) goto L_0x004a
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x005a
        L_0x004a:
            r10 = r9 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x005a
            boolean r10 = r6.F(r8)
            if (r10 == 0) goto L_0x0057
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0059
        L_0x0057:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0059:
            r1 = r1 | r10
        L_0x005a:
            r10 = r1 & 147(0x93, float:2.06E-43)
            r11 = 146(0x92, float:2.05E-43)
            if (r10 != r11) goto L_0x006e
            boolean r10 = r6.l()
            if (r10 != 0) goto L_0x0067
            goto L_0x006e
        L_0x0067:
            r6.L()
            r2 = r3
            r11 = r6
            goto L_0x018a
        L_0x006e:
            if (r2 == 0) goto L_0x007d
            androidx.compose.ui.window.h r2 = new androidx.compose.ui.window.h
            r15 = 7
            r16 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r11 = r2
            r11.<init>((boolean) r12, (boolean) r13, (boolean) r14, (int) r15, (kotlin.jvm.internal.DefaultConstructorMarker) r16)
            r3 = r2
        L_0x007d:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0089
            r2 = -1
            java.lang.String r10 = "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:166)"
            U0.C4895p.S(r0, r1, r2, r10)
        L_0x0089:
            U0.I0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.k()
            java.lang.Object r0 = r6.Q(r0)
            r2 = r0
            android.view.View r2 = (android.view.View) r2
            U0.I0 r0 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r0 = r6.Q(r0)
            c2.d r0 = (c2.d) r0
            U0.I0 r10 = androidx.compose.ui.platform.C5100f0.k()
            java.lang.Object r10 = r6.Q(r10)
            r15 = r10
            c2.t r15 = (c2.t) r15
            r14 = 0
            U0.r r13 = U0.C4883j.d(r6, r14)
            int r10 = r1 >> 6
            r10 = r10 & 14
            U0.A1 r12 = U0.p1.q(r8, r6, r10)
            java.lang.Object[] r10 = new java.lang.Object[r14]
            androidx.compose.ui.window.a$e r16 = androidx.compose.ui.window.a.e.f19891c
            r17 = 3072(0xc00, float:4.305E-42)
            r18 = 6
            r11 = 0
            r19 = 0
            r20 = r12
            r12 = r19
            r21 = r13
            r13 = r16
            r14 = r6
            r24 = r15
            r15 = r17
            r16 = r18
            java.lang.Object r10 = f1.C5301c.e(r10, r11, r12, r13, r14, r15, r16)
            java.util.UUID r10 = (java.util.UUID) r10
            boolean r11 = r6.V(r2)
            boolean r12 = r6.V(r0)
            r11 = r11 | r12
            java.lang.Object r12 = r6.D()
            r14 = 1
            if (r11 != 0) goto L_0x00f5
            U0.m$a r11 = U0.C4889m.f14007a
            java.lang.Object r11 = r11.a()
            if (r12 != r11) goto L_0x00ef
            goto L_0x00f5
        L_0x00ef:
            r13 = r1
            r22 = r3
            r15 = r5
            r11 = r6
            goto L_0x0121
        L_0x00f5:
            androidx.compose.ui.window.j r12 = new androidx.compose.ui.window.j
            r11 = r0
            r0 = r12
            r13 = r1
            r1 = r23
            r15 = r2
            r2 = r3
            r22 = r3
            r3 = r15
            r15 = r4
            r4 = r24
            r15 = r5
            r5 = r11
            r11 = r6
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            androidx.compose.ui.window.a$d r0 = new androidx.compose.ui.window.a$d
            r1 = r20
            r0.<init>(r1)
            r1 = 488261145(0x1d1a4619, float:2.041797E-21)
            c1.a r0 = c1.c.c(r1, r14, r0)
            r1 = r21
            r12.i(r1, r0)
            r11.u(r12)
        L_0x0121:
            androidx.compose.ui.window.j r12 = (androidx.compose.ui.window.j) r12
            boolean r0 = r11.F(r12)
            java.lang.Object r1 = r11.D()
            if (r0 != 0) goto L_0x0135
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x013d
        L_0x0135:
            androidx.compose.ui.window.a$a r1 = new androidx.compose.ui.window.a$a
            r1.<init>(r12)
            r11.u(r1)
        L_0x013d:
            nI.l r1 = (nI.C17642l) r1
            r0 = 0
            U0.P.c(r12, r1, r11, r0)
            boolean r1 = r11.F(r12)
            r2 = r13 & 14
            if (r2 != r15) goto L_0x014d
            r2 = r14
            goto L_0x014e
        L_0x014d:
            r2 = r0
        L_0x014e:
            r1 = r1 | r2
            r2 = r13 & 112(0x70, float:1.57E-43)
            r3 = 32
            if (r2 != r3) goto L_0x0156
            goto L_0x0157
        L_0x0156:
            r14 = r0
        L_0x0157:
            r1 = r1 | r14
            r10 = r24
            boolean r2 = r11.V(r10)
            r1 = r1 | r2
            java.lang.Object r2 = r11.D()
            if (r1 != 0) goto L_0x0171
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x016e
            goto L_0x0171
        L_0x016e:
            r3 = r22
            goto L_0x017b
        L_0x0171:
            androidx.compose.ui.window.a$b r2 = new androidx.compose.ui.window.a$b
            r3 = r22
            r2.<init>(r12, r7, r3, r10)
            r11.u(r2)
        L_0x017b:
            nI.a r2 = (nI.C17631a) r2
            U0.P.i(r2, r11, r0)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0189
            U0.C4895p.R()
        L_0x0189:
            r2 = r3
        L_0x018a:
            U0.Y0 r6 = r11.n()
            if (r6 == 0) goto L_0x01a1
            androidx.compose.ui.window.a$c r10 = new androidx.compose.ui.window.a$c
            r0 = r10
            r1 = r23
            r3 = r25
            r4 = r27
            r5 = r28
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r10)
        L_0x01a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.a.a(nI.a, androidx.compose.ui.window.h, nI.p, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final p<C4889m, Integer, C16807N> b(A1<? extends p<? super C4889m, ? super Integer, C16807N>> a12) {
        return (p) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final void c(androidx.compose.ui.d dVar, p<? super C4889m, ? super Integer, C16807N> pVar, C4889m mVar, int i10, int i11) {
        int i12;
        C4889m k10 = mVar.k(-1177876616);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.V(dVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.F(pVar) ? 32 : 16;
        }
        if ((i12 & 19) != 18 || !k10.l()) {
            if (i13 != 0) {
                dVar = androidx.compose.ui.d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(-1177876616, i12, -1, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:464)");
            }
            f fVar = f.f19892a;
            int i14 = ((i12 >> 3) & 14) | 384 | ((i12 << 3) & 112);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, dVar);
            C4504g.a aVar = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar.a();
            int i15 = ((i14 << 6) & 896) | 6;
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a11);
            } else {
                k10.t();
            }
            C4889m a12 = F1.a(k10);
            F1.c(a12, fVar, aVar.c());
            F1.c(a12, s10, aVar.e());
            p<C4504g, Integer, C16807N> b10 = aVar.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar.d());
            pVar.invoke(k10, Integer.valueOf((i15 >> 6) & 14));
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new g(dVar, pVar, i10, i11));
        }
    }
}
