package com.sugarcube.app.base;

import TJ.C16532g;
import com.google.ar.core.ArCoreApk;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u000eJ\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/app/base/DeviceCompatibility;", "", "Lcom/sugarcube/app/base/DeviceCompatibility$a;", "updateCompatibility", "(LdI/e;)Ljava/lang/Object;", "", "isKreativEnabled", "isCaptureEnabled", "()Z", "isDecorateSupported", "LTJ/g;", "getSupportedFeatures", "()LTJ/g;", "supportedFeatures", "a", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface DeviceCompatibility {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001a\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b\u001f\u0010\u001d¨\u0006%"}, d2 = {"Lcom/sugarcube/app/base/DeviceCompatibility$a;", "", "", "ready", "isKreativEnabled", "isCaptureEnabled", "isDecorateEnabled", "Lcom/google/ar/core/ArCoreApk$Availability;", "arCoreAvailability", "isCaptureAndDesignBlacklisted", "isUltrawideSupported", "<init>", "(Ljava/lang/Boolean;ZZZLcom/google/ar/core/ArCoreApk$Availability;Ljava/lang/Boolean;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "getReady", "()Ljava/lang/Boolean;", "b", "Z", "d", "()Z", "c", "e", "Lcom/google/ar/core/ArCoreApk$Availability;", "getArCoreAvailability", "()Lcom/google/ar/core/ArCoreApk$Availability;", "f", "g", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Boolean f122690a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f122691b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f122692c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f122693d;

        /* renamed from: e  reason: collision with root package name */
        private final ArCoreApk.Availability f122694e;

        /* renamed from: f  reason: collision with root package name */
        private final Boolean f122695f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f122696g;

        public a(Boolean bool, boolean z10, boolean z11, boolean z12, ArCoreApk.Availability availability, Boolean bool2, boolean z13) {
            this.f122690a = bool;
            this.f122691b = z10;
            this.f122692c = z11;
            this.f122693d = z12;
            this.f122694e = availability;
            this.f122695f = bool2;
            this.f122696g = z13;
        }

        public final Boolean a() {
            return this.f122695f;
        }

        public final boolean b() {
            return this.f122692c;
        }

        public final boolean c() {
            return this.f122693d;
        }

        public final boolean d() {
            return this.f122691b;
        }

        public final boolean e() {
            return this.f122696g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f122690a, aVar.f122690a) && this.f122691b == aVar.f122691b && this.f122692c == aVar.f122692c && this.f122693d == aVar.f122693d && this.f122694e == aVar.f122694e && C17542s.e(this.f122695f, aVar.f122695f) && this.f122696g == aVar.f122696g;
        }

        public int hashCode() {
            Boolean bool = this.f122690a;
            int i10 = 0;
            int hashCode = (((((((bool == null ? 0 : bool.hashCode()) * 31) + Boolean.hashCode(this.f122691b)) * 31) + Boolean.hashCode(this.f122692c)) * 31) + Boolean.hashCode(this.f122693d)) * 31;
            ArCoreApk.Availability availability = this.f122694e;
            int hashCode2 = (hashCode + (availability == null ? 0 : availability.hashCode())) * 31;
            Boolean bool2 = this.f122695f;
            if (bool2 != null) {
                i10 = bool2.hashCode();
            }
            return ((hashCode2 + i10) * 31) + Boolean.hashCode(this.f122696g);
        }

        public String toString() {
            Boolean bool = this.f122690a;
            boolean z10 = this.f122691b;
            boolean z11 = this.f122692c;
            boolean z12 = this.f122693d;
            ArCoreApk.Availability availability = this.f122694e;
            Boolean bool2 = this.f122695f;
            boolean z13 = this.f122696g;
            return "Compatibility(ready=" + bool + ", isKreativEnabled=" + z10 + ", isCaptureEnabled=" + z11 + ", isDecorateEnabled=" + z12 + ", arCoreAvailability=" + availability + ", isCaptureAndDesignBlacklisted=" + bool2 + ", isUltrawideSupported=" + z13 + ")";
        }
    }

    C16532g<a> getSupportedFeatures();

    boolean isCaptureEnabled();

    boolean isDecorateSupported();

    Object isKreativEnabled(C17164e<? super Boolean> eVar);

    Object updateCompatibility(C17164e<? super a> eVar);
}
