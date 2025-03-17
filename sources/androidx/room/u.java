package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.m;
import androidx.room.n;
import androidx.room.r;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001f\u001a\n \u001d*\u0004\u0018\u00010\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001eR\"\u0010%\u001a\u00020 8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010!\u001a\u0004\b\u0019\u0010\"\"\u0004\b#\u0010$R\"\u0010,\u001a\u00020&8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)\"\u0004\b*\u0010+R$\u00104\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0017\u00109\u001a\u0002058\u0006¢\u0006\f\n\u0004\b0\u00106\u001a\u0004\b7\u00108R\u0017\u0010?\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010D\u001a\u00020@8\u0006¢\u0006\f\n\u0004\b=\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010I\u001a\u00020E8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b;\u0010HR\u0017\u0010J\u001a\u00020E8\u0006¢\u0006\f\n\u0004\b*\u0010G\u001a\u0004\b.\u0010H¨\u0006K"}, d2 = {"Landroidx/room/u;", "", "Landroid/content/Context;", "context", "", "name", "Landroid/content/Intent;", "serviceIntent", "Landroidx/room/r;", "invalidationTracker", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroidx/room/r;Ljava/util/concurrent/Executor;)V", "LXH/N;", "o", "()V", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "Landroidx/room/r;", "e", "()Landroidx/room/r;", "c", "Ljava/util/concurrent/Executor;", "d", "()Ljava/util/concurrent/Executor;", "kotlin.jvm.PlatformType", "Landroid/content/Context;", "appContext", "", "I", "()I", "setClientId", "(I)V", "clientId", "Landroidx/room/r$c;", "f", "Landroidx/room/r$c;", "()Landroidx/room/r$c;", "l", "(Landroidx/room/r$c;)V", "observer", "Landroidx/room/n;", "g", "Landroidx/room/n;", "h", "()Landroidx/room/n;", "m", "(Landroidx/room/n;)V", "service", "Landroidx/room/m;", "Landroidx/room/m;", "getCallback", "()Landroidx/room/m;", "callback", "Ljava/util/concurrent/atomic/AtomicBoolean;", "i", "Ljava/util/concurrent/atomic/AtomicBoolean;", "j", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "stopped", "Landroid/content/ServiceConnection;", "Landroid/content/ServiceConnection;", "getServiceConnection", "()Landroid/content/ServiceConnection;", "serviceConnection", "Ljava/lang/Runnable;", "k", "Ljava/lang/Runnable;", "()Ljava/lang/Runnable;", "setUpRunnable", "removeObserverRunnable", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class u {

    /* renamed from: a  reason: collision with root package name */
    private final String f44395a;

    /* renamed from: b  reason: collision with root package name */
    private final r f44396b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f44397c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f44398d;

    /* renamed from: e  reason: collision with root package name */
    private int f44399e;

    /* renamed from: f  reason: collision with root package name */
    public r.c f44400f;

    /* renamed from: g  reason: collision with root package name */
    private n f44401g;

    /* renamed from: h  reason: collision with root package name */
    private final m f44402h = new b(this);

    /* renamed from: i  reason: collision with root package name */
    private final AtomicBoolean f44403i = new AtomicBoolean(false);

    /* renamed from: j  reason: collision with root package name */
    private final ServiceConnection f44404j;

    /* renamed from: k  reason: collision with root package name */
    private final Runnable f44405k;

    /* renamed from: l  reason: collision with root package name */
    private final Runnable f44406l;

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8PX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"androidx/room/u$a", "Landroidx/room/r$c;", "", "", "tables", "LXH/N;", "c", "(Ljava/util/Set;)V", "", "b", "()Z", "isRemote", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends r.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f44407b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(u uVar, String[] strArr) {
            super(strArr);
            this.f44407b = uVar;
        }

        public boolean b() {
            return true;
        }

        public void c(Set<String> set) {
            C17542s.j(set, "tables");
            if (!this.f44407b.j().get()) {
                try {
                    n h10 = this.f44407b.h();
                    if (h10 != null) {
                        h10.m1(this.f44407b.c(), (String[]) set.toArray(new String[0]));
                    }
                } catch (RemoteException e10) {
                    Log.w("ROOM", "Cannot broadcast invalidation", e10);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/room/u$b", "Landroidx/room/m$a;", "", "", "tables", "LXH/N;", "Q", "([Ljava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends m.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f44408a;

        b(u uVar) {
            this.f44408a = uVar;
        }

        /* access modifiers changed from: private */
        public static final void K3(u uVar, String[] strArr) {
            C17542s.j(uVar, "this$0");
            C17542s.j(strArr, "$tables");
            uVar.e().m((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public void Q(String[] strArr) {
            C17542s.j(strArr, "tables");
            this.f44408a.d().execute(new v(this.f44408a, strArr));
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/room/u$c", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", "service", "LXH/N;", "onServiceConnected", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f44409a;

        c(u uVar) {
            this.f44409a = uVar;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C17542s.j(componentName, "name");
            C17542s.j(iBinder, "service");
            this.f44409a.m(n.a.I3(iBinder));
            this.f44409a.d().execute(this.f44409a.i());
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C17542s.j(componentName, "name");
            this.f44409a.d().execute(this.f44409a.g());
            this.f44409a.m((n) null);
        }
    }

    public u(Context context, String str, Intent intent, r rVar, Executor executor) {
        C17542s.j(context, "context");
        C17542s.j(str, "name");
        C17542s.j(intent, "serviceIntent");
        C17542s.j(rVar, "invalidationTracker");
        C17542s.j(executor, "executor");
        this.f44395a = str;
        this.f44396b = rVar;
        this.f44397c = executor;
        Context applicationContext = context.getApplicationContext();
        this.f44398d = applicationContext;
        c cVar = new c(this);
        this.f44404j = cVar;
        this.f44405k = new s(this);
        this.f44406l = new t(this);
        l(new a(this, (String[]) rVar.k().keySet().toArray(new String[0])));
        applicationContext.bindService(intent, cVar, 1);
    }

    /* access modifiers changed from: private */
    public static final void k(u uVar) {
        C17542s.j(uVar, "this$0");
        uVar.f44396b.p(uVar.f());
    }

    /* access modifiers changed from: private */
    public static final void n(u uVar) {
        C17542s.j(uVar, "this$0");
        try {
            n nVar = uVar.f44401g;
            if (nVar != null) {
                uVar.f44399e = nVar.f2(uVar.f44402h, uVar.f44395a);
                uVar.f44396b.c(uVar.f());
            }
        } catch (RemoteException e10) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e10);
        }
    }

    public final int c() {
        return this.f44399e;
    }

    public final Executor d() {
        return this.f44397c;
    }

    public final r e() {
        return this.f44396b;
    }

    public final r.c f() {
        r.c cVar = this.f44400f;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z("observer");
        return null;
    }

    public final Runnable g() {
        return this.f44406l;
    }

    public final n h() {
        return this.f44401g;
    }

    public final Runnable i() {
        return this.f44405k;
    }

    public final AtomicBoolean j() {
        return this.f44403i;
    }

    public final void l(r.c cVar) {
        C17542s.j(cVar, "<set-?>");
        this.f44400f = cVar;
    }

    public final void m(n nVar) {
        this.f44401g = nVar;
    }

    public final void o() {
        if (this.f44403i.compareAndSet(false, true)) {
            this.f44396b.p(f());
            try {
                n nVar = this.f44401g;
                if (nVar != null) {
                    nVar.C3(this.f44402h, this.f44399e);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e10);
            }
            this.f44398d.unbindService(this.f44404j);
        }
    }
}
