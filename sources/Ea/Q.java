package ea;

import K9.C6606d;
import K9.C6619q;
import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.util.r;
import com.google.android.gms.location.LocationRequest;
import java.util.Iterator;
import java.util.List;

@Deprecated
public final class Q extends a {
    public static final Parcelable.Creator<Q> CREATOR = new S();

    /* renamed from: a  reason: collision with root package name */
    LocationRequest f50930a;

    Q(LocationRequest locationRequest, List list, boolean z10, boolean z11, boolean z12, boolean z13, String str, long j10) {
        WorkSource workSource;
        LocationRequest.a aVar = new LocationRequest.a(locationRequest);
        if (list != null) {
            if (list.isEmpty()) {
                workSource = null;
            } else {
                workSource = new WorkSource();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C6606d dVar = (C6606d) it.next();
                    r.a(workSource, dVar.f37820a, dVar.f37821b);
                }
            }
            aVar.n(workSource);
        }
        if (z10) {
            aVar.c(1);
        }
        if (z11) {
            aVar.l(2);
        }
        if (z12) {
            aVar.m(true);
        }
        if (z13) {
            aVar.k(true);
        }
        if (j10 != Long.MAX_VALUE) {
            aVar.e(j10);
        }
        this.f50930a = aVar.a();
    }

    @Deprecated
    public static Q x(String str, LocationRequest locationRequest) {
        return new Q(locationRequest, (List) null, false, false, false, false, (String) null, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Q) {
            return C6619q.b(this.f50930a, ((Q) obj).f50930a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f50930a.hashCode();
    }

    public final String toString() {
        return this.f50930a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f50930a, i10, false);
        c.b(parcel, a10);
    }
}
