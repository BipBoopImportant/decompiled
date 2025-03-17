package k1;

import android.util.LongSparseArray;
import k1.C5492b;

/* renamed from: k1.k  reason: case insensitive filesystem */
public final /* synthetic */ class C5501k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C5492b f25018a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LongSparseArray f25019b;

    public /* synthetic */ C5501k(C5492b bVar, LongSparseArray longSparseArray) {
        this.f25018a = bVar;
        this.f25019b = longSparseArray;
    }

    public final void run() {
        C5492b.C0400b.e(this.f25018a, this.f25019b);
    }
}
