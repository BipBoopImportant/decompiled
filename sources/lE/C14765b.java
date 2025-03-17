package lE;

import QL.x;
import VL.C16699a;
import VL.o;
import com.ingka.ikea.zipselector.impl.network.PostalCodeStateRemote;
import com.ingka.ikea.zipselector.impl.network.RequestStatedBody;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LlE/b;", "", "Lcom/ingka/ikea/zipselector/impl/network/RequestStatedBody;", "requestStatedBody", "LQL/x;", "", "Lcom/ingka/ikea/zipselector/impl/network/PostalCodeStateRemote;", "a", "(Lcom/ingka/ikea/zipselector/impl/network/RequestStatedBody;LdI/e;)Ljava/lang/Object;", "zipselector-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lE.b  reason: case insensitive filesystem */
public interface C14765b {
    @o("checkout/v6/{cc}/{lc}/states-lookup")
    Object a(@C16699a RequestStatedBody requestStatedBody, C17164e<? super x<List<PostalCodeStateRemote>>> eVar);
}
