package a0;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* renamed from: a0.f  reason: case insensitive filesystem */
public interface C4962f extends AutoCloseable {
    ByteBuffer U0();

    void close();

    long d1();

    MediaCodec.BufferInfo q0();

    long size();

    boolean y0();
}
