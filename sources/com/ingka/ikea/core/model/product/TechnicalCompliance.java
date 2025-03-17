package com.ingka.ikea.core.model.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.ingka.ikea.core.model.Image;
import com.ingka.ikea.core.model.Image$$serializer;
import com.ingka.ikea.core.model.Link;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u0000 32\u00020\u0001:\u00024)B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fBO\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b#\u0010 J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\"R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b+\u00100\u001a\u0004\b1\u00102R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b1\u00100\u001a\u0004\b-\u00102¨\u00065"}, d2 = {"Lcom/ingka/ikea/core/model/product/TechnicalCompliance;", "Landroid/os/Parcelable;", "Lcom/ingka/ikea/core/model/Link;", "infoSheet", "", "informationValuesLabel", "", "Lcom/ingka/ikea/core/model/product/InformationValue;", "informationValues", "Lcom/ingka/ikea/core/model/Image;", "energyLabelImages", "<init>", "(Lcom/ingka/ikea/core/model/Link;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILcom/ingka/ikea/core/model/Link;Ljava/lang/String;Ljava/util/List;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "e", "(Lcom/ingka/ikea/core/model/product/TechnicalCompliance;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/core/model/Link;", "c", "()Lcom/ingka/ikea/core/model/Link;", "b", "Ljava/lang/String;", "getInformationValuesLabel", "Ljava/util/List;", "d", "()Ljava/util/List;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TechnicalCompliance implements Parcelable {
    public static final Parcelable.Creator<TechnicalCompliance> CREATOR = new b();
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer<Object>[] f95155e = {Link.Companion.serializer(), 0, new C17451f(InformationValue$$serializer.INSTANCE), new C17451f(Image$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final Link f95156a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95157b;

    /* renamed from: c  reason: collision with root package name */
    private final List<InformationValue> f95158c;

    /* renamed from: d  reason: collision with root package name */
    private final List<Image> f95159d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/TechnicalCompliance$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/TechnicalCompliance;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<TechnicalCompliance> serializer() {
            return TechnicalCompliance$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<TechnicalCompliance> {
        /* renamed from: a */
        public final TechnicalCompliance createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            Link link = (Link) parcel.readParcelable(TechnicalCompliance.class.getClassLoader());
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                arrayList.add(InformationValue.CREATOR.createFromParcel(parcel));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i11 = 0; i11 != readInt2; i11++) {
                arrayList2.add(Image.CREATOR.createFromParcel(parcel));
            }
            return new TechnicalCompliance(link, readString, arrayList, arrayList2);
        }

        /* renamed from: b */
        public final TechnicalCompliance[] newArray(int i10) {
            return new TechnicalCompliance[i10];
        }
    }

    public /* synthetic */ TechnicalCompliance(int i10, Link link, String str, List list, List list2, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, TechnicalCompliance$$serializer.INSTANCE.getDescriptor());
        }
        this.f95156a = link;
        this.f95157b = str;
        this.f95158c = list;
        this.f95159d = list2;
    }

    public static final /* synthetic */ void e(TechnicalCompliance technicalCompliance, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95155e;
        dVar.B(serialDescriptor, 0, kSerializerArr[0], technicalCompliance.f95156a);
        dVar.B(serialDescriptor, 1, Y0.f144077a, technicalCompliance.f95157b);
        dVar.i(serialDescriptor, 2, kSerializerArr[2], technicalCompliance.f95158c);
        dVar.i(serialDescriptor, 3, kSerializerArr[3], technicalCompliance.f95159d);
    }

    public final List<Image> b() {
        return this.f95159d;
    }

    public final Link c() {
        return this.f95156a;
    }

    public final List<InformationValue> d() {
        return this.f95158c;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TechnicalCompliance)) {
            return false;
        }
        TechnicalCompliance technicalCompliance = (TechnicalCompliance) obj;
        return C17542s.e(this.f95156a, technicalCompliance.f95156a) && C17542s.e(this.f95157b, technicalCompliance.f95157b) && C17542s.e(this.f95158c, technicalCompliance.f95158c) && C17542s.e(this.f95159d, technicalCompliance.f95159d);
    }

    public int hashCode() {
        Link link = this.f95156a;
        int i10 = 0;
        int hashCode = (link == null ? 0 : link.hashCode()) * 31;
        String str = this.f95157b;
        if (str != null) {
            i10 = str.hashCode();
        }
        return ((((hashCode + i10) * 31) + this.f95158c.hashCode()) * 31) + this.f95159d.hashCode();
    }

    public String toString() {
        Link link = this.f95156a;
        String str = this.f95157b;
        List<InformationValue> list = this.f95158c;
        List<Image> list2 = this.f95159d;
        return "TechnicalCompliance(infoSheet=" + link + ", informationValuesLabel=" + str + ", informationValues=" + list + ", energyLabelImages=" + list2 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeParcelable(this.f95156a, i10);
        parcel.writeString(this.f95157b);
        List<InformationValue> list = this.f95158c;
        parcel.writeInt(list.size());
        for (InformationValue writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i10);
        }
        List<Image> list2 = this.f95159d;
        parcel.writeInt(list2.size());
        for (Image writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, i10);
        }
    }

    public TechnicalCompliance(Link link, String str, List<InformationValue> list, List<Image> list2) {
        C17542s.j(list, "informationValues");
        C17542s.j(list2, "energyLabelImages");
        this.f95156a = link;
        this.f95157b = str;
        this.f95158c = list;
        this.f95159d = list2;
    }
}
