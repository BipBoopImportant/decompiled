package a9;

import E8.b;
import XH.C16807N;
import com.contentsquare.android.sdk.C7130i0;
import com.contentsquare.android.sdk.k6;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

public final class L5 extends C17544u implements C17642l<Integer, C16807N> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k6 f42130c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public L5(k6 k6Var) {
        super(1);
        this.f42130c = k6Var;
    }

    public final Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        C7130i0 i0Var = this.f42130c.f47486D;
        if (i0Var == null) {
            C17542s.z("settingsViewModel");
            i0Var = null;
        }
        i0Var.f47431a.j(b.DEVELOPER_SESSION_REPLAY_MAXIMUM_USAGE_ON_UI_THREAD_IN_MILLI_SEC, intValue);
        return C16807N.f139792a;
    }
}
