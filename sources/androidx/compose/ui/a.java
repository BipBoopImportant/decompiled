package androidx.compose.ui;

import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00018\u0000X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001f\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/compose/ui/a;", "Landroidx/compose/ui/d;", "outer", "inner", "<init>", "(Landroidx/compose/ui/d;Landroidx/compose/ui/d;)V", "R", "initial", "Lkotlin/Function2;", "Landroidx/compose/ui/d$b;", "operation", "e", "(Ljava/lang/Object;LnI/p;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "predicate", "d", "(LnI/l;)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/d;", "b", "()Landroidx/compose/ui/d;", "a", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements d {

    /* renamed from: d  reason: collision with root package name */
    private final d f18743d;

    /* renamed from: e  reason: collision with root package name */
    private final d f18744e;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "acc", "Landroidx/compose/ui/d$b;", "element", "a", "(Ljava/lang/String;Landroidx/compose/ui/d$b;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.a$a  reason: collision with other inner class name */
    static final class C0289a extends C17544u implements p<String, d.b, String> {

        /* renamed from: c  reason: collision with root package name */
        public static final C0289a f18745c = new C0289a();

        C0289a() {
            super(2);
        }

        /* renamed from: a */
        public final String invoke(String str, d.b bVar) {
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public a(d dVar, d dVar2) {
        this.f18743d = dVar;
        this.f18744e = dVar2;
    }

    public final d a() {
        return this.f18744e;
    }

    public final d b() {
        return this.f18743d;
    }

    public boolean d(C17642l<? super d.b, Boolean> lVar) {
        return this.f18743d.d(lVar) && this.f18744e.d(lVar);
    }

    public <R> R e(R r10, p<? super R, ? super d.b, ? extends R> pVar) {
        return this.f18744e.e(this.f18743d.e(r10, pVar), pVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return C17542s.e(this.f18743d, aVar.f18743d) && C17542s.e(this.f18744e, aVar.f18744e);
        }
    }

    public int hashCode() {
        return this.f18743d.hashCode() + (this.f18744e.hashCode() * 31);
    }

    public String toString() {
        return '[' + ((String) e("", C0289a.f18745c)) + ']';
    }
}
