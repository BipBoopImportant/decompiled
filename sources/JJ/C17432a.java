package jJ;

import kotlin.jvm.internal.C17542s;

/* renamed from: jJ.a  reason: case insensitive filesystem */
public abstract class C17432a implements Comparable<C17432a> {
    /* renamed from: a */
    public int compareTo(C17432a aVar) {
        C17542s.j(aVar, "other");
        int compareTo = b().compareTo(aVar.b());
        if (compareTo != 0 || j() || !aVar.j()) {
            return compareTo;
        }
        return 1;
    }

    public abstract C17433b b();

    public abstract boolean j();
}
