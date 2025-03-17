package CL;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class o extends b<c> {

    /* renamed from: i  reason: collision with root package name */
    private final GestureDetector f133650i;

    /* renamed from: j  reason: collision with root package name */
    final c f133651j;

    class a implements c {
        a() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            return o.this.c(10) && ((c) o.this.f133589h).onDoubleTap(motionEvent);
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return o.this.c(11) && ((c) o.this.f133589h).onDoubleTapEvent(motionEvent);
        }

        public boolean onDown(MotionEvent motionEvent) {
            return o.this.c(9) && ((c) o.this.f133589h).onDown(motionEvent);
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            return o.this.c(7) && ((c) o.this.f133589h).onFling(motionEvent, motionEvent2, f10, f11);
        }

        public void onLongPress(MotionEvent motionEvent) {
            if (o.this.c(6)) {
                ((c) o.this.f133589h).onLongPress(motionEvent);
            }
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            return o.this.c(0) && ((c) o.this.f133589h).onScroll(motionEvent, motionEvent2, f10, f11);
        }

        public void onShowPress(MotionEvent motionEvent) {
            if (o.this.c(8)) {
                ((c) o.this.f133589h).onShowPress(motionEvent);
            }
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return o.this.c(12) && ((c) o.this.f133589h).onSingleTapConfirmed(motionEvent);
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return o.this.c(5) && ((c) o.this.f133589h).onSingleTapUp(motionEvent);
        }
    }

    public static class b implements c {
        public boolean onDoubleTap(MotionEvent motionEvent) {
            return false;
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            return false;
        }

        public void onShowPress(MotionEvent motionEvent) {
        }
    }

    public interface c extends GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    }

    public o(Context context, C15522a aVar) {
        super(context, aVar);
        a aVar2 = new a();
        this.f133651j = aVar2;
        this.f133650i = new GestureDetector(context, aVar2);
    }

    /* access modifiers changed from: protected */
    public boolean b(MotionEvent motionEvent) {
        return this.f133650i.onTouchEvent(motionEvent);
    }
}
