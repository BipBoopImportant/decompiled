package sa;

import com.google.android.gms.measurement.internal.C7583e;
import com.google.android.gms.measurement.internal.E5;
import com.google.android.gms.measurement.internal.S2;

/* renamed from: sa.w  reason: case insensitive filesystem */
public final /* synthetic */ class C8769w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ S2 f56140a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ E5 f56141b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ C7583e f56142c;

    public /* synthetic */ C8769w(S2 s22, E5 e52, C7583e eVar) {
        this.f56140a = s22;
        this.f56141b = e52;
        this.f56142c = eVar;
    }

    public final void run() {
        S2.N3(this.f56140a, this.f56141b, this.f56142c);
    }
}
