package androidx.fragment.app.strictmode;

import androidx.fragment.app.C5187o;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/fragment/app/strictmode/SetRetainInstanceUsageViolation;", "Landroidx/fragment/app/strictmode/RetainInstanceUsageViolation;", "Landroidx/fragment/app/o;", "fragment", "<init>", "(Landroidx/fragment/app/o;)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SetRetainInstanceUsageViolation extends RetainInstanceUsageViolation {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SetRetainInstanceUsageViolation(C5187o oVar) {
        super(oVar, "Attempting to set retain instance for fragment " + oVar);
        C17542s.j(oVar, "fragment");
    }
}
