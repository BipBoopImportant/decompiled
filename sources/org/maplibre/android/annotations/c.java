package org.maplibre.android.annotations;

import android.content.res.Resources;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.h;
import org.maplibre.android.j;
import org.maplibre.android.maps.MapView;
import org.maplibre.android.maps.o;

@Deprecated
public class c {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Marker> f145478a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public WeakReference<o> f145479b;

    /* renamed from: c  reason: collision with root package name */
    protected WeakReference<View> f145480c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public float f145481d;

    /* renamed from: e  reason: collision with root package name */
    private float f145482e;

    /* renamed from: f  reason: collision with root package name */
    private float f145483f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public float f145484g;

    /* renamed from: h  reason: collision with root package name */
    private PointF f145485h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f145486i;

    /* renamed from: j  reason: collision with root package name */
    private int f145487j;

    /* renamed from: k  reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f145488k = new C4245c();

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            o oVar = (o) c.this.f145479b.get();
            if (oVar != null) {
                oVar.p();
                c.this.g();
            }
        }
    }

    class b implements View.OnLongClickListener {
        b() {
        }

        public boolean onLongClick(View view) {
            o oVar = (o) c.this.f145479b.get();
            if (oVar == null) {
                return true;
            }
            oVar.r();
            return true;
        }
    }

    /* renamed from: org.maplibre.android.annotations.c$c  reason: collision with other inner class name */
    class C4245c implements ViewTreeObserver.OnGlobalLayoutListener {
        C4245c() {
        }

        public void onGlobalLayout() {
            View view = c.this.f145480c.get();
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                c.this.f145484g = ((float) (-view.getMeasuredHeight())) + c.this.f145481d;
                c.this.l();
            }
        }
    }

    c(MapView mapView, int i10, o oVar) {
        this.f145487j = i10;
        i(LayoutInflater.from(mapView.getContext()).inflate(i10, mapView, false), oVar);
    }

    /* access modifiers changed from: private */
    public void g() {
        o oVar = this.f145479b.get();
        Marker marker = this.f145478a.get();
        if (!(marker == null || oVar == null)) {
            oVar.e(marker);
        }
        f();
    }

    private void i(View view, o oVar) {
        this.f145479b = new WeakReference<>(oVar);
        this.f145486i = false;
        this.f145480c = new WeakReference<>(view);
        view.setOnClickListener(new a());
        view.setOnLongClickListener(new b());
    }

    /* access modifiers changed from: package-private */
    public void e(Marker marker, o oVar, MapView mapView) {
        View view = this.f145480c.get();
        if (view == null) {
            view = LayoutInflater.from(mapView.getContext()).inflate(this.f145487j, mapView, false);
            i(view, oVar);
        }
        this.f145479b = new WeakReference<>(oVar);
        String F10 = marker.F();
        TextView textView = (TextView) view.findViewById(j.f145536b);
        if (!TextUtils.isEmpty(F10)) {
            textView.setText(F10);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        String E10 = marker.E();
        TextView textView2 = (TextView) view.findViewById(j.f145535a);
        if (!TextUtils.isEmpty(E10)) {
            textView2.setText(E10);
            textView2.setVisibility(0);
            return;
        }
        textView2.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    public c f() {
        o oVar = this.f145479b.get();
        if (this.f145486i && oVar != null) {
            this.f145486i = false;
            View view = this.f145480c.get();
            if (!(view == null || view.getParent() == null)) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            h();
            oVar.q();
            k((Marker) null);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public Marker h() {
        WeakReference<Marker> weakReference = this.f145478a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* access modifiers changed from: package-private */
    public c j(MapView mapView, Marker marker, LatLng latLng, int i10, int i11) {
        boolean z10;
        float f10;
        float f11;
        boolean z11;
        int i12 = i10;
        int i13 = i11;
        k(marker);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        o oVar = this.f145479b.get();
        View view = this.f145480c.get();
        if (!(view == null || oVar == null)) {
            view.measure(0, 0);
            float f12 = (float) i13;
            this.f145481d = f12;
            this.f145482e = (float) (-i12);
            PointF e10 = oVar.s().e(latLng);
            this.f145485h = e10;
            float f13 = (float) i12;
            float measuredWidth = (e10.x - ((float) (view.getMeasuredWidth() / 2))) + f13;
            float measuredHeight = (this.f145485h.y - ((float) view.getMeasuredHeight())) + f12;
            if (view instanceof BubbleLayout) {
                Resources resources = mapView.getContext().getResources();
                float measuredWidth2 = ((float) view.getMeasuredWidth()) + measuredWidth;
                float right = (float) mapView.getRight();
                float left = (float) mapView.getLeft();
                float dimension = resources.getDimension(h.f145522e);
                float dimension2 = resources.getDimension(h.f145523f) / 2.0f;
                float measuredWidth3 = ((float) (view.getMeasuredWidth() / 2)) - dimension2;
                float f14 = this.f145485h.x;
                if (f14 >= 0.0f && f14 <= ((float) mapView.getWidth())) {
                    float f15 = this.f145485h.y;
                    if (f15 >= 0.0f && f15 <= ((float) mapView.getHeight())) {
                        if (measuredWidth2 > right) {
                            float f16 = measuredWidth2 - right;
                            f10 = measuredWidth - f16;
                            measuredWidth3 += f16 + dimension2;
                            measuredWidth2 = ((float) view.getMeasuredWidth()) + f10;
                            z10 = true;
                        } else {
                            f10 = measuredWidth;
                            z10 = false;
                        }
                        if (measuredWidth < left) {
                            float f17 = left - measuredWidth;
                            f10 += f17;
                            float f18 = measuredWidth3 - (f17 + dimension2);
                            measuredWidth = f10;
                            f11 = f18;
                            z11 = true;
                        } else {
                            f11 = measuredWidth3;
                            z11 = false;
                        }
                        if (z10) {
                            float f19 = right - measuredWidth2;
                            if (f19 < dimension) {
                                float f20 = dimension - f19;
                                f10 -= f20;
                                f11 += f20 - dimension2;
                                measuredWidth = f10;
                            }
                        }
                        if (z11) {
                            float f21 = measuredWidth - left;
                            if (f21 < dimension) {
                                float f22 = dimension - f21;
                                measuredWidth = f10 + f22;
                                measuredWidth3 = f11 - (f22 - dimension2);
                            }
                        }
                        measuredWidth = f10;
                        measuredWidth3 = f11;
                    }
                }
                ((BubbleLayout) view).e(measuredWidth3);
            }
            view.setX(measuredWidth);
            view.setY(measuredHeight);
            this.f145483f = (measuredWidth - this.f145485h.x) - f13;
            this.f145484g = (float) ((-view.getMeasuredHeight()) + i13);
            f();
            mapView.addView(view, layoutParams);
            this.f145486i = true;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public c k(Marker marker) {
        this.f145478a = new WeakReference<>(marker);
        return this;
    }

    public void l() {
        o oVar = this.f145479b.get();
        Marker marker = this.f145478a.get();
        View view = this.f145480c.get();
        if (oVar != null && marker != null && view != null) {
            PointF e10 = oVar.s().e(marker.D());
            this.f145485h = e10;
            if (view instanceof BubbleLayout) {
                view.setX((e10.x + this.f145483f) - this.f145482e);
            } else {
                view.setX((e10.x - ((float) (view.getMeasuredWidth() / 2))) - this.f145482e);
            }
            view.setY(this.f145485h.y + this.f145484g);
        }
    }
}
