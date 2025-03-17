package a9;

import E8.b;
import XH.C16807N;
import android.view.View;
import com.contentsquare.android.core.features.config.model.a;
import com.contentsquare.android.sdk.C7130i0;
import com.contentsquare.android.sdk.k6;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

/* renamed from: a9.q5  reason: case insensitive filesystem */
public final class C6915q5 extends C17544u implements C17642l<Boolean, C16807N> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k6 f42816c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ View f42817d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6915q5(k6 k6Var, View view) {
        super(1);
        this.f42816c = k6Var;
        this.f42817d = view;
    }

    public final Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C7130i0 i0Var = this.f42816c.f47486D;
        if (i0Var == null) {
            C17542s.z("settingsViewModel");
            i0Var = null;
        }
        i0Var.f47431a.h(b.DEVELOPER_SESSION_REPLAY_FORCE_QUALITY_LEVEL, booleanValue);
        if (!booleanValue) {
            i0Var.f47431a.j(b.DEVELOPER_SESSION_REPLAY_FPS_VALUE, a.Companion.b(i0Var.b()).m());
        }
        if (!booleanValue) {
            i0Var.f47431a.j(b.DEVELOPER_SESSION_REPLAY_IMAGE_QUALITY_VALUE, a.Companion.b(i0Var.b()).ordinal());
        }
        this.f42816c.a(this.f42817d);
        this.f42816c.b(this.f42817d);
        return C16807N.f139792a;
    }
}
