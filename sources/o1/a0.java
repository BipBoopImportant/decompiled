package O1;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jß\u0001\u0010#\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0003\u0010\u0013\u001a\u00020\b2\b\b\u0003\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b#\u0010$J\u001d\u0010&\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"LO1/a0;", "", "<init>", "()V", "", "text", "Landroid/text/TextPaint;", "paint", "", "width", "start", "end", "Landroid/text/TextDirectionHeuristic;", "textDir", "Landroid/text/Layout$Alignment;", "alignment", "maxLines", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "ellipsizedWidth", "", "lineSpacingMultiplier", "lineSpacingExtra", "justificationMode", "", "includePadding", "useFallbackLineSpacing", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "", "leftIndents", "rightIndents", "Landroid/text/StaticLayout;", "a", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;IIILandroid/text/TextDirectionHeuristic;Landroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;IFFIZZIIII[I[I)Landroid/text/StaticLayout;", "layout", "c", "(Landroid/text/StaticLayout;Z)Z", "LO1/b0;", "b", "LO1/b0;", "delegate", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a0 f11706a = new a0();

    /* renamed from: b  reason: collision with root package name */
    private static final b0 f11707b = new O();

    /* renamed from: c  reason: collision with root package name */
    public static final int f11708c = 8;

    private a0() {
    }

    public static /* synthetic */ StaticLayout b(a0 a0Var, CharSequence charSequence, TextPaint textPaint, int i10, int i11, int i12, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, float f10, float f11, int i15, boolean z10, boolean z11, int i16, int i17, int i18, int i19, int[] iArr, int[] iArr2, int i20, Object obj) {
        int i21 = i20;
        return a0Var.a(charSequence, textPaint, i10, (i21 & 8) != 0 ? 0 : i11, (i21 & 16) != 0 ? charSequence.length() : i12, (i21 & 32) != 0 ? E.f11682a.b() : textDirectionHeuristic, (i21 & 64) != 0 ? E.f11682a.a() : alignment, (i21 & 128) != 0 ? Integer.MAX_VALUE : i13, (i21 & 256) != 0 ? null : truncateAt, (i21 & 512) != 0 ? i10 : i14, (i21 & 1024) != 0 ? 1.0f : f10, (i21 & RecyclerView.n.FLAG_MOVED) != 0 ? 0.0f : f11, (i21 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? 0 : i15, (i21 & 8192) != 0 ? false : z10, (i21 & 16384) != 0 ? true : z11, (32768 & i21) != 0 ? 0 : i16, (65536 & i21) != 0 ? 0 : i17, (131072 & i21) != 0 ? 0 : i18, (262144 & i21) != 0 ? 0 : i19, (524288 & i21) != 0 ? null : iArr, (i21 & ImageMetadata.SHADING_MODE) != 0 ? null : iArr2);
    }

    public final StaticLayout a(CharSequence charSequence, TextPaint textPaint, int i10, int i11, int i12, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, float f10, float f11, int i15, boolean z10, boolean z11, int i16, int i17, int i18, int i19, int[] iArr, int[] iArr2) {
        CharSequence charSequence2 = charSequence;
        b0 b0Var = f11707b;
        c0 c0Var = r0;
        CharSequence charSequence3 = charSequence;
        c0 c0Var2 = new c0(charSequence3, i11, i12, textPaint, i10, textDirectionHeuristic, alignment, i13, truncateAt, i14, f10, f11, i15, z10, z11, i16, i17, i18, i19, iArr, iArr2);
        return b0Var.a(c0Var);
    }

    public final boolean c(StaticLayout staticLayout, boolean z10) {
        return f11707b.b(staticLayout, z10);
    }
}
