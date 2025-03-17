package nl;

import HJ.C15854t;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.view.animation.LinearInterpolator;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ll.C11549a;
import ml.C11578a;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import rI.C17853c;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0016\u0010&\u001a\u0004\u0018\u00010#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010+\u001a\n (*\u0004\u0018\u00010'0'8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010\u001d¨\u0006."}, d2 = {"Lnl/b;", "Lml/a;", "", "skeletonColor", "Lll/a;", "shape", "backgroundColor", "<init>", "(ILll/a;Ljava/lang/Integer;)V", "LXH/N;", "d", "()V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "alpha", "setAlpha", "(I)V", "", "visible", "restart", "setVisible", "(ZZ)Z", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "e", "I", "startColor", "f", "endColor", "g", "currentColor", "Landroid/graphics/Paint;", "h", "Landroid/graphics/Paint;", "backgroundPaint", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "i", "Landroid/animation/ValueAnimator;", "animator", "j", "drawableAlpha", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: nl.b  reason: case insensitive filesystem */
public final class C11652b extends C11578a {

    /* renamed from: e  reason: collision with root package name */
    private final int f99929e;

    /* renamed from: f  reason: collision with root package name */
    private final int f99930f;

    /* renamed from: g  reason: collision with root package name */
    private int f99931g;

    /* renamed from: h  reason: collision with root package name */
    private final Paint f99932h;

    /* renamed from: i  reason: collision with root package name */
    private final ValueAnimator f99933i;

    /* renamed from: j  reason: collision with root package name */
    private int f99934j;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11652b(int i10, C11549a aVar, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? C11549a.b.f99204a : aVar, (i11 & 4) != 0 ? null : num);
    }

    /* access modifiers changed from: private */
    public static final void c(C11652b bVar, ValueAnimator valueAnimator) {
        C17542s.j(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C17542s.h(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        bVar.f99931g = ((Integer) animatedValue).intValue();
        bVar.d();
        bVar.invalidateSelf();
    }

    private final void d() {
        a().setColor(this.f99931g);
        a().setAlpha((int) (C11653c.c((this.f99931g >> 24) & 255) * C11653c.c(this.f99934j) * ((float) 255)));
    }

    public void draw(Canvas canvas) {
        C17542s.j(canvas, "canvas");
        Paint paint = this.f99932h;
        if (paint != null) {
            canvas.drawPaint(paint);
        }
        super.draw(canvas);
    }

    public void setAlpha(int i10) {
        this.f99934j = i10;
        Paint paint = this.f99932h;
        if (paint != null) {
            paint.setAlpha(i10);
        }
        d();
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        Paint paint = this.f99932h;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }

    public boolean setVisible(boolean z10, boolean z11) {
        String str;
        char c10;
        char c11;
        String str2;
        String str3 = DslKt.INDICATOR_BACKGROUND;
        String str4 = DslKt.INDICATOR_MAIN;
        char c12 = '$';
        Class<C11652b> cls = C11652b.class;
        if (z10 && !this.f99933i.isStarted()) {
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str5 = null;
            String str6 = null;
            for (C11819b bVar : arrayList) {
                if (str5 == null) {
                    String a10 = C11818a.a("ShimmerSkeleton setVisible start animation", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str5 = C11820c.a(a10);
                }
                String str7 = str5;
                if (str6 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, c12, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str4 : str3) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str8 = str6;
                bVar.a(eVar, str8, false, (Throwable) null, str7);
                str6 = str8;
                str5 = str7;
                c12 = '$';
            }
            this.f99933i.start();
        }
        boolean visible = super.setVisible(z10, z11);
        if (visible) {
            if (isVisible()) {
                e eVar2 = e.DEBUG;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next2 : d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar2, false)) {
                        arrayList2.add(next2);
                    }
                }
                String str9 = null;
                String str10 = null;
                for (C11819b bVar2 : arrayList2) {
                    if (str9 == null) {
                        String a11 = C11818a.a("ShimmerSkeleton setVisible resume " + this, (Throwable) null);
                        if (a11 == null) {
                            break;
                        }
                        str9 = C11820c.a(a11);
                    }
                    String str11 = str9;
                    if (str10 == null) {
                        String name2 = cls.getName();
                        C17542s.g(name2);
                        str2 = str3;
                        String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o13.length() != 0) {
                            name2 = C15854t.P0(o13, "Kt");
                        }
                        str10 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str4 : str2) + DslKt.INDICATOR_SEPARATOR + name2;
                    } else {
                        str2 = str3;
                    }
                    String str12 = str10;
                    bVar2.a(eVar2, str12, false, (Throwable) null, str11);
                    str10 = str12;
                    str9 = str11;
                    str3 = str2;
                }
                this.f99933i.resume();
            } else {
                String str13 = str3;
                e eVar3 = e.DEBUG;
                ArrayList<C11819b> arrayList3 = new ArrayList<>();
                for (Object next3 : d.f102012a.a()) {
                    if (((C11819b) next3).b(eVar3, false)) {
                        arrayList3.add(next3);
                    }
                }
                String str14 = null;
                String str15 = null;
                for (C11819b bVar3 : arrayList3) {
                    if (str14 == null) {
                        String a12 = C11818a.a("ShimmerSkeleton setVisible pause " + this, (Throwable) null);
                        if (a12 == null) {
                            break;
                        }
                        str14 = C11820c.a(a12);
                    }
                    if (str15 == null) {
                        String name3 = cls.getName();
                        C17542s.g(name3);
                        c11 = '$';
                        c10 = 2;
                        str = str4;
                        String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o14.length() != 0) {
                            name3 = C15854t.P0(o14, "Kt");
                        }
                        str15 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str : str13) + DslKt.INDICATOR_SEPARATOR + name3;
                    } else {
                        str = str4;
                        c11 = '$';
                        c10 = 2;
                    }
                    char c13 = c11;
                    char c14 = c10;
                    bVar3.a(eVar3, str15, false, (Throwable) null, str14);
                    str4 = str;
                }
                this.f99933i.pause();
            }
        }
        return visible;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11652b(int i10, C11549a aVar, Integer num) {
        super(i10, aVar);
        Paint paint;
        C17542s.j(aVar, "shape");
        int b10 = C11653c.d(i10, 128);
        this.f99929e = b10;
        int b11 = C11653c.d(i10, 51);
        this.f99930f = b11;
        this.f99931g = b10;
        if (num != null) {
            paint = new Paint();
            paint.setColor(num.intValue());
        } else {
            paint = null;
        }
        this.f99932h = paint;
        ValueAnimator ofArgb = ValueAnimator.ofArgb(new int[]{b10, b11});
        ofArgb.addUpdateListener(new C11651a(this));
        ofArgb.setCurrentFraction(C17853c.f146670a.c());
        ofArgb.setDuration(800);
        ofArgb.setRepeatCount(-1);
        ofArgb.setRepeatMode(2);
        ofArgb.setInterpolator(new LinearInterpolator());
        this.f99933i = ofArgb;
        this.f99934j = 255;
    }
}
