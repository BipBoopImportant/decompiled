package cz;

import GK.C15777E;
import QL.x;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.request.ScanAndGoCancelOrderBodyDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.request.ScanAndGoCheckoutBodyDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.request.ScanAndGoCheckoutStatusBodyDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.request.ScanAndGoOrderBodyDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.CombinationProductRemote;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoCheckoutResponseDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoCheckoutStatusResponseDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoOrderResponseDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoProductResponseDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.UpptackaResponse;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH@¢\u0006\u0004\b\u0011\u0010\u0012JT\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H@¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u001dH@¢\u0006\u0004\b\u001f\u0010 J&\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020!H@¢\u0006\u0004\b#\u0010$J&\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0006H@¢\u0006\u0004\b'\u0010(J.\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H@¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010-¨\u0006."}, d2 = {"Lcz/c;", "Lcz/b;", "Lcz/a;", "endpoint", "<init>", "(Lcz/a;)V", "", "storeId", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoOrderBodyDataModel;", "orderBody", "LQL/x;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoOrderResponseDataModel;", "f", "(Ljava/lang/String;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoOrderBodyDataModel;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoCheckoutBodyDataModel;", "body", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoCheckoutResponseDataModel;", "e", "(Ljava/lang/String;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoCheckoutBodyDataModel;LdI/e;)Ljava/lang/Object;", "barcode", "", "quantity", "productType", "ptagSize", "scanType", "isFamilyMember", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoProductResponseDataModel;", "g", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoCheckoutStatusBodyDataModel;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoCheckoutStatusResponseDataModel;", "b", "(Ljava/lang/String;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoCheckoutStatusBodyDataModel;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoCancelOrderBodyDataModel;", "LGK/E;", "a", "(Ljava/lang/String;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoCancelOrderBodyDataModel;LdI/e;)Ljava/lang/Object;", "listigId", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/UpptackaResponse;", "d", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "productId", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationProductRemote;", "c", "(Ljava/lang/String;Ljava/lang/String;ILdI/e;)Ljava/lang/Object;", "Lcz/a;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: cz.c  reason: case insensitive filesystem */
public final class C14329c implements C14328b {

    /* renamed from: a  reason: collision with root package name */
    private final C14327a f126162a;

    public C14329c(C14327a aVar) {
        C17542s.j(aVar, "endpoint");
        this.f126162a = aVar;
    }

    public Object a(String str, ScanAndGoCancelOrderBodyDataModel scanAndGoCancelOrderBodyDataModel, C17164e<? super x<C15777E>> eVar) {
        return this.f126162a.a(str, scanAndGoCancelOrderBodyDataModel, eVar);
    }

    public Object b(String str, ScanAndGoCheckoutStatusBodyDataModel scanAndGoCheckoutStatusBodyDataModel, C17164e<? super x<ScanAndGoCheckoutStatusResponseDataModel>> eVar) {
        return this.f126162a.b(str, scanAndGoCheckoutStatusBodyDataModel, eVar);
    }

    public Object c(String str, String str2, int i10, C17164e<? super x<CombinationProductRemote>> eVar) {
        return this.f126162a.c(str, str2, i10, eVar);
    }

    public Object d(String str, String str2, C17164e<? super x<UpptackaResponse>> eVar) {
        return this.f126162a.d(str, str2, eVar);
    }

    public Object e(String str, ScanAndGoCheckoutBodyDataModel scanAndGoCheckoutBodyDataModel, C17164e<? super x<ScanAndGoCheckoutResponseDataModel>> eVar) {
        return this.f126162a.e(str, scanAndGoCheckoutBodyDataModel, eVar);
    }

    public Object f(String str, ScanAndGoOrderBodyDataModel scanAndGoOrderBodyDataModel, C17164e<? super x<ScanAndGoOrderResponseDataModel>> eVar) {
        return this.f126162a.f(str, scanAndGoOrderBodyDataModel, eVar);
    }

    public Object g(String str, String str2, int i10, String str3, String str4, String str5, String str6, C17164e<? super x<ScanAndGoProductResponseDataModel>> eVar) {
        return this.f126162a.g(str, str2, i10, str3, str4, str5, str6, eVar);
    }
}
