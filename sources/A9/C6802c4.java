package a9;

import dI.C17164e;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.contentsquare.android.internal.core.telemetry.agent.PublicUsageAgent", f = "PublicUsageAgent.kt", l = {109}, m = "storeOnDisk")
/* renamed from: a9.c4  reason: case insensitive filesystem */
public final class C6802c4 extends d {

    /* renamed from: c  reason: collision with root package name */
    public T3 f42481c;

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ Object f42482d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ T3 f42483e;

    /* renamed from: f  reason: collision with root package name */
    public int f42484f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6802c4(T3 t32, C17164e<? super C6802c4> eVar) {
        super(eVar);
        this.f42483e = t32;
    }

    public final Object invokeSuspend(Object obj) {
        this.f42482d = obj;
        this.f42484f |= Integer.MIN_VALUE;
        return this.f42483e.c(this);
    }
}
