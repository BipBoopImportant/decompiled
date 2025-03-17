package K1;

import E1.C4488v;
import L1.p;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u000f\u0010\u001a¨\u0006\u001b"}, d2 = {"LK1/m;", "", "LL1/p;", "node", "", "depth", "Lc2/p;", "viewportBoundsInWindow", "LE1/v;", "coordinates", "<init>", "(LL1/p;ILc2/p;LE1/v;)V", "", "toString", "()Ljava/lang/String;", "a", "LL1/p;", "c", "()LL1/p;", "b", "I", "()I", "Lc2/p;", "d", "()Lc2/p;", "LE1/v;", "()LE1/v;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class m {

    /* renamed from: a  reason: collision with root package name */
    private final p f8908a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8909b;

    /* renamed from: c  reason: collision with root package name */
    private final c2.p f8910c;

    /* renamed from: d  reason: collision with root package name */
    private final C4488v f8911d;

    public m(p pVar, int i10, c2.p pVar2, C4488v vVar) {
        this.f8908a = pVar;
        this.f8909b = i10;
        this.f8910c = pVar2;
        this.f8911d = vVar;
    }

    public final C4488v a() {
        return this.f8911d;
    }

    public final int b() {
        return this.f8909b;
    }

    public final p c() {
        return this.f8908a;
    }

    public final c2.p d() {
        return this.f8910c;
    }

    public String toString() {
        return "ScrollCaptureCandidate(node=" + this.f8908a + ", depth=" + this.f8909b + ", viewportBoundsInWindow=" + this.f8910c + ", coordinates=" + this.f8911d + ')';
    }
}
