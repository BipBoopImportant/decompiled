package iz;

import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ApiErrorDataModel;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rz.C15009b;
import rz.C15010c;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Liz/a;", "", "<init>", "()V", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ApiErrorDataModel;", "error", "Lrz/b;", "a", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ApiErrorDataModel;)Lrz/b;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: iz.a  reason: case insensitive filesystem */
public final class C14587a {
    public final C15009b a(ApiErrorDataModel apiErrorDataModel) {
        C17542s.j(apiErrorDataModel, UiComponentContainer.RESULT_ERROR);
        int a10 = apiErrorDataModel.a();
        return (500 > a10 || a10 >= 600) ? (400 > a10 || a10 >= 500) ? new C15009b.C3238b(apiErrorDataModel.a(), (String) null, apiErrorDataModel.b(), 2, (DefaultConstructorMarker) null) : C15010c.Companion.a(apiErrorDataModel.c()) == C15010c.ITEM_NOT_FOUND ? new C15009b.a.C3237a(apiErrorDataModel.a(), apiErrorDataModel.c(), apiErrorDataModel.b()) : new C15009b.a(apiErrorDataModel.a(), apiErrorDataModel.c(), apiErrorDataModel.b()) : C15010c.Companion.a(apiErrorDataModel.c()) == C15010c.STORE_CLOSED ? new C15009b.c.a(apiErrorDataModel.a(), apiErrorDataModel.c(), apiErrorDataModel.b()) : new C15009b.c(apiErrorDataModel.a(), apiErrorDataModel.c(), apiErrorDataModel.b());
    }
}
