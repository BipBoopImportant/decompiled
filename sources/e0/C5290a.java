package e0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pI.C17752b;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 H2\u00020\u0001:\u0003\u0015\u0017\u0019B-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\"\u0010\u001f\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010!R\"\u0010#\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010!R\u0016\u0010'\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010&R\u0016\u0010+\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010&R\u0016\u0010-\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010&R\u0016\u0010/\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010&R\u0016\u00101\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u0010&R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u0010\u001eR\u0016\u00109\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u0010&R\u0016\u0010;\u001a\u0002028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b:\u00104R\u0016\u0010=\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b<\u0010&R\u0016\u0010?\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b>\u0010&R\u0016\u0010A\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b@\u0010\u0018R\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010G\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bF\u0010\u001e¨\u0006I"}, d2 = {"Le0/a;", "", "Landroid/content/Context;", "context", "", "spanSlop", "minSpan", "Le0/a$b;", "listener", "<init>", "(Landroid/content/Context;IILe0/a$b;)V", "", "e", "()Z", "", "d", "()F", "Landroid/view/MotionEvent;", "event", "f", "(Landroid/view/MotionEvent;)Z", "a", "Landroid/content/Context;", "b", "I", "c", "Le0/a$b;", "focusX", "focusY", "g", "Z", "isQuickZoomEnabled", "setQuickZoomEnabled", "(Z)V", "h", "isStylusZoomEnabled", "setStylusZoomEnabled", "i", "F", "currentSpan", "j", "previousSpan", "k", "currentSpanX", "l", "currentSpanY", "m", "previousSpanX", "n", "previousSpanY", "", "o", "J", "eventTime", "p", "isInProgress", "q", "initialSpan", "r", "prevTime", "s", "anchoredZoomStartX", "t", "anchoredZoomStartY", "u", "anchoredZoomMode", "Landroid/view/GestureDetector;", "v", "Landroid/view/GestureDetector;", "gestureDetector", "w", "eventBeforeOrAboveStartingGestureEvent", "x", "camera-view_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: e0.a  reason: case insensitive filesystem */
public final class C5290a {

    /* renamed from: x  reason: collision with root package name */
    public static final C0369a f23199x = new C0369a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Context f23200a;

    /* renamed from: b  reason: collision with root package name */
    private final int f23201b;

    /* renamed from: c  reason: collision with root package name */
    private final int f23202c;

    /* renamed from: d  reason: collision with root package name */
    private final b f23203d;

    /* renamed from: e  reason: collision with root package name */
    private int f23204e;

    /* renamed from: f  reason: collision with root package name */
    private int f23205f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f23206g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f23207h;

    /* renamed from: i  reason: collision with root package name */
    private float f23208i;

    /* renamed from: j  reason: collision with root package name */
    private float f23209j;

    /* renamed from: k  reason: collision with root package name */
    private float f23210k;

    /* renamed from: l  reason: collision with root package name */
    private float f23211l;

    /* renamed from: m  reason: collision with root package name */
    private float f23212m;

    /* renamed from: n  reason: collision with root package name */
    private float f23213n;

    /* renamed from: o  reason: collision with root package name */
    private long f23214o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f23215p;

    /* renamed from: q  reason: collision with root package name */
    private float f23216q;

    /* renamed from: r  reason: collision with root package name */
    private long f23217r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public float f23218s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public float f23219t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public int f23220u;

    /* renamed from: v  reason: collision with root package name */
    private GestureDetector f23221v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f23222w;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Le0/a$a;", "", "<init>", "()V", "", "ANCHORED_ZOOM_MODE_DOUBLE_TAP", "I", "ANCHORED_ZOOM_MODE_NONE", "ANCHORED_ZOOM_MODE_STYLUS", "DEFAULT_MIN_SPAN", "", "SCALE_FACTOR", "F", "camera-view_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: e0.a$a  reason: collision with other inner class name */
    public static final class C0369a {
        public /* synthetic */ C0369a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0369a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bæ\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Le0/a$b;", "", "Le0/a$c;", "zoomEvent", "", "a", "(Le0/a$c;)Z", "camera-view_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: e0.a$b */
    public interface b {
        boolean a(c cVar);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b&\u0018\u00002\u00020\u0001:\u0003\t\r\u0011B'\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, d2 = {"Le0/a$c;", "", "", "eventTime", "", "focusX", "focusY", "<init>", "(JII)V", "a", "J", "getEventTime", "()J", "b", "I", "getFocusX", "()I", "c", "getFocusY", "camera-view_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: e0.a$c */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        private final long f23223a;

        /* renamed from: b  reason: collision with root package name */
        private final int f23224b;

        /* renamed from: c  reason: collision with root package name */
        private final int f23225c;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Le0/a$c$a;", "Le0/a$c;", "", "eventTime", "", "focusX", "focusY", "<init>", "(JII)V", "camera-view_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: e0.a$c$a  reason: collision with other inner class name */
        public static final class C0370a extends c {
            public C0370a(long j10, int i10, int i11) {
                super(j10, i10, i11, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Le0/a$c$b;", "Le0/a$c;", "", "eventTime", "", "focusX", "focusY", "", "incrementalScaleFactor", "<init>", "(JIIF)V", "d", "F", "getIncrementalScaleFactor", "()F", "camera-view_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: e0.a$c$b */
        public static final class b extends c {

            /* renamed from: d  reason: collision with root package name */
            private final float f23226d;

            public b(long j10, int i10, int i11, float f10) {
                super(j10, i10, i11, (DefaultConstructorMarker) null);
                this.f23226d = f10;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Le0/a$c$c;", "Le0/a$c;", "", "eventTime", "", "focusX", "focusY", "", "incrementalScaleFactor", "<init>", "(JIIF)V", "d", "F", "a", "()F", "camera-view_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: e0.a$c$c  reason: collision with other inner class name */
        public static final class C0371c extends c {

            /* renamed from: d  reason: collision with root package name */
            private final float f23227d;

            public C0371c(long j10, int i10, int i11, float f10) {
                super(j10, i10, i11, (DefaultConstructorMarker) null);
                this.f23227d = f10;
            }

            public final float a() {
                return this.f23227d;
            }
        }

        public /* synthetic */ c(long j10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, i10, i11);
        }

        private c(long j10, int i10, int i11) {
            this.f23223a = j10;
            this.f23224b = i10;
            this.f23225c = i11;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"e0/a$d", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "Landroid/view/MotionEvent;", "e", "", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", "camera-view_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: e0.a$d */
    public static final class d extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5290a f23228a;

        d(C5290a aVar) {
            this.f23228a = aVar;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            C17542s.j(motionEvent, "e");
            this.f23228a.f23218s = motionEvent.getX();
            this.f23228a.f23219t = motionEvent.getY();
            this.f23228a.f23220u = 1;
            return true;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @SuppressLint({"ExecutorRegistration"})
    public C5290a(Context context, b bVar) {
        this(context, 0, 0, bVar, 6, (DefaultConstructorMarker) null);
        C17542s.j(context, "context");
        C17542s.j(bVar, "listener");
    }

    private final float d() {
        if (e()) {
            boolean z10 = this.f23222w;
            boolean z11 = (z10 && this.f23208i < this.f23209j) || (!z10 && this.f23208i > this.f23209j);
            float abs = Math.abs(((float) 1) - (this.f23208i / this.f23209j)) * 0.5f;
            if (this.f23209j <= ((float) this.f23201b)) {
                return 1.0f;
            }
            return z11 ? 1.0f + abs : 1.0f - abs;
        }
        float f10 = this.f23209j;
        if (f10 > 0.0f) {
            return this.f23208i / f10;
        }
        return 1.0f;
    }

    private final boolean e() {
        return this.f23220u != 0;
    }

    public final boolean f(MotionEvent motionEvent) {
        float f10;
        float f11;
        MotionEvent motionEvent2 = motionEvent;
        C17542s.j(motionEvent2, "event");
        this.f23214o = motionEvent.getEventTime();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f23206g) {
            this.f23221v.onTouchEvent(motionEvent2);
        }
        int pointerCount = motionEvent.getPointerCount();
        boolean z10 = (motionEvent.getButtonState() & 32) != 0;
        boolean z11 = this.f23220u == 2 && !z10;
        boolean z12 = actionMasked == 1 || actionMasked == 3 || z11;
        float f12 = 0.0f;
        if (actionMasked == 0 || z12) {
            if (this.f23215p) {
                b bVar = this.f23203d;
                c.b bVar2 = r12;
                c.b bVar3 = new c.b(this.f23214o, this.f23204e, this.f23205f, d());
                bVar.a(bVar2);
                this.f23215p = false;
                this.f23216q = 0.0f;
                this.f23220u = 0;
            } else if (e() && z12) {
                this.f23215p = false;
                this.f23216q = 0.0f;
                this.f23220u = 0;
            }
            if (z12) {
                return true;
            }
        }
        if (!this.f23215p && this.f23207h && !e() && !z12 && z10) {
            this.f23218s = motionEvent.getX();
            this.f23219t = motionEvent.getY();
            this.f23220u = 2;
            this.f23216q = 0.0f;
        }
        boolean z13 = actionMasked == 0 || actionMasked == 6 || actionMasked == 5 || z11;
        boolean z14 = actionMasked == 6;
        int actionIndex = z14 ? motionEvent.getActionIndex() : -1;
        int i10 = z14 ? pointerCount - 1 : pointerCount;
        if (e()) {
            f11 = this.f23218s;
            f10 = this.f23219t;
            this.f23222w = motionEvent.getY() < f10;
        } else {
            float f13 = 0.0f;
            float f14 = 0.0f;
            for (int i11 = 0; i11 < pointerCount; i11++) {
                if (actionIndex != i11) {
                    f13 += motionEvent2.getX(i11);
                    f14 += motionEvent2.getY(i11);
                }
            }
            float f15 = (float) i10;
            float f16 = f13 / f15;
            f10 = f14 / f15;
            f11 = f16;
        }
        float f17 = 0.0f;
        for (int i12 = 0; i12 < pointerCount; i12++) {
            if (actionIndex != i12) {
                f12 += Math.abs(motionEvent2.getX(i12) - f11);
                f17 += Math.abs(motionEvent2.getY(i12) - f10);
            }
        }
        float f18 = (float) i10;
        float f19 = (float) 2;
        float f20 = (f12 / f18) * f19;
        float f21 = (f17 / f18) * f19;
        float hypot = e() ? f21 : (float) Math.hypot((double) f20, (double) f21);
        boolean z15 = this.f23215p;
        this.f23204e = C17752b.e(f11);
        this.f23205f = C17752b.e(f10);
        if (!e() && this.f23215p && (hypot < ((float) this.f23202c) || z13)) {
            this.f23203d.a(new c.b(this.f23214o, this.f23204e, this.f23205f, d()));
            this.f23215p = false;
            this.f23216q = hypot;
        }
        if (z13) {
            this.f23210k = f20;
            this.f23212m = f20;
            this.f23211l = f21;
            this.f23213n = f21;
            this.f23208i = hypot;
            this.f23209j = hypot;
            this.f23216q = hypot;
        }
        int i13 = e() ? this.f23201b : this.f23202c;
        if (!this.f23215p && hypot >= ((float) i13) && (z15 || Math.abs(hypot - this.f23216q) > ((float) this.f23201b))) {
            this.f23210k = f20;
            this.f23212m = f20;
            this.f23211l = f21;
            this.f23213n = f21;
            this.f23208i = hypot;
            this.f23209j = hypot;
            long j10 = this.f23214o;
            this.f23217r = j10;
            this.f23215p = this.f23203d.a(new c.C0370a(j10, this.f23204e, this.f23205f));
        }
        if (actionMasked != 2) {
            return true;
        }
        this.f23210k = f20;
        this.f23211l = f21;
        this.f23208i = hypot;
        if (!(this.f23215p ? this.f23203d.a(new c.C0371c(this.f23214o, this.f23204e, this.f23205f, d())) : true)) {
            return true;
        }
        this.f23212m = this.f23210k;
        this.f23213n = this.f23211l;
        this.f23209j = this.f23208i;
        this.f23217r = this.f23214o;
        return true;
    }

    @SuppressLint({"ExecutorRegistration"})
    public C5290a(Context context, int i10, int i11, b bVar) {
        C17542s.j(context, "context");
        C17542s.j(bVar, "listener");
        this.f23200a = context;
        this.f23201b = i10;
        this.f23202c = i11;
        this.f23203d = bVar;
        this.f23206g = true;
        this.f23207h = true;
        this.f23221v = new GestureDetector(context, new d(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5290a(Context context, int i10, int i11, b bVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? ViewConfiguration.get(context).getScaledTouchSlop() * 2 : i10, (i12 & 4) != 0 ? 0 : i11, bVar);
    }
}
