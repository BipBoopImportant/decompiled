package iz;

import XH.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rz.C15014g;
import rz.S;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Liz/n;", "", "Liz/f;", "orderItemReferenceMapper", "<init>", "(Liz/f;)V", "", "Lrz/g;", "cart", "Liz/s;", "a", "(Ljava/util/List;)Liz/s;", "Liz/f;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: iz.n  reason: case insensitive filesystem */
public final class C14600n {

    /* renamed from: a  reason: collision with root package name */
    private final C14592f f127784a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: iz.n$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f127785a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                rz.y[] r0 = rz.C15031y.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                rz.y r1 = rz.C15031y.SELF_SERVE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                rz.y r1 = rz.C15031y.CASH_AND_CARRY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                rz.y r1 = rz.C15031y.FULL_SERVE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                rz.y r1 = rz.C15031y.COMBINATION     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                rz.y r1 = rz.C15031y.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f127785a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: iz.C14600n.a.<clinit>():void");
        }
    }

    public C14600n(C14592f fVar) {
        C17542s.j(fVar, "orderItemReferenceMapper");
        this.f127784a = fVar;
    }

    public final C14605s a(List<C15014g> list) {
        C17542s.j(list, "cart");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (C15014g gVar : list) {
            S a10 = this.f127784a.a(gVar);
            int i10 = a.f127785a[gVar.i().ordinal()];
            if (i10 == 1 || i10 == 2) {
                if (!gVar.b()) {
                    arrayList3.add(a10);
                } else {
                    arrayList.add(a10);
                }
            } else if (i10 != 3) {
                if (i10 == 4 || i10 == 5) {
                    arrayList.add(a10);
                } else {
                    throw new t();
                }
            } else if (!gVar.b()) {
                arrayList2.add(a10);
            } else {
                arrayList.add(a10);
            }
        }
        return new C14605s(arrayList, arrayList2, arrayList3);
    }
}
