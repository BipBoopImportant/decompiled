package ZH;

import YH.C16860d;
import com.sugarcube.core.logger.DslKt;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oI.C17693a;
import oI.C17697e;
import tI.C17978n;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0005\b\u0000\u0018\u0000 \u0016*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0006bghideBG\b\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u0013J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u001eJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0019H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\b&\u0010\u0013J\u0017\u0010(\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\fH\u0002¢\u0006\u0004\b(\u0010\u001bJ\u0017\u0010)\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b)\u0010!J\u0017\u0010+\u001a\u00020\f2\u0006\u0010*\u001a\u00028\u0001H\u0002¢\u0006\u0004\b+\u0010!J\u0017\u0010-\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\fH\u0002¢\u0006\u0004\b-\u0010\u0013J\u0017\u0010/\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\fH\u0002¢\u0006\u0004\b/\u0010\u0013J\u001f\u00102\u001a\u00020\u00192\u000e\u00101\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u000300H\u0002¢\u0006\u0004\b2\u00103J#\u0010\u0001\u001a\u00020\u00192\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000104H\u0002¢\u0006\u0004\b\u0001\u00106J)\u00109\u001a\u00020\u00192\u0018\u00108\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010407H\u0002¢\u0006\u0004\b9\u0010:J\u0019\u0010;\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000100¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0019H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u00192\u0006\u0010*\u001a\u00028\u0001H\u0016¢\u0006\u0004\bA\u0010@J\u001a\u0010B\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001f\u001a\u00028\u0000H\u0002¢\u0006\u0004\bB\u0010CJ!\u0010D\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u0010*\u001a\u00028\u0001H\u0016¢\u0006\u0004\bD\u0010EJ%\u0010F\u001a\u00020\u00142\u0014\u00108\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000100H\u0016¢\u0006\u0004\bF\u0010GJ\u0019\u0010H\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\bH\u0010CJ\u000f\u0010I\u001a\u00020\u0014H\u0016¢\u0006\u0004\bI\u0010\u0011J\u001a\u0010K\u001a\u00020\u00192\b\u00101\u001a\u0004\u0018\u00010JH\u0002¢\u0006\u0004\bK\u0010@J\u000f\u0010L\u001a\u00020\fH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u0014H\u0000¢\u0006\u0004\bQ\u0010\u0011J\u0017\u0010R\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00028\u0000H\u0000¢\u0006\u0004\bR\u0010!J\u0017\u0010S\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00028\u0000H\u0000¢\u0006\u0004\bS\u0010@J#\u0010T\u001a\u00020\u00192\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000104H\u0000¢\u0006\u0004\bT\u00106J\u001b\u0010U\u001a\u00020\u00192\n\u0010R\u001a\u0006\u0012\u0002\b\u000307H\u0000¢\u0006\u0004\bU\u0010:J#\u0010V\u001a\u00020\u00192\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000104H\u0000¢\u0006\u0004\bV\u00106J\u0017\u0010X\u001a\u00020\u00192\u0006\u0010W\u001a\u00028\u0001H\u0000¢\u0006\u0004\bX\u0010@J\u001b\u0010Z\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010YH\u0000¢\u0006\u0004\bZ\u0010[J\u001b\u0010]\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\\H\u0000¢\u0006\u0004\b]\u0010^J\u001b\u0010`\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010_H\u0000¢\u0006\u0004\b`\u0010aR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bd\u0010cR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bg\u0010fR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bh\u0010ZR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bi\u0010ZR\u0016\u0010k\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bj\u0010ZR\u0016\u0010m\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bl\u0010ZR$\u0010n\u001a\u00020\f2\u0006\u0010*\u001a\u00020\f8\u0016@RX\u000e¢\u0006\f\n\u0004\b'\u0010Z\u001a\u0004\bb\u0010MR\u001e\u0010r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010o8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u001e\u0010v\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010s8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bt\u0010uR$\u0010z\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010w8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bx\u0010yR$\u0010}\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u00198\u0000@BX\u000e¢\u0006\f\n\u0004\bR\u0010{\u001a\u0004\b|\u0010>R\u0014\u0010\u001a\u00020\f8BX\u0004¢\u0006\u0006\u001a\u0004\b~\u0010MR\u001e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00018VX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u001e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u00018VX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R+\u0010\u0001\u001a\u0016\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00010\u00018VX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0016\u0010\u0001\u001a\u00020\f8@X\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010M¨\u0006\u0001"}, d2 = {"LZH/d;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "keysArray", "valuesArray", "", "presenceArray", "hashArray", "", "maxProbeDistance", "length", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "()V", "initialCapacity", "(I)V", "LXH/N;", "M", "n", "x", "extraCapacity", "", "T", "(I)Z", "minCapacity", "w", "()[Ljava/lang/Object;", "key", "H", "(Ljava/lang/Object;)I", "updateHashArray", "q", "(Z)V", "newHashSize", "N", "i", "L", "A", "value", "B", "index", "P", "removedHash", "Q", "", "other", "u", "(Ljava/util/Map;)Z", "", "entry", "(Ljava/util/Map$Entry;)Z", "", "from", "J", "(Ljava/util/Collection;)Z", "o", "()Ljava/util/Map;", "isEmpty", "()Z", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "(Ljava/util/Map;)V", "remove", "clear", "", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "p", "m", "R", "t", "s", "O", "element", "S", "LZH/d$e;", "I", "()LZH/d$e;", "LZH/d$f;", "U", "()LZH/d$f;", "LZH/d$b;", "z", "()LZH/d$b;", "a", "[Ljava/lang/Object;", "b", "c", "[I", "d", "e", "f", "g", "hashShift", "h", "modCount", "size", "LZH/f;", "j", "LZH/f;", "keysView", "LZH/g;", "k", "LZH/g;", "valuesView", "LZH/e;", "l", "LZH/e;", "entriesView", "Z", "isReadOnly$kotlin_stdlib", "isReadOnly", "E", "hashSize", "", "F", "()Ljava/util/Set;", "keys", "", "G", "()Ljava/util/Collection;", "values", "", "D", "entries", "C", "capacity", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ZH.d  reason: case insensitive filesystem */
public final class C16999d<K, V> implements Map<K, V>, Serializable, C17697e {

