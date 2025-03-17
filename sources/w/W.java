package w;

import C.C4391e0;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import w.U;

class W implements U.a {

    /* renamed from: a  reason: collision with root package name */
    final StreamConfigurationMap f31065a;

    static class a {
        static Size[] a(StreamConfigurationMap streamConfigurationMap, int i10) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i10);
        }
    }

    W(StreamConfigurationMap streamConfigurationMap) {
        this.f31065a = streamConfigurationMap;
    }

    public StreamConfigurationMap a() {
        return this.f31065a;
    }

    public int[] c() {
        try {
            return this.f31065a.getOutputFormats();
        } catch (IllegalArgumentException | NullPointerException e10) {
            C4391e0.m("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e10);
            return null;
        }
    }

    public Size[] d(int i10) {
        return a.a(this.f31065a, i10);
    }
}
