package androidx.camera.view;

import C.C4400j;
import C.I0;
import G.p;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.lifecycle.C5221y;

/* renamed from: androidx.camera.view.f  reason: case insensitive filesystem */
public final class C5066f extends C5063c {

    /* renamed from: M  reason: collision with root package name */
    private C5221y f17174M;

    public C5066f(Context context) {
        super(context);
    }

    /* access modifiers changed from: package-private */
    public C4400j R() {
        if (this.f17174M == null) {
            Log.d("CamLifecycleController", "Lifecycle is not set.");
            return null;
        } else if (this.f17165u == null) {
            Log.d("CamLifecycleController", "CameraProvider is not ready.");
            return null;
        } else {
            I0 l10 = l();
            if (l10 == null) {
                return null;
            }
            try {
                return this.f17165u.b(this.f17174M, this.f17145a, l10);
            } catch (IllegalArgumentException e10) {
                throw new IllegalStateException("The selected camera does not support the enabled use cases. Please disable use case and/or select a different camera. e.g. #setVideoCaptureEnabled(false)", e10);
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    public void e0(C5221y yVar) {
        p.a();
        this.f17174M = yVar;
        S();
    }
}
