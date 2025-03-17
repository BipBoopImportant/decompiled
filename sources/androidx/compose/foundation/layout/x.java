package androidx.compose.foundation.layout;

import XH.C16807N;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5133t0;
import androidx.compose.ui.platform.C5137v0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import s0.C5880z;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/d;", "Ls0/z;", "intrinsicSize", "b", "(Landroidx/compose/ui/d;Ls0/z;)Landroidx/compose/ui/d;", "a", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class x {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class a extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5880z f18241c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C5880z zVar) {
            super(1);
            this.f18241c = zVar;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("height");
            v0Var.a().c("intrinsicSize", this.f18241c);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class b extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5880z f18242c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C5880z zVar) {
            super(1);
            this.f18242c = zVar;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("width");
            v0Var.a().c("intrinsicSize", this.f18242c);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    public static final d a(d dVar, C5880z zVar) {
        return dVar.s(new IntrinsicHeightElement(zVar, true, C5133t0.b() ? new a(zVar) : C5133t0.a()));
    }

    public static final d b(d dVar, C5880z zVar) {
        return dVar.s(new IntrinsicWidthElement(zVar, true, C5133t0.b() ? new b(zVar) : C5133t0.a()));
    }
}
