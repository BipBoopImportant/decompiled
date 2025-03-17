package j0;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\bJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJA\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u000fJ\u001a\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010#\u001a\u00020\u001f8\u0000@\u0000X\u000e¢\u0006\f\n\u0004\b\u0007\u0010 \u0012\u0004\b!\u0010\"R\u001c\u0010'\u001a\u00020\u00028\u0000@\u0000X\u000e¢\u0006\f\n\u0004\b$\u0010%\u0012\u0004\b&\u0010\"R\u0011\u0010(\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b$\u0010\u000f\u0001\u0001)¨\u0006*"}, d2 = {"Lj0/m;", "", "", "initialCapacity", "<init>", "(I)V", "index", "a", "(I)I", "element", "c", "", "d", "()Z", "g", "()I", "", "separator", "prefix", "postfix", "limit", "truncated", "", "e", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "", "[I", "getContent$annotations", "()V", "content", "b", "I", "get_size$annotations", "_size", "size", "Lj0/D;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: j0.m  reason: case insensitive filesystem */
public abstract class C5457m {

    /* renamed from: a  reason: collision with root package name */
    public int[] f24630a;

    /* renamed from: b  reason: collision with root package name */
    public int f24631b;

    public /* synthetic */ C5457m(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    public static /* synthetic */ String f(C5457m mVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
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
            return mVar.e(charSequence, charSequence6, charSequence5, i12, charSequence4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final int a(int i10) {
        if (i10 >= 0 && i10 < this.f24631b) {
            return this.f24630a[i10];
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Index ");
        sb2.append(i10);
        sb2.append(" must be in 0..");
        sb2.append(this.f24631b - 1);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public final int b() {
        return this.f24631b;
    }

    public final int c(int i10) {
        int[] iArr = this.f24630a;
        int i11 = this.f24631b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i10 == iArr[i12]) {
                return i12;
            }
        }
        return -1;
    }

    public final boolean d() {
        return this.f24631b == 0;
    }

    public final String e(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4) {
        C17542s.j(charSequence, "separator");
        C17542s.j(charSequence2, "prefix");
        C17542s.j(charSequence3, "postfix");
        C17542s.j(charSequence4, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence2);
        int[] iArr = this.f24630a;
        int i11 = this.f24631b;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                sb2.append(charSequence3);
                break;
            }
            int i13 = iArr[i12];
            if (i12 == i10) {
                sb2.append(charSequence4);
                break;
            }
            if (i12 != 0) {
                sb2.append(charSequence);
            }
            sb2.append(i13);
            i12++;
        }
        String sb3 = sb2.toString();
        C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r7 = (j0.C5457m) r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof j0.C5457m
            r1 = 0
            if (r0 == 0) goto L_0x002e
            j0.m r7 = (j0.C5457m) r7
            int r0 = r7.f24631b
            int r2 = r6.f24631b
            if (r0 == r2) goto L_0x000e
            goto L_0x002e
        L_0x000e:
            int[] r0 = r6.f24630a
            int[] r7 = r7.f24630a
            tI.j r2 = tI.C17978n.w(r1, r2)
            int r3 = r2.p()
            int r2 = r2.q()
            if (r3 > r2) goto L_0x002c
        L_0x0020:
            r4 = r0[r3]
            r5 = r7[r3]
            if (r4 == r5) goto L_0x0027
            return r1
        L_0x0027:
            if (r3 == r2) goto L_0x002c
            int r3 = r3 + 1
            goto L_0x0020
        L_0x002c:
            r7 = 1
            return r7
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.C5457m.equals(java.lang.Object):boolean");
    }

    public final int g() {
        if (!d()) {
            return this.f24630a[this.f24631b - 1];
        }
        throw new NoSuchElementException("IntList is empty.");
    }

    public int hashCode() {
        int[] iArr = this.f24630a;
        int i10 = this.f24631b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += Integer.hashCode(iArr[i12]) * 31;
        }
        return i11;
    }

    public String toString() {
        return f(this, (CharSequence) null, "[", "]", 0, (CharSequence) null, 25, (Object) null);
    }

    private C5457m(int i10) {
        int[] iArr;
        if (i10 == 0) {
            iArr = r.a();
        } else {
            iArr = new int[i10];
        }
        this.f24630a = iArr;
    }
}
