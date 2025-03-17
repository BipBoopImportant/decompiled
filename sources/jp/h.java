package jp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b\"\u0015\u0010\f\u001a\u00020\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroid/view/ViewGroup;", "", "layoutRes", "", "attach", "Landroid/view/View;", "kotlin.jvm.PlatformType", "b", "(Landroid/view/ViewGroup;IZ)Landroid/view/View;", "Landroid/view/LayoutInflater;", "a", "(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;", "inflater", "view_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h {
    public static final LayoutInflater a(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "<this>");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        C17542s.i(from, "from(...)");
        return from;
    }

    public static final View b(ViewGroup viewGroup, int i10, boolean z10) {
        C17542s.j(viewGroup, "<this>");
        return a(viewGroup).inflate(i10, viewGroup, z10);
    }

    public static /* synthetic */ View c(ViewGroup viewGroup, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return b(viewGroup, i10, z10);
    }
}
