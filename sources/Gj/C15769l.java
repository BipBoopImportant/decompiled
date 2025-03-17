package GJ;

import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001aG\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0007¢\u0006\u0004\b\b\u0010\t\u001aG\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0007¢\u0006\u0004\b\u000b\u0010\f*\f\b\u0002\u0010\u000e\"\u00020\r2\u00020\r¨\u0006\u000f"}, d2 = {"T", "Lkotlin/Function2;", "LGJ/j;", "LdI/e;", "LXH/N;", "", "block", "LGJ/h;", "b", "(LnI/p;)LGJ/h;", "", "a", "(LnI/p;)Ljava/util/Iterator;", "", "State", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
/* renamed from: GJ.l  reason: case insensitive filesystem */
class C15769l {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"GJ/l$a", "LGJ/h;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: GJ.l$a */
    public static final class a implements C15765h<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f134751a;

        public a(p pVar) {
            this.f134751a = pVar;
        }

        public Iterator<T> iterator() {
            return C15768k.a(this.f134751a);
        }
    }

    public static <T> Iterator<T> a(p<? super C15767j<? super T>, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
        C17542s.j(pVar, "block");
        C15766i iVar = new C15766i();
        iVar.m(C17187b.a(pVar, iVar, iVar));
        return iVar;
    }

    public static <T> C15765h<T> b(p<? super C15767j<? super T>, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
        C17542s.j(pVar, "block");
        return new a(pVar);
    }
}
