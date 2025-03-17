package sa;

import android.app.job.JobParameters;
import com.google.android.gms.measurement.internal.C7607h2;
import com.google.android.gms.measurement.internal.Z4;

public final /* synthetic */ class g0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ Z4 f56122a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ C7607h2 f56123b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ JobParameters f56124c;

    public /* synthetic */ g0(Z4 z42, C7607h2 h2Var, JobParameters jobParameters) {
        this.f56122a = z42;
        this.f56123b = h2Var;
        this.f56124c = jobParameters;
    }

    public final void run() {
        Z4.f(this.f56122a, this.f56123b, this.f56124c);
    }
}
