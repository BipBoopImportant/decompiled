package Jd;

import HJ.C15838d;
import Hd.d;
import KL.k;
import KL.m;
import KL.n;
import QJ.C16310i;
import QJ.C16311i0;
import QJ.F0;
import QJ.Q;
import QJ.S;
import QJ.T;
import TJ.C16505B;
import TJ.C16521S;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.f0;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.gson.JsonObject;
import com.ikea.kompassmap.model.product.Availabilities;
import com.ikea.kompassmap.model.product.ClassUnitKey;
import com.ikea.kompassmap.model.product.Communications;
import com.ikea.kompassmap.model.product.ItemKey;
import com.ikea.kompassmap.model.product.Locations;
import com.ikea.kompassmap.model.product.ProductData;
import com.ikea.kompassmap.model.product.SalesLocation;
import com.ikea.kompassmap.model.product.SalesPrices;
import com.ikea.kompassmap.model.store.StoreData;
import com.ikea.kompassmap.model.store.map.ExposedFloor;
import com.ikea.kompassmap.model.store.map.Floor;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import fI.C17220a;
import jI.C17416c;
import jI.C17431r;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.maps.E;
import org.maplibre.android.maps.MapView;
import org.maplibre.android.maps.o;
import org.maplibre.geojson.Feature;
import org.maplibre.geojson.FeatureCollection;
import org.maplibre.geojson.Geometry;
import yd.C10438I;
import yd.C10457k;
import yd.C10461o;

