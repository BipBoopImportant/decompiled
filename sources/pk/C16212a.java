package PK;

import WK.L;
import WK.N;
import WK.y;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\bf\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\r¨\u0006\u001a"}, d2 = {"LPK/a;", "", "Ljava/io/File;", "file", "LWK/N;", "d", "(Ljava/io/File;)LWK/N;", "LWK/L;", "e", "(Ljava/io/File;)LWK/L;", "b", "LXH/N;", "g", "(Ljava/io/File;)V", "", "exists", "(Ljava/io/File;)Z", "", "c", "(Ljava/io/File;)J", "from", "to", "f", "(Ljava/io/File;Ljava/io/File;)V", "directory", "a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: PK.a  reason: case insensitive filesystem */
public interface C16212a {

    /* renamed from: a  reason: collision with root package name */
    public static final C3367a f137204a = C3367a.f137206a;

    /* renamed from: b  reason: collision with root package name */
    public static final C16212a f137205b = new C3367a.C3368a();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\b"}, d2 = {"LPK/a$a;", "", "<init>", "()V", "LPK/a;", "SYSTEM", "LPK/a;", "a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: PK.a$a  reason: collision with other inner class name */
    public static final class C3367a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C3367a f137206a = new C3367a();

        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u000fJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"LPK/a$a$a;", "LPK/a;", "<init>", "()V", "Ljava/io/File;", "file", "LWK/N;", "d", "(Ljava/io/File;)LWK/N;", "LWK/L;", "e", "(Ljava/io/File;)LWK/L;", "b", "LXH/N;", "g", "(Ljava/io/File;)V", "", "exists", "(Ljava/io/File;)Z", "", "c", "(Ljava/io/File;)J", "from", "to", "f", "(Ljava/io/File;Ljava/io/File;)V", "directory", "a", "", "toString", "()Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: PK.a$a$a  reason: collision with other inner class name */
        private static final class C3368a implements C16212a {
            public void a(File file) {
                C17542s.j(file, "directory");
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    int length = listFiles.length;
                    int i10 = 0;
                    while (i10 < length) {
                        File file2 = listFiles[i10];
                        if (file2.isDirectory()) {
                            C17542s.i(file2, "file");
                            a(file2);
                        }
                        if (file2.delete()) {
                            i10++;
                        } else {
                            throw new IOException("failed to delete " + file2);
                        }
                    }
                    return;
                }
                throw new IOException("not a readable directory: " + file);
            }

            public L b(File file) {
                C17542s.j(file, "file");
                try {
                    return y.a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return y.a(file);
                }
            }

            public long c(File file) {
                C17542s.j(file, "file");
                return file.length();
            }

            public N d(File file) {
                C17542s.j(file, "file");
                return y.k(file);
            }

            public L e(File file) {
                C17542s.j(file, "file");
                try {
                    return z.g(file, false, 1, (Object) null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return z.g(file, false, 1, (Object) null);
                }
            }

            public boolean exists(File file) {
                C17542s.j(file, "file");
                return file.exists();
            }

            public void f(File file, File file2) {
                C17542s.j(file, "from");
                C17542s.j(file2, "to");
                g(file2);
                if (!file.renameTo(file2)) {
                    throw new IOException("failed to rename " + file + " to " + file2);
                }
            }

            public void g(File file) {
                C17542s.j(file, "file");
                if (!file.delete() && file.exists()) {
                    throw new IOException("failed to delete " + file);
                }
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private C3367a() {
        }
    }

    void a(File file);

    L b(File file);

    long c(File file);

    N d(File file);

    L e(File file);

    boolean exists(File file);

    void f(File file, File file2);

    void g(File file);
}
