package Fy;

import Dy.C12816p;
import Dy.C12821v;
import Jy.g;
import Jy.h;
import Jy.o;
import KJ.C15985a;
import TC.e;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import YH.C16877v;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kp.C11522d;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\u00060\u0015R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"LFy/c;", "LLg/a;", "LJy/g;", "Lkp/d;", "currencyConfig", "LDy/p;", "onClickListener", "LJy/h;", "cartListItemUiMapper", "Lkotlin/Function0;", "LXH/N;", "onCartItemSectionGenerated", "<init>", "(Lkp/d;LDy/p;LJy/h;LnI/a;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LFy/c$a;", "h", "(Landroid/view/ViewGroup;)LFy/c$a;", "b", "Lkp/d;", "c", "LDy/p;", "d", "LJy/h;", "e", "LnI/a;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends Lg.a<g> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C11522d f109990b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C12816p f109991c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final h f109992d;

    /* renamed from: e  reason: collision with root package name */
    private final C17631a<C16807N> f109993e;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LFy/c$a;", "LLg/c;", "LJy/g;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(LFy/c;Landroidx/compose/ui/platform/ComposeView;)V", "viewModel", "LXH/N;", "l", "(LJy/g;)V", "h", "Landroidx/compose/ui/platform/ComposeView;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends Lg.c<g> {

        /* renamed from: h  reason: collision with root package name */
        private final ComposeView f109994h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ c f109995i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Fy.c$a$a  reason: collision with other inner class name */
        static final class C2633a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g f109996a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ c f109997b;

            C2633a(g gVar, c cVar) {
                this.f109996a = gVar;
                this.f109997b = cVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(1124450121, i10, -1, "com.ingka.ikea.scanandgo.cart.impl.delegate.CartItemSectionDelegate.ViewHolder.bind.<anonymous>.<anonymous> (CartItemSectionDelegate.kt:37)");
                    }
                    o.b g10 = this.f109996a.g();
                    Iterable<o.a> h10 = this.f109996a.h();
                    c cVar = this.f109997b;
                    ArrayList arrayList = new ArrayList(C16877v.y(h10, 10));
                    for (o.a a10 : h10) {
                        arrayList.add(cVar.f109992d.a(a10));
                    }
                    C12821v.f(g10, C15985a.h(arrayList), this.f109996a.i(), this.f109997b.f109990b, this.f109997b.f109991c, mVar, 0);
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, ComposeView composeView) {
            super((View) composeView, false);
            C17542s.j(composeView, "composeView");
            this.f109995i = cVar;
            this.f109994h = composeView;
        }

        /* renamed from: l */
        public void c(g gVar) {
            C17542s.j(gVar, "viewModel");
            ComposeView composeView = this.f109994h;
            c cVar = this.f109995i;
            super.c(gVar);
            e.l(composeView, false, c1.c.c(1124450121, true, new C2633a(gVar, cVar)), 1, (Object) null);
        }
    }

    public c(C11522d dVar, C12816p pVar, h hVar, C17631a<C16807N> aVar) {
        C17542s.j(dVar, "currencyConfig");
        C17542s.j(pVar, "onClickListener");
        C17542s.j(hVar, "cartListItemUiMapper");
        C17542s.j(aVar, "onCartItemSectionGenerated");
        this.f109990b = dVar;
        this.f109991c = pVar;
        this.f109992d = hVar;
        this.f109993e = aVar;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof g;
    }

    /* renamed from: h */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        Context context = viewGroup.getContext();
        C17542s.i(context, "getContext(...)");
        a aVar = new a(this, new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null));
        this.f109993e.invoke();
        return aVar;
    }
}
