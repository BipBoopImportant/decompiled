package hK;

import YH.C16877v;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0000X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c8\u0000X\u0004¢\u0006\f\n\u0004\b#\u0010\u0015\u001a\u0004\b#\u0010\u0017R&\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u001c8\u0000X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b \u0010\u0017R \u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\u001c8\u0000X\u0004¢\u0006\f\n\u0004\b&\u0010\u0015\u001a\u0004\b&\u0010\u0017¨\u0006("}, d2 = {"LhK/a;", "", "", "serialName", "<init>", "(Ljava/lang/String;)V", "elementName", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "", "annotations", "", "isOptional", "LXH/N;", "a", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;Ljava/util/List;Z)V", "Ljava/lang/String;", "getSerialName", "()Ljava/lang/String;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "h", "(Ljava/util/List;)V", "getAnnotations$annotations", "()V", "", "f", "elementNames", "", "d", "Ljava/util/Set;", "uniqueNames", "e", "elementDescriptors", "elementAnnotations", "g", "elementOptionality", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hK.a  reason: case insensitive filesystem */
public final class C17335a {

    /* renamed from: a  reason: collision with root package name */
    private final String f143427a;

    /* renamed from: b  reason: collision with root package name */
    private List<? extends Annotation> f143428b = C16877v.n();

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f143429c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final Set<String> f143430d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    private final List<SerialDescriptor> f143431e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final List<List<Annotation>> f143432f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final List<Boolean> f143433g = new ArrayList();

    public C17335a(String str) {
        C17542s.j(str, "serialName");
        this.f143427a = str;
    }

    public static /* synthetic */ void b(C17335a aVar, String str, SerialDescriptor serialDescriptor, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = C16877v.n();
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        aVar.a(str, serialDescriptor, list, z10);
    }

    public final void a(String str, SerialDescriptor serialDescriptor, List<? extends Annotation> list, boolean z10) {
        C17542s.j(str, "elementName");
        C17542s.j(serialDescriptor, "descriptor");
        C17542s.j(list, "annotations");
        if (this.f143430d.add(str)) {
            this.f143429c.add(str);
            this.f143431e.add(serialDescriptor);
            this.f143432f.add(list);
            this.f143433g.add(Boolean.valueOf(z10));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + str + "' is already registered in " + this.f143427a).toString());
    }

    public final List<Annotation> c() {
        return this.f143428b;
    }

    public final List<List<Annotation>> d() {
        return this.f143432f;
    }

    public final List<SerialDescriptor> e() {
        return this.f143431e;
    }

    public final List<String> f() {
        return this.f143429c;
    }

    public final List<Boolean> g() {
        return this.f143433g;
    }

    public final void h(List<? extends Annotation> list) {
        C17542s.j(list, "<set-?>");
        this.f143428b = list;
    }
}
