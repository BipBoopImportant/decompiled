package yd;

import fI.C17221b;
import kotlin.Metadata;
import uK.C18148c;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lyd/i;", "", "", "icon", "<init>", "(Ljava/lang/String;II)V", "I", "b", "()I", "POI_SUBTYPE_RESTAURANT_AND_CAFE", "POI_SUBTYPE_RESTROOM", "POI_SUBTYPE_STAIRS", "POI_SUBTYPE_CHECK_OUT", "POI_SUBTYPE_CUSTOMER_SERVICE", "POI_SUBTYPE_EXIT", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: yd.i  reason: case insensitive filesystem */
public enum C10455i {
    POI_SUBTYPE_RESTAURANT_AND_CAFE(C18148c.Cutlery.m()),
    POI_SUBTYPE_RESTROOM(C18148c.Restroom.m()),
    POI_SUBTYPE_STAIRS(C18148c.Stairs.m()),
    POI_SUBTYPE_CHECK_OUT(C18148c.CreditCard.m()),
    POI_SUBTYPE_CUSTOMER_SERVICE(C18148c.CoWorker.m()),
    POI_SUBTYPE_EXIT(C18148c.ArrowLeft.m());
    
    private final int icon;

    static {
        C10455i[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private C10455i(int i10) {
        this.icon = i10;
    }

    public final int b() {
        return this.icon;
    }
}
