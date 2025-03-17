package RH;

import SH.C16416a;
import TH.C16492f;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0004¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001a\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0011\u0010$\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010(\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b&\u0010'\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006)"}, d2 = {"LRH/j;", "LRH/s;", "LTH/f;", "LSH/a;", "pool", "<init>", "(LTH/f;)V", "LXH/N;", "q", "()V", "LPH/c;", "source", "", "offset", "length", "s", "(Ljava/nio/ByteBuffer;II)V", "", "value", "l0", "(C)LRH/j;", "", "o0", "(Ljava/lang/CharSequence;)LRH/j;", "startIndex", "endIndex", "p0", "(Ljava/lang/CharSequence;II)LRH/j;", "LRH/k;", "t0", "()LRH/k;", "", "toString", "()Ljava/lang/String;", "A0", "()I", "size", "", "E0", "()Z", "isEmpty", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j extends s {
    public j() {
        this((C16492f) null, 1, (DefaultConstructorMarker) null);
    }

    public final int A0() {
        return B();
    }

    public final boolean E0() {
        return B() == 0;
    }

    /* renamed from: l0 */
    public j e(char c10) {
        s e10 = super.append(c10);
        C17542s.h(e10, "null cannot be cast to non-null type io.ktor.utils.io.core.BytePacketBuilder");
        return (j) e10;
    }

    /* renamed from: o0 */
    public j f(CharSequence charSequence) {
        s f10 = super.append(charSequence);
        C17542s.h(f10, "null cannot be cast to non-null type io.ktor.utils.io.core.BytePacketBuilder");
        return (j) f10;
    }

    /* renamed from: p0 */
    public j g(CharSequence charSequence, int i10, int i11) {
        s g10 = super.append(charSequence, i10, i11);
        C17542s.h(g10, "null cannot be cast to non-null type io.ktor.utils.io.core.BytePacketBuilder");
        return (j) g10;
    }

    /* access modifiers changed from: protected */
    public final void q() {
    }

    /* access modifiers changed from: protected */
    public final void s(ByteBuffer byteBuffer, int i10, int i11) {
        C17542s.j(byteBuffer, "source");
    }

    public final k t0() {
        int A02 = A0();
        C16416a U10 = U();
        return U10 == null ? k.f137966i.a() : new k(U10, (long) A02, v());
    }

    public String toString() {
        return "BytePacketBuilder[0x" + hashCode() + ']';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(C16492f<C16416a> fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C16416a.f138260j.c() : fVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(C16492f<C16416a> fVar) {
        super(fVar);
        C17542s.j(fVar, "pool");
    }
}
