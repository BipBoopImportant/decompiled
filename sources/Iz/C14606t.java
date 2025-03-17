package iz;

import YH.C16877v;
import com.ingka.ikea.core.model.product.Price;
import com.ingka.ikea.core.model.product.a;
import com.ingka.ikea.core.remotemodel.product.PricePackageRemote;
import com.ingka.ikea.core.remotemodel.product.ProductLiteRemote;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemPresentationSectionDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemProductCardDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.QuantityPickerDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.UpptackaResponse;
import gz.C14523a;
import gz.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rz.C15026t;
import rz.C15031y;
import rz.U;
import rz.Y;
import rz.a0;
import rz.b0;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u0014*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001d\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010 ¨\u0006!"}, d2 = {"Liz/t;", "", "Liz/r;", "stockInfoMapper", "Liz/g;", "salesLocationDataModelMapper", "Liz/o;", "quantityLimitsMapper", "<init>", "(Liz/r;Liz/g;Liz/o;)V", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ChildItemPresentationSectionDataModel;", "", "", "", "quantityInCartMap", "Lrz/b0;", "d", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ChildItemPresentationSectionDataModel;Ljava/util/Map;)Lrz/b0;", "", "timestamp", "Lgz/c;", "c", "(Lrz/b0;J)Lgz/c;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/UpptackaResponse;", "model", "Lrz/a0;", "b", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/UpptackaResponse;Ljava/util/Map;)Lrz/a0;", "upptackaProduct", "a", "Liz/r;", "Liz/g;", "Liz/o;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: iz.t  reason: case insensitive filesystem */
public final class C14606t {

    /* renamed from: a  reason: collision with root package name */
    private final C14604r f127790a;

    /* renamed from: b  reason: collision with root package name */
    private final C14593g f127791b;

    /* renamed from: c  reason: collision with root package name */
    private final C14601o f127792c;

    public C14606t(C14604r rVar, C14593g gVar, C14601o oVar) {
        C17542s.j(rVar, "stockInfoMapper");
        C17542s.j(gVar, "salesLocationDataModelMapper");
        C17542s.j(oVar, "quantityLimitsMapper");
        this.f127790a = rVar;
        this.f127791b = gVar;
        this.f127792c = oVar;
    }

    private final c c(b0 b0Var, long j10) {
        PricePackageRemote l10 = b0Var.e().l();
        Double d10 = null;
        a f10 = l10 != null ? l10.f() : null;
        if (f10 != null) {
            Price d11 = f10.d();
            if (d11 != null) {
                d10 = Double.valueOf(d11.c());
            }
            if (d10 == null || d10.doubleValue() <= 0.0d) {
                d10 = Double.valueOf(f10.e().c());
            }
            return new c(b0Var.d(), j10, b0Var.e(), f10.e().c(), d10.doubleValue(), false, this.f127792c.a(b0Var.h()), b0Var.f(), C14523a.f127378e.a(b0Var.c()), false);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final b0 d(ChildItemPresentationSectionDataModel childItemPresentationSectionDataModel, Map<String, Integer> map) {
        ChildItemProductCardDataModel a10 = childItemPresentationSectionDataModel.a();
        if (a10 != null) {
            ProductLiteRemote e10 = a10.e();
            if (e10 != null) {
                Y a11 = this.f127790a.a(a10.i());
                int intValue = map.getOrDefault(e10.i(), 0).intValue();
                Integer g10 = a10.g();
                int intValue2 = g10 != null ? g10.intValue() : 1;
                Integer d10 = a10.d();
                U b10 = C14590d.b(new QuantityPickerDataModel(Boolean.TRUE, 1, Integer.valueOf(d10 != null ? d10.intValue() : 1), Integer.valueOf(intValue2)), intValue);
                PricePackageRemote l10 = e10.l();
                a f10 = l10 != null ? l10.f() : null;
                if (f10 != null) {
                    String e11 = f10.e().e();
                    String c10 = a10.c();
                    if (c10 != null) {
                        String f11 = a10.f();
                        if (f11 == null) {
                            f11 = C15031y.UNKNOWN.b();
                        }
                        C15031y valueOf = C15031y.valueOf(f11);
                        C15026t a12 = this.f127791b.a(a10.h());
                        Integer g11 = a10.g();
                        return new b0(e11, c10, e10, b10, valueOf, a12, a11, false, g11 != null ? g11.intValue() : 1, 128, (DefaultConstructorMarker) null);
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final c a(b0 b0Var, long j10) {
        C17542s.j(b0Var, "upptackaProduct");
        return c(b0Var, j10);
    }

    public final a0 b(UpptackaResponse upptackaResponse, Map<String, Integer> map) {
        List list;
        List list2;
        List list3;
        List<ChildItemPresentationSectionDataModel> c10;
        List<ChildItemPresentationSectionDataModel> d10;
        List<ChildItemPresentationSectionDataModel> b10;
        C17542s.j(map, "quantityInCartMap");
        if (upptackaResponse == null || (b10 = upptackaResponse.b()) == null) {
            list = C16877v.n();
        } else {
            Iterable<ChildItemPresentationSectionDataModel> iterable = b10;
            list = new ArrayList(C16877v.y(iterable, 10));
            for (ChildItemPresentationSectionDataModel d11 : iterable) {
                list.add(d(d11, map));
            }
        }
        if (upptackaResponse == null || (d10 = upptackaResponse.d()) == null) {
            list2 = C16877v.n();
        } else {
            Iterable<ChildItemPresentationSectionDataModel> iterable2 = d10;
            list2 = new ArrayList(C16877v.y(iterable2, 10));
            for (ChildItemPresentationSectionDataModel d12 : iterable2) {
                list2.add(d(d12, map));
            }
        }
        if (upptackaResponse == null || (c10 = upptackaResponse.c()) == null) {
            list3 = C16877v.n();
        } else {
            Iterable<ChildItemPresentationSectionDataModel> iterable3 = c10;
            list3 = new ArrayList(C16877v.y(iterable3, 10));
            for (ChildItemPresentationSectionDataModel d13 : iterable3) {
                list3.add(d(d13, map));
            }
        }
        return new a0(list, list2, list3);
    }
}
