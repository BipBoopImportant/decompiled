package NH;

import JH.C15955b;
import NH.i;
import XH.C16807N;
import YH.C16877v;
import dI.C17164e;
import dI.C17168i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.W;
import nI.q;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\f\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\t\u001a\u00028\u00012\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0019JQ\u0010\u001f\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u001e0\u001aH\u0002¢\u0006\u0004\b\u001f\u0010 JQ\u0010!\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u001e0\u001aH\u0002¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\"\u0010#JY\u0010%\u001a\u00020\u001d2H\u0010$\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u001e0\u001aH\u0002¢\u0006\u0004\b%\u0010&J#\u0010(\u001a\u00020\u001d2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011H\u0002¢\u0006\u0004\b(\u0010)J[\u0010+\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00052B\u0010*\u001a>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u001eH\u0002¢\u0006\u0004\b+\u0010,J#\u0010-\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00012\u0006\u0010\n\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u001d\u00100\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b0\u00101J\u001d\u00102\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b2\u00101JN\u00103\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u000524\u0010*\u001a0\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bø\u0001\u0000¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u001dH\u0016¢\u0006\u0004\b5\u0010#R\u0017\u0010:\u001a\u0002068\u0006¢\u0006\f\n\u0004\b5\u00107\u001a\u0004\b8\u00109R\u001a\u0010>\u001a\u00020\u00178\u0016XD¢\u0006\f\n\u0004\b\u001f\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00010?8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010@R\u0016\u0010C\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010BR\u0016\u0010D\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010;R\u0018\u0010F\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010ER¬\u0001\u0010J\u001aF\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u001e\u0018\u00010\u001a2J\u0010G\u001aF\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u001e\u0018\u00010\u001a8B@BX\u000e¢\u0006\f\u001a\u0004\bH\u0010 \"\u0004\bI\u0010&\u0002\u0004\n\u0002\b\u0019¨\u0006K"}, d2 = {"LNH/d;", "", "TSubject", "TContext", "", "LNH/h;", "phases", "<init>", "([LNH/h;)V", "context", "subject", "LdI/i;", "coroutineContext", "LNH/e;", "c", "(Ljava/lang/Object;Ljava/lang/Object;LdI/i;)LNH/e;", "phase", "LNH/c;", "e", "(LNH/h;)LNH/c;", "", "f", "(LNH/h;)I", "", "i", "(LNH/h;)Z", "", "Lkotlin/Function3;", "LdI/e;", "LXH/N;", "Lio/ktor/util/pipeline/PipelineInterceptorFunction;", "b", "()Ljava/util/List;", "q", "n", "()V", "list", "m", "(Ljava/util/List;)V", "phaseContent", "p", "(LNH/c;)V", "block", "r", "(LNH/h;LnI/q;)Z", "d", "(Ljava/lang/Object;Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "reference", "j", "(LNH/h;LNH/h;)V", "k", "l", "(LNH/h;LnI/q;)V", "a", "LJH/b;", "LJH/b;", "getAttributes", "()LJH/b;", "attributes", "Z", "g", "()Z", "developmentMode", "", "Ljava/util/List;", "phasesRaw", "I", "interceptorsQuantity", "interceptorsListShared", "LNH/h;", "interceptorsListSharedPhase", "value", "h", "o", "interceptors", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class d<TSubject, TContext> {
    private volatile /* synthetic */ Object _interceptors;

    /* renamed from: a  reason: collision with root package name */
    private final C15955b f136516a = JH.d.a(true);

    /* renamed from: b  reason: collision with root package name */
    private final boolean f136517b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Object> f136518c;

    /* renamed from: d  reason: collision with root package name */
    private int f136519d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f136520e;

    /* renamed from: f  reason: collision with root package name */
    private h f136521f;

    public d(h... hVarArr) {
        C17542s.j(hVarArr, "phases");
        this.f136518c = C16877v.t(Arrays.copyOf(hVarArr, hVarArr.length));
        this._interceptors = null;
    }

    private final List<q<e<TSubject, TContext>, TSubject, C17164e<? super C16807N>, Object>> b() {
        int p10;
        int i10 = this.f136519d;
        if (i10 == 0) {
            m(C16877v.n());
            return C16877v.n();
        }
        List<Object> list = this.f136518c;
        int i11 = 0;
        if (i10 == 1 && (p10 = C16877v.p(list)) >= 0) {
            int i12 = 0;
            while (true) {
                Object obj = list.get(i12);
                c cVar = obj instanceof c ? (c) obj : null;
                if (cVar == null || cVar.h()) {
                    if (i12 == p10) {
                        break;
                    }
                    i12++;
                } else {
                    List<q<e<TSubject, TContext>, TSubject, C17164e<? super C16807N>, Object>> i13 = cVar.i();
                    p(cVar);
                    return i13;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        int p11 = C16877v.p(list);
        if (p11 >= 0) {
            while (true) {
                Object obj2 = list.get(i11);
                c cVar2 = obj2 instanceof c ? (c) obj2 : null;
                if (cVar2 != null) {
                    cVar2.b(arrayList);
                }
                if (i11 == p11) {
                    break;
                }
                i11++;
            }
        }
        m(arrayList);
        return arrayList;
    }

    private final e<TSubject, TContext> c(TContext tcontext, TSubject tsubject, C17168i iVar) {
        return f.a(tcontext, q(), tsubject, iVar, g());
    }

    private final c<TSubject, TContext> e(h hVar) {
        List<Object> list = this.f136518c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj == hVar) {
                c<TSubject, TContext> cVar = new c<>(hVar, i.c.f136527a);
                list.set(i10, cVar);
                return cVar;
            }
            if (obj instanceof c) {
                c<TSubject, TContext> cVar2 = (c) obj;
                if (cVar2.e() == hVar) {
                    return cVar2;
                }
            }
        }
        return null;
    }

    private final int f(h hVar) {
        List<Object> list = this.f136518c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj == hVar || ((obj instanceof c) && ((c) obj).e() == hVar)) {
                return i10;
            }
        }
        return -1;
    }

    private final List<q<e<TSubject, TContext>, TSubject, C17164e<? super C16807N>, Object>> h() {
        return (List) this._interceptors;
    }

    private final boolean i(h hVar) {
        List<Object> list = this.f136518c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj == hVar) {
                return true;
            }
            if ((obj instanceof c) && ((c) obj).e() == hVar) {
                return true;
            }
        }
        return false;
    }

    private final void m(List<? extends q<? super e<TSubject, TContext>, ? super TSubject, ? super C17164e<? super C16807N>, ? extends Object>> list) {
        o(list);
        this.f136520e = false;
        this.f136521f = null;
    }

    private final void n() {
        o((List) null);
        this.f136520e = false;
        this.f136521f = null;
    }

    private final void o(List<? extends q<? super e<TSubject, TContext>, ? super TSubject, ? super C17164e<? super C16807N>, ? extends Object>> list) {
        this._interceptors = list;
    }

    private final void p(c<TSubject, TContext> cVar) {
        o(cVar.i());
        this.f136520e = false;
        this.f136521f = cVar.e();
    }

    private final List<q<e<TSubject, TContext>, TSubject, C17164e<? super C16807N>, Object>> q() {
        if (h() == null) {
            b();
        }
        this.f136520e = true;
        List<q<e<TSubject, TContext>, TSubject, C17164e<? super C16807N>, Object>> h10 = h();
        C17542s.g(h10);
        return h10;
    }

    private final boolean r(h hVar, q<? super e<TSubject, TContext>, ? super TSubject, ? super C17164e<? super C16807N>, ? extends Object> qVar) {
        List h10 = h();
        if (this.f136518c.isEmpty() || h10 == null || this.f136520e || !W.p(h10)) {
            return false;
        }
        if (C17542s.e(this.f136521f, hVar)) {
            h10.add(qVar);
            return true;
        } else if (!C17542s.e(hVar, C16877v.I0(this.f136518c)) && f(hVar) != C16877v.p(this.f136518c)) {
            return false;
        } else {
            c e10 = e(hVar);
            C17542s.g(e10);
            e10.a(qVar);
            h10.add(qVar);
            return true;
        }
    }

    public void a() {
    }

    public final Object d(TContext tcontext, TSubject tsubject, C17164e<? super TSubject> eVar) {
        return c(tcontext, tsubject, eVar.getContext()).a(tsubject, eVar);
    }

    public boolean g() {
        return this.f136517b;
    }

    public final void j(h hVar, h hVar2) {
        i f10;
        h a10;
        C17542s.j(hVar, "reference");
        C17542s.j(hVar2, "phase");
        if (!i(hVar2)) {
            int f11 = f(hVar);
            if (f11 != -1) {
                int i10 = f11 + 1;
                int p10 = C16877v.p(this.f136518c);
                if (i10 <= p10) {
                    while (true) {
                        Object obj = this.f136518c.get(i10);
                        i.a aVar = null;
                        c cVar = obj instanceof c ? (c) obj : null;
                        if (cVar != null && (f10 = cVar.f()) != null) {
                            if (f10 instanceof i.a) {
                                aVar = (i.a) f10;
                            }
                            if (!(aVar == null || (a10 = aVar.a()) == null || !C17542s.e(a10, hVar))) {
                                f11 = i10;
                            }
                            if (i10 == p10) {
                                break;
                            }
                            i10++;
                        } else {
                            break;
                        }
                    }
                }
                this.f136518c.add(f11 + 1, new c(hVar2, new i.a(hVar)));
                return;
            }
            throw new b("Phase " + hVar + " was not registered for this pipeline");
        }
    }

    public final void k(h hVar, h hVar2) {
        C17542s.j(hVar, "reference");
        C17542s.j(hVar2, "phase");
        if (!i(hVar2)) {
            int f10 = f(hVar);
            if (f10 != -1) {
                this.f136518c.add(f10, new c(hVar2, new i.b(hVar)));
                return;
            }
            throw new b("Phase " + hVar + " was not registered for this pipeline");
        }
    }

    public final void l(h hVar, q<? super e<TSubject, TContext>, ? super TSubject, ? super C17164e<? super C16807N>, ? extends Object> qVar) {
        C17542s.j(hVar, "phase");
        C17542s.j(qVar, "block");
        c e10 = e(hVar);
        if (e10 != null) {
            q qVar2 = (q) W.g(qVar, 3);
            if (r(hVar, qVar)) {
                this.f136519d++;
                return;
            }
            e10.a(qVar);
            this.f136519d++;
            n();
            a();
            return;
        }
        throw new b("Phase " + hVar + " was not registered for this pipeline");
    }
}
