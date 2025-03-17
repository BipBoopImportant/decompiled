package X5;

import android.graphics.ImageDecoder;

public final class D implements ImageDecoder.OnPartialImageListener {
    public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
        return E.f(decodeException);
    }
}
