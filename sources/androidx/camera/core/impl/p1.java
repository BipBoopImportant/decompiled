package androidx.camera.core.impl;

import android.content.Context;

public interface p1 {

    /* renamed from: a  reason: collision with root package name */
    public static final p1 f16991a = new a();

    class a implements p1 {
        a() {
        }

        public X a(b bVar, int i10) {
            return null;
        }
    }

    public enum b {
        IMAGE_CAPTURE,
        PREVIEW,
        IMAGE_ANALYSIS,
        VIDEO_CAPTURE,
        STREAM_SHARING,
        METERING_REPEATING
    }

    public interface c {
        p1 a(Context context);
    }

    X a(b bVar, int i10);
}
