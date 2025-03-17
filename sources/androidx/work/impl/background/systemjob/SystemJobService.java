package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import androidx.work.C7055y;
import androidx.work.WorkerParameters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import l5.C8510f;
import l5.C8523t;
import l5.C8528y;
import l5.K;
import l5.M;
import l5.O;
import l5.z;
import s5.C8731m;

public class SystemJobService extends JobService implements C8510f {

    /* renamed from: e  reason: collision with root package name */
    private static final String f45270e = C7055y.i("SystemJobService");

    /* renamed from: a  reason: collision with root package name */
    private O f45271a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<C8731m, JobParameters> f45272b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final z f45273c = z.e(false);

    /* renamed from: d  reason: collision with root package name */
    private K f45274d;

    static class a {
        static String[] a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        static Uri[] b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    static class b {
        static Network a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    static class c {
        static int a(JobParameters jobParameters) {
            return SystemJobService.c(jobParameters.getStopReason());
        }
    }

    private static void a(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    static int c(int i10) {
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return i10;
            default:
                return -512;
        }
    }

    private static C8731m d(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C8731m(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public void b(C8731m mVar, boolean z10) {
        a("onExecuted");
        C7055y e10 = C7055y.e();
        String str = f45270e;
        e10.a(str, mVar.b() + " executed on JobScheduler");
        JobParameters remove = this.f45272b.remove(mVar);
        this.f45273c.f(mVar);
        if (remove != null) {
            jobFinished(remove, z10);
        }
    }

    public void onCreate() {
        super.onCreate();
        try {
            O r10 = O.r(getApplicationContext());
            this.f45271a = r10;
            C8523t t10 = r10.t();
            this.f45274d = new M(t10, this.f45271a.x());
            t10.e(this);
        } catch (IllegalStateException e10) {
            if (Application.class.equals(getApplication().getClass())) {
                C7055y.e().k(f45270e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        O o10 = this.f45271a;
        if (o10 != null) {
            o10.t().p(this);
        }
    }

    public boolean onStartJob(JobParameters jobParameters) {
        a("onStartJob");
        if (this.f45271a == null) {
            C7055y.e().a(f45270e, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        C8731m d10 = d(jobParameters);
        if (d10 == null) {
            C7055y.e().c(f45270e, "WorkSpec id not found!");
            return false;
        } else if (this.f45272b.containsKey(d10)) {
            C7055y e10 = C7055y.e();
            String str = f45270e;
            e10.a(str, "Job is already being executed by SystemJobService: " + d10);
            return false;
        } else {
            C7055y e11 = C7055y.e();
            String str2 = f45270e;
            e11.a(str2, "onStartJob for " + d10);
            this.f45272b.put(d10, jobParameters);
            int i10 = Build.VERSION.SDK_INT;
            WorkerParameters.a aVar = new WorkerParameters.a();
            if (a.b(jobParameters) != null) {
                aVar.f45124b = Arrays.asList(a.b(jobParameters));
            }
            if (a.a(jobParameters) != null) {
                aVar.f45123a = Arrays.asList(a.a(jobParameters));
            }
            if (i10 >= 28) {
                aVar.f45125c = b.a(jobParameters);
            }
            this.f45274d.c(this.f45273c.d(d10), aVar);
            return true;
        }
    }

    public boolean onStopJob(JobParameters jobParameters) {
        a("onStopJob");
        if (this.f45271a == null) {
            C7055y.e().a(f45270e, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        C8731m d10 = d(jobParameters);
        if (d10 == null) {
            C7055y.e().c(f45270e, "WorkSpec id not found!");
            return false;
        }
        C7055y e10 = C7055y.e();
        String str = f45270e;
        e10.a(str, "onStopJob for " + d10);
        this.f45272b.remove(d10);
        C8528y f10 = this.f45273c.f(d10);
        if (f10 != null) {
            this.f45274d.a(f10, Build.VERSION.SDK_INT >= 31 ? c.a(jobParameters) : -512);
        }
        return !this.f45271a.t().j(d10.b());
    }
}
