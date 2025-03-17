package na;

import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class h extends L9.a {
    public static final Parcelable.Creator<h> CREATOR = new o();

    /* renamed from: a  reason: collision with root package name */
    private final List f55138a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f55139b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f55140c;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final ArrayList f55141a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private boolean f55142b = false;

        /* renamed from: c  reason: collision with root package name */
        private boolean f55143c = false;

        public a a(LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.f55141a.add(locationRequest);
            }
            return this;
        }

        public h b() {
            return new h(this.f55141a, this.f55142b, this.f55143c);
        }
    }

    h(List list, boolean z10, boolean z11) {
        this.f55138a = list;
        this.f55139b = z10;
        this.f55140c = z11;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        List list = this.f55138a;
        int a10 = c.a(parcel);
        c.y(parcel, 1, Collections.unmodifiableList(list), false);
        c.c(parcel, 2, this.f55139b);
        c.c(parcel, 3, this.f55140c);
        c.b(parcel, a10);
    }
}
