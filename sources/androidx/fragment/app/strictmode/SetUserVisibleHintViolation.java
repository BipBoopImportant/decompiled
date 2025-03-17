package androidx.fragment.app.strictmode;

import androidx.fragment.app.C5187o;
import c3.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0005\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/fragment/app/strictmode/SetUserVisibleHintViolation;", "Lc3/c;", "Landroidx/fragment/app/o;", "fragment", "", "isVisibleToUser", "<init>", "(Landroidx/fragment/app/o;Z)V", "b", "Z", "()Z", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SetUserVisibleHintViolation extends c {

    /* renamed from: b  reason: collision with root package name */
    private final boolean f22109b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SetUserVisibleHintViolation(C5187o oVar, boolean z10) {
        super(oVar, "Attempting to set user visible hint to " + z10 + " for fragment " + oVar);
        C17542s.j(oVar, "fragment");
        this.f22109b = z10;
    }
}
