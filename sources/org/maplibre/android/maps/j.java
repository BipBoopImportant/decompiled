package org.maplibre.android.maps;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.maplibre.android.annotations.Marker;
import org.maplibre.android.annotations.c;
import org.maplibre.android.maps.o;

class j {

    /* renamed from: a  reason: collision with root package name */
    private final List<c> f145851a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private boolean f145852b;

    j() {
    }

    public void a(c cVar) {
        this.f145851a.add(cVar);
    }

    /* access modifiers changed from: package-private */
    public o.b b() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public o.l c() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public o.m d() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public o.n e() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return this.f145852b;
    }

    /* access modifiers changed from: package-private */
    public boolean g(Marker marker) {
        return marker != null && (!TextUtils.isEmpty(marker.F()) || !TextUtils.isEmpty(marker.E()));
    }

    /* access modifiers changed from: package-private */
    public void h() {
        if (!this.f145851a.isEmpty()) {
            for (c l10 : this.f145851a) {
                l10.l();
            }
        }
    }
}
