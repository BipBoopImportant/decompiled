package iz;

import YH.C16877v;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.LocationAisleBinDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.LocationDepartmentNamesDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.QuantityPickerDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesLocationDataModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import rz.C15026t;
import rz.C15031y;
import rz.U;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\b\u001a\u00020\u0007*\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\f\u001a\u00020\u000b*\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/QuantityPickerDataModel;", "", "quantityInCart", "Lrz/U;", "b", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/QuantityPickerDataModel;I)Lrz/U;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/SalesLocationDataModel;", "Lrz/t;", "a", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/SalesLocationDataModel;)Lrz/t;", "", "Lrz/y;", "c", "(Ljava/lang/String;)Lrz/y;", "datalayer-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: iz.d  reason: case insensitive filesystem */
public final class C14590d {
    public static final C15026t a(SalesLocationDataModel salesLocationDataModel) {
        if (salesLocationDataModel == null || salesLocationDataModel.a() == null) {
            return C15026t.c.f130895a;
        }
        String b10 = salesLocationDataModel.b();
        String str = "";
        if (b10 == null) {
            b10 = str;
        }
        if (salesLocationDataModel.a().b() != null) {
            List<LocationDepartmentNamesDataModel> b11 = salesLocationDataModel.a().b().b();
            if (b11 != null) {
                Iterable<LocationDepartmentNamesDataModel> iterable = b11;
                ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
                for (LocationDepartmentNamesDataModel a10 : iterable) {
                    arrayList.add(a10.a());
                }
                return new C15026t.b(b10, C16877v.G0(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 63, (Object) null));
            }
            throw new IllegalArgumentException("Required value was null.");
        } else if (salesLocationDataModel.a().a() == null) {
            return C15026t.c.f130895a;
        } else {
            LocationAisleBinDataModel a11 = salesLocationDataModel.a().a();
            String a12 = a11.a();
            if (a12 == null) {
                a12 = str;
            }
            String b12 = a11.b();
            if (b12 != null) {
                str = b12;
            }
            return new C15026t.a(b10, a12, str);
        }
    }

    public static final U b(QuantityPickerDataModel quantityPickerDataModel, int i10) {
        int i11 = 1;
        if (quantityPickerDataModel == null) {
            return new U.c(0, 1, 1);
        }
        Integer b10 = quantityPickerDataModel.b();
        if (b10 != null) {
            int intValue = b10.intValue();
            int i12 = intValue - i10;
            if (C17542s.e(quantityPickerDataModel.a(), Boolean.TRUE)) {
                Integer c10 = quantityPickerDataModel.c();
                if (c10 != null) {
                    int intValue2 = c10.intValue();
                    Integer d10 = quantityPickerDataModel.d();
                    if (d10 != null) {
                        return new U.a(intValue2, intValue, i12, d10.intValue());
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            Integer d11 = quantityPickerDataModel.d();
            if (d11 != null) {
                i11 = d11.intValue();
            }
            return new U.b(intValue, i12, i11);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final C15031y c(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1316276633:
                    if (str.equals("CASH_AND_CARRY")) {
                        return C15031y.CASH_AND_CARRY;
                    }
                    break;
                case 517848124:
                    if (str.equals("SELF_SERVE")) {
                        return C15031y.SELF_SERVE;
                    }
                    break;
                case 953110847:
                    if (str.equals("FULL_SERVE")) {
                        return C15031y.FULL_SERVE;
                    }
                    break;
                case 1503907503:
                    if (str.equals("COMBINATION")) {
                        return C15031y.COMBINATION;
                    }
                    break;
            }
        }
        return C15031y.UNKNOWN;
    }
}
