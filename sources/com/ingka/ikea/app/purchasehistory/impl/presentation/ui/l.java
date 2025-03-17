package com.ingka.ikea.app.purchasehistory.impl.presentation.ui;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/ingka/ikea/app/purchasehistory/impl/presentation/ui/l;", "Landroid/os/Parcelable;", "<init>", "()V", "d", "a", "c", "b", "Lcom/ingka/ikea/app/purchasehistory/impl/presentation/ui/l$a;", "Lcom/ingka/ikea/app/purchasehistory/impl/presentation/ui/l$b;", "Lcom/ingka/ikea/app/purchasehistory/impl/presentation/ui/l$c;", "Lcom/ingka/ikea/app/purchasehistory/impl/presentation/ui/l$d;", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class l implements Parcelable {

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ingka/ikea/app/purchasehistory/impl/presentation/ui/l$a;", "Lcom/ingka/ikea/app/purchasehistory/impl/presentation/ui/l;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends l {
        public static final Parcelable.Creator<a> CREATOR = new C1987a();

        /* renamed from: a  reason: collision with root package name */
        public static final a f90953a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final int f90954b = 8;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.app.purchasehistory.impl.presentation.ui.l$a$a  reason: collision with other inner class name */
        public static final class C1987a implements Parcelable.Creator<a> {
            /* renamed from: a */
            public final a createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                parcel.readInt();
                return a.f90953a;
            }

            /* renamed from: b */
            public final a[] newArray(int i10) {
                return new a[i10];
            }
        }

        private a() {
            super((DefaultConstructorMarker) null);
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 1711836046;
        }

        public String toString() {
            return "ErrorFetchTimeWindows";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ingka/ikea/app/purchasehistory/impl/presentation/ui/l$b;", "Lcom/ingka/ikea/app/purchasehistory/impl/presentation/ui/l;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends l {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public static final b f90955a = new b();

        /* renamed from: b  reason: collision with root package name */
        public static final int f90956b = 8;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            /* renamed from: a */
            public final b createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                parcel.readInt();
                return b.f90955a;
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

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -202207303;
        }

        public String toString() {
            return "ErrorSelectTimeSlot";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ingka/ikea/app/purchasehistory/impl/presentation/ui/l$c;", "Lcom/ingka/ikea/app/purchasehistory/impl/presentation/ui/l;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends l {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public static final c f90957a = new c();

        /* renamed from: b  reason: collision with root package name */
        public static final int f90958b = 8;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<c> {
            /* renamed from: a */
            public final c createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                parcel.readInt();
                return c.f90957a;
            }

            /* renamed from: b */
            public final c[] newArray(int i10) {
                return new c[i10];
            }
        }

        private c() {
            super((DefaultConstructorMarker) null);
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 1746152330;
        }

        public String toString() {
            return "NoTimeWindowsAvailable";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ingka/ikea/app/purchasehistory/impl/presentation/ui/l$d;", "Lcom/ingka/ikea/app/purchasehistory/impl/presentation/ui/l;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends l {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public static final d f90959a = new d();

        /* renamed from: b  reason: collision with root package name */
        public static final int f90960b = 8;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<d> {
            /* renamed from: a */
            public final d createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                parcel.readInt();
                return d.f90959a;
            }

            /* renamed from: b */
            public final d[] newArray(int i10) {
                return new d[i10];
            }
        }

        private d() {
            super((DefaultConstructorMarker) null);
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return -663188900;
        }

        public String toString() {
            return "TimeSlotSelected";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private l() {
    }
}
