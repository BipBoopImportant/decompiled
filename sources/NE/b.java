package Ne;

import Oe.a;
import Oe.l;
import Pe.d;
import com.google.android.libraries.places.api.model.RectangularBounds;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J@\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H@¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0006H@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LNe/b;", "LNe/a;", "LPe/d;", "googlePlacesWrapper", "<init>", "(LPe/d;)V", "", "text", "", "locationRestriction", "Lcom/google/android/libraries/places/api/model/RectangularBounds;", "bounds", "countryCode", "componentValue", "", "LPe/d$a;", "c", "(Ljava/lang/String;ZLcom/google/android/libraries/places/api/model/RectangularBounds;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LOe/a;", "addressAndPlaceId", "LOe/l;", "b", "(LOe/a;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "a", "LPe/d;", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final d f62018a;

    public b(d dVar) {
        C17542s.j(dVar, "googlePlacesWrapper");
        this.f62018a = dVar;
        dVar.a("fetch_places_use_case");
    }

    public Object b(a aVar, String str, C17164e<? super l> eVar) {
        return this.f62018a.b(aVar, str, eVar);
    }

    public Object c(String str, boolean z10, RectangularBounds rectangularBounds, String str2, String str3, C17164e<? super List<d.a>> eVar) {
        return this.f62018a.c(str, z10, rectangularBounds, str2, str3, eVar);
    }
}
