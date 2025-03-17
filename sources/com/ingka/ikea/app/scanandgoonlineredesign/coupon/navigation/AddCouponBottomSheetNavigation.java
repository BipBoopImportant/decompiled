package com.ingka.ikea.app.scanandgoonlineredesign.coupon.navigation;

import XH.C16807N;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C5221y;
import gj.C11296g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0001\u0010J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000bH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/navigation/AddCouponBottomSheetNavigation;", "", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Lgj/g;", "scannerCouponResult", "LXH/N;", "a", "(Landroidx/fragment/app/FragmentManager;Lgj/g;)V", "Landroidx/lifecycle/y;", "lifecycleOwner", "Lkotlin/Function1;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/navigation/AddCouponBottomSheetNavigation$NavigationResult;", "onResult", "b", "(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/y;LnI/l;)V", "NavigationResult", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AddCouponBottomSheetNavigation {

    @Keep
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/navigation/AddCouponBottomSheetNavigation$NavigationResult;", "Landroid/os/Parcelable;", "<init>", "()V", "b", "a", "Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/navigation/AddCouponBottomSheetNavigation$NavigationResult$a;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/navigation/AddCouponBottomSheetNavigation$NavigationResult$b;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class NavigationResult implements Parcelable {
        public static final int $stable = 0;

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/navigation/AddCouponBottomSheetNavigation$NavigationResult$a;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/navigation/AddCouponBottomSheetNavigation$NavigationResult;", "", "coupon", "scanType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends NavigationResult {
            public static final Parcelable.Creator<a> CREATOR = new C1994a();

            /* renamed from: c  reason: collision with root package name */
            public static final int f91269c = 8;

            /* renamed from: a  reason: collision with root package name */
            private final String f91270a;

            /* renamed from: b  reason: collision with root package name */
            private final String f91271b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.coupon.navigation.AddCouponBottomSheetNavigation$NavigationResult$a$a  reason: collision with other inner class name */
            public static final class C1994a implements Parcelable.Creator<a> {
                /* renamed from: a */
                public final a createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    return new a(parcel.readString(), parcel.readString());
                }

                /* renamed from: b */
                public final a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(String str, String str2) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "coupon");
                C17542s.j(str2, "scanType");
                this.f91270a = str;
                this.f91271b = str2;
            }

            public final String a() {
                return this.f91270a;
            }

            public final String b() {
                return this.f91271b;
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
                return C17542s.e(this.f91270a, aVar.f91270a) && C17542s.e(this.f91271b, aVar.f91271b);
            }

            public int hashCode() {
                return (this.f91270a.hashCode() * 31) + this.f91271b.hashCode();
            }

            public String toString() {
                String str = this.f91270a;
                String str2 = this.f91271b;
                return "OnCouponApplied(coupon=" + str + ", scanType=" + str2 + ")";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeString(this.f91270a);
                parcel.writeString(this.f91271b);
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/navigation/AddCouponBottomSheetNavigation$NavigationResult$b;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/navigation/AddCouponBottomSheetNavigation$NavigationResult;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends NavigationResult {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: a  reason: collision with root package name */
            public static final b f91272a = new b();

            /* renamed from: b  reason: collision with root package name */
            public static final int f91273b = 8;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<b> {
                /* renamed from: a */
                public final b createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    parcel.readInt();
                    return b.f91272a;
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
                return 890847110;
            }

            public String toString() {
                return "OnDismissed";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ NavigationResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private NavigationResult() {
        }
    }

    void a(FragmentManager fragmentManager, C11296g gVar);

    void b(FragmentManager fragmentManager, C5221y yVar, C17642l<? super NavigationResult, C16807N> lVar);
}
