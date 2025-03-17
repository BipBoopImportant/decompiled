package androidx.compose.foundation.lazy.layout;

import U0.C4889m;
import U0.C4895p;
import androidx.compose.ui.d;
import kotlin.Metadata;
import nI.C17631a;
import p0.v;
import v0.t;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u001aA\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/d;", "Lkotlin/Function0;", "Lv0/t;", "itemProviderLambda", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "state", "Lp0/v;", "orientation", "", "userScrollEnabled", "reverseScrolling", "c", "(Landroidx/compose/ui/d;LnI/a;Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;Lp0/v;ZZLU0/m;I)Landroidx/compose/ui/d;", "", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "", "b", "(II)F", "canScrollForward", "a", "(IIZ)F", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {
    public static final float a(int i10, int i11, boolean z10) {
        return z10 ? b(i10, i11) + ((float) 100) : b(i10, i11);
    }

    public static final float b(int i10, int i11) {
        return (float) (i11 + (i10 * 500));
    }

    public static final d c(d dVar, C17631a<? extends t> aVar, LazyLayoutSemanticState lazyLayoutSemanticState, v vVar, boolean z10, boolean z11, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(1070136913, i10, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:46)");
        }
        d s10 = dVar.s(new LazyLayoutSemanticsModifier(aVar, lazyLayoutSemanticState, vVar, z10, z11));
        if (C4895p.J()) {
            C4895p.R();
        }
        return s10;
    }
}
