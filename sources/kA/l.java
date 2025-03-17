package kA;

import QJ.Q;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kA.C14667h;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\t¨\u0006\u000b"}, d2 = {"LkA/l;", "LkA/h;", "LIl/a;", "appConfigApi", "<init>", "(LIl/a;)V", "a", "LIl/a;", "LkA/h$a;", "()LkA/h$a;", "authConfig", "usersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements C14667h {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Il.a f128606a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LkA/h$a;", "<anonymous>", "(LQJ/Q;)LkA/h$a;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.session.impl.usertoken.auth.HostedSignUpPageConfig$authConfig$1", f = "HlpConfig.kt", l = {84}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C14667h.a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f128607c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ l f128608d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(l lVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f128608d = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f128608d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C14667h.a> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f128607c;
            if (i10 == 0) {
                y.b(obj);
                Il.a b10 = this.f128608d.f128606a;
                C14667h.a.C3170a aVar = C14667h.a.C3170a.SIGN_UP;
                this.f128607c = 1;
                obj = C14668i.b(b10, aVar, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Rl.a aVar2 = (Rl.a) obj;
            return new C14667h.a(aVar2.b(), aVar2.a(), aVar2.c(), C14667h.a.C3170a.SIGN_UP);
        }
    }

    public l(Il.a aVar) {
        C17542s.j(aVar, "appConfigApi");
        this.f128606a = aVar;
    }

    public C14667h.a a() {
        return (C14667h.a) C16312j.b((C17168i) null, new a(this, (C17164e<? super a>) null), 1, (Object) null);
    }
}
