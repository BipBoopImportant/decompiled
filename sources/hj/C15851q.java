package HJ;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.Metadata;
import tI.C17974j;
import tI.C17978n;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\b\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000f\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ljava/util/regex/Matcher;", "", "from", "", "input", "LHJ/l;", "e", "(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)LHJ/l;", "f", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)LHJ/l;", "Ljava/util/regex/MatchResult;", "LtI/j;", "g", "(Ljava/util/regex/MatchResult;)LtI/j;", "groupIndex", "h", "(Ljava/util/regex/MatchResult;I)LtI/j;", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: HJ.q  reason: case insensitive filesystem */
public final class C15851q {
    /* access modifiers changed from: private */
    public static final C15846l e(Matcher matcher, int i10, CharSequence charSequence) {
        if (!matcher.find(i10)) {
            return null;
        }
        return new C15847m(matcher, charSequence);
    }

    /* access modifiers changed from: private */
    public static final C15846l f(Matcher matcher, CharSequence charSequence) {
        if (!matcher.matches()) {
            return null;
        }
        return new C15847m(matcher, charSequence);
    }

    /* access modifiers changed from: private */
    public static final C17974j g(MatchResult matchResult) {
        return C17978n.w(matchResult.start(), matchResult.end());
    }

    /* access modifiers changed from: private */
    public static final C17974j h(MatchResult matchResult, int i10) {
        return C17978n.w(matchResult.start(i10), matchResult.end(i10));
    }
}
