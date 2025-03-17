package T1;

import kotlin.Metadata;
import tI.C17978n;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0012¨\u0006\u001a"}, d2 = {"LT1/O;", "LT1/i;", "", "start", "end", "<init>", "(II)V", "LT1/l;", "buffer", "LXH/N;", "a", "(LT1/l;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "getStart", "b", "getEnd", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class O implements C4840i {

    /* renamed from: a  reason: collision with root package name */
    private final int f13535a;

    /* renamed from: b  reason: collision with root package name */
    private final int f13536b;

    public O(int i10, int i11) {
        this.f13535a = i10;
        this.f13536b = i11;
    }

    public void a(C4843l lVar) {
        int m10 = C17978n.m(this.f13535a, 0, lVar.h());
        int m11 = C17978n.m(this.f13536b, 0, lVar.h());
        if (m10 < m11) {
            lVar.p(m10, m11);
        } else {
            lVar.p(m11, m10);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o10 = (O) obj;
        return this.f13535a == o10.f13535a && this.f13536b == o10.f13536b;
    }

    public int hashCode() {
        return (this.f13535a * 31) + this.f13536b;
    }

    public String toString() {
        return "SetSelectionCommand(start=" + this.f13535a + ", end=" + this.f13536b + ')';
    }
}
