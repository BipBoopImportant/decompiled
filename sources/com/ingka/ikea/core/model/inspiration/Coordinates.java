package com.ingka.ikea.core.model.inspiration;

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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 +2\u00020\u0001:\u0002,$B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b$\u0010&R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010&¨\u0006-"}, d2 = {"Lcom/ingka/ikea/core/model/inspiration/Coordinates;", "Landroid/os/Parcelable;", "", "xCoord", "yCoord", "<init>", "(DD)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(IDDLjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/core/model/inspiration/Coordinates;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "getXCoord$annotations", "()V", "b", "getYCoord$annotations", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Coordinates implements Parcelable {
    public static final Parcelable.Creator<Coordinates> CREATOR = new b();
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final double f94928a;

    /* renamed from: b  reason: collision with root package name */
    private final double f94929b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/inspiration/Coordinates$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/inspiration/Coordinates;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<Coordinates> serializer() {
            return Coordinates$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<Coordinates> {
        /* renamed from: a */
        public final Coordinates createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new Coordinates(parcel.readDouble(), parcel.readDouble());
        }

        /* renamed from: b */
        public final Coordinates[] newArray(int i10) {
            return new Coordinates[i10];
        }
    }

    public /* synthetic */ Coordinates(int i10, double d10, double d11, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, Coordinates$$serializer.INSTANCE.getDescriptor());
        }
        this.f94928a = d10;
        this.f94929b = d11;
    }

    public static final /* synthetic */ void c(Coordinates coordinates, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.E(serialDescriptor, 0, coordinates.f94928a);
        dVar.E(serialDescriptor, 1, coordinates.f94929b);
    }

    public final double a() {
        return this.f94928a;
    }

    public final double b() {
        return this.f94929b;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Coordinates)) {
            return false;
        }
        Coordinates coordinates = (Coordinates) obj;
        return Double.compare(this.f94928a, coordinates.f94928a) == 0 && Double.compare(this.f94929b, coordinates.f94929b) == 0;
    }

    public int hashCode() {
        return (Double.hashCode(this.f94928a) * 31) + Double.hashCode(this.f94929b);
    }

    public String toString() {
        double d10 = this.f94928a;
        double d11 = this.f94929b;
        return "Coordinates(xCoord=" + d10 + ", yCoord=" + d11 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeDouble(this.f94928a);
        parcel.writeDouble(this.f94929b);
    }

    public Coordinates(double d10, double d11) {
        this.f94928a = d10;
        this.f94929b = d11;
    }
}
