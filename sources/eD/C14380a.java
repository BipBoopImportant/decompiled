package eD;

import com.google.android.libraries.places.api.model.PlaceTypes;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\u0007j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"LeD/a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getValue", "DELIVERY", "INVOICE", "useraccount-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eD.a  reason: case insensitive filesystem */
public enum C14380a {
    DELIVERY("deliveryaddress"),
    INVOICE(PlaceTypes.ADDRESS);
    
    private final String value;

    static {
        C14380a[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private C14380a(String str) {
        this.value = str;
    }

    public String toString() {
        return this.value;
    }
}
