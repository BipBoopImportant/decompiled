package uk;

import E1.C4478k;
import E1.I;
import G1.C4504g;
import LC.C13178b;
import N1.P;
import O0.L0;
import QJ.Q;
import QJ.T;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import SC.F0;
import SC.G0;
import SC.H0;
import SC.Y2;
import TC.C13679b;
import TJ.C16532g;
import TJ.C16533h;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.L;
import U0.M;
import U0.M0;
import U0.Y0;
import U0.o1;
import U0.p1;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import androidx.compose.foundation.layout.A;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5100f0;
import com.ingka.ikea.analytics.Interaction$Component;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import f1.C5301c;
import f1.C5309k;
import gs.e;
import i1.C5437c;
import jC.C14615b;
import jk.C11423a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import m0.N;
import n0.C5583F;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import o1.C5668h;
import o1.C5673m;
import p1.C5728l0;
import p1.C5747v0;
import p1.C5749w0;
import p1.i1;
import pk.C11724c;
import pk.C11741d;
import pk.r;
import pk.s;
import r1.C5817c;
import s0.C5834E;
import s0.C5844O;
import s0.C5857c;
import s0.C5859e;
import s0.C5862h;
import tK.C18030v;
import u0.C5968C;
import u0.C5972G;
import u0.C5974I;
import u0.C5979c;
import u0.C5991o;
import u0.C5993q;
import uK.C18146a;
import uk.C12056w;
import vk.C12134F;
import vk.C12180x;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\u001aO\u0010\f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r\u001aù\u0001\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a/\u0010#\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\n2\b\b\u0002\u0010!\u001a\u00020 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0003¢\u0006\u0004\b#\u0010$\u001a'\u0010(\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\nH\u0003¢\u0006\u0004\b(\u0010)\u001a[\u0010/\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020\n2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\b\b\u0002\u0010!\u001a\u00020 2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0003¢\u0006\u0004\b/\u00100\u001aG\u00108\u001a\u00020\u0006*\u0002012\u0006\u00103\u001a\u0002022\b\u00104\u001a\u0004\u0018\u00010\u00192\u0006\u0010'\u001a\u00020\n2\u0006\u00105\u001a\u00020\n2\u0006\u00107\u001a\u0002062\b\b\u0002\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b8\u00109\u001a\u0019\u0010:\u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020 H\u0003¢\u0006\u0004\b:\u0010;\u001a\u0019\u0010<\u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020 H\u0003¢\u0006\u0004\b<\u0010;\u001a3\u0010D\u001a\u00020 *\u00020 2\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020?2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bD\u0010E\u001a\u0017\u0010H\u001a\u00020\n2\u0006\u0010G\u001a\u00020FH\u0003¢\u0006\u0004\bH\u0010I\u001aC\u0010L\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010G\u001a\u00020F2\u0006\u0010J\u001a\u00020\n2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0003¢\u0006\u0004\bL\u0010M\"\u001a\u0010R\u001a\u00020B8\u0000X\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q¨\u0006Z²\u0006\u000e\u0010S\u001a\u00020\n8\n@\nX\u0002²\u0006\u000e\u0010T\u001a\u00020\n8\n@\nX\u0002²\u0006\u0010\u0010U\u001a\u0004\u0018\u00010\u00198\n@\nX\u0002²\u0006\u000e\u0010V\u001a\u00020\n8\n@\nX\u0002²\u0006\u0010\u0010W\u001a\u0004\u0018\u00010\u00108\n@\nX\u0002²\u0006\f\u0010X\u001a\u00020=8\nX\u0002²\u0006\u000e\u0010J\u001a\u00020\n8\n@\nX\u0002²\u0006\f\u0010Y\u001a\u00020?8\nX\u0002²\u0006\u000e\u0010%\u001a\u00020\n8\n@\nX\u0002"}, d2 = {"Lpk/s;", "state", "LT0/c;", "windowSize", "Lkotlin/Function1;", "Lpk/c;", "LXH/N;", "onAction", "Luk/w;", "onScreenAction", "", "shouldScrollToTop", "b1", "(Lpk/s;LT0/c;LnI/l;LnI/l;ZLU0/m;I)V", "Lkotlin/Function0;", "onListOptionsClick", "Lpk/l;", "onItemClick", "onItemOptionsClick", "Lpk/r;", "onListModeToggled", "onCopyAllItemsToCartFeedbackDismissed", "onMoveItemResultDismissed", "onRemoveItemResultDismissed", "onRemoveItemClick", "", "onUndoRemoveItemClicked", "onAddRemoveItemResultConsumed", "onOutOfStockItemSeen", "C2", "(Lpk/s;LT0/c;ZLnI/l;LnI/a;LnI/l;LnI/l;LnI/l;LnI/a;LnI/a;LnI/a;LnI/l;LnI/l;LnI/a;LnI/l;LU0/m;II)V", "visible", "Landroidx/compose/ui/d;", "modifier", "onClick", "X0", "(ZLandroidx/compose/ui/d;LnI/a;LU0/m;II)V", "isBackLayerHidden", "hasProductItems", "loadingProducts", "L0", "(ZZZLU0/m;I)V", "backLayerHidden", "hasItems", "shareButtonVisible", "onCloseClick", "onShareListClick", "O0", "(ZZZLnI/a;LnI/a;Landroidx/compose/ui/d;LnI/a;LU0/m;II)V", "Lu0/C;", "Lc2/k;", "imageSize", "imageUrl", "hasProducts", "", "columns", "e3", "(Lu0/C;JLjava/lang/String;ZZILandroidx/compose/ui/d;)V", "V0", "(Landroidx/compose/ui/d;LU0/m;II)V", "T0", "", "offset", "Lp1/v0;", "backLayerContentColor", "frontLayerContentColor", "Lc2/h;", "peekHeight", "l3", "(Landroidx/compose/ui/d;FJJF)Landroidx/compose/ui/d;", "Lu0/I;", "lazyGridState", "h3", "(Lu0/I;LU0/m;I)Z", "isScrolledToTop", "onShouldScrollToTopConsumed", "R0", "(ZLnI/a;Lu0/I;ZLnI/a;LU0/m;I)V", "a", "F", "g3", "()F", "PeekHeight", "showListActionsSheet", "showListItemActionsSheet", "selectedProductItemNo", "showProductModalSheet", "selectedProductForModal", "firstItemOffset", "iconColor", "shoppinglist-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class s1 {

    /* renamed from: a  reason: collision with root package name */
    private static final float f103676a = c2.h.B((float) 24);

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"uk/s1$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements L {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ jC.i f103677a;

        public a(jC.i iVar) {
            this.f103677a = iVar;
        }

        public void b() {
            this.f103677a.a().a(C14615b.e.f127859b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.ui.ShoppingListDetailsScreenKt$HandleShoppingListTabPressed$1$1", f = "ShoppingListDetailsScreen.kt", l = {904}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        boolean f103678c;

        /* renamed from: d  reason: collision with root package name */
        int f103679d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f103680e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f103681f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f103682g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C5974I f103683h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f103684i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(boolean z10, boolean z11, C17631a<C16807N> aVar, C5974I i10, C17631a<C16807N> aVar2, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f103680e = z10;
            this.f103681f = z11;
            this.f103682g = aVar;
            this.f103683h = i10;
            this.f103684i = aVar2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f103680e, this.f103681f, this.f103682g, this.f103683h, this.f103684i, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f103679d;
            if (i10 == 0) {
                y.b(obj);
                if (this.f103680e) {
                    boolean z10 = this.f103681f;
                    if (z10) {
                        this.f103682g.invoke();
                    } else if (!z10) {
                        C5974I i11 = this.f103683h;
                        this.f103678c = z10;
                        this.f103679d = 1;
                        if (C5974I.J(i11, 0, 0, this, 2, (Object) null) == f10) {
                            return f10;
                        }
                    } else {
                        throw new t();
                    }
                }
                return C16807N.f139792a;
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f103684i.invoke();
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements q<l0.e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f103685a;

        c(C17631a<C16807N> aVar) {
            this.f103685a = aVar;
        }

        public final void a(l0.e eVar, C4889m mVar, int i10) {
            C17542s.j(eVar, "$this$AnimatedVisibility");
            if (C4895p.J()) {
                C4895p.S(1903976731, i10, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.ScanFab.<anonymous> (ShoppingListDetailsScreen.kt:614)");
            }
            F0.b(C18146a.f148610qa, J1.j.b(ik.c.f98337f, mVar, 0), D.k(androidx.compose.ui.d.f18749a, 0.0f, c2.h.B((float) 16), 1, (Object) null), false, (H0) null, (G0) null, (r0.m) null, false, this.f103685a, mVar, 384, 248);
            if (C4895p.J()) {
                C4895p.R();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((l0.e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.ui.ShoppingListDetailsScreenKt$ShoppingListDetailsScreen$1$1", f = "ShoppingListDetailsScreen.kt", l = {}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f103686c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ s f103687d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<C12056w, C16807N> f103688e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(s sVar, C17642l<? super C12056w, C16807N> lVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f103687d = sVar;
            this.f103688e = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f103687d, this.f103688e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f103686c == 0) {
                y.b(obj);
                if (this.f103687d.D()) {
                    this.f103688e.invoke(C12056w.f.f103795a);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.ui.ShoppingListDetailsScreenKt$ShoppingListDetailsScreen$2$1$1", f = "ShoppingListDetailsScreen.kt", l = {194}, m = "invokeSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f103689c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ O0.F0 f103690d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f103691e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(O0.F0 f02, C4899r0<Boolean> r0Var, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f103690d = f02;
            this.f103691e = r0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f103690d, this.f103691e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f103689c;
            if (i10 == 0) {
                y.b(obj);
                s1.R1(this.f103691e, true);
                O0.F0 f02 = this.f103690d;
                this.f103689c = 1;
                if (f02.p(this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.ui.ShoppingListDetailsScreenKt$ShoppingListDetailsScreen$3$1$1", f = "ShoppingListDetailsScreen.kt", l = {216}, m = "invokeSuspend")
    static final class f extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f103692c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ O0.F0 f103693d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f103694e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(O0.F0 f02, C4899r0<Boolean> r0Var, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f103693d = f02;
            this.f103694e = r0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f103693d, this.f103694e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f103692c;
            if (i10 == 0) {
                y.b(obj);
                s1.D1(this.f103694e, true);
                O0.F0 f02 = this.f103693d;
                this.f103692c = 1;
                if (f02.p(this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.ui.ShoppingListDetailsScreenKt$ShoppingListDetailsScreen$4$1$1", f = "ShoppingListDetailsScreen.kt", l = {201}, m = "invokeSuspend")
    static final class g extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f103695c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ pk.l f103696d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ O0.F0 f103697e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C4899r0<String> f103698f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f103699g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(pk.l lVar, O0.F0 f02, C4899r0<String> r0Var, C4899r0<Boolean> r0Var2, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f103696d = lVar;
            this.f103697e = f02;
            this.f103698f = r0Var;
            this.f103699g = r0Var2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f103696d, this.f103697e, this.f103698f, this.f103699g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f103695c;
            if (i10 == 0) {
                y.b(obj);
                s1.t1(this.f103698f, this.f103696d.j());
                s1.w2(this.f103699g, true);
                O0.F0 f02 = this.f103697e;
                this.f103695c = 1;
                if (f02.p(this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.ui.ShoppingListDetailsScreenKt$ShoppingListDetailsScreen$49$1", f = "ShoppingListDetailsScreen.kt", l = {}, m = "invokeSuspend")
    static final class h extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f103700c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ s f103701d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<C12056w, C16807N> f103702e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(s sVar, C17642l<? super C12056w, C16807N> lVar, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f103701d = sVar;
            this.f103702e = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new h(this.f103701d, this.f103702e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((h) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f103700c == 0) {
                y.b(obj);
                if (this.f103701d.A() != null) {
                    this.f103702e.invoke(C12056w.r.f103808a);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.ui.ShoppingListDetailsScreenKt$ShoppingListDetailsScreen$closeListActionsBottomSheetAndThen$1", f = "ShoppingListDetailsScreen.kt", l = {146}, m = "invokeSuspend")
    static final class i extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f103703c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ O0.F0 f103704d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(O0.F0 f02, C17164e<? super i> eVar) {
            super(2, eVar);
            this.f103704d = f02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new i(this.f103704d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((i) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f103703c;
            if (i10 == 0) {
                y.b(obj);
                O0.F0 f02 = this.f103704d;
                this.f103703c = 1;
                if (f02.k(this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.ui.ShoppingListDetailsScreenKt$ShoppingListDetailsScreen$closeListItemActionsBottomSheetAndThen$1", f = "ShoppingListDetailsScreen.kt", l = {160}, m = "invokeSuspend")
    static final class j extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f103705c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ O0.F0 f103706d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(O0.F0 f02, C17164e<? super j> eVar) {
            super(2, eVar);
            this.f103706d = f02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new j(this.f103706d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((j) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f103705c;
            if (i10 == 0) {
                y.b(obj);
                O0.F0 f02 = this.f103706d;
                this.f103705c = 1;
                if (f02.k(this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.ui.ShoppingListDetailsScreenKt$ShoppingListDetailsScreen$closeProductModalAndThen$1", f = "ShoppingListDetailsScreen.kt", l = {175}, m = "invokeSuspend")
    static final class k extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f103707c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ O0.F0 f103708d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(O0.F0 f02, C17164e<? super k> eVar) {
            super(2, eVar);
            this.f103708d = f02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new k(this.f103708d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((k) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f103707c;
            if (i10 == 0) {
                y.b(obj);
                O0.F0 f02 = this.f103708d;
                this.f103707c = 1;
                if (f02.k(this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.ui.ShoppingListDetailsScreenKt$ShoppingListDetailsScreenUi$1$1", f = "ShoppingListDetailsScreen.kt", l = {}, m = "invokeSuspend")
    static final class l extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f103709c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<C12056w, C16807N> f103710d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f103711e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(C17642l<? super C12056w, C16807N> lVar, C4899r0<Boolean> r0Var, C17164e<? super l> eVar) {
            super(2, eVar);
            this.f103710d = lVar;
            this.f103711e = r0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new l(this.f103710d, this.f103711e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((l) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f103709c == 0) {
                y.b(obj);
                this.f103710d.invoke(new C12056w.q(s1.F2(this.f103711e)));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class m implements q<C5859e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f103712a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ s f103713b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f103714c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f103715d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<C12056w, C16807N> f103716e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f103717f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ L0 f103718g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ T0.c f103719h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C5974I f103720i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ long f103721j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C17642l<pk.l, C16807N> f103722k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C17642l<r, C16807N> f103723l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ C17642l<pk.l, C16807N> f103724m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ C17642l<pk.l, C16807N> f103725n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ C17642l<pk.l, C16807N> f103726o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ A1<Float> f103727p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ L0 f103728a;

            a(L0 l02) {
                this.f103728a = l02;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-334705215, i10, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.ShoppingListDetailsScreenUi.<anonymous>.<anonymous> (ShoppingListDetailsScreen.kt:443)");
                    }
                    Y2.c(this.f103728a, (androidx.compose.ui.d) null, (nI.r<? super O0.H0, ? super p<? super C4889m, ? super Integer, C16807N>, ? super C4889m, ? super Integer, C16807N>) null, mVar, 6, 6);
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
        static final class b implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ s f103729a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C17642l<C12056w, C16807N> f103730b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C5859e f103731c;

            b(s sVar, C17642l<? super C12056w, C16807N> lVar, C5859e eVar) {
                this.f103729a = sVar;
                this.f103730b = lVar;
                this.f103731c = eVar;
            }

            /* access modifiers changed from: private */
            public static final C16807N e(C17642l lVar) {
                lVar.invoke(C12056w.t.f103810a);
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N f(C17642l lVar) {
                lVar.invoke(C12056w.p.f103806a);
                return C16807N.f139792a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: nI.a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: nI.a} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void c(U0.C4889m r16, int r17) {
                /*
                    r15 = this;
                    r0 = r15
                    r14 = r16
                    r1 = r17
                    r2 = r1 & 3
                    r3 = 2
                    if (r2 != r3) goto L_0x0016
                    boolean r2 = r16.l()
                    if (r2 != 0) goto L_0x0011
                    goto L_0x0016
                L_0x0011:
                    r16.L()
                    goto L_0x0103
                L_0x0016:
                    boolean r2 = U0.C4895p.J()
                    if (r2 == 0) goto L_0x0025
                    r2 = -1
                    java.lang.String r4 = "com.ingka.ikea.app.shoppinglist.listdetails.ui.ShoppingListDetailsScreenUi.<anonymous>.<anonymous> (ShoppingListDetailsScreen.kt:452)"
                    r5 = 1247646850(0x4a5d9482, float:3630368.5)
                    U0.C4895p.S(r5, r1, r2, r4)
                L_0x0025:
                    pk.s r1 = r0.f103729a
                    pk.j r1 = r1.j()
                    pk.j$c r2 = pk.j.c.f100959a
                    boolean r2 = kotlin.jvm.internal.C17542s.e(r1, r2)
                    if (r2 == 0) goto L_0x0092
                    r1 = 1877543162(0x6fe908fa, float:1.4424172E29)
                    r14.W(r1)
                    int r1 = ik.c.f98341j
                    r2 = 0
                    java.lang.String r1 = J1.j.b(r1, r14, r2)
                    androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
                    r4 = 1
                    r5 = 0
                    r6 = 0
                    androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.h(r2, r5, r4, r6)
                    r4 = 16
                    float r4 = (float) r4
                    float r4 = c2.h.B(r4)
                    androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.k(r2, r4, r5, r3, r6)
                    r3 = -355071149(0xffffffffead60b53, float:-1.293818E26)
                    r14.W(r3)
                    nI.l<uk.w, XH.N> r3 = r0.f103730b
                    boolean r3 = r14.V(r3)
                    nI.l<uk.w, XH.N> r4 = r0.f103730b
                    java.lang.Object r5 = r16.D()
                    if (r3 != 0) goto L_0x0070
                    U0.m$a r3 = U0.C4889m.f14007a
                    java.lang.Object r3 = r3.a()
                    if (r5 != r3) goto L_0x0078
                L_0x0070:
                    uk.v1 r5 = new uk.v1
                    r5.<init>(r4)
                    r14.u(r5)
                L_0x0078:
                    r10 = r5
                    nI.a r10 = (nI.C17631a) r10
                    r16.P()
                    r12 = 48
                    r13 = 508(0x1fc, float:7.12E-43)
                    r3 = 0
                    r4 = 0
                    r5 = 0
                    r6 = 0
                    r7 = 0
                    r8 = 0
                    r9 = 0
                    r11 = r16
                    SC.L.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                    r16.P()
                    goto L_0x00fa
                L_0x0092:
                    pk.j$b r2 = pk.j.b.f100958a
                    boolean r2 = kotlin.jvm.internal.C17542s.e(r1, r2)
                    if (r2 == 0) goto L_0x00e9
                    r1 = 1878035659(0x6ff08ccb, float:1.4889322E29)
                    r14.W(r1)
                    pk.s r1 = r0.f103729a
                    boolean r1 = r1.z()
                    s0.e r2 = r0.f103731c
                    androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
                    i1.c$a r4 = i1.C5437c.f24302a
                    i1.c r4 = r4.c()
                    androidx.compose.ui.d r2 = r2.a(r3, r4)
                    r3 = -355053616(0xffffffffead64fd0, float:-1.29543515E26)
                    r14.W(r3)
                    nI.l<uk.w, XH.N> r3 = r0.f103730b
                    boolean r3 = r14.V(r3)
                    nI.l<uk.w, XH.N> r4 = r0.f103730b
                    java.lang.Object r5 = r16.D()
                    if (r3 != 0) goto L_0x00d0
                    U0.m$a r3 = U0.C4889m.f14007a
                    java.lang.Object r3 = r3.a()
                    if (r5 != r3) goto L_0x00d8
                L_0x00d0:
                    uk.w1 r5 = new uk.w1
                    r5.<init>(r4)
                    r14.u(r5)
                L_0x00d8:
                    r3 = r5
                    nI.a r3 = (nI.C17631a) r3
                    r16.P()
                    r5 = 0
                    r6 = 0
                    r4 = r16
                    uk.s1.X0(r1, r2, r3, r4, r5, r6)
                    r16.P()
                    goto L_0x00fa
                L_0x00e9:
                    pk.j$a r2 = pk.j.a.f100957a
                    boolean r1 = kotlin.jvm.internal.C17542s.e(r1, r2)
                    if (r1 == 0) goto L_0x0104
                    r1 = 1878409736(0x6ff64208, float:1.5242628E29)
                    r14.W(r1)
                    r16.P()
                L_0x00fa:
                    boolean r1 = U0.C4895p.J()
                    if (r1 == 0) goto L_0x0103
                    U0.C4895p.R()
                L_0x0103:
                    return
                L_0x0104:
                    r1 = -355078527(0xffffffffead5ee81, float:-1.2931375E26)
                    r14.W(r1)
                    r16.P()
                    XH.t r1 = new XH.t
                    r1.<init>()
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: uk.s1.m.b.c(U0.m, int):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                c((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements q<C5834E, C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ T0.c f103732a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C5974I f103733b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C5859e f103734c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ float f103735d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ s f103736e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ boolean f103737f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ long f103738g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ C17642l<C12056w, C16807N> f103739h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ C17642l<pk.l, C16807N> f103740i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ C17642l<r, C16807N> f103741j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ C17642l<pk.l, C16807N> f103742k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ C17642l<pk.l, C16807N> f103743l;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ C17642l<pk.l, C16807N> f103744m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ A1<Float> f103745n;

            c(T0.c cVar, C5974I i10, C5859e eVar, float f10, s sVar, boolean z10, long j10, C17642l<? super C12056w, C16807N> lVar, C17642l<? super pk.l, C16807N> lVar2, C17642l<? super r, C16807N> lVar3, C17642l<? super pk.l, C16807N> lVar4, C17642l<? super pk.l, C16807N> lVar5, C17642l<? super pk.l, C16807N> lVar6, A1<Float> a12) {
                this.f103732a = cVar;
                this.f103733b = i10;
                this.f103734c = eVar;
                this.f103735d = f10;
                this.f103736e = sVar;
                this.f103737f = z10;
                this.f103738g = j10;
                this.f103739h = lVar;
                this.f103740i = lVar2;
                this.f103741j = lVar3;
                this.f103742k = lVar4;
                this.f103743l = lVar5;
                this.f103744m = lVar6;
                this.f103745n = a12;
            }

            /* access modifiers changed from: private */
            public static final C16807N c(C5859e eVar, float f10, s sVar, boolean z10, long j10, int i10, T0.c cVar, C5974I i11, C17642l lVar, C17642l lVar2, C17642l lVar3, C17642l lVar4, C17642l lVar5, C17642l lVar6, A1 a12, C5968C c10) {
                androidx.compose.ui.d dVar;
                C17542s.j(c10, "$this$LazyVerticalGrid");
                long b10 = c2.i.b(eVar.c(), f10);
                String l10 = sVar.l();
                boolean p10 = sVar.p();
                if (z10) {
                    dVar = s1.l3(androidx.compose.ui.d.f18749a, s1.E2(a12), j10, j10, s1.g3());
                } else {
                    dVar = androidx.compose.ui.d.f18749a;
                }
                C5968C c11 = c10;
                s1.e3(c11, b10, l10, p10, z10, i10, dVar);
                C12180x.k(c11, sVar, i10, j10, eVar.c(), cVar, i11, lVar, lVar2, lVar3, lVar4, lVar5, lVar6);
                return C16807N.f139792a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: uk.x1} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: uk.x1} */
            /* JADX WARNING: type inference failed for: r0v2 */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void b(s0.C5834E r31, U0.C4889m r32, int r33) {
                /*
                    r30 = this;
                    r0 = r30
                    r1 = r31
                    r11 = r32
                    java.lang.String r2 = "paddingValues"
                    kotlin.jvm.internal.C17542s.j(r1, r2)
                    r2 = r33 & 6
                    r3 = 2
                    if (r2 != 0) goto L_0x001c
                    boolean r2 = r11.V(r1)
                    if (r2 == 0) goto L_0x0018
                    r2 = 4
                    goto L_0x0019
                L_0x0018:
                    r2 = r3
                L_0x0019:
                    r2 = r33 | r2
                    goto L_0x001e
                L_0x001c:
                    r2 = r33
                L_0x001e:
                    r4 = r2 & 19
                    r5 = 18
                    if (r4 != r5) goto L_0x0030
                    boolean r4 = r32.l()
                    if (r4 != 0) goto L_0x002b
                    goto L_0x0030
                L_0x002b:
                    r32.L()
                    goto L_0x014c
                L_0x0030:
                    boolean r4 = U0.C4895p.J()
                    if (r4 == 0) goto L_0x003f
                    r4 = -1
                    java.lang.String r5 = "com.ingka.ikea.app.shoppinglist.listdetails.ui.ShoppingListDetailsScreenUi.<anonymous>.<anonymous> (ShoppingListDetailsScreen.kt:475)"
                    r6 = 1863016266(0x6f0b5f4a, float:4.3133614E28)
                    U0.C4895p.S(r6, r2, r4, r5)
                L_0x003f:
                    T0.c r2 = r0.f103732a
                    int r2 = r2.b()
                    boolean r2 = Xo.g.a(r2)
                    if (r2 == 0) goto L_0x0058
                    T0.c r2 = r0.f103732a
                    int r2 = r2.a()
                    boolean r2 = Xo.g.c(r2)
                    if (r2 == 0) goto L_0x0058
                    r3 = 3
                L_0x0058:
                    u0.b$a r2 = new u0.b$a
                    r2.<init>(r3)
                    androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
                    r5 = 1
                    r6 = 0
                    r7 = 0
                    androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.f(r4, r7, r5, r6)
                    androidx.compose.ui.d r4 = androidx.compose.foundation.layout.D.h(r4, r1)
                    u0.I r5 = r0.f103733b
                    r1 = -355030682(0xffffffffead6a966, float:-1.2975504E26)
                    r11.W(r1)
                    s0.e r1 = r0.f103734c
                    boolean r1 = r11.V(r1)
                    float r6 = r0.f103735d
                    boolean r6 = r11.c(r6)
                    r1 = r1 | r6
                    pk.s r6 = r0.f103736e
                    boolean r6 = r11.F(r6)
                    r1 = r1 | r6
                    boolean r6 = r0.f103737f
                    boolean r6 = r11.b(r6)
                    r1 = r1 | r6
                    long r6 = r0.f103738g
                    boolean r6 = r11.e(r6)
                    r1 = r1 | r6
                    boolean r6 = r11.d(r3)
                    r1 = r1 | r6
                    T0.c r6 = r0.f103732a
                    boolean r6 = r11.V(r6)
                    r1 = r1 | r6
                    u0.I r6 = r0.f103733b
                    boolean r6 = r11.V(r6)
                    r1 = r1 | r6
                    nI.l<uk.w, XH.N> r6 = r0.f103739h
                    boolean r6 = r11.V(r6)
                    r1 = r1 | r6
                    nI.l<pk.l, XH.N> r6 = r0.f103740i
                    boolean r6 = r11.V(r6)
                    r1 = r1 | r6
                    nI.l<pk.r, XH.N> r6 = r0.f103741j
                    boolean r6 = r11.V(r6)
                    r1 = r1 | r6
                    nI.l<pk.l, XH.N> r6 = r0.f103742k
                    boolean r6 = r11.V(r6)
                    r1 = r1 | r6
                    nI.l<pk.l, XH.N> r6 = r0.f103743l
                    boolean r6 = r11.V(r6)
                    r1 = r1 | r6
                    nI.l<pk.l, XH.N> r6 = r0.f103744m
                    boolean r6 = r11.V(r6)
                    r1 = r1 | r6
                    s0.e r13 = r0.f103734c
                    float r14 = r0.f103735d
                    pk.s r15 = r0.f103736e
                    boolean r6 = r0.f103737f
                    long r7 = r0.f103738g
                    T0.c r9 = r0.f103732a
                    u0.I r10 = r0.f103733b
                    nI.l<uk.w, XH.N> r12 = r0.f103739h
                    r31 = r5
                    nI.l<pk.l, XH.N> r5 = r0.f103740i
                    r33 = r4
                    nI.l<pk.r, XH.N> r4 = r0.f103741j
                    r29 = r2
                    nI.l<pk.l, XH.N> r2 = r0.f103742k
                    nI.l<pk.l, XH.N> r11 = r0.f103743l
                    r26 = r11
                    nI.l<pk.l, XH.N> r11 = r0.f103744m
                    r27 = r11
                    U0.A1<java.lang.Float> r11 = r0.f103745n
                    java.lang.Object r0 = r32.D()
                    if (r1 != 0) goto L_0x0109
                    U0.m$a r1 = U0.C4889m.f14007a
                    java.lang.Object r1 = r1.a()
                    if (r0 != r1) goto L_0x0106
                    goto L_0x0109
                L_0x0106:
                    r11 = r32
                    goto L_0x0129
                L_0x0109:
                    uk.x1 r0 = new uk.x1
                    r1 = r12
                    r12 = r0
                    r16 = r6
                    r17 = r7
                    r19 = r3
                    r20 = r9
                    r21 = r10
                    r22 = r1
                    r23 = r5
                    r24 = r4
                    r25 = r2
                    r28 = r11
                    r12.<init>(r13, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
                    r11 = r32
                    r11.u(r0)
                L_0x0129:
                    r10 = r0
                    nI.l r10 = (nI.C17642l) r10
                    r32.P()
                    r12 = 0
                    r13 = 504(0x1f8, float:7.06E-43)
                    r4 = 0
                    r5 = 0
                    r6 = 0
                    r7 = 0
                    r8 = 0
                    r9 = 0
                    r1 = r29
                    r2 = r33
                    r3 = r31
                    r11 = r32
                    u0.C5984h.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                    boolean r0 = U0.C4895p.J()
                    if (r0 == 0) goto L_0x014c
                    U0.C4895p.R()
                L_0x014c:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: uk.s1.m.c.b(s0.E, U0.m, int):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((C5834E) obj, (C4889m) obj2, ((Number) obj3).intValue());
                return C16807N.f139792a;
            }
        }

        m(int i10, s sVar, boolean z10, boolean z11, C17642l<? super C12056w, C16807N> lVar, C17631a<C16807N> aVar, L0 l02, T0.c cVar, C5974I i11, long j10, C17642l<? super pk.l, C16807N> lVar2, C17642l<? super r, C16807N> lVar3, C17642l<? super pk.l, C16807N> lVar4, C17642l<? super pk.l, C16807N> lVar5, C17642l<? super pk.l, C16807N> lVar6, A1<Float> a12) {
            this.f103712a = i10;
            this.f103713b = sVar;
            this.f103714c = z10;
            this.f103715d = z11;
            this.f103716e = lVar;
            this.f103717f = aVar;
            this.f103718g = l02;
            this.f103719h = cVar;
            this.f103720i = i11;
            this.f103721j = j10;
            this.f103722k = lVar2;
            this.f103723l = lVar3;
            this.f103724m = lVar4;
            this.f103725n = lVar5;
            this.f103726o = lVar6;
            this.f103727p = a12;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(C17642l lVar) {
            lVar.invoke(C12056w.f.f103795a);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(C17642l lVar) {
            lVar.invoke(C12056w.s.f103809a);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(s0.C5859e r26, U0.C4889m r27, int r28) {
            /*
                r25 = this;
                r0 = r25
                r15 = r26
                r14 = r27
                java.lang.String r1 = "$this$BoxWithConstraints"
                kotlin.jvm.internal.C17542s.j(r15, r1)
                r1 = r28 & 6
                if (r1 != 0) goto L_0x001b
                boolean r1 = r14.V(r15)
                if (r1 == 0) goto L_0x0017
                r1 = 4
                goto L_0x0018
            L_0x0017:
                r1 = 2
            L_0x0018:
                r1 = r28 | r1
                goto L_0x001d
            L_0x001b:
                r1 = r28
            L_0x001d:
                r2 = r1 & 19
                r3 = 18
                if (r2 != r3) goto L_0x0030
                boolean r2 = r27.l()
                if (r2 != 0) goto L_0x002a
                goto L_0x0030
            L_0x002a:
                r27.L()
                r13 = r0
                goto L_0x01db
            L_0x0030:
                boolean r2 = U0.C4895p.J()
                if (r2 == 0) goto L_0x003f
                r2 = -1
                java.lang.String r3 = "com.ingka.ikea.app.shoppinglist.listdetails.ui.ShoppingListDetailsScreenUi.<anonymous> (ShoppingListDetailsScreen.kt:438)"
                r4 = -594446213(0xffffffffdc91787b, float:-3.2757073E17)
                U0.C4895p.S(r4, r1, r2, r3)
            L_0x003f:
                float r1 = r26.d()
                int r2 = r0.f103712a
                boolean r2 = Xo.g.b(r2)
                r17 = 1072064102(0x3fe66666, float:1.8)
                if (r2 == 0) goto L_0x0051
                r2 = r17
                goto L_0x0053
            L_0x0051:
                r2 = 1077936128(0x40400000, float:3.0)
            L_0x0053:
                float r1 = r1 / r2
                float r5 = c2.h.B(r1)
                r13 = 0
                float r1 = (float) r13
                float r6 = c2.h.B(r1)
                r10 = 14
                r11 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                s0.T r18 = s0.C5850V.c(r6, r7, r8, r9, r10, r11)
                pk.s r1 = r0.f103713b
                pk.j r1 = r1.j()
                pk.j$b r2 = pk.j.b.f100958a
                boolean r2 = kotlin.jvm.internal.C17542s.e(r1, r2)
                if (r2 == 0) goto L_0x007f
                O0.O$a r1 = O0.O.f9935a
                int r1 = r1.b()
            L_0x007c:
                r19 = r1
                goto L_0x009d
            L_0x007f:
                pk.j$c r2 = pk.j.c.f100959a
                boolean r2 = kotlin.jvm.internal.C17542s.e(r1, r2)
                if (r2 != 0) goto L_0x0096
                pk.j$a r2 = pk.j.a.f100957a
                boolean r1 = kotlin.jvm.internal.C17542s.e(r1, r2)
                if (r1 == 0) goto L_0x0090
                goto L_0x0096
            L_0x0090:
                XH.t r1 = new XH.t
                r1.<init>()
                throw r1
            L_0x0096:
                O0.O$a r1 = O0.O.f9935a
                int r1 = r1.a()
                goto L_0x007c
            L_0x009d:
                uk.s1$m$a r1 = new uk.s1$m$a
                O0.L0 r2 = r0.f103718g
                r1.<init>(r2)
                r2 = -334705215(0xffffffffec0ccdc1, float:-6.8088504E26)
                r12 = 1
                r11 = 54
                c1.a r20 = c1.c.e(r2, r12, r1, r14, r11)
                uk.s1$m$b r1 = new uk.s1$m$b
                pk.s r2 = r0.f103713b
                nI.l<uk.w, XH.N> r3 = r0.f103716e
                r1.<init>(r2, r3, r15)
                r2 = 1247646850(0x4a5d9482, float:3630368.5)
                c1.a r21 = c1.c.e(r2, r12, r1, r14, r11)
                uk.s1$m$c r10 = new uk.s1$m$c
                T0.c r2 = r0.f103719h
                u0.I r3 = r0.f103720i
                pk.s r6 = r0.f103713b
                boolean r7 = r0.f103715d
                long r8 = r0.f103721j
                nI.l<uk.w, XH.N> r4 = r0.f103716e
                nI.l<pk.l, XH.N> r1 = r0.f103722k
                nI.l<pk.r, XH.N> r12 = r0.f103723l
                nI.l<pk.l, XH.N> r13 = r0.f103724m
                nI.l<pk.l, XH.N> r14 = r0.f103725n
                nI.l<pk.l, XH.N> r15 = r0.f103726o
                r22 = r15
                U0.A1<java.lang.Float> r15 = r0.f103727p
                r23 = r1
                r1 = r10
                r24 = r4
                r4 = r26
                r0 = r10
                r10 = r24
                r11 = r23
                r16 = r15
                r15 = r22
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16)
                r1 = 1863016266(0x6f0b5f4a, float:4.3133614E28)
                r15 = r27
                r2 = 1
                r3 = 54
                c1.a r12 = c1.c.e(r1, r2, r0, r15, r3)
                r14 = 805334016(0x30006c00, float:4.6719606E-10)
                r0 = 199(0xc7, float:2.79E-43)
                r1 = 0
                r2 = 0
                r3 = 0
                r7 = 0
                r9 = 0
                r4 = r20
                r5 = r21
                r6 = r19
                r11 = r18
                r13 = r27
                r15 = r0
                O0.C4762x0.a(r1, r2, r3, r4, r5, r6, r7, r9, r11, r12, r13, r14, r15)
                androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
                i1.c$a r11 = i1.C5437c.f24302a
                i1.c r1 = r11.m()
                r12 = r26
                androidx.compose.ui.d r6 = r12.a(r0, r1)
                r13 = r25
                boolean r1 = r13.f103714c
                boolean r3 = r13.f103715d
                r2 = -2134178926(0xffffffff80cb0392, float:-1.8643887E-38)
                r14 = r27
                r14.W(r2)
                nI.l<uk.w, XH.N> r2 = r13.f103716e
                boolean r2 = r14.V(r2)
                nI.l<uk.w, XH.N> r4 = r13.f103716e
                java.lang.Object r5 = r27.D()
                if (r2 != 0) goto L_0x0145
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r5 != r2) goto L_0x014d
            L_0x0145:
                uk.t1 r5 = new uk.t1
                r5.<init>(r4)
                r14.u(r5)
            L_0x014d:
                r4 = r5
                nI.a r4 = (nI.C17631a) r4
                r27.P()
                r2 = -2134176042(0xffffffff80cb0ed6, float:-1.8647928E-38)
                r14.W(r2)
                nI.l<uk.w, XH.N> r2 = r13.f103716e
                boolean r2 = r14.V(r2)
                nI.l<uk.w, XH.N> r5 = r13.f103716e
                java.lang.Object r7 = r27.D()
                if (r2 != 0) goto L_0x016f
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r7 != r2) goto L_0x0177
            L_0x016f:
                uk.u1 r7 = new uk.u1
                r7.<init>(r5)
                r14.u(r7)
            L_0x0177:
                r5 = r7
                nI.a r5 = (nI.C17631a) r5
                r27.P()
                nI.a<XH.N> r7 = r13.f103717f
                r9 = 0
                r10 = 0
                r2 = r3
                r8 = r27
                uk.s1.O0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r1 = -2134171518(0xffffffff80cb2082, float:-1.8654267E-38)
                r14.W(r1)
                pk.s r1 = r13.f103713b
                boolean r1 = r1.E()
                if (r1 == 0) goto L_0x01bb
                float r1 = r26.d()
                int r2 = r13.f103712a
                boolean r2 = Xo.g.b(r2)
                if (r2 == 0) goto L_0x01a2
                goto L_0x01a4
            L_0x01a2:
                r17 = 1073741824(0x40000000, float:2.0)
            L_0x01a4:
                float r1 = r1 / r17
                float r1 = c2.h.B(r1)
                androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.i(r0, r1)
                i1.c r2 = r11.b()
                androidx.compose.ui.d r1 = r12.a(r1, r2)
                r2 = 0
                uk.s1.V0(r1, r14, r2, r2)
                goto L_0x01bc
            L_0x01bb:
                r2 = 0
            L_0x01bc:
                r27.P()
                pk.s r1 = r13.f103713b
                boolean r1 = r1.i()
                if (r1 == 0) goto L_0x01d2
                i1.c r1 = r11.b()
                androidx.compose.ui.d r0 = r12.a(r0, r1)
                wl.C12279b.b(r0, r14, r2, r2)
            L_0x01d2:
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x01db
                U0.C4895p.R()
            L_0x01db:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: uk.s1.m.c(s0.e, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            c((C5859e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class n implements q<C5991o, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f103746a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f103747b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f103748c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f103749d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f103750e;

        n(boolean z10, boolean z11, long j10, androidx.compose.ui.d dVar, String str) {
            this.f103746a = z10;
            this.f103747b = z11;
            this.f103748c = j10;
            this.f103749d = dVar;
            this.f103750e = str;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(float f10, androidx.compose.ui.graphics.c cVar) {
            C17542s.j(cVar, "$this$graphicsLayer");
            cVar.e(cVar.H1(s1.g3()));
            cVar.m(f10);
            cVar.g(f10);
            return C16807N.f139792a;
        }

        public final void b(C5991o oVar, C4889m mVar, int i10) {
            d.a aVar;
            C5079j jVar;
            float f10;
            C4889m mVar2 = mVar;
            int i11 = i10;
            C17542s.j(oVar, "$this$item");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1975724619, i11, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.backLayerContent.<anonymous> (ShoppingListDetailsScreen.kt:738)");
                }
                mVar2.W(546404094);
                if (this.f103746a || this.f103747b) {
                    mVar.P();
                    d.a aVar2 = androidx.compose.ui.d.f18749a;
                    androidx.compose.ui.d s10 = J.u(aVar2, this.f103748c).s(this.f103749d);
                    long j10 = this.f103748c;
                    boolean z10 = this.f103747b;
                    String str = this.f103750e;
                    C5437c.a aVar3 = C5437c.f24302a;
                    I h10 = C5077h.h(aVar3.o(), false);
                    int a10 = C4883j.a(mVar2, 0);
                    C4912y s11 = mVar.s();
                    androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar2, s10);
                    C4504g.a aVar4 = C4504g.f6515W;
                    C17631a<C4504g> a11 = aVar4.a();
                    if (mVar.m() == null) {
                        C4883j.c();
                    }
                    mVar.I();
                    if (mVar.i()) {
                        mVar2.p(a11);
                    } else {
                        mVar.t();
                    }
                    C4889m a12 = F1.a(mVar);
                    F1.c(a12, h10, aVar4.c());
                    F1.c(a12, s11, aVar4.e());
                    p<C4504g, Integer, C16807N> b10 = aVar4.b();
                    if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                        a12.u(Integer.valueOf(a10));
                        a12.w(Integer.valueOf(a10), b10);
                    }
                    F1.c(a12, e10, aVar4.d());
                    C5079j jVar2 = C5079j.f18125a;
                    float f11 = (float) 2;
                    float B10 = c2.h.B(c2.k.g(j10) + c2.h.B(s1.g3() * f11)) / c2.k.g(j10);
                    long O10 = ((c2.d) mVar2.Q(C5100f0.e())).O(j10);
                    if (z10) {
                        mVar2.W(16099749);
                        C5077h.a(androidx.compose.foundation.b.d(J.f(aVar2, 0.0f, 1, (Object) null), C18030v.f147664a.a(mVar2, C18030v.f147665b).m0(), (i1) null, 2, (Object) null), mVar2, 0);
                        mVar.P();
                        f10 = f11;
                        jVar = jVar2;
                        aVar = aVar2;
                    } else {
                        mVar2.W(16330296);
                        if (C5673m.i(O10) <= 0.0f || C5673m.l(O10) <= 0.0f) {
                            f10 = f11;
                            jVar = jVar2;
                            aVar = aVar2;
                        } else {
                            String str2 = str == null ? "" : str;
                            androidx.compose.ui.d f12 = J.f(aVar2, 0.0f, 1, (Object) null);
                            mVar2.W(-1800578579);
                            boolean c10 = mVar2.c(B10);
                            Object D10 = mVar.D();
                            if (c10 || D10 == C4889m.f14007a.a()) {
                                D10 = new y1(B10);
                                mVar2.u(D10);
                            }
                            mVar.P();
                            f10 = f11;
                            jVar = jVar2;
                            aVar = aVar2;
                            LC.h.c(str2, (String) null, androidx.compose.ui.graphics.b.a(f12, (C17642l) D10), (C13178b) null, new e.b((int) (C5673m.l(O10) * B10), (int) (C5673m.i(O10) * B10)), C4478k.f5915a.a(), (C5437c) null, (C17642l<? super e.c, C16807N>) null, false, false, (q<? super C5857c, ? super C4889m, ? super Integer, C16807N>) null, (q<? super C5857c, ? super C4889m, ? super Integer, C16807N>) null, mVar, (e.b.f97961c << 12) | 196656, 0, 4040);
                        }
                        mVar.P();
                    }
                    d.a aVar5 = aVar;
                    C4889m mVar3 = mVar;
                    C5077h.a(jVar.a(androidx.compose.foundation.b.d(J.i(J.h(A.c(aVar5, 0.0f, c2.h.B(s1.g3() * f10), 1, (Object) null), 0.0f, 1, (Object) null), s1.g3()), C18030v.f147664a.a(mVar3, C18030v.f147665b).k0(), (i1) null, 2, (Object) null), aVar3.b()), mVar3, 0);
                    s1.T0(J.f(aVar5, 0.0f, 1, (Object) null), mVar3, 6, 0);
                    mVar.x();
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                C5077h.a(androidx.compose.ui.d.f18749a, mVar2, 6);
                if (C4895p.J()) {
                    C4895p.R();
                }
                mVar.P();
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5991o) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.ui.ShoppingListDetailsScreenKt$rememberIsBackLayerHidden$1$1", f = "ShoppingListDetailsScreen.kt", l = {880}, m = "invokeSuspend")
    static final class o extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f103751c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5974I f103752d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f103753e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C5974I f103754a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C4899r0<Boolean> f103755b;

            a(C5974I i10, C4899r0<Boolean> r0Var) {
                this.f103754a = i10;
                this.f103755b = r0Var;
            }

            public final Object c(int i10, C17164e<? super C16807N> eVar) {
                boolean isEmpty = this.f103754a.v().i().isEmpty();
                C4899r0<Boolean> r0Var = this.f103755b;
                s1.k3(r0Var, isEmpty ? s1.j3(r0Var) : i10 != 0);
                return C16807N.f139792a;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                return c(((Number) obj).intValue(), eVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(C5974I i10, C4899r0<Boolean> r0Var, C17164e<? super o> eVar) {
            super(2, eVar);
            this.f103752d = i10;
            this.f103753e = r0Var;
        }

        /* access modifiers changed from: private */
        public static final int j(C5974I i10) {
            return i10.r();
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new o(this.f103752d, this.f103753e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((o) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f103751c;
            if (i10 == 0) {
                y.b(obj);
                C16532g r10 = p1.r(new z1(this.f103752d));
                a aVar = new a(this.f103752d, this.f103753e);
                this.f103751c = 1;
                if (r10.collect(aVar, this) == f10) {
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

    /* access modifiers changed from: private */
    public static final C16807N A1(s sVar, T0.c cVar, C17642l lVar, C17642l lVar2, boolean z10, int i10, C4889m mVar, int i11) {
        b1(sVar, cVar, lVar, lVar2, z10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N A2(C17642l lVar) {
        lVar.invoke(C11724c.O.f100907a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C4899r0 B1() {
        return u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N B2(C17642l lVar) {
        lVar.invoke(C11724c.M.f100905a);
        return C16807N.f139792a;
    }

    private static final boolean C1(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: nI.a} */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0210, code lost:
        if (r11 == r18.a()) goto L_0x0215;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void C2(pk.s r35, T0.c r36, boolean r37, nI.C17642l<? super uk.C12056w, XH.C16807N> r38, nI.C17631a<XH.C16807N> r39, nI.C17642l<? super pk.l, XH.C16807N> r40, nI.C17642l<? super pk.l, XH.C16807N> r41, nI.C17642l<? super pk.r, XH.C16807N> r42, nI.C17631a<XH.C16807N> r43, nI.C17631a<XH.C16807N> r44, nI.C17631a<XH.C16807N> r45, nI.C17642l<? super pk.l, XH.C16807N> r46, nI.C17642l<? super java.lang.String, XH.C16807N> r47, nI.C17631a<XH.C16807N> r48, nI.C17642l<? super pk.l, XH.C16807N> r49, U0.C4889m r50, int r51, int r52) {
        /*
            r15 = r38
            r14 = r48
            r13 = r51
            r12 = r52
            r0 = -107534939(0xfffffffff99725a5, float:-9.810004E34)
            r1 = r50
            U0.m r10 = r1.k(r0)
            r1 = r13 & 6
            r11 = r35
            if (r1 != 0) goto L_0x0022
            boolean r1 = r10.F(r11)
            if (r1 == 0) goto L_0x001f
            r1 = 4
            goto L_0x0020
        L_0x001f:
            r1 = 2
        L_0x0020:
            r1 = r1 | r13
            goto L_0x0023
        L_0x0022:
            r1 = r13
        L_0x0023:
            r4 = r13 & 48
            r5 = 16
            r6 = 32
            r9 = r36
            if (r4 != 0) goto L_0x0037
            boolean r4 = r10.V(r9)
            if (r4 == 0) goto L_0x0035
            r4 = r6
            goto L_0x0036
        L_0x0035:
            r4 = r5
        L_0x0036:
            r1 = r1 | r4
        L_0x0037:
            r4 = r13 & 384(0x180, float:5.38E-43)
            r7 = 128(0x80, float:1.794E-43)
            r8 = 256(0x100, float:3.59E-43)
            if (r4 != 0) goto L_0x004f
            r4 = r37
            boolean r16 = r10.b(r4)
            if (r16 == 0) goto L_0x004a
            r16 = r8
            goto L_0x004c
        L_0x004a:
            r16 = r7
        L_0x004c:
            r1 = r1 | r16
            goto L_0x0051
        L_0x004f:
            r4 = r37
        L_0x0051:
            r2 = r13 & 3072(0xc00, float:4.305E-42)
            r16 = 1024(0x400, float:1.435E-42)
            if (r2 != 0) goto L_0x0063
            boolean r2 = r10.F(r15)
            if (r2 == 0) goto L_0x0060
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0062
        L_0x0060:
            r2 = r16
        L_0x0062:
            r1 = r1 | r2
        L_0x0063:
            r2 = r13 & 24576(0x6000, float:3.4438E-41)
            r18 = 8192(0x2000, float:1.14794E-41)
            r19 = 16384(0x4000, float:2.2959E-41)
            if (r2 != 0) goto L_0x007b
            r2 = r39
            boolean r20 = r10.F(r2)
            if (r20 == 0) goto L_0x0076
            r20 = r19
            goto L_0x0078
        L_0x0076:
            r20 = r18
        L_0x0078:
            r1 = r1 | r20
            goto L_0x007d
        L_0x007b:
            r2 = r39
        L_0x007d:
            r20 = 196608(0x30000, float:2.75506E-40)
            r20 = r13 & r20
            r3 = r40
            if (r20 != 0) goto L_0x0092
            boolean r21 = r10.F(r3)
            if (r21 == 0) goto L_0x008e
            r21 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0090
        L_0x008e:
            r21 = 65536(0x10000, float:9.18355E-41)
        L_0x0090:
            r1 = r1 | r21
        L_0x0092:
            r21 = 1572864(0x180000, float:2.204052E-39)
            r21 = r13 & r21
            r0 = r41
            if (r21 != 0) goto L_0x00a7
            boolean r22 = r10.F(r0)
            if (r22 == 0) goto L_0x00a3
            r22 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00a5
        L_0x00a3:
            r22 = 524288(0x80000, float:7.34684E-40)
        L_0x00a5:
            r1 = r1 | r22
        L_0x00a7:
            r22 = 12582912(0xc00000, float:1.7632415E-38)
            r22 = r13 & r22
            r11 = r42
            if (r22 != 0) goto L_0x00bc
            boolean r22 = r10.F(r11)
            if (r22 == 0) goto L_0x00b8
            r22 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ba
        L_0x00b8:
            r22 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ba:
            r1 = r1 | r22
        L_0x00bc:
            r22 = 100663296(0x6000000, float:2.4074124E-35)
            r22 = r13 & r22
            r11 = r43
            if (r22 != 0) goto L_0x00d1
            boolean r22 = r10.F(r11)
            if (r22 == 0) goto L_0x00cd
            r22 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00cf
        L_0x00cd:
            r22 = 33554432(0x2000000, float:9.403955E-38)
        L_0x00cf:
            r1 = r1 | r22
        L_0x00d1:
            r22 = 805306368(0x30000000, float:4.656613E-10)
            r22 = r13 & r22
            r13 = r44
            if (r22 != 0) goto L_0x00e6
            boolean r22 = r10.F(r13)
            if (r22 == 0) goto L_0x00e2
            r22 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x00e4
        L_0x00e2:
            r22 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x00e4:
            r1 = r1 | r22
        L_0x00e6:
            r22 = r12 & 6
            r13 = r45
            if (r22 != 0) goto L_0x00fa
            boolean r22 = r10.F(r13)
            if (r22 == 0) goto L_0x00f5
            r22 = 4
            goto L_0x00f7
        L_0x00f5:
            r22 = 2
        L_0x00f7:
            r22 = r12 | r22
            goto L_0x00fc
        L_0x00fa:
            r22 = r12
        L_0x00fc:
            r23 = r12 & 48
            r13 = r46
            if (r23 != 0) goto L_0x010b
            boolean r23 = r10.F(r13)
            if (r23 == 0) goto L_0x0109
            r5 = r6
        L_0x0109:
            r22 = r22 | r5
        L_0x010b:
            r5 = r12 & 384(0x180, float:5.38E-43)
            r6 = r47
            if (r5 != 0) goto L_0x011a
            boolean r5 = r10.F(r6)
            if (r5 == 0) goto L_0x0118
            r7 = r8
        L_0x0118:
            r22 = r22 | r7
        L_0x011a:
            r5 = r12 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x0128
            boolean r5 = r10.F(r14)
            if (r5 == 0) goto L_0x0126
            r16 = 2048(0x800, float:2.87E-42)
        L_0x0126:
            r22 = r22 | r16
        L_0x0128:
            r5 = r12 & 24576(0x6000, float:3.4438E-41)
            r8 = r49
            if (r5 != 0) goto L_0x0138
            boolean r5 = r10.F(r8)
            if (r5 == 0) goto L_0x0136
            r18 = r19
        L_0x0136:
            r22 = r22 | r18
        L_0x0138:
            r7 = r22
            r5 = 306783379(0x12492493, float:6.34695E-28)
            r5 = r5 & r1
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r5 != r0) goto L_0x0157
            r0 = r7 & 9363(0x2493, float:1.312E-41)
            r5 = 9362(0x2492, float:1.3119E-41)
            if (r0 != r5) goto L_0x0157
            boolean r0 = r10.l()
            if (r0 != 0) goto L_0x0150
            goto L_0x0157
        L_0x0150:
            r10.L()
            r8 = r10
            r12 = r15
            goto L_0x0437
        L_0x0157:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0165
            java.lang.String r0 = "com.ingka.ikea.app.shoppinglist.listdetails.ui.ShoppingListDetailsScreenUi (ShoppingListDetailsScreen.kt:419)"
            r5 = -107534939(0xfffffffff99725a5, float:-9.810004E34)
            U0.C4895p.S(r5, r1, r7, r0)
        L_0x0165:
            int r5 = r36.b()
            boolean r0 = r35.k()
            r50 = r0
            r0 = -1860644422(0xffffffff9118d1ba, float:-1.2055313E-28)
            r10.W(r0)
            java.lang.Object r0 = r10.D()
            U0.m$a r18 = U0.C4889m.f14007a
            java.lang.Object r2 = r18.a()
            if (r0 != r2) goto L_0x0189
            O0.L0 r0 = new O0.L0
            r0.<init>()
            r10.u(r0)
        L_0x0189:
            r2 = r0
            O0.L0 r2 = (O0.L0) r2
            r10.P()
            r0 = 0
            r14 = 3
            u0.I r13 = u0.C5975J.b(r0, r0, r10, r0, r14)
            boolean r14 = h3(r13, r10, r0)
            r0 = -1860638246(0xffffffff9118e9da, float:-1.2062747E-28)
            r10.W(r0)
            java.lang.Object r0 = r10.D()
            r21 = r2
            java.lang.Object r2 = r18.a()
            if (r0 != r2) goto L_0x01b7
            uk.N0 r0 = new uk.N0
            r0.<init>(r13)
            U0.A1 r0 = U0.p1.e(r0)
            r10.u(r0)
        L_0x01b7:
            r22 = r0
            U0.A1 r22 = (U0.A1) r22
            r10.P()
            tK.v r0 = tK.C18030v.f147664a
            int r2 = tK.C18030v.f147665b
            tK.h r0 = r0.a(r10, r2)
            long r23 = r0.k0()
            r0 = -1860632645(0xffffffff9118ffbb, float:-1.2069489E-28)
            r10.W(r0)
            java.lang.Object r0 = r10.D()
            java.lang.Object r2 = r18.a()
            r12 = 0
            if (r0 != r2) goto L_0x01e5
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2 = 2
            U0.r0 r0 = U0.u1.e(r0, r12, r2, r12)
            r10.u(r0)
        L_0x01e5:
            r2 = r0
            U0.r0 r2 = (U0.C4899r0) r2
            r10.P()
            boolean r0 = F2(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r12 = -1860630339(0xffffffff911908bd, float:-1.2072265E-28)
            r10.W(r12)
            r12 = r1 & 7168(0x1c00, float:1.0045E-41)
            r11 = 2048(0x800, float:2.87E-42)
            if (r12 != r11) goto L_0x0202
            r20 = 1
            goto L_0x0204
        L_0x0202:
            r20 = 0
        L_0x0204:
            java.lang.Object r11 = r10.D()
            if (r20 != 0) goto L_0x0213
            r20 = r1
            java.lang.Object r1 = r18.a()
            if (r11 != r1) goto L_0x021e
            goto L_0x0215
        L_0x0213:
            r20 = r1
        L_0x0215:
            uk.s1$l r11 = new uk.s1$l
            r1 = 0
            r11.<init>(r15, r2, r1)
            r10.u(r11)
        L_0x021e:
            nI.p r11 = (nI.p) r11
            r10.P()
            r1 = 0
            U0.P.g(r0, r11, r10, r1)
            r0 = -1860625986(0xffffffff911919be, float:-1.2077504E-28)
            r10.W(r0)
            java.lang.Object r0 = r10.D()
            java.lang.Object r11 = r18.a()
            if (r0 != r11) goto L_0x023f
            uk.O0 r0 = new uk.O0
            r0.<init>(r2)
            r10.u(r0)
        L_0x023f:
            nI.l r0 = (nI.C17642l) r0
            r10.P()
            r11 = 48
            vl.k.e(r13, r0, r10, r11)
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r1 = 0
            r27 = r12
            r11 = 1
            r12 = 0
            androidx.compose.ui.d r25 = androidx.compose.foundation.layout.J.d(r0, r1, r11, r12)
            uk.s1$m r1 = new uk.s1$m
            r0 = r1
            r28 = r1
            r19 = r20
            r1 = r5
            r20 = r2
            r5 = r21
            r2 = r35
            r3 = r14
            r4 = r50
            r5 = r38
            r6 = r39
            r29 = r7
            r7 = r21
            r8 = r36
            r9 = r13
            r30 = r10
            r26 = 48
            r10 = r23
            r23 = r12
            r31 = r27
            r12 = r41
            r24 = r13
            r13 = r42
            r32 = r14
            r27 = 3
            r14 = r46
            r15 = r40
            r16 = r49
            r17 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17)
            r0 = 54
            r1 = -594446213(0xffffffffdc91787b, float:-3.2757073E17)
            r2 = r28
            r8 = r30
            r9 = 1
            c1.a r4 = c1.c.e(r1, r9, r2, r8, r0)
            r6 = 3078(0xc06, float:4.313E-42)
            r7 = 6
            r2 = 0
            r3 = 0
            r1 = r25
            r5 = r8
            s0.C5858d.a(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = r35.p()
            r1 = r50
            r2 = r32
            r10 = 0
            L0(r2, r1, r0, r8, r10)
            pk.s$a r1 = r35.c()
            r0 = -1860467306(0xffffffff911b8596, float:-1.2268508E-28)
            r8.W(r0)
            r11 = r31
            r0 = 2048(0x800, float:2.87E-42)
            if (r11 != r0) goto L_0x02c6
            r2 = r9
            goto L_0x02c7
        L_0x02c6:
            r2 = r10
        L_0x02c7:
            java.lang.Object r3 = r8.D()
            if (r2 != 0) goto L_0x02d7
            java.lang.Object r2 = r18.a()
            if (r3 != r2) goto L_0x02d4
            goto L_0x02d7
        L_0x02d4:
            r12 = r38
            goto L_0x02e1
        L_0x02d7:
            uk.P0 r3 = new uk.P0
            r12 = r38
            r3.<init>(r12)
            r8.u(r3)
        L_0x02e1:
            r4 = r3
            nI.a r4 = (nI.C17631a) r4
            r8.P()
            int r7 = r19 >> 18
            r2 = r7 & 896(0x380, float:1.256E-42)
            r6 = r2 | 48
            r2 = r21
            r3 = r43
            r5 = r8
            vk.C12167q.c(r1, r2, r3, r4, r5, r6)
            pk.s$f r1 = r35.q()
            r2 = -1860460579(0xffffffff911b9fdd, float:-1.2276606E-28)
            r8.W(r2)
            if (r11 != r0) goto L_0x0303
            r2 = r9
            goto L_0x0304
        L_0x0303:
            r2 = r10
        L_0x0304:
            java.lang.Object r3 = r8.D()
            if (r2 != 0) goto L_0x0310
            java.lang.Object r2 = r18.a()
            if (r3 != r2) goto L_0x0318
        L_0x0310:
            uk.Q0 r3 = new uk.Q0
            r3.<init>(r12)
            r8.u(r3)
        L_0x0318:
            nI.l r3 = (nI.C17642l) r3
            r8.P()
            r2 = r7 & 7168(0x1c00, float:1.0045E-41)
            r6 = r2 | 48
            r2 = r21
            r4 = r44
            r5 = r8
            vk.I0.b(r1, r2, r3, r4, r5, r6)
            pk.s$i r1 = r35.x()
            boolean r2 = r1 instanceof pk.s.i.a
            if (r2 == 0) goto L_0x0334
            pk.s$i$a r1 = (pk.s.i.a) r1
            goto L_0x0336
        L_0x0334:
            r1 = r23
        L_0x0336:
            r13 = r29
            r2 = r13 & 896(0x380, float:1.256E-42)
            r2 = r2 | 48
            int r3 = r13 << 9
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r6 = r2 | r3
            r2 = r21
            r3 = r47
            r4 = r45
            r5 = r8
            vk.a1.c(r1, r2, r3, r4, r5, r6)
            pk.s$g r1 = r35.r()
            r2 = -1860442751(0xffffffff911be581, float:-1.2298065E-28)
            r8.W(r2)
            if (r11 != r0) goto L_0x035a
            r2 = r9
            goto L_0x035b
        L_0x035a:
            r2 = r10
        L_0x035b:
            java.lang.Object r3 = r8.D()
            if (r2 != 0) goto L_0x0367
            java.lang.Object r2 = r18.a()
            if (r3 != r2) goto L_0x036f
        L_0x0367:
            uk.R0 r3 = new uk.R0
            r3.<init>(r12)
            r8.u(r3)
        L_0x036f:
            nI.l r3 = (nI.C17642l) r3
            r8.P()
            r2 = -1860438594(0xffffffff911bf5be, float:-1.2303069E-28)
            r8.W(r2)
            if (r11 != r0) goto L_0x037e
            r2 = r9
            goto L_0x037f
        L_0x037e:
            r2 = r10
        L_0x037f:
            java.lang.Object r4 = r8.D()
            if (r2 != 0) goto L_0x038b
            java.lang.Object r2 = r18.a()
            if (r4 != r2) goto L_0x0393
        L_0x038b:
            uk.S0 r4 = new uk.S0
            r4.<init>(r12)
            r8.u(r4)
        L_0x0393:
            nI.l r4 = (nI.C17642l) r4
            r8.P()
            r2 = -1860434633(0xffffffff911c0537, float:-1.2307837E-28)
            r8.W(r2)
            if (r11 != r0) goto L_0x03a2
            r2 = r9
            goto L_0x03a3
        L_0x03a2:
            r2 = r10
        L_0x03a3:
            java.lang.Object r5 = r8.D()
            if (r2 != 0) goto L_0x03af
            java.lang.Object r2 = r18.a()
            if (r5 != r2) goto L_0x03b7
        L_0x03af:
            uk.T0 r5 = new uk.T0
            r5.<init>(r12)
            r8.u(r5)
        L_0x03b7:
            nI.a r5 = (nI.C17631a) r5
            r8.P()
            r7 = 48
            r2 = r21
            r6 = r8
            vk.K0.b(r1, r2, r3, r4, r5, r6, r7)
            r1 = -1860428077(0xffffffff911c1ed3, float:-1.2315729E-28)
            r8.W(r1)
            if (r11 != r0) goto L_0x03ce
            r1 = r9
            goto L_0x03cf
        L_0x03ce:
            r1 = r10
        L_0x03cf:
            java.lang.Object r2 = r8.D()
            if (r1 != 0) goto L_0x03db
            java.lang.Object r1 = r18.a()
            if (r2 != r1) goto L_0x03e3
        L_0x03db:
            uk.U0 r2 = new uk.U0
            r2.<init>(r12)
            r8.u(r2)
        L_0x03e3:
            nI.a r2 = (nI.C17631a) r2
            r8.P()
            boolean r4 = F2(r20)
            r1 = -1860422309(0xffffffff911c355b, float:-1.2322672E-28)
            r8.W(r1)
            if (r11 != r0) goto L_0x03f6
            r0 = r9
            goto L_0x03f7
        L_0x03f6:
            r0 = r10
        L_0x03f7:
            java.lang.Object r1 = r8.D()
            if (r0 != 0) goto L_0x0403
            java.lang.Object r0 = r18.a()
            if (r1 != r0) goto L_0x040b
        L_0x0403:
            uk.W0 r1 = new uk.W0
            r1.<init>(r12)
            r8.u(r1)
        L_0x040b:
            r5 = r1
            nI.a r5 = (nI.C17631a) r5
            r8.P()
            int r0 = r19 >> 6
            r7 = r0 & 14
            r1 = r37
            r3 = r24
            r6 = r8
            R0(r1, r2, r3, r4, r5, r6, r7)
            pk.s$b r0 = r35.d()
            int r1 = r13 >> 3
            r1 = r1 & 896(0x380, float:1.256E-42)
            r1 = r1 | 48
            r14 = r48
            r2 = r21
            vk.C12184z.b(r0, r2, r14, r8, r1)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0437
            U0.C4895p.R()
        L_0x0437:
            U0.Y0 r15 = r8.n()
            if (r15 == 0) goto L_0x0470
            uk.X0 r13 = new uk.X0
            r0 = r13
            r1 = r35
            r2 = r36
            r3 = r37
            r4 = r38
            r5 = r39
            r6 = r40
            r7 = r41
            r8 = r42
            r9 = r43
            r10 = r44
            r11 = r45
            r12 = r46
            r33 = r13
            r13 = r47
            r14 = r48
            r34 = r15
            r15 = r49
            r16 = r51
            r17 = r52
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = r33
            r0 = r34
            r0.a(r1)
        L_0x0470:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uk.s1.C2(pk.s, T0.c, boolean, nI.l, nI.a, nI.l, nI.l, nI.l, nI.a, nI.a, nI.a, nI.l, nI.l, nI.a, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final void D1(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final float D2(C5974I i10) {
        return (float) i10.s();
    }

    private static final pk.l E1(C4899r0<pk.l> r0Var) {
        return r0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final float E2(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    /* access modifiers changed from: private */
    public static final C4899r0 F1() {
        return u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final boolean F2(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void G1(C4899r0<pk.l> r0Var, pk.l lVar) {
        r0Var.setValue(lVar);
    }

    private static final void G2(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N H1(Q q10, O0.F0 f02, C4899r0 r0Var) {
        QJ.F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new e(f02, r0Var, (C17164e<? super e>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N H2(C4899r0 r0Var, boolean z10) {
        G2(r0Var, z10);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N I1(C17642l lVar, Q q10, C4899r0 r0Var, O0.F0 f02, C4899r0 r0Var2, pk.l lVar2) {
        C17542s.j(lVar2, "it");
        lVar.invoke(new C12056w.o(lVar2));
        G1(r0Var, lVar2);
        QJ.F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new f(f02, r0Var2, (C17164e<? super f>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N I2(C17642l lVar) {
        lVar.invoke(C12056w.C2464w.f103813a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N J1(Q q10, O0.F0 f02, C4899r0 r0Var, C4899r0 r0Var2, pk.l lVar) {
        C17542s.j(lVar, "product");
        QJ.F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new g(lVar, f02, r0Var, r0Var2, (C17164e<? super g>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N J2(C17642l lVar, s.f.b bVar) {
        C17542s.j(bVar, "it");
        lVar.invoke(new C12056w.i(bVar));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N K1(C17642l lVar, r rVar) {
        C17542s.j(rVar, "it");
        lVar.invoke(new C11724c.Q(rVar));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N K2(C17642l lVar, s.g.c cVar) {
        C17542s.j(cVar, "it");
        lVar.invoke(new C12062z(cVar));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void L0(boolean r11, boolean r12, boolean r13, U0.C4889m r14, int r15) {
        /*
            r0 = 979188574(0x3a5d3b5e, float:8.4393274E-4)
            U0.m r14 = r14.k(r0)
            r1 = r15 & 6
            r2 = 4
            if (r1 != 0) goto L_0x0017
            boolean r1 = r14.b(r11)
            if (r1 == 0) goto L_0x0014
            r1 = r2
            goto L_0x0015
        L_0x0014:
            r1 = 2
        L_0x0015:
            r1 = r1 | r15
            goto L_0x0018
        L_0x0017:
            r1 = r15
        L_0x0018:
            r3 = r15 & 48
            r4 = 32
            if (r3 != 0) goto L_0x0029
            boolean r3 = r14.b(r12)
            if (r3 == 0) goto L_0x0026
            r3 = r4
            goto L_0x0028
        L_0x0026:
            r3 = 16
        L_0x0028:
            r1 = r1 | r3
        L_0x0029:
            r3 = r15 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0039
            boolean r3 = r14.b(r13)
            if (r3 == 0) goto L_0x0036
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0038
        L_0x0036:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0038:
            r1 = r1 | r3
        L_0x0039:
            r3 = r1 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            if (r3 != r5) goto L_0x004b
            boolean r3 = r14.l()
            if (r3 != 0) goto L_0x0046
            goto L_0x004b
        L_0x0046:
            r14.L()
            goto L_0x00b2
        L_0x004b:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0057
            r3 = -1
            java.lang.String r5 = "com.ingka.ikea.app.shoppinglist.listdetails.ui.AdjustStatusBarIconColor (ShoppingListDetailsScreen.kt:628)"
            U0.C4895p.S(r0, r1, r3, r5)
        L_0x0057:
            r0 = 0
            r3 = 0
            r5 = 1
            jC.i r0 = jC.k.c(r0, r14, r3, r5)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r11)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r12)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r13)
            r9 = -1089798774(0xffffffffbf0afd8a, float:-0.5429312)
            r14.W(r9)
            boolean r9 = r14.F(r0)
            r10 = r1 & 112(0x70, float:1.57E-43)
            if (r10 != r4) goto L_0x007a
            r4 = r5
            goto L_0x007b
        L_0x007a:
            r4 = r3
        L_0x007b:
            r4 = r4 | r9
            r9 = r1 & 14
            if (r9 != r2) goto L_0x0081
            r3 = r5
        L_0x0081:
            r2 = r4 | r3
            java.lang.Object r3 = r14.D()
            if (r2 != 0) goto L_0x0091
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x0099
        L_0x0091:
            uk.Z0 r3 = new uk.Z0
            r3.<init>(r0, r12, r11)
            r14.u(r3)
        L_0x0099:
            r4 = r3
            nI.l r4 = (nI.C17642l) r4
            r14.P()
            r0 = r1 & 1022(0x3fe, float:1.432E-42)
            r1 = r6
            r2 = r7
            r3 = r8
            r5 = r14
            r6 = r0
            U0.P.a(r1, r2, r3, r4, r5, r6)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00b2
            U0.C4895p.R()
        L_0x00b2:
            U0.Y0 r14 = r14.n()
            if (r14 == 0) goto L_0x00c0
            uk.a1 r0 = new uk.a1
            r0.<init>(r11, r12, r13, r15)
            r14.a(r0)
        L_0x00c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uk.s1.L0(boolean, boolean, boolean, U0.m, int):void");
    }

    private static final boolean L1(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N L2(C17642l lVar, s.g.d dVar) {
        C17542s.j(dVar, "it");
        lVar.invoke(new C12005A(dVar));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final L M0(jC.i iVar, boolean z10, boolean z11, M m10) {
        C17542s.j(m10, "$this$DisposableEffect");
        iVar.a().a((!z10 || z11) ? C14615b.e.f127859b : C14615b.c.f127858b);
        return new a(iVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N M1(C17642l lVar) {
        lVar.invoke(C11724c.C11735l.f100928a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N M2(C17642l lVar) {
        lVar.invoke(C12058x.f103816a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N N0(boolean z10, boolean z11, boolean z12, int i10, C4889m mVar, int i11) {
        L0(z10, z11, z12, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N N1(C17642l lVar) {
        lVar.invoke(C11724c.r.f100935a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N N2(C17642l lVar) {
        lVar.invoke(C12056w.f.f103795a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void O0(boolean r26, boolean r27, boolean r28, nI.C17631a<XH.C16807N> r29, nI.C17631a<XH.C16807N> r30, androidx.compose.ui.d r31, nI.C17631a<XH.C16807N> r32, U0.C4889m r33, int r34, int r35) {
        /*
            r1 = r26
            r2 = r27
            r3 = r28
            r8 = r34
            r4 = 8
            r5 = 16
            r6 = 32
            r7 = 2
            r9 = 4
            r10 = 48
            r11 = 6
            r12 = -1516699361(0xffffffffa599011f, float:-2.654203E-16)
            r13 = r33
            U0.m r15 = r13.k(r12)
            r13 = 1
            r14 = r35 & 1
            if (r14 == 0) goto L_0x0024
            r14 = r8 | 6
            goto L_0x0034
        L_0x0024:
            r14 = r8 & 6
            if (r14 != 0) goto L_0x0033
            boolean r14 = r15.b(r1)
            if (r14 == 0) goto L_0x0030
            r14 = r9
            goto L_0x0031
        L_0x0030:
            r14 = r7
        L_0x0031:
            r14 = r14 | r8
            goto L_0x0034
        L_0x0033:
            r14 = r8
        L_0x0034:
            r7 = r35 & 2
            if (r7 == 0) goto L_0x003a
            r14 = r14 | r10
            goto L_0x0048
        L_0x003a:
            r7 = r8 & 48
            if (r7 != 0) goto L_0x0048
            boolean r7 = r15.b(r2)
            if (r7 == 0) goto L_0x0046
            r7 = r6
            goto L_0x0047
        L_0x0046:
            r7 = r5
        L_0x0047:
            r14 = r14 | r7
        L_0x0048:
            r7 = r35 & 4
            if (r7 == 0) goto L_0x004f
            r14 = r14 | 384(0x180, float:5.38E-43)
            goto L_0x005f
        L_0x004f:
            r7 = r8 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x005f
            boolean r7 = r15.b(r3)
            if (r7 == 0) goto L_0x005c
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r14 = r14 | r7
        L_0x005f:
            r7 = r35 & 8
            if (r7 == 0) goto L_0x0068
            r14 = r14 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r7 = r29
            goto L_0x007a
        L_0x0068:
            r7 = r8 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0065
            r7 = r29
            boolean r9 = r15.F(r7)
            if (r9 == 0) goto L_0x0077
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r14 = r14 | r9
        L_0x007a:
            r5 = r35 & 16
            if (r5 == 0) goto L_0x0083
            r14 = r14 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r5 = r30
            goto L_0x0095
        L_0x0083:
            r5 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x0080
            r5 = r30
            boolean r9 = r15.F(r5)
            if (r9 == 0) goto L_0x0092
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r14 = r14 | r9
        L_0x0095:
            r6 = r35 & 32
            r9 = 196608(0x30000, float:2.75506E-40)
            if (r6 == 0) goto L_0x009f
            r14 = r14 | r9
            r4 = r31
            goto L_0x00b2
        L_0x009f:
            r16 = r8 & r9
            r4 = r31
            if (r16 != 0) goto L_0x00b2
            boolean r16 = r15.V(r4)
            if (r16 == 0) goto L_0x00ae
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b0
        L_0x00ae:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b0:
            r14 = r14 | r16
        L_0x00b2:
            r16 = r35 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00bd
            r14 = r14 | r17
            r9 = r32
            goto L_0x00d0
        L_0x00bd:
            r16 = r8 & r17
            r9 = r32
            if (r16 != 0) goto L_0x00d0
            boolean r16 = r15.F(r9)
            if (r16 == 0) goto L_0x00cc
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ce
        L_0x00cc:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00ce:
            r14 = r14 | r16
        L_0x00d0:
            r16 = 599187(0x92493, float:8.3964E-40)
            r11 = r14 & r16
            r0 = 599186(0x92492, float:8.39638E-40)
            if (r11 != r0) goto L_0x00e8
            boolean r0 = r15.l()
            if (r0 != 0) goto L_0x00e1
            goto L_0x00e8
        L_0x00e1:
            r15.L()
            r6 = r4
            r5 = r15
            goto L_0x03a3
        L_0x00e8:
            if (r6 == 0) goto L_0x00ed
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x00ee
        L_0x00ed:
            r0 = r4
        L_0x00ee:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x00fa
            r4 = -1
            java.lang.String r6 = "com.ingka.ikea.app.shoppinglist.listdetails.ui.AppBar (ShoppingListDetailsScreen.kt:649)"
            U0.C4895p.S(r12, r14, r4, r6)
        L_0x00fa:
            r4 = 0
            r6 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.h(r0, r4, r13, r6)
            r6 = 353700342(0x151509f6, float:3.0098168E-26)
            r15.W(r6)
            if (r1 == 0) goto L_0x0121
            androidx.compose.ui.d$a r16 = androidx.compose.ui.d.f18749a
            tK.v r6 = tK.C18030v.f147664a
            int r11 = tK.C18030v.f147665b
            tK.h r6 = r6.a(r15, r11)
            long r17 = r6.k0()
            r20 = 2
            r21 = 0
            r19 = 0
            androidx.compose.ui.d r6 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            goto L_0x0123
        L_0x0121:
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
        L_0x0123:
            r15.P()
            androidx.compose.ui.d r4 = r4.s(r6)
            androidx.compose.ui.d r4 = s0.C5852X.e(r4)
            ol.m r6 = ol.m.f100559a
            float r6 = r6.a()
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.i(r4, r6)
            i1.c$a r6 = i1.C5437c.f24302a
            i1.c$c r11 = r6.i()
            androidx.compose.foundation.layout.d r12 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r12 = r12.f()
            E1.I r10 = androidx.compose.foundation.layout.G.b(r12, r11, r15, r10)
            r11 = 0
            int r12 = U0.C4883j.a(r15, r11)
            U0.y r13 = r15.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r15, r4)
            G1.g$a r24 = G1.C4504g.f6515W
            nI.a r11 = r24.a()
            U0.f r16 = r15.m()
            if (r16 != 0) goto L_0x0164
            U0.C4883j.c()
        L_0x0164:
            r15.I()
            boolean r16 = r15.i()
            if (r16 == 0) goto L_0x0171
            r15.p(r11)
            goto L_0x0174
        L_0x0171:
            r15.t()
        L_0x0174:
            U0.m r11 = U0.F1.a(r15)
            r25 = r0
            nI.p r0 = r24.c()
            U0.F1.c(r11, r10, r0)
            nI.p r0 = r24.e()
            U0.F1.c(r11, r13, r0)
            nI.p r0 = r24.b()
            boolean r10 = r11.i()
            if (r10 != 0) goto L_0x01a0
            java.lang.Object r10 = r11.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r13)
            if (r10 != 0) goto L_0x01ae
        L_0x01a0:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            r11.u(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            r11.w(r10, r0)
        L_0x01ae:
            nI.p r0 = r24.d()
            U0.F1.c(r11, r4, r0)
            s0.N r0 = s0.C5843N.f28726a
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            r10 = 12
            float r11 = (float) r10
            float r10 = c2.h.B(r11)
            androidx.compose.ui.d r10 = androidx.compose.foundation.layout.J.y(r4, r10)
            r12 = 6
            s0.C5844O.a(r10, r15, r12)
            androidx.compose.ui.d r10 = O0.W.b(r4)
            r12 = 40
            float r12 = (float) r12
            float r12 = c2.h.B(r12)
            androidx.compose.ui.d r10 = androidx.compose.foundation.layout.J.t(r10, r12)
            A0.f r12 = A0.g.h()
            androidx.compose.ui.d r10 = m1.e.a(r10, r12)
            r12 = 358950672(0x15652710, float:4.6276997E-26)
            r15.W(r12)
            if (r1 == 0) goto L_0x01e9
            r12 = r4
            goto L_0x0201
        L_0x01e9:
            tK.v r12 = tK.C18030v.f147664a
            int r13 = tK.C18030v.f147665b
            tK.h r12 = r12.a(r15, r13)
            long r17 = r12.F0()
            r20 = 2
            r21 = 0
            r19 = 0
            r16 = r4
            androidx.compose.ui.d r12 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
        L_0x0201:
            r15.P()
            androidx.compose.ui.d r16 = r10.s(r12)
            L1.i$a r10 = L1.i.f8936b
            int r10 = r10.a()
            int r12 = Oo.b.f84632f
            r13 = 0
            java.lang.String r18 = J1.j.b(r12, r15, r13)
            L1.i r19 = L1.i.h(r10)
            r21 = 1
            r22 = 0
            r17 = 0
            r20 = r29
            androidx.compose.ui.d r10 = androidx.compose.foundation.d.d(r16, r17, r18, r19, r20, r21, r22)
            i1.c r6 = r6.e()
            r12 = 0
            E1.I r6 = androidx.compose.foundation.layout.C5077h.h(r6, r12)
            int r13 = U0.C4883j.a(r15, r12)
            U0.y r12 = r15.s()
            androidx.compose.ui.d r10 = androidx.compose.ui.c.e(r15, r10)
            nI.a r5 = r24.a()
            U0.f r16 = r15.m()
            if (r16 != 0) goto L_0x0247
            U0.C4883j.c()
        L_0x0247:
            r15.I()
            boolean r16 = r15.i()
            if (r16 == 0) goto L_0x0254
            r15.p(r5)
            goto L_0x0257
        L_0x0254:
            r15.t()
        L_0x0257:
            U0.m r5 = U0.F1.a(r15)
            nI.p r7 = r24.c()
            U0.F1.c(r5, r6, r7)
            nI.p r6 = r24.e()
            U0.F1.c(r5, r12, r6)
            nI.p r6 = r24.b()
            boolean r7 = r5.i()
            if (r7 != 0) goto L_0x0281
            java.lang.Object r7 = r5.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r12)
            if (r7 != 0) goto L_0x028f
        L_0x0281:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
            r5.u(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
            r5.w(r7, r6)
        L_0x028f:
            nI.p r6 = r24.d()
            U0.F1.c(r5, r10, r6)
            androidx.compose.foundation.layout.j r5 = androidx.compose.foundation.layout.C5079j.f18125a
            if (r1 == 0) goto L_0x02b0
            r5 = -1737265285(0xffffffff98736f7b, float:-3.1463297E-24)
            r15.W(r5)
            tK.v r5 = tK.C18030v.f147664a
            int r6 = tK.C18030v.f147665b
            tK.h r5 = r5.a(r15, r6)
            long r5 = r5.R()
            r15.P()
            goto L_0x02c5
        L_0x02b0:
            r5 = -1737175509(0xffffffff9874ce2b, float:-3.164035E-24)
            r15.W(r5)
            tK.v r5 = tK.C18030v.f147664a
            int r6 = tK.C18030v.f147665b
            tK.h r5 = r5.a(r15, r6)
            long r5 = r5.x0()
            r15.P()
        L_0x02c5:
            r19 = 384(0x180, float:5.38E-43)
            r20 = 10
            r7 = 0
            java.lang.String r16 = "back icon color"
            r17 = 0
            r10 = r14
            r13 = r5
            r5 = r15
            r15 = r7
            r18 = r5
            U0.A1 r6 = l0.u.a(r13, r15, r16, r17, r18, r19, r20)
            int r7 = uK.C18146a.f148719y
            r12 = 0
            t1.c r13 = J1.e.c(r7, r5, r12)
            p1.w0$a r14 = p1.C5749w0.f27365b
            long r15 = P0(r6)
            r18 = 2
            r19 = 0
            r17 = 0
            p1.w0 r19 = p1.C5749w0.a.b(r14, r15, r17, r18, r19)
            r21 = 48
            r22 = 60
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = r5
            n0.C5583F.a(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r5.x()
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r16 = r0
            r17 = r4
            androidx.compose.ui.d r0 = s0.C5842M.e(r16, r17, r18, r19, r20, r21)
            r6 = 0
            s0.C5844O.a(r0, r5, r6)
            if (r1 != 0) goto L_0x031f
            if (r2 != 0) goto L_0x031c
            goto L_0x031f
        L_0x031c:
            SC.H0 r0 = SC.H0.TertiaryInverseStatic
            goto L_0x0321
        L_0x031f:
            SC.H0 r0 = SC.H0.Tertiary
        L_0x0321:
            r6 = 358991510(0x1565c696, float:4.6402838E-26)
            r5.W(r6)
            r6 = 234881024(0xe000000, float:1.5777218E-30)
            if (r3 == 0) goto L_0x0361
            int r13 = uK.C18146a.f148150Ma
            int r7 = ik.c.f98338g
            r12 = 0
            java.lang.String r14 = J1.j.b(r7, r5, r12)
            SC.G0 r18 = SC.G0.Small
            r7 = 12
            int r7 = r10 << 12
            r7 = r7 & r6
            r12 = 196608(0x30000, float:2.75506E-40)
            r23 = r7 | r12
            r24 = 204(0xcc, float:2.86E-43)
            r15 = 0
            r16 = 0
            r19 = 0
            r20 = 0
            r17 = r0
            r21 = r30
            r22 = r5
            SC.F0.b(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r7 = 8
            float r7 = (float) r7
            float r7 = c2.h.B(r7)
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.J.y(r4, r7)
            r12 = 6
            s0.C5844O.a(r7, r5, r12)
            goto L_0x0362
        L_0x0361:
            r12 = 6
        L_0x0362:
            r5.P()
            int r13 = uK.C18146a.f148098J3
            int r7 = ik.c.f98334c
            r14 = 0
            java.lang.String r14 = J1.j.b(r7, r5, r14)
            SC.G0 r18 = SC.G0.Small
            int r7 = r10 << 6
            r6 = r6 & r7
            r7 = 196608(0x30000, float:2.75506E-40)
            r23 = r6 | r7
            r24 = 204(0xcc, float:2.86E-43)
            r15 = 0
            r16 = 0
            r19 = 0
            r20 = 0
            r17 = r0
            r21 = r32
            r22 = r5
            SC.F0.b(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            float r0 = c2.h.B(r11)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.y(r4, r0)
            r4 = 6
            s0.C5844O.a(r0, r5, r4)
            r5.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x03a1
            U0.C4895p.R()
        L_0x03a1:
            r6 = r25
        L_0x03a3:
            U0.Y0 r10 = r5.n()
            if (r10 == 0) goto L_0x03c2
            uk.h1 r11 = new uk.h1
            r0 = r11
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = r30
            r7 = r32
            r8 = r34
            r9 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x03c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uk.s1.O0(boolean, boolean, boolean, nI.a, nI.a, androidx.compose.ui.d, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N O1(C17642l lVar) {
        lVar.invoke(C11724c.G.f100899a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N O2(C17642l lVar) {
        lVar.invoke(C12056w.u.f103811a);
        return C16807N.f139792a;
    }

    private static final long P0(A1<C5747v0> a12) {
        return a12.getValue().y();
    }

    /* access modifiers changed from: private */
    public static final C16807N P1(C17642l lVar, pk.l lVar2) {
        C17542s.j(lVar2, "it");
        lVar.invoke(new C11724c.F(lVar2.j(), Ae.k.SWIPE));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N P2(s sVar, T0.c cVar, boolean z10, C17642l lVar, C17631a aVar, C17642l lVar2, C17642l lVar3, C17642l lVar4, C17631a aVar2, C17631a aVar3, C17631a aVar4, C17642l lVar5, C17642l lVar6, C17631a aVar5, C17642l lVar7, int i10, int i11, C4889m mVar, int i12) {
        C2(sVar, cVar, z10, lVar, aVar, lVar2, lVar3, lVar4, aVar2, aVar3, aVar4, lVar5, lVar6, aVar5, lVar7, mVar, M0.a(i10 | 1), M0.a(i11));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Q0(boolean z10, boolean z11, boolean z12, C17631a aVar, C17631a aVar2, androidx.compose.ui.d dVar, C17631a aVar3, int i10, int i11, C4889m mVar, int i12) {
        O0(z10, z11, z12, aVar, aVar2, dVar, aVar3, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Q1(C17642l lVar, String str) {
        C17542s.j(str, "it");
        lVar.invoke(new C11724c.H(str));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: uk.s1$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: uk.s1$b} */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void R0(boolean r17, nI.C17631a<XH.C16807N> r18, u0.C5974I r19, boolean r20, nI.C17631a<XH.C16807N> r21, U0.C4889m r22, int r23) {
        /*
            r6 = r23
            r0 = -881910040(0xffffffffcb6f1ee8, float:-1.5671016E7)
            r1 = r22
            U0.m r1 = r1.k(r0)
            r2 = r6 & 6
            r3 = 4
            if (r2 != 0) goto L_0x001d
            r2 = r17
            boolean r4 = r1.b(r2)
            if (r4 == 0) goto L_0x001a
            r4 = r3
            goto L_0x001b
        L_0x001a:
            r4 = 2
        L_0x001b:
            r4 = r4 | r6
            goto L_0x0020
        L_0x001d:
            r2 = r17
            r4 = r6
        L_0x0020:
            r5 = r6 & 48
            r7 = 32
            if (r5 != 0) goto L_0x0034
            r5 = r18
            boolean r8 = r1.F(r5)
            if (r8 == 0) goto L_0x0030
            r8 = r7
            goto L_0x0032
        L_0x0030:
            r8 = 16
        L_0x0032:
            r4 = r4 | r8
            goto L_0x0036
        L_0x0034:
            r5 = r18
        L_0x0036:
            r8 = r6 & 384(0x180, float:5.38E-43)
            r9 = 256(0x100, float:3.59E-43)
            r14 = r19
            if (r8 != 0) goto L_0x0049
            boolean r8 = r1.V(r14)
            if (r8 == 0) goto L_0x0046
            r8 = r9
            goto L_0x0048
        L_0x0046:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0048:
            r4 = r4 | r8
        L_0x0049:
            r8 = r6 & 3072(0xc00, float:4.305E-42)
            r10 = 2048(0x800, float:2.87E-42)
            r15 = r20
            if (r8 != 0) goto L_0x005c
            boolean r8 = r1.b(r15)
            if (r8 == 0) goto L_0x0059
            r8 = r10
            goto L_0x005b
        L_0x0059:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x005b:
            r4 = r4 | r8
        L_0x005c:
            r8 = r6 & 24576(0x6000, float:3.4438E-41)
            r11 = 16384(0x4000, float:2.2959E-41)
            r13 = r21
            if (r8 != 0) goto L_0x006f
            boolean r8 = r1.F(r13)
            if (r8 == 0) goto L_0x006c
            r8 = r11
            goto L_0x006e
        L_0x006c:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x006e:
            r4 = r4 | r8
        L_0x006f:
            r8 = r4 & 9363(0x2493, float:1.312E-41)
            r12 = 9362(0x2492, float:1.3119E-41)
            if (r8 != r12) goto L_0x0081
            boolean r8 = r1.l()
            if (r8 != 0) goto L_0x007c
            goto L_0x0081
        L_0x007c:
            r1.L()
            goto L_0x00ff
        L_0x0081:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x008d
            r8 = -1
            java.lang.String r12 = "com.ingka.ikea.app.shoppinglist.listdetails.ui.HandleShoppingListTabPressed (ShoppingListDetailsScreen.kt:898)"
            U0.C4895p.S(r0, r4, r8, r12)
        L_0x008d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r17)
            r8 = 775225553(0x2e3500d1, float:4.115536E-11)
            r1.W(r8)
            r12 = r4 & 14
            r16 = 1
            if (r12 != r3) goto L_0x00a0
            r3 = r16
            goto L_0x00a1
        L_0x00a0:
            r3 = 0
        L_0x00a1:
            r8 = r4 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != r10) goto L_0x00a8
            r8 = r16
            goto L_0x00a9
        L_0x00a8:
            r8 = 0
        L_0x00a9:
            r3 = r3 | r8
            r8 = r4 & 112(0x70, float:1.57E-43)
            if (r8 != r7) goto L_0x00b1
            r7 = r16
            goto L_0x00b2
        L_0x00b1:
            r7 = 0
        L_0x00b2:
            r3 = r3 | r7
            r7 = r4 & 896(0x380, float:1.256E-42)
            if (r7 != r9) goto L_0x00ba
            r7 = r16
            goto L_0x00bb
        L_0x00ba:
            r7 = 0
        L_0x00bb:
            r3 = r3 | r7
            r7 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r7
            if (r4 != r11) goto L_0x00c5
            r8 = r16
            goto L_0x00c6
        L_0x00c5:
            r8 = 0
        L_0x00c6:
            r3 = r3 | r8
            java.lang.Object r4 = r1.D()
            if (r3 != 0) goto L_0x00d8
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x00d6
            goto L_0x00d8
        L_0x00d6:
            r2 = r12
            goto L_0x00ee
        L_0x00d8:
            uk.s1$b r4 = new uk.s1$b
            r3 = 0
            r7 = r4
            r8 = r17
            r9 = r20
            r10 = r18
            r11 = r19
            r2 = r12
            r12 = r21
            r13 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r1.u(r4)
        L_0x00ee:
            nI.p r4 = (nI.p) r4
            r1.P()
            U0.P.g(r0, r4, r1, r2)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00ff
            U0.C4895p.R()
        L_0x00ff:
            U0.Y0 r7 = r1.n()
            if (r7 == 0) goto L_0x011a
            uk.b1 r8 = new uk.b1
            r0 = r8
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x011a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uk.s1.R0(boolean, nI.a, u0.I, boolean, nI.a, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final void R1(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N S0(boolean z10, C17631a aVar, C5974I i10, boolean z11, C17631a aVar2, int i11, C4889m mVar, int i12) {
        R0(z10, aVar, i10, z11, aVar2, mVar, M0.a(i11 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N S1(C17642l lVar) {
        lVar.invoke(C11724c.C11725a.C2373c.f100916a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void T0(androidx.compose.ui.d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        androidx.compose.ui.d dVar2;
        androidx.compose.ui.d dVar3;
        int i13 = i10;
        int i14 = i11;
        C4889m k10 = mVar.k(-1065633956);
        int i15 = i14 & 1;
        if (i15 != 0) {
            i12 = i13 | 6;
            dVar2 = dVar;
        } else if ((i13 & 6) == 0) {
            dVar2 = dVar;
            i12 = (k10.V(dVar2) ? 4 : 2) | i13;
        } else {
            dVar2 = dVar;
            i12 = i13;
        }
        if ((i12 & 3) != 2 || !k10.l()) {
            dVar3 = i15 != 0 ? androidx.compose.ui.d.f18749a : dVar2;
            if (C4895p.J()) {
                C4895p.S(-1065633956, i12, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.ImageOverlay (ShoppingListDetailsScreen.kt:815)");
            }
            long x02 = C18030v.f147664a.a(k10, C18030v.f147665b).x0();
            C5077h.a(androidx.compose.foundation.b.b(dVar3, C5728l0.a.l(C5728l0.f27325b, C16877v.q(C5747v0.k(C5747v0.o(x02, 0.8f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), C5747v0.k(C5747v0.o(x02, 0.74f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), C5747v0.k(C5747v0.o(x02, 0.68f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), C5747v0.k(C5747v0.o(x02, 0.61f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), C5747v0.k(C5747v0.o(x02, 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), C5747v0.k(C5747v0.o(x02, 0.47f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), C5747v0.k(C5747v0.o(x02, 0.4f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), C5747v0.k(C5747v0.o(x02, 0.33f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), C5747v0.k(C5747v0.o(x02, 0.26f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), C5747v0.k(C5747v0.o(x02, 0.2f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), C5747v0.k(C5747v0.o(x02, 0.15f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), C5747v0.k(C5747v0.o(x02, 0.1f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), C5747v0.k(C5747v0.o(x02, 0.06f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), C5747v0.k(C5747v0.o(x02, 0.03f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), C5747v0.k(C5747v0.o(x02, 0.01f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), C5747v0.k(C5747v0.o(x02, 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null))), 0.0f, 0.0f, 0, 14, (Object) null), (i1) null, 0.0f, 6, (Object) null), k10, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            dVar3 = dVar2;
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new p1(dVar3, i13, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N T1(O0.F0 f02, C17642l lVar, pk.l lVar2) {
        C17542s.j(lVar2, "product");
        if (!f02.l()) {
            lVar.invoke(new C11724c.y(lVar2.j()));
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N U0(androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        T0(dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N U1(Q q10, O0.F0 f02, C4899r0 r0Var) {
        c1(q10, f02, r0Var, new D0());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void V0(androidx.compose.ui.d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        androidx.compose.ui.d dVar2;
        C4889m mVar2;
        int i13 = i10;
        int i14 = i11;
        C4889m k10 = mVar.k(463633622);
        int i15 = i14 & 1;
        if (i15 != 0) {
            i12 = i13 | 6;
            dVar2 = dVar;
        } else if ((i13 & 6) == 0) {
            dVar2 = dVar;
            i12 = (k10.V(dVar2) ? 4 : 2) | i13;
        } else {
            dVar2 = dVar;
            i12 = i13;
        }
        if ((i12 & 3) != 2 || !k10.l()) {
            d.a aVar = i15 != 0 ? androidx.compose.ui.d.f18749a : dVar2;
            if (C4895p.J()) {
                C4895p.S(463633622, i12, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.NoProductsInListItem (ShoppingListDetailsScreen.kt:792)");
            }
            C5437c.a aVar2 = C5437c.f24302a;
            C5437c.b g10 = aVar2.g();
            C5073d dVar3 = C5073d.f18068a;
            I a10 = C5080k.a(dVar3.g(), g10, k10, 48);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, aVar);
            C4504g.a aVar3 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar3.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a12);
            } else {
                k10.t();
            }
            C4889m a13 = F1.a(k10);
            F1.c(a13, a10, aVar3.c());
            F1.c(a13, s10, aVar3.e());
            p<C4504g, Integer, C16807N> b10 = aVar3.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar3.d());
            C5862h hVar = C5862h.f28810a;
            d.a aVar4 = androidx.compose.ui.d.f18749a;
            C18030v vVar = C18030v.f147664a;
            int i16 = C18030v.f147665b;
            androidx.compose.ui.d i17 = D.i(androidx.compose.foundation.b.c(aVar4, vVar.a(k10, i16).m0(), A0.g.h()), c2.h.B((float) 8));
            I a14 = C5080k.a(dVar3.g(), aVar2.k(), k10, 0);
            int a15 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            androidx.compose.ui.d e11 = androidx.compose.ui.c.e(k10, i17);
            C17631a<C4504g> a16 = aVar3.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a16);
            } else {
                k10.t();
            }
            C4889m a17 = F1.a(k10);
            F1.c(a17, a14, aVar3.c());
            F1.c(a17, s11, aVar3.e());
            p<C4504g, Integer, C16807N> b11 = aVar3.b();
            if (a17.i() || !C17542s.e(a17.D(), Integer.valueOf(a15))) {
                a17.u(Integer.valueOf(a15));
                a17.w(Integer.valueOf(a15), b11);
            }
            F1.c(a17, e11, aVar3.d());
            d.a aVar5 = aVar4;
            C5583F.a(J1.e.c(C18146a.f147965A5, k10, 0), (String) null, (androidx.compose.ui.d) null, (C5437c) null, (C4478k) null, 0.0f, C5749w0.a.b(C5749w0.f27365b, vVar.a(k10, i16).G0(), 0, 2, (Object) null), k10, 48, 60);
            k10.x();
            C5844O.a(J.i(aVar5, c2.h.B((float) 24)), k10, 6);
            mVar2 = k10;
            androidx.compose.ui.d dVar4 = aVar;
            C13607l.j(J1.j.b(ik.c.f98342k, k10, 0), C13679b.a.C2856b.f116680a, TC.e.i(aVar5), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (Y1.k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 48, 0, 262136);
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
            dVar2 = dVar4;
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new f1(dVar2, i13, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N V1() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N W0(androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        V0(dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N W1(C17642l lVar, Q q10, O0.F0 f02, C4899r0 r0Var) {
        c1(q10, f02, r0Var, new I0(lVar));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void X0(boolean z10, androidx.compose.ui.d dVar, C17631a<C16807N> aVar, C4889m mVar, int i10, int i11) {
        int i12;
        C4889m k10 = mVar.k(1377665267);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.b(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.V(dVar) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= k10.F(aVar) ? 256 : 128;
        }
        if ((i12 & 147) != 146 || !k10.l()) {
            if (i13 != 0) {
                dVar = androidx.compose.ui.d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(1377665267, i12, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.ScanFab (ShoppingListDetailsScreen.kt:607)");
            }
            k10.W(-495841966);
            Object D10 = k10.D();
            C4889m.a aVar2 = C4889m.f14007a;
            if (D10 == aVar2.a()) {
                D10 = new j1();
                k10.u(D10);
            }
            k10.P();
            androidx.compose.animation.i F10 = androidx.compose.animation.g.F((N) null, (C17642l) D10, 1, (Object) null);
            k10.W(-495839950);
            Object D11 = k10.D();
            if (D11 == aVar2.a()) {
                D11 = new k1();
                k10.u(D11);
            }
            k10.P();
            l0.d.g(z10, dVar, F10, androidx.compose.animation.g.K((N) null, (C17642l) D11, 1, (Object) null), (String) null, c1.c.e(1903976731, true, new c(aVar), k10, 54), k10, (i12 & 14) | 200064 | (i12 & 112), 16);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        androidx.compose.ui.d dVar2 = dVar;
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new l1(z10, dVar2, aVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N X1(C17642l lVar) {
        lVar.invoke(C11724c.I.f100901a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final int Y0(int i10) {
        return i10 * 2;
    }

    /* access modifiers changed from: private */
    public static final C16807N Y1(C17642l lVar, Q q10, O0.F0 f02, C4899r0 r0Var) {
        c1(q10, f02, r0Var, new B0(lVar));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final int Z0(int i10) {
        return i10 * 2;
    }

    /* access modifiers changed from: private */
    public static final C16807N Z1(C17642l lVar) {
        lVar.invoke(C11724c.C11736m.f100929a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N a1(boolean z10, androidx.compose.ui.d dVar, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        X0(z10, dVar, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N a2(C17642l lVar, Q q10, O0.F0 f02, C4899r0 r0Var) {
        c1(q10, f02, r0Var, new C0(lVar));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v1, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v30, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v56, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v44, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v64, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v66, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v86, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v22, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v27, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v29, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v40, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v19, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v180, resolved type: uk.J} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v181, resolved type: uk.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v7, resolved type: uk.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v8, resolved type: uk.J} */
    /* JADX WARNING: type inference failed for: r2v57 */
    /* JADX WARNING: type inference failed for: r2v87 */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x05d4, code lost:
        if (r2 == r18.a()) goto L_0x05d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0a07, code lost:
        if (r2 == U0.C4889m.f14007a.a()) goto L_0x0a09;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b1(pk.s r48, T0.c r49, nI.C17642l<? super pk.C11724c, XH.C16807N> r50, nI.C17642l<? super uk.C12056w, XH.C16807N> r51, boolean r52, U0.C4889m r53, int r54) {
        /*
            r15 = r48
            r13 = r49
            r12 = r50
            r11 = r51
            r10 = r54
            java.lang.String r0 = "state"
            kotlin.jvm.internal.C17542s.j(r15, r0)
            java.lang.String r0 = "windowSize"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            java.lang.String r0 = "onAction"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r0 = "onScreenAction"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            r0 = 215530228(0xcd8baf4, float:3.3392588E-31)
            r1 = r53
            U0.m r9 = r1.k(r0)
            r1 = r10 & 6
            r8 = 2
            if (r1 != 0) goto L_0x0037
            boolean r1 = r9.F(r15)
            if (r1 == 0) goto L_0x0034
            r1 = 4
            goto L_0x0035
        L_0x0034:
            r1 = r8
        L_0x0035:
            r1 = r1 | r10
            goto L_0x0038
        L_0x0037:
            r1 = r10
        L_0x0038:
            r2 = r10 & 48
            if (r2 != 0) goto L_0x0048
            boolean r2 = r9.V(r13)
            if (r2 == 0) goto L_0x0045
            r2 = 32
            goto L_0x0047
        L_0x0045:
            r2 = 16
        L_0x0047:
            r1 = r1 | r2
        L_0x0048:
            r2 = r10 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0058
            boolean r2 = r9.F(r12)
            if (r2 == 0) goto L_0x0055
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0057
        L_0x0055:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0057:
            r1 = r1 | r2
        L_0x0058:
            r2 = r10 & 3072(0xc00, float:4.305E-42)
            r7 = 2048(0x800, float:2.87E-42)
            if (r2 != 0) goto L_0x0069
            boolean r2 = r9.F(r11)
            if (r2 == 0) goto L_0x0066
            r2 = r7
            goto L_0x0068
        L_0x0066:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0068:
            r1 = r1 | r2
        L_0x0069:
            r2 = r10 & 24576(0x6000, float:3.4438E-41)
            r6 = r52
            if (r2 != 0) goto L_0x007b
            boolean r2 = r9.b(r6)
            if (r2 == 0) goto L_0x0078
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x007a
        L_0x0078:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x007a:
            r1 = r1 | r2
        L_0x007b:
            r5 = r1
            r1 = r5 & 9363(0x2493, float:1.312E-41)
            r2 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r2) goto L_0x0092
            boolean r1 = r9.l()
            if (r1 != 0) goto L_0x0089
            goto L_0x0092
        L_0x0089:
            r9.L()
            r14 = r9
            r0 = r11
            r13 = r12
            r2 = r15
            goto L_0x0cb7
        L_0x0092:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x009e
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.app.shoppinglist.listdetails.ui.ShoppingListDetailsScreen (ShoppingListDetailsScreen.kt:134)"
            U0.C4895p.S(r0, r5, r1, r2)
        L_0x009e:
            boolean r0 = r48.D()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1 = 369247272(0x16024428, float:1.0522823E-25)
            r9.W(r1)
            boolean r1 = r9.F(r15)
            r4 = r5 & 7168(0x1c00, float:1.0045E-41)
            r3 = 1
            r2 = 0
            if (r4 != r7) goto L_0x00b9
            r16 = r3
            goto L_0x00bb
        L_0x00b9:
            r16 = r2
        L_0x00bb:
            r1 = r1 | r16
            java.lang.Object r7 = r9.D()
            r14 = 0
            if (r1 != 0) goto L_0x00cc
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
            if (r7 != r1) goto L_0x00d4
        L_0x00cc:
            uk.s1$d r7 = new uk.s1$d
            r7.<init>(r15, r11, r14)
            r9.u(r7)
        L_0x00d4:
            nI.p r7 = (nI.p) r7
            r9.P()
            U0.P.g(r0, r7, r9, r2)
            java.lang.Object r0 = r9.D()
            U0.m$a r18 = U0.C4889m.f14007a
            java.lang.Object r1 = r18.a()
            if (r0 != r1) goto L_0x00f7
            dI.j r0 = dI.C17169j.f142968a
            QJ.Q r0 = U0.P.k(r0, r9)
            U0.B r1 = new U0.B
            r1.<init>(r0)
            r9.u(r1)
            r0 = r1
        L_0x00f7:
            U0.B r0 = (U0.B) r0
            QJ.Q r0 = r0.a()
            r7 = 6
            O0.F0 r1 = O0.C4725e0.l(r3, r14, r9, r7, r8)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r2 = 369257471(0x16026bff, float:1.0535394E-25)
            r9.W(r2)
            java.lang.Object r2 = r9.D()
            java.lang.Object r7 = r18.a()
            if (r2 != r7) goto L_0x011c
            uk.G r2 = new uk.G
            r2.<init>()
            r9.u(r2)
        L_0x011c:
            r7 = r2
            nI.a r7 = (nI.C17631a) r7
            r9.P()
            r21 = 3072(0xc00, float:4.305E-42)
            r22 = 6
            r2 = 0
            r23 = 0
            r25 = r1
            r1 = r3
            r3 = 0
            r3 = r23
            r28 = r4
            r4 = r7
            r7 = r5
            r5 = r9
            r6 = r21
            r30 = r7
            r15 = 6
            r7 = r22
            java.lang.Object r1 = f1.C5301c.e(r1, r2, r3, r4, r5, r6, r7)
            r7 = r1
            U0.r0 r7 = (U0.C4899r0) r7
            r6 = 1
            O0.F0 r5 = O0.C4725e0.l(r6, r14, r9, r15, r8)
            r4 = 0
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r2 = 369273823(0x1602abdf, float:1.0555549E-25)
            r9.W(r2)
            java.lang.Object r2 = r9.D()
            java.lang.Object r3 = r18.a()
            if (r2 != r3) goto L_0x0162
            uk.I r2 = new uk.I
            r2.<init>()
            r9.u(r2)
        L_0x0162:
            r17 = r2
            nI.a r17 = (nI.C17631a) r17
            r9.P()
            r19 = 3072(0xc00, float:4.305E-42)
            r20 = 6
            r2 = 0
            r3 = 0
            r4 = r17
            r32 = r5
            r5 = r9
            r6 = r19
            r34 = r7
            r7 = r20
            java.lang.Object r1 = f1.C5301c.e(r1, r2, r3, r4, r5, r6, r7)
            r7 = r1
            U0.r0 r7 = (U0.C4899r0) r7
            r1 = 369275728(0x1602b350, float:1.0557897E-25)
            r9.W(r1)
            java.lang.Object r1 = r9.D()
            java.lang.Object r2 = r18.a()
            if (r1 != r2) goto L_0x0198
            U0.r0 r1 = U0.u1.e(r14, r14, r8, r14)
            r9.u(r1)
        L_0x0198:
            r6 = r1
            U0.r0 r6 = (U0.C4899r0) r6
            r9.P()
            r5 = 1
            O0.F0 r4 = O0.C4725e0.l(r5, r14, r9, r15, r8)
            r3 = 0
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r2 = 369294239(0x1602fb9f, float:1.0580714E-25)
            r9.W(r2)
            java.lang.Object r2 = r9.D()
            java.lang.Object r3 = r18.a()
            if (r2 != r3) goto L_0x01be
            uk.V r2 = new uk.V
            r2.<init>()
            r9.u(r2)
        L_0x01be:
            r17 = r2
            nI.a r17 = (nI.C17631a) r17
            r9.P()
            r20 = 3072(0xc00, float:4.305E-42)
            r21 = 6
            r2 = 0
            r3 = 0
            r35 = r4
            r4 = r17
            r5 = r9
            r36 = r6
            r6 = r20
            r37 = r7
            r7 = r21
            java.lang.Object r1 = f1.C5301c.e(r1, r2, r3, r4, r5, r6, r7)
            r7 = r1
            U0.r0 r7 = (U0.C4899r0) r7
            r1 = 369296217(0x16030359, float:1.0583152E-25)
            r9.W(r1)
            java.lang.Object r1 = r9.D()
            java.lang.Object r2 = r18.a()
            if (r1 != r2) goto L_0x01f6
            U0.r0 r1 = U0.u1.e(r14, r14, r8, r14)
            r9.u(r1)
        L_0x01f6:
            r26 = r1
            U0.r0 r26 = (U0.C4899r0) r26
            r9.P()
            r6 = 1
            O0.F0 r8 = O0.C4725e0.l(r6, r14, r9, r15, r8)
            r1 = 369318076(0x160358bc, float:1.0610095E-25)
            r9.W(r1)
            boolean r1 = r9.F(r0)
            r5 = r34
            boolean r2 = r9.V(r5)
            r1 = r1 | r2
            r4 = r25
            boolean r2 = r9.V(r4)
            r1 = r1 | r2
            java.lang.Object r2 = r9.D()
            if (r1 != 0) goto L_0x0226
            java.lang.Object r1 = r18.a()
            if (r2 != r1) goto L_0x022e
        L_0x0226:
            uk.h0 r2 = new uk.h0
            r2.<init>(r0, r4, r5)
            r9.u(r2)
        L_0x022e:
            r19 = r2
            nI.a r19 = (nI.C17631a) r19
            r9.P()
            r1 = 369346774(0x1603c8d6, float:1.0645468E-25)
            r9.W(r1)
            r2 = r28
            r3 = 2048(0x800, float:2.87E-42)
            if (r2 != r3) goto L_0x0243
            r1 = r6
            goto L_0x0244
        L_0x0243:
            r1 = 0
        L_0x0244:
            boolean r17 = r9.F(r0)
            r1 = r1 | r17
            boolean r17 = r9.V(r7)
            r1 = r1 | r17
            r15 = r35
            boolean r17 = r9.V(r15)
            r1 = r1 | r17
            java.lang.Object r3 = r9.D()
            if (r1 != 0) goto L_0x026d
            java.lang.Object r1 = r18.a()
            if (r3 != r1) goto L_0x0265
            goto L_0x026d
        L_0x0265:
            r53 = r0
            r13 = r2
            r38 = r4
            r34 = r5
            goto L_0x0288
        L_0x026d:
            uk.t0 r3 = new uk.t0
            r1 = r0
            r0 = r3
            r53 = r1
            r1 = r51
            r13 = r2
            r2 = r53
            r6 = r3
            r3 = r26
            r38 = r4
            r4 = r15
            r34 = r5
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r9.u(r6)
            r3 = r6
        L_0x0288:
            r5 = r3
            nI.l r5 = (nI.C17642l) r5
            r9.P()
            r0 = 369323942(0x16036fa6, float:1.0617326E-25)
            r9.W(r0)
            r6 = r53
            boolean r0 = r9.F(r6)
            r4 = r37
            boolean r1 = r9.V(r4)
            r0 = r0 | r1
            r3 = r32
            boolean r1 = r9.V(r3)
            r0 = r0 | r1
            java.lang.Object r1 = r9.D()
            if (r0 != 0) goto L_0x02b8
            java.lang.Object r0 = r18.a()
            if (r1 != r0) goto L_0x02b5
            goto L_0x02b8
        L_0x02b5:
            r2 = r36
            goto L_0x02c2
        L_0x02b8:
            uk.u0 r1 = new uk.u0
            r2 = r36
            r1.<init>(r6, r3, r2, r4)
            r9.u(r1)
        L_0x02c2:
            r21 = r1
            nI.l r21 = (nI.C17642l) r21
            r9.P()
            r0 = 369331898(0x16038eba, float:1.0627132E-25)
            r9.W(r0)
            r1 = r30
            r0 = r1 & 896(0x380, float:1.256E-42)
            r14 = 256(0x100, float:3.59E-43)
            r36 = r2
            if (r0 != r14) goto L_0x02db
            r14 = 1
            goto L_0x02dc
        L_0x02db:
            r14 = 0
        L_0x02dc:
            java.lang.Object r2 = r9.D()
            if (r14 != 0) goto L_0x02e8
            java.lang.Object r14 = r18.a()
            if (r2 != r14) goto L_0x02f0
        L_0x02e8:
            uk.v0 r2 = new uk.v0
            r2.<init>(r12)
            r9.u(r2)
        L_0x02f0:
            r22 = r2
            nI.l r22 = (nI.C17642l) r22
            r9.P()
            r2 = 369335160(0x16039b78, float:1.0631153E-25)
            r9.W(r2)
            r2 = 256(0x100, float:3.59E-43)
            if (r0 != r2) goto L_0x0303
            r2 = 1
            goto L_0x0304
        L_0x0303:
            r2 = 0
        L_0x0304:
            java.lang.Object r14 = r9.D()
            if (r2 != 0) goto L_0x0310
            java.lang.Object r2 = r18.a()
            if (r14 != r2) goto L_0x0318
        L_0x0310:
            uk.w0 r14 = new uk.w0
            r14.<init>(r12)
            r9.u(r14)
        L_0x0318:
            r23 = r14
            nI.a r23 = (nI.C17631a) r23
            r9.P()
            r2 = 369337966(0x1603a66e, float:1.0634612E-25)
            r9.W(r2)
            r2 = 256(0x100, float:3.59E-43)
            if (r0 != r2) goto L_0x032b
            r2 = 1
            goto L_0x032c
        L_0x032b:
            r2 = 0
        L_0x032c:
            java.lang.Object r14 = r9.D()
            if (r2 != 0) goto L_0x0338
            java.lang.Object r2 = r18.a()
            if (r14 != r2) goto L_0x0340
        L_0x0338:
            uk.x0 r14 = new uk.x0
            r14.<init>(r12)
            r9.u(r14)
        L_0x0340:
            r24 = r14
            nI.a r24 = (nI.C17631a) r24
            r9.P()
            r2 = 369340528(0x1603b070, float:1.063777E-25)
            r9.W(r2)
            r2 = 256(0x100, float:3.59E-43)
            if (r0 != r2) goto L_0x0353
            r2 = 1
            goto L_0x0354
        L_0x0353:
            r2 = 0
        L_0x0354:
            java.lang.Object r14 = r9.D()
            if (r2 != 0) goto L_0x0360
            java.lang.Object r2 = r18.a()
            if (r14 != r2) goto L_0x0368
        L_0x0360:
            uk.y0 r14 = new uk.y0
            r14.<init>(r12)
            r9.u(r14)
        L_0x0368:
            r25 = r14
            nI.a r25 = (nI.C17631a) r25
            r9.P()
            r2 = 369342882(0x1603b9a2, float:1.0640671E-25)
            r9.W(r2)
            r2 = 256(0x100, float:3.59E-43)
            if (r0 != r2) goto L_0x037b
            r2 = 1
            goto L_0x037c
        L_0x037b:
            r2 = 0
        L_0x037c:
            java.lang.Object r14 = r9.D()
            if (r2 != 0) goto L_0x0388
            java.lang.Object r2 = r18.a()
            if (r14 != r2) goto L_0x0390
        L_0x0388:
            uk.S r14 = new uk.S
            r14.<init>(r12)
            r9.u(r14)
        L_0x0390:
            r27 = r14
            nI.l r27 = (nI.C17642l) r27
            r9.P()
            r2 = 369356397(0x1603ee6d, float:1.065733E-25)
            r9.W(r2)
            r2 = 256(0x100, float:3.59E-43)
            if (r0 != r2) goto L_0x03a3
            r2 = 1
            goto L_0x03a4
        L_0x03a3:
            r2 = 0
        L_0x03a4:
            java.lang.Object r14 = r9.D()
            if (r2 != 0) goto L_0x03b0
            java.lang.Object r2 = r18.a()
            if (r14 != r2) goto L_0x03b8
        L_0x03b0:
            uk.d0 r14 = new uk.d0
            r14.<init>(r12)
            r9.u(r14)
        L_0x03b8:
            r28 = r14
            nI.l r28 = (nI.C17642l) r28
            r9.P()
            r2 = 369360508(0x1603fe7c, float:1.0662397E-25)
            r9.W(r2)
            r2 = 256(0x100, float:3.59E-43)
            if (r0 != r2) goto L_0x03cb
            r2 = 1
            goto L_0x03cc
        L_0x03cb:
            r2 = 0
        L_0x03cc:
            java.lang.Object r14 = r9.D()
            if (r2 != 0) goto L_0x03d8
            java.lang.Object r2 = r18.a()
            if (r14 != r2) goto L_0x03e0
        L_0x03d8:
            uk.o0 r14 = new uk.o0
            r14.<init>(r12)
            r9.u(r14)
        L_0x03e0:
            r29 = r14
            nI.a r29 = (nI.C17631a) r29
            r9.P()
            r2 = 369363395(0x160409c3, float:1.0665955E-25)
            r9.W(r2)
            boolean r2 = r9.V(r8)
            r14 = 256(0x100, float:3.59E-43)
            if (r0 != r14) goto L_0x03f8
            r16 = 1
            goto L_0x03fa
        L_0x03f8:
            r16 = 0
        L_0x03fa:
            r2 = r2 | r16
            java.lang.Object r14 = r9.D()
            if (r2 != 0) goto L_0x0408
            java.lang.Object r2 = r18.a()
            if (r14 != r2) goto L_0x0410
        L_0x0408:
            uk.z0 r14 = new uk.z0
            r14.<init>(r8, r12)
            r9.u(r14)
        L_0x0410:
            nI.l r14 = (nI.C17642l) r14
            r2 = 0
            r9.P()
            r16 = r1 & 126(0x7e, float:1.77E-43)
            r20 = 6
            int r1 = r1 >> 6
            r1 = r1 & 896(0x380, float:1.256E-42)
            r1 = r16 | r1
            r16 = r1 | r13
            r17 = 0
            r1 = r0
            r0 = r48
            r39 = r1
            r1 = r49
            r30 = r36
            r2 = r52
            r40 = r3
            r3 = r51
            r37 = r4
            r4 = r19
            r41 = r6
            r31 = 1
            r6 = r21
            r53 = r7
            r7 = r22
            r32 = r8
            r8 = r23
            r33 = r9
            r9 = r24
            r10 = r25
            r11 = r27
            r12 = r28
            r42 = r13
            r13 = r29
            r43 = r15
            r25 = r20
            r15 = r33
            C2(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r2 = L1(r34)
            boolean r3 = r48.k()
            r0 = 369374223(0x1604340f, float:1.0679302E-25)
            r15.W(r0)
            r14 = r41
            boolean r0 = r15.F(r14)
            r13 = r38
            boolean r1 = r15.V(r13)
            r0 = r0 | r1
            r1 = r34
            boolean r4 = r15.V(r1)
            r0 = r0 | r4
            java.lang.Object r4 = r15.D()
            if (r0 != 0) goto L_0x048a
            java.lang.Object r0 = r18.a()
            if (r4 != r0) goto L_0x0492
        L_0x048a:
            uk.K0 r4 = new uk.K0
            r4.<init>(r14, r13, r1)
            r15.u(r4)
        L_0x0492:
            nI.a r4 = (nI.C17631a) r4
            r15.P()
            r0 = 369376572(0x16043d3c, float:1.0682197E-25)
            r15.W(r0)
            boolean r0 = r15.F(r14)
            boolean r5 = r15.V(r13)
            r0 = r0 | r5
            boolean r5 = r15.V(r1)
            r0 = r0 | r5
            r11 = r39
            r12 = 256(0x100, float:3.59E-43)
            if (r11 != r12) goto L_0x04b4
            r5 = r31
            goto L_0x04b5
        L_0x04b4:
            r5 = 0
        L_0x04b5:
            r0 = r0 | r5
            java.lang.Object r5 = r15.D()
            if (r0 != 0) goto L_0x04c6
            java.lang.Object r0 = r18.a()
            if (r5 != r0) goto L_0x04c3
            goto L_0x04c6
        L_0x04c3:
            r0 = r50
            goto L_0x04d0
        L_0x04c6:
            uk.V0 r5 = new uk.V0
            r0 = r50
            r5.<init>(r0, r14, r13, r1)
            r15.u(r5)
        L_0x04d0:
            nI.a r5 = (nI.C17631a) r5
            r15.P()
            r6 = 369381308(0x16044fbc, float:1.0688035E-25)
            r15.W(r6)
            boolean r6 = r15.F(r14)
            boolean r7 = r15.V(r13)
            r6 = r6 | r7
            boolean r7 = r15.V(r1)
            r6 = r6 | r7
            if (r11 != r12) goto L_0x04ee
            r7 = r31
            goto L_0x04ef
        L_0x04ee:
            r7 = 0
        L_0x04ef:
            r6 = r6 | r7
            java.lang.Object r7 = r15.D()
            if (r6 != 0) goto L_0x04fc
            java.lang.Object r6 = r18.a()
            if (r7 != r6) goto L_0x0504
        L_0x04fc:
            uk.g1 r7 = new uk.g1
            r7.<init>(r0, r14, r13, r1)
            r15.u(r7)
        L_0x0504:
            r6 = r7
            nI.a r6 = (nI.C17631a) r6
            r15.P()
            r7 = 369386304(0x16046340, float:1.0694193E-25)
            r15.W(r7)
            boolean r7 = r15.F(r14)
            boolean r8 = r15.V(r13)
            r7 = r7 | r8
            boolean r8 = r15.V(r1)
            r7 = r7 | r8
            if (r11 != r12) goto L_0x0523
            r8 = r31
            goto L_0x0524
        L_0x0523:
            r8 = 0
        L_0x0524:
            r7 = r7 | r8
            java.lang.Object r8 = r15.D()
            if (r7 != 0) goto L_0x0531
            java.lang.Object r7 = r18.a()
            if (r8 != r7) goto L_0x0539
        L_0x0531:
            uk.q1 r8 = new uk.q1
            r8.<init>(r0, r14, r13, r1)
            r15.u(r8)
        L_0x0539:
            r7 = r8
            nI.a r7 = (nI.C17631a) r7
            r15.P()
            r8 = 369391236(0x16047684, float:1.0700272E-25)
            r15.W(r8)
            boolean r8 = r15.F(r14)
            boolean r9 = r15.V(r13)
            r8 = r8 | r9
            boolean r9 = r15.V(r1)
            r8 = r8 | r9
            if (r11 != r12) goto L_0x0558
            r9 = r31
            goto L_0x0559
        L_0x0558:
            r9 = 0
        L_0x0559:
            r8 = r8 | r9
            java.lang.Object r9 = r15.D()
            if (r8 != 0) goto L_0x0566
            java.lang.Object r8 = r18.a()
            if (r9 != r8) goto L_0x056e
        L_0x0566:
            uk.r1 r9 = new uk.r1
            r9.<init>(r0, r14, r13, r1)
            r15.u(r9)
        L_0x056e:
            r8 = r9
            nI.a r8 = (nI.C17631a) r8
            r15.P()
            r9 = 369395942(0x160488e6, float:1.0706073E-25)
            r15.W(r9)
            boolean r9 = r15.V(r1)
            java.lang.Object r10 = r15.D()
            if (r9 != 0) goto L_0x058a
            java.lang.Object r9 = r18.a()
            if (r10 != r9) goto L_0x0592
        L_0x058a:
            uk.H r10 = new uk.H
            r10.<init>(r1)
            r15.u(r10)
        L_0x0592:
            r9 = r10
            nI.a r9 = (nI.C17631a) r9
            r15.P()
            r16 = 0
            r17 = 512(0x200, float:7.175E-43)
            r10 = 0
            r1 = r13
            r44 = r11
            r11 = r15
            r12 = r16
            r0 = r13
            r13 = r17
            vk.J.h(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r7 = q2(r37)
            r1 = 369401876(0x1604a014, float:1.0713387E-25)
            r15.W(r1)
            boolean r1 = r15.F(r14)
            r8 = r40
            boolean r2 = r15.V(r8)
            r1 = r1 | r2
            boolean r2 = r15.V(r0)
            r1 = r1 | r2
            r9 = r37
            boolean r2 = r15.V(r9)
            r1 = r1 | r2
            java.lang.Object r2 = r15.D()
            if (r1 != 0) goto L_0x05d6
            java.lang.Object r1 = r18.a()
            if (r2 != r1) goto L_0x05ea
        L_0x05d6:
            uk.J r2 = new uk.J
            r19 = r2
            r20 = r14
            r21 = r8
            r22 = r0
            r23 = r30
            r24 = r9
            r19.<init>(r20, r21, r22, r23, r24)
            r15.u(r2)
        L_0x05ea:
            r10 = r2
            nI.a r10 = (nI.C17631a) r10
            r15.P()
            r1 = 369404422(0x1604aa06, float:1.0716525E-25)
            r15.W(r1)
            boolean r1 = r15.F(r14)
            boolean r2 = r15.V(r8)
            r1 = r1 | r2
            boolean r2 = r15.V(r0)
            r1 = r1 | r2
            boolean r2 = r15.V(r9)
            r1 = r1 | r2
            r12 = r44
            r13 = 256(0x100, float:3.59E-43)
            if (r12 != r13) goto L_0x0612
            r3 = r31
            goto L_0x0613
        L_0x0612:
            r3 = 0
        L_0x0613:
            r1 = r1 | r3
            java.lang.Object r2 = r15.D()
            if (r1 != 0) goto L_0x0623
            java.lang.Object r1 = r18.a()
            if (r2 != r1) goto L_0x0621
            goto L_0x0623
        L_0x0621:
            r13 = r0
            goto L_0x0637
        L_0x0623:
            uk.K r11 = new uk.K
            r6 = r0
            r0 = r11
            r1 = r30
            r2 = r50
            r3 = r14
            r4 = r8
            r5 = r6
            r13 = r6
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r15.u(r11)
            r2 = r11
        L_0x0637:
            r11 = r2
            nI.a r11 = (nI.C17631a) r11
            r15.P()
            r0 = 369411558(0x1604c5e6, float:1.0725321E-25)
            r15.W(r0)
            boolean r0 = r15.F(r14)
            boolean r1 = r15.V(r8)
            r0 = r0 | r1
            boolean r1 = r15.V(r13)
            r0 = r0 | r1
            boolean r1 = r15.V(r9)
            r0 = r0 | r1
            r1 = 256(0x100, float:3.59E-43)
            if (r12 != r1) goto L_0x065d
            r3 = r31
            goto L_0x065e
        L_0x065d:
            r3 = 0
        L_0x065e:
            r0 = r0 | r3
            java.lang.Object r1 = r15.D()
            if (r0 != 0) goto L_0x066f
            java.lang.Object r0 = r18.a()
            if (r1 != r0) goto L_0x066c
            goto L_0x066f
        L_0x066c:
            r16 = r11
            goto L_0x0684
        L_0x066f:
            uk.L r6 = new uk.L
            r0 = r6
            r1 = r30
            r2 = r50
            r3 = r14
            r4 = r8
            r5 = r13
            r16 = r11
            r11 = r6
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r15.u(r11)
            r1 = r11
        L_0x0684:
            r11 = r1
            nI.a r11 = (nI.C17631a) r11
            r15.P()
            r0 = 369419877(0x1604e665, float:1.0735575E-25)
            r15.W(r0)
            boolean r0 = r15.F(r14)
            boolean r1 = r15.V(r8)
            r0 = r0 | r1
            boolean r1 = r15.V(r13)
            r0 = r0 | r1
            boolean r1 = r15.V(r9)
            r0 = r0 | r1
            r1 = 256(0x100, float:3.59E-43)
            if (r12 != r1) goto L_0x06aa
            r3 = r31
            goto L_0x06ab
        L_0x06aa:
            r3 = 0
        L_0x06ab:
            r0 = r0 | r3
            java.lang.Object r1 = r15.D()
            if (r0 != 0) goto L_0x06bc
            java.lang.Object r0 = r18.a()
            if (r1 != r0) goto L_0x06b9
            goto L_0x06bc
        L_0x06b9:
            r38 = r13
            goto L_0x06d1
        L_0x06bc:
            uk.M r6 = new uk.M
            r0 = r6
            r1 = r30
            r2 = r50
            r3 = r14
            r4 = r8
            r5 = r13
            r38 = r13
            r13 = r6
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r15.u(r13)
            r1 = r13
        L_0x06d1:
            r6 = r1
            nI.a r6 = (nI.C17631a) r6
            r15.P()
            r0 = 369426602(0x160500aa, float:1.0743864E-25)
            r15.W(r0)
            boolean r0 = r15.V(r9)
            java.lang.Object r1 = r15.D()
            if (r0 != 0) goto L_0x06ed
            java.lang.Object r0 = r18.a()
            if (r1 != r0) goto L_0x06f5
        L_0x06ed:
            uk.N r1 = new uk.N
            r1.<init>(r9)
            r15.u(r1)
        L_0x06f5:
            r0 = r1
            nI.a r0 = (nI.C17631a) r0
            r15.P()
            r13 = 0
            r17 = 128(0x80, float:1.794E-43)
            r9 = 0
            r1 = r8
            r2 = r7
            r3 = r10
            r4 = r16
            r5 = r11
            r7 = r0
            r8 = r9
            r9 = r15
            r10 = r13
            r11 = r17
            vk.N.h(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            pk.s$j r1 = r48.y()
            r0 = 369431379(0x16051353, float:1.0749752E-25)
            r15.W(r0)
            r0 = 256(0x100, float:3.59E-43)
            if (r12 != r0) goto L_0x071f
            r3 = r31
            goto L_0x0720
        L_0x071f:
            r3 = 0
        L_0x0720:
            java.lang.Object r0 = r15.D()
            if (r3 != 0) goto L_0x0730
            java.lang.Object r2 = r18.a()
            if (r0 != r2) goto L_0x072d
            goto L_0x0730
        L_0x072d:
            r13 = r50
            goto L_0x073a
        L_0x0730:
            uk.O r0 = new uk.O
            r13 = r50
            r0.<init>(r13)
            r15.u(r0)
        L_0x073a:
            r2 = r0
            nI.l r2 = (nI.C17642l) r2
            r15.P()
            r0 = 369433744(0x16051c90, float:1.0752667E-25)
            r15.W(r0)
            r0 = 256(0x100, float:3.59E-43)
            if (r12 != r0) goto L_0x074d
            r3 = r31
            goto L_0x074e
        L_0x074d:
            r3 = 0
        L_0x074e:
            java.lang.Object r0 = r15.D()
            if (r3 != 0) goto L_0x075a
            java.lang.Object r3 = r18.a()
            if (r0 != r3) goto L_0x0762
        L_0x075a:
            uk.P r0 = new uk.P
            r0.<init>(r13)
            r15.u(r0)
        L_0x0762:
            r3 = r0
            nI.a r3 = (nI.C17631a) r3
            r15.P()
            r0 = 369435856(0x160524d0, float:1.075527E-25)
            r15.W(r0)
            r0 = 256(0x100, float:3.59E-43)
            if (r12 != r0) goto L_0x0775
            r0 = r31
            goto L_0x0776
        L_0x0775:
            r0 = 0
        L_0x0776:
            java.lang.Object r4 = r15.D()
            if (r0 != 0) goto L_0x0782
            java.lang.Object r0 = r18.a()
            if (r4 != r0) goto L_0x078a
        L_0x0782:
            uk.Q r4 = new uk.Q
            r4.<init>(r13)
            r15.u(r4)
        L_0x078a:
            nI.a r4 = (nI.C17631a) r4
            r15.P()
            r6 = 0
            r5 = r15
            vk.e1.d(r1, r2, r3, r4, r5, r6)
            pk.s$e r1 = r48.h()
            r0 = 369440750(0x160537ee, float:1.0761303E-25)
            r15.W(r0)
            r0 = 256(0x100, float:3.59E-43)
            if (r12 != r0) goto L_0x07a5
            r3 = r31
            goto L_0x07a6
        L_0x07a5:
            r3 = 0
        L_0x07a6:
            java.lang.Object r0 = r15.D()
            if (r3 != 0) goto L_0x07b2
            java.lang.Object r2 = r18.a()
            if (r0 != r2) goto L_0x07ba
        L_0x07b2:
            uk.T r0 = new uk.T
            r0.<init>(r13)
            r15.u(r0)
        L_0x07ba:
            r2 = r0
            nI.a r2 = (nI.C17631a) r2
            r15.P()
            r0 = 369442800(0x16053ff0, float:1.076383E-25)
            r15.W(r0)
            r0 = 256(0x100, float:3.59E-43)
            if (r12 != r0) goto L_0x07cd
            r3 = r31
            goto L_0x07ce
        L_0x07cd:
            r3 = 0
        L_0x07ce:
            java.lang.Object r0 = r15.D()
            if (r3 != 0) goto L_0x07da
            java.lang.Object r3 = r18.a()
            if (r0 != r3) goto L_0x07e2
        L_0x07da:
            uk.U r0 = new uk.U
            r0.<init>(r13)
            r15.u(r0)
        L_0x07e2:
            r3 = r0
            nI.a r3 = (nI.C17631a) r3
            r15.P()
            r0 = 369444997(0x16054885, float:1.0766538E-25)
            r15.W(r0)
            r11 = r42
            r0 = 2048(0x800, float:2.87E-42)
            if (r11 != r0) goto L_0x07f7
            r4 = r31
            goto L_0x07f8
        L_0x07f7:
            r4 = 0
        L_0x07f8:
            java.lang.Object r5 = r15.D()
            if (r4 != 0) goto L_0x0808
            java.lang.Object r4 = r18.a()
            if (r5 != r4) goto L_0x0805
            goto L_0x0808
        L_0x0805:
            r10 = r51
            goto L_0x0812
        L_0x0808:
            uk.W r5 = new uk.W
            r10 = r51
            r5.<init>(r10)
            r15.u(r5)
        L_0x0812:
            r4 = r5
            nI.a r4 = (nI.C17631a) r4
            r15.P()
            r6 = 0
            r5 = r15
            vk.C12170s.b(r1, r2, r3, r4, r5, r6)
            r1 = 369448056(0x16055478, float:1.0770308E-25)
            r15.W(r1)
            boolean r1 = r48.F()
            if (r1 == 0) goto L_0x08e5
            int r1 = ik.c.f98319K
            r9 = 0
            java.lang.String r1 = J1.j.b(r1, r15, r9)
            int r2 = ik.c.f98318J
            java.lang.String r2 = J1.j.b(r2, r15, r9)
            r3 = 369457138(0x160577f2, float:1.0781503E-25)
            r15.W(r3)
            r3 = 256(0x100, float:3.59E-43)
            if (r12 != r3) goto L_0x0843
            r3 = r31
            goto L_0x0844
        L_0x0843:
            r3 = r9
        L_0x0844:
            java.lang.Object r4 = r15.D()
            if (r3 != 0) goto L_0x0850
            java.lang.Object r3 = r18.a()
            if (r4 != r3) goto L_0x0858
        L_0x0850:
            uk.X r4 = new uk.X
            r4.<init>(r13)
            r15.u(r4)
        L_0x0858:
            nI.a r4 = (nI.C17631a) r4
            r15.P()
            SC.W1 r3 = new SC.W1
            r3.<init>(r2, r4)
            int r2 = Oo.b.f84492R4
            java.lang.String r2 = J1.j.b(r2, r15, r9)
            r4 = 369463289(0x16058ff9, float:1.0789084E-25)
            r15.W(r4)
            r4 = 256(0x100, float:3.59E-43)
            if (r12 != r4) goto L_0x0875
            r4 = r31
            goto L_0x0876
        L_0x0875:
            r4 = r9
        L_0x0876:
            java.lang.Object r5 = r15.D()
            if (r4 != 0) goto L_0x0882
            java.lang.Object r4 = r18.a()
            if (r5 != r4) goto L_0x088a
        L_0x0882:
            uk.Y r5 = new uk.Y
            r5.<init>(r13)
            r15.u(r5)
        L_0x088a:
            nI.a r5 = (nI.C17631a) r5
            r15.P()
            SC.W1 r4 = new SC.W1
            r4.<init>(r2, r5)
            r2 = 369466457(0x16059c59, float:1.0792989E-25)
            r15.W(r2)
            r2 = 256(0x100, float:3.59E-43)
            if (r12 != r2) goto L_0x08a1
            r2 = r31
            goto L_0x08a2
        L_0x08a1:
            r2 = r9
        L_0x08a2:
            java.lang.Object r5 = r15.D()
            if (r2 != 0) goto L_0x08ae
            java.lang.Object r2 = r18.a()
            if (r5 != r2) goto L_0x08b6
        L_0x08ae:
            uk.Z r5 = new uk.Z
            r5.<init>(r13)
            r15.u(r5)
        L_0x08b6:
            nI.a r5 = (nI.C17631a) r5
            r15.P()
            uk.a r2 = uk.C12009a.f103533a
            nI.p r8 = r2.a()
            int r2 = SC.W1.f116045c
            int r6 = r2 << 3
            r7 = 12582912(0xc00000, float:1.7632415E-38)
            r6 = r6 | r7
            int r2 = r2 << 6
            r16 = r6 | r2
            r17 = 112(0x70, float:1.57E-43)
            r6 = 0
            r7 = 0
            r19 = 0
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r19
            r0 = r9
            r9 = r15
            r10 = r16
            r45 = r11
            r11 = r17
            SC.Z1.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x08e8
        L_0x08e5:
            r45 = r11
            r0 = 0
        L_0x08e8:
            r15.P()
            pk.s$m r1 = r48.C()
            r2 = 369472239(0x1605b2ef, float:1.0800116E-25)
            r15.W(r2)
            r2 = 256(0x100, float:3.59E-43)
            if (r12 != r2) goto L_0x08fc
            r3 = r31
            goto L_0x08fd
        L_0x08fc:
            r3 = r0
        L_0x08fd:
            java.lang.Object r2 = r15.D()
            if (r3 != 0) goto L_0x0909
            java.lang.Object r3 = r18.a()
            if (r2 != r3) goto L_0x0911
        L_0x0909:
            uk.a0 r2 = new uk.a0
            r2.<init>(r13)
            r15.u(r2)
        L_0x0911:
            nI.a r2 = (nI.C17631a) r2
            r15.P()
            vk.i1.b(r1, r2, r15, r0)
            pk.s$l r1 = r48.B()
            r2 = 369476527(0x1605c3af, float:1.0805401E-25)
            r15.W(r2)
            r2 = 256(0x100, float:3.59E-43)
            if (r12 != r2) goto L_0x092a
            r3 = r31
            goto L_0x092b
        L_0x092a:
            r3 = r0
        L_0x092b:
            java.lang.Object r2 = r15.D()
            if (r3 != 0) goto L_0x0937
            java.lang.Object r3 = r18.a()
            if (r2 != r3) goto L_0x093f
        L_0x0937:
            uk.b0 r2 = new uk.b0
            r2.<init>(r13)
            r15.u(r2)
        L_0x093f:
            nI.a r2 = (nI.C17631a) r2
            r15.P()
            vk.g1.b(r1, r2, r15, r0)
            pk.s$c r1 = r48.f()
            r2 = 369481653(0x1605d7b5, float:1.081172E-25)
            r15.W(r2)
            r2 = 256(0x100, float:3.59E-43)
            if (r12 != r2) goto L_0x0958
            r3 = r31
            goto L_0x0959
        L_0x0958:
            r3 = r0
        L_0x0959:
            java.lang.Object r2 = r15.D()
            if (r3 != 0) goto L_0x0965
            java.lang.Object r3 = r18.a()
            if (r2 != r3) goto L_0x096d
        L_0x0965:
            uk.c0 r2 = new uk.c0
            r2.<init>(r13)
            r15.u(r2)
        L_0x096d:
            nI.p r2 = (nI.p) r2
            r15.P()
            r3 = 369485912(0x1605e858, float:1.0816969E-25)
            r15.W(r3)
            r11 = 256(0x100, float:3.59E-43)
            if (r12 != r11) goto L_0x097f
            r3 = r31
            goto L_0x0980
        L_0x097f:
            r3 = r0
        L_0x0980:
            java.lang.Object r4 = r15.D()
            if (r3 != 0) goto L_0x098c
            java.lang.Object r3 = r18.a()
            if (r4 != r3) goto L_0x0994
        L_0x098c:
            uk.e0 r4 = new uk.e0
            r4.<init>(r13)
            r15.u(r4)
        L_0x0994:
            nI.a r4 = (nI.C17631a) r4
            r15.P()
            vk.C12139c.c(r1, r2, r4, r15, r0)
            boolean r7 = C1(r53)
            int r1 = r49.b()
            boolean r8 = Xo.g.b(r1)
            pk.l r9 = E1(r26)
            pk.l r1 = E1(r26)
            if (r1 == 0) goto L_0x09db
            KJ.c r2 = r48.v()
            java.util.Iterator r2 = r2.iterator()
        L_0x09ba:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x09d6
            java.lang.Object r3 = r2.next()
            r4 = r3
            pk.s$o r4 = (pk.s.o) r4
            java.lang.String r4 = r4.b()
            java.lang.String r5 = r1.j()
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r5)
            if (r4 == 0) goto L_0x09ba
            goto L_0x09d7
        L_0x09d6:
            r3 = 0
        L_0x09d7:
            pk.s$o r3 = (pk.s.o) r3
            r10 = r3
            goto L_0x09dc
        L_0x09db:
            r10 = 0
        L_0x09dc:
            r1 = 369500806(0x16062286, float:1.0835327E-25)
            r15.W(r1)
            boolean r1 = r15.F(r14)
            r6 = r43
            boolean r2 = r15.V(r6)
            r1 = r1 | r2
            r5 = r38
            boolean r2 = r15.V(r5)
            r1 = r1 | r2
            r4 = r53
            boolean r2 = r15.V(r4)
            r1 = r1 | r2
            java.lang.Object r2 = r15.D()
            if (r1 != 0) goto L_0x0a09
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x0a1d
        L_0x0a09:
            uk.f0 r2 = new uk.f0
            r19 = r2
            r20 = r14
            r21 = r6
            r22 = r5
            r23 = r4
            r24 = r26
            r19.<init>(r20, r21, r22, r23, r24)
            r15.u(r2)
        L_0x0a1d:
            r16 = r2
            nI.a r16 = (nI.C17631a) r16
            r15.P()
            r1 = 369502844(0x16062a7c, float:1.083784E-25)
            r15.W(r1)
            boolean r1 = r15.F(r14)
            boolean r2 = r15.V(r6)
            r1 = r1 | r2
            boolean r2 = r15.V(r5)
            r1 = r1 | r2
            boolean r2 = r15.V(r4)
            r1 = r1 | r2
            r3 = r45
            r2 = 2048(0x800, float:2.87E-42)
            if (r3 != r2) goto L_0x0a46
            r17 = r31
            goto L_0x0a48
        L_0x0a46:
            r17 = r0
        L_0x0a48:
            r1 = r1 | r17
            java.lang.Object r0 = r15.D()
            if (r1 != 0) goto L_0x0a63
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
            if (r0 != r1) goto L_0x0a59
            goto L_0x0a63
        L_0x0a59:
            r53 = r4
            r13 = r5
            r17 = r10
            r39 = r12
            r12 = r3
            r10 = r6
            goto L_0x0a81
        L_0x0a63:
            uk.g0 r1 = new uk.g0
            r0 = r1
            r11 = r1
            r1 = r51
            r13 = r2
            r2 = r14
            r39 = r12
            r12 = r3
            r3 = r6
            r53 = r4
            r4 = r5
            r13 = r5
            r5 = r53
            r17 = r10
            r10 = r6
            r6 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r15.u(r11)
            r0 = r11
        L_0x0a81:
            r11 = r0
            nI.l r11 = (nI.C17642l) r11
            r15.P()
            r0 = 369508641(0x16064121, float:1.0844985E-25)
            r15.W(r0)
            boolean r0 = r15.F(r14)
            boolean r1 = r15.V(r10)
            r0 = r0 | r1
            boolean r1 = r15.V(r13)
            r0 = r0 | r1
            r6 = r53
            boolean r1 = r15.V(r6)
            r0 = r0 | r1
            r1 = 2048(0x800, float:2.87E-42)
            if (r12 != r1) goto L_0x0aa9
            r3 = r31
            goto L_0x0aaa
        L_0x0aa9:
            r3 = 0
        L_0x0aaa:
            r0 = r0 | r3
            java.lang.Object r1 = r15.D()
            if (r0 != 0) goto L_0x0abc
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x0aba
            goto L_0x0abc
        L_0x0aba:
            r14 = r6
            goto L_0x0ad0
        L_0x0abc:
            uk.i0 r5 = new uk.i0
            r0 = r5
            r1 = r51
            r2 = r14
            r3 = r10
            r4 = r13
            r13 = r5
            r5 = r6
            r14 = r6
            r6 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r15.u(r13)
            r1 = r13
        L_0x0ad0:
            r0 = r1
            nI.l r0 = (nI.C17642l) r0
            r15.P()
            r1 = 369523297(0x16067a61, float:1.086305E-25)
            r15.W(r1)
            r13 = 2048(0x800, float:2.87E-42)
            if (r12 != r13) goto L_0x0ae3
            r3 = r31
            goto L_0x0ae4
        L_0x0ae3:
            r3 = 0
        L_0x0ae4:
            java.lang.Object r1 = r15.D()
            if (r3 != 0) goto L_0x0af6
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r1 != r2) goto L_0x0af3
            goto L_0x0af6
        L_0x0af3:
            r6 = r51
            goto L_0x0b00
        L_0x0af6:
            uk.j0 r1 = new uk.j0
            r6 = r51
            r1.<init>(r6)
            r15.u(r1)
        L_0x0b00:
            r18 = r1
            nI.l r18 = (nI.C17642l) r18
            r15.P()
            r1 = 369521191(0x16067227, float:1.0860454E-25)
            r15.W(r1)
            boolean r1 = r15.V(r14)
            java.lang.Object r2 = r15.D()
            if (r1 != 0) goto L_0x0b1f
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x0b27
        L_0x0b1f:
            uk.k0 r2 = new uk.k0
            r2.<init>(r14)
            r15.u(r2)
        L_0x0b27:
            r14 = r2
            nI.a r14 = (nI.C17631a) r14
            r15.P()
            r19 = 0
            r20 = 1024(0x400, float:1.435E-42)
            r21 = 0
            r22 = 0
            r1 = r7
            r2 = r10
            r3 = r8
            r4 = r9
            r5 = r17
            r6 = r16
            r7 = r11
            r8 = r0
            r9 = r18
            r0 = r51
            r10 = r14
            r14 = 256(0x100, float:3.59E-43)
            r11 = r21
            r46 = r12
            r47 = r39
            r12 = r15
            r13 = r22
            r14 = r19
            r0 = r15
            r15 = r20
            vk.E0.n(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            pk.s$n r1 = r48.H()
            r2 = 369530607(0x160696ef, float:1.087206E-25)
            r0.W(r2)
            r3 = r47
            r2 = 256(0x100, float:3.59E-43)
            if (r3 != r2) goto L_0x0b6a
            r4 = r31
            goto L_0x0b6b
        L_0x0b6a:
            r4 = 0
        L_0x0b6b:
            java.lang.Object r5 = r0.D()
            if (r4 != 0) goto L_0x0b7d
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r5 != r4) goto L_0x0b7a
            goto L_0x0b7d
        L_0x0b7a:
            r13 = r50
            goto L_0x0b87
        L_0x0b7d:
            uk.l0 r5 = new uk.l0
            r13 = r50
            r5.<init>(r13)
            r0.u(r5)
        L_0x0b87:
            r4 = r5
            nI.a r4 = (nI.C17631a) r4
            r0.P()
            r5 = 369533137(0x1606a0d1, float:1.0875179E-25)
            r0.W(r5)
            r15 = r46
            r14 = 2048(0x800, float:2.87E-42)
            if (r15 != r14) goto L_0x0b9c
            r5 = r31
            goto L_0x0b9d
        L_0x0b9c:
            r5 = 0
        L_0x0b9d:
            java.lang.Object r6 = r0.D()
            if (r5 != 0) goto L_0x0bb0
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x0bac
            goto L_0x0bb0
        L_0x0bac:
            r12 = r0
            r0 = r51
            goto L_0x0bbb
        L_0x0bb0:
            uk.m0 r6 = new uk.m0
            r12 = r0
            r0 = r51
            r6.<init>(r0)
            r12.u(r6)
        L_0x0bbb:
            r5 = r6
            nI.l r5 = (nI.C17642l) r5
            r12.P()
            r6 = 369551634(0x1606e912, float:1.0897978E-25)
            r12.W(r6)
            if (r3 != r2) goto L_0x0bcc
            r6 = r31
            goto L_0x0bcd
        L_0x0bcc:
            r6 = 0
        L_0x0bcd:
            java.lang.Object r7 = r12.D()
            if (r6 != 0) goto L_0x0bdb
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x0be3
        L_0x0bdb:
            uk.n0 r7 = new uk.n0
            r7.<init>(r13)
            r12.u(r7)
        L_0x0be3:
            r6 = r7
            nI.l r6 = (nI.C17642l) r6
            r12.P()
            r7 = 369562024(0x160711a8, float:1.0910784E-25)
            r12.W(r7)
            if (r15 != r14) goto L_0x0bf4
            r7 = r31
            goto L_0x0bf5
        L_0x0bf4:
            r7 = 0
        L_0x0bf5:
            java.lang.Object r8 = r12.D()
            if (r7 != 0) goto L_0x0c03
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x0c0b
        L_0x0c03:
            uk.p0 r8 = new uk.p0
            r8.<init>(r0)
            r12.u(r8)
        L_0x0c0b:
            r7 = r8
            nI.l r7 = (nI.C17642l) r7
            r12.P()
            r8 = 369546221(0x1606d3ed, float:1.0891306E-25)
            r12.W(r8)
            if (r3 != r2) goto L_0x0c1c
            r8 = r31
            goto L_0x0c1d
        L_0x0c1c:
            r8 = 0
        L_0x0c1d:
            java.lang.Object r9 = r12.D()
            if (r8 != 0) goto L_0x0c2b
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r9 != r8) goto L_0x0c33
        L_0x0c2b:
            uk.q0 r9 = new uk.q0
            r9.<init>(r13)
            r12.u(r9)
        L_0x0c33:
            r8 = r9
            nI.a r8 = (nI.C17631a) r8
            r12.P()
            r9 = 369548515(0x1606dce3, float:1.0894133E-25)
            r12.W(r9)
            if (r3 != r2) goto L_0x0c44
            r3 = r31
            goto L_0x0c45
        L_0x0c44:
            r3 = 0
        L_0x0c45:
            java.lang.Object r2 = r12.D()
            if (r3 != 0) goto L_0x0c53
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r2 != r3) goto L_0x0c5b
        L_0x0c53:
            uk.r0 r2 = new uk.r0
            r2.<init>(r13)
            r12.u(r2)
        L_0x0c5b:
            r9 = r2
            nI.a r9 = (nI.C17631a) r9
            r12.P()
            r11 = 0
            r16 = 256(0x100, float:3.59E-43)
            r10 = 0
            r2 = r32
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r12
            r14 = r12
            r12 = r16
            tk.g.e(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            pk.s$k r1 = r48.A()
            r2 = 369567132(0x1607259c, float:1.091708E-25)
            r14.W(r2)
            r2 = r48
            boolean r3 = r14.F(r2)
            r4 = 2048(0x800, float:2.87E-42)
            if (r15 != r4) goto L_0x0c8a
            goto L_0x0c8c
        L_0x0c8a:
            r31 = 0
        L_0x0c8c:
            r3 = r3 | r31
            java.lang.Object r4 = r14.D()
            if (r3 != 0) goto L_0x0c9c
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x0ca5
        L_0x0c9c:
            uk.s1$h r4 = new uk.s1$h
            r3 = 0
            r4.<init>(r2, r0, r3)
            r14.u(r4)
        L_0x0ca5:
            nI.p r4 = (nI.p) r4
            r14.P()
            r3 = 0
            U0.P.g(r1, r4, r14, r3)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0cb7
            U0.C4895p.R()
        L_0x0cb7:
            U0.Y0 r7 = r14.n()
            if (r7 == 0) goto L_0x0cd2
            uk.s0 r8 = new uk.s0
            r0 = r8
            r1 = r48
            r2 = r49
            r3 = r50
            r4 = r51
            r5 = r52
            r6 = r54
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0cd2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uk.s1.b1(pk.s, T0.c, nI.l, nI.l, boolean, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N b2(C17642l lVar) {
        lVar.invoke(C11724c.C.f100894a);
        return C16807N.f139792a;
    }

    private static final void c1(Q q10, O0.F0 f02, C4899r0<Boolean> r0Var, C17631a<C16807N> aVar) {
        C16314k.d(q10, (C17168i) null, (T) null, new i(f02, (C17164e<? super i>) null), 3, (Object) null).s(new C12017c1(f02, aVar, r0Var));
    }

    /* access modifiers changed from: private */
    public static final C16807N c2(C17642l lVar, Q q10, O0.F0 f02, C4899r0 r0Var) {
        c1(q10, f02, r0Var, new L0(lVar));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N d1(O0.F0 f02, C17631a aVar, C4899r0 r0Var, Throwable th2) {
        if (!f02.l()) {
            R1(r0Var, false);
            aVar.invoke();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N d2(C17642l lVar) {
        lVar.invoke(C11724c.C11734k.f100927a);
        return C16807N.f139792a;
    }

    private static final void e1(Q q10, O0.F0 f02, O0.F0 f03, C4899r0<String> r0Var, C4899r0<Boolean> r0Var2, C17631a<C16807N> aVar) {
        C16314k.d(q10, (C17168i) null, (T) null, new j(f02, (C17164e<? super j>) null), 3, (Object) null).s(new Y0(f03, aVar, r0Var, r0Var2));
    }

    /* access modifiers changed from: private */
    public static final C16807N e2(C4899r0 r0Var) {
        R1(r0Var, false);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void e3(C5968C c10, long j10, String str, boolean z10, boolean z11, int i10, androidx.compose.ui.d dVar) {
        C12134F.b bVar = C12134F.f104492b;
        C5968C c11 = c10;
        c10.d(C12134F.a.f104494c.f104493a, new i1(i10), "BackLayer", c1.c.c(1975724619, true, new n(z11, z10, j10, dVar, str)));
    }

    /* access modifiers changed from: private */
    public static final C16807N f1(O0.F0 f02, C17631a aVar, C4899r0 r0Var, C4899r0 r0Var2, Throwable th2) {
        if (!f02.l()) {
            aVar.invoke();
            t1(r0Var, (String) null);
            w2(r0Var2, false);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f2(Q q10, O0.F0 f02, O0.F0 f03, C4899r0 r0Var, C4899r0 r0Var2) {
        e1(q10, f02, f03, r0Var, r0Var2, new H0());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C5979c f3(int i10, C5993q qVar) {
        C17542s.j(qVar, "$this$item");
        return C5979c.a(C5972G.a(i10));
    }

    private static final void g1(Q q10, O0.F0 f02, O0.F0 f03, C4899r0<Boolean> r0Var, C4899r0<pk.l> r0Var2, C17631a<C16807N> aVar) {
        C16314k.d(q10, (C17168i) null, (T) null, new k(f02, (C17164e<? super k>) null), 3, (Object) null).s(new e1(f03, aVar, r0Var, r0Var2));
    }

    /* access modifiers changed from: private */
    public static final C16807N g2() {
        return C16807N.f139792a;
    }

    public static final float g3() {
        return f103676a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h1(O0.F0 f02, C17631a aVar, C4899r0 r0Var, C4899r0 r0Var2, Throwable th2) {
        if (!f02.l()) {
            D1(r0Var, false);
            aVar.invoke();
            G1(r0Var2, (pk.l) null);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h2(C4899r0 r0Var, C17642l lVar, Q q10, O0.F0 f02, O0.F0 f03, C4899r0 r0Var2) {
        e1(q10, f02, f03, r0Var, r0Var2, new E0(r0Var, lVar));
        return C16807N.f139792a;
    }

    private static final boolean h3(C5974I i10, C4889m mVar, int i11) {
        mVar.W(2108512432);
        if (C4895p.J()) {
            C4895p.S(2108512432, i11, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.rememberIsBackLayerHidden (ShoppingListDetailsScreen.kt:874)");
        }
        boolean z10 = false;
        Object[] objArr = new Object[0];
        mVar.W(-726840268);
        Object D10 = mVar.D();
        C4889m.a aVar = C4889m.f14007a;
        if (D10 == aVar.a()) {
            D10 = new C12020d1();
            mVar.u(D10);
        }
        mVar.P();
        C4899r0 r0Var = (C4899r0) C5301c.e(objArr, (C5309k) null, (String) null, (C17631a) D10, mVar, 3072, 6);
        C16807N n10 = C16807N.f139792a;
        mVar.W(-726838283);
        if ((((i11 & 14) ^ 6) > 4 && mVar.V(i10)) || (i11 & 6) == 4) {
            z10 = true;
        }
        boolean V10 = mVar.V(r0Var) | z10;
        Object D11 = mVar.D();
        if (V10 || D11 == aVar.a()) {
            D11 = new o(i10, r0Var, (C17164e<? super o>) null);
            mVar.u(D11);
        }
        mVar.P();
        U0.P.g(n10, (p) D11, mVar, 6);
        boolean j32 = j3(r0Var);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return j32;
    }

    /* access modifiers changed from: private */
    public static final C16807N i1(C17642l lVar, String str, int i10) {
        C17542s.j(str, "itemNo");
        lVar.invoke(new C11724c.C11729f(str, i10));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i2(C4899r0 r0Var, C17642l lVar) {
        String m12 = m1(r0Var);
        if (m12 != null) {
            lVar.invoke(new C11724c.L(m12));
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C4899r0 i3() {
        return u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N j1(C17642l lVar) {
        lVar.invoke(C11724c.C11728e.f100920a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C4899r0 j2() {
        return u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final boolean j3(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N k1(Q q10, O0.F0 f02, O0.F0 f03, C4899r0 r0Var, C4899r0 r0Var2) {
        g1(q10, f02, f03, r0Var, r0Var2, new M0());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k2(C4899r0 r0Var, C17642l lVar, Q q10, O0.F0 f02, O0.F0 f03, C4899r0 r0Var2) {
        e1(q10, f02, f03, r0Var, r0Var2, new F0(r0Var, lVar));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void k3(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N l1() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l2(C4899r0 r0Var, C17642l lVar) {
        String m12 = m1(r0Var);
        if (m12 != null) {
            lVar.invoke(new C11724c.F(m12, Ae.k.BUTTON));
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final androidx.compose.ui.d l3(androidx.compose.ui.d dVar, float f10, long j10, long j11, float f11) {
        return androidx.compose.ui.draw.b.c(androidx.compose.ui.graphics.b.a(dVar, new m1(f10)), new n1(f11, f10, j10, j11));
    }

    private static final String m1(C4899r0<String> r0Var) {
        return r0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N m2(C4899r0 r0Var, C17642l lVar, Q q10, O0.F0 f02, O0.F0 f03, C4899r0 r0Var2) {
        e1(q10, f02, f03, r0Var, r0Var2, new G0(r0Var, lVar));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m3(float f10, androidx.compose.ui.graphics.c cVar) {
        C17542s.j(cVar, "$this$graphicsLayer");
        cVar.e(f10);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n1(C17642l lVar, Q q10, O0.F0 f02, O0.F0 f03, C4899r0 r0Var, C4899r0 r0Var2, s.o oVar) {
        C17542s.j(oVar, "it");
        g1(q10, f02, f03, r0Var, r0Var2, new A0(lVar, oVar));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n2(C4899r0 r0Var, C17642l lVar) {
        String m12 = m1(r0Var);
        if (m12 != null) {
            lVar.invoke(new C11724c.C11740q(m12));
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final m1.i n3(float f10, float f11, long j10, long j11, m1.d dVar) {
        m1.d dVar2 = dVar;
        C17542s.j(dVar2, "$this$drawWithCache");
        float f12 = (float) 2;
        float H12 = dVar2.H1(c2.h.B(f10 - c2.h.B(f12)));
        return dVar2.p(new o1(j10, C5668h.a(0.0f, -H12), C5673m.f(dVar.b(), 0.0f, C5673m.i(dVar.b()) + (H12 * f12), 1, (Object) null), j11, C5668h.a(0.0f, (C5673m.i(dVar.b()) + H12) - f11), C5673m.f(dVar.b(), 0.0f, C5673m.i(dVar.b()), 1, (Object) null)));
    }

    /* access modifiers changed from: private */
    public static final C16807N o1(C17642l lVar, s.o oVar) {
        lVar.invoke(new C12056w.g(oVar, true));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N o2(C4899r0 r0Var) {
        w2(r0Var, false);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N o3(long j10, long j11, long j12, long j13, long j14, long j15, C5817c cVar) {
        C17542s.j(cVar, "$this$onDrawWithContent");
        C5817c cVar2 = cVar;
        r1.f.q1(cVar2, j10, j11, j12, 0.0f, (r1.g) null, (C5749w0) null, 0, 120, (Object) null);
        cVar.V1();
        r1.f.q1(cVar2, j13, j14, j15, 0.0f, (r1.g) null, (C5749w0) null, 0, 120, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p1(C17642l lVar, Q q10, O0.F0 f02, O0.F0 f03, C4899r0 r0Var, C4899r0 r0Var2, pk.l lVar2) {
        C17542s.j(lVar2, "it");
        g1(q10, f02, f03, r0Var, r0Var2, new J0(lVar2, lVar));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p2(C17642l lVar, String str) {
        C17542s.j(str, "it");
        lVar.invoke(new C11724c.u(str));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N q1(pk.l lVar, C17642l lVar2) {
        lVar2.invoke(new C12056w.l(new C1(lVar.j(), Interaction$Component.SHOPPING_LIST_DETAILS, false)));
        return C16807N.f139792a;
    }

    private static final boolean q2(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N r1(C17642l lVar, String str) {
        C17542s.j(str, "it");
        lVar.invoke(new C12056w.j(str));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N r2(C17642l lVar) {
        lVar.invoke(C11724c.C11733j.f100926a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N s1(C4899r0 r0Var) {
        D1(r0Var, false);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N s2(C17642l lVar) {
        lVar.invoke(C11724c.C11733j.f100926a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void t1(C4899r0<String> r0Var, String str) {
        r0Var.setValue(str);
    }

    /* access modifiers changed from: private */
    public static final C16807N t2(C17642l lVar) {
        lVar.invoke(C11724c.C11737n.f100930a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N u1(C17642l lVar) {
        lVar.invoke(pk.f.f100950a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N u2(C17642l lVar) {
        lVar.invoke(C11724c.C11732i.f100925a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N v1(C17642l lVar, s.n.e eVar) {
        C17542s.j(eVar, "product");
        lVar.invoke(new C12056w.l(new C1(eVar.e(), C11423a.f98576a.a(), false)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N v2(C17642l lVar) {
        lVar.invoke(C12056w.h.f103798a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N w1(C17642l lVar, s.n.e eVar) {
        C17542s.j(eVar, "product");
        lVar.invoke(new pk.e(eVar.e(), eVar.f().k(), eVar.d()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void w2(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N x1(C17642l lVar, s.n.e eVar) {
        C17542s.j(eVar, "it");
        lVar.invoke(new C12056w.j(eVar.e()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N x2(C17642l lVar) {
        lVar.invoke(C11724c.D.f100895a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N y1(C17642l lVar) {
        lVar.invoke(pk.h.f100952a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N y2(C17642l lVar) {
        lVar.invoke(C11724c.E.f100896a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N z1(C17642l lVar) {
        lVar.invoke(C11741d.f100946a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N z2(C17642l lVar) {
        lVar.invoke(C11724c.E.f100896a);
        return C16807N.f139792a;
    }
}
