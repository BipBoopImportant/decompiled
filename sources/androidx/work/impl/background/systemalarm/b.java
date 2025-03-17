package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.C7033b;
import androidx.work.C7055y;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l5.C8510f;
import l5.C8528y;
import l5.z;
import s5.C8731m;
import s5.C8739u;

public class b implements C8510f {

    /* renamed from: f  reason: collision with root package name */
    private static final String f45224f = C7055y.i("CommandHandler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f45225a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<C8731m, f> f45226b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Object f45227c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final C7033b f45228d;

    /* renamed from: e  reason: collision with root package name */
    private final z f45229e;

    b(Context context, C7033b bVar, z zVar) {
        this.f45225a = context;
        this.f45228d = bVar;
        this.f45229e = zVar;
    }

    static Intent a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static Intent c(Context context, C8731m mVar) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        return q(intent, mVar);
    }

    static Intent d(Context context, C8731m mVar, boolean z10) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        return q(intent, mVar);
    }

    static Intent e(Context context, C8731m mVar) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        return q(intent, mVar);
    }

    static Intent f(Context context, C8731m mVar) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        return q(intent, mVar);
    }

    private void g(Intent intent, int i10, g gVar) {
        C7055y e10 = C7055y.e();
        String str = f45224f;
        e10.a(str, "Handling constraints changed " + intent);
        new c(this.f45225a, this.f45228d, i10, gVar).a();
    }

    private void h(Intent intent, int i10, g gVar) {
        synchronized (this.f45227c) {
            try {
                C8731m p10 = p(intent);
                C7055y e10 = C7055y.e();
                String str = f45224f;
                e10.a(str, "Handing delay met for " + p10);
                if (!this.f45226b.containsKey(p10)) {
                    f fVar = new f(this.f45225a, i10, gVar, this.f45229e.d(p10));
                    this.f45226b.put(p10, fVar);
                    fVar.f();
                } else {
                    C7055y e11 = C7055y.e();
                    e11.a(str, "WorkSpec " + p10 + " is is already being handled for ACTION_DELAY_MET");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void i(Intent intent, int i10) {
        C8731m p10 = p(intent);
        boolean z10 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
        C7055y e10 = C7055y.e();
        String str = f45224f;
        e10.a(str, "Handling onExecutionCompleted " + intent + ", " + i10);
        b(p10, z10);
    }

    private void j(Intent intent, int i10, g gVar) {
        C7055y e10 = C7055y.e();
        String str = f45224f;
        e10.a(str, "Handling reschedule " + intent + ", " + i10);
        gVar.g().A();
    }

    private void k(Intent intent, int i10, g gVar) {
        C8731m p10 = p(intent);
        C7055y e10 = C7055y.e();
        String str = f45224f;
        e10.a(str, "Handling schedule work for " + p10);
        WorkDatabase w10 = gVar.g().w();
        w10.beginTransaction();
        try {
            C8739u i11 = w10.f().i(p10.b());
            if (i11 == null) {
                C7055y e11 = C7055y.e();
                e11.k(str, "Skipping scheduling " + p10 + " because it's no longer in the DB");
            } else if (i11.f55911b.b()) {
                C7055y e12 = C7055y.e();
                e12.k(str, "Skipping scheduling " + p10 + "because it is finished.");
                w10.endTransaction();
            } else {
                long c10 = i11.c();
                if (!i11.l()) {
                    C7055y e13 = C7055y.e();
                    e13.a(str, "Setting up Alarms for " + p10 + "at " + c10);
                    a.c(this.f45225a, w10, p10, c10);
                } else {
                    C7055y e14 = C7055y.e();
                    e14.a(str, "Opportunistically setting an alarm for " + p10 + "at " + c10);
                    a.c(this.f45225a, w10, p10, c10);
                    gVar.f().a().execute(new g.b(gVar, a(this.f45225a), i10));
                }
                w10.setTransactionSuccessful();
                w10.endTransaction();
            }
        } finally {
            w10.endTransaction();
        }
    }

    private void l(Intent intent, g gVar) {
        List<C8528y> list;
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        if (extras.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i10 = extras.getInt("KEY_WORKSPEC_GENERATION");
            list = new ArrayList<>(1);
            C8528y f10 = this.f45229e.f(new C8731m(string, i10));
            if (f10 != null) {
                list.add(f10);
            }
        } else {
            list = this.f45229e.remove(string);
        }
        for (C8528y yVar : list) {
            C7055y e10 = C7055y.e();
            String str = f45224f;
            e10.a(str, "Handing stopWork work for " + string);
            gVar.i().b(yVar);
            a.a(this.f45225a, gVar.g().w(), yVar.a());
            gVar.b(yVar.a(), false);
        }
    }

    private static boolean m(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    static C8731m p(Intent intent) {
        return new C8731m(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    private static Intent q(Intent intent, C8731m mVar) {
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_WORKSPEC_GENERATION", mVar.a());
        return intent;
    }

    public void b(C8731m mVar, boolean z10) {
        synchronized (this.f45227c) {
            try {
                f remove = this.f45226b.remove(mVar);
                this.f45229e.f(mVar);
                if (remove != null) {
                    remove.g(z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        boolean z10;
        synchronized (this.f45227c) {
            z10 = !this.f45226b.isEmpty();
        }
        return z10;
    }

    /* access modifiers changed from: package-private */
    public void o(Intent intent, int i10, g gVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            g(intent, i10, gVar);
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            j(intent, i10, gVar);
        } else if (!m(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            C7055y e10 = C7055y.e();
            String str = f45224f;
            e10.c(str, "Invalid request for " + action + " , requires " + "KEY_WORKSPEC_ID" + " .");
        } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
            k(intent, i10, gVar);
        } else if ("ACTION_DELAY_MET".equals(action)) {
            h(intent, i10, gVar);
        } else if ("ACTION_STOP_WORK".equals(action)) {
            l(intent, gVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            i(intent, i10);
        } else {
            C7055y e11 = C7055y.e();
            String str2 = f45224f;
            e11.k(str2, "Ignoring intent " + intent);
        }
    }
}
