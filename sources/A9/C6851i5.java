package a9;

import E8.b;
import XH.C16807N;
import com.contentsquare.android.sdk.C7130i0;
import com.contentsquare.android.sdk.k6;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

/* renamed from: a9.i5  reason: case insensitive filesystem */
public final class C6851i5 extends C17544u implements C17642l<Boolean, C16807N> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k6 f42611c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6851i5(k6 k6Var) {
        super(1);
        this.f42611c = k6Var;
    }

    public final Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C7130i0 i0Var = this.f42611c.f47486D;
        if (i0Var == null) {
            C17542s.z("settingsViewModel");
            i0Var = null;
        }
        i0Var.f47431a.h(b.SESSION_REPLAY_FORCE_START, booleanValue);
        return C16807N.f139792a;
    }
}
