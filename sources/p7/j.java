package P7;

import C7.i;
import C7.k;
import E7.v;
import F7.b;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public class j implements k<InputStream, c> {

    /* renamed from: a  reason: collision with root package name */
    private final List<ImageHeaderParser> f39435a;

    /* renamed from: b  reason: collision with root package name */
    private final k<ByteBuffer, c> f39436b;

    /* renamed from: c  reason: collision with root package name */
    private final b f39437c;

    public j(List<ImageHeaderParser> list, k<ByteBuffer, c> kVar, b bVar) {
        this.f39435a = list;
        this.f39436b = kVar;
        this.f39437c = bVar;
    }

    private static byte[] e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e10) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e10);
            return null;
        }
    }

    /* renamed from: c */
    public v<c> a(InputStream inputStream, int i10, int i11, i iVar) {
        byte[] e10 = e(inputStream);
        if (e10 == null) {
            return null;
        }
        return this.f39436b.a(ByteBuffer.wrap(e10), i10, i11, iVar);
    }

    /* renamed from: d */
    public boolean b(InputStream inputStream, i iVar) {
        return !((Boolean) iVar.c(i.f39434b)).booleanValue() && a.f(this.f39435a, inputStream, this.f39437c) == ImageHeaderParser.ImageType.GIF;
    }
}
