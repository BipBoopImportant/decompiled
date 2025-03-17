package com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/bottomsheet/a;", "Landroid/os/Parcelable;", "<init>", "()V", "a", "b", "c", "Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/bottomsheet/a$a;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/bottomsheet/a$b;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/bottomsheet/a$c;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a implements Parcelable {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/bottomsheet/a$a;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/bottomsheet/a;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.a$a  reason: collision with other inner class name */
    public static final class C2000a extends a {
        public static final Parcelable.Creator<C2000a> CREATOR = new C2001a();

        /* renamed from: a  reason: collision with root package name */
        public static final C2000a f91360a = new C2000a();

        /* renamed from: b  reason: collision with root package name */
        public static final int f91361b = 8;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.a$a$a  reason: collision with other inner class name */
        public static final class C2001a implements Parcelable.Creator<C2000a> {
            /* renamed from: a */
            public final C2000a createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                parcel.readInt();
                return C2000a.f91360a;
            }

            /* renamed from: b */
            public final C2000a[] newArray(int i10) {
                return new C2000a[i10];
            }
        }

        private C2000a() {
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/bottomsheet/a$b;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/bottomsheet/a;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends a {
        public static final Parcelable.Creator<b> CREATOR = new C2002a();

        /* renamed from: a  reason: collision with root package name */
        public static final b f91362a = new b();

        /* renamed from: b  reason: collision with root package name */
        public static final int f91363b = 8;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.a$b$a  reason: collision with other inner class name */
        public static final class C2002a implements Parcelable.Creator<b> {
            /* renamed from: a */
            public final b createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                parcel.readInt();
                return b.f91362a;
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/bottomsheet/a$c;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/bottomsheet/a;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends a {
        public static final Parcelable.Creator<c> CREATOR = new C2003a();

        /* renamed from: a  reason: collision with root package name */
        public static final c f91364a = new c();

        /* renamed from: b  reason: collision with root package name */
        public static final int f91365b = 8;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.a$c$a  reason: collision with other inner class name */
        public static final class C2003a implements Parcelable.Creator<c> {
            /* renamed from: a */
            public final c createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                parcel.readInt();
                return c.f91364a;
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
