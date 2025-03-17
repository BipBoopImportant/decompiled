package Pw;

import HJ.C15850p;
import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.checkout.dialog.IPaymentFormListener;
import com.oppwa.mobile.connect.checkout.meta.CheckoutValidationResult;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"LPw/a;", "Lcom/oppwa/mobile/connect/checkout/dialog/IPaymentFormListener;", "LHJ/p;", "regex", "<init>", "(LHJ/p;)V", "", "holder", "Lcom/oppwa/mobile/connect/checkout/meta/CheckoutValidationResult;", "onCardHolderValidate", "(Ljava/lang/String;)Lcom/oppwa/mobile/connect/checkout/meta/CheckoutValidationResult;", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LHJ/p;", "getRegex", "()LHJ/p;", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Pw.a  reason: case insensitive filesystem */
public final class C13348a implements IPaymentFormListener {
    public static final Parcelable.Creator<C13348a> CREATOR = new C2809a();

    /* renamed from: a  reason: collision with root package name */
    private final C15850p f114041a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Pw.a$a  reason: collision with other inner class name */
    public static final class C2809a implements Parcelable.Creator<C13348a> {
        /* renamed from: a */
        public final C13348a createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new C13348a((C15850p) parcel.readSerializable());
        }

        /* renamed from: b */
        public final C13348a[] newArray(int i10) {
            return new C13348a[i10];
        }
    }

    public C13348a(C15850p pVar) {
        this.f114041a = pVar;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13348a) && C17542s.e(this.f114041a, ((C13348a) obj).f114041a);
    }

    public int hashCode() {
        C15850p pVar = this.f114041a;
        if (pVar == null) {
            return 0;
        }
        return pVar.hashCode();
    }

    public CheckoutValidationResult onCardHolderValidate(String str) {
        C15850p pVar = this.f114041a;
        if (pVar == null) {
            return CheckoutValidationResult.VALID;
        }
        if (str == null) {
            str = "";
        }
        return pVar.i(str) ? CheckoutValidationResult.VALID : CheckoutValidationResult.NOT_VALID;
    }

    public String toString() {
        C15850p pVar = this.f114041a;
        return "AciCustomFormListener(regex=" + pVar + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeSerializable(this.f114041a);
    }
}
