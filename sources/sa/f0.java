package sa;

import android.app.job.JobParameters;
import com.google.android.gms.measurement.internal.Z4;

public final /* synthetic */ class f0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ Z4 f56120a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ JobParameters f56121b;

    public /* synthetic */ f0(Z4 z42, JobParameters jobParameters) {
        this.f56120a = z42;
        this.f56121b = jobParameters;
    }

    public final void run() {
        Z4.e(this.f56120a, this.f56121b);
    }
}
