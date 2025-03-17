package iz;

import XH.t;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.StockInfoDataModel;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rz.Y;
import rz.Z;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Liz/r;", "", "<init>", "()V", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/StockInfoDataModel;", "info", "Lrz/Z;", "b", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/StockInfoDataModel;)Lrz/Z;", "Lrz/Y;", "a", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/StockInfoDataModel;)Lrz/Y;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: iz.r  reason: case insensitive filesystem */
public final class C14604r {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: iz.r$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f127786a;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.StockInfoDataModel$b[] r0 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.StockInfoDataModel.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.StockInfoDataModel$b r1 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.StockInfoDataModel.b.NOT_SOLD     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.StockInfoDataModel$b r1 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.StockInfoDataModel.b.LOW_IN_STOCK     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.StockInfoDataModel$b r1 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.StockInfoDataModel.b.MEDIUM_IN_STOCK     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.StockInfoDataModel$b r1 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.StockInfoDataModel.b.HIGH_IN_STOCK     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.StockInfoDataModel$b r1 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.StockInfoDataModel.b.OUT_OF_STOCK     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.StockInfoDataModel$b r1 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.StockInfoDataModel.b.OTHER     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f127786a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: iz.C14604r.a.<clinit>():void");
        }
    }

    private final Z b(StockInfoDataModel stockInfoDataModel) {
        T t10;
        Iterator<T> it = StockInfoDataModel.b.b().iterator();
        while (true) {
            t10 = null;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            String j10 = ((StockInfoDataModel.b) next).j();
            if (stockInfoDataModel != null) {
                t10 = stockInfoDataModel.a();
            }
            if (C17542s.e(j10, t10)) {
                t10 = next;
                break;
            }
        }
        StockInfoDataModel.b bVar = (StockInfoDataModel.b) t10;
        switch (bVar == null ? -1 : a.f127786a[bVar.ordinal()]) {
            case -1:
            case 6:
                return Z.e.f130797a;
            case 1:
                return Z.d.f130796a;
            case 2:
                return Z.b.f130794a;
            case 3:
                return Z.c.f130795a;
            case 4:
                return Z.a.f130793a;
            case 5:
                return Z.f.f130798a;
            default:
                throw new t();
        }
    }

    public final Y a(StockInfoDataModel stockInfoDataModel) {
        if (stockInfoDataModel == null) {
            return Y.b.f130792a;
        }
        String c10 = stockInfoDataModel.c();
        if (c10 != null) {
            String b10 = stockInfoDataModel.b();
            if (b10 != null) {
                return new Y.a(c10, b10, b(stockInfoDataModel));
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