    /* renamed from: n  reason: collision with root package name */
    public static final a f140761n = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static final C16999d f140762o;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public K[] f140763a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public V[] f140764b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public int[] f140765c;

    /* renamed from: d  reason: collision with root package name */
    private int[] f140766d;

    /* renamed from: e  reason: collision with root package name */
    private int f140767e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f140768f;

    /* renamed from: g  reason: collision with root package name */
    private int f140769g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public int f140770h;

    /* renamed from: i  reason: collision with root package name */
    private int f140771i;

    /* renamed from: j  reason: collision with root package name */
    private C17001f<K> f140772j;

    /* renamed from: k  reason: collision with root package name */
    private C17002g<V> f140773k;

    /* renamed from: l  reason: collision with root package name */
    private C17000e<K, V> f140774l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f140775m;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0007R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n8\u0000X\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011¨\u0006\u0015"}, d2 = {"LZH/d$a;", "", "<init>", "()V", "", "capacity", "c", "(I)I", "hashSize", "d", "LZH/d;", "", "Empty", "LZH/d;", "e", "()LZH/d;", "MAGIC", "I", "INITIAL_CAPACITY", "INITIAL_MAX_PROBE_DISTANCE", "TOMBSTONE", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ZH.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final int c(int i10) {
            return Integer.highestOneBit(C17978n.e(i10, 1) * 3);
        }

        /* access modifiers changed from: private */
        public final int d(int i10) {
            return Integer.numberOfLeadingZeros(i10) + 1;
        }

        public final C16999d e() {
            return C16999d.f140762o;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00050\u0004B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0014\u001a\u00020\u00132\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LZH/d$b;", "K", "V", "LZH/d$d;", "", "", "LZH/d;", "map", "<init>", "(LZH/d;)V", "LZH/d$c;", "m", "()LZH/d$c;", "", "o", "()I", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "LXH/N;", "n", "(Ljava/lang/StringBuilder;)V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ZH.d$b */
    public static final class b<K, V> extends C3445d<K, V> implements Iterator<Map.Entry<K, V>>, C17693a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C16999d<K, V> dVar) {
            super(dVar);
            C17542s.j(dVar, "map");
        }

        /* renamed from: m */
        public c<K, V> next() {
            c();
            if (d() < h().f140768f) {
                int d10 = d();
                k(d10 + 1);
                l(d10);
                c<K, V> cVar = new c<>(h(), f());
                i();
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public final void n(StringBuilder sb2) {
            C17542s.j(sb2, "sb");
            if (d() < h().f140768f) {
                int d10 = d();
                k(d10 + 1);
                l(d10);
                Object obj = h().f140763a[f()];
                if (obj == h()) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj);
                }
                sb2.append('=');
                Object[] k10 = h().f140764b;
                C17542s.g(k10);
                Object obj2 = k10[f()];
                if (obj2 == h()) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj2);
                }
                i();
                return;
            }
            throw new NoSuchElementException();
        }

        public final int o() {
            if (d() < h().f140768f) {
                int d10 = d();
                k(d10 + 1);
                l(d10);
                Object obj = h().f140763a[f()];
                int i10 = 0;
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object[] k10 = h().f140764b;
                C17542s.g(k10);
                Object obj2 = k10[f()];
                if (obj2 != null) {
                    i10 = obj2.hashCode();
                }
                int i11 = hashCode ^ i10;
                i();
                return i11;
            }
            throw new NoSuchElementException();
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00028\u00032\u0006\u0010\r\u001a\u00028\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010!\u001a\u00028\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00028\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 ¨\u0006$"}, d2 = {"LZH/d$c;", "K", "V", "", "LZH/d;", "map", "", "index", "<init>", "(LZH/d;I)V", "LXH/N;", "b", "()V", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "LZH/d;", "I", "c", "expectedModCount", "getKey", "()Ljava/lang/Object;", "key", "getValue", "value", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ZH.d$c */
    public static final class c<K, V> implements Map.Entry<K, V>, C17697e.a {

        /* renamed from: a  reason: collision with root package name */
        private final C16999d<K, V> f140776a;

        /* renamed from: b  reason: collision with root package name */
        private final int f140777b;

        /* renamed from: c  reason: collision with root package name */
        private final int f140778c;

        public c(C16999d<K, V> dVar, int i10) {
            C17542s.j(dVar, "map");
            this.f140776a = dVar;
            this.f140777b = i10;
            this.f140778c = dVar.f140770h;
        }

        private final void b() {
            if (this.f140776a.f140770h != this.f140778c) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return C17542s.e(entry.getKey(), getKey()) && C17542s.e(entry.getValue(), getValue());
            }
        }

        public K getKey() {
            b();
            return this.f140776a.f140763a[this.f140777b];
        }

        public V getValue() {
            b();
            V[] k10 = this.f140776a.f140764b;
            C17542s.g(k10);
            return k10[this.f140777b];
        }

        public int hashCode() {
            Object key = getKey();
            int i10 = 0;
            int hashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            if (value != null) {
                i10 = value.hashCode();
            }
            return hashCode ^ i10;
        }

        public V setValue(V v10) {
            b();
            this.f140776a.p();
            V[] b10 = this.f140776a.n();
            int i10 = this.f140777b;
            V v11 = b10[i10];
            b10[i10] = v10;
            return v11;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\nR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00148\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001e\u001a\u00020\u00148\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016¨\u0006 "}, d2 = {"LZH/d$d;", "K", "V", "", "LZH/d;", "map", "<init>", "(LZH/d;)V", "LXH/N;", "i", "()V", "", "hasNext", "()Z", "remove", "c", "a", "LZH/d;", "h", "()LZH/d;", "", "b", "I", "d", "()I", "k", "(I)V", "index", "f", "l", "lastIndex", "expectedModCount", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ZH.d$d  reason: collision with other inner class name */
    public static class C3445d<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private final C16999d<K, V> f140779a;

        /* renamed from: b  reason: collision with root package name */
        private int f140780b;

        /* renamed from: c  reason: collision with root package name */
        private int f140781c = -1;

        /* renamed from: d  reason: collision with root package name */
        private int f140782d;

        public C3445d(C16999d<K, V> dVar) {
            C17542s.j(dVar, "map");
            this.f140779a = dVar;
            this.f140782d = dVar.f140770h;
            i();
        }

        public final void c() {
            if (this.f140779a.f140770h != this.f140782d) {
                throw new ConcurrentModificationException();
            }
        }

        public final int d() {
            return this.f140780b;
        }

        public final int f() {
            return this.f140781c;
        }

        public final C16999d<K, V> h() {
            return this.f140779a;
        }

        public final boolean hasNext() {
            return this.f140780b < this.f140779a.f140768f;
        }

        public final void i() {
            while (this.f140780b < this.f140779a.f140768f) {
                int[] i10 = this.f140779a.f140765c;
                int i11 = this.f140780b;
                if (i10[i11] < 0) {
                    this.f140780b = i11 + 1;
                } else {
                    return;
                }
            }
        }

        public final void k(int i10) {
            this.f140780b = i10;
        }

        public final void l(int i10) {
            this.f140781c = i10;
        }

        public final void remove() {
            c();
            if (this.f140781c != -1) {
                this.f140779a.p();
                this.f140779a.P(this.f140781c);
                this.f140781c = -1;
                this.f140782d = this.f140779a.f140770h;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0002H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LZH/d$e;", "K", "V", "LZH/d$d;", "", "LZH/d;", "map", "<init>", "(LZH/d;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ZH.d$e */
    public static final class e<K, V> extends C3445d<K, V> implements Iterator<K>, C17693a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C16999d<K, V> dVar) {
            super(dVar);
            C17542s.j(dVar, "map");
        }

        public K next() {
            c();
            if (d() < h().f140768f) {
                int d10 = d();
                k(d10 + 1);
                l(d10);
                K k10 = h().f140763a[f()];
                i();
                return k10;
            }
            throw new NoSuchElementException();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0003H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LZH/d$f;", "K", "V", "LZH/d$d;", "", "LZH/d;", "map", "<init>", "(LZH/d;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ZH.d$f */
    public static final class f<K, V> extends C3445d<K, V> implements Iterator<V>, C17693a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C16999d<K, V> dVar) {
            super(dVar);
            C17542s.j(dVar, "map");
        }

        public V next() {
            c();
            if (d() < h().f140768f) {
                int d10 = d();
                k(d10 + 1);
                l(d10);
                V[] k10 = h().f140764b;
                C17542s.g(k10);
                V v10 = k10[f()];
                i();
                return v10;
            }
            throw new NoSuchElementException();
        }
    }

    static {
        C16999d dVar = new C16999d(0);
        dVar.f140775m = true;
        f140762o = dVar;
    }

    private C16999d(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i10, int i11) {
        this.f140763a = kArr;
        this.f140764b = vArr;
        this.f140765c = iArr;
        this.f140766d = iArr2;
        this.f140767e = i10;
        this.f140768f = i11;
        this.f140769g = f140761n.d(E());
    }

    private final int A(K k10) {
        int H10 = H(k10);
        int i10 = this.f140767e;
        while (true) {
            int i11 = this.f140766d[H10];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (C17542s.e(this.f140763a[i12], k10)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            H10 = H10 == 0 ? E() - 1 : H10 - 1;
        }
    }

    private final int B(V v10) {
        int i10 = this.f140768f;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f140765c[i10] >= 0) {
                V[] vArr = this.f140764b;
                C17542s.g(vArr);
                if (C17542s.e(vArr[i10], v10)) {
                    return i10;
                }
            }
        }
    }

    private final int E() {
        return this.f140766d.length;
    }

    private final int H(K k10) {
        return ((k10 != null ? k10.hashCode() : 0) * -1640531527) >>> this.f140769g;
    }

    private final boolean J(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z10 = false;
        if (collection.isEmpty()) {
            return false;
        }
        x(collection.size());
        for (Map.Entry K10 : collection) {
            if (K(K10)) {
                z10 = true;
            }
        }
        return z10;
    }

    private final boolean K(Map.Entry<? extends K, ? extends V> entry) {
        int m10 = m(entry.getKey());
        Object[] n10 = n();
        if (m10 >= 0) {
            n10[m10] = entry.getValue();
            return true;
        }
        int i10 = (-m10) - 1;
        if (C17542s.e(entry.getValue(), n10[i10])) {
            return false;
        }
        n10[i10] = entry.getValue();
        return true;
    }

    private final boolean L(int i10) {
        int H10 = H(this.f140763a[i10]);
        int i11 = this.f140767e;
        while (true) {
            int[] iArr = this.f140766d;
            if (iArr[H10] == 0) {
                iArr[H10] = i10 + 1;
                this.f140765c[i10] = H10;
                return true;
            }
            i11--;
            if (i11 < 0) {
                return false;
            }
            H10 = H10 == 0 ? E() - 1 : H10 - 1;
        }
    }

    private final void M() {
        this.f140770h++;
    }

    private final void N(int i10) {
        M();
        int i11 = 0;
        if (this.f140768f > size()) {
            q(false);
        }
        this.f140766d = new int[i10];
        this.f140769g = f140761n.d(i10);
        while (i11 < this.f140768f) {
            int i12 = i11 + 1;
            if (L(i11)) {
                i11 = i12;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    /* access modifiers changed from: private */
    public final void P(int i10) {
        C16998c.f(this.f140763a, i10);
        V[] vArr = this.f140764b;
        if (vArr != null) {
            C16998c.f(vArr, i10);
        }
        Q(this.f140765c[i10]);
        this.f140765c[i10] = -1;
        this.f140771i = size() - 1;
        M();
    }

    private final void Q(int i10) {
        int i11 = C17978n.i(this.f140767e * 2, E() / 2);
        int i12 = 0;
        int i13 = i10;
        do {
            i10 = i10 == 0 ? E() - 1 : i10 - 1;
            i12++;
            if (i12 > this.f140767e) {
                this.f140766d[i13] = 0;
                return;
            }
            int[] iArr = this.f140766d;
            int i14 = iArr[i10];
            if (i14 == 0) {
                iArr[i13] = 0;
                return;
            }
            if (i14 < 0) {
                iArr[i13] = -1;
            } else {
                int i15 = i14 - 1;
                if (((H(this.f140763a[i15]) - i10) & (E() - 1)) >= i12) {
                    this.f140766d[i13] = i14;
                    this.f140765c[i15] = i13;
                }
                i11--;
            }
            i13 = i10;
            i12 = 0;
            i11--;
        } while (i11 >= 0);
        this.f140766d[i13] = -1;
    }

    private final boolean T(int i10) {
        int C10 = C();
        int i11 = this.f140768f;
        int i12 = C10 - i11;
        int size = i11 - size();
        return i12 < i10 && i12 + size >= i10 && size >= C() / 4;
    }

    /* access modifiers changed from: private */
    public final V[] n() {
        V[] vArr = this.f140764b;
        if (vArr != null) {
            return vArr;
        }
        V[] d10 = C16998c.d(C());
        this.f140764b = d10;
        return d10;
    }

    private final void q(boolean z10) {
        int i10;
        V[] vArr = this.f140764b;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f140768f;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.f140765c;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                K[] kArr = this.f140763a;
                kArr[i12] = kArr[i11];
                if (vArr != null) {
                    vArr[i12] = vArr[i11];
                }
                if (z10) {
                    iArr[i12] = i13;
                    this.f140766d[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        C16998c.g(this.f140763a, i12, i10);
        if (vArr != null) {
            C16998c.g(vArr, i12, this.f140768f);
        }
        this.f140768f = i12;
    }

    private final boolean u(Map<?, ?> map) {
        return size() == map.size() && s(map.entrySet());
    }

    private final void w(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        } else if (i10 > C()) {
            int e10 = C16860d.f140429a.e(C(), i10);
            this.f140763a = C16998c.e(this.f140763a, e10);
            V[] vArr = this.f140764b;
            this.f140764b = vArr != null ? C16998c.e(vArr, e10) : null;
            int[] copyOf = Arrays.copyOf(this.f140765c, e10);
            C17542s.i(copyOf, "copyOf(...)");
            this.f140765c = copyOf;
            int a10 = f140761n.c(e10);
            if (a10 > E()) {
                N(a10);
            }
        }
    }

    private final void x(int i10) {
        if (T(i10)) {
            q(true);
        } else {
            w(this.f140768f + i10);
        }
    }

    public final int C() {
        return this.f140763a.length;
    }

    public Set<Map.Entry<K, V>> D() {
        C17000e<K, V> eVar = this.f140774l;
        if (eVar != null) {
            return eVar;
        }
        C17000e<K, V> eVar2 = new C17000e<>(this);
        this.f140774l = eVar2;
        return eVar2;
    }

    public Set<K> F() {
        C17001f<K> fVar = this.f140772j;
        if (fVar != null) {
            return fVar;
        }
        C17001f<K> fVar2 = new C17001f<>(this);
        this.f140772j = fVar2;
        return fVar2;
    }

    public Collection<V> G() {
        C17002g<V> gVar = this.f140773k;
        if (gVar != null) {
            return gVar;
        }
        C17002g<V> gVar2 = new C17002g<>(this);
        this.f140773k = gVar2;
        return gVar2;
    }

    public final e<K, V> I() {
        return new e<>(this);
    }

    public final boolean O(Map.Entry<? extends K, ? extends V> entry) {
        C17542s.j(entry, "entry");
        p();
        int A10 = A(entry.getKey());
        if (A10 < 0) {
            return false;
        }
        V[] vArr = this.f140764b;
        C17542s.g(vArr);
        if (!C17542s.e(vArr[A10], entry.getValue())) {
            return false;
        }
        P(A10);
        return true;
    }

    public final boolean R(K k10) {
        p();
        int A10 = A(k10);
        if (A10 < 0) {
            return false;
        }
        P(A10);
        return true;
    }

    public final boolean S(V v10) {
        p();
        int B10 = B(v10);
        if (B10 < 0) {
            return false;
        }
        P(B10);
        return true;
    }

    public final f<K, V> U() {
        return new f<>(this);
    }

    public int a() {
        return this.f140771i;
    }

    public void clear() {
        p();
        int i10 = this.f140768f - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.f140765c;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.f140766d[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        C16998c.g(this.f140763a, 0, this.f140768f);
        V[] vArr = this.f140764b;
        if (vArr != null) {
            C16998c.g(vArr, 0, this.f140768f);
        }
        this.f140771i = 0;
        this.f140768f = 0;
        M();
    }

    public boolean containsKey(Object obj) {
        return A(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return B(obj) >= 0;
    }

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return D();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Map) && u((Map) obj));
    }

    public V get(Object obj) {
        int A10 = A(obj);
        if (A10 < 0) {
            return null;
        }
        V[] vArr = this.f140764b;
        C17542s.g(vArr);
        return vArr[A10];
    }

    public int hashCode() {
        b z10 = z();
        int i10 = 0;
        while (z10.hasNext()) {
            i10 += z10.o();
        }
        return i10;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public final /* bridge */ Set<K> keySet() {
        return F();
    }

    public final int m(K k10) {
        p();
        while (true) {
            int H10 = H(k10);
            int i10 = C17978n.i(this.f140767e * 2, E() / 2);
            int i11 = 0;
            while (true) {
                int i12 = this.f140766d[H10];
                if (i12 <= 0) {
                    if (this.f140768f >= C()) {
                        x(1);
                    } else {
                        int i13 = this.f140768f;
                        int i14 = i13 + 1;
                        this.f140768f = i14;
                        this.f140763a[i13] = k10;
                        this.f140765c[i13] = H10;
                        this.f140766d[H10] = i14;
                        this.f140771i = size() + 1;
                        M();
                        if (i11 > this.f140767e) {
                            this.f140767e = i11;
                        }
                        return i13;
                    }
                } else if (C17542s.e(this.f140763a[i12 - 1], k10)) {
                    return -i12;
                } else {
                    i11++;
                    if (i11 > i10) {
                        N(E() * 2);
                        break;
                    }
                    H10 = H10 == 0 ? E() - 1 : H10 - 1;
                }
            }
        }
    }

    public final Map<K, V> o() {
        p();
        this.f140775m = true;
        if (size() > 0) {
            return this;
        }
        C16999d dVar = f140762o;
        C17542s.h(dVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return dVar;
    }

    public final void p() {
        if (this.f140775m) {
            throw new UnsupportedOperationException();
        }
    }

    public V put(K k10, V v10) {
        p();
        int m10 = m(k10);
        V[] n10 = n();
        if (m10 < 0) {
            int i10 = (-m10) - 1;
            V v11 = n10[i10];
            n10[i10] = v10;
            return v11;
        }
        n10[m10] = v10;
        return null;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        C17542s.j(map, "from");
        p();
        J(map.entrySet());
    }

    public V remove(Object obj) {
        p();
        int A10 = A(obj);
        if (A10 < 0) {
            return null;
        }
        V[] vArr = this.f140764b;
        C17542s.g(vArr);
        V v10 = vArr[A10];
        P(A10);
        return v10;
    }

    public final boolean s(Collection<?> collection) {
        C17542s.j(collection, DslKt.INDICATOR_MAIN);
        for (Object next : collection) {
            if (next != null) {
                try {
                    if (!t((Map.Entry) next)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ int size() {
        return a();
    }

    public final boolean t(Map.Entry<? extends K, ? extends V> entry) {
        C17542s.j(entry, "entry");
        int A10 = A(entry.getKey());
        if (A10 < 0) {
            return false;
        }
        V[] vArr = this.f140764b;
        C17542s.g(vArr);
        return C17542s.e(vArr[A10], entry.getValue());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append("{");
        b z10 = z();
        int i10 = 0;
        while (z10.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            z10.n(sb2);
            i10++;
        }
        sb2.append("}");
        String sb3 = sb2.toString();
        C17542s.i(sb3, "toString(...)");
        return sb3;
    }

    public final /* bridge */ Collection<V> values() {
        return G();
    }

    public final b<K, V> z() {
        return new b<>(this);
    }

    public C16999d() {
        this(8);
    }

    public C16999d(int i10) {
        this(C16998c.d(i10), (V[]) null, new int[i10], new int[f140761n.c(i10)], 2, 0);
    }
}
