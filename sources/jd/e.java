package Jd;

import KL.m;
import KL.n;
import XH.C16807N;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import com.ikea.kompassmap.model.product.ProductData;
import com.ikea.kompassmap.model.store.StoreData;
import com.ikea.kompassmap.model.store.map.ExposedFloor;
import com.ikea.kompassmap.model.store.map.Floor;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.maps.E;
import org.maplibre.android.maps.MapView;
import org.maplibre.android.maps.o;
import org.maplibre.geojson.Feature;
import org.maplibre.geojson.FeatureCollection;
import yd.C10461o;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b<\b\b\u0018\u00002\u00020\u0001B\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\b\u0012\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 \u0012\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020!0#\u0012\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020!0#¢\u0006\u0004\b(\u0010)J\u0002\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\b2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020!0#2\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020!0#HÇ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,H×\u0001¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/H×\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u00107\u001a\u0004\bG\u00109R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bH\u00107\u001a\u0004\bI\u00109R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b*\u0010J\u001a\u0004\bK\u0010LR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bQ\u00107\u001a\u0004\bR\u00109R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\b8\u0006¢\u0006\f\n\u0004\b8\u0010C\u001a\u0004\bS\u0010ER\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b<\u0010X\u001a\u0004\bY\u0010ZR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b@\u0010[\u001a\u0004\b\\\u0010]R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bD\u0010[\u001a\u0004\bT\u0010]R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\bV\u0010^\u001a\u0004\b_\u0010`R$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bG\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\b8\u0006¢\u0006\f\n\u0004\bI\u0010C\u001a\u0004\bf\u0010ER\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR.\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020!0#8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bi\u0010k\u001a\u0004\bg\u0010l\"\u0004\bm\u0010nR#\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020!0#8\u0006¢\u0006\f\n\u0004\b_\u0010k\u001a\u0004\bQ\u0010l¨\u0006o"}, d2 = {"LJd/e;", "", "", "bearing", "Lorg/maplibre/android/geometry/LatLng;", "center", "Lcom/ikea/kompassmap/model/store/map/Floor;", "currentFloor", "", "floors", "maxZoom", "minZoom", "Lcom/ikea/kompassmap/model/store/StoreData;", "storeData", "Lorg/maplibre/android/maps/E$a;", "style", "tilt", "Lorg/maplibre/geojson/Feature;", "selectedFeatures", "Lorg/maplibre/android/maps/o;", "mapLibreMap", "Lorg/maplibre/android/maps/MapView;", "mapView", "Lorg/maplibre/geojson/FeatureCollection;", "streets", "buildings", "Lcom/ikea/kompassmap/model/product/ProductData;", "productData", "LKL/m;", "symbolManager", "LKL/n;", "symbols", "Lkotlin/Function0;", "LXH/N;", "onMapLoaded", "Lkotlin/Function1;", "Lcom/ikea/kompassmap/model/store/map/ExposedFloor;", "onFloorChange", "Lyd/o;", "analytics", "<init>", "(DLorg/maplibre/android/geometry/LatLng;Lcom/ikea/kompassmap/model/store/map/Floor;Ljava/util/List;DDLcom/ikea/kompassmap/model/store/StoreData;Lorg/maplibre/android/maps/E$a;DLjava/util/List;Lorg/maplibre/android/maps/o;Lorg/maplibre/android/maps/MapView;Lorg/maplibre/geojson/FeatureCollection;Lorg/maplibre/geojson/FeatureCollection;Lcom/ikea/kompassmap/model/product/ProductData;LKL/m;Ljava/util/List;LnI/a;LnI/l;LnI/l;)V", "g", "(DLorg/maplibre/android/geometry/LatLng;Lcom/ikea/kompassmap/model/store/map/Floor;Ljava/util/List;DDLcom/ikea/kompassmap/model/store/StoreData;Lorg/maplibre/android/maps/E$a;DLjava/util/List;Lorg/maplibre/android/maps/o;Lorg/maplibre/android/maps/MapView;Lorg/maplibre/geojson/FeatureCollection;Lorg/maplibre/geojson/FeatureCollection;Lcom/ikea/kompassmap/model/product/ProductData;LKL/m;Ljava/util/List;LnI/a;LnI/l;LnI/l;)LJd/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "j", "()D", "b", "Lorg/maplibre/android/geometry/LatLng;", "l", "()Lorg/maplibre/android/geometry/LatLng;", "c", "Lcom/ikea/kompassmap/model/store/map/Floor;", "m", "()Lcom/ikea/kompassmap/model/store/map/Floor;", "d", "Ljava/util/List;", "n", "()Ljava/util/List;", "e", "p", "f", "q", "Lcom/ikea/kompassmap/model/store/StoreData;", "v", "()Lcom/ikea/kompassmap/model/store/StoreData;", "h", "Lorg/maplibre/android/maps/E$a;", "x", "()Lorg/maplibre/android/maps/E$a;", "i", "A", "u", "k", "Lorg/maplibre/android/maps/o;", "o", "()Lorg/maplibre/android/maps/o;", "Lorg/maplibre/android/maps/MapView;", "getMapView", "()Lorg/maplibre/android/maps/MapView;", "Lorg/maplibre/geojson/FeatureCollection;", "w", "()Lorg/maplibre/geojson/FeatureCollection;", "Lcom/ikea/kompassmap/model/product/ProductData;", "t", "()Lcom/ikea/kompassmap/model/product/ProductData;", "LKL/m;", "y", "()LKL/m;", "setSymbolManager", "(LKL/m;)V", "z", "r", "LnI/a;", "s", "()LnI/a;", "LnI/l;", "()LnI/l;", "setOnFloorChange", "(LnI/l;)V", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final double f61217a;

    /* renamed from: b  reason: collision with root package name */
    private final LatLng f61218b;

    /* renamed from: c  reason: collision with root package name */
    private final Floor f61219c;

    /* renamed from: d  reason: collision with root package name */
    private final List<Floor> f61220d;

    /* renamed from: e  reason: collision with root package name */
    private final double f61221e;

    /* renamed from: f  reason: collision with root package name */
    private final double f61222f;

    /* renamed from: g  reason: collision with root package name */
    private final StoreData f61223g;

    /* renamed from: h  reason: collision with root package name */
    private final E.a f61224h;

    /* renamed from: i  reason: collision with root package name */
    private final double f61225i;

    /* renamed from: j  reason: collision with root package name */
    private final List<Feature> f61226j;

    /* renamed from: k  reason: collision with root package name */
    private final o f61227k;

    /* renamed from: l  reason: collision with root package name */
    private final MapView f61228l;

    /* renamed from: m  reason: collision with root package name */
    private final FeatureCollection f61229m;

    /* renamed from: n  reason: collision with root package name */
    private final FeatureCollection f61230n;

    /* renamed from: o  reason: collision with root package name */
    private final ProductData f61231o;

    /* renamed from: p  reason: collision with root package name */
    private m f61232p;

    /* renamed from: q  reason: collision with root package name */
    private final List<n> f61233q;

    /* renamed from: r  reason: collision with root package name */
    private final C17631a<C16807N> f61234r;

    /* renamed from: s  reason: collision with root package name */
    private C17642l<? super ExposedFloor, C16807N> f61235s;

    /* renamed from: t  reason: collision with root package name */
    private final C17642l<C10461o, C16807N> f61236t;

    public e() {
        this(0.0d, (LatLng) null, (Floor) null, (List) null, 0.0d, 0.0d, (StoreData) null, (E.a) null, 0.0d, (List) null, (o) null, (MapView) null, (FeatureCollection) null, (FeatureCollection) null, (ProductData) null, (m) null, (List) null, (C17631a) null, (C17642l) null, (C17642l) null, 1048575, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N d() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(ExposedFloor exposedFloor) {
        C17542s.j(exposedFloor, "it");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C10461o oVar) {
        C17542s.j(oVar, "it");
        return C16807N.f139792a;
    }

    public static /* synthetic */ e h(e eVar, double d10, LatLng latLng, Floor floor, List list, double d11, double d12, StoreData storeData, E.a aVar, double d13, List list2, o oVar, MapView mapView, FeatureCollection featureCollection, FeatureCollection featureCollection2, ProductData productData, m mVar, List list3, C17631a aVar2, C17642l lVar, C17642l lVar2, int i10, Object obj) {
        e eVar2 = eVar;
        int i11 = i10;
        return eVar.g((i11 & 1) != 0 ? eVar2.f61217a : d10, (i11 & 2) != 0 ? eVar2.f61218b : latLng, (i11 & 4) != 0 ? eVar2.f61219c : floor, (i11 & 8) != 0 ? eVar2.f61220d : list, (i11 & 16) != 0 ? eVar2.f61221e : d11, (i11 & 32) != 0 ? eVar2.f61222f : d12, (i11 & 64) != 0 ? eVar2.f61223g : storeData, (i11 & 128) != 0 ? eVar2.f61224h : aVar, (i11 & 256) != 0 ? eVar2.f61225i : d13, (i11 & 512) != 0 ? eVar2.f61226j : list2, (i11 & 1024) != 0 ? eVar2.f61227k : oVar, (i11 & RecyclerView.n.FLAG_MOVED) != 0 ? eVar2.f61228l : mapView, (i11 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? eVar2.f61229m : featureCollection, (i11 & 8192) != 0 ? eVar2.f61230n : featureCollection2, (i11 & 16384) != 0 ? eVar2.f61231o : productData, (i11 & 32768) != 0 ? eVar2.f61232p : mVar, (i11 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? eVar2.f61233q : list3, (i11 & 131072) != 0 ? eVar2.f61234r : aVar2, (i11 & 262144) != 0 ? eVar2.f61235s : lVar, (i11 & ImageMetadata.LENS_APERTURE) != 0 ? eVar2.f61236t : lVar2);
    }

    public final double A() {
        return this.f61225i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Double.compare(this.f61217a, eVar.f61217a) == 0 && C17542s.e(this.f61218b, eVar.f61218b) && C17542s.e(this.f61219c, eVar.f61219c) && C17542s.e(this.f61220d, eVar.f61220d) && Double.compare(this.f61221e, eVar.f61221e) == 0 && Double.compare(this.f61222f, eVar.f61222f) == 0 && C17542s.e(this.f61223g, eVar.f61223g) && C17542s.e(this.f61224h, eVar.f61224h) && Double.compare(this.f61225i, eVar.f61225i) == 0 && C17542s.e(this.f61226j, eVar.f61226j) && C17542s.e(this.f61227k, eVar.f61227k) && C17542s.e(this.f61228l, eVar.f61228l) && C17542s.e(this.f61229m, eVar.f61229m) && C17542s.e(this.f61230n, eVar.f61230n) && C17542s.e(this.f61231o, eVar.f61231o) && C17542s.e(this.f61232p, eVar.f61232p) && C17542s.e(this.f61233q, eVar.f61233q) && C17542s.e(this.f61234r, eVar.f61234r) && C17542s.e(this.f61235s, eVar.f61235s) && C17542s.e(this.f61236t, eVar.f61236t);
    }

    public final e g(double d10, LatLng latLng, Floor floor, List<Floor> list, double d11, double d12, StoreData storeData, E.a aVar, double d13, List<Feature> list2, o oVar, MapView mapView, FeatureCollection featureCollection, FeatureCollection featureCollection2, ProductData productData, m mVar, List<? extends n> list3, C17631a<C16807N> aVar2, C17642l<? super ExposedFloor, C16807N> lVar, C17642l<? super C10461o, C16807N> lVar2) {
        double d14 = d10;
        C17542s.j(latLng, "center");
        C17542s.j(list, "floors");
        C17542s.j(list2, "selectedFeatures");
        C17542s.j(list3, "symbols");
        C17542s.j(aVar2, "onMapLoaded");
        C17542s.j(lVar, "onFloorChange");
        C17542s.j(lVar2, "analytics");
        return new e(d10, latLng, floor, list, d11, d12, storeData, aVar, d13, list2, oVar, mapView, featureCollection, featureCollection2, productData, mVar, list3, aVar2, lVar, lVar2);
    }

    public int hashCode() {
        int hashCode = ((Double.hashCode(this.f61217a) * 31) + this.f61218b.hashCode()) * 31;
        Floor floor = this.f61219c;
        int i10 = 0;
        int hashCode2 = (((((((hashCode + (floor == null ? 0 : floor.hashCode())) * 31) + this.f61220d.hashCode()) * 31) + Double.hashCode(this.f61221e)) * 31) + Double.hashCode(this.f61222f)) * 31;
        StoreData storeData = this.f61223g;
        int hashCode3 = (hashCode2 + (storeData == null ? 0 : storeData.hashCode())) * 31;
        E.a aVar = this.f61224h;
        int hashCode4 = (((((hashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31) + Double.hashCode(this.f61225i)) * 31) + this.f61226j.hashCode()) * 31;
        o oVar = this.f61227k;
        int hashCode5 = (hashCode4 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        MapView mapView = this.f61228l;
        int hashCode6 = (hashCode5 + (mapView == null ? 0 : mapView.hashCode())) * 31;
        FeatureCollection featureCollection = this.f61229m;
        int hashCode7 = (hashCode6 + (featureCollection == null ? 0 : featureCollection.hashCode())) * 31;
        FeatureCollection featureCollection2 = this.f61230n;
        int hashCode8 = (hashCode7 + (featureCollection2 == null ? 0 : featureCollection2.hashCode())) * 31;
        ProductData productData = this.f61231o;
        int hashCode9 = (hashCode8 + (productData == null ? 0 : productData.hashCode())) * 31;
        m mVar = this.f61232p;
        if (mVar != null) {
            i10 = mVar.hashCode();
        }
        return ((((((((hashCode9 + i10) * 31) + this.f61233q.hashCode()) * 31) + this.f61234r.hashCode()) * 31) + this.f61235s.hashCode()) * 31) + this.f61236t.hashCode();
    }

    public final C17642l<C10461o, C16807N> i() {
        return this.f61236t;
    }

    public final double j() {
        return this.f61217a;
    }

    public final FeatureCollection k() {
        return this.f61230n;
    }

    public final LatLng l() {
        return this.f61218b;
    }

    public final Floor m() {
        return this.f61219c;
    }

    public final List<Floor> n() {
        return this.f61220d;
    }

    public final o o() {
        return this.f61227k;
    }

    public final double p() {
        return this.f61221e;
    }

    public final double q() {
        return this.f61222f;
    }

    public final C17642l<ExposedFloor, C16807N> r() {
        return this.f61235s;
    }

    public final C17631a<C16807N> s() {
        return this.f61234r;
    }

    public final ProductData t() {
        return this.f61231o;
    }

    public String toString() {
        return "StoreState(bearing=" + this.f61217a + ", center=" + this.f61218b + ", currentFloor=" + this.f61219c + ", floors=" + this.f61220d + ", maxZoom=" + this.f61221e + ", minZoom=" + this.f61222f + ", storeData=" + this.f61223g + ", style=" + this.f61224h + ", tilt=" + this.f61225i + ", selectedFeatures=" + this.f61226j + ", mapLibreMap=" + this.f61227k + ", mapView=" + this.f61228l + ", streets=" + this.f61229m + ", buildings=" + this.f61230n + ", productData=" + this.f61231o + ", symbolManager=" + this.f61232p + ", symbols=" + this.f61233q + ", onMapLoaded=" + this.f61234r + ", onFloorChange=" + this.f61235s + ", analytics=" + this.f61236t + ')';
    }

    public final List<Feature> u() {
        return this.f61226j;
    }

    public final StoreData v() {
        return this.f61223g;
    }

    public final FeatureCollection w() {
        return this.f61229m;
    }

    public final E.a x() {
        return this.f61224h;
    }

    public final m y() {
        return this.f61232p;
    }

    public final List<n> z() {
        return this.f61233q;
    }

    public e(double d10, LatLng latLng, Floor floor, List<Floor> list, double d11, double d12, StoreData storeData, E.a aVar, double d13, List<Feature> list2, o oVar, MapView mapView, FeatureCollection featureCollection, FeatureCollection featureCollection2, ProductData productData, m mVar, List<? extends n> list3, C17631a<C16807N> aVar2, C17642l<? super ExposedFloor, C16807N> lVar, C17642l<? super C10461o, C16807N> lVar2) {
        List<Feature> list4 = list2;
        List<? extends n> list5 = list3;
        C17631a<C16807N> aVar3 = aVar2;
        C17642l<? super ExposedFloor, C16807N> lVar3 = lVar;
        C17642l<? super C10461o, C16807N> lVar4 = lVar2;
        C17542s.j(latLng, "center");
        C17542s.j(list, "floors");
        C17542s.j(list4, "selectedFeatures");
        C17542s.j(list5, "symbols");
        C17542s.j(aVar3, "onMapLoaded");
        C17542s.j(lVar3, "onFloorChange");
        C17542s.j(lVar4, "analytics");
        this.f61217a = d10;
        this.f61218b = latLng;
        this.f61219c = floor;
        this.f61220d = list;
        this.f61221e = d11;
        this.f61222f = d12;
        this.f61223g = storeData;
        this.f61224h = aVar;
        this.f61225i = d13;
        this.f61226j = list4;
        this.f61227k = oVar;
        this.f61228l = mapView;
        this.f61229m = featureCollection;
        this.f61230n = featureCollection2;
        this.f61231o = productData;
        this.f61232p = mVar;
        this.f61233q = list5;
        this.f61234r = aVar3;
        this.f61235s = lVar3;
        this.f61236t = lVar4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ e(double r25, org.maplibre.android.geometry.LatLng r27, com.ikea.kompassmap.model.store.map.Floor r28, java.util.List r29, double r30, double r32, com.ikea.kompassmap.model.store.StoreData r34, org.maplibre.android.maps.E.a r35, double r36, java.util.List r38, org.maplibre.android.maps.o r39, org.maplibre.android.maps.MapView r40, org.maplibre.geojson.FeatureCollection r41, org.maplibre.geojson.FeatureCollection r42, com.ikea.kompassmap.model.product.ProductData r43, KL.m r44, java.util.List r45, nI.C17631a r46, nI.C17642l r47, nI.C17642l r48, int r49, kotlin.jvm.internal.DefaultConstructorMarker r50) {
        /*
            r24 = this;
            r0 = r49
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x000a
            r4 = r2
            goto L_0x000c
        L_0x000a:
            r4 = r25
        L_0x000c:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0016
            org.maplibre.android.geometry.LatLng r1 = new org.maplibre.android.geometry.LatLng
            r1.<init>(r2, r2)
            goto L_0x0018
        L_0x0016:
            r1 = r27
        L_0x0018:
            r2 = r0 & 4
            if (r2 == 0) goto L_0x001e
            r2 = 0
            goto L_0x0020
        L_0x001e:
            r2 = r28
        L_0x0020:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0029
            java.util.List r6 = YH.C16877v.n()
            goto L_0x002b
        L_0x0029:
            r6 = r29
        L_0x002b:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x0032
            r7 = 4626604192193052672(0x4035000000000000, double:21.0)
            goto L_0x0034
        L_0x0032:
            r7 = r30
        L_0x0034:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x003b
            r9 = 4624633867356078080(0x402e000000000000, double:15.0)
            goto L_0x003d
        L_0x003b:
            r9 = r32
        L_0x003d:
            r11 = r0 & 64
            if (r11 == 0) goto L_0x0043
            r11 = 0
            goto L_0x0045
        L_0x0043:
            r11 = r34
        L_0x0045:
            r12 = r0 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x004b
            r12 = 0
            goto L_0x004d
        L_0x004b:
            r12 = r35
        L_0x004d:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x0054
            r13 = 4632233691727265792(0x4049000000000000, double:50.0)
            goto L_0x0056
        L_0x0054:
            r13 = r36
        L_0x0056:
            r15 = r0 & 512(0x200, float:7.175E-43)
            if (r15 == 0) goto L_0x005f
            java.util.List r15 = YH.C16877v.n()
            goto L_0x0061
        L_0x005f:
            r15 = r38
        L_0x0061:
            r3 = r0 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0067
            r3 = 0
            goto L_0x0069
        L_0x0067:
            r3 = r39
        L_0x0069:
            r50 = r3
            r3 = r0 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x0071
            r3 = 0
            goto L_0x0073
        L_0x0071:
            r3 = r40
        L_0x0073:
            r16 = r3
            r3 = r0 & 4096(0x1000, float:5.74E-42)
            if (r3 == 0) goto L_0x007b
            r3 = 0
            goto L_0x007d
        L_0x007b:
            r3 = r41
        L_0x007d:
            r17 = r3
            r3 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x0085
            r3 = 0
            goto L_0x0087
        L_0x0085:
            r3 = r42
        L_0x0087:
            r18 = r3
            r3 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r3 == 0) goto L_0x008f
            r3 = 0
            goto L_0x0091
        L_0x008f:
            r3 = r43
        L_0x0091:
            r19 = 32768(0x8000, float:4.5918E-41)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x009b
            r19 = 0
            goto L_0x009d
        L_0x009b:
            r19 = r44
        L_0x009d:
            r20 = 65536(0x10000, float:9.18355E-41)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00a9
            java.util.ArrayList r20 = new java.util.ArrayList
            r20.<init>()
            goto L_0x00ab
        L_0x00a9:
            r20 = r45
        L_0x00ab:
            r21 = 131072(0x20000, float:1.83671E-40)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00b7
            Jd.b r21 = new Jd.b
            r21.<init>()
            goto L_0x00b9
        L_0x00b7:
            r21 = r46
        L_0x00b9:
            r22 = 262144(0x40000, float:3.67342E-40)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00c5
            Jd.c r22 = new Jd.c
            r22.<init>()
            goto L_0x00c7
        L_0x00c5:
            r22 = r47
        L_0x00c7:
            r23 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r23
            if (r0 == 0) goto L_0x00d3
            Jd.d r0 = new Jd.d
            r0.<init>()
            goto L_0x00d5
        L_0x00d3:
            r0 = r48
        L_0x00d5:
            r25 = r24
            r26 = r4
            r28 = r1
            r29 = r2
            r30 = r6
            r31 = r7
            r33 = r9
            r35 = r11
            r36 = r12
            r37 = r13
            r39 = r15
            r40 = r50
            r41 = r16
            r42 = r17
            r43 = r18
            r44 = r3
            r45 = r19
            r46 = r20
            r47 = r21
            r48 = r22
            r49 = r0
            r25.<init>(r26, r28, r29, r30, r31, r33, r35, r36, r37, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Jd.e.<init>(double, org.maplibre.android.geometry.LatLng, com.ikea.kompassmap.model.store.map.Floor, java.util.List, double, double, com.ikea.kompassmap.model.store.StoreData, org.maplibre.android.maps.E$a, double, java.util.List, org.maplibre.android.maps.o, org.maplibre.android.maps.MapView, org.maplibre.geojson.FeatureCollection, org.maplibre.geojson.FeatureCollection, com.ikea.kompassmap.model.product.ProductData, KL.m, java.util.List, nI.a, nI.l, nI.l, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
