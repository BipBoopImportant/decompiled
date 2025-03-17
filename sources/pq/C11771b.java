package pq;

import HJ.C15854t;
import QJ.C16311i0;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.S;
import QJ.T;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import com.ingka.ikea.core.model.product.ProductItem;
import com.ingka.ikea.core.model.product.ProductLarge;
import com.ingka.ikea.core.remotemodel.product.ProductDetailsResponseRemote;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import ip.k;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import op.C11697h;
import op.C11700k;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lpq/b;", "Lpq/a;", "LAx/a;", "productDetailsRemoteDataSource", "<init>", "(LAx/a;)V", "", "productNo", "Landroidx/lifecycle/F;", "Lip/k;", "Lop/k;", "a", "(Ljava/lang/String;)Landroidx/lifecycle/F;", "LAx/a;", "LQJ/F0;", "b", "LQJ/F0;", "productDetailsLargeJob", "LQJ/Q;", "d", "()LQJ/Q;", "coroutineScope", "energylabel-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pq.b  reason: case insensitive filesystem */
public final class C11771b implements C11770a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Ax.a f101363a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public F0 f101364b;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"pq/b$a", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pq.b$a */
    public static final class a extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C11771b f101365a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ K f101366b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f101367c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(N.a aVar, C11771b bVar, K k10, String str) {
            super(aVar);
            this.f101365a = bVar;
            this.f101366b = k10;
            this.f101367c = str;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            boolean z10;
            String str;
            char c10;
            String str2;
            Throwable th3 = th2;
            boolean z11 = th3 instanceof UnknownHostException;
            String str3 = DslKt.INDICATOR_BACKGROUND;
            char c11 = '$';
            int i10 = 2;
            if (z11) {
                C11771b bVar = this.f101365a;
                e eVar = e.DEBUG;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str4 = null;
                String str5 = null;
                for (C11819b bVar2 : arrayList) {
                    if (str4 == null) {
                        String a10 = C11818a.a("Pip got UnknownHostException", th3);
                        if (a10 == null) {
                            break;
                        }
                        str4 = C11820c.a(a10);
                    }
                    String str6 = str4;
                    if (str5 == null) {
                        String name = bVar.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, c11, (String) null, i10, (Object) null), '.', (String) null, i10, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str3) + DslKt.INDICATOR_SEPARATOR + name;
                    } else {
                        str2 = str5;
                    }
                    bVar2.a(eVar, str2, false, th2, str6);
                    i10 = i10;
                    str5 = str2;
                    bVar = bVar;
                    str4 = str6;
                    eVar = eVar;
                    str3 = str3;
                    c11 = '$';
                }
                this.f101366b.postValue(k.a.f(k.f98528e, (String) null, this.f101367c, (Object) null, 5, (Object) null));
                return;
            }
            String str7 = str3;
            int i11 = 2;
            C11771b bVar3 = this.f101365a;
            e eVar2 = e.DEBUG;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            Iterator it = d.f102012a.a().iterator();
            while (true) {
                z10 = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next2 = it.next();
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str8 = null;
            String str9 = null;
            for (C11819b bVar4 : arrayList2) {
                if (str9 == null) {
                    String a11 = C11818a.a("Pip got service exception", th3);
                    if (a11 == null) {
                        break;
                    }
                    str = C11820c.a(a11);
                } else {
                    str = str9;
                }
                if (str8 == null) {
                    String name2 = bVar3.getClass().getName();
                    C17542s.g(name2);
                    c10 = '$';
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, i11, (Object) null), '.', (String) null, i11, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str7) + DslKt.INDICATOR_SEPARATOR + name2;
                } else {
                    c10 = '$';
                }
                String str10 = str8;
                char c12 = c10;
                bVar4.a(eVar2, str10, z10, th2, str);
                str9 = str;
                str8 = str10;
                z10 = z10;
                i11 = 2;
            }
            this.f101366b.postValue(k.a.b(k.f98528e, th2.getMessage(), (Object) null, (Object) null, 6, (Object) null));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.energylabel.impl.repo.ProductDetailsRepositoryImpl$getProductDetailsLarge$3", f = "ProductDetailsRepositoryImpl.kt", l = {58}, m = "invokeSuspend")
    /* renamed from: pq.b$b  reason: collision with other inner class name */
    static final class C2384b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101368c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C11771b f101369d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f101370e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ K<k<C11700k, String>> f101371f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2384b(C11771b bVar, String str, K<k<C11700k, String>> k10, C17164e<? super C2384b> eVar) {
            super(2, eVar);
            this.f101369d = bVar;
            this.f101370e = str;
            this.f101371f = k10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C2384b(this.f101369d, this.f101370e, this.f101371f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C2384b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f101368c;
            if (i10 == 0) {
                y.b(obj);
                Ax.a b10 = this.f101369d.f101363a;
                String str = this.f101370e;
                this.f101368c = 1;
                obj = b10.a(str, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C11771b bVar = this.f101369d;
            K<k<C11700k, String>> k10 = this.f101371f;
            ProductDetailsResponseRemote productDetailsResponseRemote = (ProductDetailsResponseRemote) obj;
            bVar.f101364b = null;
            ProductLarge d10 = productDetailsResponseRemote.d();
            List<C11697h> c10 = productDetailsResponseRemote.c();
            List<ProductItem> b11 = productDetailsResponseRemote.b();
            if (b11 == null) {
                b11 = C16877v.n();
            }
            k10.postValue(k.f98528e.g(new C11700k(d10, c10, b11)));
            return C16807N.f139792a;
        }
    }

    public C11771b(Ax.a aVar) {
        C17542s.j(aVar, "productDetailsRemoteDataSource");
        this.f101363a = aVar;
    }

    private final Q d() {
        return S.a(C16311i0.a());
    }

    public F<k<C11700k, String>> a(String str) {
        String str2 = str;
        C17542s.j(str2, "productNo");
        K k10 = new K(k.a.d(k.f98528e, (Object) null, 1, (Object) null));
        F0 f02 = this.f101364b;
        if (f02 != null) {
            F0.a.a(f02, (CancellationException) null, 1, (Object) null);
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar : arrayList) {
                if (str3 == null) {
                    String a10 = C11818a.a("Force quiting ongoing job in Pip", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str3 = C11820c.a(a10);
                }
                String str5 = str3;
                if (str4 == null) {
                    String name = C11771b.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str6 = str4;
                bVar.a(eVar, str6, false, (Throwable) null, str5);
                str3 = str5;
                str4 = str6;
            }
            this.f101364b = null;
        }
        this.f101364b = C16314k.d(d(), new a(N.f137593c0, this, k10, str2), (T) null, new C2384b(this, str2, k10, (C17164e<? super C2384b>) null), 2, (Object) null);
        return k10;
    }
}
