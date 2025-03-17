package a9;

import dI.C17164e;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.contentsquare.android.internal.core.telemetry.processing.TelemetryManager", f = "TelemetryManager.kt", l = {263, 264}, m = "processReport")
public final class A4 extends d {

    /* renamed from: c  reason: collision with root package name */
    public C6858j4 f41912c;

    /* renamed from: d  reason: collision with root package name */
    public String f41913d;

    /* renamed from: e  reason: collision with root package name */
    public Iterator f41914e;

    /* renamed from: f  reason: collision with root package name */
    public /* synthetic */ Object f41915f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C6858j4 f41916g;

    /* renamed from: h  reason: collision with root package name */
    public int f41917h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public A4(C6858j4 j4Var, C17164e<? super A4> eVar) {
        super(eVar);
        this.f41916g = j4Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f41915f = obj;
        this.f41917h |= Integer.MIN_VALUE;
        return C6858j4.a(this.f41916g, (String) null, this);
    }
}
