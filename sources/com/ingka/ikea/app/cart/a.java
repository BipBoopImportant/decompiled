package com.ingka.ikea.app.cart;

import android.os.Parcel;
import android.os.Parcelable;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/ingka/ikea/app/cart/a;", "Landroid/os/Parcelable;", "Lcom/ingka/ikea/app/cart/a$a;", "action", "<init>", "(Lcom/ingka/ikea/app/cart/a$a;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/app/cart/a$a;", "()Lcom/ingka/ikea/app/cart/a$a;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final int f71704b = 8;

    /* renamed from: a  reason: collision with root package name */
    private final C1226a f71705a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/app/cart/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "CHANGE_POSTAL_CODE", "CHANGE_STORE", "SELECT_HOME", "SELECT_CLICK_COLLECT", "EXPLAIN_DISCREPANCY", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.app.cart.a$a  reason: collision with other inner class name */
    public enum C1226a {
        CHANGE_POSTAL_CODE,
        CHANGE_STORE,
        SELECT_HOME,
        SELECT_CLICK_COLLECT,
        EXPLAIN_DISCREPANCY;

        static {
            C1226a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<a> {
        /* renamed from: a */
        public final a createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new a(C1226a.valueOf(parcel.readString()));
        }

        /* renamed from: b */
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(C1226a aVar) {
        C17542s.j(aVar, "action");
        this.f71705a = aVar;
    }

    public final C1226a a() {
        return this.f71705a;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f71705a == ((a) obj).f71705a;
    }

    public int hashCode() {
        return this.f71705a.hashCode();
    }

    public String toString() {
        C1226a aVar = this.f71705a;
        return "Result(action=" + aVar + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f71705a.name());
    }
}
