package org.maplibre.android.annotations;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import org.maplibre.android.geometry.LatLng;
import wL.C18566a;

@Deprecated
public abstract class BasePointCollection extends C18566a {
    @Keep
    private float alpha = 1.0f;
    @Keep
    private List<LatLng> points = new ArrayList();

    protected BasePointCollection() {
    }
}
