package fd;

import android.media.Image;

/* renamed from: fd.b  reason: case insensitive filesystem */
final class C9708b {

    /* renamed from: a  reason: collision with root package name */
    private final Image f72978a;

    C9708b(Image image) {
        this.f72978a = image;
    }

    /* access modifiers changed from: package-private */
    public final Image a() {
        return this.f72978a;
    }

    /* access modifiers changed from: package-private */
    public final Image.Plane[] b() {
        return this.f72978a.getPlanes();
    }
}
