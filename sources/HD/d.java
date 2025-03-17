package Hd;

import GJ.C15768k;
import Jd.i;
import KL.n;
import QJ.C16310i;
import QJ.C16311i0;
import QJ.M;
import QJ.Q;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.gson.JsonObject;
import com.ikea.kompassmap.model.product.Communications;
import com.ikea.kompassmap.model.product.ItemKey;
import com.ikea.kompassmap.model.product.ProductData;
import com.ikea.kompassmap.model.store.map.Floor;
import dI.C17164e;
import eI.C17187b;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.maps.E;
import org.maplibre.android.maps.o;
import org.maplibre.geojson.Feature;
import org.maplibre.geojson.Geometry;
import org.maplibre.geojson.Point;
import yd.C10442M;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0018\u001a\u0004\u0018\u00010\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LHd/d;", "", "<init>", "()V", "LJd/i;", "storeViewModel", "Lorg/maplibre/geojson/Feature;", "grid", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/content/Context;", "context", "LXH/N;", "d", "(LJd/i;Lorg/maplibre/geojson/Feature;Landroid/graphics/Bitmap;Landroid/content/Context;)V", "LJd/a;", "kompassViewModel", "h", "(LJd/i;LJd/a;Landroid/content/Context;)V", "", "Lcom/ikea/kompassmap/model/store/map/Floor;", "floors", "", "coordinate", "f", "(Ljava/util/List;Ljava/lang/String;)Lorg/maplibre/geojson/Feature;", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f60755a = new d();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "com.ikea.kompassmap.ui.map.MapActions$loadProduct$2$1", f = "MapActions.kt", l = {38}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f60756c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ i f60757d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ProductData f60758e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar, ProductData productData, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f60757d = iVar;
            this.f60758e = productData;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f60757d, this.f60758e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object f10 = C17187b.f();
            int i10 = this.f60756c;
            if (i10 == 0) {
                y.b(obj);
                ProductData productData = this.f60758e;
                Iterator it = this.f60757d.T().getValue().n().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (C17542s.e(((Floor) obj2).getFloorId(), productData.getFloor())) {
                        break;
                    }
                }
                Floor floor = (Floor) obj2;
                if (floor != null) {
                    i iVar = this.f60757d;
                    this.f60756c = 1;
                    if (iVar.c0(floor, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "com.ikea.kompassmap.ui.map.MapActions$loadProduct$3$1$2$1", f = "MapActions.kt", l = {69}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f60759c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ i f60760d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Feature f60761e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Floor f60762f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
        @f(c = "com.ikea.kompassmap.ui.map.MapActions$loadProduct$3$1$2$1$1", f = "MapActions.kt", l = {69}, m = "invokeSuspend")
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f60763c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ i f60764d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Floor f60765e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(i iVar, Floor floor, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f60764d = iVar;
                this.f60765e = floor;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f60764d, this.f60765e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f60763c;
                if (i10 == 0) {
                    y.b(obj);
                    i iVar = this.f60764d;
                    Floor floor = this.f60765e;
                    this.f60763c = 1;
                    if (iVar.c0(floor, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar, Feature feature, Floor floor, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f60760d = iVar;
            this.f60761e = feature;
            this.f60762f = floor;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f60760d, this.f60761e, this.f60762f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f60759c;
            if (i10 == 0) {
                y.b(obj);
                M a10 = C16311i0.a();
                a aVar = new a(this.f60760d, this.f60762f, (C17164e<? super a>) null);
                this.f60759c = 1;
                if (C16310i.g(a10, aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f60760d.N(this.f60761e);
            this.f60760d.F(C16877v.e(this.f60761e));
            return C16807N.f139792a;
        }
    }

    private d() {
    }

    private final void d(i iVar, Feature feature, Bitmap bitmap, Context context) {
        Bitmap bitmap2;
        E t10;
        String str;
        ItemKey itemKey;
        String itemNo;
        Communications communications;
        if (bitmap != null) {
            bitmap2 = Cd.a.f58971a.b(bitmap);
        } else if (context != null) {
            bitmap2 = Cd.a.c(Cd.a.f58971a, context, C10442M.f77906b, 0.0f, 0, 0.0f, 0, 60, (Object) null);
        } else {
            return;
        }
        o o10 = iVar.T().getValue().o();
        if (o10 != null && (t10 = o10.t()) != null) {
            ProductData t11 = iVar.T().getValue().t();
            String str2 = "";
            if (t11 == null || (communications = t11.getCommunications()) == null || (str = communications.getName()) == null) {
                str = str2;
            }
            if (!(t11 == null || (itemKey = t11.getItemKey()) == null || (itemNo = itemKey.getItemNo()) == null)) {
                str2 = itemNo;
            }
            String floor = t11 != null ? t11.getFloor() : null;
            Geometry geometry = feature.geometry();
            C17542s.h(geometry, "null cannot be cast to non-null type org.maplibre.geojson.Point");
            Point point = (Point) geometry;
            t10.a(str, bitmap2);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("productName", str);
            jsonObject.addProperty("productId", str2);
            jsonObject.addProperty("productFloor", floor);
            iVar.r0(C16877v.e(new n().h(new LatLng(point.latitude(), point.longitude())).g(Float.valueOf(1.3f)).f(str).e(jsonObject)));
        }
    }

    static /* synthetic */ void e(d dVar, i iVar, Feature feature, Bitmap bitmap, Context context, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            bitmap = null;
        }
        if ((i10 & 8) != 0) {
            context = null;
        }
        dVar.d(iVar, feature, bitmap, context);
    }

    /* access modifiers changed from: private */
    public static final Feature g(String str, Floor floor) {
        Object obj;
        C17542s.j(floor, PlaceTypes.FLOOR);
        Iterator it = floor.getData().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Feature feature = (Feature) obj;
            if (!C17542s.e(feature.getStringProperty("uid"), str)) {
                if (C17542s.e(feature.getStringProperty("coordinate"), str)) {
                    break;
                }
            } else {
                break;
            }
        }
        return (Feature) obj;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(ProductData productData, i iVar, Bitmap bitmap) {
        C17542s.j(bitmap, "it");
        Feature grid = productData.getGrid();
        if (grid != null) {
            e(f60755a, iVar, grid, bitmap, (Context) null, 8, (Object) null);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N j(ProductData productData, i iVar, Context context, Throwable th2) {
        C17542s.j(th2, "it");
        Feature grid = productData.getGrid();
        if (grid != null) {
            f60755a.d(iVar, grid, (Bitmap) null, context);
        }
        return C16807N.f139792a;
    }

    public final Feature f(List<Floor> list, String str) {
        C17542s.j(list, "floors");
        return (Feature) C15768k.L(C15768k.T(C16877v.h0(list), new c(str)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0086, code lost:
        r14 = r14.getMap();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(Jd.i r13, Jd.a r14, android.content.Context r15) {
        /*
            r12 = this;
            java.lang.String r0 = "storeViewModel"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            java.lang.String r0 = "kompassViewModel"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            TJ.B r0 = r13.T()
            java.lang.Object r0 = r0.getValue()
            Jd.e r0 = (Jd.e) r0
            com.ikea.kompassmap.model.product.ProductData r0 = r0.t()
            if (r0 != 0) goto L_0x001b
            return
        L_0x001b:
            com.ikea.kompassmap.model.product.Locations r1 = r0.getLocations()
            java.util.List r1 = r1.getSalesLocations()
            java.lang.Object r1 = YH.C16877v.y0(r1)
            com.ikea.kompassmap.model.product.SalesLocation r1 = (com.ikea.kompassmap.model.product.SalesLocation) r1
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0076
            com.ikea.kompassmap.model.product.Department r1 = r1.getDepartment()
            if (r1 == 0) goto L_0x0076
            com.ikea.kompassmap.model.product.Availabilities r4 = r0.getAvailabilities()
            boolean r4 = r4.getAvailableForCashCarry()
            if (r4 == 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            r1 = r3
        L_0x003f:
            if (r1 == 0) goto L_0x0076
            QJ.M r1 = QJ.C16311i0.a()
            QJ.Q r4 = QJ.S.a(r1)
            Hd.d$a r7 = new Hd.d$a
            r7.<init>(r13, r0, r3)
            r8 = 3
            r9 = 0
            r5 = 0
            r6 = 0
            QJ.F0 unused = QJ.C16314k.d(r4, r5, r6, r7, r8, r9)
            com.ikea.kompassmap.model.product.Communications r1 = r0.getCommunications()
            java.util.List r1 = r1.getImages()
            java.lang.Object r1 = r1.get(r2)
            com.ikea.kompassmap.model.product.Image r1 = (com.ikea.kompassmap.model.product.Image) r1
            java.lang.String r1 = r1.getHref()
            Hd.a r2 = new Hd.a
            r2.<init>(r0, r13)
            Hd.b r3 = new Hd.b
            r3.<init>(r0, r13, r15)
            r14.i(r1, r2, r3)
            goto L_0x012b
        L_0x0076:
            TJ.B r14 = r13.T()
            java.lang.Object r14 = r14.getValue()
            Jd.e r14 = (Jd.e) r14
            com.ikea.kompassmap.model.store.StoreData r14 = r14.v()
            if (r14 == 0) goto L_0x0091
            com.ikea.kompassmap.model.store.map.StoreMap r14 = r14.getMap()
            if (r14 == 0) goto L_0x0091
            java.util.List r14 = r14.getFloors()
            goto L_0x0092
        L_0x0091:
            r14 = r3
        L_0x0092:
            com.ikea.kompassmap.model.product.Locations r15 = r0.getLocations()
            java.util.List r15 = r15.getDisplayLocations()
            java.lang.Object r15 = YH.C16877v.y0(r15)
            com.ikea.kompassmap.model.product.DisplayLocation r15 = (com.ikea.kompassmap.model.product.DisplayLocation) r15
            if (r15 == 0) goto L_0x00a8
            java.lang.String r15 = r15.getId()
            if (r15 != 0) goto L_0x00be
        L_0x00a8:
            com.ikea.kompassmap.model.product.Locations r15 = r0.getLocations()
            java.util.List r15 = r15.getSalesLocations()
            java.lang.Object r15 = YH.C16877v.y0(r15)
            com.ikea.kompassmap.model.product.SalesLocation r15 = (com.ikea.kompassmap.model.product.SalesLocation) r15
            if (r15 == 0) goto L_0x00bd
            java.lang.String r15 = r15.getId()
            goto L_0x00be
        L_0x00bd:
            r15 = r3
        L_0x00be:
            if (r14 == 0) goto L_0x012b
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = YH.C16877v.y(r14, r1)
            r0.<init>(r1)
            java.util.Iterator r14 = r14.iterator()
        L_0x00d1:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x012b
            java.lang.Object r1 = r14.next()
            com.ikea.kompassmap.model.store.map.Floor r1 = (com.ikea.kompassmap.model.store.map.Floor) r1
            java.util.List r4 = r1.getData()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x00e7:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x010b
            java.lang.Object r5 = r4.next()
            r6 = r5
            org.maplibre.geojson.Feature r6 = (org.maplibre.geojson.Feature) r6
            java.lang.String r7 = "id"
            java.lang.String r7 = r6.getStringProperty(r7)
            if (r7 == 0) goto L_0x00e7
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r15)
            if (r7 != r2) goto L_0x00e7
            org.maplibre.geojson.Geometry r6 = r6.geometry()
            boolean r6 = r6 instanceof org.maplibre.geojson.Polygon
            if (r6 == 0) goto L_0x00e7
            goto L_0x010c
        L_0x010b:
            r5 = r3
        L_0x010c:
            org.maplibre.geojson.Feature r5 = (org.maplibre.geojson.Feature) r5
            if (r5 == 0) goto L_0x0126
            QJ.P0 r4 = QJ.C16311i0.c()
            QJ.Q r6 = QJ.S.a(r4)
            Hd.d$b r9 = new Hd.d$b
            r9.<init>(r13, r5, r1, r3)
            r10 = 3
            r11 = 0
            r7 = 0
            r8 = 0
            QJ.F0 r1 = QJ.C16314k.d(r6, r7, r8, r9, r10, r11)
            goto L_0x0127
        L_0x0126:
            r1 = r3
        L_0x0127:
            r0.add(r1)
            goto L_0x00d1
        L_0x012b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Hd.d.h(Jd.i, Jd.a, android.content.Context):void");
    }
}
