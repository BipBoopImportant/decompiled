package J5;

import N5.m;
import S5.j;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LJ5/c;", "LJ5/b;", "Landroid/net/Uri;", "<init>", "()V", "data", "LN5/m;", "options", "", "b", "(Landroid/net/Uri;LN5/m;)Ljava/lang/String;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c implements b<Uri> {
    /* renamed from: b */
    public String a(Uri uri, m mVar) {
        if (!C17542s.e(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(uri);
        sb2.append('-');
        sb2.append(j.m(mVar.g().getResources().getConfiguration()));
        return sb2.toString();
    }
}
