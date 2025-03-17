package I2;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: I2.o  reason: case insensitive filesystem */
public class C4625o {

    /* renamed from: a  reason: collision with root package name */
    private final Context f8683a;

    /* renamed from: b  reason: collision with root package name */
    private final C4627p f8684b;

    /* renamed from: c  reason: collision with root package name */
    private final b f8685c;

    /* renamed from: d  reason: collision with root package name */
    private final a f8686d;

    /* renamed from: e  reason: collision with root package name */
    private VelocityTracker f8687e;

    /* renamed from: f  reason: collision with root package name */
    private float f8688f;

    /* renamed from: g  reason: collision with root package name */
    private int f8689g;

    /* renamed from: h  reason: collision with root package name */
    private int f8690h;

    /* renamed from: i  reason: collision with root package name */
    private int f8691i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f8692j;

    /* renamed from: I2.o$a */
    interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10);
    }

    /* renamed from: I2.o$b */
    interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i10);
    }

    public C4625o(Context context, C4627p pVar) {
        this(context, pVar, new C4621m(), new C4623n());
    }

    /* access modifiers changed from: private */
    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = C4606e0.g(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
        iArr[1] = C4606e0.f(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
    }

    private boolean d(MotionEvent motionEvent, int i10) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f8690h == source && this.f8691i == deviceId && this.f8689g == i10) {
            return false;
        }
        this.f8685c.a(this.f8683a, this.f8692j, motionEvent, i10);
        this.f8690h = source;
        this.f8691i = deviceId;
        this.f8689g = i10;
        return true;
    }

    private float e(MotionEvent motionEvent, int i10) {
        if (this.f8687e == null) {
            this.f8687e = VelocityTracker.obtain();
        }
        return this.f8686d.a(this.f8687e, motionEvent, i10);
    }

    /* access modifiers changed from: private */
    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
        Y.a(velocityTracker, motionEvent);
        Y.b(velocityTracker, 1000);
        return Y.d(velocityTracker, i10);
    }

    public void g(MotionEvent motionEvent, int i10) {
        boolean d10 = d(motionEvent, i10);
        if (this.f8692j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f8687e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f8687e = null;
                return;
            }
            return;
        }
        float e10 = e(motionEvent, i10) * this.f8684b.b();
        float signum = Math.signum(e10);
        float f10 = 0.0f;
        if (d10 || !(signum == Math.signum(this.f8688f) || signum == 0.0f)) {
            this.f8684b.c();
        }
        float abs = Math.abs(e10);
        int[] iArr = this.f8692j;
        if (abs >= ((float) iArr[0])) {
            int i11 = iArr[1];
            float max = Math.max((float) (-i11), Math.min(e10, (float) i11));
            if (this.f8684b.a(max)) {
                f10 = max;
            }
            this.f8688f = f10;
        }
    }

    C4625o(Context context, C4627p pVar, b bVar, a aVar) {
        this.f8689g = -1;
        this.f8690h = -1;
        this.f8691i = -1;
        this.f8692j = new int[]{Integer.MAX_VALUE, 0};
        this.f8683a = context;
        this.f8684b = pVar;
        this.f8685c = bVar;
        this.f8686d = aVar;
    }
}
