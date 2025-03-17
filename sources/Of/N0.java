package Of;

import KJ.C15987c;
import Of.I1;
import U0.C4889m;
import U0.L;
import U0.M;
import U0.M0;
import XH.C16807N;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.r;
import t0.C5938c;
import t0.x;
import tK.C18029u;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ac\u0010\n\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0012"}, d2 = {"LKJ/c;", "LOf/I1$a;", "rewards", "Lkotlin/Function1;", "LXH/N;", "onApplyRewardToCart", "onRemoveRewardFromCart", "onRewardDisplayed", "Landroidx/compose/ui/d;", "modifier", "c", "(LKJ/c;LnI/l;LnI/l;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "Lc2/h;", "a", "F", "EdgePadding", "b", "HorizontalItemSpacing", "cart-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class N0 {

    /* renamed from: a  reason: collision with root package name */
    private static final float f62362a = C18029u.f147649a.d();

    /* renamed from: b  reason: collision with root package name */
    private static final float f62363b = c2.h.B((float) 12);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements C17642l<M, L> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<I1.a, C16807N> f62364a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ I1.a f62365b;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Of/N0$a$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Of.N0$a$a  reason: collision with other inner class name */
        public static final class C1059a implements L {
            public void b() {
            }
        }

        a(C17642l<? super I1.a, C16807N> lVar, I1.a aVar) {
            this.f62364a = lVar;
            this.f62365b = aVar;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            C17542s.j(m10, "$this$DisposableEffect");
            this.f62364a.invoke(this.f62365b);
            return new C1059a();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements C17631a<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ I1.a f62366a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<I1.a, C16807N> f62367b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<I1.a, C16807N> f62368c;

        b(I1.a aVar, C17642l<? super I1.a, C16807N> lVar, C17642l<? super I1.a, C16807N> lVar2) {
            this.f62366a = aVar;
            this.f62367b = lVar;
            this.f62368c = lVar2;
        }

        public final void a() {
            if (this.f62366a.j() && !this.f62366a.o()) {
                if (this.f62366a.h()) {
                    this.f62367b.invoke(this.f62366a);
                } else {
                    this.f62368c.invoke(this.f62366a);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements C17642l<Boolean, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<I1.a, C16807N> f62369a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ I1.a f62370b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<I1.a, C16807N> f62371c;

        c(C17642l<? super I1.a, C16807N> lVar, I1.a aVar, C17642l<? super I1.a, C16807N> lVar2) {
            this.f62369a = lVar;
            this.f62370b = aVar;
            this.f62371c = lVar2;
        }

        public final void a(boolean z10) {
            if (z10) {
                this.f62369a.invoke(this.f62370b);
            } else {
                this.f62371c.invoke(this.f62370b);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Boolean) obj).booleanValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class d implements C17642l {

        /* renamed from: a  reason: collision with root package name */
        public static final d f62372a = new d();

        /* renamed from: a */
        public final Void invoke(I1.a aVar) {
            C17542s.j(aVar, "it");
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class e implements C17642l<I1.a, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f62373a;

        public e(String str) {
            this.f62373a = str;
        }

        /* renamed from: a */
        public final Object invoke(I1.a aVar) {
            C17542s.j(aVar, "item");
            String str = this.f62373a;
            if (str != null) {
                String str2 = str + ":" + aVar.f();
                if (str2 != null) {
                    return str2;
                }
            }
            return Long.valueOf(aVar.f());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;", "ul/a"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f62374c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f62375d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17642l lVar, List list) {
            super(1);
            this.f62374c = lVar;
            this.f62375d = list;
        }

        public final Object a(int i10) {
            return this.f62374c.invoke(this.f62375d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;", "ul/b"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f62376c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f62377d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C17642l lVar, List list) {
            super(1);
            this.f62376c = lVar;
            this.f62377d = list;
        }

        public final Object a(int i10) {
            return this.f62376c.invoke(this.f62377d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    public static final class h extends C17544u implements r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f62378c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l f62379d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l f62380e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l f62381f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(List list, C17642l lVar, C17642l lVar2, C17642l lVar3) {
            super(4);
            this.f62378c = list;
            this.f62379d = lVar;
            this.f62380e = lVar2;
            this.f62381f = lVar3;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(t0.C5938c r12, int r13, U0.C4889m r14, int r15) {
            /*
                r11 = this;
                r0 = r15 & 6
                if (r0 != 0) goto L_0x000f
                boolean r12 = r14.V(r12)
                if (r12 == 0) goto L_0x000c
                r12 = 4
                goto L_0x000d
            L_0x000c:
                r12 = 2
            L_0x000d:
                r12 = r12 | r15
                goto L_0x0010
            L_0x000f:
                r12 = r15
            L_0x0010:
                r15 = r15 & 48
                if (r15 != 0) goto L_0x0020
                boolean r15 = r14.d(r13)
                if (r15 == 0) goto L_0x001d
                r15 = 32
                goto L_0x001f
            L_0x001d:
                r15 = 16
            L_0x001f:
                r12 = r12 | r15
            L_0x0020:
                r15 = r12 & 147(0x93, float:2.06E-43)
                r0 = 146(0x92, float:2.05E-43)
                if (r15 != r0) goto L_0x0032
                boolean r15 = r14.l()
                if (r15 != 0) goto L_0x002d
                goto L_0x0032
            L_0x002d:
                r14.L()
                goto L_0x0117
            L_0x0032:
                boolean r15 = U0.C4895p.J()
                if (r15 == 0) goto L_0x0041
                r15 = -1
                java.lang.String r0 = "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)"
                r1 = -632812321(0xffffffffda480cdf, float:-1.40772868E16)
                U0.C4895p.S(r1, r12, r15, r0)
            L_0x0041:
                java.util.List r12 = r11.f62378c
                java.lang.Object r12 = r12.get(r13)
                Of.I1$a r12 = (Of.I1.a) r12
                r13 = 2113909988(0x7dffb4e4, float:4.2486547E37)
                r14.W(r13)
                XH.N r13 = XH.C16807N.f139792a
                r15 = -1732924784(0xffffffff98b5aa90, float:-4.6959628E-24)
                r14.W(r15)
                nI.l r15 = r11.f62379d
                boolean r15 = r14.V(r15)
                boolean r0 = r14.F(r12)
                r15 = r15 | r0
                java.lang.Object r0 = r14.D()
                if (r15 != 0) goto L_0x0070
                U0.m$a r15 = U0.C4889m.f14007a
                java.lang.Object r15 = r15.a()
                if (r0 != r15) goto L_0x007a
            L_0x0070:
                Of.N0$a r0 = new Of.N0$a
                nI.l r15 = r11.f62379d
                r0.<init>(r15, r12)
                r14.u(r0)
            L_0x007a:
                nI.l r0 = (nI.C17642l) r0
                r14.P()
                r15 = 6
                U0.P.c(r13, r0, r14, r15)
                Iq.a$c$d r1 = r12.n()
                boolean r5 = r12.j()
                boolean r6 = r12.o()
                boolean r7 = r12.h()
                r13 = -1732914436(0xffffffff98b5d2fc, float:-4.7000443E-24)
                r14.W(r13)
                boolean r13 = r14.F(r12)
                nI.l r15 = r11.f62380e
                boolean r15 = r14.V(r15)
                r13 = r13 | r15
                nI.l r15 = r11.f62381f
                boolean r15 = r14.V(r15)
                r13 = r13 | r15
                java.lang.Object r15 = r14.D()
                if (r13 != 0) goto L_0x00b9
                U0.m$a r13 = U0.C4889m.f14007a
                java.lang.Object r13 = r13.a()
                if (r15 != r13) goto L_0x00c5
            L_0x00b9:
                Of.N0$b r15 = new Of.N0$b
                nI.l r13 = r11.f62380e
                nI.l r0 = r11.f62381f
                r15.<init>(r12, r13, r0)
                r14.u(r15)
            L_0x00c5:
                r2 = r15
                nI.a r2 = (nI.C17631a) r2
                r14.P()
                r13 = -1732903112(0xffffffff98b5ff38, float:-4.704511E-24)
                r14.W(r13)
                nI.l r13 = r11.f62381f
                boolean r13 = r14.V(r13)
                boolean r15 = r14.F(r12)
                r13 = r13 | r15
                nI.l r15 = r11.f62380e
                boolean r15 = r14.V(r15)
                r13 = r13 | r15
                java.lang.Object r15 = r14.D()
                if (r13 != 0) goto L_0x00f1
                U0.m$a r13 = U0.C4889m.f14007a
                java.lang.Object r13 = r13.a()
                if (r15 != r13) goto L_0x00fd
            L_0x00f1:
                Of.N0$c r15 = new Of.N0$c
                nI.l r13 = r11.f62381f
                nI.l r0 = r11.f62380e
                r15.<init>(r13, r12, r0)
                r14.u(r15)
            L_0x00fd:
                r3 = r15
                nI.l r3 = (nI.C17642l) r3
                r14.P()
                r9 = 0
                r10 = 8
                r4 = 0
                r8 = r14
                qr.i.g(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r14.P()
                boolean r12 = U0.C4895p.J()
                if (r12 == 0) goto L_0x0117
                U0.C4895p.R()
            L_0x0117:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Of.N0.h.a(t0.c, int, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C5938c) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(KJ.C15987c<Of.I1.a> r20, nI.C17642l<? super Of.I1.a, XH.C16807N> r21, nI.C17642l<? super Of.I1.a, XH.C16807N> r22, nI.C17642l<? super Of.I1.a, XH.C16807N> r23, androidx.compose.ui.d r24, U0.C4889m r25, int r26, int r27) {
        /*
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r6 = r26
            java.lang.String r0 = "rewards"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "onApplyRewardToCart"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "onRemoveRewardFromCart"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.String r0 = "onRewardDisplayed"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            r0 = -373733694(0xffffffffe9b946c2, float:-2.7998178E25)
            r5 = r25
            U0.m r5 = r5.k(r0)
            r7 = r27 & 1
            r8 = 2
            if (r7 == 0) goto L_0x002f
            r7 = r6 | 6
            goto L_0x003f
        L_0x002f:
            r7 = r6 & 6
            if (r7 != 0) goto L_0x003e
            boolean r7 = r5.F(r1)
            if (r7 == 0) goto L_0x003b
            r7 = 4
            goto L_0x003c
        L_0x003b:
            r7 = r8
        L_0x003c:
            r7 = r7 | r6
            goto L_0x003f
        L_0x003e:
            r7 = r6
        L_0x003f:
            r9 = r27 & 2
            r10 = 32
            if (r9 == 0) goto L_0x0048
            r7 = r7 | 48
            goto L_0x0057
        L_0x0048:
            r9 = r6 & 48
            if (r9 != 0) goto L_0x0057
            boolean r9 = r5.F(r2)
            if (r9 == 0) goto L_0x0054
            r9 = r10
            goto L_0x0056
        L_0x0054:
            r9 = 16
        L_0x0056:
            r7 = r7 | r9
        L_0x0057:
            r9 = r27 & 4
            r11 = 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x0060
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x006f
        L_0x0060:
            r9 = r6 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x006f
            boolean r9 = r5.F(r3)
            if (r9 == 0) goto L_0x006c
            r9 = r11
            goto L_0x006e
        L_0x006c:
            r9 = 128(0x80, float:1.794E-43)
        L_0x006e:
            r7 = r7 | r9
        L_0x006f:
            r9 = r27 & 8
            r12 = 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x0078
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            goto L_0x0087
        L_0x0078:
            r9 = r6 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0087
            boolean r9 = r5.F(r4)
            if (r9 == 0) goto L_0x0084
            r9 = r12
            goto L_0x0086
        L_0x0084:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0086:
            r7 = r7 | r9
        L_0x0087:
            r9 = r27 & 16
            if (r9 == 0) goto L_0x0090
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
        L_0x008d:
            r13 = r24
            goto L_0x00a2
        L_0x0090:
            r13 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x008d
            r13 = r24
            boolean r14 = r5.V(r13)
            if (r14 == 0) goto L_0x009f
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a1
        L_0x009f:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x00a1:
            r7 = r7 | r14
        L_0x00a2:
            r14 = r7 & 9363(0x2493, float:1.312E-41)
            r15 = 9362(0x2492, float:1.3119E-41)
            if (r14 != r15) goto L_0x00b4
            boolean r14 = r5.l()
            if (r14 != 0) goto L_0x00af
            goto L_0x00b4
        L_0x00af:
            r5.L()
            goto L_0x013d
        L_0x00b4:
            if (r9 == 0) goto L_0x00bb
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            r19 = r9
            goto L_0x00bd
        L_0x00bb:
            r19 = r13
        L_0x00bd:
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x00c9
            r9 = -1
            java.lang.String r13 = "com.ingka.ikea.app.cart.compose.ClaimedFamilyRewardList (ClaimedFamilyRewardList.kt:63)"
            U0.C4895p.S(r0, r7, r9, r13)
        L_0x00c9:
            float r0 = f62362a
            r9 = 0
            r13 = 0
            s0.E r9 = androidx.compose.foundation.layout.D.c(r0, r9, r8, r13)
            androidx.compose.foundation.layout.d$a r0 = androidx.compose.foundation.layout.C5073d.a.f18077a
            float r8 = f62363b
            androidx.compose.foundation.layout.d$f r0 = r0.c(r8)
            r8 = -61067535(0xfffffffffc5c2ef1, float:-4.5730296E36)
            r5.W(r8)
            boolean r8 = r5.F(r1)
            r13 = r7 & 7168(0x1c00, float:1.0045E-41)
            r14 = 0
            r15 = 1
            if (r13 != r12) goto L_0x00eb
            r12 = r15
            goto L_0x00ec
        L_0x00eb:
            r12 = r14
        L_0x00ec:
            r8 = r8 | r12
            r12 = r7 & 896(0x380, float:1.256E-42)
            if (r12 != r11) goto L_0x00f3
            r11 = r15
            goto L_0x00f4
        L_0x00f3:
            r11 = r14
        L_0x00f4:
            r8 = r8 | r11
            r11 = r7 & 112(0x70, float:1.57E-43)
            if (r11 != r10) goto L_0x00fa
            r14 = r15
        L_0x00fa:
            r8 = r8 | r14
            java.lang.Object r10 = r5.D()
            if (r8 != 0) goto L_0x0109
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r10 != r8) goto L_0x0111
        L_0x0109:
            Of.L0 r10 = new Of.L0
            r10.<init>(r1, r4, r3, r2)
            r5.u(r10)
        L_0x0111:
            r15 = r10
            nI.l r15 = (nI.C17642l) r15
            r5.P()
            int r7 = r7 >> 12
            r7 = r7 & 14
            r14 = r7 | 24960(0x6180, float:3.4976E-41)
            r18 = 234(0xea, float:3.28E-43)
            r8 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r16 = 0
            r7 = r19
            r11 = r0
            r0 = r14
            r14 = r16
            r16 = r5
            r17 = r0
            t0.C5937b.b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x013b
            U0.C4895p.R()
        L_0x013b:
            r13 = r19
        L_0x013d:
            U0.Y0 r8 = r5.n()
            if (r8 == 0) goto L_0x0159
            Of.M0 r9 = new Of.M0
            r0 = r9
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r13
            r6 = r26
            r7 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0159:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Of.N0.c(KJ.c, nI.l, nI.l, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C15987c cVar, C17642l lVar, C17642l lVar2, C17642l lVar3, x xVar) {
        C17542s.j(xVar, "$this$LazyRow");
        d dVar = d.f62372a;
        xVar.e(cVar.size(), new f(new e((String) null), cVar), new g(dVar, cVar), c1.c.c(-632812321, true, new h(cVar, lVar, lVar2, lVar3)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C15987c cVar, C17642l lVar, C17642l lVar2, C17642l lVar3, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        c(cVar, lVar, lVar2, lVar3, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
