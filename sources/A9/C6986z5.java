package a9;

import QJ.Q;
import XH.C16807N;
import XH.y;
import com.contentsquare.android.sdk.X0;
import dI.C17164e;
import eI.C17187b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.C17642l;
import nI.p;

@f(c = "com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.captureusecase.ScrollViewCaptureUseCase$resume$2$1", f = "ScrollViewCaptureUseCase.kt", l = {79}, m = "invokeSuspend")
/* renamed from: a9.z5  reason: case insensitive filesystem */
public final class C6986z5 extends l implements p<Q, C17164e<? super C16807N>, Object> {

    /* renamed from: c  reason: collision with root package name */
    public int f42987c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C17642l<C17164e<? super C16807N>, Object> f42988d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6986z5(X0.d dVar, C17164e eVar) {
        super(2, eVar);
        this.f42988d = dVar;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new C6986z5((X0.d) this.f42988d, eVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        Q q10 = (Q) obj;
        return new C6986z5((X0.d) this.f42988d, (C17164e) obj2).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C17187b.f();
        int i10 = this.f42987c;
        if (i10 == 0) {
            y.b(obj);
            C17642l<C17164e<? super C16807N>, Object> lVar = this.f42988d;
            this.f42987c = 1;
            if (lVar.invoke(this) == f10) {
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
