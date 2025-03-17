package oH;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a;\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0003\u0010\u0003\u001a\u00020\u00012\b\b\u0003\u0010\u0004\u001a\u00020\u00012\b\b\u0003\u0010\u0005\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroid/view/ViewGroup$MarginLayoutParams;", "", "left", "top", "right", "bottom", "", "a", "(Landroid/view/ViewGroup$MarginLayoutParams;IIII)Z", "insetter"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class g {
    public static final boolean a(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11, int i12, int i13) {
        C17542s.j(marginLayoutParams, "<this>");
        if (i10 == marginLayoutParams.leftMargin && i11 == marginLayoutParams.topMargin && i12 == marginLayoutParams.rightMargin && i13 == marginLayoutParams.bottomMargin) {
            return false;
        }
        marginLayoutParams.setMargins(i10, i11, i12, i13);
        return true;
    }
}
