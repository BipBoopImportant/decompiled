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

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8VX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Landroidx/compose/ui/semantics/AppendedSemanticsElement;", "LG1/V;", "LL1/d;", "LL1/n;", "", "mergeDescendants", "Lkotlin/Function1;", "LL1/x;", "LXH/N;", "properties", "<init>", "(ZLnI/l;)V", "c", "()LL1/d;", "node", "f", "(LL1/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Z", "getMergeDescendants", "()Z", "e", "LnI/l;", "getProperties", "()LnI/l;", "LL1/l;", "x", "()LL1/l;", "semanticsConfiguration", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AppendedSemanticsElement extends V<d> implements n {

    /* renamed from: d  reason: collision with root package name */
    private final boolean f19687d;

    /* renamed from: e  reason: collision with root package name */
    private final C17642l<x, C16807N> f19688e;

    public AppendedSemanticsElement(boolean z10, C17642l<? super x, C16807N> lVar) {
        this.f19687d = z10;
        this.f19688e = lVar;
    }

    /* renamed from: c */
    public d a() {
        return new d(this.f19687d, false, this.f19688e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.f19687d == appendedSemanticsElement.f19687d && C17542s.e(this.f19688e, appendedSemanticsElement.f19688e);
    }

    /* renamed from: f */
    public void b(d dVar) {
        dVar.C2(this.f19687d);
        dVar.D2(this.f19688e);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f19687d) * 31) + this.f19688e.hashCode();
    }

    public String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.f19687d + ", properties=" + this.f19688e + ')';
    }

    public l x() {
        l lVar = new l();
        lVar.D(this.f19687d);
        this.f19688e.invoke(lVar);
        return lVar;
    }
}
