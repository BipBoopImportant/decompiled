package bI;

import java.util.Comparator;

/* renamed from: bI.b  reason: case insensitive filesystem */
public final /* synthetic */ class C17036b implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Comparator f141161a;

    public /* synthetic */ C17036b(Comparator comparator) {
        this.f141161a = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        return C17038d.i(this.f141161a, obj, obj2);
    }
}
