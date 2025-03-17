package a9;

import QJ.Q;
import TJ.C16504A;
import TJ.C16532g;
import XH.C16807N;
import XH.y;
import com.contentsquare.android.sdk.O0;
import dI.C17164e;
import eI.C17187b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;
import org.json.JSONObject;

@f(c = "com.contentsquare.android.analytics.internal.pipeline.AnalyticsPipeline$1", f = "AnalyticsPipeline.kt", l = {101}, m = "invokeSuspend")
/* renamed from: a9.u4  reason: case insensitive filesystem */
public final class C6945u4 extends l implements p<Q, C17164e<? super C16807N>, Object> {

    /* renamed from: c  reason: collision with root package name */
    public int f42885c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ O0 f42886d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6945u4(O0 o02, C17164e<? super C6945u4> eVar) {
        super(2, eVar);
        this.f42886d = o02;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new C6945u4(this.f42886d, eVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        Q q10 = (Q) obj;
        return new C6945u4(this.f42886d, (C17164e) obj2).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C17187b.f();
        int i10 = this.f42885c;
        if (i10 == 0) {
            y.b(obj);
            O0 o02 = this.f42886d;
            C16532g<JSONObject> gVar = o02.f47076e;
            C16504A<JSONObject> a10 = o02.f47077f;
            this.f42885c = 1;
            if (gVar.collect(a10, this) == f10) {
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
