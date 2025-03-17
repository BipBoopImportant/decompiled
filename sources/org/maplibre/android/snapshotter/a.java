package org.maplibre.android.snapshotter;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MapSnapshotter f146073a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MapSnapshot f146074b;

    public /* synthetic */ a(MapSnapshotter mapSnapshotter, MapSnapshot mapSnapshot) {
        this.f146073a = mapSnapshotter;
        this.f146074b = mapSnapshot;
    }

    public final void run() {
        MapSnapshotter.d(this.f146073a, this.f146074b);
    }
}
