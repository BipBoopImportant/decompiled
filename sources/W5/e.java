package w5;

import XH.C16807N;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import w5.c;
import y5.C8979b;
import y5.C8980c;
import y5.C8981d;
import y5.C8982e;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BS\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014\"\u0004\b\u0001\u0010\u00132\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00140\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010&R\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010&¨\u0006'"}, d2 = {"Lw5/e;", "", "RowType", "Lw5/c;", "", "identifier", "", "", "queryKeys", "Ly5/d;", "driver", "fileName", "label", "query", "Lkotlin/Function1;", "Ly5/c;", "mapper", "<init>", "(I[Ljava/lang/String;Ly5/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LnI/l;)V", "R", "Ly5/b;", "a", "(LnI/l;)Ly5/b;", "toString", "()Ljava/lang/String;", "Lw5/c$a;", "listener", "LXH/N;", "f", "(Lw5/c$a;)V", "g", "b", "I", "c", "[Ljava/lang/String;", "d", "Ly5/d;", "e", "Ljava/lang/String;", "runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class e<RowType> extends c<RowType> {

    /* renamed from: b  reason: collision with root package name */
    private final int f57189b;

    /* renamed from: c  reason: collision with root package name */
    private final String[] f57190c;

    /* renamed from: d  reason: collision with root package name */
    private final C8981d f57191d;

    /* renamed from: e  reason: collision with root package name */
    private final String f57192e;

    /* renamed from: f  reason: collision with root package name */
    private final String f57193f;

    /* renamed from: g  reason: collision with root package name */
    private final String f57194g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(int i10, String[] strArr, C8981d dVar, String str, String str2, String str3, C17642l<? super C8980c, ? extends RowType> lVar) {
        super(lVar);
        C17542s.j(strArr, "queryKeys");
        C17542s.j(dVar, "driver");
        C17542s.j(str, "fileName");
        C17542s.j(str2, "label");
        C17542s.j(str3, "query");
        C17542s.j(lVar, "mapper");
        this.f57189b = i10;
        this.f57190c = strArr;
        this.f57191d = dVar;
        this.f57192e = str;
        this.f57193f = str2;
        this.f57194g = str3;
    }

    public <R> C8979b<R> a(C17642l<? super C8980c, ? extends C8979b<R>> lVar) {
        C17542s.j(lVar, "mapper");
        return this.f57191d.H0(Integer.valueOf(this.f57189b), this.f57194g, lVar, 0, (C17642l<? super C8982e, C16807N>) null);
    }

    public void f(c.a aVar) {
        C17542s.j(aVar, "listener");
        C8981d dVar = this.f57191d;
        String[] strArr = this.f57190c;
        dVar.A2((String[]) Arrays.copyOf(strArr, strArr.length), aVar);
    }

    public void g(c.a aVar) {
        C17542s.j(aVar, "listener");
        C8981d dVar = this.f57191d;
        String[] strArr = this.f57190c;
        dVar.j3((String[]) Arrays.copyOf(strArr, strArr.length), aVar);
    }

    public String toString() {
        return this.f57192e + ':' + this.f57193f;
    }
}
