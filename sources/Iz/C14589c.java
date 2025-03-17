package iz;

import YH.C16877v;
import com.ingka.ikea.core.model.product.PackageInformation;
import com.ingka.ikea.core.remotemodel.ImageRemote;
import com.ingka.ikea.core.remotemodel.product.PackageInformationRemote;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.CombinationMeasurementsRemote;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.CombinationProductChildItemRemote;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.CombinationProductRemote;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rz.C15018k;
import rz.C15019l;
import rz.C15020m;
import rz.C15021n;
import rz.C15022o;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Liz/c;", "", "<init>", "()V", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationProductChildItemRemote;", "item", "Lrz/m;", "b", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationProductChildItemRemote;)Lrz/m;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationMeasurementsRemote;", "remote", "Lrz/k;", "c", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationMeasurementsRemote;)Lrz/k;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationProductRemote;", "Lrz/l;", "a", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationProductRemote;)Lrz/l;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: iz.c  reason: case insensitive filesystem */
public final class C14589c {
    private final C15020m b(CombinationProductChildItemRemote combinationProductChildItemRemote) {
        String c10 = combinationProductChildItemRemote.c();
        String f10 = combinationProductChildItemRemote.f();
        int d10 = combinationProductChildItemRemote.d();
        Iterable<ImageRemote> b10 = combinationProductChildItemRemote.b();
        ArrayList arrayList = new ArrayList(C16877v.y(b10, 10));
        for (ImageRemote c11 : b10) {
            arrayList.add(c11.c());
        }
        return new C15020m(c10, f10, d10, arrayList, C14590d.a(combinationProductChildItemRemote.e()));
    }

    private final C15018k c(CombinationMeasurementsRemote combinationMeasurementsRemote) {
        String b10 = combinationMeasurementsRemote.b();
        Iterable<PackageInformationRemote> b11 = combinationMeasurementsRemote.a().b();
        ArrayList arrayList = new ArrayList(C16877v.y(b11, 10));
        for (PackageInformationRemote packageInformationRemote : b11) {
            String b12 = packageInformationRemote.b();
            if (b12 != null) {
                String c10 = packageInformationRemote.c();
                if (c10 != null) {
                    arrayList.add(new PackageInformation(c10, b12));
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return new C15018k(b10, new C15022o(arrayList));
    }

    public final C15019l a(CombinationProductRemote combinationProductRemote) {
        C17542s.j(combinationProductRemote, "remote");
        String e10 = combinationProductRemote.e();
        String g10 = combinationProductRemote.g();
        int h10 = combinationProductRemote.h();
        String b10 = combinationProductRemote.b();
        Iterable<ImageRemote> f10 = combinationProductRemote.f();
        ArrayList arrayList = new ArrayList(C16877v.y(f10, 10));
        for (ImageRemote c10 : f10) {
            arrayList.add(c10.c());
        }
        C15021n nVar = new C15021n(combinationProductRemote.d().b().b(), combinationProductRemote.d().c().a(), c(combinationProductRemote.d().a()));
        Iterable<CombinationProductChildItemRemote> c11 = combinationProductRemote.c();
        ArrayList arrayList2 = new ArrayList(C16877v.y(c11, 10));
        for (CombinationProductChildItemRemote b11 : c11) {
            arrayList2.add(b(b11));
        }
        return new C15019l(e10, g10, h10, arrayList, b10, nVar, arrayList2);
    }
}
