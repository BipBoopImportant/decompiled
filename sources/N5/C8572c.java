package n5;

import android.app.job.JobScheduler;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln5/c;", "", "<init>", "()V", "Landroid/app/job/JobScheduler;", "jobScheduler", "a", "(Landroid/app/job/JobScheduler;)Landroid/app/job/JobScheduler;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: n5.c  reason: case insensitive filesystem */
final class C8572c {

    /* renamed from: a  reason: collision with root package name */
    public static final C8572c f55085a = new C8572c();

    private C8572c() {
    }

    public final JobScheduler a(JobScheduler jobScheduler) {
        C17542s.j(jobScheduler, "jobScheduler");
        JobScheduler a10 = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        C17542s.i(a10, "jobScheduler.forNamespace(WORKMANAGER_NAMESPACE)");
        return a10;
    }
}
