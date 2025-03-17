package J5;

import N5.m;
import java.io.File;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LJ5/a;", "LJ5/b;", "Ljava/io/File;", "", "addLastModifiedToFileCacheKey", "<init>", "(Z)V", "data", "LN5/m;", "options", "", "b", "(Ljava/io/File;LN5/m;)Ljava/lang/String;", "a", "Z", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements b<File> {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f37349a;

    public a(boolean z10) {
        this.f37349a = z10;
    }

    /* renamed from: b */
    public String a(File file, m mVar) {
        if (!this.f37349a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
