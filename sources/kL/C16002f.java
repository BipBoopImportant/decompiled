package KL;

import CL.C15522a;
import CL.c;
import CL.d;
import android.annotation.SuppressLint;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.maplibre.android.maps.MapView;
import org.maplibre.android.maps.o;
import org.maplibre.geojson.Geometry;

/* renamed from: KL.f  reason: case insensitive filesystem */
final class C16002f {

    /* renamed from: k  reason: collision with root package name */
    private static C16002f f135966k;

    /* renamed from: a  reason: collision with root package name */
    private MapView f135967a;

    /* renamed from: b  reason: collision with root package name */
    private o f135968b;

    /* renamed from: c  reason: collision with root package name */
    private List<C15999c> f135969c;

    /* renamed from: d  reason: collision with root package name */
    private HashMap<String, C15999c> f135970d;

    /* renamed from: e  reason: collision with root package name */
    private final int f135971e;

    /* renamed from: f  reason: collision with root package name */
    private final int f135972f;

    /* renamed from: g  reason: collision with root package name */
    private final int f135973g;

    /* renamed from: h  reason: collision with root package name */
    private final int f135974h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public C15997a f135975i;

    /* renamed from: j  reason: collision with root package name */
    private C15999c f135976j;

    /* renamed from: KL.f$a */
    class a implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15522a f135977a;

        a(C15522a aVar) {
            this.f135977a = aVar;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            C15997a a10 = C16002f.this.f135975i;
            this.f135977a.h(motionEvent);
            return (C16002f.this.f135975i == null && a10 == null) ? false : true;
        }
    }

    /* renamed from: KL.f$b */
    private class b implements d.a {
        private b() {
        }

        public boolean a(d dVar) {
            return C16002f.this.e(dVar);
        }

        public void b(d dVar, float f10, float f11) {
            C16002f.this.f();
        }

        public boolean c(d dVar, float f10, float f11) {
            return C16002f.this.d(dVar);
        }

        /* synthetic */ b(C16002f fVar, a aVar) {
            this();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    C16002f(MapView mapView, o oVar) {
        this(mapView, oVar, new C15522a(mapView.getContext(), false), mapView.getScrollX(), mapView.getScrollY(), mapView.getMeasuredWidth(), mapView.getMeasuredHeight());
    }

    public static C16002f c(MapView mapView, o oVar) {
        C16002f fVar = f135966k;
        if (!(fVar != null && fVar.f135967a == mapView && fVar.f135968b == oVar)) {
            f135966k = new C16002f(mapView, oVar);
        }
        return f135966k;
    }

    /* access modifiers changed from: package-private */
    public void b(C15999c cVar) {
        if (cVar.l() != null) {
            this.f135969c.add(this.f135969c.indexOf(this.f135970d.get(cVar.l())) + 1, cVar);
        } else if (cVar.j() != null) {
            this.f135969c.add(this.f135969c.indexOf(this.f135970d.get(cVar.j())), cVar);
        } else {
            this.f135969c.add(0, cVar);
        }
        this.f135970d.put(cVar.n(), cVar);
    }

    /* access modifiers changed from: package-private */
    public boolean d(d dVar) {
        if (this.f135975i == null || (dVar.o() <= 1 && this.f135975i.f())) {
            if (this.f135975i != null) {
                c E10 = dVar.E(0);
                PointF pointF = new PointF(E10.b() - ((float) this.f135971e), E10.c() - ((float) this.f135972f));
                float f10 = pointF.x;
                if (f10 >= 0.0f) {
                    float f11 = pointF.y;
                    if (f11 >= 0.0f && f10 <= ((float) this.f135973g) && f11 <= ((float) this.f135974h)) {
                        Geometry e10 = this.f135975i.e(this.f135968b.s(), E10, (float) this.f135971e, (float) this.f135972f);
                        if (e10 != null) {
                            this.f135975i.i(e10);
                            this.f135976j.v();
                            for (h b10 : this.f135976j.m()) {
                                b10.b(this.f135975i);
                            }
                            return true;
                        }
                    }
                }
                h(this.f135975i, this.f135976j);
                return true;
            }
            return false;
        }
        h(this.f135975i, this.f135976j);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean e(d dVar) {
        C15997a r10;
        for (C15999c next : this.f135969c) {
            if (dVar.o() == 1 && (r10 = next.r(dVar.n())) != null && g(r10, next)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        h(this.f135975i, this.f135976j);
    }

    /* access modifiers changed from: package-private */
    public boolean g(C15997a aVar, C15999c cVar) {
        if (!aVar.f()) {
            return false;
        }
        for (h a10 : cVar.m()) {
            a10.a(aVar);
        }
        this.f135975i = aVar;
        this.f135976j = cVar;
        return true;
    }

    /* access modifiers changed from: package-private */
    public void h(C15997a aVar, C15999c cVar) {
        if (!(aVar == null || cVar == null)) {
            for (h c10 : cVar.m()) {
                c10.c(aVar);
            }
        }
        this.f135975i = null;
        this.f135976j = null;
    }

    public C16002f(MapView mapView, o oVar, C15522a aVar, int i10, int i11, int i12, int i13) {
        this.f135969c = new LinkedList();
        this.f135970d = new HashMap<>();
        this.f135967a = mapView;
        this.f135968b = oVar;
        this.f135971e = i10;
        this.f135972f = i11;
        this.f135973g = i12;
        this.f135974h = i13;
        aVar.i(new b(this, (a) null));
        mapView.setOnTouchListener(new a(aVar));
    }
}
