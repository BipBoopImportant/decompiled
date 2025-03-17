package j7;

import java.io.EOFException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ljava/io/InputStream;", "", "c", "(Ljava/io/InputStream;)I", "", "b", "(Ljava/io/InputStream;)[B", "length", "a", "(Ljava/io/InputStream;I)[B", "certificatetransparency"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k {
    private static final byte[] a(InputStream inputStream, int i10) {
        if (i10 < 1) {
            return new byte[0];
        }
        byte[] bArr = new byte[i10];
        if (i10 == inputStream.read(bArr, 0, i10)) {
            return bArr;
        }
        throw new EOFException();
    }

    public static final byte[] b(InputStream inputStream) {
        C17542s.j(inputStream, "<this>");
        return a(inputStream, c(inputStream));
    }

    public static final int c(InputStream inputStream) {
        C17542s.j(inputStream, "<this>");
        int read = inputStream.read();
        int read2 = inputStream.read();
        if (read2 >= 0) {
            return read2 | (read << 8);
        }
        throw new EOFException();
    }
}
