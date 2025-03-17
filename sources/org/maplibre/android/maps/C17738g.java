package org.maplibre.android.maps;

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.Map;
import wL.C18567b;

/* renamed from: org.maplibre.android.maps.g  reason: case insensitive filesystem */
class C17738g {

    /* renamed from: a  reason: collision with root package name */
    private final Map<C18567b, Integer> f145845a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private v f145846b;

    /* renamed from: c  reason: collision with root package name */
    private int f145847c;

    /* renamed from: d  reason: collision with root package name */
    private int f145848d;

    C17738g(v vVar) {
        this.f145846b = vVar;
    }

    private void d(C18567b bVar) {
        Bitmap a10 = bVar.a();
        this.f145846b.T(bVar.b(), a10.getWidth(), a10.getHeight(), bVar.c(), bVar.d());
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.f145848d;
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f145847c;
    }

    /* access modifiers changed from: package-private */
    public int c(C18567b bVar) {
        return (int) (this.f145846b.A(bVar.b()) * ((double) this.f145846b.getPixelRatio()));
    }

    /* access modifiers changed from: package-private */
    public void e() {
        for (C18567b d10 : this.f145845a.keySet()) {
            d(d10);
        }
    }
}
