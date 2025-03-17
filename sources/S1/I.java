package S1;

import S1.Y;
import V1.i;
import XH.C16807N;
import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011¨\u0006\u0013"}, d2 = {"LS1/I;", "", "<init>", "()V", "LS1/W;", "typefaceRequest", "LS1/J;", "platformFontLoader", "Lkotlin/Function1;", "LS1/Y$b;", "LXH/N;", "onAsyncCompletion", "createDefaultTypeface", "LS1/Y;", "a", "(LS1/W;LS1/J;LnI/l;LnI/l;)LS1/Y;", "LS1/L;", "LS1/L;", "platformTypefaceResolver", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class I {

    /* renamed from: a  reason: collision with root package name */
    private final L f13342a = P.a();

    public Y a(W w10, J j10, C17642l<? super Y.b, C16807N> lVar, C17642l<? super W, ? extends Object> lVar2) {
        Typeface typeface;
        C4820m c10 = w10.c();
        if (c10 == null ? true : c10 instanceof C4817j) {
            typeface = this.f13342a.a(w10.f(), w10.d());
        } else if (c10 instanceof G) {
            typeface = this.f13342a.b((G) w10.c(), w10.f(), w10.d());
        } else if (!(c10 instanceof H)) {
            return null;
        } else {
            T q10 = ((H) w10.c()).q();
            C17542s.h(q10, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
            typeface = ((i) q10).a(w10.f(), w10.d(), w10.e());
        }
        return new Y.b(typeface, false, 2, (DefaultConstructorMarker) null);
    }
}
