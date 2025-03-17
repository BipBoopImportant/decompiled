package mg;

import Ps.c;
import QJ.C16310i;
import QJ.M;
import QJ.Q;
import XH.C16807N;
import XH.x;
import XH.y;
import YH.C16877v;
import Zx.b;
import com.ingka.ikea.core.model.Image;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\nH@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lmg/U;", "LZx/b;", "LGs/b;", "inboxRepository", "LQJ/M;", "dispatcher", "LFs/a;", "inboxNavigation", "<init>", "(LGs/b;LQJ/M;LFs/a;)V", "LZx/a;", "LPs/c;", "e", "(LZx/a;)LPs/c;", "LGs/a;", "notificationFeature", "pushNotification", "", "a", "(LGs/a;LZx/a;LdI/e;)Ljava/lang/Object;", "LGs/b;", "b", "LQJ/M;", "c", "LFs/a;", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class U implements b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Gs.b f75387a;

    /* renamed from: b  reason: collision with root package name */
    private final M f75388b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Fs.a f75389c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.di.PushNotificationContractImpl$saveToInbox$2", f = "PushNotificationModule.kt", l = {43}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super String>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f75390c;

        /* renamed from: d  reason: collision with root package name */
        Object f75391d;

        /* renamed from: e  reason: collision with root package name */
        Object f75392e;

        /* renamed from: f  reason: collision with root package name */
        int f75393f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ U f75394g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Zx.a f75395h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Gs.a f75396i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(U u10, Zx.a aVar, Gs.a aVar2, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f75394g = u10;
            this.f75395h = aVar;
            this.f75396i = aVar2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f75394g, this.f75395h, this.f75396i, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super String> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f75393f;
            if (i10 == 0) {
                y.b(obj);
                Gs.b c10 = this.f75394g.f75387a;
                Ps.a aVar = Ps.a.User;
                List e10 = C16877v.e(this.f75394g.e(this.f75395h));
                Gs.a aVar2 = this.f75396i;
                this.f75390c = c10;
                this.f75391d = aVar;
                this.f75392e = e10;
                this.f75393f = 1;
                if (c10.e(aVar2, e10, aVar, false, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                List list = (List) this.f75392e;
                Ps.a aVar3 = (Ps.a) this.f75391d;
                Gs.b bVar = (Gs.b) this.f75390c;
                y.b(obj);
                ((x) obj).j();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return this.f75394g.f75389c.b(this.f75396i, this.f75395h.d());
        }
    }

    public U(Gs.b bVar, M m10, Fs.a aVar) {
        C17542s.j(bVar, "inboxRepository");
        C17542s.j(m10, "dispatcher");
        C17542s.j(aVar, "inboxNavigation");
        this.f75387a = bVar;
        this.f75388b = m10;
        this.f75389c = aVar;
    }

    /* access modifiers changed from: private */
    public final c e(Zx.a aVar) {
        String d10 = aVar.d();
        String f10 = aVar.f();
        String a10 = aVar.a();
        long e10 = aVar.e();
        String c10 = aVar.c();
        return new c(d10, f10, a10, e10, aVar.b(), c10 != null ? new Image(c10, "") : null);
    }

    public Object a(Gs.a aVar, Zx.a aVar2, C17164e<? super String> eVar) {
        return C16310i.g(this.f75388b, new a(this, aVar2, aVar, (C17164e<? super a>) null), eVar);
    }
}
