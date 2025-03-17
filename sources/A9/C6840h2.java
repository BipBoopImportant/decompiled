package a9;

import E8.b;
import XH.C16807N;
import com.contentsquare.android.sdk.C7130i0;
import com.contentsquare.android.sdk.V5;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

/* renamed from: a9.h2  reason: case insensitive filesystem */
public final class C6840h2 extends C17544u implements C17642l<Integer, C16807N> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ V5 f42592c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6840h2(V5 v52) {
        super(1);
        this.f42592c = v52;
    }

    public final Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        C7130i0 i0Var = this.f42592c.f47193D;
        if (i0Var == null) {
            C17542s.z("settingsViewModel");
            i0Var = null;
        }
        i0Var.f47431a.j(b.CLIENT_MODE_LONG_SNAPSHOT_SCROLL_DELAY_MILLISECONDS, intValue);
        return C16807N.f139792a;
    }
}
