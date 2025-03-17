package GJ;

import HJ.C15854t;
import YH.C16877v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import oI.C17693a;

@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a(\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001aF\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\n\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a%\u0010\u0010\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0012\u0010\u000f\u001a+\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015\u001a7\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0004\b\u0017\u0010\u0018\u001a7\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0004\b\u0019\u0010\u0018\u001a)\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u001a*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a+\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u0015\u001a7\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0004\b\u001e\u0010\u0018\u001a7\u0010\"\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010 *\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u001f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010!\u001a\u00028\u0001¢\u0006\u0004\b\"\u0010#\u001a#\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b%\u0010&\u001a#\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b(\u0010&\u001aC\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010)\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00010\n¢\u0006\u0004\b*\u0010\u0018\u001a=\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n¢\u0006\u0004\b+\u0010\u0018\u001aC\u0010\u0000\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0012*\u00020\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\n¢\u0006\u0004\b\u0000\u0010\u0018\u001a\u001d\u0010 \u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b \u0010,\u001a.\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b-\u0010.\u001a4\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/H\u0002¢\u0006\u0004\b1\u00102\u001a4\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002¢\u0006\u0004\b3\u00104\u001a}\u0010?\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u00107*\u000605j\u0002`6*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u00108\u001a\u00028\u00012\b\b\u0002\u0010:\u001a\u0002092\b\b\u0002\u0010;\u001a\u0002092\b\b\u0002\u0010<\u001a\u0002092\b\b\u0002\u0010=\u001a\u00020\u00062\b\b\u0002\u0010>\u001a\u0002092\u0016\b\u0002\u0010)\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u000209\u0018\u00010\n¢\u0006\u0004\b?\u0010@\u001ag\u0010B\u001a\u00020A\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010:\u001a\u0002092\b\b\u0002\u0010;\u001a\u0002092\b\b\u0002\u0010<\u001a\u0002092\b\b\u0002\u0010=\u001a\u00020\u00062\b\b\u0002\u0010>\u001a\u0002092\u0016\b\u0002\u0010)\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u000209\u0018\u00010\n¢\u0006\u0004\bB\u0010C\u001a#\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000/\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b7\u0010D¨\u0006E"}, d2 = {"T", "LGJ/h;", "element", "", "B", "(LGJ/h;Ljava/lang/Object;)Z", "", "index", "E", "(LGJ/h;I)Ljava/lang/Object;", "Lkotlin/Function1;", "defaultValue", "G", "(LGJ/h;ILnI/l;)Ljava/lang/Object;", "L", "(LGJ/h;)Ljava/lang/Object;", "N", "(LGJ/h;Ljava/lang/Object;)I", "R", "n", "D", "(LGJ/h;I)LGJ/h;", "predicate", "H", "(LGJ/h;LnI/l;)LGJ/h;", "I", "", "J", "(LGJ/h;)LGJ/h;", "X", "Y", "", "C", "destination", "Z", "(LGJ/h;Ljava/util/Collection;)Ljava/util/Collection;", "", "a0", "(LGJ/h;)Ljava/util/List;", "", "b0", "transform", "M", "S", "(LGJ/h;)I", "W", "(LGJ/h;Ljava/lang/Object;)LGJ/h;", "", "elements", "V", "(LGJ/h;Ljava/lang/Iterable;)LGJ/h;", "U", "(LGJ/h;LGJ/h;)LGJ/h;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "O", "(LGJ/h;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;LnI/l;)Ljava/lang/Appendable;", "", "P", "(LGJ/h;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;LnI/l;)Ljava/lang/String;", "(LGJ/h;)Ljava/lang/Iterable;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
class w extends t {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"GJ/w$a", "", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Iterable<T>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15765h f134761a;

        public a(C15765h hVar) {
            this.f134761a = hVar;
        }

        public Iterator<T> iterator() {
            return this.f134761a.iterator();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b extends C17540p implements C17642l<C15765h<? extends R>, Iterator<? extends R>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f134762a = new b();

        b() {
            super(1, C15765h.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        /* renamed from: t */
        public final Iterator<R> invoke(C15765h<? extends R> hVar) {
            C17542s.j(hVar, "p0");
            return hVar.iterator();
        }
    }

    public static <T> Iterable<T> A(C15765h<? extends T> hVar) {
        C17542s.j(hVar, "<this>");
        return new a(hVar);
    }

    public static <T> boolean B(C15765h<? extends T> hVar, T t10) {
        C17542s.j(hVar, "<this>");
        return N(hVar, t10) >= 0;
    }

    public static <T> int C(C15765h<? extends T> hVar) {
        C17542s.j(hVar, "<this>");
        Iterator<? extends T> it = hVar.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                C16877v.w();
            }
        }
        return i10;
    }

    public static <T> C15765h<T> D(C15765h<? extends T> hVar, int i10) {
        C17542s.j(hVar, "<this>");
        if (i10 >= 0) {
            return i10 == 0 ? hVar : hVar instanceof C15760c ? ((C15760c) hVar).a(i10) : new C15759b(hVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static <T> T E(C15765h<? extends T> hVar, int i10) {
        C17542s.j(hVar, "<this>");
        return G(hVar, i10, new u(i10));
    }

    /* access modifiers changed from: private */
    public static final Object F(int i10, int i11) {
        throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + i10 + '.');
    }

    public static final <T> T G(C15765h<? extends T> hVar, int i10, C17642l<? super Integer, ? extends T> lVar) {
        C17542s.j(hVar, "<this>");
        C17542s.j(lVar, "defaultValue");
        if (i10 < 0) {
            return lVar.invoke(Integer.valueOf(i10));
        }
        int i11 = 0;
        for (T next : hVar) {
            int i12 = i11 + 1;
            if (i10 == i11) {
                return next;
            }
            i11 = i12;
        }
        return lVar.invoke(Integer.valueOf(i10));
    }

    public static <T> C15765h<T> H(C15765h<? extends T> hVar, C17642l<? super T, Boolean> lVar) {
        C17542s.j(hVar, "<this>");
        C17542s.j(lVar, "predicate");
        return new C15762e(hVar, true, lVar);
    }

    public static <T> C15765h<T> I(C15765h<? extends T> hVar, C17642l<? super T, Boolean> lVar) {
        C17542s.j(hVar, "<this>");
        C17542s.j(lVar, "predicate");
        return new C15762e(hVar, false, lVar);
    }

    public static <T> C15765h<T> J(C15765h<? extends T> hVar) {
        C17542s.j(hVar, "<this>");
        C15765h<T> I10 = C15768k.I(hVar, new v());
        C17542s.h(I10, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return I10;
    }

    /* access modifiers changed from: private */
    public static final boolean K(Object obj) {
        return obj == null;
    }

    public static <T> T L(C15765h<? extends T> hVar) {
        C17542s.j(hVar, "<this>");
        Iterator<? extends T> it = hVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static <T, R> C15765h<R> M(C15765h<? extends T> hVar, C17642l<? super T, ? extends C15765h<? extends R>> lVar) {
        C17542s.j(hVar, "<this>");
        C17542s.j(lVar, "transform");
        return new C15763f(hVar, lVar, b.f134762a);
    }

    public static final <T> int N(C15765h<? extends T> hVar, T t10) {
        C17542s.j(hVar, "<this>");
        int i10 = 0;
        for (Object next : hVar) {
            if (i10 < 0) {
                C16877v.x();
            }
            if (C17542s.e(t10, next)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final <T, A extends Appendable> A O(C15765h<? extends T> hVar, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C17642l<? super T, ? extends CharSequence> lVar) {
        C17542s.j(hVar, "<this>");
        C17542s.j(a10, "buffer");
        C17542s.j(charSequence, "separator");
        C17542s.j(charSequence2, "prefix");
        C17542s.j(charSequence3, "postfix");
        C17542s.j(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (Object next : hVar) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            C15854t.a(a10, next, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static final <T> String P(C15765h<? extends T> hVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C17642l<? super T, ? extends CharSequence> lVar) {
        C17542s.j(hVar, "<this>");
        C17542s.j(charSequence, "separator");
        C17542s.j(charSequence2, "prefix");
        C17542s.j(charSequence3, "postfix");
        C17542s.j(charSequence4, "truncated");
        return ((StringBuilder) O(hVar, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
    }

    public static /* synthetic */ String Q(C15765h hVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C17642l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return P(hVar, charSequence, charSequence6, charSequence5, i12, charSequence7, lVar);
    }

    public static <T> T R(C15765h<? extends T> hVar) {
        C17542s.j(hVar, "<this>");
        Iterator<? extends T> it = hVar.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static <T, R> C15765h<R> S(C15765h<? extends T> hVar, C17642l<? super T, ? extends R> lVar) {
        C17542s.j(hVar, "<this>");
        C17542s.j(lVar, "transform");
        return new C15757A(hVar, lVar);
    }

    public static <T, R> C15765h<R> T(C15765h<? extends T> hVar, C17642l<? super T, ? extends R> lVar) {
        C17542s.j(hVar, "<this>");
        C17542s.j(lVar, "transform");
        return C15768k.J(new C15757A(hVar, lVar));
    }

    public static <T> C15765h<T> U(C15765h<? extends T> hVar, C15765h<? extends T> hVar2) {
        C17542s.j(hVar, "<this>");
        C17542s.j(hVar2, "elements");
        return C15768k.k(C15768k.v(hVar, hVar2));
    }

    public static <T> C15765h<T> V(C15765h<? extends T> hVar, Iterable<? extends T> iterable) {
        C17542s.j(hVar, "<this>");
        C17542s.j(iterable, "elements");
        return C15768k.k(C15768k.v(hVar, C16877v.h0(iterable)));
    }

    public static <T> C15765h<T> W(C15765h<? extends T> hVar, T t10) {
        C17542s.j(hVar, "<this>");
        return C15768k.k(C15768k.v(hVar, C15768k.v(t10)));
    }

    public static <T> C15765h<T> X(C15765h<? extends T> hVar, int i10) {
        C17542s.j(hVar, "<this>");
        if (i10 >= 0) {
            return i10 == 0 ? C15768k.j() : hVar instanceof C15760c ? ((C15760c) hVar).b(i10) : new y(hVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static <T> C15765h<T> Y(C15765h<? extends T> hVar, C17642l<? super T, Boolean> lVar) {
        C17542s.j(hVar, "<this>");
        C17542s.j(lVar, "predicate");
        return new z(hVar, lVar);
    }

    public static final <T, C extends Collection<? super T>> C Z(C15765h<? extends T> hVar, C c10) {
        C17542s.j(hVar, "<this>");
        C17542s.j(c10, "destination");
        for (Object add : hVar) {
            c10.add(add);
        }
        return c10;
    }

    public static <T> List<T> a0(C15765h<? extends T> hVar) {
        C17542s.j(hVar, "<this>");
        Iterator<? extends T> it = hVar.iterator();
        if (!it.hasNext()) {
            return C16877v.n();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return C16877v.e(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static <T> List<T> b0(C15765h<? extends T> hVar) {
        C17542s.j(hVar, "<this>");
        return (List) Z(hVar, new ArrayList());
    }
}
