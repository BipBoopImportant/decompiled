package HJ;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a1\u0010\u0005\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\u0002\"\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "", "value", "p", "(Ljava/lang/StringBuilder;[Ljava/lang/String;)Ljava/lang/StringBuilder;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* renamed from: HJ.C  reason: case insensitive filesystem */
class C15822C extends C15821B {
    public static StringBuilder p(StringBuilder sb2, String... strArr) {
        C17542s.j(sb2, "<this>");
        C17542s.j(strArr, "value");
        for (String append : strArr) {
            sb2.append(append);
        }
        return sb2;
    }
}
