package v;

import N.d;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;
import z.C6267d;
import z.k;

/* renamed from: v.h1  reason: case insensitive filesystem */
public class C6072h1 {

    /* renamed from: e  reason: collision with root package name */
    private static final Size f30574e = new Size(1920, 1080);

    /* renamed from: f  reason: collision with root package name */
    private static final Size f30575f = new Size(320, 240);

    /* renamed from: g  reason: collision with root package name */
    private static final Size f30576g = new Size(640, 480);

    /* renamed from: h  reason: collision with root package name */
    private static final Object f30577h = new Object();

    /* renamed from: i  reason: collision with root package name */
    private static volatile C6072h1 f30578i;

    /* renamed from: a  reason: collision with root package name */
    private final DisplayManager f30579a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Size f30580b = null;

    /* renamed from: c  reason: collision with root package name */
    private final k f30581c = new k();

    /* renamed from: d  reason: collision with root package name */
    private final C6267d f30582d = new C6267d();

    private C6072h1(Context context) {
        this.f30579a = (DisplayManager) context.getSystemService("display");
    }

    private Size a() {
        Size b10 = b();
        int width = b10.getWidth() * b10.getHeight();
        Size size = f30574e;
        if (width > size.getWidth() * size.getHeight()) {
            b10 = size;
        }
        return this.f30581c.a(b10);
    }

    private Size b() {
        Point point = new Point();
        d(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        if (d.d(size, f30575f) && (size = this.f30582d.a()) == null) {
            size = f30576g;
        }
        return size.getHeight() > size.getWidth() ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    public static C6072h1 c(Context context) {
        if (f30578i == null) {
            synchronized (f30577h) {
                try {
                    if (f30578i == null) {
                        f30578i = new C6072h1(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f30578i;
    }

    private Display e(Display[] displayArr, boolean z10) {
        Display display = null;
        int i10 = -1;
        for (Display display2 : displayArr) {
            if (!z10 || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i11 = point.x;
                int i12 = point.y;
                if (i11 * i12 > i10) {
                    display = display2;
                    i10 = i11 * i12;
                }
            }
        }
        return display;
    }

    public Display d(boolean z10) {
        Display[] displays = this.f30579a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display e10 = e(displays, z10);
        if (e10 == null && z10) {
            e10 = e(displays, false);
        }
        if (e10 != null) {
            return e10;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    /* access modifiers changed from: package-private */
    public Size f() {
        if (this.f30580b != null) {
            return this.f30580b;
        }
        this.f30580b = a();
        return this.f30580b;
    }

    /* access modifiers changed from: package-private */
    public void g() {
        this.f30580b = a();
    }
}
