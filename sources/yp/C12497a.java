package yp;

import VL.C16699a;
import VL.o;
import XH.C16807N;
import com.ingka.ikea.dataconsent.impl.repository.datasource.endpoint.model.ConsentsModelRemote;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyp/a;", "", "Lcom/ingka/ikea/dataconsent/impl/repository/datasource/endpoint/model/ConsentsModelRemote;", "consentsModelRemote", "LXH/N;", "a", "(Lcom/ingka/ikea/dataconsent/impl/repository/datasource/endpoint/model/ConsentsModelRemote;LdI/e;)Ljava/lang/Object;", "dataconsent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: yp.a  reason: case insensitive filesystem */
public interface C12497a {
    @o("/customer/v6/{cc}/{lc}/consent/data-sharing")
    Object a(@C16699a ConsentsModelRemote consentsModelRemote, C17164e<? super C16807N> eVar);
}
