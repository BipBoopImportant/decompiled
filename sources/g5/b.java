package G5;

import E5.g;
import O5.h;
import XH.C16814e;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pI.C17752b;
import tI.C17978n;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 r2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0011BE\b\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\bH\u0017¢\u0006\u0004\b\u001f\u0010\u001bJ\u0011\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u00020\u00132\b\u0010#\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&H\u0014¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020\bH\u0014¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020-H\u0014¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\bH\u0016¢\u0006\u0004\b1\u0010\u001bJ\u000f\u00102\u001a\u00020\bH\u0016¢\u0006\u0004\b2\u0010\u001bJ\u001f\u00106\u001a\u00020\u00132\u0006\u00103\u001a\u00020\u00012\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u00132\u0006\u00103\u001a\u00020\u0001H\u0016¢\u0006\u0004\b8\u00109J'\u0010<\u001a\u00020\u00132\u0006\u00103\u001a\u00020\u00012\u0006\u00105\u001a\u0002042\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u00132\u0006\u0010>\u001a\u00020\bH\u0016¢\u0006\u0004\b?\u0010\u001eJ\u0019\u0010B\u001a\u00020\u00132\b\u0010A\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\bB\u0010CJ\u0019\u0010F\u001a\u00020\u00132\b\u0010E\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0004\bF\u0010GJ\u0019\u0010J\u001a\u00020\u00132\b\u0010I\u001a\u0004\u0018\u00010HH\u0017¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\nH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010\u0004\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0004\u0010\u0015J\u000f\u0010N\u001a\u00020\u0013H\u0016¢\u0006\u0004\bN\u0010\u0015J\u001f\u0010Q\u001a\u00020\u00132\u0006\u0010O\u001a\u00020\u00012\u0006\u0010P\u001a\u00020&H\u0001¢\u0006\u0004\bQ\u0010RR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010V\u001a\u0004\bW\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bQ\u0010X\u001a\u0004\bY\u0010MR\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bZ\u0010X\u001a\u0004\b[\u0010MR\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020]0\\8\u0002X\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010b\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\ba\u0010VR\u0014\u0010d\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\bc\u0010VR\u0016\u0010g\u001a\u00020:8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010i\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bh\u0010VR\u0016\u0010.\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bj\u0010VR(\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010k\u001a\u0004\u0018\u00010\u00018\u0006@BX\u000e¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bp\u0010m\u001a\u0004\bq\u0010o¨\u0006s"}, d2 = {"LG5/b;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable$Callback;", "", "start", "end", "LO5/h;", "scale", "", "durationMillis", "", "fadeStart", "preferExactIntrinsicSize", "<init>", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;LO5/h;IZZ)V", "startSize", "endSize", "a", "(Ljava/lang/Integer;Ljava/lang/Integer;)I", "LXH/N;", "b", "()V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "getAlpha", "()I", "alpha", "setAlpha", "(I)V", "getOpacity", "Landroid/graphics/ColorFilter;", "getColorFilter", "()Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "level", "onLevelChange", "(I)Z", "", "state", "onStateChange", "([I)Z", "getIntrinsicWidth", "getIntrinsicHeight", "who", "Ljava/lang/Runnable;", "what", "unscheduleDrawable", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V", "invalidateDrawable", "(Landroid/graphics/drawable/Drawable;)V", "", "when", "scheduleDrawable", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V", "tintColor", "setTint", "Landroid/content/res/ColorStateList;", "tint", "setTintList", "(Landroid/content/res/ColorStateList;)V", "Landroid/graphics/PorterDuff$Mode;", "tintMode", "setTintMode", "(Landroid/graphics/PorterDuff$Mode;)V", "Landroid/graphics/BlendMode;", "blendMode", "setTintBlendMode", "(Landroid/graphics/BlendMode;)V", "isRunning", "()Z", "stop", "drawable", "targetBounds", "c", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/Rect;)V", "LO5/h;", "getScale", "()LO5/h;", "I", "getDurationMillis", "Z", "getFadeStart", "d", "getPreferExactIntrinsicSize", "", "Landroidx/vectordrawable/graphics/drawable/b;", "e", "Ljava/util/List;", "callbacks", "f", "intrinsicWidth", "g", "intrinsicHeight", "h", "J", "startTimeMillis", "i", "maxAlpha", "j", "value", "k", "Landroid/graphics/drawable/Drawable;", "getStart", "()Landroid/graphics/drawable/Drawable;", "l", "getEnd", "m", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: m  reason: collision with root package name */
    public static final a f36150m = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final h f36151a;

    /* renamed from: b  reason: collision with root package name */
    private final int f36152b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f36153c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f36154d;

    /* renamed from: e  reason: collision with root package name */
    private final List<androidx.vectordrawable.graphics.drawable.b> f36155e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final int f36156f;

    /* renamed from: g  reason: collision with root package name */
    private final int f36157g;

    /* renamed from: h  reason: collision with root package name */
    private long f36158h;

    /* renamed from: i  reason: collision with root package name */
    private int f36159i;

    /* renamed from: j  reason: collision with root package name */
    private int f36160j;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f36161k;

    /* renamed from: l  reason: collision with root package name */
    private final Drawable f36162l;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"LG5/b$a;", "", "<init>", "()V", "", "STATE_START", "I", "STATE_RUNNING", "STATE_DONE", "DEFAULT_DURATION", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(Drawable drawable, Drawable drawable2, h hVar, int i10, boolean z10, boolean z11) {
        this.f36151a = hVar;
        this.f36152b = i10;
        this.f36153c = z10;
        this.f36154d = z11;
        Drawable drawable3 = null;
        this.f36156f = a(drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicWidth()) : null);
        this.f36157g = a(drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicHeight()) : null);
        this.f36159i = 255;
        this.f36161k = drawable != null ? drawable.mutate() : null;
        drawable3 = drawable2 != null ? drawable2.mutate() : drawable3;
        this.f36162l = drawable3;
        if (i10 > 0) {
            Drawable drawable4 = this.f36161k;
            if (drawable4 != null) {
                drawable4.setCallback(this);
            }
            if (drawable3 != null) {
                drawable3.setCallback(this);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("durationMillis must be > 0.");
    }

    private final int a(Integer num, Integer num2) {
        int i10 = -1;
        if (!this.f36154d && ((num != null && num.intValue() == -1) || (num2 != null && num2.intValue() == -1))) {
            return -1;
        }
        int intValue = num != null ? num.intValue() : -1;
        if (num2 != null) {
            i10 = num2.intValue();
        }
        return Math.max(intValue, i10);
    }

    private final void b() {
        this.f36160j = 2;
        this.f36161k = null;
        List<androidx.vectordrawable.graphics.drawable.b> list = this.f36155e;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).b(this);
        }
    }

    public final void c(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int width = rect.width();
        int height = rect.height();
        double c10 = g.c(intrinsicWidth, intrinsicHeight, width, height, this.f36151a);
        double d10 = (double) 2;
        int d11 = C17752b.d((((double) width) - (((double) intrinsicWidth) * c10)) / d10);
        int d12 = C17752b.d((((double) height) - (c10 * ((double) intrinsicHeight))) / d10);
        drawable.setBounds(rect.left + d11, rect.top + d12, rect.right - d11, rect.bottom - d12);
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        int i10 = this.f36160j;
        if (i10 == 0) {
            Drawable drawable2 = this.f36161k;
            if (drawable2 != null) {
                drawable2.setAlpha(this.f36159i);
                int save = canvas.save();
                try {
                    drawable2.draw(canvas);
                } finally {
                    canvas.restoreToCount(save);
                }
            }
        } else if (i10 == 2) {
            Drawable drawable3 = this.f36162l;
            if (drawable3 != null) {
                drawable3.setAlpha(this.f36159i);
                int save2 = canvas.save();
                try {
                    drawable3.draw(canvas);
                } finally {
                    canvas.restoreToCount(save2);
                }
            }
        } else {
            double uptimeMillis = ((double) (SystemClock.uptimeMillis() - this.f36158h)) / ((double) this.f36152b);
            double k10 = C17978n.k(uptimeMillis, 0.0d, 1.0d);
            int i11 = this.f36159i;
            int i12 = (int) (k10 * ((double) i11));
            if (this.f36153c) {
                i11 -= i12;
            }
            boolean z10 = uptimeMillis >= 1.0d;
            if (!z10 && (drawable = this.f36161k) != null) {
                drawable.setAlpha(i11);
                int save3 = canvas.save();
                try {
                    drawable.draw(canvas);
                } finally {
                    canvas.restoreToCount(save3);
                }
            }
            Drawable drawable4 = this.f36162l;
            if (drawable4 != null) {
                drawable4.setAlpha(i12);
                int save4 = canvas.save();
                try {
                    drawable4.draw(canvas);
                } finally {
                    canvas.restoreToCount(save4);
                }
            }
            if (z10) {
                b();
            } else {
                invalidateSelf();
            }
        }
    }

    public int getAlpha() {
        return this.f36159i;
    }

    public ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        Drawable drawable;
        int i10 = this.f36160j;
        if (i10 == 0) {
            Drawable drawable2 = this.f36161k;
            if (drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        } else if (i10 == 1) {
            Drawable drawable3 = this.f36162l;
            if (drawable3 != null && (colorFilter = drawable3.getColorFilter()) != null) {
                return colorFilter;
            }
            Drawable drawable4 = this.f36161k;
            if (drawable4 != null) {
                return drawable4.getColorFilter();
            }
            return null;
        } else if (i10 == 2 && (drawable = this.f36162l) != null) {
            return drawable.getColorFilter();
        } else {
            return null;
        }
    }

    public int getIntrinsicHeight() {
        return this.f36157g;
    }

    public int getIntrinsicWidth() {
        return this.f36156f;
    }

    @C16814e
    public int getOpacity() {
        Drawable drawable = this.f36161k;
        Drawable drawable2 = this.f36162l;
        int i10 = this.f36160j;
        if (i10 == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        } else if (i10 == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        } else if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        } else {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isRunning() {
        return this.f36160j == 1;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f36161k;
        if (drawable != null) {
            c(drawable, rect);
        }
        Drawable drawable2 = this.f36162l;
        if (drawable2 != null) {
            c(drawable2, rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f36161k;
        boolean level = drawable != null ? drawable.setLevel(i10) : false;
        Drawable drawable2 = this.f36162l;
        return level || (drawable2 != null ? drawable2.setLevel(i10) : false);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f36161k;
        boolean state = drawable != null ? drawable.setState(iArr) : false;
        Drawable drawable2 = this.f36162l;
        return state || (drawable2 != null ? drawable2.setState(iArr) : false);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    public void setAlpha(int i10) {
        if (i10 < 0 || i10 >= 256) {
            throw new IllegalArgumentException(("Invalid alpha: " + i10).toString());
        }
        this.f36159i = i10;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f36161k;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f36162l;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    public void setTint(int i10) {
        Drawable drawable = this.f36161k;
        if (drawable != null) {
            drawable.setTint(i10);
        }
        Drawable drawable2 = this.f36162l;
        if (drawable2 != null) {
            drawable2.setTint(i10);
        }
    }

    public void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.f36161k;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.f36162l;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f36161k;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.f36162l;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f36161k;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.f36162l;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void start() {
        /*
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.f36161k
            boolean r1 = r0 instanceof android.graphics.drawable.Animatable
            r2 = 0
            if (r1 == 0) goto L_0x000a
            android.graphics.drawable.Animatable r0 = (android.graphics.drawable.Animatable) r0
            goto L_0x000b
        L_0x000a:
            r0 = r2
        L_0x000b:
            if (r0 == 0) goto L_0x0010
            r0.start()
        L_0x0010:
            android.graphics.drawable.Drawable r0 = r4.f36162l
            boolean r1 = r0 instanceof android.graphics.drawable.Animatable
            if (r1 == 0) goto L_0x0019
            r2 = r0
            android.graphics.drawable.Animatable r2 = (android.graphics.drawable.Animatable) r2
        L_0x0019:
            if (r2 == 0) goto L_0x001e
            r2.start()
        L_0x001e:
            int r0 = r4.f36160j
            if (r0 == 0) goto L_0x0023
            return
        L_0x0023:
            r0 = 1
            r4.f36160j = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            r4.f36158h = r0
            java.util.List<androidx.vectordrawable.graphics.drawable.b> r0 = r4.f36155e
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r2 = 0
        L_0x0036:
            if (r2 >= r1) goto L_0x0044
            java.lang.Object r3 = r0.get(r2)
            androidx.vectordrawable.graphics.drawable.b r3 = (androidx.vectordrawable.graphics.drawable.b) r3
            r3.c(r4)
            int r2 = r2 + 1
            goto L_0x0036
        L_0x0044:
            r4.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.b.start():void");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void stop() {
        /*
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.f36161k
            boolean r1 = r0 instanceof android.graphics.drawable.Animatable
            r2 = 0
            if (r1 == 0) goto L_0x000a
            android.graphics.drawable.Animatable r0 = (android.graphics.drawable.Animatable) r0
            goto L_0x000b
        L_0x000a:
            r0 = r2
        L_0x000b:
            if (r0 == 0) goto L_0x0010
            r0.stop()
        L_0x0010:
            android.graphics.drawable.Drawable r0 = r3.f36162l
            boolean r1 = r0 instanceof android.graphics.drawable.Animatable
            if (r1 == 0) goto L_0x0019
            r2 = r0
            android.graphics.drawable.Animatable r2 = (android.graphics.drawable.Animatable) r2
        L_0x0019:
            if (r2 == 0) goto L_0x001e
            r2.stop()
        L_0x001e:
            int r0 = r3.f36160j
            r1 = 2
            if (r0 == r1) goto L_0x0026
            r3.b()
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.b.stop():void");
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
