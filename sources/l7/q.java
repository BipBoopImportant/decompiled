package L7;

import F7.b;
import androidx.exifinterface.media.a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class q implements ImageHeaderParser {
    public int a(InputStream inputStream, b bVar) {
        int i10 = new a(inputStream).i("Orientation", 1);
        if (i10 == 0) {
            return -1;
        }
        return i10;
    }

    public int b(ByteBuffer byteBuffer, b bVar) {
        return a(Y7.a.g(byteBuffer), bVar);
    }

    public ImageHeaderParser.ImageType c(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public ImageHeaderParser.ImageType d(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
