package JF;

import android.view.View;
import nI.C17631a;

public final /* synthetic */ class X implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f111311a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C17631a f111312b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f111313c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f111314d;

    public /* synthetic */ X(View view, C17631a aVar, long j10, boolean z10) {
        this.f111311a = view;
        this.f111312b = aVar;
        this.f111313c = j10;
        this.f111314d = z10;
    }

    public final void run() {
        Z.p(this.f111311a, this.f111312b, this.f111313c, this.f111314d);
    }
}
