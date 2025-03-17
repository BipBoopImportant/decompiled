package O1;

import Q1.h;
import YH.C16870n;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000P\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000f\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a5\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00022\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r*\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001d\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010 \"\u0014\u0010$\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"", "textDirectionHeuristic", "Landroid/text/TextDirectionHeuristic;", "k", "(I)Landroid/text/TextDirectionHeuristic;", "topPadding", "bottomPadding", "LO1/i0;", "a", "(II)J", "LO1/f0;", "l", "(LO1/f0;)J", "", "LQ1/h;", "i", "([LQ1/h;)J", "Landroid/text/TextPaint;", "textPaint", "frameworkTextDir", "lineHeightSpans", "Landroid/graphics/Paint$FontMetricsInt;", "h", "(LO1/f0;Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;[LQ1/h;)Landroid/graphics/Paint$FontMetricsInt;", "j", "(LO1/f0;)[LQ1/h;", "Landroid/text/Layout;", "lineIndex", "", "m", "(Landroid/text/Layout;I)Z", "LO1/e0;", "LO1/e0;", "SharedTextAndroidCanvas", "b", "J", "ZeroVerticalPadding", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class h0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final e0 f11754a = new e0();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final long f11755b = a(0, 0);

    public static final long a(int i10, int i11) {
        return i0.a((((long) i11) & 4294967295L) | (((long) i10) << 32));
    }

    /* access modifiers changed from: private */
    public static final Paint.FontMetricsInt h(f0 f0Var, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, h[] hVarArr) {
        h[] hVarArr2 = hVarArr;
        int m10 = f0Var.m() - 1;
        if (f0Var.i().getLineStart(m10) != f0Var.i().getLineEnd(m10) || hVarArr2 == null || hVarArr2.length == 0) {
            return null;
        }
        SpannableString spannableString = new SpannableString("​");
        h hVar = (h) C16870n.f0(hVarArr);
        spannableString.setSpan(hVar.b(0, spannableString.length(), (m10 == 0 || !hVar.e()) ? hVar.e() : false), 0, spannableString.length(), 33);
        StaticLayout b10 = a0.b(a0.f11706a, spannableString, textPaint, Integer.MAX_VALUE, 0, spannableString.length(), textDirectionHeuristic, (Layout.Alignment) null, 0, (TextUtils.TruncateAt) null, 0, 0.0f, 0.0f, 0, f0Var.h(), f0Var.e(), 0, 0, 0, 0, (int[]) null, (int[]) null, 2072512, (Object) null);
        Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
        fontMetricsInt.ascent = b10.getLineAscent(0);
        fontMetricsInt.descent = b10.getLineDescent(0);
        fontMetricsInt.top = b10.getLineTop(0);
        fontMetricsInt.bottom = b10.getLineBottom(0);
        return fontMetricsInt;
    }

    /* access modifiers changed from: private */
    public static final long i(h[] hVarArr) {
        int i10 = 0;
        int i11 = 0;
        for (h hVar : hVarArr) {
            if (hVar.c() < 0) {
                i10 = Math.max(i10, Math.abs(hVar.c()));
            }
            if (hVar.d() < 0) {
                i11 = Math.max(i10, Math.abs(hVar.d()));
            }
        }
        return (i10 == 0 && i11 == 0) ? f11755b : a(i10, i11);
    }

    /* access modifiers changed from: private */
    public static final h[] j(f0 f0Var) {
        if (!(f0Var.G() instanceof Spanned)) {
            return null;
        }
        CharSequence G10 = f0Var.G();
        C17542s.h(G10, "null cannot be cast to non-null type android.text.Spanned");
        Class<h> cls = h.class;
        if (!N.a((Spanned) G10, cls) && f0Var.G().length() > 0) {
            return null;
        }
        CharSequence G11 = f0Var.G();
        C17542s.h(G11, "null cannot be cast to non-null type android.text.Spanned");
        return (h[]) ((Spanned) G11).getSpans(0, f0Var.G().length(), cls);
    }

    public static final TextDirectionHeuristic k(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.ANYRTL_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }

    /* access modifiers changed from: private */
    public static final long l(f0 f0Var) {
        if (f0Var.h() || f0Var.J()) {
            return f11755b;
        }
        TextPaint paint = f0Var.i().getPaint();
        CharSequence text = f0Var.i().getText();
        Rect c10 = M.c(paint, text, f0Var.i().getLineStart(0), f0Var.i().getLineEnd(0));
        int lineAscent = f0Var.i().getLineAscent(0);
        int i10 = c10.top;
        int topPadding = i10 < lineAscent ? lineAscent - i10 : f0Var.i().getTopPadding();
        if (f0Var.m() != 1) {
            int m10 = f0Var.m() - 1;
            c10 = M.c(paint, text, f0Var.i().getLineStart(m10), f0Var.i().getLineEnd(m10));
        }
        int lineDescent = f0Var.i().getLineDescent(f0Var.m() - 1);
        int i11 = c10.bottom;
        int bottomPadding = i11 > lineDescent ? i11 - lineDescent : f0Var.i().getBottomPadding();
        return (topPadding == 0 && bottomPadding == 0) ? f11755b : a(topPadding, bottomPadding);
    }

    public static final boolean m(Layout layout, int i10) {
        return layout.getEllipsisCount(i10) > 0;
    }
}
