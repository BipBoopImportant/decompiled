package kA;

import QJ.Q;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kA.C14667h;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import ug.h;
import ug.j;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0013¨\u0006\u0015"}, d2 = {"LkA/k;", "LkA/h;", "LIl/a;", "appConfigApi", "Lug/j;", "enabledFeaturesFactory", "<init>", "(LIl/a;Lug/j;)V", "a", "LIl/a;", "b", "Lug/j;", "Lug/h;", "c", "LXH/o;", "getHlpFeatures", "()Lug/h;", "hlpFeatures", "LkA/h$a;", "()LkA/h$a;", "authConfig", "usersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k implements C14667h {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Il.a f128601a;

    /* renamed from: b  reason: collision with root package name */
    private final j f128602b;

    /* renamed from: c  reason: collision with root package name */
    private final C16824o f128603c = C16825p.b(new j(this));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LkA/h$a;", "<anonymous>", "(LQJ/Q;)LkA/h$a;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.session.impl.usertoken.auth.HostedLoginPageConfig$authConfig$1", f = "HlpConfig.kt", l = {60}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C14667h.a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f128604c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k f128605d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(k kVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f128605d = kVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f128605d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C14667h.a> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f128604c;
            if (i10 == 0) {
                y.b(obj);
                Il.a c10 = this.f128605d.f128601a;
                C14667h.a.C3170a aVar = C14667h.a.C3170a.LOGIN;
                this.f128604c = 1;
                obj = C14668i.b(c10, aVar, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Rl.a aVar2 = (Rl.a) obj;
            return new C14667h.a(aVar2.b(), aVar2.a(), aVar2.c(), C14667h.a.C3170a.LOGIN);
        }
    }

    public k(Il.a aVar, j jVar) {
        C17542s.j(aVar, "appConfigApi");
        C17542s.j(jVar, "enabledFeaturesFactory");
        this.f128601a = aVar;
        this.f128602b = jVar;
    }

    /* access modifiers changed from: private */
    public static final h d(k kVar) {
        return kVar.f128602b.c();
    }

    public C14667h.a a() {
        return (C14667h.a) C16312j.b((C17168i) null, new a(this, (C17164e<? super a>) null), 1, (Object) null);
    }
}
