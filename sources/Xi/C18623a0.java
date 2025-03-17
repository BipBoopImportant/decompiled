package xI;

import java.util.Comparator;
import nI.p;

/* renamed from: xI.a0  reason: case insensitive filesystem */
class C18623a0 implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    private final p f152381a;

    public C18623a0(p pVar) {
        this.f152381a = pVar;
    }

    public int compare(Object obj, Object obj2) {
        return C18629d0.L(this.f152381a, obj, obj2);
    }
}
