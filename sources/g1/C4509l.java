package G1;

import D1.a;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LG1/j;", "Landroid/view/View;", "a", "(LG1/j;)Landroid/view/View;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: G1.l  reason: case insensitive filesystem */
public final class C4509l {
    public static final View a(C4507j jVar) {
        if (!jVar.E0().j2()) {
            a.b("Cannot get View because the Modifier node is not currently attached.");
        }
        m0 b10 = K.b(C4508k.m(jVar));
        C17542s.h(b10, "null cannot be cast to non-null type android.view.View");
        return (View) b10;
    }
}
