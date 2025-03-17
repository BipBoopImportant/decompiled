package androidx.compose.ui.platform;

import N1.C4669d;
import N1.G;
import YH.C16870n;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005*\n\u0010\u0007\"\u00020\u00062\u00020\u0006¨\u0006\b"}, d2 = {"", "LN1/d;", "a", "(Ljava/lang/CharSequence;)LN1/d;", "b", "(LN1/d;)Ljava/lang/CharSequence;", "Landroid/content/ClipboardManager;", "NativeClipboard", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.k  reason: case insensitive filesystem */
public final class C5114k {
    public static final C4669d a(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new C4669d(charSequence.toString(), (List) null, (List) null, 6, (DefaultConstructorMarker) null);
        }
        Spanned spanned = (Spanned) charSequence;
        int i10 = 0;
        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, charSequence.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        int n02 = C16870n.n0(annotationArr);
        if (n02 >= 0) {
            while (true) {
                Annotation annotation = annotationArr[i10];
                if (C17542s.e(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    arrayList.add(new C4669d.c(new C5103g0(annotation.getValue()).k(), spanned.getSpanStart(annotation), spanned.getSpanEnd(annotation)));
                }
                if (i10 == n02) {
                    break;
                }
                i10++;
            }
        }
        return new C4669d(charSequence.toString(), arrayList, (List) null, 4, (DefaultConstructorMarker) null);
    }

    public static final CharSequence b(C4669d dVar) {
        if (dVar.g().isEmpty()) {
            return dVar.j();
        }
        SpannableString spannableString = new SpannableString(dVar.j());
        C5120m0 m0Var = new C5120m0();
        List<C4669d.c<G>> g10 = dVar.g();
        int size = g10.size();
        for (int i10 = 0; i10 < size; i10++) {
            C4669d.c cVar = g10.get(i10);
            int b10 = cVar.b();
            int c10 = cVar.c();
            m0Var.q();
            m0Var.d((G) cVar.a());
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", m0Var.p()), b10, c10, 33);
        }
        return spannableString;
    }
}
