package ZF;

import RF.k;
import XH.v;
import android.view.MotionEvent;
import com.sugarcube.core.logger.DslKt;
import com.sugarcube.decorate_engine.EraserPickId;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 H2\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0003J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0012J\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0003R$\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010+\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u0010:\u001a\u0004\u0018\u0001048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b%\u00107\"\u0004\b8\u00109R\"\u0010A\u001a\u00020;8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b5\u0010>\"\u0004\b?\u0010@R\"\u0010D\u001a\u00020;8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bB\u0010=\u001a\u0004\b-\u0010>\"\u0004\bC\u0010@R\"\u0010G\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b \u0010&\u001a\u0004\bE\u0010(\"\u0004\bF\u0010*R\"\u0010I\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010&\u001a\u0004\bH\u0010(\"\u0004\b=\u0010*R\u001a\u0010J\u001a\u00020;8\u0006XD¢\u0006\f\n\u0004\b/\u0010=\u001a\u0004\bB\u0010>R\"\u0010M\u001a\u00020,8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bK\u0010.\u001a\u0004\b<\u00100\"\u0004\bL\u00102R\"\u0010Q\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bN\u0010&\u001a\u0004\bO\u0010(\"\u0004\bP\u0010*R\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00040R8\u0002X\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001d\u0010Z\u001a\b\u0012\u0004\u0012\u00020V0R8\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bN\u0010YR\u001d\u0010[\u001a\b\u0012\u0004\u0012\u00020V0R8\u0006¢\u0006\f\n\u0004\bO\u0010X\u001a\u0004\bW\u0010YR\u001d\u0010\\\u001a\b\u0012\u0004\u0012\u00020V0R8\u0006¢\u0006\f\n\u0004\bE\u0010X\u001a\u0004\bS\u0010YR\u0011\u0010^\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bK\u0010]¨\u0006_"}, d2 = {"LZF/W0;", "", "<init>", "()V", "", "touchIdx", "LXH/N;", "b", "(I)V", "u", "to", "from", "s", "(II)V", "Landroid/view/MotionEvent;", "event", "", "a", "(Landroid/view/MotionEvent;)Z", "w", "v", "t", "x", "LRF/k;", "LRF/k;", "i", "()LRF/k;", "G", "(LRF/k;)V", "selectedItem", "Lcom/sugarcube/decorate_engine/EraserPickId;", "Lcom/sugarcube/decorate_engine/EraserPickId;", "h", "()Lcom/sugarcube/decorate_engine/EraserPickId;", "D", "(Lcom/sugarcube/decorate_engine/EraserPickId;)V", "pickId", "c", "Z", "r", "()Z", "H", "(Z)V", "isSingleTap", "", "d", "J", "j", "()J", "I", "(J)V", "tapStartTime", "LZF/D0;", "e", "LZF/D0;", "()LZF/D0;", "y", "(LZF/D0;)V", "currentGesture", "", "f", "F", "()F", "A", "(F)V", "initialPointersDistance", "g", "z", "initialAngle", "p", "E", "isPinchZoom", "q", "isRotate", "minDistanceThreshold", "k", "B", "longPressStartTime", "l", "o", "C", "isLongPressing", "", "m", "[Ljava/lang/Integer;", "touchIds", "Landroid/view/MotionEvent$PointerCoords;", "n", "[Landroid/view/MotionEvent$PointerCoords;", "()[Landroid/view/MotionEvent$PointerCoords;", "touchCurPos", "touchPrevPos", "touchDownPos", "()I", "touchCount", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ZF.W0  reason: case insensitive filesystem */
public final class C16938W0 {

    /* renamed from: q  reason: collision with root package name */
    public static final a f140600q = new a((DefaultConstructorMarker) null);

    /* renamed from: r  reason: collision with root package name */
    public static final int f140601r = 8;

    /* renamed from: a  reason: collision with root package name */
    private k f140602a;

    /* renamed from: b  reason: collision with root package name */
    private EraserPickId f140603b = EraserPickId.Companion.getKNone();

    /* renamed from: c  reason: collision with root package name */
    private boolean f140604c;

    /* renamed from: d  reason: collision with root package name */
    private long f140605d;

    /* renamed from: e  reason: collision with root package name */
    private C16901D0 f140606e;

    /* renamed from: f  reason: collision with root package name */
    private float f140607f;

    /* renamed from: g  reason: collision with root package name */
    private float f140608g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f140609h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f140610i;

    /* renamed from: j  reason: collision with root package name */
    private final float f140611j = 5.0f;

    /* renamed from: k  reason: collision with root package name */
    private long f140612k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f140613l;

    /* renamed from: m  reason: collision with root package name */
    private final Integer[] f140614m;

    /* renamed from: n  reason: collision with root package name */
    private final MotionEvent.PointerCoords[] f140615n;

    /* renamed from: o  reason: collision with root package name */
    private final MotionEvent.PointerCoords[] f140616o;

    /* renamed from: p  reason: collision with root package name */
    private final MotionEvent.PointerCoords[] f140617p;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u000b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LZF/W0$a;", "", "<init>", "()V", "Landroid/view/MotionEvent;", "event", "LXH/v;", "", "a", "(Landroid/view/MotionEvent;)LXH/v;", "Landroid/view/MotionEvent$PointerCoords;", "b", "e", "(Landroid/view/MotionEvent$PointerCoords;Landroid/view/MotionEvent$PointerCoords;)F", "d", "(Landroid/view/MotionEvent$PointerCoords;Landroid/view/MotionEvent$PointerCoords;)Landroid/view/MotionEvent$PointerCoords;", "to", "from", "LXH/N;", "c", "(Landroid/view/MotionEvent$PointerCoords;Landroid/view/MotionEvent$PointerCoords;)V", "(Landroid/view/MotionEvent$PointerCoords;)V", "", "kTouchCount", "I", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ZF.W0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v<Float, Float> a(MotionEvent motionEvent) {
            C17542s.j(motionEvent, "event");
            if (motionEvent.getPointerCount() <= 1) {
                return new v<>(Float.valueOf(0.0f), Float.valueOf(0.0f));
            }
            double x10 = (double) (motionEvent.getX(0) - motionEvent.getX(1));
            double y10 = (double) (motionEvent.getY(0) - motionEvent.getY(1));
            return new v<>(Float.valueOf((float) Math.hypot(x10, y10)), Float.valueOf((float) Math.toDegrees(Math.atan2(y10, x10))));
        }

        public final void b(MotionEvent.PointerCoords pointerCoords) {
            C17542s.j(pointerCoords, "c");
            pointerCoords.x = -1.0f;
            pointerCoords.y = -1.0f;
        }

        public final void c(MotionEvent.PointerCoords pointerCoords, MotionEvent.PointerCoords pointerCoords2) {
            C17542s.j(pointerCoords, "to");
            C17542s.j(pointerCoords2, "from");
            pointerCoords.x = pointerCoords2.x;
            pointerCoords.y = pointerCoords2.y;
        }

        public final MotionEvent.PointerCoords d(MotionEvent.PointerCoords pointerCoords, MotionEvent.PointerCoords pointerCoords2) {
            C17542s.j(pointerCoords, "a");
            C17542s.j(pointerCoords2, DslKt.INDICATOR_BACKGROUND);
            MotionEvent.PointerCoords pointerCoords3 = new MotionEvent.PointerCoords();
            pointerCoords3.x = (pointerCoords.x + pointerCoords2.x) / 2.0f;
            pointerCoords3.y = (pointerCoords.y + pointerCoords2.y) / 2.0f;
            return pointerCoords3;
        }

        public final float e(MotionEvent.PointerCoords pointerCoords, MotionEvent.PointerCoords pointerCoords2) {
            C17542s.j(pointerCoords, "a");
            C17542s.j(pointerCoords2, DslKt.INDICATOR_BACKGROUND);
            float f10 = pointerCoords.x - pointerCoords2.x;
            float f11 = pointerCoords.y - pointerCoords2.y;
            return (float) Math.sqrt((double) ((f10 * f10) + (f11 * f11)));
        }

        private a() {
        }
    }

    public C16938W0() {
        Integer[] numArr = new Integer[3];
        for (int i10 = 0; i10 < 3; i10++) {
            numArr[i10] = -1;
        }
        this.f140614m = numArr;
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[3];
        for (int i11 = 0; i11 < 3; i11++) {
            pointerCoordsArr[i11] = new MotionEvent.PointerCoords();
        }
        this.f140615n = pointerCoordsArr;
        MotionEvent.PointerCoords[] pointerCoordsArr2 = new MotionEvent.PointerCoords[3];
        for (int i12 = 0; i12 < 3; i12++) {
            pointerCoordsArr2[i12] = new MotionEvent.PointerCoords();
        }
        this.f140616o = pointerCoordsArr2;
        MotionEvent.PointerCoords[] pointerCoordsArr3 = new MotionEvent.PointerCoords[3];
        for (int i13 = 0; i13 < 3; i13++) {
            pointerCoordsArr3[i13] = new MotionEvent.PointerCoords();
        }
        this.f140617p = pointerCoordsArr3;
        v();
    }

    private final void b(int i10) {
        this.f140614m[i10] = -1;
        a aVar = f140600q;
        aVar.b(this.f140615n[i10]);
        aVar.b(this.f140616o[i10]);
        aVar.b(this.f140617p[i10]);
    }

    private final void s(int i10, int i11) {
        Integer[] numArr = this.f140614m;
        numArr[i10] = numArr[i11];
        a aVar = f140600q;
        MotionEvent.PointerCoords[] pointerCoordsArr = this.f140615n;
        aVar.c(pointerCoordsArr[i10], pointerCoordsArr[i11]);
        MotionEvent.PointerCoords[] pointerCoordsArr2 = this.f140616o;
        aVar.c(pointerCoordsArr2[i10], pointerCoordsArr2[i11]);
        MotionEvent.PointerCoords[] pointerCoordsArr3 = this.f140617p;
        aVar.c(pointerCoordsArr3[i10], pointerCoordsArr3[i11]);
        this.f140614m[i11] = -1;
        aVar.b(this.f140615n[i11]);
        aVar.b(this.f140616o[i11]);
        aVar.b(this.f140617p[i11]);
    }

    private final void u() {
        if (k() > 0 && this.f140614m[0].intValue() == -1) {
            s(0, this.f140614m[1].intValue() != -1 ? 1 : 2);
        }
        if (k() > 1 && this.f140614m[1].intValue() == -1) {
            s(1, 2);
        }
    }

    public final void A(float f10) {
        this.f140607f = f10;
    }

    public final void B(long j10) {
        this.f140612k = j10;
    }

    public final void C(boolean z10) {
        this.f140613l = z10;
    }

    public final void D(EraserPickId eraserPickId) {
        C17542s.j(eraserPickId, "<set-?>");
        this.f140603b = eraserPickId;
    }

    public final void E(boolean z10) {
        this.f140609h = z10;
    }

    public final void F(boolean z10) {
        this.f140610i = z10;
    }

    public final void G(k kVar) {
        this.f140602a = kVar;
    }

    public final void H(boolean z10) {
        this.f140604c = z10;
    }

    public final void I(long j10) {
        this.f140605d = j10;
    }

    public final boolean a(MotionEvent motionEvent) {
        C17542s.j(motionEvent, "event");
        int pointerCount = motionEvent.getPointerCount();
        int i10 = pointerCount - 1;
        if (i10 >= this.f140614m.length) {
            return false;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        this.f140614m[i10] = Integer.valueOf(pointerId);
        try {
            motionEvent.getPointerCoords(pointerId, this.f140615n[i10]);
            a aVar = f140600q;
            aVar.c(this.f140616o[i10], this.f140615n[i10]);
            aVar.c(this.f140617p[i10], this.f140615n[i10]);
            int length = this.f140614m.length;
            while (pointerCount < length) {
                b(pointerCount);
                pointerCount++;
            }
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    public final C16901D0 c() {
        return this.f140606e;
    }

    public final float d() {
        return this.f140608g;
    }

    public final float e() {
        return this.f140607f;
    }

    public final long f() {
        return this.f140612k;
    }

    public final float g() {
        return this.f140611j;
    }

    public final EraserPickId h() {
        return this.f140603b;
    }

    public final k i() {
        return this.f140602a;
    }

    public final long j() {
        return this.f140605d;
    }

    public final int k() {
        int i10 = 0;
        for (Integer intValue : this.f140614m) {
            if (intValue.intValue() != -1) {
                i10++;
            }
        }
        return i10;
    }

    public final MotionEvent.PointerCoords[] l() {
        return this.f140615n;
    }

    public final MotionEvent.PointerCoords[] m() {
        return this.f140617p;
    }

    public final MotionEvent.PointerCoords[] n() {
        return this.f140616o;
    }

    public final boolean o() {
        return this.f140613l;
    }

    public final boolean p() {
        return this.f140609h;
    }

    public final boolean q() {
        return this.f140610i;
    }

    public final boolean r() {
        return this.f140604c;
    }

    public final boolean t(MotionEvent motionEvent) {
        C17542s.j(motionEvent, "event");
        int length = this.f140614m.length;
        boolean z10 = false;
        for (int i10 = 0; i10 < length; i10++) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f140614m[i10].intValue());
            if (findPointerIndex >= 0) {
                f140600q.c(this.f140616o[i10], this.f140615n[i10]);
                motionEvent.getPointerCoords(findPointerIndex, this.f140615n[i10]);
                z10 = true;
            }
        }
        return z10;
    }

    public final void v() {
        int length = this.f140614m.length;
        for (int i10 = 0; i10 < length; i10++) {
            b(i10);
        }
    }

    public final boolean w(MotionEvent motionEvent) {
        C17542s.j(motionEvent, "event");
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        int k10 = k();
        int length = this.f140614m.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            } else if (pointerId == this.f140614m[i10].intValue()) {
                b(i10);
                break;
            } else {
                i10++;
            }
        }
        if (k() == k10) {
            return false;
        }
        u();
        return true;
    }

    public final void x() {
        this.f140606e = null;
        int length = this.f140614m.length;
        for (int i10 = 0; i10 < length; i10++) {
            a aVar = f140600q;
            aVar.c(this.f140616o[i10], this.f140615n[i10]);
            aVar.c(this.f140617p[i10], this.f140615n[i10]);
        }
    }

    public final void y(C16901D0 d02) {
        this.f140606e = d02;
    }

    public final void z(float f10) {
        this.f140608g = f10;
    }
}
