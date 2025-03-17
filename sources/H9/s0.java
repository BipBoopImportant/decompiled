package H9;

import android.app.Dialog;

final class s0 extends O {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Dialog f36634a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ t0 f36635b;

    s0(t0 t0Var, Dialog dialog) {
        this.f36635b = t0Var;
        this.f36634a = dialog;
    }

    public final void a() {
        this.f36635b.f36644b.o();
        if (this.f36634a.isShowing()) {
            this.f36634a.dismiss();
        }
    }
}
