package zk;

import QA.C13349a;
import QJ.Q;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import YH.X;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.animation.i;
import androidx.compose.animation.k;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.C5187o;
import androidx.recyclerview.widget.RecyclerView;
import c1.C5264a;
import com.google.ar.core.ImageMetadata;
import com.ingka.ikea.app.shoppinglist.navigation.ShoppingListsRoutes$AllLists;
import com.ingka.ikea.app.shoppinglist.navigation.ShoppingListsRoutes$ListDetails;
import dI.C17164e;
import eI.C17187b;
import i1.C5437c;
import java.util.List;
import java.util.Map;
import kk.C11508a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l0.C5507b;
import l0.v;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.r;
import uI.C18055d;
import uI.C18068q;
import x4.C8935A;
import x4.C8948l;
import x4.C8951o;
import x4.F;
import x4.I;
import x4.q;
import x4.s;
import z4.e;
import z4.m;
import z4.n;

@Metadata(d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0015²\u0006\u0012\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\nX\u0002"}, d2 = {"", "listId", "", "selectInStoreMode", "listMode", "Lkotlin/Function0;", "LXH/N;", "onBackClicked", "Lkk/a;", "shoppingListEntryPoint", "shouldScrollToTop", "shouldPopToRoot", "onShouldScrollToTopConsumed", "onShouldPopToRootConsumed", "Lkotlin/Function1;", "onScrollStateChanged", "d", "(Ljava/lang/String;ZLjava/lang/String;LnI/a;Lkk/a;ZZLnI/a;LnI/a;LnI/l;LU0/m;I)V", "", "Lx4/l;", "backStack", "shoppinglist-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements r<C5507b, C8948l, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C8951o f107446a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f107447b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f107448c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f107449d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C12529b f107450e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C8935A f107451f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f107452g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17642l<Boolean, C16807N> f107453h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: zk.l$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C2563a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f107454a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    QA.a[] r0 = QA.C13349a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    QA.a r1 = QA.C13349a.ONLINE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    QA.a r1 = QA.C13349a.STORE     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f107454a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: zk.l.a.C2563a.<clinit>():void");
            }
        }

        a(C8951o oVar, boolean z10, boolean z11, String str, C12529b bVar, C8935A a10, C17631a<C16807N> aVar, C17642l<? super Boolean, C16807N> lVar) {
            this.f107446a = oVar;
            this.f107447b = z10;
            this.f107448c = z11;
            this.f107449d = str;
            this.f107450e = bVar;
            this.f107451f = a10;
            this.f107452g = aVar;
            this.f107453h = lVar;
        }

        private static final List<C8948l> f(A1<? extends List<C8948l>> a12) {
            return (List) a12.getValue();
        }

        /* access modifiers changed from: private */
        public static final C16807N h(C8951o oVar) {
            oVar.i0();
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N i(String str, C12529b bVar, C8935A a10, String str2) {
            C17542s.j(str2, "listId");
            int i10 = C2563a.f107454a[C13349a.Companion.a(str).ordinal()];
            boolean z10 = true;
            if (i10 == 1) {
                z10 = false;
            } else if (i10 != 2) {
                throw new t();
            }
            bVar.j(a10, str2, z10);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N j(C12529b bVar, C8951o oVar) {
            bVar.h(oVar);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void e(l0.C5507b r14, x4.C8948l r15, U0.C4889m r16, int r17) {
            /*
                r13 = this;
                r0 = r13
                r10 = r16
                java.lang.String r1 = "$this$composable"
                r2 = r14
                kotlin.jvm.internal.C17542s.j(r14, r1)
                java.lang.String r1 = "it"
                r2 = r15
                kotlin.jvm.internal.C17542s.j(r15, r1)
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x0020
                r1 = -1
                java.lang.String r2 = "com.ingka.ikea.app.shoppinglist.navigation.ShoppingListsNavGraph.<anonymous>.<anonymous>.<anonymous> (ShoppingListsNavGraph.kt:74)"
                r3 = 1458567220(0x56eff834, float:1.31924652E14)
                r4 = r17
                U0.C4895p.S(r3, r4, r1, r2)
            L_0x0020:
                x4.o r1 = r0.f107446a
                TJ.P r1 = r1.G()
                r2 = 0
                r3 = 0
                r4 = 1
                U0.A1 r1 = U0.p1.b(r1, r2, r10, r3, r4)
                java.util.List r1 = f(r1)
                int r1 = r1.size()
                r2 = 5
                if (r1 > r2) goto L_0x003a
                r2 = r4
                goto L_0x003b
            L_0x003a:
                r2 = r3
            L_0x003b:
                boolean r1 = r0.f107447b
                boolean r3 = r0.f107448c
                r4 = 1396322067(0x533a2f13, float:7.9965369E11)
                r10.W(r4)
                x4.o r4 = r0.f107446a
                boolean r4 = r10.F(r4)
                x4.o r5 = r0.f107446a
                java.lang.Object r6 = r16.D()
                if (r4 != 0) goto L_0x005b
                U0.m$a r4 = U0.C4889m.f14007a
                java.lang.Object r4 = r4.a()
                if (r6 != r4) goto L_0x0063
            L_0x005b:
                zk.i r6 = new zk.i
                r6.<init>(r5)
                r10.u(r6)
            L_0x0063:
                r4 = r6
                nI.a r4 = (nI.C17631a) r4
                r16.P()
                r5 = 1396325934(0x533a3e2e, float:7.9990712E11)
                r10.W(r5)
                java.lang.String r5 = r0.f107449d
                boolean r5 = r10.V(r5)
                zk.b r6 = r0.f107450e
                boolean r6 = r10.F(r6)
                r5 = r5 | r6
                x4.A r6 = r0.f107451f
                boolean r6 = r10.F(r6)
                r5 = r5 | r6
                java.lang.String r6 = r0.f107449d
                zk.b r7 = r0.f107450e
                x4.A r8 = r0.f107451f
                java.lang.Object r9 = r16.D()
                if (r5 != 0) goto L_0x0097
                U0.m$a r5 = U0.C4889m.f14007a
                java.lang.Object r5 = r5.a()
                if (r9 != r5) goto L_0x009f
            L_0x0097:
                zk.j r9 = new zk.j
                r9.<init>(r6, r7, r8)
                r10.u(r9)
            L_0x009f:
                r5 = r9
                nI.l r5 = (nI.C17642l) r5
                r16.P()
                r6 = 1396341395(0x533a7a93, float:8.0092037E11)
                r10.W(r6)
                zk.b r6 = r0.f107450e
                boolean r6 = r10.F(r6)
                x4.o r7 = r0.f107446a
                boolean r7 = r10.F(r7)
                r6 = r6 | r7
                zk.b r7 = r0.f107450e
                x4.o r8 = r0.f107446a
                java.lang.Object r9 = r16.D()
                if (r6 != 0) goto L_0x00ca
                U0.m$a r6 = U0.C4889m.f14007a
                java.lang.Object r6 = r6.a()
                if (r9 != r6) goto L_0x00d2
            L_0x00ca:
                zk.k r9 = new zk.k
                r9.<init>(r7, r8)
                r10.u(r9)
            L_0x00d2:
                r6 = r9
                nI.a r6 = (nI.C17631a) r6
                r16.P()
                nI.a<XH.N> r7 = r0.f107452g
                nI.l<java.lang.Boolean, XH.N> r8 = r0.f107453h
                r11 = 0
                r12 = 256(0x100, float:3.59E-43)
                r9 = 0
                r10 = r16
                yk.t0.I(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x00ee
                U0.C4895p.R()
            L_0x00ee:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zk.l.a.e(l0.b, x4.l, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            e((C5507b) obj, (C8948l) obj2, (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements r<C5507b, C8948l, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f107455a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C8935A f107456b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f107457c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12529b f107458d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f107459e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f107460f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f107461g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17642l<Boolean, C16807N> f107462h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.ingka.ikea.app.shoppinglist.navigation.ShoppingListsNavGraphKt$ShoppingListsNavGraph$1$1$2$1$1", f = "ShoppingListsNavGraph.kt", l = {}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f107463c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ boolean f107464d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C8935A f107465e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f107466f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(boolean z10, C8935A a10, C17631a<C16807N> aVar, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f107464d = z10;
                this.f107465e = a10;
                this.f107466f = aVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f107464d, this.f107465e, this.f107466f, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f107463c == 0) {
                    y.b(obj);
                    if (this.f107464d) {
                        this.f107465e.k0();
                        this.f107466f.invoke();
                    }
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        b(boolean z10, C8935A a10, C17631a<C16807N> aVar, C12529b bVar, boolean z11, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C17642l<? super Boolean, C16807N> lVar) {
            this.f107455a = z10;
            this.f107456b = a10;
            this.f107457c = aVar;
            this.f107458d = bVar;
            this.f107459e = z11;
            this.f107460f = aVar2;
            this.f107461g = aVar3;
            this.f107462h = lVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(C8935A a10, C17631a aVar) {
            if (!a10.i0()) {
                aVar.invoke();
            }
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(C8935A a10, C17631a aVar) {
            if (!a10.i0()) {
                aVar.invoke();
            }
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(l0.C5507b r11, x4.C8948l r12, U0.C4889m r13, int r14) {
            /*
                r10 = this;
                java.lang.String r0 = "$this$composable"
                kotlin.jvm.internal.C17542s.j(r11, r0)
                java.lang.String r0 = "it"
                kotlin.jvm.internal.C17542s.j(r12, r0)
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x0019
                r0 = -1
                java.lang.String r1 = "com.ingka.ikea.app.shoppinglist.navigation.ShoppingListsNavGraph.<anonymous>.<anonymous>.<anonymous> (ShoppingListsNavGraph.kt:113)"
                r2 = -1891634659(0xffffffff8f3ff21d, float:-9.4636564E-30)
                U0.C4895p.S(r2, r14, r0, r1)
            L_0x0019:
                boolean r0 = r10.f107455a
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r1 = 1396362098(0x533acb72, float:8.0227716E11)
                r13.W(r1)
                boolean r1 = r10.f107455a
                boolean r1 = r13.b(r1)
                x4.A r2 = r10.f107456b
                boolean r2 = r13.F(r2)
                r1 = r1 | r2
                nI.a<XH.N> r2 = r10.f107457c
                boolean r2 = r13.V(r2)
                r1 = r1 | r2
                boolean r2 = r10.f107455a
                x4.A r3 = r10.f107456b
                nI.a<XH.N> r4 = r10.f107457c
                java.lang.Object r5 = r13.D()
                if (r1 != 0) goto L_0x004d
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r5 != r1) goto L_0x0056
            L_0x004d:
                zk.l$b$a r5 = new zk.l$b$a
                r1 = 0
                r5.<init>(r2, r3, r4, r1)
                r13.u(r5)
            L_0x0056:
                nI.p r5 = (nI.p) r5
                r13.P()
                r1 = 0
                U0.P.g(r0, r5, r13, r1)
                zk.b r0 = r10.f107458d
                boolean r1 = r10.f107459e
                r2 = 1396369905(0x533ae9f1, float:8.027888E11)
                r13.W(r2)
                x4.A r2 = r10.f107456b
                boolean r2 = r13.F(r2)
                nI.a<XH.N> r3 = r10.f107460f
                boolean r3 = r13.V(r3)
                r2 = r2 | r3
                x4.A r3 = r10.f107456b
                nI.a<XH.N> r4 = r10.f107460f
                java.lang.Object r5 = r13.D()
                if (r2 != 0) goto L_0x0088
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r5 != r2) goto L_0x0090
            L_0x0088:
                zk.m r5 = new zk.m
                r5.<init>(r3, r4)
                r13.u(r5)
            L_0x0090:
                r2 = r5
                nI.a r2 = (nI.C17631a) r2
                r13.P()
                r3 = 1396375345(0x533aff31, float:8.0314532E11)
                r13.W(r3)
                x4.A r3 = r10.f107456b
                boolean r3 = r13.F(r3)
                nI.a<XH.N> r4 = r10.f107460f
                boolean r4 = r13.V(r4)
                r3 = r3 | r4
                x4.A r4 = r10.f107456b
                nI.a<XH.N> r5 = r10.f107460f
                java.lang.Object r6 = r13.D()
                if (r3 != 0) goto L_0x00bb
                U0.m$a r3 = U0.C4889m.f14007a
                java.lang.Object r3 = r3.a()
                if (r6 != r3) goto L_0x00c3
            L_0x00bb:
                zk.n r6 = new zk.n
                r6.<init>(r4, r5)
                r13.u(r6)
            L_0x00c3:
                r3 = r6
                nI.a r3 = (nI.C17631a) r3
                r13.P()
                nI.a<XH.N> r4 = r10.f107461g
                nI.l<java.lang.Boolean, XH.N> r5 = r10.f107462h
                r8 = 0
                r9 = 64
                r6 = 0
                r7 = r13
                uk.C12052u.h(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x00de
                U0.C4895p.R()
            L_0x00de:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zk.l.b.c(l0.b, x4.l, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            c((C5507b) obj, (C8948l) obj2, (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lx4/s;", "LXH/N;", "a", "(Lx4/s;)V"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17642l<s, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f107467c = new c();

        public c() {
            super(1);
        }

        public final void a(s sVar) {
            C17542s.j(sVar, "$this$null");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((s) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lx4/s;", "LXH/N;", "a", "(Lx4/s;)V"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17642l<s, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final d f107468c = new d();

        public d() {
            super(1);
        }

        public final void a(s sVar) {
            C17542s.j(sVar, "$this$null");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((s) obj);
            return C16807N.f139792a;
        }
    }

    @SuppressLint({"RestrictedApi"})
    public static final void d(String str, boolean z10, String str2, C17631a<C16807N> aVar, C11508a aVar2, boolean z11, boolean z12, C17631a<C16807N> aVar3, C17631a<C16807N> aVar4, C17642l<? super Boolean, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C8935A a10;
        String str3 = str;
        boolean z13 = z10;
        String str4 = str2;
        C17631a<C16807N> aVar5 = aVar;
        C11508a aVar6 = aVar2;
        C17631a<C16807N> aVar7 = aVar3;
        C17631a<C16807N> aVar8 = aVar4;
        C17642l<? super Boolean, C16807N> lVar2 = lVar;
        int i12 = i10;
        C17542s.j(str4, "listMode");
        C17542s.j(aVar5, "onBackClicked");
        C17542s.j(aVar6, "shoppingListEntryPoint");
        C17542s.j(aVar7, "onShouldScrollToTopConsumed");
        C17542s.j(aVar8, "onShouldPopToRootConsumed");
        C17542s.j(lVar2, "onScrollStateChanged");
        C4889m k10 = mVar.k(1901479509);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(str3) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.b(z13) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.V(str4) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(aVar5) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= (32768 & i12) == 0 ? k10.V(aVar6) : k10.F(aVar6) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            i11 |= k10.b(z11) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        } else {
            boolean z14 = z11;
        }
        boolean z15 = z12;
        if ((i12 & 1572864) == 0) {
            i11 |= k10.b(z15) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        if ((i12 & 12582912) == 0) {
            i11 |= k10.F(aVar7) ? 8388608 : 4194304;
        }
        if ((i12 & 100663296) == 0) {
            i11 |= k10.F(aVar8) ? 67108864 : 33554432;
        }
        if ((i12 & 805306368) == 0) {
            i11 |= k10.F(lVar2) ? 536870912 : 268435456;
        }
        if ((i11 & 306783379) != 306783378 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1901479509, i11, -1, "com.ingka.ikea.app.shoppinglist.navigation.ShoppingListsNavGraph (ShoppingListsNavGraph.kt:44)");
            }
            Activity a11 = Xo.c.a((Context) k10.Q(AndroidCompositionLocals_androidKt.g()));
            C8951o a12 = androidx.navigation.fragment.a.a((C5187o) k10.Q(Vo.b.c()));
            if (a11 != null) {
                boolean z16 = !T0.d.F(T0.a.a(a11, k10, 0).b(), T0.d.f13504b.d());
                k10.W(611352774);
                Object D10 = k10.D();
                C4889m.a aVar9 = C4889m.f14007a;
                if (D10 == aVar9.a()) {
                    D10 = aVar2.Q0();
                    k10.u(D10);
                }
                Ae.s sVar = (Ae.s) D10;
                k10.P();
                k10.W(611356559);
                C8935A e10 = m.e(new I[0], k10, 0);
                k10.W(1608295768);
                boolean F10 = k10.F(sVar) | k10.F(a11);
                Object D11 = k10.D();
                if (F10 || D11 == aVar9.a()) {
                    D11 = new f(sVar, a11);
                    k10.u(D11);
                }
                k10.P();
                e10.r((C8951o.c) D11);
                k10.P();
                Object shoppingListsRoutes$ListDetails = str3 != null ? new ShoppingListsRoutes$ListDetails(str3, z13) : new ShoppingListsRoutes$AllLists(str4);
                k10.W(611375566);
                Object D12 = k10.D();
                if (D12 == aVar9.a()) {
                    D12 = aVar2.s();
                    k10.u(D12);
                }
                C12529b bVar = (C12529b) D12;
                k10.P();
                k10.W(611383101);
                boolean F11 = k10.F(a12) | k10.b(z16) | ((458752 & i11) == 131072) | ((i11 & 896) == 256) | k10.F(bVar) | k10.F(e10) | ((29360128 & i11) == 8388608) | ((1879048192 & i11) == 536870912) | ((3670016 & i11) == 1048576) | ((234881024 & i11) == 67108864) | ((i11 & 7168) == 2048);
                Object D13 = k10.D();
                if (F11 || D13 == aVar9.a()) {
                    a10 = e10;
                    mVar2 = k10;
                    g gVar = r3;
                    g gVar2 = new g(a12, z16, z11, str2, bVar, a10, aVar3, lVar, z12, aVar4, aVar);
                    mVar2.u(gVar);
                    D13 = gVar;
                } else {
                    a10 = e10;
                    mVar2 = k10;
                }
                mVar2.P();
                n.a(a10, shoppingListsRoutes$ListDetails, (androidx.compose.ui.d) null, (C5437c) null, (C18055d<?>) null, (Map<C18068q, F<?>>) null, (C17642l<androidx.compose.animation.d<C8948l>, i>) null, (C17642l<androidx.compose.animation.d<C8948l>, k>) null, (C17642l<androidx.compose.animation.d<C8948l>, i>) null, (C17642l<androidx.compose.animation.d<C8948l>, k>) null, (C17642l<androidx.compose.animation.d<C8948l>, v>) null, (C17642l) D13, mVar2, 0, 0, 2044);
                if (C4895p.J()) {
                    C4895p.R();
                }
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new h(str, z10, str2, aVar, aVar2, z11, z12, aVar3, aVar4, lVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final void e(Ae.s sVar, Activity activity, C8951o oVar, x4.v vVar, Bundle bundle) {
        androidx.lifecycle.r lifecycle;
        C17542s.j(oVar, "navController");
        C17542s.j(vVar, "destination");
        C8948l H10 = oVar.H();
        if (H10 != null && (lifecycle = H10.getLifecycle()) != null) {
            sVar.a(vVar, activity, lifecycle, Xo.b.a(bundle));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C8951o oVar, boolean z10, boolean z11, String str, C12529b bVar, C8935A a10, C17631a aVar, C17642l lVar, boolean z12, C17631a aVar2, C17631a aVar3, x4.y yVar) {
        x4.y yVar2 = yVar;
        C17542s.j(yVar2, "$this$NavHost");
        Class<ShoppingListsRoutes$AllLists> cls = ShoppingListsRoutes$AllLists.class;
        List<q> e10 = C16877v.e(x4.t.a("ikea://navigation/shoppingLists/myLists", P.b(cls), X.j(), c.f107467c));
        C5264a c10 = c1.c.c(1458567220, true, new a(oVar, z10, z11, str, bVar, a10, aVar, lVar));
        Class cls2 = e.class;
        z4.f fVar = new z4.f((e) yVar.l().d(cls2), P.b(cls), X.j(), c10);
        for (q g10 : e10) {
            fVar.g(g10);
        }
        fVar.l((C17642l<androidx.compose.animation.d<C8948l>, i>) null);
        fVar.m((C17642l<androidx.compose.animation.d<C8948l>, k>) null);
        fVar.n((C17642l<androidx.compose.animation.d<C8948l>, i>) null);
        fVar.o((C17642l<androidx.compose.animation.d<C8948l>, k>) null);
        fVar.p((C17642l<androidx.compose.animation.d<C8948l>, v>) null);
        yVar2.k(fVar);
        Class<ShoppingListsRoutes$ListDetails> cls3 = ShoppingListsRoutes$ListDetails.class;
        List<q> e11 = C16877v.e(x4.t.a("ikea://navigation/shoppingLists/details", P.b(cls3), X.j(), d.f107468c));
        C5264a c11 = c1.c.c(-1891634659, true, new b(z12, a10, aVar2, bVar, z11, aVar3, aVar, lVar));
        z4.f fVar2 = new z4.f((e) yVar.l().d(cls2), P.b(cls3), X.j(), c11);
        for (q g11 : e11) {
            fVar2.g(g11);
        }
        fVar2.l((C17642l<androidx.compose.animation.d<C8948l>, i>) null);
        fVar2.m((C17642l<androidx.compose.animation.d<C8948l>, k>) null);
        fVar2.n((C17642l<androidx.compose.animation.d<C8948l>, i>) null);
        fVar2.o((C17642l<androidx.compose.animation.d<C8948l>, k>) null);
        fVar2.p((C17642l<androidx.compose.animation.d<C8948l>, v>) null);
        yVar2.k(fVar2);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(String str, boolean z10, String str2, C17631a aVar, C11508a aVar2, boolean z11, boolean z12, C17631a aVar3, C17631a aVar4, C17642l lVar, int i10, C4889m mVar, int i11) {
        d(str, z10, str2, aVar, aVar2, z11, z12, aVar3, aVar4, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
