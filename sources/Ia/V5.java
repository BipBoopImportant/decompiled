package ia;

import java.util.Iterator;

final class V5 extends Q5 {

    /* renamed from: c  reason: collision with root package name */
    private final transient P5 f53447c;

    /* renamed from: d  reason: collision with root package name */
    private final transient N5 f53448d;

    V5(P5 p52, N5 n52) {
        this.f53447c = p52;
        this.f53448d = n52;
    }

    /* access modifiers changed from: package-private */
    public final int b(Object[] objArr, int i10) {
        return this.f53448d.b(objArr, 0);
    }

    public final boolean contains(Object obj) {
        return this.f53447c.get(obj) != null;
    }

    public final /* synthetic */ Iterator iterator() {
        return this.f53448d.listIterator(0);
    }

    public final int size() {
        return this.f53447c.size();
    }
}
