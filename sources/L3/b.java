package l3;

import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mI.C17603a;
import n3.g;
import uI.C18055d;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u001a\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\"\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ll3/b;", "Landroidx/lifecycle/i0$c;", "", "Ll3/f;", "initializers", "<init>", "([Ll3/f;)V", "Landroidx/lifecycle/f0;", "VM", "Ljava/lang/Class;", "modelClass", "Ll3/a;", "extras", "create", "(Ljava/lang/Class;Ll3/a;)Landroidx/lifecycle/f0;", "a", "[Ll3/f;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b implements i0.c {

    /* renamed from: a  reason: collision with root package name */
    private final f<?>[] f25487a;

    public b(f<?>... fVarArr) {
        C17542s.j(fVarArr, "initializers");
        this.f25487a = fVarArr;
    }

    public <VM extends f0> VM create(Class<VM> cls, a aVar) {
        C17542s.j(cls, "modelClass");
        C17542s.j(aVar, "extras");
        g gVar = g.f26584a;
        C18055d<VM> e10 = C17603a.e(cls);
        f<?>[] fVarArr = this.f25487a;
        return gVar.b(e10, aVar, (f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
