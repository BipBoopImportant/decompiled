package gi;

import SC.L2;
import XH.C16818i;
import YH.C16877v;
import ei.C9672m;
import el.d;
import fi.a;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import op.C11697h;
import op.C11698i;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a)\u0010\n\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\u000e\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u0013\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0016\u001a\u00020\u0012*\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/d;", "LSC/L2;", "i", "(Lcom/ingka/ikea/app/stockinfo/network/d;)LSC/L2;", "", "Lfi/a;", "section", "", "dividerId", "LXH/N;", "f", "(Ljava/util/List;Lfi/a;Ljava/lang/String;)V", "Lei/m;", "categoryTitleDelegateModel", "e", "(Ljava/util/List;Lei/m;)V", "", "Lop/h;", "", "h", "(Ljava/util/List;)Z", "id", "g", "(Ljava/lang/String;Ljava/lang/String;)Z", "productinformationpage-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class L {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f73321a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f73322b;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15|16|17|19) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.ingka.ikea.app.stockinfo.network.d[] r0 = com.ingka.ikea.app.stockinfo.network.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                com.ingka.ikea.app.stockinfo.network.d r2 = com.ingka.ikea.app.stockinfo.network.d.HIGH_IN_STOCK     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.ingka.ikea.app.stockinfo.network.d r2 = com.ingka.ikea.app.stockinfo.network.d.MEDIUM_IN_STOCK     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r3 = 2
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.ingka.ikea.app.stockinfo.network.d r2 = com.ingka.ikea.app.stockinfo.network.d.LOW_IN_STOCK     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r3 = 3
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.ingka.ikea.app.stockinfo.network.d r2 = com.ingka.ikea.app.stockinfo.network.d.OUT_OF_STOCK     // Catch:{ NoSuchFieldError -> 0x002b }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r3 = 4
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.ingka.ikea.app.stockinfo.network.d r2 = com.ingka.ikea.app.stockinfo.network.d.OTHER     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r3 = 5
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.ingka.ikea.app.stockinfo.network.d r2 = com.ingka.ikea.app.stockinfo.network.d.EMPTY     // Catch:{ NoSuchFieldError -> 0x003d }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r3 = 6
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f73321a = r0
                ip.k$e[] r0 = ip.k.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ip.k$e r2 = ip.k.e.LOADING     // Catch:{ NoSuchFieldError -> 0x004e }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                f73322b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gi.L.a.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements androidx.lifecycle.L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f73323a;

        b(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f73323a = lVar;
        }

        public final C16818i<?> c() {
            return this.f73323a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.L) || !(obj instanceof C17537m)) {
                return false;
            }
            return C17542s.e(c(), ((C17537m) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f73323a.invoke(obj);
        }
    }

    /* access modifiers changed from: private */
    public static final void e(List<fi.a> list, C9672m mVar) {
        list.add(new a.d(mVar));
    }

    /* access modifiers changed from: private */
    public static final void f(List<fi.a> list, fi.a aVar, String str) {
        fi.a aVar2 = list.get(C16877v.p(list));
        if (!(aVar2 instanceof a.j) && !(aVar2 instanceof a.d)) {
            list.add(new a.j(new d(str)));
        }
        list.add(aVar);
    }

    /* access modifiers changed from: private */
    public static final boolean g(String str, String str2) {
        if (str2 != null) {
            return C17542s.e(str2, str);
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final boolean h(List<C11697h> list) {
        boolean z10;
        Iterable<C11697h> iterable = list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (C11697h hVar : iterable) {
            List<C11698i> c10 = hVar.c();
            if ((c10 != null ? c10.size() : 0) <= 1 || hVar.a()) {
                z10 = false;
                continue;
            } else {
                z10 = true;
                continue;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public static final L2 i(com.ingka.ikea.app.stockinfo.network.d dVar) {
        C17542s.j(dVar, "<this>");
        switch (a.f73321a[dVar.ordinal()]) {
            case 1:
                return L2.Available;
            case 2:
            case 3:
                return L2.Low;
            case 4:
                return L2.Unavailable;
            case 5:
                return L2.Indeterminate;
            default:
                return null;
        }
    }
}
