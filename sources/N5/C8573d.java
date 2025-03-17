package n5;

import YH.C16877v;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.work.C7034c;
import androidx.work.C7055y;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t\"\u0018\u0010\u000e\u001a\u00020\u000b*\u00020\u00008AX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u001d\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f*\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/c;", "configuration", "", "a", "(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;Landroidx/work/c;)Ljava/lang/String;", "Ljava/lang/String;", "TAG", "Landroid/app/job/JobScheduler;", "c", "(Landroid/content/Context;)Landroid/app/job/JobScheduler;", "wmJobScheduler", "", "Landroid/app/job/JobInfo;", "b", "(Landroid/app/job/JobScheduler;)Ljava/util/List;", "safePendingJobs", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: n5.d  reason: case insensitive filesystem */
public final class C8573d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f55086a;

    static {
        String i10 = C7055y.i("SystemJobScheduler");
        C17542s.i(i10, "tagWithPrefix(\"SystemJobScheduler\")");
        f55086a = i10;
    }

    public static final String a(Context context, WorkDatabase workDatabase, C7034c cVar) {
        String str;
        C17542s.j(context, "context");
        C17542s.j(workDatabase, "workDatabase");
        C17542s.j(cVar, "configuration");
        int i10 = Build.VERSION.SDK_INT;
        int i11 = i10 >= 31 ? 150 : 100;
        int size = workDatabase.f().e().size();
        String str2 = "<faulty JobScheduler failed to getPendingJobs>";
        if (i10 >= 34) {
            JobScheduler c10 = c(context);
            List<JobInfo> b10 = b(c10);
            if (b10 != null) {
                List<JobInfo> g10 = C8580k.g(context, c10);
                int i12 = 0;
                int size2 = g10 != null ? b10.size() - g10.size() : 0;
                String str3 = null;
                if (size2 == 0) {
                    str = null;
                } else {
                    str = size2 + " of which are not owned by WorkManager";
                }
                Object systemService = context.getSystemService("jobscheduler");
                C17542s.h(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
                List<JobInfo> g11 = C8580k.g(context, (JobScheduler) systemService);
                if (g11 != null) {
                    i12 = g11.size();
                }
                if (i12 != 0) {
                    str3 = i12 + " from WorkManager in the default namespace";
                }
                str2 = C16877v.G0(C16877v.s(b10.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str, str3), ",\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null);
            }
        } else {
            List<JobInfo> g12 = C8580k.g(context, c(context));
            if (g12 != null) {
                str2 = g12.size() + " jobs from WorkManager";
            }
        }
        return "JobScheduler " + i11 + " job limit exceeded.\nIn JobScheduler there are " + str2 + ".\nThere are " + size + " jobs tracked by WorkManager's database;\nthe Configuration limit is " + cVar.h() + '.';
    }

    public static final List<JobInfo> b(JobScheduler jobScheduler) {
        C17542s.j(jobScheduler, "<this>");
        try {
            return C8570a.f55084a.a(jobScheduler);
        } catch (Throwable th2) {
            C7055y.e().d(f55086a, "getAllPendingJobs() is not reliable on this device.", th2);
            return null;
        }
    }

    public static final JobScheduler c(Context context) {
        C17542s.j(context, "<this>");
        Object systemService = context.getSystemService("jobscheduler");
        C17542s.h(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        JobScheduler jobScheduler = (JobScheduler) systemService;
        return Build.VERSION.SDK_INT >= 34 ? C8572c.f55085a.a(jobScheduler) : jobScheduler;
    }
}
