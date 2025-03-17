package oL;

import jL.C17492a;
import jL.C17493b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mL.C17619c;
import mL.C17620d;
import qL.C17844a;
import vL.C18207b;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00020\b2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010$\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#RZ\u0010-\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0%j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b`&2\u001e\u0010'\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0%j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b`&8\u0006@@X\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b\u001a\u0010*\"\u0004\b+\u0010,RL\u00104\u001a.\u0012\b\u0012\u00060\u000ej\u0002`\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060.j\u0016\u0012\b\u0012\u00060\u000ej\u0002`\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006`/8\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b3\u0010\u001f\u001a\u0004\b(\u00102R0\u00107\u001a\u0012\u0012\u0004\u0012\u0002050%j\b\u0012\u0004\u0012\u000205`&8\u0000X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010)\u0012\u0004\b6\u0010\u001f\u001a\u0004\b0\u0010*R&\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0000088\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u00109\u0012\u0004\b;\u0010\u001f\u001a\u0004\b \u0010:¨\u0006="}, d2 = {"LoL/a;", "", "", "_createdAtStart", "<init>", "(Z)V", "LmL/c;", "instanceFactory", "LXH/N;", "f", "(LmL/c;)V", "LmL/d;", "g", "(LmL/d;)V", "", "Lorg/koin/core/definition/IndexKey;", "mapping", "factory", "h", "(Ljava/lang/String;LmL/c;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Z", "e", "()Z", "get_createdAtStart$annotations", "()V", "b", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "<set-?>", "c", "Ljava/util/HashSet;", "()Ljava/util/HashSet;", "setEagerInstances$koin_core", "(Ljava/util/HashSet;)V", "eagerInstances", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "d", "Ljava/util/HashMap;", "()Ljava/util/HashMap;", "getMappings$annotations", "mappings", "LqL/a;", "getScopes$annotations", "scopes", "", "Ljava/util/List;", "()Ljava/util/List;", "getIncludedModules$annotations", "includedModules", "koin-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oL.a  reason: case insensitive filesystem */
public final class C17722a {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f145434a;

    /* renamed from: b  reason: collision with root package name */
    private final String f145435b;

    /* renamed from: c  reason: collision with root package name */
    private HashSet<C17620d<?>> f145436c;

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<String, C17619c<?>> f145437d;

    /* renamed from: e  reason: collision with root package name */
    private final HashSet<C17844a> f145438e;

    /* renamed from: f  reason: collision with root package name */
    private final List<C17722a> f145439f;

    public C17722a() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    public final HashSet<C17620d<?>> a() {
        return this.f145436c;
    }

    public final List<C17722a> b() {
        return this.f145439f;
    }

    public final HashMap<String, C17619c<?>> c() {
        return this.f145437d;
    }

    public final HashSet<C17844a> d() {
        return this.f145438e;
    }

    public final boolean e() {
        return this.f145434a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C17722a.class == obj.getClass() && C17542s.e(this.f145435b, ((C17722a) obj).f145435b);
    }

    public final void f(C17619c<?> cVar) {
        C17542s.j(cVar, "instanceFactory");
        C17492a<?> c10 = cVar.c();
        h(C17493b.a(c10.b(), c10.c(), c10.d()), cVar);
    }

    public final void g(C17620d<?> dVar) {
        C17542s.j(dVar, "instanceFactory");
        this.f145436c.add(dVar);
    }

    public final void h(String str, C17619c<?> cVar) {
        C17542s.j(str, "mapping");
        C17542s.j(cVar, "factory");
        this.f145437d.put(str, cVar);
    }

    public int hashCode() {
        return this.f145435b.hashCode();
    }

    public C17722a(boolean z10) {
        this.f145434a = z10;
        this.f145435b = C18207b.f149085a.c();
        this.f145436c = new HashSet<>();
        this.f145437d = new HashMap<>();
        this.f145438e = new HashSet<>();
        this.f145439f = new ArrayList();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17722a(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10);
    }
}
