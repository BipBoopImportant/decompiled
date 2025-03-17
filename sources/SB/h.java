package Sb;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

class h implements Closeable {

    /* renamed from: g  reason: collision with root package name */
    private static final Logger f63283g = Logger.getLogger(h.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final RandomAccessFile f63284a;

    /* renamed from: b  reason: collision with root package name */
    int f63285b;

    /* renamed from: c  reason: collision with root package name */
    private int f63286c;

    /* renamed from: d  reason: collision with root package name */
    private b f63287d;

    /* renamed from: e  reason: collision with root package name */
    private b f63288e;

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f63289f = new byte[16];

    class a implements d {

        /* renamed from: a  reason: collision with root package name */
        boolean f63290a = true;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StringBuilder f63291b;

        a(StringBuilder sb2) {
            this.f63291b = sb2;
        }

        public void a(InputStream inputStream, int i10) {
            if (this.f63290a) {
                this.f63290a = false;
            } else {
                this.f63291b.append(", ");
            }
            this.f63291b.append(i10);
        }
    }

    static class b {

        /* renamed from: c  reason: collision with root package name */
        static final b f63293c = new b(0, 0);

        /* renamed from: a  reason: collision with root package name */
        final int f63294a;

        /* renamed from: b  reason: collision with root package name */
        final int f63295b;

        b(int i10, int i11) {
            this.f63294a = i10;
            this.f63295b = i11;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f63294a + ", length = " + this.f63295b + "]";
        }
    }

    private final class c extends InputStream {

        /* renamed from: a  reason: collision with root package name */
        private int f63296a;

        /* renamed from: b  reason: collision with root package name */
        private int f63297b;

        /* synthetic */ c(h hVar, b bVar, a aVar) {
            this(bVar);
        }

        public int read(byte[] bArr, int i10, int i11) {
            Object unused = h.s(bArr, "buffer");
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i12 = this.f63297b;
            if (i12 <= 0) {
                return -1;
            }
            if (i11 > i12) {
                i11 = i12;
            }
            h.this.B(this.f63296a, bArr, i10, i11);
            this.f63296a = h.this.U(this.f63296a + i11);
            this.f63297b -= i11;
            return i11;
        }

        private c(b bVar) {
            this.f63296a = h.this.U(bVar.f63294a + 4);
            this.f63297b = bVar.f63295b;
        }

        public int read() {
            if (this.f63297b == 0) {
                return -1;
            }
            h.this.f63284a.seek((long) this.f63296a);
            int read = h.this.f63284a.read();
            this.f63296a = h.this.U(this.f63296a + 1);
            this.f63297b--;
            return read;
        }
    }

    public interface d {
        void a(InputStream inputStream, int i10);
    }

    public h(File file) {
        if (!file.exists()) {
            o(file);
        }
        this.f63284a = t(file);
        v();
    }

    /* access modifiers changed from: private */
    public void B(int i10, byte[] bArr, int i11, int i12) {
        int U10 = U(i10);
        int i13 = U10 + i12;
        int i14 = this.f63285b;
        if (i13 <= i14) {
            this.f63284a.seek((long) U10);
            this.f63284a.readFully(bArr, i11, i12);
            return;
        }
        int i15 = i14 - U10;
        this.f63284a.seek((long) U10);
        this.f63284a.readFully(bArr, i11, i15);
        this.f63284a.seek(16);
        this.f63284a.readFully(bArr, i11 + i15, i12 - i15);
    }

    private void F(int i10, byte[] bArr, int i11, int i12) {
        int U10 = U(i10);
        int i13 = U10 + i12;
        int i14 = this.f63285b;
        if (i13 <= i14) {
            this.f63284a.seek((long) U10);
            this.f63284a.write(bArr, i11, i12);
            return;
        }
        int i15 = i14 - U10;
        this.f63284a.seek((long) U10);
        this.f63284a.write(bArr, i11, i15);
        this.f63284a.seek(16);
        this.f63284a.write(bArr, i11 + i15, i12 - i15);
    }

    private void J(int i10) {
        this.f63284a.setLength((long) i10);
        this.f63284a.getChannel().force(true);
    }

    /* access modifiers changed from: private */
    public int U(int i10) {
        int i11 = this.f63285b;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    private void e0(int i10, int i11, int i12, int i13) {
        h0(this.f63289f, i10, i11, i12, i13);
        this.f63284a.seek(0);
        this.f63284a.write(this.f63289f);
    }

    private static void f0(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    private static void h0(byte[] bArr, int... iArr) {
        int i10 = 0;
        for (int f02 : iArr) {
            f0(bArr, i10, f02);
            i10 += 4;
        }
    }

    private void l(int i10) {
        int i11 = i10 + 4;
        int x10 = x();
        if (x10 < i11) {
            int i12 = this.f63285b;
            do {
                x10 += i12;
                i12 <<= 1;
            } while (x10 < i11);
            J(i12);
            b bVar = this.f63288e;
            int U10 = U(bVar.f63294a + 4 + bVar.f63295b);
            if (U10 < this.f63287d.f63294a) {
                FileChannel channel = this.f63284a.getChannel();
                channel.position((long) this.f63285b);
                long j10 = (long) (U10 - 4);
                if (channel.transferTo(16, j10, channel) != j10) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i13 = this.f63288e.f63294a;
            int i14 = this.f63287d.f63294a;
            if (i13 < i14) {
                int i15 = (this.f63285b + i13) - 16;
                e0(i12, this.f63286c, i14, i15);
                this.f63288e = new b(i15, this.f63288e.f63295b);
            } else {
                e0(i12, this.f63286c, i14, i13);
            }
            this.f63285b = i12;
        }
    }

    /* JADX INFO: finally extract failed */
    private static void o(File file) {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile t10 = t(file2);
        try {
            t10.setLength(4096);
            t10.seek(0);
            byte[] bArr = new byte[16];
            h0(bArr, RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT, 0, 0, 0);
            t10.write(bArr);
            t10.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th2) {
            t10.close();
            throw th2;
        }
    }

    /* access modifiers changed from: private */
    public static <T> T s(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    private static RandomAccessFile t(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private b u(int i10) {
        if (i10 == 0) {
            return b.f63293c;
        }
        this.f63284a.seek((long) i10);
        return new b(i10, this.f63284a.readInt());
    }

    private void v() {
        this.f63284a.seek(0);
        this.f63284a.readFully(this.f63289f);
        int w10 = w(this.f63289f, 0);
        this.f63285b = w10;
        if (((long) w10) <= this.f63284a.length()) {
            this.f63286c = w(this.f63289f, 4);
            int w11 = w(this.f63289f, 8);
            int w12 = w(this.f63289f, 12);
            this.f63287d = u(w11);
            this.f63288e = u(w12);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f63285b + ", Actual length: " + this.f63284a.length());
    }

    private static int w(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    private int x() {
        return this.f63285b - N();
    }

    public int N() {
        if (this.f63286c == 0) {
            return 16;
        }
        b bVar = this.f63288e;
        int i10 = bVar.f63294a;
        int i11 = this.f63287d.f63294a;
        return i10 >= i11 ? (i10 - i11) + 4 + bVar.f63295b + 16 : (((i10 + 4) + bVar.f63295b) + this.f63285b) - i11;
    }

    public synchronized void close() {
        this.f63284a.close();
    }

    public void g(byte[] bArr) {
        h(bArr, 0, bArr.length);
    }

    public synchronized void h(byte[] bArr, int i10, int i11) {
        int i12;
        try {
            s(bArr, "buffer");
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new IndexOutOfBoundsException();
            }
            l(i11);
            boolean q10 = q();
            if (q10) {
                i12 = 16;
            } else {
                b bVar = this.f63288e;
                i12 = U(bVar.f63294a + 4 + bVar.f63295b);
            }
            b bVar2 = new b(i12, i11);
            f0(this.f63289f, 0, i11);
            F(bVar2.f63294a, this.f63289f, 0, 4);
            F(bVar2.f63294a + 4, bArr, i10, i11);
            e0(this.f63285b, this.f63286c + 1, q10 ? bVar2.f63294a : this.f63287d.f63294a, bVar2.f63294a);
            this.f63288e = bVar2;
            this.f63286c++;
            if (q10) {
                this.f63287d = bVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void i() {
        try {
            e0(RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT, 0, 0, 0);
            this.f63286c = 0;
            b bVar = b.f63293c;
            this.f63287d = bVar;
            this.f63288e = bVar;
            if (this.f63285b > 4096) {
                J(RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT);
            }
            this.f63285b = RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT;
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized void n(d dVar) {
        int i10 = this.f63287d.f63294a;
        for (int i11 = 0; i11 < this.f63286c; i11++) {
            b u10 = u(i10);
            dVar.a(new c(this, u10, (a) null), u10.f63295b);
            i10 = U(u10.f63294a + 4 + u10.f63295b);
        }
    }

    public synchronized boolean q() {
        return this.f63286c == 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        sb2.append("fileLength=");
        sb2.append(this.f63285b);
        sb2.append(", size=");
        sb2.append(this.f63286c);
        sb2.append(", first=");
        sb2.append(this.f63287d);
        sb2.append(", last=");
        sb2.append(this.f63288e);
        sb2.append(", element lengths=[");
        try {
            n(new a(sb2));
        } catch (IOException e10) {
            f63283g.log(Level.WARNING, "read error", e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public synchronized void z() {
        try {
            if (q()) {
                throw new NoSuchElementException();
            } else if (this.f63286c == 1) {
                i();
            } else {
                b bVar = this.f63287d;
                int U10 = U(bVar.f63294a + 4 + bVar.f63295b);
                B(U10, this.f63289f, 0, 4);
                int w10 = w(this.f63289f, 0);
                e0(this.f63285b, this.f63286c - 1, U10, this.f63288e.f63294a);
                this.f63286c--;
                this.f63287d = new b(U10, w10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
