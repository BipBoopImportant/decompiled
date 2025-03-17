package Gw;

import Fw.C12909b;
import Hw.C13012a;
import android.content.Context;
import com.ingka.ikea.ongoinginstoreordersrepository.impl.data.OnGoingOrdersDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tw.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LGw/a;", "", "a", "ongoinginstoreordersrepository-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Gw.a  reason: case insensitive filesystem */
public abstract class C12957a {

    /* renamed from: a  reason: collision with root package name */
    public static final C2655a f110511a = new C2655a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LGw/a$a;", "", "<init>", "()V", "Ltw/h;", "networkService", "LHw/a;", "a", "(Ltw/h;)LHw/a;", "Landroid/content/Context;", "context", "LFw/b;", "b", "(Landroid/content/Context;)LFw/b;", "ongoinginstoreordersrepository-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Gw.a$a  reason: collision with other inner class name */
    public static final class C2655a {
        public /* synthetic */ C2655a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C13012a a(h hVar) {
            C17542s.j(hVar, "networkService");
            return (C13012a) hVar.b(C13012a.class);
        }

        public final C12909b b(Context context) {
            C17542s.j(context, "context");
            return OnGoingOrdersDatabase.f119225a.a(context).a();
        }

        private C2655a() {
        }
    }
}
