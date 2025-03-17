package O5;

import O5.c;
import android.content.Context;
import android.util.DisplayMetrics;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LO5/d;", "LO5/j;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "LO5/i;", "b", "(LdI/e;)Ljava/lang/Object;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroid/content/Context;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements j {

    /* renamed from: a  reason: collision with root package name */
    private final Context f39249a;

    public d(Context context) {
        this.f39249a = context;
    }

    public Object b(C17164e<? super i> eVar) {
        DisplayMetrics displayMetrics = this.f39249a.getResources().getDisplayMetrics();
        c.a a10 = a.a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new i(a10, a10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && C17542s.e(this.f39249a, ((d) obj).f39249a);
    }

    public int hashCode() {
        return this.f39249a.hashCode();
    }
}
