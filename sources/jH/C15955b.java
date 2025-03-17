package JH;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J(\u0010\u0005\u001a\u00028\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0007\u0010\u0006J\u001c\u0010\t\u001a\u00020\b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H¦\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\r\u001a\u00020\f\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\f\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LJH/b;", "", "T", "LJH/a;", "key", "a", "(LJH/a;)Ljava/lang/Object;", "e", "", "f", "(LJH/a;)Z", "value", "LXH/N;", "c", "(LJH/a;Ljava/lang/Object;)V", "d", "(LJH/a;)V", "Lkotlin/Function0;", "block", "b", "(LJH/a;LnI/a;)Ljava/lang/Object;", "", "g", "()Ljava/util/List;", "allKeys", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: JH.b  reason: case insensitive filesystem */
public interface C15955b {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: JH.b$a */
    public static final class a {
        public static <T> T a(C15955b bVar, C15954a<T> aVar) {
            C17542s.j(aVar, "key");
            T e10 = bVar.e(aVar);
            if (e10 != null) {
                return e10;
            }
            throw new IllegalStateException("No instance for key " + aVar);
        }
    }

    <T> T a(C15954a<T> aVar);

    <T> T b(C15954a<T> aVar, C17631a<? extends T> aVar2);

    <T> void c(C15954a<T> aVar, T t10);

    <T> void d(C15954a<T> aVar);

    <T> T e(C15954a<T> aVar);

    boolean f(C15954a<?> aVar);

    List<C15954a<?>> g();
}
