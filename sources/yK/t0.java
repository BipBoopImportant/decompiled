package yk;

import Bx.a;
import KJ.C15985a;
import KJ.C15987c;
import KJ.C15990f;
import O0.C4762x0;
import O0.H0;
import O0.J0;
import O0.K0;
import O0.L0;
import QJ.Q;
import RA.C13502a;
import SC.C13628q0;
import SC.F0;
import SC.G0;
import SC.Y2;
import SC.Z2;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.M0;
import U0.P;
import U0.Y0;
import U0.o1;
import XH.C16807N;
import XH.t;
import XH.y;
import android.content.Context;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5116k1;
import androidx.recyclerview.widget.RecyclerView;
import c1.C5264a;
import com.google.ar.core.ImageMetadata;
import com.ingka.ikea.core.model.Media;
import dI.C17164e;
import eI.C17187b;
import gB.C14504f;
import gs.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import s0.C5834E;
import s0.C5842M;
import s0.C5848T;
import s0.C5850V;
import tK.C18029u;
import u0.C5968C;
import u0.C5974I;
import u0.C5975J;
import u0.C5979c;
import u0.C5991o;
import u0.C5993q;
import uK.C18146a;
import vB.C15128a;
import xk.C12315a;
import xk.C12316b;

@Metadata(d1 = {"\u0000z\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0001\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a£\u0001\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u00072\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\u0007H\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a{\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00072\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\u0007H\u0003¢\u0006\u0004\b\u001f\u0010 \u001ae\u0010#\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001d2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\u0007H\u0003¢\u0006\u0004\b#\u0010$\u001a9\u0010)\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010(\u001a\u00020'H\u0003¢\u0006\u0004\b)\u0010*\u001a1\u0010+\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010%2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010(\u001a\u00020'H\u0003¢\u0006\u0004\b+\u0010,\u001a1\u0010-\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010%2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010(\u001a\u00020'H\u0003¢\u0006\u0004\b-\u0010,\u001a\u0001\u00105\u001a\u00020\u00052\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u00104\u001a\u00020\u00172\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010(\u001a\u00020'H\u0003¢\u0006\u0004\b5\u00106\u001a\u0015\u00109\u001a\b\u0012\u0004\u0012\u00020807H\u0002¢\u0006\u0004\b9\u0010:\u001a\u0017\u0010;\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0003¢\u0006\u0004\b;\u0010<¨\u0006?²\u0006\f\u0010\u0012\u001a\u00020\u00118\nX\u0002²\u0006\u000e\u0010=\u001a\u00020\u00008\n@\nX\u0002²\u0006\u000e\u0010>\u001a\u00020\u00008\n@\nX\u0002"}, d2 = {"", "expandedWidth", "showProfileIcon", "shouldScrollToTop", "Lkotlin/Function0;", "LXH/N;", "onBackClicked", "Lkotlin/Function1;", "", "onListSelected", "onShowLoginPromotion", "onShoppingListTabPressConsumed", "onScrollStateChanged", "Lxk/c;", "viewModel", "I", "(ZZZLnI/a;LnI/l;LnI/a;LnI/a;LnI/l;Lxk/c;LU0/m;II)V", "Lxk/b;", "state", "onCreateListClicked", "onCreateListResultHandled", "onListClicked", "onShoppingListScrollToTopConsumed", "LgB/f;", "onCardSizeToggleClicked", "U", "(Lxk/b;ZZZLnI/a;LnI/a;LnI/a;LnI/l;LnI/a;LnI/l;LnI/l;LU0/m;II)V", "LO0/L0;", "snackbarHostState", "Lu0/I;", "lazyGridState", "Z", "(Lxk/b;ZZLO0/L0;Lu0/I;LnI/a;LnI/a;LnI/l;LnI/l;LU0/m;I)V", "Ls0/E;", "outerPadding", "w", "(Lxk/b;ZLs0/E;Lu0/I;LnI/l;LnI/a;LnI/l;LU0/m;I)V", "Lcom/ingka/ikea/core/model/Media$Image;", "media", "Landroidx/compose/ui/d;", "modifier", "y", "(Lcom/ingka/ikea/core/model/Media$Image;ZLnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "D", "(Lcom/ingka/ikea/core/model/Media$Image;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "A", "LKJ/c;", "LvB/a;", "carouselShoppingLists", "loading", "", "columnCount", "shoppingListCardSize", "b0", "(LKJ/c;ZIZLu0/I;Lcom/ingka/ikea/core/model/Media$Image;LgB/f;LnI/l;LnI/a;LnI/l;Landroidx/compose/ui/d;LU0/m;III)V", "LKJ/f;", "LSC/Z2$a;", "j0", "()LKJ/f;", "G", "(LO0/L0;LU0/m;I)V", "showCreateListPrompt", "isScrolledToTop", "shoppinglist-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class t0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<H0, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ L0 f106454a;

        a(L0 l02) {
            this.f106454a = l02;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(L0 l02) {
            H0 b10 = l02.b();
            if (b10 != null) {
                b10.dismiss();
            }
            return C16807N.f139792a;
        }

        public final void b(H0 h02, C4889m mVar, int i10) {
            C17542s.j(h02, "snackbarData");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(h02) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1740007060, i10, -1, "com.ingka.ikea.app.shoppinglist.lists.ui.ScreenSnackbarHost.<anonymous> (ShoppingListsScreen.kt:575)");
                }
                String message = h02.a().getMessage();
                mVar.W(-1283526241);
                boolean V10 = mVar.V(this.f106454a);
                L0 l02 = this.f106454a;
                Object D10 = mVar.D();
                if (V10 || D10 == C4889m.f14007a.a()) {
                    D10 = new s0(l02);
                    mVar.u(D10);
                }
                mVar.P();
                Y2.e(message, new C13628q0((C17631a) D10, (String) null, 2, (DefaultConstructorMarker) null), C5116k1.a(D.k(androidx.compose.ui.d.f18749a, C18029u.f147649a.j(), 0.0f, 2, (Object) null), "snackbar"), (String) null, (C17631a<C16807N>) null, mVar, C13628q0.f116408c << 3, 24);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((H0) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b extends C17540p implements C17642l<C14504f, C16807N> {
        b(Object obj) {
            super(1, obj, xk.c.class, "updateSelectedCardSize", "updateSelectedCardSize(Lcom/ingka/ikea/shoppinglist/datalayer/model/ShoppingListCardSize;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((C14504f) obj);
            return C16807N.f139792a;
        }

        public final void t(C14504f fVar) {
            C17542s.j(fVar, "p0");
            ((xk.c) this.receiver).H(fVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.lists.ui.ShoppingListsScreenKt$ShoppingListsScreen$1$1", f = "ShoppingListsScreen.kt", l = {}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f106455c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<Boolean, C16807N> f106456d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f106457e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C17642l<? super Boolean, C16807N> lVar, C4899r0<Boolean> r0Var, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f106456d = lVar;
            this.f106457e = r0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f106456d, this.f106457e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f106455c == 0) {
                y.b(obj);
                this.f106456d.invoke(kotlin.coroutines.jvm.internal.b.a(t0.V(this.f106457e)));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.lists.ui.ShoppingListsScreenKt$ShoppingListsScreen$3$1", f = "ShoppingListsScreen.kt", l = {218, 221}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f106458c;

        /* renamed from: d  reason: collision with root package name */
        Object f106459d;

        /* renamed from: e  reason: collision with root package name */
        Object f106460e;

        /* renamed from: f  reason: collision with root package name */
        int f106461f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C12315a f106462g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Context f106463h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f106464i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ L0 f106465j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C5974I f106466k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C12315a aVar, Context context, C17631a<C16807N> aVar2, L0 l02, C5974I i10, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f106462g = aVar;
            this.f106463h = context;
            this.f106464i = aVar2;
            this.f106465j = l02;
            this.f106466k = i10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f106462g, this.f106463h, this.f106464i, this.f106465j, this.f106466k, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C12315a aVar;
            String str;
            Object[] objArr;
            Object f10 = C17187b.f();
            int i10 = this.f106461f;
            if (i10 == 0) {
                y.b(obj);
                aVar = this.f106462g;
                if (aVar instanceof C12315a.C2518a) {
                    C13502a.f115114a.b(this.f106463h, ((C12315a.C2518a) aVar).a());
                    this.f106464i.invoke();
                } else if (aVar instanceof C12315a.b) {
                    L0 l02 = this.f106465j;
                    Context context = this.f106463h;
                    int i11 = Oo.b.f84741o9;
                    Object[] objArr2 = {((C12315a.b) aVar).a()};
                    String string = context.getString(i11, objArr2);
                    C17542s.i(string, "getString(...)");
                    this.f106458c = aVar;
                    this.f106459d = string;
                    this.f106460e = objArr2;
                    this.f106461f = 1;
                    if (L0.f(l02, string, (String) null, false, (J0) null, this, 14, (Object) null) == f10) {
                        return f10;
                    }
                    str = string;
                    objArr = objArr2;
                } else if (aVar != null) {
                    throw new t();
                }
                return C16807N.f139792a;
            } else if (i10 == 1) {
                objArr = (Object[]) this.f106460e;
                str = (String) this.f106459d;
                aVar = (C12315a) this.f106458c;
                y.b(obj);
            } else if (i10 == 2) {
                Object[] objArr3 = (Object[]) this.f106460e;
                String str2 = (String) this.f106459d;
                C12315a aVar2 = (C12315a) this.f106458c;
                y.b(obj);
                this.f106464i.invoke();
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C5974I i12 = this.f106466k;
            this.f106458c = aVar;
            this.f106459d = str;
            this.f106460e = objArr;
            this.f106461f = 2;
            if (C5974I.l(i12, 0, 0, this, 2, (Object) null) == f10) {
                return f10;
            }
            this.f106464i.invoke();
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.lists.ui.ShoppingListsScreenKt$ShoppingListsScreen$4$1", f = "ShoppingListsScreen.kt", l = {232}, m = "invokeSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f106467c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f106468d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5974I f106469e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f106470f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f106471g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(boolean z10, C5974I i10, C17631a<C16807N> aVar, C4899r0<Boolean> r0Var, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f106468d = z10;
            this.f106469e = i10;
            this.f106470f = aVar;
            this.f106471g = r0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f106468d, this.f106469e, this.f106470f, this.f106471g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f106467c;
            if (i10 == 0) {
                y.b(obj);
                if (this.f106468d) {
                    if (!t0.V(this.f106471g)) {
                        C5974I i11 = this.f106469e;
                        this.f106467c = 1;
                        if (C5974I.J(i11, 0, 0, this, 2, (Object) null) == f10) {
                            return f10;
                        }
                    }
                }
                return C16807N.f139792a;
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f106470f.invoke();
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f106472a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f106473b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C12316b f106474c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f106475d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements q<C5842M, C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C12316b f106476a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f106477b;

            a(C12316b bVar, C17631a<C16807N> aVar) {
                this.f106476a = bVar;
                this.f106477b = aVar;
            }

            public final void a(C5842M m10, C4889m mVar, int i10) {
                C17542s.j(m10, "$this$IkeaTopAppBar");
                if ((i10 & 17) != 16 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(1118904296, i10, -1, "com.ingka.ikea.app.shoppinglist.lists.ui.ShoppingListsScreenUi.<anonymous>.<anonymous> (ShoppingListsScreen.kt:269)");
                    }
                    if (!this.f106476a.g().isEmpty()) {
                        F0.b(C18146a.f148609q9, J1.j.b(ik.c.f98327S, mVar, 0), C5116k1.a(androidx.compose.ui.d.f18749a, "create_list_icon"), false, SC.H0.Tertiary, (G0) null, (r0.m) null, false, this.f106477b, mVar, 24960, 232);
                    }
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((C5842M) obj, (C4889m) obj2, ((Number) obj3).intValue());
                return C16807N.f139792a;
            }
        }

        f(boolean z10, C17631a<C16807N> aVar, C12316b bVar, C17631a<C16807N> aVar2) {
            this.f106472a = z10;
            this.f106473b = aVar;
            this.f106474c = bVar;
            this.f106475d = aVar2;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(boolean z10, C17631a aVar) {
            if (!z10) {
                aVar.invoke();
            }
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(U0.C4889m r13, int r14) {
            /*
                r12 = this;
                r0 = r14 & 3
                r1 = 2
                if (r0 != r1) goto L_0x0011
                boolean r0 = r13.l()
                if (r0 != 0) goto L_0x000c
                goto L_0x0011
            L_0x000c:
                r13.L()
                goto L_0x008c
            L_0x0011:
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x0020
                r0 = -1
                java.lang.String r1 = "com.ingka.ikea.app.shoppinglist.lists.ui.ShoppingListsScreenUi.<anonymous> (ShoppingListsScreen.kt:255)"
                r2 = 1063446679(0x3f62e897, float:0.88636154)
                U0.C4895p.S(r2, r14, r0, r1)
            L_0x0020:
                boolean r14 = r12.f106472a
                if (r14 == 0) goto L_0x0027
                r14 = 0
            L_0x0025:
                r0 = r14
                goto L_0x002a
            L_0x0027:
                ol.v r14 = ol.v.BACK
                goto L_0x0025
            L_0x002a:
                r14 = 691664694(0x2939f736, float:4.1292673E-14)
                r13.W(r14)
                boolean r14 = r12.f106472a
                boolean r14 = r13.b(r14)
                nI.a<XH.N> r1 = r12.f106473b
                boolean r1 = r13.V(r1)
                r14 = r14 | r1
                boolean r1 = r12.f106472a
                nI.a<XH.N> r2 = r12.f106473b
                java.lang.Object r3 = r13.D()
                if (r14 != 0) goto L_0x004f
                U0.m$a r14 = U0.C4889m.f14007a
                java.lang.Object r14 = r14.a()
                if (r3 != r14) goto L_0x0057
            L_0x004f:
                yk.u0 r3 = new yk.u0
                r3.<init>(r1, r2)
                r13.u(r3)
            L_0x0057:
                r1 = r3
                nI.a r1 = (nI.C17631a) r1
                r13.P()
                androidx.compose.ui.d$a r14 = androidx.compose.ui.d.f18749a
                androidx.compose.ui.d r2 = s0.C5852X.e(r14)
                yk.t0$f$a r14 = new yk.t0$f$a
                xk.b r3 = r12.f106474c
                nI.a<XH.N> r4 = r12.f106475d
                r14.<init>(r3, r4)
                r3 = 54
                r4 = 1118904296(0x42b11fe8, float:88.56232)
                r5 = 1
                c1.a r5 = c1.c.e(r4, r5, r14, r13, r3)
                r10 = 196608(0x30000, float:2.75506E-40)
                r11 = 472(0x1d8, float:6.61E-43)
                r3 = 0
                r4 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = r13
                ol.p.c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                boolean r13 = U0.C4895p.J()
                if (r13 == 0) goto L_0x008c
                U0.C4895p.R()
            L_0x008c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yk.t0.f.b(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ L0 f106478a;

        g(L0 l02) {
            this.f106478a = l02;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1309254553, i10, -1, "com.ingka.ikea.app.shoppinglist.lists.ui.ShoppingListsScreenUi.<anonymous> (ShoppingListsScreen.kt:284)");
                }
                t0.G(this.f106478a, mVar, 0);
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
    static final class h implements q<C5834E, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C12316b f106479a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f106480b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5974I f106481c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f106482d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f106483e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<C14504f, C16807N> f106484f;

        h(C12316b bVar, boolean z10, C5974I i10, C17642l<? super String, C16807N> lVar, C17631a<C16807N> aVar, C17642l<? super C14504f, C16807N> lVar2) {
            this.f106479a = bVar;
            this.f106480b = z10;
            this.f106481c = i10;
            this.f106482d = lVar;
            this.f106483e = aVar;
            this.f106484f = lVar2;
        }

        public final void a(C5834E e10, C4889m mVar, int i10) {
            C17542s.j(e10, "outerPadding");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(e10) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1257532958, i10, -1, "com.ingka.ikea.app.shoppinglist.lists.ui.ShoppingListsScreenUi.<anonymous> (ShoppingListsScreen.kt:289)");
                }
                t0.w(this.f106479a, this.f106480b, e10, this.f106481c, this.f106482d, this.f106483e, this.f106484f, mVar, (i10 << 6) & 896);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5834E) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class i extends C17544u implements C17642l {

        /* renamed from: c  reason: collision with root package name */
        public static final i f106485c = new i();

        public i() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(C15128a aVar) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class j extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f106486c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f106487d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(C17642l lVar, List list) {
            super(1);
            this.f106486c = lVar;
            this.f106487d = list;
        }

        public final Object a(int i10) {
            return this.f106486c.invoke(this.f106487d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class k extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f106488c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f106489d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(C17642l lVar, List list) {
            super(1);
            this.f106488c = lVar;
            this.f106489d = list;
        }

        public final Object a(int i10) {
            return this.f106488c.invoke(this.f106489d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lu0/o;", "", "it", "LXH/N;", "a", "(Lu0/o;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    public static final class l extends C17544u implements r<C5991o, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f106490c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C14504f f106491d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f106492e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l f106493f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(List list, C14504f fVar, boolean z10, C17642l lVar) {
            super(4);
            this.f106490c = list;
            this.f106491d = fVar;
            this.f106492e = z10;
            this.f106493f = lVar;
        }

        public final void a(C5991o oVar, int i10, C4889m mVar, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (mVar.V(oVar) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= mVar.d(i10) ? 32 : 16;
            }
            if ((i12 & 147) != 146 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(699646206, i12, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:464)");
                }
                mVar.W(582697548);
                V.d(this.f106491d, (C15128a) this.f106490c.get(i10), this.f106492e, this.f106493f, mVar, C15128a.f131411g << 3);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class m {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f106494a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                gB.f[] r0 = gB.C14504f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                gB.f r1 = gB.C14504f.DEFAULT_CARD     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                gB.f r1 = gB.C14504f.COMPACT_CARD     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f106494a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yk.t0.m.<clinit>():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void A(com.ingka.ikea.core.model.Media.Image r35, nI.C17631a<XH.C16807N> r36, androidx.compose.ui.d r37, U0.C4889m r38, int r39, int r40) {
        /*
            r1 = r35
            r4 = r39
            r0 = 6
            r2 = 1661248065(0x6304a241, float:2.4466618E21)
            r3 = r38
            U0.m r3 = r3.k(r2)
            r15 = 1
            r5 = r40 & 1
            r6 = 2
            r7 = 4
            if (r5 == 0) goto L_0x0018
            r5 = r4 | 6
            goto L_0x0028
        L_0x0018:
            r5 = r4 & 6
            if (r5 != 0) goto L_0x0027
            boolean r5 = r3.F(r1)
            if (r5 == 0) goto L_0x0024
            r5 = r7
            goto L_0x0025
        L_0x0024:
            r5 = r6
        L_0x0025:
            r5 = r5 | r4
            goto L_0x0028
        L_0x0027:
            r5 = r4
        L_0x0028:
            r8 = r40 & 2
            if (r8 == 0) goto L_0x0031
            r5 = r5 | 48
            r14 = r36
            goto L_0x0043
        L_0x0031:
            r8 = r4 & 48
            r14 = r36
            if (r8 != 0) goto L_0x0043
            boolean r8 = r3.F(r14)
            if (r8 == 0) goto L_0x0040
            r8 = 32
            goto L_0x0042
        L_0x0040:
            r8 = 16
        L_0x0042:
            r5 = r5 | r8
        L_0x0043:
            r8 = r40 & 4
            if (r8 == 0) goto L_0x004d
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0049:
            r9 = r37
        L_0x004b:
            r13 = r5
            goto L_0x0060
        L_0x004d:
            r9 = r4 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0049
            r9 = r37
            boolean r10 = r3.V(r9)
            if (r10 == 0) goto L_0x005c
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r5 = r5 | r10
            goto L_0x004b
        L_0x0060:
            r5 = r13 & 147(0x93, float:2.06E-43)
            r10 = 146(0x92, float:2.05E-43)
            if (r5 != r10) goto L_0x0074
            boolean r5 = r3.l()
            if (r5 != 0) goto L_0x006d
            goto L_0x0074
        L_0x006d:
            r3.L()
            r31 = r9
            goto L_0x02cc
        L_0x0074:
            if (r8 == 0) goto L_0x007a
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r12 = r5
            goto L_0x007b
        L_0x007a:
            r12 = r9
        L_0x007b:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0087
            r5 = -1
            java.lang.String r8 = "com.ingka.ikea.app.shoppinglist.lists.ui.EmptyContentLandscape (ShoppingListsScreen.kt:409)"
            U0.C4895p.S(r2, r13, r5, r8)
        L_0x0087:
            r2 = 0
            r10 = 0
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.f(r12, r2, r15, r10)
            float r5 = (float) r7
            float r18 = c2.h.B(r5)
            r21 = 13
            r22 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            androidx.compose.foundation.layout.d r8 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r9 = r8.f()
            i1.c$a r11 = i1.C5437c.f24302a
            i1.c$c r0 = r11.l()
            r14 = 0
            E1.I r0 = androidx.compose.foundation.layout.G.b(r9, r0, r3, r14)
            int r9 = U0.C4883j.a(r3, r14)
            U0.y r14 = r3.s()
            androidx.compose.ui.d r7 = androidx.compose.ui.c.e(r3, r7)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r15 = r16.a()
            U0.f r17 = r3.m()
            if (r17 != 0) goto L_0x00cc
            U0.C4883j.c()
        L_0x00cc:
            r3.I()
            boolean r17 = r3.i()
            if (r17 == 0) goto L_0x00d9
            r3.p(r15)
            goto L_0x00dc
        L_0x00d9:
            r3.t()
        L_0x00dc:
            U0.m r15 = U0.F1.a(r3)
            nI.p r2 = r16.c()
            U0.F1.c(r15, r0, r2)
            nI.p r0 = r16.e()
            U0.F1.c(r15, r14, r0)
            nI.p r0 = r16.b()
            boolean r2 = r15.i()
            if (r2 != 0) goto L_0x0106
            java.lang.Object r2 = r15.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r9)
            boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r14)
            if (r2 != 0) goto L_0x0114
        L_0x0106:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r15.u(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r15.w(r2, r0)
        L_0x0114:
            nI.p r0 = r16.d()
            U0.F1.c(r15, r7, r0)
            s0.N r0 = s0.C5843N.f28726a
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r21 = 2
            r22 = 0
            r19 = 1062836634(0x3f59999a, float:0.85)
            r20 = 0
            r17 = r0
            r18 = r2
            androidx.compose.ui.d r7 = s0.C5842M.e(r17, r18, r19, r20, r21, r22)
            r15 = 24
            float r14 = (float) r15
            float r9 = c2.h.B(r14)
            r15 = 0
            androidx.compose.ui.d r18 = androidx.compose.foundation.layout.D.k(r7, r9, r15, r6, r10)
            r6 = 0
            r15 = 1
            androidx.compose.foundation.o r19 = androidx.compose.foundation.m.c(r6, r3, r6, r15)
            r23 = 14
            r24 = 0
            r21 = 0
            r22 = 0
            androidx.compose.ui.d r6 = androidx.compose.foundation.m.f(r18, r19, r20, r21, r22, r23, r24)
            androidx.compose.foundation.layout.d$m r7 = r8.g()
            i1.c$b r8 = r11.k()
            r9 = 0
            E1.I r7 = androidx.compose.foundation.layout.C5080k.a(r7, r8, r3, r9)
            int r8 = U0.C4883j.a(r3, r9)
            U0.y r9 = r3.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r3, r6)
            nI.a r11 = r16.a()
            U0.f r18 = r3.m()
            if (r18 != 0) goto L_0x0174
            U0.C4883j.c()
        L_0x0174:
            r3.I()
            boolean r18 = r3.i()
            if (r18 == 0) goto L_0x0181
            r3.p(r11)
            goto L_0x0184
        L_0x0181:
            r3.t()
        L_0x0184:
            U0.m r11 = U0.F1.a(r3)
            nI.p r10 = r16.c()
            U0.F1.c(r11, r7, r10)
            nI.p r7 = r16.e()
            U0.F1.c(r11, r9, r7)
            nI.p r7 = r16.b()
            boolean r9 = r11.i()
            if (r9 != 0) goto L_0x01ae
            java.lang.Object r9 = r11.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r10)
            if (r9 != 0) goto L_0x01bc
        L_0x01ae:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r11.u(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r11.w(r8, r7)
        L_0x01bc:
            nI.p r7 = r16.d()
            U0.F1.c(r11, r6, r7)
            s0.h r6 = s0.C5862h.f28810a
            float r5 = c2.h.B(r5)
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.i(r2, r5)
            r6 = 6
            s0.C5844O.a(r5, r3, r6)
            int r5 = QA.C13351c.f114055g
            r10 = 0
            java.lang.String r5 = J1.j.b(r5, r3, r10)
            TC.b$b$a r6 = TC.C13679b.C2857b.a.f116683a
            r29 = 0
            r30 = 262140(0x3fffc, float:3.67336E-40)
            r7 = 0
            r8 = 0
            r18 = 0
            r16 = r10
            r10 = r18
            r18 = 0
            r31 = r12
            r12 = r18
            r32 = r13
            r13 = r18
            r33 = r14
            r14 = r18
            r18 = 0
            r34 = 24
            r15 = r18
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 48
            r27 = r3
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r5 = 8
            float r5 = (float) r5
            float r5 = c2.h.B(r5)
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.i(r2, r5)
            r6 = 6
            s0.C5844O.a(r5, r3, r6)
            int r5 = QA.C13351c.f114054f
            r15 = 0
            java.lang.String r5 = J1.j.b(r5, r3, r15)
            TC.b$a$a r6 = TC.C13679b.a.C2855a.f116679a
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r15 = r16
            r17 = 0
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            float r5 = c2.h.B(r33)
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.i(r2, r5)
            r6 = 6
            s0.C5844O.a(r5, r3, r6)
            int r5 = QA.C13351c.f114053e
            r15 = 0
            java.lang.String r5 = J1.j.b(r5, r3, r15)
            r6 = 1879048192(0x70000000, float:1.58456325E29)
            int r7 = r32 << 24
            r16 = r7 & r6
            r17 = 510(0x1fe, float:7.15E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r14 = r36
            r15 = r3
            SC.L.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r3.x()
            r5 = 25110548(0x17f2814, float:4.6864858E-38)
            r3.W(r5)
            boolean r5 = r3.F(r1)
            java.lang.Object r6 = r3.D()
            if (r5 != 0) goto L_0x027d
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x0285
        L_0x027d:
            yk.i0 r6 = new yk.i0
            r6.<init>(r1)
            r3.u(r6)
        L_0x0285:
            nI.l r6 = (nI.C17642l) r6
            r3.P()
            r5 = 0
            gs.e r5 = gs.f.a(r6, r3, r5)
            int r9 = gs.e.f97946h
            r10 = 6
            r6 = 0
            r7 = 0
            r8 = r3
            t1.c r5 = gs.d.c(r5, r6, r7, r8, r9, r10)
            r6 = 1
            r7 = 0
            r8 = 0
            androidx.compose.ui.d r18 = androidx.compose.foundation.layout.J.d(r2, r7, r6, r8)
            r21 = 2
            r22 = 0
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            r17 = r0
            androidx.compose.ui.d r7 = s0.C5842M.e(r17, r18, r19, r20, r21, r22)
            E1.k$a r0 = E1.C4478k.f5915a
            E1.n r9 = r0.g()
            r13 = 24624(0x6030, float:3.4506E-41)
            r14 = 104(0x68, float:1.46E-43)
            r6 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = r3
            n0.C5583F.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r3.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x02cc
            U0.C4895p.R()
        L_0x02cc:
            U0.Y0 r6 = r3.n()
            if (r6 == 0) goto L_0x02e5
            yk.j0 r7 = new yk.j0
            r0 = r7
            r1 = r35
            r2 = r36
            r3 = r31
            r4 = r39
            r5 = r40
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x02e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.t0.A(com.ingka.ikea.core.model.Media$Image, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N B(Media.Image image, e.a aVar) {
        C17542s.j(aVar, "$this$ikeaImageRequest");
        aVar.j(image != null ? image.getUrl() : null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N C(Media.Image image, C17631a aVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        A(image, aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void D(com.ingka.ikea.core.model.Media.Image r34, nI.C17631a<XH.C16807N> r35, androidx.compose.ui.d r36, U0.C4889m r37, int r38, int r39) {
        /*
            r1 = r34
            r4 = r38
            r0 = 6
            r2 = -1263923795(0xffffffffb4aa0dad, float:-3.1674918E-7)
            r3 = r37
            U0.m r3 = r3.k(r2)
            r15 = 1
            r5 = r39 & 1
            r14 = 4
            r13 = 2
            if (r5 == 0) goto L_0x0018
            r5 = r4 | 6
            goto L_0x0028
        L_0x0018:
            r5 = r4 & 6
            if (r5 != 0) goto L_0x0027
            boolean r5 = r3.F(r1)
            if (r5 == 0) goto L_0x0024
            r5 = r14
            goto L_0x0025
        L_0x0024:
            r5 = r13
        L_0x0025:
            r5 = r5 | r4
            goto L_0x0028
        L_0x0027:
            r5 = r4
        L_0x0028:
            r6 = r39 & 2
            if (r6 == 0) goto L_0x0031
            r5 = r5 | 48
            r12 = r35
            goto L_0x0043
        L_0x0031:
            r6 = r4 & 48
            r12 = r35
            if (r6 != 0) goto L_0x0043
            boolean r6 = r3.F(r12)
            if (r6 == 0) goto L_0x0040
            r6 = 32
            goto L_0x0042
        L_0x0040:
            r6 = 16
        L_0x0042:
            r5 = r5 | r6
        L_0x0043:
            r6 = r39 & 4
            if (r6 == 0) goto L_0x004d
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0049:
            r7 = r36
        L_0x004b:
            r11 = r5
            goto L_0x0060
        L_0x004d:
            r7 = r4 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0049
            r7 = r36
            boolean r8 = r3.V(r7)
            if (r8 == 0) goto L_0x005c
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r5 = r5 | r8
            goto L_0x004b
        L_0x0060:
            r5 = r11 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r5 != r8) goto L_0x0074
            boolean r5 = r3.l()
            if (r5 != 0) goto L_0x006d
            goto L_0x0074
        L_0x006d:
            r3.L()
            r31 = r7
            goto L_0x02a3
        L_0x0074:
            if (r6 == 0) goto L_0x007a
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r10 = r5
            goto L_0x007b
        L_0x007a:
            r10 = r7
        L_0x007b:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0087
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.app.shoppinglist.lists.ui.EmptyContentPortrait (ShoppingListsScreen.kt:362)"
            U0.C4895p.S(r2, r11, r5, r6)
        L_0x0087:
            r2 = 0
            r9 = 0
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.f(r10, r2, r15, r9)
            r8 = 0
            androidx.compose.foundation.o r17 = androidx.compose.foundation.m.c(r8, r3, r8, r15)
            r21 = 14
            r22 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.m.f(r16, r17, r18, r19, r20, r21, r22)
            androidx.compose.foundation.layout.d r16 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r6 = r16.g()
            i1.c$a r17 = i1.C5437c.f24302a
            i1.c$b r7 = r17.k()
            E1.I r6 = androidx.compose.foundation.layout.C5080k.a(r6, r7, r3, r8)
            int r7 = U0.C4883j.a(r3, r8)
            U0.y r9 = r3.s()
            androidx.compose.ui.d r5 = androidx.compose.ui.c.e(r3, r5)
            G1.g$a r18 = G1.C4504g.f6515W
            nI.a r14 = r18.a()
            U0.f r19 = r3.m()
            if (r19 != 0) goto L_0x00cb
            U0.C4883j.c()
        L_0x00cb:
            r3.I()
            boolean r19 = r3.i()
            if (r19 == 0) goto L_0x00d8
            r3.p(r14)
            goto L_0x00db
        L_0x00d8:
            r3.t()
        L_0x00db:
            U0.m r14 = U0.F1.a(r3)
            nI.p r0 = r18.c()
            U0.F1.c(r14, r6, r0)
            nI.p r0 = r18.e()
            U0.F1.c(r14, r9, r0)
            nI.p r0 = r18.b()
            boolean r6 = r14.i()
            if (r6 != 0) goto L_0x0105
            java.lang.Object r6 = r14.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r9)
            if (r6 != 0) goto L_0x0113
        L_0x0105:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r14.u(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r14.w(r6, r0)
        L_0x0113:
            nI.p r0 = r18.d()
            U0.F1.c(r14, r5, r0)
            s0.h r0 = s0.C5862h.f28810a
            r0 = 1856022642(0x6ea0a872, float:2.486062E28)
            r3.W(r0)
            boolean r0 = r3.F(r1)
            java.lang.Object r5 = r3.D()
            if (r0 != 0) goto L_0x0134
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r5 != r0) goto L_0x013c
        L_0x0134:
            yk.f0 r5 = new yk.f0
            r5.<init>(r1)
            r3.u(r5)
        L_0x013c:
            nI.l r5 = (nI.C17642l) r5
            r3.P()
            gs.e r5 = gs.f.a(r5, r3, r8)
            int r9 = gs.e.f97946h
            r0 = 6
            r6 = 0
            r7 = 0
            r14 = r8
            r8 = r3
            r19 = r11
            r11 = 0
            r31 = r10
            r10 = r0
            t1.c r5 = gs.d.c(r5, r6, r7, r8, r9, r10)
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.h(r0, r2, r15, r11)
            r7 = 1067030938(0x3f99999a, float:1.2)
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.C5074e.b(r6, r7, r14, r13, r11)
            E1.k$a r6 = E1.C4478k.f5915a
            E1.n r9 = r6.g()
            r20 = 25008(0x61b0, float:3.5044E-41)
            r21 = 104(0x68, float:1.46E-43)
            r6 = 0
            r8 = 0
            r10 = 0
            r22 = 0
            r32 = r19
            r11 = r22
            r12 = r3
            r13 = r20
            r14 = r21
            n0.C5583F.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r5 = 0
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.h(r0, r2, r15, r5)
            r15 = 24
            float r14 = (float) r15
            float r7 = c2.h.B(r14)
            r8 = 2
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.k(r6, r7, r2, r8, r5)
            androidx.compose.foundation.layout.d$m r5 = r16.g()
            i1.c$b r6 = r17.k()
            r13 = 0
            E1.I r5 = androidx.compose.foundation.layout.C5080k.a(r5, r6, r3, r13)
            int r6 = U0.C4883j.a(r3, r13)
            U0.y r7 = r3.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r3, r2)
            nI.a r8 = r18.a()
            U0.f r9 = r3.m()
            if (r9 != 0) goto L_0x01b5
            U0.C4883j.c()
        L_0x01b5:
            r3.I()
            boolean r9 = r3.i()
            if (r9 == 0) goto L_0x01c2
            r3.p(r8)
            goto L_0x01c5
        L_0x01c2:
            r3.t()
        L_0x01c5:
            U0.m r8 = U0.F1.a(r3)
            nI.p r9 = r18.c()
            U0.F1.c(r8, r5, r9)
            nI.p r5 = r18.e()
            U0.F1.c(r8, r7, r5)
            nI.p r5 = r18.b()
            boolean r7 = r8.i()
            if (r7 != 0) goto L_0x01ef
            java.lang.Object r7 = r8.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r9)
            if (r7 != 0) goto L_0x01fd
        L_0x01ef:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r8.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8.w(r6, r5)
        L_0x01fd:
            nI.p r5 = r18.d()
            U0.F1.c(r8, r2, r5)
            r2 = 4
            float r2 = (float) r2
            float r2 = c2.h.B(r2)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.i(r0, r2)
            r5 = 6
            s0.C5844O.a(r2, r3, r5)
            int r2 = QA.C13351c.f114055g
            java.lang.String r5 = J1.j.b(r2, r3, r13)
            TC.b$b$a r6 = TC.C13679b.C2857b.a.f116683a
            r29 = 0
            r30 = 262140(0x3fffc, float:3.67336E-40)
            r7 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r2 = 0
            r13 = r2
            r33 = r14
            r14 = r2
            r16 = 0
            r2 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 48
            r27 = r3
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r5 = 8
            float r5 = (float) r5
            float r5 = c2.h.B(r5)
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.i(r0, r5)
            r6 = 6
            s0.C5844O.a(r5, r3, r6)
            int r5 = QA.C13351c.f114054f
            r15 = 0
            java.lang.String r5 = J1.j.b(r5, r3, r15)
            TC.b$a$a r6 = TC.C13679b.a.C2855a.f116679a
            r13 = 0
            r14 = 0
            r16 = 0
            r2 = r15
            r15 = r16
            r17 = 0
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            float r5 = c2.h.B(r33)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.i(r0, r5)
            r5 = 6
            s0.C5844O.a(r0, r3, r5)
            int r0 = QA.C13351c.f114053e
            java.lang.String r5 = J1.j.b(r0, r3, r2)
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r2 = 24
            int r2 = r32 << 24
            r16 = r2 & r0
            r17 = 510(0x1fe, float:7.15E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r14 = r35
            r15 = r3
            SC.L.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r3.x()
            r3.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x02a3
            U0.C4895p.R()
        L_0x02a3:
            U0.Y0 r6 = r3.n()
            if (r6 == 0) goto L_0x02bc
            yk.g0 r7 = new yk.g0
            r0 = r7
            r1 = r34
            r2 = r35
            r3 = r31
            r4 = r38
            r5 = r39
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x02bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.t0.D(com.ingka.ikea.core.model.Media$Image, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N E(Media.Image image, e.a aVar) {
        C17542s.j(aVar, "$this$ikeaImageRequest");
        aVar.j(image != null ? image.getUrl() : null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N F(Media.Image image, C17631a aVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        D(image, aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void G(L0 l02, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-1990627583);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(l02) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1990627583, i11, -1, "com.ingka.ikea.app.shoppinglist.lists.ui.ScreenSnackbarHost (ShoppingListsScreen.kt:573)");
            }
            K0.b(l02, (androidx.compose.ui.d) null, c1.c.e(1740007060, true, new a(l02), k10, 54), k10, (i11 & 14) | 384, 2);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new Y(l02, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N H(L0 l02, int i10, C4889m mVar, int i11) {
        G(l02, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v40, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x03d4  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void I(boolean r27, boolean r28, boolean r29, nI.C17631a<XH.C16807N> r30, nI.C17642l<? super java.lang.String, XH.C16807N> r31, nI.C17631a<XH.C16807N> r32, nI.C17631a<XH.C16807N> r33, nI.C17642l<? super java.lang.Boolean, XH.C16807N> r34, xk.c r35, U0.C4889m r36, int r37, int r38) {
        /*
            r14 = r30
            r15 = r31
            r13 = r32
            r12 = r33
            r11 = r34
            r10 = r37
            r9 = r38
            java.lang.String r0 = "onBackClicked"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            java.lang.String r0 = "onListSelected"
            kotlin.jvm.internal.C17542s.j(r15, r0)
            java.lang.String r0 = "onShowLoginPromotion"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            java.lang.String r0 = "onShoppingListTabPressConsumed"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r0 = "onScrollStateChanged"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            r0 = -1699272228(0xffffffff9ab729dc, float:-7.5754654E-23)
            r1 = r36
            U0.m r8 = r1.k(r0)
            r1 = r9 & 1
            if (r1 == 0) goto L_0x0039
            r1 = r10 | 6
            r7 = r27
            goto L_0x004b
        L_0x0039:
            r1 = r10 & 6
            r7 = r27
            if (r1 != 0) goto L_0x004a
            boolean r1 = r8.b(r7)
            if (r1 == 0) goto L_0x0047
            r1 = 4
            goto L_0x0048
        L_0x0047:
            r1 = 2
        L_0x0048:
            r1 = r1 | r10
            goto L_0x004b
        L_0x004a:
            r1 = r10
        L_0x004b:
            r2 = r9 & 2
            if (r2 == 0) goto L_0x0054
            r1 = r1 | 48
            r6 = r28
            goto L_0x0066
        L_0x0054:
            r2 = r10 & 48
            r6 = r28
            if (r2 != 0) goto L_0x0066
            boolean r2 = r8.b(r6)
            if (r2 == 0) goto L_0x0063
            r2 = 32
            goto L_0x0065
        L_0x0063:
            r2 = 16
        L_0x0065:
            r1 = r1 | r2
        L_0x0066:
            r2 = r9 & 4
            if (r2 == 0) goto L_0x006f
            r1 = r1 | 384(0x180, float:5.38E-43)
            r5 = r29
            goto L_0x0081
        L_0x006f:
            r2 = r10 & 384(0x180, float:5.38E-43)
            r5 = r29
            if (r2 != 0) goto L_0x0081
            boolean r2 = r8.b(r5)
            if (r2 == 0) goto L_0x007e
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0080
        L_0x007e:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0080:
            r1 = r1 | r2
        L_0x0081:
            r2 = r9 & 8
            if (r2 == 0) goto L_0x0088
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0098
        L_0x0088:
            r2 = r10 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0098
            boolean r2 = r8.F(r14)
            if (r2 == 0) goto L_0x0095
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0097
        L_0x0095:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0097:
            r1 = r1 | r2
        L_0x0098:
            r2 = r9 & 16
            r4 = 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x00a1
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00b0
        L_0x00a1:
            r2 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x00b0
            boolean r2 = r8.F(r15)
            if (r2 == 0) goto L_0x00ad
            r2 = r4
            goto L_0x00af
        L_0x00ad:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x00af:
            r1 = r1 | r2
        L_0x00b0:
            r2 = r9 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r2 == 0) goto L_0x00b9
            r1 = r1 | r16
            goto L_0x00c9
        L_0x00b9:
            r2 = r10 & r16
            if (r2 != 0) goto L_0x00c9
            boolean r2 = r8.F(r13)
            if (r2 == 0) goto L_0x00c6
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c8
        L_0x00c6:
            r2 = 65536(0x10000, float:9.18355E-41)
        L_0x00c8:
            r1 = r1 | r2
        L_0x00c9:
            r2 = r9 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r2 == 0) goto L_0x00d2
            r1 = r1 | r16
            goto L_0x00e2
        L_0x00d2:
            r2 = r10 & r16
            if (r2 != 0) goto L_0x00e2
            boolean r2 = r8.F(r12)
            if (r2 == 0) goto L_0x00df
            r2 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e1
        L_0x00df:
            r2 = 524288(0x80000, float:7.34684E-40)
        L_0x00e1:
            r1 = r1 | r2
        L_0x00e2:
            r2 = r9 & 128(0x80, float:1.794E-43)
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            if (r2 == 0) goto L_0x00eb
            r1 = r1 | r16
            goto L_0x00fb
        L_0x00eb:
            r2 = r10 & r16
            if (r2 != 0) goto L_0x00fb
            boolean r2 = r8.F(r11)
            if (r2 == 0) goto L_0x00f8
            r2 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fa
        L_0x00f8:
            r2 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fa:
            r1 = r1 | r2
        L_0x00fb:
            r2 = 100663296(0x6000000, float:2.4074124E-35)
            r2 = r2 & r10
            if (r2 != 0) goto L_0x0118
            r2 = r9 & 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L_0x010f
            r2 = r35
            boolean r16 = r8.F(r2)
            if (r16 == 0) goto L_0x0111
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0113
        L_0x010f:
            r2 = r35
        L_0x0111:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0113:
            r1 = r1 | r16
        L_0x0115:
            r16 = r1
            goto L_0x011b
        L_0x0118:
            r2 = r35
            goto L_0x0115
        L_0x011b:
            r1 = 38347923(0x2492493, float:1.4777644E-37)
            r1 = r16 & r1
            r3 = 38347922(0x2492492, float:1.4777643E-37)
            if (r1 != r3) goto L_0x0133
            boolean r1 = r8.l()
            if (r1 != 0) goto L_0x012c
            goto L_0x0133
        L_0x012c:
            r8.L()
            r9 = r2
            r7 = r8
            goto L_0x03e0
        L_0x0133:
            r8.G()
            r1 = r10 & 1
            r17 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r3 = 0
            if (r1 == 0) goto L_0x0158
            boolean r1 = r8.O()
            if (r1 == 0) goto L_0x0145
            goto L_0x0158
        L_0x0145:
            r8.L()
            r1 = r9 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0155
            r16 = r16 & r17
            r36 = r8
            r7 = r16
            r8 = r2
            goto L_0x01b9
        L_0x0155:
            r36 = r8
            goto L_0x01b7
        L_0x0158:
            r1 = r9 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0155
            r1 = 1890788296(0x70b323c8, float:4.435286E29)
            r8.C(r1)
            m3.a r1 = m3.a.f26247a
            int r2 = m3.a.f26249c
            androidx.lifecycle.k0 r2 = r1.a(r8, r2)
            if (r2 == 0) goto L_0x01af
            androidx.lifecycle.i0$c r18 = f3.a.a(r2, r8, r3)
            r1 = 1729797275(0x671a9c9b, float:7.301333E23)
            r8.C(r1)
            boolean r1 = r2 instanceof androidx.lifecycle.C5212o
            if (r1 == 0) goto L_0x0184
            r1 = r2
            androidx.lifecycle.o r1 = (androidx.lifecycle.C5212o) r1
            l3.a r1 = r1.getDefaultViewModelCreationExtras()
        L_0x0181:
            r19 = r1
            goto L_0x0187
        L_0x0184:
            l3.a$a r1 = l3.a.C0407a.f25486b
            goto L_0x0181
        L_0x0187:
            r20 = 36936(0x9048, float:5.1758E-41)
            r21 = 0
            java.lang.Class<xk.c> r1 = xk.c.class
            r22 = 0
            r3 = r22
            r4 = r18
            r5 = r19
            r6 = r8
            r7 = r20
            r36 = r8
            r8 = r21
            androidx.lifecycle.f0 r1 = m3.c.b(r1, r2, r3, r4, r5, r6, r7, r8)
            r36.U()
            r36.U()
            xk.c r1 = (xk.c) r1
            r16 = r16 & r17
            r8 = r1
        L_0x01ac:
            r7 = r16
            goto L_0x01b9
        L_0x01af:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r0.<init>(r1)
            throw r0
        L_0x01b7:
            r8 = r2
            goto L_0x01ac
        L_0x01b9:
            r36.y()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x01c8
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.app.shoppinglist.lists.ui.ShoppingListsDestination (ShoppingListsScreen.kt:113)"
            U0.C4895p.S(r0, r7, r1, r2)
        L_0x01c8:
            U0.I0 r0 = Vo.b.c()
            r6 = r36
            java.lang.Object r0 = r6.Q(r0)
            androidx.fragment.app.o r0 = (androidx.fragment.app.C5187o) r0
            x4.o r0 = androidx.navigation.fragment.a.a(r0)
            r1 = -360728050(0xffffffffea7fba0e, float:-7.7288676E25)
            r6.W(r1)
            java.lang.Object r1 = r6.D()
            U0.m$a r16 = U0.C4889m.f14007a
            java.lang.Object r2 = r16.a()
            if (r1 != r2) goto L_0x01f4
            x4.l r1 = r0.H()
            kotlin.jvm.internal.C17542s.g(r1)
            r6.u(r1)
        L_0x01f4:
            r0 = r1
            x4.l r0 = (x4.C8948l) r0
            r6.P()
            TJ.P r1 = r8.getState()
            r17 = 0
            r18 = 7
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = r6
            r23 = r6
            r6 = r17
            r17 = r7
            r7 = r18
            U0.A1 r7 = j3.a.c(r1, r2, r3, r4, r5, r6, r7)
            r6 = 0
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r2 = -360722611(0xffffffffea7fcf4d, float:-7.731376E25)
            r5 = r23
            r5.W(r2)
            java.lang.Object r2 = r5.D()
            java.lang.Object r3 = r16.a()
            if (r2 != r3) goto L_0x022f
            yk.W r2 = new yk.W
            r2.<init>()
            r5.u(r2)
        L_0x022f:
            r4 = r2
            nI.a r4 = (nI.C17631a) r4
            r5.P()
            r18 = 3072(0xc00, float:4.305E-42)
            r19 = 6
            r2 = 0
            r3 = 0
            r36 = r5
            r20 = r6
            r6 = r18
            r35 = r7
            r7 = r19
            java.lang.Object r1 = f1.C5301c.e(r1, r2, r3, r4, r5, r6, r7)
            r7 = r1
            U0.r0 r7 = (U0.C4899r0) r7
            xk.b r1 = J(r35)
            r2 = -360696395(0xffffffffea8035b5, float:-7.749806E25)
            r6 = r36
            r6.W(r2)
            boolean r2 = r6.F(r8)
            java.lang.Object r3 = r6.D()
            if (r2 != 0) goto L_0x0268
            java.lang.Object r2 = r16.a()
            if (r3 != r2) goto L_0x0270
        L_0x0268:
            yk.t0$b r3 = new yk.t0$b
            r3.<init>(r8)
            r6.u(r3)
        L_0x0270:
            uI.h r3 = (uI.C18059h) r3
            r6.P()
            r2 = -360715239(0xffffffffea7fec19, float:-7.7347755E25)
            r6.W(r2)
            r2 = r35
            boolean r4 = r6.V(r2)
            boolean r5 = r6.V(r7)
            r4 = r4 | r5
            r5 = 458752(0x70000, float:6.42848E-40)
            r5 = r17 & r5
            r18 = 1
            r35 = r0
            r0 = 131072(0x20000, float:1.83671E-40)
            if (r5 != r0) goto L_0x0295
            r0 = r18
            goto L_0x0297
        L_0x0295:
            r0 = r20
        L_0x0297:
            r0 = r0 | r4
            java.lang.Object r4 = r6.D()
            if (r0 != 0) goto L_0x02a4
            java.lang.Object r0 = r16.a()
            if (r4 != r0) goto L_0x02ac
        L_0x02a4:
            yk.h0 r4 = new yk.h0
            r4.<init>(r13, r2, r7)
            r6.u(r4)
        L_0x02ac:
            r5 = r4
            nI.a r5 = (nI.C17631a) r5
            r6.P()
            r0 = -360704979(0xffffffffea80142d, float:-7.741889E25)
            r6.W(r0)
            boolean r0 = r6.F(r8)
            java.lang.Object r2 = r6.D()
            if (r0 != 0) goto L_0x02c8
            java.lang.Object r0 = r16.a()
            if (r2 != r0) goto L_0x02d0
        L_0x02c8:
            yk.k0 r2 = new yk.k0
            r2.<init>(r8)
            r6.u(r2)
        L_0x02d0:
            r19 = r2
            nI.a r19 = (nI.C17631a) r19
            r6.P()
            r0 = -360709197(0xffffffffea8003b3, float:-7.737999E25)
            r6.W(r0)
            boolean r0 = r6.F(r8)
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r17 & r2
            r4 = 16384(0x4000, float:2.2959E-41)
            if (r2 != r4) goto L_0x02ec
            r20 = r18
        L_0x02ec:
            r0 = r0 | r20
            java.lang.Object r2 = r6.D()
            if (r0 != 0) goto L_0x02fa
            java.lang.Object r0 = r16.a()
            if (r2 != r0) goto L_0x0302
        L_0x02fa:
            yk.l0 r2 = new yk.l0
            r2.<init>(r8, r15)
            r6.u(r2)
        L_0x0302:
            r18 = r2
            nI.l r18 = (nI.C17642l) r18
            r6.P()
            r20 = r3
            nI.l r20 = (nI.C17642l) r20
            int r0 = r17 << 3
            r2 = 65520(0xfff0, float:9.1813E-41)
            r0 = r0 & r2
            int r2 = r17 << 6
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r2
            r0 = r0 | r3
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            r2 = r2 & r3
            r17 = r0 | r2
            r21 = 0
            r4 = r35
            r0 = r1
            r1 = r27
            r2 = r28
            r3 = r29
            r24 = r4
            r4 = r30
            r36 = r6
            r6 = r19
            r25 = r7
            r7 = r18
            r26 = r8
            r8 = r33
            r9 = r34
            r10 = r20
            r11 = r36
            r12 = r17
            r13 = r21
            U(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = -360688785(0xffffffffea80536f, float:-7.756825E25)
            r7 = r36
            r7.W(r0)
            r1 = r25
            boolean r0 = r7.V(r1)
            java.lang.Object r2 = r7.D()
            if (r0 != 0) goto L_0x0360
            java.lang.Object r0 = r16.a()
            if (r2 != r0) goto L_0x0368
        L_0x0360:
            yk.m0 r2 = new yk.m0
            r2.<init>(r1)
            r7.u(r2)
        L_0x0368:
            nI.l r2 = (nI.C17642l) r2
            r7.P()
            java.lang.String r0 = "login_signup_promotion_signup"
            r3 = 48
            r4 = r24
            qw.l.c(r4, r0, r2, r7, r3)
            boolean r0 = R(r1)
            if (r0 == 0) goto L_0x03d4
            r0 = -360680493(0xffffffffea8073d3, float:-7.7644735E25)
            r7.W(r0)
            boolean r0 = r7.V(r1)
            r8 = r26
            boolean r2 = r7.F(r8)
            r0 = r0 | r2
            java.lang.Object r2 = r7.D()
            if (r0 != 0) goto L_0x0399
            java.lang.Object r0 = r16.a()
            if (r2 != r0) goto L_0x03a1
        L_0x0399:
            yk.n0 r2 = new yk.n0
            r2.<init>(r8, r1)
            r7.u(r2)
        L_0x03a1:
            r0 = r2
            nI.l r0 = (nI.C17642l) r0
            r7.P()
            r2 = -360675440(0xffffffffea808790, float:-7.769134E25)
            r7.W(r2)
            boolean r2 = r7.V(r1)
            java.lang.Object r3 = r7.D()
            if (r2 != 0) goto L_0x03bd
            java.lang.Object r2 = r16.a()
            if (r3 != r2) goto L_0x03c5
        L_0x03bd:
            yk.o0 r3 = new yk.o0
            r3.<init>(r1)
            r7.u(r3)
        L_0x03c5:
            r2 = r3
            nI.a r2 = (nI.C17631a) r2
            r7.P()
            r5 = 0
            r6 = 4
            r3 = 0
            r1 = r0
            r4 = r7
            uB.C15104b.b(r1, r2, r3, r4, r5, r6)
            goto L_0x03d6
        L_0x03d4:
            r8 = r26
        L_0x03d6:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x03df
            U0.C4895p.R()
        L_0x03df:
            r9 = r8
        L_0x03e0:
            U0.Y0 r12 = r7.n()
            if (r12 == 0) goto L_0x0403
            yk.p0 r13 = new yk.p0
            r0 = r13
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r5 = r31
            r6 = r32
            r7 = r33
            r8 = r34
            r10 = r37
            r11 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x0403:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.t0.I(boolean, boolean, boolean, nI.a, nI.l, nI.a, nI.a, nI.l, xk.c, U0.m, int, int):void");
    }

    private static final C12316b J(A1<C12316b> a12) {
        return a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N K(xk.c cVar) {
        cVar.D();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N L(xk.c cVar, C17642l lVar, String str) {
        C17542s.j(str, "it");
        cVar.G(str);
        lVar.invoke(str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N M(C4899r0 r0Var, a.b bVar) {
        C17542s.j(bVar, "result");
        if (C17542s.e(bVar, a.b.c.f108192a)) {
            S(r0Var, true);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N N(xk.c cVar, C4899r0 r0Var, String str) {
        C17542s.j(str, "listName");
        S(r0Var, false);
        cVar.E(str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N O(C4899r0 r0Var) {
        S(r0Var, false);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N P(boolean z10, boolean z11, boolean z12, C17631a aVar, C17642l lVar, C17631a aVar2, C17631a aVar3, C17642l lVar2, xk.c cVar, int i10, int i11, C4889m mVar, int i12) {
        I(z10, z11, z12, aVar, lVar, aVar2, aVar3, lVar2, cVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C4899r0 Q() {
        return u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
    }

    private static final boolean R(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void S(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N T(C17631a aVar, A1 a12, C4899r0 r0Var) {
        if (J(a12).h()) {
            S(r0Var, true);
        } else {
            aVar.invoke();
        }
        return C16807N.f139792a;
    }

    public static final void U(C12316b bVar, boolean z10, boolean z11, boolean z12, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C17642l<? super String, C16807N> lVar, C17631a<C16807N> aVar4, C17642l<? super Boolean, C16807N> lVar2, C17642l<? super C14504f, C16807N> lVar3, C4889m mVar, int i10, int i11) {
        int i12;
        int i13;
        C4889m mVar2;
        C12316b bVar2 = bVar;
        C17631a<C16807N> aVar5 = aVar;
        C17631a<C16807N> aVar6 = aVar2;
        C17631a<C16807N> aVar7 = aVar3;
        C17642l<? super String, C16807N> lVar4 = lVar;
        C17631a<C16807N> aVar8 = aVar4;
        C17642l<? super Boolean, C16807N> lVar5 = lVar2;
        C17642l<? super C14504f, C16807N> lVar6 = lVar3;
        int i14 = i10;
        C17542s.j(bVar2, "state");
        C17542s.j(aVar5, "onBackClicked");
        C17542s.j(aVar6, "onCreateListClicked");
        C17542s.j(aVar7, "onCreateListResultHandled");
        C17542s.j(lVar4, "onListClicked");
        C17542s.j(aVar8, "onShoppingListScrollToTopConsumed");
        C17542s.j(lVar5, "onScrollStateChanged");
        C17542s.j(lVar6, "onCardSizeToggleClicked");
        C4889m k10 = mVar.k(88067357);
        if ((i14 & 6) == 0) {
            i12 = (k10.F(bVar2) ? 4 : 2) | i14;
        } else {
            i12 = i14;
        }
        boolean z13 = z10;
        if ((i14 & 48) == 0) {
            i12 |= k10.b(z13) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i12 |= k10.b(z11) ? 256 : 128;
        } else {
            boolean z14 = z11;
        }
        if ((i14 & 3072) == 0) {
            i12 |= k10.b(z12) ? RecyclerView.n.FLAG_MOVED : 1024;
        } else {
            boolean z15 = z12;
        }
        if ((i14 & 24576) == 0) {
            i12 |= k10.F(aVar5) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i12 |= k10.F(aVar6) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i14) == 0) {
            i12 |= k10.F(aVar7) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        if ((12582912 & i14) == 0) {
            i12 |= k10.F(lVar4) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i12 |= k10.F(aVar8) ? 67108864 : 33554432;
        }
        if ((805306368 & i14) == 0) {
            i12 |= k10.F(lVar5) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (k10.F(lVar6) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i12 & 306783379) == 306783378 && (i13 & 3) == 2 && k10.l()) {
            k10.L();
            mVar2 = k10;
        } else {
            if (C4895p.J()) {
                C4895p.S(88067357, i12, i13, "com.ingka.ikea.app.shoppinglist.lists.ui.ShoppingListsScreen (ShoppingListsScreen.kt:181)");
            }
            Context context = (Context) k10.Q(AndroidCompositionLocals_androidKt.g());
            k10.W(-1251719834);
            Object D10 = k10.D();
            C4889m.a aVar9 = C4889m.f14007a;
            if (D10 == aVar9.a()) {
                D10 = new L0();
                k10.u(D10);
            }
            L0 l02 = (L0) D10;
            k10.P();
            C5974I b10 = C5975J.b(0, 0, k10, 0, 3);
            k10.W(-1251716377);
            Object D11 = k10.D();
            if (D11 == aVar9.a()) {
                D11 = u1.e(Boolean.TRUE, (o1) null, 2, (Object) null);
                k10.u(D11);
            }
            C4899r0 r0Var = (C4899r0) D11;
            k10.P();
            Boolean valueOf = Boolean.valueOf(V(r0Var));
            k10.W(-1251714117);
            boolean z16 = (1879048192 & i12) == 536870912;
            Object D12 = k10.D();
            if (z16 || D12 == aVar9.a()) {
                D12 = new c(lVar5, r0Var, (C17164e<? super c>) null);
                k10.u(D12);
            }
            k10.P();
            P.g(valueOf, (p) D12, k10, 0);
            k10.W(-1251711190);
            Object D13 = k10.D();
            if (D13 == aVar9.a()) {
                D13 = new q0(r0Var);
                k10.u(D13);
            }
            k10.P();
            vl.k.e(b10, (C17642l) D13, k10, 48);
            int i15 = i12 << 3;
            C5974I i16 = b10;
            int i17 = i12;
            C4899r0 r0Var2 = r0Var;
            C4889m mVar3 = k10;
            Z(bVar, z10, z11, l02, i16, aVar, aVar2, lVar, lVar3, mVar3, (i12 & 14) | 3072 | (i12 & 112) | (i12 & 896) | (i15 & ImageMetadata.JPEG_GPS_COORDINATES) | (i15 & 3670016) | (29360128 & i12) | ((i13 << 24) & 234881024));
            C12315a c10 = bVar.c();
            mVar2 = mVar3;
            mVar2.W(-1251693282);
            C5974I i18 = i16;
            boolean F10 = mVar2.F(c10) | mVar2.F(context) | ((i17 & 3670016) == 1048576) | mVar2.V(i18);
            Object D14 = mVar2.D();
            if (F10 || D14 == aVar9.a()) {
                d dVar = new d(c10, context, aVar3, l02, i18, (C17164e<? super d>) null);
                mVar2.u(dVar);
                D14 = dVar;
            }
            mVar2.P();
            P.g(c10, (p) D14, mVar2, 0);
            Boolean valueOf2 = Boolean.valueOf(z12);
            mVar2.W(-1251669240);
            boolean V10 = mVar2.V(i18) | ((i17 & 7168) == 2048) | ((i17 & 234881024) == 67108864);
            Object D15 = mVar2.D();
            if (V10 || D15 == aVar9.a()) {
                e eVar = new e(z12, i18, aVar4, r0Var2, (C17164e<? super e>) null);
                mVar2.u(eVar);
                D15 = eVar;
            }
            mVar2.P();
            P.g(valueOf2, (p) D15, mVar2, (i17 >> 9) & 14);
            if (C4895p.J()) {
                C4895p.R();
            }
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            r0 r0Var3 = r0;
            r0 r0Var4 = new r0(bVar, z10, z11, z12, aVar, aVar2, aVar3, lVar, aVar4, lVar2, lVar3, i10, i11);
            n10.a(r0Var3);
        }
    }

    /* access modifiers changed from: private */
    public static final boolean V(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void W(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N X(C4899r0 r0Var, boolean z10) {
        W(r0Var, z10);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Y(C12316b bVar, boolean z10, boolean z11, boolean z12, C17631a aVar, C17631a aVar2, C17631a aVar3, C17642l lVar, C17631a aVar4, C17642l lVar2, C17642l lVar3, int i10, int i11, C4889m mVar, int i12) {
        U(bVar, z10, z11, z12, aVar, aVar2, aVar3, lVar, aVar4, lVar2, lVar3, mVar, M0.a(i10 | 1), M0.a(i11));
        return C16807N.f139792a;
    }

    private static final void Z(C12316b bVar, boolean z10, boolean z11, L0 l02, C5974I i10, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C17642l<? super String, C16807N> lVar, C17642l<? super C14504f, C16807N> lVar2, C4889m mVar, int i11) {
        int i12;
        C4889m mVar2;
        C12316b bVar2 = bVar;
        boolean z12 = z11;
        L0 l03 = l02;
        C17631a<C16807N> aVar3 = aVar;
        C17631a<C16807N> aVar4 = aVar2;
        int i13 = i11;
        C4889m k10 = mVar.k(-1347373613);
        if ((i13 & 6) == 0) {
            i12 = (k10.F(bVar2) ? 4 : 2) | i13;
        } else {
            i12 = i13;
        }
        boolean z13 = z10;
        if ((i13 & 48) == 0) {
            i12 |= k10.b(z13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i12 |= k10.b(z12) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i12 |= k10.V(l03) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        C5974I i14 = i10;
        if ((i13 & 24576) == 0) {
            i12 |= k10.V(i14) ? 16384 : 8192;
        }
        if ((196608 & i13) == 0) {
            i12 |= k10.F(aVar3) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i13) == 0) {
            i12 |= k10.F(aVar4) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        C17642l<? super String, C16807N> lVar3 = lVar;
        if ((12582912 & i13) == 0) {
            i12 |= k10.F(lVar3) ? 8388608 : 4194304;
        }
        C17642l<? super C14504f, C16807N> lVar4 = lVar2;
        if ((100663296 & i13) == 0) {
            i12 |= k10.F(lVar4) ? 67108864 : 33554432;
        }
        if ((38347923 & i12) != 38347922 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1347373613, i12, -1, "com.ingka.ikea.app.shoppinglist.lists.ui.ShoppingListsScreenUi (ShoppingListsScreen.kt:251)");
            }
            C5848T c10 = C5850V.c(c2.h.B((float) 0), 0.0f, 0.0f, 0.0f, 14, (Object) null);
            C5264a e10 = c1.c.e(1063446679, true, new f(z12, aVar3, bVar2, aVar4), k10, 54);
            C5264a e11 = c1.c.e(1309254553, true, new g(l03), k10, 54);
            h hVar = r0;
            h hVar2 = new h(bVar, z10, i10, lVar, aVar2, lVar2);
            mVar2 = k10;
            C4762x0.a((androidx.compose.ui.d) null, e10, (p<? super C4889m, ? super Integer, C16807N>) null, e11, (p<? super C4889m, ? super Integer, C16807N>) null, 0, 0, 0, c10, c1.c.e(-1257532958, true, hVar, k10, 54), mVar2, 805309488, 245);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new X(bVar, z10, z11, l02, i10, aVar, aVar2, lVar, lVar2, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N a0(C12316b bVar, boolean z10, boolean z11, L0 l02, C5974I i10, C17631a aVar, C17631a aVar2, C17642l lVar, C17642l lVar2, int i11, C4889m mVar, int i12) {
        Z(bVar, z10, z11, l02, i10, aVar, aVar2, lVar, lVar2, mVar, M0.a(i11 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v0, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v1, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0534  */
    /* JADX WARNING: Removed duplicated region for block: B:228:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void b0(KJ.C15987c<vB.C15128a> r50, boolean r51, int r52, boolean r53, u0.C5974I r54, com.ingka.ikea.core.model.Media.Image r55, gB.C14504f r56, nI.C17642l<? super java.lang.String, XH.C16807N> r57, nI.C17631a<XH.C16807N> r58, nI.C17642l<? super gB.C14504f, XH.C16807N> r59, androidx.compose.ui.d r60, U0.C4889m r61, int r62, int r63, int r64) {
        /*
            r1 = r50
            r3 = r52
            r11 = r53
            r12 = r56
            r13 = r57
            r14 = r59
            r15 = r62
            r2 = r64
            r9 = 1572864(0x180000, float:2.204052E-39)
            r10 = 196608(0x30000, float:2.75506E-40)
            r4 = 128(0x80, float:1.794E-43)
            r18 = 16
            r19 = 32
            r7 = -1928402705(0xffffffff8d0ee8ef, float:-4.403751E-31)
            r5 = r61
            U0.m r5 = r5.k(r7)
            r7 = 1
            r23 = r2 & 1
            r7 = 4
            r6 = 2
            if (r23 == 0) goto L_0x002d
            r23 = r15 | 6
            goto L_0x004a
        L_0x002d:
            r23 = r15 & 6
            if (r23 != 0) goto L_0x0048
            r23 = r15 & 8
            if (r23 != 0) goto L_0x003a
            boolean r23 = r5.V(r1)
            goto L_0x003e
        L_0x003a:
            boolean r23 = r5.F(r1)
        L_0x003e:
            if (r23 == 0) goto L_0x0043
            r23 = r7
            goto L_0x0045
        L_0x0043:
            r23 = r6
        L_0x0045:
            r23 = r15 | r23
            goto L_0x004a
        L_0x0048:
            r23 = r15
        L_0x004a:
            r25 = r2 & 2
            if (r25 == 0) goto L_0x0055
            r23 = r23 | 48
            r6 = r51
        L_0x0052:
            r0 = r23
            goto L_0x0069
        L_0x0055:
            r25 = r15 & 48
            r6 = r51
            if (r25 != 0) goto L_0x0052
            boolean r25 = r5.b(r6)
            if (r25 == 0) goto L_0x0064
            r25 = r19
            goto L_0x0066
        L_0x0064:
            r25 = r18
        L_0x0066:
            r23 = r23 | r25
            goto L_0x0052
        L_0x0069:
            r23 = r2 & 4
            if (r23 == 0) goto L_0x0070
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x007f
        L_0x0070:
            r7 = r15 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x007f
            boolean r7 = r5.d(r3)
            if (r7 == 0) goto L_0x007d
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x007e
        L_0x007d:
            r7 = r4
        L_0x007e:
            r0 = r0 | r7
        L_0x007f:
            r7 = r2 & 8
            if (r7 == 0) goto L_0x0086
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0096
        L_0x0086:
            r7 = r15 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0096
            boolean r7 = r5.b(r11)
            if (r7 == 0) goto L_0x0093
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0095
        L_0x0093:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0095:
            r0 = r0 | r7
        L_0x0096:
            r7 = r2 & 16
            if (r7 == 0) goto L_0x009f
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x009c:
            r7 = r54
            goto L_0x00b2
        L_0x009f:
            r7 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L_0x009c
            r7 = r54
            boolean r18 = r5.V(r7)
            if (r18 == 0) goto L_0x00ae
            r18 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00b0
        L_0x00ae:
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x00b0:
            r0 = r0 | r18
        L_0x00b2:
            r18 = r2 & 32
            if (r18 == 0) goto L_0x00ba
            r0 = r0 | r10
        L_0x00b7:
            r10 = r55
            goto L_0x00cc
        L_0x00ba:
            r10 = r10 & r15
            if (r10 != 0) goto L_0x00b7
            r10 = r55
            boolean r18 = r5.F(r10)
            if (r18 == 0) goto L_0x00c8
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ca
        L_0x00c8:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00ca:
            r0 = r0 | r18
        L_0x00cc:
            r18 = r2 & 64
            if (r18 == 0) goto L_0x00d2
        L_0x00d0:
            r0 = r0 | r9
            goto L_0x00e1
        L_0x00d2:
            r9 = r9 & r15
            if (r9 != 0) goto L_0x00e1
            boolean r9 = r5.V(r12)
            if (r9 == 0) goto L_0x00de
            r9 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d0
        L_0x00de:
            r9 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00d0
        L_0x00e1:
            r4 = r4 & r2
            if (r4 == 0) goto L_0x00ea
            r4 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00e6:
            r0 = r0 | r4
        L_0x00e7:
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x00fb
        L_0x00ea:
            r4 = 12582912(0xc00000, float:1.7632415E-38)
            r4 = r4 & r15
            if (r4 != 0) goto L_0x00e7
            boolean r4 = r5.F(r13)
            if (r4 == 0) goto L_0x00f8
            r4 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e6
        L_0x00f8:
            r4 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00e6
        L_0x00fb:
            r4 = r4 & r2
            if (r4 == 0) goto L_0x0104
            r4 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r4
            r9 = r58
            goto L_0x0117
        L_0x0104:
            r4 = 100663296(0x6000000, float:2.4074124E-35)
            r4 = r4 & r15
            r9 = r58
            if (r4 != 0) goto L_0x0117
            boolean r4 = r5.F(r9)
            if (r4 == 0) goto L_0x0114
            r4 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0116
        L_0x0114:
            r4 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0116:
            r0 = r0 | r4
        L_0x0117:
            r4 = r2 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x0121
            r4 = 805306368(0x30000000, float:4.656613E-10)
        L_0x011d:
            r0 = r0 | r4
        L_0x011e:
            r4 = 1024(0x400, float:1.435E-42)
            goto L_0x0132
        L_0x0121:
            r4 = 805306368(0x30000000, float:4.656613E-10)
            r4 = r4 & r15
            if (r4 != 0) goto L_0x011e
            boolean r4 = r5.F(r14)
            if (r4 == 0) goto L_0x012f
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x011d
        L_0x012f:
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x011d
        L_0x0132:
            r4 = r4 & r2
            if (r4 == 0) goto L_0x013c
            r18 = r63 | 6
            r8 = r60
            r2 = r18
            goto L_0x0154
        L_0x013c:
            r18 = r63 & 6
            r8 = r60
            if (r18 != 0) goto L_0x0152
            boolean r20 = r5.V(r8)
            if (r20 == 0) goto L_0x014b
            r20 = 4
            goto L_0x014d
        L_0x014b:
            r20 = 2
        L_0x014d:
            r20 = r63 | r20
            r2 = r20
            goto L_0x0154
        L_0x0152:
            r2 = r63
        L_0x0154:
            r20 = 306783379(0x12492493, float:6.34695E-28)
            r6 = r0 & r20
            r7 = 306783378(0x12492492, float:6.3469493E-28)
            if (r6 != r7) goto L_0x0173
            r6 = 3
            r7 = r2 & 3
            r6 = 2
            if (r7 != r6) goto L_0x0173
            boolean r6 = r5.l()
            if (r6 != 0) goto L_0x016b
            goto L_0x0173
        L_0x016b:
            r5.L()
            r7 = r11
            r11 = r8
            r8 = r13
            goto L_0x052e
        L_0x0173:
            if (r4 == 0) goto L_0x0178
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            r8 = r4
        L_0x0178:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0186
            java.lang.String r4 = "com.ingka.ikea.app.shoppinglist.lists.ui.SignedInContent (ShoppingListsScreen.kt:466)"
            r6 = -1928402705(0xffffffff8d0ee8ef, float:-4.403751E-31)
            U0.C4895p.S(r6, r0, r2, r4)
        L_0x0186:
            r2 = 0
            r7 = 0
            r4 = 1
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.f(r8, r2, r4, r7)
            i1.c$a r20 = i1.C5437c.f24302a
            i1.c r4 = r20.o()
            r2 = 0
            E1.I r4 = androidx.compose.foundation.layout.C5077h.h(r4, r2)
            int r21 = U0.C4883j.a(r5, r2)
            U0.y r2 = r5.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r5, r6)
            G1.g$a r22 = G1.C4504g.f6515W
            nI.a r7 = r22.a()
            U0.f r24 = r5.m()
            if (r24 != 0) goto L_0x01b3
            U0.C4883j.c()
        L_0x01b3:
            r5.I()
            boolean r24 = r5.i()
            if (r24 == 0) goto L_0x01c0
            r5.p(r7)
            goto L_0x01c3
        L_0x01c0:
            r5.t()
        L_0x01c3:
            U0.m r7 = U0.F1.a(r5)
            r24 = r8
            nI.p r8 = r22.c()
            U0.F1.c(r7, r4, r8)
            nI.p r4 = r22.e()
            U0.F1.c(r7, r2, r4)
            nI.p r2 = r22.b()
            boolean r4 = r7.i()
            if (r4 != 0) goto L_0x01ef
            java.lang.Object r4 = r7.D()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r21)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r8)
            if (r4 != 0) goto L_0x01fd
        L_0x01ef:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r21)
            r7.u(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r21)
            r7.w(r4, r2)
        L_0x01fd:
            nI.p r2 = r22.d()
            U0.F1.c(r7, r6, r2)
            androidx.compose.foundation.layout.j r2 = androidx.compose.foundation.layout.C5079j.f18125a
            boolean r4 = r50.isEmpty()
            if (r4 == 0) goto L_0x0253
            r4 = -1430668337(0xffffffffaab9bbcf, float:-3.299292E-13)
            r5.W(r4)
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            r6 = 0
            r7 = 1
            r8 = 0
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.f(r4, r6, r7, r8)
            int r4 = r0 >> 15
            r4 = r4 & 14
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            int r6 = r0 >> 6
            r6 = r6 & 112(0x70, float:1.57E-43)
            r4 = r4 | r6
            int r6 = r0 >> 18
            r6 = r6 & 896(0x380, float:1.256E-42)
            r17 = r4 | r6
            r18 = 0
            r4 = r55
            r6 = r5
            r5 = r53
            r61 = r6
            r6 = r58
            r8 = r7
            r7 = r16
            r21 = r24
            r8 = r61
            r9 = r17
            r10 = r18
            y(r4, r5, r6, r7, r8, r9, r10)
            r61.P()
            r5 = r61
            r48 = r2
            r7 = r11
            r8 = r13
        L_0x024e:
            r2 = 0
            r4 = 0
            r6 = 3
            goto L_0x04ee
        L_0x0253:
            r61 = r5
            r21 = r24
            r4 = -1430338187(0xffffffffaabec575, float:-3.3887793E-13)
            r5.W(r4)
            KJ.f r4 = j0()
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            r7 = 1
            r8 = 0
            r9 = 0
            androidx.compose.ui.d r10 = androidx.compose.foundation.layout.J.f(r6, r8, r7, r9)
            androidx.compose.foundation.layout.d r8 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r7 = r8.g()
            i1.c$b r9 = r20.k()
            r15 = 0
            E1.I r7 = androidx.compose.foundation.layout.C5080k.a(r7, r9, r5, r15)
            int r9 = U0.C4883j.a(r5, r15)
            U0.y r15 = r5.s()
            androidx.compose.ui.d r10 = androidx.compose.ui.c.e(r5, r10)
            r48 = r2
            nI.a r2 = r22.a()
            U0.f r23 = r5.m()
            if (r23 != 0) goto L_0x0294
            U0.C4883j.c()
        L_0x0294:
            r5.I()
            boolean r23 = r5.i()
            if (r23 == 0) goto L_0x02a1
            r5.p(r2)
            goto L_0x02a4
        L_0x02a1:
            r5.t()
        L_0x02a4:
            U0.m r2 = U0.F1.a(r5)
            nI.p r11 = r22.c()
            U0.F1.c(r2, r7, r11)
            nI.p r7 = r22.e()
            U0.F1.c(r2, r15, r7)
            nI.p r7 = r22.b()
            boolean r11 = r2.i()
            if (r11 != 0) goto L_0x02ce
            java.lang.Object r11 = r2.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r9)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r15)
            if (r11 != 0) goto L_0x02dc
        L_0x02ce:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r2.u(r11)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r2.w(r9, r7)
        L_0x02dc:
            nI.p r7 = r22.d()
            U0.F1.c(r2, r10, r7)
            s0.h r2 = s0.C5862h.f28810a
            tK.u r2 = tK.C18029u.f147649a
            float r7 = r2.j()
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.J.i(r6, r7)
            r9 = 0
            s0.C5844O.a(r7, r5, r9)
            r7 = 1
            r10 = 0
            r11 = 0
            androidx.compose.ui.d r15 = androidx.compose.foundation.layout.J.h(r6, r10, r7, r11)
            i1.c$c r7 = r20.i()
            androidx.compose.foundation.layout.d$f r10 = r8.d()
            r11 = 54
            E1.I r7 = androidx.compose.foundation.layout.G.b(r10, r7, r5, r11)
            int r10 = U0.C4883j.a(r5, r9)
            U0.y r9 = r5.s()
            androidx.compose.ui.d r11 = androidx.compose.ui.c.e(r5, r15)
            nI.a r15 = r22.a()
            U0.f r23 = r5.m()
            if (r23 != 0) goto L_0x0321
            U0.C4883j.c()
        L_0x0321:
            r5.I()
            boolean r23 = r5.i()
            if (r23 == 0) goto L_0x032e
            r5.p(r15)
            goto L_0x0331
        L_0x032e:
            r5.t()
        L_0x0331:
            U0.m r15 = U0.F1.a(r5)
            nI.p r13 = r22.c()
            U0.F1.c(r15, r7, r13)
            nI.p r7 = r22.e()
            U0.F1.c(r15, r9, r7)
            nI.p r7 = r22.b()
            boolean r9 = r15.i()
            if (r9 != 0) goto L_0x035b
            java.lang.Object r9 = r15.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r13)
            if (r9 != 0) goto L_0x0369
        L_0x035b:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r15.u(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r15.w(r9, r7)
        L_0x0369:
            nI.p r7 = r22.d()
            U0.F1.c(r15, r11, r7)
            s0.N r7 = s0.C5843N.f28726a
            int r7 = ik.c.f98328T
            r9 = 0
            java.lang.String r22 = J1.j.b(r7, r5, r9)
            TC.b$b$a r23 = TC.C13679b.C2857b.a.f116683a
            S1.C$a r7 = S1.C.f13316b
            S1.C r30 = r7.a()
            tK.v r7 = tK.C18030v.f147664a
            int r9 = tK.C18030v.f147665b
            tK.h r7 = r7.a(r5, r9)
            long r25 = r7.G0()
            androidx.compose.ui.d r24 = TC.e.i(r6)
            r46 = 0
            r47 = 262064(0x3ffb0, float:3.6723E-40)
            r27 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r45 = 1572912(0x180030, float:2.204119E-39)
            r44 = r5
            SC.C13607l.j(r22, r23, r24, r25, r27, r29, r30, r31, r32, r34, r35, r36, r37, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            java.lang.String r7 = "custom_card_size_toggle"
            androidx.compose.ui.d r7 = androidx.compose.ui.platform.C5116k1.a(r6, r7)
            androidx.compose.ui.d r23 = TC.e.i(r7)
            int r24 = r56.ordinal()
            r7 = 457337968(0x1b426c70, float:1.6082342E-22)
            r5.W(r7)
            r7 = 3670016(0x380000, float:5.142788E-39)
            r7 = r7 & r0
            r9 = 1048576(0x100000, float:1.469368E-39)
            if (r7 != r9) goto L_0x03d5
            r9 = 1
            goto L_0x03d6
        L_0x03d5:
            r9 = 0
        L_0x03d6:
            r10 = 1879048192(0x70000000, float:1.58456325E29)
            r10 = r10 & r0
            r11 = 536870912(0x20000000, float:1.0842022E-19)
            if (r10 != r11) goto L_0x03df
            r10 = 1
            goto L_0x03e0
        L_0x03df:
            r10 = 0
        L_0x03e0:
            r9 = r9 | r10
            java.lang.Object r10 = r5.D()
            if (r9 != 0) goto L_0x03ef
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r9 = r9.a()
            if (r10 != r9) goto L_0x03f7
        L_0x03ef:
            yk.b0 r10 = new yk.b0
            r10.<init>(r12, r14)
            r5.u(r10)
        L_0x03f7:
            r26 = r10
            nI.l r26 = (nI.C17642l) r26
            r5.P()
            int r28 = SC.Z2.a.f116097e
            r29 = 8
            r25 = 0
            r22 = r4
            r27 = r5
            SC.b3.b(r22, r23, r24, r25, r26, r27, r28, r29)
            r5.x()
            float r4 = r2.j()
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.i(r6, r4)
            r6 = 0
            s0.C5844O.a(r4, r5, r6)
            u0.b$a r4 = new u0.b$a
            r4.<init>(r3)
            float r9 = r2.a()
            androidx.compose.foundation.layout.d$f r27 = r8.n(r9)
            float r9 = r2.d()
            androidx.compose.foundation.layout.d$f r28 = r8.n(r9)
            int[] r8 = yk.t0.m.f106494a
            int r9 = r56.ordinal()
            r8 = r8[r9]
            r9 = 1
            if (r8 == r9) goto L_0x045a
            r9 = 2
            if (r8 != r9) goto L_0x0454
            float r30 = r2.e()
            float r32 = TC.e.g()
            r33 = 5
            r34 = 0
            r29 = 0
            r31 = 0
            s0.E r2 = androidx.compose.foundation.layout.D.e(r29, r30, r31, r32, r33, r34)
        L_0x0451:
            r25 = r2
            goto L_0x046f
        L_0x0454:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x045a:
            float r8 = TC.e.g()
            float r9 = TC.e.g()
            float r2 = r2.e()
            float r10 = TC.e.g()
            s0.E r2 = androidx.compose.foundation.layout.D.d(r8, r2, r9, r10)
            goto L_0x0451
        L_0x046f:
            r2 = 1254971240(0x4acd5768, float:6728628.0)
            r5.W(r2)
            r2 = r0 & 14
            r8 = 4
            if (r2 == r8) goto L_0x0489
            r2 = r0 & 8
            if (r2 == 0) goto L_0x0485
            boolean r2 = r5.F(r1)
            if (r2 == 0) goto L_0x0485
            goto L_0x0489
        L_0x0485:
            r2 = r6
        L_0x0486:
            r8 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x048b
        L_0x0489:
            r2 = 1
            goto L_0x0486
        L_0x048b:
            if (r7 != r8) goto L_0x048f
            r7 = 1
            goto L_0x0490
        L_0x048f:
            r7 = r6
        L_0x0490:
            r2 = r2 | r7
            r7 = r0 & 7168(0x1c00, float:1.0045E-41)
            r8 = 2048(0x800, float:2.87E-42)
            if (r7 != r8) goto L_0x0499
            r7 = 1
            goto L_0x049a
        L_0x0499:
            r7 = r6
        L_0x049a:
            r2 = r2 | r7
            r7 = 29360128(0x1c00000, float:7.052966E-38)
            r7 = r7 & r0
            r8 = 8388608(0x800000, float:1.17549435E-38)
            if (r7 != r8) goto L_0x04a4
            r7 = 1
            goto L_0x04a5
        L_0x04a4:
            r7 = r6
        L_0x04a5:
            r2 = r2 | r7
            java.lang.Object r6 = r5.D()
            if (r2 != 0) goto L_0x04ba
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r6 != r2) goto L_0x04b5
            goto L_0x04ba
        L_0x04b5:
            r7 = r53
            r8 = r57
            goto L_0x04c6
        L_0x04ba:
            yk.c0 r6 = new yk.c0
            r7 = r53
            r8 = r57
            r6.<init>(r1, r12, r7, r8)
            r5.u(r6)
        L_0x04c6:
            r31 = r6
            nI.l r31 = (nI.C17642l) r31
            r5.P()
            int r2 = r0 >> 6
            r2 = r2 & 896(0x380, float:1.256E-42)
            r34 = 402(0x192, float:5.63E-43)
            r23 = 0
            r26 = 0
            r29 = 0
            r30 = 0
            r22 = r4
            r24 = r54
            r32 = r5
            r33 = r2
            u0.C5984h.a(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r5.x()
            r5.P()
            goto L_0x024e
        L_0x04ee:
            androidx.compose.animation.i r24 = androidx.compose.animation.g.o(r4, r2, r6, r4)
            androidx.compose.animation.k r25 = androidx.compose.animation.g.q(r4, r2, r6, r4)
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            i1.c r10 = r20.b()
            r11 = r48
            androidx.compose.ui.d r9 = r11.a(r9, r10)
            r10 = 1
            androidx.compose.ui.d r23 = androidx.compose.foundation.layout.J.h(r9, r2, r10, r4)
            yk.a r2 = yk.C12349a.f106365a
            nI.q r27 = r2.a()
            int r0 = r0 >> r6
            r0 = r0 & 14
            r2 = 224640(0x36d80, float:3.14788E-40)
            r29 = r0 | r2
            r30 = 0
            java.lang.String r26 = "loading visibility"
            r22 = r51
            r28 = r5
            l0.d.g(r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r5.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x052c
            U0.C4895p.R()
        L_0x052c:
            r11 = r21
        L_0x052e:
            U0.Y0 r15 = r5.n()
            if (r15 == 0) goto L_0x055c
            yk.d0 r13 = new yk.d0
            r0 = r13
            r1 = r50
            r2 = r51
            r3 = r52
            r4 = r53
            r5 = r54
            r6 = r55
            r7 = r56
            r8 = r57
            r9 = r58
            r10 = r59
            r12 = r62
            r14 = r13
            r13 = r63
            r49 = r14
            r14 = r64
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r49
            r15.a(r0)
        L_0x055c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.t0.b0(KJ.c, boolean, int, boolean, u0.I, com.ingka.ikea.core.model.Media$Image, gB.f, nI.l, nI.a, nI.l, androidx.compose.ui.d, U0.m, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c0(C14504f fVar, C17642l lVar, int i10) {
        if (fVar.ordinal() != i10) {
            lVar.invoke(C14504f.Companion.a(i10));
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N d0(C15987c cVar, C14504f fVar, boolean z10, C17642l lVar, C5968C c10) {
        C17542s.j(c10, "$this$LazyVerticalGrid");
        C5968C c11 = c10;
        c11.h(cVar.size(), new j(new e0(), cVar), (p<? super C5993q, ? super Integer, C5979c>) null, new k(i.f106485c, cVar), c1.c.c(699646206, true, new l(cVar, fVar, z10, lVar)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final Object e0(C15128a aVar) {
        C17542s.j(aVar, "it");
        return aVar.a();
    }

    /* access modifiers changed from: private */
    public static final C16807N f0(C15987c cVar, boolean z10, int i10, boolean z11, C5974I i11, Media.Image image, C14504f fVar, C17642l lVar, C17631a aVar, C17642l lVar2, androidx.compose.ui.d dVar, int i12, int i13, int i14, C4889m mVar, int i15) {
        b0(cVar, z10, i10, z11, i11, image, fVar, lVar, aVar, lVar2, dVar, mVar, M0.a(i12 | 1), M0.a(i13), i14);
        return C16807N.f139792a;
    }

    private static final C15990f<Z2.a> j0() {
        return C15985a.b(new Z2.a(C18146a.f148056G6, C14504f.COMPACT_CARD.m(), true), new Z2.a(C18146a.f148151Mb, C14504f.DEFAULT_CARD.m(), true));
    }

    /* access modifiers changed from: private */
    public static final void w(C12316b bVar, boolean z10, C5834E e10, C5974I i10, C17642l<? super String, C16807N> lVar, C17631a<C16807N> aVar, C17642l<? super C14504f, C16807N> lVar2, C4889m mVar, int i11) {
        int i12;
        C4889m mVar2;
        boolean z11 = z10;
        C5834E e11 = e10;
        int i13 = i11;
        C4889m k10 = mVar.k(-1548889690);
        int i14 = 2;
        C12316b bVar2 = bVar;
        if ((i13 & 6) == 0) {
            i12 = (k10.F(bVar2) ? 4 : 2) | i13;
        } else {
            i12 = i13;
        }
        if ((i13 & 48) == 0) {
            i12 |= k10.b(z11) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i12 |= k10.V(e11) ? 256 : 128;
        }
        C5974I i15 = i10;
        if ((i13 & 3072) == 0) {
            i12 |= k10.V(i15) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        C17642l<? super String, C16807N> lVar3 = lVar;
        if ((i13 & 24576) == 0) {
            i12 |= k10.F(lVar3) ? 16384 : 8192;
        }
        C17631a<C16807N> aVar2 = aVar;
        if ((196608 & i13) == 0) {
            i12 |= k10.F(aVar2) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        C17642l<? super C14504f, C16807N> lVar4 = lVar2;
        if ((1572864 & i13) == 0) {
            i12 |= k10.F(lVar4) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        if ((599187 & i12) != 599186 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1548889690, i12, -1, "com.ingka.ikea.app.shoppinglist.lists.ui.Content (ShoppingListsScreen.kt:310)");
            }
            if (bVar.h()) {
                k10.W(-1417213888);
                C15987c<C15128a> g10 = bVar.g();
                boolean e12 = bVar.e();
                if (!z11 || bVar.f() != C14504f.DEFAULT_CARD) {
                    i14 = 1;
                }
                int i16 = i12 << 9;
                C4889m mVar3 = k10;
                C5834E e13 = e11;
                b0(g10, e12, i14, z10, i10, bVar.d(), bVar.f(), lVar, aVar, lVar2, D.h(androidx.compose.ui.d.f18749a, e11), k10, C15128a.f131411g | ((i12 << 6) & 7168) | ((i12 << 3) & 57344) | (29360128 & i16) | (234881024 & i16) | (i16 & 1879048192), 0, 0);
                mVar3.P();
                mVar2 = mVar3;
            } else {
                mVar2 = k10;
                mVar2.W(-1416589486);
                y(bVar.d(), z10, aVar, D.h(androidx.compose.ui.d.f18749a, e11), mVar2, (i12 & 112) | ((i12 >> 9) & 896), 0);
                mVar2.P();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
            C5834E e14 = e11;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new Z(bVar, z10, e10, i10, lVar, aVar, lVar2, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N x(C12316b bVar, boolean z10, C5834E e10, C5974I i10, C17642l lVar, C17631a aVar, C17642l lVar2, int i11, C4889m mVar, int i12) {
        w(bVar, z10, e10, i10, lVar, aVar, lVar2, mVar, M0.a(i11 | 1));
        return C16807N.f139792a;
    }

    private static final void y(Media.Image image, boolean z10, C17631a<C16807N> aVar, androidx.compose.ui.d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        C4889m k10 = mVar.k(225183212);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.F(image) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.b(z10) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= k10.F(aVar) ? 256 : 128;
        }
        int i13 = i11 & 8;
        if (i13 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= k10.V(dVar) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) != 1170 || !k10.l()) {
            if (i13 != 0) {
                dVar = androidx.compose.ui.d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(225183212, i12, -1, "com.ingka.ikea.app.shoppinglist.lists.ui.EmptyContent (ShoppingListsScreen.kt:341)");
            }
            if (z10) {
                k10.W(-197453745);
                A(image, aVar, C5116k1.a(dVar, "empty_content"), k10, (i12 & 14) | ((i12 >> 3) & 112), 0);
                k10.P();
            } else {
                k10.W(-197237520);
                D(image, aVar, C5116k1.a(dVar, "empty_content"), k10, (i12 & 14) | ((i12 >> 3) & 112), 0);
                k10.P();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        androidx.compose.ui.d dVar2 = dVar;
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new a0(image, z10, aVar, dVar2, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N z(Media.Image image, boolean z10, C17631a aVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        y(image, z10, aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
