package Yv;

import Am.a;
import IC.C13023e;
import IC.C13026h;
import KJ.C15985a;
import Mm.b;
import Mm.d;
import Pv.r;
import Sv.e;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import Yv.C6737e;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.q;
import sf.C10242c;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000e\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LYv/f;", "LYv/e;", "LAm/a;", "benefitsRepository", "Lsf/c;", "appUserDataRepository", "<init>", "(LAm/a;Lsf/c;)V", "", "LMm/a;", "benefits", "", "takeATourDismissed", "LYv/e$a$d;", "e", "(Ljava/util/List;Z)LYv/e$a$d;", "LSv/e$a;", "c", "(Ljava/util/List;)LSv/e$a;", "LPv/r;", "d", "(Z)Ljava/util/List;", "LTJ/g;", "LYv/e$a;", "invoke", "()LTJ/g;", "a", "LAm/a;", "b", "Lsf/c;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements C6737e {

    /* renamed from: a  reason: collision with root package name */
    private final Am.a f41149a;

    /* renamed from: b  reason: collision with root package name */
    private final C10242c f41150b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LAm/a$a;", "benefitResult", "", "takeATourDismissed", "LYv/e$a;", "<anonymous>", "(LAm/a$a;Z)LYv/e$a;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.membership.impl.usecase.GetBenefitsContentUseCaseImpl$invoke$1", f = "GetBenefitsContentUseCase.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements q<a.C1458a, Boolean, C17164e<? super C6737e.a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f41151c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f41152d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ boolean f41153e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f f41154f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar, C17164e<? super a> eVar) {
            super(3, eVar);
            this.f41154f = fVar;
        }

        public final Object i(a.C1458a aVar, boolean z10, C17164e<? super C6737e.a> eVar) {
            a aVar2 = new a(this.f41154f, eVar);
            aVar2.f41152d = aVar;
            aVar2.f41153e = z10;
            return aVar2.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((a.C1458a) obj, ((Boolean) obj2).booleanValue(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f41151c == 0) {
                y.b(obj);
                a.C1458a aVar = (a.C1458a) this.f41152d;
                boolean z10 = this.f41153e;
                List<Mm.a> list = null;
                if (aVar instanceof a.C1458a.b) {
                    d a10 = ((a.C1458a.b) aVar).a();
                    if (a10 != null) {
                        list = a10.c();
                    }
                    Collection collection = list;
                    return (collection == null || collection.isEmpty()) ? new C6737e.a.c(this.f41154f.d(z10)) : this.f41154f.e(list, z10);
                } else if (aVar instanceof a.C1458a.C1459a) {
                    d a11 = ((a.C1458a.C1459a) aVar).a();
                    if (a11 != null) {
                        list = a11.c();
                    }
                    Collection collection2 = list;
                    return (collection2 == null || collection2.isEmpty()) ? C6737e.a.b.f41142a : this.f41154f.e(list, z10);
                } else if (aVar instanceof a.C1458a.c) {
                    List<Mm.a> c10 = ((a.C1458a.c) aVar).a().c();
                    return c10.isEmpty() ? C6737e.a.C0700a.f41139a : this.f41154f.e(c10, z10);
                } else {
                    throw new t();
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public f(Am.a aVar, C10242c cVar) {
        C17542s.j(aVar, "benefitsRepository");
        C17542s.j(cVar, "appUserDataRepository");
        this.f41149a = aVar;
        this.f41150b = cVar;
    }

    private final e.a c(List<Mm.a> list) {
        String str;
        Object obj;
        Iterable<Mm.a> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (Mm.a aVar : iterable) {
            String d10 = aVar.d();
            C13023e c10 = C13026h.c(aVar.b());
            Iterator it = aVar.e().iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((Mm.e) obj).a() == Mm.f.IMAGE) {
                    break;
                }
            }
            Mm.e eVar = (Mm.e) obj;
            String b10 = eVar != null ? eVar.b() : null;
            if (b10 == null) {
                b10 = "";
            }
            b a10 = aVar.a();
            if (a10 != null) {
                str = a10.a();
            }
            arrayList.add(new Sv.a(d10, c10, b10, str));
        }
        return new e.a.C0653a(C15985a.l(arrayList));
    }

    /* access modifiers changed from: private */
    public final List<r> d(boolean z10) {
        return z10 ? C16877v.n() : C16877v.e(Ov.a.f39315a.a());
    }

    /* access modifiers changed from: private */
    public final C6737e.a.d e(List<Mm.a> list, boolean z10) {
        return new C6737e.a.d(d(z10), c(list));
    }

    public C16532g<C6737e.a> invoke() {
        return C16534i.s(C16534i.n(this.f41149a.c(), this.f41150b.s(), new a(this, (C17164e<? super a>) null)));
    }
}
