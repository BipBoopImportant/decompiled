package w5;

import XH.C16807N;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import y5.C8981d;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u001e\u0010\u000b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0004\u0012\u00020\n0\bH\u0004¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Lw5/a;", "", "Ly5/d;", "driver", "<init>", "(Ly5/d;)V", "", "identifier", "Lkotlin/Function1;", "", "LXH/N;", "tableProvider", "c", "(ILnI/l;)V", "b", "Ly5/d;", "()Ly5/d;", "runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: w5.a  reason: case insensitive filesystem */
public abstract class C8916a {

    /* renamed from: b  reason: collision with root package name */
    private final C8981d f57183b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w5.a$a  reason: collision with other inner class name */
    static final class C0919a extends C17544u implements C17642l<String, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f57184c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0919a(f fVar) {
            super(1);
            this.f57184c = fVar;
        }

        public final void a(String str) {
            C17542s.j(str, "it");
            this.f57184c.a().add(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w5.a$b */
    static final class b extends C17544u implements C17642l<String, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Set<String> f57185c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Set<String> set) {
            super(1);
            this.f57185c = set;
        }

        public final void a(String str) {
            C17542s.j(str, "it");
            this.f57185c.add(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return C16807N.f139792a;
        }
    }

    public C8916a(C8981d dVar) {
        C17542s.j(dVar, "driver");
        this.f57183b = dVar;
    }

    /* access modifiers changed from: protected */
    public final C8981d b() {
        return this.f57183b;
    }

    /* access modifiers changed from: protected */
    public final void c(int i10, C17642l<? super C17642l<? super String, C16807N>, C16807N> lVar) {
        C17542s.j(lVar, "tableProvider");
        f X12 = this.f57183b.X1();
        if (X12 == null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            lVar.invoke(new b(linkedHashSet));
            C8981d dVar = this.f57183b;
            String[] strArr = (String[]) linkedHashSet.toArray(new String[0]);
            dVar.k2((String[]) Arrays.copyOf(strArr, strArr.length));
        } else if (X12.b().add(Integer.valueOf(i10))) {
            lVar.invoke(new C0919a(X12));
        }
    }
}
