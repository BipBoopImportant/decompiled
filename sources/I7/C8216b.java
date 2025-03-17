package i7;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Ljava/io/InputStream;", "", "numBytes", "", "b", "(Ljava/io/InputStream;I)J", "dataLength", "", "a", "(Ljava/io/InputStream;I)[B", "maxDataLength", "c", "certificatetransparency"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: i7.b  reason: case insensitive filesystem */
public final class C8216b {
    public static final byte[] a(InputStream inputStream, int i10) {
        C17542s.j(inputStream, "<this>");
        byte[] bArr = new byte[i10];
        int read = inputStream.read(bArr);
        if (read >= i10) {
            return bArr;
        }
        throw new IOException("Not enough bytes: Expected " + i10 + ", got " + read + '.');
    }

    public static final long b(InputStream inputStream, int i10) {
        C17542s.j(inputStream, "<this>");
        if (i10 <= 8) {
            long j10 = 0;
            int i11 = 0;
            while (i11 < i10) {
                int read = inputStream.read();
                if (read >= 0) {
                    j10 = (j10 << 8) | ((long) read);
                    i11++;
                } else {
                    throw new IOException("Missing length bytes: Expected " + i10 + ", got " + i11 + '.');
                }
            }
            return j10;
        }
        throw new IllegalArgumentException("Could not read a number of more than 8 bytes.");
    }

    public static final byte[] c(InputStream inputStream, int i10) {
        C17542s.j(inputStream, "<this>");
        int b10 = (int) b(inputStream, C8215a.f53152a.a(i10));
        byte[] bArr = new byte[b10];
        try {
            int read = inputStream.read(bArr);
            if (read == b10) {
                return bArr;
            }
            throw new IOException("Incomplete data. Expected " + b10 + " bytes, had " + read + '.');
        } catch (IOException e10) {
            throw new IOException("Error while reading variable-length data", e10);
        }
    }
}
