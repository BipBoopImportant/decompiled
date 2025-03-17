package i7;

import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ljava/io/OutputStream;", "", "value", "", "numBytes", "LXH/N;", "a", "(Ljava/io/OutputStream;JI)V", "", "data", "maxDataLength", "b", "(Ljava/io/OutputStream;[BI)V", "certificatetransparency"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: i7.c  reason: case insensitive filesystem */
public final class C8217c {
    public static final void a(OutputStream outputStream, long j10, int i10) {
        C17542s.j(outputStream, "<this>");
        if (j10 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (((double) j10) < Math.pow(256.0d, (double) i10)) {
            while (i10 > 0) {
                int i11 = (i10 - 1) * 8;
                outputStream.write((byte) ((int) (((255 << i11) & j10) >> i11)));
                i10--;
            }
        } else {
            throw new IllegalArgumentException(("Value " + j10 + " cannot be stored in " + i10 + " bytes").toString());
        }
    }

    public static final void b(OutputStream outputStream, byte[] bArr, int i10) {
        C17542s.j(outputStream, "<this>");
        C17542s.j(bArr, "data");
        if (bArr.length <= i10) {
            a(outputStream, (long) bArr.length, C8215a.f53152a.a(i10));
            outputStream.write(bArr, 0, bArr.length);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
