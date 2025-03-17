package l7;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l7.C8533b;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017¨\u0006#"}, d2 = {"Ll7/a;", "Ll7/b;", "byteBuffer", "", "startIndex", "endIndex", "<init>", "(Ll7/b;II)V", "index", "", "get", "(I)B", "fromIndex", "toIndex", "", "P2", "(II)[B", "e0", "(II)Ll7/b;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ll7/b;", "b", "I", "c", "size", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: l7.a  reason: case insensitive filesystem */
public final class C8532a implements C8533b {

    /* renamed from: a  reason: collision with root package name */
    private final C8533b f54784a;

    /* renamed from: b  reason: collision with root package name */
    private final int f54785b;

    /* renamed from: c  reason: collision with root package name */
    private final int f54786c;

    public C8532a(C8533b bVar, int i10, int i11) {
        C17542s.j(bVar, "byteBuffer");
        this.f54784a = bVar;
        this.f54785b = i10;
        this.f54786c = i11;
    }

    public byte[] P2(int i10, int i11) {
        if (i11 > a()) {
            throw new IllegalArgumentException(("toIndex: " + i11 + ", size: " + a()).toString());
        } else if (i11 - i10 >= 0) {
            C8533b bVar = this.f54784a;
            int i12 = this.f54785b;
            return bVar.P2(i10 + i12, i11 + i12);
        } else {
            throw new IllegalArgumentException((i10 + " > " + i11).toString());
        }
    }

    public int a() {
        return this.f54786c - this.f54785b;
    }

    public C8533b e0(int i10, int i11) {
        if (i11 > a()) {
            throw new IllegalArgumentException(("toIndex: " + i11 + ", size: " + a()).toString());
        } else if (i11 - i10 >= 0) {
            C8533b bVar = this.f54784a;
            int i12 = this.f54785b;
            return new C8532a(bVar, i10 + i12, i11 + i12);
        } else {
            throw new IllegalArgumentException((i10 + " > " + i11).toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8532a)) {
            return false;
        }
        C8532a aVar = (C8532a) obj;
        return C17542s.e(this.f54784a, aVar.f54784a) && this.f54785b == aVar.f54785b && this.f54786c == aVar.f54786c;
    }

    public byte get(int i10) {
        return this.f54784a.get(i10 + this.f54785b);
    }

    public int hashCode() {
        return (((this.f54784a.hashCode() * 31) + Integer.hashCode(this.f54785b)) * 31) + Integer.hashCode(this.f54786c);
    }

    public Iterator<Byte> iterator() {
        return C8533b.a.a(this);
    }

    public String toString() {
        return "BasicByteBuffer(byteBuffer=" + this.f54784a + ", startIndex=" + this.f54785b + ", endIndex=" + this.f54786c + ')';
    }
}
