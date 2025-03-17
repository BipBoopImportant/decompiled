package org.maplibre.android.offline;

import androidx.annotation.Keep;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\u0018\u00002\u00020\u0001BA\b\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u000b\u0010 ¨\u0006!"}, d2 = {"Lorg/maplibre/android/offline/OfflineRegionStatus;", "", "", "downloadState", "", "completedResourceCount", "completedResourceSize", "completedTileCount", "completedTileSize", "requiredResourceCount", "", "isRequiredResourceCountPrecise", "<init>", "(IJJJJJZ)V", "a", "I", "getDownloadState", "()I", "b", "J", "getCompletedResourceCount", "()J", "c", "getCompletedResourceSize", "d", "getCompletedTileCount", "e", "getCompletedTileSize", "f", "getRequiredResourceCount", "g", "Z", "()Z", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OfflineRegionStatus {

    /* renamed from: a  reason: collision with root package name */
    private final int f146063a;

    /* renamed from: b  reason: collision with root package name */
    private final long f146064b;

    /* renamed from: c  reason: collision with root package name */
    private final long f146065c;

    /* renamed from: d  reason: collision with root package name */
    private final long f146066d;

    /* renamed from: e  reason: collision with root package name */
    private final long f146067e;

    /* renamed from: f  reason: collision with root package name */
    private final long f146068f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f146069g;

    @Keep
    private OfflineRegionStatus(int i10, long j10, long j11, long j12, long j13, long j14, boolean z10) {
        this.f146063a = i10;
        this.f146064b = j10;
        this.f146065c = j11;
        this.f146066d = j12;
        this.f146067e = j13;
        this.f146068f = j14;
        this.f146069g = z10;
    }
}
