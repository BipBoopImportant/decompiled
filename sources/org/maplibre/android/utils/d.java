package org.maplibre.android.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.C17535k;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"Lkotlin/Double$Companion;", "", "d", "", "b", "(Lkotlin/jvm/internal/k;D)Z", "a", "MapLibreAndroid_drawableRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class d {
    public static final boolean a(C17535k kVar, double d10) {
        C17542s.j(kVar, "<this>");
        return Double.isInfinite(d10);
    }

    public static final boolean b(C17535k kVar, double d10) {
        C17542s.j(kVar, "<this>");
        return Double.isNaN(d10);
    }
}
