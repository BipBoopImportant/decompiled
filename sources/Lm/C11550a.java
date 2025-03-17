package lm;

import IC.C13023e;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\r\u001eJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0004J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0004J2\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H¦@¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0014H&¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Llm/a;", "", "", "d", "()Z", "acknowledged", "LXH/N;", "e", "(Z)V", "g", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "c", "(Landroid/content/Context;)Landroid/content/Intent;", "b", "Llm/a$c;", "fulfilmentOption", "Llm/a$a;", "contactType", "", "itemNo", "itemType", "", "f", "(Llm/a$c;Llm/a$a;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Llm/b;", "backInStockError", "productTitle", "LIC/e;", "a", "(Llm/b;Llm/a$c;Ljava/lang/String;)LIC/e;", "backinstock_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lm.a  reason: case insensitive filesystem */
public interface C11550a {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Llm/a$a;", "", "<init>", "()V", "b", "a", "Llm/a$a$a;", "Llm/a$a$b;", "backinstock_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lm.a$a  reason: collision with other inner class name */
    public static abstract class C2253a {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Llm/a$a$a;", "Llm/a$a;", "", "value", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "backinstock_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: lm.a$a$a  reason: collision with other inner class name */
        public static final class C2254a extends C2253a {

            /* renamed from: a  reason: collision with root package name */
            private final String f99206a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2254a(String str) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "value");
                this.f99206a = str;
            }

            public final String a() {
                return this.f99206a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2254a) && C17542s.e(this.f99206a, ((C2254a) obj).f99206a);
            }

            public int hashCode() {
                return this.f99206a.hashCode();
            }

            public String toString() {
                String str = this.f99206a;
                return "Email(value=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llm/a$a$b;", "Llm/a$a;", "<init>", "()V", "backinstock_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: lm.a$a$b */
        public static final class b extends C2253a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f99207a = new b();

            private b() {
                super((DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ C2253a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2253a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lm.a$b */
    public static final class b {
        public static /* synthetic */ Object a(C11550a aVar, c cVar, C2253a aVar2, String str, String str2, C17164e eVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    aVar2 = C2253a.b.f99207a;
                }
                return aVar.f(cVar, aVar2, str, str2, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribeForNotification");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\t\u0006\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Llm/a$c;", "Landroid/os/Parcelable;", "", "uniqueKey", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "c", "Llm/a$c$a;", "Llm/a$c$b;", "Llm/a$c$c;", "backinstock_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lm.a$c */
    public static abstract class c implements Parcelable {

        /* renamed from: a  reason: collision with root package name */
        private final String f99208a;

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011¨\u0006\u001b"}, d2 = {"Llm/a$c$a;", "Llm/a$c;", "", "storeId", "storeName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "backinstock_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: lm.a$c$a  reason: collision with other inner class name */
        public static final class C2255a extends c {
            public static final Parcelable.Creator<C2255a> CREATOR = new C2256a();

            /* renamed from: b  reason: collision with root package name */
            private final String f99209b;

            /* renamed from: c  reason: collision with root package name */
            private final String f99210c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: lm.a$c$a$a  reason: collision with other inner class name */
            public static final class C2256a implements Parcelable.Creator<C2255a> {
                /* renamed from: a */
                public final C2255a createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    return new C2255a(parcel.readString(), parcel.readString());
                }

                /* renamed from: b */
                public final C2255a[] newArray(int i10) {
                    return new C2255a[i10];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2255a(String str, String str2) {
                super(str, (DefaultConstructorMarker) null);
                C17542s.j(str, "storeId");
                C17542s.j(str2, "storeName");
                this.f99209b = str;
                this.f99210c = str2;
            }

            public final String b() {
                return this.f99209b;
            }

            public final String c() {
                return this.f99210c;
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2255a)) {
                    return false;
                }
                C2255a aVar = (C2255a) obj;
                return C17542s.e(this.f99209b, aVar.f99209b) && C17542s.e(this.f99210c, aVar.f99210c);
            }

            public int hashCode() {
                return (this.f99209b.hashCode() * 31) + this.f99210c.hashCode();
            }

            public String toString() {
                String str = this.f99209b;
                String str2 = this.f99210c;
                return "CashAndCarry(storeId=" + str + ", storeName=" + str2 + ")";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeString(this.f99209b);
                parcel.writeString(this.f99210c);
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011¨\u0006\u001b"}, d2 = {"Llm/a$c$b;", "Llm/a$c;", "", "storeId", "storeName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "backinstock_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: lm.a$c$b */
        public static final class b extends c {
            public static final Parcelable.Creator<b> CREATOR = new C2257a();

            /* renamed from: b  reason: collision with root package name */
            private final String f99211b;

            /* renamed from: c  reason: collision with root package name */
            private final String f99212c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: lm.a$c$b$a  reason: collision with other inner class name */
            public static final class C2257a implements Parcelable.Creator<b> {
                /* renamed from: a */
                public final b createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    return new b(parcel.readString(), parcel.readString());
                }

                /* renamed from: b */
                public final b[] newArray(int i10) {
                    return new b[i10];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(String str, String str2) {
                super(str, (DefaultConstructorMarker) null);
                C17542s.j(str, "storeId");
                C17542s.j(str2, "storeName");
                this.f99211b = str;
                this.f99212c = str2;
            }

            public final String b() {
                return this.f99211b;
            }

            public final String c() {
                return this.f99212c;
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return C17542s.e(this.f99211b, bVar.f99211b) && C17542s.e(this.f99212c, bVar.f99212c);
            }

            public int hashCode() {
                return (this.f99211b.hashCode() * 31) + this.f99212c.hashCode();
            }

            public String toString() {
                String str = this.f99211b;
                String str2 = this.f99212c;
                return "ClickAndCollect(storeId=" + str + ", storeName=" + str2 + ")";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeString(this.f99211b);
                parcel.writeString(this.f99212c);
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0018\u0010\u0011¨\u0006\u001b"}, d2 = {"Llm/a$c$c;", "Llm/a$c;", "", "zipCode", "areaCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "backinstock_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: lm.a$c$c  reason: collision with other inner class name */
        public static final class C2258c extends c {
            public static final Parcelable.Creator<C2258c> CREATOR = new C2259a();

            /* renamed from: b  reason: collision with root package name */
            private final String f99213b;

            /* renamed from: c  reason: collision with root package name */
            private final String f99214c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: lm.a$c$c$a  reason: collision with other inner class name */
            public static final class C2259a implements Parcelable.Creator<C2258c> {
                /* renamed from: a */
                public final C2258c createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    return new C2258c(parcel.readString(), parcel.readString());
                }

                /* renamed from: b */
                public final C2258c[] newArray(int i10) {
                    return new C2258c[i10];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2258c(String str, String str2) {
                super(str, (DefaultConstructorMarker) null);
                C17542s.j(str, "zipCode");
                this.f99213b = str;
                this.f99214c = str2;
            }

            public final String b() {
                return this.f99214c;
            }

            public final String c() {
                return this.f99213b;
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2258c)) {
                    return false;
                }
                C2258c cVar = (C2258c) obj;
                return C17542s.e(this.f99213b, cVar.f99213b) && C17542s.e(this.f99214c, cVar.f99214c);
            }

            public int hashCode() {
                int hashCode = this.f99213b.hashCode() * 31;
                String str = this.f99214c;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                String str = this.f99213b;
                String str2 = this.f99214c;
                return "HomeDelivery(zipCode=" + str + ", areaCode=" + str2 + ")";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeString(this.f99213b);
                parcel.writeString(this.f99214c);
            }
        }

        public /* synthetic */ c(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public final String a() {
            return this.f99208a;
        }

        private c(String str) {
            this.f99208a = str;
        }
    }

    C13023e a(b bVar, c cVar, String str);

    boolean b();

    Intent c(Context context);

    boolean d();

    void e(boolean z10);

    Object f(c cVar, C2253a aVar, String str, String str2, C17164e<? super Integer> eVar);

    boolean g();
}
