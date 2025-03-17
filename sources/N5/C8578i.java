package n5;

import android.annotation.SuppressLint;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.C7032a;
import androidx.work.C7033b;
import androidx.work.C7036e;
import androidx.work.C7055y;
import androidx.work.C7056z;
import androidx.work.impl.background.systemjob.SystemJobService;
import s5.C8739u;

@SuppressLint({"ClassVerificationFailure"})
/* renamed from: n5.i  reason: case insensitive filesystem */
class C8578i {

    /* renamed from: d  reason: collision with root package name */
    private static final String f55087d = C7055y.i("SystemJobInfoConverter");

    /* renamed from: a  reason: collision with root package name */
    private final ComponentName f55088a;

    /* renamed from: b  reason: collision with root package name */
    private final C7033b f55089b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f55090c;

    /* renamed from: n5.i$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f55091a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.work.z[] r0 = androidx.work.C7056z.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f55091a = r0
                androidx.work.z r1 = androidx.work.C7056z.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f55091a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.work.z r1 = androidx.work.C7056z.CONNECTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f55091a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.work.z r1 = androidx.work.C7056z.UNMETERED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f55091a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.work.z r1 = androidx.work.C7056z.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f55091a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.work.z r1 = androidx.work.C7056z.METERED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: n5.C8578i.a.<clinit>():void");
        }
    }

    C8578i(Context context, C7033b bVar, boolean z10) {
        this.f55089b = bVar;
        this.f55088a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
        this.f55090c = z10;
    }

    private static JobInfo.TriggerContentUri b(C7036e.c cVar) {
        return new JobInfo.TriggerContentUri(cVar.a(), cVar.b() ? 1 : 0);
    }

    static int c(C7056z zVar) {
        int i10 = a.f55091a[zVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5) {
            return 4;
        }
        C7055y e10 = C7055y.e();
        String str = f55087d;
        e10.a(str, "API version too low. Cannot convert network type value " + zVar);
        return 1;
    }

    static void d(JobInfo.Builder builder, C7056z zVar) {
        if (Build.VERSION.SDK_INT < 30 || zVar != C7056z.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(c(zVar));
        } else {
            JobInfo.Builder unused = builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    /* access modifiers changed from: package-private */
    public JobInfo a(C8739u uVar, int i10) {
        String k10;
        C7036e eVar = uVar.f55919j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", uVar.f55910a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", uVar.f());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", uVar.n());
        JobInfo.Builder extras = new JobInfo.Builder(i10, this.f55088a).setRequiresCharging(eVar.i()).setRequiresDeviceIdle(eVar.j()).setExtras(persistableBundle);
        NetworkRequest d10 = eVar.d();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 28 || d10 == null) {
            d(extras, eVar.f());
        } else {
            C8579j.a(extras, d10);
        }
        boolean z10 = false;
        if (!eVar.j()) {
            extras.setBackoffCriteria(uVar.f55922m, uVar.f55921l == C7032a.LINEAR ? 0 : 1);
        }
        long max = Math.max(uVar.c() - this.f55089b.a(), 0);
        if (i11 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!uVar.f55926q && this.f55090c) {
            JobInfo.Builder unused = extras.setImportantWhileForeground(true);
        }
        if (eVar.g()) {
            for (C7036e.c b10 : eVar.c()) {
                extras.addTriggerContentUri(b(b10));
            }
            extras.setTriggerContentUpdateDelay(eVar.b());
            extras.setTriggerContentMaxDelay(eVar.a());
        }
        extras.setPersisted(false);
        int i12 = Build.VERSION.SDK_INT;
        extras.setRequiresBatteryNotLow(eVar.h());
        extras.setRequiresStorageNotLow(eVar.k());
        boolean z11 = uVar.f55920k > 0;
        if (max > 0) {
            z10 = true;
        }
        if (i12 >= 31 && uVar.f55926q && !z11 && !z10) {
            JobInfo.Builder unused2 = extras.setExpedited(true);
        }
        if (i12 >= 35 && (k10 = uVar.k()) != null) {
            JobInfo.Builder unused3 = extras.setTraceTag(k10);
        }
        return extras.build();
    }
}
