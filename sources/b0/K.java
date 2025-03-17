package B0;

import J1.j;
import U0.C4889m;
import U0.C4895p;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"LB0/K;", "", "", "stringId", "<init>", "(Ljava/lang/String;II)V", "", "b", "(LU0/m;I)Ljava/lang/String;", "I", "Cut", "Copy", "Paste", "SelectAll", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum K {
    Cut(17039363),
    Copy(17039361),
    Paste(17039371),
    SelectAll(17039373);
    
    private final int stringId;

    private K(int i10) {
        this.stringId = i10;
    }

    public final String b(C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(-309609081, i10, -1, "androidx.compose.foundation.text.TextContextMenuItems.resolvedString (ContextMenu.android.kt:89)");
        }
        String b10 = j.b(this.stringId, mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        return b10;
    }
}
