package com.ingka.ikea.appconfig.impl.service.network;

import com.ingka.ikea.appconfig.model.MapServiceData;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.X;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0012\b\b\u0018\u0000 -2\u00020\u0001:\u0002.\u0016B9\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b,\u0010$\u001a\u0004\b+\u0010\u0019¨\u0006/"}, d2 = {"Lcom/ingka/ikea/appconfig/impl/service/network/MapServiceRemote;", "", "", "seen0", "Lcom/ingka/ikea/appconfig/impl/service/network/LatLngBoundsRemote;", "latLngBounds", "minZoomPreference", "", "customNavigationUrl", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/appconfig/impl/service/network/LatLngBoundsRemote;Ljava/lang/Integer;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/appconfig/impl/service/network/MapServiceRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/appconfig/model/MapServiceData;", "a", "()Lcom/ingka/ikea/appconfig/model/MapServiceData;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ingka/ikea/appconfig/impl/service/network/LatLngBoundsRemote;", "getLatLngBounds", "()Lcom/ingka/ikea/appconfig/impl/service/network/LatLngBoundsRemote;", "getLatLngBounds$annotations", "()V", "Ljava/lang/Integer;", "getMinZoomPreference", "()Ljava/lang/Integer;", "getMinZoomPreference$annotations", "c", "Ljava/lang/String;", "getCustomNavigationUrl", "getCustomNavigationUrl$annotations", "Companion", "$serializer", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MapServiceRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final LatLngBoundsRemote f92926a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f92927b;

    /* renamed from: c  reason: collision with root package name */
    private final String f92928c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/appconfig/impl/service/network/MapServiceRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/appconfig/impl/service/network/MapServiceRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<MapServiceRemote> serializer() {
            return MapServiceRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ MapServiceRemote(int i10, LatLngBoundsRemote latLngBoundsRemote, Integer num, String str, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, MapServiceRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f92926a = latLngBoundsRemote;
        this.f92927b = num;
        this.f92928c = str;
    }

    public static final /* synthetic */ void b(MapServiceRemote mapServiceRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.B(serialDescriptor, 0, LatLngBoundsRemote$$serializer.INSTANCE, mapServiceRemote.f92926a);
        dVar.B(serialDescriptor, 1, X.f144073a, mapServiceRemote.f92927b);
        dVar.B(serialDescriptor, 2, Y0.f144077a, mapServiceRemote.f92928c);
    }

    public final MapServiceData a() {
        LatLngBoundsRemote latLngBoundsRemote = this.f92926a;
        return new MapServiceData(latLngBoundsRemote != null ? latLngBoundsRemote.a() : null, this.f92927b, this.f92928c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapServiceRemote)) {
            return false;
        }
        MapServiceRemote mapServiceRemote = (MapServiceRemote) obj;
        return C17542s.e(this.f92926a, mapServiceRemote.f92926a) && C17542s.e(this.f92927b, mapServiceRemote.f92927b) && C17542s.e(this.f92928c, mapServiceRemote.f92928c);
    }

    public int hashCode() {
        LatLngBoundsRemote latLngBoundsRemote = this.f92926a;
        int i10 = 0;
        int hashCode = (latLngBoundsRemote == null ? 0 : latLngBoundsRemote.hashCode()) * 31;
        Integer num = this.f92927b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f92928c;
        if (str != null) {
            i10 = str.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        LatLngBoundsRemote latLngBoundsRemote = this.f92926a;
        Integer num = this.f92927b;
        String str = this.f92928c;
        return "MapServiceRemote(latLngBounds=" + latLngBoundsRemote + ", minZoomPreference=" + num + ", customNavigationUrl=" + str + ")";
    }
}
