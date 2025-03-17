package KL;

import java.util.concurrent.atomic.AtomicLong;
import org.maplibre.android.style.layers.SymbolLayer;
import org.maplibre.android.style.sources.GeoJsonSource;
import org.maplibre.android.style.sources.a;

class l implements C16001e<SymbolLayer> {

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicLong f135981c = new AtomicLong(0);

    /* renamed from: a  reason: collision with root package name */
    private final String f135982a;

    /* renamed from: b  reason: collision with root package name */
    private final String f135983b;

    l() {
        long incrementAndGet = f135981c.incrementAndGet();
        this.f135982a = String.format("mapbox-android-symbol-layer-%s", new Object[]{Long.valueOf(incrementAndGet)});
        this.f135983b = String.format("mapbox-android-symbol-source-%s", new Object[]{Long.valueOf(incrementAndGet)});
    }

    public String a() {
        return this.f135982a;
    }

    public GeoJsonSource c(a aVar) {
        return new GeoJsonSource(this.f135983b, aVar);
    }

    /* renamed from: d */
    public SymbolLayer b() {
        return new SymbolLayer(this.f135982a, this.f135983b);
    }
}
