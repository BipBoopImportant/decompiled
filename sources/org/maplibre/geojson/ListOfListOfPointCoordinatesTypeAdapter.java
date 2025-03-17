package org.maplibre.geojson;

import Tc.a;
import Tc.b;
import Tc.c;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import org.maplibre.geojson.exception.GeoJsonException;

@Keep
class ListOfListOfPointCoordinatesTypeAdapter extends BaseCoordinatesTypeAdapter<List<List<Point>>> {
    ListOfListOfPointCoordinatesTypeAdapter() {
    }

    public List<List<Point>> read(a aVar) {
        if (aVar.F() == b.NULL) {
            throw null;
        } else if (aVar.F() == b.BEGIN_ARRAY) {
            aVar.d();
            ArrayList arrayList = new ArrayList();
            while (aVar.F() == b.BEGIN_ARRAY) {
                aVar.d();
                ArrayList arrayList2 = new ArrayList();
                while (aVar.F() == b.BEGIN_ARRAY) {
                    arrayList2.add(readPoint(aVar));
                }
                aVar.i();
                arrayList.add(arrayList2);
            }
            aVar.i();
            return arrayList;
        } else {
            throw new GeoJsonException("coordinates should be array of array of array of double");
        }
    }

    public void write(c cVar, List<List<Point>> list) {
        if (list == null) {
            cVar.v();
            return;
        }
        cVar.e();
        for (List<Point> it : list) {
            cVar.e();
            for (Point writePoint : it) {
                writePoint(cVar, writePoint);
            }
            cVar.h();
        }
        cVar.h();
    }
}
