package androidx.media3.ui;

import android.view.SurfaceView;
import androidx.media3.ui.PlayerView;

public final /* synthetic */ class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PlayerView.f f43389a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SurfaceView f43390b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Runnable f43391c;

    public /* synthetic */ u(PlayerView.f fVar, SurfaceView surfaceView, Runnable runnable) {
        this.f43389a = fVar;
        this.f43390b = surfaceView;
        this.f43391c = runnable;
    }

    public final void run() {
        this.f43389a.d(this.f43390b, this.f43391c);
    }
}
