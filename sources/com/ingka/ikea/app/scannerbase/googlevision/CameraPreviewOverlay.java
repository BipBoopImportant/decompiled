package com.ingka.ikea.app.scannerbase.googlevision;

import Ez.g;
import HJ.C15854t;
import I2.C4600b0;
import I2.L;
import XH.C16807N;
import YH.C16877v;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import com.ingka.ikea.app.scannerbase.googlevision.a;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import qI.C17784a;
import qI.C17785b;
import qI.C17787d;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import uI.C18064m;
import w2.k;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u001c\"B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000f\u0010\rJ/\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u000b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00106\u001a\b\u0018\u000103R\u00020\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u00105R/\u0010=\u001a\u0004\u0018\u00010\u00012\b\u00107\u001a\u0004\u0018\u00010\u00018B@BX\u0002¢\u0006\u0012\n\u0004\b\f\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R+\u0010D\u001a\u00020>2\u0006\u00107\u001a\u00020>8F@FX\u0002¢\u0006\u0012\n\u0004\b?\u00108\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lcom/ingka/ikea/app/scannerbase/googlevision/CameraPreviewOverlay;", "Landroid/view/View;", "Lcom/ingka/ikea/app/scannerbase/googlevision/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "LXH/N;", "h", "()V", "onAttachedToWindow", "onDetachedFromWindow", "w", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "", "Lcom/ingka/ikea/app/scannerbase/googlevision/a$a;", "barcodes", "a", "(Ljava/util/List;)V", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "rectF", "Landroid/graphics/Path;", "b", "Landroid/graphics/Path;", "cutoutPath", "", "c", "F", "cornerRadius", "d", "I", "cutoutId", "e", "Ljava/util/List;", "debugBarcodes", "Landroid/graphics/Paint;", "f", "Landroid/graphics/Paint;", "debugPaint", "Lcom/ingka/ikea/app/scannerbase/googlevision/CameraPreviewOverlay$a;", "g", "Lcom/ingka/ikea/app/scannerbase/googlevision/CameraPreviewOverlay$a;", "globalLayoutListener", "<set-?>", "LqI/d;", "getCutoutView", "()Landroid/view/View;", "setCutoutView", "(Landroid/view/View;)V", "cutoutView", "Lcom/ingka/ikea/app/scannerbase/googlevision/CameraPreviewOverlay$b;", "i", "getMode", "()Lcom/ingka/ikea/app/scannerbase/googlevision/CameraPreviewOverlay$b;", "setMode", "(Lcom/ingka/ikea/app/scannerbase/googlevision/CameraPreviewOverlay$b;)V", "mode", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraPreviewOverlay extends View implements a {

    /* renamed from: j  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f92326j;

    /* renamed from: k  reason: collision with root package name */
    public static final int f92327k = 8;

    /* renamed from: a  reason: collision with root package name */
    private final RectF f92328a;

    /* renamed from: b  reason: collision with root package name */
    private final Path f92329b;

    /* renamed from: c  reason: collision with root package name */
    private final float f92330c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final int f92331d;

    /* renamed from: e  reason: collision with root package name */
    private List<a.C2047a> f92332e;

    /* renamed from: f  reason: collision with root package name */
    private final Paint f92333f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public a f92334g;

    /* renamed from: h  reason: collision with root package name */
    private final C17787d f92335h;

    /* renamed from: i  reason: collision with root package name */
    private final C17787d f92336i;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ingka/ikea/app/scannerbase/googlevision/CameraPreviewOverlay$a;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "<init>", "(Lcom/ingka/ikea/app/scannerbase/googlevision/CameraPreviewOverlay;)V", "LXH/N;", "onGlobalLayout", "()V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            CameraPreviewOverlay.this.h();
            CameraPreviewOverlay.this.invalidate();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/scannerbase/googlevision/CameraPreviewOverlay$b;", "", "<init>", "()V", "b", "a", "Lcom/ingka/ikea/app/scannerbase/googlevision/CameraPreviewOverlay$b$a;", "Lcom/ingka/ikea/app/scannerbase/googlevision/CameraPreviewOverlay$b$b;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ingka/ikea/app/scannerbase/googlevision/CameraPreviewOverlay$b$a;", "Lcom/ingka/ikea/app/scannerbase/googlevision/CameraPreviewOverlay$b;", "<init>", "()V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f92338a = new a();

            private a() {
                super((DefaultConstructorMarker) null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ingka/ikea/app/scannerbase/googlevision/CameraPreviewOverlay$b$b;", "Lcom/ingka/ikea/app/scannerbase/googlevision/CameraPreviewOverlay$b;", "<init>", "()V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.app.scannerbase.googlevision.CameraPreviewOverlay$b$b  reason: collision with other inner class name */
        public static final class C2046b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C2046b f92339a = new C2046b();

            private C2046b() {
                super((DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "run", "()V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f92340a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CameraPreviewOverlay f92341b;

        public c(View view, CameraPreviewOverlay cameraPreviewOverlay) {
            this.f92340a = view;
            this.f92341b = cameraPreviewOverlay;
        }

        public final void run() {
            CameraPreviewOverlay cameraPreviewOverlay = this.f92341b;
            cameraPreviewOverlay.setCutoutView(C4600b0.m0(cameraPreviewOverlay.getRootView(), this.f92341b.f92331d));
            ViewTreeObserver viewTreeObserver = this.f92341b.getRootView().getViewTreeObserver();
            if (!viewTreeObserver.isAlive()) {
                viewTreeObserver = null;
            }
            if (viewTreeObserver != null) {
                a aVar = new a();
                viewTreeObserver.addOnGlobalLayoutListener(aVar);
                this.f92341b.f92334g = aVar;
                return;
            }
            CameraPreviewOverlay cameraPreviewOverlay2 = this.f92341b;
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("ViewTreeObserver was null or dead", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = cameraPreviewOverlay2.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
            C16807N n10 = C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/ingka/ikea/app/scannerbase/googlevision/CameraPreviewOverlay$d", "LqI/b;", "LuI/m;", "property", "oldValue", "newValue", "LXH/N;", "c", "(LuI/m;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends C17785b<View> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CameraPreviewOverlay f92342b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Object obj, CameraPreviewOverlay cameraPreviewOverlay) {
            super(obj);
            this.f92342b = cameraPreviewOverlay;
        }

        /* access modifiers changed from: protected */
        public void c(C18064m<?> mVar, View view, View view2) {
            C17542s.j(mVar, "property");
            View view3 = view2;
            View view4 = view;
            this.f92342b.h();
            this.f92342b.invalidate();
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/ingka/ikea/app/scannerbase/googlevision/CameraPreviewOverlay$e", "LqI/b;", "LuI/m;", "property", "oldValue", "newValue", "LXH/N;", "c", "(LuI/m;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e extends C17785b<b> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CameraPreviewOverlay f92343b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(Object obj, CameraPreviewOverlay cameraPreviewOverlay) {
            super(obj);
            this.f92343b = cameraPreviewOverlay;
        }

        /* access modifiers changed from: protected */
        public void c(C18064m<?> mVar, b bVar, b bVar2) {
            C17542s.j(mVar, "property");
            b bVar3 = bVar2;
            b bVar4 = bVar;
            this.f92343b.invalidate();
        }
    }

    static {
        Class<CameraPreviewOverlay> cls = CameraPreviewOverlay.class;
        f92326j = new C18064m[]{P.e(new A(cls, "cutoutView", "getCutoutView()Landroid/view/View;", 0)), P.e(new A(cls, "mode", "getMode()Lcom/ingka/ikea/app/scannerbase/googlevision/CameraPreviewOverlay$Mode;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CameraPreviewOverlay(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C17542s.j(context, "context");
    }

    /* access modifiers changed from: private */
    public static final void g(CameraPreviewOverlay cameraPreviewOverlay, List list) {
        cameraPreviewOverlay.f92332e = C16877v.t1(list);
        cameraPreviewOverlay.invalidate();
    }

    private final View getCutoutView() {
        return (View) this.f92335h.a(this, f92326j[0]);
    }

    /* access modifiers changed from: private */
    public final void h() {
        this.f92329b.reset();
        View cutoutView = getCutoutView();
        if (cutoutView != null) {
            this.f92328a.set((float) cutoutView.getLeft(), (float) cutoutView.getTop(), (float) cutoutView.getRight(), (float) cutoutView.getBottom());
        }
        Path path = this.f92329b;
        RectF rectF = this.f92328a;
        float f10 = this.f92330c;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        this.f92329b.setFillType(Path.FillType.INVERSE_EVEN_ODD);
        this.f92329b.close();
    }

    /* access modifiers changed from: private */
    public final void setCutoutView(View view) {
        this.f92335h.b(this, f92326j[0], view);
    }

    public void a(List<a.C2047a> list) {
        C17542s.j(list, "barcodes");
        if (C17542s.e(Looper.myLooper(), Looper.getMainLooper())) {
            this.f92332e = C16877v.t1(list);
            invalidate();
            return;
        }
        post(new Yj.a(this, list));
    }

    public void draw(Canvas canvas) {
        C17542s.j(canvas, "canvas");
        int save = canvas.save();
        if (C17542s.e(getMode(), b.C2046b.f92339a)) {
            canvas.clipPath(this.f92329b);
        }
        super.draw(canvas);
        canvas.restoreToCount(save);
        for (a.C2047a aVar : this.f92332e) {
            this.f92333f.setColor(aVar.b() ? -65281 : -16776961);
            canvas.drawRect(aVar.a(), this.f92333f);
        }
    }

    public final b getMode() {
        return (b) this.f92336i.a(this, f92326j[1]);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        L.a(this, new c(this, this));
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (this.f92334g != null) {
            ViewTreeObserver viewTreeObserver = getRootView().getViewTreeObserver();
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    viewTreeObserver = null;
                }
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this.f92334g);
                }
            }
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("ViewTreeObserver was null or dead", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = CameraPreviewOverlay.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        h();
    }

    public final void setMode(b bVar) {
        C17542s.j(bVar, "<set-?>");
        this.f92336i.b(this, f92326j[1], bVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CameraPreviewOverlay(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CameraPreviewOverlay(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        C17542s.j(context, "context");
        this.f92328a = new RectF();
        this.f92329b = new Path();
        this.f92332e = C16877v.n();
        Paint paint = new Paint(1);
        paint.setColor(-65281);
        paint.setStrokeWidth(Xo.e.a(2));
        paint.setStyle(Paint.Style.STROKE);
        this.f92333f = paint;
        C17784a aVar = C17784a.f146467a;
        this.f92335h = new d((Object) null, this);
        this.f92336i = new e(b.C2046b.f92339a, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f109738a, 0, 0);
        C17542s.i(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.f92331d = k.b(obtainStyledAttributes, g.f109740c);
            this.f92330c = (float) obtainStyledAttributes.getDimensionPixelSize(g.f109739b, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
