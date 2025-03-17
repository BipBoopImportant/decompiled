package mx;

import GK.C15777E;
import QL.x;
import VL.C16699a;
import VL.C16704f;
import VL.C16712n;
import VL.o;
import com.ingka.ikea.prepaidcarddata.impl.data.model.remote.AttachPrepaidCardBody;
import com.ingka.ikea.prepaidcarddata.impl.data.model.remote.DetachPrepaidCardBody;
import com.ingka.ikea.prepaidcarddata.impl.data.model.remote.GiftCardBalanceBody;
import com.ingka.ikea.prepaidcarddata.impl.data.model.remote.GiftCardRemote;
import com.ingka.ikea.prepaidcarddata.impl.data.model.remote.PrepaidCardsRemote;
import com.ingka.ikea.prepaidcarddata.impl.data.model.remote.RefundCardBalanceBody;
import com.ingka.ikea.prepaidcarddata.impl.data.model.remote.RefundCardRemote;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lmx/c;", "", "Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/GiftCardBalanceBody;", "body", "LQL/x;", "Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/GiftCardRemote;", "e", "(Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/GiftCardBalanceBody;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/RefundCardBalanceBody;", "Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/RefundCardRemote;", "a", "(Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/RefundCardBalanceBody;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/PrepaidCardsRemote;", "b", "(LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/AttachPrepaidCardBody;", "LGK/E;", "c", "(Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/AttachPrepaidCardBody;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/DetachPrepaidCardBody;", "d", "(Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/DetachPrepaidCardBody;LdI/e;)Ljava/lang/Object;", "prepaidcarddata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface c {
    @o("customer/v6/{cc}/{lc}/prepaid-balance")
    Object a(@C16699a RefundCardBalanceBody refundCardBalanceBody, C17164e<? super x<RefundCardRemote>> eVar);

    @C16704f("/customer/v6/{cc}/{lc}/prepaid-cards")
    Object b(C17164e<? super PrepaidCardsRemote> eVar);

    @C16712n("/customer/v6/{cc}/{lc}/prepaid-cards/attach")
    Object c(@C16699a AttachPrepaidCardBody attachPrepaidCardBody, C17164e<? super x<C15777E>> eVar);

    @C16712n("/customer/v6/{cc}/{lc}/prepaid-cards/detach")
    Object d(@C16699a DetachPrepaidCardBody detachPrepaidCardBody, C17164e<? super x<C15777E>> eVar);

    @o("customer/v6/{cc}/{lc}/giftcard")
    Object e(@C16699a GiftCardBalanceBody giftCardBalanceBody, C17164e<? super x<GiftCardRemote>> eVar);
}
