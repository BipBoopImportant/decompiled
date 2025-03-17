package Oe;

import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"LOe/l;", "", "", "address", "Lcom/google/android/libraries/places/api/model/Place;", "place", "<init>", "(Ljava/lang/String;Lcom/google/android/libraries/places/api/model/Place;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/google/android/libraries/places/api/model/Place;", "()Lcom/google/android/libraries/places/api/model/Place;", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final String f62227a;

    /* renamed from: b  reason: collision with root package name */
    private final Place f62228b;

    public l(String str, Place place) {
        C17542s.j(str, PlaceTypes.ADDRESS);
        this.f62227a = str;
        this.f62228b = place;
    }

    public final String a() {
        return this.f62227a;
    }

    public final Place b() {
        return this.f62228b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return C17542s.e(this.f62227a, lVar.f62227a) && C17542s.e(this.f62228b, lVar.f62228b);
    }

    public int hashCode() {
        int hashCode = this.f62227a.hashCode() * 31;
        Place place = this.f62228b;
        return hashCode + (place == null ? 0 : place.hashCode());
    }

    public String toString() {
        String str = this.f62227a;
        Place place = this.f62228b;
        return "SelectedAddress(address=" + str + ", place=" + place + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(String str, Place place, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : place);
    }
}
