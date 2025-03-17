package lC;

import android.view.View;
import android.view.ViewGroup;
import jC.g;
import kotlin.Metadata;
import oH.n;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a;\u0010\r\u001a\u00020\f*\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LjC/g$a;", "LoH/n;", "viewState", "LjC/g;", "c", "(LjC/g$a;LoH/n;)LjC/g;", "Landroid/view/View;", "", "left", "top", "right", "bottom", "LXH/N;", "d", "(Landroid/view/View;IIII)V", "systemui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: lC.C  reason: case insensitive filesystem */
public final class C14748C {
    /* access modifiers changed from: private */
    public static final g c(g.a aVar, n nVar) {
        return new g(nVar.b().b(), nVar.b().d(), nVar.b().c(), nVar.b().a(), nVar.a().b(), nVar.a().d(), nVar.a().c(), nVar.a().a());
    }

    /* access modifiers changed from: private */
    public static final void d(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = i10;
            marginLayoutParams.topMargin = i11;
            marginLayoutParams.rightMargin = i12;
            marginLayoutParams.bottomMargin = i13;
            view.setLayoutParams(marginLayoutParams);
        }
    }
}
