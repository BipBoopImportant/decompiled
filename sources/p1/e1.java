package p1;

import android.graphics.Shader;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o1.C5673m;
import p1.C5747v0;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0013\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Lp1/e1;", "Lp1/l0;", "<init>", "()V", "Lo1/m;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "b", "(J)Landroid/graphics/Shader;", "Lp1/S0;", "p", "", "alpha", "LXH/N;", "a", "(JLp1/S0;F)V", "c", "Landroid/graphics/Shader;", "internalShader", "d", "J", "createdSize", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class e1 extends C5728l0 {

    /* renamed from: c  reason: collision with root package name */
    private Shader f27308c;

    /* renamed from: d  reason: collision with root package name */
    private long f27309d = C5673m.f26722b.a();

    public e1() {
        super((DefaultConstructorMarker) null);
    }

    public final void a(long j10, S0 s02, float f10) {
        Shader shader = this.f27308c;
        if (shader == null || !C5673m.h(this.f27309d, j10)) {
            if (C5673m.n(j10)) {
                shader = null;
                this.f27308c = null;
                this.f27309d = C5673m.f26722b.a();
            } else {
                shader = b(j10);
                this.f27308c = shader;
                this.f27309d = j10;
            }
        }
        long b10 = s02.b();
        C5747v0.a aVar = C5747v0.f27350b;
        if (!C5747v0.q(b10, aVar.a())) {
            s02.j(aVar.a());
        }
        if (!C17542s.e(s02.r(), shader)) {
            s02.p(shader);
        }
        if (s02.a() != f10) {
            s02.d(f10);
        }
    }

    public abstract Shader b(long j10);
}
