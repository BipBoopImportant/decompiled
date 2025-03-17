package v0;

import U0.A1;
import U0.C4899r0;
import U0.p1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tI.C17974j;
import tI.C17978n;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR+\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028V@RX\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\r¨\u0006\u0019"}, d2 = {"Lv0/B;", "LU0/A1;", "LtI/j;", "", "firstVisibleItem", "slidingWindowSize", "extraItemCount", "<init>", "(III)V", "LXH/N;", "m", "(I)V", "a", "I", "b", "<set-?>", "c", "LU0/r0;", "d", "()LtI/j;", "i", "(LtI/j;)V", "value", "lastFirstVisibleItem", "e", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v0.B  reason: case insensitive filesystem */
public final class C6128B implements A1<C17974j> {

    /* renamed from: e  reason: collision with root package name */
    private static final a f30785e = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f30786a;

    /* renamed from: b  reason: collision with root package name */
    private final int f30787b;

    /* renamed from: c  reason: collision with root package name */
    private final C4899r0 f30788c;

    /* renamed from: d  reason: collision with root package name */
    private int f30789d;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lv0/B$a;", "", "<init>", "()V", "", "firstVisibleItem", "slidingWindowSize", "extraItemCount", "LtI/j;", "b", "(III)LtI/j;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v0.B$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final C17974j b(int i10, int i11, int i12) {
            int i13 = (i10 / i11) * i11;
            return C17978n.w(Math.max(i13 - i12, 0), i13 + i11 + i12);
        }

        private a() {
        }
    }

    public C6128B(int i10, int i11, int i12) {
        this.f30786a = i11;
        this.f30787b = i12;
        this.f30788c = p1.i(f30785e.b(i10, i11, i12), p1.s());
        this.f30789d = i10;
    }

    private void i(C17974j jVar) {
        this.f30788c.setValue(jVar);
    }

    /* renamed from: d */
    public C17974j getValue() {
        return (C17974j) this.f30788c.getValue();
    }

    public final void m(int i10) {
        if (i10 != this.f30789d) {
            this.f30789d = i10;
            i(f30785e.b(i10, this.f30786a, this.f30787b));
        }
    }
}
