package org.maplibre.geojson;

import Tc.a;
import Tc.b;
import Tc.c;
import androidx.annotation.Keep;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;
import org.maplibre.geojson.exception.GeoJsonException;
import org.maplibre.geojson.shifter.CoordinateShifterManager;
import org.maplibre.geojson.utils.GeoJsonUtils;

@Keep
abstract class BaseCoordinatesTypeAdapter<T> extends TypeAdapter<T> {
    BaseCoordinatesTypeAdapter() {
    }

    /* access modifiers changed from: protected */
    public Point readPoint(a aVar) {
        List<Double> readPointList = readPointList(aVar);
        if (readPointList != null && readPointList.size() > 1) {
            return new Point("Point", (BoundingBox) null, readPointList);
        }
        throw new GeoJsonException(" Point coordinates should be non-null double array");
    }

    /* access modifiers changed from: protected */
    public List<Double> readPointList(a aVar) {
        if (aVar.F() != b.NULL) {
            ArrayList arrayList = new ArrayList();
            aVar.d();
            while (aVar.hasNext()) {
                arrayList.add(Double.valueOf(aVar.d2()));
            }
            aVar.i();
            return arrayList.size() > 2 ? CoordinateShifterManager.getCoordinateShifter().shiftLonLatAlt(((Double) arrayList.get(0)).doubleValue(), ((Double) arrayList.get(1)).doubleValue(), ((Double) arrayList.get(2)).doubleValue()) : CoordinateShifterManager.getCoordinateShifter().shiftLonLat(((Double) arrayList.get(0)).doubleValue(), ((Double) arrayList.get(1)).doubleValue());
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public void writePoint(c cVar, Point point) {
        if (point != null) {
            writePointList(cVar, point.coordinates());
        }
    }

    /* access modifiers changed from: protected */
    public void writePointList(c cVar, List<Double> list) {
        if (list != null) {
            cVar.e();
            List<Double> unshiftPoint = CoordinateShifterManager.getCoordinateShifter().unshiftPoint(list);
            cVar.f0(GeoJsonUtils.trim(unshiftPoint.get(0).doubleValue()));
            cVar.f0(GeoJsonUtils.trim(unshiftPoint.get(1).doubleValue()));
            if (list.size() > 2) {
                cVar.j0(unshiftPoint.get(2));
            }
            cVar.h();
        }
    }
}
