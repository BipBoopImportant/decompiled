package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.C5187o;
import c3.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentTagUsageViolation;", "Lc3/c;", "Landroidx/fragment/app/o;", "fragment", "Landroid/view/ViewGroup;", "parentContainer", "<init>", "(Landroidx/fragment/app/o;Landroid/view/ViewGroup;)V", "b", "Landroid/view/ViewGroup;", "getParentContainer", "()Landroid/view/ViewGroup;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FragmentTagUsageViolation extends c {

    /* renamed from: b  reason: collision with root package name */
    private final ViewGroup f22106b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentTagUsageViolation(C5187o oVar, ViewGroup viewGroup) {
        super(oVar, "Attempting to use <fragment> tag to add fragment " + oVar + " to container " + viewGroup);
        C17542s.j(oVar, "fragment");
        this.f22106b = viewGroup;
    }
}
