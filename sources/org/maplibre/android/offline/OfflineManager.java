package org.maplibre.android.offline;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.maplibre.android.storage.FileSource;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0007\u0018\u0000 82\u00020\u0001:\u00069:;<=8J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H ¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H ¢\u0006\u0004\b\t\u0010\nJ(\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\rH ¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0014H ¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u0019H ¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u001cH ¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u001cH ¢\u0006\u0004\b\u001f\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u001cH ¢\u0006\u0004\b \u0010\u001eJ\u001a\u0010!\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u001cH ¢\u0006\u0004\b!\u0010\u001eJ\"\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u001cH ¢\u0006\u0004\b#\u0010$J\u0018\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u000bH ¢\u0006\u0004\b&\u0010'J\u0018\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H ¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0004H ¢\u0006\u0004\b,\u0010-JF\u00104\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010\u00172\b\u0010/\u001a\u0004\u0018\u00010\u00122\u0006\u00100\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000b2\b\u00102\u001a\u0004\u0018\u00010\u00172\u0006\u00103\u001a\u00020(H ¢\u0006\u0004\b4\u00105R\u0014\u00106\u001a\u00020\u000b8\u0002XD¢\u0006\u0006\n\u0004\b6\u00107¨\u0006>"}, d2 = {"Lorg/maplibre/android/offline/OfflineManager;", "", "Lorg/maplibre/android/storage/FileSource;", "fileSource", "LXH/N;", "initialize", "(Lorg/maplibre/android/storage/FileSource;)V", "Lorg/maplibre/android/offline/OfflineManager$ListOfflineRegionsCallback;", "callback", "listOfflineRegions", "(Lorg/maplibre/android/storage/FileSource;Lorg/maplibre/android/offline/OfflineManager$ListOfflineRegionsCallback;)V", "", "regionID", "Lorg/maplibre/android/offline/OfflineManager$GetOfflineRegionCallback;", "getOfflineRegion", "(Lorg/maplibre/android/storage/FileSource;JLorg/maplibre/android/offline/OfflineManager$GetOfflineRegionCallback;)V", "Lorg/maplibre/android/offline/OfflineRegionDefinition;", "definition", "", "metadata", "Lorg/maplibre/android/offline/OfflineManager$CreateOfflineRegionCallback;", "createOfflineRegion", "(Lorg/maplibre/android/storage/FileSource;Lorg/maplibre/android/offline/OfflineRegionDefinition;[BLorg/maplibre/android/offline/OfflineManager$CreateOfflineRegionCallback;)V", "", "path", "Lorg/maplibre/android/offline/OfflineManager$MergeOfflineRegionsCallback;", "mergeOfflineRegions", "(Lorg/maplibre/android/storage/FileSource;Ljava/lang/String;Lorg/maplibre/android/offline/OfflineManager$MergeOfflineRegionsCallback;)V", "Lorg/maplibre/android/offline/OfflineManager$FileSourceCallback;", "nativeResetDatabase", "(Lorg/maplibre/android/offline/OfflineManager$FileSourceCallback;)V", "nativePackDatabase", "nativeInvalidateAmbientCache", "nativeClearAmbientCache", "size", "nativeSetMaximumAmbientCacheSize", "(JLorg/maplibre/android/offline/OfflineManager$FileSourceCallback;)V", "limit", "setOfflineMapboxTileCountLimit", "(J)V", "", "autopack", "runPackDatabaseAutomatically", "(Z)V", "finalize", "()V", "url", "data", "modified", "expires", "etag", "mustRevalidate", "putResourceWithUrl", "(Ljava/lang/String;[BJJLjava/lang/String;Z)V", "nativePtr", "J", "a", "ListOfflineRegionsCallback", "GetOfflineRegionCallback", "CreateOfflineRegionCallback", "MergeOfflineRegionsCallback", "FileSourceCallback", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OfflineManager {

    /* renamed from: a  reason: collision with root package name */
    public static final a f146052a = new a((DefaultConstructorMarker) null);
    @Keep
    private final long nativePtr;

    @Keep
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lorg/maplibre/android/offline/OfflineManager$CreateOfflineRegionCallback;", "", "Lorg/maplibre/android/offline/OfflineRegion;", "offlineRegion", "LXH/N;", "onCreate", "(Lorg/maplibre/android/offline/OfflineRegion;)V", "", "error", "onError", "(Ljava/lang/String;)V", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface CreateOfflineRegionCallback {
        void onCreate(OfflineRegion offlineRegion);

        void onError(String str);
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lorg/maplibre/android/offline/OfflineManager$FileSourceCallback;", "", "LXH/N;", "onSuccess", "()V", "", "message", "onError", "(Ljava/lang/String;)V", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface FileSourceCallback {
        void onError(String str);

        void onSuccess();
    }

    @Keep
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lorg/maplibre/android/offline/OfflineManager$GetOfflineRegionCallback;", "", "Lorg/maplibre/android/offline/OfflineRegion;", "offlineRegion", "LXH/N;", "onRegion", "(Lorg/maplibre/android/offline/OfflineRegion;)V", "onRegionNotFound", "()V", "", "error", "onError", "(Ljava/lang/String;)V", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface GetOfflineRegionCallback {
        void onError(String str);

        void onRegion(OfflineRegion offlineRegion);

        void onRegionNotFound();
    }

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lorg/maplibre/android/offline/OfflineManager$ListOfflineRegionsCallback;", "", "", "Lorg/maplibre/android/offline/OfflineRegion;", "offlineRegions", "LXH/N;", "onList", "([Lorg/maplibre/android/offline/OfflineRegion;)V", "", "error", "onError", "(Ljava/lang/String;)V", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ListOfflineRegionsCallback {
        void onError(String str);

        void onList(OfflineRegion[] offlineRegionArr);
    }

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lorg/maplibre/android/offline/OfflineManager$MergeOfflineRegionsCallback;", "", "", "Lorg/maplibre/android/offline/OfflineRegion;", "offlineRegions", "LXH/N;", "onMerge", "([Lorg/maplibre/android/offline/OfflineRegion;)V", "", "error", "onError", "(Ljava/lang/String;)V", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface MergeOfflineRegionsCallback {
        void onError(String str);

        void onMerge(OfflineRegion[] offlineRegionArr);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lorg/maplibre/android/offline/OfflineManager$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/maplibre/android/offline/OfflineManager;", "instance", "Lorg/maplibre/android/offline/OfflineManager;", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
    private final native void createOfflineRegion(FileSource fileSource, OfflineRegionDefinition offlineRegionDefinition, byte[] bArr, CreateOfflineRegionCallback createOfflineRegionCallback);

    @Keep
    private final native void getOfflineRegion(FileSource fileSource, long j10, GetOfflineRegionCallback getOfflineRegionCallback);

    @Keep
    private final native void initialize(FileSource fileSource);

    @Keep
    private final native void listOfflineRegions(FileSource fileSource, ListOfflineRegionsCallback listOfflineRegionsCallback);

    @Keep
    private final native void mergeOfflineRegions(FileSource fileSource, String str, MergeOfflineRegionsCallback mergeOfflineRegionsCallback);

    @Keep
    private final native void nativeClearAmbientCache(FileSourceCallback fileSourceCallback);

    @Keep
    private final native void nativeInvalidateAmbientCache(FileSourceCallback fileSourceCallback);

    @Keep
    private final native void nativePackDatabase(FileSourceCallback fileSourceCallback);

    @Keep
    private final native void nativeResetDatabase(FileSourceCallback fileSourceCallback);

    @Keep
    private final native void nativeSetMaximumAmbientCacheSize(long j10, FileSourceCallback fileSourceCallback);

    /* access modifiers changed from: protected */
    @Keep
    public final native void finalize();

    @Keep
    public final native void putResourceWithUrl(String str, byte[] bArr, long j10, long j11, String str2, boolean z10);

    @Keep
    public final native void runPackDatabaseAutomatically(boolean z10);

    @Keep
    public final native void setOfflineMapboxTileCountLimit(long j10);
}
