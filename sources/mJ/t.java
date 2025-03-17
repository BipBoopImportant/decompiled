package MJ;

import PJ.C16207a;
import PJ.C16208b;
import PJ.f;
import YH.U;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import tI.C17972h;
import tI.C17978n;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 =*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001kB1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB)\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007¢\u0006\u0004\b\u000b\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0001\u001a\u00028\u00012\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0001\u0010\u0014J;\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00012\u0006\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J?\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00028\u00012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ?\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001e\u001a\u00020\u00042\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010!J5\u0010\"\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\"\u0010#JQ\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00072\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00028\u00002\u0006\u0010&\u001a\u00028\u00012\u0006\u0010'\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b(\u0010)JS\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00028\u00002\u0006\u0010&\u001a\u00028\u00012\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b*\u0010+J]\u00102\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00028\u00002\u0006\u0010.\u001a\u00028\u00012\u0006\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u00028\u00002\u0006\u00101\u001a\u00028\u00012\u0006\u0010'\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b2\u00103JA\u00104\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001aH\u0002¢\u0006\u0004\b4\u00105J9\u00107\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u00106\u001a\u00020\u00042\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001aH\u0002¢\u0006\u0004\b7\u00108J\u0019\u00109\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\b;\u0010<J\u0019\u0010=\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\b=\u0010>J?\u0010?\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001aH\u0002¢\u0006\u0004\b?\u0010@J9\u0010A\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0015\u001a\u00028\u00002\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001aH\u0002¢\u0006\u0004\bA\u0010BJA\u0010C\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001aH\u0002¢\u0006\u0004\bC\u0010@J?\u0010G\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010F\u001a\u00020E2\u0006\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\bG\u0010HJ[\u0010I\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\u0006\u0010F\u001a\u00020E2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001aH\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u0004H\u0002¢\u0006\u0004\bK\u0010LJ#\u0010M\u001a\u00020\u000f2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\bM\u0010NJ_\u0010P\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010O\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\bP\u0010QJ\u000f\u00106\u001a\u00020\u0004H\u0000¢\u0006\u0004\b6\u0010LJ\u0017\u0010R\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0000¢\u0006\u0004\bR\u0010\u0011J\u0017\u0010S\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0000¢\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0000¢\u0006\u0004\bU\u0010TJ#\u0010V\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001e\u001a\u00020\u0004H\u0000¢\u0006\u0004\bV\u0010WJ%\u0010Y\u001a\u00020\u000f2\u0006\u0010X\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010'\u001a\u00020\u0004¢\u0006\u0004\bY\u0010ZJ'\u0010[\u001a\u0004\u0018\u00018\u00012\u0006\u0010X\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010'\u001a\u00020\u0004¢\u0006\u0004\b[\u0010\\JQ\u0010]\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0006\u0010F\u001a\u00020E2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a¢\u0006\u0004\b]\u0010^JM\u0010_\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010X\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00012\u0006\u0010'\u001a\u00020\u00042\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a¢\u0006\u0004\b_\u0010`JG\u0010a\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010X\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010'\u001a\u00020\u00042\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a¢\u0006\u0004\ba\u0010bJO\u0010c\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010X\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00012\u0006\u0010'\u001a\u00020\u00042\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a¢\u0006\u0004\bc\u0010`JI\u0010i\u001a\u00020\u000f\"\u0004\b\u0002\u0010d\"\u0004\b\u0003\u0010e2\u0012\u0010f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\u0018\u0010h\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u000f0gH\u0000¢\u0006\u0004\bi\u0010jR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bk\u0010VR\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010VR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u0010lR4\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00072\u000e\u0010m\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00078\u0000@BX\u000e¢\u0006\f\n\u0004\b;\u0010n\u001a\u0004\bo\u0010p¨\u0006q"}, d2 = {"LMJ/t;", "K", "V", "", "", "dataMap", "nodeMap", "", "buffer", "LPJ/f;", "ownedBy", "<init>", "(II[Ljava/lang/Object;LPJ/f;)V", "(II[Ljava/lang/Object;)V", "positionMask", "", "o", "(I)Z", "keyIndex", "p", "(I)Ljava/lang/Object;", "key", "value", "owner", "w", "(ILjava/lang/Object;Ljava/lang/Object;LPJ/f;)LMJ/t;", "LMJ/f;", "mutator", "H", "(ILjava/lang/Object;LMJ/f;)LMJ/t;", "nodeIndex", "newNode", "G", "(ILMJ/t;LPJ/f;)LMJ/t;", "E", "(IILPJ/f;)LMJ/t;", "newKeyHash", "newKey", "newValue", "shift", "b", "(IIILjava/lang/Object;Ljava/lang/Object;ILPJ/f;)[Ljava/lang/Object;", "x", "(IIILjava/lang/Object;Ljava/lang/Object;ILPJ/f;)LMJ/t;", "keyHash1", "key1", "value1", "keyHash2", "key2", "value2", "q", "(ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILPJ/f;)LMJ/t;", "D", "(IILMJ/f;)LMJ/t;", "i", "v", "(ILMJ/f;)LMJ/t;", "f", "(Ljava/lang/Object;)I", "d", "(Ljava/lang/Object;)Z", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "r", "(Ljava/lang/Object;Ljava/lang/Object;LMJ/f;)LMJ/t;", "t", "(Ljava/lang/Object;LMJ/f;)LMJ/t;", "u", "otherNode", "LPJ/b;", "intersectionCounter", "s", "(LMJ/t;LPJ/b;LPJ/f;)LMJ/t;", "A", "(LMJ/t;IILPJ/b;LMJ/f;)LMJ/t;", "c", "()I", "h", "(LMJ/t;)Z", "targetNode", "F", "(LMJ/t;LMJ/t;IILPJ/f;)LMJ/t;", "n", "j", "(I)I", "J", "I", "(I)LMJ/t;", "keyHash", "g", "(ILjava/lang/Object;I)Z", "l", "(ILjava/lang/Object;I)Ljava/lang/Object;", "z", "(LMJ/t;ILPJ/b;LMJ/f;)LMJ/t;", "y", "(ILjava/lang/Object;Ljava/lang/Object;ILMJ/f;)LMJ/t;", "B", "(ILjava/lang/Object;ILMJ/f;)LMJ/t;", "C", "K1", "V1", "that", "Lkotlin/Function2;", "equalityComparator", "k", "(LMJ/t;LnI/p;)Z", "a", "LPJ/f;", "<set-?>", "[Ljava/lang/Object;", "m", "()[Ljava/lang/Object;", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class t<K, V> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f136443e = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final t f136444f = new t(0, 0, new Object[0]);

    /* renamed from: a  reason: collision with root package name */
    private int f136445a;

    /* renamed from: b  reason: collision with root package name */
    private int f136446b;

    /* renamed from: c  reason: collision with root package name */
    private final f f136447c;

    /* renamed from: d  reason: collision with root package name */
    private Object[] f136448d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LMJ/t$a;", "", "<init>", "()V", "LMJ/t;", "", "EMPTY", "LMJ/t;", "a", "()LMJ/t;", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t a() {
            return t.f136444f;
        }

        private a() {
        }
    }

    public t(int i10, int i11, Object[] objArr, f fVar) {
        C17542s.j(objArr, "buffer");
        this.f136445a = i10;
        this.f136446b = i11;
        this.f136447c = fVar;
        this.f136448d = objArr;
    }

    private final t<K, V> A(t<K, V> tVar, int i10, int i11, C16208b bVar, C16083f<K, V> fVar) {
        t<K, V> tVar2 = tVar;
        int i12 = i10;
        C16208b bVar2 = bVar;
        int i13 = 0;
        if (o(i12)) {
            t<K, V> I10 = I(J(i12));
            if (tVar.o(i10)) {
                return I10.z(tVar2.I(tVar.J(i10)), i11 + 5, bVar2, fVar);
            }
            C16083f<K, V> fVar2 = fVar;
            if (!tVar.n(i10)) {
                return I10;
            }
            int j10 = tVar.j(i10);
            K p10 = tVar2.p(j10);
            V K10 = tVar2.K(j10);
            int size = fVar.size();
            if (p10 != null) {
                i13 = p10.hashCode();
            }
            t<K, V> y10 = I10.y(i13, p10, K10, i11 + 5, fVar);
            if (fVar.size() != size) {
                return y10;
            }
            bVar2.c(bVar.a() + 1);
            return y10;
        }
        C16083f<K, V> fVar3 = fVar;
        if (tVar.o(i10)) {
            t<K, V> I11 = tVar2.I(tVar.J(i10));
            if (n(i12)) {
                int j11 = j(i12);
                Object p11 = p(j11);
                int i14 = i11 + 5;
                if (I11.g(p11 != null ? p11.hashCode() : 0, p11, i14)) {
                    bVar2.c(bVar.a() + 1);
                } else {
                    Object K11 = K(j11);
                    if (p11 != null) {
                        i13 = p11.hashCode();
                    }
                    return I11.y(i13, p11, K11, i14, fVar);
                }
            }
            return I11;
        }
        int j12 = j(i12);
        Object p12 = p(j12);
        Object K12 = K(j12);
        int j13 = tVar.j(i10);
        K p13 = tVar2.p(j13);
        V K13 = tVar2.K(j13);
        int hashCode = p12 != null ? p12.hashCode() : 0;
        if (p13 != null) {
            i13 = p13.hashCode();
        }
        return q(hashCode, p12, K12, i13, p13, K13, i11 + 5, fVar.l());
    }

    private final t<K, V> D(int i10, int i11, C16083f<K, V> fVar) {
        fVar.p(fVar.size() - 1);
        fVar.o(K(i10));
        if (this.f136448d.length == 2) {
            return null;
        }
        if (this.f136447c == fVar.l()) {
            this.f136448d = x.g(this.f136448d, i10);
            this.f136445a ^= i11;
            return this;
        }
        return new t<>(i11 ^ this.f136445a, this.f136446b, x.g(this.f136448d, i10), fVar.l());
    }

    private final t<K, V> E(int i10, int i11, f fVar) {
        Object[] objArr = this.f136448d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.f136447c == fVar) {
            this.f136448d = x.h(objArr, i10);
            this.f136446b ^= i11;
            return this;
        }
        return new t<>(this.f136445a, i11 ^ this.f136446b, x.h(objArr, i10), fVar);
    }

    private final t<K, V> F(t<K, V> tVar, t<K, V> tVar2, int i10, int i11, f fVar) {
        return tVar2 == null ? E(i10, i11, fVar) : tVar != tVar2 ? G(i10, tVar2, fVar) : this;
    }

    private final t<K, V> G(int i10, t<K, V> tVar, f fVar) {
        C16207a.a(tVar.f136447c == fVar);
        Object[] objArr = this.f136448d;
        if (objArr.length == 1 && tVar.f136448d.length == 2 && tVar.f136446b == 0) {
            tVar.f136445a = this.f136446b;
            return tVar;
        } else if (this.f136447c == fVar) {
            objArr[i10] = tVar;
            return this;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            C17542s.i(copyOf, "copyOf(...)");
            copyOf[i10] = tVar;
            return new t<>(this.f136445a, this.f136446b, copyOf, fVar);
        }
    }

    private final t<K, V> H(int i10, V v10, C16083f<K, V> fVar) {
        if (this.f136447c == fVar.l()) {
            this.f136448d[i10 + 1] = v10;
            return this;
        }
        fVar.m(fVar.i() + 1);
        Object[] objArr = this.f136448d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        C17542s.i(copyOf, "copyOf(...)");
        copyOf[i10 + 1] = v10;
        return new t<>(this.f136445a, this.f136446b, copyOf, fVar.l());
    }

    private final V K(int i10) {
        return this.f136448d[i10 + 1];
    }

    private final Object[] b(int i10, int i11, int i12, K k10, V v10, int i13, f fVar) {
        Object p10 = p(i10);
        int i14 = i11;
        int i15 = i10;
        return x.i(this.f136448d, i10, J(i11) + 1, q(p10 != null ? p10.hashCode() : 0, p10, K(i10), i12, k10, v10, i13 + 5, fVar));
    }

    private final int c() {
        if (this.f136446b == 0) {
            return this.f136448d.length / 2;
        }
        int bitCount = Integer.bitCount(this.f136445a);
        int length = this.f136448d.length;
        for (int i10 = bitCount * 2; i10 < length; i10++) {
            bitCount += I(i10).c();
        }
        return bitCount;
    }

    private final boolean d(K k10) {
        return f(k10) != -1;
    }

    private final V e(K k10) {
        int f10 = f(k10);
        if (f10 != -1) {
            return K(f10);
        }
        return null;
    }

    private final int f(Object obj) {
        C17972h v10 = C17978n.v(C17978n.w(0, this.f136448d.length), 2);
        int p10 = v10.p();
        int q10 = v10.q();
        int s10 = v10.s();
        if ((s10 <= 0 || p10 > q10) && (s10 >= 0 || q10 > p10)) {
            return -1;
        }
        while (!C17542s.e(obj, p(p10))) {
            if (p10 == q10) {
                return -1;
            }
            p10 += s10;
        }
        return p10;
    }

    private final boolean h(t<K, V> tVar) {
        if (this == tVar) {
            return true;
        }
        if (this.f136446b != tVar.f136446b || this.f136445a != tVar.f136445a) {
            return false;
        }
        int length = this.f136448d.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f136448d[i10] != tVar.f136448d[i10]) {
                return false;
            }
        }
        return true;
    }

    private final boolean o(int i10) {
        return (i10 & this.f136446b) != 0;
    }

    private final K p(int i10) {
        return this.f136448d[i10];
    }

    private final t<K, V> q(int i10, K k10, V v10, int i11, K k11, V v11, int i12, f fVar) {
        K k12 = k10;
        V v12 = v10;
        K k13 = k11;
        V v13 = v11;
        int i13 = i12;
        f fVar2 = fVar;
        if (i13 > 30) {
            return new t<>(0, 0, new Object[]{k10, v12, k13, v13}, fVar2);
        }
        int i14 = i10;
        int e10 = x.e(i10, i13);
        int e11 = x.e(i11, i13);
        if (e10 != e11) {
            return new t<>((1 << e10) | (1 << e11), 0, e10 < e11 ? new Object[]{k12, v12, k13, v13} : new Object[]{k13, v13, k12, v12}, fVar2);
        }
        return new t<>(0, 1 << e10, new Object[]{q(i10, k10, v10, i11, k11, v11, i13 + 5, fVar)}, fVar2);
    }

    private final t<K, V> r(K k10, V v10, C16083f<K, V> fVar) {
        int f10 = f(k10);
        if (f10 != -1) {
            fVar.o(K(f10));
            if (this.f136447c == fVar.l()) {
                this.f136448d[f10 + 1] = v10;
                return this;
            }
            fVar.m(fVar.i() + 1);
            Object[] objArr = this.f136448d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            C17542s.i(copyOf, "copyOf(...)");
            copyOf[f10 + 1] = v10;
            return new t<>(0, 0, copyOf, fVar.l());
        }
        fVar.p(fVar.size() + 1);
        return new t<>(0, 0, x.f(this.f136448d, 0, k10, v10), fVar.l());
    }

    private final t<K, V> s(t<K, V> tVar, C16208b bVar, f fVar) {
        C16207a.a(this.f136446b == 0);
        C16207a.a(this.f136445a == 0);
        C16207a.a(tVar.f136446b == 0);
        C16207a.a(tVar.f136445a == 0);
        Object[] objArr = this.f136448d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + tVar.f136448d.length);
        C17542s.i(copyOf, "copyOf(...)");
        int length = this.f136448d.length;
        C17972h v10 = C17978n.v(C17978n.w(0, tVar.f136448d.length), 2);
        int p10 = v10.p();
        int q10 = v10.q();
        int s10 = v10.s();
        if ((s10 > 0 && p10 <= q10) || (s10 < 0 && q10 <= p10)) {
            while (true) {
                if (!d(tVar.f136448d[p10])) {
                    Object[] objArr2 = tVar.f136448d;
                    copyOf[length] = objArr2[p10];
                    copyOf[length + 1] = objArr2[p10 + 1];
                    length += 2;
                } else {
                    bVar.c(bVar.a() + 1);
                }
                if (p10 == q10) {
                    break;
                }
                p10 += s10;
            }
        }
        if (length == this.f136448d.length) {
            return this;
        }
        if (length == tVar.f136448d.length) {
            return tVar;
        }
        if (length == copyOf.length) {
            return new t<>(0, 0, copyOf, fVar);
        }
        Object[] copyOf2 = Arrays.copyOf(copyOf, length);
        C17542s.i(copyOf2, "copyOf(...)");
        return new t<>(0, 0, copyOf2, fVar);
    }

    private final t<K, V> t(K k10, C16083f<K, V> fVar) {
        int f10 = f(k10);
        return f10 != -1 ? v(f10, fVar) : this;
    }

    private final t<K, V> u(K k10, V v10, C16083f<K, V> fVar) {
        int f10 = f(k10);
        return (f10 == -1 || !C17542s.e(v10, K(f10))) ? this : v(f10, fVar);
    }

    private final t<K, V> v(int i10, C16083f<K, V> fVar) {
        fVar.p(fVar.size() - 1);
        fVar.o(K(i10));
        if (this.f136448d.length == 2) {
            return null;
        }
        if (this.f136447c != fVar.l()) {
            return new t<>(0, 0, x.g(this.f136448d, i10), fVar.l());
        }
        this.f136448d = x.g(this.f136448d, i10);
        return this;
    }

    private final t<K, V> w(int i10, K k10, V v10, f fVar) {
        int j10 = j(i10);
        if (this.f136447c == fVar) {
            this.f136448d = x.f(this.f136448d, j10, k10, v10);
            this.f136445a = i10 | this.f136445a;
            return this;
        }
        return new t<>(i10 | this.f136445a, this.f136446b, x.f(this.f136448d, j10, k10, v10), fVar);
    }

    private final t<K, V> x(int i10, int i11, int i12, K k10, V v10, int i13, f fVar) {
        if (this.f136447c == fVar) {
            this.f136448d = b(i10, i11, i12, k10, v10, i13, fVar);
            this.f136445a ^= i11;
            this.f136446b |= i11;
            return this;
        }
        return new t<>(this.f136445a ^ i11, i11 | this.f136446b, b(i10, i11, i12, k10, v10, i13, fVar), fVar);
    }

    public final t<K, V> B(int i10, K k10, int i11, C16083f<K, V> fVar) {
        C17542s.j(fVar, "mutator");
        int e10 = 1 << x.e(i10, i11);
        if (n(e10)) {
            int j10 = j(e10);
            return C17542s.e(k10, p(j10)) ? D(j10, e10, fVar) : this;
        } else if (!o(e10)) {
            return this;
        } else {
            int J10 = J(e10);
            t I10 = I(J10);
            return F(I10, i11 == 30 ? I10.t(k10, fVar) : I10.B(i10, k10, i11 + 5, fVar), J10, e10, fVar.l());
        }
    }

    public final t<K, V> C(int i10, K k10, V v10, int i11, C16083f<K, V> fVar) {
        K k11 = k10;
        V v11 = v10;
        int i12 = i11;
        C16083f<K, V> fVar2 = fVar;
        C17542s.j(fVar2, "mutator");
        int i13 = i10;
        int e10 = 1 << x.e(i10, i11);
        if (n(e10)) {
            int j10 = j(e10);
            return (!C17542s.e(k10, p(j10)) || !C17542s.e(v10, K(j10))) ? this : D(j10, e10, fVar2);
        } else if (!o(e10)) {
            return this;
        } else {
            int J10 = J(e10);
            t I10 = I(J10);
            return F(I10, i12 == 30 ? I10.u(k10, v10, fVar2) : I10.C(i10, k10, v10, i12 + 5, fVar), J10, e10, fVar.l());
        }
    }

    public final t<K, V> I(int i10) {
        Object obj = this.f136448d[i10];
        C17542s.h(obj, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (t) obj;
    }

    public final int J(int i10) {
        return (this.f136448d.length - 1) - Integer.bitCount((i10 - 1) & this.f136446b);
    }

    public final boolean g(int i10, K k10, int i11) {
        int e10 = 1 << x.e(i10, i11);
        if (n(e10)) {
            return C17542s.e(k10, p(j(e10)));
        }
        if (!o(e10)) {
            return false;
        }
        t I10 = I(J(e10));
        return i11 == 30 ? I10.d(k10) : I10.g(i10, k10, i11 + 5);
    }

    public final int i() {
        return Integer.bitCount(this.f136445a);
    }

    public final int j(int i10) {
        return Integer.bitCount((i10 - 1) & this.f136445a) * 2;
    }

    public final <K1, V1> boolean k(t<K1, V1> tVar, p<? super V, ? super V1, Boolean> pVar) {
        int i10;
        boolean z10;
        C17542s.j(tVar, "that");
        C17542s.j(pVar, "equalityComparator");
        if (this == tVar) {
            return true;
        }
        int i11 = this.f136445a;
        if (i11 != tVar.f136445a || (i10 = this.f136446b) != tVar.f136446b) {
            return false;
        }
        if (i11 == 0 && i10 == 0) {
            Object[] objArr = this.f136448d;
            if (objArr.length != tVar.f136448d.length) {
                return false;
            }
            C17972h v10 = C17978n.v(C17978n.w(0, objArr.length), 2);
            if ((v10 instanceof Collection) && ((Collection) v10).isEmpty()) {
                return true;
            }
            Iterator it = v10.iterator();
            while (it.hasNext()) {
                int c10 = ((U) it).c();
                K1 p10 = tVar.p(c10);
                V1 K10 = tVar.K(c10);
                int f10 = f(p10);
                if (f10 != -1) {
                    z10 = pVar.invoke(K(f10), K10).booleanValue();
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (!z10) {
                    return false;
                }
            }
            return true;
        }
        int bitCount = Integer.bitCount(i11) * 2;
        C17972h v11 = C17978n.v(C17978n.w(0, bitCount), 2);
        int p11 = v11.p();
        int q10 = v11.q();
        int s10 = v11.s();
        if ((s10 > 0 && p11 <= q10) || (s10 < 0 && q10 <= p11)) {
            while (C17542s.e(p(p11), tVar.p(p11)) && pVar.invoke(K(p11), tVar.K(p11)).booleanValue()) {
                if (p11 != q10) {
                    p11 += s10;
                }
            }
            return false;
        }
        int length = this.f136448d.length;
        while (bitCount < length) {
            if (!I(bitCount).k(tVar.I(bitCount), pVar)) {
                return false;
            }
            bitCount++;
        }
        return true;
    }

    public final V l(int i10, K k10, int i11) {
        int e10 = 1 << x.e(i10, i11);
        if (n(e10)) {
            int j10 = j(e10);
            if (C17542s.e(k10, p(j10))) {
                return K(j10);
            }
            return null;
        } else if (!o(e10)) {
            return null;
        } else {
            t I10 = I(J(e10));
            return i11 == 30 ? I10.e(k10) : I10.l(i10, k10, i11 + 5);
        }
    }

    public final Object[] m() {
        return this.f136448d;
    }

    public final boolean n(int i10) {
        return (i10 & this.f136445a) != 0;
    }

    public final t<K, V> y(int i10, K k10, V v10, int i11, C16083f<K, V> fVar) {
        C17542s.j(fVar, "mutator");
        int e10 = 1 << x.e(i10, i11);
        if (n(e10)) {
            int j10 = j(e10);
            if (C17542s.e(k10, p(j10))) {
                fVar.o(K(j10));
                return K(j10) == v10 ? this : H(j10, v10, fVar);
            }
            fVar.p(fVar.size() + 1);
            return x(j10, e10, i10, k10, v10, i11, fVar.l());
        } else if (o(e10)) {
            int J10 = J(e10);
            t<K, V> I10 = I(J10);
            t<K, V> r10 = i11 == 30 ? I10.r(k10, v10, fVar) : I10.y(i10, k10, v10, i11 + 5, fVar);
            return I10 == r10 ? this : G(J10, r10, fVar.l());
        } else {
            fVar.p(fVar.size() + 1);
            return w(e10, k10, v10, fVar.l());
        }
    }

    public final t<K, V> z(t<K, V> tVar, int i10, C16208b bVar, C16083f<K, V> fVar) {
        t<K, V> tVar2 = tVar;
        C16208b bVar2 = bVar;
        C17542s.j(tVar2, "otherNode");
        C17542s.j(bVar2, "intersectionCounter");
        C17542s.j(fVar, "mutator");
        if (this == tVar2) {
            bVar2.b(c());
            return this;
        } else if (i10 > 30) {
            return s(tVar2, bVar2, fVar.l());
        } else {
            int i11 = this.f136446b | tVar2.f136446b;
            int i12 = this.f136445a;
            int i13 = tVar2.f136445a;
            int i14 = i12 & i13;
            int i15 = (i12 ^ i13) & (~i11);
            while (i14 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i14);
                if (C17542s.e(p(j(lowestOneBit)), tVar2.p(tVar2.j(lowestOneBit)))) {
                    i15 |= lowestOneBit;
                } else {
                    i11 |= lowestOneBit;
                }
                i14 ^= lowestOneBit;
            }
            if ((i11 & i15) == 0) {
                t tVar3 = (C17542s.e(this.f136447c, fVar.l()) && this.f136445a == i15 && this.f136446b == i11) ? this : new t(i15, i11, new Object[((Integer.bitCount(i15) * 2) + Integer.bitCount(i11))]);
                int i16 = 0;
                int i17 = i11;
                int i18 = 0;
                while (i17 != 0) {
                    int lowestOneBit2 = Integer.lowestOneBit(i17);
                    Object[] objArr = tVar3.f136448d;
                    objArr[(objArr.length - 1) - i18] = A(tVar, lowestOneBit2, i10, bVar, fVar);
                    i18++;
                    i17 ^= lowestOneBit2;
                }
                while (i15 != 0) {
                    int lowestOneBit3 = Integer.lowestOneBit(i15);
                    int i19 = i16 * 2;
                    if (!tVar2.n(lowestOneBit3)) {
                        int j10 = j(lowestOneBit3);
                        tVar3.f136448d[i19] = p(j10);
                        tVar3.f136448d[i19 + 1] = K(j10);
                    } else {
                        int j11 = tVar2.j(lowestOneBit3);
                        tVar3.f136448d[i19] = tVar2.p(j11);
                        tVar3.f136448d[i19 + 1] = tVar2.K(j11);
                        if (n(lowestOneBit3)) {
                            bVar2.c(bVar.a() + 1);
                        }
                    }
                    i16++;
                    i15 ^= lowestOneBit3;
                }
                return h(tVar3) ? this : tVar2.h(tVar3) ? tVar2 : tVar3;
            }
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public t(int i10, int i11, Object[] objArr) {
        this(i10, i11, objArr, (f) null);
        C17542s.j(objArr, "buffer");
    }
}
