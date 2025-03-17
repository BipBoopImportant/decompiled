package Ys;

import QJ.C16324p;
import XH.C16807N;
import Ys.f;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LYs/g;", "LYs/f;", "LYs/c;", "installReferrerClientWrapper", "LYs/a;", "appInstallReferrerStateListener", "<init>", "(LYs/c;LYs/a;)V", "LYs/f$a;", "a", "(LdI/e;)Ljava/lang/Object;", "LYs/c;", "b", "LYs/a;", "installreferrer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements f {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final c f89745a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final a f89746b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements C17642l<Throwable, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f89747a;

        a(g gVar) {
            this.f89747a = gVar;
        }

        public final void a(Throwable th2) {
            this.f89747a.f89745a.a();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    public g(c cVar, a aVar) {
        C17542s.j(cVar, "installReferrerClientWrapper");
        C17542s.j(aVar, "appInstallReferrerStateListener");
        this.f89745a = cVar;
        this.f89746b = aVar;
    }

    public Object a(C17164e<? super f.a> eVar) {
        C16324p pVar = new C16324p(C17187b.c(eVar), 1);
        pVar.C();
        c c10 = this.f89745a;
        this.f89746b.a(pVar);
        c10.b(this.f89746b);
        pVar.K(new a(this));
        Object w10 = pVar.w();
        if (w10 == C17187b.f()) {
            h.c(eVar);
        }
        return w10;
    }
}
