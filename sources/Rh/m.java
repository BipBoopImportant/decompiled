package RH;

import PH.C16187a;
import PH.C16188b;
import SH.C16416a;
import TH.C16489c;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LRH/m;", "LTH/c;", "LSH/a;", "", "bufferSize", "capacity", "LPH/a;", "allocator", "<init>", "(IILPH/a;)V", "t", "()LSH/a;", "instance", "LXH/N;", "s", "(LSH/a;)V", "u", "q", "(LSH/a;)LSH/a;", "h", "I", "i", "LPH/a;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class m extends C16489c<C16416a> {

    /* renamed from: h  reason: collision with root package name */
    private final int f137970h;

    /* renamed from: i  reason: collision with root package name */
    private final C16187a f137971i;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i10, int i11, C16187a aVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT : i10, (i12 & 2) != 0 ? 1000 : i11, (i12 & 4) != 0 ? C16188b.f137147a : aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public C16416a e(C16416a aVar) {
        C17542s.j(aVar, "instance");
        C16416a aVar2 = (C16416a) super.e(aVar);
        aVar2.H();
        aVar2.r();
        return aVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void f(C16416a aVar) {
        C17542s.j(aVar, "instance");
        this.f137971i.a(aVar.h());
        super.f(aVar);
        aVar.G();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public C16416a h() {
        return new C16416a(this.f137971i.b(this.f137970h), (C16416a) null, this, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void o(C16416a aVar) {
        C17542s.j(aVar, "instance");
        super.o(aVar);
        if (((long) aVar.h().limit()) != ((long) this.f137970h)) {
            throw new IllegalStateException(("Buffer size mismatch. Expected: " + this.f137970h + ", actual: " + ((long) aVar.h().limit())).toString());
        } else if (aVar == C16416a.f138260j.a()) {
            throw new IllegalStateException("ChunkBuffer.Empty couldn't be recycled");
        } else if (aVar == C16368a.f137958g.a()) {
            throw new IllegalStateException("Empty instance couldn't be recycled");
        } else if (aVar.C() != 0) {
            throw new IllegalStateException("Unable to clear buffer: it is still in use.");
        } else if (aVar.A() != null) {
            throw new IllegalStateException("Recycled instance shouldn't be a part of a chain.");
        } else if (aVar.B() != null) {
            throw new IllegalStateException("Recycled instance shouldn't be a view or another buffer.");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(int i10, int i11, C16187a aVar) {
        super(i11);
        C17542s.j(aVar, "allocator");
        this.f137970h = i10;
        this.f137971i = aVar;
    }
}
