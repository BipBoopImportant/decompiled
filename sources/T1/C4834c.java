package T1;

import N1.P;
import android.view.inputmethod.CursorAnchorInfo;
import kotlin.Metadata;
import o1.C5669i;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LT1/c;", "", "<init>", "()V", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "LN1/P;", "textLayoutResult", "Lo1/i;", "innerTextFieldBounds", "a", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;LN1/P;Lo1/i;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: T1.c  reason: case insensitive filesystem */
final class C4834c {

    /* renamed from: a  reason: collision with root package name */
    public static final C4834c f13580a = new C4834c();

    private C4834c() {
    }

    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, P p10, C5669i iVar) {
        int r10;
        int r11;
        if (!iVar.x() && (r10 = p10.r(iVar.r())) <= (r11 = p10.r(iVar.j()))) {
            while (true) {
                CursorAnchorInfo.Builder unused = builder.addVisibleLineBounds(p10.s(r10), p10.v(r10), p10.t(r10), p10.m(r10));
                if (r10 == r11) {
                    break;
                }
                r10++;
            }
        }
        return builder;
    }
}
