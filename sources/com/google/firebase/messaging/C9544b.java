package com.google.firebase.messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* renamed from: com.google.firebase.messaging.b  reason: case insensitive filesystem */
final class C9544b {
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

    public static InputStream b(InputStream inputStream, long j10) {
        return new a(inputStream, j10);
    }

    private static int c(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static byte[] d(InputStream inputStream) {
        return e(inputStream, new ArrayDeque(20), 0);
    }

    private static byte[] e(InputStream inputStream, Queue<byte[]> queue, int i10) {
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
            min = c(((long) min) * ((long) (min < 4096 ? 4 : 2)));
        }
        if (inputStream.read() == -1) {
            return a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* renamed from: com.google.firebase.messaging.b$a */
    private static final class a extends FilterInputStream {

        /* renamed from: a  reason: collision with root package name */
        private long f68395a;

        /* renamed from: b  reason: collision with root package name */
        private long f68396b = -1;

        a(InputStream inputStream, long j10) {
            super(inputStream);
            this.f68395a = j10;
        }

        public int available() {
            return (int) Math.min((long) this.in.available(), this.f68395a);
        }

        public synchronized void mark(int i10) {
            this.in.mark(i10);
            this.f68396b = this.f68395a;
        }

        public int read() {
            if (this.f68395a == 0) {
                return -1;
            }
            int read = this.in.read();
            if (read != -1) {
                this.f68395a--;
            }
            return read;
        }

        public synchronized void reset() {
            if (!this.in.markSupported()) {
                throw new IOException("Mark not supported");
            } else if (this.f68396b != -1) {
                this.in.reset();
                this.f68395a = this.f68396b;
            } else {
                throw new IOException("Mark not set");
            }
        }

        public long skip(long j10) {
            long skip = this.in.skip(Math.min(j10, this.f68395a));
            this.f68395a -= skip;
            return skip;
        }

        public int read(byte[] bArr, int i10, int i11) {
            long j10 = this.f68395a;
            if (j10 == 0) {
                return -1;
            }
            int read = this.in.read(bArr, i10, (int) Math.min((long) i11, j10));
            if (read != -1) {
                this.f68395a -= (long) read;
            }
            return read;
        }
    }
}
