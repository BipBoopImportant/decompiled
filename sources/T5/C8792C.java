package t5;

import Q4.g;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import s5.C8722d;

/* renamed from: t5.C  reason: case insensitive filesystem */
public class C8792C {

    /* renamed from: a  reason: collision with root package name */
    private final WorkDatabase f56559a;

    public C8792C(WorkDatabase workDatabase) {
        this.f56559a = workDatabase;
    }

    public static void c(Context context, g gVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j10 = 0;
            long j11 = sharedPreferences.getLong("last_cancel_all_time_ms", 0);
            if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                j10 = 1;
            }
            gVar.P();
            try {
                gVar.w0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j11)});
                gVar.w0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j10)});
                sharedPreferences.edit().clear().apply();
                gVar.v0();
            } finally {
                gVar.J0();
            }
        }
    }

    public long a() {
        Long b10 = this.f56559a.b().b("last_force_stop_ms");
        if (b10 != null) {
            return b10.longValue();
        }
        return 0;
    }

    public boolean b() {
        Long b10 = this.f56559a.b().b("reschedule_needed");
        return b10 != null && b10.longValue() == 1;
    }

    public void d(long j10) {
        this.f56559a.b().a(new C8722d("last_force_stop_ms", Long.valueOf(j10)));
    }

    public void e(boolean z10) {
        this.f56559a.b().a(new C8722d("reschedule_needed", z10));
    }
}
