package androidx.fragment.app.strictmode;

import androidx.fragment.app.C5187o;
import c3.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/fragment/app/strictmode/TargetFragmentUsageViolation;", "Lc3/c;", "Landroidx/fragment/app/o;", "fragment", "", "message", "<init>", "(Landroidx/fragment/app/o;Ljava/lang/String;)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class TargetFragmentUsageViolation extends c {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TargetFragmentUsageViolation(C5187o oVar, String str) {
        super(oVar, str);
        C17542s.j(oVar, "fragment");
    }
}
