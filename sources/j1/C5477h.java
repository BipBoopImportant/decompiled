package j1;

import XH.C16807N;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import o1.C5669i;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u000bJ\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR$\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R%\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001e"}, d2 = {"Lj1/h;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "Lj1/j;", "a", "Ljava/util/List;", "()Ljava/util/List;", "autofillTypes", "Lo1/i;", "b", "Lo1/i;", "()Lo1/i;", "setBoundingBox", "(Lo1/i;)V", "boundingBox", "Lkotlin/Function1;", "", "LXH/N;", "c", "LnI/l;", "()LnI/l;", "onFill", "d", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: j1.h  reason: case insensitive filesystem */
public final class C5477h {

    /* renamed from: d  reason: collision with root package name */
    public static final a f24675d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f24676e = 8;

    /* renamed from: a  reason: collision with root package name */
    private final List<C5479j> f24677a;

    /* renamed from: b  reason: collision with root package name */
    private C5669i f24678b;

    /* renamed from: c  reason: collision with root package name */
    private final C17642l<String, C16807N> f24679c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lj1/h$a;", "", "<init>", "()V", "", "previousId", "I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: j1.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final List<C5479j> a() {
        return this.f24677a;
    }

    public final C5669i b() {
        return this.f24678b;
    }

    public final C17642l<String, C16807N> c() {
        return this.f24679c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5477h)) {
            return false;
        }
        C5477h hVar = (C5477h) obj;
        return C17542s.e(this.f24677a, hVar.f24677a) && C17542s.e(this.f24678b, hVar.f24678b) && this.f24679c == hVar.f24679c;
    }

    public int hashCode() {
        int hashCode = this.f24677a.hashCode() * 31;
        C5669i iVar = this.f24678b;
        int i10 = 0;
        int hashCode2 = (hashCode + (iVar != null ? iVar.hashCode() : 0)) * 31;
        C17642l<String, C16807N> lVar = this.f24679c;
        if (lVar != null) {
            i10 = lVar.hashCode();
        }
        return hashCode2 + i10;
    }
}
