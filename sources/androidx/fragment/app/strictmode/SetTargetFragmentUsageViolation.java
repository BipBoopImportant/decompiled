package androidx.fragment.app.strictmode;

import androidx.fragment.app.C5187o;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/fragment/app/strictmode/SetTargetFragmentUsageViolation;", "Landroidx/fragment/app/strictmode/TargetFragmentUsageViolation;", "Landroidx/fragment/app/o;", "fragment", "targetFragment", "", "requestCode", "<init>", "(Landroidx/fragment/app/o;Landroidx/fragment/app/o;I)V", "b", "Landroidx/fragment/app/o;", "getTargetFragment", "()Landroidx/fragment/app/o;", "c", "I", "getRequestCode", "()I", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SetTargetFragmentUsageViolation extends TargetFragmentUsageViolation {

    /* renamed from: b  reason: collision with root package name */
    private final C5187o f22107b;

    /* renamed from: c  reason: collision with root package name */
    private final int f22108c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SetTargetFragmentUsageViolation(C5187o oVar, C5187o oVar2, int i10) {
        super(oVar, "Attempting to set target fragment " + oVar2 + " with request code " + i10 + " for fragment " + oVar);
        C17542s.j(oVar, "fragment");
        C17542s.j(oVar2, "targetFragment");
        this.f22107b = oVar2;
        this.f22108c = i10;
    }
}
