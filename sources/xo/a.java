package Xo;

import androidx.fragment.app.C5187o;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qI.C17786c;
import uI.C18064m;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000b\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00032\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LXo/a;", "T", "LqI/c;", "Landroidx/fragment/app/o;", "", "key", "<init>", "(Ljava/lang/String;)V", "thisRef", "LuI/m;", "property", "c", "(Landroidx/fragment/app/o;LuI/m;)Ljava/lang/Object;", "a", "Ljava/lang/String;", "core-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a<T> implements C17786c<C5187o, T> {

    /* renamed from: b  reason: collision with root package name */
    public static final int f89218b = 0;

    /* renamed from: a  reason: collision with root package name */
    private final String f89219a;

    public a(String str) {
        C17542s.j(str, "key");
        this.f89219a = str;
    }

    /* renamed from: c */
    public T a(C5187o oVar, C18064m<?> mVar) {
        C17542s.j(oVar, "thisRef");
        C17542s.j(mVar, "property");
        T t10 = oVar.requireArguments().get(this.f89219a);
        if (t10 == null) {
            t10 = null;
        }
        if (t10 != null) {
            return t10;
        }
        String name = mVar.getName();
        String str = this.f89219a;
        throw new IllegalStateException("Property " + name + " could not be read for key:" + str);
    }
}
