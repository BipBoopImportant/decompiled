package ap;

import IC.C13023e;
import com.ingka.ikea.appconfig.model.LocationLatLng;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lap/d;", "", "Lcom/ingka/ikea/appconfig/model/LocationLatLng;", "from", "to", "", "b", "(Lcom/ingka/ikea/appconfig/model/LocationLatLng;Lcom/ingka/ikea/appconfig/model/LocationLatLng;)D", "meters", "", "thresholdMeters", "LIC/e;", "a", "(DI)LIC/e;", "core-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface d {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ C13023e a(d dVar, double d10, int i10, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    i10 = 1000;
                }
                return dVar.a(d10, i10);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: distanceLabel");
        }
    }

    C13023e a(double d10, int i10);

    double b(LocationLatLng locationLatLng, LocationLatLng locationLatLng2);
}
