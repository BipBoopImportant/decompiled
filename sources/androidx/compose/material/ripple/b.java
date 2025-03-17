package androidx.compose.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C5747v0;
import p1.C5751x0;
import tI.C17978n;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0002\n\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ \u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/material/ripple/b;", "Landroid/graphics/drawable/RippleDrawable;", "", "bounded", "<init>", "(Z)V", "Lp1/v0;", "color", "", "alpha", "a", "(JF)J", "LXH/N;", "b", "(JF)V", "isProjected", "()Z", "Landroid/graphics/Rect;", "getDirtyBounds", "()Landroid/graphics/Rect;", "", "radius", "c", "(I)V", "Z", "Lp1/v0;", "rippleColor", "Ljava/lang/Integer;", "rippleRadius", "d", "projected", "e", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class b extends RippleDrawable {

    /* renamed from: e  reason: collision with root package name */
    public static final a f18636e = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f18637a;

    /* renamed from: b  reason: collision with root package name */
    private C5747v0 f18638b;

    /* renamed from: c  reason: collision with root package name */
    private Integer f18639c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f18640d;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/material/ripple/b$a;", "", "<init>", "()V", "", "setMaxRadiusFetched", "Z", "Ljava/lang/reflect/Method;", "setMaxRadiusMethod", "Ljava/lang/reflect/Method;", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/material/ripple/b$b;", "", "<init>", "()V", "Landroid/graphics/drawable/RippleDrawable;", "ripple", "", "radius", "LXH/N;", "a", "(Landroid/graphics/drawable/RippleDrawable;I)V", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.ripple.b$b  reason: collision with other inner class name */
    private static final class C0279b {

        /* renamed from: a  reason: collision with root package name */
        public static final C0279b f18641a = new C0279b();

        private C0279b() {
        }

        public final void a(RippleDrawable rippleDrawable, int i10) {
            rippleDrawable.setRadius(i10);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(boolean z10) {
        super(ColorStateList.valueOf(-16777216), (Drawable) null, z10 ? new ColorDrawable(-1) : null);
        this.f18637a = z10;
    }

    private final long a(long j10, float f10) {
        if (Build.VERSION.SDK_INT < 28) {
            f10 *= (float) 2;
        }
        return C5747v0.o(j10, C17978n.h(f10, 1.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null);
    }

    public final void b(long j10, float f10) {
        long a10 = a(j10, f10);
        C5747v0 v0Var = this.f18638b;
        if (!(v0Var == null ? false : C5747v0.q(v0Var.y(), a10))) {
            this.f18638b = C5747v0.k(a10);
            setColor(ColorStateList.valueOf(C5751x0.k(a10)));
        }
    }

    public final void c(int i10) {
        Integer num = this.f18639c;
        if (num == null || num.intValue() != i10) {
            this.f18639c = Integer.valueOf(i10);
            C0279b.f18641a.a(this, i10);
        }
    }

    public Rect getDirtyBounds() {
        if (!this.f18637a) {
            this.f18640d = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f18640d = false;
        return dirtyBounds;
    }

    public boolean isProjected() {
        return this.f18640d;
    }
}
