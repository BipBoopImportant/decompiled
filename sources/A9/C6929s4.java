package a9;

import QJ.Q;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;
import org.json.JSONObject;

@f(c = "com.contentsquare.android.internal.core.telemetry.processing.TelemetryManager$flushTelemetryService$1", f = "TelemetryManager.kt", l = {252}, m = "invokeSuspend")
/* renamed from: a9.s4  reason: case insensitive filesystem */
public final class C6929s4 extends l implements p<Q, C17164e<? super C16807N>, Object> {

    /* renamed from: c  reason: collision with root package name */
    public int f42853c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C6858j4 f42854d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6929s4(C6858j4 j4Var, C17164e<? super C6929s4> eVar) {
        super(2, eVar);
        this.f42854d = j4Var;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new C6929s4(this.f42854d, eVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        Q q10 = (Q) obj;
        return new C6929s4(this.f42854d, (C17164e) obj2).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C17187b.f();
        int i10 = this.f42853c;
        if (i10 == 0) {
            y.b(obj);
            C6858j4 j4Var = this.f42854d;
            this.f42853c = 1;
            if (C6858j4.a(j4Var, "forced", this) == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            try {
                y.b(obj);
            } catch (Exception e10) {
                H1.a(this.f42854d.f42628i, "Failed to process report when flush Telemetry service", e10);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        B5 b52 = this.f42854d.f42620a;
        b52.f41932a.clear();
        b52.f41933b.clear();
        b52.f41934c = new JSONObject();
        b52.f41935d = new JSONObject();
        b52.f41936e = new JSONObject();
        b52.f41937f = new JSONObject();
        this.f42854d.f42628i.f("Flush & stop Telemetry service");
        return C16807N.f139792a;
    }
}
