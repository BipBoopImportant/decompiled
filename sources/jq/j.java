package jq;

import androidx.lifecycle.F;
import androidx.lifecycle.K;
import androidx.lifecycle.L;
import androidx.lifecycle.f0;
import com.ingka.ikea.core.model.product.MoreInfo;
import com.ingka.ikea.core.model.product.ProductLarge;
import com.ingka.ikea.core.model.product.TechnicalCompliance;
import ip.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import op.C11700k;
import pq.C11770a;

@Metadata(d1 = {"\u0000I\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001\u001d\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR&\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R,\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\u00148\u0000X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R*\u0010\u001c\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00060\u000e\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Ljq/j;", "Landroidx/lifecycle/f0;", "Lpq/a;", "pipRepository", "<init>", "(Lpq/a;)V", "", "productNo", "LXH/N;", "D", "(Ljava/lang/String;)V", "m", "Lpq/a;", "Landroidx/lifecycle/K;", "Lip/k;", "Lcom/ingka/ikea/core/model/product/TechnicalCompliance;", "", "n", "Landroidx/lifecycle/K;", "_technicalInformation", "Landroidx/lifecycle/F;", "o", "Landroidx/lifecycle/F;", "C", "()Landroidx/lifecycle/F;", "technicalInformation", "Lop/k;", "p", "loadingProductResource", "jq/j$a", "q", "Ljq/j$a;", "productResourceObserver", "energylabel-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final C11770a f98647m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final K<k<TechnicalCompliance, Object>> f98648n;

    /* renamed from: o  reason: collision with root package name */
    private final F<k<TechnicalCompliance, Object>> f98649o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public F<k<C11700k, String>> f98650p;

    /* renamed from: q  reason: collision with root package name */
    private final a f98651q = new a(this);

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"jq/j$a", "Landroidx/lifecycle/L;", "Lip/k;", "Lop/k;", "", "LXH/N;", "b", "()V", "resource", "a", "(Lip/k;)V", "energylabel-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements L<k<C11700k, String>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f98652a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: jq.j$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C2230a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f98653a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    ip.k$e[] r0 = ip.k.e.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    ip.k$e r1 = ip.k.e.LOADING     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    ip.k$e r1 = ip.k.e.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f98653a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: jq.j.a.C2230a.<clinit>():void");
            }
        }

        a(j jVar) {
            this.f98652a = jVar;
        }

        private final void b() {
            F h10 = this.f98652a.f98650p;
            if (h10 != null) {
                h10.removeObserver(this);
            }
            this.f98652a.f98650p = null;
        }

        /* renamed from: a */
        public void onChanged(k<C11700k, String> kVar) {
            k kVar2;
            ProductLarge c10;
            MoreInfo m10;
            TechnicalCompliance k10;
            C17542s.j(kVar, "resource");
            K i10 = this.f98652a.f98648n;
            int i11 = C2230a.f98653a[kVar.c().ordinal()];
            if (i11 == 1) {
                kVar2 = k.a.d(k.f98528e, (Object) null, 1, (Object) null);
            } else if (i11 != 2) {
                b();
                kVar2 = k.a.b(k.f98528e, (String) null, (Object) null, (Object) null, 7, (Object) null);
            } else {
                C11700k a10 = kVar.a();
                if (a10 == null || (c10 = a10.c()) == null || (m10 = c10.m()) == null || (k10 = m10.k()) == null || (kVar2 = k.f98528e.g(k10)) == null) {
                    kVar2 = k.a.b(k.f98528e, (String) null, (Object) null, (Object) null, 7, (Object) null);
                }
            }
            i10.postValue(kVar2);
        }
    }

    public j(C11770a aVar) {
        C17542s.j(aVar, "pipRepository");
        this.f98647m = aVar;
        K<k<TechnicalCompliance, Object>> k10 = new K<>();
        this.f98648n = k10;
        this.f98649o = k10;
    }

    public final F<k<TechnicalCompliance, Object>> C() {
        return this.f98649o;
    }

    public final void D(String str) {
        C17542s.j(str, "productNo");
        F<k<C11700k, String>> a10 = this.f98647m.a(str);
        this.f98650p = a10;
        if (a10 != null) {
            a10.observeForever(this.f98651q);
        }
    }
}
