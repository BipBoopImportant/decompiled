package Nn;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.checkout.uicomponent.paymentmethodselection.PaymentMethodSelectionUiComponentContainer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tv.C11996a;
import tv.C11997b;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001b\u0010\u001e¨\u0006\u001f"}, d2 = {"LNn/v;", "Landroid/os/Parcelable;", "", "Ltv/a;", "paymentMethods", "Ltv/b;", "cardNetworks", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final List<C11996a> f84156a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C11997b> f84157b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<v> {
        /* renamed from: a */
        public final v createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                arrayList.add(C11996a.valueOf(parcel.readString()));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i11 = 0; i11 != readInt2; i11++) {
                arrayList2.add(C11997b.valueOf(parcel.readString()));
            }
            return new v(arrayList, arrayList2);
        }

        /* renamed from: b */
        public final v[] newArray(int i10) {
            return new v[i10];
        }
    }

    public v(List<? extends C11996a> list, List<? extends C11997b> list2) {
        C17542s.j(list, PaymentMethodSelectionUiComponentContainer.ARG_PAYMENT_METHODS);
        C17542s.j(list2, "cardNetworks");
        this.f84156a = list;
        this.f84157b = list2;
    }

    public final List<C11997b> a() {
        return this.f84157b;
    }

    public final List<C11996a> b() {
        return this.f84156a;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return C17542s.e(this.f84156a, vVar.f84156a) && C17542s.e(this.f84157b, vVar.f84157b);
    }

    public int hashCode() {
        return (this.f84156a.hashCode() * 31) + this.f84157b.hashCode();
    }

    public String toString() {
        List<C11996a> list = this.f84156a;
        List<C11997b> list2 = this.f84157b;
        return "GooglePayInfoHolder(paymentMethods=" + list + ", cardNetworks=" + list2 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        List<C11996a> list = this.f84156a;
        parcel.writeInt(list.size());
        for (C11996a name : list) {
            parcel.writeString(name.name());
        }
        List<C11997b> list2 = this.f84157b;
        parcel.writeInt(list2.size());
        for (C11997b name2 : list2) {
            parcel.writeString(name2.name());
        }
    }
}
