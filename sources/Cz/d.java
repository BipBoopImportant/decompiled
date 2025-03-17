package cz;

import GK.C15774B;
import GK.C15776D;
import GK.C15804w;
import Hl.a;
import QJ.Q;
import XH.C16807N;
import dI.C17164e;
import dI.C17168i;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import mz.C14835a;
import nI.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcz/d;", "LGK/w;", "LHl/a;", "wifiConnector", "Lmz/a;", "scanAndGoSettingsDataStore", "<init>", "(LHl/a;Lmz/a;)V", "", "b", "()J", "LGK/w$a;", "chain", "LGK/D;", "intercept", "(LGK/w$a;)LGK/D;", "a", "LHl/a;", "Lmz/a;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements C15804w {

    /* renamed from: a  reason: collision with root package name */
    private final Hl.a f126163a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C14835a f126164b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)J"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.api.ScanAndGoTimeoutInterceptor$getSettingsTimeout$1", f = "ScanAndGoTimeoutInterceptor.kt", l = {44}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super Long>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f126165c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f126166d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f126166d = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f126166d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super Long> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
            r4 = r4.o();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r3.f126165c
                r2 = 1
                if (r1 == 0) goto L_0x0017
                if (r1 != r2) goto L_0x000f
                XH.y.b(r4)
                goto L_0x002d
            L_0x000f:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L_0x0017:
                XH.y.b(r4)
                cz.d r4 = r3.f126166d
                mz.a r4 = r4.f126164b
                TJ.g r4 = r4.b()
                r3.f126165c = r2
                java.lang.Object r4 = TJ.C16534i.D(r4, r3)
                if (r4 != r0) goto L_0x002d
                return r0
            L_0x002d:
                com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings r4 = (com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings) r4
                if (r4 == 0) goto L_0x003c
                java.lang.Long r4 = r4.o()
                if (r4 == 0) goto L_0x003c
                long r0 = r4.longValue()
                goto L_0x003e
            L_0x003c:
                r0 = 10
            L_0x003e:
                java.lang.Long r4 = kotlin.coroutines.jvm.internal.b.f(r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: cz.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public d(Hl.a aVar, C14835a aVar2) {
        C17542s.j(aVar, "wifiConnector");
        C17542s.j(aVar2, "scanAndGoSettingsDataStore");
        this.f126163a = aVar;
        this.f126164b = aVar2;
    }

    private final long b() {
        return ((Number) C16312j.b((C17168i) null, new a(this, (C17164e<? super a>) null), 1, (Object) null)).longValue();
    }

    public C15776D intercept(C15804w.a aVar) {
        C17542s.j(aVar, "chain");
        C15774B.a i10 = aVar.t().i();
        int millis = (int) (this.f126163a.a() == a.C1585a.WIFI ? TimeUnit.SECONDS.toMillis(10) : TimeUnit.SECONDS.toMillis(b()));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return aVar.a(millis, timeUnit).e(millis, timeUnit).c(millis, timeUnit).b(i10.b());
    }
}
