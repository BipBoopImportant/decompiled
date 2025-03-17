package Y5;

import WK.C16762E;
import WK.C16777l;
import dI.C17168i;
import dI.C17169j;
import kotlin.Metadata;
import r6.k;
import r6.l;
import tI.C17978n;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"LY5/a;", "", "", "key", "LY5/a$c;", "t", "(Ljava/lang/String;)LY5/a$c;", "LY5/a$b;", "s", "(Ljava/lang/String;)LY5/a$b;", "LWK/l;", "r", "()LWK/l;", "fileSystem", "c", "b", "a", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"LY5/a$a;", "", "<init>", "()V", "LWK/E;", "directory", "b", "(LWK/E;)LY5/a$a;", "LY5/a;", "a", "()LY5/a;", "LWK/E;", "LWK/l;", "LWK/l;", "fileSystem", "", "c", "D", "maxSizePercent", "", "d", "J", "minimumMaxSizeBytes", "e", "maximumMaxSizeBytes", "f", "maxSizeBytes", "LdI/i;", "g", "LdI/i;", "cleanupCoroutineContext", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Y5.a$a  reason: collision with other inner class name */
    public static final class C0682a {

        /* renamed from: a  reason: collision with root package name */
        private C16762E f40822a;

        /* renamed from: b  reason: collision with root package name */
        private C16777l f40823b = l.a();

        /* renamed from: c  reason: collision with root package name */
        private double f40824c = 0.02d;

        /* renamed from: d  reason: collision with root package name */
        private long f40825d = 10485760;

        /* renamed from: e  reason: collision with root package name */
        private long f40826e = 262144000;

        /* renamed from: f  reason: collision with root package name */
        private long f40827f;

        /* renamed from: g  reason: collision with root package name */
        private C17168i f40828g = C17169j.f142968a;

        public final a a() {
            long j10;
            C16762E e10 = this.f40822a;
            if (e10 != null) {
                double d10 = this.f40824c;
                if (d10 > 0.0d) {
                    try {
                        j10 = C17978n.o((long) (d10 * ((double) k.a(this.f40823b, e10))), this.f40825d, this.f40826e);
                    } catch (Exception unused) {
                        j10 = this.f40825d;
                    }
                } else {
                    j10 = this.f40827f;
                }
                return new e(j10, e10, this.f40823b, this.f40828g);
            }
            throw new IllegalStateException("directory == null");
        }

        public final C0682a b(C16762E e10) {
            this.f40822a = e10;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"LY5/a$b;", "", "LY5/a$c;", "l", "()LY5/a$c;", "LXH/N;", "k", "()V", "LWK/E;", "j", "()LWK/E;", "metadata", "getData", "data", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
        C16762E getData();

        C16762E j();

        void k();

        c l();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"LY5/a$c;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "LY5/a$b;", "I", "()LY5/a$b;", "LWK/E;", "j", "()LWK/E;", "metadata", "getData", "data", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface c extends AutoCloseable {
        b I();

        C16762E getData();

        C16762E j();
    }

    C16777l r();

    b s(String str);

    c t(String str);
}
