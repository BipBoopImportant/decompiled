package GK;

import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LGK/n;", "", "LGK/v;", "url", "", "LGK/m;", "cookies", "LXH/N;", "a", "(LGK/v;Ljava/util/List;)V", "b", "(LGK/v;)Ljava/util/List;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: GK.n  reason: case insensitive filesystem */
public interface C15795n {

    /* renamed from: a  reason: collision with root package name */
    public static final a f135075a = a.f135077a;

    /* renamed from: b  reason: collision with root package name */
    public static final C15795n f135076b = new a.C3321a();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\b"}, d2 = {"LGK/n$a;", "", "<init>", "()V", "LGK/n;", "NO_COOKIES", "LGK/n;", "a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: GK.n$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f135077a = new a();

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LGK/n$a$a;", "LGK/n;", "<init>", "()V", "LGK/v;", "url", "", "LGK/m;", "cookies", "LXH/N;", "a", "(LGK/v;Ljava/util/List;)V", "b", "(LGK/v;)Ljava/util/List;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: GK.n$a$a  reason: collision with other inner class name */
        private static final class C3321a implements C15795n {
            public void a(C15803v vVar, List<C15794m> list) {
                C17542s.j(vVar, "url");
                C17542s.j(list, "cookies");
            }

            public List<C15794m> b(C15803v vVar) {
                C17542s.j(vVar, "url");
                return C16877v.n();
            }
        }

        private a() {
        }
    }

    void a(C15803v vVar, List<C15794m> list);

    List<C15794m> b(C15803v vVar);
}
