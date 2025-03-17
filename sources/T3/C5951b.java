package t3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: t3.b  reason: case insensitive filesystem */
public final class C5951b {

    /* renamed from: a  reason: collision with root package name */
    private final File f29479a;

    /* renamed from: b  reason: collision with root package name */
    private final File f29480b;

    /* renamed from: t3.b$a */
    private static final class a extends OutputStream {

        /* renamed from: a  reason: collision with root package name */
        private final FileOutputStream f29481a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f29482b = false;

        public a(File file) {
            this.f29481a = new FileOutputStream(file);
        }

        public void close() {
            if (!this.f29482b) {
                this.f29482b = true;
                flush();
                try {
                    this.f29481a.getFD().sync();
                } catch (IOException e10) {
                    q.i("AtomicFile", "Failed to sync file descriptor:", e10);
                }
                this.f29481a.close();
            }
        }

        public void flush() {
            this.f29481a.flush();
        }

        public void write(int i10) {
            this.f29481a.write(i10);
        }

        public void write(byte[] bArr) {
            this.f29481a.write(bArr);
        }

        public void write(byte[] bArr, int i10, int i11) {
            this.f29481a.write(bArr, i10, i11);
        }
    }

    public C5951b(File file) {
        this.f29479a = file;
        this.f29480b = new File(file.getPath() + ".bak");
    }

    private void e() {
        if (this.f29480b.exists()) {
            this.f29479a.delete();
            this.f29480b.renameTo(this.f29479a);
        }
    }

    public void a() {
        this.f29479a.delete();
        this.f29480b.delete();
    }

    public void b(OutputStream outputStream) {
        outputStream.close();
        this.f29480b.delete();
    }

    public boolean c() {
        return this.f29479a.exists() || this.f29480b.exists();
    }

    public InputStream d() {
        e();
        return new FileInputStream(this.f29479a);
    }

    public OutputStream f() {
        if (this.f29479a.exists()) {
            if (this.f29480b.exists()) {
                this.f29479a.delete();
            } else if (!this.f29479a.renameTo(this.f29480b)) {
                q.h("AtomicFile", "Couldn't rename file " + this.f29479a + " to backup file " + this.f29480b);
            }
        }
        try {
            return new a(this.f29479a);
        } catch (FileNotFoundException e10) {
            File parentFile = this.f29479a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + this.f29479a, e10);
            }
            try {
                return new a(this.f29479a);
            } catch (FileNotFoundException e11) {
                throw new IOException("Couldn't create " + this.f29479a, e11);
            }
        }
    }
}
