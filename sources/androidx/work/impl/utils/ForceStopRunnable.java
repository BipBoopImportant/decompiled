package androidx.work.impl.utils;

import D2.q;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.C7034c;
import androidx.work.C7055y;
import androidx.work.Q;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.a;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l5.C8504I;
import l5.O;
import n5.C8580k;
import s5.C8736r;
import s5.C8739u;
import s5.v;
import t5.C8792C;
import t5.C8793D;
import t5.C8815j;

public class ForceStopRunnable implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    private static final String f45297e = C7055y.i("ForceStopRunnable");

    /* renamed from: f  reason: collision with root package name */
    private static final long f45298f = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a  reason: collision with root package name */
    private final Context f45299a;

    /* renamed from: b  reason: collision with root package name */
    private final O f45300b;

    /* renamed from: c  reason: collision with root package name */
    private final C8792C f45301c;

    /* renamed from: d  reason: collision with root package name */
    private int f45302d = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private static final String f45303a = C7055y.i("ForceStopRunnable$Rcvr");

        public void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                C7055y.e().j(f45303a, "Rescheduling alarm that keeps track of force-stops.");
                ForceStopRunnable.g(context);
            }
        }
    }

    public ForceStopRunnable(Context context, O o10) {
        this.f45299a = context.getApplicationContext();
        this.f45300b = o10;
        this.f45301c = o10.s();
    }

    static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static PendingIntent d(Context context, int i10) {
        return PendingIntent.getBroadcast(context, -1, c(context), i10);
    }

    @SuppressLint({"ClassVerificationFailure"})
    static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent d10 = d(context, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f45298f;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, d10);
        }
    }

    public boolean a() {
        boolean i10 = C8580k.i(this.f45299a, this.f45300b.w());
        WorkDatabase w10 = this.f45300b.w();
        v f10 = w10.f();
        C8736r e10 = w10.e();
        w10.beginTransaction();
        try {
            List<C8739u> y10 = f10.y();
            boolean z10 = y10 != null && !y10.isEmpty();
            if (z10) {
                for (C8739u next : y10) {
                    f10.v(Q.c.ENQUEUED, next.f55910a);
                    f10.d(next.f55910a, -512);
                    f10.r(next.f55910a, -1);
                }
            }
            e10.c();
            w10.setTransactionSuccessful();
            w10.endTransaction();
            return z10 || i10;
        } catch (Throwable th2) {
            w10.endTransaction();
            throw th2;
        }
    }

    public void b() {
        boolean a10 = a();
        if (h()) {
            C7055y.e().a(f45297e, "Rescheduling Workers.");
            this.f45300b.A();
            this.f45300b.s().e(false);
        } else if (e()) {
            C7055y.e().a(f45297e, "Application was force-stopped, rescheduling.");
            this.f45300b.A();
            this.f45301c.d(this.f45300b.p().a().a());
        } else if (a10) {
            C7055y.e().a(f45297e, "Found unfinished work, scheduling it.");
            a.h(this.f45300b.p(), this.f45300b.w(), this.f45300b.u());
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    public boolean e() {
        try {
            int i10 = Build.VERSION.SDK_INT;
            PendingIntent d10 = d(this.f45299a, i10 >= 31 ? 570425344 : 536870912);
            if (i10 >= 30) {
                if (d10 != null) {
                    d10.cancel();
                }
                List a10 = ((ActivityManager) this.f45299a.getSystemService("activity")).getHistoricalProcessExitReasons((String) null, 0, 0);
                if (a10 != null && !a10.isEmpty()) {
                    long a11 = this.f45301c.a();
                    for (int i11 = 0; i11 < a10.size(); i11++) {
                        ApplicationExitInfo a12 = C8815j.a(a10.get(i11));
                        if (a12.getReason() == 10 && a12.getTimestamp() >= a11) {
                            return true;
                        }
                    }
                }
            } else if (d10 == null) {
                g(this.f45299a);
                return true;
            }
            return false;
        } catch (SecurityException e10) {
            e = e10;
            C7055y.e().l(f45297e, "Ignoring exception", e);
            return true;
        } catch (IllegalArgumentException e11) {
            e = e11;
            C7055y.e().l(f45297e, "Ignoring exception", e);
            return true;
        }
    }

    public boolean f() {
        C7034c p10 = this.f45300b.p();
        if (TextUtils.isEmpty(p10.c())) {
            C7055y.e().a(f45297e, "The default process name was not specified.");
            return true;
        }
        boolean b10 = C8793D.b(this.f45299a, p10);
        C7055y e10 = C7055y.e();
        String str = f45297e;
        e10.a(str, "Is default app process = " + b10);
        return b10;
    }

    public boolean h() {
        return this.f45300b.s().b();
    }

    public void i(long j10) {
        try {
            Thread.sleep(j10);
        } catch (InterruptedException unused) {
        }
    }

    public void run() {
        try {
            if (!f()) {
                this.f45300b.z();
                return;
            }
            while (true) {
                C8504I.d(this.f45299a);
                C7055y.e().a(f45297e, "Performing cleanup operations.");
                b();
                break;
            }
            this.f45300b.z();
        } catch (SQLiteException e10) {
            C7055y.e().c(f45297e, "Unexpected SQLite exception during migrations");
            IllegalStateException illegalStateException = new IllegalStateException("Unexpected SQLite exception during migrations", e10);
            H2.a<Throwable> e11 = this.f45300b.p().e();
            if (e11 != null) {
                e11.accept(illegalStateException);
            } else {
                throw illegalStateException;
            }
        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e12) {
            int i10 = this.f45302d + 1;
            this.f45302d = i10;
            if (i10 >= 3) {
                String str = q.a(this.f45299a) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                C7055y e13 = C7055y.e();
                String str2 = f45297e;
                e13.d(str2, str, e12);
                IllegalStateException illegalStateException2 = new IllegalStateException(str, e12);
                H2.a<Throwable> e14 = this.f45300b.p().e();
                if (e14 != null) {
                    C7055y.e().b(str2, "Routing exception to the specified exception handler", illegalStateException2);
                    e14.accept(illegalStateException2);
                } else {
                    throw illegalStateException2;
                }
            } else {
                C7055y e15 = C7055y.e();
                String str3 = f45297e;
                e15.b(str3, "Retrying after " + (((long) i10) * 300), e12);
                i(((long) this.f45302d) * 300);
            }
        } catch (Throwable th2) {
            this.f45300b.z();
            throw th2;
        }
    }
}
