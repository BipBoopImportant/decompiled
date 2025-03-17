package androidx.media3.exoplayer.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.media3.exoplayer.video.spherical.b;

final class h extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, b.a {

    /* renamed from: a  reason: collision with root package name */
    private final PointF f43095a = new PointF();

    /* renamed from: b  reason: collision with root package name */
    private final PointF f43096b = new PointF();

    /* renamed from: c  reason: collision with root package name */
    private final a f43097c;

    /* renamed from: d  reason: collision with root package name */
    private final float f43098d;

    /* renamed from: e  reason: collision with root package name */
    private final GestureDetector f43099e;

    /* renamed from: f  reason: collision with root package name */
    private volatile float f43100f;

    public interface a {
        void b(PointF pointF);

        boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }
    }

    public h(Context context, a aVar, float f10) {
        this.f43097c = aVar;
        this.f43098d = f10;
        this.f43099e = new GestureDetector(context, this);
        this.f43100f = 3.1415927f;
    }

    public void a(float[] fArr, float f10) {
        this.f43100f = -f10;
    }

    public boolean onDown(MotionEvent motionEvent) {
        this.f43095a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = (motionEvent2.getX() - this.f43095a.x) / this.f43098d;
        float y10 = motionEvent2.getY();
        PointF pointF = this.f43095a;
        float f12 = (y10 - pointF.y) / this.f43098d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = (double) this.f43100f;
        float cos = (float) Math.cos(d10);
        float sin = (float) Math.sin(d10);
        PointF pointF2 = this.f43096b;
        pointF2.x -= (cos * x10) - (sin * f12);
        float f13 = pointF2.y + (sin * x10) + (cos * f12);
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        this.f43097c.b(this.f43096b);
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f43097c.onSingleTapUp(motionEvent);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f43099e.onTouchEvent(motionEvent);
    }
}
