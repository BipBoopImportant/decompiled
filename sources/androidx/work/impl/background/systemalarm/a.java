package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.C7055y;
import androidx.work.impl.WorkDatabase;
import s5.C8727i;
import s5.C8728j;
import s5.C8730l;
import s5.C8731m;
import t5.C8820o;

class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f45223a = C7055y.i("Alarms");

    public static void a(Context context, WorkDatabase workDatabase, C8731m mVar) {
        C8728j c10 = workDatabase.c();
        C8727i a10 = c10.a(mVar);
        if (a10 != null) {
            b(context, mVar, a10.f55883c);
            C7055y e10 = C7055y.e();
            String str = f45223a;
            e10.a(str, "Removing SystemIdInfo for workSpecId (" + mVar + ")");
            c10.c(mVar);
        }
    }

    private static void b(Context context, C8731m mVar, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, b.c(context, mVar), 603979776);
        if (service != null && alarmManager != null) {
            C7055y e10 = C7055y.e();
            String str = f45223a;
            e10.a(str, "Cancelling existing alarm with (workSpecId, systemId) (" + mVar + ", " + i10 + ")");
            alarmManager.cancel(service);
        }
    }

    public static void c(Context context, WorkDatabase workDatabase, C8731m mVar, long j10) {
        C8728j c10 = workDatabase.c();
        C8727i a10 = c10.a(mVar);
        if (a10 != null) {
            b(context, mVar, a10.f55883c);
            d(context, mVar, a10.f55883c, j10);
            return;
        }
        int c11 = new C8820o(workDatabase).c();
        c10.b(C8730l.a(mVar, c11));
        d(context, mVar, c11, j10);
    }

    private static void d(Context context, C8731m mVar, int i10, long j10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, b.c(context, mVar), 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, j10, service);
        }
    }
}
