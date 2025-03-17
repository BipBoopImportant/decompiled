package Fy;

import IC.C13023e;
import J1.j;
import Lg.c;
import Oo.b;
import SC.C13569b1;
import SC.C13573c1;
import SC.C13585f1;
import SC.C13589g1;
import TC.e;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.ComposeView;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;
import p1.C5747v0;
import r0.m;
import uK.C18146a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LFy/a;", "LLg/a;", "LJy/a;", "Lkotlin/Function0;", "LXH/N;", "onClick", "<init>", "(LnI/a;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LLg/c;", "d", "(Landroid/view/ViewGroup;)LLg/c;", "b", "LnI/a;", "e", "()LnI/a;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends Lg.a<Jy.a> {

    /* renamed from: b  reason: collision with root package name */
    private final C17631a<C16807N> f109979b;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LFy/a$a;", "LLg/c;", "LJy/a;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(LFy/a;Landroidx/compose/ui/platform/ComposeView;)V", "viewModel", "LXH/N;", "l", "(LJy/a;)V", "h", "Landroidx/compose/ui/platform/ComposeView;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Fy.a$a  reason: collision with other inner class name */
    public final class C2630a extends c<Jy.a> {

        /* renamed from: h  reason: collision with root package name */
        private final ComposeView f109980h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ a f109981i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Fy.a$a$a  reason: collision with other inner class name */
        static final class C2631a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Jy.a f109982a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f109983b;

            C2631a(Jy.a aVar, a aVar2) {
                this.f109982a = aVar;
                this.f109983b = aVar2;
            }

            public final void a(C4889m mVar, int i10) {
                C4889m mVar2 = mVar;
                int i11 = i10;
                if ((i11 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(1375033326, i11, -1, "com.ingka.ikea.scanandgo.cart.impl.delegate.AddDiscountItemDelegate.ViewHolder.bind.<anonymous>.<anonymous> (AddDiscountItemDelegate.kt:36)");
                    }
                    String b10 = j.b(b.f84601c1, mVar2, 0);
                    C13023e g10 = this.f109982a.g();
                    mVar2.W(822344542);
                    String a10 = g10 == null ? null : g10.a(mVar2, C13023e.f110931a);
                    mVar.P();
                    C13573c1.a aVar = r6;
                    C13573c1.a aVar2 = new C13573c1.a(C18146a.f148481i3, (String) null, (C5437c.C0386c) null, (C5747v0) null, 12, (DefaultConstructorMarker) null);
                    C13585f1.c(b10, this.f109983b.e(), (d) null, a10, aVar, C13569b1.d.f116148b, (String) null, (p<? super C4889m, ? super Integer, C16807N>) null, (C13589g1) null, 0.0f, false, false, (m) null, mVar, (C13573c1.a.f116164f << 12) | (C13569b1.d.f116149c << 15), 0, 8132);
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
        public C2630a(a aVar, ComposeView composeView) {
            super((View) composeView, false);
            C17542s.j(composeView, "composeView");
            this.f109981i = aVar;
            this.f109980h = composeView;
        }

        /* renamed from: l */
        public void c(Jy.a aVar) {
            C17542s.j(aVar, "viewModel");
            ComposeView composeView = this.f109980h;
            a aVar2 = this.f109981i;
            super.c(aVar);
            e.l(composeView, false, c1.c.c(1375033326, true, new C2631a(aVar, aVar2)), 1, (Object) null);
        }
    }

    public a(C17631a<C16807N> aVar) {
        C17542s.j(aVar, "onClick");
        this.f109979b = aVar;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof Jy.a;
    }

    public c<Jy.a> d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        Context context = viewGroup.getContext();
        C17542s.i(context, "getContext(...)");
        return new C2630a(this, new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null));
    }

    public final C17631a<C16807N> e() {
        return this.f109979b;
    }
}
