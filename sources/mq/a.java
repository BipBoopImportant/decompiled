package Mq;

import QL.x;
import VL.C16704f;
import VL.C16712n;
import VL.s;
import VL.t;
import com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyCustomerRewardRemote;
import com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyRewardEstimatedPointsRemote;
import com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyRewardInteractionsRemote;
import com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyRewardsFAQRemote;
import com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyRewardsHistoryRemote;
import com.ingka.ikea.familyrewards.datalayer.impl.remote.RewardRemote;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\f\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u000e\u0010\u0004J*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\u000f\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0012\u0010\nJ\u001a\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0014\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LMq/a;", "", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyRewardsHistoryRemote;", "b", "(LdI/e;)Ljava/lang/Object;", "", "timeZone", "scope", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyCustomerRewardRemote;", "d", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyRewardsFAQRemote;", "e", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyRewardInteractionsRemote;", "f", "id", "LQL/x;", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/RewardRemote;", "c", "", "amount", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyRewardEstimatedPointsRemote;", "a", "(DLdI/e;)Ljava/lang/Object;", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {
    @C16704f("customer/v6/{cc}/{lc}/rewards/family/estimate-points")
    Object a(@t("amount") double d10, C17164e<? super FamilyRewardEstimatedPointsRemote> eVar);

    @C16704f("customer/v6/{cc}/{lc}/rewards/family/events")
    Object b(C17164e<? super FamilyRewardsHistoryRemote> eVar);

    @C16712n("customer/v6/{cc}/{lc}/rewards/family/{id}")
    Object c(@s("id") String str, @t("userTimezone") String str2, C17164e<? super x<RewardRemote>> eVar);

    @C16704f("customer/v6/{cc}/{lc}/rewards/family")
    Object d(@t("userTimezone") String str, @t("scope") String str2, C17164e<? super FamilyCustomerRewardRemote> eVar);

    @C16704f("customer/v6/{cc}/{lc}/rewards/family/faq")
    Object e(C17164e<? super FamilyRewardsFAQRemote> eVar);

    @C16704f("customer/v6/{cc}/{lc}/rewards/family/activities")
    Object f(C17164e<? super FamilyRewardInteractionsRemote> eVar);
}
