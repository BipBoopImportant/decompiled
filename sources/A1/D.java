package A1;

import android.view.MotionEvent;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014¨\u0006\u0015"}, d2 = {"LA1/D;", "", "", "uptime", "", "LA1/E;", "pointers", "Landroid/view/MotionEvent;", "motionEvent", "<init>", "(JLjava/util/List;Landroid/view/MotionEvent;)V", "a", "J", "getUptime", "()J", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Landroid/view/MotionEvent;", "()Landroid/view/MotionEvent;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class D {

    /* renamed from: a  reason: collision with root package name */
    private final long f4324a;

    /* renamed from: b  reason: collision with root package name */
    private final List<E> f4325b;

    /* renamed from: c  reason: collision with root package name */
    private final MotionEvent f4326c;

    public D(long j10, List<E> list, MotionEvent motionEvent) {
        this.f4324a = j10;
        this.f4325b = list;
        this.f4326c = motionEvent;
    }

    public final MotionEvent a() {
        return this.f4326c;
    }

    public final List<E> b() {
        return this.f4325b;
    }
}
