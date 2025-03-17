package Xo;

import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Size;
import android.view.WindowMetrics;
import androidx.fragment.app.C5187o;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/fragment/app/o;", "Landroid/util/Size;", "a", "(Landroidx/fragment/app/o;)Landroid/util/Size;", "core-android_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {
    public static final Size a(C5187o oVar) {
        C17542s.j(oVar, "<this>");
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics a10 = oVar.requireActivity().getWindowManager().getCurrentWindowMetrics();
            C17542s.i(a10, "getCurrentWindowMetrics(...)");
            return new Size(a10.getBounds().width(), a10.getBounds().height());
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        oVar.requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return new Size(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }
}
