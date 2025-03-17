package sa;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.E5;
import com.google.android.gms.measurement.internal.S2;

public final /* synthetic */ class B implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ S2 f56073a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Bundle f56074b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ String f56075c;

    /* renamed from: d  reason: collision with root package name */
    private /* synthetic */ E5 f56076d;

    public /* synthetic */ B(S2 s22, Bundle bundle, String str, E5 e52) {
        this.f56073a = s22;
        this.f56074b = bundle;
        this.f56075c = str;
        this.f56076d = e52;
    }

    public final void run() {
        S2.K3(this.f56073a, this.f56074b, this.f56075c, this.f56076d);
    }
}
