package ZH;

import YH.C16860d;
import YH.C16864h;
import YH.C16870n;
import YH.C16877v;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oI.C17693a;
import oI.C17696d;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u000f\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b \b\u0000\u0018\u0000 _*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0003-[WB\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010!J\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010\"\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010%J\u001d\u0010(\u001a\u00020\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\b(\u0010)J%\u0010(\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\b(\u0010*J\u000f\u0010+\u001a\u00020$H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b-\u0010\u0014J\u0017\u0010.\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b.\u0010#J\u001d\u0010/\u001a\u00020\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\b/\u0010)J\u001d\u00100\u001a\u00020\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\b0\u0010)J%\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u00101\u001a\u00020\b2\u0006\u00102\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u00104J)\u00108\u001a\b\u0012\u0004\u0012\u00028\u000106\"\u0004\b\u0001\u001052\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u000106H\u0016¢\u0006\u0004\b8\u00109J\u0017\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:06H\u0016¢\u0006\u0004\b8\u0010;J\u001a\u0010=\u001a\u00020\u000f2\b\u0010<\u001a\u0004\u0018\u00010:H\u0002¢\u0006\u0004\b=\u0010#J\u000f\u0010>\u001a\u00020\bH\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020$H\u0002¢\u0006\u0004\bC\u0010,J\u000f\u0010\u0001\u001a\u00020$H\u0002¢\u0006\u0004\b\u0001\u0010,J\u0017\u0010E\u001a\u00020$2\u0006\u0010D\u001a\u00020\bH\u0002¢\u0006\u0004\bE\u0010\u000bJ\u0017\u0010G\u001a\u00020$2\u0006\u0010F\u001a\u00020\bH\u0002¢\u0006\u0004\bG\u0010\u000bJ\u001b\u0010H\u001a\u00020\u000f2\n\u0010<\u001a\u0006\u0012\u0002\b\u00030\fH\u0002¢\u0006\u0004\bH\u0010IJ\u001f\u0010K\u001a\u00020$2\u0006\u0010J\u001a\u00020\b2\u0006\u0010D\u001a\u00020\bH\u0002¢\u0006\u0004\bK\u0010LJ\u001f\u0010M\u001a\u00020$2\u0006\u0010J\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\bM\u0010%J-\u0010N\u001a\u00020$2\u0006\u0010J\u001a\u00020\b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&2\u0006\u0010D\u001a\u00020\bH\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00028\u00002\u0006\u0010J\u001a\u00020\bH\u0002¢\u0006\u0004\bP\u0010\u0014J\u001f\u0010S\u001a\u00020$2\u0006\u0010Q\u001a\u00020\b2\u0006\u0010R\u001a\u00020\bH\u0002¢\u0006\u0004\bS\u0010LJ5\u0010U\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\b2\u0006\u0010R\u001a\u00020\b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&2\u0006\u0010T\u001a\u00020\u000fH\u0002¢\u0006\u0004\bU\u0010VR\u001c\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u0000068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Z\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010KR\u0016\u0010]\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\bW\u0010?¨\u0006`"}, d2 = {"LZH/b;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "LYH/h;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "initialCapacity", "<init>", "(I)V", "", "D", "()Ljava/util/List;", "", "isEmpty", "()Z", "index", "get", "(I)Ljava/lang/Object;", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "add", "(Ljava/lang/Object;)Z", "LXH/N;", "(ILjava/lang/Object;)V", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "clear", "()V", "b", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "T", "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "n", "H", "minCapacity", "G", "F", "(Ljava/util/List;)Z", "i", "I", "(II)V", "C", "B", "(ILjava/util/Collection;I)V", "K", "rangeOffset", "rangeLength", "L", "retain", "M", "(IILjava/util/Collection;Z)I", "a", "[Ljava/lang/Object;", "backing", "length", "c", "Z", "isReadOnly", "size", "d", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ZH.b  reason: case insensitive filesystem */
public final class C16997b<E> extends C16864h<E> implements List<E>, RandomAccess, Serializable, C17696d {

    /* renamed from: d  reason: collision with root package name */
    private static final C3444b f140743d = new C3444b((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private static final C16997b f140744e;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public E[] f140745a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public int f140746b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f140747c;

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u001a\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0001WBC\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0019\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010!H\u0016¢\u0006\u0004\b\"\u0010#J\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010!2\u0006\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010$J\u0017\u0010%\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010%\u001a\u00020'2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b%\u0010(J\u001d\u0010+\u001a\u00020\u00122\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b+\u0010,J%\u0010+\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b+\u0010-J\u000f\u0010.\u001a\u00020'H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b0\u0010\u0017J\u0017\u00101\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b1\u0010&J\u001d\u00102\u001a\u00020\u00122\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b2\u0010,J\u001d\u00103\u001a\u00020\u00122\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b3\u0010,J%\u00106\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u00104\u001a\u00020\n2\u0006\u00105\u001a\u00020\nH\u0016¢\u0006\u0004\b6\u00107J)\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00020\b\"\u0004\b\u0002\u001082\f\u00109\u001a\b\u0012\u0004\u0012\u00028\u00020\bH\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<0\bH\u0016¢\u0006\u0004\b:\u0010=J\u001a\u0010?\u001a\u00020\u00122\b\u0010>\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\b?\u0010&J\u000f\u0010@\u001a\u00020\nH\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020'H\u0002¢\u0006\u0004\bE\u0010/J\u000f\u0010F\u001a\u00020'H\u0002¢\u0006\u0004\bF\u0010/J\u000f\u0010G\u001a\u00020'H\u0002¢\u0006\u0004\bG\u0010/J\u001b\u0010I\u001a\u00020\u00122\n\u0010>\u001a\u0006\u0012\u0002\b\u00030HH\u0002¢\u0006\u0004\bI\u0010JJ\u001f\u0010L\u001a\u00020'2\u0006\u0010K\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0002¢\u0006\u0004\bL\u0010(J-\u0010N\u001a\u00020'2\u0006\u0010K\u001a\u00020\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)2\u0006\u0010M\u001a\u00020\nH\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010\u0001\u001a\u00028\u00012\u0006\u0010K\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0001\u0010\u0017J\u001f\u0010R\u001a\u00020'2\u0006\u0010P\u001a\u00020\n2\u0006\u0010Q\u001a\u00020\nH\u0002¢\u0006\u0004\bR\u0010SJ5\u0010U\u001a\u00020\n2\u0006\u0010P\u001a\u00020\n2\u0006\u0010Q\u001a\u00020\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)2\u0006\u0010T\u001a\u00020\u0012H\u0002¢\u0006\u0004\bU\u0010VR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u0010YR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bZ\u0010YR\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010_\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\bW\u0010AR\u0014\u0010a\u001a\u00020\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b`\u0010\u0014¨\u0006b"}, d2 = {"LZH/b$a;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "LYH/h;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "backing", "", "offset", "length", "parent", "LZH/b;", "root", "<init>", "([Ljava/lang/Object;IILZH/b$a;LZH/b;)V", "", "isEmpty", "()Z", "index", "get", "(I)Ljava/lang/Object;", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "add", "(Ljava/lang/Object;)Z", "LXH/N;", "(ILjava/lang/Object;)V", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "clear", "()V", "b", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "T", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "D", "x", "A", "", "B", "(Ljava/util/List;)Z", "i", "t", "n", "s", "(ILjava/util/Collection;I)V", "rangeOffset", "rangeLength", "F", "(II)V", "retain", "G", "(IILjava/util/Collection;Z)I", "a", "[Ljava/lang/Object;", "I", "c", "d", "LZH/b$a;", "e", "LZH/b;", "size", "C", "isReadOnly", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ZH.b$a */
    public static final class a<E> extends C16864h<E> implements List<E>, RandomAccess, Serializable, C17696d {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public E[] f140748a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final int f140749b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f140750c;

        /* renamed from: d  reason: collision with root package name */
        private final a<E> f140751d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final C16997b<E> f140752e;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00028\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010\u001e¨\u0006\""}, d2 = {"LZH/b$a$a;", "E", "", "LZH/b$a;", "list", "", "index", "<init>", "(LZH/b$a;I)V", "LXH/N;", "c", "()V", "", "hasPrevious", "()Z", "hasNext", "previousIndex", "()I", "nextIndex", "previous", "()Ljava/lang/Object;", "next", "element", "set", "(Ljava/lang/Object;)V", "add", "remove", "a", "LZH/b$a;", "b", "I", "lastIndex", "d", "expectedModCount", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ZH.b$a$a  reason: collision with other inner class name */
        private static final class C3443a<E> implements ListIterator<E>, C17693a {

            /* renamed from: a  reason: collision with root package name */
            private final a<E> f140753a;

            /* renamed from: b  reason: collision with root package name */
            private int f140754b;

            /* renamed from: c  reason: collision with root package name */
            private int f140755c = -1;

            /* renamed from: d  reason: collision with root package name */
            private int f140756d;

            public C3443a(a<E> aVar, int i10) {
                C17542s.j(aVar, "list");
                this.f140753a = aVar;
                this.f140754b = i10;
                this.f140756d = aVar.modCount;
            }

            private final void c() {
                if (this.f140753a.f140752e.modCount != this.f140756d) {
                    throw new ConcurrentModificationException();
                }
            }

            public void add(E e10) {
                c();
                a<E> aVar = this.f140753a;
                int i10 = this.f140754b;
                this.f140754b = i10 + 1;
                aVar.add(i10, e10);
                this.f140755c = -1;
                this.f140756d = this.f140753a.modCount;
            }

            public boolean hasNext() {
                return this.f140754b < this.f140753a.f140750c;
            }

            public boolean hasPrevious() {
                return this.f140754b > 0;
            }

            public E next() {
                c();
                if (this.f140754b < this.f140753a.f140750c) {
                    int i10 = this.f140754b;
                    this.f140754b = i10 + 1;
                    this.f140755c = i10;
                    return this.f140753a.f140748a[this.f140753a.f140749b + this.f140755c];
                }
                throw new NoSuchElementException();
            }

            public int nextIndex() {
                return this.f140754b;
            }

            public E previous() {
                c();
                int i10 = this.f140754b;
                if (i10 > 0) {
                    int i11 = i10 - 1;
                    this.f140754b = i11;
                    this.f140755c = i11;
                    return this.f140753a.f140748a[this.f140753a.f140749b + this.f140755c];
                }
                throw new NoSuchElementException();
            }

            public int previousIndex() {
                return this.f140754b - 1;
            }

            public void remove() {
                c();
                int i10 = this.f140755c;
                if (i10 != -1) {
                    this.f140753a.remove(i10);
                    this.f140754b = this.f140755c;
                    this.f140755c = -1;
                    this.f140756d = this.f140753a.modCount;
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }

            public void set(E e10) {
                c();
                int i10 = this.f140755c;
                if (i10 != -1) {
                    this.f140753a.set(i10, e10);
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
        }

        public a(E[] eArr, int i10, int i11, a<E> aVar, C16997b<E> bVar) {
            C17542s.j(eArr, "backing");
            C17542s.j(bVar, "root");
            this.f140748a = eArr;
            this.f140749b = i10;
            this.f140750c = i11;
            this.f140751d = aVar;
            this.f140752e = bVar;
            this.modCount = bVar.modCount;
        }

        private final void A() {
            if (C()) {
                throw new UnsupportedOperationException();
            }
        }

        private final boolean B(List<?> list) {
            return C16998c.h(this.f140748a, this.f140749b, this.f140750c, list);
        }

        private final boolean C() {
            return this.f140752e.f140747c;
        }

        private final void D() {
            this.modCount++;
        }

        private final E E(int i10) {
            D();
            a<E> aVar = this.f140751d;
            this.f140750c--;
            return aVar != null ? aVar.E(i10) : this.f140752e.K(i10);
        }

        private final void F(int i10, int i11) {
            if (i11 > 0) {
                D();
            }
            a<E> aVar = this.f140751d;
            if (aVar != null) {
                aVar.F(i10, i11);
            } else {
                this.f140752e.L(i10, i11);
            }
            this.f140750c -= i11;
        }

        private final int G(int i10, int i11, Collection<? extends E> collection, boolean z10) {
            a<E> aVar = this.f140751d;
            int G10 = aVar != null ? aVar.G(i10, i11, collection, z10) : this.f140752e.M(i10, i11, collection, z10);
            if (G10 > 0) {
                D();
            }
            this.f140750c -= G10;
            return G10;
        }

        private final void s(int i10, Collection<? extends E> collection, int i11) {
            D();
            a<E> aVar = this.f140751d;
            if (aVar != null) {
                aVar.s(i10, collection, i11);
            } else {
                this.f140752e.B(i10, collection, i11);
            }
            this.f140748a = this.f140752e.f140745a;
            this.f140750c += i11;
        }

        private final void t(int i10, E e10) {
            D();
            a<E> aVar = this.f140751d;
            if (aVar != null) {
                aVar.t(i10, e10);
            } else {
                this.f140752e.C(i10, e10);
            }
            this.f140748a = this.f140752e.f140745a;
            this.f140750c++;
        }

        private final void x() {
            if (this.f140752e.modCount != this.modCount) {
                throw new ConcurrentModificationException();
            }
        }

        public int a() {
            x();
            return this.f140750c;
        }

        public boolean add(E e10) {
            A();
            x();
            t(this.f140749b + this.f140750c, e10);
            return true;
        }

        public boolean addAll(Collection<? extends E> collection) {
            C17542s.j(collection, "elements");
            A();
            x();
            int size = collection.size();
            s(this.f140749b + this.f140750c, collection, size);
            return size > 0;
        }

        public E b(int i10) {
            A();
            x();
            C16860d.f140429a.b(i10, this.f140750c);
            return E(this.f140749b + i10);
        }

        public void clear() {
            A();
            x();
            F(this.f140749b, this.f140750c);
        }

        public boolean equals(Object obj) {
            x();
            return obj == this || ((obj instanceof List) && B((List) obj));
        }

        public E get(int i10) {
            x();
            C16860d.f140429a.b(i10, this.f140750c);
            return this.f140748a[this.f140749b + i10];
        }

        public int hashCode() {
            x();
            return C16998c.i(this.f140748a, this.f140749b, this.f140750c);
        }

        public int indexOf(Object obj) {
            x();
            for (int i10 = 0; i10 < this.f140750c; i10++) {
                if (C17542s.e(this.f140748a[this.f140749b + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        public boolean isEmpty() {
            x();
            return this.f140750c == 0;
        }

        public Iterator<E> iterator() {
            return listIterator(0);
        }

        public int lastIndexOf(Object obj) {
            x();
            for (int i10 = this.f140750c - 1; i10 >= 0; i10--) {
                if (C17542s.e(this.f140748a[this.f140749b + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        public ListIterator<E> listIterator() {
            return listIterator(0);
        }

        public boolean remove(Object obj) {
            A();
            x();
            int indexOf = indexOf(obj);
            if (indexOf >= 0) {
                remove(indexOf);
            }
            return indexOf >= 0;
        }

        public boolean removeAll(Collection<? extends Object> collection) {
            C17542s.j(collection, "elements");
            A();
            x();
            return G(this.f140749b, this.f140750c, collection, false) > 0;
        }

        public boolean retainAll(Collection<? extends Object> collection) {
            C17542s.j(collection, "elements");
            A();
            x();
            return G(this.f140749b, this.f140750c, collection, true) > 0;
        }

        public E set(int i10, E e10) {
            A();
            x();
            C16860d.f140429a.b(i10, this.f140750c);
            E[] eArr = this.f140748a;
            int i11 = this.f140749b;
            E e11 = eArr[i11 + i10];
            eArr[i11 + i10] = e10;
            return e11;
        }

        public List<E> subList(int i10, int i11) {
            C16860d.f140429a.d(i10, i11, this.f140750c);
            return new a(this.f140748a, this.f140749b + i10, i11 - i10, this, this.f140752e);
        }

        public <T> T[] toArray(T[] tArr) {
            C17542s.j(tArr, "array");
            x();
            int length = tArr.length;
            int i10 = this.f140750c;
            if (length < i10) {
                E[] eArr = this.f140748a;
                int i11 = this.f140749b;
                T[] copyOfRange = Arrays.copyOfRange(eArr, i11, i10 + i11, tArr.getClass());
                C17542s.i(copyOfRange, "copyOfRange(...)");
                return copyOfRange;
            }
            E[] eArr2 = this.f140748a;
            int i12 = this.f140749b;
            C16870n.n(eArr2, tArr, 0, i12, i10 + i12);
            return C16877v.g(this.f140750c, tArr);
        }

        public String toString() {
            x();
            return C16998c.j(this.f140748a, this.f140749b, this.f140750c, this);
        }

        public ListIterator<E> listIterator(int i10) {
            x();
            C16860d.f140429a.c(i10, this.f140750c);
            return new C3443a(this, i10);
        }

        public void add(int i10, E e10) {
            A();
            x();
            C16860d.f140429a.c(i10, this.f140750c);
            t(this.f140749b + i10, e10);
        }

        public boolean addAll(int i10, Collection<? extends E> collection) {
            C17542s.j(collection, "elements");
            A();
            x();
            C16860d.f140429a.c(i10, this.f140750c);
            int size = collection.size();
            s(this.f140749b + i10, collection, size);
            return size > 0;
        }

        public Object[] toArray() {
            x();
            E[] eArr = this.f140748a;
            int i10 = this.f140749b;
            return C16870n.u(eArr, i10, this.f140750c + i10);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LZH/b$b;", "", "<init>", "()V", "LZH/b;", "", "Empty", "LZH/b;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ZH.b$b  reason: collision with other inner class name */
    private static final class C3444b {
        public /* synthetic */ C3444b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3444b() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010\u001e¨\u0006\""}, d2 = {"LZH/b$c;", "E", "", "LZH/b;", "list", "", "index", "<init>", "(LZH/b;I)V", "LXH/N;", "c", "()V", "", "hasPrevious", "()Z", "hasNext", "previousIndex", "()I", "nextIndex", "previous", "()Ljava/lang/Object;", "next", "element", "set", "(Ljava/lang/Object;)V", "add", "remove", "a", "LZH/b;", "b", "I", "lastIndex", "d", "expectedModCount", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ZH.b$c */
    private static final class c<E> implements ListIterator<E>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        private final C16997b<E> f140757a;

        /* renamed from: b  reason: collision with root package name */
        private int f140758b;

        /* renamed from: c  reason: collision with root package name */
        private int f140759c = -1;

        /* renamed from: d  reason: collision with root package name */
        private int f140760d;

        public c(C16997b<E> bVar, int i10) {
            C17542s.j(bVar, "list");
            this.f140757a = bVar;
            this.f140758b = i10;
            this.f140760d = bVar.modCount;
        }

        private final void c() {
            if (this.f140757a.modCount != this.f140760d) {
                throw new ConcurrentModificationException();
            }
        }

        public void add(E e10) {
            c();
            C16997b<E> bVar = this.f140757a;
            int i10 = this.f140758b;
            this.f140758b = i10 + 1;
            bVar.add(i10, e10);
            this.f140759c = -1;
            this.f140760d = this.f140757a.modCount;
        }

        public boolean hasNext() {
            return this.f140758b < this.f140757a.f140746b;
        }

        public boolean hasPrevious() {
            return this.f140758b > 0;
        }

        public E next() {
            c();
            if (this.f140758b < this.f140757a.f140746b) {
                int i10 = this.f140758b;
                this.f140758b = i10 + 1;
                this.f140759c = i10;
                return this.f140757a.f140745a[this.f140759c];
            }
            throw new NoSuchElementException();
        }

        public int nextIndex() {
            return this.f140758b;
        }

        public E previous() {
            c();
            int i10 = this.f140758b;
            if (i10 > 0) {
                int i11 = i10 - 1;
                this.f140758b = i11;
                this.f140759c = i11;
                return this.f140757a.f140745a[this.f140759c];
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return this.f140758b - 1;
        }

        public void remove() {
            c();
            int i10 = this.f140759c;
            if (i10 != -1) {
                this.f140757a.remove(i10);
                this.f140758b = this.f140759c;
                this.f140759c = -1;
                this.f140760d = this.f140757a.modCount;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }

        public void set(E e10) {
            c();
            int i10 = this.f140759c;
            if (i10 != -1) {
                this.f140757a.set(i10, e10);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
        }
    }

    static {
        C16997b bVar = new C16997b(0);
        bVar.f140747c = true;
        f140744e = bVar;
    }

    public C16997b() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public final void B(int i10, Collection<? extends E> collection, int i11) {
        J();
        I(i10, i11);
        Iterator<? extends E> it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f140745a[i10 + i12] = it.next();
        }
    }

    /* access modifiers changed from: private */
    public final void C(int i10, E e10) {
        J();
        I(i10, 1);
        this.f140745a[i10] = e10;
    }

    private final void E() {
        if (this.f140747c) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean F(List<?> list) {
        return C16998c.h(this.f140745a, 0, this.f140746b, list);
    }

    private final void G(int i10) {
        if (i10 >= 0) {
            E[] eArr = this.f140745a;
            if (i10 > eArr.length) {
                this.f140745a = C16998c.e(this.f140745a, C16860d.f140429a.e(eArr.length, i10));
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void H(int i10) {
        G(this.f140746b + i10);
    }

    private final void I(int i10, int i11) {
        H(i11);
        E[] eArr = this.f140745a;
        C16870n.n(eArr, eArr, i10 + i11, i10, this.f140746b);
        this.f140746b += i11;
    }

    private final void J() {
        this.modCount++;
    }

    /* access modifiers changed from: private */
    public final E K(int i10) {
        J();
        E[] eArr = this.f140745a;
        E e10 = eArr[i10];
        C16870n.n(eArr, eArr, i10, i10 + 1, this.f140746b);
        C16998c.f(this.f140745a, this.f140746b - 1);
        this.f140746b--;
        return e10;
    }

    /* access modifiers changed from: private */
    public final void L(int i10, int i11) {
        if (i11 > 0) {
            J();
        }
        E[] eArr = this.f140745a;
        C16870n.n(eArr, eArr, i10, i10 + i11, this.f140746b);
        E[] eArr2 = this.f140745a;
        int i12 = this.f140746b;
        C16998c.g(eArr2, i12 - i11, i12);
        this.f140746b -= i11;
    }

    /* access modifiers changed from: private */
    public final int M(int i10, int i11, Collection<? extends E> collection, boolean z10) {
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f140745a[i14]) == z10) {
                E[] eArr = this.f140745a;
                i12++;
                eArr[i13 + i10] = eArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        E[] eArr2 = this.f140745a;
        C16870n.n(eArr2, eArr2, i10 + i13, i11 + i10, this.f140746b);
        E[] eArr3 = this.f140745a;
        int i16 = this.f140746b;
        C16998c.g(eArr3, i16 - i15, i16);
        if (i15 > 0) {
            J();
        }
        this.f140746b -= i15;
        return i15;
    }

    public final List<E> D() {
        E();
        this.f140747c = true;
        return this.f140746b > 0 ? this : f140744e;
    }

    public int a() {
        return this.f140746b;
    }

    public boolean add(E e10) {
        E();
        C(this.f140746b, e10);
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        C17542s.j(collection, "elements");
        E();
        int size = collection.size();
        B(this.f140746b, collection, size);
        return size > 0;
    }

    public E b(int i10) {
        E();
        C16860d.f140429a.b(i10, this.f140746b);
        return K(i10);
    }

    public void clear() {
        E();
        L(0, this.f140746b);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof List) && F((List) obj));
    }

    public E get(int i10) {
        C16860d.f140429a.b(i10, this.f140746b);
        return this.f140745a[i10];
    }

    public int hashCode() {
        return C16998c.i(this.f140745a, 0, this.f140746b);
    }

    public int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f140746b; i10++) {
            if (C17542s.e(this.f140745a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f140746b == 0;
    }

    public Iterator<E> iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        for (int i10 = this.f140746b - 1; i10 >= 0; i10--) {
            if (C17542s.e(this.f140745a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    public boolean remove(Object obj) {
        E();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        return indexOf >= 0;
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        C17542s.j(collection, "elements");
        E();
        return M(0, this.f140746b, collection, false) > 0;
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        C17542s.j(collection, "elements");
        E();
        return M(0, this.f140746b, collection, true) > 0;
    }

    public E set(int i10, E e10) {
        E();
        C16860d.f140429a.b(i10, this.f140746b);
        E[] eArr = this.f140745a;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        return e11;
    }

    public List<E> subList(int i10, int i11) {
        C16860d.f140429a.d(i10, i11, this.f140746b);
        return new a(this.f140745a, i10, i11 - i10, (a) null, this);
    }

    public <T> T[] toArray(T[] tArr) {
        C17542s.j(tArr, "array");
        int length = tArr.length;
        int i10 = this.f140746b;
        if (length < i10) {
            T[] copyOfRange = Arrays.copyOfRange(this.f140745a, 0, i10, tArr.getClass());
            C17542s.i(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        C16870n.n(this.f140745a, tArr, 0, 0, i10);
        return C16877v.g(this.f140746b, tArr);
    }

    public String toString() {
        return C16998c.j(this.f140745a, 0, this.f140746b, this);
    }

    public C16997b(int i10) {
        this.f140745a = C16998c.d(i10);
    }

    public ListIterator<E> listIterator(int i10) {
        C16860d.f140429a.c(i10, this.f140746b);
        return new c(this, i10);
    }

    public void add(int i10, E e10) {
        E();
        C16860d.f140429a.c(i10, this.f140746b);
        C(i10, e10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16997b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }

    public boolean addAll(int i10, Collection<? extends E> collection) {
        C17542s.j(collection, "elements");
        E();
        C16860d.f140429a.c(i10, this.f140746b);
        int size = collection.size();
        B(i10, collection, size);
        return size > 0;
    }

    public Object[] toArray() {
        return C16870n.u(this.f140745a, 0, this.f140746b);
    }
}
