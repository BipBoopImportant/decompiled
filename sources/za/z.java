package Za;

import android.os.IBinder;

final class z extends t {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ IBinder f65059b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C9372C f65060c;

    z(C9372C c10, IBinder iBinder) {
        this.f65060c = c10;
        this.f65059b = iBinder;
    }

    public final void a() {
        this.f65060c.f65016a.f65030m = C9386k.J3(this.f65059b);
        C9373D.q(this.f65060c.f65016a);
        this.f65060c.f65016a.f65024g = false;
        for (Runnable run : this.f65060c.f65016a.f65021d) {
            run.run();
        }
        this.f65060c.f65016a.f65021d.clear();
    }
}
