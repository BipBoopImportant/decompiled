package H9;

import aa.j;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.a;
import d0.i;
import java.util.concurrent.atomic.AtomicReference;

public abstract class u0 extends C6534h implements DialogInterface.OnCancelListener {

    /* renamed from: b  reason: collision with root package name */
    protected volatile boolean f36645b;

    /* renamed from: c  reason: collision with root package name */
    protected final AtomicReference f36646c = new AtomicReference((Object) null);

    /* renamed from: d  reason: collision with root package name */
    private final Handler f36647d = new j(Looper.getMainLooper());

    /* renamed from: e  reason: collision with root package name */
    protected final a f36648e;

    u0(C6535i iVar, a aVar) {
        super(iVar);
        this.f36648e = aVar;
    }

    /* access modifiers changed from: private */
    public final void l(ConnectionResult connectionResult, int i10) {
        this.f36646c.set((Object) null);
        m(connectionResult, i10);
    }

    /* access modifiers changed from: private */
    public final void o() {
        this.f36646c.set((Object) null);
        n();
    }

    private static final int p(r0 r0Var) {
        if (r0Var == null) {
            return -1;
        }
        return r0Var.a();
    }

    public final void e(int i10, int i11, Intent intent) {
        r0 r0Var = (r0) this.f36646c.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int g10 = this.f36648e.g(b());
                if (g10 == 0) {
                    o();
                    return;
                } else if (r0Var == null) {
                    return;
                } else {
                    if (r0Var.b().x() == 18 && g10 == 18) {
                        return;
                    }
                }
            }
        } else if (i11 == -1) {
            o();
            return;
        } else if (i11 == 0) {
            if (r0Var != null) {
                int i12 = 13;
                if (intent != null) {
                    i12 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                l(new ConnectionResult(i12, (PendingIntent) null, r0Var.b().toString()), p(r0Var));
                return;
            }
            return;
        }
        if (r0Var != null) {
            l(r0Var.b(), r0Var.a());
        }
    }

    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.f36646c.set(bundle.getBoolean("resolving_error", false) ? new r0(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    public final void i(Bundle bundle) {
        super.i(bundle);
        r0 r0Var = (r0) this.f36646c.get();
        if (r0Var != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", r0Var.a());
            bundle.putInt("failed_status", r0Var.b().x());
            bundle.putParcelable("failed_resolution", r0Var.b().F());
        }
    }

    public void j() {
        super.j();
        this.f36645b = true;
    }

    public void k() {
        super.k();
        this.f36645b = false;
    }

    /* access modifiers changed from: protected */
    public abstract void m(ConnectionResult connectionResult, int i10);

    /* access modifiers changed from: protected */
    public abstract void n();

    public final void onCancel(DialogInterface dialogInterface) {
        l(new ConnectionResult(13, (PendingIntent) null), p((r0) this.f36646c.get()));
    }

    public final void s(ConnectionResult connectionResult, int i10) {
        AtomicReference atomicReference;
        r0 r0Var = new r0(connectionResult, i10);
        do {
            atomicReference = this.f36646c;
            if (i.a(atomicReference, (Object) null, r0Var)) {
                this.f36647d.post(new t0(this, r0Var));
                return;
            }
        } while (atomicReference.get() == null);
    }
}
