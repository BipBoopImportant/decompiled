package E0;

import android.view.inputmethod.CursorAnchorInfo;
import kotlin.Metadata;
import o1.C5669i;
import p1.b1;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LE0/l;", "", "<init>", "()V", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "Lo1/i;", "decorationBoxBounds", "a", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Lo1/i;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: E0.l  reason: case insensitive filesystem */
public final class C4454l {

    /* renamed from: a  reason: collision with root package name */
    public static final C4454l f5708a = new C4454l();

    private C4454l() {
    }

    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, C5669i iVar) {
        return builder.setEditorBoundsInfo(C4449g.a().setEditorBounds(b1.c(iVar)).setHandwritingBounds(b1.c(iVar)).build());
    }
}
