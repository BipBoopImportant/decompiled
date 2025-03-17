package n0;

import L1.h;
import L1.o;
import L1.v;
import L1.x;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import tI.C17970f;
import tI.C17978n;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u001a5\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/d;", "", "value", "LtI/f;", "valueRange", "", "steps", "b", "(Landroidx/compose/ui/d;FLtI/f;I)Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Z {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LL1/x;", "LXH/N;", "a", "(LL1/x;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<x, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f26391c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17970f<Float> f26392d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f26393e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(float f10, C17970f<Float> fVar, int i10) {
            super(1);
            this.f26391c = f10;
            this.f26392d = fVar;
            this.f26393e = i10;
        }

        public final void a(x xVar) {
            v.k0(xVar, new h(((Number) C17978n.q(Float.valueOf(this.f26391c), this.f26392d)).floatValue(), this.f26392d, this.f26393e));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((x) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LL1/x;", "LXH/N;", "a", "(LL1/x;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<x, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f26394c = new b();

        b() {
            super(1);
        }

        public final void a(x xVar) {
            v.k0(xVar, h.f8931d.a());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((x) obj);
            return C16807N.f139792a;
        }
    }

    public static final d a(d dVar) {
        return o.c(dVar, true, b.f26394c);
    }

    public static final d b(d dVar, float f10, C17970f<Float> fVar, int i10) {
        return o.c(dVar, true, new a(f10, fVar, i10));
    }

    public static /* synthetic */ d c(d dVar, float f10, C17970f<Float> fVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            fVar = C17978n.c(0.0f, 1.0f);
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return b(dVar, f10, fVar, i10);
    }
}
