package l7;

import YH.C16870n;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l7.C8533b;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0005\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "Ll7/b;", "b", "([B)Ll7/b;", "", "a", "(Ljava/util/List;)Ll7/b;", "certificatetransparency"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: l7.e  reason: case insensitive filesystem */
public final class C8536e {

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"l7/e$a", "Ll7/b;", "", "index", "", "get", "(I)B", "fromIndex", "toIndex", "", "P2", "(II)[B", "e0", "(II)Ll7/b;", "a", "()I", "size", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: l7.e$a */
    public static final class a implements C8533b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ byte[] f54795a;

        a(byte[] bArr) {
            this.f54795a = bArr;
        }

        public byte[] P2(int i10, int i11) {
            return C16870n.s(this.f54795a, i10, i11);
        }

        public int a() {
            return this.f54795a.length;
        }

        public C8533b e0(int i10, int i11) {
            return new C8532a(this, i10, i11);
        }

        public byte get(int i10) {
            return this.f54795a[i10];
        }

        public Iterator<Byte> iterator() {
            return C8533b.a.a(this);
        }
    }

    public static final C8533b a(List<? extends C8533b> list) {
        C17542s.j(list, "<this>");
        return new C8535d(list);
    }

    public static final C8533b b(byte[] bArr) {
        C17542s.j(bArr, "<this>");
        return new a(bArr);
    }
}
