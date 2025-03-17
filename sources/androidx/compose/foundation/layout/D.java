package androidx.compose.foundation.layout;

import XH.C16807N;
import androidx.compose.ui.platform.C5137v0;
import c2.h;
import c2.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import s0.C5834E;
import s0.C5836G;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a>\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001e\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0015\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0017\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u001a\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a&\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a:\u0010\u001c\u001a\u00020\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/d;", "Lc2/h;", "start", "top", "end", "bottom", "l", "(Landroidx/compose/ui/d;FFFF)Landroidx/compose/ui/d;", "horizontal", "vertical", "j", "(Landroidx/compose/ui/d;FF)Landroidx/compose/ui/d;", "all", "i", "(Landroidx/compose/ui/d;F)Landroidx/compose/ui/d;", "Ls0/E;", "paddingValues", "h", "(Landroidx/compose/ui/d;Ls0/E;)Landroidx/compose/ui/d;", "Lc2/t;", "layoutDirection", "g", "(Ls0/E;Lc2/t;)F", "f", "a", "(F)Ls0/E;", "b", "(FF)Ls0/E;", "d", "(FFFF)Ls0/E;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class D {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f17924c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f17925d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f17926e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f17927f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(float f10, float f11, float f12, float f13) {
            super(1);
            this.f17924c = f10;
            this.f17925d = f11;
            this.f17926e = f12;
            this.f17927f = f13;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("padding");
            v0Var.a().c("start", h.m(this.f17924c));
            v0Var.a().c("top", h.m(this.f17925d));
            v0Var.a().c("end", h.m(this.f17926e));
            v0Var.a().c("bottom", h.m(this.f17927f));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f17928c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f17929d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(float f10, float f11) {
            super(1);
            this.f17928c = f10;
            this.f17929d = f11;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("padding");
            v0Var.a().c("horizontal", h.m(this.f17928c));
            v0Var.a().c("vertical", h.m(this.f17929d));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f17930c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(float f10) {
            super(1);
            this.f17930c = f10;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("padding");
            v0Var.c(h.m(this.f17930c));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5834E f17931c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C5834E e10) {
            super(1);
            this.f17931c = e10;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("padding");
            v0Var.a().c("paddingValues", this.f17931c);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    public static final C5834E a(float f10) {
        return new C5836G(f10, f10, f10, f10, (DefaultConstructorMarker) null);
    }

    public static final C5834E b(float f10, float f11) {
        return new C5836G(f10, f11, f10, f11, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ C5834E c(float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = h.B((float) 0);
        }
        if ((i10 & 2) != 0) {
            f11 = h.B((float) 0);
        }
        return b(f10, f11);
    }

    public static final C5834E d(float f10, float f11, float f12, float f13) {
        return new C5836G(f10, f11, f12, f13, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ C5834E e(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = h.B((float) 0);
        }
        if ((i10 & 2) != 0) {
            f11 = h.B((float) 0);
        }
        if ((i10 & 4) != 0) {
            f12 = h.B((float) 0);
        }
        if ((i10 & 8) != 0) {
            f13 = h.B((float) 0);
        }
        return d(f10, f11, f12, f13);
    }

    public static final float f(C5834E e10, t tVar) {
        return tVar == t.Ltr ? e10.b(tVar) : e10.c(tVar);
    }

    public static final float g(C5834E e10, t tVar) {
        return tVar == t.Ltr ? e10.c(tVar) : e10.b(tVar);
    }

    public static final androidx.compose.ui.d h(androidx.compose.ui.d dVar, C5834E e10) {
        return dVar.s(new PaddingValuesElement(e10, new d(e10)));
    }

    public static final androidx.compose.ui.d i(androidx.compose.ui.d dVar, float f10) {
        return dVar.s(new PaddingElement(f10, f10, f10, f10, true, new c(f10), (DefaultConstructorMarker) null));
    }

    public static final androidx.compose.ui.d j(androidx.compose.ui.d dVar, float f10, float f11) {
        return dVar.s(new PaddingElement(f10, f11, f10, f11, true, new b(f10, f11), (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ androidx.compose.ui.d k(androidx.compose.ui.d dVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = h.B((float) 0);
        }
        if ((i10 & 2) != 0) {
            f11 = h.B((float) 0);
        }
        return j(dVar, f10, f11);
    }

    public static final androidx.compose.ui.d l(androidx.compose.ui.d dVar, float f10, float f11, float f12, float f13) {
        return dVar.s(new PaddingElement(f10, f11, f12, f13, true, new a(f10, f11, f12, f13), (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ androidx.compose.ui.d m(androidx.compose.ui.d dVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = h.B((float) 0);
        }
        if ((i10 & 2) != 0) {
            f11 = h.B((float) 0);
        }
        if ((i10 & 4) != 0) {
            f12 = h.B((float) 0);
        }
        if ((i10 & 8) != 0) {
            f13 = h.B((float) 0);
        }
        return l(dVar, f10, f11, f12, f13);
    }
}
