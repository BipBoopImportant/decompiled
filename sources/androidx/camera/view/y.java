package androidx.camera.view;

import android.view.PixelCopy;
import java.util.concurrent.Semaphore;

public final /* synthetic */ class y implements PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Semaphore f17238a;

    public /* synthetic */ y(Semaphore semaphore) {
        this.f17238a = semaphore;
    }

    public final void onPixelCopyFinished(int i10) {
        z.m(this.f17238a, i10);
    }
}
