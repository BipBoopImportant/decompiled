package d4;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: d4.e  reason: case insensitive filesystem */
public final class C7740e extends C7737b {
    public static final Parcelable.Creator<C7740e> CREATOR = new a();

    /* renamed from: d4.e$a */
    class a implements Parcelable.Creator<C7740e> {
        a() {
        }

        /* renamed from: a */
        public C7740e createFromParcel(Parcel parcel) {
            return new C7740e();
        }

        /* renamed from: b */
        public C7740e[] newArray(int i10) {
            return new C7740e[i10];
        }
    }

    public void writeToParcel(Parcel parcel, int i10) {
    }
}
