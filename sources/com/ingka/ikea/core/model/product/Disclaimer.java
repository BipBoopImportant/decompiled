package com.ingka.ikea.core.model.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.ingka.ikea.core.model.Image;
import com.ingka.ikea.core.model.Image$$serializer;
import com.ingka.ikea.core.model.Link;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.J;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u0000 42\u00020\u0001:\u00025(B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\"\u0010\u001fJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b,\u00101R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b.\u00102\u001a\u0004\b/\u00103¨\u00066"}, d2 = {"Lcom/ingka/ikea/core/model/product/Disclaimer;", "Landroid/os/Parcelable;", "Lcom/ingka/ikea/core/model/product/DisclaimerType;", "type", "", "text", "Lcom/ingka/ikea/core/model/Image;", "image", "Lcom/ingka/ikea/core/model/Link;", "link", "<init>", "(Lcom/ingka/ikea/core/model/product/DisclaimerType;Ljava/lang/String;Lcom/ingka/ikea/core/model/Image;Lcom/ingka/ikea/core/model/Link;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILcom/ingka/ikea/core/model/product/DisclaimerType;Ljava/lang/String;Lcom/ingka/ikea/core/model/Image;Lcom/ingka/ikea/core/model/Link;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "f", "(Lcom/ingka/ikea/core/model/product/Disclaimer;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/core/model/product/DisclaimerType;", "e", "()Lcom/ingka/ikea/core/model/product/DisclaimerType;", "b", "Ljava/lang/String;", "d", "c", "Lcom/ingka/ikea/core/model/Image;", "()Lcom/ingka/ikea/core/model/Image;", "Lcom/ingka/ikea/core/model/Link;", "()Lcom/ingka/ikea/core/model/Link;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Disclaimer implements Parcelable {
    public static final Parcelable.Creator<Disclaimer> CREATOR = new b();
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer<Object>[] f94958e = {J.b("com.ingka.ikea.core.model.product.DisclaimerType", DisclaimerType.values()), 0, 0, Link.Companion.serializer()};

    /* renamed from: a  reason: collision with root package name */
    private final DisclaimerType f94959a;

    /* renamed from: b  reason: collision with root package name */
    private final String f94960b;

    /* renamed from: c  reason: collision with root package name */
    private final Image f94961c;

    /* renamed from: d  reason: collision with root package name */
    private final Link f94962d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/Disclaimer$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/Disclaimer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<Disclaimer> serializer() {
            return Disclaimer$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<Disclaimer> {
        /* renamed from: a */
        public final Disclaimer createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new Disclaimer(DisclaimerType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), (Link) parcel.readParcelable(Disclaimer.class.getClassLoader()));
        }

        /* renamed from: b */
        public final Disclaimer[] newArray(int i10) {
            return new Disclaimer[i10];
        }
    }

    public /* synthetic */ Disclaimer(int i10, DisclaimerType disclaimerType, String str, Image image, Link link, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, Disclaimer$$serializer.INSTANCE.getDescriptor());
        }
        this.f94959a = disclaimerType;
        this.f94960b = str;
        if ((i10 & 4) == 0) {
            this.f94961c = null;
        } else {
            this.f94961c = image;
        }
        if ((i10 & 8) == 0) {
            this.f94962d = null;
        } else {
            this.f94962d = link;
        }
    }

    public static final /* synthetic */ void f(Disclaimer disclaimer, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f94958e;
        dVar.i(serialDescriptor, 0, kSerializerArr[0], disclaimer.f94959a);
        dVar.y(serialDescriptor, 1, disclaimer.f94960b);
        if (dVar.z(serialDescriptor, 2) || disclaimer.f94961c != null) {
            dVar.B(serialDescriptor, 2, Image$$serializer.INSTANCE, disclaimer.f94961c);
        }
        if (dVar.z(serialDescriptor, 3) || disclaimer.f94962d != null) {
            dVar.B(serialDescriptor, 3, kSerializerArr[3], disclaimer.f94962d);
        }
    }

    public final Image b() {
        return this.f94961c;
    }

    public final Link c() {
        return this.f94962d;
    }

    public final String d() {
        return this.f94960b;
    }

    public final int describeContents() {
        return 0;
    }

    public final DisclaimerType e() {
        return this.f94959a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Disclaimer)) {
            return false;
        }
        Disclaimer disclaimer = (Disclaimer) obj;
        return this.f94959a == disclaimer.f94959a && C17542s.e(this.f94960b, disclaimer.f94960b) && C17542s.e(this.f94961c, disclaimer.f94961c) && C17542s.e(this.f94962d, disclaimer.f94962d);
    }

    public int hashCode() {
        int hashCode = ((this.f94959a.hashCode() * 31) + this.f94960b.hashCode()) * 31;
        Image image = this.f94961c;
        int i10 = 0;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        Link link = this.f94962d;
        if (link != null) {
            i10 = link.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        DisclaimerType disclaimerType = this.f94959a;
        String str = this.f94960b;
        Image image = this.f94961c;
        Link link = this.f94962d;
        return "Disclaimer(type=" + disclaimerType + ", text=" + str + ", image=" + image + ", link=" + link + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f94959a.name());
        parcel.writeString(this.f94960b);
        Image image = this.f94961c;
        if (image == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image.writeToParcel(parcel, i10);
        }
        parcel.writeParcelable(this.f94962d, i10);
    }

    public Disclaimer(DisclaimerType disclaimerType, String str, Image image, Link link) {
        C17542s.j(disclaimerType, "type");
        C17542s.j(str, "text");
        this.f94959a = disclaimerType;
        this.f94960b = str;
        this.f94961c = image;
        this.f94962d = link;
    }
}
