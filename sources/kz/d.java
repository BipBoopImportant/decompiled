package Kz;

import Kz.a;
import Kz.b;
import QJ.Q;
import Ry.b;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.y;
import cD.C14031c;
import com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kD.h;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017¨\u0006\u0018"}, d2 = {"LKz/d;", "LKz/c;", "LRy/b;", "scanAndGoCapability", "LcD/c;", "profileRepository", "LRy/a;", "settingsRepo", "<init>", "(LRy/b;LcD/c;LRy/a;)V", "LKz/b;", "c", "()LKz/b;", "LKz/b$b;", "d", "()LKz/b$b;", "LKz/a;", "request", "a", "(LKz/a;)LKz/b;", "LRy/b;", "b", "LcD/c;", "LRy/a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final b f111796a;

    /* renamed from: b  reason: collision with root package name */
    private final C14031c f111797b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Ry.a f111798c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Z"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.scanandgo.requestuseremail.usecase.ScanAndGoRequestUserEmailUseCaseImpl$buildEmailCollectionStatus$emailRequired$1", f = "ScanAndGoRequestUserEmailUseCaseImpl.kt", l = {31}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f111799c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f111800d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f111800d = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f111800d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super Boolean> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f111799c;
            boolean z10 = true;
            if (i10 == 0) {
                y.b(obj);
                C16532g<ScanAndGoSettings> b10 = this.f111800d.f111798c.b();
                this.f111799c = 1;
                obj = C16534i.D(b10, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ScanAndGoSettings scanAndGoSettings = (ScanAndGoSettings) obj;
            boolean z11 = false;
            if (scanAndGoSettings != null) {
                if (!scanAndGoSettings.f() && !scanAndGoSettings.h()) {
                    z10 = false;
                }
                z11 = z10;
            }
            return kotlin.coroutines.jvm.internal.b.a(z11);
        }
    }

    public d(b bVar, C14031c cVar, Ry.a aVar) {
        C17542s.j(bVar, "scanAndGoCapability");
        C17542s.j(cVar, "profileRepository");
        C17542s.j(aVar, "settingsRepo");
        this.f111796a = bVar;
        this.f111797b = cVar;
        this.f111798c = aVar;
    }

    private final b c() {
        if (!((Boolean) C16312j.b((C17168i) null, new a(this, (C17164e<? super a>) null), 1, (Object) null)).booleanValue()) {
            return b.a.f111792b;
        }
        String e10 = this.f111796a.e();
        return (e10 == null || e10.length() == 0) ? d() : new b.C2730b.a(e10);
    }

    private final b.C2730b d() {
        h value = this.f111797b.getProfile().getValue();
        String b10 = value != null ? value.b() : null;
        if (b10 == null || b10.length() == 0) {
            return b.C2730b.C2731b.f111794b;
        }
        this.f111796a.g(b10);
        return new b.C2730b.a(b10);
    }

    public b a(a aVar) {
        C17542s.j(aVar, "request");
        if (!C17542s.e(aVar, a.C2729a.f111789a)) {
            if (aVar instanceof a.b) {
                this.f111796a.g(((a.b) aVar).a());
            } else {
                throw new t();
            }
        }
        return c();
    }
}
