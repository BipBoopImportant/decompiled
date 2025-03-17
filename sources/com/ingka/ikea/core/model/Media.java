package com.ingka.ikea.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.ingka.ikea.InfoDotWithCoordinates;
import com.ingka.ikea.InfoDotWithCoordinates$$serializer;
import fK.C17261n;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import uI.C18055d;

@p
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \b2\u00020\u0001:\u0004\t\n\u000b\fR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/ingka/ikea/core/model/Media;", "Landroid/os/Parcelable;", "", "getUrl", "()Ljava/lang/String;", "url", "A0", "altText", "Companion", "Image", "Video", "InfoImage", "a", "Lcom/ingka/ikea/core/model/Media$Image;", "Lcom/ingka/ikea/core/model/Media$InfoImage;", "Lcom/ingka/ikea/core/model/Media$Video;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Media extends Parcelable {
    public static final a Companion = a.f94927a;

    @p
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0002)\u0013B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001bJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b%\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u001d¨\u0006*"}, d2 = {"Lcom/ingka/ikea/core/model/Media$Image;", "Lcom/ingka/ikea/core/model/Media;", "Landroid/os/Parcelable;", "", "url", "altText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/core/model/Media$Image;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "b", "A0", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Image implements Media, Parcelable {
        public static final Parcelable.Creator<Image> CREATOR = new b();
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f94918a;

        /* renamed from: b  reason: collision with root package name */
        private final String f94919b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/Media$Image$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/Media$Image;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<Image> serializer() {
                return Media$Image$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Image> {
            /* renamed from: a */
            public final Image createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new Image(parcel.readString(), parcel.readString());
            }

            /* renamed from: b */
            public final Image[] newArray(int i10) {
                return new Image[i10];
            }
        }

        public /* synthetic */ Image(int i10, String str, String str2, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, Media$Image$$serializer.INSTANCE.getDescriptor());
            }
            this.f94918a = str;
            this.f94919b = str2;
        }

        public static final /* synthetic */ void a(Image image, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.y(serialDescriptor, 0, image.getUrl());
            dVar.y(serialDescriptor, 1, image.A0());
        }

        public String A0() {
            return this.f94919b;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Image)) {
                return false;
            }
            Image image = (Image) obj;
            return C17542s.e(this.f94918a, image.f94918a) && C17542s.e(this.f94919b, image.f94919b);
        }

        public String getUrl() {
            return this.f94918a;
        }

        public int hashCode() {
            return (this.f94918a.hashCode() * 31) + this.f94919b.hashCode();
        }

        public String toString() {
            String str = this.f94918a;
            String str2 = this.f94919b;
            return "Image(url=" + str + ", altText=" + str2 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f94918a);
            parcel.writeString(this.f94919b);
        }

        public Image(String str, String str2) {
            C17542s.j(str, "url");
            C17542s.j(str2, "altText");
            this.f94918a = str;
            this.f94919b = str2;
        }
    }

    @p
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00021(B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\"\u0010\u001fJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010!R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b+\u0010/R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010)\u001a\u0004\b-\u0010!¨\u00062"}, d2 = {"Lcom/ingka/ikea/core/model/Media$InfoImage;", "Lcom/ingka/ikea/core/model/Media;", "Landroid/os/Parcelable;", "", "url", "altText", "", "Lcom/ingka/ikea/InfoDotWithCoordinates;", "infoDots", "smallestInfoDotId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/core/model/Media$InfoImage;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getUrl", "b", "A0", "c", "Ljava/util/List;", "()Ljava/util/List;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InfoImage implements Media, Parcelable {
        public static final Parcelable.Creator<InfoImage> CREATOR = new b();
        public static final a Companion = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public static final KSerializer<Object>[] f94920e = {null, null, new C17451f(InfoDotWithCoordinates$$serializer.INSTANCE), null};

        /* renamed from: a  reason: collision with root package name */
        private final String f94921a;

        /* renamed from: b  reason: collision with root package name */
        private final String f94922b;

        /* renamed from: c  reason: collision with root package name */
        private final List<InfoDotWithCoordinates> f94923c;

        /* renamed from: d  reason: collision with root package name */
        private final String f94924d;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/Media$InfoImage$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/Media$InfoImage;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<InfoImage> serializer() {
                return Media$InfoImage$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<InfoImage> {
            /* renamed from: a */
            public final InfoImage createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i10 = 0; i10 != readInt; i10++) {
                    arrayList.add(InfoDotWithCoordinates.CREATOR.createFromParcel(parcel));
                }
                return new InfoImage(readString, readString2, arrayList, parcel.readString());
            }

            /* renamed from: b */
            public final InfoImage[] newArray(int i10) {
                return new InfoImage[i10];
            }
        }

        public /* synthetic */ InfoImage(int i10, String str, String str2, List list, String str3, T0 t02) {
            if (15 != (i10 & 15)) {
                E0.b(i10, 15, Media$InfoImage$$serializer.INSTANCE.getDescriptor());
            }
            this.f94921a = str;
            this.f94922b = str2;
            this.f94923c = list;
            this.f94924d = str3;
        }

        public static final /* synthetic */ void d(InfoImage infoImage, C17395d dVar, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = f94920e;
            dVar.y(serialDescriptor, 0, infoImage.getUrl());
            dVar.y(serialDescriptor, 1, infoImage.A0());
            dVar.i(serialDescriptor, 2, kSerializerArr[2], infoImage.f94923c);
            dVar.y(serialDescriptor, 3, infoImage.f94924d);
        }

        public String A0() {
            return this.f94922b;
        }

        public final List<InfoDotWithCoordinates> b() {
            return this.f94923c;
        }

        public final String c() {
            return this.f94924d;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InfoImage)) {
                return false;
            }
            InfoImage infoImage = (InfoImage) obj;
            return C17542s.e(this.f94921a, infoImage.f94921a) && C17542s.e(this.f94922b, infoImage.f94922b) && C17542s.e(this.f94923c, infoImage.f94923c) && C17542s.e(this.f94924d, infoImage.f94924d);
        }

        public String getUrl() {
            return this.f94921a;
        }

        public int hashCode() {
            return (((((this.f94921a.hashCode() * 31) + this.f94922b.hashCode()) * 31) + this.f94923c.hashCode()) * 31) + this.f94924d.hashCode();
        }

        public String toString() {
            String str = this.f94921a;
            String str2 = this.f94922b;
            List<InfoDotWithCoordinates> list = this.f94923c;
            String str3 = this.f94924d;
            return "InfoImage(url=" + str + ", altText=" + str2 + ", infoDots=" + list + ", smallestInfoDotId=" + str3 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f94921a);
            parcel.writeString(this.f94922b);
            List<InfoDotWithCoordinates> list = this.f94923c;
            parcel.writeInt(list.size());
            for (InfoDotWithCoordinates writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i10);
            }
            parcel.writeString(this.f94924d);
        }

        public InfoImage(String str, String str2, List<InfoDotWithCoordinates> list, String str3) {
            C17542s.j(str, "url");
            C17542s.j(str2, "altText");
            C17542s.j(list, "infoDots");
            C17542s.j(str3, "smallestInfoDotId");
            this.f94921a = str;
            this.f94922b = str2;
            this.f94923c = list;
            this.f94924d = str3;
        }
    }

    @p
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0002)\u0013B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001bJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b%\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u001d¨\u0006*"}, d2 = {"Lcom/ingka/ikea/core/model/Media$Video;", "Lcom/ingka/ikea/core/model/Media;", "Landroid/os/Parcelable;", "", "url", "altText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/core/model/Media$Video;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "b", "A0", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Video implements Media, Parcelable {
        public static final Parcelable.Creator<Video> CREATOR = new b();
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f94925a;

        /* renamed from: b  reason: collision with root package name */
        private final String f94926b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/Media$Video$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/Media$Video;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<Video> serializer() {
                return Media$Video$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Video> {
            /* renamed from: a */
            public final Video createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new Video(parcel.readString(), parcel.readString());
            }

            /* renamed from: b */
            public final Video[] newArray(int i10) {
                return new Video[i10];
            }
        }

        public /* synthetic */ Video(int i10, String str, String str2, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, Media$Video$$serializer.INSTANCE.getDescriptor());
            }
            this.f94925a = str;
            this.f94926b = str2;
        }

        public static final /* synthetic */ void a(Video video, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.y(serialDescriptor, 0, video.getUrl());
            dVar.y(serialDescriptor, 1, video.A0());
        }

        public String A0() {
            return this.f94926b;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Video)) {
                return false;
            }
            Video video = (Video) obj;
            return C17542s.e(this.f94925a, video.f94925a) && C17542s.e(this.f94926b, video.f94926b);
        }

        public String getUrl() {
            return this.f94925a;
        }

        public int hashCode() {
            return (this.f94925a.hashCode() * 31) + this.f94926b.hashCode();
        }

        public String toString() {
            String str = this.f94925a;
            String str2 = this.f94926b;
            return "Video(url=" + str + ", altText=" + str2 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f94925a);
            parcel.writeString(this.f94926b);
        }

        public Video(String str, String str2) {
            C17542s.j(str, "url");
            C17542s.j(str2, "altText");
            this.f94925a = str;
            this.f94926b = str2;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/Media$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/Media;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f94927a = new a();

        private a() {
        }

        public final KSerializer<Media> serializer() {
            return new C17261n("com.ingka.ikea.core.model.Media", P.b(Media.class), new C18055d[]{P.b(Image.class), P.b(InfoImage.class), P.b(Video.class)}, new KSerializer[]{Media$Image$$serializer.INSTANCE, Media$InfoImage$$serializer.INSTANCE, Media$Video$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    String A0();

    String getUrl();
}
