package org.maplibre.geojson.gson;

import Tc.a;
import Tc.c;
import androidx.annotation.Keep;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;
import org.maplibre.geojson.BoundingBox;
import org.maplibre.geojson.Point;
import org.maplibre.geojson.exception.GeoJsonException;
import org.maplibre.geojson.shifter.CoordinateShifterManager;
import org.maplibre.geojson.utils.GeoJsonUtils;

@Keep
public class BoundingBoxTypeAdapter extends TypeAdapter<BoundingBox> {
    public BoundingBox read(a aVar) {
        ArrayList arrayList = new ArrayList();
        aVar.d();
        while (aVar.hasNext()) {
            arrayList.add(Double.valueOf(aVar.d2()));
        }
        aVar.i();
        if (arrayList.size() == 6) {
            return BoundingBox.fromLngLats(((Double) arrayList.get(0)).doubleValue(), ((Double) arrayList.get(1)).doubleValue(), ((Double) arrayList.get(2)).doubleValue(), ((Double) arrayList.get(3)).doubleValue(), ((Double) arrayList.get(4)).doubleValue(), ((Double) arrayList.get(5)).doubleValue());
        }
        if (arrayList.size() == 4) {
            return BoundingBox.fromLngLats(((Double) arrayList.get(0)).doubleValue(), ((Double) arrayList.get(1)).doubleValue(), ((Double) arrayList.get(2)).doubleValue(), ((Double) arrayList.get(3)).doubleValue());
        }
        throw new GeoJsonException("The value of the bbox member MUST be an array of length 2*n where n is the number of dimensions represented in the contained geometries,with all axes of the most southwesterly point followed  by all axes of the more northeasterly point. The axes order of a bbox follows the axes order of geometries.");
    }

    public void write(c cVar, BoundingBox boundingBox) {
        if (boundingBox == null) {
            cVar.v();
            return;
        }
        cVar.e();
        Point southwest = boundingBox.southwest();
        List<Double> unshiftPoint = CoordinateShifterManager.getCoordinateShifter().unshiftPoint(southwest);
        cVar.f0(GeoJsonUtils.trim(unshiftPoint.get(0).doubleValue()));
        cVar.f0(GeoJsonUtils.trim(unshiftPoint.get(1).doubleValue()));
        if (southwest.hasAltitude()) {
            cVar.j0(unshiftPoint.get(2));
        }
        Point northeast = boundingBox.northeast();
        List<Double> unshiftPoint2 = CoordinateShifterManager.getCoordinateShifter().unshiftPoint(northeast);
        cVar.f0(GeoJsonUtils.trim(unshiftPoint2.get(0).doubleValue()));
        cVar.f0(GeoJsonUtils.trim(unshiftPoint2.get(1).doubleValue()));
        if (northeast.hasAltitude()) {
            cVar.j0(unshiftPoint2.get(2));
        }
        cVar.h();
    }
}
