package com.ingka.ikea.checkout.impl.payment;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/ingka/ikea/checkout/impl/payment/a;", "Landroid/os/Parcelable;", "<init>", "()V", "a", "Lcom/ingka/ikea/checkout/impl/payment/a$a;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a implements Parcelable {

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\rJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/ingka/ikea/checkout/impl/payment/a$a;", "Lcom/ingka/ikea/checkout/impl/payment/a;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.checkout.impl.payment.a$a  reason: collision with other inner class name */
    public static final class C2106a extends a implements Parcelable {
        public static final Parcelable.Creator<C2106a> CREATOR = new C2107a();

        /* renamed from: a  reason: collision with root package name */
        public static final C2106a f94645a = new C2106a();

        /* renamed from: b  reason: collision with root package name */
        public static final int f94646b = 8;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.checkout.impl.payment.a$a$a  reason: collision with other inner class name */
        public static final class C2107a implements Parcelable.Creator<C2106a> {
            /* renamed from: a */
            public final C2106a createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                parcel.readInt();
                return C2106a.f94645a;
            }

            /* renamed from: b */
            public final C2106a[] newArray(int i10) {
                return new C2106a[i10];
            }
        }

        private C2106a() {
            super((DefaultConstructorMarker) null);
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2106a);
        }

        public int hashCode() {
            return -327572117;
        }

        public String toString() {
            return "Completed";
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
