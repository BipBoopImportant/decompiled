package a9;

import XH.v;
import android.graphics.Bitmap;
import android.view.PixelCopy;
import com.contentsquare.android.sdk.K0;

/* renamed from: a9.k4  reason: case insensitive filesystem */
public final /* synthetic */ class C6866k4 implements PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ K0 f42655a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bitmap f42656b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ v f42657c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C6937t4 f42658d;

    public /* synthetic */ C6866k4(K0 k02, Bitmap bitmap, v vVar, C6937t4 t4Var) {
        this.f42655a = k02;
        this.f42656b = bitmap;
        this.f42657c = vVar;
        this.f42658d = t4Var;
    }

    public final void onPixelCopyFinished(int i10) {
        K0.d(this.f42655a, this.f42656b, this.f42657c, this.f42658d, i10);
    }
}
