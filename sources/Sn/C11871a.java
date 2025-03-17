package sn;

import QJ.M;
import R2.h;
import W2.f;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qn.c;
import qn.s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lsn/a;", "", "a", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: sn.a  reason: case insensitive filesystem */
public abstract class C11871a {

    /* renamed from: a  reason: collision with root package name */
    public static final C2446a f102521a = new C2446a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lsn/a$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LQJ/M;", "dispatcher", "LR2/h;", "LW2/f;", "b", "(Landroid/content/Context;LQJ/M;)LR2/h;", "a", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: sn.a$a  reason: collision with other inner class name */
    public static final class C2446a {
        public /* synthetic */ C2446a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h<f> a(Context context, M m10) {
            C17542s.j(context, "context");
            C17542s.j(m10, "dispatcher");
            return c.f101699d.b(context, m10);
        }

        public final h<f> b(Context context, M m10) {
            C17542s.j(context, "context");
            C17542s.j(m10, "dispatcher");
            return s.f101887b.b(context, m10);
        }

        private C2446a() {
        }
    }
}
