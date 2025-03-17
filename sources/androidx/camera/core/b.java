package androidx.camera.core;

import android.media.ImageReader;
import androidx.camera.core.impl.C5048t0;
import java.util.concurrent.Executor;

public final /* synthetic */ class b implements ImageReader.OnImageAvailableListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f16656a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Executor f16657b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C5048t0.a f16658c;

    public /* synthetic */ b(d dVar, Executor executor, C5048t0.a aVar) {
        this.f16656a = dVar;
        this.f16657b = executor;
        this.f16658c = aVar;
    }

    public final void onImageAvailable(ImageReader imageReader) {
        this.f16656a.k(this.f16657b, this.f16658c, imageReader);
    }
}
