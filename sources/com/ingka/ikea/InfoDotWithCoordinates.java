package com.ingka.ikea;

import android.os.Parcel;
import android.os.Parcelable;
import com.ingka.ikea.core.model.inspiration.Coordinates;
import com.ingka.ikea.core.model.inspiration.Coordinates$$serializer;
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
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 .2\u00020\u0001:\u0002/%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001bJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b%\u0010'R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b-\u0010)\u001a\u0004\b*\u0010,¨\u00060"}, d2 = {"Lcom/ingka/ikea/InfoDotWithCoordinates;", "Landroid/os/Parcelable;", "Lcom/ingka/ikea/core/model/inspiration/Coordinates;", "coordinates", "Lcom/ingka/ikea/InfoDot;", "infoDot", "<init>", "(Lcom/ingka/ikea/core/model/inspiration/Coordinates;Lcom/ingka/ikea/InfoDot;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILcom/ingka/ikea/core/model/inspiration/Coordinates;Lcom/ingka/ikea/InfoDot;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/InfoDotWithCoordinates;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/core/model/inspiration/Coordinates;", "()Lcom/ingka/ikea/core/model/inspiration/Coordinates;", "getCoordinates$annotations", "()V", "b", "Lcom/ingka/ikea/InfoDot;", "()Lcom/ingka/ikea/InfoDot;", "getInfoDot$annotations", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InfoDotWithCoordinates implements Parcelable {
    public static final Parcelable.Creator<InfoDotWithCoordinates> CREATOR = new b();
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Coordinates f69462a;

    /* renamed from: b  reason: collision with root package name */
    private final InfoDot f69463b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/InfoDotWithCoordinates$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/InfoDotWithCoordinates;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<InfoDotWithCoordinates> serializer() {
            return InfoDotWithCoordinates$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<InfoDotWithCoordinates> {
        /* renamed from: a */
        public final InfoDotWithCoordinates createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new InfoDotWithCoordinates(Coordinates.CREATOR.createFromParcel(parcel), InfoDot.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public final InfoDotWithCoordinates[] newArray(int i10) {
            return new InfoDotWithCoordinates[i10];
        }
    }

    public /* synthetic */ InfoDotWithCoordinates(int i10, Coordinates coordinates, InfoDot infoDot, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, InfoDotWithCoordinates$$serializer.INSTANCE.getDescriptor());
        }
        this.f69462a = coordinates;
        this.f69463b = infoDot;
    }

    public static final /* synthetic */ void c(InfoDotWithCoordinates infoDotWithCoordinates, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.i(serialDescriptor, 0, Coordinates$$serializer.INSTANCE, infoDotWithCoordinates.f69462a);
        dVar.i(serialDescriptor, 1, InfoDot$$serializer.INSTANCE, infoDotWithCoordinates.f69463b);
    }

    public final Coordinates a() {
        return this.f69462a;
    }

    public final InfoDot b() {
        return this.f69463b;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoDotWithCoordinates)) {
            return false;
        }
        InfoDotWithCoordinates infoDotWithCoordinates = (InfoDotWithCoordinates) obj;
        return C17542s.e(this.f69462a, infoDotWithCoordinates.f69462a) && C17542s.e(this.f69463b, infoDotWithCoordinates.f69463b);
    }

    public int hashCode() {
        return (this.f69462a.hashCode() * 31) + this.f69463b.hashCode();
    }

    public String toString() {
        Coordinates coordinates = this.f69462a;
        InfoDot infoDot = this.f69463b;
        return "InfoDotWithCoordinates(coordinates=" + coordinates + ", infoDot=" + infoDot + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        this.f69462a.writeToParcel(parcel, i10);
        this.f69463b.writeToParcel(parcel, i10);
    }

    public InfoDotWithCoordinates(Coordinates coordinates, InfoDot infoDot) {
        C17542s.j(coordinates, "coordinates");
        C17542s.j(infoDot, "infoDot");
        this.f69462a = coordinates;
        this.f69463b = infoDot;
    }
}
