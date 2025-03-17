package Mi;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LMi/c;", "LMi/l;", "", "showEmptyText", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Mi.c  reason: case insensitive filesystem */
public final class C10768c implements C10777l {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f83381a;

    public C10768c(boolean z10) {
        this.f83381a = z10;
    }

    public boolean a() {
        return this.f83381a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10768c) && this.f83381a == ((C10768c) obj).f83381a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f83381a);
    }

    public String toString() {
        boolean z10 = this.f83381a;
        return "GlobalSectionHeader(showEmptyText=" + z10 + ")";
    }
}
