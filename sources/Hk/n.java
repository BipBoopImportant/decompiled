package hK;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00148VX\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001fR\u0014\u0010!\u001a\u00020\u00148VX\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0014\u0010$\u001a\u00020\u00078\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8VX\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"LhK/n;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "serialName", "original", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "index", "e", "(I)Ljava/lang/String;", "name", "c", "(Ljava/lang/String;)I", "", "", "f", "(I)Ljava/util/List;", "g", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "j", "(I)Z", "b", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "LhK/l;", "h", "()LhK/l;", "kind", "()Z", "isNullable", "isInline", "d", "()I", "elementsCount", "getAnnotations", "()Ljava/util/List;", "annotations", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n implements SerialDescriptor {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ SerialDescriptor f143474a;

    /* renamed from: b  reason: collision with root package name */
    private final String f143475b;

    public n(String str, SerialDescriptor serialDescriptor) {
        C17542s.j(str, "serialName");
        C17542s.j(serialDescriptor, "original");
        this.f143474a = serialDescriptor;
        this.f143475b = str;
    }

    public boolean b() {
        return this.f143474a.b();
    }

    public int c(String str) {
        C17542s.j(str, "name");
        return this.f143474a.c(str);
    }

    public int d() {
        return this.f143474a.d();
    }

    public String e(int i10) {
        return this.f143474a.e(i10);
    }

    public List<Annotation> f(int i10) {
        return this.f143474a.f(i10);
    }

    public SerialDescriptor g(int i10) {
        return this.f143474a.g(i10);
    }

    public List<Annotation> getAnnotations() {
        return this.f143474a.getAnnotations();
    }

    public l h() {
        return this.f143474a.h();
    }

    public String i() {
        return this.f143475b;
    }

    public boolean isInline() {
        return this.f143474a.isInline();
    }

    public boolean j(int i10) {
        return this.f143474a.j(i10);
    }
}
