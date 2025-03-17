package sa;

import android.content.Intent;
import com.google.android.gms.measurement.internal.C7607h2;
import com.google.android.gms.measurement.internal.Z4;

public final /* synthetic */ class h0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ Z4 f56125a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ int f56126b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ C7607h2 f56127c;

    /* renamed from: d  reason: collision with root package name */
    private /* synthetic */ Intent f56128d;

    public /* synthetic */ h0(Z4 z42, int i10, C7607h2 h2Var, Intent intent) {
        this.f56125a = z42;
        this.f56126b = i10;
        this.f56127c = h2Var;
        this.f56128d = intent;
    }

    public final void run() {
        Z4.d(this.f56125a, this.f56126b, this.f56127c, this.f56128d);
    }
}
