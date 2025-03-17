package w;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;

class V extends W {
    V(StreamConfigurationMap streamConfigurationMap) {
        super(streamConfigurationMap);
    }

    public Size[] b(int i10) {
        return this.f31065a.getOutputSizes(i10);
    }
}
