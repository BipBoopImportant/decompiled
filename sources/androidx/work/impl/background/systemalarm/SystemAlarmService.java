package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.D;
import androidx.work.C7055y;
import androidx.work.impl.background.systemalarm.g;
import t5.C8797H;

public class SystemAlarmService extends D implements g.c {

    /* renamed from: d  reason: collision with root package name */
    private static final String f45220d = C7055y.i("SystemAlarmService");

    /* renamed from: b  reason: collision with root package name */
    private g f45221b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f45222c;

    private void e() {
        g gVar = new g(this);
        this.f45221b = gVar;
        gVar.m(this);
    }

    public void b() {
        this.f45222c = true;
        C7055y.e().a(f45220d, "All commands completed in dispatcher");
        C8797H.a();
        stopSelf();
    }

    public void onCreate() {
        super.onCreate();
        e();
        this.f45222c = false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f45222c = true;
        this.f45221b.k();
    }

    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f45222c) {
            C7055y.e().f(f45220d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.f45221b.k();
            e();
            this.f45222c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f45221b.a(intent, i11);
        return 3;
    }
}
