package E1;

import E1.a0;
import G1.G;
import XH.C16807N;
import c2.C5267b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u000b\u001a\u00020\n*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"LE1/e0;", "LG1/G$f;", "<init>", "()V", "LE1/K;", "", "LE1/H;", "measurables", "Lc2/b;", "constraints", "LE1/J;", "i", "(LE1/K;Ljava/util/List;J)LE1/J;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e0 extends G.f {

    /* renamed from: b  reason: collision with root package name */
    public static final e0 f5886b = new e0();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f5887c = new a();

        a() {
            super(1);
        }

        public final void a(a0.a aVar) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a0 f5888c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a0 a0Var) {
            super(1);
            this.f5888c = a0Var;
        }

        public final void a(a0.a aVar) {
            a0.a.q(aVar, this.f5888c, 0, 0, 0.0f, (C17642l) null, 12, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List<a0> f5889c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(List<? extends a0> list) {
            super(1);
            this.f5889c = list;
        }

        public final void a(a0.a aVar) {
            List<a0> list = this.f5889c;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                a0.a.q(aVar, list.get(i10), 0, 0, 0.0f, (C17642l) null, 12, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    private e0() {
        super("Undefined intrinsics block and it is required");
    }

    public J i(K k10, List<? extends H> list, long j10) {
        if (list.isEmpty()) {
            return K.v0(k10, C5267b.n(j10), C5267b.m(j10), (Map) null, a.f5887c, 4, (Object) null);
        }
        if (list.size() == 1) {
            a0 i02 = ((H) list.get(0)).i0(j10);
            return K.v0(k10, c2.c.i(j10, i02.E0()), c2.c.h(j10, i02.z0()), (Map) null, new b(i02), 4, (Object) null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((H) list.get(i10)).i0(j10));
        }
        int size2 = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size2; i13++) {
            a0 a0Var = (a0) arrayList.get(i13);
            i11 = Math.max(a0Var.E0(), i11);
            i12 = Math.max(a0Var.z0(), i12);
        }
        return K.v0(k10, c2.c.i(j10, i11), c2.c.h(j10, i12), (Map) null, new c(arrayList), 4, (Object) null);
    }
}
