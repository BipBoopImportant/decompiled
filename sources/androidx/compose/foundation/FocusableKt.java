package androidx.compose.foundation;

import XH.C16807N;
import androidx.compose.ui.d;
import androidx.compose.ui.focus.g;
import androidx.compose.ui.focus.i;
import androidx.compose.ui.focus.k;
import androidx.compose.ui.platform.C5131s0;
import androidx.compose.ui.platform.C5133t0;
import androidx.compose.ui.platform.C5137v0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import r0.m;

@Metadata(d1 = {"\u0000!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\f\u001a)\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n\"\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/d;", "", "enabled", "Lr0/m;", "interactionSource", "b", "(Landroidx/compose/ui/d;ZLr0/m;)Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;", "Landroidx/compose/ui/platform/s0;", "Landroidx/compose/ui/platform/s0;", "focusGroupInspectorInfo", "androidx/compose/foundation/FocusableKt$FocusableInNonTouchModeElement$1", "Landroidx/compose/foundation/FocusableKt$FocusableInNonTouchModeElement$1;", "FocusableInNonTouchModeElement", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FocusableKt {

    /* renamed from: a  reason: collision with root package name */
    private static final C5131s0 f17500a = new C5131s0(C5133t0.b() ? new b() : C5133t0.a());

    /* renamed from: b  reason: collision with root package name */
    private static final FocusableKt$FocusableInNonTouchModeElement$1 f17501b = new FocusableKt$FocusableInNonTouchModeElement$1();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/focus/i;", "LXH/N;", "a", "(Landroidx/compose/ui/focus/i;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<i, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f17502c = new a();

        a() {
            super(1);
        }

        public final void a(i iVar) {
            iVar.w(false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((i) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class b extends C17544u implements C17642l<C5137v0, C16807N> {
        public b() {
            super(1);
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("focusGroup");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    public static final d a(d dVar) {
        return g.a(k.a(dVar.s(f17500a), a.f17502c));
    }

    public static final d b(d dVar, boolean z10, m mVar) {
        return dVar.s(z10 ? new FocusableElement(mVar) : d.f18749a);
    }

    public static /* synthetic */ d c(d dVar, boolean z10, m mVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            mVar = null;
        }
        return b(dVar, z10, mVar);
    }
}
