package a9;

import QJ.Q;
import XH.C16807N;
import XH.y;
import com.contentsquare.android.sdk.X0;
import dI.C17164e;
import eI.C17187b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@f(c = "com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.captureusecase.ScrollViewCaptureUseCase$cancel$1", f = "ScrollViewCaptureUseCase.kt", l = {70}, m = "invokeSuspend")
public final class Z4 extends l implements p<Q, C17164e<? super C16807N>, Object> {

    /* renamed from: c  reason: collision with root package name */
    public int f42419c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ X0 f42420d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Z4(X0 x02, C17164e<? super Z4> eVar) {
        super(2, eVar);
        this.f42420d = x02;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new Z4(this.f42420d, eVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        Q q10 = (Q) obj;
        return new Z4(this.f42420d, (C17164e) obj2).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C17187b.f();
        int i10 = this.f42419c;
        if (i10 == 0) {
            y.b(obj);
            X0 x02 = this.f42420d;
            this.f42419c = 1;
            if (x02.d(this) == f10) {
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
