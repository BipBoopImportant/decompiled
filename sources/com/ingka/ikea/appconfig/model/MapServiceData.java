package com.ingka.ikea.appconfig.model;

import HJ.C15854t;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u0000 /2\u00020\u0001:\u0002\u00190B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010'\u001a\u0004\b*\u0010+R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010-\u0012\u0004\b.\u0010'\u001a\u0004\b(\u0010\u001c¨\u00061"}, d2 = {"Lcom/ingka/ikea/appconfig/model/MapServiceData;", "", "Lcom/ingka/ikea/appconfig/model/LocationLatLngBounds;", "latLngBounds", "", "minZoomPreference", "", "customNavigationUrl", "<init>", "(Lcom/ingka/ikea/appconfig/model/LocationLatLngBounds;Ljava/lang/Integer;Ljava/lang/String;)V", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILcom/ingka/ikea/appconfig/model/LocationLatLngBounds;Ljava/lang/Integer;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "e", "(Lcom/ingka/ikea/appconfig/model/MapServiceData;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "lat", "lng", "searchQuery", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ingka/ikea/appconfig/model/LocationLatLngBounds;", "c", "()Lcom/ingka/ikea/appconfig/model/LocationLatLngBounds;", "getLatLngBounds$annotations", "()V", "b", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "getMinZoomPreference$annotations", "Ljava/lang/String;", "getCustomNavigationUrl$annotations", "Companion", "$serializer", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MapServiceData {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final LocationLatLngBounds f93000a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f93001b;

    /* renamed from: c  reason: collision with root package name */
    private final String f93002c;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/ingka/ikea/appconfig/model/MapServiceData$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/appconfig/model/MapServiceData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "CUSTOM_SEARCH_QUERY_PARAM", "Ljava/lang/String;", "CUSTOM_LAT_PARAM", "CUSTOM_LNG_PARAM", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MapServiceData> serializer() {
            return MapServiceData$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    public /* synthetic */ MapServiceData(int i10, LocationLatLngBounds locationLatLngBounds, Integer num, String str, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, MapServiceData$$serializer.INSTANCE.getDescriptor());
        }
        this.f93000a = locationLatLngBounds;
        this.f93001b = num;
        this.f93002c = str;
    }

    public static final /* synthetic */ void e(MapServiceData mapServiceData, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.B(serialDescriptor, 0, LocationLatLngBounds$$serializer.INSTANCE, mapServiceData.f93000a);
        dVar.B(serialDescriptor, 1, X.f144073a, mapServiceData.f93001b);
        dVar.B(serialDescriptor, 2, Y0.f144077a, mapServiceData.f93002c);
    }

    public final String a(String str, String str2, String str3) {
        String str4 = str;
        C17542s.j(str, "lat");
        C17542s.j(str2, "lng");
        C17542s.j(str3, "searchQuery");
        String str5 = this.f93002c;
        if (str5 == null) {
            return null;
        }
        return C15854t.Q(C15854t.Q(C15854t.Q(str5, "$SEARCH_QUERY", str3, false, 4, (Object) null), "$LAT", str, false, 4, (Object) null), "$LNG", str2, false, 4, (Object) null);
    }

    public final String b() {
        return this.f93002c;
    }

    public final LocationLatLngBounds c() {
        return this.f93000a;
    }

    public final Integer d() {
        return this.f93001b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapServiceData)) {
            return false;
        }
        MapServiceData mapServiceData = (MapServiceData) obj;
        return C17542s.e(this.f93000a, mapServiceData.f93000a) && C17542s.e(this.f93001b, mapServiceData.f93001b) && C17542s.e(this.f93002c, mapServiceData.f93002c);
    }

    public int hashCode() {
        LocationLatLngBounds locationLatLngBounds = this.f93000a;
        int i10 = 0;
        int hashCode = (locationLatLngBounds == null ? 0 : locationLatLngBounds.hashCode()) * 31;
        Integer num = this.f93001b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f93002c;
        if (str != null) {
            i10 = str.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        LocationLatLngBounds locationLatLngBounds = this.f93000a;
        Integer num = this.f93001b;
        String str = this.f93002c;
        return "MapServiceData(latLngBounds=" + locationLatLngBounds + ", minZoomPreference=" + num + ", customNavigationUrl=" + str + ")";
    }

    public MapServiceData(LocationLatLngBounds locationLatLngBounds, Integer num, String str) {
        this.f93000a = locationLatLngBounds;
        this.f93001b = num;
        this.f93002c = str;
    }
}
