package jC;

import XH.C16807N;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.DialogFragment;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J;\u0010\t\u001a\u00020\b*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H&¢\u0006\u0004\b\t\u0010\nJ;\u0010\f\u001a\u00020\b*\u00020\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H&¢\u0006\u0004\b\f\u0010\rJ;\u0010\u000f\u001a\u00020\b*\u00020\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H&¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"LjC/h;", "", "Landroidx/fragment/app/t;", "", "drawUnderStatusBar", "drawUnderNavigationBar", "drawUnderDisplayCutout", "handleImeInsets", "LXH/N;", "a0", "(Landroidx/fragment/app/t;ZZZZ)V", "Landroidx/fragment/app/o;", "c0", "(Landroidx/fragment/app/o;ZZZZ)V", "Landroidx/fragment/app/DialogFragment;", "d", "(Landroidx/fragment/app/DialogFragment;ZZZZ)V", "Lkotlin/Function1;", "LjC/q;", "block", "b", "(LnI/l;)V", "j0", "()Z", "isSystemUiInstalled", "LjC/a;", "e0", "()LjC/a;", "drawUnderConfig", "Z", "()LjC/q;", "systemUi", "systemui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface h {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(h hVar, DialogFragment dialogFragment, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
            if (obj == null) {
                hVar.d(dialogFragment, (i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: installSystemUiHandler");
        }
    }

    q Z();

    void a0(C5191t tVar, boolean z10, boolean z11, boolean z12, boolean z13);

    void b(C17642l<? super q, C16807N> lVar);

    void c0(C5187o oVar, boolean z10, boolean z11, boolean z12, boolean z13);

    void d(DialogFragment dialogFragment, boolean z10, boolean z11, boolean z12, boolean z13);

    C14614a e0();

    boolean j0();
}
