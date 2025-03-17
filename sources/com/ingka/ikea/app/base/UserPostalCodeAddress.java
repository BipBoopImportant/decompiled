package com.ingka.ikea.app.base;

import HJ.C15854t;
import YH.C16877v;
import YH.X;
import android.os.Parcel;
import android.os.Parcelable;
import com.sugarcube.core.logger.DslKt;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import sf.C10242c;
import tI.C17978n;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\b\b\b\u0018\u0000 )2\u00020\u0001:\u0002*\u001cB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0015R+\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"R+\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8\u0006¢\u0006\u0012\n\u0004\b\u001e\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b\u001f\u0010%¨\u0006+"}, d2 = {"Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "Landroid/os/Parcelable;", "", "postalCode", "areaCode", "Ljava/util/ArrayList;", "Lcom/ingka/ikea/app/base/UserPostalCodeAddress$AdditionalValue;", "Lkotlin/collections/ArrayList;", "additionalValues", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "", "Ljava/util/Map;", "()Ljava/util/Map;", "getAdditionalValuesAsMap$annotations", "()V", "additionalValuesAsMap", "e", "AdditionalValue", "userdataservice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UserPostalCodeAddress implements Parcelable {
    public static final Parcelable.Creator<UserPostalCodeAddress> CREATOR = new b();

    /* renamed from: e  reason: collision with root package name */
    public static final a f70222e = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f70223a;

    /* renamed from: b  reason: collision with root package name */
    private final String f70224b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<AdditionalValue> f70225c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, String> f70226d;

    @p
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 )2\u00020\u0001:\u0002*#B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010\u001cR \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010$\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u001c¨\u0006+"}, d2 = {"Lcom/ingka/ikea/app/base/UserPostalCodeAddress$AdditionalValue;", "Landroid/os/Parcelable;", "", "key", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/app/base/UserPostalCodeAddress$AdditionalValue;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getKey$annotations", "()V", "b", "getValue$annotations", "Companion", "$serializer", "userdataservice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AdditionalValue implements Parcelable {
        public static final Parcelable.Creator<AdditionalValue> CREATOR = new b();
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f70227a;

        /* renamed from: b  reason: collision with root package name */
        private final String f70228b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/base/UserPostalCodeAddress$AdditionalValue$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/base/UserPostalCodeAddress$AdditionalValue;", "serializer", "()Lkotlinx/serialization/KSerializer;", "userdataservice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<AdditionalValue> serializer() {
                return UserPostalCodeAddress$AdditionalValue$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<AdditionalValue> {
            /* renamed from: a */
            public final AdditionalValue createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new AdditionalValue(parcel.readString(), parcel.readString());
            }

            /* renamed from: b */
            public final AdditionalValue[] newArray(int i10) {
                return new AdditionalValue[i10];
            }
        }

        public /* synthetic */ AdditionalValue(int i10, String str, String str2, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, UserPostalCodeAddress$AdditionalValue$$serializer.INSTANCE.getDescriptor());
            }
            this.f70227a = str;
            this.f70228b = str2;
        }

        public static final /* synthetic */ void c(AdditionalValue additionalValue, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.y(serialDescriptor, 0, additionalValue.f70227a);
            dVar.y(serialDescriptor, 1, additionalValue.f70228b);
        }

        public final String a() {
            return this.f70227a;
        }

        public final String b() {
            return this.f70228b;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdditionalValue)) {
                return false;
            }
            AdditionalValue additionalValue = (AdditionalValue) obj;
            return C17542s.e(this.f70227a, additionalValue.f70227a) && C17542s.e(this.f70228b, additionalValue.f70228b);
        }

        public int hashCode() {
            return (this.f70227a.hashCode() * 31) + this.f70228b.hashCode();
        }

        public String toString() {
            String str = this.f70227a;
            String str2 = this.f70228b;
            return "AdditionalValue(key=" + str + ", value=" + str2 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f70227a);
            parcel.writeString(this.f70228b);
        }

        public AdditionalValue(String str, String str2) {
            C17542s.j(str, "key");
            C17542s.j(str2, "value");
            this.f70227a = str;
            this.f70228b = str2;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/ingka/ikea/app/base/UserPostalCodeAddress$a;", "", "<init>", "()V", "Ljava/util/regex/Pattern;", "postalCodePattern", "", "postCode", "", "a", "(Ljava/util/regex/Pattern;Ljava/lang/CharSequence;)Z", "Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "postalCodeAddress", "Lsf/c;", "appUserDataRepository", "b", "(Lcom/ingka/ikea/app/base/UserPostalCodeAddress;Lsf/c;Ljava/util/regex/Pattern;)Z", "userdataservice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean a(Pattern pattern, CharSequence charSequence) {
            if (pattern == null) {
                return true;
            }
            return pattern.matcher(charSequence).matches();
        }

        public final boolean b(UserPostalCodeAddress userPostalCodeAddress, C10242c cVar, Pattern pattern) {
            String str;
            char c10;
            Class<a> cls;
            UserPostalCodeAddress userPostalCodeAddress2 = userPostalCodeAddress;
            C10242c cVar2 = cVar;
            C17542s.j(userPostalCodeAddress2, "postalCodeAddress");
            C17542s.j(cVar2, "appUserDataRepository");
            e eVar = e.DEBUG;
            ArrayList arrayList = new ArrayList();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            Iterator it = arrayList.iterator();
            String str2 = null;
            String str3 = null;
            while (true) {
                boolean hasNext = it.hasNext();
                str = DslKt.INDICATOR_BACKGROUND;
                c10 = '$';
                cls = a.class;
                if (!hasNext) {
                    break;
                }
                C11819b bVar = (C11819b) it.next();
                if (str2 == null) {
                    String a10 = C11818a.a("Save postal code: " + userPostalCodeAddress2, (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                        str = DslKt.INDICATOR_MAIN;
                    }
                    str3 = str + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, (Throwable) null, str4);
                str2 = str4;
                str3 = str5;
            }
            if (!a(pattern, userPostalCodeAddress.d())) {
                e eVar2 = e.WARN;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next2 : d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar2, false)) {
                        arrayList2.add(next2);
                    }
                }
                String str6 = null;
                String str7 = null;
                for (C11819b bVar2 : arrayList2) {
                    if (str6 == null) {
                        String a11 = C11818a.a("Trying to save an invalid postal code", (Throwable) null);
                        if (a11 == null) {
                            return false;
                        }
                        str6 = C11820c.a(a11);
                    }
                    if (str7 == null) {
                        String name2 = cls.getName();
                        C17542s.g(name2);
                        String o13 = C15854t.o1(C15854t.s1(name2, c10, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o13.length() != 0) {
                            name2 = C15854t.P0(o13, "Kt");
                        }
                        str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                    }
                    bVar2.a(eVar2, str7, false, (Throwable) null, str6);
                    c10 = '$';
                }
                return false;
            }
            cVar2.j(userPostalCodeAddress2);
            return true;
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<UserPostalCodeAddress> {
        /* renamed from: a */
        public final UserPostalCodeAddress createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            C17542s.j(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i10 = 0; i10 != readInt; i10++) {
                    arrayList2.add(AdditionalValue.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new UserPostalCodeAddress(readString, readString2, arrayList);
        }

        /* renamed from: b */
        public final UserPostalCodeAddress[] newArray(int i10) {
            return new UserPostalCodeAddress[i10];
        }
    }

    public UserPostalCodeAddress(String str, String str2, ArrayList<AdditionalValue> arrayList) {
        LinkedHashMap linkedHashMap;
        C17542s.j(str, "postalCode");
        this.f70223a = str;
        this.f70224b = str2;
        this.f70225c = arrayList;
        if (arrayList != null) {
            linkedHashMap = new LinkedHashMap(C17978n.e(X.e(C16877v.y(arrayList, 10)), 16));
            for (AdditionalValue additionalValue : arrayList) {
                linkedHashMap.put(additionalValue.a(), additionalValue.b());
            }
        } else {
            linkedHashMap = null;
        }
        this.f70226d = linkedHashMap;
    }

    public final ArrayList<AdditionalValue> a() {
        return this.f70225c;
    }

    public final Map<String, String> b() {
        return this.f70226d;
    }

    public final String c() {
        return this.f70224b;
    }

    public final String d() {
        return this.f70223a;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserPostalCodeAddress)) {
            return false;
        }
        UserPostalCodeAddress userPostalCodeAddress = (UserPostalCodeAddress) obj;
        return C17542s.e(this.f70223a, userPostalCodeAddress.f70223a) && C17542s.e(this.f70224b, userPostalCodeAddress.f70224b) && C17542s.e(this.f70225c, userPostalCodeAddress.f70225c);
    }

    public int hashCode() {
        int hashCode = this.f70223a.hashCode() * 31;
        String str = this.f70224b;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ArrayList<AdditionalValue> arrayList = this.f70225c;
        if (arrayList != null) {
            i10 = arrayList.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.f70223a;
        String str2 = this.f70224b;
        ArrayList<AdditionalValue> arrayList = this.f70225c;
        return "UserPostalCodeAddress(postalCode=" + str + ", areaCode=" + str2 + ", additionalValues=" + arrayList + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f70223a);
        parcel.writeString(this.f70224b);
        ArrayList<AdditionalValue> arrayList = this.f70225c;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList.size());
        Iterator<AdditionalValue> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i10);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserPostalCodeAddress(String str, String str2, ArrayList arrayList, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : arrayList);
    }
}
