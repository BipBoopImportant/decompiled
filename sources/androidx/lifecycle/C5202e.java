package androidx.lifecycle;

import androidx.lifecycle.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/lifecycle/e;", "Landroidx/lifecycle/v;", "", "Landroidx/lifecycle/n;", "generatedAdapters", "<init>", "([Landroidx/lifecycle/n;)V", "Landroidx/lifecycle/y;", "source", "Landroidx/lifecycle/r$a;", "event", "LXH/N;", "e", "(Landroidx/lifecycle/y;Landroidx/lifecycle/r$a;)V", "a", "[Landroidx/lifecycle/n;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.e  reason: case insensitive filesystem */
public final class C5202e implements C5218v {

    /* renamed from: a  reason: collision with root package name */
    private final C5211n[] f22266a;

    public C5202e(C5211n[] nVarArr) {
        C17542s.j(nVarArr, "generatedAdapters");
        this.f22266a = nVarArr;
    }

    public void e(C5221y yVar, r.a aVar) {
        C17542s.j(yVar, "source");
        C17542s.j(aVar, "event");
        J j10 = new J();
        for (C5211n a10 : this.f22266a) {
            a10.a(yVar, aVar, false, j10);
        }
        for (C5211n a11 : this.f22266a) {
            a11.a(yVar, aVar, true, j10);
        }
    }
}
