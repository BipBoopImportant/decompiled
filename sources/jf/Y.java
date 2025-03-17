package JF;

import android.view.View;
import nI.C17631a;

public final /* synthetic */ class Y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f111315a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C17631a f111316b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f111317c;

    public /* synthetic */ Y(View view, C17631a aVar, long j10) {
        this.f111315a = view;
        this.f111316b = aVar;
        this.f111317c = j10;
    }

    public final void run() {
        Z.m(this.f111315a, this.f111316b, this.f111317c);
    }
}
