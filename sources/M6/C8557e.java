package m6;

import T5.n;
import a8.f;
import a8.g;
import android.graphics.Canvas;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0014\u0010 \u001a\u00020\u001e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001fR\u0014\u0010#\u001a\u00020!8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\"¨\u0006$"}, d2 = {"Lm6/e;", "LT5/n;", "La8/g;", "svg", "La8/f;", "renderOptions", "", "width", "height", "<init>", "(La8/g;La8/f;II)V", "Landroid/graphics/Canvas;", "Lcoil3/Canvas;", "canvas", "LXH/N;", "c", "(Landroid/graphics/Canvas;)V", "a", "La8/g;", "getSvg", "()La8/g;", "b", "La8/f;", "getRenderOptions", "()La8/f;", "I", "getWidth", "()I", "d", "getHeight", "", "()J", "size", "", "()Z", "shareable", "coil-svg_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: m6.e  reason: case insensitive filesystem */
public final class C8557e implements n {

    /* renamed from: a  reason: collision with root package name */
    private final g f55015a;

    /* renamed from: b  reason: collision with root package name */
    private final f f55016b;

    /* renamed from: c  reason: collision with root package name */
    private final int f55017c;

    /* renamed from: d  reason: collision with root package name */
    private final int f55018d;

    public C8557e(g gVar, f fVar, int i10, int i11) {
        this.f55015a = gVar;
        this.f55016b = fVar;
        this.f55017c = i10;
        this.f55018d = i11;
    }

    public long a() {
        return 2048;
    }

    public boolean b() {
        return true;
    }

    public void c(Canvas canvas) {
        this.f55015a.q(canvas, this.f55016b);
    }

    public int getHeight() {
        return this.f55018d;
    }

    public int getWidth() {
        return this.f55017c;
    }
}
