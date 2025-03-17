package gK;

import IJ.C15906b;
import JJ.C15969b;
import XH.C16795B;
import XH.C16797D;
import XH.C16798E;
import XH.C16799F;
import XH.C16800G;
import XH.C16801H;
import XH.C16802I;
import XH.C16804K;
import XH.C16805L;
import XH.C16807N;
import XH.v;
import jK.C17437B;
import jK.C17438C;
import jK.C17439D;
import jK.C17446c0;
import jK.C17450e0;
import jK.C17451f;
import jK.C17455h;
import jK.C17456h0;
import jK.C17457i;
import jK.C17458i0;
import jK.C17461k;
import jK.C17462k0;
import jK.C17463l;
import jK.C17473q;
import jK.C17479t0;
import jK.C17481u0;
import jK.C17491z0;
import jK.L;
import jK.M;
import jK.R0;
import jK.W;
import jK.W0;
import jK.X;
import jK.X0;
import jK.Y0;
import jK.e1;
import jK.h1;
import jK.i1;
import jK.k1;
import jK.l1;
import jK.n1;
import jK.o1;
import jK.q1;
import jK.r;
import jK.r1;
import jK.s1;
import jK.t1;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17528d;
import kotlin.jvm.internal.C17529e;
import kotlin.jvm.internal.C17531g;
import kotlin.jvm.internal.C17535k;
import kotlin.jvm.internal.C17536l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17545v;
import kotlin.jvm.internal.T;
import kotlin.jvm.internal.V;
import kotlinx.serialization.KSerializer;
import uI.C18055d;

