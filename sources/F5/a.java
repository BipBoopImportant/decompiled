package F5;

import QJ.C16311i0;
import QJ.M;
import WK.C16762E;
import WK.C16777l;
import android.os.StatFs;
import java.io.Closeable;
import java.io.File;
import kotlin.Metadata;
import tI.C17978n;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8&X§\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"LF5/a;", "", "", "key", "LF5/a$c;", "t", "(Ljava/lang/String;)LF5/a$c;", "LF5/a$b;", "s", "(Ljava/lang/String;)LF5/a$b;", "LWK/l;", "r", "()LWK/l;", "getFileSystem$annotations", "()V", "fileSystem", "c", "b", "a", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface a {

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"LF5/a$a;", "", "<init>", "()V", "Ljava/io/File;", "directory", "c", "(Ljava/io/File;)LF5/a$a;", "LWK/E;", "b", "(LWK/E;)LF5/a$a;", "LF5/a;", "a", "()LF5/a;", "LWK/E;", "LWK/l;", "LWK/l;", "fileSystem", "", "D", "maxSizePercent", "", "d", "J", "minimumMaxSizeBytes", "e", "maximumMaxSizeBytes", "f", "maxSizeBytes", "LQJ/M;", "g", "LQJ/M;", "cleanupDispatcher", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: F5.a$a  reason: collision with other inner class name */
    public static final class C0570a {

        /* renamed from: a  reason: collision with root package name */
        private C16762E f35408a;

        /* renamed from: b  reason: collision with root package name */
        private C16777l f35409b = C16777l.f139691b;

        /* renamed from: c  reason: collision with root package name */
        private double f35410c = 0.02d;

        /* renamed from: d  reason: collision with root package name */
        private long f35411d = 10485760;

        /* renamed from: e  reason: collision with root package name */
        private long f35412e = 262144000;

        /* renamed from: f  reason: collision with root package name */
        private long f35413f;

        /* renamed from: g  reason: collision with root package name */
        private M f35414g = C16311i0.b();

        public final a a() {
            long j10;
            C16762E e10 = this.f35408a;
            if (e10 != null) {
                if (this.f35410c > 0.0d) {
                    try {
                        File I10 = e10.I();
                        I10.mkdir();
                        StatFs statFs = new StatFs(I10.getAbsolutePath());
                        j10 = C17978n.o((long) (this.f35410c * ((double) statFs.getBlockCountLong()) * ((double) statFs.getBlockSizeLong())), this.f35411d, this.f35412e);
                    } catch (Exception unused) {
                        j10 = this.f35411d;
                    }
                } else {
                    j10 = this.f35413f;
                }
                return new e(j10, e10, this.f35409b, this.f35414g);
            }
            throw new IllegalStateException("directory == null");
        }

        public final C0570a b(C16762E e10) {
            this.f35408a = e10;
            return this;
        }

        public final C0570a c(File file) {
            return b(C16762E.a.d(C16762E.f139592b, file, false, 1, (Object) null));
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"LF5/a$b;", "", "LF5/a$c;", "l", "()LF5/a$c;", "LXH/N;", "k", "()V", "LWK/E;", "j", "()LWK/E;", "metadata", "getData", "data", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b {
        C16762E getData();

        C16762E j();

        void k();

        c l();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"LF5/a$c;", "Ljava/io/Closeable;", "Lokio/Closeable;", "LXH/N;", "close", "()V", "LF5/a$b;", "I", "()LF5/a$b;", "LWK/E;", "j", "()LWK/E;", "metadata", "getData", "data", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface c extends Closeable {
        b I();

        void close();

        C16762E getData();

        C16762E j();
    }

    C16777l r();

    b s(String str);

    c t(String str);
}
