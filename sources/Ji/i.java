package JI;

import TI.C16497a;
import TI.C16499c;
import cJ.C17069f;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class i extends C15967h implements C16499c {

    /* renamed from: c  reason: collision with root package name */
    private final Annotation f135783c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(C17069f fVar, Annotation annotation) {
        super(fVar, (DefaultConstructorMarker) null);
        C17542s.j(annotation, "annotation");
        this.f135783c = annotation;
    }

    public C16497a a() {
        return new C15966g(this.f135783c);
    }
}
