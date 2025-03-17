package z7;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: z7.b  reason: case insensitive filesystem */
class C9033b implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f58515a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Charset f58516b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f58517c;

    /* renamed from: d  reason: collision with root package name */
    private int f58518d;

    /* renamed from: e  reason: collision with root package name */
    private int f58519e;

    /* renamed from: z7.b$a */
    class a extends ByteArrayOutputStream {
        a(int i10) {
            super(i10);
        }

        public String toString() {
            int i10 = this.count;
            if (i10 > 0 && this.buf[i10 - 1] == 13) {
                i10--;
            }
            try {
                return new String(this.buf, 0, i10, C9033b.this.f58516b.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public C9033b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void d() {
        InputStream inputStream = this.f58515a;
        byte[] bArr = this.f58517c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f58518d = 0;
            this.f58519e = read;
            return;
        }
        throw new EOFException();
    }

    public void close() {
        synchronized (this.f58515a) {
            try {
                if (this.f58517c != null) {
                    this.f58517c = null;
                    this.f58515a.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean e() {
        return this.f58519e == -1;
    }

    public String f() {
        int i10;
        byte[] bArr;
        int i11;
        synchronized (this.f58515a) {
            try {
                if (this.f58517c != null) {
                    if (this.f58518d >= this.f58519e) {
                        d();
                    }
                    for (int i12 = this.f58518d; i12 != this.f58519e; i12++) {
                        byte[] bArr2 = this.f58517c;
                        if (bArr2[i12] == 10) {
                            int i13 = this.f58518d;
                            if (i12 != i13) {
                                i11 = i12 - 1;
                                if (bArr2[i11] == 13) {
                                    String str = new String(bArr2, i13, i11 - i13, this.f58516b.name());
                                    this.f58518d = i12 + 1;
                                    return str;
                                }
                            }
                            i11 = i12;
                            String str2 = new String(bArr2, i13, i11 - i13, this.f58516b.name());
                            this.f58518d = i12 + 1;
                            return str2;
                        }
                    }
                    a aVar = new a((this.f58519e - this.f58518d) + 80);
                    loop1:
                    while (true) {
                        byte[] bArr3 = this.f58517c;
                        int i14 = this.f58518d;
                        aVar.write(bArr3, i14, this.f58519e - i14);
                        this.f58519e = -1;
                        d();
                        i10 = this.f58518d;
                        while (true) {
                            if (i10 != this.f58519e) {
                                bArr = this.f58517c;
                                if (bArr[i10] == 10) {
                                    break loop1;
                                }
                                i10++;
                            }
                        }
                    }
                    int i15 = this.f58518d;
                    if (i10 != i15) {
                        aVar.write(bArr, i15, i10 - i15);
                    }
                    this.f58518d = i10 + 1;
                    String byteArrayOutputStream = aVar.toString();
                    return byteArrayOutputStream;
                }
                throw new IOException("LineReader is closed");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C9033b(InputStream inputStream, int i10, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i10 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(C9034c.f58521a)) {
            this.f58515a = inputStream;
            this.f58516b = charset;
            this.f58517c = new byte[i10];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }
}
