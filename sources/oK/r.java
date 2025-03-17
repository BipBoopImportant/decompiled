package oK;

import KJ.C15987c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0003\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0004\u0010\u0015R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LoK/r;", "", "", "isImageDisplayed", "isImageDisplayedInFullQuality", "LKJ/c;", "LoK/t;", "tiles", "<init>", "(ZZLKJ/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "c", "LKJ/c;", "getTiles", "()LKJ/c;", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f145424a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f145425b;

    /* renamed from: c  reason: collision with root package name */
    private final C15987c<t> f145426c;

    public r(boolean z10, boolean z11, C15987c<t> cVar) {
        C17542s.j(cVar, "tiles");
        this.f145424a = z10;
        this.f145425b = z11;
        this.f145426c = cVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f145424a == rVar.f145424a && this.f145425b == rVar.f145425b && C17542s.e(this.f145426c, rVar.f145426c);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f145424a) * 31) + Boolean.hashCode(this.f145425b)) * 31) + this.f145426c.hashCode();
    }

    public String toString() {
        boolean z10 = this.f145424a;
        boolean z11 = this.f145425b;
        C15987c<t> cVar = this.f145426c;
        return "SubSamplingImageSemanticState(isImageDisplayed=" + z10 + ", isImageDisplayedInFullQuality=" + z11 + ", tiles=" + cVar + ")";
    }
}
