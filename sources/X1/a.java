package X1;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import p1.V;
import p1.V0;
import p1.k1;
import p1.l1;
import r1.g;
import r1.j;
import r1.k;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"LX1/a;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Lr1/g;", "drawStyle", "<init>", "(Lr1/g;)V", "Lp1/l1;", "Landroid/graphics/Paint$Join;", "b", "(I)Landroid/graphics/Paint$Join;", "Lp1/k1;", "Landroid/graphics/Paint$Cap;", "a", "(I)Landroid/graphics/Paint$Cap;", "Landroid/text/TextPaint;", "textPaint", "LXH/N;", "updateDrawState", "(Landroid/text/TextPaint;)V", "Lr1/g;", "getDrawStyle", "()Lr1/g;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a  reason: collision with root package name */
    private final g f14688a;

    public a(g gVar) {
        this.f14688a = gVar;
    }

    private final Paint.Cap a(int i10) {
        k1.a aVar = k1.f27320b;
        return k1.g(i10, aVar.a()) ? Paint.Cap.BUTT : k1.g(i10, aVar.b()) ? Paint.Cap.ROUND : k1.g(i10, aVar.c()) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }

    private final Paint.Join b(int i10) {
        l1.a aVar = l1.f27327b;
        return l1.g(i10, aVar.b()) ? Paint.Join.MITER : l1.g(i10, aVar.c()) ? Paint.Join.ROUND : l1.g(i10, aVar.a()) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }

    public void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            g gVar = this.f14688a;
            if (C17542s.e(gVar, j.f28627a)) {
                textPaint.setStyle(Paint.Style.FILL);
            } else if (gVar instanceof k) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((k) this.f14688a).f());
                textPaint.setStrokeMiter(((k) this.f14688a).d());
                textPaint.setStrokeJoin(b(((k) this.f14688a).c()));
                textPaint.setStrokeCap(a(((k) this.f14688a).b()));
                V0 e10 = ((k) this.f14688a).e();
                textPaint.setPathEffect(e10 != null ? V.b(e10) : null);
            }
        }
    }
}
