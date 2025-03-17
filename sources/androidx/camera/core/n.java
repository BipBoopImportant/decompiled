package androidx.camera.core;

import C.W;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.media.Image;
import java.nio.ByteBuffer;

public interface n extends AutoCloseable {

    public interface a {
        int a();

        int b();

        ByteBuffer p();
    }

    @SuppressLint({"ArrayReturn"})
    a[] A1();

    W F2();

    void close();

    Rect getCropRect();

    int getFormat();

    int getHeight();

    int getWidth();

    Image k();

    void setCropRect(Rect rect);
}
