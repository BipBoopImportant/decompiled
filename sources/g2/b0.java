package g2;

import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l2.f;
import m2.h;
import m2.i;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lg2/b0;", "Lg2/Z;", "Ll2/f;", "parsedTransition", "<init>", "(Ll2/f;)V", "Lm2/h;", "transition", "LXH/N;", "b", "(Lm2/h;)V", "c", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ll2/f;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b0 implements Z {

    /* renamed from: b  reason: collision with root package name */
    public static final a f23661b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final b0 f23662c = new b0(new f(new char[0]));

    /* renamed from: a  reason: collision with root package name */
    private final f f23663a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lg2/b0$a;", "", "<init>", "()V", "Lg2/b0;", "EMPTY", "Lg2/b0;", "a", "()Lg2/b0;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b0 a() {
            return b0.f23662c;
        }

        private a() {
        }
    }

    public b0(f fVar) {
        this.f23663a = fVar;
    }

    public final void b(h hVar) {
        try {
            i.c(this.f23663a, hVar);
        } catch (l2.h e10) {
            Log.e("CML", "Error parsing JSON " + e10);
        }
    }

    public final void c(h hVar) {
        try {
            i.f(this.f23663a, hVar);
        } catch (l2.h e10) {
            Log.e("CML", "Error parsing JSON " + e10);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C17542s.e(b0.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C17542s.h(obj, "null cannot be cast to non-null type androidx.constraintlayout.compose.TransitionImpl");
        return C17542s.e(this.f23663a, ((b0) obj).f23663a);
    }

    public int hashCode() {
        return this.f23663a.hashCode();
    }
}
