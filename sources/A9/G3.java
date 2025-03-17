package a9;

import dI.C17164e;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.contentsquare.android.internal.core.telemetry.agent.TelemetryEventAgent", f = "TelemetryEventAgent.kt", l = {97}, m = "storeOnDisk")
public final class G3 extends d {

    /* renamed from: c  reason: collision with root package name */
    public A3 f42021c;

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ Object f42022d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ A3 f42023e;

    /* renamed from: f  reason: collision with root package name */
    public int f42024f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public G3(A3 a32, C17164e<? super G3> eVar) {
        super(eVar);
        this.f42023e = a32;
    }

    public final Object invokeSuspend(Object obj) {
        this.f42022d = obj;
        this.f42024f |= Integer.MIN_VALUE;
        return this.f42023e.c(this);
    }
}
