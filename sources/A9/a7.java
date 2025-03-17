package a9;

import dI.C17164e;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.contentsquare.android.internal.core.telemetry.agent.TimeAgent", f = "TimeAgent.kt", l = {80}, m = "storeOnDisk")
public final class a7 extends d {

    /* renamed from: c  reason: collision with root package name */
    public R6 f42454c;

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ Object f42455d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ R6 f42456e;

    /* renamed from: f  reason: collision with root package name */
    public int f42457f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a7(R6 r62, C17164e<? super a7> eVar) {
        super(eVar);
        this.f42456e = r62;
    }

    public final Object invokeSuspend(Object obj) {
        this.f42455d = obj;
        this.f42457f |= Integer.MIN_VALUE;
        return this.f42456e.c(this);
    }
}
