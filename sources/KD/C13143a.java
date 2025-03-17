package KD;

import GD.C12928a;
import XH.t;
import com.ingka.ikea.core.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import p0.v;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LGD/a;", "Lp0/v;", "orientation", "Lcom/ingka/ikea/core/model/Image;", "a", "(LGD/a;Lp0/v;)Lcom/ingka/ikea/core/model/Image;", "wallet-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: KD.a  reason: case insensitive filesystem */
public final class C13143a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: KD.a$a  reason: collision with other inner class name */
    public /* synthetic */ class C2719a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f111623a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                p0.v[] r0 = p0.v.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                p0.v r1 = p0.v.Vertical     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                p0.v r1 = p0.v.Horizontal     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f111623a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: KD.C13143a.C2719a.<clinit>():void");
        }
    }

    public static final Image a(C12928a aVar, v vVar) {
        C17542s.j(aVar, "<this>");
        C17542s.j(vVar, "orientation");
        int i10 = C2719a.f111623a[vVar.ordinal()];
        if (i10 == 1) {
            return aVar.b();
        }
        if (i10 == 2) {
            return aVar.a();
        }
        throw new t();
    }
}
