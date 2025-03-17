package n3;

import androidx.lifecycle.C5212o;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import java.util.Arrays;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l3.a;
import l3.b;
import l3.f;
import nI.C17642l;
import uI.C18055d;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJK\u0010\u001d\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u001b\u001a\u00020\u00182\u001a\u0010\u0010\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000f0\u001c\"\u0006\u0012\u0002\b\u00030\u000fH\u0000¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Ln3/g;", "", "<init>", "()V", "Landroidx/lifecycle/f0;", "T", "LuI/d;", "modelClass", "", "e", "(LuI/d;)Ljava/lang/String;", "VM", "f", "()Landroidx/lifecycle/f0;", "", "Ll3/f;", "initializers", "Landroidx/lifecycle/i0$c;", "a", "(Ljava/util/Collection;)Landroidx/lifecycle/i0$c;", "Landroidx/lifecycle/k0;", "owner", "d", "(Landroidx/lifecycle/k0;)Landroidx/lifecycle/i0$c;", "Ll3/a;", "c", "(Landroidx/lifecycle/k0;)Ll3/a;", "extras", "", "b", "(LuI/d;Ll3/a;[Ll3/f;)Landroidx/lifecycle/f0;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f26584a = new g();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ln3/g$a;", "Ll3/a$b;", "", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements a.b<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f26585a = new a();

        private a() {
        }
    }

    private g() {
    }

    public final i0.c a(Collection<? extends f<?>> collection) {
        C17542s.j(collection, "initializers");
        f[] fVarArr = (f[]) collection.toArray(new f[0]);
        return new b((f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }

    public final <VM extends f0> VM b(C18055d<VM> dVar, l3.a aVar, f<?>... fVarArr) {
        VM vm2;
        f<?> fVar;
        C17642l<l3.a, ?> b10;
        C17542s.j(dVar, "modelClass");
        C17542s.j(aVar, "extras");
        C17542s.j(fVarArr, "initializers");
        int length = fVarArr.length;
        int i10 = 0;
        while (true) {
            vm2 = null;
            if (i10 >= length) {
                fVar = null;
                break;
            }
            fVar = fVarArr[i10];
            if (C17542s.e(fVar.a(), dVar)) {
                break;
            }
            i10++;
        }
        if (!(fVar == null || (b10 = fVar.b()) == null)) {
            vm2 = (f0) b10.invoke(aVar);
        }
        if (vm2 != null) {
            return vm2;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + h.a(dVar)).toString());
    }

    public final l3.a c(k0 k0Var) {
        C17542s.j(k0Var, "owner");
        return k0Var instanceof C5212o ? ((C5212o) k0Var).getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
    }

    public final i0.c d(k0 k0Var) {
        C17542s.j(k0Var, "owner");
        return k0Var instanceof C5212o ? ((C5212o) k0Var).getDefaultViewModelProviderFactory() : c.f26578a;
    }

    public final <T extends f0> String e(C18055d<T> dVar) {
        C17542s.j(dVar, "modelClass");
        String a10 = h.a(dVar);
        if (a10 != null) {
            return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + a10;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final <VM extends f0> VM f() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
