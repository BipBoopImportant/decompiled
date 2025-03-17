package com.ingka.ikea.core.model.product;

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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 *2\u00020\u0001:\u0002+\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001bJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b%\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010\u001d¨\u0006,"}, d2 = {"Lcom/ingka/ikea/core/model/product/DeliveryCalculationDisclaimer;", "Landroid/os/Parcelable;", "", "text", "linkText", "link", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/core/model/product/DeliveryCalculationDisclaimer;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "b", "getLinkText", "c", "getLink", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeliveryCalculationDisclaimer implements Parcelable {
    public static final Parcelable.Creator<DeliveryCalculationDisclaimer> CREATOR = new b();
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f94955a;

    /* renamed from: b  reason: collision with root package name */
    private final String f94956b;

    /* renamed from: c  reason: collision with root package name */
    private final String f94957c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/DeliveryCalculationDisclaimer$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/DeliveryCalculationDisclaimer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<DeliveryCalculationDisclaimer> serializer() {
            return DeliveryCalculationDisclaimer$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DeliveryCalculationDisclaimer> {
        /* renamed from: a */
        public final DeliveryCalculationDisclaimer createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new DeliveryCalculationDisclaimer(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final DeliveryCalculationDisclaimer[] newArray(int i10) {
            return new DeliveryCalculationDisclaimer[i10];
        }
    }

    public /* synthetic */ DeliveryCalculationDisclaimer(int i10, String str, String str2, String str3, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, DeliveryCalculationDisclaimer$$serializer.INSTANCE.getDescriptor());
        }
        this.f94955a = str;
        this.f94956b = str2;
        this.f94957c = str3;
    }

    public static final /* synthetic */ void a(DeliveryCalculationDisclaimer deliveryCalculationDisclaimer, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, deliveryCalculationDisclaimer.f94955a);
        dVar.y(serialDescriptor, 1, deliveryCalculationDisclaimer.f94956b);
        dVar.y(serialDescriptor, 2, deliveryCalculationDisclaimer.f94957c);
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryCalculationDisclaimer)) {
            return false;
        }
        DeliveryCalculationDisclaimer deliveryCalculationDisclaimer = (DeliveryCalculationDisclaimer) obj;
        return C17542s.e(this.f94955a, deliveryCalculationDisclaimer.f94955a) && C17542s.e(this.f94956b, deliveryCalculationDisclaimer.f94956b) && C17542s.e(this.f94957c, deliveryCalculationDisclaimer.f94957c);
    }

    public int hashCode() {
        return (((this.f94955a.hashCode() * 31) + this.f94956b.hashCode()) * 31) + this.f94957c.hashCode();
    }

    public String toString() {
        String str = this.f94955a;
        String str2 = this.f94956b;
        String str3 = this.f94957c;
        return "DeliveryCalculationDisclaimer(text=" + str + ", linkText=" + str2 + ", link=" + str3 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f94955a);
        parcel.writeString(this.f94956b);
        parcel.writeString(this.f94957c);
    }

    public DeliveryCalculationDisclaimer(String str, String str2, String str3) {
        C17542s.j(str, "text");
        C17542s.j(str2, "linkText");
        C17542s.j(str3, "link");
        this.f94955a = str;
        this.f94956b = str2;
        this.f94957c = str3;
    }
}
