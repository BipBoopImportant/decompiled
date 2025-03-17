package j0;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u000eJY\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00102\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\nJ\u000f\u0010\u001f\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 R$\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020!8\u0000@\u0000X\u000e¢\u0006\f\n\u0004\b\t\u0010\"\u0012\u0004\b#\u0010$R\u001c\u0010(\u001a\u00020\u00038\u0000@\u0000X\u000e¢\u0006\f\n\u0004\b\u000b\u0010&\u0012\u0004\b'\u0010$\u0001\u0001)¨\u0006*"}, d2 = {"Lj0/T;", "E", "", "", "initialCapacity", "<init>", "(I)V", "element", "", "a", "(Ljava/lang/Object;)Z", "b", "(Ljava/lang/Object;)I", "c", "()Z", "d", "", "separator", "prefix", "postfix", "limit", "truncated", "Lkotlin/Function1;", "transform", "", "e", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;LnI/l;)Ljava/lang/String;", "hashCode", "()I", "other", "equals", "toString", "()Ljava/lang/String;", "", "[Ljava/lang/Object;", "getContent$annotations", "()V", "content", "I", "get_size$annotations", "_size", "Lj0/L;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class T<E> {

    /* renamed from: a  reason: collision with root package name */
    public Object[] f24557a;

    /* renamed from: b  reason: collision with root package name */
    public int f24558b;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "element", "", "a", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<E, CharSequence> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ T<E> f24559c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(T<E> t10) {
            super(1);
            this.f24559c = t10;
        }

        /* renamed from: a */
        public final CharSequence invoke(E e10) {
            return e10 == this.f24559c ? "(this)" : String.valueOf(e10);
        }
    }

    public /* synthetic */ T(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    public static /* synthetic */ String f(T t10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C17642l lVar, int i11, Object obj) {
        if (obj == null) {
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
            return t10.e(charSequence, charSequence6, charSequence5, i12, charSequence7, lVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final boolean a(E e10) {
        return b(e10) >= 0;
    }

    public final int b(E e10) {
        int i10 = 0;
        if (e10 == null) {
            Object[] objArr = this.f24557a;
            int i11 = this.f24558b;
            while (i10 < i11) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        Object[] objArr2 = this.f24557a;
        int i12 = this.f24558b;
        while (i10 < i12) {
            if (e10.equals(objArr2[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final boolean c() {
        return this.f24558b == 0;
    }

    public final boolean d() {
        return this.f24558b != 0;
    }

    public final String e(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C17642l<? super E, ? extends CharSequence> lVar) {
        C17542s.j(charSequence, "separator");
        C17542s.j(charSequence2, "prefix");
        C17542s.j(charSequence3, "postfix");
        C17542s.j(charSequence4, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence2);
        Object[] objArr = this.f24557a;
        int i11 = this.f24558b;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                sb2.append(charSequence3);
                break;
            }
            Object obj = objArr[i12];
            if (i12 == i10) {
                sb2.append(charSequence4);
                break;
            }
            if (i12 != 0) {
                sb2.append(charSequence);
            }
            if (lVar == null) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) lVar.invoke(obj));
            }
            i12++;
        }
        String sb3 = sb2.toString();
        C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r7 = (j0.T) r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof j0.T
            r1 = 0
            if (r0 == 0) goto L_0x0032
            j0.T r7 = (j0.T) r7
            int r0 = r7.f24558b
            int r2 = r6.f24558b
            if (r0 == r2) goto L_0x000e
            goto L_0x0032
        L_0x000e:
            java.lang.Object[] r0 = r6.f24557a
            java.lang.Object[] r7 = r7.f24557a
            tI.j r2 = tI.C17978n.w(r1, r2)
            int r3 = r2.p()
            int r2 = r2.q()
            if (r3 > r2) goto L_0x0030
        L_0x0020:
            r4 = r0[r3]
            r5 = r7[r3]
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r5)
            if (r4 != 0) goto L_0x002b
            return r1
        L_0x002b:
            if (r3 == r2) goto L_0x0030
            int r3 = r3 + 1
            goto L_0x0020
        L_0x0030:
            r7 = 1
            return r7
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.T.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Object[] objArr = this.f24557a;
        int i10 = this.f24558b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            i11 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i11;
    }

    public String toString() {
        return f(this, (CharSequence) null, "[", "]", 0, (CharSequence) null, new a(this), 25, (Object) null);
    }

    private T(int i10) {
        Object[] objArr;
        if (i10 == 0) {
            objArr = U.f24560a;
        } else {
            objArr = new Object[i10];
        }
        this.f24557a = objArr;
    }
}
