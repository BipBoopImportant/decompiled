package JI;

import TI.C16498b;
import cJ.C17069f;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: JI.h  reason: case insensitive filesystem */
public abstract class C15967h implements C16498b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f135781b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C17069f f135782a;

    /* renamed from: JI.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C15967h a(Object obj, C17069f fVar) {
            C17542s.j(obj, "value");
            return C15965f.l(obj.getClass()) ? new v(fVar, (Enum) obj) : obj instanceof Annotation ? new i(fVar, (Annotation) obj) : obj instanceof Object[] ? new l(fVar, (Object[]) obj) : obj instanceof Class ? new r(fVar, (Class) obj) : new x(fVar, obj);
        }

        private a() {
        }
    }

    public /* synthetic */ C15967h(C17069f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar);
    }

    public C17069f getName() {
        return this.f135782a;
    }

    private C15967h(C17069f fVar) {
        this.f135782a = fVar;
    }
}
