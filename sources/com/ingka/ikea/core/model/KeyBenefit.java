package com.ingka.ikea.core.model;

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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 )2\u00020\u0001:\u0002*$B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001bJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010\u001d¨\u0006+"}, d2 = {"Lcom/ingka/ikea/core/model/KeyBenefit;", "Landroid/os/Parcelable;", "Lcom/ingka/ikea/core/model/Image;", "icon", "", "text", "<init>", "(Lcom/ingka/ikea/core/model/Image;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILcom/ingka/ikea/core/model/Image;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/core/model/KeyBenefit;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/core/model/Image;", "()Lcom/ingka/ikea/core/model/Image;", "b", "Ljava/lang/String;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KeyBenefit implements Parcelable {
    public static final Parcelable.Creator<KeyBenefit> CREATOR = new b();
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Image f94908a;

    /* renamed from: b  reason: collision with root package name */
    private final String f94909b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/KeyBenefit$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/KeyBenefit;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<KeyBenefit> serializer() {
            return KeyBenefit$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<KeyBenefit> {
        /* renamed from: a */
        public final KeyBenefit createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new KeyBenefit(parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* renamed from: b */
        public final KeyBenefit[] newArray(int i10) {
            return new KeyBenefit[i10];
        }
    }

    public /* synthetic */ KeyBenefit(int i10, Image image, String str, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, KeyBenefit$$serializer.INSTANCE.getDescriptor());
        }
        this.f94908a = image;
        this.f94909b = str;
    }

    public static final /* synthetic */ void c(KeyBenefit keyBenefit, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.B(serialDescriptor, 0, Image$$serializer.INSTANCE, keyBenefit.f94908a);
        dVar.y(serialDescriptor, 1, keyBenefit.f94909b);
    }

    public final Image a() {
        return this.f94908a;
    }

    public final String b() {
        return this.f94909b;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyBenefit)) {
            return false;
        }
        KeyBenefit keyBenefit = (KeyBenefit) obj;
        return C17542s.e(this.f94908a, keyBenefit.f94908a) && C17542s.e(this.f94909b, keyBenefit.f94909b);
    }

    public int hashCode() {
        Image image = this.f94908a;
        return ((image == null ? 0 : image.hashCode()) * 31) + this.f94909b.hashCode();
    }

    public String toString() {
        Image image = this.f94908a;
        String str = this.f94909b;
        return "KeyBenefit(icon=" + image + ", text=" + str + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        Image image = this.f94908a;
        if (image == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image.writeToParcel(parcel, i10);
        }
        parcel.writeString(this.f94909b);
    }

    public KeyBenefit(Image image, String str) {
        C17542s.j(str, "text");
        this.f94908a = image;
        this.f94909b = str;
    }
}
