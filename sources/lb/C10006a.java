package lb;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import jb.l;
import mb.C10032c;

/* renamed from: lb.a  reason: case insensitive filesystem */
public final class C10006a {

    /* renamed from: a  reason: collision with root package name */
    private static final OutputStream f75209a = new C1364a();

    /* renamed from: lb.a$a  reason: collision with other inner class name */
    class C1364a extends OutputStream {
        C1364a() {
        }

        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        public void write(int i10) {
        }

        public void write(byte[] bArr) {
            l.j(bArr);
        }

        public void write(byte[] bArr, int i10, int i11) {
            l.j(bArr);
            l.n(i10, i11 + i10, bArr.length);
        }
    }

    private static byte[] a(Queue<byte[]> queue, int i10) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] remove = queue.remove();
        if (remove.length == i10) {
            return remove;
        }
        int length = i10 - remove.length;
        byte[] copyOf = Arrays.copyOf(remove, i10);
        while (length > 0) {
            byte[] remove2 = queue.remove();
            int min = Math.min(length, remove2.length);
            System.arraycopy(remove2, 0, copyOf, i10 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static byte[] b(InputStream inputStream) {
        l.j(inputStream);
        return c(inputStream, new ArrayDeque(20), 0);
    }

    private static byte[] c(InputStream inputStream, Queue<byte[]> queue, int i10) {
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(i10) * 2));
        while (i10 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i10);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i11 = 0;
            while (i11 < min2) {
                int read = inputStream.read(bArr, i11, min2 - i11);
                if (read == -1) {
                    return a(queue, i10);
                }
                i11 += read;
                i10 += read;
            }
            min = C10032c.c(min, min < 4096 ? 4 : 2);
        }
        if (inputStream.read() == -1) {
            return a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
