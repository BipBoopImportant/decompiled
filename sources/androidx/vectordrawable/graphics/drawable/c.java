package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import j0.C5445a;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import w2.C6214h;
import w2.l;
import y2.C6260a;

public class c extends e implements Animatable {

    /* renamed from: b  reason: collision with root package name */
    private final C0771c f44795b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f44796c;

    /* renamed from: d  reason: collision with root package name */
    private ArgbEvaluator f44797d;

    /* renamed from: e  reason: collision with root package name */
    d f44798e;

    /* renamed from: f  reason: collision with root package name */
    private Animator.AnimatorListener f44799f;

    /* renamed from: g  reason: collision with root package name */
    ArrayList<b> f44800g;

    /* renamed from: h  reason: collision with root package name */
    final Drawable.Callback f44801h;

    class a implements Drawable.Callback {
        a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            c.this.scheduleSelf(runnable, j10);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f44800g);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((b) arrayList.get(i10)).b(c.this);
            }
        }

        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f44800g);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((b) arrayList.get(i10)).c(c.this);
            }
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.c$c  reason: collision with other inner class name */
    private static class C0771c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f44804a;

        /* renamed from: b  reason: collision with root package name */
        f f44805b;

        /* renamed from: c  reason: collision with root package name */
        AnimatorSet f44806c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<Animator> f44807d;

        /* renamed from: e  reason: collision with root package name */
        C5445a<Animator, String> f44808e;

        C0771c(Context context, C0771c cVar, Drawable.Callback callback, Resources resources) {
            if (cVar != null) {
                this.f44804a = cVar.f44804a;
                f fVar = cVar.f44805b;
                if (fVar != null) {
                    Drawable.ConstantState constantState = fVar.getConstantState();
                    if (resources != null) {
                        this.f44805b = (f) constantState.newDrawable(resources);
                    } else {
                        this.f44805b = (f) constantState.newDrawable();
                    }
                    f fVar2 = (f) this.f44805b.mutate();
                    this.f44805b = fVar2;
                    fVar2.setCallback(callback);
                    this.f44805b.setBounds(cVar.f44805b.getBounds());
                    this.f44805b.g(false);
                }
                ArrayList<Animator> arrayList = cVar.f44807d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f44807d = new ArrayList<>(size);
                    this.f44808e = new C5445a<>(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        Animator animator = cVar.f44807d.get(i10);
                        Animator clone = animator.clone();
                        String str = cVar.f44808e.get(animator);
                        clone.setTarget(this.f44805b.c(str));
                        this.f44807d.add(clone);
                        this.f44808e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f44806c == null) {
                this.f44806c = new AnimatorSet();
            }
            this.f44806c.playTogether(this.f44807d);
        }

        public int getChangingConfigurations() {
            return this.f44804a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    static class e {
        static void a(Object obj) {
            ((AnimatedVectorDrawable) obj).clearAnimationCallbacks();
        }

        static void b(Object obj, Object obj2) {
            ((AnimatedVectorDrawable) obj).registerAnimationCallback((Animatable2.AnimationCallback) obj2);
        }

        static boolean c(Object obj, Object obj2) {
            return ((AnimatedVectorDrawable) obj).unregisterAnimationCallback((Animatable2.AnimationCallback) obj2);
        }
    }

    c() {
        this((Context) null, (C0771c) null, (Resources) null);
    }

    public static c a(Context context, int i10) {
        c cVar = new c(context);
        Drawable e10 = C6214h.e(context.getResources(), i10, context.getTheme());
        H2.c.d(cVar, "Failed to load drawable");
        e10.setCallback(cVar.f44801h);
        cVar.f44798e = new d(e10.getConstantState());
        cVar.f44810a = e10;
        return cVar;
    }

    private static void c(AnimatedVectorDrawable animatedVectorDrawable, b bVar) {
        e.b(animatedVectorDrawable, bVar.a());
    }

    private void d() {
        Animator.AnimatorListener animatorListener = this.f44799f;
        if (animatorListener != null) {
            this.f44795b.f44806c.removeListener(animatorListener);
            this.f44799f = null;
        }
    }

    private void e(String str, Animator animator) {
        animator.setTarget(this.f44795b.f44805b.c(str));
        C0771c cVar = this.f44795b;
        if (cVar.f44807d == null) {
            cVar.f44807d = new ArrayList<>();
            this.f44795b.f44808e = new C5445a<>();
        }
        this.f44795b.f44807d.add(animator);
        this.f44795b.f44808e.put(animator, str);
    }

    private static boolean g(AnimatedVectorDrawable animatedVectorDrawable, b bVar) {
        return e.c(animatedVectorDrawable, bVar.a());
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f44810a;
        if (drawable != null) {
            C6260a.a(drawable, theme);
        }
    }

    public void b(b bVar) {
        if (bVar != null) {
            Drawable drawable = this.f44810a;
            if (drawable != null) {
                c((AnimatedVectorDrawable) drawable, bVar);
                return;
            }
            if (this.f44800g == null) {
                this.f44800g = new ArrayList<>();
            }
            if (!this.f44800g.contains(bVar)) {
                this.f44800g.add(bVar);
                if (this.f44799f == null) {
                    this.f44799f = new b();
                }
                this.f44795b.f44806c.addListener(this.f44799f);
            }
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f44810a;
        if (drawable != null) {
            return C6260a.b(drawable);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f44810a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f44795b.f44805b.draw(canvas);
        if (this.f44795b.f44806c.isStarted()) {
            invalidateSelf();
        }
    }

    public boolean f(b bVar) {
        if (bVar == null) {
            return false;
        }
        Drawable drawable = this.f44810a;
        if (drawable != null) {
            g((AnimatedVectorDrawable) drawable, bVar);
        }
        ArrayList<b> arrayList = this.f44800g;
        if (arrayList == null) {
            return false;
        }
        boolean remove = arrayList.remove(bVar);
        if (this.f44800g.size() == 0) {
            d();
        }
        return remove;
    }

    public int getAlpha() {
        Drawable drawable = this.f44810a;
        return drawable != null ? C6260a.d(drawable) : this.f44795b.f44805b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f44810a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f44795b.f44804a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f44810a;
        return drawable != null ? C6260a.e(drawable) : this.f44795b.f44805b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f44810a != null) {
            return new d(this.f44810a.getConstantState());
        }
        return null;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f44810a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f44795b.f44805b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f44810a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f44795b.f44805b.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f44810a;
        return drawable != null ? drawable.getOpacity() : this.f44795b.f44805b.getOpacity();
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f44810a;
        if (drawable != null) {
            C6260a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray q10 = l.q(resources, theme, attributeSet, a.f44785e);
                    int resourceId = q10.getResourceId(0, 0);
                    if (resourceId != 0) {
                        f b10 = f.b(resources, resourceId, theme);
                        H2.c.d(b10, "Failed to load drawable");
                        b10.g(false);
                        b10.setCallback(this.f44801h);
                        f fVar = this.f44795b.f44805b;
                        if (fVar != null) {
                            fVar.setCallback((Drawable.Callback) null);
                        }
                        this.f44795b.f44805b = b10;
                    }
                    q10.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.f44786f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f44796c;
                        if (context != null) {
                            e(string, d.a(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f44795b.a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f44810a;
        return drawable != null ? C6260a.h(drawable) : this.f44795b.f44805b.isAutoMirrored();
    }

    @SuppressLint({"NewApi"})
    public boolean isRunning() {
        Drawable drawable = this.f44810a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f44795b.f44806c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f44810a;
        return drawable != null ? drawable.isStateful() : this.f44795b.f44805b.isStateful();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f44810a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f44810a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f44795b.f44805b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f44810a;
        return drawable != null ? drawable.setLevel(i10) : this.f44795b.f44805b.setLevel(i10);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f44810a;
        return drawable != null ? drawable.setState(iArr) : this.f44795b.f44805b.setState(iArr);
    }

    public void setAlpha(int i10) {
        Drawable drawable = this.f44810a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f44795b.f44805b.setAlpha(i10);
        }
    }

    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f44810a;
        if (drawable != null) {
            C6260a.j(drawable, z10);
        } else {
            this.f44795b.f44805b.setAutoMirrored(z10);
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i10) {
        Drawable drawable = this.f44810a;
        if (drawable != null) {
            C6260a.n(drawable, i10);
        } else {
            this.f44795b.f44805b.setTint(i10);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f44810a;
        if (drawable != null) {
            C6260a.o(drawable, colorStateList);
        } else {
            this.f44795b.f44805b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f44810a;
        if (drawable != null) {
            C6260a.p(drawable, mode);
        } else {
            this.f44795b.f44805b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f44810a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f44795b.f44805b.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @SuppressLint({"NewApi"})
    public void start() {
        Drawable drawable = this.f44810a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f44795b.f44806c.isStarted()) {
            this.f44795b.f44806c.start();
            invalidateSelf();
        }
    }

    @SuppressLint({"NewApi"})
    public void stop() {
        Drawable drawable = this.f44810a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f44795b.f44806c.end();
        }
    }

    private c(Context context) {
        this(context, (C0771c) null, (Resources) null);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f44810a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f44795b.f44805b.setColorFilter(colorFilter);
        }
    }

    private static class d extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f44809a;

        d(Drawable.ConstantState constantState) {
            this.f44809a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f44809a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f44809a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            c cVar = new c();
            Drawable newDrawable = this.f44809a.newDrawable();
            cVar.f44810a = newDrawable;
            newDrawable.setCallback(cVar.f44801h);
            return cVar;
        }

        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable newDrawable = this.f44809a.newDrawable(resources);
            cVar.f44810a = newDrawable;
            newDrawable.setCallback(cVar.f44801h);
            return cVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable newDrawable = this.f44809a.newDrawable(resources, theme);
            cVar.f44810a = newDrawable;
            newDrawable.setCallback(cVar.f44801h);
            return cVar;
        }
    }

    private c(Context context, C0771c cVar, Resources resources) {
        this.f44797d = null;
        this.f44799f = null;
        this.f44800g = null;
        a aVar = new a();
        this.f44801h = aVar;
        this.f44796c = context;
        if (cVar != null) {
            this.f44795b = cVar;
        } else {
            this.f44795b = new C0771c(context, (C0771c) null, aVar, resources);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }
}
