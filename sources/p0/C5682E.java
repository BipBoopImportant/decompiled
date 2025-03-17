package p0;

import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.p1;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/Function1;", "", "consumeScrollDelta", "Lp0/D;", "a", "(LnI/l;)Lp0/D;", "b", "(LnI/l;LU0/m;I)Lp0/D;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: p0.E  reason: case insensitive filesystem */
public final class C5682E {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: p0.E$a */
    static final class a extends C17544u implements C17642l<Float, Float> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ A1<C17642l<Float, Float>> f26792c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(A1<? extends C17642l<? super Float, Float>> a12) {
            super(1);
            this.f26792c = a12;
        }

        public final Float a(float f10) {
            return (Float) this.f26792c.getValue().invoke(Float.valueOf(f10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).floatValue());
        }
    }

    public static final C5681D a(C17642l<? super Float, Float> lVar) {
        return new C5694l(lVar);
    }

    public static final C5681D b(C17642l<? super Float, Float> lVar, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(-180460798, i10, -1, "androidx.compose.foundation.gestures.rememberScrollableState (ScrollableState.kt:161)");
        }
        A1<T> q10 = p1.q(lVar, mVar, i10 & 14);
        Object D10 = mVar.D();
        if (D10 == C4889m.f14007a.a()) {
            D10 = a(new a(q10));
            mVar.u(D10);
        }
        C5681D d10 = (C5681D) D10;
        if (C4895p.J()) {
            C4895p.R();
        }
        return d10;
    }
}
