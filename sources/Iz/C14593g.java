package iz;

import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.LocationAisleBinDataModel;
import kotlin.Metadata;
import rz.C15026t;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Liz/g;", "", "<init>", "()V", "", "title", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/LocationAisleBinDataModel;", "aisleAndBin", "Lrz/t;", "b", "(Ljava/lang/String;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/LocationAisleBinDataModel;)Lrz/t;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/LocationDepartmentDataModel;", "department", "Lrz/t$b;", "c", "(Ljava/lang/String;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/LocationDepartmentDataModel;)Lrz/t$b;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/SalesLocationDataModel;", "model", "a", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/SalesLocationDataModel;)Lrz/t;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: iz.g  reason: case insensitive filesystem */
public final class C14593g {
    private final C15026t b(String str, LocationAisleBinDataModel locationAisleBinDataModel) {
        String a10 = locationAisleBinDataModel.a();
        if (a10 != null) {
            String b10 = locationAisleBinDataModel.b();
            if (b10 != null) {
                return new C15026t.a(str, a10, b10);
            }
            throw new IllegalArgumentException("SalesLocationDataModel.aisleAndBin.bin null");
        }
        throw new IllegalArgumentException("SalesLocationDataModel.aisleAndBin.aisle null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r3 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.LocationDepartmentNamesDataModel) YH.C16877v.y0(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final rz.C15026t.b c(java.lang.String r2, com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.LocationDepartmentDataModel r3) {
        /*
            r1 = this;
            java.util.List r3 = r3.b()
            if (r3 == 0) goto L_0x0013
            java.lang.Object r3 = YH.C16877v.y0(r3)
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.LocationDepartmentNamesDataModel r3 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.LocationDepartmentNamesDataModel) r3
            if (r3 == 0) goto L_0x0013
            java.lang.String r3 = r3.a()
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            if (r3 == 0) goto L_0x001c
            rz.t$b r0 = new rz.t$b
            r0.<init>(r2, r3)
            return r0
        L_0x001c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "LocationDepartmentDataModel.names null"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: iz.C14593g.c(java.lang.String, com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.LocationDepartmentDataModel):rz.t$b");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r4.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final rz.C15026t a(com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesLocationDataModel r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x000e
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesLocationInformationDataModel r1 = r4.a()
            if (r1 == 0) goto L_0x000e
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.LocationAisleBinDataModel r1 = r1.a()
            goto L_0x000f
        L_0x000e:
            r1 = r0
        L_0x000f:
            java.lang.String r2 = "Required value was null."
            if (r1 == 0) goto L_0x002c
            java.lang.String r0 = r4.b()
            if (r0 == 0) goto L_0x0026
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesLocationInformationDataModel r4 = r4.a()
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.LocationAisleBinDataModel r4 = r4.a()
            rz.t r4 = r3.b(r0, r4)
            goto L_0x0055
        L_0x0026:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>(r2)
            throw r4
        L_0x002c:
            if (r4 == 0) goto L_0x0038
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesLocationInformationDataModel r1 = r4.a()
            if (r1 == 0) goto L_0x0038
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.LocationDepartmentDataModel r0 = r1.b()
        L_0x0038:
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = r4.b()
            if (r0 == 0) goto L_0x004d
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesLocationInformationDataModel r4 = r4.a()
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.LocationDepartmentDataModel r4 = r4.b()
            rz.t$b r4 = r3.c(r0, r4)
            goto L_0x0055
        L_0x004d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>(r2)
            throw r4
        L_0x0053:
            rz.t$c r4 = rz.C15026t.c.f130895a
        L_0x0055:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: iz.C14593g.a(com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesLocationDataModel):rz.t");
    }
}
