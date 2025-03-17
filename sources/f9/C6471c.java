package F9;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import ba.C7084a;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import com.sugarcube.core.logger.DslKt;
import j0.b0;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import xa.C8971l;
import xa.C8972m;
import xa.C8974o;

/* renamed from: F9.c  reason: case insensitive filesystem */
public class C6471c {

    /* renamed from: h  reason: collision with root package name */
    private static int f35562h;

    /* renamed from: i  reason: collision with root package name */
    private static PendingIntent f35563i;

    /* renamed from: j  reason: collision with root package name */
    private static final Executor f35564j = G.f35556a;

    /* renamed from: k  reason: collision with root package name */
    private static final Pattern f35565k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: a  reason: collision with root package name */
    private final b0 f35566a = new b0();

    /* renamed from: b  reason: collision with root package name */
    private final Context f35567b;

    /* renamed from: c  reason: collision with root package name */
    private final E f35568c;

    /* renamed from: d  reason: collision with root package name */
    private final ScheduledExecutorService f35569d;

    /* renamed from: e  reason: collision with root package name */
    private final Messenger f35570e;

    /* renamed from: f  reason: collision with root package name */
    private Messenger f35571f;

    /* renamed from: g  reason: collision with root package name */
    private l f35572g;

    public C6471c(Context context) {
        this.f35567b = context;
        this.f35568c = new E(context);
        this.f35570e = new Messenger(new i(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f35569d = scheduledThreadPoolExecutor;
    }

    static /* synthetic */ C8971l e(Bundle bundle) {
        return m(bundle) ? C8974o.f(null) : C8974o.f(bundle);
    }

    static /* bridge */ /* synthetic */ void g(C6471c cVar, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new k());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof l) {
                        cVar.f35572g = (l) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        cVar.f35571f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra(UiComponentContainer.RESULT_ERROR);
                        if (stringExtra2 == null) {
                            Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                            return;
                        }
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                        }
                        if (stringExtra2.startsWith(DslKt.INDICATOR_SEPARATOR)) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length <= 2 || !Objects.equals(split[1], "ID")) {
                                Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                                return;
                            }
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                            cVar.l(str, intent2.putExtra(UiComponentContainer.RESULT_ERROR, str2).getExtras());
                            return;
                        }
                        synchronized (cVar.f35566a) {
                            int i10 = 0;
                            while (i10 < cVar.f35566a.size()) {
                                try {
                                    cVar.l((String) cVar.f35566a.h(i10), intent2.getExtras());
                                    i10++;
                                } finally {
                                }
                            }
                        }
                        return;
                    }
                    Matcher matcher = f35565k.matcher(stringExtra);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        if (group != null) {
                            Bundle extras = intent2.getExtras();
                            extras.putString("registration_id", group2);
                            cVar.l(group, extras);
                            return;
                        }
                        return;
                    } else if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                        return;
                    } else {
                        return;
                    }
                } else if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                    return;
                } else {
                    return;
                }
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    private final C8971l i(Bundle bundle) {
        String j10 = j();
        C8972m mVar = new C8972m();
        synchronized (this.f35566a) {
            this.f35566a.put(j10, mVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f35568c.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        k(this.f35567b, intent);
        intent.putExtra("kid", "|ID|" + j10 + DslKt.INDICATOR_SEPARATOR);
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f35570e);
        if (!(this.f35571f == null && this.f35572g == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f35571f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f35572g.b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            mVar.a().b(f35564j, new C6476h(this, j10, this.f35569d.schedule(new C6475g(mVar), 30, TimeUnit.SECONDS)));
            return mVar.a();
        }
        if (this.f35568c.b() == 2) {
            this.f35567b.sendBroadcast(intent);
        } else {
            this.f35567b.startService(intent);
        }
        mVar.a().b(f35564j, new C6476h(this, j10, this.f35569d.schedule(new C6475g(mVar), 30, TimeUnit.SECONDS)));
        return mVar.a();
    }

    private static synchronized String j() {
        String num;
        synchronized (C6471c.class) {
            int i10 = f35562h;
            f35562h = i10 + 1;
            num = Integer.toString(i10);
        }
        return num;
    }

    private static synchronized void k(Context context, Intent intent) {
        synchronized (C6471c.class) {
            try {
                if (f35563i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f35563i = PendingIntent.getBroadcast(context, 0, intent2, C7084a.f45645a);
                }
                intent.putExtra("app", f35563i);
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    private final void l(String str, Bundle bundle) {
        synchronized (this.f35566a) {
            try {
                C8972m mVar = (C8972m) this.f35566a.remove(str);
                if (mVar == null) {
                    Log.w("Rpc", "Missing callback for " + str);
                    return;
                }
                mVar.c(bundle);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean m(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    public C8971l<C6469a> a() {
        return this.f35568c.a() >= 241100000 ? D.b(this.f35567b).d(5, Bundle.EMPTY).h(f35564j, C6474f.f35574a) : C8974o.e(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    public C8971l<Void> b(C6469a aVar) {
        if (this.f35568c.a() < 233700000) {
            return C8974o.e(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putString("google.message_id", aVar.B());
        Integer F10 = aVar.F();
        if (F10 != null) {
            bundle.putInt("google.product_id", F10.intValue());
        }
        return D.b(this.f35567b).c(3, bundle);
    }

    public C8971l<Bundle> c(Bundle bundle) {
        return this.f35568c.a() < 12000000 ? this.f35568c.b() != 0 ? i(bundle).j(f35564j, new H(this, bundle)) : C8974o.e(new IOException("MISSING_INSTANCEID_SERVICE")) : D.b(this.f35567b).d(1, bundle).h(f35564j, C6473e.f35573a);
    }

    public C8971l<Void> d(boolean z10) {
        if (this.f35568c.a() < 241100000) {
            return C8974o.e(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("proxy_retention", z10);
        return D.b(this.f35567b).c(4, bundle);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C8971l f(Bundle bundle, C8971l lVar) {
        return (lVar.q() && m((Bundle) lVar.m())) ? i(bundle).r(f35564j, F.f35555a) : lVar;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h(String str, ScheduledFuture scheduledFuture, C8971l lVar) {
        synchronized (this.f35566a) {
            this.f35566a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
