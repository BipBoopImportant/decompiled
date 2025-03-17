package s9;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.adjust.sdk.Constants;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import l9.p;
import p9.C8639a;
import t9.C8856d;
import w9.C8934a;

public class d implements x {

    /* renamed from: a  reason: collision with root package name */
    private final Context f56009a;

    /* renamed from: b  reason: collision with root package name */
    private final C8856d f56010b;

    /* renamed from: c  reason: collision with root package name */
    private final f f56011c;

    public d(Context context, C8856d dVar, f fVar) {
        this.f56009a = context;
        this.f56010b = dVar;
        this.f56011c = fVar;
    }

    private boolean d(JobScheduler jobScheduler, int i10, int i11) {
        for (JobInfo next : jobScheduler.getAllPendingJobs()) {
            int i12 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i10) {
                return i12 >= i11;
            }
        }
        return false;
    }

    public void a(p pVar, int i10) {
        b(pVar, i10, false);
    }

    public void b(p pVar, int i10, boolean z10) {
        ComponentName componentName = new ComponentName(this.f56009a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f56009a.getSystemService("jobscheduler");
        int c10 = c(pVar);
        if (z10 || !d(jobScheduler, c10, i10)) {
            long p12 = this.f56010b.p1(pVar);
            JobInfo.Builder c11 = this.f56011c.c(new JobInfo.Builder(c10, componentName), pVar.d(), p12, i10);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i10);
            persistableBundle.putString("backendName", pVar.b());
            persistableBundle.putInt("priority", C8934a.a(pVar.d()));
            if (pVar.c() != null) {
                persistableBundle.putString("extras", Base64.encodeToString(pVar.c(), 0));
            }
            c11.setExtras(persistableBundle);
            C8639a.b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", pVar, Integer.valueOf(c10), Long.valueOf(this.f56011c.g(pVar.d(), p12, i10)), Long.valueOf(p12), Integer.valueOf(i10));
            jobScheduler.schedule(c11.build());
            return;
        }
        C8639a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", pVar);
    }

    /* access modifiers changed from: package-private */
    public int c(p pVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f56009a.getPackageName().getBytes(Charset.forName(Constants.ENCODING)));
        adler32.update(pVar.b().getBytes(Charset.forName(Constants.ENCODING)));
        adler32.update(ByteBuffer.allocate(4).putInt(C8934a.a(pVar.d())).array());
        if (pVar.c() != null) {
            adler32.update(pVar.c());
        }
        return (int) adler32.getValue();
    }
}
