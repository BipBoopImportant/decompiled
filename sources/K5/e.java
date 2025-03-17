package K5;

import N5.m;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LK5/e;", "LK5/d;", "", "Landroid/net/Uri;", "<init>", "()V", "data", "Landroid/content/Context;", "context", "", "b", "(ILandroid/content/Context;)Z", "LN5/m;", "options", "c", "(ILN5/m;)Landroid/net/Uri;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e implements d<Integer, Uri> {
    private final boolean b(int i10, Context context) {
        try {
            return context.getResources().getResourceEntryName(i10) != null;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    public /* bridge */ /* synthetic */ Object a(Object obj, m mVar) {
        return c(((Number) obj).intValue(), mVar);
    }

    public Uri c(int i10, m mVar) {
        if (!b(i10, mVar.g())) {
            return null;
        }
        return Uri.parse("android.resource://" + mVar.g().getPackageName() + '/' + i10);
    }
}
