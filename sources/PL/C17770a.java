package pL;

import YH.C16877v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import uI.C18055d;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0002¢\u0006\u0004\b\r\u0010\fJ#\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R(\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0000X\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0015\u0012\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\"\u001a\u00020\u001c8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0019\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010#8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0017¨\u0006&"}, d2 = {"LpL/a;", "", "", "_values", "", "useIndexedValues", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;)V", "T", "LuI/d;", "clazz", "a", "(LuI/d;)Ljava/lang/Object;", "b", "c", "LXH/N;", "e", "()V", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "get_values", "()Ljava/util/List;", "get_values$annotations", "Ljava/lang/Boolean;", "getUseIndexedValues", "()Ljava/lang/Boolean;", "", "I", "getIndex", "()I", "setIndex", "(I)V", "index", "", "d", "values", "koin-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pL.a  reason: case insensitive filesystem */
public class C17770a {

    /* renamed from: a  reason: collision with root package name */
    private final List<Object> f146391a;

    /* renamed from: b  reason: collision with root package name */
    private final Boolean f146392b;

    /* renamed from: c  reason: collision with root package name */
    private int f146393c;

    public C17770a() {
        this((List) null, (Boolean) null, 3, (DefaultConstructorMarker) null);
    }

    private final <T> T a(C18055d<?> dVar) {
        T t10;
        Iterator it = this.f146391a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            if (dVar.s(t10)) {
                break;
            }
        }
        if (t10 != null) {
            return t10;
        }
        return null;
    }

    private final <T> T b(C18055d<?> dVar) {
        T t10 = this.f146391a.get(this.f146393c);
        T t11 = null;
        if (!dVar.s(t10)) {
            t10 = null;
        }
        if (t10 != null) {
            t11 = t10;
        }
        if (t11 != null) {
            e();
        }
        return t11;
    }

    public <T> T c(C18055d<?> dVar) {
        C17542s.j(dVar, "clazz");
        if (this.f146391a.isEmpty()) {
            return null;
        }
        Boolean bool = this.f146392b;
        if (bool != null) {
            return C17542s.e(bool, Boolean.TRUE) ? b(dVar) : a(dVar);
        }
        T b10 = b(dVar);
        return b10 == null ? a(dVar) : b10;
    }

    public final List<Object> d() {
        return this.f146391a;
    }

    public final void e() {
        if (this.f146393c < C16877v.p(this.f146391a)) {
            this.f146393c++;
        }
    }

    public String toString() {
        return "DefinitionParameters" + C16877v.t1(this.f146391a);
    }

    public C17770a(List<Object> list, Boolean bool) {
        C17542s.j(list, "_values");
        this.f146391a = list;
        this.f146392b = bool;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17770a(List list, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new ArrayList() : list, (i10 & 2) != 0 ? null : bool);
    }
}
