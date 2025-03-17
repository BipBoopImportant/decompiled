package com.ingka.ikea.informationmessage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x4.C8951o;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0010J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/ingka/ikea/informationmessage/InformationMessageNavigation;", "", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "tag", "Lcom/ingka/ikea/informationmessage/InformationMessageNavigation$Data$a;", "content", "LXH/N;", "b", "(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;Lcom/ingka/ikea/informationmessage/InformationMessageNavigation$Data$a;)V", "Lx4/o;", "navController", "Lcom/ingka/ikea/informationmessage/InformationMessageNavigation$Data$b;", "a", "(Lx4/o;Lcom/ingka/ikea/informationmessage/InformationMessageNavigation$Data$b;)V", "Data", "informationmessage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface InformationMessageNavigation {

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/ingka/ikea/informationmessage/InformationMessageNavigation$Data;", "", "<init>", "()V", "a", "b", "informationmessage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data {
        public static final Data INSTANCE = new Data();

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/ingka/ikea/informationmessage/InformationMessageNavigation$Data$b;", "", "", "title", "body", "buttonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "informationmessage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b {

            /* renamed from: a  reason: collision with root package name */
            private final String f96145a;

            /* renamed from: b  reason: collision with root package name */
            private final String f96146b;

            /* renamed from: c  reason: collision with root package name */
            private final String f96147c;

            public b(String str, String str2, String str3) {
                C17542s.j(str, "title");
                C17542s.j(str2, "body");
                this.f96145a = str;
                this.f96146b = str2;
                this.f96147c = str3;
            }

            public final String a() {
                return this.f96146b;
            }

            public final String b() {
                return this.f96147c;
            }

            public final String c() {
                return this.f96145a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return C17542s.e(this.f96145a, bVar.f96145a) && C17542s.e(this.f96146b, bVar.f96146b) && C17542s.e(this.f96147c, bVar.f96147c);
            }

            public int hashCode() {
                int hashCode = ((this.f96145a.hashCode() * 31) + this.f96146b.hashCode()) * 31;
                String str = this.f96147c;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                String str = this.f96145a;
                String str2 = this.f96146b;
                String str3 = this.f96147c;
                return "DialogContent(title=" + str + ", body=" + str2 + ", buttonText=" + str3 + ")";
            }
        }

        private Data() {
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001:\u0002\u001e\u001cB-\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\u001c\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010$¨\u0006%"}, d2 = {"Lcom/ingka/ikea/informationmessage/InformationMessageNavigation$Data$a;", "Landroid/os/Parcelable;", "Lcom/ingka/ikea/informationmessage/InformationMessageNavigation$Data$a$c;", "image", "", "title", "body", "Lcom/ingka/ikea/informationmessage/InformationMessageNavigation$Data$a$a;", "button", "<init>", "(Lcom/ingka/ikea/informationmessage/InformationMessageNavigation$Data$a$c;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/informationmessage/InformationMessageNavigation$Data$a$a;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/informationmessage/InformationMessageNavigation$Data$a$c;", "c", "()Lcom/ingka/ikea/informationmessage/InformationMessageNavigation$Data$a$c;", "b", "Ljava/lang/String;", "d", "Lcom/ingka/ikea/informationmessage/InformationMessageNavigation$Data$a$a;", "()Lcom/ingka/ikea/informationmessage/InformationMessageNavigation$Data$a$a;", "informationmessage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new b();

            /* renamed from: a  reason: collision with root package name */
            private final c f96137a;

            /* renamed from: b  reason: collision with root package name */
            private final String f96138b;

            /* renamed from: c  reason: collision with root package name */
            private final String f96139c;

            /* renamed from: d  reason: collision with root package name */
            private final C2131a f96140d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class b implements Parcelable.Creator<a> {
                /* renamed from: a */
                public final a createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    C2131a aVar = null;
                    c createFromParcel = parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel);
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        aVar = C2131a.CREATOR.createFromParcel(parcel);
                    }
                    return new a(createFromParcel, readString, readString2, aVar);
                }

                /* renamed from: b */
                public final a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/ingka/ikea/informationmessage/InformationMessageNavigation$Data$a$c;", "Landroid/os/Parcelable;", "", "imageRes", "", "imageAltText", "<init>", "(ILjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "informationmessage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class c implements Parcelable {
                public static final Parcelable.Creator<c> CREATOR = new C2133a();

                /* renamed from: a  reason: collision with root package name */
                private final int f96143a;

                /* renamed from: b  reason: collision with root package name */
                private final String f96144b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.ingka.ikea.informationmessage.InformationMessageNavigation$Data$a$c$a  reason: collision with other inner class name */
                public static final class C2133a implements Parcelable.Creator<c> {
                    /* renamed from: a */
                    public final c createFromParcel(Parcel parcel) {
                        C17542s.j(parcel, "parcel");
                        return new c(parcel.readInt(), parcel.readString());
                    }

                    /* renamed from: b */
                    public final c[] newArray(int i10) {
                        return new c[i10];
                    }
                }

                public c(int i10, String str) {
                    this.f96143a = i10;
                    this.f96144b = str;
                }

                public final String a() {
                    return this.f96144b;
                }

                public final int b() {
                    return this.f96143a;
                }

                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return this.f96143a == cVar.f96143a && C17542s.e(this.f96144b, cVar.f96144b);
                }

                public int hashCode() {
                    int hashCode = Integer.hashCode(this.f96143a) * 31;
                    String str = this.f96144b;
                    return hashCode + (str == null ? 0 : str.hashCode());
                }

                public String toString() {
                    int i10 = this.f96143a;
                    String str = this.f96144b;
                    return "ImageContent(imageRes=" + i10 + ", imageAltText=" + str + ")";
                }

                public final void writeToParcel(Parcel parcel, int i10) {
                    C17542s.j(parcel, "dest");
                    parcel.writeInt(this.f96143a);
                    parcel.writeString(this.f96144b);
                }
            }

            public a(c cVar, String str, String str2, C2131a aVar) {
                C17542s.j(str, "title");
                C17542s.j(str2, "body");
                this.f96137a = cVar;
                this.f96138b = str;
                this.f96139c = str2;
                this.f96140d = aVar;
            }

            public final String a() {
                return this.f96139c;
            }

            public final C2131a b() {
                return this.f96140d;
            }

            public final c c() {
                return this.f96137a;
            }

            public final String d() {
                return this.f96138b;
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return C17542s.e(this.f96137a, aVar.f96137a) && C17542s.e(this.f96138b, aVar.f96138b) && C17542s.e(this.f96139c, aVar.f96139c) && C17542s.e(this.f96140d, aVar.f96140d);
            }

            public int hashCode() {
                c cVar = this.f96137a;
                int i10 = 0;
                int hashCode = (((((cVar == null ? 0 : cVar.hashCode()) * 31) + this.f96138b.hashCode()) * 31) + this.f96139c.hashCode()) * 31;
                C2131a aVar = this.f96140d;
                if (aVar != null) {
                    i10 = aVar.hashCode();
                }
                return hashCode + i10;
            }

            public String toString() {
                c cVar = this.f96137a;
                String str = this.f96138b;
                String str2 = this.f96139c;
                C2131a aVar = this.f96140d;
                return "BottomSheetContent(image=" + cVar + ", title=" + str + ", body=" + str2 + ", button=" + aVar + ")";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                c cVar = this.f96137a;
                if (cVar == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    cVar.writeToParcel(parcel, i10);
                }
                parcel.writeString(this.f96138b);
                parcel.writeString(this.f96139c);
                C2131a aVar = this.f96140d;
                if (aVar == null) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(1);
                aVar.writeToParcel(parcel, i10);
            }

            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/ingka/ikea/informationmessage/InformationMessageNavigation$Data$a$a;", "Landroid/os/Parcelable;", "", "buttonText", "", "buttonIconRes", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "Landroid/os/Parcel;", "dest", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "informationmessage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingka.ikea.informationmessage.InformationMessageNavigation$Data$a$a  reason: collision with other inner class name */
            public static final class C2131a implements Parcelable {
                public static final Parcelable.Creator<C2131a> CREATOR = new C2132a();

                /* renamed from: a  reason: collision with root package name */
                private final String f96141a;

                /* renamed from: b  reason: collision with root package name */
                private final Integer f96142b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.ingka.ikea.informationmessage.InformationMessageNavigation$Data$a$a$a  reason: collision with other inner class name */
                public static final class C2132a implements Parcelable.Creator<C2131a> {
                    /* renamed from: a */
                    public final C2131a createFromParcel(Parcel parcel) {
                        C17542s.j(parcel, "parcel");
                        return new C2131a(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                    }

                    /* renamed from: b */
                    public final C2131a[] newArray(int i10) {
                        return new C2131a[i10];
                    }
                }

                public C2131a(String str, Integer num) {
                    C17542s.j(str, "buttonText");
                    this.f96141a = str;
                    this.f96142b = num;
                }

                public final Integer a() {
                    return this.f96142b;
                }

                public final String b() {
                    return this.f96141a;
                }

                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C2131a)) {
                        return false;
                    }
                    C2131a aVar = (C2131a) obj;
                    return C17542s.e(this.f96141a, aVar.f96141a) && C17542s.e(this.f96142b, aVar.f96142b);
                }

                public int hashCode() {
                    int hashCode = this.f96141a.hashCode() * 31;
                    Integer num = this.f96142b;
                    return hashCode + (num == null ? 0 : num.hashCode());
                }

                public String toString() {
                    String str = this.f96141a;
                    Integer num = this.f96142b;
                    return "ButtonContent(buttonText=" + str + ", buttonIconRes=" + num + ")";
                }

                public final void writeToParcel(Parcel parcel, int i10) {
                    int intValue;
                    C17542s.j(parcel, "dest");
                    parcel.writeString(this.f96141a);
                    Integer num = this.f96142b;
                    if (num == null) {
                        intValue = 0;
                    } else {
                        parcel.writeInt(1);
                        intValue = num.intValue();
                    }
                    parcel.writeInt(intValue);
                }

                /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                public /* synthetic */ C2131a(String str, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, (i10 & 2) != 0 ? null : num);
                }
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ a(c cVar, String str, String str2, C2131a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : cVar, str, str2, aVar);
            }
        }
    }

    void a(C8951o oVar, Data.b bVar);

    void b(FragmentManager fragmentManager, String str, Data.a aVar);
}
