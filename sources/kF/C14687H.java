package kF;

import QJ.F0;
import QJ.Q;
import QJ.T;
import U0.C4889m;
import U0.C4899r0;
import U0.M0;
import XH.C16807N;
import XH.y;
import android.util.Log;
import androidx.compose.ui.d;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.core.logger.AnyKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001am\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022(\b\u0002\u0010\t\u001a\"\b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00042\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011²\u0006\u000e\u0010\u0010\u001a\u00020\u00078\n@\nX\u0002"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "LkF/D;", "productCardInformation", "Lkotlin/Function2;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "LdI/e;", "", "", "onAddItemToCart", "Lkotlin/Function1;", "onAddItemToFav", "isFavorite", "LXH/N;", "d", "(Landroidx/compose/ui/d;LkF/D;LnI/p;LnI/l;ZLU0/m;II)V", "showLoading", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: kF.H  reason: case insensitive filesystem */
public final class C14687H {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.compose.common.ProductCardKt$ProductCard$1$1$1$1$1$1", f = "ProductCard.kt", l = {}, m = "invokeSuspend")
    /* renamed from: kF.H$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f128690c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<CachedCatalogItem, Boolean> f128691d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C14683D f128692e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f128693f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17642l<? super CachedCatalogItem, Boolean> lVar, C14683D d10, boolean z10, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f128691d = lVar;
            this.f128692e = d10;
            this.f128693f = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f128691d, this.f128692e, this.f128693f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f128690c == 0) {
                y.b(obj);
                Log.d(AnyKt.SUGARCUBE_TAG, this.f128691d.invoke(this.f128692e.a()).booleanValue() ? this.f128693f ? "Added to favorites" : "Removed from favorites" : "Couldn't add to favorites");
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.compose.common.ProductCardKt$ProductCard$1$1$3$2$1$1$1", f = "ProductCard.kt", l = {214}, m = "invokeSuspend")
    /* renamed from: kF.H$b */
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f128694c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<CachedCatalogItem, C17164e<? super Boolean>, Object> f128695d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C14683D f128696e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f128697f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(p<? super CachedCatalogItem, ? super C17164e<? super Boolean>, ? extends Object> pVar, C14683D d10, C4899r0<Boolean> r0Var, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f128695d = pVar;
            this.f128696e = d10;
            this.f128697f = r0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f128695d, this.f128696e, this.f128697f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            Object f10 = C17187b.f();
            int i10 = this.f128694c;
            if (i10 == 0) {
                y.b(obj);
                p<CachedCatalogItem, C17164e<? super Boolean>, Object> pVar = this.f128695d;
                CachedCatalogItem a10 = this.f128696e.a();
                this.f128694c = 1;
                obj = pVar.invoke(a10, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = null;
            if (((Boolean) obj).booleanValue()) {
                String e10 = this.f128696e.e();
                if (e10 != null) {
                    str2 = e10.toUpperCase(Locale.ROOT);
                    C17542s.i(str2, "toUpperCase(...)");
                }
                str = "Added " + str2 + " to cart";
            } else {
                String e11 = this.f128696e.e();
                if (e11 != null) {
                    str2 = e11.toUpperCase(Locale.ROOT);
                    C17542s.i(str2, "toUpperCase(...)");
                }
                str = "Couldn't add " + str2 + " to cart";
            }
            C14687H.h(this.f128697f, false);
            Log.d(AnyKt.SUGARCUBE_TAG, str);
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v7, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x05f9  */
    /* JADX WARNING: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(androidx.compose.ui.d r40, kF.C14683D r41, nI.p<? super com.sugarcube.app.base.data.database.CachedCatalogItem, ? super dI.C17164e<? super java.lang.Boolean>, ? extends java.lang.Object> r42, nI.C17642l<? super com.sugarcube.app.base.data.database.CachedCatalogItem, java.lang.Boolean> r43, boolean r44, U0.C4889m r45, int r46, int r47) {
        /*
            r2 = r41
            r5 = r44
            r6 = r46
            r0 = 8
            r1 = 16
            r3 = 4
            r4 = 6
            java.lang.String r7 = "productCardInformation"
            kotlin.jvm.internal.C17542s.j(r2, r7)
            r7 = 667767781(0x27cd53e5, float:5.698989E-15)
            r8 = r45
            U0.m r15 = r8.k(r7)
            r14 = 1
            r8 = r47 & 1
            r13 = 2
            if (r8 == 0) goto L_0x0026
            r9 = r6 | 6
            r10 = r9
            r9 = r40
            goto L_0x003a
        L_0x0026:
            r9 = r6 & 6
            if (r9 != 0) goto L_0x0037
            r9 = r40
            boolean r10 = r15.V(r9)
            if (r10 == 0) goto L_0x0034
            r10 = r3
            goto L_0x0035
        L_0x0034:
            r10 = r13
        L_0x0035:
            r10 = r10 | r6
            goto L_0x003a
        L_0x0037:
            r9 = r40
            r10 = r6
        L_0x003a:
            r11 = r47 & 2
            if (r11 == 0) goto L_0x0041
            r10 = r10 | 48
            goto L_0x0050
        L_0x0041:
            r11 = r6 & 48
            if (r11 != 0) goto L_0x0050
            boolean r11 = r15.F(r2)
            if (r11 == 0) goto L_0x004e
            r11 = 32
            goto L_0x004f
        L_0x004e:
            r11 = r1
        L_0x004f:
            r10 = r10 | r11
        L_0x0050:
            r3 = r47 & 4
            if (r3 == 0) goto L_0x0059
            r10 = r10 | 384(0x180, float:5.38E-43)
        L_0x0056:
            r11 = r42
            goto L_0x006c
        L_0x0059:
            r11 = r6 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x0056
            r11 = r42
            boolean r16 = r15.F(r11)
            if (r16 == 0) goto L_0x0068
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x006a
        L_0x0068:
            r16 = 128(0x80, float:1.794E-43)
        L_0x006a:
            r10 = r10 | r16
        L_0x006c:
            r16 = r47 & 8
            if (r16 == 0) goto L_0x0075
            r10 = r10 | 3072(0xc00, float:4.305E-42)
        L_0x0072:
            r12 = r43
            goto L_0x0088
        L_0x0075:
            r12 = r6 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x0072
            r12 = r43
            boolean r17 = r15.F(r12)
            if (r17 == 0) goto L_0x0084
            r17 = 2048(0x800, float:2.87E-42)
            goto L_0x0086
        L_0x0084:
            r17 = 1024(0x400, float:1.435E-42)
        L_0x0086:
            r10 = r10 | r17
        L_0x0088:
            r1 = r47 & 16
            if (r1 == 0) goto L_0x008f
            r10 = r10 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009f
        L_0x008f:
            r1 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L_0x009f
            boolean r1 = r15.b(r5)
            if (r1 == 0) goto L_0x009c
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009c:
            r1 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r10 = r10 | r1
        L_0x009f:
            r1 = r10 & 9363(0x2493, float:1.312E-41)
            r4 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r4) goto L_0x00b6
            boolean r1 = r15.l()
            if (r1 != 0) goto L_0x00ac
            goto L_0x00b6
        L_0x00ac:
            r15.L()
            r1 = r9
            r3 = r11
            r39 = r12
            r4 = r15
            goto L_0x05f3
        L_0x00b6:
            if (r8 == 0) goto L_0x00bb
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            goto L_0x00bc
        L_0x00bb:
            r1 = r9
        L_0x00bc:
            r4 = 0
            if (r3 == 0) goto L_0x00c1
            r3 = r4
            goto L_0x00c2
        L_0x00c1:
            r3 = r11
        L_0x00c2:
            if (r16 == 0) goto L_0x00c5
            r12 = r4
        L_0x00c5:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x00d1
            r8 = -1
            java.lang.String r9 = "com.sugarcube.app.base.ui.compose.common.ProductCard (ProductCard.kt:109)"
            U0.C4895p.S(r7, r10, r8, r9)
        L_0x00d1:
            r7 = -800868493(0xffffffffd043b773, float:-1.31343186E10)
            r15.W(r7)
            java.lang.Object r7 = r15.D()
            U0.m$a r33 = U0.C4889m.f14007a
            java.lang.Object r8 = r33.a()
            if (r7 != r8) goto L_0x00ec
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            U0.r0 r7 = U0.u1.e(r7, r4, r13, r4)
            r15.u(r7)
        L_0x00ec:
            U0.r0 r7 = (U0.C4899r0) r7
            r15.P()
            java.lang.Object r8 = r15.D()
            java.lang.Object r9 = r33.a()
            if (r8 != r9) goto L_0x010a
            dI.j r8 = dI.C17169j.f142968a
            QJ.Q r8 = U0.P.k(r8, r15)
            U0.B r9 = new U0.B
            r9.<init>(r8)
            r15.u(r9)
            r8 = r9
        L_0x010a:
            U0.B r8 = (U0.B) r8
            QJ.Q r11 = r8.a()
            androidx.compose.foundation.layout.d r34 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r8 = r34.g()
            i1.c$a r35 = i1.C5437c.f24302a
            i1.c$b r9 = r35.k()
            r4 = 0
            E1.I r8 = androidx.compose.foundation.layout.C5080k.a(r8, r9, r15, r4)
            int r9 = U0.C4883j.a(r15, r4)
            U0.y r13 = r15.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r15, r1)
            G1.g$a r36 = G1.C4504g.f6515W
            nI.a r4 = r36.a()
            U0.f r18 = r15.m()
            if (r18 != 0) goto L_0x013c
            U0.C4883j.c()
        L_0x013c:
            r15.I()
            boolean r18 = r15.i()
            if (r18 == 0) goto L_0x0149
            r15.p(r4)
            goto L_0x014c
        L_0x0149:
            r15.t()
        L_0x014c:
            U0.m r4 = U0.F1.a(r15)
            nI.p r14 = r36.c()
            U0.F1.c(r4, r8, r14)
            nI.p r8 = r36.e()
            U0.F1.c(r4, r13, r8)
            nI.p r8 = r36.b()
            boolean r13 = r4.i()
            if (r13 != 0) goto L_0x0176
            java.lang.Object r13 = r4.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r9)
            boolean r13 = kotlin.jvm.internal.C17542s.e(r13, r14)
            if (r13 != 0) goto L_0x0184
        L_0x0176:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            r4.u(r13)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r4.w(r9, r8)
        L_0x0184:
            nI.p r8 = r36.d()
            U0.F1.c(r4, r0, r8)
            s0.h r0 = s0.C5862h.f28810a
            U0.I0 r4 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r4 = r15.Q(r4)
            android.content.Context r4 = (android.content.Context) r4
            r8 = 761713977(0x2d66d539, float:1.3121331E-11)
            r15.W(r8)
            r37 = 199728(0x30c30, float:2.79879E-40)
            if (r12 != 0) goto L_0x01a9
            r0 = r11
            r39 = r12
            r43 = r15
            goto L_0x0231
        L_0x01a9:
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            i1.c$b r9 = r35.j()
            androidx.compose.ui.d r0 = r0.b(r8, r9)
            if (r5 == 0) goto L_0x01bc
            uK.c r8 = uK.C18148c.HeartFilled
            int r8 = r8.m()
            goto L_0x01c2
        L_0x01bc:
            uK.c r8 = uK.C18148c.Heart
            int r8 = r8.m()
        L_0x01c2:
            wK.m3$g r13 = wK.C18405m3.g.f151252b
            wK.k3 r19 = wK.C18381k3.XSmall
            r9 = 1091196045(0x410a548d, float:8.645642)
            r15.W(r9)
            boolean r9 = r15.F(r11)
            boolean r20 = r15.V(r12)
            r9 = r9 | r20
            boolean r20 = r15.F(r2)
            r9 = r9 | r20
            r20 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r20
            r14 = 16384(0x4000, float:2.2959E-41)
            if (r10 != r14) goto L_0x01e7
            r10 = 1
            goto L_0x01e8
        L_0x01e7:
            r10 = 0
        L_0x01e8:
            r9 = r9 | r10
            java.lang.Object r10 = r15.D()
            if (r9 != 0) goto L_0x01f5
            java.lang.Object r9 = r33.a()
            if (r10 != r9) goto L_0x01fd
        L_0x01f5:
            kF.E r10 = new kF.E
            r10.<init>(r11, r12, r2, r5)
            r15.u(r10)
        L_0x01fd:
            r18 = r10
            nI.a r18 = (nI.C17631a) r18
            r15.P()
            int r9 = wK.C18405m3.g.f151253c
            r14 = 12
            int r9 = r9 << r14
            r20 = r9 | r37
            r21 = 192(0xc0, float:2.69E-43)
            java.lang.String r9 = "Save to favourites"
            r22 = 1
            r24 = 0
            r25 = 0
            r10 = r0
            r0 = r11
            r11 = r22
            r39 = r12
            r12 = r13
            r13 = r19
            r14 = r24
            r43 = r15
            r15 = r25
            r16 = r18
            r17 = r43
            r18 = r20
            r19 = r21
            wK.C18357i3.c(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            XH.N r8 = XH.C16807N.f139792a
        L_0x0231:
            r43.P()
            androidx.compose.ui.d$a r15 = androidx.compose.ui.d.f18749a
            androidx.compose.foundation.layout.d$e r8 = r34.f()
            i1.c$c r9 = r35.l()
            r14 = r43
            r10 = 0
            E1.I r8 = androidx.compose.foundation.layout.G.b(r8, r9, r14, r10)
            int r9 = U0.C4883j.a(r14, r10)
            U0.y r10 = r14.s()
            androidx.compose.ui.d r11 = androidx.compose.ui.c.e(r14, r15)
            nI.a r12 = r36.a()
            U0.f r13 = r14.m()
            if (r13 != 0) goto L_0x025e
            U0.C4883j.c()
        L_0x025e:
            r14.I()
            boolean r13 = r14.i()
            if (r13 == 0) goto L_0x026b
            r14.p(r12)
            goto L_0x026e
        L_0x026b:
            r14.t()
        L_0x026e:
            U0.m r12 = U0.F1.a(r14)
            nI.p r13 = r36.c()
            U0.F1.c(r12, r8, r13)
            nI.p r8 = r36.e()
            U0.F1.c(r12, r10, r8)
            nI.p r8 = r36.b()
            boolean r10 = r12.i()
            if (r10 != 0) goto L_0x0298
            java.lang.Object r10 = r12.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r13)
            if (r10 != 0) goto L_0x02a6
        L_0x0298:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r12.u(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r12.w(r9, r8)
        L_0x02a6:
            nI.p r8 = r36.d()
            U0.F1.c(r12, r11, r8)
            s0.N r8 = s0.C5843N.f28726a
            r13 = 2
            r16 = 0
            r11 = 1053609165(0x3ecccccd, float:0.4)
            r12 = 0
            r9 = r8
            r10 = r15
            r43 = r14
            r14 = r16
            androidx.compose.ui.d r9 = s0.C5842M.e(r9, r10, r11, r12, r13, r14)
            r10 = 128(0x80, float:1.794E-43)
            float r10 = (float) r10
            float r11 = c2.h.B(r10)
            float r10 = c2.h.B(r10)
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.a(r9, r11, r10)
            p1.v0$a r9 = p1.C5747v0.f27350b
            long r17 = r9.j()
            r20 = 2
            r21 = 0
            r19 = 0
            androidx.compose.ui.d r10 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            k6.h$a r9 = new k6.h$a
            r9.<init>(r4)
            android.net.Uri r4 = r41.c()
            k6.h$a r4 = r9.e(r4)
            r14 = 1
            k6.h$a r4 = k6.C8442i.a(r4, r14)
            k6.h r4 = r4.c()
            E1.k$a r9 = E1.C4478k.f5915a
            E1.k r16 = r9.d()
            r21 = 0
            r22 = 1976(0x7b8, float:2.769E-42)
            java.lang.String r9 = "Product image"
            r11 = 0
            r12 = 0
            r13 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r24 = 1572912(0x180030, float:2.204119E-39)
            r45 = r8
            r8 = r4
            r4 = r14
            r14 = r16
            r4 = r15
            r15 = r17
            r16 = r18
            r17 = r19
            r18 = r20
            r19 = r43
            r20 = r24
            U5.s.a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r8 = 8
            float r15 = (float) r8
            float r8 = c2.h.B(r15)
            r14 = 0
            r9 = 0
            r13 = 2
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.D.k(r4, r8, r14, r13, r9)
            r12 = r43
            r9 = 6
            s0.C5844O.a(r8, r12, r9)
            r8 = 2
            r16 = 0
            r11 = 1058642330(0x3f19999a, float:0.6)
            r17 = 0
            r9 = r45
            r10 = r4
            r18 = r15
            r15 = r12
            r12 = r17
            r13 = r8
            r8 = r14
            r14 = r16
            androidx.compose.ui.d r9 = s0.C5842M.e(r9, r10, r11, r12, r13, r14)
            androidx.compose.foundation.layout.d$m r10 = r34.g()
            i1.c$b r11 = r35.k()
            r12 = 0
            E1.I r10 = androidx.compose.foundation.layout.C5080k.a(r10, r11, r15, r12)
            int r11 = U0.C4883j.a(r15, r12)
            U0.y r12 = r15.s()
            androidx.compose.ui.d r9 = androidx.compose.ui.c.e(r15, r9)
            nI.a r13 = r36.a()
            U0.f r14 = r15.m()
            if (r14 != 0) goto L_0x0377
            U0.C4883j.c()
        L_0x0377:
            r15.I()
            boolean r14 = r15.i()
            if (r14 == 0) goto L_0x0384
            r15.p(r13)
            goto L_0x0387
        L_0x0384:
            r15.t()
        L_0x0387:
            U0.m r13 = U0.F1.a(r15)
            nI.p r14 = r36.c()
            U0.F1.c(r13, r10, r14)
            nI.p r10 = r36.e()
            U0.F1.c(r13, r12, r10)
            nI.p r10 = r36.b()
            boolean r12 = r13.i()
            if (r12 != 0) goto L_0x03b1
            java.lang.Object r12 = r13.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r11)
            boolean r12 = kotlin.jvm.internal.C17542s.e(r12, r14)
            if (r12 != 0) goto L_0x03bf
        L_0x03b1:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r13.u(r12)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r13.w(r11, r10)
        L_0x03bf:
            nI.p r10 = r36.d()
            U0.F1.c(r13, r9, r10)
            java.lang.String r9 = r41.e()
            r10 = -1188816286(0xffffffffb9241a62, float:-1.5650087E-4)
            r15.W(r10)
            if (r9 != 0) goto L_0x03d7
            r43 = r15
            r38 = r18
            goto L_0x0429
        L_0x03d7:
            tK.v r10 = tK.C18030v.f147664a
            int r11 = tK.C18030v.f147665b
            tK.w r12 = r10.b(r15, r11)
            tK.r r12 = r12.c()
            N1.Y r28 = r12.c()
            java.util.Locale r12 = java.util.Locale.ROOT
            java.lang.String r9 = r9.toUpperCase(r12)
            r14 = r8
            r8 = r9
            java.lang.String r12 = "toUpperCase(...)"
            kotlin.jvm.internal.C17542s.i(r9, r12)
            tK.h r9 = r10.a(r15, r11)
            long r10 = r9.G0()
            r31 = 0
            r32 = 65530(0xfffa, float:9.1827E-41)
            r9 = 0
            r12 = 0
            r16 = 0
            r14 = r16
            r43 = r15
            r38 = r18
            r15 = r16
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r30 = 0
            r29 = r43
            I0.b1.b(r8, r9, r10, r12, r14, r15, r16, r17, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            XH.N r8 = XH.C16807N.f139792a
        L_0x0429:
            r43.P()
            java.lang.String r8 = r41.b()
            r9 = -1188806333(0xffffffffb9244143, float:-1.566457E-4)
            r15 = r43
            r15.W(r9)
            if (r8 != 0) goto L_0x043d
            r43 = r15
            goto L_0x0483
        L_0x043d:
            tK.v r9 = tK.C18030v.f147664a
            int r10 = tK.C18030v.f147665b
            tK.w r8 = r9.b(r15, r10)
            tK.c r8 = r8.a()
            N1.Y r28 = r8.a()
            java.lang.String r8 = r41.b()
            tK.h r9 = r9.a(r15, r10)
            long r10 = r9.G0()
            r31 = 24576(0x6000, float:3.4438E-41)
            r32 = 49146(0xbffa, float:6.8868E-41)
            r9 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            r43 = r15
            r15 = r16
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 3
            r27 = 0
            r30 = 0
            r29 = r43
            I0.b1.b(r8, r9, r10, r12, r14, r15, r16, r17, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            XH.N r8 = XH.C16807N.f139792a
        L_0x0483:
            r43.P()
            r43.x()
            r43.x()
            float r8 = c2.h.B(r38)
            r9 = 1
            r10 = 0
            r13 = 0
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.D.k(r4, r13, r8, r9, r10)
            r15 = r43
            r11 = 6
            s0.C5844O.a(r8, r15, r11)
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.h(r4, r13, r9, r10)
            androidx.compose.foundation.layout.d$e r9 = r34.c()
            i1.c$c r10 = r35.l()
            E1.I r9 = androidx.compose.foundation.layout.G.b(r9, r10, r15, r11)
            r10 = 0
            int r10 = U0.C4883j.a(r15, r10)
            U0.y r11 = r15.s()
            androidx.compose.ui.d r8 = androidx.compose.ui.c.e(r15, r8)
            nI.a r12 = r36.a()
            U0.f r14 = r15.m()
            if (r14 != 0) goto L_0x04c7
            U0.C4883j.c()
        L_0x04c7:
            r15.I()
            boolean r14 = r15.i()
            if (r14 == 0) goto L_0x04d4
            r15.p(r12)
            goto L_0x04d7
        L_0x04d4:
            r15.t()
        L_0x04d7:
            U0.m r12 = U0.F1.a(r15)
            nI.p r14 = r36.c()
            U0.F1.c(r12, r9, r14)
            nI.p r9 = r36.e()
            U0.F1.c(r12, r11, r9)
            nI.p r9 = r36.b()
            boolean r11 = r12.i()
            if (r11 != 0) goto L_0x0501
            java.lang.Object r11 = r12.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r14)
            if (r11 != 0) goto L_0x050f
        L_0x0501:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r12.u(r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r12.w(r10, r9)
        L_0x050f:
            nI.p r9 = r36.d()
            U0.F1.c(r12, r8, r9)
            lF.a r12 = r41.f()
            r8 = 1091262118(0x410b56a6, float:8.708654)
            r15.W(r8)
            if (r12 != 0) goto L_0x0528
            r27 = r1
            r1 = r13
            r43 = r15
            goto L_0x056d
        L_0x0528:
            i1.c$c r8 = r35.i()
            r9 = r45
            androidx.compose.ui.d r17 = r9.c(r4, r8)
            java.lang.String r8 = r12.e()
            java.lang.String r9 = r12.d()
            java.lang.String r10 = r12.a()
            wK.t2 r11 = r12.c()
            wK.r2 r14 = r12.b()
            wK.h7 r12 = wK.C18349h7.Medium
            wK.i7 r16 = wK.C18361i7.SingleSize
            r43 = r15
            r15 = r16
            r25 = 0
            r26 = 32032(0x7d20, float:4.4886E-41)
            r16 = 0
            r27 = r1
            r1 = r13
            r13 = r16
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 12607488(0xc06000, float:1.7666854E-38)
            r23 = r43
            wK.C18540x6.f(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            XH.N r8 = XH.C16807N.f139792a
        L_0x056d:
            r43.P()
            r8 = 12
            float r9 = (float) r8
            float r9 = c2.h.B(r9)
            r10 = 2
            r11 = 0
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.k(r4, r9, r1, r10, r11)
            r4 = r43
            r9 = 6
            s0.C5844O.a(r1, r4, r9)
            r1 = 1091285130(0x410bb08a, float:8.7306)
            r4.W(r1)
            if (r3 != 0) goto L_0x058c
            goto L_0x05dd
        L_0x058c:
            uK.c r1 = uK.C18148c.ShoppingBagAdd
            int r1 = r1.m()
            wK.m3$a r12 = wK.C18405m3.a.f151235b
            wK.k3 r13 = wK.C18381k3.Medium
            boolean r15 = e(r7)
            r9 = -1188751010(0xffffffffb925195e, float:-1.5745076E-4)
            r4.W(r9)
            boolean r9 = r4.F(r0)
            boolean r10 = r4.F(r3)
            r9 = r9 | r10
            boolean r10 = r4.F(r2)
            r9 = r9 | r10
            java.lang.Object r10 = r4.D()
            if (r9 != 0) goto L_0x05ba
            java.lang.Object r9 = r33.a()
            if (r10 != r9) goto L_0x05c2
        L_0x05ba:
            kF.F r10 = new kF.F
            r10.<init>(r0, r7, r3, r2)
            r4.u(r10)
        L_0x05c2:
            r16 = r10
            nI.a r16 = (nI.C17631a) r16
            r4.P()
            int r0 = wK.C18405m3.a.f151236c
            int r0 = r0 << r8
            r18 = r0 | r37
            r19 = 68
            java.lang.String r9 = "Add to bag"
            r10 = 0
            r11 = 1
            r14 = 0
            r8 = r1
            r17 = r4
            wK.C18357i3.c(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            XH.N r0 = XH.C16807N.f139792a
        L_0x05dd:
            r4.P()
            r4.x()
            r4.x()
            XH.N r0 = XH.C16807N.f139792a
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x05f1
            U0.C4895p.R()
        L_0x05f1:
            r1 = r27
        L_0x05f3:
            U0.Y0 r8 = r4.n()
            if (r8 == 0) goto L_0x060c
            kF.G r9 = new kF.G
            r0 = r9
            r2 = r41
            r4 = r39
            r5 = r44
            r6 = r46
            r7 = r47
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x060c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kF.C14687H.d(androidx.compose.ui.d, kF.D, nI.p, nI.l, boolean, U0.m, int, int):void");
    }

    private static final boolean e(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N f(Q q10, C4899r0 r0Var, p pVar, C14683D d10) {
        h(r0Var, true);
        F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new b(pVar, d10, r0Var, (C17164e<? super b>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(Q q10, C17642l lVar, C14683D d10, boolean z10) {
        F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new a(lVar, d10, z10, (C17164e<? super a>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void h(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N i(d dVar, C14683D d10, p pVar, C17642l lVar, boolean z10, int i10, int i11, C4889m mVar, int i12) {
        d(dVar, d10, pVar, lVar, z10, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
