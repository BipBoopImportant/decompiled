package EH;

import HJ.C15854t;
import YH.g0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\f\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u000b\u001a\u00020\n*\u00020\u00002\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\"\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"", "", "c", "(Ljava/lang/String;)Z", "b", "d", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "LXH/N;", "e", "(Ljava/lang/String;Ljava/lang/StringBuilder;)V", "", "", "a", "Ljava/util/Set;", "HeaderFieldValueSeparators", "ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: EH.k  reason: case insensitive filesystem */
public final class C15626k {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<Character> f134033a = g0.h('(', ')', '<', '>', '@', ',', ';', ':', '\\', '\"', '/', '[', ']', '?', '=', '{', '}', ' ', 9, 10, 13);

    private static final boolean b(String str) {
        if (str.length() < 2 || C15854t.G1(str) != '\"' || C15854t.H1(str) != '\"') {
            return false;
        }
        int i10 = 1;
        do {
            int r02 = C15854t.r0(str, '\"', i10, false, 4, (Object) null);
            if (r02 == C15854t.m0(str)) {
                break;
            }
            int i11 = 0;
            for (int i12 = r02 - 1; str.charAt(i12) == '\\'; i12--) {
                i11++;
            }
            if (i11 % 2 == 0) {
                return false;
            }
            i10 = r02 + 1;
        } while (i10 < str.length());
        return true;
    }

    /* access modifiers changed from: private */
    public static final boolean c(String str) {
        if (str.length() == 0) {
            return true;
        }
        if (b(str)) {
            return false;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (f134033a.contains(Character.valueOf(str.charAt(i10)))) {
                return true;
            }
        }
        return false;
    }

    public static final String d(String str) {
        C17542s.j(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        e(str, sb2);
        String sb3 = sb2.toString();
        C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    private static final void e(String str, StringBuilder sb2) {
        sb2.append("\"");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt == '\\') {
                sb2.append("\\\\");
            } else if (charAt == 10) {
                sb2.append("\\n");
            } else if (charAt == 13) {
                sb2.append("\\r");
            } else if (charAt == 9) {
                sb2.append("\\t");
            } else if (charAt == '\"') {
                sb2.append("\\\"");
            } else {
                sb2.append(charAt);
            }
        }
        sb2.append("\"");
    }
}
