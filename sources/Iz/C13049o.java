package Iz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rz.C15031y;
import x4.C8951o;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\tJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LIz/o;", "", "Lx4/o;", "navController", "", "format", "", "rawValue", "LXH/N;", "a", "(Lx4/o;ILjava/lang/String;)V", "barcode", "b", "(Lx4/o;Ljava/lang/String;)V", "scanandgo-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Iz.o  reason: case insensitive filesystem */
public interface C13049o {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"LIz/o$a;", "Landroid/os/Parcelable;", "<init>", "()V", "a", "c", "b", "f", "e", "d", "LIz/o$a$a;", "LIz/o$a$b;", "LIz/o$a$c;", "LIz/o$a$e;", "LIz/o$a$f;", "scanandgo-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Iz.o$a */
    public static abstract class a implements Parcelable {

        /* renamed from: a  reason: collision with root package name */
        public static final d f111059a = new d((DefaultConstructorMarker) null);

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b\u001b\u0010\u0012¨\u0006%"}, d2 = {"LIz/o$a$a;", "LIz/o$a;", "", "barcode", "Lrz/y;", "type", "", "packageCount", "mustHavesCount", "<init>", "(Ljava/lang/String;Lrz/y;II)V", "Landroid/os/Parcel;", "dest", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "c", "Lrz/y;", "getType", "()Lrz/y;", "d", "I", "e", "scanandgo-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Iz.o$a$a  reason: collision with other inner class name */
        public static final class C2686a extends a {
            public static final Parcelable.Creator<C2686a> CREATOR = new C2687a();

            /* renamed from: b  reason: collision with root package name */
            private final String f111060b;

            /* renamed from: c  reason: collision with root package name */
            private final C15031y f111061c;

            /* renamed from: d  reason: collision with root package name */
            private final int f111062d;

            /* renamed from: e  reason: collision with root package name */
            private final int f111063e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Iz.o$a$a$a  reason: collision with other inner class name */
            public static final class C2687a implements Parcelable.Creator<C2686a> {
                /* renamed from: a */
                public final C2686a createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    return new C2686a(parcel.readString(), C15031y.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt());
                }

                /* renamed from: b */
                public final C2686a[] newArray(int i10) {
                    return new C2686a[i10];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2686a(String str, C15031y yVar, int i10, int i11) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "barcode");
                C17542s.j(yVar, "type");
                this.f111060b = str;
                this.f111061c = yVar;
                this.f111062d = i10;
                this.f111063e = i11;
            }

            public final String a() {
                return this.f111060b;
            }

            public final int b() {
                return this.f111063e;
            }

