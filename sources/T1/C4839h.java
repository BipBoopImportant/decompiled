package T1;

import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0012¨\u0006\u001a"}, d2 = {"LT1/h;", "LT1/i;", "", "lengthBeforeCursor", "lengthAfterCursor", "<init>", "(II)V", "LT1/l;", "buffer", "LXH/N;", "a", "(LT1/l;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "getLengthBeforeCursor", "b", "getLengthAfterCursor", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: T1.h  reason: case insensitive filesystem */
public final class C4839h implements C4840i {

    /* renamed from: a  reason: collision with root package name */
    private final int f13603a;

    /* renamed from: b  reason: collision with root package name */
    private final int f13604b;

    public C4839h(int i10, int i11) {
        this.f13603a = i10;
        this.f13604b = i11;
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.").toString());
        }
    }

    public void a(C4843l lVar) {
        int i10 = this.f13603a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 < i10) {
                int i14 = i13 + 1;
                if (lVar.k() <= i14) {
                    i13 = lVar.k();
                    break;
                } else {
                    i13 = C4841j.b(lVar.c((lVar.k() - i14) + -1), lVar.c(lVar.k() - i14)) ? i13 + 2 : i14;
                    i12++;
                }
            } else {
                break;
            }
        }
        int i15 = this.f13604b;
        int i16 = 0;
        while (true) {
            if (i11 >= i15) {
                break;
            }
            int i17 = i16 + 1;
            if (lVar.j() + i17 >= lVar.h()) {
                i16 = lVar.h() - lVar.j();
                break;
            } else {
                i16 = C4841j.b(lVar.c((lVar.j() + i17) + -1), lVar.c(lVar.j() + i17)) ? i16 + 2 : i17;
                i11++;
            }
        }
        lVar.b(lVar.j(), lVar.j() + i16);
        lVar.b(lVar.k() - i13, lVar.k());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4839h)) {
            return false;
        }
        C4839h hVar = (C4839h) obj;
        return this.f13603a == hVar.f13603a && this.f13604b == hVar.f13604b;
    }

    public int hashCode() {
        return (this.f13603a * 31) + this.f13604b;
    }

    public String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.f13603a + ", lengthAfterCursor=" + this.f13604b + ')';
    }
}
