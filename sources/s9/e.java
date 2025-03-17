package s9;

import android.app.job.JobParameters;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ JobInfoSchedulerService f56012a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ JobParameters f56013b;

    public /* synthetic */ e(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f56012a = jobInfoSchedulerService;
        this.f56013b = jobParameters;
    }

    public final void run() {
        this.f56012a.b(this.f56013b);
    }
}
