package com.contentsquare.android.sdk;

import QJ.Q;
import QJ.s1;
import XH.C16807N;
import XH.x;
import XH.y;
import a9.O3;
import a9.X2;
import com.contentsquare.android.sdk.C7134k0;
import com.contentsquare.android.sdk.C7158w0;
import dI.C17164e;
import eI.C17187b;
import java.util.UUID;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.p;
import w8.c;

@f(c = "com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.captureusecase.VerticalComposeScrollUseCase$capture$2", f = "VerticalComposeScrollUseCase.kt", l = {19, 34}, m = "invokeSuspend")
/* renamed from: com.contentsquare.android.sdk.f0  reason: case insensitive filesystem */
public final class C7124f0 extends l implements p<Q, C17164e<? super x<? extends C16807N>>, Object> {

    /* renamed from: c  reason: collision with root package name */
    public X2 f47399c;

    /* renamed from: d  reason: collision with root package name */
    public Throwable f47400d;

    /* renamed from: e  reason: collision with root package name */
    public int f47401e;

    /* renamed from: f  reason: collision with root package name */
    public /* synthetic */ Object f47402f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ c f47403g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ X2 f47404h;

    @f(c = "com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.captureusecase.VerticalComposeScrollUseCase$capture$2$1$1", f = "VerticalComposeScrollUseCase.kt", l = {20, 29}, m = "invokeSuspend")
    /* renamed from: com.contentsquare.android.sdk.f0$a */
    public static final class a extends l implements p<Integer, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        public int f47405c;

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ int f47406d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ X2 f47407e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f47408f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ c f47409g;

        /* renamed from: com.contentsquare.android.sdk.f0$a$a  reason: collision with other inner class name */
        public static final class C0818a extends C17544u implements C17631a<C16807N> {

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ X2 f47410c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0818a(X2 x22) {
                super(0);
                this.f47410c = x22;
            }

            public final Object invoke() {
                this.f47410c.f42379a.f47532a.a(C7134k0.d.f47477a);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(X2 x22, String str, c cVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f47407e = x22;
            this.f47408f = str;
            this.f47409g = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f47407e, this.f47408f, this.f47409g, eVar);
            aVar.f47406d = ((Number) obj).intValue();
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create(Integer.valueOf(((Number) obj).intValue()), (C17164e) obj2)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            int i10;
            Object f10 = C17187b.f();
            int i11 = this.f47405c;
            if (i11 == 0) {
                y.b(obj);
                i10 = this.f47406d;
                X2 x22 = this.f47407e;
                O3 o32 = x22.f42380b;
                C0818a aVar = new C0818a(x22);
                this.f47406d = i10;
                this.f47405c = 1;
                if (o32.a(aVar, this) == f10) {
                    return f10;
                }
            } else if (i11 == 1) {
                i10 = this.f47406d;
                y.b(obj);
            } else if (i11 == 2) {
                y.b(obj);
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7158w0.b bVar = new C7158w0.b(this.f47408f, i10, this.f47409g);
            this.f47407e.f42379a.f47532a.a(new C7134k0.e(bVar.f47683b, bVar.f47684c.g()));
            C7116b0 b0Var = this.f47407e.f42379a;
            this.f47405c = 2;
            if (b0Var.b(bVar, this) == f10) {
                return f10;
            }
            return C16807N.f139792a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7124f0(c cVar, X2 x22, C17164e<? super C7124f0> eVar) {
        super(2, eVar);
        this.f47403g = cVar;
        this.f47404h = x22;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        C7124f0 f0Var = new C7124f0(this.f47403g, this.f47404h, eVar);
        f0Var.f47402f = obj;
        return f0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C7124f0) create((Q) obj, (C17164e) obj2)).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        X2 x22;
        Throwable th2;
        Object f10 = C17187b.f();
        int i10 = this.f47401e;
        if (i10 == 0) {
            y.b(obj);
            Q q10 = (Q) this.f47402f;
            c cVar = this.f47403g;
            X2 x23 = this.f47404h;
            x.a aVar = x.f139812b;
            String uuid = UUID.randomUUID().toString();
            C17542s.i(uuid, "randomUUID().toString()");
            a aVar2 = new a(x23, uuid, cVar, (C17164e<? super a>) null);
            this.f47401e = 1;
            if (cVar.a(aVar2, this) == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            try {
                y.b(obj);
            } catch (Throwable th3) {
                x.a aVar3 = x.f139812b;
                obj2 = x.b(y.a(th3));
            }
        } else if (i10 == 2) {
            th2 = this.f47400d;
            x22 = this.f47399c;
            obj3 = this.f47402f;
            y.b(obj);
            x22.f42379a.d(th2);
            obj2 = obj3;
            return x.a(obj2);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj2 = x.b(C16807N.f139792a);
        x22 = this.f47404h;
        Throwable e10 = x.e(obj2);
        if (e10 != null) {
            this.f47402f = obj2;
            this.f47399c = x22;
            this.f47400d = e10;
            this.f47401e = 2;
            if (s1.a(this) == f10) {
                return f10;
            }
            obj3 = obj2;
            th2 = e10;
            x22.f42379a.d(th2);
            obj2 = obj3;
        }
        return x.a(obj2);
    }
}
