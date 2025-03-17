package com.ingka.ikea.scanandgo.cart.impl.dialog;

import Dy.Z;
import Gy.n;
import Oy.e;
import QJ.Q;
import U0.C4889m;
import U0.C4895p;
import XH.C16796C;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import XH.y;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.ingka.ikea.ui.bottomsheetdialog.BottomSheetComposeDialogFragment;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u00009\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0004\b\u0001\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\tH\u0015¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/ingka/ikea/scanandgo/cart/impl/dialog/DeleteCouponBottomSheet;", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment;", "<init>", "()V", "com/ingka/ikea/scanandgo/cart/impl/dialog/DeleteCouponBottomSheet$b", "N0", "()Lcom/ingka/ikea/scanandgo/cart/impl/dialog/DeleteCouponBottomSheet$b;", "LOy/e$a;", "action", "LXH/N;", "L0", "(LOy/e$a;)V", "Lcom/ingka/ikea/scanandgo/cart/impl/dialog/DeleteCouponBottomSheet$Companion$FragmentResult;", "M0", "(Lcom/ingka/ikea/scanandgo/cart/impl/dialog/DeleteCouponBottomSheet$Companion$FragmentResult;)V", "onStart", "u0", "(LU0/m;I)V", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "D0", "()Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "LOy/e;", "R", "LXH/o;", "K0", "()LOy/e;", "viewModel", "S", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "result", "T", "Companion", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeleteCouponBottomSheet extends BottomSheetComposeDialogFragment {

    /* renamed from: T  reason: collision with root package name */
    public static final Companion f119861T = new Companion((DefaultConstructorMarker) null);

    /* renamed from: U  reason: collision with root package name */
    public static final int f119862U = 8;

    /* renamed from: R  reason: collision with root package name */
    private final C16824o f119863R;

    /* renamed from: S  reason: collision with root package name */
    private BottomSheetComposeDialogFragment.a f119864S;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0006XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0006XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00108\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/ingka/ikea/scanandgo/cart/impl/dialog/DeleteCouponBottomSheet$Companion;", "", "<init>", "()V", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "LXH/N;", "d", "(Landroidx/fragment/app/FragmentManager;)V", "Landroidx/lifecycle/y;", "lifecycleOwner", "Lkotlin/Function1;", "Lcom/ingka/ikea/scanandgo/cart/impl/dialog/DeleteCouponBottomSheet$Companion$FragmentResult;", "onResult", "b", "(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/y;LnI/l;)V", "", "REQUEST_KEY", "Ljava/lang/String;", "RESULT_KEY", "TAG", "FragmentResult", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @Keep
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/scanandgo/cart/impl/dialog/DeleteCouponBottomSheet$Companion$FragmentResult;", "Landroid/os/Parcelable;", "c", "b", "a", "Lcom/ingka/ikea/scanandgo/cart/impl/dialog/DeleteCouponBottomSheet$Companion$FragmentResult$a;", "Lcom/ingka/ikea/scanandgo/cart/impl/dialog/DeleteCouponBottomSheet$Companion$FragmentResult$b;", "Lcom/ingka/ikea/scanandgo/cart/impl/dialog/DeleteCouponBottomSheet$Companion$FragmentResult$c;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface FragmentResult extends Parcelable {

            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ingka/ikea/scanandgo/cart/impl/dialog/DeleteCouponBottomSheet$Companion$FragmentResult$a;", "Lcom/ingka/ikea/scanandgo/cart/impl/dialog/DeleteCouponBottomSheet$Companion$FragmentResult;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a implements FragmentResult {
                public static final Parcelable.Creator<a> CREATOR = new C2993a();

                /* renamed from: a  reason: collision with root package name */
                public static final a f119865a = new a();

                /* renamed from: b  reason: collision with root package name */
                public static final int f119866b = 8;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.ingka.ikea.scanandgo.cart.impl.dialog.DeleteCouponBottomSheet$Companion$FragmentResult$a$a  reason: collision with other inner class name */
                public static final class C2993a implements Parcelable.Creator<a> {
                    /* renamed from: a */
                    public final a createFromParcel(Parcel parcel) {
                        C17542s.j(parcel, "parcel");
                        parcel.readInt();
                        return a.f119865a;
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

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public int hashCode() {
                    return -88924866;
                }

                public String toString() {
                    return "OnAddDiscountCodeClicked";
                }

                public final void writeToParcel(Parcel parcel, int i10) {
                    C17542s.j(parcel, "dest");
                    parcel.writeInt(1);
                }
            }

            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ingka/ikea/scanandgo/cart/impl/dialog/DeleteCouponBottomSheet$Companion$FragmentResult$b;", "Lcom/ingka/ikea/scanandgo/cart/impl/dialog/DeleteCouponBottomSheet$Companion$FragmentResult;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class b implements FragmentResult {
                public static final Parcelable.Creator<b> CREATOR = new a();

                /* renamed from: a  reason: collision with root package name */
                public static final b f119867a = new b();

                /* renamed from: b  reason: collision with root package name */
                public static final int f119868b = 8;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<b> {
                    /* renamed from: a */
                    public final b createFromParcel(Parcel parcel) {
                        C17542s.j(parcel, "parcel");
                        parcel.readInt();
                        return b.f119867a;
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

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public int hashCode() {
                    return -1511753607;
                }

                public String toString() {
                    return "OnDiscountRemoved";
                }

                public final void writeToParcel(Parcel parcel, int i10) {
                    C17542s.j(parcel, "dest");
                    parcel.writeInt(1);
                }
            }

            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ingka/ikea/scanandgo/cart/impl/dialog/DeleteCouponBottomSheet$Companion$FragmentResult$c;", "Lcom/ingka/ikea/scanandgo/cart/impl/dialog/DeleteCouponBottomSheet$Companion$FragmentResult;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class c implements FragmentResult {
                public static final Parcelable.Creator<c> CREATOR = new a();

                /* renamed from: a  reason: collision with root package name */
                public static final c f119869a = new c();

                /* renamed from: b  reason: collision with root package name */
                public static final int f119870b = 8;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<c> {
                    /* renamed from: a */
                    public final c createFromParcel(Parcel parcel) {
                        C17542s.j(parcel, "parcel");
                        parcel.readInt();
                        return c.f119869a;
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

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public int hashCode() {
                    return 1895282883;
                }

                public String toString() {
                    return "OnDismissed";
                }

                public final void writeToParcel(Parcel parcel, int i10) {
                    C17542s.j(parcel, "dest");
                    parcel.writeInt(1);
                }
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public static final void c(C17642l lVar, String str, Bundle bundle) {
            C17542s.j(str, "<unused var>");
            C17542s.j(bundle, "bundle");
            Object obj = (FragmentResult) bundle.getParcelable("DeleteCouponBottomSheet.ResultKey");
            if (obj == null) {
                obj = FragmentResult.c.f119869a;
            }
            lVar.invoke(obj);
        }

        public final void b(FragmentManager fragmentManager, C5221y yVar, C17642l<? super FragmentResult, C16807N> lVar) {
            C17542s.j(fragmentManager, "fragmentManager");
            C17542s.j(yVar, "lifecycleOwner");
            C17542s.j(lVar, "onResult");
            fragmentManager.R1("DeleteCouponBottomSheet.RequestKey", yVar, new n(lVar));
        }

        public final void d(FragmentManager fragmentManager) {
            C17542s.j(fragmentManager, "fragmentManager");
            new DeleteCouponBottomSheet().show(fragmentManager, "DeleteCouponBottomSheet.TAG");
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.dialog.DeleteCouponBottomSheet$BottomSheetContent$1$1$1", f = "DeleteCouponBottomSheet.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f119871c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ DeleteCouponBottomSheet f119872d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(DeleteCouponBottomSheet deleteCouponBottomSheet, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f119872d = deleteCouponBottomSheet;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f119872d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f119871c == 0) {
                y.b(obj);
                this.f119872d.x0();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/ingka/ikea/scanandgo/cart/impl/dialog/DeleteCouponBottomSheet$b", "LDy/Z;", "LOy/e$a;", "action", "LXH/N;", "a", "(LOy/e$a;)V", "LOy/e$b;", "uiAction", "b", "(LOy/e$b;)V", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Z {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DeleteCouponBottomSheet f119873a;

        b(DeleteCouponBottomSheet deleteCouponBottomSheet) {
            this.f119873a = deleteCouponBottomSheet;
        }

        public void a(e.a aVar) {
            C17542s.j(aVar, "action");
            this.f119873a.L0(aVar);
        }

        public void b(e.b bVar) {
            C17542s.j(bVar, "uiAction");
            this.f119873a.K0().D(bVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f119874c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5187o oVar) {
            super(0);
            this.f119874c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f119874c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f119875c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar) {
            super(0);
            this.f119875c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f119875c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f119876c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C16824o oVar) {
            super(0);
            this.f119876c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f119876c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f119877c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f119878d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar, C16824o oVar) {
            super(0);
            this.f119877c = aVar;
            this.f119878d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f119877c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f119878d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f119879c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f119880d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f119879c = oVar;
            this.f119880d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f119880d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f119879c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public DeleteCouponBottomSheet() {
        C16824o a10 = C16825p.a(s.NONE, new d(new c(this)));
        this.f119863R = W.b(this, P.b(Oy.e.class), new e(a10), new f((C17631a) null, a10), new g(this, a10));
    }

    /* access modifiers changed from: private */
    public final Oy.e K0() {
        return (Oy.e) this.f119863R.getValue();
    }

    /* access modifiers changed from: private */
    public final void L0(e.a aVar) {
        if (aVar instanceof e.a.C2789a) {
            K0().D(e.b.c.f113645a);
            M0(((e.a.C2789a) aVar).a());
            w0();
            return;
        }
        throw new t();
    }

    private final void M0(Companion.FragmentResult fragmentResult) {
        this.f119864S = new BottomSheetComposeDialogFragment.a("DeleteCouponBottomSheet.RequestKey", D2.d.b(C16796C.a("DeleteCouponBottomSheet.ResultKey", fragmentResult)));
    }

    private final b N0() {
        return new b(this);
    }

    /* access modifiers changed from: protected */
    public BottomSheetComposeDialogFragment.a D0() {
        BottomSheetComposeDialogFragment.a aVar = this.f119864S;
        return aVar == null ? new BottomSheetComposeDialogFragment.a("DeleteCouponBottomSheet.RequestKey", D2.d.b(C16796C.a("DeleteCouponBottomSheet.ResultKey", Companion.FragmentResult.c.f119869a))) : aVar;
    }

    public void onStart() {
        super.onStart();
        getLifecycle().c(K0());
    }

    /* access modifiers changed from: protected */
    public void u0(C4889m mVar, int i10) {
        mVar.W(40662206);
        if (C4895p.J()) {
            C4895p.S(40662206, i10, -1, "com.ingka.ikea.scanandgo.cart.impl.dialog.DeleteCouponBottomSheet.BottomSheetContent (DeleteCouponBottomSheet.kt:31)");
        }
        Dy.k0.t(K0(), N0(), mVar, 0);
        C16807N n10 = C16807N.f139792a;
        mVar.W(-334311033);
        boolean F10 = mVar.F(this);
        Object D10 = mVar.D();
        if (F10 || D10 == C4889m.f14007a.a()) {
            D10 = new a(this, (C17164e<? super a>) null);
            mVar.u(D10);
        }
        mVar.P();
        U0.P.g(n10, (p) D10, mVar, 6);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }
}
