package androidx.compose.foundation.layout;

import XH.C16807N;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5133t0;
import androidx.compose.ui.platform.C5137v0;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import s0.C5857c;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0004*\u00020\u0004H\u0017¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/layout/j;", "Ls0/c;", "<init>", "()V", "Landroidx/compose/ui/d;", "Li1/c;", "alignment", "a", "(Landroidx/compose/ui/d;Li1/c;)Landroidx/compose/ui/d;", "e", "(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.j  reason: case insensitive filesystem */
public final class C5079j implements C5857c {

    /* renamed from: a  reason: collision with root package name */
    public static final C5079j f18125a = new C5079j();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.layout.j$a */
    public static final class a extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5437c f18126c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C5437c cVar) {
            super(1);
            this.f18126c = cVar;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("align");
            v0Var.c(this.f18126c);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.layout.j$b */
    public static final class b extends C17544u implements C17642l<C5137v0, C16807N> {
        public b() {
            super(1);
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("matchParentSize");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    private C5079j() {
    }

    public d a(d dVar, C5437c cVar) {
        return dVar.s(new BoxChildDataElement(cVar, false, C5133t0.b() ? new a(cVar) : C5133t0.a()));
    }

    public d e(d dVar) {
        return dVar.s(new BoxChildDataElement(C5437c.f24302a.e(), true, C5133t0.b() ? new b() : C5133t0.a()));
    }
}
