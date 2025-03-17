package T1;

import kotlin.Metadata;
import tI.C17978n;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0012¨\u0006\u001a"}, d2 = {"LT1/M;", "LT1/i;", "", "start", "end", "<init>", "(II)V", "LT1/l;", "buffer", "LXH/N;", "a", "(LT1/l;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "getStart", "b", "getEnd", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class M implements C4840i {

    /* renamed from: a  reason: collision with root package name */
    private final int f13531a;

    /* renamed from: b  reason: collision with root package name */
    private final int f13532b;

    public M(int i10, int i11) {
        this.f13531a = i10;
        this.f13532b = i11;
    }

    public void a(C4843l lVar) {
        if (lVar.l()) {
            lVar.a();
        }
        int m10 = C17978n.m(this.f13531a, 0, lVar.h());
        int m11 = C17978n.m(this.f13532b, 0, lVar.h());
        if (m10 == m11) {
            return;
        }
        if (m10 < m11) {
            lVar.n(m10, m11);
        } else {
            lVar.n(m11, m10);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m10 = (M) obj;
        return this.f13531a == m10.f13531a && this.f13532b == m10.f13532b;
    }

    public int hashCode() {
        return (this.f13531a * 31) + this.f13532b;
    }

    public String toString() {
        return "SetComposingRegionCommand(start=" + this.f13531a + ", end=" + this.f13532b + ')';
    }
}
