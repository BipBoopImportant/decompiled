package lo;

import androidx.lifecycle.F;
import androidx.lifecycle.K;
import androidx.lifecycle.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Llo/v;", "Landroidx/lifecycle/f0;", "<init>", "()V", "Llo/s;", "selected", "LXH/N;", "D", "(Llo/s;)V", "Landroidx/lifecycle/K;", "m", "Landroidx/lifecycle/K;", "_selection", "Landroidx/lifecycle/F;", "n", "Landroidx/lifecycle/F;", "C", "()Landroidx/lifecycle/F;", "selection", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final K<s> f99448m;

    /* renamed from: n  reason: collision with root package name */
    private final F<s> f99449n;

    public v() {
        K<s> k10 = new K<>();
        this.f99448m = k10;
        this.f99449n = k10;
    }

    public final F<s> C() {
        return this.f99449n;
    }

    public final void D(s sVar) {
        C17542s.j(sVar, "selected");
        this.f99448m.postValue(sVar);
    }
}
