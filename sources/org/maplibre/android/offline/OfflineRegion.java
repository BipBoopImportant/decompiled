package org.maplibre.android.offline;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.maplibre.android.MapLibre;
import org.maplibre.android.storage.FileSource;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 ?2\u00020\u0001:\u0006@ABCD'B1\b\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H ¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H ¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0018H ¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u001bH ¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u001f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u001eH ¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\"\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020!H ¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\rH ¢\u0006\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\u00028\u0002XD¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0017\u00101\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u00100R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R$\u0010\n\u001a\u00020\t2\u0006\u00106\u001a\u00020\t8\u0006@BX\u000e¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0014\u0010>\u001a\u00020;8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006E"}, d2 = {"Lorg/maplibre/android/offline/OfflineRegion;", "", "", "offlineRegionPtr", "Lorg/maplibre/android/storage/FileSource;", "fileSource", "idParam", "Lorg/maplibre/android/offline/OfflineRegionDefinition;", "definition", "", "metadata", "<init>", "(JLorg/maplibre/android/storage/FileSource;JLorg/maplibre/android/offline/OfflineRegionDefinition;[B)V", "LXH/N;", "initialize", "(JLorg/maplibre/android/storage/FileSource;)V", "Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionObserver;", "callback", "setOfflineRegionObserver", "(Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionObserver;)V", "", "offlineRegionDownloadState", "setOfflineRegionDownloadState", "(I)V", "Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionStatusCallback;", "getOfflineRegionStatus", "(Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionStatusCallback;)V", "Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionDeleteCallback;", "deleteOfflineRegion", "(Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionDeleteCallback;)V", "Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionUpdateMetadataCallback;", "updateOfflineRegionMetadata", "([BLorg/maplibre/android/offline/OfflineRegion$OfflineRegionUpdateMetadataCallback;)V", "Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionInvalidateCallback;", "invalidateOfflineRegion", "(Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionInvalidateCallback;)V", "finalize", "()V", "Landroid/content/Context;", "a", "Landroid/content/Context;", "context", "nativePtr", "J", "b", "Lorg/maplibre/android/storage/FileSource;", "c", "getId", "()J", "id", "d", "Lorg/maplibre/android/offline/OfflineRegionDefinition;", "getDefinition", "()Lorg/maplibre/android/offline/OfflineRegionDefinition;", "value", "e", "[B", "getMetadata", "()[B", "Landroid/os/Handler;", "f", "Landroid/os/Handler;", "handler", "g", "OfflineRegionObserver", "OfflineRegionStatusCallback", "OfflineRegionDeleteCallback", "OfflineRegionInvalidateCallback", "OfflineRegionUpdateMetadataCallback", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OfflineRegion {

    /* renamed from: g  reason: collision with root package name */
    public static final a f146053g = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Context f146054a = MapLibre.getApplicationContext();

    /* renamed from: b  reason: collision with root package name */
    private final FileSource f146055b;

    /* renamed from: c  reason: collision with root package name */
    private final long f146056c;

    /* renamed from: d  reason: collision with root package name */
    private final OfflineRegionDefinition f146057d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f146058e;

    /* renamed from: f  reason: collision with root package name */
    private final Handler f146059f = new Handler(Looper.getMainLooper());
    @Keep
    private final long nativePtr;

    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionDeleteCallback;", "", "LXH/N;", "onDelete", "()V", "", "error", "onError", "(Ljava/lang/String;)V", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OfflineRegionDeleteCallback {
        void onDelete();

        void onError(String str);
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionInvalidateCallback;", "", "LXH/N;", "onInvalidate", "()V", "", "error", "onError", "(Ljava/lang/String;)V", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OfflineRegionInvalidateCallback {
        void onError(String str);

        void onInvalidate();
    }

    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionObserver;", "", "Lorg/maplibre/android/offline/OfflineRegionStatus;", "status", "LXH/N;", "onStatusChanged", "(Lorg/maplibre/android/offline/OfflineRegionStatus;)V", "Lorg/maplibre/android/offline/OfflineRegionError;", "error", "onError", "(Lorg/maplibre/android/offline/OfflineRegionError;)V", "", "limit", "mapboxTileCountLimitExceeded", "(J)V", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OfflineRegionObserver {
        void mapboxTileCountLimitExceeded(long j10);

        void onError(OfflineRegionError offlineRegionError);

        void onStatusChanged(OfflineRegionStatus offlineRegionStatus);
    }

    @Keep
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionStatusCallback;", "", "Lorg/maplibre/android/offline/OfflineRegionStatus;", "status", "LXH/N;", "onStatus", "(Lorg/maplibre/android/offline/OfflineRegionStatus;)V", "", "error", "onError", "(Ljava/lang/String;)V", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OfflineRegionStatusCallback {
        void onError(String str);

        void onStatus(OfflineRegionStatus offlineRegionStatus);
    }

    @Keep
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionUpdateMetadataCallback;", "", "", "metadata", "LXH/N;", "onUpdate", "([B)V", "", "error", "onError", "(Ljava/lang/String;)V", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OfflineRegionUpdateMetadataCallback {
        void onError(String str);

        void onUpdate(byte[] bArr);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lorg/maplibre/android/offline/OfflineRegion$a;", "", "<init>", "()V", "", "STATE_INACTIVE", "I", "STATE_ACTIVE", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        org.maplibre.android.a.a();
    }

    @Keep
    private OfflineRegion(long j10, FileSource fileSource, long j11, OfflineRegionDefinition offlineRegionDefinition, byte[] bArr) {
        this.f146055b = fileSource;
        this.f146056c = j11;
        this.f146057d = offlineRegionDefinition;
        this.f146058e = bArr;
        initialize(j10, fileSource);
    }

    @Keep
    private final native void deleteOfflineRegion(OfflineRegionDeleteCallback offlineRegionDeleteCallback);

    @Keep
    private final native void getOfflineRegionStatus(OfflineRegionStatusCallback offlineRegionStatusCallback);

    @Keep
    private final native void initialize(long j10, FileSource fileSource);

    @Keep
    private final native void invalidateOfflineRegion(OfflineRegionInvalidateCallback offlineRegionInvalidateCallback);

    @Keep
    private final native void setOfflineRegionDownloadState(int i10);

    @Keep
    private final native void setOfflineRegionObserver(OfflineRegionObserver offlineRegionObserver);

    @Keep
    private final native void updateOfflineRegionMetadata(byte[] bArr, OfflineRegionUpdateMetadataCallback offlineRegionUpdateMetadataCallback);

    /* access modifiers changed from: protected */
    @Keep
    public final native void finalize();
}
