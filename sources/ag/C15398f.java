package AG;

import E1.I;
import G1.C4504g;
import HG.C15809a;
import O0.H;
import QJ.Q;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4894o0;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import XH.C16807N;
import XH.y;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.layout.x;
import androidx.compose.ui.d;
import c2.h;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import dI.C17164e;
import eI.C17187b;
import i1.C5437c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lF.C14768a;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.r;
import s0.C5842M;
import s0.C5843N;
import s0.C5862h;
import s0.C5880z;
import tK.C18030v;
import u0.C5968C;
import u0.C5974I;
import u0.C5979c;
import u0.C5991o;
import u0.C5993q;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001aÃ\u0001\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\u0016\u0010\u0012\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0011\u0012\u0004\u0012\u00020\u000b0\n2\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0001¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u001a²\u0006\u000e\u0010\u0017\u001a\u00020\u00058\n@\nX\u0002²\u0006\u000e\u0010\u0018\u001a\u00020\u00058\n@\nX\u0002²\u0006\f\u0010\u0019\u001a\u00020\u00138\nX\u0002"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "items", "", "gridCells", "", "country", "language", "Lkotlin/Function1;", "LXH/N;", "onItemSelected", "onFavorite", "onBedDisclaimerClicked", "Lkotlin/Function0;", "onLoadMore", "Lcom/sugarcube/app/base/ui/compose/util/ScrollDirection;", "onScrollDirection", "", "onReachedTop", "d", "(Landroidx/compose/ui/d;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;LnI/l;LnI/l;LnI/l;LnI/a;LnI/l;LnI/l;LU0/m;III)V", "previousIndex", "previousScrollOffset", "reachedBottom", "v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: AG.f  reason: case insensitive filesystem */
public final class C15398f {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.common.drawer.CatalogGridKt$CatalogGrid$1$1", f = "CatalogGrid.kt", l = {}, m = "invokeSuspend")
    /* renamed from: AG.f$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f132836c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5974I f132837d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<Integer, C16807N> f132838e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<Boolean, C16807N> f132839f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C4894o0 f132840g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C4894o0 f132841h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C5974I i10, C17642l<? super Integer, C16807N> lVar, C17642l<? super Boolean, C16807N> lVar2, C4894o0 o0Var, C4894o0 o0Var2, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f132837d = i10;
            this.f132838e = lVar;
            this.f132839f = lVar2;
            this.f132840g = o0Var;
            this.f132841h = o0Var2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f132837d, this.f132838e, this.f132839f, this.f132840g, this.f132841h, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f132836c == 0) {
                y.b(obj);
                int r10 = this.f132837d.r();
                int s10 = this.f132837d.s();
                boolean z10 = true;
                if (r10 > C15398f.e(this.f132840g) || (r10 == C15398f.e(this.f132840g) && s10 > C15398f.i(this.f132841h))) {
                    this.f132838e.invoke(kotlin.coroutines.jvm.internal.b.e(1));
                } else if (r10 < C15398f.e(this.f132840g) || (r10 == C15398f.e(this.f132840g) && s10 < C15398f.i(this.f132841h))) {
                    this.f132838e.invoke(kotlin.coroutines.jvm.internal.b.e(-1));
                }
                C17642l<Boolean, C16807N> lVar = this.f132839f;
                if (lVar != null) {
                    if (!(r10 == 0 && s10 == 0)) {
                        z10 = false;
                    }
                    lVar.invoke(kotlin.coroutines.jvm.internal.b.a(z10));
                }
                C15398f.h(this.f132840g, r10);
                C15398f.j(this.f132841h, s10);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.common.drawer.CatalogGridKt$CatalogGrid$2$1", f = "CatalogGrid.kt", l = {}, m = "invokeSuspend")
    /* renamed from: AG.f$b */
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f132842c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f132843d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ A1<Boolean> f132844e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C17631a<C16807N> aVar, A1<Boolean> a12, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f132843d = aVar;
            this.f132844e = a12;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f132843d, this.f132844e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f132842c == 0) {
                y.b(obj);
                if (C15398f.l(this.f132844e)) {
                    this.f132843d.invoke();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: AG.f$c */
    static final class c implements C17631a<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<CachedCatalogItem, C16807N> f132845a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CachedCatalogItem f132846b;

        c(C17642l<? super CachedCatalogItem, C16807N> lVar, CachedCatalogItem cachedCatalogItem) {
            this.f132845a = lVar;
            this.f132846b = cachedCatalogItem;
        }

        public final void a() {
            C17642l<CachedCatalogItem, C16807N> lVar = this.f132845a;
            if (lVar != null) {
                lVar.invoke(this.f132846b);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: AG.f$d */
    public static final class d extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f132847c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(List list) {
            super(1);
            this.f132847c = list;
        }

        public final Object a(int i10) {
            this.f132847c.get(i10);
            return null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lu0/o;", "", "it", "LXH/N;", "a", "(Lu0/o;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    /* renamed from: AG.f$e */
    public static final class e extends C17544u implements r<C5991o, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f132848c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f132849d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f132850e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f132851f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17642l f132852g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17642l f132853h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(List list, int i10, String str, String str2, C17642l lVar, C17642l lVar2) {
            super(4);
            this.f132848c = list;
            this.f132849d = i10;
            this.f132850e = str;
            this.f132851f = str2;
            this.f132852g = lVar;
            this.f132853h = lVar2;
        }

        public final void a(C5991o oVar, int i10, C4889m mVar, int i11) {
            int i12;
            d.a aVar;
            C17631a aVar2;
            int i13 = i10;
            C4889m mVar2 = mVar;
            if ((i11 & 6) == 0) {
                i12 = i11 | (mVar2.V(oVar) ? 4 : 2);
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= mVar2.d(i13) ? 32 : 16;
            }
            if ((i12 & 147) != 146 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1229287273, i12, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:498)");
                }
                CachedCatalogItem cachedCatalogItem = (CachedCatalogItem) this.f132848c.get(i13);
                mVar2.W(577510802);
                d.a aVar3 = androidx.compose.ui.d.f18749a;
                androidx.compose.ui.d a10 = x.a(aVar3, C5880z.Min);
                C5073d dVar = C5073d.f18068a;
                C5073d.e f10 = dVar.f();
                C5437c.a aVar4 = C5437c.f24302a;
                I b10 = G.b(f10, aVar4.l(), mVar2, 0);
                int a11 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar2, a10);
                C4504g.a aVar5 = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar5.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a12);
                } else {
                    mVar.t();
                }
                C4889m a13 = F1.a(mVar);
                F1.c(a13, b10, aVar5.c());
                F1.c(a13, s10, aVar5.e());
                p<C4504g, Integer, C16807N> b11 = aVar5.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b11);
                }
                F1.c(a13, e10, aVar5.d());
                androidx.compose.ui.d e11 = C5842M.e(C5843N.f28726a, aVar3, 1.0f, false, 2, (Object) null);
                I a14 = C5080k.a(dVar.g(), aVar4.g(), mVar2, 48);
                int a15 = C4883j.a(mVar2, 0);
                C4912y s11 = mVar.s();
                androidx.compose.ui.d e12 = androidx.compose.ui.c.e(mVar2, e11);
                C17631a<C4504g> a16 = aVar5.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a16);
                } else {
                    mVar.t();
                }
                C4889m a17 = F1.a(mVar);
                F1.c(a17, a14, aVar5.c());
                F1.c(a17, s11, aVar5.e());
                p<C4504g, Integer, C16807N> b12 = aVar5.b();
                if (a17.i() || !C17542s.e(a17.D(), Integer.valueOf(a15))) {
                    a17.u(Integer.valueOf(a15));
                    a17.w(Integer.valueOf(a15), b12);
                }
                F1.c(a17, e12, aVar5.d());
                C5862h hVar = C5862h.f28810a;
                mVar2.W(1055302273);
                if (i13 < this.f132849d) {
                    aVar = aVar3;
                    H.a((androidx.compose.ui.d) null, 0.0f, C18030v.f147664a.a(mVar2, C18030v.f147665b).m0(), mVar, 0, 3);
                } else {
                    aVar = aVar3;
                }
                mVar.P();
                String priceNumeral = cachedCatalogItem.getCatalogItem().getPriceNumeral();
                if (priceNumeral == null) {
                    priceNumeral = "0.00";
                }
                C14768a aVar6 = new C14768a(priceNumeral, this.f132850e, this.f132851f, false, true, 8, (DefaultConstructorMarker) null);
                C17642l lVar = this.f132852g;
                mVar2.W(1055323287);
                if (cachedCatalogItem.isCombinable()) {
                    mVar2.W(1055324781);
                    boolean V10 = mVar2.V(this.f132853h) | mVar2.V(cachedCatalogItem);
                    Object D10 = mVar.D();
                    if (V10 || D10 == C4889m.f14007a.a()) {
                        D10 = new c(this.f132853h, cachedCatalogItem);
                        mVar2.u(D10);
                    }
                    mVar.P();
                    aVar2 = (C17631a) D10;
                } else {
                    aVar2 = null;
                }
                mVar.P();
                u.g(cachedCatalogItem, aVar6, lVar, (C17631a<C16807N>) null, aVar2, mVar, 3072, 0);
                C18030v vVar = C18030v.f147664a;
                int i14 = C18030v.f147665b;
                H.a((androidx.compose.ui.d) null, 0.0f, vVar.a(mVar2, i14).m0(), mVar, 0, 3);
                mVar.x();
                mVar2.W(1452033141);
                if ((i13 + 1) % this.f132849d != 0) {
                    H.b(J.y(J.d(aVar, 0.0f, 1, (Object) null), h.B((float) 1)), 0.0f, vVar.a(mVar2, i14).m0(), mVar, 6, 2);
                }
                mVar.P();
                mVar.x();
                mVar.P();
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C5991o) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0380  */
    /* JADX WARNING: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(androidx.compose.ui.d r39, java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem> r40, int r41, java.lang.String r42, java.lang.String r43, nI.C17642l<? super com.sugarcube.app.base.data.database.CachedCatalogItem, XH.C16807N> r44, nI.C17642l<? super com.sugarcube.app.base.data.database.CachedCatalogItem, XH.C16807N> r45, nI.C17642l<? super com.sugarcube.app.base.data.database.CachedCatalogItem, XH.C16807N> r46, nI.C17631a<XH.C16807N> r47, nI.C17642l<? super java.lang.Integer, XH.C16807N> r48, nI.C17642l<? super java.lang.Boolean, XH.C16807N> r49, U0.C4889m r50, int r51, int r52, int r53) {
        /*
            r7 = r40
            r8 = r42
            r9 = r43
            r10 = r44
            r11 = r47
            r12 = r48
            r13 = r51
            r14 = r53
            java.lang.String r0 = "items"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            java.lang.String r0 = "country"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            java.lang.String r0 = "language"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            java.lang.String r0 = "onItemSelected"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "onLoadMore"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.lang.String r0 = "onScrollDirection"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            r0 = 1779671746(0x6a13a2c2, float:4.4620174E25)
            r1 = r50
            U0.m r15 = r1.k(r0)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x0041
            r4 = r13 | 6
            r5 = r4
            r4 = r39
            goto L_0x0055
        L_0x0041:
            r4 = r13 & 6
            if (r4 != 0) goto L_0x0052
            r4 = r39
            boolean r5 = r15.V(r4)
            if (r5 == 0) goto L_0x004f
            r5 = 4
            goto L_0x0050
        L_0x004f:
            r5 = 2
        L_0x0050:
            r5 = r5 | r13
            goto L_0x0055
        L_0x0052:
            r4 = r39
            r5 = r13
        L_0x0055:
            r6 = r14 & 2
            if (r6 == 0) goto L_0x005c
            r5 = r5 | 48
            goto L_0x006c
        L_0x005c:
            r6 = r13 & 48
            if (r6 != 0) goto L_0x006c
            boolean r6 = r15.F(r7)
            if (r6 == 0) goto L_0x0069
            r6 = 32
            goto L_0x006b
        L_0x0069:
            r6 = 16
        L_0x006b:
            r5 = r5 | r6
        L_0x006c:
            r6 = r14 & 4
            if (r6 == 0) goto L_0x0075
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0072:
            r3 = r41
            goto L_0x0088
        L_0x0075:
            r3 = r13 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0072
            r3 = r41
            boolean r17 = r15.d(r3)
            if (r17 == 0) goto L_0x0084
            r17 = 256(0x100, float:3.59E-43)
            goto L_0x0086
        L_0x0084:
            r17 = 128(0x80, float:1.794E-43)
        L_0x0086:
            r5 = r5 | r17
        L_0x0088:
            r17 = r14 & 8
            if (r17 == 0) goto L_0x008f
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x009f
        L_0x008f:
            r0 = r13 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x009f
            boolean r0 = r15.V(r8)
            if (r0 == 0) goto L_0x009c
            r0 = 2048(0x800, float:2.87E-42)
            goto L_0x009e
        L_0x009c:
            r0 = 1024(0x400, float:1.435E-42)
        L_0x009e:
            r5 = r5 | r0
        L_0x009f:
            r0 = r14 & 16
            if (r0 == 0) goto L_0x00a6
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00b6
        L_0x00a6:
            r0 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x00b6
            boolean r0 = r15.V(r9)
            if (r0 == 0) goto L_0x00b3
            r0 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00b5
        L_0x00b3:
            r0 = 8192(0x2000, float:1.14794E-41)
        L_0x00b5:
            r5 = r5 | r0
        L_0x00b6:
            r0 = r14 & 32
            r20 = 196608(0x30000, float:2.75506E-40)
            if (r0 == 0) goto L_0x00bf
            r5 = r5 | r20
            goto L_0x00cf
        L_0x00bf:
            r0 = r13 & r20
            if (r0 != 0) goto L_0x00cf
            boolean r0 = r15.F(r10)
            if (r0 == 0) goto L_0x00cc
            r0 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ce
        L_0x00cc:
            r0 = 65536(0x10000, float:9.18355E-41)
        L_0x00ce:
            r5 = r5 | r0
        L_0x00cf:
            r0 = r14 & 128(0x80, float:1.794E-43)
            r21 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00da
            r5 = r5 | r21
            r2 = r46
            goto L_0x00ed
        L_0x00da:
            r21 = r13 & r21
            r2 = r46
            if (r21 != 0) goto L_0x00ed
            boolean r22 = r15.F(r2)
            if (r22 == 0) goto L_0x00e9
            r22 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00eb
        L_0x00e9:
            r22 = 4194304(0x400000, float:5.877472E-39)
        L_0x00eb:
            r5 = r5 | r22
        L_0x00ed:
            r8 = r14 & 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L_0x00f5
            r8 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x00f3:
            r5 = r5 | r8
            goto L_0x0106
        L_0x00f5:
            r8 = 100663296(0x6000000, float:2.4074124E-35)
            r8 = r8 & r13
            if (r8 != 0) goto L_0x0106
            boolean r8 = r15.F(r11)
            if (r8 == 0) goto L_0x0103
            r8 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00f3
        L_0x0103:
            r8 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x00f3
        L_0x0106:
            r8 = r14 & 512(0x200, float:7.175E-43)
            if (r8 == 0) goto L_0x010f
            r8 = 805306368(0x30000000, float:4.656613E-10)
        L_0x010c:
            r5 = r5 | r8
        L_0x010d:
            r8 = r5
            goto L_0x0120
        L_0x010f:
            r8 = 805306368(0x30000000, float:4.656613E-10)
            r8 = r8 & r13
            if (r8 != 0) goto L_0x010d
            boolean r8 = r15.F(r12)
            if (r8 == 0) goto L_0x011d
            r8 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x010c
        L_0x011d:
            r8 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x010c
        L_0x0120:
            r5 = r14 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L_0x0129
            r23 = r52 | 6
        L_0x0126:
            r2 = r23
            goto L_0x013f
        L_0x0129:
            r23 = r52 & 6
            r2 = r49
            if (r23 != 0) goto L_0x013d
            boolean r23 = r15.F(r2)
            if (r23 == 0) goto L_0x0138
            r23 = 4
            goto L_0x013a
        L_0x0138:
            r23 = 2
        L_0x013a:
            r23 = r52 | r23
            goto L_0x0126
        L_0x013d:
            r2 = r52
        L_0x013f:
            r23 = 306259091(0x12412493, float:6.0945143E-28)
            r3 = r8 & r23
            r4 = 306259090(0x12412492, float:6.094514E-28)
            if (r3 != r4) goto L_0x0165
            r3 = r2 & 3
            r4 = 2
            if (r3 != r4) goto L_0x0165
            boolean r3 = r15.l()
            if (r3 != 0) goto L_0x0155
            goto L_0x0165
        L_0x0155:
            r15.L()
            r1 = r39
            r3 = r41
            r28 = r45
            r8 = r46
            r30 = r49
            r0 = r15
            goto L_0x037a
        L_0x0165:
            if (r1 == 0) goto L_0x016b
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r4 = r1
            goto L_0x016d
        L_0x016b:
            r4 = r39
        L_0x016d:
            if (r6 == 0) goto L_0x0171
            r6 = 4
            goto L_0x0173
        L_0x0171:
            r6 = r41
        L_0x0173:
            r1 = r14 & 64
            if (r1 == 0) goto L_0x017a
            r28 = 0
            goto L_0x017c
        L_0x017a:
            r28 = r45
        L_0x017c:
            if (r0 == 0) goto L_0x0181
            r29 = 0
            goto L_0x0183
        L_0x0181:
            r29 = r46
        L_0x0183:
            if (r5 == 0) goto L_0x0188
            r30 = 0
            goto L_0x018a
        L_0x0188:
            r30 = r49
        L_0x018a:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0198
            java.lang.String r0 = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.common.drawer.CatalogGrid (CatalogGrid.kt:76)"
            r1 = 1779671746(0x6a13a2c2, float:4.4620174E25)
            U0.C4895p.S(r1, r8, r2, r0)
        L_0x0198:
            r0 = 3
            r5 = 0
            u0.I r1 = u0.C5975J.b(r5, r5, r15, r5, r0)
            r0 = -711532277(0xffffffffd596e10b, float:-2.0736662E13)
            r15.W(r0)
            java.lang.Object r0 = r15.D()
            U0.m$a r18 = U0.C4889m.f14007a
            java.lang.Object r3 = r18.a()
            if (r0 != r3) goto L_0x01b7
            U0.o0 r0 = U0.C4877g1.a(r5)
            r15.u(r0)
        L_0x01b7:
            r19 = r0
            U0.o0 r19 = (U0.C4894o0) r19
            r15.P()
            r0 = -711530165(0xffffffffd596e94b, float:-2.07410912E13)
            r15.W(r0)
            java.lang.Object r0 = r15.D()
            java.lang.Object r3 = r18.a()
            if (r0 != r3) goto L_0x01d5
            U0.o0 r0 = U0.C4877g1.a(r5)
            r15.u(r0)
        L_0x01d5:
            r23 = r0
            U0.o0 r23 = (U0.C4894o0) r23
            r15.P()
            int r0 = r1.r()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            int r0 = r1.s()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5 = -711523327(0xffffffffd5970401, float:-2.07554316E13)
            r15.W(r5)
            boolean r5 = r15.V(r1)
            r24 = 1879048192(0x70000000, float:1.58456325E29)
            r45 = r0
            r0 = r8 & r24
            r46 = r1
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r24 = r6
            r6 = 1
            if (r0 != r1) goto L_0x0207
            r0 = r6
            goto L_0x0208
        L_0x0207:
            r0 = 0
        L_0x0208:
            r0 = r0 | r5
            r1 = r2 & 14
            r2 = 4
            if (r1 != r2) goto L_0x0210
            r1 = r6
            goto L_0x0211
        L_0x0210:
            r1 = 0
        L_0x0211:
            r0 = r0 | r1
            java.lang.Object r1 = r15.D()
            if (r0 != 0) goto L_0x022b
            java.lang.Object r0 = r18.a()
            if (r1 != r0) goto L_0x021f
            goto L_0x022b
        L_0x021f:
            r31 = r45
            r45 = r46
            r33 = r3
            r34 = r4
            r12 = r6
            r10 = r24
            goto L_0x0253
        L_0x022b:
            AG.f$a r5 = new AG.f$a
            r25 = 0
            r1 = r45
            r2 = 2048(0x800, float:2.87E-42)
            r0 = r5
            r45 = r46
            r31 = r1
            r1 = r45
            r2 = r48
            r33 = r3
            r3 = r30
            r34 = r4
            r4 = r19
            r9 = r5
            r5 = r23
            r12 = r6
            r10 = r24
            r6 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r15.u(r9)
            r1 = r9
        L_0x0253:
            nI.p r1 = (nI.p) r1
            r15.P()
            r3 = r31
            r2 = r33
            r0 = 0
            U0.P.f(r2, r3, r1, r15, r0)
            r0 = -711494381(0xffffffffd5977513, float:-2.08161357E13)
            r15.W(r0)
            java.lang.Object r0 = r15.D()
            java.lang.Object r1 = r18.a()
            if (r0 != r1) goto L_0x027f
            AG.c r0 = new AG.c
            r9 = r45
            r0.<init>(r9)
            U0.A1 r0 = U0.p1.e(r0)
            r15.u(r0)
            goto L_0x0281
        L_0x027f:
            r9 = r45
        L_0x0281:
            U0.A1 r0 = (U0.A1) r0
            r15.P()
            boolean r1 = l(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = -711489664(0xffffffffd5978780, float:-2.0826028E13)
            r15.W(r2)
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r8
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            if (r2 != r3) goto L_0x029d
            r5 = r12
            goto L_0x029e
        L_0x029d:
            r5 = 0
        L_0x029e:
            java.lang.Object r2 = r15.D()
            if (r5 != 0) goto L_0x02ad
            java.lang.Object r3 = r18.a()
            if (r2 != r3) goto L_0x02ab
            goto L_0x02ad
        L_0x02ab:
            r3 = 0
            goto L_0x02b6
        L_0x02ad:
            AG.f$b r2 = new AG.f$b
            r3 = 0
            r2.<init>(r11, r0, r3)
            r15.u(r2)
        L_0x02b6:
            nI.p r2 = (nI.p) r2
            r15.P()
            r0 = 0
            U0.P.g(r1, r2, r15, r0)
            r1 = 0
            r6 = r34
            androidx.compose.ui.d r32 = androidx.compose.foundation.layout.J.f(r6, r1, r12, r3)
            rF.b r1 = rF.C15002a.a(r15, r0)
            long r33 = r1.p()
            r36 = 2
            r37 = 0
            r35 = 0
            androidx.compose.ui.d r1 = androidx.compose.foundation.b.d(r32, r33, r35, r36, r37)
            java.lang.String r2 = "CATALOG_GRID_TEST_TAG"
            androidx.compose.ui.d r16 = androidx.compose.ui.platform.C5116k1.a(r1, r2)
            u0.b$a r5 = new u0.b$a
            r5.<init>(r10)
            r1 = -711477249(0xffffffffd597b7ff, float:-2.08520641E13)
            r15.W(r1)
            boolean r1 = r15.F(r7)
            r2 = r8 & 896(0x380, float:1.256E-42)
            r3 = 256(0x100, float:3.59E-43)
            if (r2 != r3) goto L_0x02f5
            r2 = r12
            goto L_0x02f6
        L_0x02f5:
            r2 = r0
        L_0x02f6:
            r1 = r1 | r2
            r2 = r8 & 7168(0x1c00, float:1.0045E-41)
            r3 = 2048(0x800, float:2.87E-42)
            if (r2 != r3) goto L_0x02ff
            r2 = r12
            goto L_0x0300
        L_0x02ff:
            r2 = r0
        L_0x0300:
            r1 = r1 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r8
            r3 = 16384(0x4000, float:2.2959E-41)
            if (r2 != r3) goto L_0x030b
            r2 = r12
            goto L_0x030c
        L_0x030b:
            r2 = r0
        L_0x030c:
            r1 = r1 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r8
            r3 = 131072(0x20000, float:1.83671E-40)
            if (r2 != r3) goto L_0x0316
            r2 = r12
            goto L_0x0317
        L_0x0316:
            r2 = r0
        L_0x0317:
            r1 = r1 | r2
            r2 = 29360128(0x1c00000, float:7.052966E-38)
            r2 = r2 & r8
            r3 = 8388608(0x800000, float:1.17549435E-38)
            if (r2 != r3) goto L_0x0320
            goto L_0x0321
        L_0x0320:
            r12 = r0
        L_0x0321:
            r0 = r1 | r12
            java.lang.Object r1 = r15.D()
            if (r0 != 0) goto L_0x0334
            java.lang.Object r0 = r18.a()
            if (r1 != r0) goto L_0x0330
            goto L_0x0334
        L_0x0330:
            r12 = r5
            r31 = r6
            goto L_0x034c
        L_0x0334:
            AG.d r8 = new AG.d
            r0 = r8
            r1 = r40
            r2 = r10
            r3 = r42
            r4 = r43
            r12 = r5
            r5 = r44
            r31 = r6
            r6 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r15.u(r8)
            r1 = r8
        L_0x034c:
            r24 = r1
            nI.l r24 = (nI.C17642l) r24
            r15.P()
            r26 = 0
            r27 = 504(0x1f8, float:7.06E-43)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r0 = r15
            r15 = r12
            r17 = r9
            r25 = r0
            u0.C5984h.a(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0375
            U0.C4895p.R()
        L_0x0375:
            r3 = r10
            r8 = r29
            r1 = r31
        L_0x037a:
            U0.Y0 r15 = r0.n()
            if (r15 == 0) goto L_0x03a3
            AG.e r12 = new AG.e
            r0 = r12
            r2 = r40
            r4 = r42
            r5 = r43
            r6 = r44
            r7 = r28
            r9 = r47
            r10 = r48
            r11 = r30
            r38 = r12
            r12 = r51
            r13 = r52
            r14 = r53
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r38
            r15.a(r0)
        L_0x03a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: AG.C15398f.d(androidx.compose.ui.d, java.util.List, int, java.lang.String, java.lang.String, nI.l, nI.l, nI.l, nI.a, nI.l, nI.l, U0.m, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final int e(C4894o0 o0Var) {
        return o0Var.e();
    }

    /* access modifiers changed from: private */
    public static final C16807N f(List list, int i10, String str, String str2, C17642l lVar, C17642l lVar2, C5968C c10) {
        C17542s.j(c10, "$this$LazyVerticalGrid");
        c10.h(list.size(), (C17642l<? super Integer, ? extends Object>) null, (p<? super C5993q, ? super Integer, C5979c>) null, new d(list), c1.c.c(1229287273, true, new e(list, i10, str, str2, lVar, lVar2)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(androidx.compose.ui.d dVar, List list, int i10, String str, String str2, C17642l lVar, C17642l lVar2, C17642l lVar3, C17631a aVar, C17642l lVar4, C17642l lVar5, int i11, int i12, int i13, C4889m mVar, int i14) {
        d(dVar, list, i10, str, str2, lVar, lVar2, lVar3, aVar, lVar4, lVar5, mVar, M0.a(i11 | 1), M0.a(i12), i13);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void h(C4894o0 o0Var, int i10) {
        o0Var.g(i10);
    }

    /* access modifiers changed from: private */
    public static final int i(C4894o0 o0Var) {
        return o0Var.e();
    }

    /* access modifiers changed from: private */
    public static final void j(C4894o0 o0Var, int i10) {
        o0Var.g(i10);
    }

    /* access modifiers changed from: private */
    public static final boolean k(C5974I i10) {
        return C15809a.d(i10, 0, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final boolean l(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }
}
