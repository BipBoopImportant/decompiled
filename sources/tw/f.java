package tw;

import HJ.C15854t;
import XH.C16814e;
import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.lifecycle.F;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Ltw/f;", "Landroidx/lifecycle/F;", "", "<init>", "()V", "LXH/N;", "onActive", "onInactive", "Landroid/content/BroadcastReceiver;", "c", "Landroid/content/BroadcastReceiver;", "networkReceiver", "d", "a", "networkservice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public final class f extends F<Boolean> {

    /* renamed from: d  reason: collision with root package name */
    public static final a f56772d = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: e  reason: collision with root package name */
    public static f f56773e;
    /* access modifiers changed from: private */
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: f  reason: collision with root package name */
    public static Context f56774f;

    /* renamed from: c  reason: collision with root package name */
    private final BroadcastReceiver f56775c;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Ltw/f$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "c", "(Landroid/content/Context;)Z", "Ltw/f;", "b", "(Landroid/content/Context;)Ltw/f;", "instance", "Ltw/f;", "Landroid/content/Context;", "networkservice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final boolean c(Context context) {
            if (context == null) {
                return false;
            }
            Object systemService = context.getApplicationContext().getSystemService("connectivity");
            C17542s.h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
        }

        public final f b(Context context) {
            C17542s.j(context, "context");
            if (f.f56774f == null) {
                f.f56774f = context.getApplicationContext();
            }
            if (f.f56773e == null) {
                f.f56773e = new f((DefaultConstructorMarker) null);
            }
            f c10 = f.f56773e;
            if (c10 != null) {
                return c10;
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"tw/f$b", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "LXH/N;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "networkservice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f56776a;

        b(f fVar) {
            this.f56776a = fVar;
        }

        public void onReceive(Context context, Intent intent) {
            C17542s.j(context, "context");
            C17542s.j(intent, "intent");
            if (C17542s.e("android.net.conn.CONNECTIVITY_CHANGE", intent.getAction())) {
                boolean a10 = f.f56772d.c(context);
                e eVar = e.DEBUG;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a11 = C11818a.a("Network status isConnectionAvailable: " + a10, (Throwable) null);
                        if (a11 == null) {
                            break;
                        }
                        str = C11820c.a(a11);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = b.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, false, (Throwable) null, str3);
                    str = str3;
                    str2 = str4;
                }
                this.f56776a.setValue(Boolean.valueOf(a10));
            }
        }
    }

    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* access modifiers changed from: protected */
    public void onActive() {
        Context context = f56774f;
        if (context != null) {
            context.registerReceiver(this.f56775c, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        postValue(Boolean.valueOf(f56772d.c(f56774f)));
    }

    /* access modifiers changed from: protected */
    public void onInactive() {
        Context context = f56774f;
        if (context != null) {
            context.unregisterReceiver(this.f56775c);
        }
    }

    private f() {
        this.f56775c = new b(this);
    }
}
