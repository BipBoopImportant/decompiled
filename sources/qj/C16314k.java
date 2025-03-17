package QJ;

import WJ.K;
import WJ.z;
import XH.C16807N;
import XJ.C16832a;
import XJ.C16833b;
import dI.C17164e;
import dI.C17165f;
import dI.C17168i;
import dI.C17169j;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aI\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0004\b\u000b\u0010\f\u001aU\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\r*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0004\b\u000f\u0010\u0010\u001aO\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H@\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LQJ/Q;", "LdI/i;", "context", "LQJ/T;", "start", "Lkotlin/Function2;", "LdI/e;", "LXH/N;", "", "block", "LQJ/F0;", "c", "(LQJ/Q;LdI/i;LQJ/T;LnI/p;)LQJ/F0;", "T", "LQJ/Y;", "a", "(LQJ/Q;LdI/i;LQJ/T;LnI/p;)LQJ/Y;", "e", "(LdI/i;LnI/p;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/BuildersKt")
/* renamed from: QJ.k  reason: case insensitive filesystem */
final /* synthetic */ class C16314k {
    public static final <T> Y<T> a(Q q10, C17168i iVar, T t10, p<? super Q, ? super C17164e<? super T>, ? extends Object> pVar) {
        C17168i j10 = C16293K.j(q10, iVar);
        Z n02 = t10.j() ? new N0(j10, pVar) : new Z(j10, true);
        n02.e1(t10, n02, pVar);
        return n02;
    }

    public static /* synthetic */ Y b(Q q10, C17168i iVar, T t10, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            iVar = C17169j.f142968a;
        }
        if ((i10 & 2) != 0) {
            t10 = T.DEFAULT;
        }
        return C16310i.a(q10, iVar, t10, pVar);
    }

    public static final F0 c(Q q10, C17168i iVar, T t10, p<? super Q, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
        C17168i j10 = C16293K.j(q10, iVar);
        C16294a o02 = t10.j() ? new O0(j10, pVar) : new Y0(j10, true);
        o02.e1(t10, o02, pVar);
        return o02;
    }

    public static /* synthetic */ F0 d(Q q10, C17168i iVar, T t10, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            iVar = C17169j.f142968a;
        }
        if ((i10 & 2) != 0) {
            t10 = T.DEFAULT;
        }
        return C16310i.c(q10, iVar, t10, pVar);
    }

    /* JADX INFO: finally extract failed */
    public static final <T> Object e(C17168i iVar, p<? super Q, ? super C17164e<? super T>, ? extends Object> pVar, C17164e<? super T> eVar) {
        Object obj;
        C17168i context = eVar.getContext();
        C17168i k10 = C16293K.k(context, iVar);
        I0.l(k10);
        if (k10 == context) {
            z zVar = new z(k10, eVar);
            obj = C16833b.b(zVar, zVar, pVar);
        } else {
            C17165f.b bVar = C17165f.f142966s0;
            if (C17542s.e(k10.get(bVar), context.get(bVar))) {
                o1 o1Var = new o1(k10, eVar);
                C17168i context2 = o1Var.getContext();
                Object i10 = K.i(context2, (Object) null);
                try {
                    Object b10 = C16833b.b(o1Var, o1Var, pVar);
                    K.f(context2, i10);
                    obj = b10;
                } catch (Throwable th2) {
                    K.f(context2, i10);
                    throw th2;
                }
            } else {
                C16303e0 e0Var = new C16303e0(k10, eVar);
                C16832a.c(pVar, e0Var, e0Var);
                obj = e0Var.g1();
            }
        }
        if (obj == C17187b.f()) {
            h.c(eVar);
        }
        return obj;
    }
}
