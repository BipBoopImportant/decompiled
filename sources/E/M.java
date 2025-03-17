package E;

import android.graphics.Bitmap;

public final /* synthetic */ class M implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ P f5534a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bitmap f5535b;

    public /* synthetic */ M(P p10, Bitmap bitmap) {
        this.f5534a = p10;
        this.f5535b = bitmap;
    }

    public final void run() {
        this.f5534a.r(this.f5535b);
    }
}
