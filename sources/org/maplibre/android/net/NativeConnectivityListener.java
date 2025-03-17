package org.maplibre.android.net;

import androidx.annotation.Keep;
import org.maplibre.android.a;

class NativeConnectivityListener implements a {
    @Keep
    private boolean invalidated;
    @Keep
    private long nativePtr;

    static {
        a.a();
    }

    @Keep
    NativeConnectivityListener(long j10) {
        this.nativePtr = j10;
    }

    public void a(boolean z10) {
        nativeOnConnectivityStateChanged(z10);
    }

    /* access modifiers changed from: protected */
    @Keep
    public native void finalize();

    /* access modifiers changed from: protected */
    @Keep
    public native void initialize();

    /* access modifiers changed from: protected */
    @Keep
    public native void nativeOnConnectivityStateChanged(boolean z10);

    NativeConnectivityListener() {
        initialize();
    }
}
