package WF;

import OE.n;
import fI.C17221b;
import kotlin.Metadata;
import uK.C18148c;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"LWF/b;", "", "", "stringId", "iconId", "<init>", "(Ljava/lang/String;III)V", "I", "j", "()I", "b", "DELIVERY", "CLICK_COLLECT", "IN_STORE", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WF.b  reason: case insensitive filesystem */
public enum C16714b {
    DELIVERY(n.f113307X1, C18148c.DeliveryTruck.m()),
    CLICK_COLLECT(n.f113313Y1, C18148c.ClickAndCollect.m()),
    IN_STORE(n.f113319Z1, C18148c.Store.m());
    
    private final int iconId;
    private final int stringId;

    static {
        C16714b[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private C16714b(int i10, int i11) {
        this.stringId = i10;
        this.iconId = i11;
    }

    public final int b() {
        return this.iconId;
    }

    public final int j() {
        return this.stringId;
    }
}
