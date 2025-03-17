package com.ingka.ikea.appconfig.model;

import HJ.C15854t;
import Rl.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.sugarcube.core.logger.DslKt;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@p
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 +2\u00020\u0001:\u0002,$B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b$\u0010&R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010&¨\u0006-"}, d2 = {"Lcom/ingka/ikea/appconfig/model/LocationLatLng;", "Landroid/os/Parcelable;", "", "latitude", "longitude", "<init>", "(DD)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(IDDLjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/appconfig/model/LocationLatLng;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "getLatitude$annotations", "()V", "b", "getLongitude$annotations", "Companion", "$serializer", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocationLatLng implements Parcelable {
    public static final Parcelable.Creator<LocationLatLng> CREATOR = new b();
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final double f92996a;

    /* renamed from: b  reason: collision with root package name */
    private final double f92997b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/appconfig/model/LocationLatLng$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/appconfig/model/LocationLatLng;", "serializer", "()Lkotlinx/serialization/KSerializer;", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<LocationLatLng> serializer() {
            return LocationLatLng$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<LocationLatLng> {
        /* renamed from: a */
        public final LocationLatLng createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new LocationLatLng(parcel.readDouble(), parcel.readDouble());
        }

        /* renamed from: b */
        public final LocationLatLng[] newArray(int i10) {
            return new LocationLatLng[i10];
        }
    }

    public /* synthetic */ LocationLatLng(int i10, double d10, double d11, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, LocationLatLng$$serializer.INSTANCE.getDescriptor());
        }
        this.f92996a = d10;
        this.f92997b = d11;
        if (!c.f86545a.b(Double.valueOf(d10)) || !c.f86546b.b(Double.valueOf(d11))) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid lat, lng (" + d10 + ", " + d11 + ")");
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                if (str2 == null) {
                    String name = LocationLatLng.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    name = o12.length() != 0 ? C15854t.P0(o12, "Kt") : name;
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str3 = str2;
                bVar.a(eVar, str3, false, illegalArgumentException, str);
                str2 = str3;
            }
        }
    }

    public static final /* synthetic */ void c(LocationLatLng locationLatLng, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.E(serialDescriptor, 0, locationLatLng.f92996a);
        dVar.E(serialDescriptor, 1, locationLatLng.f92997b);
    }

    public final double a() {
        return this.f92996a;
    }

    public final double b() {
        return this.f92997b;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationLatLng)) {
            return false;
        }
        LocationLatLng locationLatLng = (LocationLatLng) obj;
        return Double.compare(this.f92996a, locationLatLng.f92996a) == 0 && Double.compare(this.f92997b, locationLatLng.f92997b) == 0;
    }

    public int hashCode() {
        return (Double.hashCode(this.f92996a) * 31) + Double.hashCode(this.f92997b);
    }

    public String toString() {
        double d10 = this.f92996a;
        double d11 = this.f92997b;
        return "LocationLatLng(latitude=" + d10 + ", longitude=" + d11 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeDouble(this.f92996a);
        parcel.writeDouble(this.f92997b);
    }

    public LocationLatLng(double d10, double d11) {
        this.f92996a = d10;
        this.f92997b = d11;
        if (!c.f86545a.b(Double.valueOf(d10)) || !c.f86546b.b(Double.valueOf(d11))) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid lat, lng (" + d10 + ", " + d11 + ")");
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                if (str2 == null) {
                    String name = LocationLatLng.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    name = o12.length() != 0 ? C15854t.P0(o12, "Kt") : name;
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str3 = str2;
                bVar.a(eVar, str3, false, illegalArgumentException, str);
                str2 = str3;
            }
        }
    }
}
