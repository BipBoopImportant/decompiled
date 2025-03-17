package a9;

import E8.b;
import XH.C16807N;
import com.contentsquare.android.sdk.C7130i0;
import com.contentsquare.android.sdk.k6;
import jI.C17423j;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

public final class A5 extends C17544u implements C17642l<Boolean, C16807N> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k6 f41918c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public A5(k6 k6Var) {
        super(1);
        this.f41918c = k6Var;
    }

    public final Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C7130i0 i0Var = this.f41918c.f47486D;
        if (i0Var == null) {
            C17542s.z("settingsViewModel");
            i0Var = null;
        }
        i0Var.f47431a.h(b.DEVELOPER_SESSION_REPLAY_LOG_VIEWLIGHT_TREE, booleanValue);
        if (!booleanValue) {
            C7130i0 i0Var2 = this.f41918c.f47486D;
            if (i0Var2 == null) {
                C17542s.z("settingsViewModel");
                i0Var2 = null;
            }
            G0 g02 = i0Var2.f47436f;
            g02.f42011d = null;
            g02.f42010c = null;
            g02.f42012e = 0;
            if (g02.f42013f.exists()) {
                C17423j.r(g02.f42013f);
            }
        }
        return C16807N.f139792a;
    }
}
