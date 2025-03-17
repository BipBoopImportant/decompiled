package org.maplibre.geojson;

import Tc.a;
import Tc.b;
import Tc.c;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import org.maplibre.geojson.exception.GeoJsonException;

@Keep
class ListofListofListOfPointCoordinatesTypeAdapter extends BaseCoordinatesTypeAdapter<List<List<List<Point>>>> {
    ListofListofListOfPointCoordinatesTypeAdapter() {
    }

    public List<List<List<Point>>> read(a aVar) {
        if (aVar.F() == b.NULL) {
            throw null;
        } else if (aVar.F() == b.BEGIN_ARRAY) {
            aVar.d();
            ArrayList arrayList = new ArrayList();
            while (aVar.F() == b.BEGIN_ARRAY) {
                aVar.d();
                ArrayList arrayList2 = new ArrayList();
                while (aVar.F() == b.BEGIN_ARRAY) {
                    aVar.d();
                    ArrayList arrayList3 = new ArrayList();
                    while (aVar.F() == b.BEGIN_ARRAY) {
                        arrayList3.add(readPoint(aVar));
                    }
                    aVar.i();
                    arrayList2.add(arrayList3);
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

    public void write(c cVar, List<List<List<Point>>> list) {
        if (list == null) {
            cVar.v();
            return;
        }
        cVar.e();
        for (List<List<Point>> it : list) {
            cVar.e();
            for (List<Point> it2 : it) {
                cVar.e();
                for (Point writePoint : it2) {
                    writePoint(cVar, writePoint);
                }
                cVar.h();
            }
            cVar.h();
        }
        cVar.h();
    }
}
