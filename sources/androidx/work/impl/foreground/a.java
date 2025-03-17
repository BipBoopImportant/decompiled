package androidx.work.impl.foreground;

import QJ.F0;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.C7043l;
import androidx.work.C7055y;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import l5.C8510f;
import l5.O;
import o5.C8601b;
import o5.C8604e;
import o5.C8605f;
import o5.C8606g;
import s5.C8731m;
import s5.C8739u;
import s5.z;
import u5.C8878b;

public class a implements C8604e, C8510f {

    /* renamed from: k  reason: collision with root package name */
    static final String f45282k = C7055y.i("SystemFgDispatcher");

    /* renamed from: a  reason: collision with root package name */
    private Context f45283a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public O f45284b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C8878b f45285c;

    /* renamed from: d  reason: collision with root package name */
    final Object f45286d = new Object();

    /* renamed from: e  reason: collision with root package name */
    C8731m f45287e;

    /* renamed from: f  reason: collision with root package name */
    final Map<C8731m, C7043l> f45288f;

    /* renamed from: g  reason: collision with root package name */
    final Map<C8731m, C8739u> f45289g;

    /* renamed from: h  reason: collision with root package name */
    final Map<C8731m, F0> f45290h;

    /* renamed from: i  reason: collision with root package name */
    final C8605f f45291i;

    /* renamed from: j  reason: collision with root package name */
    private b f45292j;

    /* renamed from: androidx.work.impl.foreground.a$a  reason: collision with other inner class name */
    class C0778a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f45293a;

        C0778a(String str) {
            this.f45293a = str;
        }

        public void run() {
            C8739u g10 = a.this.f45284b.t().g(this.f45293a);
            if (g10 != null && g10.l()) {
                synchronized (a.this.f45286d) {
                    a.this.f45289g.put(z.a(g10), g10);
                    a aVar = a.this;
                    a.this.f45290h.put(z.a(g10), C8606g.d(aVar.f45291i, g10, aVar.f45285c.b(), a.this));
                }
            }
        }
    }

    interface b {
        void a(int i10, Notification notification);

        void c(int i10, int i11, Notification notification);

        void d(int i10);

        void stop();
    }

    a(Context context) {
        this.f45283a = context;
        O r10 = O.r(context);
        this.f45284b = r10;
        this.f45285c = r10.x();
        this.f45287e = null;
        this.f45288f = new LinkedHashMap();
        this.f45290h = new HashMap();
        this.f45289g = new HashMap();
        this.f45291i = new C8605f(this.f45284b.v());
        this.f45284b.t().e(this);
    }

    public static Intent e(Context context, C8731m mVar, C7043l lVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", lVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", lVar.a());
        intent.putExtra("KEY_NOTIFICATION", lVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_GENERATION", mVar.a());
        return intent;
    }

    public static Intent f(Context context, C8731m mVar, C7043l lVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_GENERATION", mVar.a());
        intent.putExtra("KEY_NOTIFICATION_ID", lVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", lVar.a());
        intent.putExtra("KEY_NOTIFICATION", lVar.b());
        return intent;
    }

    public static Intent g(Context context) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    private void h(Intent intent) {
        C7055y e10 = C7055y.e();
        String str = f45282k;
        e10.f(str, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
            this.f45284b.c(UUID.fromString(stringExtra));
        }
    }

    private void i(Intent intent) {
        if (this.f45292j != null) {
            int i10 = 0;
            int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
            int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            C8731m mVar = new C8731m(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
            Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
            C7055y e10 = C7055y.e();
            String str = f45282k;
            e10.a(str, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
            if (notification != null) {
                C7043l lVar = new C7043l(intExtra, notification, intExtra2);
                this.f45288f.put(mVar, lVar);
                C7043l lVar2 = this.f45288f.get(this.f45287e);
                if (lVar2 == null) {
                    this.f45287e = mVar;
                } else {
                    this.f45292j.a(intExtra, notification);
                    if (Build.VERSION.SDK_INT >= 29) {
                        for (Map.Entry<C8731m, C7043l> value : this.f45288f.entrySet()) {
                            i10 |= ((C7043l) value.getValue()).a();
                        }
                        lVar = new C7043l(lVar2.c(), lVar2.b(), i10);
                    } else {
                        lVar = lVar2;
                    }
                }
                this.f45292j.c(lVar.c(), lVar.a(), lVar.b());
                return;
            }
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
    }

    private void j(Intent intent) {
        C7055y e10 = C7055y.e();
        String str = f45282k;
        e10.f(str, "Started foreground service " + intent);
        this.f45285c.d(new C0778a(intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    public void b(C8731m mVar, boolean z10) {
        Map.Entry entry;
        synchronized (this.f45286d) {
            try {
                F0 remove = this.f45289g.remove(mVar) != null ? this.f45290h.remove(mVar) : null;
                if (remove != null) {
                    remove.i((CancellationException) null);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        C7043l remove2 = this.f45288f.remove(mVar);
        if (mVar.equals(this.f45287e)) {
            if (this.f45288f.size() > 0) {
                Iterator it = this.f45288f.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    }
                    next = it.next();
                }
                this.f45287e = (C8731m) entry.getKey();
                if (this.f45292j != null) {
                    C7043l lVar = (C7043l) entry.getValue();
                    this.f45292j.c(lVar.c(), lVar.a(), lVar.b());
                    this.f45292j.d(lVar.c());
                }
            } else {
                this.f45287e = null;
            }
        }
        b bVar = this.f45292j;
        if (remove2 != null && bVar != null) {
            C7055y e10 = C7055y.e();
            String str = f45282k;
            e10.a(str, "Removing Notification (id: " + remove2.c() + ", workSpecId: " + mVar + ", notificationType: " + remove2.a());
            bVar.d(remove2.c());
        }
    }

    public void d(C8739u uVar, C8601b bVar) {
        if (bVar instanceof C8601b.C0881b) {
            String str = uVar.f55910a;
            C7055y e10 = C7055y.e();
            String str2 = f45282k;
            e10.a(str2, "Constraints unmet for WorkSpec " + str);
            this.f45284b.C(z.a(uVar), ((C8601b.C0881b) bVar).a());
        }
    }

    /* access modifiers changed from: package-private */
    public void k(Intent intent) {
        C7055y.e().f(f45282k, "Stopping foreground service");
        b bVar = this.f45292j;
        if (bVar != null) {
            bVar.stop();
        }
    }

    /* access modifiers changed from: package-private */
    public void l() {
        this.f45292j = null;
        synchronized (this.f45286d) {
            try {
                for (F0 i10 : this.f45290h.values()) {
                    i10.i((CancellationException) null);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        this.f45284b.t().p(this);
    }

    /* access modifiers changed from: package-private */
    public void m(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            j(intent);
            i(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            i(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            h(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            k(intent);
        }
    }

    /* access modifiers changed from: package-private */
    public void n(int i10, int i11) {
        C7055y e10 = C7055y.e();
        String str = f45282k;
        e10.f(str, "Foreground service timed out, FGS type: " + i11);
        for (Map.Entry next : this.f45288f.entrySet()) {
            if (((C7043l) next.getValue()).a() == i11) {
                this.f45284b.C((C8731m) next.getKey(), -128);
            }
        }
        b bVar = this.f45292j;
        if (bVar != null) {
            bVar.stop();
        }
    }

    /* access modifiers changed from: package-private */
    public void o(b bVar) {
        if (this.f45292j != null) {
            C7055y.e().c(f45282k, "A callback already exists.");
        } else {
            this.f45292j = bVar;
        }
    }
}
