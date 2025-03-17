package com.ingka.ikea.appconfig.impl.service.network;

import fK.p;
import iK.C17395d;
import jK.C17438C;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 #2\u00020\u0001:\u0002$\u001cB/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001c\u0010\u001eR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\u001d\u0012\u0004\b\"\u0010 \u001a\u0004\b!\u0010\u001e¨\u0006%"}, d2 = {"Lcom/ingka/ikea/appconfig/impl/service/network/LatLngRemote;", "", "", "seen0", "", "latitude", "longitude", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Double;Ljava/lang/Double;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/appconfig/impl/service/network/LatLngRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Double;", "()Ljava/lang/Double;", "getLatitude$annotations", "()V", "b", "getLongitude$annotations", "Companion", "$serializer", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LatLngRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Double f92924a;

    /* renamed from: b  reason: collision with root package name */
    private final Double f92925b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/appconfig/impl/service/network/LatLngRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/appconfig/impl/service/network/LatLngRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<LatLngRemote> serializer() {
            return LatLngRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ LatLngRemote(int i10, Double d10, Double d11, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, LatLngRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f92924a = d10;
        this.f92925b = d11;
    }

    public static final /* synthetic */ void c(LatLngRemote latLngRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        C17438C c10 = C17438C.f144010a;
        dVar.B(serialDescriptor, 0, c10, latLngRemote.f92924a);
        dVar.B(serialDescriptor, 1, c10, latLngRemote.f92925b);
    }

    public final Double a() {
        return this.f92924a;
    }

    public final Double b() {
        return this.f92925b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngRemote)) {
            return false;
        }
        LatLngRemote latLngRemote = (LatLngRemote) obj;
        return C17542s.e(this.f92924a, latLngRemote.f92924a) && C17542s.e(this.f92925b, latLngRemote.f92925b);
    }

    public int hashCode() {
        Double d10 = this.f92924a;
        int i10 = 0;
        int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
        Double d11 = this.f92925b;
        if (d11 != null) {
            i10 = d11.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        Double d10 = this.f92924a;
        Double d11 = this.f92925b;
        return "LatLngRemote(latitude=" + d10 + ", longitude=" + d11 + ")";
    }
}