@Metadata(d1 = {"\u0000Ô\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\u001aG\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001aG\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b0\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\t\u0010\u0007\u001aa\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00100\u0002\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b\"\u0004\b\u0002\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0002*\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0002*\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0002¢\u0006\u0004\b\u001f\u0010\u0019\u001a\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0002H\u0007¢\u0006\u0004\b!\u0010\u0019\u001a\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u0002*\u00020\"¢\u0006\u0004\b$\u0010%\u001a\u0013\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0002¢\u0006\u0004\b'\u0010\u0019\u001a\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u0002H\u0007¢\u0006\u0004\b)\u0010\u0019\u001a\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u0002*\u00020*¢\u0006\u0004\b,\u0010-\u001a\u0013\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u0002¢\u0006\u0004\b/\u0010\u0019\u001a\u0015\u00101\u001a\b\u0012\u0004\u0012\u0002000\u0002H\u0007¢\u0006\u0004\b1\u0010\u0019\u001a\u0017\u00104\u001a\b\u0012\u0004\u0012\u0002030\u0002*\u000202¢\u0006\u0004\b4\u00105\u001a\u0013\u00107\u001a\b\u0012\u0004\u0012\u0002060\u0002¢\u0006\u0004\b7\u0010\u0019\u001a\u0015\u00109\u001a\b\u0012\u0004\u0012\u0002080\u0002H\u0007¢\u0006\u0004\b9\u0010\u0019\u001a\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u0002*\u00020:¢\u0006\u0004\b<\u0010=\u001a\u0013\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u0002¢\u0006\u0004\b?\u0010\u0019\u001a\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\u0002*\u00020@¢\u0006\u0004\bB\u0010C\u001a\u0013\u0010E\u001a\b\u0012\u0004\u0012\u00020D0\u0002¢\u0006\u0004\bE\u0010\u0019\u001a\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020G0\u0002*\u00020F¢\u0006\u0004\b\f\u0010H\u001a\u0013\u0010J\u001a\b\u0012\u0004\u0012\u00020I0\u0002¢\u0006\u0004\bJ\u0010\u0019\u001a\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020K0\u0002*\u00020K¢\u0006\u0004\b\u000b\u0010L\u001a\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020N0\u0002*\u00020M¢\u0006\u0004\b\u0000\u0010O\u001aM\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010U0\u0002\"\b\b\u0000\u0010Q*\u00020P\"\n\b\u0001\u0010\u0015*\u0004\u0018\u00018\u00002\f\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000R2\f\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0007¢\u0006\u0004\bV\u0010W\u001a-\u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000X0\u0002\"\u0004\b\u0000\u0010Q2\f\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\bY\u0010Z\u001a-\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000[0\u0002\"\u0004\b\u0000\u0010Q2\f\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\\\u0010Z\u001aG\u0010^\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010]0\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b^\u0010\u0007\u001a\u0017\u0010a\u001a\b\u0012\u0004\u0012\u00020`0\u0002*\u00020_¢\u0006\u0004\ba\u0010b\u001a\u0017\u0010e\u001a\b\u0012\u0004\u0012\u00020d0\u0002*\u00020c¢\u0006\u0004\be\u0010f\u001a\u0017\u0010i\u001a\b\u0012\u0004\u0012\u00020h0\u0002*\u00020g¢\u0006\u0004\bi\u0010j\u001a\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020l0\u0002*\u00020k¢\u0006\u0004\b\n\u0010m\u001a\u0017\u0010p\u001a\b\u0012\u0004\u0012\u00020o0\u0002*\u00020n¢\u0006\u0004\bp\u0010q\u001a\u0019\u0010t\u001a\b\u0012\u0004\u0012\u00020s0\u0002*\u00020rH\u0007¢\u0006\u0004\bt\u0010u\u001a\u0015\u0010w\u001a\b\u0012\u0004\u0012\u00020v0\u0002H\u0007¢\u0006\u0004\bw\u0010\u0019\"3\u0010{\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002\"\b\b\u0000\u0010Q*\u00020P*\b\u0012\u0004\u0012\u00028\u00000\u00028F¢\u0006\f\u0012\u0004\by\u0010z\u001a\u0004\bx\u0010Z¨\u0006|"}, d2 = {"K", "V", "Lkotlinx/serialization/KSerializer;", "keySerializer", "valueSerializer", "LXH/v;", "m", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "", "j", "A", "B", "C", "aSerializer", "bSerializer", "cSerializer", "LXH/B;", "p", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "Lkotlin/Char$Companion;", "", "E", "(Lkotlin/jvm/internal/g;)Lkotlinx/serialization/KSerializer;", "", "d", "()Lkotlinx/serialization/KSerializer;", "Lkotlin/Byte$Companion;", "", "D", "(Lkotlin/jvm/internal/e;)Lkotlinx/serialization/KSerializer;", "", "c", "LXH/E;", "q", "Lkotlin/Short$Companion;", "", "J", "(Lkotlin/jvm/internal/T;)Lkotlinx/serialization/KSerializer;", "", "o", "LXH/L;", "t", "Lkotlin/Int$Companion;", "", "H", "(Lkotlin/jvm/internal/r;)Lkotlinx/serialization/KSerializer;", "", "g", "LXH/G;", "r", "Lkotlin/Long$Companion;", "", "I", "(Lkotlin/jvm/internal/v;)Lkotlinx/serialization/KSerializer;", "", "i", "LXH/I;", "s", "Lkotlin/Float$Companion;", "", "G", "(Lkotlin/jvm/internal/l;)Lkotlinx/serialization/KSerializer;", "", "f", "Lkotlin/Double$Companion;", "", "F", "(Lkotlin/jvm/internal/k;)Lkotlinx/serialization/KSerializer;", "", "e", "Lkotlin/Boolean$Companion;", "", "(Lkotlin/jvm/internal/d;)Lkotlinx/serialization/KSerializer;", "", "b", "LXH/N;", "(LXH/N;)Lkotlinx/serialization/KSerializer;", "Lkotlin/String$Companion;", "", "(Lkotlin/jvm/internal/V;)Lkotlinx/serialization/KSerializer;", "", "T", "LuI/d;", "kClass", "elementSerializer", "", "a", "(LuI/d;Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "", "h", "(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "", "n", "", "k", "LXH/F$a;", "LXH/F;", "y", "(LXH/F$a;)Lkotlinx/serialization/KSerializer;", "LXH/H$a;", "LXH/H;", "z", "(LXH/H$a;)Lkotlinx/serialization/KSerializer;", "LXH/D$a;", "LXH/D;", "x", "(LXH/D$a;)Lkotlinx/serialization/KSerializer;", "LXH/K$a;", "LXH/K;", "(LXH/K$a;)Lkotlinx/serialization/KSerializer;", "LIJ/b$a;", "LIJ/b;", "v", "(LIJ/b$a;)Lkotlinx/serialization/KSerializer;", "LJJ/b$a;", "LJJ/b;", "w", "(LJJ/b$a;)Lkotlinx/serialization/KSerializer;", "", "l", "u", "getNullable$annotations", "(Lkotlinx/serialization/KSerializer;)V", "nullable", "kotlinx-serialization-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: gK.a  reason: case insensitive filesystem */
public final class C17294a {
    public static final KSerializer<C16804K> A(C16804K.a aVar) {
        C17542s.j(aVar, "<this>");
        return r1.f144156a;
    }

    public static final KSerializer<C16807N> B(C16807N n10) {
        C17542s.j(n10, "<this>");
        return s1.f144161b;
    }

    public static final KSerializer<Boolean> C(C17528d dVar) {
        C17542s.j(dVar, "<this>");
        return C17457i.f144111a;
    }

    public static final KSerializer<Byte> D(C17529e eVar) {
        C17542s.j(eVar, "<this>");
        return C17463l.f144128a;
    }

    public static final KSerializer<Character> E(C17531g gVar) {
        C17542s.j(gVar, "<this>");
        return r.f144152a;
    }

    public static final KSerializer<Double> F(C17535k kVar) {
        C17542s.j(kVar, "<this>");
        return C17438C.f144010a;
    }

    public static final KSerializer<Float> G(C17536l lVar) {
        C17542s.j(lVar, "<this>");
        return M.f144051a;
    }

    public static final KSerializer<Integer> H(kotlin.jvm.internal.r rVar) {
        C17542s.j(rVar, "<this>");
        return X.f144073a;
    }

    public static final KSerializer<Long> I(C17545v vVar) {
        C17542s.j(vVar, "<this>");
        return C17458i0.f144113a;
    }

    public static final KSerializer<Short> J(T t10) {
        C17542s.j(t10, "<this>");
        return X0.f144075a;
    }

    public static final KSerializer<String> K(V v10) {
        C17542s.j(v10, "<this>");
        return Y0.f144077a;
    }

    public static final <T, E extends T> KSerializer<E[]> a(C18055d<T> dVar, KSerializer<E> kSerializer) {
        C17542s.j(dVar, "kClass");
        C17542s.j(kSerializer, "elementSerializer");
        return new R0(dVar, kSerializer);
    }

    public static final KSerializer<boolean[]> b() {
        return C17455h.f144108c;
    }

    public static final KSerializer<byte[]> c() {
        return C17461k.f144123c;
    }

    public static final KSerializer<char[]> d() {
        return C17473q.f144150c;
    }

    public static final KSerializer<double[]> e() {
        return C17437B.f144009c;
    }

    public static final KSerializer<float[]> f() {
        return L.f144049c;
    }

    public static final KSerializer<int[]> g() {
        return W.f144071c;
    }

    public static final <T> KSerializer<List<T>> h(KSerializer<T> kSerializer) {
        C17542s.j(kSerializer, "elementSerializer");
        return new C17451f(kSerializer);
    }

    public static final KSerializer<long[]> i() {
        return C17456h0.f144109c;
    }

    public static final <K, V> KSerializer<Map.Entry<K, V>> j(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        C17542s.j(kSerializer, "keySerializer");
        C17542s.j(kSerializer2, "valueSerializer");
        return new C17462k0(kSerializer, kSerializer2);
    }

    public static final <K, V> KSerializer<Map<K, V>> k(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        C17542s.j(kSerializer, "keySerializer");
        C17542s.j(kSerializer2, "valueSerializer");
        return new C17446c0(kSerializer, kSerializer2);
    }

    public static final KSerializer l() {
        return C17479t0.f144167a;
    }

    public static final <K, V> KSerializer<v<K, V>> m(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        C17542s.j(kSerializer, "keySerializer");
        C17542s.j(kSerializer2, "valueSerializer");
        return new C17491z0(kSerializer, kSerializer2);
    }

    public static final <T> KSerializer<Set<T>> n(KSerializer<T> kSerializer) {
        C17542s.j(kSerializer, "elementSerializer");
        return new C17450e0(kSerializer);
    }

    public static final KSerializer<short[]> o() {
        return W0.f144072c;
    }

    public static final <A, B, C> KSerializer<C16795B<A, B, C>> p(KSerializer<A> kSerializer, KSerializer<B> kSerializer2, KSerializer<C> kSerializer3) {
        C17542s.j(kSerializer, "aSerializer");
        C17542s.j(kSerializer2, "bSerializer");
        C17542s.j(kSerializer3, "cSerializer");
        return new e1(kSerializer, kSerializer2, kSerializer3);
    }

    public static final KSerializer<C16798E> q() {
        return h1.f144110c;
    }

    public static final KSerializer<C16800G> r() {
        return k1.f144127c;
    }

    public static final KSerializer<C16802I> s() {
        return n1.f144142c;
    }

    public static final KSerializer<C16805L> t() {
        return q1.f144151c;
    }

    public static final <T> KSerializer<T> u(KSerializer<T> kSerializer) {
        C17542s.j(kSerializer, "<this>");
        return kSerializer.getDescriptor().b() ? kSerializer : new C17481u0(kSerializer);
    }

    public static final KSerializer<C15906b> v(C15906b.a aVar) {
        C17542s.j(aVar, "<this>");
        return C17439D.f144012a;
    }

    public static final KSerializer<C15969b> w(C15969b.a aVar) {
        C17542s.j(aVar, "<this>");
        return t1.f144169a;
    }

    public static final KSerializer<C16797D> x(C16797D.a aVar) {
        C17542s.j(aVar, "<this>");
        return i1.f144115a;
    }

    public static final KSerializer<C16799F> y(C16799F.a aVar) {
        C17542s.j(aVar, "<this>");
        return l1.f144134a;
    }

    public static final KSerializer<C16801H> z(C16801H.a aVar) {
        C17542s.j(aVar, "<this>");
        return o1.f144144a;
    }
}
