package ct;

import QJ.M;
import W2.f;
import android.content.Context;
import bt.c;
import et.C11261a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tw.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lct/a;", "", "a", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ct.a  reason: case insensitive filesystem */
public interface C11186a {

    /* renamed from: a  reason: collision with root package name */
    public static final C2141a f96778a = C2141a.f96779a;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lct/a$a;", "", "<init>", "()V", "Ltw/h;", "networkService", "Let/a;", "a", "(Ltw/h;)Let/a;", "Landroid/content/Context;", "context", "LQJ/M;", "dispatcher", "LR2/h;", "LW2/f;", "b", "(Landroid/content/Context;LQJ/M;)LR2/h;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ct.a$a  reason: collision with other inner class name */
    public static final class C2141a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C2141a f96779a = new C2141a();

        private C2141a() {
        }

        public final C11261a a(h hVar) {
            C17542s.j(hVar, "networkService");
            return (C11261a) hVar.b(C11261a.class);
        }

        public final R2.h<f> b(Context context, M m10) {
            C17542s.j(context, "context");
            C17542s.j(m10, "dispatcher");
            return c.f90677b.b(context, m10);
        }
    }
}
