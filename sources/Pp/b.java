package Pp;

import IC.C13023e;
import IC.C13026h;
import XH.t;
import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import np.C11664a;
import qx.C14956a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"LPp/b;", "", "LIl/a;", "appConfigApi", "<init>", "(LIl/a;)V", "", "Lnp/a;", "environmentalFees", "", "quantity", "LIC/e;", "a", "(Ljava/util/List;I)Ljava/util/List;", "LIl/a;", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Il.a f85639a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f85640a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                np.a$a[] r0 = np.C11664a.C2303a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                np.a$a r1 = np.C11664a.C2303a.ECO     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                np.a$a r1 = np.C11664a.C2303a.WEEE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f85640a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Pp.b.a.<clinit>():void");
        }
    }

    public b(Il.a aVar) {
        C17542s.j(aVar, "appConfigApi");
        this.f85639a = aVar;
    }

    public final List<C13023e> a(List<C11664a> list, int i10) {
        C13023e eVar;
        C17542s.j(list, "environmentalFees");
        if (!this.f85639a.n() || list.isEmpty()) {
            return C16877v.n();
        }
        Iterable<C11664a> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C11664a aVar : iterable) {
            String b10 = C14956a.f130484a.b(aVar.a() * ((double) i10), this.f85639a.s());
            int i11 = a.f85640a[aVar.b().ordinal()];
            if (i11 == 1) {
                eVar = C13026h.b(Oo.b.f84778s2, b10);
            } else if (i11 == 2) {
                eVar = C13026h.b(Oo.b.f84343C5, b10);
            } else {
                throw new t();
            }
            arrayList.add(eVar);
        }
        return arrayList;
    }
}
