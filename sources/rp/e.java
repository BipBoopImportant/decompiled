package Rp;

import Rp.g;
import SJ.C16449y;
import android.app.Activity;

public final /* synthetic */ class e implements Activity.ScreenCaptureCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C16449y f86950a;

    public /* synthetic */ e(C16449y yVar) {
        this.f86950a = yVar;
    }

    public final void onScreenCaptured() {
        g.a.m(this.f86950a);
    }
}
