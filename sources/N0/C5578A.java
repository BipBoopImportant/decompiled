package n0;

import E1.Y;
import E1.Z;
import G1.C4505h;
import G1.C4506i;
import G1.h0;
import G1.i0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.O;
import nI.C17631a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u0005J\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0005R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\t8\u0016XD¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Ln0/A;", "Landroidx/compose/ui/d$c;", "LG1/h;", "LG1/h0;", "<init>", "()V", "LE1/Y;", "C2", "()LE1/Y;", "", "focused", "LXH/N;", "D2", "(Z)V", "o2", "H0", "LE1/Y$a;", "n", "LE1/Y$a;", "pinnedHandle", "o", "Z", "isFocused", "p", "h2", "()Z", "shouldAutoInvalidate", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: n0.A  reason: case insensitive filesystem */
final class C5578A extends d.c implements C4505h, h0 {

    /* renamed from: n  reason: collision with root package name */
    private Y.a f26303n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f26304o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f26305p;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: n0.A$a */
    static final class a extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ O<Y> f26306c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5578A f26307d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(O<Y> o10, C5578A a10) {
            super(0);
            this.f26306c = o10;
            this.f26307d = a10;
        }

        public final void invoke() {
            this.f26306c.f144348a = C4506i.a(this.f26307d, Z.a());
        }
    }

    private final Y C2() {
        O o10 = new O();
        i0.a(this, new a(o10, this));
        return (Y) o10.f144348a;
    }

    public final void D2(boolean z10) {
        Y.a aVar = null;
        if (z10) {
            Y C22 = C2();
            if (C22 != null) {
                aVar = C22.a();
            }
            this.f26303n = aVar;
        } else {
            Y.a aVar2 = this.f26303n;
            if (aVar2 != null) {
                aVar2.release();
            }
            this.f26303n = null;
        }
        this.f26304o = z10;
    }

    public void H0() {
        Y C22 = C2();
        if (this.f26304o) {
            Y.a aVar = this.f26303n;
            if (aVar != null) {
                aVar.release();
            }
            this.f26303n = C22 != null ? C22.a() : null;
        }
    }

    public boolean h2() {
        return this.f26305p;
    }

    public void o2() {
        Y.a aVar = this.f26303n;
        if (aVar != null) {
            aVar.release();
        }
        this.f26303n = null;
    }
}
