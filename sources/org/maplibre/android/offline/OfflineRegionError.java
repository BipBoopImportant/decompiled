package org.maplibre.android.offline;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0010B\u0019\b\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u0016"}, d2 = {"Lorg/maplibre/android/offline/OfflineRegionError;", "", "", "reason", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "o", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getReason", "b", "getMessage", "c", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OfflineRegionError {

    /* renamed from: c  reason: collision with root package name */
    public static final a f146060c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f146061a;

    /* renamed from: b  reason: collision with root package name */
    private final String f146062b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lorg/maplibre/android/offline/OfflineRegionError$a;", "", "<init>", "()V", "", "REASON_SUCCESS", "Ljava/lang/String;", "REASON_NOT_FOUND", "REASON_SERVER", "REASON_CONNECTION", "REASON_OTHER", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Keep
    private OfflineRegionError(String str, String str2) {
        this.f146061a = str;
        this.f146062b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!C17542s.e(OfflineRegionError.class, obj.getClass())) {
            return false;
        }
        OfflineRegionError offlineRegionError = (OfflineRegionError) obj;
        if (!C17542s.e(this.f146061a, offlineRegionError.f146061a)) {
            return false;
        }
        return C17542s.e(this.f146062b, offlineRegionError.f146062b);
    }

    public int hashCode() {
        return (this.f146061a.hashCode() * 31) + this.f146062b.hashCode();
    }

    public String toString() {
        String str = this.f146061a;
        String str2 = this.f146062b;
        return "OfflineRegionError{reason='" + str + "', message='" + str2 + "'}";
    }
}
