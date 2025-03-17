package B0;

import TJ.C16533h;
import U0.C4877g1;
import U0.C4894o0;
import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import j0.L;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C5812d;
import r0.C5813e;
import r0.g;
import r0.h;
import r0.j;
import r0.k;
import r0.o;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002XD¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002XD¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8\u0002XD¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017¨\u0006\u001d"}, d2 = {"LB0/C;", "", "<init>", "()V", "Lr0/k;", "interactionSource", "LXH/N;", "e", "(Lr0/k;LdI/e;)Ljava/lang/Object;", "", "a", "I", "Focused", "b", "Hovered", "c", "Pressed", "LU0/o0;", "d", "LU0/o0;", "interactionState", "", "f", "()Z", "isFocused", "g", "isHovered", "h", "isPressed", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class C {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final int f4517a = 1;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final int f4518b = 2;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final int f4519c = 4;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C4894o0 f4520d = C4877g1.a(0);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr0/j;", "interaction", "LXH/N;", "c", "(Lr0/j;LdI/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class a<T> implements C16533h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ L<j> f4521a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C f4522b;

        a(L<j> l10, C c10) {
            this.f4521a = l10;
            this.f4522b = c10;
        }

        /* renamed from: c */
        public final Object emit(j jVar, C17164e<? super C16807N> eVar) {
            int d10;
            boolean z10 = true;
            if (!(jVar instanceof g ? true : jVar instanceof C5812d)) {
                z10 = jVar instanceof o.b;
            }
            if (z10) {
                this.f4521a.g(jVar);
            } else if (jVar instanceof h) {
                this.f4521a.j(((h) jVar).a());
            } else if (jVar instanceof C5813e) {
                this.f4521a.j(((C5813e) jVar).a());
            } else if (jVar instanceof o.c) {
                this.f4521a.j(((o.c) jVar).a());
            } else if (jVar instanceof o.a) {
                this.f4521a.j(((o.a) jVar).a());
            }
            L<j> l10 = this.f4521a;
            C c10 = this.f4522b;
            Object[] objArr = l10.f24557a;
            int i10 = l10.f24558b;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                j jVar2 = (j) objArr[i12];
                if (jVar2 instanceof g) {
                    d10 = c10.f4518b;
                } else if (jVar2 instanceof C5812d) {
                    d10 = c10.f4517a;
                } else if (jVar2 instanceof o.b) {
                    d10 = c10.f4519c;
                }
                i11 |= d10;
            }
            this.f4522b.f4520d.g(i11);
            return C16807N.f139792a;
        }
    }

    public final Object e(k kVar, C17164e<? super C16807N> eVar) {
        Object collect = kVar.c().collect(new a(new L(0, 1, (DefaultConstructorMarker) null), this), eVar);
        return collect == C17187b.f() ? collect : C16807N.f139792a;
    }

    public final boolean f() {
        return (this.f4520d.e() & this.f4517a) != 0;
    }

    public final boolean g() {
        return (this.f4520d.e() & this.f4518b) != 0;
    }

    public final boolean h() {
        return (this.f4520d.e() & this.f4519c) != 0;
    }
}
