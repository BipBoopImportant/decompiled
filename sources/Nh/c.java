package NH;

import XH.C16807N;
import dI.C17164e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.q;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 !*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0001\u0015Ba\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012H\u0010\u000e\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\r0\b¢\u0006\u0004\b\u000f\u0010\u0010B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013JQ\u0010\u0015\u001a\u00020\f2B\u0010\u0014\u001a>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\r¢\u0006\u0004\b\u0015\u0010\u0016JW\u0010\u0018\u001a\u00020\f2H\u0010\u0017\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\r0\b¢\u0006\u0004\b\u0018\u0010\u0019JO\u0010\u001a\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\r0\b¢\u0006\u0004\b\u001a\u0010\u001bJO\u0010\u001c\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\r0\b¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010#\u001a\u0004\b$\u0010%RX\u0010\u000e\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\r0\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010&R\"\u0010-\u001a\u00020'8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0011\u0010/\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b.\u0010*R\u0011\u00103\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"LNH/c;", "", "TSubject", "Call", "LNH/h;", "phase", "LNH/i;", "relation", "", "Lkotlin/Function3;", "LNH/e;", "LdI/e;", "LXH/N;", "Lio/ktor/util/pipeline/PipelineInterceptorFunction;", "interceptors", "<init>", "(LNH/h;LNH/i;Ljava/util/List;)V", "(LNH/h;LNH/i;)V", "d", "()V", "interceptor", "a", "(LnI/q;)V", "destination", "b", "(Ljava/util/List;)V", "i", "()Ljava/util/List;", "c", "", "toString", "()Ljava/lang/String;", "LNH/h;", "e", "()LNH/h;", "LNH/i;", "f", "()LNH/i;", "Ljava/util/List;", "", "Z", "getShared", "()Z", "setShared", "(Z)V", "shared", "h", "isEmpty", "", "g", "()I", "size", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c<TSubject, Call> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f136510e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    private static final List<Object> f136511f = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    private final h f136512a;

    /* renamed from: b  reason: collision with root package name */
    private final i f136513b;

    /* renamed from: c  reason: collision with root package name */
    private List<q<e<TSubject, Call>, TSubject, C17164e<? super C16807N>, Object>> f136514c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f136515d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNH/c$a;", "", "<init>", "()V", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c(h hVar, i iVar, List<q<e<TSubject, Call>, TSubject, C17164e<? super C16807N>, Object>> list) {
        C17542s.j(hVar, "phase");
        C17542s.j(iVar, "relation");
        C17542s.j(list, "interceptors");
        this.f136512a = hVar;
        this.f136513b = iVar;
        this.f136514c = list;
        this.f136515d = true;
    }

    private final void d() {
        this.f136514c = c();
        this.f136515d = false;
    }

    public final void a(q<? super e<TSubject, Call>, ? super TSubject, ? super C17164e<? super C16807N>, ? extends Object> qVar) {
        C17542s.j(qVar, "interceptor");
        if (this.f136515d) {
            d();
        }
        this.f136514c.add(qVar);
    }

    public final void b(List<q<e<TSubject, Call>, TSubject, C17164e<? super C16807N>, Object>> list) {
        C17542s.j(list, "destination");
        List<q<e<TSubject, Call>, TSubject, C17164e<? super C16807N>, Object>> list2 = this.f136514c;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + list2.size());
        }
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.add(list2.get(i10));
        }
    }

    public final List<q<e<TSubject, Call>, TSubject, C17164e<? super C16807N>, Object>> c() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f136514c);
        return arrayList;
    }

    public final h e() {
        return this.f136512a;
    }

    public final i f() {
        return this.f136513b;
    }

    public final int g() {
        return this.f136514c.size();
    }

    public final boolean h() {
        return this.f136514c.isEmpty();
    }

    public final List<q<e<TSubject, Call>, TSubject, C17164e<? super C16807N>, Object>> i() {
        this.f136515d = true;
        return this.f136514c;
    }

    public String toString() {
        return "Phase `" + this.f136512a.a() + "`, " + g() + " handlers";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(NH.h r3, NH.i r4) {
        /*
            r2 = this;
            java.lang.String r0 = "phase"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.String r0 = "relation"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            java.util.List<java.lang.Object> r0 = f136511f
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Function3<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.PhaseContent, Call of io.ktor.util.pipeline.PhaseContent>, TSubject of io.ktor.util.pipeline.PhaseContent, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>{ io.ktor.util.pipeline.PipelineKt.PipelineInterceptorFunction<TSubject of io.ktor.util.pipeline.PhaseContent, Call of io.ktor.util.pipeline.PhaseContent> }>"
            kotlin.jvm.internal.C17542s.h(r0, r1)
            java.util.List r1 = kotlin.jvm.internal.W.c(r0)
            r2.<init>(r3, r4, r1)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x001f
            return
        L_0x001f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "The shared empty array list has been modified"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: NH.c.<init>(NH.h, NH.i):void");
    }
}
