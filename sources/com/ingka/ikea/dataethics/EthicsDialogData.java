package com.ingka.ikea.dataethics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J8\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0016¨\u0006&"}, d2 = {"Lcom/ingka/ikea/dataethics/EthicsDialogData;", "Landroid/os/Parcelable;", "", "image", "title", "message", "", "privacyPolicyLink", "<init>", "(IIILjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "component2", "component3", "component4", "()Ljava/lang/String;", "copy", "(IIILjava/lang/String;)Lcom/ingka/ikea/dataethics/EthicsDialogData;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getImage", "getTitle", "getMessage", "Ljava/lang/String;", "getPrivacyPolicyLink", "dataethics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Keep
public final class EthicsDialogData implements Parcelable {
    public static final Parcelable.Creator<EthicsDialogData> CREATOR = new a();
    private final int image;
    private final int message;
    private final String privacyPolicyLink;
    private final int title;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EthicsDialogData> {
        /* renamed from: a */
        public final EthicsDialogData createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new EthicsDialogData(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        /* renamed from: b */
        public final EthicsDialogData[] newArray(int i10) {
            return new EthicsDialogData[i10];
        }
    }

    public EthicsDialogData(int i10, int i11, int i12, String str) {
        C17542s.j(str, "privacyPolicyLink");
        this.image = i10;
        this.title = i11;
        this.message = i12;
        this.privacyPolicyLink = str;
    }

    public static /* synthetic */ EthicsDialogData copy$default(EthicsDialogData ethicsDialogData, int i10, int i11, int i12, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = ethicsDialogData.image;
        }
        if ((i13 & 2) != 0) {
            i11 = ethicsDialogData.title;
        }
        if ((i13 & 4) != 0) {
            i12 = ethicsDialogData.message;
        }
        if ((i13 & 8) != 0) {
            str = ethicsDialogData.privacyPolicyLink;
        }
        return ethicsDialogData.copy(i10, i11, i12, str);
    }

    public final int component1() {
        return this.image;
    }

    public final int component2() {
        return this.title;
    }

    public final int component3() {
        return this.message;
    }

    public final String component4() {
        return this.privacyPolicyLink;
    }

    public final EthicsDialogData copy(int i10, int i11, int i12, String str) {
        C17542s.j(str, "privacyPolicyLink");
        return new EthicsDialogData(i10, i11, i12, str);
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EthicsDialogData)) {
            return false;
        }
        EthicsDialogData ethicsDialogData = (EthicsDialogData) obj;
        return this.image == ethicsDialogData.image && this.title == ethicsDialogData.title && this.message == ethicsDialogData.message && C17542s.e(this.privacyPolicyLink, ethicsDialogData.privacyPolicyLink);
    }

    public final int getImage() {
        return this.image;
    }

    public final int getMessage() {
        return this.message;
    }

    public final String getPrivacyPolicyLink() {
        return this.privacyPolicyLink;
    }

    public final int getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.image) * 31) + Integer.hashCode(this.title)) * 31) + Integer.hashCode(this.message)) * 31) + this.privacyPolicyLink.hashCode();
    }

    public String toString() {
        int i10 = this.image;
        int i11 = this.title;
        int i12 = this.message;
        String str = this.privacyPolicyLink;
        return "EthicsDialogData(image=" + i10 + ", title=" + i11 + ", message=" + i12 + ", privacyPolicyLink=" + str + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeInt(this.image);
        parcel.writeInt(this.title);
        parcel.writeInt(this.message);
        parcel.writeString(this.privacyPolicyLink);
    }
}
