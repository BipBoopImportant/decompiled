package com.contentsquare.android.sdk;

import QJ.Q;
import QJ.s1;
import XH.C16807N;
import XH.x;
import XH.y;
import a9.Y;
import com.contentsquare.android.sdk.C7158w0;
import dI.C17164e;
import eI.C17187b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@f(c = "com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.captureusecase.RegularSnapshotCaptureUseCase$capture$2", f = "RegularSnapshotCaptureUseCase.kt", l = {14, 16}, m = "invokeSuspend")
/* renamed from: com.contentsquare.android.sdk.p  reason: case insensitive filesystem */
public final class C7144p extends l implements p<Q, C17164e<? super x<? extends C16807N>>, Object> {

    /* renamed from: c  reason: collision with root package name */
    public Y f47579c;

    /* renamed from: d  reason: collision with root package name */
    public Throwable f47580d;

    /* renamed from: e  reason: collision with root package name */
    public int f47581e;

    /* renamed from: f  reason: collision with root package name */
    public /* synthetic */ Object f47582f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Y f47583g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7144p(Y y10, C17164e<? super C7144p> eVar) {
        super(2, eVar);
        this.f47583g = y10;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        C7144p pVar = new C7144p(this.f47583g, eVar);
        pVar.f47582f = obj;
        return pVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        C7144p pVar = new C7144p(this.f47583g, (C17164e) obj2);
        pVar.f47582f = (Q) obj;
        return pVar.invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        Y y10;
        Throwable th2;
        Object f10 = C17187b.f();
        int i10 = this.f47581e;
        if (i10 == 0) {
            y.b(obj);
            Q q10 = (Q) this.f47582f;
            Y y11 = this.f47583g;
            x.a aVar = x.f139812b;
            C7137m mVar = y11.f42398a;
            C7158w0.c cVar = C7158w0.c.f47685a;
            this.f47581e = 1;
            if (mVar.b(cVar, this) == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            try {
                y.b(obj);
            } catch (Throwable th3) {
                x.a aVar2 = x.f139812b;
                obj2 = x.b(y.a(th3));
            }
        } else if (i10 == 2) {
            th2 = this.f47580d;
            y10 = this.f47579c;
            obj3 = this.f47582f;
            y.b(obj);
            y10.f42398a.d(th2);
            obj2 = obj3;
            return x.a(obj2);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj2 = x.b(C16807N.f139792a);
        y10 = this.f47583g;
        Throwable e10 = x.e(obj2);
        if (e10 != null) {
            this.f47582f = obj2;
            this.f47579c = y10;
            this.f47580d = e10;
            this.f47581e = 2;
            if (s1.a(this) == f10) {
                return f10;
            }
            obj3 = obj2;
            th2 = e10;
            y10.f42398a.d(th2);
            obj2 = obj3;
        }
        return x.a(obj2);
    }
}
