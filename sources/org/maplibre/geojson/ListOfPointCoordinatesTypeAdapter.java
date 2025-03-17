package org.maplibre.geojson;

import Tc.a;
import Tc.b;
import Tc.c;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import org.maplibre.geojson.exception.GeoJsonException;

@Keep
class ListOfPointCoordinatesTypeAdapter extends BaseCoordinatesTypeAdapter<List<Point>> {
    ListOfPointCoordinatesTypeAdapter() {
    }

    public List<Point> read(a aVar) {
        if (aVar.F() == b.NULL) {
            throw null;
        } else if (aVar.F() == b.BEGIN_ARRAY) {
            ArrayList arrayList = new ArrayList();
            aVar.d();
            while (aVar.F() == b.BEGIN_ARRAY) {
                arrayList.add(readPoint(aVar));
            }
            aVar.i();
            return arrayList;
        } else {
            throw new GeoJsonException("coordinates should be non-null array of array of double");
        }
    }

    public void write(c cVar, List<Point> list) {
        if (list == null) {
            cVar.v();
            return;
        }
        cVar.e();
        for (Point writePoint : list) {
            writePoint(cVar, writePoint);
        }
        cVar.h();
    }
}
