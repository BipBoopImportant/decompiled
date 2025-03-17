package O;

import H2.a;
import kotlin.jvm.internal.C17542s;

/* renamed from: O.u  reason: case insensitive filesystem */
public class C4710u<T> implements a<T> {

    /* renamed from: a  reason: collision with root package name */
    private a<T> f9652a;

    public void a(a<T> aVar) {
        this.f9652a = aVar;
    }

    public void accept(T t10) {
        C17542s.h(this.f9652a, "Listener is not set.");
        this.f9652a.accept(t10);
    }
}
