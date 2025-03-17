package org.maplibre.android.snapshotter;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.geometry.LatLngBounds;
import org.maplibre.android.maps.Image;
import org.maplibre.android.storage.FileSource;
import org.maplibre.android.style.layers.Layer;
import org.maplibre.android.style.sources.Source;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0017\u0018\u0000 O2\u00020\u0001:\u0001LJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u0007\u0010\bJ \u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004H ¢\u0006\u0004\b\n\u0010\bJ \u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH ¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0002H ¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0017\u001a\u00020\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H ¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0004H ¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0004H ¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010\"\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000bH ¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010$H ¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010(H ¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010\u0004H ¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u00020\u00062\b\u0010/\u001a\u0004\u0018\u00010\u0004H ¢\u0006\u0004\b0\u0010.J\u0017\u00103\u001a\u00020\u00062\u0006\u00102\u001a\u000201H\u0005¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u0004H\u0005¢\u0006\u0004\b6\u0010.J\u0017\u00107\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u0004H\u0005¢\u0006\u0004\b7\u0010.J\u000f\u00108\u001a\u00020\u0006H\u0005¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u0004H\u0005¢\u0006\u0004\b;\u0010.Jv\u0010E\u001a\u00020\u00062\b\u0010<\u001a\u0004\u0018\u00010\u00002\b\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010@\u001a\u00020?2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u00042\b\u0010/\u001a\u0004\u0018\u00010\u00042\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010A\u001a\u0004\u0018\u00010$2\u0006\u0010C\u001a\u00020B2\b\u0010D\u001a\u0004\u0018\u00010\u0004H ¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020\u0006H ¢\u0006\u0004\bG\u00109J\u0010\u0010H\u001a\u00020\u0006H ¢\u0006\u0004\bH\u00109J\u0010\u0010I\u001a\u00020\u0006H ¢\u0006\u0004\bI\u00109R\u0014\u0010J\u001a\u00020\u00028\u0002XD¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010N\u001a\u00020B8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006P"}, d2 = {"Lorg/maplibre/android/snapshotter/MapSnapshotter;", "", "", "layerPtr", "", "below", "LXH/N;", "nativeAddLayerBelow", "(JLjava/lang/String;)V", "above", "nativeAddLayerAbove", "", "index", "nativeAddLayerAt", "(JI)V", "Lorg/maplibre/android/style/sources/Source;", "source", "sourcePtr", "nativeAddSource", "(Lorg/maplibre/android/style/sources/Source;J)V", "", "Lorg/maplibre/android/maps/Image;", "images", "nativeAddImages", "([Lorg/maplibre/android/maps/Image;)V", "layerId", "Lorg/maplibre/android/style/layers/Layer;", "nativeGetLayer", "(Ljava/lang/String;)Lorg/maplibre/android/style/layers/Layer;", "sourceId", "nativeGetSource", "(Ljava/lang/String;)Lorg/maplibre/android/style/sources/Source;", "width", "height", "setSize", "(II)V", "Lorg/maplibre/android/camera/CameraPosition;", "cameraPosition", "setCameraPosition", "(Lorg/maplibre/android/camera/CameraPosition;)V", "Lorg/maplibre/android/geometry/LatLngBounds;", "region", "setRegion", "(Lorg/maplibre/android/geometry/LatLngBounds;)V", "styleUrl", "setStyleUrl", "(Ljava/lang/String;)V", "styleJson", "setStyleJson", "Lorg/maplibre/android/snapshotter/MapSnapshot;", "snapshot", "onSnapshotReady", "(Lorg/maplibre/android/snapshotter/MapSnapshot;)V", "reason", "onSnapshotFailed", "onDidFailLoadingStyle", "onDidFinishLoadingStyle", "()V", "imageName", "onStyleImageMissing", "mapSnapshotter", "Lorg/maplibre/android/storage/FileSource;", "fileSource", "", "pixelRatio", "position", "", "showLogo", "localIdeographFontFamily", "nativeInitialize", "(Lorg/maplibre/android/snapshotter/MapSnapshotter;Lorg/maplibre/android/storage/FileSource;FIILjava/lang/String;Ljava/lang/String;Lorg/maplibre/android/geometry/LatLngBounds;Lorg/maplibre/android/camera/CameraPosition;ZLjava/lang/String;)V", "nativeStart", "nativeCancel", "finalize", "nativePtr", "J", "a", "Z", "fullyLoaded", "b", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class MapSnapshotter {

    /* renamed from: b  reason: collision with root package name */
    public static final a f146071b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private boolean f146072a;
    @Keep
    private final long nativePtr;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lorg/maplibre/android/snapshotter/MapSnapshotter$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "LOGO_MARGIN_DP", "I", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* access modifiers changed from: private */
    public static final void c(MapSnapshotter mapSnapshotter, String str) {
        mapSnapshotter.getClass();
    }

    /* access modifiers changed from: private */
    public static final void d(MapSnapshotter mapSnapshotter, MapSnapshot mapSnapshot) {
        mapSnapshotter.getClass();
    }

    @Keep
    private final native void nativeAddImages(Image[] imageArr);

    @Keep
    private final native void nativeAddLayerAbove(long j10, String str);

    @Keep
    private final native void nativeAddLayerAt(long j10, int i10);

    @Keep
    private final native void nativeAddLayerBelow(long j10, String str);

    @Keep
    private final native void nativeAddSource(Source source, long j10);

    @Keep
    private final native Layer nativeGetLayer(String str);

    @Keep
    private final native Source nativeGetSource(String str);

    /* access modifiers changed from: protected */
    @Keep
    public native void finalize();

    /* access modifiers changed from: protected */
    @Keep
    public final native void nativeCancel();

    /* access modifiers changed from: protected */
    @Keep
    public final native void nativeInitialize(MapSnapshotter mapSnapshotter, FileSource fileSource, float f10, int i10, int i11, String str, String str2, LatLngBounds latLngBounds, CameraPosition cameraPosition, boolean z10, String str3);

    /* access modifiers changed from: protected */
    @Keep
    public final native void nativeStart();

    /* access modifiers changed from: protected */
    @Keep
    public final void onDidFailLoadingStyle(String str) {
        C17542s.j(str, "reason");
        onSnapshotFailed(str);
    }

    /* access modifiers changed from: protected */
    @Keep
    public final void onDidFinishLoadingStyle() {
        if (!this.f146072a) {
            this.f146072a = true;
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    @Keep
    public final void onSnapshotFailed(String str) {
        C17542s.j(str, "reason");
        new Handler(Looper.getMainLooper()).post(new b(this, str));
    }

    /* access modifiers changed from: protected */
    @Keep
    public final void onSnapshotReady(MapSnapshot mapSnapshot) {
        C17542s.j(mapSnapshot, "snapshot");
        new Handler(Looper.getMainLooper()).post(new a(this, mapSnapshot));
    }

    /* access modifiers changed from: protected */
    @Keep
    public final void onStyleImageMissing(String str) {
        C17542s.j(str, "imageName");
    }

    @Keep
    public final native void setCameraPosition(CameraPosition cameraPosition);

    @Keep
    public final native void setRegion(LatLngBounds latLngBounds);

    @Keep
    public final native void setSize(int i10, int i11);

    @Keep
    public final native void setStyleJson(String str);

    @Keep
    public final native void setStyleUrl(String str);
}
