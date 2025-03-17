package sa;

import com.google.android.gms.measurement.internal.C7583e;
import com.google.android.gms.measurement.internal.C7685s4;
import com.google.android.gms.measurement.internal.E5;

public final /* synthetic */ class d0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ C7685s4 f56113a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ E5 f56114b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ C7583e f56115c;

    public /* synthetic */ d0(C7685s4 s4Var, E5 e52, C7583e eVar) {
        this.f56113a = s4Var;
        this.f56114b = e52;
        this.f56115c = eVar;
    }

    public final void run() {
        C7685s4.L(this.f56113a, this.f56114b, this.f56115c);
    }
}
