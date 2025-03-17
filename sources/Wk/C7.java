package wK;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\nBO\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000e\u0010\rR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"LwK/C7;", "", "Lkotlin/Function1;", "", "LXH/N;", "onDecrease", "onIncrease", "onInputValueChange", "<init>", "(LnI/l;LnI/l;LnI/l;)V", "a", "LnI/l;", "b", "()LnI/l;", "c", "d", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C7 {

    /* renamed from: d  reason: collision with root package name */
    public static final a f149350d = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final C7 f149351e = new C7((C17642l) null, (C17642l) null, (C17642l) null, 7, (DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C17642l<Integer, C16807N> f149352a;

    /* renamed from: b  reason: collision with root package name */
    private final C17642l<Integer, C16807N> f149353b;

    /* renamed from: c  reason: collision with root package name */
    private final C17642l<Integer, C16807N> f149354c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"LwK/C7$a;", "", "<init>", "()V", "LwK/C7;", "Default", "LwK/C7;", "a", "()LwK/C7;", "getDefault$annotations", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7 a() {
            return C7.f149351e;
        }

        private a() {
        }
    }

    public C7(C17642l<? super Integer, C16807N> lVar, C17642l<? super Integer, C16807N> lVar2, C17642l<? super Integer, C16807N> lVar3) {
        this.f149352a = lVar;
        this.f149353b = lVar2;
        this.f149354c = lVar3;
    }

    public final C17642l<Integer, C16807N> b() {
        return this.f149352a;
    }

    public final C17642l<Integer, C16807N> c() {
        return this.f149353b;
    }

    public final C17642l<Integer, C16807N> d() {
        return this.f149354c;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7(C17642l lVar, C17642l lVar2, C17642l lVar3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : lVar, (i10 & 2) != 0 ? null : lVar2, (i10 & 4) != 0 ? null : lVar3);
    }
}
