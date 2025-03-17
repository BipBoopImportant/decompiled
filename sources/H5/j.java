package H5;

import B5.h;
import E5.e;
import E5.r;
import H5.i;
import N5.m;
import WK.C16762E;
import WK.C16777l;
import android.webkit.MimeTypeMap;
import dI.C17164e;
import jI.C17423j;
import java.io.Closeable;
import java.io.File;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"LH5/j;", "LH5/i;", "Ljava/io/File;", "data", "<init>", "(Ljava/io/File;)V", "LH5/h;", "a", "(LdI/e;)Ljava/lang/Object;", "Ljava/io/File;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j implements i {

    /* renamed from: a  reason: collision with root package name */
    private final File f36416a;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LH5/j$a;", "LH5/i$a;", "Ljava/io/File;", "<init>", "()V", "data", "LN5/m;", "options", "LB5/h;", "imageLoader", "LH5/i;", "b", "(Ljava/io/File;LN5/m;LB5/h;)LH5/i;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements i.a<File> {
        /* renamed from: b */
        public i a(File file, m mVar, h hVar) {
            return new j(file);
        }
    }

    public j(File file) {
        this.f36416a = file;
    }

    public Object a(C17164e<? super h> eVar) {
        return new m(r.h(C16762E.a.d(C16762E.f139592b, this.f36416a, false, 1, (Object) null), (C16777l) null, (String) null, (Closeable) null, 14, (Object) null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(C17423j.s(this.f36416a)), e.DISK);
    }
}
