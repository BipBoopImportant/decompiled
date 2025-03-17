package c2;

import android.content.Context;
import d2.C5274a;
import d2.C5275b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/content/Context;", "context", "Lc2/d;", "a", "(Landroid/content/Context;)Lc2/d;", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: c2.a  reason: case insensitive filesystem */
public final class C5266a {
    public static final d a(Context context) {
        float f10 = context.getResources().getConfiguration().fontScale;
        float f11 = context.getResources().getDisplayMetrics().density;
        C5274a b10 = C5275b.f23112a.b(f10);
        if (b10 == null) {
            b10 = new u(f10);
        }
        return new g(f11, f10, b10);
    }
}
