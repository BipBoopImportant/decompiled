package us;

import KJ.C15987c;
import QJ.Q;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import t0.C5934A;
import t0.C5938c;
import t0.x;
import ts.j;
import ys.C12503b;
import ys.C12505d;
import ys.C12506e;

@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aQ\u0010\f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f²\u0006\f\u0010\u000e\u001a\u00020\u00058\nX\u0002"}, d2 = {"", "screenTitle", "Lys/e$a;", "uiState", "Lkotlin/Function1;", "", "LXH/N;", "onTitleVisibilityChanged", "Lys/b;", "onAction", "Landroidx/compose/ui/d;", "modifier", "d", "(Ljava/lang/String;Lys/e$a;LnI/l;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "isTitleVisible", "inbox-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class o {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.inbox.impl.compose.content.NotificationListContentKt$NotificationListContent$1$1", f = "NotificationListContent.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f104080c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<Boolean, C16807N> f104081d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ A1<Boolean> f104082e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17642l<? super Boolean, C16807N> lVar, A1<Boolean> a12, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f104081d = lVar;
            this.f104082e = a12;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f104081d, this.f104082e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f104080c == 0) {
                y.b(obj);
                this.f104081d.invoke(kotlin.coroutines.jvm.internal.b.a(o.f(this.f104082e)));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f104083a;

        b(String str) {
            this.f104083a = str;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1287957391, i10, -1, "com.ingka.ikea.inbox.impl.compose.content.NotificationListContent.<anonymous>.<anonymous>.<anonymous> (NotificationListContent.kt:53)");
                }
                j.b(this.f104083a, (androidx.compose.ui.d) null, mVar, 0, 2);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<C12503b, C16807N> f104084a;

        c(C17642l<? super C12503b, C16807N> lVar) {
            this.f104084a = lVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(C17642l lVar) {
            lVar.invoke(C12503b.c.f107219a);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(C17642l lVar) {
            lVar.invoke(C12503b.C2553b.f107218a);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(t0.C5938c r12, U0.C4889m r13, int r14) {
            /*
                r11 = this;
                java.lang.String r1 = "$this$item"
                kotlin.jvm.internal.C17542s.j(r12, r1)
                r1 = r14 & 17
                r2 = 16
                if (r1 != r2) goto L_0x0017
                boolean r1 = r13.l()
                if (r1 != 0) goto L_0x0012
                goto L_0x0017
            L_0x0012:
                r13.L()
                goto L_0x009f
            L_0x0017:
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x0026
                r1 = -1
                java.lang.String r2 = "com.ingka.ikea.inbox.impl.compose.content.NotificationListContent.<anonymous>.<anonymous>.<anonymous> (NotificationListContent.kt:64)"
                r4 = -230945290(0xfffffffff23c0df6, float:-3.7248038E30)
                U0.C4895p.S(r4, r14, r1, r2)
            L_0x0026:
                androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
                androidx.compose.ui.d r4 = TC.e.i(r0)
                r0 = 24
                float r0 = (float) r0
                float r8 = c2.h.B(r0)
                r9 = 7
                r10 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.m(r4, r5, r6, r7, r8, r9, r10)
                r0 = 25390193(0x1836c71, float:4.8277406E-38)
                r13.W(r0)
                nI.l<ys.b, XH.N> r0 = r11.f104084a
                boolean r0 = r13.V(r0)
                nI.l<ys.b, XH.N> r1 = r11.f104084a
                java.lang.Object r4 = r13.D()
                if (r0 != 0) goto L_0x0058
                U0.m$a r0 = U0.C4889m.f14007a
                java.lang.Object r0 = r0.a()
                if (r4 != r0) goto L_0x0060
            L_0x0058:
                us.p r4 = new us.p
                r4.<init>(r1)
                r13.u(r4)
            L_0x0060:
                r0 = r4
                nI.a r0 = (nI.C17631a) r0
                r13.P()
                r1 = 25392918(0x1837716, float:4.829268E-38)
                r13.W(r1)
                nI.l<ys.b, XH.N> r1 = r11.f104084a
                boolean r1 = r13.V(r1)
                nI.l<ys.b, XH.N> r4 = r11.f104084a
                java.lang.Object r5 = r13.D()
                if (r1 != 0) goto L_0x0082
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r5 != r1) goto L_0x008a
            L_0x0082:
                us.q r5 = new us.q
                r5.<init>(r4)
                r13.u(r5)
            L_0x008a:
                r1 = r5
                nI.a r1 = (nI.C17631a) r1
                r13.P()
                r4 = 0
                r5 = 0
                r3 = r13
                ts.e.d(r0, r1, r2, r3, r4, r5)
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x009f
                U0.C4895p.R()
            L_0x009f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: us.o.c.c(t0.c, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            c((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements C17631a<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<C12503b, C16807N> f104085a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C12505d f104086b;

        d(C17642l<? super C12503b, C16807N> lVar, C12505d dVar) {
            this.f104085a = lVar;
            this.f104086b = dVar;
        }

        public final void a() {
            this.f104085a.invoke(new C12503b.d(this.f104086b.getId()));
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class e implements C17642l {

        /* renamed from: a  reason: collision with root package name */
        public static final e f104087a = new e();

        /* renamed from: a */
        public final Void invoke(C12505d dVar) {
            C17542s.j(dVar, "it");
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class f implements C17642l<C12505d, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f104088a;

        public f(String str) {
            this.f104088a = str;
        }

        /* renamed from: a */
        public final Object invoke(C12505d dVar) {
            C17542s.j(dVar, "item");
            String str = this.f104088a;
            if (str != null) {
                String str2 = str + ":" + dVar.f();
                if (str2 != null) {
                    return str2;
                }
            }
            return Long.valueOf(dVar.f());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;", "ul/a"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f104089c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f104090d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C17642l lVar, List list) {
            super(1);
            this.f104089c = lVar;
            this.f104090d = list;
        }

        public final Object a(int i10) {
            return this.f104089c.invoke(this.f104090d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;", "ul/b"}, k = 3, mv = {2, 1, 0})
    public static final class h extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f104091c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f104092d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(C17642l lVar, List list) {
            super(1);
            this.f104091c = lVar;
            this.f104092d = list;
        }

        public final Object a(int i10) {
            return this.f104091c.invoke(this.f104092d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    public static final class i extends C17544u implements r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f104093c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l f104094d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(List list, C17642l lVar) {
            super(4);
            this.f104093c = list;
            this.f104094d = lVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(t0.C5938c r9, int r10, U0.C4889m r11, int r12) {
            /*
                r8 = this;
                r0 = r12 & 6
                if (r0 != 0) goto L_0x000f
                boolean r0 = r11.V(r9)
                if (r0 == 0) goto L_0x000c
                r0 = 4
                goto L_0x000d
            L_0x000c:
                r0 = 2
            L_0x000d:
                r0 = r0 | r12
                goto L_0x0010
            L_0x000f:
                r0 = r12
            L_0x0010:
                r12 = r12 & 48
                if (r12 != 0) goto L_0x0020
                boolean r12 = r11.d(r10)
                if (r12 == 0) goto L_0x001d
                r12 = 32
                goto L_0x001f
            L_0x001d:
                r12 = 16
            L_0x001f:
                r0 = r0 | r12
            L_0x0020:
                r12 = r0 & 147(0x93, float:2.06E-43)
                r1 = 146(0x92, float:2.05E-43)
                if (r12 != r1) goto L_0x0031
                boolean r12 = r11.l()
                if (r12 != 0) goto L_0x002d
                goto L_0x0031
            L_0x002d:
                r11.L()
                goto L_0x009c
            L_0x0031:
                boolean r12 = U0.C4895p.J()
                if (r12 == 0) goto L_0x0040
                r12 = -1
                java.lang.String r1 = "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)"
                r2 = -632812321(0xffffffffda480cdf, float:-1.40772868E16)
                U0.C4895p.S(r2, r0, r12, r1)
            L_0x0040:
                java.util.List r12 = r8.f104093c
                java.lang.Object r10 = r12.get(r10)
                r0 = r10
                ys.d r0 = (ys.C12505d) r0
                r10 = 787347613(0x2eedf89d, float:1.0821675E-10)
                r11.W(r10)
                androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
                r6 = 7
                r7 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r1 = r9
                androidx.compose.ui.d r1 = t0.C5938c.e(r1, r2, r3, r4, r5, r6, r7)
                r9 = 25402449(0x1839c51, float:4.8346103E-38)
                r11.W(r9)
                nI.l r9 = r8.f104094d
                boolean r9 = r11.V(r9)
                boolean r10 = r11.F(r0)
                r9 = r9 | r10
                java.lang.Object r10 = r11.D()
                if (r9 != 0) goto L_0x007a
                U0.m$a r9 = U0.C4889m.f14007a
                java.lang.Object r9 = r9.a()
                if (r10 != r9) goto L_0x0084
            L_0x007a:
                us.o$d r10 = new us.o$d
                nI.l r9 = r8.f104094d
                r10.<init>(r9, r0)
                r11.u(r10)
            L_0x0084:
                r2 = r10
                nI.a r2 = (nI.C17631a) r2
                r11.P()
                r4 = 0
                r5 = 0
                r3 = r11
                vs.m.p(r0, r1, r2, r3, r4, r5)
                r11.P()
                boolean r9 = U0.C4895p.J()
                if (r9 == 0) goto L_0x009c
                U0.C4895p.R()
            L_0x009c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: us.o.i.a(t0.c, int, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C5938c) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(java.lang.String r20, ys.C12506e.a r21, nI.C17642l<? super java.lang.Boolean, XH.C16807N> r22, nI.C17642l<? super ys.C12503b, XH.C16807N> r23, androidx.compose.ui.d r24, U0.C4889m r25, int r26, int r27) {
        /*
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r6 = r26
            java.lang.String r0 = "screenTitle"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "uiState"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "onTitleVisibilityChanged"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.String r0 = "onAction"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            r0 = -516871547(0xffffffffe1312a85, float:-2.042586E20)
            r5 = r25
            U0.m r5 = r5.k(r0)
            r7 = r27 & 1
            r8 = 4
            if (r7 == 0) goto L_0x002f
            r7 = r6 | 6
            goto L_0x003f
        L_0x002f:
            r7 = r6 & 6
            if (r7 != 0) goto L_0x003e
            boolean r7 = r5.V(r1)
            if (r7 == 0) goto L_0x003b
            r7 = r8
            goto L_0x003c
        L_0x003b:
            r7 = 2
        L_0x003c:
            r7 = r7 | r6
            goto L_0x003f
        L_0x003e:
            r7 = r6
        L_0x003f:
            r9 = r27 & 2
            if (r9 == 0) goto L_0x0046
            r7 = r7 | 48
            goto L_0x005f
        L_0x0046:
            r9 = r6 & 48
            if (r9 != 0) goto L_0x005f
            r9 = r6 & 64
            if (r9 != 0) goto L_0x0053
            boolean r9 = r5.V(r2)
            goto L_0x0057
        L_0x0053:
            boolean r9 = r5.F(r2)
        L_0x0057:
            if (r9 == 0) goto L_0x005c
            r9 = 32
            goto L_0x005e
        L_0x005c:
            r9 = 16
        L_0x005e:
            r7 = r7 | r9
        L_0x005f:
            r9 = r27 & 4
            r10 = 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x0068
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x0077
        L_0x0068:
            r9 = r6 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0077
            boolean r9 = r5.F(r3)
            if (r9 == 0) goto L_0x0074
            r9 = r10
            goto L_0x0076
        L_0x0074:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0076:
            r7 = r7 | r9
        L_0x0077:
            r9 = r27 & 8
            r11 = 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x0080
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            goto L_0x008f
        L_0x0080:
            r9 = r6 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x008f
            boolean r9 = r5.F(r4)
            if (r9 == 0) goto L_0x008c
            r9 = r11
            goto L_0x008e
        L_0x008c:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x008e:
            r7 = r7 | r9
        L_0x008f:
            r9 = r27 & 16
            if (r9 == 0) goto L_0x0098
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
        L_0x0095:
            r12 = r24
            goto L_0x00aa
        L_0x0098:
            r12 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0095
            r12 = r24
            boolean r13 = r5.V(r12)
            if (r13 == 0) goto L_0x00a7
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a9
        L_0x00a7:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x00a9:
            r7 = r7 | r13
        L_0x00aa:
            r13 = r7 & 9363(0x2493, float:1.312E-41)
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r13 != r14) goto L_0x00bc
            boolean r13 = r5.l()
            if (r13 != 0) goto L_0x00b7
            goto L_0x00bc
        L_0x00b7:
            r5.L()
            goto L_0x0182
        L_0x00bc:
            if (r9 == 0) goto L_0x00c3
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            r19 = r9
            goto L_0x00c5
        L_0x00c3:
            r19 = r12
        L_0x00c5:
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x00d1
            r9 = -1
            java.lang.String r12 = "com.ingka.ikea.inbox.impl.compose.content.NotificationListContent (NotificationListContent.kt:38)"
            U0.C4895p.S(r0, r7, r9, r12)
        L_0x00d1:
            r0 = 3
            r9 = 0
            t0.A r0 = t0.C5935B.c(r9, r9, r5, r9, r0)
            r12 = -989820678(0xffffffffc50088fa, float:-2056.561)
            r5.W(r12)
            java.lang.Object r12 = r5.D()
            U0.m$a r13 = U0.C4889m.f14007a
            java.lang.Object r14 = r13.a()
            if (r12 != r14) goto L_0x00f5
            us.l r12 = new us.l
            r12.<init>(r0)
            U0.A1 r12 = U0.p1.e(r12)
            r5.u(r12)
        L_0x00f5:
            U0.A1 r12 = (U0.A1) r12
            r5.P()
            boolean r14 = f(r12)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            r15 = -989816834(0xffffffffc50097fe, float:-2057.4995)
            r5.W(r15)
            r15 = r7 & 896(0x380, float:1.256E-42)
            r16 = 1
            if (r15 != r10) goto L_0x0111
            r10 = r16
            goto L_0x0112
        L_0x0111:
            r10 = r9
        L_0x0112:
            java.lang.Object r15 = r5.D()
            if (r10 != 0) goto L_0x011e
            java.lang.Object r10 = r13.a()
            if (r15 != r10) goto L_0x0127
        L_0x011e:
            us.o$a r15 = new us.o$a
            r10 = 0
            r15.<init>(r3, r12, r10)
            r5.u(r15)
        L_0x0127:
            nI.p r15 = (nI.p) r15
            r5.P()
            U0.P.g(r14, r15, r5, r9)
            r10 = -989811218(0xffffffffc500adee, float:-2058.8706)
            r5.W(r10)
            r10 = r7 & 14
            if (r10 != r8) goto L_0x013c
            r8 = r16
            goto L_0x013d
        L_0x013c:
            r8 = r9
        L_0x013d:
            boolean r10 = r5.F(r2)
            r8 = r8 | r10
            r10 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != r11) goto L_0x0148
            r9 = r16
        L_0x0148:
            r8 = r8 | r9
            java.lang.Object r9 = r5.D()
            if (r8 != 0) goto L_0x0155
            java.lang.Object r8 = r13.a()
            if (r9 != r8) goto L_0x015d
        L_0x0155:
            us.m r9 = new us.m
            r9.<init>(r2, r1, r4)
            r5.u(r9)
        L_0x015d:
            r15 = r9
            nI.l r15 = (nI.C17642l) r15
            r5.P()
            int r7 = r7 >> 12
            r17 = r7 & 14
            r18 = 252(0xfc, float:3.53E-43)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r7 = r19
            r8 = r0
            r16 = r5
            t0.C5937b.a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0180
            U0.C4895p.R()
        L_0x0180:
            r12 = r19
        L_0x0182:
            U0.Y0 r8 = r5.n()
            if (r8 == 0) goto L_0x019e
            us.n r9 = new us.n
            r0 = r9
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r12
            r6 = r26
            r7 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x019e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: us.o.d(java.lang.String, ys.e$a, nI.l, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final boolean e(C5934A a10) {
        return a10.s() == 0;
    }

    /* access modifiers changed from: private */
    public static final boolean f(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N g(C12506e.a aVar, String str, C17642l lVar, x xVar) {
        C17542s.j(xVar, "$this$LazyColumn");
        x xVar2 = xVar;
        x.i(xVar2, "StableKey-ScreenTitle", (Object) null, c1.c.c(-1287957391, true, new b(str)), 2, (Object) null);
        x.i(xVar2, "StableKey-ScreenTitleSpacing", (Object) null, C12081a.f104050a.a(), 2, (Object) null);
        if (aVar.f()) {
            x.i(xVar, "StableKey-EnableNotifications", (Object) null, c1.c.c(-230945290, true, new c(lVar)), 2, (Object) null);
        }
        C15987c<C12505d> e10 = aVar.e();
        e eVar = e.f104087a;
        xVar.e(e10.size(), new g(new f((String) null), e10), new h(eVar, e10), c1.c.c(-632812321, true, new i(e10, lVar)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(String str, C12506e.a aVar, C17642l lVar, C17642l lVar2, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        d(str, aVar, lVar, lVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
