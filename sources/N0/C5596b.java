package n0;

import U0.C4889m;
import U0.C4895p;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ln0/T;", "a", "(LU0/m;I)Ln0/T;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: n0.b  reason: case insensitive filesystem */
public final class C5596b {
    public static final T a(C4889m mVar, int i10) {
        T t10;
        if (C4895p.J()) {
            C4895p.S(-1476348564, i10, -1, "androidx.compose.foundation.rememberOverscrollEffect (AndroidOverscroll.android.kt:63)");
        }
        Context context = (Context) mVar.Q(AndroidCompositionLocals_androidKt.g());
        C5594Q q10 = (C5594Q) mVar.Q(S.a());
        if (q10 != null) {
            mVar.W(1586021609);
            boolean V10 = mVar.V(context) | mVar.V(q10);
            Object D10 = mVar.D();
            if (V10 || D10 == C4889m.f14007a.a()) {
                D10 = new C5595a(context, q10);
                mVar.u(D10);
            }
            t10 = (C5595a) D10;
            mVar.P();
        } else {
            mVar.W(1586120933);
            mVar.P();
            t10 = C5593P.f26379a;
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        return t10;
    }
}
