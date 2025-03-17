package Za;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import db.C9614a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    protected final s f65044a;

    /* renamed from: b  reason: collision with root package name */
    private final IntentFilter f65045b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f65046c;

    /* renamed from: d  reason: collision with root package name */
    protected final Set f65047d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    private q f65048e = null;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f65049f = false;

    protected r(s sVar, IntentFilter intentFilter, Context context) {
        this.f65044a = sVar;
        this.f65045b = intentFilter;
        this.f65046c = C9375F.a(context);
    }

    private final void e() {
        q qVar;
        if (!this.f65047d.isEmpty() && this.f65048e == null) {
            q qVar2 = new q(this, (C9391p) null);
            this.f65048e = qVar2;
            if (Build.VERSION.SDK_INT >= 33) {
                this.f65046c.registerReceiver(qVar2, this.f65045b, 2);
            } else {
                this.f65046c.registerReceiver(qVar2, this.f65045b);
            }
        }
        if (this.f65047d.isEmpty() && (qVar = this.f65048e) != null) {
            this.f65046c.unregisterReceiver(qVar);
            this.f65048e = null;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(Context context, Intent intent);

    public final synchronized void b(C9614a aVar) {
        this.f65044a.d("registerListener", new Object[0]);
        C9379d.a(aVar, "Registered Play Core listener should not be null.");
        this.f65047d.add(aVar);
        e();
    }

    public final synchronized void c(C9614a aVar) {
        this.f65044a.d("unregisterListener", new Object[0]);
        C9379d.a(aVar, "Unregistered Play Core listener should not be null.");
        this.f65047d.remove(aVar);
        e();
    }

    public final synchronized void d(Object obj) {
        Iterator it = new HashSet(this.f65047d).iterator();
        while (it.hasNext()) {
            ((C9614a) it.next()).a(obj);
        }
    }
}
