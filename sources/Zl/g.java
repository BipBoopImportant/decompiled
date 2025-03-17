package zl;

import B0.C4380y;
import N1.P;
import N1.W;
import N1.X;
import QJ.Q;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import TC.C13679b;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.M0;
import U0.o1;
import XH.C16807N;
import XH.y;
import Y1.j;
import Y1.k;
import androidx.compose.ui.focus.m;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n1.C5626f;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a[\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f²\u0006\u000e\u0010\u000e\u001a\u00020\r8\n@\nX\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u0002"}, d2 = {"", "value", "Lkotlin/Function1;", "LXH/N;", "onValueChange", "Lkotlin/Function0;", "onBack", "placeholder", "Landroidx/compose/ui/d;", "modifier", "onImeSearch", "f", "(Ljava/lang/String;LnI/l;LnI/a;Ljava/lang/String;Landroidx/compose/ui/d;LnI/a;LU0/m;II)V", "LT1/P;", "titleTextFieldValueState", "uicomposables_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.uicomposables.search.SearchFieldKt$SearchField$2$1", f = "SearchField.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f107494c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ m f107495d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(m mVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f107495d = mVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f107495d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f107494c == 0) {
                y.b(obj);
                this.f107495d.f();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f107496a;

        b(String str) {
            this.f107496a = str;
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-2140657125, i11, -1, "com.ingka.ikea.app.uicomposables.search.SearchField.<anonymous> (SearchField.kt:88)");
                }
                C13607l.j(this.f107496a, C13679b.a.C2855a.f116679a, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262140);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5626f f107497a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f107498b;

        c(C5626f fVar, C17631a<C16807N> aVar) {
            this.f107497a = fVar;
            this.f107498b = aVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C5626f fVar, C17631a aVar) {
            C5626f.q(fVar, false, 1, (Object) null);
            aVar.invoke();
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(U0.C4889m r13, int r14) {
            /*
                r12 = this;
                r0 = r14 & 3
                r1 = 2
                if (r0 != r1) goto L_0x0010
                boolean r0 = r13.l()
                if (r0 != 0) goto L_0x000c
                goto L_0x0010
            L_0x000c:
                r13.L()
                goto L_0x0075
            L_0x0010:
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x001f
                r0 = -1
                java.lang.String r1 = "com.ingka.ikea.app.uicomposables.search.SearchField.<anonymous> (SearchField.kt:94)"
                r2 = -1855521222(0xffffffff9166fe3a, float:-1.822214E-28)
                U0.C4895p.S(r2, r14, r0, r1)
            L_0x001f:
                r14 = 1895461124(0x70fa7104, float:6.2006304E29)
                r13.W(r14)
                n1.f r14 = r12.f107497a
                boolean r14 = r13.F(r14)
                nI.a<XH.N> r0 = r12.f107498b
                boolean r0 = r13.V(r0)
                r14 = r14 | r0
                n1.f r0 = r12.f107497a
                nI.a<XH.N> r1 = r12.f107498b
                java.lang.Object r2 = r13.D()
                if (r14 != 0) goto L_0x0044
                U0.m$a r14 = U0.C4889m.f14007a
                java.lang.Object r14 = r14.a()
                if (r2 != r14) goto L_0x004c
            L_0x0044:
                zl.h r2 = new zl.h
                r2.<init>(r0, r1)
                r13.u(r2)
            L_0x004c:
                r3 = r2
                nI.a r3 = (nI.C17631a) r3
                r13.P()
                androidx.compose.ui.d$a r14 = androidx.compose.ui.d.f18749a
                java.lang.String r0 = "TestTag-Search-LeadingIcon"
                androidx.compose.ui.d r4 = androidx.compose.ui.platform.C5116k1.a(r14, r0)
                zl.a r14 = zl.C12533a.f107475a
                nI.p r8 = r14.a()
                r10 = 196656(0x30030, float:2.75574E-40)
                r11 = 28
                r5 = 0
                r6 = 0
                r7 = 0
                r9 = r13
                O0.U.a(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                boolean r13 = U0.C4895p.J()
                if (r13 == 0) goto L_0x0075
                U0.C4895p.R()
            L_0x0075:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zl.g.c.b(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f107499a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C4899r0<T1.P> f107500b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f107501c;

        d(String str, C4899r0<T1.P> r0Var, C17642l<? super String, C16807N> lVar) {
            this.f107499a = str;
            this.f107500b = r0Var;
            this.f107501c = lVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17642l lVar, C4899r0 r0Var) {
            g.l(r0Var, new T1.P("", X.a(0), (W) null, 4, (DefaultConstructorMarker) null));
            lVar.invoke("");
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(U0.C4889m r13, int r14) {
            /*
                r12 = this;
                r0 = r14 & 3
                r1 = 2
                if (r0 != r1) goto L_0x0010
                boolean r0 = r13.l()
                if (r0 != 0) goto L_0x000c
                goto L_0x0010
            L_0x000c:
                r13.L()
                goto L_0x007d
            L_0x0010:
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x001f
                r0 = -1
                java.lang.String r1 = "com.ingka.ikea.app.uicomposables.search.SearchField.<anonymous> (SearchField.kt:121)"
                r2 = -1570385319(0xffffffffa265d259, float:-3.1146644E-18)
                U0.C4895p.S(r2, r14, r0, r1)
            L_0x001f:
                java.lang.String r14 = r12.f107499a
                int r14 = r14.length()
                if (r14 <= 0) goto L_0x0074
                r14 = 1895493948(0x70faf13c, float:6.213031E29)
                r13.W(r14)
                U0.r0<T1.P> r14 = r12.f107500b
                boolean r14 = r13.V(r14)
                nI.l<java.lang.String, XH.N> r0 = r12.f107501c
                boolean r0 = r13.V(r0)
                r14 = r14 | r0
                nI.l<java.lang.String, XH.N> r0 = r12.f107501c
                U0.r0<T1.P> r1 = r12.f107500b
                java.lang.Object r2 = r13.D()
                if (r14 != 0) goto L_0x004c
                U0.m$a r14 = U0.C4889m.f14007a
                java.lang.Object r14 = r14.a()
                if (r2 != r14) goto L_0x0054
            L_0x004c:
                zl.i r2 = new zl.i
                r2.<init>(r0, r1)
                r13.u(r2)
            L_0x0054:
                r3 = r2
                nI.a r3 = (nI.C17631a) r3
                r13.P()
                androidx.compose.ui.d$a r14 = androidx.compose.ui.d.f18749a
                java.lang.String r0 = "TestTag-Search-TrailingIcon"
                androidx.compose.ui.d r4 = androidx.compose.ui.platform.C5116k1.a(r14, r0)
                zl.a r14 = zl.C12533a.f107475a
                nI.p r8 = r14.b()
                r10 = 196656(0x30030, float:2.75574E-40)
                r11 = 28
                r5 = 0
                r6 = 0
                r7 = 0
                r9 = r13
                O0.U.a(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            L_0x0074:
                boolean r13 = U0.C4895p.J()
                if (r13 == 0) goto L_0x007d
                U0.C4895p.R()
            L_0x007d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zl.g.d.b(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(java.lang.String r110, nI.C17642l<? super java.lang.String, XH.C16807N> r111, nI.C17631a<XH.C16807N> r112, java.lang.String r113, androidx.compose.ui.d r114, nI.C17631a<XH.C16807N> r115, U0.C4889m r116, int r117, int r118) {
        /*
            r1 = r110
            r2 = r111
            r3 = r112
            r4 = r113
            r7 = r117
            java.lang.String r0 = "value"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "onBack"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.String r0 = "placeholder"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            r0 = -1392543774(0xffffffffacff77e2, float:-7.2608456E-12)
            r5 = r116
            U0.m r5 = r5.k(r0)
            r6 = r118 & 1
            r8 = 4
            if (r6 == 0) goto L_0x002f
            r6 = r7 | 6
            goto L_0x003f
        L_0x002f:
            r6 = r7 & 6
            if (r6 != 0) goto L_0x003e
            boolean r6 = r5.V(r1)
            if (r6 == 0) goto L_0x003b
            r6 = r8
            goto L_0x003c
        L_0x003b:
            r6 = 2
        L_0x003c:
            r6 = r6 | r7
            goto L_0x003f
        L_0x003e:
            r6 = r7
        L_0x003f:
            r9 = r118 & 2
            if (r9 == 0) goto L_0x0046
            r6 = r6 | 48
            goto L_0x0056
        L_0x0046:
            r9 = r7 & 48
            if (r9 != 0) goto L_0x0056
            boolean r9 = r5.F(r2)
            if (r9 == 0) goto L_0x0053
            r9 = 32
            goto L_0x0055
        L_0x0053:
            r9 = 16
        L_0x0055:
            r6 = r6 | r9
        L_0x0056:
            r9 = r118 & 4
            if (r9 == 0) goto L_0x005d
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x006d
        L_0x005d:
            r9 = r7 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x006d
            boolean r9 = r5.F(r3)
            if (r9 == 0) goto L_0x006a
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x006c
        L_0x006a:
            r9 = 128(0x80, float:1.794E-43)
        L_0x006c:
            r6 = r6 | r9
        L_0x006d:
            r9 = r118 & 8
            if (r9 == 0) goto L_0x0074
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x0084
        L_0x0074:
            r9 = r7 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0084
            boolean r9 = r5.V(r4)
            if (r9 == 0) goto L_0x0081
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0083
        L_0x0081:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0083:
            r6 = r6 | r9
        L_0x0084:
            r9 = r118 & 16
            if (r9 == 0) goto L_0x008d
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x008a:
            r10 = r114
            goto L_0x009f
        L_0x008d:
            r10 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x008a
            r10 = r114
            boolean r11 = r5.V(r10)
            if (r11 == 0) goto L_0x009c
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009c:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r6 = r6 | r11
        L_0x009f:
            r11 = r118 & 32
            r12 = 196608(0x30000, float:2.75506E-40)
            if (r11 == 0) goto L_0x00a9
            r6 = r6 | r12
        L_0x00a6:
            r12 = r115
            goto L_0x00ba
        L_0x00a9:
            r12 = r12 & r7
            if (r12 != 0) goto L_0x00a6
            r12 = r115
            boolean r13 = r5.F(r12)
            if (r13 == 0) goto L_0x00b7
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b7:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r6 = r6 | r13
        L_0x00ba:
            r13 = 74899(0x12493, float:1.04956E-40)
            r13 = r13 & r6
            r14 = 74898(0x12492, float:1.04954E-40)
            if (r13 != r14) goto L_0x00d0
            boolean r13 = r5.l()
            if (r13 != 0) goto L_0x00ca
            goto L_0x00d0
        L_0x00ca:
            r5.L()
            r6 = r12
            goto L_0x0344
        L_0x00d0:
            if (r9 == 0) goto L_0x00d6
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            r14 = r9
            goto L_0x00d7
        L_0x00d6:
            r14 = r10
        L_0x00d7:
            if (r11 == 0) goto L_0x00fa
            r9 = -565942268(0xffffffffde446804, float:-3.53814156E18)
            r5.W(r9)
            java.lang.Object r9 = r5.D()
            U0.m$a r10 = U0.C4889m.f14007a
            java.lang.Object r10 = r10.a()
            if (r9 != r10) goto L_0x00f3
            zl.b r9 = new zl.b
            r9.<init>()
            r5.u(r9)
        L_0x00f3:
            nI.a r9 = (nI.C17631a) r9
            r5.P()
            r13 = r9
            goto L_0x00fb
        L_0x00fa:
            r13 = r12
        L_0x00fb:
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x0107
            r9 = -1
            java.lang.String r10 = "com.ingka.ikea.app.uicomposables.search.SearchField (SearchField.kt:63)"
            U0.C4895p.S(r0, r6, r9, r10)
        L_0x0107:
            U0.I0 r0 = androidx.compose.ui.platform.C5100f0.f()
            java.lang.Object r0 = r5.Q(r0)
            n1.f r0 = (n1.C5626f) r0
            r9 = -565939457(0xffffffffde4472ff, float:-3.53891424E18)
            r5.W(r9)
            java.lang.Object r9 = r5.D()
            U0.m$a r102 = U0.C4889m.f14007a
            java.lang.Object r10 = r102.a()
            if (r9 != r10) goto L_0x012b
            androidx.compose.ui.focus.m r9 = new androidx.compose.ui.focus.m
            r9.<init>()
            r5.u(r9)
        L_0x012b:
            r12 = r9
            androidx.compose.ui.focus.m r12 = (androidx.compose.ui.focus.m) r12
            r5.P()
            r11 = 0
            java.lang.Object[] r9 = new java.lang.Object[r11]
            T1.P$c r10 = T1.P.f13537d
            f1.k r10 = r10.a()
            r11 = -565932375(0xffffffffde448ea9, float:-3.54086092E18)
            r5.W(r11)
            r11 = r6 & 14
            if (r11 != r8) goto L_0x0146
            r8 = 1
            goto L_0x0147
        L_0x0146:
            r8 = 0
        L_0x0147:
            java.lang.Object r11 = r5.D()
            if (r8 != 0) goto L_0x0153
            java.lang.Object r8 = r102.a()
            if (r11 != r8) goto L_0x015b
        L_0x0153:
            zl.c r11 = new zl.c
            r11.<init>(r1)
            r5.u(r11)
        L_0x015b:
            nI.a r11 = (nI.C17631a) r11
            r5.P()
            r17 = 0
            r18 = 4
            r19 = 0
            r8 = r9
            r9 = r10
            r10 = r19
            r103 = 0
            r15 = r12
            r12 = r5
            r104 = r13
            r13 = r17
            r105 = r14
            r7 = 131072(0x20000, float:1.83671E-40)
            r14 = r18
            U0.r0 r13 = f1.C5301c.d(r8, r9, r10, r11, r12, r13, r14)
            XH.N r8 = XH.C16807N.f139792a
            r9 = -565926289(0xffffffffde44a66f, float:-3.54253383E18)
            r5.W(r9)
            java.lang.Object r9 = r5.D()
            java.lang.Object r10 = r102.a()
            r14 = 0
            if (r9 != r10) goto L_0x0197
            zl.g$a r9 = new zl.g$a
            r9.<init>(r15, r14)
            r5.u(r9)
        L_0x0197:
            nI.p r9 = (nI.p) r9
            r5.P()
            r10 = 6
            U0.P.g(r8, r9, r5, r10)
            T1.P r106 = k(r13)
            B0.A r107 = new B0.A
            T1.r$a r8 = T1.r.f13620b
            int r21 = r8.g()
            r25 = 119(0x77, float:1.67E-43)
            r26 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r17 = r107
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r8 = -565889632(0xffffffffde4535a0, float:-3.55261003E18)
            r5.W(r8)
            boolean r8 = r5.V(r13)
            boolean r9 = r5.F(r0)
            r8 = r8 | r9
            r9 = 458752(0x70000, float:6.42848E-40)
            r9 = r9 & r6
            if (r9 != r7) goto L_0x01d7
            r11 = 1
            goto L_0x01d9
        L_0x01d7:
            r11 = r103
        L_0x01d9:
            r7 = r8 | r11
            java.lang.Object r8 = r5.D()
            if (r7 != 0) goto L_0x01eb
            java.lang.Object r7 = r102.a()
            if (r8 != r7) goto L_0x01e8
            goto L_0x01eb
        L_0x01e8:
            r7 = r104
            goto L_0x01f5
        L_0x01eb:
            zl.d r8 = new zl.d
            r7 = r104
            r8.<init>(r0, r7, r13)
            r5.u(r8)
        L_0x01f5:
            r22 = r8
            nI.l r22 = (nI.C17642l) r22
            r5.P()
            B0.z r104 = new B0.z
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 47
            r25 = 0
            r17 = r104
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            O0.l0 r8 = O0.C4739l0.f11144a
            tK.v r9 = tK.C18030v.f147664a
            int r10 = tK.C18030v.f147665b
            tK.h r11 = r9.a(r5, r10)
            long r17 = r11.k0()
            tK.h r11 = r9.a(r5, r10)
            long r19 = r11.l0()
            tK.h r9 = r9.a(r5, r10)
            long r30 = r9.Q()
            p1.v0$a r9 = p1.C5747v0.f27350b
            long r32 = r9.h()
            r100 = 2147477455(0x7fffe7cf, float:NaN)
            r101 = 4095(0xfff, float:5.738E-42)
            r9 = 0
            r11 = 0
            r21 = 0
            r108 = r13
            r13 = r21
            r109 = r15
            r15 = r21
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r34 = 0
            r36 = 0
            r38 = 0
            r40 = 0
            r42 = 0
            r44 = 0
            r46 = 0
            r48 = 0
            r50 = 0
            r52 = 0
            r54 = 0
            r56 = 0
            r58 = 0
            r60 = 0
            r62 = 0
            r64 = 0
            r66 = 0
            r68 = 0
            r70 = 0
            r72 = 0
            r74 = 0
            r76 = 0
            r78 = 0
            r80 = 0
            r82 = 0
            r84 = 0
            r86 = 0
            r88 = 0
            r90 = 0
            r92 = 0
            r95 = 0
            r96 = 384(0x180, float:5.38E-43)
            r97 = 0
            r98 = 0
            r99 = 3072(0xc00, float:4.305E-42)
            r94 = r5
            O0.Z0 r30 = r8.d(r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r74, r76, r78, r80, r82, r84, r86, r88, r90, r92, r94, r95, r96, r97, r98, r99, r100, r101)
            r8 = 50
            A0.f r29 = A0.g.b(r8, r8, r8, r8)
            r8 = 0
            r10 = r105
            r9 = 0
            r11 = 1
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.h(r10, r8, r11, r9)
            r9 = r109
            androidx.compose.ui.d r8 = androidx.compose.ui.focus.n.a(r8, r9)
            java.lang.String r9 = "TestTag-Search-SearchField"
            androidx.compose.ui.d r23 = androidx.compose.ui.platform.C5116k1.a(r8, r9)
            r8 = -565921869(0xffffffffde44b7b3, float:-3.54374879E18)
            r5.W(r8)
            r8 = r108
            boolean r9 = r5.V(r8)
            r6 = r6 & 112(0x70, float:1.57E-43)
            r12 = 32
            if (r6 != r12) goto L_0x02cb
            r103 = r11
        L_0x02cb:
            r6 = r9 | r103
            java.lang.Object r9 = r5.D()
            if (r6 != 0) goto L_0x02d9
            java.lang.Object r6 = r102.a()
            if (r9 != r6) goto L_0x02e1
        L_0x02d9:
            zl.e r9 = new zl.e
            r9.<init>(r2, r8)
            r5.u(r9)
        L_0x02e1:
            nI.l r9 = (nI.C17642l) r9
            r5.P()
            zl.g$b r6 = new zl.g$b
            r6.<init>(r4)
            r12 = -2140657125(0xffffffff80682a1b, float:-9.565996E-39)
            r13 = 54
            c1.a r15 = c1.c.e(r12, r11, r6, r5, r13)
            zl.g$c r6 = new zl.g$c
            r6.<init>(r0, r3)
            r0 = -1855521222(0xffffffff9166fe3a, float:-1.822214E-28)
            c1.a r16 = c1.c.e(r0, r11, r6, r5, r13)
            zl.g$d r0 = new zl.g$d
            r0.<init>(r1, r8, r2)
            r6 = -1570385319(0xffffffffa265d259, float:-3.1146644E-18)
            c1.a r17 = c1.c.e(r6, r11, r0, r5, r13)
            r34 = 0
            r35 = 1866872(0x1c7c78, float:2.616045E-39)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r25 = 1
            r26 = 0
            r27 = 0
            r28 = 0
            r32 = 918552576(0x36c00000, float:5.722046E-6)
            r33 = 12779520(0xc30000, float:1.7907922E-38)
            r8 = r106
            r0 = r10
            r10 = r23
            r23 = r107
            r24 = r104
            r31 = r5
            O0.C4741m0.a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0342
            U0.C4895p.R()
        L_0x0342:
            r10 = r0
            r6 = r7
        L_0x0344:
            U0.Y0 r9 = r5.n()
            if (r9 == 0) goto L_0x0360
            zl.f r11 = new zl.f
            r0 = r11
            r1 = r110
            r2 = r111
            r3 = r112
            r4 = r113
            r5 = r10
            r7 = r117
            r8 = r118
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r11)
        L_0x0360:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zl.g.f(java.lang.String, nI.l, nI.a, java.lang.String, androidx.compose.ui.d, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N g() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C17642l lVar, C4899r0 r0Var, T1.P p10) {
        C17542s.j(p10, "tfv");
        l(r0Var, p10);
        lVar.invoke(p10.i());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(String str, C17642l lVar, C17631a aVar, String str2, androidx.compose.ui.d dVar, C17631a aVar2, int i10, int i11, C4889m mVar, int i12) {
        f(str, lVar, aVar, str2, dVar, aVar2, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C4899r0 j(String str) {
        return u1.e(new T1.P(str, X.a(str.length()), (W) null, 4, (DefaultConstructorMarker) null), (o1) null, 2, (Object) null);
    }

    private static final T1.P k(C4899r0<T1.P> r0Var) {
        return r0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final void l(C4899r0<T1.P> r0Var, T1.P p10) {
        r0Var.setValue(p10);
    }

    /* access modifiers changed from: private */
    public static final C16807N m(C5626f fVar, C17631a aVar, C4899r0 r0Var, C4380y yVar) {
        C17542s.j(yVar, "$this$KeyboardActions");
        if (k(r0Var).i().length() > 0) {
            C5626f.q(fVar, false, 1, (Object) null);
            aVar.invoke();
        }
        return C16807N.f139792a;
    }
}
