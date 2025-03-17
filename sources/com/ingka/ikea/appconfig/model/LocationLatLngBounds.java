package com.ingka.ikea.appconfig.model;

import android.os.Parcel;
import android.os.Parcelable;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 +2\u00020\u0001:\u0002,$B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010%\u0012\u0004\b*\u0010)\u001a\u0004\b$\u0010'¨\u0006-"}, d2 = {"Lcom/ingka/ikea/appconfig/model/LocationLatLngBounds;", "Landroid/os/Parcelable;", "Lcom/ingka/ikea/appconfig/model/LocationLatLng;", "southwest", "northeast", "<init>", "(Lcom/ingka/ikea/appconfig/model/LocationLatLng;Lcom/ingka/ikea/appconfig/model/LocationLatLng;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILcom/ingka/ikea/appconfig/model/LocationLatLng;Lcom/ingka/ikea/appconfig/model/LocationLatLng;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/appconfig/model/LocationLatLngBounds;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/appconfig/model/LocationLatLng;", "b", "()Lcom/ingka/ikea/appconfig/model/LocationLatLng;", "getSouthwest$annotations", "()V", "getNortheast$annotations", "Companion", "$serializer", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocationLatLngBounds implements Parcelable {
    public static final Parcelable.Creator<LocationLatLngBounds> CREATOR = new b();
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final LocationLatLng f92998a;

    /* renamed from: b  reason: collision with root package name */
    private final LocationLatLng f92999b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/appconfig/model/LocationLatLngBounds$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/appconfig/model/LocationLatLngBounds;", "serializer", "()Lkotlinx/serialization/KSerializer;", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<LocationLatLngBounds> serializer() {
            return LocationLatLngBounds$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<LocationLatLngBounds> {
        /* renamed from: a */
        public final LocationLatLngBounds createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            Parcelable.Creator<LocationLatLng> creator = LocationLatLng.CREATOR;
            return new LocationLatLngBounds(creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        /* renamed from: b */
        public final LocationLatLngBounds[] newArray(int i10) {
            return new LocationLatLngBounds[i10];
        }
    }

    public /* synthetic */ LocationLatLngBounds(int i10, LocationLatLng locationLatLng, LocationLatLng locationLatLng2, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, LocationLatLngBounds$$serializer.INSTANCE.getDescriptor());
        }
        this.f92998a = locationLatLng;
        this.f92999b = locationLatLng2;
    }

    public static final /* synthetic */ void c(LocationLatLngBounds locationLatLngBounds, C17395d dVar, SerialDescriptor serialDescriptor) {
        LocationLatLng$$serializer locationLatLng$$serializer = LocationLatLng$$serializer.INSTANCE;
        dVar.i(serialDescriptor, 0, locationLatLng$$serializer, locationLatLngBounds.f92998a);
        dVar.i(serialDescriptor, 1, locationLatLng$$serializer, locationLatLngBounds.f92999b);
    }

    public final LocationLatLng a() {
        return this.f92999b;
    }

    public final LocationLatLng b() {
        return this.f92998a;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationLatLngBounds)) {
            return false;
        }
        LocationLatLngBounds locationLatLngBounds = (LocationLatLngBounds) obj;
        return C17542s.e(this.f92998a, locationLatLngBounds.f92998a) && C17542s.e(this.f92999b, locationLatLngBounds.f92999b);
    }

    public int hashCode() {
        return (this.f92998a.hashCode() * 31) + this.f92999b.hashCode();
    }

    public String toString() {
        LocationLatLng locationLatLng = this.f92998a;
        LocationLatLng locationLatLng2 = this.f92999b;
        return "LocationLatLngBounds(southwest=" + locationLatLng + ", northeast=" + locationLatLng2 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        this.f92998a.writeToParcel(parcel, i10);
        this.f92999b.writeToParcel(parcel, i10);
    }

    public LocationLatLngBounds(LocationLatLng locationLatLng, LocationLatLng locationLatLng2) {
        C17542s.j(locationLatLng, "southwest");
        C17542s.j(locationLatLng2, "northeast");
        this.f92998a = locationLatLng;
        this.f92999b = locationLatLng2;
    }
}
