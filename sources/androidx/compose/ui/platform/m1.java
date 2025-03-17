package androidx.compose.ui.platform;

import XH.C16807N;
import kotlin.Metadata;
import nI.C17631a;
import o1.C5669i;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J_\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H&¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/m1;", "", "Lo1/i;", "rect", "Lkotlin/Function0;", "LXH/N;", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "c", "(Lo1/i;LnI/a;LnI/a;LnI/a;LnI/a;)V", "b", "()V", "Landroidx/compose/ui/platform/o1;", "i", "()Landroidx/compose/ui/platform/o1;", "status", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface m1 {
    static /* synthetic */ void a(m1 m1Var, C5669i iVar, C17631a aVar, C17631a aVar2, C17631a aVar3, C17631a aVar4, int i10, Object obj) {
        if (obj == null) {
            m1Var.c(iVar, (i10 & 2) != 0 ? null : aVar, (i10 & 4) != 0 ? null : aVar2, (i10 & 8) != 0 ? null : aVar3, (i10 & 16) != 0 ? null : aVar4);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMenu");
    }

    void b();

    void c(C5669i iVar, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C17631a<C16807N> aVar4);

    o1 i();
}
