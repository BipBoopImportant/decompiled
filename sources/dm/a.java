package Dm;

import VL.C16704f;
import VL.t;
import com.ingka.ikea.benefits.impl.data.models.remote.BenefitRemote;
import com.ingka.ikea.benefits.impl.data.models.remote.BenefitsRemote;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LDm/a;", "", "Lcom/ingka/ikea/benefits/impl/data/models/remote/BenefitsRemote;", "b", "(LdI/e;)Ljava/lang/Object;", "", "benefitId", "", "isFamilyMember", "Lcom/ingka/ikea/benefits/impl/data/models/remote/BenefitRemote;", "a", "(Ljava/lang/String;Ljava/lang/Boolean;LdI/e;)Ljava/lang/Object;", "benefits-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {
    @C16704f("/range/v6/{cc}/{lc}/store-benefits")
    Object a(@t("benefitId") String str, @t("isFamilyMember") Boolean bool, C17164e<? super BenefitRemote> eVar);

    @C16704f("/customer/v6/{cc}/{lc}/family-benefits")
    Object b(C17164e<? super BenefitsRemote> eVar);
}
