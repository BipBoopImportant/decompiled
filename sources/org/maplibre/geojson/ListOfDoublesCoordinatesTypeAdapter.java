package org.maplibre.geojson;

import Tc.a;
import Tc.c;
import androidx.annotation.Keep;
import java.util.List;

@Keep
class ListOfDoublesCoordinatesTypeAdapter extends BaseCoordinatesTypeAdapter<List<Double>> {
    ListOfDoublesCoordinatesTypeAdapter() {
    }

    public List<Double> read(a aVar) {
        return readPointList(aVar);
    }

    public void write(c cVar, List<Double> list) {
        writePointList(cVar, list);
    }
}
