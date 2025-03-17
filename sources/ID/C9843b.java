package id;

import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lid/b;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "b", "()I", "Book", "Buy", "Checkout", "Donate", "Order", "Pay", "Plain", "Subscribe", "compose-pay-button_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: id.b  reason: case insensitive filesystem */
public enum C9843b {
    Book(2),
    Buy(1),
    Checkout(3),
    Donate(4),
    Order(5),
    Pay(6),
    Plain(8),
    Subscribe(7);
    
    private final int value;

    static {
        C9843b[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private C9843b(int i10) {
        this.value = i10;
    }

    public final int b() {
        return this.value;
    }
}
