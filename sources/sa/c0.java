package sa;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.C7685s4;
import com.google.android.gms.measurement.internal.E5;
import java.util.concurrent.atomic.AtomicReference;

public final /* synthetic */ class c0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ C7685s4 f56109a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ AtomicReference f56110b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ E5 f56111c;

    /* renamed from: d  reason: collision with root package name */
    private /* synthetic */ Bundle f56112d;

    public /* synthetic */ c0(C7685s4 s4Var, AtomicReference atomicReference, E5 e52, Bundle bundle) {
        this.f56109a = s4Var;
        this.f56110b = atomicReference;
        this.f56111c = e52;
        this.f56112d = bundle;
    }

    public final void run() {
        C7685s4.M(this.f56109a, this.f56110b, this.f56111c, this.f56112d);
    }
}
