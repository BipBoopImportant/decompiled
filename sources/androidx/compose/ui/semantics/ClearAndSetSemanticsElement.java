package androidx.compose.ui.semantics;

import G1.V;
import L1.d;
import L1.l;
import L1.n;
import L1.x;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;", "LG1/V;", "LL1/d;", "LL1/n;", "Lkotlin/Function1;", "LL1/x;", "LXH/N;", "properties", "<init>", "(LnI/l;)V", "c", "()LL1/d;", "node", "f", "(LL1/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "LnI/l;", "getProperties", "()LnI/l;", "LL1/l;", "x", "()LL1/l;", "semanticsConfiguration", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ClearAndSetSemanticsElement extends V<d> implements n {

    /* renamed from: d  reason: collision with root package name */
    private final C17642l<x, C16807N> f19689d;

    public ClearAndSetSemanticsElement(C17642l<? super x, C16807N> lVar) {
        this.f19689d = lVar;
    }

    /* renamed from: c */
    public d a() {
        return new d(false, true, this.f19689d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClearAndSetSemanticsElement) && C17542s.e(this.f19689d, ((ClearAndSetSemanticsElement) obj).f19689d);
    }

    /* renamed from: f */
    public void b(d dVar) {
        dVar.D2(this.f19689d);
    }

    public int hashCode() {
        return this.f19689d.hashCode();
    }

    public String toString() {
        return "ClearAndSetSemanticsElement(properties=" + this.f19689d + ')';
    }

    public l x() {
        l lVar = new l();
        lVar.D(false);
        lVar.C(true);
        this.f19689d.invoke(lVar);
        return lVar;
    }
}
