package jC;

import U0.C4889m;
import U0.C4895p;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.window.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lC.C14754f;
import lC.C14758j;
import lC.m;
import nC.C14840a;
import nC.C14842c;
import nC.C14845f;
import tK.C18030v;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0000H\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroid/view/Window;", "window", "LjC/i;", "c", "(Landroid/view/Window;LU0/m;II)LjC/i;", "b", "(LU0/m;I)Landroid/view/Window;", "LjC/f;", "a", "(LU0/m;I)LjC/f;", "systemui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k {
    private static final f a(C4889m mVar, int i10) {
        mVar.W(791865436);
        if (C4895p.J()) {
            C4895p.S(791865436, i10, -1, "com.ingka.ikea.systemui.defaultScrimColors (SystemUiCompose.kt:147)");
        }
        C18030v vVar = C18030v.f147664a;
        int i11 = C18030v.f147665b;
        f fVar = new f(vVar.a(mVar, i11).k0(), vVar.a(mVar, i11).F0(), vVar.a(mVar, i11).x0(), (DefaultConstructorMarker) null);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return fVar;
    }

    private static final Window b(C4889m mVar, int i10) {
        mVar.W(-2029388878);
        if (C4895p.J()) {
            C4895p.S(-2029388878, i10, -1, "com.ingka.ikea.systemui.findWindow (SystemUiCompose.kt:142)");
        }
        ViewParent parent = ((View) mVar.Q(AndroidCompositionLocals_androidKt.k())).getParent();
        Window window = null;
        i iVar = parent instanceof i ? (i) parent : null;
        if (iVar != null) {
            window = iVar.getWindow();
        }
        if (window == null) {
            Context context = ((View) mVar.Q(AndroidCompositionLocals_androidKt.k())).getContext();
            C17542s.i(context, "getContext(...)");
            window = C14842c.a(context);
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return window;
    }

    public static final i c(Window window, C4889m mVar, int i10, int i11) {
        mVar.W(980034794);
        if ((i11 & 1) != 0) {
            window = b(mVar, 0);
        }
        if (C4895p.J()) {
            C4895p.S(980034794, i10, -1, "com.ingka.ikea.systemui.rememberSystemUi (SystemUiCompose.kt:115)");
        }
        View view = (View) mVar.Q(AndroidCompositionLocals_androidKt.k());
        f a10 = a(mVar, 0);
        mVar.W(2024153767);
        boolean V10 = mVar.V(view) | mVar.V(window);
        Object D10 = mVar.D();
        if (V10 || D10 == C4889m.f14007a.a()) {
            C14845f fVar = new C14845f((C14840a) null, 1, (DefaultConstructorMarker) null);
            C14754f fVar2 = new C14754f(view, window);
            j jVar = new j(new m(view, fVar2, fVar), new C14758j(view, window, fVar2), a10, fVar);
            mVar.u(jVar);
            D10 = jVar;
        }
        j jVar2 = (j) D10;
        mVar.P();
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return jVar2;
    }
}
