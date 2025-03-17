package HJ;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"T", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "element", "Lkotlin/Function1;", "", "transform", "LXH/N;", "a", "(Ljava/lang/Appendable;Ljava/lang/Object;LnI/l;)V", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* renamed from: HJ.u  reason: case insensitive filesystem */
class C15855u {
    public static <T> void a(Appendable appendable, T t10, C17642l<? super T, ? extends CharSequence> lVar) {
        C17542s.j(appendable, "<this>");
        if (lVar != null) {
            appendable.append((CharSequence) lVar.invoke(t10));
            return;
        }
        if (t10 == null ? true : t10 instanceof CharSequence) {
            appendable.append((CharSequence) t10);
        } else if (t10 instanceof Character) {
            appendable.append(((Character) t10).charValue());
        } else {
            appendable.append(t10.toString());
        }
    }
}
