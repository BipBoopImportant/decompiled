package k8;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0003\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u0004\u0010\u000f¨\u0006\u0011"}, d2 = {"Lk8/c;", "", "", "isOptIn", "isTracking", "<init>", "(ZZ)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Z", "()Z", "b", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f54359a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f54360b;

    public c(boolean z10, boolean z11) {
        this.f54359a = z10;
        this.f54360b = z11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C17542s.e(c.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C17542s.h(obj, "null cannot be cast to non-null type com.contentsquare.android.api.bridge.xpf.SDKState");
        c cVar = (c) obj;
        return this.f54359a == cVar.f54359a && this.f54360b == cVar.f54360b;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f54360b) + (Boolean.hashCode(this.f54359a) * 31);
    }
}
