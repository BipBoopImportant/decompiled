package com.ingka.ikea.app.addresspicker.addresslookup.repo;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import fK.p;
import iK.C17395d;
import jK.C17446c0;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001:\u0001(B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u001e\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JJ\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u0014R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0018¨\u0006)"}, d2 = {"Lcom/ingka/ikea/app/addresspicker/addresslookup/repo/PostalCodeAddress;", "Landroid/os/Parcelable;", "", "postalCode", "addressName", "subAddressName", "", "additionalValues", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/ingka/ikea/app/addresspicker/addresslookup/repo/PostalCodeAddress;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPostalCode", "getAddressName", "getSubAddressName", "Ljava/util/Map;", "getAdditionalValues", "Remote", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Keep
public final class PostalCodeAddress implements Parcelable {
    public static final Parcelable.Creator<PostalCodeAddress> CREATOR = new a();
    private final Map<String, String> additionalValues;
    private final String addressName;
    private final String postalCode;
    private final String subAddressName;

    @p
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0013\b\b\u0018\u0000 /2\u00020\u0001:\u00020!BO\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\"\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\"\u0012\u0004\b)\u0010%\u001a\u0004\b(\u0010\u001aR.\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b.\u0010%\u001a\u0004\b,\u0010-¨\u00061"}, d2 = {"Lcom/ingka/ikea/app/addresspicker/addresslookup/repo/PostalCodeAddress$Remote;", "", "", "seen0", "", "postalCode", "addressName", "subAddressName", "", "additionalValues", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/app/addresspicker/addresslookup/repo/PostalCodeAddress$Remote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/app/addresspicker/addresslookup/repo/PostalCodeAddress;", "b", "()Lcom/ingka/ikea/app/addresspicker/addresslookup/repo/PostalCodeAddress;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPostalCode", "getPostalCode$annotations", "()V", "getAddressName", "getAddressName$annotations", "getSubAddressName", "getSubAddressName$annotations", "d", "Ljava/util/Map;", "getAdditionalValues", "()Ljava/util/Map;", "getAdditionalValues$annotations", "Companion", "$serializer", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Remote {
        public static final a Companion = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public static final KSerializer<Object>[] f69998e;

        /* renamed from: a  reason: collision with root package name */
        private final String f69999a;

        /* renamed from: b  reason: collision with root package name */
        private final String f70000b;

        /* renamed from: c  reason: collision with root package name */
        private final String f70001c;

        /* renamed from: d  reason: collision with root package name */
        private final Map<String, String> f70002d;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/addresspicker/addresslookup/repo/PostalCodeAddress$Remote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/addresspicker/addresslookup/repo/PostalCodeAddress$Remote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<Remote> serializer() {
                return PostalCodeAddress$Remote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            Y0 y02 = Y0.f144077a;
            f69998e = new KSerializer[]{null, null, null, new C17446c0(y02, y02)};
        }

        public /* synthetic */ Remote(int i10, String str, String str2, String str3, Map map, T0 t02) {
            if (15 != (i10 & 15)) {
                E0.b(i10, 15, PostalCodeAddress$Remote$$serializer.INSTANCE.getDescriptor());
            }
            this.f69999a = str;
            this.f70000b = str2;
            this.f70001c = str3;
            this.f70002d = map;
        }

        public static final /* synthetic */ void c(Remote remote, C17395d dVar, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = f69998e;
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, remote.f69999a);
            dVar.B(serialDescriptor, 1, y02, remote.f70000b);
            dVar.B(serialDescriptor, 2, y02, remote.f70001c);
            dVar.B(serialDescriptor, 3, kSerializerArr[3], remote.f70002d);
        }

        public final PostalCodeAddress b() {
            if (this.f69999a == null) {
                return null;
            }
            return new PostalCodeAddress(this.f69999a, this.f70000b, this.f70001c, this.f70002d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Remote)) {
                return false;
            }
            Remote remote = (Remote) obj;
            return C17542s.e(this.f69999a, remote.f69999a) && C17542s.e(this.f70000b, remote.f70000b) && C17542s.e(this.f70001c, remote.f70001c) && C17542s.e(this.f70002d, remote.f70002d);
        }

        public int hashCode() {
            String str = this.f69999a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f70000b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f70001c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Map<String, String> map = this.f70002d;
            if (map != null) {
                i10 = map.hashCode();
            }
            return hashCode3 + i10;
        }

        public String toString() {
            String str = this.f69999a;
            String str2 = this.f70000b;
            String str3 = this.f70001c;
            Map<String, String> map = this.f70002d;
            return "Remote(postalCode=" + str + ", addressName=" + str2 + ", subAddressName=" + str3 + ", additionalValues=" + map + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PostalCodeAddress> {
        /* renamed from: a */
        public final PostalCodeAddress createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            C17542s.j(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                for (int i10 = 0; i10 != readInt; i10++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
                linkedHashMap = linkedHashMap2;
            }
            return new PostalCodeAddress(readString, readString2, readString3, linkedHashMap);
        }

        /* renamed from: b */
        public final PostalCodeAddress[] newArray(int i10) {
            return new PostalCodeAddress[i10];
        }
    }

    public PostalCodeAddress(String str, String str2, String str3, Map<String, String> map) {
        C17542s.j(str, "postalCode");
        this.postalCode = str;
        this.addressName = str2;
        this.subAddressName = str3;
        this.additionalValues = map;
    }

    public static /* synthetic */ PostalCodeAddress copy$default(PostalCodeAddress postalCodeAddress, String str, String str2, String str3, Map<String, String> map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = postalCodeAddress.postalCode;
        }
        if ((i10 & 2) != 0) {
            str2 = postalCodeAddress.addressName;
        }
        if ((i10 & 4) != 0) {
            str3 = postalCodeAddress.subAddressName;
        }
        if ((i10 & 8) != 0) {
            map = postalCodeAddress.additionalValues;
        }
        return postalCodeAddress.copy(str, str2, str3, map);
    }

    public final String component1() {
        return this.postalCode;
    }

    public final String component2() {
        return this.addressName;
    }

    public final String component3() {
        return this.subAddressName;
    }

    public final Map<String, String> component4() {
        return this.additionalValues;
    }

    public final PostalCodeAddress copy(String str, String str2, String str3, Map<String, String> map) {
        C17542s.j(str, "postalCode");
        return new PostalCodeAddress(str, str2, str3, map);
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostalCodeAddress)) {
            return false;
        }
        PostalCodeAddress postalCodeAddress = (PostalCodeAddress) obj;
        return C17542s.e(this.postalCode, postalCodeAddress.postalCode) && C17542s.e(this.addressName, postalCodeAddress.addressName) && C17542s.e(this.subAddressName, postalCodeAddress.subAddressName) && C17542s.e(this.additionalValues, postalCodeAddress.additionalValues);
    }

    public final Map<String, String> getAdditionalValues() {
        return this.additionalValues;
    }

    public final String getAddressName() {
        return this.addressName;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getSubAddressName() {
        return this.subAddressName;
    }

    public int hashCode() {
        int hashCode = this.postalCode.hashCode() * 31;
        String str = this.addressName;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subAddressName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.additionalValues;
        if (map != null) {
            i10 = map.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        String str = this.postalCode;
        String str2 = this.addressName;
        String str3 = this.subAddressName;
        Map<String, String> map = this.additionalValues;
        return "PostalCodeAddress(postalCode=" + str + ", addressName=" + str2 + ", subAddressName=" + str3 + ", additionalValues=" + map + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.postalCode);
        parcel.writeString(this.addressName);
        parcel.writeString(this.subAddressName);
        Map<String, String> map = this.additionalValues;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeString((String) next.getValue());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PostalCodeAddress(String str, String str2, String str3, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i10 & 8) != 0 ? null : map);
    }
}
