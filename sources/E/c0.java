package E;

import android.graphics.Bitmap;

public final /* synthetic */ class c0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f0 f5615a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bitmap f5616b;

    public /* synthetic */ c0(f0 f0Var, Bitmap bitmap) {
        this.f5615a = f0Var;
        this.f5616b = bitmap;
    }

    public final void run() {
        this.f5615a.s(this.f5616b);
    }
}
