package K5;

import HJ.C15854t;
import N5.m;
import S5.j;
import android.net.Uri;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LK5/b;", "LK5/d;", "Landroid/net/Uri;", "Ljava/io/File;", "<init>", "()V", "data", "", "b", "(Landroid/net/Uri;)Z", "LN5/m;", "options", "c", "(Landroid/net/Uri;LN5/m;)Ljava/io/File;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements d<Uri, File> {
    private final boolean b(Uri uri) {
        if (j.s(uri)) {
            return false;
        }
        String scheme = uri.getScheme();
        if (scheme != null && !C17542s.e(scheme, "file")) {
            return false;
        }
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        return C15854t.e1(path, '/', false, 2, (Object) null) && j.i(uri) != null;
    }

    /* renamed from: c */
    public File a(Uri uri, m mVar) {
        if (!b(uri)) {
            return null;
        }
        if (!C17542s.e(uri.getScheme(), "file")) {
            return new File(uri.toString());
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        return null;
    }
}
