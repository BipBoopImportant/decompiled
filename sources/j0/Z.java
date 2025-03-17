package j0;

import java.util.Collection;
import java.util.Set;
import k0.C5489a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17534j;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import oI.C17693a;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\nB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0007J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJY\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\f2\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u000bJ\u000f\u0010\u001c\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010!\u001a\u00020\u001e8\u0000@\u0000X\u000e¢\u0006\f\n\u0004\b\n\u0010\u001f\u0012\u0004\b \u0010\u0004R$\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\"8\u0000@\u0000X\u000e¢\u0006\f\n\u0004\b#\u0010$\u0012\u0004\b%\u0010\u0004R\u0016\u0010)\u001a\u00020\u00108\u0000@\u0000X\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020\u00108\u0000@\u0000X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u0011\u0010+\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b#\u0010\u0019R\u0011\u0010,\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b'\u0010\u0019\u0001\u0001-¨\u0006."}, d2 = {"Lj0/Z;", "E", "", "<init>", "()V", "", "d", "()Z", "e", "element", "a", "(Ljava/lang/Object;)Z", "", "separator", "prefix", "postfix", "", "limit", "truncated", "Lkotlin/Function1;", "transform", "", "f", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;LnI/l;)Ljava/lang/String;", "hashCode", "()I", "other", "equals", "toString", "()Ljava/lang/String;", "", "[J", "getMetadata$annotations", "metadata", "", "b", "[Ljava/lang/Object;", "getElements$annotations", "elements", "c", "I", "_capacity", "_size", "capacity", "size", "Lj0/O;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Z<E> {

    /* renamed from: a  reason: collision with root package name */
    public long[] f24575a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f24576b;

    /* renamed from: c  reason: collision with root package name */
    public int f24577c;

    /* renamed from: d  reason: collision with root package name */
    public int f24578d;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lj0/Z$a;", "", "<init>", "(Lj0/Z;)V", "", "elements", "", "containsAll", "(Ljava/util/Collection;)Z", "element", "contains", "(Ljava/lang/Object;)Z", "isEmpty", "()Z", "", "a", "()I", "size", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public class a implements Set<E>, C17693a {
        public a() {
        }

        public int a() {
            return Z.this.f24578d;
        }

        public boolean contains(Object obj) {
            return Z.this.a(obj);
        }

        public boolean containsAll(Collection<? extends Object> collection) {
            C17542s.j(collection, "elements");
            Z<E> z10 = Z.this;
            for (Object a10 : collection) {
                if (!z10.a(a10)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return Z.this.d();
        }

        public final /* bridge */ int size() {
            return a();
        }

        public Object[] toArray() {
            return C17534j.a(this);
        }

        public <T> T[] toArray(T[] tArr) {
            C17542s.j(tArr, "array");
            return C17534j.b(this, tArr);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "element", "", "a", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<E, CharSequence> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Z<E> f24580c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Z<E> z10) {
            super(1);
            this.f24580c = z10;
        }

        /* renamed from: a */
        public final CharSequence invoke(E e10) {
            return e10 == this.f24580c ? "(this)" : String.valueOf(e10);
        }
    }

    public /* synthetic */ Z(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ String g(Z z10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C17642l lVar, int i11, Object obj) {
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
            return z10.f(charSequence, charSequence6, charSequence5, i12, charSequence7, lVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006e, code lost:
        if (((r7 & ((~r7) << 6)) & -9187201950435737472L) == 0) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0070, code lost:
        r11 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(E r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto L_0x000c
            int r3 = r18.hashCode()
            goto L_0x000d
        L_0x000c:
            r3 = r2
        L_0x000d:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f24577c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L_0x001c:
            long[] r7 = r0.f24575a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L_0x0048:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L_0x0067
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f24576b
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.C17542s.e(r15, r1)
            if (r15 == 0) goto L_0x0061
            goto L_0x0071
        L_0x0061:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L_0x0048
        L_0x0067:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L_0x0075
            r11 = -1
        L_0x0071:
            if (r11 < 0) goto L_0x0074
            r2 = r12
        L_0x0074:
            return r2
        L_0x0075:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.Z.a(java.lang.Object):boolean");
    }

    public final int b() {
        return this.f24577c;
    }

    public final int c() {
        return this.f24578d;
    }

    public final boolean d() {
        return this.f24578d == 0;
    }

    public final boolean e() {
        return this.f24578d != 0;
    }

    /* JADX WARNING: type inference failed for: r18v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != r0) goto L_0x0008
            return r2
        L_0x0008:
            boolean r3 = r1 instanceof j0.Z
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            j0.Z r1 = (j0.Z) r1
            int r3 = r1.c()
            int r5 = r17.c()
            if (r3 == r5) goto L_0x001b
            return r4
        L_0x001b:
            java.lang.Object[] r3 = r0.f24576b
            long[] r5 = r0.f24575a
            int r6 = r5.length
            int r6 = r6 + -2
            if (r6 < 0) goto L_0x0061
            r7 = r4
        L_0x0025:
            r8 = r5[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L_0x005c
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L_0x003f:
            if (r12 >= r10) goto L_0x005a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L_0x0056
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            boolean r13 = r1.a(r13)
            if (r13 != 0) goto L_0x0056
            return r4
        L_0x0056:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L_0x003f
        L_0x005a:
            if (r10 != r11) goto L_0x0061
        L_0x005c:
            if (r7 == r6) goto L_0x0061
            int r7 = r7 + 1
            goto L_0x0025
        L_0x0061:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.Z.equals(java.lang.Object):boolean");
    }

    public final String f(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C17642l<? super E, ? extends CharSequence> lVar) {
        CharSequence charSequence5 = charSequence;
        CharSequence charSequence6 = charSequence2;
        CharSequence charSequence7 = charSequence3;
        CharSequence charSequence8 = charSequence4;
        C17642l<? super E, ? extends CharSequence> lVar2 = lVar;
        C17542s.j(charSequence5, "separator");
        C17542s.j(charSequence6, "prefix");
        C17542s.j(charSequence7, "postfix");
        C17542s.j(charSequence8, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence6);
        Object[] objArr = this.f24576b;
        long[] jArr = this.f24575a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            loop0:
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i11 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j10 & 255) < 128) {
                            Object obj = objArr[(i11 << 3) + i15];
                            if (i12 == i10) {
                                sb2.append(charSequence8);
                                break loop0;
                            }
                            if (i12 != 0) {
                                sb2.append(charSequence5);
                            }
                            if (lVar2 == null) {
                                sb2.append(obj);
                            } else {
                                sb2.append((CharSequence) lVar2.invoke(obj));
                            }
                            i12++;
                            i13 = 8;
                        } else {
                            int i16 = i10;
                        }
                        j10 >>= i13;
                        i15++;
                    }
                    int i17 = i10;
                    if (i14 != i13) {
                        break;
                    }
                } else {
                    int i18 = i10;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        sb2.append(charSequence7);
        String sb3 = sb2.toString();
        C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public int hashCode() {
        Object[] objArr = this.f24576b;
        long[] jArr = this.f24575a;
        int length = jArr.length - 2;
        int i10 = 0;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j10) < 128) {
                            Object obj = objArr[(i11 << 3) + i14];
                            i12 += obj != null ? obj.hashCode() : 0;
                        }
                        j10 >>= 8;
                    }
                    if (i13 != 8) {
                        return i12;
                    }
                }
                if (i11 == length) {
                    i10 = i12;
                    break;
                }
                i11++;
            }
        }
        return i10;
    }

    public String toString() {
        return g(this, (CharSequence) null, "[", "]", 0, (CharSequence) null, new b(this), 25, (Object) null);
    }

    private Z() {
        this.f24575a = Y.f24573a;
        this.f24576b = C5489a.f24992c;
    }
}
