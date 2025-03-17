package fb;

import android.os.IBinder;

final class p extends C9694j {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ IBinder f72947b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r f72948c;

    p(r rVar, IBinder iBinder) {
        this.f72947b = iBinder;
        this.f72948c = rVar;
    }

    public final void a() {
        this.f72948c.f72950a.f72964m = C9689e.J3(this.f72947b);
        t.q(this.f72948c.f72950a);
        this.f72948c.f72950a.f72958g = false;
        for (Runnable run : this.f72948c.f72950a.f72955d) {
            run.run();
        }
        this.f72948c.f72950a.f72955d.clear();
    }
}