            public final int c() {
                return this.f111062d;
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2686a)) {
                    return false;
                }
                C2686a aVar = (C2686a) obj;
                return C17542s.e(this.f111060b, aVar.f111060b) && this.f111061c == aVar.f111061c && this.f111062d == aVar.f111062d && this.f111063e == aVar.f111063e;
            }

            public int hashCode() {
                return (((((this.f111060b.hashCode() * 31) + this.f111061c.hashCode()) * 31) + Integer.hashCode(this.f111062d)) * 31) + Integer.hashCode(this.f111063e);
            }

            public String toString() {
                String str = this.f111060b;
                C15031y yVar = this.f111061c;
                int i10 = this.f111062d;
                int i11 = this.f111063e;
                return "Added(barcode=" + str + ", type=" + yVar + ", packageCount=" + i10 + ", mustHavesCount=" + i11 + ")";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeString(this.f111060b);
                parcel.writeString(this.f111061c.name());
                parcel.writeInt(this.f111062d);
                parcel.writeInt(this.f111063e);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LIz/o$a$b;", "LIz/o$a;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "scanandgo-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Iz.o$a$b */
        public static final class b extends a {
            public static final Parcelable.Creator<b> CREATOR = new C2688a();

            /* renamed from: b  reason: collision with root package name */
            public static final b f111064b = new b();

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Iz.o$a$b$a  reason: collision with other inner class name */
            public static final class C2688a implements Parcelable.Creator<b> {
                /* renamed from: a */
                public final b createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    parcel.readInt();
                    return b.f111064b;
                }

                /* renamed from: b */
                public final b[] newArray(int i10) {
                    return new b[i10];
                }
            }

            private b() {
                super((DefaultConstructorMarker) null);
            }

            public final int describeContents() {
                return 0;
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u000f¨\u0006\u001d"}, d2 = {"LIz/o$a$c;", "LIz/o$a;", "", "productName", "", "quantity", "<init>", "(Ljava/lang/String;I)V", "Landroid/os/Parcel;", "dest", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "c", "I", "scanandgo-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Iz.o$a$c */
        public static final class c extends a {
            public static final Parcelable.Creator<c> CREATOR = new C2689a();

            /* renamed from: b  reason: collision with root package name */
            private final String f111065b;

            /* renamed from: c  reason: collision with root package name */
            private final int f111066c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Iz.o$a$c$a  reason: collision with other inner class name */
            public static final class C2689a implements Parcelable.Creator<c> {
                /* renamed from: a */
                public final c createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    return new c(parcel.readString(), parcel.readInt());
                }

                /* renamed from: b */
                public final c[] newArray(int i10) {
                    return new c[i10];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(String str, int i10) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "productName");
                this.f111065b = str;
                this.f111066c = i10;
            }

            public final String a() {
                return this.f111065b;
            }

            public final int b() {
                return this.f111066c;
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
                return C17542s.e(this.f111065b, cVar.f111065b) && this.f111066c == cVar.f111066c;
            }

            public int hashCode() {
                return (this.f111065b.hashCode() * 31) + Integer.hashCode(this.f111066c);
            }

            public String toString() {
                String str = this.f111065b;
                int i10 = this.f111066c;
                return "Collected(productName=" + str + ", quantity=" + i10 + ")";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeString(this.f111065b);
                parcel.writeInt(this.f111066c);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LIz/o$a$d;", "", "<init>", "()V", "", "REQUEST_KEY", "Ljava/lang/String;", "scanandgo-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Iz.o$a$d */
        public static final class d {
            public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private d() {
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, d2 = {"LIz/o$a$e;", "LIz/o$a;", "", "itemNo", "", "manualEntry", "<init>", "(Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "c", "Z", "()Z", "scanandgo-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Iz.o$a$e */
        public static final class e extends a {
            public static final Parcelable.Creator<e> CREATOR = new C2690a();

            /* renamed from: b  reason: collision with root package name */
            private final String f111067b;

            /* renamed from: c  reason: collision with root package name */
            private final boolean f111068c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Iz.o$a$e$a  reason: collision with other inner class name */
            public static final class C2690a implements Parcelable.Creator<e> {
                /* renamed from: a */
                public final e createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    return new e(parcel.readString(), parcel.readInt() != 0);
                }

                /* renamed from: b */
                public final e[] newArray(int i10) {
                    return new e[i10];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public e(String str, boolean z10) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "itemNo");
                this.f111067b = str;
                this.f111068c = z10;
            }

            public final String a() {
                return this.f111067b;
            }

            public final boolean b() {
                return this.f111068c;
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return C17542s.e(this.f111067b, eVar.f111067b) && this.f111068c == eVar.f111068c;
            }

            public int hashCode() {
                return (this.f111067b.hashCode() * 31) + Boolean.hashCode(this.f111068c);
            }

            public String toString() {
                String str = this.f111067b;
                boolean z10 = this.f111068c;
                return "ProductNotFound(itemNo=" + str + ", manualEntry=" + z10 + ")";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeString(this.f111067b);
                parcel.writeInt(this.f111068c ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LIz/o$a$f;", "LIz/o$a;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "scanandgo-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Iz.o$a$f */
        public static final class f extends a {
            public static final Parcelable.Creator<f> CREATOR = new C2691a();

            /* renamed from: b  reason: collision with root package name */
            public static final f f111069b = new f();

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Iz.o$a$f$a  reason: collision with other inner class name */
            public static final class C2691a implements Parcelable.Creator<f> {
                /* renamed from: a */
                public final f createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    parcel.readInt();
                    return f.f111069b;
                }

                /* renamed from: b */
                public final f[] newArray(int i10) {
                    return new f[i10];
                }
            }

            private f() {
                super((DefaultConstructorMarker) null);
            }

            public final int describeContents() {
                return 0;
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    void a(C8951o oVar, int i10, String str);

    void b(C8951o oVar, String str);
}
