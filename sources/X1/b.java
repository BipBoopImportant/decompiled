package X1;

import U0.A1;
import U0.C4899r0;
import U0.o1;
import U0.p1;
import V1.h;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import o1.C5673m;
import p1.e1;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R1\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158F@FX\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0011\u0010\u0019\"\u0004\b\u0017\u0010\u001aR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"LX1/b;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Lp1/e1;", "shaderBrush", "", "alpha", "<init>", "(Lp1/e1;F)V", "Landroid/text/TextPaint;", "textPaint", "LXH/N;", "updateDrawState", "(Landroid/text/TextPaint;)V", "a", "Lp1/e1;", "()Lp1/e1;", "b", "F", "getAlpha", "()F", "Lo1/m;", "<set-?>", "c", "LU0/r0;", "()J", "(J)V", "size", "LU0/A1;", "Landroid/graphics/Shader;", "d", "LU0/A1;", "shaderState", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a  reason: collision with root package name */
    private final e1 f14689a;

    /* renamed from: b  reason: collision with root package name */
    private final float f14690b;

    /* renamed from: c  reason: collision with root package name */
    private final C4899r0 f14691c = u1.e(C5673m.c(C5673m.f26722b.a()), (o1) null, 2, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    private final A1<Shader> f14692d = p1.e(new a(this));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "b", "()Landroid/graphics/Shader;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<Shader> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f14693c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.f14693c = bVar;
        }

        /* renamed from: b */
        public final Shader invoke() {
            if (this.f14693c.b() != 9205357640488583168L && !C5673m.n(this.f14693c.b())) {
                return this.f14693c.a().b(this.f14693c.b());
            }
            return null;
        }
    }

    public b(e1 e1Var, float f10) {
        this.f14689a = e1Var;
        this.f14690b = f10;
    }

    public final e1 a() {
        return this.f14689a;
    }

    public final long b() {
        return ((C5673m) this.f14691c.getValue()).q();
    }

    public final void c(long j10) {
        this.f14691c.setValue(C5673m.c(j10));
    }

    public void updateDrawState(TextPaint textPaint) {
        h.a(textPaint, this.f14690b);
        textPaint.setShader(this.f14692d.getValue());
    }
}
