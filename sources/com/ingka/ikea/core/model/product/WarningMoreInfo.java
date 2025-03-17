package com.ingka.ikea.core.model.product;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Keep
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 :2\u00020\u0001:\u0002;<B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\"J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0012\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b'\u0010(JF\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\"J\u0010\u0010,\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b,\u0010 J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010$R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b6\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b7\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010(¨\u0006="}, d2 = {"Lcom/ingka/ikea/core/model/product/WarningMoreInfo;", "Landroid/os/Parcelable;", "", "title", "Lcom/ingka/ikea/core/model/product/WarningImageType;", "imageType", "text", "boldText", "Lcom/ingka/ikea/core/model/product/WarningMoreInfoUrl;", "urlText", "<init>", "(Ljava/lang/String;Lcom/ingka/ikea/core/model/product/WarningImageType;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/model/product/WarningMoreInfoUrl;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/ingka/ikea/core/model/product/WarningImageType;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/model/product/WarningMoreInfoUrl;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$model_release", "(Lcom/ingka/ikea/core/model/product/WarningMoreInfo;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/ingka/ikea/core/model/product/WarningImageType;", "component3", "component4", "component5", "()Lcom/ingka/ikea/core/model/product/WarningMoreInfoUrl;", "copy", "(Ljava/lang/String;Lcom/ingka/ikea/core/model/product/WarningImageType;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/model/product/WarningMoreInfoUrl;)Lcom/ingka/ikea/core/model/product/WarningMoreInfo;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lcom/ingka/ikea/core/model/product/WarningImageType;", "getImageType", "getText", "getBoldText", "Lcom/ingka/ikea/core/model/product/WarningMoreInfoUrl;", "getUrlText", "Companion", "$serializer", "a", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WarningMoreInfo implements Parcelable {
    /* access modifiers changed from: private */
    public static final KSerializer<Object>[] $childSerializers = {0, WarningImageType.Companion.serializer(), 0, 0, 0};
    public static final Parcelable.Creator<WarningMoreInfo> CREATOR = new b();
    public static final a Companion = new a((DefaultConstructorMarker) null);
    private final String boldText;
    private final WarningImageType imageType;
    private final String text;
    private final String title;
    private final WarningMoreInfoUrl urlText;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/WarningMoreInfo$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/WarningMoreInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<WarningMoreInfo> serializer() {
            return WarningMoreInfo$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<WarningMoreInfo> {
        /* renamed from: a */
        public final WarningMoreInfo createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new WarningMoreInfo(parcel.readString(), WarningImageType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : WarningMoreInfoUrl.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public final WarningMoreInfo[] newArray(int i10) {
            return new WarningMoreInfo[i10];
        }
    }

    public /* synthetic */ WarningMoreInfo(int i10, String str, WarningImageType warningImageType, String str2, String str3, WarningMoreInfoUrl warningMoreInfoUrl, T0 t02) {
        if (31 != (i10 & 31)) {
            E0.b(i10, 31, WarningMoreInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.imageType = warningImageType;
        this.text = str2;
        this.boldText = str3;
        this.urlText = warningMoreInfoUrl;
    }

    public static /* synthetic */ WarningMoreInfo copy$default(WarningMoreInfo warningMoreInfo, String str, WarningImageType warningImageType, String str2, String str3, WarningMoreInfoUrl warningMoreInfoUrl, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = warningMoreInfo.title;
        }
        if ((i10 & 2) != 0) {
            warningImageType = warningMoreInfo.imageType;
        }
        WarningImageType warningImageType2 = warningImageType;
        if ((i10 & 4) != 0) {
            str2 = warningMoreInfo.text;
        }
        String str4 = str2;
        if ((i10 & 8) != 0) {
            str3 = warningMoreInfo.boldText;
        }
        String str5 = str3;
        if ((i10 & 16) != 0) {
            warningMoreInfoUrl = warningMoreInfo.urlText;
        }
        return warningMoreInfo.copy(str, warningImageType2, str4, str5, warningMoreInfoUrl);
    }

    public static final /* synthetic */ void write$Self$model_release(WarningMoreInfo warningMoreInfo, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        dVar.y(serialDescriptor, 0, warningMoreInfo.title);
        dVar.i(serialDescriptor, 1, kSerializerArr[1], warningMoreInfo.imageType);
        dVar.y(serialDescriptor, 2, warningMoreInfo.text);
        dVar.B(serialDescriptor, 3, Y0.f144077a, warningMoreInfo.boldText);
        dVar.B(serialDescriptor, 4, WarningMoreInfoUrl$$serializer.INSTANCE, warningMoreInfo.urlText);
    }

    public final String component1() {
        return this.title;
    }

    public final WarningImageType component2() {
        return this.imageType;
    }

    public final String component3() {
        return this.text;
    }

    public final String component4() {
        return this.boldText;
    }

    public final WarningMoreInfoUrl component5() {
        return this.urlText;
    }

    public final WarningMoreInfo copy(String str, WarningImageType warningImageType, String str2, String str3, WarningMoreInfoUrl warningMoreInfoUrl) {
        C17542s.j(str, "title");
        C17542s.j(warningImageType, "imageType");
        C17542s.j(str2, "text");
        return new WarningMoreInfo(str, warningImageType, str2, str3, warningMoreInfoUrl);
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WarningMoreInfo)) {
            return false;
        }
        WarningMoreInfo warningMoreInfo = (WarningMoreInfo) obj;
        return C17542s.e(this.title, warningMoreInfo.title) && this.imageType == warningMoreInfo.imageType && C17542s.e(this.text, warningMoreInfo.text) && C17542s.e(this.boldText, warningMoreInfo.boldText) && C17542s.e(this.urlText, warningMoreInfo.urlText);
    }

    public final String getBoldText() {
        return this.boldText;
    }

    public final WarningImageType getImageType() {
        return this.imageType;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public final WarningMoreInfoUrl getUrlText() {
        return this.urlText;
    }

    public int hashCode() {
        int hashCode = ((((this.title.hashCode() * 31) + this.imageType.hashCode()) * 31) + this.text.hashCode()) * 31;
        String str = this.boldText;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        WarningMoreInfoUrl warningMoreInfoUrl = this.urlText;
        if (warningMoreInfoUrl != null) {
            i10 = warningMoreInfoUrl.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.title;
        WarningImageType warningImageType = this.imageType;
        String str2 = this.text;
        String str3 = this.boldText;
        WarningMoreInfoUrl warningMoreInfoUrl = this.urlText;
        return "WarningMoreInfo(title=" + str + ", imageType=" + warningImageType + ", text=" + str2 + ", boldText=" + str3 + ", urlText=" + warningMoreInfoUrl + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.title);
        this.imageType.writeToParcel(parcel, i10);
        parcel.writeString(this.text);
        parcel.writeString(this.boldText);
        WarningMoreInfoUrl warningMoreInfoUrl = this.urlText;
        if (warningMoreInfoUrl == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        warningMoreInfoUrl.writeToParcel(parcel, i10);
    }

    public WarningMoreInfo(String str, WarningImageType warningImageType, String str2, String str3, WarningMoreInfoUrl warningMoreInfoUrl) {
        C17542s.j(str, "title");
        C17542s.j(warningImageType, "imageType");
        C17542s.j(str2, "text");
        this.title = str;
        this.imageType = warningImageType;
        this.text = str2;
        this.boldText = str3;
        this.urlText = warningMoreInfoUrl;
    }
}
