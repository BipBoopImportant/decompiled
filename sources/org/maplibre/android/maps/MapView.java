package org.maplibre.android.maps;

import AL.C15449c;
import WL.C16784a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import j0.C5468y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.maplibre.android.MapLibre;
import org.maplibre.android.c;
import org.maplibre.android.location.b;
import org.maplibre.android.maps.NativeMapView;
import org.maplibre.android.maps.o;
import org.maplibre.android.maps.renderer.MapRenderer;
import org.maplibre.android.maps.widgets.CompassView;
import org.maplibre.android.tile.TileOperation;
import org.maplibre.android.utils.a;

public class MapView extends FrameLayout implements NativeMapView.c {

    /* renamed from: a  reason: collision with root package name */
    private final k f145763a = new k();

    /* renamed from: b  reason: collision with root package name */
    private final i f145764b = new i();

    /* renamed from: c  reason: collision with root package name */
    private final C17731h f145765c = new C17731h();

    /* renamed from: d  reason: collision with root package name */
    private v f145766d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public o f145767e;

    /* renamed from: f  reason: collision with root package name */
    private View f145768f;

    /* renamed from: g  reason: collision with root package name */
    private C17728e f145769g;

    /* renamed from: h  reason: collision with root package name */
    p f145770h;

    /* renamed from: i  reason: collision with root package name */
    private MapRenderer f145771i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public boolean f145772j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public CompassView f145773k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public PointF f145774l;

    /* renamed from: m  reason: collision with root package name */
    private final C17729f f145775m = new C17729f();

    /* renamed from: n  reason: collision with root package name */
    private final C17730g f145776n = new C17730g();

    /* renamed from: o  reason: collision with root package name */
    private final C17736e f145777o = new C17736e();
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public l f145778p;

    /* renamed from: q  reason: collision with root package name */
    private n f145779q;

    /* renamed from: r  reason: collision with root package name */
    private Bundle f145780r;

    public interface A {
        void n(String str, String str2);
    }

    public interface B {
        void a(String str, String str2);
    }

    public interface C {
        void f(String str, String str2);
    }

    public interface D {
        void e(String str);
    }

    public interface E {
        void x(TileOperation tileOperation, int i10, int i11, int i12, int i13, int i14, String str);
    }

    public interface F {
        void u();
    }

    public interface G {
        void i();
    }

    public interface H {
        void o();
    }

    /* renamed from: org.maplibre.android.maps.MapView$a  reason: case insensitive filesystem */
    class C17724a implements C17737f {
        C17724a() {
        }

        public void a(PointF pointF) {
            MapView.this.f145774l = pointF;
        }
    }

    /* renamed from: org.maplibre.android.maps.MapView$b  reason: case insensitive filesystem */
    class C17725b implements o.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17736e f145782a;

        C17725b(C17736e eVar) {
            this.f145782a = eVar;
        }

        public void a() {
            if (MapView.this.f145773k != null) {
                MapView.this.f145773k.d(false);
            }
            this.f145782a.c();
        }

