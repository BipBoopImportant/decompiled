package a9;

import QJ.Q;
import TJ.C16504A;
import TJ.C16533h;
import XH.C16807N;
import XH.C16820k;
import XH.y;
import com.contentsquare.android.sdk.C7151t;
import com.contentsquare.android.sdk.O0;
import dI.C17164e;
import eI.C17187b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.C17642l;
import nI.p;
import org.json.JSONObject;

@f(c = "com.contentsquare.android.analytics.internal.pipeline.AnalyticsPipeline$setJsonConsumer$1", f = "AnalyticsPipeline.kt", l = {130}, m = "invokeSuspend")
public final class K4 extends l implements p<Q, C17164e<? super C16807N>, Object> {

    /* renamed from: c  reason: collision with root package name */
    public int f42099c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ O0 f42100d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C17642l<JSONObject, C16807N> f42101e;

    public static final class a<T> implements C16533h {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ C17642l<JSONObject, C16807N> f42102a;

        public a(C7151t.a aVar) {
            this.f42102a = aVar;
        }

        public final Object emit(Object obj, C17164e eVar) {
            this.f42102a.invoke((JSONObject) obj);
            return C16807N.f139792a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public K4(O0 o02, C7151t.a aVar, C17164e eVar) {
        super(2, eVar);
        this.f42100d = o02;
        this.f42101e = aVar;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new K4(this.f42100d, (C7151t.a) this.f42101e, eVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        Q q10 = (Q) obj;
        return new K4(this.f42100d, (C7151t.a) this.f42101e, (C17164e) obj2).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C17187b.f();
        int i10 = this.f42099c;
        if (i10 == 0) {
            y.b(obj);
            C16504A<JSONObject> a10 = this.f42100d.f47077f;
            a aVar = new a((C7151t.a) this.f42101e);
            this.f42099c = 1;
            if (a10.collect(aVar, this) == f10) {
                return f10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            y.b(obj);
        }
        throw new C16820k();
    }
}
