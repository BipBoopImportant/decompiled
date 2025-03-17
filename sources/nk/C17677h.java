package nK;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"LnK/h;", "", "Ljava/io/IOException;", "e", "LnK/j;", "imageSource", "LXH/N;", "a", "(Ljava/io/IOException;LnK/j;)V", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nK.h  reason: case insensitive filesystem */
public interface C17677h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f144928a = a.f144929a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"LnK/h$a;", "", "<init>", "()V", "LnK/h;", "b", "LnK/h;", "a", "()LnK/h;", "NoOpInRelease", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nK.h$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f144929a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final C17677h f144930b = new C3535a();

        @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"nK/h$a$a", "LnK/h;", "Ljava/io/IOException;", "e", "LnK/j;", "imageSource", "LXH/N;", "a", "(Ljava/io/IOException;LnK/j;)V", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: nK.h$a$a  reason: collision with other inner class name */
        public static final class C3535a implements C17677h {
            C3535a() {
            }

            public void a(IOException iOException, C17679j jVar) {
                C17542s.j(iOException, "e");
                C17542s.j(jVar, "imageSource");
            }
        }

        private a() {
        }

        public final C17677h a() {
            return f144930b;
        }
    }

    void a(IOException iOException, C17679j jVar) {
        C17542s.j(iOException, "e");
        C17542s.j(jVar, "imageSource");
    }
}