@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0015J)\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010\u0003J%\u0010#\u001a\u0004\u0018\u00010\u00162\u0006\u0010!\u001a\u00020 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b#\u0010$J-\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00160(2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00160\u00112\b\b\u0002\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020 H\u0002¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b/\u0010\bJ!\u00103\u001a\u00020\u00062\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u000600¢\u0006\u0004\b3\u00104J!\u00107\u001a\u00020\u00062\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u000600¢\u0006\u0004\b7\u00104J\u001b\u00109\u001a\u00020\u00062\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00060\u001b¢\u0006\u0004\b9\u0010:J\u0015\u0010=\u001a\u00020\u00062\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\u0015\u0010A\u001a\u00020\u00062\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\u0017\u0010E\u001a\u00020\u00062\b\u0010D\u001a\u0004\u0018\u00010C¢\u0006\u0004\bE\u0010FJ\u0015\u0010I\u001a\u00020\u00062\u0006\u0010H\u001a\u00020G¢\u0006\u0004\bI\u0010JJ\u001b\u0010M\u001a\u00020\u00062\f\u0010L\u001a\b\u0012\u0004\u0012\u00020K0\u0011¢\u0006\u0004\bM\u0010\u0015J\u0015\u0010P\u001a\u00020\u00062\u0006\u0010O\u001a\u00020N¢\u0006\u0004\bP\u0010QJ\u0018\u0010S\u001a\u00020\u00062\u0006\u0010R\u001a\u00020\u0012H@¢\u0006\u0004\bS\u0010TJ\u0015\u0010W\u001a\u00020\u00062\u0006\u0010V\u001a\u00020U¢\u0006\u0004\bW\u0010XJ\u0015\u0010Z\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020U¢\u0006\u0004\bZ\u0010XJ\u0015\u0010[\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0016¢\u0006\u0004\b[\u0010\\J3\u0010_\u001a\u00020\u00062\b\b\u0002\u0010]\u001a\u00020 2\b\b\u0002\u0010^\u001a\u00020 2\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001b¢\u0006\u0004\b_\u0010`J\u0015\u0010c\u001a\u00020\u00062\u0006\u0010b\u001a\u00020a¢\u0006\u0004\bc\u0010dJ\r\u0010e\u001a\u00020\u0006¢\u0006\u0004\be\u0010\u0003J\r\u0010f\u001a\u00020\u0006¢\u0006\u0004\bf\u0010\u0003J\r\u0010g\u001a\u00020\u0006¢\u0006\u0004\bg\u0010\u0003J\u001b\u0010i\u001a\u00020\u00062\f\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00160\u0011¢\u0006\u0004\bi\u0010\u0015R\u001a\u0010n\u001a\u00020 8\u0006XD¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u001a\u0010q\u001a\u00020 8\u0006XD¢\u0006\f\n\u0004\bo\u0010k\u001a\u0004\bp\u0010mR\u001a\u0010t\u001a\u00020 8\u0006XD¢\u0006\f\n\u0004\br\u0010k\u001a\u0004\bs\u0010mR\u001d\u0010{\u001a\b\u0012\u0004\u0012\u00020v0u8\u0006¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR\u001e\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060\u001b8\u0006¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010¨\u0006\u0001"}, d2 = {"LJd/i;", "Landroidx/lifecycle/f0;", "<init>", "()V", "Lcom/ikea/kompassmap/model/store/StoreData;", "storeData", "LXH/N;", "m0", "(Lcom/ikea/kompassmap/model/store/StoreData;)V", "Lorg/maplibre/android/geometry/LatLng;", "center", "b0", "(Lorg/maplibre/android/geometry/LatLng;)V", "", "bearing", "Z", "(D)V", "", "Lcom/ikea/kompassmap/model/store/map/Floor;", "floors", "f0", "(Ljava/util/List;)V", "Lorg/maplibre/geojson/Feature;", "featuresSelected", "l0", "Lorg/maplibre/geojson/Geometry;", "geometry", "Lkotlin/Function0;", "onComplete", "K", "(Lorg/maplibre/geojson/Geometry;LnI/a;)V", "I", "", "id", "layer", "G", "(Ljava/lang/String;Ljava/lang/String;)Lorg/maplibre/geojson/Feature;", "selectedFeatures", "", "toSelected", "", "W", "(Ljava/util/List;Z)Ljava/util/List;", "feature", "newValue", "u0", "(Lorg/maplibre/geojson/Feature;Ljava/lang/String;)Lorg/maplibre/geojson/Feature;", "n0", "Lkotlin/Function1;", "Lyd/o;", "analytics", "Y", "(LnI/l;)V", "Lcom/ikea/kompassmap/model/store/map/ExposedFloor;", "onFloorChange", "d0", "onMapLoaded", "h0", "(LnI/a;)V", "Landroid/content/Context;", "context", "p0", "(Landroid/content/Context;)V", "Lorg/maplibre/android/maps/o;", "mapLibreMap", "g0", "(Lorg/maplibre/android/maps/o;)V", "Lorg/maplibre/android/maps/MapView;", "mapView", "i0", "(Lorg/maplibre/android/maps/MapView;)V", "LKL/m;", "symbolManager", "q0", "(LKL/m;)V", "LKL/n;", "symbols", "r0", "Lcom/ikea/kompassmap/model/product/ProductData;", "productData", "k0", "(Lcom/ikea/kompassmap/model/product/ProductData;)V", "currentFloor", "c0", "(Lcom/ikea/kompassmap/model/store/map/Floor;LdI/e;)Ljava/lang/Object;", "Lorg/maplibre/geojson/FeatureCollection;", "streets", "o0", "(Lorg/maplibre/geojson/FeatureCollection;)V", "buildings", "a0", "N", "(Lorg/maplibre/geojson/Feature;)V", "property", "value", "O", "(Ljava/lang/String;Ljava/lang/String;LnI/a;)V", "LKL/k;", "symbol", "Q", "(LKL/k;)V", "J", "e0", "j0", "clickedFeatures", "F", "m", "Ljava/lang/String;", "S", "()Ljava/lang/String;", "sourceName", "n", "R", "buildingsSourceName", "o", "U", "streetsSourceName", "LTJ/B;", "LJd/e;", "p", "LTJ/B;", "T", "()LTJ/B;", "storeState", "q", "LnI/a;", "V", "()LnI/a;", "unselectFeature", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final String f61240m = "kompass";

    /* renamed from: n  reason: collision with root package name */
    private final String f61241n = "kompass-buildings";

    /* renamed from: o  reason: collision with root package name */
    private final String f61242o = "kompass-streets";

    /* renamed from: p  reason: collision with root package name */
    private final C16505B<e> f61243p = C16521S.a(new e(0.0d, (LatLng) null, (Floor) null, (List) null, 0.0d, 0.0d, (StoreData) null, (E.a) null, 0.0d, (List) null, (o) null, (MapView) null, (FeatureCollection) null, (FeatureCollection) null, (ProductData) null, (m) null, (List) null, (C17631a) null, (C17642l) null, (C17642l) null, 1048575, (DefaultConstructorMarker) null));

    /* renamed from: q  reason: collision with root package name */
    private final C17631a<C16807N> f61244q = new g(this);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "com.ikea.kompassmap.viewModel.StoreViewModel$setCurrentFloor$2", f = "StoreViewModel.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f61245c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ i f61246d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Floor f61247e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar, Floor floor, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f61246d = iVar;
            this.f61247e = floor;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f61246d, this.f61247e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f61245c == 0) {
                y.b(obj);
                this.f61246d.T().getValue().r().invoke(this.f61247e.toExposedFloor());
                C16505B<e> T10 = this.f61246d.T();
                Floor floor = this.f61247e;
                while (true) {
                    e value = T10.getValue();
                    Floor floor2 = floor;
                    if (T10.e(value, e.h(value, 0.0d, (LatLng) null, floor, (List) null, 0.0d, 0.0d, (StoreData) null, (E.a) null, 0.0d, (List) null, (o) null, (MapView) null, (FeatureCollection) null, (FeatureCollection) null, (ProductData) null, (m) null, (List) null, (C17631a) null, (C17642l) null, (C17642l) null, 1048571, (Object) null))) {
                        return C16807N.f139792a;
                    }
                    floor = floor2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "com.ikea.kompassmap.viewModel.StoreViewModel$setSelectedFeatures$1", f = "StoreViewModel.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f61248c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ i f61249d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List<Feature> f61250e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar, List<Feature> list, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f61249d = iVar;
            this.f61250e = list;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f61249d, this.f61250e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            List<Feature> list;
            List<Feature> data;
            C17187b.f();
            if (this.f61248c == 0) {
                y.b(obj);
                if (!this.f61249d.T().getValue().u().isEmpty()) {
                    this.f61249d.V().invoke();
                }
                Floor m10 = this.f61249d.T().getValue().m();
                if (m10 == null || (data = m10.getData()) == null || (list = C16877v.V0(data, this.f61250e)) == null) {
                    list = this.f61250e;
                }
                List<Feature> list2 = list;
                Floor m11 = this.f61249d.T().getValue().m();
                Floor copy$default = m11 != null ? Floor.copy$default(m11, (String) null, (String) null, (String) null, 0, list2, 15, (Object) null) : null;
                C16505B<e> T10 = this.f61249d.T();
                List<Feature> list3 = this.f61250e;
                while (true) {
                    e value = T10.getValue();
                    List<Feature> list4 = list3;
                    C16505B<e> b10 = T10;
                    if (b10.e(value, e.h(value, 0.0d, (LatLng) null, copy$default, (List) null, 0.0d, 0.0d, (StoreData) null, (E.a) null, 0.0d, list4, (o) null, (MapView) null, (FeatureCollection) null, (FeatureCollection) null, (ProductData) null, (m) null, (List) null, (C17631a) null, (C17642l) null, (C17642l) null, 1048059, (Object) null))) {
                        return C16807N.f139792a;
                    }
                    T10 = b10;
                    list3 = list4;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "com.ikea.kompassmap.viewModel.StoreViewModel$setStoreState$1", f = "StoreViewModel.kt", l = {91}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f61251c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ StoreData f61252d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ i f61253e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(StoreData storeData, i iVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f61252d = storeData;
            this.f61253e = iVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f61252d, this.f61253e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: com.ikea.kompassmap.model.store.map.Floor} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r9.f61251c
                r2 = 1
                if (r1 == 0) goto L_0x0018
                if (r1 != r2) goto L_0x0010
                XH.y.b(r10)
                goto L_0x009c
            L_0x0010:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x0018:
                XH.y.b(r10)
                com.ikea.kompassmap.model.store.StoreData r10 = r9.f61252d
                com.ikea.kompassmap.model.store.map.StoreMap r10 = r10.getMap()
                if (r10 == 0) goto L_0x009c
                Jd.i r1 = r9.f61253e
                com.ikea.kompassmap.model.store.StoreData r3 = r9.f61252d
                com.ikea.kompassmap.model.store.map.StoreMap r4 = r3.getMap()
                java.util.List r4 = r4.getFloors()
                r1.f0(r4)
                double r4 = r10.getDisplayBearing()
                r1.Z(r4)
                org.maplibre.android.geometry.LatLng r4 = new org.maplibre.android.geometry.LatLng
                org.maplibre.geojson.Point r5 = r10.getDisplayPoint()
                double r5 = r5.latitude()
                org.maplibre.geojson.Point r10 = r10.getDisplayPoint()
                double r7 = r10.longitude()
                r4.<init>(r5, r7)
                r1.b0(r4)
                com.ikea.kompassmap.model.store.map.StoreMap r10 = r3.getMap()
                java.util.List r10 = r10.getFloors()
                java.lang.Iterable r10 = (java.lang.Iterable) r10
                java.util.Iterator r10 = r10.iterator()
            L_0x005f:
                boolean r4 = r10.hasNext()
                if (r4 == 0) goto L_0x007f
                java.lang.Object r4 = r10.next()
                r5 = r4
                com.ikea.kompassmap.model.store.map.Floor r5 = (com.ikea.kompassmap.model.store.map.Floor) r5
                java.lang.String r5 = r5.getFloorId()
                com.ikea.kompassmap.model.store.map.StoreMap r6 = r3.getMap()
                java.lang.String r6 = r6.getDefaultFloor()
                boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r6)
                if (r5 == 0) goto L_0x005f
                goto L_0x0080
            L_0x007f:
                r4 = 0
            L_0x0080:
                com.ikea.kompassmap.model.store.map.Floor r4 = (com.ikea.kompassmap.model.store.map.Floor) r4
                if (r4 != 0) goto L_0x0093
                com.ikea.kompassmap.model.store.map.StoreMap r10 = r3.getMap()
                java.util.List r10 = r10.getFloors()
                java.lang.Object r10 = YH.C16877v.w0(r10)
                r4 = r10
                com.ikea.kompassmap.model.store.map.Floor r4 = (com.ikea.kompassmap.model.store.map.Floor) r4
            L_0x0093:
                r9.f61251c = r2
                java.lang.Object r10 = r1.c0(r4, r9)
                if (r10 != r0) goto L_0x009c
                return r0
            L_0x009c:
                Jd.i r10 = r9.f61253e
                com.ikea.kompassmap.model.store.StoreData r0 = r9.f61252d
                r10.m0(r0)
                XH.N r10 = XH.C16807N.f139792a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: Jd.i.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public i() {
    }

    private final Feature G(String str, String str2) {
        Feature next;
        loop0:
        for (Floor data : this.f61243p.getValue().n()) {
            Iterator<Feature> it = data.getData().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    String stringProperty = next.getStringProperty("layer");
                    if ((str2 == null || C17542s.e(stringProperty, str2)) && (C17542s.e(next.getStringProperty("uid"), str) || C17542s.e(next.getStringProperty("kioskId"), str))) {
                        return next;
                    }
                }
            }
            return next;
        }
        return null;
    }

    static /* synthetic */ Feature H(i iVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return iVar.G(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        r5 = (r5 = r5.getAsJsonObject()).get("productFloor");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void I() {
        /*
            r8 = this;
            TJ.B<Jd.e> r0 = r8.f61243p
            java.lang.Object r0 = r0.getValue()
            Jd.e r0 = (Jd.e) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r2 = r0.z()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0017:
            boolean r3 = r2.hasNext()
            r4 = 0
            if (r3 == 0) goto L_0x0067
            java.lang.Object r3 = r2.next()
            KL.n r3 = (KL.n) r3
            com.google.gson.JsonElement r5 = r3.c()
            if (r5 == 0) goto L_0x003d
            com.google.gson.JsonObject r5 = r5.getAsJsonObject()
            if (r5 == 0) goto L_0x003d
            java.lang.String r6 = "productFloor"
            com.google.gson.JsonElement r5 = r5.get(r6)
            if (r5 == 0) goto L_0x003d
            java.lang.String r5 = r5.getAsString()
            goto L_0x003e
        L_0x003d:
            r5 = r4
        L_0x003e:
            com.ikea.kompassmap.model.store.map.Floor r6 = r0.m()
            if (r6 == 0) goto L_0x0048
            java.lang.String r4 = r6.getFloorId()
        L_0x0048:
            boolean r4 = kotlin.jvm.internal.C17542s.e(r5, r4)
            if (r4 == 0) goto L_0x0017
            org.maplibre.android.geometry.LatLng r3 = r3.d()
            double r4 = r3.b()
            double r6 = r3.a()
            org.maplibre.geojson.Point r3 = org.maplibre.geojson.Point.fromLngLat(r4, r6)
            java.lang.String r4 = "fromLngLat(...)"
            kotlin.jvm.internal.C17542s.i(r3, r4)
            r1.add(r3)
            goto L_0x0017
        L_0x0067:
            int r0 = r1.size()
            r2 = 3
            r3 = 2
            if (r0 < r2) goto L_0x007e
            java.util.List r0 = YH.C16877v.e(r1)
            org.maplibre.geojson.Polygon r0 = org.maplibre.geojson.Polygon.fromLngLats((java.util.List<java.util.List<org.maplibre.geojson.Point>>) r0)
            kotlin.jvm.internal.C17542s.g(r0)
            L(r8, r0, r4, r3, r4)
            goto L_0x00f0
        L_0x007e:
            int r0 = r1.size()
            r2 = 1
            r5 = 0
            if (r0 != r3) goto L_0x00e1
            org.maplibre.android.geometry.LatLngBounds$a r0 = new org.maplibre.android.geometry.LatLngBounds$a
            r0.<init>()
            org.maplibre.android.geometry.LatLng r3 = new org.maplibre.android.geometry.LatLng
            java.lang.Object r4 = r1.get(r5)
            org.maplibre.geojson.Point r4 = (org.maplibre.geojson.Point) r4
            double r6 = r4.latitude()
            java.lang.Object r4 = r1.get(r5)
            org.maplibre.geojson.Point r4 = (org.maplibre.geojson.Point) r4
            double r4 = r4.longitude()
            r3.<init>(r6, r4)
            org.maplibre.android.geometry.LatLngBounds$a r0 = r0.b(r3)
            org.maplibre.android.geometry.LatLng r3 = new org.maplibre.android.geometry.LatLng
            java.lang.Object r4 = r1.get(r2)
            org.maplibre.geojson.Point r4 = (org.maplibre.geojson.Point) r4
            double r4 = r4.latitude()
            java.lang.Object r1 = r1.get(r2)
            org.maplibre.geojson.Point r1 = (org.maplibre.geojson.Point) r1
            double r1 = r1.longitude()
            r3.<init>(r4, r1)
            org.maplibre.android.geometry.LatLngBounds$a r0 = r0.b(r3)
            org.maplibre.android.geometry.LatLngBounds r0 = r0.a()
            TJ.B<Jd.e> r1 = r8.f61243p
            java.lang.Object r1 = r1.getValue()
            Jd.e r1 = (Jd.e) r1
            org.maplibre.android.maps.o r1 = r1.o()
            if (r1 == 0) goto L_0x00f0
            r2 = 100
            yL.b r0 = org.maplibre.android.camera.a.b(r0, r2)
            r1.f(r0)
            goto L_0x00f0
        L_0x00e1:
            int r0 = r1.size()
            if (r0 != r2) goto L_0x00f0
            java.lang.Object r0 = r1.get(r5)
            org.maplibre.geojson.Geometry r0 = (org.maplibre.geojson.Geometry) r0
            L(r8, r0, r4, r3, r4)
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Jd.i.I():void");
    }

    private final void K(Geometry geometry, C17631a<C16807N> aVar) {
        CameraPosition cameraPosition;
        int[] iArr = {50, 50, 50, 50};
        o o10 = this.f61243p.getValue().o();
        if (o10 != null) {
            cameraPosition = o10.j(geometry, iArr, this.f61243p.getValue().j(), 0.0d);
        } else {
            cameraPosition = null;
        }
        if (cameraPosition != null) {
            CameraPosition b10 = new CameraPosition.a().d(cameraPosition.target).f(cameraPosition.zoom).e(this.f61243p.getValue().A()).a(cameraPosition.bearing).b();
            o o11 = this.f61243p.getValue().o();
            if (o11 != null) {
                o11.g(org.maplibre.android.camera.a.a(b10), 700);
            }
            if (aVar != null) {
                new Handler(Looper.getMainLooper()).postDelayed(new f(aVar), (long) 700);
            }
        }
    }

    static /* synthetic */ void L(i iVar, Geometry geometry, C17631a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        iVar.K(geometry, aVar);
    }

    /* access modifiers changed from: private */
    public static final void M(C17631a aVar) {
        aVar.invoke();
    }

    public static /* synthetic */ void P(i iVar, String str, String str2, C17631a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "layer";
        }
        if ((i10 & 2) != 0) {
            str2 = C10438I.FLOOR_OUTLINE.b();
        }
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        iVar.O(str, str2, aVar);
    }

    private final List<Feature> W(List<Feature> list, boolean z10) {
        Feature feature;
        ArrayList arrayList = new ArrayList();
        for (Feature next : list) {
            C17220a<C10457k> b10 = C10457k.b();
            if (b10 == null || !b10.isEmpty()) {
                Iterator<T> it = b10.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (C17542s.e(((C10457k) it.next()).j(), next.getStringProperty("layer"))) {
                        String stringProperty = next.getStringProperty("uid");
                        String str = null;
                        if (stringProperty == null || (feature = H(this, stringProperty, (String) null, 2, (Object) null)) == null) {
                            String stringProperty2 = next.getStringProperty("kioskId");
                            feature = stringProperty2 != null ? H(this, stringProperty2, (String) null, 2, (Object) null) : null;
                        }
                        String stringProperty3 = feature != null ? feature.getStringProperty("layer") : null;
                        C10438I i10 = C10438I.DEPARTMENTS;
                        if (C17542s.e(stringProperty3, i10.b()) || C17542s.e(stringProperty3, C10438I.DEPARTMENTS_SELECTED.b())) {
                            C10438I i11 = C10438I.DEPARTMENTS_SELECTED;
                            if (!C17542s.e(stringProperty3, i11.b()) || !z10) {
                                arrayList.add(u0(feature, z10 ? i11.b() : i10.b()));
                            }
                        } else {
                            C10438I i12 = C10438I.DIVISIONS;
                            if (C17542s.e(stringProperty3, i12.b()) || C17542s.e(stringProperty3, C10438I.DIVISIONS_SELECTED.b())) {
                                C10438I i13 = C10438I.DIVISIONS_SELECTED;
                                if (!C17542s.e(stringProperty3, i13.b()) || !z10) {
                                    arrayList.add(u0(feature, z10 ? i13.b() : i12.b()));
                                }
                            } else {
                                C10438I i14 = C10438I.POINTS_OF_INTEREST;
                                if (C17542s.e(stringProperty3, i14.b()) || C17542s.e(stringProperty3, C10438I.POINTS_OF_INTEREST_SELECTED.b())) {
                                    C10438I i15 = C10438I.POINTS_OF_INTEREST_SELECTED;
                                    if (!C17542s.e(stringProperty3, i15.b()) || !z10) {
                                        arrayList.add(u0(feature, z10 ? i15.b() : i14.b()));
                                    }
                                } else {
                                    if (feature != null) {
                                        str = feature.getStringProperty("type");
                                    }
                                    if (C17542s.e(str, "POI_TYPE_NAVIGATION")) {
                                        C10438I i16 = C10438I.CONNECTORS_SELECTED;
                                        if (!C17542s.e(stringProperty3, i16.b()) || !z10) {
                                            arrayList.add(u0(feature, z10 ? i16.b() : C10438I.CONNECTORS.b()));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    static /* synthetic */ List X(i iVar, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return iVar.W(list, z10);
    }

    /* access modifiers changed from: private */
    public final void Z(double d10) {
        e value;
        C16505B<e> b10 = this.f61243p;
        do {
            value = b10.getValue();
        } while (!b10.e(value, e.h(value, d10, (LatLng) null, (Floor) null, (List) null, 0.0d, 0.0d, (StoreData) null, (E.a) null, 0.0d, (List) null, (o) null, (MapView) null, (FeatureCollection) null, (FeatureCollection) null, (ProductData) null, (m) null, (List) null, (C17631a) null, (C17642l) null, (C17642l) null, 1048574, (Object) null)));
    }

    /* access modifiers changed from: private */
    public final void b0(LatLng latLng) {
        e value;
        C16505B<e> b10 = this.f61243p;
        do {
            value = b10.getValue();
        } while (!b10.e(value, e.h(value, 0.0d, latLng, (Floor) null, (List) null, 0.0d, 0.0d, (StoreData) null, (E.a) null, 0.0d, (List) null, (o) null, (MapView) null, (FeatureCollection) null, (FeatureCollection) null, (ProductData) null, (m) null, (List) null, (C17631a) null, (C17642l) null, (C17642l) null, 1048573, (Object) null)));
    }

    /* access modifiers changed from: private */
    public final void f0(List<Floor> list) {
        e value;
        C16505B<e> b10 = this.f61243p;
        do {
            value = b10.getValue();
        } while (!b10.e(value, e.h(value, 0.0d, (LatLng) null, (Floor) null, list, 0.0d, 0.0d, (StoreData) null, (E.a) null, 0.0d, (List) null, (o) null, (MapView) null, (FeatureCollection) null, (FeatureCollection) null, (ProductData) null, (m) null, (List) null, (C17631a) null, (C17642l) null, (C17642l) null, 1048567, (Object) null)));
    }

    private final void l0(List<Feature> list) {
        F0 unused = C16314k.d(S.a(C16311i0.a()), (C17168i) null, (T) null, new b(this, list, (C17164e<? super b>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void m0(StoreData storeData) {
        e value;
        C16505B<e> b10 = this.f61243p;
        do {
            value = b10.getValue();
        } while (!b10.e(value, e.h(value, 0.0d, (LatLng) null, (Floor) null, (List) null, 0.0d, 0.0d, storeData, (E.a) null, 0.0d, (List) null, (o) null, (MapView) null, (FeatureCollection) null, (FeatureCollection) null, (ProductData) null, (m) null, (List) null, (C17631a) null, (C17642l) null, (C17642l) null, 1048511, (Object) null)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.ikea.kompassmap.model.store.map.Floor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.String} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final XH.C16807N s0(Jd.i r30) {
        /*
            r0 = r30
            TJ.B<Jd.e> r1 = r0.f61243p
            java.lang.Object r1 = r1.getValue()
            Jd.e r1 = (Jd.e) r1
            java.util.List r1 = r1.u()
            r2 = 0
            java.util.List r1 = r0.W(r1, r2)
            TJ.B<Jd.e> r2 = r0.f61243p
            java.lang.Object r2 = r2.getValue()
            Jd.e r2 = (Jd.e) r2
            java.util.List r2 = r2.n()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r8 = new java.util.ArrayList
            r3 = 10
            int r3 = YH.C16877v.y(r2, r3)
            r8.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x0030:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0096
            java.lang.Object r3 = r2.next()
            r9 = r3
            com.ikea.kompassmap.model.store.map.Floor r9 = (com.ikea.kompassmap.model.store.map.Floor) r9
            java.util.List r3 = r9.getData()
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.List r14 = YH.C16877v.w1(r3)
            r3 = r1
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x004e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0086
            java.lang.Object r4 = r3.next()
            org.maplibre.geojson.Feature r4 = (org.maplibre.geojson.Feature) r4
            java.lang.String r5 = "floor"
            java.lang.String r5 = r4.getStringProperty(r5)
            if (r5 == 0) goto L_0x004e
            java.lang.String r6 = r9.getFloorId()
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r6)
            if (r5 == 0) goto L_0x004e
            java.lang.String r5 = "uid"
            java.lang.String r5 = r4.getStringProperty(r5)
            if (r5 != 0) goto L_0x007a
            java.lang.String r5 = "kioskId"
            java.lang.String r5 = r4.getStringProperty(r5)
        L_0x007a:
            Jd.h r6 = new Jd.h
            r6.<init>(r5)
            YH.C16877v.L(r14, r6)
            r14.add(r4)
            goto L_0x004e
        L_0x0086:
            r15 = 15
            r16 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            com.ikea.kompassmap.model.store.map.Floor r3 = com.ikea.kompassmap.model.store.map.Floor.copy$default(r9, r10, r11, r12, r13, r14, r15, r16)
            r8.add(r3)
            goto L_0x0030
        L_0x0096:
            TJ.B<Jd.e> r0 = r0.f61243p
        L_0x0098:
            java.lang.Object r1 = r0.getValue()
            r3 = r1
            Jd.e r3 = (Jd.e) r3
            java.util.List r17 = YH.C16877v.n()
            java.util.Iterator r2 = r8.iterator()
        L_0x00a7:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x00ca
            java.lang.Object r4 = r2.next()
            r6 = r4
            com.ikea.kompassmap.model.store.map.Floor r6 = (com.ikea.kompassmap.model.store.map.Floor) r6
            java.lang.String r6 = r6.getFloorId()
            com.ikea.kompassmap.model.store.map.Floor r7 = r3.m()
            if (r7 == 0) goto L_0x00c3
            java.lang.String r5 = r7.getFloorId()
        L_0x00c3:
            boolean r5 = kotlin.jvm.internal.C17542s.e(r6, r5)
            if (r5 == 0) goto L_0x00a7
            r5 = r4
        L_0x00ca:
            r7 = r5
            com.ikea.kompassmap.model.store.map.Floor r7 = (com.ikea.kompassmap.model.store.map.Floor) r7
            r28 = 1048051(0xffdf3, float:1.468632E-39)
            r29 = 0
            r4 = 0
            r6 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r2 = r8
            Jd.e r3 = Jd.e.h(r3, r4, r6, r7, r8, r9, r11, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            boolean r1 = r0.e(r1, r3)
            if (r1 == 0) goto L_0x00ff
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x00ff:
            r8 = r2
            goto L_0x0098
        */
        throw new UnsupportedOperationException("Method not decompiled: Jd.i.s0(Jd.i):XH.N");
    }

    /* access modifiers changed from: private */
    public static final boolean t0(String str, Feature feature) {
        C17542s.j(feature, "it");
        return C17542s.e(feature.getStringProperty("uid"), str) || C17542s.e(feature.getStringProperty("kioskId"), str);
    }

    private final Feature u0(Feature feature, String str) {
        JsonObject properties = feature.properties();
        if (properties != null) {
            properties.addProperty("layer", str);
        } else {
            Log.w("UpdateFeatureProp", "Failed to update feature property with value " + str + " since property is null");
        }
        Feature fromGeometry = Feature.fromGeometry(feature.geometry(), properties, feature.id());
        C17542s.i(fromGeometry, "fromGeometry(...)");
        return fromGeometry;
    }

    public final void F(List<Feature> list) {
        C17542s.j(list, "clickedFeatures");
        l0(X(this, list, false, 2, (Object) null));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        r2 = (r2 = r2.getAsJsonObject()).get("productFloor");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void J() {
        /*
            r8 = this;
            TJ.B<Jd.e> r0 = r8.f61243p
            java.lang.Object r0 = r0.getValue()
            Jd.e r0 = (Jd.e) r0
            java.util.List r1 = r0.z()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r2 = r1 instanceof java.util.Collection
            r3 = 0
            if (r2 == 0) goto L_0x001d
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x001d
            goto L_0x005d
        L_0x001d:
            java.util.Iterator r1 = r1.iterator()
        L_0x0021:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x005d
            java.lang.Object r2 = r1.next()
            KL.n r2 = (KL.n) r2
            com.google.gson.JsonElement r2 = r2.c()
            if (r2 == 0) goto L_0x0046
            com.google.gson.JsonObject r2 = r2.getAsJsonObject()
            if (r2 == 0) goto L_0x0046
            java.lang.String r4 = "productFloor"
            com.google.gson.JsonElement r2 = r2.get(r4)
            if (r2 == 0) goto L_0x0046
            java.lang.String r2 = r2.getAsString()
            goto L_0x0047
        L_0x0046:
            r2 = r3
        L_0x0047:
            com.ikea.kompassmap.model.store.map.Floor r4 = r0.m()
            if (r4 == 0) goto L_0x0052
            java.lang.String r4 = r4.getFloorId()
            goto L_0x0053
        L_0x0052:
            r4 = r3
        L_0x0053:
            boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r4)
            if (r2 == 0) goto L_0x0021
            r8.I()
            return
        L_0x005d:
            java.util.List r1 = r0.u()
            java.lang.Object r1 = YH.C16877v.y0(r1)
            org.maplibre.geojson.Feature r1 = (org.maplibre.geojson.Feature) r1
            if (r1 == 0) goto L_0x0083
            java.lang.String r2 = "floor"
            java.lang.String r2 = r1.getStringProperty(r2)
            com.ikea.kompassmap.model.store.map.Floor r0 = r0.m()
            if (r0 == 0) goto L_0x0079
            java.lang.String r3 = r0.getFloorId()
        L_0x0079:
            boolean r0 = kotlin.jvm.internal.C17542s.e(r2, r3)
            if (r0 == 0) goto L_0x0083
            r8.N(r1)
            return
        L_0x0083:
            r6 = 7
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r2 = r8
            P(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Jd.i.J():void");
    }

    public final void N(Feature feature) {
        C17542s.j(feature, "feature");
        Geometry geometry = feature.geometry();
        if (geometry != null) {
            L(this, geometry, (C17631a) null, 2, (Object) null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: org.maplibre.geojson.Feature} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: org.maplibre.geojson.Feature} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: org.maplibre.geojson.Feature} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: org.maplibre.geojson.Feature} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: org.maplibre.geojson.Feature} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void O(java.lang.String r5, java.lang.String r6, nI.C17631a<XH.C16807N> r7) {
        /*
            r4 = this;
            java.lang.String r0 = "property"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            TJ.B<Jd.e> r0 = r4.f61243p
            java.lang.Object r0 = r0.getValue()
            Jd.e r0 = (Jd.e) r0
            com.ikea.kompassmap.model.store.map.Floor r0 = r0.m()
            r1 = 0
            if (r0 == 0) goto L_0x003f
            java.util.List r0 = r0.getData()
            if (r0 == 0) goto L_0x003f
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0025:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x003d
            java.lang.Object r2 = r0.next()
            r3 = r2
            org.maplibre.geojson.Feature r3 = (org.maplibre.geojson.Feature) r3
            java.lang.String r3 = r3.getStringProperty(r5)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r6)
            if (r3 == 0) goto L_0x0025
            r1 = r2
        L_0x003d:
            org.maplibre.geojson.Feature r1 = (org.maplibre.geojson.Feature) r1
        L_0x003f:
            if (r1 == 0) goto L_0x004a
            org.maplibre.geojson.Geometry r5 = r1.geometry()
            if (r5 == 0) goto L_0x004a
            r4.K(r5, r7)
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Jd.i.O(java.lang.String, java.lang.String, nI.a):void");
    }

    public final void Q(k kVar) {
        C17542s.j(kVar, "symbol");
        Geometry b10 = kVar.b();
        C17542s.i(b10, "getGeometry(...)");
        L(this, b10, (C17631a) null, 2, (Object) null);
    }

    public final String R() {
        return this.f61241n;
    }

    public final String S() {
        return this.f61240m;
    }

    public final C16505B<e> T() {
        return this.f61243p;
    }

    public final String U() {
        return this.f61242o;
    }

    public final C17631a<C16807N> V() {
        return this.f61244q;
    }

    public final void Y(C17642l<? super C10461o, C16807N> lVar) {
        C17542s.j(lVar, "analytics");
        C16505B<e> b10 = this.f61243p;
        while (true) {
            e value = b10.getValue();
            C16505B<e> b11 = b10;
            if (!b11.e(value, e.h(value, 0.0d, (LatLng) null, (Floor) null, (List) null, 0.0d, 0.0d, (StoreData) null, (E.a) null, 0.0d, (List) null, (o) null, (MapView) null, (FeatureCollection) null, (FeatureCollection) null, (ProductData) null, (m) null, (List) null, (C17631a) null, (C17642l) null, lVar, 524287, (Object) null))) {
                C17642l<? super C10461o, C16807N> lVar2 = lVar;
                b10 = b11;
            } else {
                return;
            }
        }
    }

    public final void a0(FeatureCollection featureCollection) {
        C17542s.j(featureCollection, "buildings");
        C16505B<e> b10 = this.f61243p;
        while (true) {
            e value = b10.getValue();
            C16505B<e> b11 = b10;
            if (!b11.e(value, e.h(value, 0.0d, (LatLng) null, (Floor) null, (List) null, 0.0d, 0.0d, (StoreData) null, (E.a) null, 0.0d, (List) null, (o) null, (MapView) null, (FeatureCollection) null, featureCollection, (ProductData) null, (m) null, (List) null, (C17631a) null, (C17642l) null, (C17642l) null, 1040383, (Object) null))) {
                FeatureCollection featureCollection2 = featureCollection;
                b10 = b11;
            } else {
                return;
            }
        }
    }

    public final Object c0(Floor floor, C17164e<? super C16807N> eVar) {
        Object g10 = C16310i.g(C16311i0.a(), new a(this, floor, (C17164e<? super a>) null), eVar);
        return g10 == C17187b.f() ? g10 : C16807N.f139792a;
    }

    public final void d0(C17642l<? super ExposedFloor, C16807N> lVar) {
        C17542s.j(lVar, "onFloorChange");
        C16505B<e> b10 = this.f61243p;
        while (true) {
            e value = b10.getValue();
            C16505B<e> b11 = b10;
            if (!b11.e(value, e.h(value, 0.0d, (LatLng) null, (Floor) null, (List) null, 0.0d, 0.0d, (StoreData) null, (E.a) null, 0.0d, (List) null, (o) null, (MapView) null, (FeatureCollection) null, (FeatureCollection) null, (ProductData) null, (m) null, (List) null, (C17631a) null, lVar, (C17642l) null, 786431, (Object) null))) {
                C17642l<? super ExposedFloor, C16807N> lVar2 = lVar;
                b10 = b11;
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: org.maplibre.geojson.Feature} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: org.maplibre.geojson.Feature} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: org.maplibre.geojson.Feature} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: org.maplibre.geojson.Feature} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: org.maplibre.geojson.Feature} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e0() {
        /*
            r5 = this;
            TJ.B<Jd.e> r0 = r5.f61243p
            java.lang.Object r0 = r0.getValue()
            Jd.e r0 = (Jd.e) r0
            com.ikea.kompassmap.model.store.map.Floor r0 = r0.m()
            r1 = 0
            if (r0 == 0) goto L_0x003d
            java.util.List r0 = r0.getData()
            if (r0 == 0) goto L_0x003d
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x003b
            java.lang.Object r2 = r0.next()
            r3 = r2
            org.maplibre.geojson.Feature r3 = (org.maplibre.geojson.Feature) r3
            java.lang.String r4 = "layer"
            java.lang.String r3 = r3.getStringProperty(r4)
            yd.I r4 = yd.C10438I.FLOOR_OUTLINE
            java.lang.String r4 = r4.b()
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r4)
            if (r3 == 0) goto L_0x001b
            r1 = r2
        L_0x003b:
            org.maplibre.geojson.Feature r1 = (org.maplibre.geojson.Feature) r1
        L_0x003d:
            if (r1 == 0) goto L_0x0058
            Hd.e r0 = Hd.e.f60766a
            org.maplibre.android.geometry.LatLngBounds r0 = r0.c(r1)
            if (r0 == 0) goto L_0x0058
            TJ.B<Jd.e> r1 = r5.f61243p
            java.lang.Object r1 = r1.getValue()
            Jd.e r1 = (Jd.e) r1
            org.maplibre.android.maps.o r1 = r1.o()
            if (r1 == 0) goto L_0x0058
            r1.S(r0)
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Jd.i.e0():void");
    }

    public final void g0(o oVar) {
        C17542s.j(oVar, "mapLibreMap");
        C16505B<e> b10 = this.f61243p;
        while (true) {
            e value = b10.getValue();
            C16505B<e> b11 = b10;
            if (!b11.e(value, e.h(value, 0.0d, (LatLng) null, (Floor) null, (List) null, 0.0d, 0.0d, (StoreData) null, (E.a) null, 0.0d, (List) null, oVar, (MapView) null, (FeatureCollection) null, (FeatureCollection) null, (ProductData) null, (m) null, (List) null, (C17631a) null, (C17642l) null, (C17642l) null, 1047551, (Object) null))) {
                o oVar2 = oVar;
                b10 = b11;
            } else {
                return;
            }
        }
    }

    public final void h0(C17631a<C16807N> aVar) {
        C17542s.j(aVar, "onMapLoaded");
        C16505B<e> b10 = this.f61243p;
        while (true) {
            e value = b10.getValue();
            C16505B<e> b11 = b10;
            if (!b11.e(value, e.h(value, 0.0d, (LatLng) null, (Floor) null, (List) null, 0.0d, 0.0d, (StoreData) null, (E.a) null, 0.0d, (List) null, (o) null, (MapView) null, (FeatureCollection) null, (FeatureCollection) null, (ProductData) null, (m) null, (List) null, aVar, (C17642l) null, (C17642l) null, 917503, (Object) null))) {
                C17631a<C16807N> aVar2 = aVar;
                b10 = b11;
            } else {
                return;
            }
        }
    }

    public final void i0(MapView mapView) {
        e value;
        C16505B<e> b10 = this.f61243p;
        do {
            value = b10.getValue();
        } while (!b10.e(value, e.h(value, 0.0d, (LatLng) null, (Floor) null, (List) null, 0.0d, 0.0d, (StoreData) null, (E.a) null, 0.0d, (List) null, (o) null, mapView, (FeatureCollection) null, (FeatureCollection) null, (ProductData) null, (m) null, (List) null, (C17631a) null, (C17642l) null, (C17642l) null, 1046527, (Object) null)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j0() {
        /*
            r5 = this;
            TJ.B<Jd.e> r0 = r5.f61243p
            java.lang.Object r0 = r0.getValue()
            Jd.e r0 = (Jd.e) r0
            org.maplibre.android.maps.o r0 = r0.o()
            if (r0 == 0) goto L_0x0029
            double r0 = r0.x()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            double r1 = r0.doubleValue()
            r3 = 4626041242239631360(0x4033000000000000, double:19.0)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            if (r0 == 0) goto L_0x0029
            double r0 = r0.doubleValue()
            goto L_0x0035
        L_0x0029:
            TJ.B<Jd.e> r0 = r5.f61243p
            java.lang.Object r0 = r0.getValue()
            Jd.e r0 = (Jd.e) r0
            double r0 = r0.q()
        L_0x0035:
            TJ.B<Jd.e> r2 = r5.f61243p
            java.lang.Object r2 = r2.getValue()
            Jd.e r2 = (Jd.e) r2
            org.maplibre.android.maps.o r2 = r2.o()
            if (r2 == 0) goto L_0x0046
            r2.U(r0)
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Jd.i.j0():void");
    }

    public final void k0(ProductData productData) {
        C17542s.j(productData, "productData");
        SalesLocation salesLocation = (SalesLocation) C16877v.y0(productData.getLocations().getSalesLocations());
        String str = null;
        Feature f10 = d.f60755a.f(this.f61243p.getValue().n(), salesLocation != null ? salesLocation.getId() : null);
        if (f10 != null) {
            str = f10.getStringProperty(PlaceTypes.FLOOR);
        }
        String str2 = str;
        C16505B<e> b10 = this.f61243p;
        while (true) {
            e value = b10.getValue();
            if (b10.e(value, e.h(value, 0.0d, (LatLng) null, (Floor) null, (List) null, 0.0d, 0.0d, (StoreData) null, (E.a) null, 0.0d, (List) null, (o) null, (MapView) null, (FeatureCollection) null, (FeatureCollection) null, ProductData.copy$default(productData, (ClassUnitKey) null, (ItemKey) null, (Locations) null, (Communications) null, (SalesPrices) null, (Availabilities) null, str2, f10, 63, (Object) null), (m) null, (List) null, (C17631a) null, (C17642l) null, (C17642l) null, 1032191, (Object) null))) {
                return;
            }
        }
    }

    public final void n0(StoreData storeData) {
        C17542s.j(storeData, "storeData");
        F0 unused = C16314k.d(S.a(C16311i0.a()), (C17168i) null, (T) null, new c(storeData, this, (C17164e<? super c>) null), 3, (Object) null);
    }

    public final void o0(FeatureCollection featureCollection) {
        C17542s.j(featureCollection, "streets");
        C16505B<e> b10 = this.f61243p;
        while (true) {
            e value = b10.getValue();
            C16505B<e> b11 = b10;
            if (!b11.e(value, e.h(value, 0.0d, (LatLng) null, (Floor) null, (List) null, 0.0d, 0.0d, (StoreData) null, (E.a) null, 0.0d, (List) null, (o) null, (MapView) null, featureCollection, (FeatureCollection) null, (ProductData) null, (m) null, (List) null, (C17631a) null, (C17642l) null, (C17642l) null, 1044479, (Object) null))) {
                FeatureCollection featureCollection2 = featureCollection;
                b10 = b11;
            } else {
                return;
            }
        }
    }

    public final void p0(Context context) {
        Throwable th2;
        e value;
        C17542s.j(context, "context");
        InputStream open = context.getAssets().open("style.json");
        C17542s.i(open, "open(...)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, C15838d.f135279b), 8192);
        try {
            String h10 = C17431r.h(bufferedReader);
            C17416c.a(bufferedReader, (Throwable) null);
            C16505B<e> b10 = this.f61243p;
            do {
                value = b10.getValue();
            } while (!b10.e(value, e.h(value, 0.0d, (LatLng) null, (Floor) null, (List) null, 0.0d, 0.0d, (StoreData) null, new E.a().f(h10), 0.0d, (List) null, (o) null, (MapView) null, (FeatureCollection) null, (FeatureCollection) null, (ProductData) null, (m) null, (List) null, (C17631a) null, (C17642l) null, (C17642l) null, 1048447, (Object) null)));
        } catch (Throwable th3) {
            Throwable th4 = th3;
            C17416c.a(bufferedReader, th2);
            throw th4;
        }
    }

    public final void q0(m mVar) {
        C17542s.j(mVar, "symbolManager");
        C16505B<e> b10 = this.f61243p;
        while (true) {
            e value = b10.getValue();
            C16505B<e> b11 = b10;
            if (!b11.e(value, e.h(value, 0.0d, (LatLng) null, (Floor) null, (List) null, 0.0d, 0.0d, (StoreData) null, (E.a) null, 0.0d, (List) null, (o) null, (MapView) null, (FeatureCollection) null, (FeatureCollection) null, (ProductData) null, mVar, (List) null, (C17631a) null, (C17642l) null, (C17642l) null, 1015807, (Object) null))) {
                m mVar2 = mVar;
                b10 = b11;
            } else {
                return;
            }
        }
    }

    public final void r0(List<? extends n> list) {
        C17542s.j(list, "symbols");
        C16505B<e> b10 = this.f61243p;
        while (true) {
            e value = b10.getValue();
            C16505B<e> b11 = b10;
            if (!b11.e(value, e.h(value, 0.0d, (LatLng) null, (Floor) null, (List) null, 0.0d, 0.0d, (StoreData) null, (E.a) null, 0.0d, (List) null, (o) null, (MapView) null, (FeatureCollection) null, (FeatureCollection) null, (ProductData) null, (m) null, list, (C17631a) null, (C17642l) null, (C17642l) null, 983039, (Object) null))) {
                List<? extends n> list2 = list;
                b10 = b11;
            } else {
                return;
            }
        }
    }
}
