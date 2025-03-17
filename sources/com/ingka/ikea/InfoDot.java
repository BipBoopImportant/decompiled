package com.ingka.ikea;

import android.os.Parcel;
import android.os.Parcelable;
import com.ingka.ikea.core.model.Image;
import com.ingka.ikea.core.model.Image$$serializer;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u0000 /2\u00020\u0001:\u00020%B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010\u001eR \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010&\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001eR \u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010,\u0012\u0004\b.\u0010(\u001a\u0004\b)\u0010-¨\u00061"}, d2 = {"Lcom/ingka/ikea/InfoDot;", "Landroid/os/Parcelable;", "", "header", "text", "Lcom/ingka/ikea/core/model/Image;", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/model/Image;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/model/Image;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/InfoDot;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getHeader$annotations", "()V", "b", "c", "getText$annotations", "Lcom/ingka/ikea/core/model/Image;", "()Lcom/ingka/ikea/core/model/Image;", "getIcon$annotations", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InfoDot implements Parcelable {
    public static final Parcelable.Creator<InfoDot> CREATOR = new b();
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f69459a;

    /* renamed from: b  reason: collision with root package name */
    private final String f69460b;

    /* renamed from: c  reason: collision with root package name */
    private final Image f69461c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/InfoDot$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/InfoDot;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<InfoDot> serializer() {
            return InfoDot$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<InfoDot> {
        /* renamed from: a */
        public final InfoDot createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new InfoDot(parcel.readString(), parcel.readString(), Image.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public final InfoDot[] newArray(int i10) {
            return new InfoDot[i10];
        }
    }

    public /* synthetic */ InfoDot(int i10, String str, String str2, Image image, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, InfoDot$$serializer.INSTANCE.getDescriptor());
        }
        this.f69459a = str;
        this.f69460b = str2;
        this.f69461c = image;
    }

    public static final /* synthetic */ void d(InfoDot infoDot, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, infoDot.f69459a);
        dVar.y(serialDescriptor, 1, infoDot.f69460b);
        dVar.i(serialDescriptor, 2, Image$$serializer.INSTANCE, infoDot.f69461c);
    }

    public final String a() {
        return this.f69459a;
    }

    public final Image b() {
        return this.f69461c;
    }

    public final String c() {
        return this.f69460b;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoDot)) {
            return false;
        }
        InfoDot infoDot = (InfoDot) obj;
        return C17542s.e(this.f69459a, infoDot.f69459a) && C17542s.e(this.f69460b, infoDot.f69460b) && C17542s.e(this.f69461c, infoDot.f69461c);
    }

    public int hashCode() {
        return (((this.f69459a.hashCode() * 31) + this.f69460b.hashCode()) * 31) + this.f69461c.hashCode();
    }

    public String toString() {
        String str = this.f69459a;
        String str2 = this.f69460b;
        Image image = this.f69461c;
        return "InfoDot(header=" + str + ", text=" + str2 + ", icon=" + image + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f69459a);
        parcel.writeString(this.f69460b);
        this.f69461c.writeToParcel(parcel, i10);
    }

    public InfoDot(String str, String str2, Image image) {
        C17542s.j(str, "header");
        C17542s.j(str2, "text");
        C17542s.j(image, "icon");
        this.f69459a = str;
        this.f69460b = str2;
        this.f69461c = image;
    }
}
