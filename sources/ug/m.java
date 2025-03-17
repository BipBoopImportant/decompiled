package ug;

import Zj.b;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00058&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\r\u001a\u0004\u0018\u00010\u00058&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\u000e"}, d2 = {"Lug/m;", "", "LXH/N;", "f", "()V", "", "a", "()Ljava/lang/String;", "setExpectedCheckoutState", "(Ljava/lang/String;)V", "expectedCheckoutState", "b", "setExpectedOrderStatus", "expectedOrderStatus", "featureflags_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface m {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lug/m$a;", "LZj/b;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "OVERRIDE_SCAN_AND_GO_EXPECTED_CHECKOUT_STATE", "OVERRIDE_EXPECTED_ORDER_STATUS", "featureflags_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a implements b {
        OVERRIDE_SCAN_AND_GO_EXPECTED_CHECKOUT_STATE("override_scan_and_go_expected_checkout_state"),
        OVERRIDE_EXPECTED_ORDER_STATUS("override_expected_order_status");
        
        private final String key;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private a(String str) {
            this.key = str;
        }

        public String getKey() {
            return this.key;
        }
    }

    String a();

    String b();

    void f();
}
