package v6;

import java.util.Observable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lv6/g;", "Ljava/util/Observable;", "<init>", "()V", "Lv6/f;", "configuration", "LXH/N;", "a", "(Lv6/f;)V", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class g extends Observable {

    /* renamed from: a  reason: collision with root package name */
    public static final g f56913a = new g();

    private g() {
    }

    public final void a(f fVar) {
        setChanged();
        notifyObservers(fVar);
        clearChanged();
    }
}
