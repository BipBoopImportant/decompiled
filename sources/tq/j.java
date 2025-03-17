package tq;

import KJ.C15985a;
import KJ.C15990f;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import com.ingka.ikea.core.model.Media;
import com.optimizely.ab.config.FeatureVariable;
import fK.z;
import java.util.List;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17546w;
import kotlin.jvm.internal.P;
import mK.C17611d;
import uI.C18068q;
import uI.C18070s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\nR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ltq/j;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "LkK/c;", "json", "<init>", "(Landroidx/lifecycle/U;LkK/c;)V", "", "m", "Ljava/lang/String;", "selectedIndex", "n", "images", "LKJ/f;", "Lcom/ingka/ikea/core/model/Media;", "o", "LKJ/f;", "imageList", "Ltq/i;", "p", "Ltq/i;", "C", "()Ltq/i;", "uiState", "enlargeimages-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final String f103329m;

    /* renamed from: n  reason: collision with root package name */
    private final String f103330n;

    /* renamed from: o  reason: collision with root package name */
    private final C15990f<Media> f103331o;

    /* renamed from: p  reason: collision with root package name */
    private final i f103332p;

    public j(U u10, C17514c cVar) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        Object f10 = u10.f("index");
        if (f10 != null) {
            String str = (String) f10;
            this.f103329m = str;
            Object f11 = u10.f("images");
            if (f11 != null) {
                String str2 = (String) f11;
                this.f103330n = str2;
                C17611d a10 = cVar.a();
                C18068q m10 = P.m(List.class, C18070s.f147781c.d(P.l(Media.class)));
                C17546w.a("kotlinx.serialization.serializer.withModule");
                C15990f<Media> l10 = C15985a.l((Iterable) cVar.c(z.d(a10, m10), str2));
                this.f103331o = l10;
                this.f103332p = new i(str, l10);
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final i C() {
        return this.f103332p;
    }
}
