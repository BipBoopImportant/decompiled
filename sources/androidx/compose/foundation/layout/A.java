package androidx.compose.foundation.layout;

import XH.C16807N;
import androidx.compose.ui.platform.C5137v0;
import c2.d;
import c2.h;
import c2.n;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a*\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000b\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Landroidx/compose/ui/d;", "Lc2/h;", "x", "y", "b", "(Landroidx/compose/ui/d;FF)Landroidx/compose/ui/d;", "Lkotlin/Function1;", "Lc2/d;", "Lc2/n;", "offset", "a", "(Landroidx/compose/ui/d;LnI/l;)Landroidx/compose/ui/d;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class A {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f17900c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f17901d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(float f10, float f11) {
            super(1);
            this.f17900c = f10;
            this.f17901d = f11;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("offset");
            v0Var.a().c("x", h.m(this.f17900c));
            v0Var.a().c("y", h.m(this.f17901d));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<d, n> f17902c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C17642l<? super d, n> lVar) {
            super(1);
            this.f17902c = lVar;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("offset");
            v0Var.a().c("offset", this.f17902c);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, C17642l<? super d, n> lVar) {
        return dVar.s(new OffsetPxElement(lVar, true, new b(lVar)));
    }

    public static final androidx.compose.ui.d b(androidx.compose.ui.d dVar, float f10, float f11) {
        return dVar.s(new OffsetElement(f10, f11, true, new a(f10, f11), (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ androidx.compose.ui.d c(androidx.compose.ui.d dVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = h.B((float) 0);
        }
        if ((i10 & 2) != 0) {
            f11 = h.B((float) 0);
        }
        return b(dVar, f10, f11);
    }
}
