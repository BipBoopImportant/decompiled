package wv;

import com.ingka.ikea.mcomsettings.impl.DeliveryTimeSlotDatePatternsHolder;
import kK.C17514c;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lwv/c;", "", "<init>", "()V", "Lcom/ingka/ikea/mcomsettings/impl/DeliveryTimeSlotDatePatternsHolder;", "holder", "", "a", "(Lcom/ingka/ikea/mcomsettings/impl/DeliveryTimeSlotDatePatternsHolder;)Ljava/lang/String;", "serializedObject", "b", "(Ljava/lang/String;)Lcom/ingka/ikea/mcomsettings/impl/DeliveryTimeSlotDatePatternsHolder;", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wv.c  reason: case insensitive filesystem */
public final class C12306c {
    public final String a(DeliveryTimeSlotDatePatternsHolder deliveryTimeSlotDatePatternsHolder) {
        if (deliveryTimeSlotDatePatternsHolder != null) {
            return C17514c.f144280d.b(DeliveryTimeSlotDatePatternsHolder.Companion.serializer(), deliveryTimeSlotDatePatternsHolder);
        }
        return null;
    }

    public final DeliveryTimeSlotDatePatternsHolder b(String str) {
        if (str != null) {
            return (DeliveryTimeSlotDatePatternsHolder) C17514c.f144280d.c(DeliveryTimeSlotDatePatternsHolder.Companion.serializer(), str);
        }
        return null;
    }
}
