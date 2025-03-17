package a9;

import QJ.Q;
import TJ.C16504A;
import XH.C16807N;
import XH.y;
import com.contentsquare.android.sdk.O0;
import dI.C17164e;
import eI.C17187b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;
import org.json.JSONObject;

@f(c = "com.contentsquare.android.analytics.internal.pipeline.AnalyticsPipeline$emitJSONObject$1", f = "AnalyticsPipeline.kt", l = {115}, m = "invokeSuspend")
public final class J4 extends l implements p<Q, C17164e<? super C16807N>, Object> {

    /* renamed from: c  reason: collision with root package name */
    public int f42081c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ O0 f42082d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ JSONObject f42083e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J4(O0 o02, JSONObject jSONObject, C17164e<? super J4> eVar) {
        super(2, eVar);
        this.f42082d = o02;
        this.f42083e = jSONObject;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new J4(this.f42082d, this.f42083e, eVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        Q q10 = (Q) obj;
        return new J4(this.f42082d, this.f42083e, (C17164e) obj2).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C17187b.f();
        int i10 = this.f42081c;
        if (i10 == 0) {
            y.b(obj);
            C16504A<JSONObject> a10 = this.f42082d.f47077f;
            JSONObject jSONObject = this.f42083e;
            this.f42081c = 1;
            if (a10.emit(jSONObject, this) == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            y.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C16807N.f139792a;
    }
}
