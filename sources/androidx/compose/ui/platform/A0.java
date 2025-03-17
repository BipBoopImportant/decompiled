package androidx.compose.ui.platform;

import U0.C4892n0;
import U0.D0;
import dI.C17168i;
import i1.h;
import kotlin.Metadata;
import nI.p;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R+\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/platform/A0;", "Li1/h;", "<init>", "()V", "", "<set-?>", "a", "LU0/n0;", "z", "()F", "(F)V", "scaleFactor", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class A0 implements h {

    /* renamed from: a  reason: collision with root package name */
    private final C4892n0 f18994a = D0.a(1.0f);

    public void a(float f10) {
        this.f18994a.n(f10);
    }

    public <R> R fold(R r10, p<? super R, ? super C17168i.b, ? extends R> pVar) {
        return h.a.a(this, r10, pVar);
    }

    public <E extends C17168i.b> E get(C17168i.c<E> cVar) {
        return h.a.b(this, cVar);
    }

    public C17168i minusKey(C17168i.c<?> cVar) {
        return h.a.c(this, cVar);
    }

    public C17168i plus(C17168i iVar) {
        return h.a.d(this, iVar);
    }

    public float z() {
        return this.f18994a.a();
    }
}
