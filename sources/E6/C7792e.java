package e6;

import T5.G;
import T5.H;
import android.content.Context;
import android.content.res.Resources;
import k6.C8450q;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Le6/e;", "Le6/c;", "", "LT5/G;", "<init>", "()V", "data", "Landroid/content/Context;", "context", "", "b", "(ILandroid/content/Context;)Z", "Lk6/q;", "options", "c", "(ILk6/q;)LT5/G;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: e6.e  reason: case insensitive filesystem */
public final class C7792e implements C7790c<Integer, G> {
    private final boolean b(int i10, Context context) {
        try {
            return context.getResources().getResourceEntryName(i10) != null;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    public /* bridge */ /* synthetic */ Object a(Object obj, C8450q qVar) {
        return c(((Number) obj).intValue(), qVar);
    }

    public G c(int i10, C8450q qVar) {
        if (!b(i10, qVar.c())) {
            return null;
        }
        return H.j("android.resource://" + qVar.c().getPackageName() + '/' + i10, (String) null, 1, (Object) null);
    }
}
