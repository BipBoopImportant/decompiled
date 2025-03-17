package b6;

import WK.C16772g;
import XH.C16807N;
import XH.t;
import a6.i;
import a6.o;
import android.graphics.Canvas;
import android.graphics.PostProcessor;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import nI.C17631a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a/\u0010\t\u001a\u00020\b2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\"\u0018\u0010\u0016\u001a\u00020\u0013*\u00020\u00128@X\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"La6/i;", "Landroid/graphics/PostProcessor;", "d", "(La6/i;)Landroid/graphics/PostProcessor;", "Lkotlin/Function0;", "LXH/N;", "onStart", "onEnd", "Landroid/graphics/drawable/Animatable2$AnimationCallback;", "b", "(LnI/a;LnI/a;)Landroid/graphics/drawable/Animatable2$AnimationCallback;", "Landroidx/vectordrawable/graphics/drawable/b;", "c", "(LnI/a;LnI/a;)Landroidx/vectordrawable/graphics/drawable/b;", "LWK/g;", "Ljava/nio/ByteBuffer;", "g", "(LWK/g;)Ljava/nio/ByteBuffer;", "La6/o;", "", "f", "(La6/o;)I", "flag", "coil-gif_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: b6.e  reason: case insensitive filesystem */
public final class C7074e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: b6.e$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f45494a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                a6.o[] r0 = a6.o.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a6.o r1 = a6.o.UNCHANGED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                a6.o r1 = a6.o.TRANSLUCENT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                a6.o r1 = a6.o.OPAQUE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f45494a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b6.C7074e.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"b6/e$b", "Landroid/graphics/drawable/Animatable2$AnimationCallback;", "Landroid/graphics/drawable/Drawable;", "drawable", "LXH/N;", "onAnimationStart", "(Landroid/graphics/drawable/Drawable;)V", "onAnimationEnd", "coil-gif_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: b6.e$b */
    public static final class b extends Animatable2.AnimationCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f45495a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f45496b;

        b(C17631a<C16807N> aVar, C17631a<C16807N> aVar2) {
            this.f45495a = aVar;
            this.f45496b = aVar2;
        }

        public void onAnimationEnd(Drawable drawable) {
            C17631a<C16807N> aVar = this.f45496b;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public void onAnimationStart(Drawable drawable) {
            C17631a<C16807N> aVar = this.f45495a;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"b6/e$c", "Landroidx/vectordrawable/graphics/drawable/b;", "Landroid/graphics/drawable/Drawable;", "drawable", "LXH/N;", "c", "(Landroid/graphics/drawable/Drawable;)V", "b", "coil-gif_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: b6.e$c */
    public static final class c extends androidx.vectordrawable.graphics.drawable.b {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f45497b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f45498c;

        c(C17631a<C16807N> aVar, C17631a<C16807N> aVar2) {
            this.f45497b = aVar;
            this.f45498c = aVar2;
        }

        public void b(Drawable drawable) {
            C17631a<C16807N> aVar = this.f45498c;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public void c(Drawable drawable) {
            C17631a<C16807N> aVar = this.f45497b;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public static final Animatable2.AnimationCallback b(C17631a<C16807N> aVar, C17631a<C16807N> aVar2) {
        return new b(aVar, aVar2);
    }

    public static final androidx.vectordrawable.graphics.drawable.b c(C17631a<C16807N> aVar, C17631a<C16807N> aVar2) {
        return new c(aVar, aVar2);
    }

    public static final PostProcessor d(i iVar) {
        return new C7073d(iVar);
    }

    /* access modifiers changed from: private */
    public static final int e(i iVar, Canvas canvas) {
        return f(iVar.a(canvas));
    }

    public static final int f(o oVar) {
        int i10 = a.f45494a[oVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return -3;
        }
        if (i10 == 3) {
            return -1;
        }
        throw new t();
    }

    public static final ByteBuffer g(C16772g gVar) {
        gVar.V0(Long.MAX_VALUE);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((int) gVar.p().size());
        while (!gVar.p().Y1()) {
            gVar.p().read(allocateDirect);
        }
        allocateDirect.flip();
        return allocateDirect;
    }
}
