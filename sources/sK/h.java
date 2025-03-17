package Sk;

import QJ.C16310i;
import QJ.M;
import QJ.Q;
import XH.C16807N;
import XH.y;
import am.C11070a;
import ck.C11143c;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHB¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LSk/h;", "LSk/g;", "Lam/a;", "appApi", "Lcom/ingka/ikea/app/splash/a;", "appInternalApi", "LQJ/M;", "coroutineDispatcher", "<init>", "(Lam/a;Lcom/ingka/ikea/app/splash/a;LQJ/M;)V", "", "a", "(LdI/e;)Ljava/lang/Object;", "Lam/a;", "b", "Lcom/ingka/ikea/app/splash/a;", "c", "LQJ/M;", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements g {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C11070a f87211a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final com.ingka.ikea.app.splash.a f87212b;

    /* renamed from: c  reason: collision with root package name */
    private final M f87213c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Z"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.splash.viewmodel.splash.usecase.RootedDeviceCheckUseCaseImpl$invoke$2", f = "RootedDeviceCheckUseCase.kt", l = {31}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f87214c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h f87215d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h hVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f87215d = hVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f87215d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super Boolean> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f87214c;
            boolean z10 = true;
            if (i10 == 0) {
                y.b(obj);
                C11143c a10 = this.f87215d.f87212b.a();
                this.f87214c = 1;
                obj = a10.a(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (!((Boolean) obj).booleanValue() || this.f87215d.f87211a.b()) {
                z10 = false;
            }
            return b.a(z10);
        }
    }

    public h(C11070a aVar, com.ingka.ikea.app.splash.a aVar2, M m10) {
        C17542s.j(aVar, "appApi");
        C17542s.j(aVar2, "appInternalApi");
        C17542s.j(m10, "coroutineDispatcher");
        this.f87211a = aVar;
        this.f87212b = aVar2;
        this.f87213c = m10;
    }

    public Object a(C17164e<? super Boolean> eVar) {
        return C16310i.g(this.f87213c, new a(this, (C17164e<? super a>) null), eVar);
    }
}
