package Km;

import T0.c;
import T0.d;
import U0.C4889m;
import U0.C4895p;
import XH.C16814e;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.h;
import c2.i;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"LT0/d;", "a", "(LU0/m;I)I", "benefits-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {
    @C16814e
    public static final int a(C4889m mVar, int i10) {
        mVar.W(332254596);
        if (C4895p.J()) {
            C4895p.S(332254596, i10, -1, "com.ingka.ikea.benefits.impl.presentation.util.getWindowWidthSizeClass (WindowSizeClass.kt:22)");
        }
        Configuration configuration = (Configuration) mVar.Q(AndroidCompositionLocals_androidKt.f());
        long b10 = i.b(h.B((float) configuration.screenWidthDp), h.B((float) configuration.screenHeightDp));
        mVar.W(1494716575);
        boolean e10 = mVar.e(b10);
        Object D10 = mVar.D();
        if (e10 || D10 == C4889m.f14007a.a()) {
            D10 = d.v(c.a.b(c.f13501c, b10, (Set) null, (Set) null, 6, (Object) null).b());
            mVar.u(D10);
        }
        int I10 = ((d) D10).I();
        mVar.P();
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return I10;
    }
}
