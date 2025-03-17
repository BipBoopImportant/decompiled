package org.maplibre.android.style.sources;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH ¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH ¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006H ¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lorg/maplibre/android/style/sources/RasterSource;", "Lorg/maplibre/android/style/sources/Source;", "", "nativePtr", "<init>", "(J)V", "", "layerId", "", "payload", "", "tileSize", "LXH/N;", "initialize", "(Ljava/lang/String;Ljava/lang/Object;I)V", "finalize", "()V", "nativeGetUrl", "()Ljava/lang/String;", "a", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RasterSource extends Source {

    /* renamed from: a  reason: collision with root package name */
    public static final a f146102a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lorg/maplibre/android/style/sources/RasterSource$a;", "", "<init>", "()V", "", "DEFAULT_TILE_SIZE", "I", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Keep
    public RasterSource(long j10) {
        super(j10);
    }

    /* access modifiers changed from: protected */
    @Keep
    public final native void finalize();

    /* access modifiers changed from: protected */
    @Keep
    public final native void initialize(String str, Object obj, int i10);

    /* access modifiers changed from: protected */
    @Keep
    public final native String nativeGetUrl();
}
