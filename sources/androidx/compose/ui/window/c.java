package androidx.compose.ui.window;

import E1.H;
import E1.I;
import E1.J;
import E1.K;
import E1.a0;
import XH.C16807N;
import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LE1/K;", "", "LE1/H;", "measurables", "Lc2/b;", "constraints", "LE1/J;", "i", "(LE1/K;Ljava/util/List;J)LE1/J;"}, k = 3, mv = {1, 8, 0})
public final class c implements I {

    /* renamed from: a  reason: collision with root package name */
    public static final c f19933a = new c();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    public static final class a extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f19934c = new a();

        public a() {
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
    public static final class b extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a0 f19935c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a0 a0Var) {
            super(1);
            this.f19935c = a0Var;
        }

        public final void a(a0.a aVar) {
            a0.a.m(aVar, this.f19935c, 0, 0, 0.0f, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.window.c$c  reason: collision with other inner class name */
    public static final class C0317c extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List<a0> f19936c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0317c(List<? extends a0> list) {
            super(1);
            this.f19936c = list;
        }

        public final void a(a0.a aVar) {
            int p10 = C16877v.p(this.f19936c);
            if (p10 >= 0) {
                int i10 = 0;
                while (true) {
                    a0.a.m(aVar, this.f19936c.get(i10), 0, 0, 0.0f, 4, (Object) null);
                    if (i10 != p10) {
                        i10++;
                    } else {
                        return;
                    }
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    public final J i(K k10, List<? extends H> list, long j10) {
        int i10;
        int i11;
        int size = list.size();
        if (size != 0) {
            int i12 = 0;
            if (size != 1) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    arrayList.add(((H) list.get(i13)).i0(j10));
                }
                int p10 = C16877v.p(arrayList);
                if (p10 >= 0) {
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        a0 a0Var = (a0) arrayList.get(i12);
                        i14 = Math.max(i14, a0Var.E0());
                        i15 = Math.max(i15, a0Var.z0());
                        if (i12 == p10) {
                            break;
                        }
                        i12++;
                    }
                    i11 = i14;
                    i10 = i15;
                } else {
                    i11 = 0;
                    i10 = 0;
                }
                return K.v0(k10, i11, i10, (Map) null, new C0317c(arrayList), 4, (Object) null);
            }
            a0 i02 = ((H) list.get(0)).i0(j10);
            return K.v0(k10, i02.E0(), i02.z0(), (Map) null, new b(i02), 4, (Object) null);
        }
        return K.v0(k10, 0, 0, (Map) null, a.f19934c, 4, (Object) null);
    }
}
