package o5;

import QJ.C16297b0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import SJ.C16423B;
import SJ.C16447w;
import SJ.C16449y;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.work.C7036e;
import androidx.work.C7055y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;
import o5.C8601b;
import p5.d;
import s5.C8739u;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lo5/c;", "Lp5/d;", "Landroid/net/ConnectivityManager;", "connManager", "", "timeoutMs", "<init>", "(Landroid/net/ConnectivityManager;J)V", "Landroidx/work/e;", "constraints", "LTJ/g;", "Lo5/b;", "c", "(Landroidx/work/e;)LTJ/g;", "Ls5/u;", "workSpec", "", "b", "(Ls5/u;)Z", "a", "Landroid/net/ConnectivityManager;", "J", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: o5.c  reason: case insensitive filesystem */
public final class C8602c implements d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final ConnectivityManager f55217a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final long f55218b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LSJ/y;", "Lo5/b;", "LXH/N;", "<anonymous>", "(LSJ/y;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1", f = "WorkConstraintsTracker.kt", l = {182}, m = "invokeSuspend")
    /* renamed from: o5.c$a */
    static final class a extends l implements p<C16449y<? super C8601b>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f55219c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f55220d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C7036e f55221e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C8602c f55222f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: o5.c$a$a  reason: collision with other inner class name */
        static final class C0882a extends C17544u implements C17631a<C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C8602c f55223c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C0883c f55224d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0882a(C8602c cVar, C0883c cVar2) {
                super(0);
                this.f55223c = cVar;
                this.f55224d = cVar2;
            }

            public final void invoke() {
                C7055y.e().a(C8606g.f55241a, "NetworkRequestConstraintController unregister callback");
                this.f55223c.f55217a.unregisterNetworkCallback(this.f55224d);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$job$1", f = "WorkConstraintsTracker.kt", l = {148}, m = "invokeSuspend")
        /* renamed from: o5.c$a$b */
        static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f55225c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C8602c f55226d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C16449y<C8601b> f55227e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C8602c cVar, C16449y<? super C8601b> yVar, C17164e<? super b> eVar) {
                super(2, eVar);
                this.f55226d = cVar;
                this.f55227e = yVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new b(this.f55226d, this.f55227e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f55225c;
                if (i10 == 0) {
                    y.b(obj);
                    long e10 = this.f55226d.f55218b;
                    this.f55225c = 1;
                    if (C16297b0.b(e10, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7055y e11 = C7055y.e();
                String c10 = C8606g.f55241a;
                e11.a(c10, "NetworkRequestConstraintController didn't receive neither  onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after " + this.f55226d.f55218b + " ms");
                this.f55227e.k(new C8601b.C0881b(7));
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"o5/c$a$c", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "LXH/N;", "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "onLost", "(Landroid/net/Network;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: o5.c$a$c  reason: collision with other inner class name */
        public static final class C0883c extends ConnectivityManager.NetworkCallback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ F0 f55228a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C16449y<C8601b> f55229b;

            C0883c(F0 f02, C16449y<? super C8601b> yVar) {
                this.f55228a = f02;
                this.f55229b = yVar;
            }

            public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                C17542s.j(network, "network");
                C17542s.j(networkCapabilities, "networkCapabilities");
                F0.a.a(this.f55228a, (CancellationException) null, 1, (Object) null);
                C7055y.e().a(C8606g.f55241a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
                this.f55229b.k(C8601b.a.f55215a);
            }

            public void onLost(Network network) {
                C17542s.j(network, "network");
                F0.a.a(this.f55228a, (CancellationException) null, 1, (Object) null);
                C7055y.e().a(C8606g.f55241a, "NetworkRequestConstraintController onLost callback");
                this.f55229b.k(new C8601b.C0881b(7));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C7036e eVar, C8602c cVar, C17164e<? super a> eVar2) {
            super(2, eVar2);
            this.f55221e = eVar;
            this.f55222f = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f55221e, this.f55222f, eVar);
            aVar.f55220d = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(C16449y<? super C8601b> yVar, C17164e<? super C16807N> eVar) {
            return ((a) create(yVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f55219c;
            if (i10 == 0) {
                y.b(obj);
                C16449y yVar = (C16449y) this.f55220d;
                NetworkRequest d10 = this.f55221e.d();
                if (d10 == null) {
                    C16423B.a.a(yVar.d(), (Throwable) null, 1, (Object) null);
                    return C16807N.f139792a;
                }
                C0883c cVar = new C0883c(C16314k.d(yVar, (C17168i) null, (T) null, new b(this.f55222f, yVar, (C17164e<? super b>) null), 3, (Object) null), yVar);
                C7055y.e().a(C8606g.f55241a, "NetworkRequestConstraintController register callback");
                this.f55222f.f55217a.registerNetworkCallback(d10, cVar);
                C0882a aVar = new C0882a(this.f55222f, cVar);
                this.f55219c = 1;
                if (C16447w.a(yVar, aVar, this) == f10) {
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

    public C8602c(ConnectivityManager connectivityManager, long j10) {
        C17542s.j(connectivityManager, "connManager");
        this.f55217a = connectivityManager;
        this.f55218b = j10;
    }

    public boolean a(C8739u uVar) {
        C17542s.j(uVar, "workSpec");
        if (!b(uVar)) {
            return false;
        }
        throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
    }

    public boolean b(C8739u uVar) {
        C17542s.j(uVar, "workSpec");
        return uVar.f55919j.d() != null;
    }

    public C16532g<C8601b> c(C7036e eVar) {
        C17542s.j(eVar, "constraints");
        return C16534i.f(new a(eVar, this, (C17164e<? super a>) null));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8602c(ConnectivityManager connectivityManager, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(connectivityManager, (i10 & 2) != 0 ? C8606g.f55242b : j10);
    }
}
