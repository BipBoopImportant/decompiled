package xG;

import N1.E;
import N1.P;
import N1.Y;
import O0.d1;
import QJ.F0;
import QJ.Q;
import QJ.T;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import S1.C4831y;
import U0.A1;
import U0.B;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.M0;
import U0.Y0;
import U0.o1;
import U0.p1;
import U1.e;
import XH.C16807N;
import XH.t;
import XH.y;
import Y1.h;
import Y1.j;
import Y1.k;
import Y1.o;
import Y1.q;
import Y1.s;
import androidx.compose.ui.d;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import dI.C17164e;
import dI.C17168i;
import dI.C17169j;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import p1.g1;
import r1.g;
import tK.C18030v;
import zG.d;

@Metadata(d1 = {"\u00008\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001am\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a9\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016²\u0006\u000e\u0010\u0015\u001a\u00020\u00148\n@\nX\u0002"}, d2 = {"", "searchTerm", "Lkotlin/Function1;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "LXH/N;", "onItemSelected", "onBedDisclaimerClicked", "Lkotlin/Function0;", "onBack", "onClose", "onFavorite", "k", "(Ljava/lang/String;LnI/l;LnI/l;LnI/a;LnI/a;LnI/a;LU0/m;II)V", "LU0/A1;", "LxG/D;", "uiState", "LzG/d;", "onEvent", "n", "(Ljava/lang/String;LU0/A1;LnI/l;LU0/m;I)V", "", "showHeader", "v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: xG.C  reason: case insensitive filesystem */
public final class C18570C {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.search.SearchResultsDrawerKt$SearchResultsDrawer$1$1", f = "SearchResultsDrawer.kt", l = {68}, m = "invokeSuspend")
    /* renamed from: xG.C$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f152036c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C18572a f152037d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f152038e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C18572a aVar, String str, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f152037d = aVar;
            this.f152038e = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f152037d, this.f152038e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f152036c;
            if (i10 == 0) {
                y.b(obj);
                C18572a aVar = this.f152037d;
                String str = this.f152038e;
                this.f152036c = 1;
                if (aVar.j(str, this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.search.SearchResultsDrawerKt$SearchResultsDrawer$2$1$1", f = "SearchResultsDrawer.kt", l = {80}, m = "invokeSuspend")
    /* renamed from: xG.C$b */
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f152039c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C18572a f152040d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f152041e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C18572a aVar, String str, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f152040d = aVar;
            this.f152041e = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f152040d, this.f152041e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f152039c;
            if (i10 == 0) {
                y.b(obj);
                C18572a aVar = this.f152040d;
                String str = this.f152041e;
                this.f152039c = 1;
                if (aVar.G(str, this) == f10) {
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xG.C$c */
    static final class c implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f152042a;

        c(String str) {
            this.f152042a = str;
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(638069851, i11, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.search.SearchResultsDrawerContent.<anonymous>.<anonymous> (SearchResultsDrawer.kt:113)");
                }
                String str = this.f152042a;
                d1.b("\"" + str + "\"", (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, Y.c(C18030v.f147664a.b(mVar, C18030v.f147665b).c().b(), 0, 0, C.f13316b.a(), (C4830x) null, (C4831y) null, (C4820m) null, (String) null, 0, (Y1.a) null, (o) null, (e) null, 0, (k) null, (g1) null, (g) null, 0, 0, 0, (q) null, (E) null, (h) null, 0, 0, (s) null, 16777211, (Object) null), mVar, 0, 0, 65534);
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

    public static final void k(String str, C17642l<? super CachedCatalogItem, C16807N> lVar, C17642l<? super CachedCatalogItem, C16807N> lVar2, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C4889m mVar, int i10, int i11) {
        int i12;
        C4889m mVar2;
        C17631a<C16807N> aVar4;
        A1<C18571D> a12;
        int i13;
        String str2 = str;
        C17642l<? super CachedCatalogItem, C16807N> lVar3 = lVar;
        C17642l<? super CachedCatalogItem, C16807N> lVar4 = lVar2;
        C17631a<C16807N> aVar5 = aVar;
        C17631a<C16807N> aVar6 = aVar2;
        int i14 = i10;
        C17542s.j(str2, "searchTerm");
        C17542s.j(lVar3, "onItemSelected");
        C17542s.j(lVar4, "onBedDisclaimerClicked");
        C17542s.j(aVar5, "onBack");
        C17542s.j(aVar6, "onClose");
        C4889m k10 = mVar.k(-619032183);
        if ((i11 & 1) != 0) {
            i12 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i12 = (k10.V(str2) ? 4 : 2) | i14;
        } else {
            i12 = i14;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i14 & 48) == 0) {
            i12 |= k10.F(lVar3) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i14 & 384) == 0) {
            i12 |= k10.F(lVar4) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i14 & 3072) == 0) {
            i12 |= k10.F(aVar5) ? 2048 : 1024;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i14 & 24576) == 0) {
            i12 |= k10.F(aVar6) ? 16384 : 8192;
        }
        if ((i12 & 9363) != 9362 || !k10.l()) {
            C17631a<C16807N> aVar7 = (i11 & 32) != 0 ? null : aVar3;
            if (C4895p.J()) {
                C4895p.S(-619032183, i12, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.search.SearchResultsDrawer (SearchResultsDrawer.kt:61)");
            }
            k10.C(1890788296);
            k0 a10 = m3.a.f26247a.a(k10, m3.a.f26249c);
            if (a10 != null) {
                i0.c a11 = f3.a.a(a10, k10, 0);
                k10.C(1729797275);
                f0 b10 = m3.c.b(C18572a.class, a10, (String) null, a11, a10 instanceof C5212o ? ((C5212o) a10).getDefaultViewModelCreationExtras() : a.C0407a.f25486b, k10, 36936, 0);
                k10.U();
                k10.U();
                C18572a aVar8 = (C18572a) b10;
                A1<C18571D> b11 = p1.b(aVar8.m(), (C17168i) null, k10, 0, 1);
                Object D10 = k10.D();
                C4889m.a aVar9 = C4889m.f14007a;
                if (D10 == aVar9.a()) {
                    B b12 = new B(U0.P.k(C17169j.f142968a, k10));
                    k10.u(b12);
                    D10 = b12;
                }
                Q a13 = ((B) D10).a();
                k10.W(-1914730138);
                int i15 = i12 & 14;
                boolean F10 = k10.F(aVar8) | (i15 == 4);
                Object D11 = k10.D();
                if (F10 || D11 == aVar9.a()) {
                    D11 = new a(aVar8, str2, (C17164e<? super a>) null);
                    k10.u(D11);
                }
                k10.P();
                U0.P.g(str2, (p) D11, k10, i15);
                k10.W(-1914724036);
                boolean F11 = ((i12 & 7168) == 2048) | ((57344 & i12) == 16384) | ((i12 & 112) == 32) | k10.F(a13) | k10.F(aVar8) | (i15 == 4) | ((i12 & 896) == 256);
                Object D12 = k10.D();
                if (F11 || D12 == aVar9.a()) {
                    i13 = i15;
                    Q q10 = a13;
                    a12 = b11;
                    s sVar = r0;
                    C18572a aVar10 = aVar8;
                    mVar2 = k10;
                    s sVar2 = new s(aVar, aVar2, lVar, q10, lVar2, aVar10, str);
                    mVar2.u(sVar);
                    D12 = sVar;
                } else {
                    a12 = b11;
                    i13 = i15;
                    mVar2 = k10;
                }
                mVar2.P();
                n(str2, a12, (C17642l) D12, mVar2, i13);
                if (C4895p.J()) {
                    C4895p.R();
                }
                aVar4 = aVar7;
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
        } else {
            k10.L();
            aVar4 = aVar3;
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new t(str, lVar, lVar2, aVar, aVar2, aVar4, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N l(C17631a aVar, C17631a aVar2, C17642l lVar, Q q10, C17642l lVar2, C18572a aVar3, String str, zG.d dVar) {
        C17542s.j(dVar, "event");
        if (C17542s.e(dVar, d.a.f152773a)) {
            aVar.invoke();
        } else if (C17542s.e(dVar, d.c.f152775a)) {
            aVar2.invoke();
        } else if (dVar instanceof d.C4331d) {
            lVar.invoke(((d.C4331d) dVar).a());
        } else if (C17542s.e(dVar, d.e.f152777a)) {
            F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new b(aVar3, str, (C17164e<? super b>) null), 3, (Object) null);
        } else if (dVar instanceof d.b) {
            lVar2.invoke(((d.b) dVar).a());
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m(String str, C17642l lVar, C17642l lVar2, C17631a aVar, C17631a aVar2, C17631a aVar3, int i10, int i11, C4889m mVar, int i12) {
        k(str, lVar, lVar2, aVar, aVar2, aVar3, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void n(java.lang.String r24, U0.A1<? extends xG.C18571D> r25, nI.C17642l<? super zG.d, XH.C16807N> r26, U0.C4889m r27, int r28) {
        /*
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r28
            java.lang.String r4 = "searchTerm"
            kotlin.jvm.internal.C17542s.j(r0, r4)
            java.lang.String r4 = "uiState"
            kotlin.jvm.internal.C17542s.j(r1, r4)
            java.lang.String r4 = "onEvent"
            kotlin.jvm.internal.C17542s.j(r2, r4)
            r4 = -1042254836(0xffffffffc1e0740c, float:-28.056664)
            r5 = r27
            U0.m r15 = r5.k(r4)
            r5 = r3 & 6
            r12 = 2
            if (r5 != 0) goto L_0x0030
            boolean r5 = r15.V(r0)
            if (r5 == 0) goto L_0x002d
            r5 = 4
            goto L_0x002e
        L_0x002d:
            r5 = r12
        L_0x002e:
            r5 = r5 | r3
            goto L_0x0031
        L_0x0030:
            r5 = r3
        L_0x0031:
            r6 = r3 & 48
            if (r6 != 0) goto L_0x0041
            boolean r6 = r15.V(r1)
            if (r6 == 0) goto L_0x003e
            r6 = 32
            goto L_0x0040
        L_0x003e:
            r6 = 16
        L_0x0040:
            r5 = r5 | r6
        L_0x0041:
            r6 = r3 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0051
            boolean r6 = r15.F(r2)
            if (r6 == 0) goto L_0x004e
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0050
        L_0x004e:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0050:
            r5 = r5 | r6
        L_0x0051:
            r13 = r5
            r5 = r13 & 147(0x93, float:2.06E-43)
            r6 = 146(0x92, float:2.05E-43)
            if (r5 != r6) goto L_0x0065
            boolean r5 = r15.l()
            if (r5 != 0) goto L_0x005f
            goto L_0x0065
        L_0x005f:
            r15.L()
            r0 = r15
            goto L_0x031f
        L_0x0065:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0071
            r5 = -1
            java.lang.String r6 = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.search.SearchResultsDrawerContent (SearchResultsDrawer.kt:102)"
            U0.C4895p.S(r4, r13, r5, r6)
        L_0x0071:
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 123849128(0x761c9a8, float:1.698638E-34)
            r15.W(r6)
            java.lang.Object r6 = r15.D()
            U0.m$a r16 = U0.C4889m.f14007a
            java.lang.Object r7 = r16.a()
            if (r6 != r7) goto L_0x008e
            xG.u r6 = new xG.u
            r6.<init>()
            r15.u(r6)
        L_0x008e:
            r8 = r6
            nI.a r8 = (nI.C17631a) r8
            r15.P()
            r10 = 3072(0xc00, float:4.305E-42)
            r11 = 6
            r6 = 0
            r7 = 0
            r9 = r15
            java.lang.Object r5 = f1.C5301c.e(r5, r6, r7, r8, r9, r10, r11)
            r11 = r5
            U0.r0 r11 = (U0.C4899r0) r11
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r6 = 0
            r10 = 1
            androidx.compose.ui.d r17 = androidx.compose.foundation.layout.J.f(r5, r6, r10, r7)
            rF.b r8 = rF.C15002a.a(r15, r4)
            long r18 = r8.p()
            r21 = 2
            r22 = 0
            r20 = 0
            androidx.compose.ui.d r8 = androidx.compose.foundation.b.d(r17, r18, r20, r21, r22)
            androidx.compose.foundation.layout.d r9 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r9 = r9.g()
            i1.c$a r17 = i1.C5437c.f24302a
            i1.c$b r14 = r17.k()
            E1.I r9 = androidx.compose.foundation.layout.C5080k.a(r9, r14, r15, r4)
            int r14 = U0.C4883j.a(r15, r4)
            U0.y r4 = r15.s()
            androidx.compose.ui.d r8 = androidx.compose.ui.c.e(r15, r8)
            G1.g$a r19 = G1.C4504g.f6515W
            nI.a r10 = r19.a()
            U0.f r21 = r15.m()
            if (r21 != 0) goto L_0x00e6
            U0.C4883j.c()
        L_0x00e6:
            r15.I()
            boolean r21 = r15.i()
            if (r21 == 0) goto L_0x00f3
            r15.p(r10)
            goto L_0x00f6
        L_0x00f3:
            r15.t()
        L_0x00f6:
            U0.m r10 = U0.F1.a(r15)
            nI.p r6 = r19.c()
            U0.F1.c(r10, r9, r6)
            nI.p r6 = r19.e()
            U0.F1.c(r10, r4, r6)
            nI.p r4 = r19.b()
            boolean r6 = r10.i()
            if (r6 != 0) goto L_0x0120
            java.lang.Object r6 = r10.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r9)
            if (r6 != 0) goto L_0x012e
        L_0x0120:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)
            r10.u(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)
            r10.w(r6, r4)
        L_0x012e:
            nI.p r4 = r19.d()
            U0.F1.c(r10, r8, r4)
            s0.h r4 = s0.C5862h.f28810a
            r4 = 20
            float r4 = (float) r4
            float r4 = c2.h.B(r4)
            r6 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.D.k(r5, r4, r6, r12, r7)
            boolean r9 = w(r11)
            i1.c r7 = r17.e()
            xG.C$c r4 = new xG.C$c
            r4.<init>(r0)
            r6 = 54
            r8 = 638069851(0x26082c5b, float:4.724459E-16)
            r10 = 1
            c1.a r6 = c1.c.e(r8, r10, r4, r15, r6)
            r4 = 504002812(0x1e0a78fc, float:7.330678E-21)
            r15.W(r4)
            r4 = r13 & 896(0x380, float:1.256E-42)
            r8 = 256(0x100, float:3.59E-43)
            if (r4 != r8) goto L_0x0168
            r8 = r10
            goto L_0x0169
        L_0x0168:
            r8 = 0
        L_0x0169:
            java.lang.Object r12 = r15.D()
            if (r8 != 0) goto L_0x0175
            java.lang.Object r8 = r16.a()
            if (r12 != r8) goto L_0x017d
        L_0x0175:
            xG.v r12 = new xG.v
            r12.<init>(r2)
            r15.u(r12)
        L_0x017d:
            r8 = r12
            nI.a r8 = (nI.C17631a) r8
            r15.P()
            r12 = 504004987(0x1e0a817b, float:7.332435E-21)
            r15.W(r12)
            r14 = 256(0x100, float:3.59E-43)
            if (r4 != r14) goto L_0x018f
            r12 = r10
            goto L_0x0190
        L_0x018f:
            r12 = 0
        L_0x0190:
            java.lang.Object r13 = r15.D()
            if (r12 != 0) goto L_0x019c
            java.lang.Object r12 = r16.a()
            if (r13 != r12) goto L_0x01a4
        L_0x019c:
            xG.w r13 = new xG.w
            r13.<init>(r2)
            r15.u(r13)
        L_0x01a4:
            r12 = r13
            nI.a r12 = (nI.C17631a) r12
            r15.P()
            r17 = 438(0x1b6, float:6.14E-43)
            r19 = 96
            r13 = 0
            r20 = 0
            r21 = r10
            r10 = r13
            r13 = r11
            r11 = r20
            r23 = r13
            r13 = r15
            r14 = r17
            r0 = r15
            r15 = r19
            AG.C15408p.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r5 = r25.getValue()
            xG.D r5 = (xG.C18571D) r5
            boolean r6 = r5 instanceof xG.C18571D.b
            if (r6 == 0) goto L_0x01e3
            r4 = -1555583579(0xffffffffa347ada5, float:-1.0824582E-17)
            r0.W(r4)
            r4 = 0
            rF.b r5 = rF.C15002a.a(r0, r4)
            long r5 = r5.p()
            zG.l.b(r5, r0, r4)
            r0.P()
            goto L_0x0313
        L_0x01e3:
            boolean r6 = r5 instanceof xG.C18571D.c
            if (r6 == 0) goto L_0x02e8
            r5 = -1555321474(0xffffffffa34bad7e, float:-1.10413905E-17)
            r0.W(r5)
            java.lang.Object r5 = r25.getValue()
            java.lang.String r6 = "null cannot be cast to non-null type com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.search.SearchUIState.Success"
            kotlin.jvm.internal.C17542s.h(r5, r6)
            xG.D$c r5 = (xG.C18571D.c) r5
            java.util.List r6 = r5.b()
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x021e
            r4 = -1555251507(0xffffffffa34cbecd, float:-1.1099266E-17)
            r0.W(r4)
            int r5 = OE.n.f113193E1
            r4 = 0
            rF.b r4 = rF.C15002a.a(r0, r4)
            long r6 = r4.p()
            r9 = 0
            r10 = 0
            r8 = r0
            zG.h.c(r5, r6, r8, r9, r10)
            r0.P()
            goto L_0x02e4
        L_0x021e:
            r6 = -1554923093(0xffffffffa351c1ab, float:-1.13709235E-17)
            r0.W(r6)
            java.util.List r6 = r5.b()
            boolean r7 = r5.d()
            java.lang.String r8 = r5.a()
            java.lang.String r9 = r5.c()
            r5 = 504049471(0x1e0b2f3f, float:7.368369E-21)
            r0.W(r5)
            r5 = 256(0x100, float:3.59E-43)
            if (r4 != r5) goto L_0x0241
            r10 = r21
            goto L_0x0242
        L_0x0241:
            r10 = 0
        L_0x0242:
            java.lang.Object r11 = r0.D()
            if (r10 != 0) goto L_0x024e
            java.lang.Object r10 = r16.a()
            if (r11 != r10) goto L_0x0256
        L_0x024e:
            xG.x r11 = new xG.x
            r11.<init>(r2)
            r0.u(r11)
        L_0x0256:
            r10 = r11
            nI.a r10 = (nI.C17631a) r10
            r0.P()
            r11 = 504038357(0x1e0b03d5, float:7.359391E-21)
            r0.W(r11)
            if (r4 != r5) goto L_0x0267
            r11 = r21
            goto L_0x0268
        L_0x0267:
            r11 = 0
        L_0x0268:
            java.lang.Object r12 = r0.D()
            if (r11 != 0) goto L_0x0274
            java.lang.Object r11 = r16.a()
            if (r12 != r11) goto L_0x027c
        L_0x0274:
            xG.y r12 = new xG.y
            r12.<init>(r2)
            r0.u(r12)
        L_0x027c:
            r11 = r12
            nI.l r11 = (nI.C17642l) r11
            r0.P()
            r12 = 504044269(0x1e0b1aed, float:7.364167E-21)
            r0.W(r12)
            if (r4 != r5) goto L_0x028d
            r4 = r21
            goto L_0x028e
        L_0x028d:
            r4 = 0
        L_0x028e:
            java.lang.Object r5 = r0.D()
            if (r4 != 0) goto L_0x029a
            java.lang.Object r4 = r16.a()
            if (r5 != r4) goto L_0x02a2
        L_0x029a:
            xG.z r5 = new xG.z
            r5.<init>(r2)
            r0.u(r5)
        L_0x02a2:
            r13 = r5
            nI.l r13 = (nI.C17642l) r13
            r0.P()
            r4 = 504052953(0x1e0b3cd9, float:7.371182E-21)
            r0.W(r4)
            r5 = r23
            boolean r4 = r0.V(r5)
            java.lang.Object r12 = r0.D()
            if (r4 != 0) goto L_0x02c0
            java.lang.Object r4 = r16.a()
            if (r12 != r4) goto L_0x02c8
        L_0x02c0:
            xG.A r12 = new xG.A
            r12.<init>(r5)
            r0.u(r12)
        L_0x02c8:
            r14 = r12
            nI.l r14 = (nI.C17642l) r14
            r0.P()
            r18 = 0
            r19 = 1168(0x490, float:1.637E-42)
            r4 = 0
            r12 = 0
            r15 = 0
            r17 = 0
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r4
            r16 = r0
            AG.C15394b.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0.P()
        L_0x02e4:
            r0.P()
            goto L_0x0313
        L_0x02e8:
            boolean r4 = r5 instanceof xG.C18571D.a
            if (r4 == 0) goto L_0x0330
            r4 = -1553623790(0xffffffffa3659512, float:-1.2445682E-17)
            r0.W(r4)
            java.lang.Object r4 = r25.getValue()
            java.lang.String r5 = "null cannot be cast to non-null type com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.search.SearchUIState.Error"
            kotlin.jvm.internal.C17542s.h(r4, r5)
            xG.D$a r4 = (xG.C18571D.a) r4
            int r5 = r4.a()
            r4 = 0
            rF.b r4 = rF.C15002a.a(r0, r4)
            long r6 = r4.p()
            r9 = 0
            r10 = 0
            r8 = r0
            zG.h.c(r5, r6, r8, r9, r10)
            r0.P()
        L_0x0313:
            r0.x()
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x031f
            U0.C4895p.R()
        L_0x031f:
            U0.Y0 r0 = r0.n()
            if (r0 == 0) goto L_0x032f
            xG.B r4 = new xG.B
            r5 = r24
            r4.<init>(r5, r1, r2, r3)
            r0.a(r4)
        L_0x032f:
            return
        L_0x0330:
            r1 = 504009326(0x1e0a926e, float:7.33594E-21)
            r0.W(r1)
            r0.P()
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xG.C18570C.n(java.lang.String, U0.A1, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N o(C17642l lVar) {
        lVar.invoke(d.a.f152773a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p(C17642l lVar) {
        lVar.invoke(d.e.f152777a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N q(C17642l lVar, CachedCatalogItem cachedCatalogItem) {
        C17542s.j(cachedCatalogItem, "selectedItem");
        lVar.invoke(new d.C4331d(cachedCatalogItem));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N r(C17642l lVar, CachedCatalogItem cachedCatalogItem) {
        C17542s.j(cachedCatalogItem, "item");
        lVar.invoke(new d.b(cachedCatalogItem));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N s(C4899r0 r0Var, int i10) {
        boolean z10 = true;
        if (i10 != -1) {
            z10 = i10 != 1 ? w(r0Var) : false;
        }
        x(r0Var, z10);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N t(C17642l lVar) {
        lVar.invoke(d.c.f152775a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N u(String str, A1 a12, C17642l lVar, int i10, C4889m mVar, int i11) {
        n(str, a12, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C4899r0 v() {
        return u1.e(Boolean.TRUE, (o1) null, 2, (Object) null);
    }

    private static final boolean w(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void x(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }
}
