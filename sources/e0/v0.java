package E0;

import HJ.C15854t;
import N1.W;
import T1.P;
import android.view.inputmethod.ExtractedText;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LT1/P;", "Landroid/view/inputmethod/ExtractedText;", "b", "(LT1/P;)Landroid/view/inputmethod/ExtractedText;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class v0 {
    /* access modifiers changed from: private */
    public static final ExtractedText b(P p10) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = p10.i();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = p10.i().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = W.l(p10.h());
        extractedText.selectionEnd = W.k(p10.h());
        extractedText.flags = C15854t.c0(p10.i(), 10, false, 2, (Object) null) ^ true ? 1 : 0;
        return extractedText;
    }
}
