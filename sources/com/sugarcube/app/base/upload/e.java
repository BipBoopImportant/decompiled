package com.sugarcube.app.base.upload;

import KF.C13164r;
import OE.C13309a;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16519P;
import TJ.C16533h;
import WH.C16729a;
import XH.C16807N;
import XH.C16820k;
import XH.y;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import com.sugarcube.app.base.data.user.UserRepo;
import com.sugarcube.app.base.upload.IUploaderV2;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/sugarcube/app/base/upload/e;", "", "LOE/a;", "appEnvironment", "Lcom/sugarcube/app/base/data/user/UserRepo;", "userRepo", "Landroid/net/ConnectivityManager;", "connectivityManager", "LKF/r;", "uploadVersion", "LWH/a;", "Lcom/sugarcube/app/base/upload/IUploaderV2;", "uploaderV2", "<init>", "(LOE/a;Lcom/sugarcube/app/base/data/user/UserRepo;Landroid/net/ConnectivityManager;LKF/r;LWH/a;)V", "a", "LOE/a;", "b", "Lcom/sugarcube/app/base/data/user/UserRepo;", "c", "Landroid/net/ConnectivityManager;", "d", "LKF/r;", "e", "LWH/a;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C13309a f125765a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final UserRepo f125766b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final ConnectivityManager f125767c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C13164r f125768d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C16729a<IUploaderV2> f125769e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.upload.UploadScheduler$1", f = "UploadScheduler.kt", l = {37}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f125770c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f125771d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.sugarcube.app.base.upload.e$a$a  reason: collision with other inner class name */
        static final class C3076a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f125772a;

            C3076a(e eVar) {
                this.f125772a = eVar;
            }

            public final Object c(boolean z10, C17164e<? super C16807N> eVar) {
                if (z10 && this.f125772a.f125768d.b()) {
                    IUploaderV2.a.a((IUploaderV2) this.f125772a.f125769e.get(), false, "loggedin", false, 5, (Object) null);
                }
                return C16807N.f139792a;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                return c(((Boolean) obj).booleanValue(), eVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar, C17164e<? super a> eVar2) {
            super(2, eVar2);
            this.f125771d = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f125771d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f125770c;
            if (i10 == 0) {
                y.b(obj);
                C16519P<Boolean> isLoggedIn = this.f125771d.f125766b.isLoggedIn();
                C3076a aVar = new C3076a(this.f125771d);
                this.f125770c = 1;
                if (isLoggedIn.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                y.b(obj);
            }
            throw new C16820k();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.upload.UploadScheduler$2", f = "UploadScheduler.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f125773c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f125774d;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/sugarcube/app/base/upload/e$b$a", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "LXH/N;", "onAvailable", "(Landroid/net/Network;)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends ConnectivityManager.NetworkCallback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f125775a;

            a(e eVar) {
                this.f125775a = eVar;
            }

            public void onAvailable(Network network) {
                C17542s.j(network, "network");
                super.onAvailable(network);
                IUploaderV2.a.a((IUploaderV2) this.f125775a.f125769e.get(), false, "online", false, 1, (Object) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar, C17164e<? super b> eVar2) {
            super(2, eVar2);
            this.f125774d = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f125774d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f125773c == 0) {
                y.b(obj);
                a aVar = new a(this.f125774d);
                if (this.f125774d.f125765a.a().checkSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                    this.f125774d.f125767c.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), aVar);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public e(C13309a aVar, UserRepo userRepo, ConnectivityManager connectivityManager, C13164r rVar, C16729a<IUploaderV2> aVar2) {
        C13309a aVar3 = aVar;
        UserRepo userRepo2 = userRepo;
        ConnectivityManager connectivityManager2 = connectivityManager;
        C13164r rVar2 = rVar;
        C16729a<IUploaderV2> aVar4 = aVar2;
        C17542s.j(aVar3, "appEnvironment");
        C17542s.j(userRepo2, "userRepo");
        C17542s.j(connectivityManager2, "connectivityManager");
        C17542s.j(rVar2, "uploadVersion");
        C17542s.j(aVar4, "uploaderV2");
        this.f125765a = aVar3;
        this.f125766b = userRepo2;
        this.f125767c = connectivityManager2;
        this.f125768d = rVar2;
        this.f125769e = aVar4;
        F0 unused = C16314k.d(aVar.b(), (C17168i) null, (T) null, new a(this, (C17164e<? super a>) null), 3, (Object) null);
        F0 unused2 = C16314k.d(aVar.b(), (C17168i) null, (T) null, new b(this, (C17164e<? super b>) null), 3, (Object) null);
    }
}