        public void b() {
            this.f145782a.a();
        }
    }

    /* renamed from: org.maplibre.android.maps.MapView$c  reason: case insensitive filesystem */
    class C17726c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17736e f145784a;

        C17726c(C17736e eVar) {
            this.f145784a = eVar;
        }

        public void onClick(View view) {
            if (MapView.this.f145767e != null && MapView.this.f145773k != null) {
                if (MapView.this.f145774l != null) {
                    MapView.this.f145767e.R(0.0d, MapView.this.f145774l.x, MapView.this.f145774l.y, 150);
                } else {
                    MapView.this.f145767e.R(0.0d, MapView.this.f145767e.w() / 2.0f, MapView.this.f145767e.n() / 2.0f, 150);
                }
                this.f145784a.d(3);
                MapView.this.f145773k.d(true);
                MapView.this.f145773k.postDelayed(MapView.this.f145773k, 650);
            }
        }
    }

    /* renamed from: org.maplibre.android.maps.MapView$d  reason: case insensitive filesystem */
    class C17727d implements Runnable {
        C17727d() {
        }

        public void run() {
            if (!MapView.this.f145772j && MapView.this.f145767e == null) {
                MapView.this.x();
                MapView.this.f145767e.K();
            }
        }
    }

    /* renamed from: org.maplibre.android.maps.MapView$e  reason: case insensitive filesystem */
    private static class C17728e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final C17735d f145787a;

        /* renamed from: b  reason: collision with root package name */
        private H f145788b;

        private C17735d a() {
            return this.f145788b.a() != null ? this.f145788b.a() : this.f145787a;
        }

        public void onClick(View view) {
            a().onClick(view);
        }

        private C17728e(Context context, o oVar) {
            this.f145787a = new C17735d(context, oVar);
            this.f145788b = oVar.v();
        }
    }

    /* renamed from: org.maplibre.android.maps.MapView$f  reason: case insensitive filesystem */
    private class C17729f implements C17737f {

        /* renamed from: a  reason: collision with root package name */
        private final List<C17737f> f145789a;

        public void a(PointF pointF) {
            MapView.this.f145778p.V(pointF);
            for (C17737f a10 : this.f145789a) {
                a10.a(pointF);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(C17737f fVar) {
            this.f145789a.add(fVar);
        }

        private C17729f() {
            this.f145789a = new ArrayList();
        }
    }

    /* renamed from: org.maplibre.android.maps.MapView$g  reason: case insensitive filesystem */
    private class C17730g implements o.k {
        public void a(o.p pVar) {
            MapView.this.f145778p.s(pVar);
        }

        public void b(o.C4251o oVar) {
            MapView.this.f145778p.r(oVar);
        }

        private C17730g() {
        }
    }

    /* renamed from: org.maplibre.android.maps.MapView$h  reason: case insensitive filesystem */
    private class C17731h implements r {

        /* renamed from: a  reason: collision with root package name */
        private int f145792a;

        C17731h() {
            MapView.this.n(this);
        }

        public void p(boolean z10, double d10, double d11) {
            if (MapView.this.f145767e != null && MapView.this.f145767e.t() != null && MapView.this.f145767e.t().l()) {
                int i10 = this.f145792a + 1;
                this.f145792a = i10;
                if (i10 == 3) {
                    MapView.this.setForeground((Drawable) null);
                    MapView.this.D(this);
                }
            }
        }
    }

    private class i implements q, r, p, k, j, o {

        /* renamed from: a  reason: collision with root package name */
        private final List<w> f145794a = new ArrayList();

        i() {
            MapView.this.m(this);
            MapView.this.n(this);
            MapView.this.l(this);
            MapView.this.j(this);
            MapView.this.i(this);
            MapView.this.k(this);
        }

        private void c() {
            if (this.f145794a.size() > 0) {
                Iterator<w> it = this.f145794a.iterator();
                while (it.hasNext()) {
                    w next = it.next();
                    if (next != null) {
                        next.a(MapView.this.f145767e);
                    }
                    it.remove();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(w wVar) {
            this.f145794a.add(wVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            MapView.this.f145767e.I();
            c();
            MapView.this.f145767e.H();
        }

        public void d() {
            if (MapView.this.f145767e != null) {
                MapView.this.f145767e.M();
            }
        }

        public void g() {
            if (MapView.this.f145767e != null) {
                MapView.this.f145767e.G();
            }
        }

        public void k(String str) {
            if (MapView.this.f145767e != null) {
                MapView.this.f145767e.F();
            }
        }

        public void p(boolean z10, double d10, double d11) {
            if (MapView.this.f145767e != null) {
                MapView.this.f145767e.L();
            }
        }

        public void q(boolean z10) {
            if (MapView.this.f145767e != null) {
                MapView.this.f145767e.M();
            }
        }

        public void w() {
            if (MapView.this.f145767e != null) {
                MapView.this.f145767e.M();
            }
        }
    }

    public interface j {
        void q(boolean z10);
    }

    public interface k {
        void d();
    }

    public interface l {
        void j(boolean z10);
    }

    public interface m {
        boolean t(String str);
    }

    public interface n {
        void v();
    }

    public interface o {
        void k(String str);
    }

    public interface p {
        void w();
    }

    public interface q {
        void g();
    }

    public interface r {
        void p(boolean z10, double d10, double d11);
    }

    public interface s {
        void c(boolean z10);
    }

    public interface t {
        void h(String[] strArr, int i10, int i11);
    }

    public interface u {
        void l(String[] strArr, int i10, int i11);
    }

    public interface v {
        void m(String[] strArr, int i10, int i11);
    }

    public interface w {
        void r(int i10, int i11, String str);
    }

    public interface x {
        void s(int i10, int i11, String str);
    }

    public interface y {
        void b(int i10, int i11, String str);
    }

    public interface z {
        void a(String str);
    }

    public MapView(Context context) {
        super(context);
        C16784a.d("MapView constructed with context", new Object[0]);
        v(context, p.m(context));
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public void A() {
        post(new C17727d());
    }

    private o.g o(C17736e eVar) {
        return new C17725b(eVar);
    }

    private View.OnClickListener p(C17736e eVar) {
        return new C17726c(eVar);
    }

    private C17737f q() {
        return new C17724a();
    }

    public static void setMapStrictModeEnabled(boolean z10) {
        c.a(z10);
    }

    private void w(p pVar) {
        MapRenderer create = MapRenderer.create(pVar, getContext(), new r(this));
        this.f145771i = create;
        View view = create.getView();
        this.f145768f = view;
        addView(view, 0);
        this.f145766d = new NativeMapView(getContext(), getPixelRatio(), pVar.D(), this, this.f145763a, this.f145771i);
    }

    /* access modifiers changed from: private */
    public void x() {
        Context context = getContext();
        this.f145775m.b(q());
        B b10 = new B(this.f145766d, this);
        H h10 = new H(b10, this.f145775m, getPixelRatio(), this);
        C5468y yVar = new C5468y();
        C17738g gVar = new C17738g(this.f145766d);
        C17733b bVar = new C17733b(this, yVar, gVar, new C17732a(this.f145766d, yVar), new t(this.f145766d, yVar, gVar), new x(this.f145766d, yVar), new z(this.f145766d, yVar), new C(this.f145766d, yVar));
        G g10 = new G(this, this.f145766d, this.f145777o);
        ArrayList arrayList = new ArrayList();
        C17733b bVar2 = bVar;
        H h11 = h10;
        o oVar = new o(this.f145766d, g10, h10, b10, this.f145776n, this.f145777o, arrayList);
        this.f145767e = oVar;
        oVar.z(bVar2);
        l lVar = new l(context, g10, b10, h11, bVar2, this.f145777o);
        this.f145778p = lVar;
        this.f145779q = new n(g10, h11, lVar);
        o oVar2 = this.f145767e;
        oVar2.A(new b(oVar2, g10, arrayList));
        setClickable(true);
        setLongClickable(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestDisallowInterceptTouchEvent(true);
        this.f145766d.E(MapLibre.isConnected().booleanValue());
        Bundle bundle = this.f145780r;
        if (bundle == null) {
            this.f145767e.y(context, this.f145770h);
        } else {
            this.f145767e.J(bundle);
        }
        this.f145764b.b();
    }

    private boolean y() {
        return this.f145778p != null;
    }

    private boolean z() {
        return this.f145779q != null;
    }

    public void C(j jVar) {
        this.f145763a.F(jVar);
    }

    public void D(r rVar) {
        this.f145763a.G(rVar);
    }

    /* access modifiers changed from: package-private */
    public o getMapLibreMap() {
        return this.f145767e;
    }

    public float getPixelRatio() {
        float pixelRatio = this.f145770h.getPixelRatio();
        return pixelRatio == 0.0f ? getResources().getDisplayMetrics().density : pixelRatio;
    }

    public View getRenderView() {
        return this.f145768f;
    }

    public MapRenderer.a getRenderingRefreshMode() {
        MapRenderer mapRenderer = this.f145771i;
        if (mapRenderer != null) {
            return mapRenderer.getRenderingRefreshMode();
        }
        throw new IllegalStateException("Calling MapView#getRenderingRefreshMode before mapRenderer is created.");
    }

    public Bitmap getViewContent() {
        return a.a(this);
    }

    public void i(j jVar) {
        this.f145763a.z(jVar);
    }

    public void j(k kVar) {
        this.f145763a.A(kVar);
    }

    public void k(o oVar) {
        this.f145763a.B(oVar);
    }

    public void l(p pVar) {
        this.f145763a.C(pVar);
    }

    public void m(q qVar) {
        this.f145763a.D(qVar);
    }

    public void n(r rVar) {
        this.f145763a.E(rVar);
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        return !y() ? super.onGenericMotionEvent(motionEvent) : this.f145778p.S(motionEvent) || super.onGenericMotionEvent(motionEvent);
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        return !z() ? super.onKeyDown(i10, keyEvent) : this.f145779q.d(i10, keyEvent) || super.onKeyDown(i10, keyEvent);
    }

    public boolean onKeyLongPress(int i10, KeyEvent keyEvent) {
        return !z() ? super.onKeyLongPress(i10, keyEvent) : this.f145779q.e(i10, keyEvent) || super.onKeyLongPress(i10, keyEvent);
    }

    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        return !z() ? super.onKeyUp(i10, keyEvent) : this.f145779q.f(i10, keyEvent) || super.onKeyUp(i10, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        v vVar;
        if (!isInEditMode() && (vVar = this.f145766d) != null) {
            vVar.S(i10, i11);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !y() ? super.onTouchEvent(motionEvent) : this.f145778p.T(motionEvent) || super.onTouchEvent(motionEvent);
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        return !z() ? super.onTrackballEvent(motionEvent) : this.f145779q.g(motionEvent) || super.onTrackballEvent(motionEvent);
    }

    public void r(w wVar) {
        o oVar = this.f145767e;
        if (oVar == null) {
            this.f145764b.a(wVar);
        } else {
            wVar.a(oVar);
        }
    }

    /* access modifiers changed from: protected */
    public ImageView s() {
        ImageView imageView = new ImageView(getContext());
        addView(imageView);
        imageView.setTag("attrView");
        imageView.getLayoutParams().width = -2;
        imageView.getLayoutParams().height = -2;
        imageView.setAdjustViewBounds(true);
        imageView.setClickable(true);
        imageView.setFocusable(true);
        imageView.setContentDescription(getResources().getString(org.maplibre.android.l.f145541c));
        imageView.setImageDrawable(a.d(getContext(), org.maplibre.android.i.f145533b));
        C17728e eVar = new C17728e(getContext(), this.f145767e);
        this.f145769g = eVar;
        imageView.setOnClickListener(eVar);
        return imageView;
    }

    /* access modifiers changed from: package-private */
    public void setMapLibreMap(o oVar) {
        this.f145767e = oVar;
    }

    public void setMaximumFps(int i10) {
        MapRenderer mapRenderer = this.f145771i;
        if (mapRenderer != null) {
            mapRenderer.setMaximumFps(i10);
            return;
        }
        throw new IllegalStateException("Calling MapView#setMaximumFps before mapRenderer is created.");
    }

    public void setRenderingRefreshMode(MapRenderer.a aVar) {
        MapRenderer mapRenderer = this.f145771i;
        if (mapRenderer != null) {
            mapRenderer.setRenderingRefreshMode(aVar);
            return;
        }
        throw new IllegalStateException("Calling MapView#setRenderingRefreshMode before mapRenderer is created.");
    }

    /* access modifiers changed from: protected */
    public CompassView t() {
        CompassView compassView = new CompassView(getContext());
        this.f145773k = compassView;
        addView(compassView);
        this.f145773k.setTag("compassView");
        this.f145773k.getLayoutParams().width = -2;
        this.f145773k.getLayoutParams().height = -2;
        this.f145773k.setContentDescription(getResources().getString(org.maplibre.android.l.f145542d));
        this.f145773k.c(o(this.f145777o));
        this.f145773k.setOnClickListener(p(this.f145777o));
        return this.f145773k;
    }

    /* access modifiers changed from: protected */
    public ImageView u() {
        ImageView imageView = new ImageView(getContext());
        addView(imageView);
        imageView.setTag("logoView");
        imageView.getLayoutParams().width = -2;
        imageView.getLayoutParams().height = -2;
        imageView.setImageDrawable(a.d(getContext(), org.maplibre.android.i.f145534c));
        return imageView;
    }

    /* access modifiers changed from: protected */
    public void v(Context context, p pVar) {
        if (!isInEditMode()) {
            if (MapLibre.hasInstance()) {
                setForeground(new ColorDrawable(pVar.G()));
                this.f145770h = pVar;
                setContentDescription(context.getString(org.maplibre.android.l.f145543e));
                setWillNotDraw(false);
                w(pVar);
                return;
            }
            throw new C15449c();
        }
    }
}
