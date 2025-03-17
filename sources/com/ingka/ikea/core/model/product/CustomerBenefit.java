package com.ingka.ikea.core.model.product;

import android.os.Parcel;
import android.os.Parcelable;
import fK.p;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

@p
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u0000 $2\u00020\u0001:\u0002%\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010\u001b¨\u0006&"}, d2 = {"Lcom/ingka/ikea/core/model/product/CustomerBenefit;", "Landroid/os/Parcelable;", "", "text", "<init>", "(Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/core/model/product/CustomerBenefit;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CustomerBenefit implements Parcelable {
    public static final Parcelable.Creator<CustomerBenefit> CREATOR = new b();
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f94946a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/CustomerBenefit$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/CustomerBenefit;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<CustomerBenefit> serializer() {
            return CustomerBenefit$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<CustomerBenefit> {
        /* renamed from: a */
        public final CustomerBenefit createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new CustomerBenefit(parcel.readString());
        }

        /* renamed from: b */
        public final CustomerBenefit[] newArray(int i10) {
            return new CustomerBenefit[i10];
        }
    }

    public /* synthetic */ CustomerBenefit(int i10, String str, T0 t02) {
        if (1 != (i10 & 1)) {
            E0.b(i10, 1, CustomerBenefit$$serializer.INSTANCE.getDescriptor());
        }
        this.f94946a = str;
    }

    public final String a() {
        return this.f94946a;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CustomerBenefit) && C17542s.e(this.f94946a, ((CustomerBenefit) obj).f94946a);
    }

    public int hashCode() {
        return this.f94946a.hashCode();
    }

    public String toString() {
        String str = this.f94946a;
        return "CustomerBenefit(text=" + str + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f94946a);
    }

    public CustomerBenefit(String str) {
        C17542s.j(str, "text");
        this.f94946a = str;
    }
}
