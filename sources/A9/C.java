package a9;

import QJ.C16310i;
import QJ.C16311i0;
import QJ.Q;
import XH.C16807N;
import XH.y;
import com.contentsquare.android.sdk.C7144p;
import com.contentsquare.android.sdk.C7161y;
import dI.C17164e;
import eI.C17187b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@f(c = "com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.OverlayViewModel$captureRegularSnapshot$1", f = "OverlayViewModel.kt", l = {169}, m = "invokeSuspend")
public final class C extends l implements p<Q, C17164e<? super C16807N>, Object> {

    /* renamed from: c  reason: collision with root package name */
    public int f41939c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C7161y f41940d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C(C7161y yVar, C17164e<? super C> eVar) {
        super(2, eVar);
        this.f41940d = yVar;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new C(this.f41940d, eVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        Q q10 = (Q) obj;
        return new C(this.f41940d, (C17164e) obj2).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C17187b.f();
        int i10 = this.f41939c;
        if (i10 == 0) {
            y.b(obj);
            Y y10 = this.f41940d.f47717a;
            this.f41939c = 1;
            y10.getClass();
            Object g10 = C16310i.g(C16311i0.c(), new C7144p(y10, (C17164e<? super C7144p>) null), this);
            if (g10 != C17187b.f()) {
                g10 = C16807N.f139792a;
            }
            if (g10 == f10) {
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
