package com.ingka.ikea.app.scannerbase.googlevision;

import HJ.C15854t;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import com.sugarcube.core.logger.DslKt;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import tK.C18010a;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001&B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\fJ\r\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\fJ\u001f\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010#\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H\u0014¢\u0006\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\"\u0010/\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00103\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b0\u0010*\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R\u0018\u00106\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00108\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u00107R\u0014\u0010;\u001a\u0002098\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010:R\u0016\u0010=\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b<\u00107R\u0017\u0010?\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b>\u00107\u001a\u0004\b>\u0010\u0013R\u0014\u0010@\u001a\u00020\u00118BX\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0013¨\u0006A"}, d2 = {"Lcom/ingka/ikea/app/scannerbase/googlevision/CameraPreview;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "LXH/N;", "l", "()V", "i", "j", "n", "f", "", "e", "()Z", "Lya/a;", "source", "m", "(Lya/a;)V", "o", "k", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/content/IntentFilter;", "a", "Landroid/content/IntentFilter;", "batteryIntentFilter", "b", "I", "getDefaultPreviewWidth", "()I", "setDefaultPreviewWidth", "(I)V", "defaultPreviewWidth", "c", "getDefaultPreviewHeight", "setDefaultPreviewHeight", "defaultPreviewHeight", "d", "Lya/a;", "cameraSource", "Z", "surfaceAvailable", "Landroid/view/SurfaceView;", "Landroid/view/SurfaceView;", "surfaceView", "g", "_isRunning", "h", "isRunning", "isPortraitMode", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraPreview extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private final IntentFilter f92317a;

    /* renamed from: b  reason: collision with root package name */
    private int f92318b;

    /* renamed from: c  reason: collision with root package name */
    private int f92319c;

    /* renamed from: d  reason: collision with root package name */
    private ya.a f92320d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f92321e;

    /* renamed from: f  reason: collision with root package name */
    private final SurfaceView f92322f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f92323g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f92324h;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/ingka/ikea/app/scannerbase/googlevision/CameraPreview$a;", "Landroid/view/SurfaceHolder$Callback;", "<init>", "(Lcom/ingka/ikea/app/scannerbase/googlevision/CameraPreview;)V", "Landroid/view/SurfaceHolder;", "holder", "LXH/N;", "surfaceCreated", "(Landroid/view/SurfaceHolder;)V", "", "format", "width", "height", "surfaceChanged", "(Landroid/view/SurfaceHolder;III)V", "surfaceDestroyed", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class a implements SurfaceHolder.Callback {
        public a() {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            C17542s.j(surfaceHolder, "holder");
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            C17542s.j(surfaceHolder, "holder");
            CameraPreview.this.f92321e = true;
            try {
                CameraPreview.this.n();
            } catch (SecurityException e10) {
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a((String) null, e10);
                        if (a10 != null) {
                            str = C11820c.a(a10);
                        } else {
                            return;
                        }
                    }
                    if (str2 == null) {
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "Missing permission to start camera";
                    }
                    bVar.a(eVar, str2, false, e10, str);
                }
            } catch (IOException e11) {
                e eVar2 = e.ERROR;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next2 : d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar2, false)) {
                        arrayList2.add(next2);
                    }
                }
                String str3 = null;
                String str4 = null;
                for (C11819b bVar2 : arrayList2) {
                    if (str3 == null) {
                        String a11 = C11818a.a((String) null, e11);
                        if (a11 != null) {
                            str3 = C11820c.a(a11);
                        } else {
                            return;
                        }
                    }
                    String str5 = str3;
                    if (str4 == null) {
                        str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "Could not acquire camera";
                    }
                    String str6 = str4;
                    bVar2.a(eVar2, str6, false, e11, str5);
                    str3 = str5;
                    str4 = str6;
                }
            } catch (RuntimeException e12) {
                e eVar3 = e.ERROR;
                ArrayList<C11819b> arrayList3 = new ArrayList<>();
                for (Object next3 : d.f102012a.a()) {
                    if (((C11819b) next3).b(eVar3, false)) {
                        arrayList3.add(next3);
                    }
                }
                String str7 = null;
                String str8 = null;
                for (C11819b bVar3 : arrayList3) {
                    if (str7 == null) {
                        String a12 = C11818a.a((String) null, e12);
                        if (a12 == null) {
                            break;
                        }
                        str7 = C11820c.a(a12);
                    }
                    String str9 = str7;
                    if (str8 == null) {
                        String name = a.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str10 = str8;
                    bVar3.a(eVar3, str10, false, e12, str9);
                    str7 = str9;
                    str8 = str10;
                }
                CameraPreview.this.f();
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C17542s.j(surfaceHolder, "holder");
            CameraPreview.this.f92321e = false;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CameraPreview(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C17542s.j(context, "context");
    }

    private final boolean e() {
        Intent registerReceiver = getContext().registerReceiver((BroadcastReceiver) null, this.f92317a);
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            return (intExtra == -1 || intExtra2 == -1 || ((float) (intExtra * 100)) / ((float) intExtra2) >= 30.0f) ? false : true;
        }
    }

    /* access modifiers changed from: private */
    public final void f() {
        char c10 = '$';
        Class<CameraPreview> cls = CameraPreview.class;
        int i10 = 2;
        if (!e()) {
            IllegalStateException illegalStateException = new IllegalStateException("Could not start camera source, unrelated to low battery");
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, c10, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, illegalStateException, str3);
                str2 = str4;
                str = str3;
                eVar = eVar;
                c10 = '$';
            }
            return;
        }
        IllegalStateException illegalStateException2 = new IllegalStateException("Could not start camera source, related to low battery");
        e eVar2 = e.ERROR;
        ArrayList<C11819b> arrayList2 = new ArrayList<>();
        for (Object next2 : d.f102012a.a()) {
            if (((C11819b) next2).b(eVar2, false)) {
                arrayList2.add(next2);
            }
        }
        String str5 = null;
        String str6 = null;
        for (C11819b bVar2 : arrayList2) {
            if (str5 == null) {
                String a11 = C11818a.a((String) null, illegalStateException2);
                if (a11 != null) {
                    str5 = C11820c.a(a11);
                } else {
                    return;
                }
            }
            if (str6 == null) {
                String name2 = cls.getName();
                C17542s.g(name2);
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, i10, (Object) null), '.', (String) null, i10, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
            }
            bVar2.a(eVar2, str6, false, illegalStateException2, str5);
            i10 = 2;
        }
    }

    private final boolean g() {
        return getContext().getResources().getConfiguration().orientation == 1;
    }

    private final void i() {
        setBackground((Drawable) null);
    }

    private final void j() {
        setBackgroundResource(C18010a.f147423g);
    }

    private final void l() {
        ya.a aVar = this.f92320d;
        if (aVar != null) {
            try {
                aVar.b();
            } catch (NullPointerException unused) {
            }
        }
        this.f92320d = null;
    }

    /* access modifiers changed from: private */
    public final void n() {
        ya.a aVar = this.f92320d;
        if (aVar != null && this.f92321e) {
            i();
            aVar.c(this.f92322f.getHolder());
            requestLayout();
            this.f92323g = true;
        }
    }

    public final int getDefaultPreviewHeight() {
        return this.f92319c;
    }

    public final int getDefaultPreviewWidth() {
        return this.f92318b;
    }

    public final boolean h() {
        return this.f92324h;
    }

    public final void k() {
        this.f92323g = false;
        l();
        this.f92322f.getHolder().getSurface().release();
    }

    public final void m(ya.a aVar) {
        if (C17542s.e(this.f92320d, aVar)) {
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("CameraSource already running(" + this.f92323g + "), ignore", (Throwable) null);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = CameraPreview.class.getName();
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
            return;
        }
        this.f92320d = aVar;
        n();
    }

    public final void o() {
        this.f92323g = false;
        l();
        j();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        J9.a a10;
        int i14 = this.f92318b;
        int i15 = this.f92319c;
        ya.a aVar = this.f92320d;
        if (!(aVar == null || (a10 = aVar.a()) == null)) {
            i14 = a10.b();
            i15 = a10.a();
            this.f92318b = a10.b();
            this.f92319c = a10.a();
        }
        if (g()) {
            int i16 = i15;
            i15 = i14;
            i14 = i16;
        }
        float f10 = ((float) i14) / ((float) i15);
        int i17 = i12 - i10;
        int i18 = i13 - i11;
        float f11 = (float) i17;
        float f12 = (float) i18;
        if (f10 > f11 / f12) {
            int i19 = ((int) ((f10 * f12) - f11)) / 2;
            this.f92322f.layout(-i19, 0, i17 + i19, i18);
            return;
        }
        int i20 = ((int) ((f11 / f10) - f12)) / 2;
        this.f92322f.layout(0, -i20, i17, i18 + i20);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f92322f.measure(i10, i11);
    }

    public final void setDefaultPreviewHeight(int i10) {
        this.f92319c = i10;
    }

    public final void setDefaultPreviewWidth(int i10) {
        this.f92318b = i10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CameraPreview(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CameraPreview(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        C17542s.j(context, "context");
        this.f92317a = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        this.f92318b = 320;
        this.f92319c = 240;
        this.f92324h = this.f92323g;
        SurfaceView surfaceView = new SurfaceView(context);
        this.f92322f = surfaceView;
        surfaceView.getHolder().addCallback(new a());
        addView(surfaceView);
        j();
    }
}
