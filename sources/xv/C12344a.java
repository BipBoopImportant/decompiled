package xv;

import android.content.Context;
import com.ingka.ikea.mcomsettings.impl.db.MComDatabase;
import com.ingka.ikea.mcomsettings.impl.network.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sv.C11892a;
import tw.g;
import tw.h;
import uv.C12126a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lxv/a;", "", "a", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xv.a  reason: case insensitive filesystem */
public abstract class C12344a {

    /* renamed from: a  reason: collision with root package name */
    public static final C2534a f106291a = new C2534a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lxv/a$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ltw/h;", "networkService", "Ltw/g;", "networkParameters", "Lsv/a;", "a", "(Landroid/content/Context;Ltw/h;Ltw/g;)Lsv/a;", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xv.a$a  reason: collision with other inner class name */
    public static final class C2534a {
        public /* synthetic */ C2534a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C11892a a(Context context, h hVar, g gVar) {
            C17542s.j(context, "context");
            C17542s.j(hVar, "networkService");
            C17542s.j(gVar, "networkParameters");
            return new C12126a(MComDatabase.f96647a.a(context).c(), gVar, new b(hVar, gVar));
        }

        private C2534a() {
        }
    }
}
