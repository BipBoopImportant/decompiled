package a9;

import android.graphics.Bitmap;
import android.view.PixelCopy;
import android.view.SurfaceView;
import com.contentsquare.android.sdk.K0;

/* renamed from: a9.l4  reason: case insensitive filesystem */
public final /* synthetic */ class C6874l4 implements PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ K0 f42682a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SurfaceView f42683b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Bitmap f42684c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C6937t4 f42685d;

    public /* synthetic */ C6874l4(K0 k02, SurfaceView surfaceView, Bitmap bitmap, C6937t4 t4Var) {
        this.f42682a = k02;
        this.f42683b = surfaceView;
        this.f42684c = bitmap;
        this.f42685d = t4Var;
    }

    public final void onPixelCopyFinished(int i10) {
        K0.e(this.f42682a, this.f42683b, this.f42684c, this.f42685d, i10);
    }
}
