package O0;

import U0.C4889m;
import U0.C4895p;
import androidx.compose.ui.platform.C5100f0;
import c2.d;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"LO0/Q0;", "", "<init>", "()V", "Lkotlin/Function1;", "", "a", "(LU0/m;I)LnI/l;", "positionalThreshold", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Q0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Q0 f9966a = new Q0();

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<Float, Float> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f9967c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar) {
            super(1);
            this.f9967c = dVar;
        }

        public final Float a(float f10) {
            return Float.valueOf(this.f9967c.H1(h.B((float) 56)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).floatValue());
        }
    }

    private Q0() {
    }

    public final C17642l<Float, Float> a(C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(1545861529, i10, -1, "androidx.compose.material3.SwipeToDismissBoxDefaults.<get-positionalThreshold> (SwipeToDismissBox.kt:261)");
        }
        mVar.W(-1853326336);
        d dVar = (d) mVar.Q(C5100f0.e());
        boolean V10 = mVar.V(dVar);
        Object D10 = mVar.D();
        if (V10 || D10 == C4889m.f14007a.a()) {
            D10 = new a(dVar);
            mVar.u(D10);
        }
        C17642l<Float, Float> lVar = (C17642l) D10;
        mVar.P();
        if (C4895p.J()) {
            C4895p.R();
        }
        return lVar;
    }
}
