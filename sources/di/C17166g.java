package dI;

import XH.C16807N;
import XH.x;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aW\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0007¢\u0006\u0004\b\b\u0010\t\u001aQ\u0010\n\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"R", "T", "Lkotlin/Function2;", "LdI/e;", "", "receiver", "completion", "LXH/N;", "a", "(LnI/p;Ljava/lang/Object;LdI/e;)LdI/e;", "b", "(LnI/p;Ljava/lang/Object;LdI/e;)V", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: dI.g  reason: case insensitive filesystem */
public final class C17166g {
    public static final <R, T> C17164e<C16807N> a(p<? super R, ? super C17164e<? super T>, ? extends Object> pVar, R r10, C17164e<? super T> eVar) {
        C17542s.j(pVar, "<this>");
        C17542s.j(eVar, "completion");
        return new C17170k(C17187b.c(C17187b.a(pVar, r10, eVar)), C17187b.f());
    }

    public static final <R, T> void b(p<? super R, ? super C17164e<? super T>, ? extends Object> pVar, R r10, C17164e<? super T> eVar) {
        C17542s.j(pVar, "<this>");
        C17542s.j(eVar, "completion");
        C17164e<C16807N> c10 = C17187b.c(C17187b.a(pVar, r10, eVar));
        x.a aVar = x.f139812b;
        c10.resumeWith(x.b(C16807N.f139792a));
    }
}
