package androidx.compose.foundation;

import G1.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import n0.C5620z;
import r0.m;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/FocusableElement;", "LG1/V;", "Ln0/z;", "Lr0/m;", "interactionSource", "<init>", "(Lr0/m;)V", "c", "()Ln0/z;", "node", "LXH/N;", "f", "(Ln0/z;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "Lr0/m;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class FocusableElement extends V<C5620z> {

    /* renamed from: d  reason: collision with root package name */
    private final m f17499d;

    public FocusableElement(m mVar) {
        this.f17499d = mVar;
    }

    /* renamed from: c */
    public C5620z a() {
        return new C5620z(this.f17499d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusableElement) && C17542s.e(this.f17499d, ((FocusableElement) obj).f17499d);
    }

    /* renamed from: f */
    public void b(C5620z zVar) {
        zVar.I2(this.f17499d);
    }

    public int hashCode() {
        m mVar = this.f17499d;
        if (mVar != null) {
            return mVar.hashCode();
        }
        return 0;
    }
}
