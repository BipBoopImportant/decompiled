package tv;

import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Ltv/b;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "AMEX", "DISCOVER", "JCB", "MASTERCARD", "VISA", "INTERAC", "mcomsettings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: tv.b  reason: case insensitive filesystem */
public enum C11997b {
    AMEX(CheckoutConstants.PaymentBrands.AMEX),
    DISCOVER("DISCOVER"),
    JCB("JCB"),
    MASTERCARD("MASTERCARD"),
    VISA("VISA"),
    INTERAC("INTERAC");
    
    private final String rawValue;

    static {
        C11997b[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private C11997b(String str) {
        this.rawValue = str;
    }

    public final String b() {
        return this.rawValue;
    }
}
