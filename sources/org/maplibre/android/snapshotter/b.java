package org.maplibre.android.snapshotter;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MapSnapshotter f146075a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f146076b;

    public /* synthetic */ b(MapSnapshotter mapSnapshotter, String str) {
        this.f146075a = mapSnapshotter;
        this.f146076b = str;
    }

    public final void run() {
        MapSnapshotter.c(this.f146075a, this.f146076b);
    }
}
