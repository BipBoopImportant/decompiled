package Ly;

import Jy.o;
import Lg.c;
import TC.e;
import U0.C4889m;
import XH.C16807N;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u00060\u0010R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LLy/b;", "LLg/a;", "LJy/o$b;", "Lkotlin/Function1;", "LJy/o$b$a;", "LXH/N;", "onClick", "<init>", "(LnI/l;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LLy/b$a;", "f", "(Landroid/view/ViewGroup;)LLy/b$a;", "b", "LnI/l;", "e", "()LnI/l;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends Lg.a<o.b> {

    /* renamed from: b  reason: collision with root package name */
    private final C17642l<o.b.a, C16807N> f111939b;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LLy/b$a;", "LLg/c;", "LJy/o$b;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(LLy/b;Landroidx/compose/ui/platform/ComposeView;)V", "viewModel", "LXH/N;", "l", "(LJy/o$b;)V", "h", "Landroidx/compose/ui/platform/ComposeView;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c<o.b> {

        /* renamed from: h  reason: collision with root package name */
        private final ComposeView f111940h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ b f111941i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ly.b$a$a  reason: collision with other inner class name */
        static final class C2740a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ o.b f111942a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f111943b;

            C2740a(o.b bVar, b bVar2) {
                this.f111942a = bVar;
                this.f111943b = bVar2;
            }

            /* access modifiers changed from: private */
            public static final C16807N c(b bVar, o.b bVar2) {
                bVar.e().invoke(bVar2.i());
                return C16807N.f139792a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: nI.a} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void b(U0.C4889m r8, int r9) {
                /*
                    r7 = this;
                    r0 = r9 & 3
                    r1 = 2
                    if (r0 != r1) goto L_0x0010
                    boolean r0 = r8.l()
                    if (r0 != 0) goto L_0x000c
                    goto L_0x0010
                L_0x000c:
                    r8.L()
                    goto L_0x0074
                L_0x0010:
                    boolean r0 = U0.C4895p.J()
                    if (r0 == 0) goto L_0x001f
                    r0 = -1
                    java.lang.String r1 = "com.ingka.ikea.scanandgo.cart.impl.section.SectionHeaderDelegate.ViewHolder.bind.<anonymous>.<anonymous> (SectionHeaderDelegate.kt:29)"
                    r2 = 738115173(0x2bfebe65, float:1.8100631E-12)
                    U0.C4895p.S(r2, r9, r0, r1)
                L_0x001f:
                    Jy.o$b r9 = r7.f111942a
                    IC.e r0 = r9.getTitle()
                    Jy.o$b r9 = r7.f111942a
                    IC.e r2 = r9.g()
                    r9 = -1777102470(0xffffffff9613917a, float:-1.192047E-25)
                    r8.W(r9)
                    Ly.b r9 = r7.f111943b
                    boolean r9 = r8.V(r9)
                    Jy.o$b r1 = r7.f111942a
                    boolean r1 = r8.F(r1)
                    r9 = r9 | r1
                    Ly.b r1 = r7.f111943b
                    Jy.o$b r3 = r7.f111942a
                    java.lang.Object r4 = r8.D()
                    if (r9 != 0) goto L_0x0050
                    U0.m$a r9 = U0.C4889m.f14007a
                    java.lang.Object r9 = r9.a()
                    if (r4 != r9) goto L_0x0058
                L_0x0050:
                    Ly.a r4 = new Ly.a
                    r4.<init>(r1, r3)
                    r8.u(r4)
                L_0x0058:
                    r1 = r4
                    nI.a r1 = (nI.C17631a) r1
                    r8.P()
                    int r9 = IC.C13023e.f110931a
                    int r3 = r9 << 6
                    r5 = r9 | r3
                    r6 = 8
                    r3 = 0
                    r4 = r8
                    Dy.H0.b(r0, r1, r2, r3, r4, r5, r6)
                    boolean r8 = U0.C4895p.J()
                    if (r8 == 0) goto L_0x0074
                    U0.C4895p.R()
                L_0x0074:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: Ly.b.a.C2740a.b(U0.m, int):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar, ComposeView composeView) {
            super((View) composeView, true);
            C17542s.j(composeView, "composeView");
            this.f111941i = bVar;
            this.f111940h = composeView;
        }

        /* renamed from: l */
        public void c(o.b bVar) {
            C17542s.j(bVar, "viewModel");
            ComposeView composeView = this.f111940h;
            b bVar2 = this.f111941i;
            super.c(bVar);
            e.l(composeView, false, c1.c.c(738115173, true, new C2740a(bVar, bVar2)), 1, (Object) null);
        }
    }

    public b(C17642l<? super o.b.a, C16807N> lVar) {
        C17542s.j(lVar, "onClick");
        this.f111939b = lVar;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof o.b;
    }

    public final C17642l<o.b.a, C16807N> e() {
        return this.f111939b;
    }

    /* renamed from: f */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        Context context = viewGroup.getContext();
        C17542s.i(context, "getContext(...)");
        return new a(this, new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null));
    }
}
