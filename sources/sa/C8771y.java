package sa;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.E5;
import com.google.android.gms.measurement.internal.S2;

/* renamed from: sa.y  reason: case insensitive filesystem */
public final /* synthetic */ class C8771y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ S2 f56145a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ E5 f56146b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Bundle f56147c;

    /* renamed from: d  reason: collision with root package name */
    private /* synthetic */ C8756i f56148d;

    /* renamed from: e  reason: collision with root package name */
    private /* synthetic */ String f56149e;

    public /* synthetic */ C8771y(S2 s22, E5 e52, Bundle bundle, C8756i iVar, String str) {
        this.f56145a = s22;
        this.f56146b = e52;
        this.f56147c = bundle;
        this.f56148d = iVar;
        this.f56149e = str;
    }

    public final void run() {
        S2.M3(this.f56145a, this.f56146b, this.f56147c, this.f56148d, this.f56149e);
    }
}
