package com.ingka.ikea.core.model.product;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
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
@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ$\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010\u001bJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u001d¨\u0006."}, d2 = {"Lcom/ingka/ikea/core/model/product/WarningMoreInfoUrl;", "Landroid/os/Parcelable;", "", "url", "textMatch", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$model_release", "(Lcom/ingka/ikea/core/model/product/WarningMoreInfoUrl;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ingka/ikea/core/model/product/WarningMoreInfoUrl;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "getTextMatch", "Companion", "$serializer", "a", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WarningMoreInfoUrl implements Parcelable {
    public static final Parcelable.Creator<WarningMoreInfoUrl> CREATOR = new b();
    public static final a Companion = new a((DefaultConstructorMarker) null);
    private final String textMatch;
    private final String url;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/WarningMoreInfoUrl$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/WarningMoreInfoUrl;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<WarningMoreInfoUrl> serializer() {
            return WarningMoreInfoUrl$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<WarningMoreInfoUrl> {
        /* renamed from: a */
        public final WarningMoreInfoUrl createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new WarningMoreInfoUrl(parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final WarningMoreInfoUrl[] newArray(int i10) {
            return new WarningMoreInfoUrl[i10];
        }
    }

    public /* synthetic */ WarningMoreInfoUrl(int i10, String str, String str2, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, WarningMoreInfoUrl$$serializer.INSTANCE.getDescriptor());
        }
        this.url = str;
        this.textMatch = str2;
    }

    public static /* synthetic */ WarningMoreInfoUrl copy$default(WarningMoreInfoUrl warningMoreInfoUrl, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = warningMoreInfoUrl.url;
        }
        if ((i10 & 2) != 0) {
            str2 = warningMoreInfoUrl.textMatch;
        }
        return warningMoreInfoUrl.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$model_release(WarningMoreInfoUrl warningMoreInfoUrl, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, warningMoreInfoUrl.url);
        dVar.y(serialDescriptor, 1, warningMoreInfoUrl.textMatch);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.textMatch;
    }

    public final WarningMoreInfoUrl copy(String str, String str2) {
        C17542s.j(str, "url");
        C17542s.j(str2, "textMatch");
        return new WarningMoreInfoUrl(str, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WarningMoreInfoUrl)) {
            return false;
        }
        WarningMoreInfoUrl warningMoreInfoUrl = (WarningMoreInfoUrl) obj;
        return C17542s.e(this.url, warningMoreInfoUrl.url) && C17542s.e(this.textMatch, warningMoreInfoUrl.textMatch);
    }

    public final String getTextMatch() {
        return this.textMatch;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (this.url.hashCode() * 31) + this.textMatch.hashCode();
    }

    public String toString() {
        String str = this.url;
        String str2 = this.textMatch;
        return "WarningMoreInfoUrl(url=" + str + ", textMatch=" + str2 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.url);
        parcel.writeString(this.textMatch);
    }

    public WarningMoreInfoUrl(String str, String str2) {
        C17542s.j(str, "url");
        C17542s.j(str2, "textMatch");
        this.url = str;
        this.textMatch = str2;
    }
}
