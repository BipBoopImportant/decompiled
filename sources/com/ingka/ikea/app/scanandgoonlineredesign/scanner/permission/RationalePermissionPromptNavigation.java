package com.ingka.ikea.app.scanandgoonlineredesign.scanner.permission;

import XH.C16807N;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C5221y;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0001\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/RationalePermissionPromptNavigation;", "", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "LXH/N;", "b", "(Landroidx/fragment/app/FragmentManager;)V", "Landroidx/lifecycle/y;", "lifecycleOwner", "Lkotlin/Function1;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/RationalePermissionPromptNavigation$Result;", "onResult", "a", "(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/y;LnI/l;)V", "Result", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface RationalePermissionPromptNavigation {

    @Keep
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/RationalePermissionPromptNavigation$Result;", "Landroid/os/Parcelable;", "c", "b", "d", "a", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/RationalePermissionPromptNavigation$Result$a;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/RationalePermissionPromptNavigation$Result$b;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/RationalePermissionPromptNavigation$Result$c;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/RationalePermissionPromptNavigation$Result$d;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Result extends Parcelable {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/RationalePermissionPromptNavigation$Result$a;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/RationalePermissionPromptNavigation$Result;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Result, Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C2031a();

            /* renamed from: a  reason: collision with root package name */
            public static final a f92050a = new a();

            /* renamed from: b  reason: collision with root package name */
            public static final int f92051b = 8;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.scanner.permission.RationalePermissionPromptNavigation$Result$a$a  reason: collision with other inner class name */
            public static final class C2031a implements Parcelable.Creator<a> {
                /* renamed from: a */
                public final a createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    parcel.readInt();
                    return a.f92050a;
                }

                /* renamed from: b */
                public final a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            private a() {
            }

            public final int describeContents() {
                return 0;
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/RationalePermissionPromptNavigation$Result$b;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/RationalePermissionPromptNavigation$Result;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements Result, Parcelable {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: a  reason: collision with root package name */
            public static final b f92052a = new b();

            /* renamed from: b  reason: collision with root package name */
            public static final int f92053b = 8;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<b> {
                /* renamed from: a */
                public final b createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    parcel.readInt();
                    return b.f92052a;
                }

                /* renamed from: b */
                public final b[] newArray(int i10) {
                    return new b[i10];
                }
            }

            private b() {
            }

            public final int describeContents() {
                return 0;
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/RationalePermissionPromptNavigation$Result$c;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/RationalePermissionPromptNavigation$Result;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements Result, Parcelable {
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* renamed from: a  reason: collision with root package name */
            public static final c f92054a = new c();

            /* renamed from: b  reason: collision with root package name */
            public static final int f92055b = 8;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<c> {
                /* renamed from: a */
                public final c createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    parcel.readInt();
                    return c.f92054a;
                }

                /* renamed from: b */
                public final c[] newArray(int i10) {
                    return new c[i10];
                }
            }

            private c() {
            }

            public final int describeContents() {
                return 0;
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/RationalePermissionPromptNavigation$Result$d;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/RationalePermissionPromptNavigation$Result;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d implements Result, Parcelable {
            public static final Parcelable.Creator<d> CREATOR = new a();

            /* renamed from: a  reason: collision with root package name */
            public static final d f92056a = new d();

            /* renamed from: b  reason: collision with root package name */
            public static final int f92057b = 8;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<d> {
                /* renamed from: a */
                public final d createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    parcel.readInt();
                    return d.f92056a;
                }

                /* renamed from: b */
                public final d[] newArray(int i10) {
                    return new d[i10];
                }
            }

            private d() {
            }

            public final int describeContents() {
                return 0;
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeInt(1);
            }
        }
    }

    void a(FragmentManager fragmentManager, C5221y yVar, C17642l<? super Result, C16807N> lVar);

    void b(FragmentManager fragmentManager);
}
