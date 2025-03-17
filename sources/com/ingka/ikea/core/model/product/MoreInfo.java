package com.ingka.ikea.core.model.product;

import android.os.Parcel;
import android.os.Parcelable;
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
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\b\u0018\u0000 D2\u00020\u0001:\u0002E4B\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0002\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0016\u0010\u0017B©\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0002\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001cJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$J\u001d\u0010(\u001a\u00020\"2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0018¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0018¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b.\u0010+J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b6\u00108\u001a\u0004\b9\u0010-R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u00107R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b;\u00107R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b<\u00105\u001a\u0004\b=\u00107R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b;\u00105\u001a\u0004\b<\u00107R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b=\u00105\u001a\u0004\b>\u00107R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b?\u00105\u001a\u0004\b@\u00107R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b>\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b@\u00108\u001a\u0004\b?\u0010-¨\u0006F"}, d2 = {"Lcom/ingka/ikea/core/model/product/MoreInfo;", "Landroid/os/Parcelable;", "", "Lcom/ingka/ikea/core/model/product/Attachment;", "attachments", "", "attachmentsDisclaimer", "Lcom/ingka/ikea/core/model/product/CustomerBenefit;", "customerBenefit", "Lcom/ingka/ikea/core/model/product/CustomerEnvironment;", "customerEnvironment", "Lcom/ingka/ikea/core/model/product/CustomerMaterial;", "customerMaterial", "Lcom/ingka/ikea/core/model/product/CustomerCare;", "customerCare", "Lcom/ingka/ikea/core/model/product/GoodToKnow;", "goodToKnow", "Lcom/ingka/ikea/core/model/product/SafetyAndCompliance;", "safetyAndCompliance", "Lcom/ingka/ikea/core/model/product/TechnicalCompliance;", "technicalCompliance", "designerInfo", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/ingka/ikea/core/model/product/TechnicalCompliance;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/ingka/ikea/core/model/product/TechnicalCompliance;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "l", "(Lcom/ingka/ikea/core/model/product/MoreInfo;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/String;", "c", "d", "f", "e", "g", "i", "h", "j", "Lcom/ingka/ikea/core/model/product/TechnicalCompliance;", "k", "()Lcom/ingka/ikea/core/model/product/TechnicalCompliance;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MoreInfo implements Parcelable {
    public static final Parcelable.Creator<MoreInfo> CREATOR = new b();
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final KSerializer<Object>[] f94999k = {new C17451f(Attachment$$serializer.INSTANCE), null, new C17451f(CustomerBenefit$$serializer.INSTANCE), new C17451f(CustomerEnvironment$$serializer.INSTANCE), new C17451f(CustomerMaterial$$serializer.INSTANCE), new C17451f(CustomerCare$$serializer.INSTANCE), new C17451f(GoodToKnow$$serializer.INSTANCE), new C17451f(SafetyAndCompliance$$serializer.INSTANCE), null, null};

    /* renamed from: a  reason: collision with root package name */
    private final List<Attachment> f95000a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95001b;

    /* renamed from: c  reason: collision with root package name */
    private final List<CustomerBenefit> f95002c;

    /* renamed from: d  reason: collision with root package name */
    private final List<CustomerEnvironment> f95003d;

    /* renamed from: e  reason: collision with root package name */
    private final List<CustomerMaterial> f95004e;

    /* renamed from: f  reason: collision with root package name */
    private final List<CustomerCare> f95005f;

    /* renamed from: g  reason: collision with root package name */
    private final List<GoodToKnow> f95006g;

    /* renamed from: h  reason: collision with root package name */
    private final List<SafetyAndCompliance> f95007h;

    /* renamed from: i  reason: collision with root package name */
    private final TechnicalCompliance f95008i;

    /* renamed from: j  reason: collision with root package name */
    private final String f95009j;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/MoreInfo$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/MoreInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<MoreInfo> serializer() {
            return MoreInfo$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<MoreInfo> {
        /* renamed from: a */
        public final MoreInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            C17542s.j(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList6 = new ArrayList(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                arrayList6.add(Attachment.CREATOR.createFromParcel(parcel));
            }
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList7 = new ArrayList(readInt2);
            for (int i11 = 0; i11 != readInt2; i11++) {
                arrayList7.add(CustomerBenefit.CREATOR.createFromParcel(parcel));
            }
            TechnicalCompliance technicalCompliance = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                for (int i12 = 0; i12 != readInt3; i12++) {
                    arrayList.add(CustomerEnvironment.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList2 = new ArrayList(readInt4);
                for (int i13 = 0; i13 != readInt4; i13++) {
                    arrayList2.add(CustomerMaterial.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList3 = new ArrayList(readInt5);
                for (int i14 = 0; i14 != readInt5; i14++) {
                    arrayList3.add(CustomerCare.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt6 = parcel.readInt();
                arrayList4 = new ArrayList(readInt6);
                for (int i15 = 0; i15 != readInt6; i15++) {
                    arrayList4.add(GoodToKnow.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int readInt7 = parcel.readInt();
                arrayList5 = new ArrayList(readInt7);
                for (int i16 = 0; i16 != readInt7; i16++) {
                    arrayList5.add(SafetyAndCompliance.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                technicalCompliance = TechnicalCompliance.CREATOR.createFromParcel(parcel);
            }
            return new MoreInfo(arrayList6, readString, arrayList7, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, technicalCompliance, parcel.readString());
        }

        /* renamed from: b */
        public final MoreInfo[] newArray(int i10) {
            return new MoreInfo[i10];
        }
    }

    public /* synthetic */ MoreInfo(int i10, List list, String str, List list2, List list3, List list4, List list5, List list6, List list7, TechnicalCompliance technicalCompliance, String str2, T0 t02) {
        if (1023 != (i10 & 1023)) {
            E0.b(i10, 1023, MoreInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.f95000a = list;
        this.f95001b = str;
        this.f95002c = list2;
        this.f95003d = list3;
        this.f95004e = list4;
        this.f95005f = list5;
        this.f95006g = list6;
        this.f95007h = list7;
        this.f95008i = technicalCompliance;
        this.f95009j = str2;
    }

    public static final /* synthetic */ void l(MoreInfo moreInfo, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f94999k;
        dVar.i(serialDescriptor, 0, kSerializerArr[0], moreInfo.f95000a);
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 1, y02, moreInfo.f95001b);
        dVar.i(serialDescriptor, 2, kSerializerArr[2], moreInfo.f95002c);
        dVar.B(serialDescriptor, 3, kSerializerArr[3], moreInfo.f95003d);
        dVar.B(serialDescriptor, 4, kSerializerArr[4], moreInfo.f95004e);
        dVar.B(serialDescriptor, 5, kSerializerArr[5], moreInfo.f95005f);
        dVar.B(serialDescriptor, 6, kSerializerArr[6], moreInfo.f95006g);
        dVar.B(serialDescriptor, 7, kSerializerArr[7], moreInfo.f95007h);
        dVar.B(serialDescriptor, 8, TechnicalCompliance$$serializer.INSTANCE, moreInfo.f95008i);
        dVar.B(serialDescriptor, 9, y02, moreInfo.f95009j);
    }

    public final List<Attachment> b() {
        return this.f95000a;
    }

    public final String c() {
        return this.f95001b;
    }

    public final List<CustomerBenefit> d() {
        return this.f95002c;
    }

    public final int describeContents() {
        return 0;
    }

    public final List<CustomerCare> e() {
        return this.f95005f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoreInfo)) {
            return false;
        }
        MoreInfo moreInfo = (MoreInfo) obj;
        return C17542s.e(this.f95000a, moreInfo.f95000a) && C17542s.e(this.f95001b, moreInfo.f95001b) && C17542s.e(this.f95002c, moreInfo.f95002c) && C17542s.e(this.f95003d, moreInfo.f95003d) && C17542s.e(this.f95004e, moreInfo.f95004e) && C17542s.e(this.f95005f, moreInfo.f95005f) && C17542s.e(this.f95006g, moreInfo.f95006g) && C17542s.e(this.f95007h, moreInfo.f95007h) && C17542s.e(this.f95008i, moreInfo.f95008i) && C17542s.e(this.f95009j, moreInfo.f95009j);
    }

    public final List<CustomerEnvironment> f() {
        return this.f95003d;
    }

    public final List<CustomerMaterial> g() {
        return this.f95004e;
    }

    public final String h() {
        return this.f95009j;
    }

    public int hashCode() {
        int hashCode = this.f95000a.hashCode() * 31;
        String str = this.f95001b;
        int i10 = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f95002c.hashCode()) * 31;
        List<CustomerEnvironment> list = this.f95003d;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<CustomerMaterial> list2 = this.f95004e;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<CustomerCare> list3 = this.f95005f;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<GoodToKnow> list4 = this.f95006g;
        int hashCode6 = (hashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<SafetyAndCompliance> list5 = this.f95007h;
        int hashCode7 = (hashCode6 + (list5 == null ? 0 : list5.hashCode())) * 31;
        TechnicalCompliance technicalCompliance = this.f95008i;
        int hashCode8 = (hashCode7 + (technicalCompliance == null ? 0 : technicalCompliance.hashCode())) * 31;
        String str2 = this.f95009j;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode8 + i10;
    }

    public final List<GoodToKnow> i() {
        return this.f95006g;
    }

    public final List<SafetyAndCompliance> j() {
        return this.f95007h;
    }

    public final TechnicalCompliance k() {
        return this.f95008i;
    }

    public String toString() {
        List<Attachment> list = this.f95000a;
        String str = this.f95001b;
        List<CustomerBenefit> list2 = this.f95002c;
        List<CustomerEnvironment> list3 = this.f95003d;
        List<CustomerMaterial> list4 = this.f95004e;
        List<CustomerCare> list5 = this.f95005f;
        List<GoodToKnow> list6 = this.f95006g;
        List<SafetyAndCompliance> list7 = this.f95007h;
        TechnicalCompliance technicalCompliance = this.f95008i;
        String str2 = this.f95009j;
        return "MoreInfo(attachments=" + list + ", attachmentsDisclaimer=" + str + ", customerBenefit=" + list2 + ", customerEnvironment=" + list3 + ", customerMaterial=" + list4 + ", customerCare=" + list5 + ", goodToKnow=" + list6 + ", safetyAndCompliance=" + list7 + ", technicalCompliance=" + technicalCompliance + ", designerInfo=" + str2 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        List<Attachment> list = this.f95000a;
        parcel.writeInt(list.size());
        for (Attachment writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i10);
        }
        parcel.writeString(this.f95001b);
        List<CustomerBenefit> list2 = this.f95002c;
        parcel.writeInt(list2.size());
        for (CustomerBenefit writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, i10);
        }
        List<CustomerEnvironment> list3 = this.f95003d;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            for (CustomerEnvironment writeToParcel3 : list3) {
                writeToParcel3.writeToParcel(parcel, i10);
            }
        }
        List<CustomerMaterial> list4 = this.f95004e;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list4.size());
            for (CustomerMaterial writeToParcel4 : list4) {
                writeToParcel4.writeToParcel(parcel, i10);
            }
        }
        List<CustomerCare> list5 = this.f95005f;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list5.size());
            for (CustomerCare writeToParcel5 : list5) {
                writeToParcel5.writeToParcel(parcel, i10);
            }
        }
        List<GoodToKnow> list6 = this.f95006g;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list6.size());
            for (GoodToKnow writeToParcel6 : list6) {
                writeToParcel6.writeToParcel(parcel, i10);
            }
        }
        List<SafetyAndCompliance> list7 = this.f95007h;
        if (list7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list7.size());
            for (SafetyAndCompliance writeToParcel7 : list7) {
                writeToParcel7.writeToParcel(parcel, i10);
            }
        }
        TechnicalCompliance technicalCompliance = this.f95008i;
        if (technicalCompliance == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            technicalCompliance.writeToParcel(parcel, i10);
        }
        parcel.writeString(this.f95009j);
    }

    public MoreInfo(List<Attachment> list, String str, List<CustomerBenefit> list2, List<CustomerEnvironment> list3, List<CustomerMaterial> list4, List<CustomerCare> list5, List<GoodToKnow> list6, List<SafetyAndCompliance> list7, TechnicalCompliance technicalCompliance, String str2) {
        C17542s.j(list, "attachments");
        C17542s.j(list2, "customerBenefit");
        this.f95000a = list;
        this.f95001b = str;
        this.f95002c = list2;
        this.f95003d = list3;
        this.f95004e = list4;
        this.f95005f = list5;
        this.f95006g = list6;
        this.f95007h = list7;
        this.f95008i = technicalCompliance;
        this.f95009j = str2;
    }
}
