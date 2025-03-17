package yd;

import QJ.C16311i0;
import QJ.F0;
import QJ.Q;
import QJ.S;
import QJ.T;
import U0.C4899r0;
import U0.o1;
import XH.C16807N;
import XH.y;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0014¨\u0006\u0016"}, d2 = {"Lyd/d;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "LXH/N;", "b", "()V", "c", "Landroid/net/ConnectivityManager;", "a", "Landroid/net/ConnectivityManager;", "connectivityManager", "LU0/r0;", "", "LU0/r0;", "()LU0/r0;", "isNetworkConnected", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/ConnectivityManager$NetworkCallback;", "networkCallback", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: yd.d  reason: case insensitive filesystem */
public final class C10450d {

    /* renamed from: a  reason: collision with root package name */
    private final ConnectivityManager f77917a;

    /* renamed from: b  reason: collision with root package name */
    private final C4899r0<Boolean> f77918b;

    /* renamed from: c  reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f77919c;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"yd/d$a", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "LXH/N;", "onAvailable", "(Landroid/net/Network;)V", "onLost", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: yd.d$a */
    public static final class a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Q f77920a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C10450d f77921b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
        @f(c = "com.ikea.kompassmap.Connection$registerNetworkCallback$1$onAvailable$1", f = "Connection.kt", l = {}, m = "invokeSuspend")
        /* renamed from: yd.d$a$a  reason: collision with other inner class name */
        static final class C1437a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f77922c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C10450d f77923d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1437a(C10450d dVar, C17164e<? super C1437a> eVar) {
                super(2, eVar);
                this.f77923d = dVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C1437a(this.f77923d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C1437a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f77922c == 0) {
                    y.b(obj);
                    this.f77923d.a().setValue(kotlin.coroutines.jvm.internal.b.a(true));
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
        @f(c = "com.ikea.kompassmap.Connection$registerNetworkCallback$1$onLost$1", f = "Connection.kt", l = {}, m = "invokeSuspend")
        /* renamed from: yd.d$a$b */
        static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f77924c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C10450d f77925d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C10450d dVar, C17164e<? super b> eVar) {
                super(2, eVar);
                this.f77925d = dVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new b(this.f77925d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f77924c == 0) {
                    y.b(obj);
                    this.f77925d.a().setValue(kotlin.coroutines.jvm.internal.b.a(false));
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        a(Q q10, C10450d dVar) {
            this.f77920a = q10;
            this.f77921b = dVar;
        }

        public void onAvailable(Network network) {
            C17542s.j(network, "network");
            F0 unused = C16314k.d(this.f77920a, (C17168i) null, (T) null, new C1437a(this.f77921b, (C17164e<? super C1437a>) null), 3, (Object) null);
        }

        public void onLost(Network network) {
            C17542s.j(network, "network");
            F0 unused = C16314k.d(this.f77920a, (C17168i) null, (T) null, new b(this.f77921b, (C17164e<? super b>) null), 3, (Object) null);
        }
    }

    public C10450d(Context context) {
        C17542s.j(context, "context");
        Object systemService = context.getSystemService("connectivity");
        this.f77917a = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        this.f77918b = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
    }

    public final C4899r0<Boolean> a() {
        return this.f77918b;
    }

    public final void b() {
        NetworkRequest build = new NetworkRequest.Builder().addCapability(12).build();
        a aVar = new a(S.a(C16311i0.c()), this);
        this.f77919c = aVar;
        ConnectivityManager connectivityManager = this.f77917a;
        if (connectivityManager != null) {
            connectivityManager.registerNetworkCallback(build, aVar);
        }
    }

    public final void c() {
        ConnectivityManager connectivityManager;
        ConnectivityManager.NetworkCallback networkCallback = this.f77919c;
        if (networkCallback != null && (connectivityManager = this.f77917a) != null) {
            connectivityManager.unregisterNetworkCallback(networkCallback);
        }
    }
}
