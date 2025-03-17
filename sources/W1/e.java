package W1;

import N1.a0;
import N1.c0;
import XH.t;
import android.text.style.TtsSpan;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LN1/a0;", "Landroid/text/style/TtsSpan;", "a", "(LN1/a0;)Landroid/text/style/TtsSpan;", "LN1/c0;", "b", "(LN1/c0;)Landroid/text/style/TtsSpan;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {
    public static final TtsSpan a(a0 a0Var) {
        if (a0Var instanceof c0) {
            return b((c0) a0Var);
        }
        throw new t();
    }

    public static final TtsSpan b(c0 c0Var) {
        return new TtsSpan.VerbatimBuilder(c0Var.a()).build();
    }
}
