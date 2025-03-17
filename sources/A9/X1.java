package a9;

import E8.b;
import XH.C16807N;
import android.view.View;
import com.contentsquare.android.sdk.C7130i0;
import com.contentsquare.android.sdk.V5;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

public final class X1 extends C17544u implements C17642l<Boolean, C16807N> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ V5 f42377c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ View f42378d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public X1(V5 v52, View view) {
        super(1);
        this.f42377c = v52;
        this.f42378d = view;
    }

    public final Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C7130i0 i0Var = this.f42377c.f47193D;
        if (i0Var == null) {
            C17542s.z("settingsViewModel");
            i0Var = null;
        }
        i0Var.f47431a.h(b.LOCAL_LOG_VISUALIZER_MODE, booleanValue);
        this.f42377c.a(this.f42378d, booleanValue);
        return C16807N.f139792a;
    }
}
