package H9;

import K9.C6620s;
import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

final class t0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final r0 f36643a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ u0 f36644b;

    t0(u0 u0Var, r0 r0Var) {
        this.f36644b = u0Var;
        this.f36643a = r0Var;
    }

    public final void run() {
        if (this.f36644b.f36645b) {
            ConnectionResult b10 = this.f36643a.b();
            if (b10.J()) {
                u0 u0Var = this.f36644b;
                u0Var.f36579a.startActivityForResult(GoogleApiActivity.a(u0Var.b(), (PendingIntent) C6620s.l(b10.F()), this.f36643a.a(), false), 1);
                return;
            }
            u0 u0Var2 = this.f36644b;
            if (u0Var2.f36648e.b(u0Var2.b(), b10.x(), (String) null) != null) {
                u0 u0Var3 = this.f36644b;
                u0Var3.f36648e.w(u0Var3.b(), u0Var3.f36579a, b10.x(), 2, this.f36644b);
            } else if (b10.x() == 18) {
                u0 u0Var4 = this.f36644b;
                Dialog r10 = u0Var4.f36648e.r(u0Var4.b(), u0Var4);
                u0 u0Var5 = this.f36644b;
                u0Var5.f36648e.s(u0Var5.b().getApplicationContext(), new s0(this, r10));
            } else {
                this.f36644b.l(b10, this.f36643a.a());
            }
        }
    }
}
