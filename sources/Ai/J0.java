package Ai;

import Ei.C10691l;
import HJ.C15854t;
import J1.j;
import KJ.C15987c;
import N1.P;
import Op.Z0;
import QJ.Q;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import TC.C13679b;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import XH.t;
import XH.y;
import Y1.k;
import androidx.compose.foundation.layout.D;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
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
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import t0.C5938c;
import t0.x;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001ai\u0010\u0012\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00102\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016²\u0006\f\u0010\u0015\u001a\u00020\u00148\nX\u0002"}, d2 = {"LEi/l;", "viewModel", "Lkotlin/Function1;", "", "LXH/N;", "onProductClicked", "Lkotlin/Function0;", "onClose", "e", "(LEi/l;LnI/l;LnI/a;LU0/m;I)V", "LKJ/c;", "LEi/l$a$a;", "productsDetails", "orderNumber", "", "orderNotFound", "Lkotlin/Function2;", "onAddToCartClicked", "i", "(LKJ/c;Ljava/lang/String;ZLnI/l;LnI/p;LnI/a;LU0/m;I)V", "LEi/l$a;", "uiState", "purchasehistory-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class J0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.ProductsListScreenKt$ProductsListScreenImpl$1$1", f = "ProductsListScreen.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f78496c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f78497d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f78498e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(boolean z10, C17631a<C16807N> aVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f78497d = z10;
            this.f78498e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f78497d, this.f78498e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f78496c == 0) {
                y.b(obj);
                if (this.f78497d) {
                    this.f78498e.invoke();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f78499a;

        b(String str) {
            this.f78499a = str;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            int i11 = i10;
            C17542s.j(cVar, "$this$item");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1606146998, i11, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.ProductsListScreenImpl.<anonymous>.<anonymous>.<anonymous> (ProductsListScreen.kt:84)");
                }
                C13607l.j(j.c(Oo.b.f84759q5, new Object[]{this.f78499a}, mVar, 0), C13679b.a.C2856b.f116680a, D.k(TC.e.i(androidx.compose.ui.d.f18749a), 0.0f, c2.h.B((float) 8), 1, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262136);
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
    static final class c implements C17642l<Z0, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5938c f78500a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p<String, String, C16807N> f78501b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C10691l.a.C1528a f78502c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f78503d;

        c(C5938c cVar, p<? super String, ? super String, C16807N> pVar, C10691l.a.C1528a aVar, C17642l<? super String, C16807N> lVar) {
            this.f78500a = cVar;
            this.f78501b = pVar;
            this.f78502c = aVar;
            this.f78503d = lVar;
        }

        public final void a(Z0 z02) {
            C17542s.j(z02, "event");
            if ((z02 instanceof Z0.g) || (z02 instanceof Z0.f) || (z02 instanceof Z0.e) || (z02 instanceof Z0.a) || (z02 instanceof Z0.b)) {
                C5938c cVar = this.f78500a;
                IllegalStateException illegalStateException = new IllegalStateException("Not supported event: " + z02);
                qv.e eVar = qv.e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a((String) null, illegalStateException);
                        if (a10 != null) {
                            str = C11820c.a(a10);
                        } else {
                            return;
                        }
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = cVar.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, false, illegalStateException, str3);
                    str = str3;
                    str2 = str4;
                }
            } else if (z02 instanceof Z0.c) {
                this.f78501b.invoke(this.f78502c.g(), this.f78502c.h().o().e().k());
            } else if (z02 instanceof Z0.d) {
                this.f78503d.invoke(this.f78502c.g());
            } else {
                throw new t();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Z0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class d implements C17642l {

        /* renamed from: a  reason: collision with root package name */
        public static final d f78504a = new d();

        /* renamed from: a */
        public final Void invoke(C10691l.a.C1528a aVar) {
            C17542s.j(aVar, "it");
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class e implements C17642l<C10691l.a.C1528a, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f78505a;

        public e(String str) {
            this.f78505a = str;
        }

        /* renamed from: a */
        public final Object invoke(C10691l.a.C1528a aVar) {
            C17542s.j(aVar, "item");
            String str = this.f78505a;
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
        final /* synthetic */ C17642l f78506c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f78507d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17642l lVar, List list) {
            super(1);
            this.f78506c = lVar;
            this.f78507d = list;
        }

        public final Object a(int i10) {
            return this.f78506c.invoke(this.f78507d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;", "ul/b"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f78508c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f78509d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C17642l lVar, List list) {
            super(1);
            this.f78508c = lVar;
            this.f78509d = list;
        }

        public final Object a(int i10) {
            return this.f78508c.invoke(this.f78509d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    public static final class h extends C17544u implements r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f78510c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f78511d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l f78512e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(List list, p pVar, C17642l lVar) {
            super(4);
            this.f78510c = list;
            this.f78511d = pVar;
            this.f78512e = lVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(t0.C5938c r13, int r14, U0.C4889m r15, int r16) {
            /*
                r12 = this;
                r0 = r12
                r1 = r13
                r2 = r14
                r11 = r15
                r3 = r16 & 6
                r4 = 4
                if (r3 != 0) goto L_0x0015
                boolean r3 = r15.V(r13)
                if (r3 == 0) goto L_0x0011
                r3 = r4
                goto L_0x0012
            L_0x0011:
                r3 = 2
            L_0x0012:
                r3 = r16 | r3
                goto L_0x0017
            L_0x0015:
                r3 = r16
            L_0x0017:
                r5 = r16 & 48
                if (r5 != 0) goto L_0x0027
                boolean r5 = r15.d(r14)
                if (r5 == 0) goto L_0x0024
                r5 = 32
                goto L_0x0026
            L_0x0024:
                r5 = 16
            L_0x0026:
                r3 = r3 | r5
            L_0x0027:
                r5 = r3 & 147(0x93, float:2.06E-43)
                r6 = 146(0x92, float:2.05E-43)
                if (r5 != r6) goto L_0x0039
                boolean r5 = r15.l()
                if (r5 != 0) goto L_0x0034
                goto L_0x0039
            L_0x0034:
                r15.L()
                goto L_0x00c8
            L_0x0039:
                boolean r5 = U0.C4895p.J()
                if (r5 == 0) goto L_0x0048
                r5 = -1
                java.lang.String r6 = "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)"
                r7 = -632812321(0xffffffffda480cdf, float:-1.40772868E16)
                U0.C4895p.S(r7, r3, r5, r6)
            L_0x0048:
                java.util.List r5 = r0.f78510c
                java.lang.Object r2 = r5.get(r14)
                Ei.l$a$a r2 = (Ei.C10691l.a.C1528a) r2
                r5 = 2098634629(0x7d169f85, float:1.251328E37)
                r15.W(r5)
                Op.a1 r5 = r2.h()
                r6 = 24
                float r6 = (float) r6
                float r6 = c2.h.B(r6)
                r7 = -1179224254(0xffffffffb9b67742, float:-3.48026E-4)
                r15.W(r7)
                r7 = r3 & 14
                r7 = r7 ^ 6
                if (r7 <= r4) goto L_0x0073
                boolean r7 = r15.V(r13)
                if (r7 != 0) goto L_0x0077
            L_0x0073:
                r3 = r3 & 6
                if (r3 != r4) goto L_0x0079
            L_0x0077:
                r3 = 1
                goto L_0x007a
            L_0x0079:
                r3 = 0
            L_0x007a:
                nI.p r4 = r0.f78511d
                boolean r4 = r15.V(r4)
                r3 = r3 | r4
                boolean r4 = r15.V(r2)
                r3 = r3 | r4
                nI.l r4 = r0.f78512e
                boolean r4 = r15.V(r4)
                r3 = r3 | r4
                java.lang.Object r4 = r15.D()
                if (r3 != 0) goto L_0x009b
                U0.m$a r3 = U0.C4889m.f14007a
                java.lang.Object r3 = r3.a()
                if (r4 != r3) goto L_0x00a7
            L_0x009b:
                Ai.J0$c r4 = new Ai.J0$c
                nI.p r3 = r0.f78511d
                nI.l r7 = r0.f78512e
                r4.<init>(r13, r3, r2, r7)
                r15.u(r4)
            L_0x00a7:
                r7 = r4
                nI.l r7 = (nI.C17642l) r7
                r15.P()
                r9 = 24576(0x6000, float:3.4438E-41)
                r10 = 46
                r2 = 0
                r3 = 0
                r4 = 0
                r8 = 0
                r1 = r5
                r5 = r6
                r6 = r8
                r8 = r15
                Op.Y0.O(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r15.P()
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x00c8
                U0.C4895p.R()
            L_0x00c8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Ai.J0.h.a(t0.c, int, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C5938c) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: nI.p} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(Ei.C10691l r9, nI.C17642l<? super java.lang.String, XH.C16807N> r10, nI.C17631a<XH.C16807N> r11, U0.C4889m r12, int r13) {
        /*
            java.lang.String r0 = "viewModel"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            java.lang.String r0 = "onProductClicked"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "onClose"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            r0 = 434348099(0x19e3a043, float:2.3535979E-23)
            U0.m r12 = r12.k(r0)
            r1 = r13 & 6
            if (r1 != 0) goto L_0x0025
            boolean r1 = r12.F(r9)
            if (r1 == 0) goto L_0x0022
            r1 = 4
            goto L_0x0023
        L_0x0022:
            r1 = 2
        L_0x0023:
            r1 = r1 | r13
            goto L_0x0026
        L_0x0025:
            r1 = r13
        L_0x0026:
            r2 = r13 & 48
            if (r2 != 0) goto L_0x0036
            boolean r2 = r12.F(r10)
            if (r2 == 0) goto L_0x0033
            r2 = 32
            goto L_0x0035
        L_0x0033:
            r2 = 16
        L_0x0035:
            r1 = r1 | r2
        L_0x0036:
            r2 = r13 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0046
            boolean r2 = r12.F(r11)
            if (r2 == 0) goto L_0x0043
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0045
        L_0x0043:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0045:
            r1 = r1 | r2
        L_0x0046:
            r8 = r1
            r1 = r8 & 147(0x93, float:2.06E-43)
            r2 = 146(0x92, float:2.05E-43)
            if (r1 != r2) goto L_0x0059
            boolean r1 = r12.l()
            if (r1 != 0) goto L_0x0054
            goto L_0x0059
        L_0x0054:
            r12.L()
            goto L_0x00d1
        L_0x0059:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0065
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.ProductsListScreen (ProductsListScreen.kt:39)"
            U0.C4895p.S(r0, r8, r1, r2)
        L_0x0065:
            TJ.P r1 = r9.m()
            r6 = 0
            r7 = 7
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = r12
            U0.A1 r0 = j3.a.c(r1, r2, r3, r4, r5, r6, r7)
            Ei.l$a r1 = f(r0)
            java.util.List r1 = r1.c()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            KJ.c r1 = KJ.C15985a.h(r1)
            Ei.l$a r2 = f(r0)
            java.lang.String r2 = r2.b()
            Ei.l$a r0 = f(r0)
            boolean r3 = r0.a()
            r0 = -108725417(0xfffffffff984fb57, float:-8.631012E34)
            r12.W(r0)
            boolean r0 = r12.F(r9)
            java.lang.Object r4 = r12.D()
            if (r0 != 0) goto L_0x00a9
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r4 != r0) goto L_0x00b1
        L_0x00a9:
            Ai.F0 r4 = new Ai.F0
            r4.<init>(r9)
            r12.u(r4)
        L_0x00b1:
            r5 = r4
            nI.p r5 = (nI.p) r5
            r12.P()
            int r0 = r8 << 6
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            int r4 = r8 << 9
            r6 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r6
            r8 = r0 | r4
            r4 = r10
            r6 = r11
            r7 = r12
            i(r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00d1
            U0.C4895p.R()
        L_0x00d1:
            U0.Y0 r12 = r12.n()
            if (r12 == 0) goto L_0x00df
            Ai.G0 r0 = new Ai.G0
            r0.<init>(r9, r10, r11, r13)
            r12.a(r0)
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ai.J0.e(Ei.l, nI.l, nI.a, U0.m, int):void");
    }

    private static final C10691l.a f(A1<C10691l.a> a12) {
        return a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N g(C10691l lVar, String str, String str2) {
        C17542s.j(str, "productNumber");
        C17542s.j(str2, "productName");
        lVar.I(str, str2);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C10691l lVar, C17642l lVar2, C17631a aVar, int i10, C4889m mVar, int i11) {
        e(lVar, lVar2, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(KJ.C15987c<Ei.C10691l.a.C1528a> r20, java.lang.String r21, boolean r22, nI.C17642l<? super java.lang.String, XH.C16807N> r23, nI.p<? super java.lang.String, ? super java.lang.String, XH.C16807N> r24, nI.C17631a<XH.C16807N> r25, U0.C4889m r26, int r27) {
        /*
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r27
            java.lang.String r0 = "productsDetails"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "orderNumber"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "onProductClicked"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            java.lang.String r0 = "onAddToCartClicked"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            java.lang.String r0 = "onClose"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            r0 = -695177695(0xffffffffd6906e21, float:-7.9401337E13)
            r8 = r26
            U0.m r15 = r8.k(r0)
            r8 = r7 & 6
            r9 = 4
            if (r8 != 0) goto L_0x0040
            boolean r8 = r15.V(r1)
            if (r8 == 0) goto L_0x003d
            r8 = r9
            goto L_0x003e
        L_0x003d:
            r8 = 2
        L_0x003e:
            r8 = r8 | r7
            goto L_0x0041
        L_0x0040:
            r8 = r7
        L_0x0041:
            r10 = r7 & 48
            r11 = 32
            if (r10 != 0) goto L_0x0052
            boolean r10 = r15.V(r2)
            if (r10 == 0) goto L_0x004f
            r10 = r11
            goto L_0x0051
        L_0x004f:
            r10 = 16
        L_0x0051:
            r8 = r8 | r10
        L_0x0052:
            r10 = r7 & 384(0x180, float:5.38E-43)
            r12 = 256(0x100, float:3.59E-43)
            if (r10 != 0) goto L_0x0063
            boolean r10 = r15.b(r3)
            if (r10 == 0) goto L_0x0060
            r10 = r12
            goto L_0x0062
        L_0x0060:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r8 = r8 | r10
        L_0x0063:
            r10 = r7 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0073
            boolean r10 = r15.F(r4)
            if (r10 == 0) goto L_0x0070
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0072
        L_0x0070:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0072:
            r8 = r8 | r10
        L_0x0073:
            r10 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0083
            boolean r10 = r15.F(r5)
            if (r10 == 0) goto L_0x0080
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0082
        L_0x0080:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x0082:
            r8 = r8 | r10
        L_0x0083:
            r10 = 196608(0x30000, float:2.75506E-40)
            r10 = r10 & r7
            r13 = 131072(0x20000, float:1.83671E-40)
            if (r10 != 0) goto L_0x0095
            boolean r10 = r15.F(r6)
            if (r10 == 0) goto L_0x0092
            r10 = r13
            goto L_0x0094
        L_0x0092:
            r10 = 65536(0x10000, float:9.18355E-41)
        L_0x0094:
            r8 = r8 | r10
        L_0x0095:
            r10 = 74899(0x12493, float:1.04956E-40)
            r10 = r10 & r8
            r14 = 74898(0x12492, float:1.04954E-40)
            if (r10 != r14) goto L_0x00ab
            boolean r10 = r15.l()
            if (r10 != 0) goto L_0x00a5
            goto L_0x00ab
        L_0x00a5:
            r15.L()
            r0 = r15
            goto L_0x0169
        L_0x00ab:
            boolean r10 = U0.C4895p.J()
            if (r10 == 0) goto L_0x00b7
            r10 = -1
            java.lang.String r14 = "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.ProductsListScreenImpl (ProductsListScreen.kt:66)"
            U0.C4895p.S(r0, r8, r10, r14)
        L_0x00b7:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r22)
            r10 = 1135320272(0x43ab9cd0, float:343.2251)
            r15.W(r10)
            r10 = r8 & 896(0x380, float:1.256E-42)
            r14 = 1
            if (r10 != r12) goto L_0x00c8
            r10 = r14
            goto L_0x00c9
        L_0x00c8:
            r10 = 0
        L_0x00c9:
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r8
            if (r12 != r13) goto L_0x00d0
            r12 = r14
            goto L_0x00d1
        L_0x00d0:
            r12 = 0
        L_0x00d1:
            r10 = r10 | r12
            java.lang.Object r12 = r15.D()
            r13 = 0
            if (r10 != 0) goto L_0x00e1
            U0.m$a r10 = U0.C4889m.f14007a
            java.lang.Object r10 = r10.a()
            if (r12 != r10) goto L_0x00e9
        L_0x00e1:
            Ai.J0$a r12 = new Ai.J0$a
            r12.<init>(r3, r6, r13)
            r15.u(r12)
        L_0x00e9:
            nI.p r12 = (nI.p) r12
            r15.P()
            int r10 = r8 >> 6
            r10 = r10 & 14
            U0.P.g(r0, r12, r15, r10)
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r10 = 24
            float r10 = (float) r10
            float r10 = c2.h.B(r10)
            r12 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.k(r0, r12, r10, r14, r13)
            r10 = 1135326964(0x43abb6f4, float:343.42932)
            r15.W(r10)
            r10 = r8 & 112(0x70, float:1.57E-43)
            if (r10 != r11) goto L_0x010f
            r10 = r14
            goto L_0x0110
        L_0x010f:
            r10 = 0
        L_0x0110:
            r11 = r8 & 14
            if (r11 != r9) goto L_0x0116
            r9 = r14
            goto L_0x0117
        L_0x0116:
            r9 = 0
        L_0x0117:
            r9 = r9 | r10
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r8
            r11 = 16384(0x4000, float:2.2959E-41)
            if (r10 != r11) goto L_0x0122
            r10 = r14
            goto L_0x0123
        L_0x0122:
            r10 = 0
        L_0x0123:
            r9 = r9 | r10
            r8 = r8 & 7168(0x1c00, float:1.0045E-41)
            r10 = 2048(0x800, float:2.87E-42)
            if (r8 != r10) goto L_0x012b
            goto L_0x012c
        L_0x012b:
            r14 = 0
        L_0x012c:
            r8 = r9 | r14
            java.lang.Object r9 = r15.D()
            if (r8 != 0) goto L_0x013c
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r9 != r8) goto L_0x0144
        L_0x013c:
            Ai.H0 r9 = new Ai.H0
            r9.<init>(r1, r2, r5, r4)
            r15.u(r9)
        L_0x0144:
            r16 = r9
            nI.l r16 = (nI.C17642l) r16
            r15.P()
            r18 = 6
            r19 = 254(0xfe, float:3.56E-43)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r17 = 0
            r8 = r0
            r0 = r15
            r15 = r17
            r17 = r0
            t0.C5937b.a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x0169
            U0.C4895p.R()
        L_0x0169:
            U0.Y0 r8 = r0.n()
            if (r8 == 0) goto L_0x0186
            Ai.I0 r9 = new Ai.I0
            r0 = r9
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0186:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ai.J0.i(KJ.c, java.lang.String, boolean, nI.l, nI.p, nI.a, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N j(C15987c cVar, String str, p pVar, C17642l lVar, x xVar) {
        C17542s.j(xVar, "$this$LazyColumn");
        x.i(xVar, (Object) null, (Object) null, C10603s.f78792a.a(), 3, (Object) null);
        x.i(xVar, (Object) null, (Object) null, c1.c.c(1606146998, true, new b(str)), 3, (Object) null);
        d dVar = d.f78504a;
        xVar.e(cVar.size(), new f(new e("ProductsList"), cVar), new g(dVar, cVar), c1.c.c(-632812321, true, new h(cVar, pVar, lVar)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C15987c cVar, String str, boolean z10, C17642l lVar, p pVar, C17631a aVar, int i10, C4889m mVar, int i11) {
        i(cVar, str, z10, lVar, pVar, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
