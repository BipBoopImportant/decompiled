package n5;

import H2.a;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.C7034c;
import androidx.work.C7055y;
import androidx.work.H;
import androidx.work.Q;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l5.C8525v;
import s5.C8727i;
import s5.C8730l;
import s5.C8731m;
import s5.C8739u;
import s5.v;
import s5.z;
import t5.C8820o;

/* renamed from: n5.k  reason: case insensitive filesystem */
public class C8580k implements C8525v {

    /* renamed from: f  reason: collision with root package name */
    private static final String f55092f = C7055y.i("SystemJobScheduler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f55093a;

    /* renamed from: b  reason: collision with root package name */
    private final JobScheduler f55094b;

    /* renamed from: c  reason: collision with root package name */
    private final C8578i f55095c;

    /* renamed from: d  reason: collision with root package name */
    private final WorkDatabase f55096d;

    /* renamed from: e  reason: collision with root package name */
    private final C7034c f55097e;

    public C8580k(Context context, WorkDatabase workDatabase, C7034c cVar) {
        this(context, workDatabase, cVar, C8573d.c(context), new C8578i(context, cVar.a(), cVar.s()));
    }

    public static void b(Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            C8573d.c(context).cancelAll();
        }
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g10 = g(context, jobScheduler);
        if (g10 != null && !g10.isEmpty()) {
            for (JobInfo id2 : g10) {
                d(jobScheduler, id2.getId());
            }
        }
    }

    private static void d(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th2) {
            C7055y.e().d(f55092f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i10)}), th2);
        }
    }

    private static List<Integer> f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> g10 = g(context, jobScheduler);
        if (g10 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo next : g10) {
            C8731m h10 = h(next);
            if (h10 != null && str.equals(h10.b())) {
                arrayList.add(Integer.valueOf(next.getId()));
            }
        }
        return arrayList;
    }

    static List<JobInfo> g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> b10 = C8573d.b(jobScheduler);
        if (b10 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(b10.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo next : b10) {
            if (componentName.equals(next.getService())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private static C8731m h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C8731m(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean i(Context context, WorkDatabase workDatabase) {
        JobScheduler c10 = C8573d.c(context);
        List<JobInfo> g10 = g(context, c10);
        List<String> e10 = workDatabase.c().e();
        boolean z10 = false;
        HashSet hashSet = new HashSet(g10 != null ? g10.size() : 0);
        if (g10 != null && !g10.isEmpty()) {
            for (JobInfo next : g10) {
                C8731m h10 = h(next);
                if (h10 != null) {
                    hashSet.add(h10.b());
                } else {
                    d(c10, next.getId());
                }
            }
        }
        Iterator<String> it = e10.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains(it.next())) {
                    C7055y.e().a(f55092f, "Reconciling jobs");
                    z10 = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z10) {
            workDatabase.beginTransaction();
            try {
                v f10 = workDatabase.f();
                for (String r10 : e10) {
                    f10.r(r10, -1);
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
            } catch (Throwable th2) {
                workDatabase.endTransaction();
                throw th2;
            }
        }
        return z10;
    }

    public void a(String str) {
        List<Integer> f10 = f(this.f55093a, this.f55094b, str);
        if (f10 != null && !f10.isEmpty()) {
            for (Integer intValue : f10) {
                d(this.f55094b, intValue.intValue());
            }
            this.f55096d.c().g(str);
        }
    }

    public void c(C8739u... uVarArr) {
        C8820o oVar = new C8820o(this.f55096d);
        int length = uVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            C8739u uVar = uVarArr[i10];
            this.f55096d.beginTransaction();
            try {
                C8739u i11 = this.f55096d.f().i(uVar.f55910a);
                if (i11 == null) {
                    C7055y e10 = C7055y.e();
                    String str = f55092f;
                    e10.k(str, "Skipping scheduling " + uVar.f55910a + " because it's no longer in the DB");
                    this.f55096d.setTransactionSuccessful();
                } else if (i11.f55911b != Q.c.ENQUEUED) {
                    C7055y e11 = C7055y.e();
                    String str2 = f55092f;
                    e11.k(str2, "Skipping scheduling " + uVar.f55910a + " because it is no longer enqueued");
                    this.f55096d.setTransactionSuccessful();
                } else {
                    C8731m a10 = z.a(uVar);
                    C8727i a11 = this.f55096d.c().a(a10);
                    int e12 = a11 != null ? a11.f55883c : oVar.e(this.f55097e.i(), this.f55097e.g());
                    if (a11 == null) {
                        this.f55096d.c().b(C8730l.a(a10, e12));
                    }
                    j(uVar, e12);
                    this.f55096d.setTransactionSuccessful();
                }
                i10++;
            } finally {
                this.f55096d.endTransaction();
            }
        }
    }

    public boolean e() {
        return true;
    }

    public void j(C8739u uVar, int i10) {
        JobInfo a10 = this.f55095c.a(uVar, i10);
        C7055y e10 = C7055y.e();
        String str = f55092f;
        e10.a(str, "Scheduling work ID " + uVar.f55910a + "Job ID " + i10);
        try {
            if (this.f55094b.schedule(a10) == 0) {
                C7055y e11 = C7055y.e();
                e11.k(str, "Unable to schedule work ID " + uVar.f55910a);
                if (uVar.f55926q && uVar.f55927r == H.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    uVar.f55926q = false;
                    C7055y.e().a(str, String.format("Scheduling a non-expedited job (work ID %s)", new Object[]{uVar.f55910a}));
                    j(uVar, i10);
                }
            }
        } catch (IllegalStateException e12) {
            String a11 = C8573d.a(this.f55093a, this.f55096d, this.f55097e);
            C7055y.e().c(f55092f, a11);
            IllegalStateException illegalStateException = new IllegalStateException(a11, e12);
            a<Throwable> l10 = this.f55097e.l();
            if (l10 != null) {
                l10.accept(illegalStateException);
                return;
            }
            throw illegalStateException;
        } catch (Throwable th2) {
            C7055y e13 = C7055y.e();
            String str2 = f55092f;
            e13.d(str2, "Unable to schedule " + uVar, th2);
        }
    }

    public C8580k(Context context, WorkDatabase workDatabase, C7034c cVar, JobScheduler jobScheduler, C8578i iVar) {
        this.f55093a = context;
        this.f55094b = jobScheduler;
        this.f55095c = iVar;
        this.f55096d = workDatabase;
        this.f55097e = cVar;
    }
}
