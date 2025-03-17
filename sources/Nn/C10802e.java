package Nn;

import android.os.Parcel;
import android.os.Parcelable;
import fI.C17221b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LNn/e;", "Ljava/io/IOException;", "<init>", "()V", "c", "b", "a", "d", "e", "LNn/e$a;", "LNn/e$b;", "LNn/e$c;", "LNn/e$d;", "LNn/e$e;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Nn.e  reason: case insensitive filesystem */
public abstract class C10802e extends IOException {

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001bB\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u0014¨\u0006 "}, d2 = {"LNn/e$a;", "LNn/e;", "Landroid/os/Parcelable;", "", "LNn/e$a$a;", "areas", "", "zipCode", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Nn.e$a */
    public static final class a extends C10802e implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: a  reason: collision with root package name */
        private final List<C1699a> f84037a;

        /* renamed from: b  reason: collision with root package name */
        private final String f84038b;

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0018\u0010\u0011¨\u0006\u001b"}, d2 = {"LNn/e$a$a;", "Landroid/os/Parcelable;", "", "name", "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Nn.e$a$a  reason: collision with other inner class name */
        public static final class C1699a implements Parcelable {
            public static final Parcelable.Creator<C1699a> CREATOR = new C1700a();

            /* renamed from: a  reason: collision with root package name */
            private final String f84039a;

            /* renamed from: b  reason: collision with root package name */
            private final String f84040b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Nn.e$a$a$a  reason: collision with other inner class name */
            public static final class C1700a implements Parcelable.Creator<C1699a> {
                /* renamed from: a */
                public final C1699a createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    return new C1699a(parcel.readString(), parcel.readString());
                }

                /* renamed from: b */
                public final C1699a[] newArray(int i10) {
                    return new C1699a[i10];
                }
            }

            public C1699a(String str, String str2) {
                C17542s.j(str, "name");
                C17542s.j(str2, "code");
                this.f84039a = str;
                this.f84040b = str2;
            }

            public final String a() {
                return this.f84040b;
            }

            public final String b() {
                return this.f84039a;
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1699a)) {
                    return false;
                }
                C1699a aVar = (C1699a) obj;
                return C17542s.e(this.f84039a, aVar.f84039a) && C17542s.e(this.f84040b, aVar.f84040b);
            }

            public int hashCode() {
                return (this.f84039a.hashCode() * 31) + this.f84040b.hashCode();
            }

            public String toString() {
                String str = this.f84039a;
                String str2 = this.f84040b;
                return "Area(name=" + str + ", code=" + str2 + ")";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeString(this.f84039a);
                parcel.writeString(this.f84040b);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Nn.e$a$b */
        public static final class b implements Parcelable.Creator<a> {
            /* renamed from: a */
            public final a createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i10 = 0; i10 != readInt; i10++) {
                    arrayList.add(C1699a.CREATOR.createFromParcel(parcel));
                }
                return new a(arrayList, parcel.readString());
            }

            /* renamed from: b */
            public final a[] newArray(int i10) {
                return new a[i10];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(List<C1699a> list, String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(list, "areas");
            C17542s.j(str, "zipCode");
            this.f84037a = list;
            this.f84038b = str;
        }

        public final List<C1699a> a() {
            return this.f84037a;
        }

        public final String b() {
            return this.f84038b;
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
            return C17542s.e(this.f84037a, aVar.f84037a) && C17542s.e(this.f84038b, aVar.f84038b);
        }

        public int hashCode() {
            return (this.f84037a.hashCode() * 31) + this.f84038b.hashCode();
        }

        public String toString() {
            List<C1699a> list = this.f84037a;
            String str = this.f84038b;
            return "CheckoutAmbiguousDeliveryAreaError(areas=" + list + ", zipCode=" + str + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            List<C1699a> list = this.f84037a;
            parcel.writeInt(list.size());
            for (C1699a writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i10);
            }
            parcel.writeString(this.f84038b);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LNn/e$b;", "LNn/e;", "<init>", "()V", "c", "a", "b", "LNn/e$b$a;", "LNn/e$b$b;", "LNn/e$b$c;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Nn.e$b */
    public static abstract class b extends C10802e {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LNn/e$b$a;", "LNn/e$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Nn.e$b$a */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f84041a = new a();

            private a() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -784122858;
            }

            public String toString() {
                return "CheckoutExpired";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LNn/e$b$b;", "LNn/e$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Nn.e$b$b  reason: collision with other inner class name */
        public static final class C1701b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C1701b f84042a = new C1701b();

            private C1701b() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1701b);
            }

            public int hashCode() {
                return -881019410;
            }

            public String toString() {
                return "Generic";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LNn/e$b$c;", "LNn/e$b;", "", "", "errors", "<init>", "(Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Nn.e$b$c */
        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            private final List<String> f84043a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(List<String> list) {
                super((DefaultConstructorMarker) null);
                C17542s.j(list, "errors");
                this.f84043a = list;
            }

            public final List<String> a() {
                return this.f84043a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && C17542s.e(this.f84043a, ((c) obj).f84043a);
            }

            public int hashCode() {
                return this.f84043a.hashCode();
            }

            public String toString() {
                List<String> list = this.f84043a;
                return "ValidationError(errors=" + list + ")";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LNn/e$c;", "LNn/e;", "<init>", "()V", "a", "b", "LNn/e$c$a;", "LNn/e$c$b;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Nn.e$c */
    public static abstract class c extends C10802e {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNn/e$c$a;", "LNn/e$c;", "<init>", "()V", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Nn.e$c$a */
        public static final class a extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final a f84044a = new a();

            private a() {
                super((DefaultConstructorMarker) null);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"LNn/e$c$b;", "LNn/e$c;", "", "customErrorText", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCustomErrorText", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Nn.e$c$b */
        public static final class b extends c {

            /* renamed from: a  reason: collision with root package name */
            private final String f84045a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "customErrorText");
                this.f84045a = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && C17542s.e(this.f84045a, ((b) obj).f84045a);
            }

            public int hashCode() {
                return this.f84045a.hashCode();
            }

            public String toString() {
                String str = this.f84045a;
                return "GenericFatalException(customErrorText=" + str + ")";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNn/e$d;", "LNn/e;", "<init>", "()V", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Nn.e$d */
    public static final class d extends C10802e {

        /* renamed from: a  reason: collision with root package name */
        public static final d f84046a = new d();

        private d() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LNn/e$e;", "LNn/e;", "LNn/e$e$a;", "reason", "<init>", "(LNn/e$e$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LNn/e$e$a;", "()LNn/e$e$a;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Nn.e$e  reason: collision with other inner class name */
    public static final class C1702e extends C10802e {

        /* renamed from: a  reason: collision with root package name */
        private final a f84047a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LNn/e$e$a;", "", "<init>", "(Ljava/lang/String;I)V", "UNABLE_TO_DELIVER", "INVALID_ZIP_CODE", "UNKNOWN", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Nn.e$e$a */
        public enum a {
            UNABLE_TO_DELIVER,
            INVALID_ZIP_CODE,
            UNKNOWN;

            static {
                a[] a10;
                $ENTRIES = C17221b.a(a10);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1702e(a aVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(aVar, "reason");
            this.f84047a = aVar;
        }

        public final a a() {
            return this.f84047a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1702e) && this.f84047a == ((C1702e) obj).f84047a;
        }

        public int hashCode() {
            return this.f84047a.hashCode();
        }

        public String toString() {
            a aVar = this.f84047a;
            return "ZipInException(reason=" + aVar + ")";
        }
    }

    public /* synthetic */ C10802e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C10802e() {
    }
}
