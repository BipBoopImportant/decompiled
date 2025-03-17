package d5;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b \u0018\u0000 \f*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J1\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ld5/h;", "", "T", "<init>", "()V", "", "message", "Lkotlin/Function1;", "", "condition", "c", "(Ljava/lang/String;LnI/l;)Ld5/h;", "a", "()Ljava/lang/Object;", "value", "b", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class h<T> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f50745a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\b\b\u0001\u0010\u0004*\u00020\u0001*\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ld5/h$a;", "", "<init>", "()V", "T", "", "tag", "Ld5/j;", "verificationMode", "Ld5/g;", "logger", "Ld5/h;", "a", "(Ljava/lang/Object;Ljava/lang/String;Ld5/j;Ld5/g;)Ld5/h;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ h b(a aVar, Object obj, String str, j jVar, g gVar, int i10, Object obj2) {
            if ((i10 & 2) != 0) {
                jVar = c.f50728a.a();
            }
            if ((i10 & 4) != 0) {
                gVar = C7743a.f50723a;
            }
            return aVar.a(obj, str, jVar, gVar);
        }

        public final <T> h<T> a(T t10, String str, j jVar, g gVar) {
            C17542s.j(t10, "<this>");
            C17542s.j(str, "tag");
            C17542s.j(jVar, "verificationMode");
            C17542s.j(gVar, "logger");
            return new i(t10, str, jVar, gVar);
        }

        private a() {
        }
    }

    public abstract T a();

    /* access modifiers changed from: protected */
    public final String b(Object obj, String str) {
        C17542s.j(obj, "value");
        C17542s.j(str, "message");
        return str + " value: " + obj;
    }

    public abstract h<T> c(String str, C17642l<? super T, Boolean> lVar);
}
