package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import i5.C8209a;
import java.util.Map;
import java.util.WeakHashMap;

public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* renamed from: a  reason: collision with root package name */
    private final Object f45027a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private SidecarDeviceState f45028b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<IBinder, SidecarWindowLayoutInfo> f45029c = new WeakHashMap();

    /* renamed from: d  reason: collision with root package name */
    private final C8209a f45030d;

    /* renamed from: e  reason: collision with root package name */
    private final SidecarInterface.SidecarCallback f45031e;

    DistinctElementSidecarCallback(C8209a aVar, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f45030d = aVar;
        this.f45031e = sidecarCallback;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState != null) {
            synchronized (this.f45027a) {
                try {
                    if (!this.f45030d.a(this.f45028b, sidecarDeviceState)) {
                        this.f45028b = sidecarDeviceState;
                        this.f45031e.onDeviceStateChanged(sidecarDeviceState);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.f45027a) {
            try {
                if (!this.f45030d.d(this.f45029c.get(iBinder), sidecarWindowLayoutInfo)) {
                    this.f45029c.put(iBinder, sidecarWindowLayoutInfo);
                    this.f45031e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
