package WK;

import YH.C16860d;
import YH.C16870n;
import YH.C16877v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0017B!\b\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00058\u0000X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"LWK/C;", "LYH/d;", "LWK/h;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "byteStrings", "", "trie", "<init>", "([LWK/h;[I)V", "", "index", "m", "(I)LWK/h;", "b", "[LWK/h;", "p", "()[LWK/h;", "c", "[I", "q", "()[I", "a", "()I", "size", "d", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WK.C  reason: case insensitive filesystem */
public final class C16760C extends C16860d<C16773h> implements RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    public static final a f139587d = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private final C16773h[] f139588b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f139589c;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u00020\u00142\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0013\"\u00020\u000bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u00020\u0004*\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"LWK/C$a;", "", "<init>", "()V", "", "nodeOffset", "LWK/e;", "node", "", "byteStringOffset", "", "LWK/h;", "byteStrings", "fromIndex", "toIndex", "indexes", "LXH/N;", "a", "(JLWK/e;ILjava/util/List;IILjava/util/List;)V", "", "LWK/C;", "d", "([LWK/h;)LWK/C;", "c", "(LWK/e;)J", "intCount", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: WK.C$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(long j10, C16770e eVar, int i10, List<? extends C16773h> list, int i11, int i12, List<Integer> list2) {
            int i13;
            int i14;
            int i15;
            int i16;
            C16770e eVar2;
            C16770e eVar3 = eVar;
            int i17 = i10;
            List<? extends C16773h> list3 = list;
            int i18 = i11;
            int i19 = i12;
            List<Integer> list4 = list2;
            if (i18 < i19) {
                int i20 = i18;
                while (i20 < i19) {
                    if (((C16773h) list3.get(i20)).W() >= i17) {
                        i20++;
                    } else {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                }
                C16773h hVar = (C16773h) list.get(i11);
                C16773h hVar2 = (C16773h) list3.get(i19 - 1);
                int i21 = -1;
                if (i17 == hVar.W()) {
                    int intValue = list4.get(i18).intValue();
                    int i22 = i18 + 1;
                    i13 = i22;
                    i14 = intValue;
                    hVar = (C16773h) list3.get(i22);
                } else {
                    i13 = i18;
                    i14 = -1;
                }
                if (hVar.B(i17) != hVar2.B(i17)) {
                    int i23 = 1;
                    for (int i24 = i13 + 1; i24 < i19; i24++) {
                        if (((C16773h) list3.get(i24 - 1)).B(i17) != ((C16773h) list3.get(i24)).B(i17)) {
                            i23++;
                        }
                    }
                    long c10 = j10 + c(eVar3) + ((long) 2) + ((long) (i23 * 2));
                    eVar3.d0(i23);
                    eVar3.d0(i14);
                    for (int i25 = i13; i25 < i19; i25++) {
                        byte B10 = ((C16773h) list3.get(i25)).B(i17);
                        if (i25 == i13 || B10 != ((C16773h) list3.get(i25 - 1)).B(i17)) {
                            eVar3.d0(B10 & 255);
                        }
                    }
                    C16770e eVar4 = new C16770e();
                    while (i13 < i19) {
                        byte B11 = ((C16773h) list3.get(i13)).B(i17);
                        int i26 = i13 + 1;
                        int i27 = i26;
                        while (true) {
                            if (i27 >= i19) {
                                i15 = i19;
                                break;
                            } else if (B11 != ((C16773h) list3.get(i27)).B(i17)) {
                                i15 = i27;
                                break;
                            } else {
                                i27++;
                            }
                        }
                        if (i26 == i15 && i17 + 1 == ((C16773h) list3.get(i13)).W()) {
                            eVar3.d0(list4.get(i13).intValue());
                            i16 = i15;
                            eVar2 = eVar4;
                        } else {
                            eVar3.d0(((int) (c10 + c(eVar4))) * i21);
                            i16 = i15;
                            eVar2 = eVar4;
                            a(c10, eVar4, i17 + 1, list, i13, i15, list2);
                        }
                        eVar4 = eVar2;
                        i13 = i16;
                        i21 = -1;
                    }
                    eVar3.Y(eVar4);
                    return;
                }
                int min = Math.min(hVar.W(), hVar2.W());
                int i28 = 0;
                int i29 = i17;
                while (i29 < min && hVar.B(i29) == hVar2.B(i29)) {
                    i28++;
                    i29++;
                }
                long c11 = j10 + c(eVar3) + ((long) 2) + ((long) i28) + 1;
                eVar3.d0(-i28);
                eVar3.d0(i14);
                int i30 = i28 + i17;
                while (i17 < i30) {
                    eVar3.d0(hVar.B(i17) & 255);
                    i17++;
                }
                if (i13 + 1 != i19) {
                    C16770e eVar5 = new C16770e();
                    eVar3.d0(((int) (c(eVar5) + c11)) * -1);
                    a(c11, eVar5, i30, list, i13, i12, list2);
                    eVar3.Y(eVar5);
                } else if (i30 == ((C16773h) list3.get(i13)).W()) {
                    eVar3.d0(list4.get(i13).intValue());
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }

        static /* synthetic */ void b(a aVar, long j10, C16770e eVar, int i10, List list, int i11, int i12, List list2, int i13, Object obj) {
            aVar.a((i13 & 1) != 0 ? 0 : j10, eVar, (i13 & 4) != 0 ? 0 : i10, list, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? list.size() : i12, list2);
        }

        private final long c(C16770e eVar) {
            return eVar.size() / ((long) 4);
        }

        public final C16760C d(C16773h... hVarArr) {
            C16773h[] hVarArr2 = hVarArr;
            C17542s.j(hVarArr2, "byteStrings");
            if (hVarArr2.length == 0) {
                return new C16760C(new C16773h[0], new int[]{0, -1}, (DefaultConstructorMarker) null);
            }
            List l12 = C16870n.l1(hVarArr);
            C16877v.B(l12);
            int size = l12.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(-1);
            }
            int length = hVarArr2.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                arrayList.set(C16877v.m(l12, hVarArr2[i11], 0, 0, 6, (Object) null), Integer.valueOf(i12));
                i11++;
                i12++;
            }
            if (((C16773h) l12.get(0)).W() > 0) {
                int i13 = 0;
                while (i13 < l12.size()) {
                    C16773h hVar = (C16773h) l12.get(i13);
                    int i14 = i13 + 1;
                    int i15 = i14;
                    while (i15 < l12.size()) {
                        C16773h hVar2 = (C16773h) l12.get(i15);
                        if (!hVar2.X(hVar)) {
                            continue;
                            break;
                        } else if (hVar2.W() == hVar.W()) {
                            throw new IllegalArgumentException(("duplicate option: " + hVar2).toString());
                        } else if (((Number) arrayList.get(i15)).intValue() > ((Number) arrayList.get(i13)).intValue()) {
                            l12.remove(i15);
                            ((Number) arrayList.remove(i15)).intValue();
                        } else {
                            i15++;
                        }
                    }
                    i13 = i14;
                }
                C16770e eVar = new C16770e();
                b(this, 0, eVar, 0, l12, 0, 0, arrayList, 53, (Object) null);
                int c10 = (int) c(eVar);
                int[] iArr = new int[c10];
                for (int i16 = 0; i16 < c10; i16++) {
                    iArr[i16] = eVar.readInt();
                }
                Object[] copyOf = Arrays.copyOf(hVarArr2, hVarArr2.length);
                C17542s.i(copyOf, "copyOf(...)");
                return new C16760C((C16773h[]) copyOf, iArr, (DefaultConstructorMarker) null);
            }
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }

        private a() {
        }
    }

    public /* synthetic */ C16760C(C16773h[] hVarArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVarArr, iArr);
    }

    public static final C16760C x(C16773h... hVarArr) {
        return f139587d.d(hVarArr);
    }

    public int a() {
        return this.f139588b.length;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C16773h)) {
            return false;
        }
        return k((C16773h) obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof C16773h)) {
            return -1;
        }
        return s((C16773h) obj);
    }

    public /* bridge */ boolean k(C16773h hVar) {
        return super.contains(hVar);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof C16773h)) {
            return -1;
        }
        return t((C16773h) obj);
    }

    /* renamed from: m */
    public C16773h get(int i10) {
        return this.f139588b[i10];
    }

    public final C16773h[] p() {
        return this.f139588b;
    }

    public final int[] q() {
        return this.f139589c;
    }

    public /* bridge */ int s(C16773h hVar) {
        return super.indexOf(hVar);
    }

    public /* bridge */ int t(C16773h hVar) {
        return super.lastIndexOf(hVar);
    }

    private C16760C(C16773h[] hVarArr, int[] iArr) {
        this.f139588b = hVarArr;
        this.f139589c = iArr;
    }
}
