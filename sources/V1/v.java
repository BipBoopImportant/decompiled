package V1;

import N1.C4669d;
import N1.C4677l;
import N1.b0;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import java.util.WeakHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R&\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R&\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\u0004\u0012\u00020\u00170\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0019"}, d2 = {"LV1/v;", "", "<init>", "()V", "LN1/b0;", "urlAnnotation", "Landroid/text/style/URLSpan;", "c", "(LN1/b0;)Landroid/text/style/URLSpan;", "LN1/d$c;", "LN1/l$b;", "urlRange", "b", "(LN1/d$c;)Landroid/text/style/URLSpan;", "LN1/l;", "linkRange", "Landroid/text/style/ClickableSpan;", "a", "(LN1/d$c;)Landroid/text/style/ClickableSpan;", "Ljava/util/WeakHashMap;", "Ljava/util/WeakHashMap;", "spansByAnnotation", "urlSpansByAnnotation", "LV1/l;", "linkSpansWithListenerByAnnotation", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class v {

    /* renamed from: a  reason: collision with root package name */
    private final WeakHashMap<b0, URLSpan> f14595a = new WeakHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final WeakHashMap<C4669d.c<C4677l.b>, URLSpan> f14596b = new WeakHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final WeakHashMap<C4669d.c<C4677l>, l> f14597c = new WeakHashMap<>();

    public final ClickableSpan a(C4669d.c<C4677l> cVar) {
        WeakHashMap<C4669d.c<C4677l>, l> weakHashMap = this.f14597c;
        l lVar = weakHashMap.get(cVar);
        if (lVar == null) {
            lVar = new l(cVar.g());
            weakHashMap.put(cVar, lVar);
        }
        return lVar;
    }

    public final URLSpan b(C4669d.c<C4677l.b> cVar) {
        WeakHashMap<C4669d.c<C4677l.b>, URLSpan> weakHashMap = this.f14596b;
        URLSpan uRLSpan = weakHashMap.get(cVar);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(cVar.g().c());
            weakHashMap.put(cVar, uRLSpan);
        }
        return uRLSpan;
    }

    public final URLSpan c(b0 b0Var) {
        WeakHashMap<b0, URLSpan> weakHashMap = this.f14595a;
        URLSpan uRLSpan = weakHashMap.get(b0Var);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(b0Var.a());
            weakHashMap.put(b0Var, uRLSpan);
        }
        return uRLSpan;
    }
}
