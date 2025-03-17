package com.ingka.ikea.scanandgo.cart.impl;

import By.C12667f;
import By.C12668g;
import By.C12669h;
import D2.d;
import Jy.j;
import Ma.C9140b;
import XH.C16796C;
import XH.C16824o;
import XH.C16825p;
import YH.C16877v;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.c;
import androidx.fragment.app.C5197z;
import androidx.fragment.app.DialogFragment;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\r\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rR!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0017\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/ingka/ikea/scanandgo/cart/impl/CartSortByCartDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "LJy/j$a;", "item", "LXH/N;", "q0", "(LJy/j$a;)V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "", "D", "LXH/o;", "n0", "()Ljava/util/List;", "values", "E", "m0", "()LJy/j$a;", "selected", "F", "b", "a", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CartSortByCartDialogFragment extends DialogFragment {

    /* renamed from: F  reason: collision with root package name */
    public static final a f119778F = new a((DefaultConstructorMarker) null);

    /* renamed from: G  reason: collision with root package name */
    public static final int f119779G = 8;

    /* renamed from: D  reason: collision with root package name */
    private final C16824o f119780D = C16825p.b(new C12668g(this));

    /* renamed from: E  reason: collision with root package name */
    private final C16824o f119781E = C16825p.b(new C12669h(this));

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0006XT¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000b8\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/ingka/ikea/scanandgo/cart/impl/CartSortByCartDialogFragment$a;", "", "<init>", "()V", "", "LJy/j$a;", "values", "selected", "Lcom/ingka/ikea/scanandgo/cart/impl/CartSortByCartDialogFragment;", "a", "(Ljava/util/List;LJy/j$a;)Lcom/ingka/ikea/scanandgo/cart/impl/CartSortByCartDialogFragment;", "", "TAG", "Ljava/lang/String;", "RESULT_KEY_ITEM_SELECTED", "RESULT_VALUE_ITEM_SELECTED", "ARG_SORT_BY_VALUES", "ARG_SORT_BY_SELECTED_VALUE", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CartSortByCartDialogFragment a(List<? extends j.a> list, j.a aVar) {
            C17542s.j(list, "values");
            C17542s.j(aVar, "selected");
            CartSortByCartDialogFragment cartSortByCartDialogFragment = new CartSortByCartDialogFragment();
            cartSortByCartDialogFragment.setArguments(d.b(C16796C.a("CartSortByCartDialogFragment.ArgSortByValues", list), C16796C.a("CartSortByCartDialogFragment.ArgSortBySelectedValue", aVar)));
            return cartSortByCartDialogFragment;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/ingka/ikea/scanandgo/cart/impl/CartSortByCartDialogFragment$b;", "Landroid/os/Parcelable;", "<init>", "()V", "a", "Lcom/ingka/ikea/scanandgo/cart/impl/CartSortByCartDialogFragment$b$a;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b implements Parcelable {

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/ingka/ikea/scanandgo/cart/impl/CartSortByCartDialogFragment$b$a;", "Lcom/ingka/ikea/scanandgo/cart/impl/CartSortByCartDialogFragment$b;", "Landroid/os/Parcelable;", "LJy/j$a;", "item", "<init>", "(LJy/j$a;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LJy/j$a;", "()LJy/j$a;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends b implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C2991a();

            /* renamed from: b  reason: collision with root package name */
            public static final int f119782b = 8;

            /* renamed from: a  reason: collision with root package name */
            private final j.a f119783a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingka.ikea.scanandgo.cart.impl.CartSortByCartDialogFragment$b$a$a  reason: collision with other inner class name */
            public static final class C2991a implements Parcelable.Creator<a> {
                /* renamed from: a */
                public final a createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    return new a(j.a.valueOf(parcel.readString()));
                }

                /* renamed from: b */
                public final a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(j.a aVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(aVar, "item");
                this.f119783a = aVar;
            }

            public final j.a a() {
                return this.f119783a;
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f119783a == ((a) obj).f119783a;
            }

            public int hashCode() {
                return this.f119783a.hashCode();
            }

            public String toString() {
                j.a aVar = this.f119783a;
                return "OnSelected(item=" + aVar + ")";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeString(this.f119783a.name());
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    private final j.a m0() {
        return (j.a) this.f119781E.getValue();
    }

    private final List<j.a> n0() {
        return (List) this.f119780D.getValue();
    }

    /* access modifiers changed from: private */
    public static final void o0(CartSortByCartDialogFragment cartSortByCartDialogFragment, DialogInterface dialogInterface, int i10) {
        cartSortByCartDialogFragment.q0(cartSortByCartDialogFragment.n0().get(i10));
    }

    private final void q0(j.a aVar) {
        C5197z.c(this, "CartSortByCartDialogFragment.ResultKeyItemSelected", d.b(C16796C.a("CartSortByCartDialogFragment.ResultValueItemSelected", new b.a(aVar))));
        dismiss();
    }

    /* access modifiers changed from: private */
    public static final j.a r0(CartSortByCartDialogFragment cartSortByCartDialogFragment) {
        Serializable serializable = cartSortByCartDialogFragment.requireArguments().getSerializable("CartSortByCartDialogFragment.ArgSortBySelectedValue");
        C17542s.h(serializable, "null cannot be cast to non-null type com.ingka.ikea.scanandgo.cart.impl.model.CartSortByModel.SortByEnum");
        return (j.a) serializable;
    }

    /* access modifiers changed from: private */
    public static final List s0(CartSortByCartDialogFragment cartSortByCartDialogFragment) {
        Serializable serializable = cartSortByCartDialogFragment.requireArguments().getSerializable("CartSortByCartDialogFragment.ArgSortByValues");
        C17542s.h(serializable, "null cannot be cast to non-null type kotlin.collections.List<com.ingka.ikea.scanandgo.cart.impl.model.CartSortByModel.SortByEnum>");
        return (List) serializable;
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Iterable<j.a> n02 = n0();
        ArrayList arrayList = new ArrayList(C16877v.y(n02, 10));
        for (j.a m10 : n02) {
            arrayList.add(getString(m10.m()));
        }
        c create = new C9140b(requireContext()).I((CharSequence[]) ((String[]) arrayList.toArray(new String[0])), n0().indexOf(m0()), new C12667f(this)).u(true).create();
        C17542s.i(create, "create(...)");
        return create;
    }
}
