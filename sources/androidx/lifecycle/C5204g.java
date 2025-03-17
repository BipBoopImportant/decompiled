package androidx.lifecycle;

import XH.C16807N;
import dI.C17164e;
import dI.C17168i;
import dI.C17169j;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aY\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032(\u0010\n\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005H\u0007¢\u0006\u0004\b\f\u0010\r*V\b\u0000\u0010\u000e\u001a\u0004\b\u0000\u0010\u0000\"$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00052$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005¨\u0006\u000f"}, d2 = {"T", "LdI/i;", "context", "", "timeoutInMs", "Lkotlin/Function2;", "Landroidx/lifecycle/G;", "LdI/e;", "LXH/N;", "", "block", "Landroidx/lifecycle/F;", "a", "(LdI/i;JLnI/p;)Landroidx/lifecycle/F;", "Block", "lifecycle-livedata_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.g  reason: case insensitive filesystem */
public final class C5204g {
    public static final <T> F<T> a(C17168i iVar, long j10, p<? super G<T>, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
        C17542s.j(iVar, "context");
        C17542s.j(pVar, "block");
        return new C5203f(iVar, j10, pVar);
    }

    public static /* synthetic */ F b(C17168i iVar, long j10, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            iVar = C17169j.f142968a;
        }
        if ((i10 & 2) != 0) {
            j10 = 5000;
        }
        return a(iVar, j10, pVar);
    }
}
