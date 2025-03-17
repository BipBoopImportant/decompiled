package ei;

import KJ.C15985a;
import Lg.c;
import MC.C13200f;
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
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mp.C11588a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lei/A;", "LLg/a;", "Lei/B;", "Lkotlin/Function1;", "Lmp/a;", "LXH/N;", "onImageClicked", "<init>", "(LnI/l;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LLg/c;", "d", "(Landroid/view/ViewGroup;)LLg/c;", "b", "LnI/l;", "e", "()LnI/l;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class A extends Lg.a<B> {

    /* renamed from: b  reason: collision with root package name */
    private final C17642l<C11588a, C16807N> f72725b;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lei/A$a;", "LLg/c;", "Lei/B;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(Lei/A;Landroidx/compose/ui/platform/ComposeView;)V", "viewModel", "LXH/N;", "l", "(Lei/B;)V", "h", "Landroidx/compose/ui/platform/ComposeView;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c<B> {

        /* renamed from: h  reason: collision with root package name */
        private final ComposeView f72726h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ A f72727i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ei.A$a$a  reason: collision with other inner class name */
        static final class C1247a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ B f72728a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ A f72729b;

            C1247a(B b10, A a10) {
                this.f72728a = b10;
                this.f72729b = a10;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(806830892, i10, -1, "com.ingka.ikea.app.productinformationpage.v2.delegates.InspirationImagesDelegate.ViewHolder.bind.<anonymous>.<anonymous> (InspirationImagesDelegate.kt:34)");
                    }
                    C13200f.c(this.f72728a.a().e(), C15985a.h(this.f72728a.a().b()), this.f72729b.e(), (d) null, mVar, 0, 8);
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
        public a(A a10, ComposeView composeView) {
            super((View) composeView, false, 2, (DefaultConstructorMarker) null);
            C17542s.j(composeView, "composeView");
            this.f72727i = a10;
            this.f72726h = composeView;
        }

        /* renamed from: l */
        public void c(B b10) {
            C17542s.j(b10, "viewModel");
            super.c(b10);
            e.l(this.f72726h, false, c1.c.c(806830892, true, new C1247a(b10, this.f72727i)), 1, (Object) null);
        }
    }

    public A(C17642l<? super C11588a, C16807N> lVar) {
        C17542s.j(lVar, "onImageClicked");
        this.f72725b = lVar;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof B;
    }

    public c<B> d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        Context context = viewGroup.getContext();
        C17542s.i(context, "getContext(...)");
        return new a(this, new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null));
    }

    public final C17642l<C11588a, C16807N> e() {
        return this.f72725b;
    }
}
