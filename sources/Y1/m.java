package Y1;

import N1.H;
import e2.C5295b;
import kotlin.Metadata;
import nI.C17631a;
import p1.C5728l0;
import p1.C5747v0;
import p1.C5751x0;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\t\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\r\u001a\u00020\u0003*\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"LY1/n;", "start", "stop", "", "fraction", "b", "(LY1/n;LY1/n;F)LY1/n;", "Lp1/v0;", "alpha", "c", "(JF)J", "Lkotlin/Function0;", "block", "d", "(FLnI/a;)F", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class m {
    public static final n b(n nVar, n nVar2, float f10) {
        boolean z10 = nVar instanceof c;
        return (z10 || (nVar2 instanceof c)) ? (!z10 || !(nVar2 instanceof c)) ? (n) H.d(nVar, nVar2, f10) : n.f14805a.a((C5728l0) H.d(((c) nVar).d(), ((c) nVar2).d(), f10), C5295b.b(nVar.a(), nVar2.a(), f10)) : n.f14805a.b(C5751x0.i(nVar.b(), nVar2.b(), f10));
    }

    public static final long c(long j10, float f10) {
        if (Float.isNaN(f10) || f10 >= 1.0f) {
            return j10;
        }
        return C5747v0.o(j10, C5747v0.r(j10) * f10, 0.0f, 0.0f, 0.0f, 14, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final float d(float f10, C17631a<Float> aVar) {
        return Float.isNaN(f10) ? aVar.invoke().floatValue() : f10;
    }
}
