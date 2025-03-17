package RH;

import SH.C16416a;
import TH.C16492f;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0004¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001a\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"LRH/k;", "LRH/n;", "LSH/a;", "head", "", "remaining", "LTH/f;", "pool", "<init>", "(LSH/a;JLTH/f;)V", "a1", "()LRH/k;", "w", "()LSH/a;", "LPH/c;", "destination", "", "offset", "length", "x", "(Ljava/nio/ByteBuffer;II)I", "LXH/N;", "h", "()V", "", "toString", "()Ljava/lang/String;", "i", "a", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k extends n {

    /* renamed from: i  reason: collision with root package name */
    public static final a f137966i = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final k f137967j;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LRH/k$a;", "", "<init>", "()V", "LRH/k;", "Empty", "LRH/k;", "a", "()LRH/k;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a() {
            return k.f137967j;
        }

        private a() {
        }
    }

    static {
        C16416a.d dVar = C16416a.f138260j;
        f137967j = new k(dVar.a(), 0, dVar.b());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(C16416a aVar, long j10, C16492f<C16416a> fVar) {
        super(aVar, j10, fVar);
        C17542s.j(aVar, "head");
        C17542s.j(fVar, "pool");
        j0();
    }

    public final k a1() {
        return new k(C16375h.a(N()), i0(), h0());
    }

    /* access modifiers changed from: protected */
    public final void h() {
    }

    public String toString() {
        return "ByteReadPacket[" + hashCode() + ']';
    }

    /* access modifiers changed from: protected */
    public final C16416a w() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final int x(ByteBuffer byteBuffer, int i10, int i11) {
        C17542s.j(byteBuffer, "destination");
        return 0;
    }
}
