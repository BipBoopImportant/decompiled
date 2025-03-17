package SJ;

import QJ.C16293K;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import dI.C17164e;
import dI.C17168i;
import dI.C17169j;
import kotlin.Metadata;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001e\b\u0002\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bj\u0004\u0018\u0001`\u000b2(\u0010\u0011\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"E", "LQJ/Q;", "LdI/i;", "context", "", "capacity", "LQJ/T;", "start", "Lkotlin/Function1;", "", "LXH/N;", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "Lkotlin/Function2;", "LSJ/c;", "LdI/e;", "", "block", "LSJ/B;", "a", "(LQJ/Q;LdI/i;ILQJ/T;LnI/l;LnI/p;)LSJ/B;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: SJ.b  reason: case insensitive filesystem */
public final class C16426b {
    public static final <E> C16423B<E> a(Q q10, C17168i iVar, int i10, T t10, C17642l<? super Throwable, C16807N> lVar, p<? super C16427c<E>, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
        C17168i j10 = C16293K.j(q10, iVar);
        C16434j b10 = C16437m.b(i10, (C16428d) null, (C17642l) null, 6, (Object) null);
        C16425a vVar = t10.j() ? new C16446v(j10, b10, pVar) : new C16425a(j10, b10, true);
        if (lVar != null) {
            vVar.s(lVar);
        }
        vVar.e1(t10, vVar, pVar);
        return vVar;
    }

    public static /* synthetic */ C16423B b(Q q10, C17168i iVar, int i10, T t10, C17642l lVar, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = C17169j.f142968a;
        }
        C17168i iVar2 = iVar;
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            t10 = T.DEFAULT;
        }
        T t11 = t10;
        if ((i11 & 8) != 0) {
            lVar = null;
        }
        return a(q10, iVar2, i12, t11, lVar, pVar);
    }
}
