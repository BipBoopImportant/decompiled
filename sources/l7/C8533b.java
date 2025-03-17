package l7;

import GJ.C15767j;
import GJ.C15768k;
import XH.C16807N;
import dI.C17164e;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import nI.p;
import oI.C17693a;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\b\b`\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H&¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H&¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Ll7/b;", "", "", "", "index", "get", "(I)B", "fromIndex", "toIndex", "", "P2", "(II)[B", "e0", "(II)Ll7/b;", "a", "()I", "size", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: l7.b  reason: case insensitive filesystem */
public interface C8533b extends Iterable<Byte>, C17693a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: l7.b$a */
    public static final class a {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LGJ/j;", "", "LXH/N;", "<anonymous>", "(LGJ/j;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.appmattus.certificatetransparency.internal.utils.asn1.bytes.ByteBuffer$iterator$1", f = "ByteBuffer.kt", l = {34}, m = "invokeSuspend")
        /* renamed from: l7.b$a$a  reason: collision with other inner class name */
        static final class C0869a extends k implements p<C15767j<? super Byte>, C17164e<? super C16807N>, Object> {

            /* renamed from: d  reason: collision with root package name */
            int f54787d;

            /* renamed from: e  reason: collision with root package name */
            int f54788e;

            /* renamed from: f  reason: collision with root package name */
            int f54789f;

            /* renamed from: g  reason: collision with root package name */
            private /* synthetic */ Object f54790g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ C8533b f54791h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0869a(C8533b bVar, C17164e<? super C0869a> eVar) {
                super(2, eVar);
                this.f54791h = bVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                C0869a aVar = new C0869a(this.f54791h, eVar);
                aVar.f54790g = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(C15767j<? super Byte> jVar, C17164e<? super C16807N> eVar) {
                return ((C0869a) create(jVar, eVar)).invokeSuspend(C16807N.f139792a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = eI.C17187b.f()
                    int r1 = r5.f54789f
                    r2 = 1
                    if (r1 == 0) goto L_0x001f
                    if (r1 != r2) goto L_0x0017
                    int r1 = r5.f54788e
                    int r3 = r5.f54787d
                    java.lang.Object r4 = r5.f54790g
                    GJ.j r4 = (GJ.C15767j) r4
                    XH.y.b(r6)
                    goto L_0x0049
                L_0x0017:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L_0x001f:
                    XH.y.b(r6)
                    java.lang.Object r6 = r5.f54790g
                    GJ.j r6 = (GJ.C15767j) r6
                    l7.b r1 = r5.f54791h
                    int r1 = r1.a()
                    r3 = 0
                    r4 = r6
                L_0x002e:
                    if (r3 >= r1) goto L_0x004b
                    l7.b r6 = r5.f54791h
                    byte r6 = r6.get(r3)
                    java.lang.Byte r6 = kotlin.coroutines.jvm.internal.b.b(r6)
                    r5.f54790g = r4
                    r5.f54787d = r3
                    r5.f54788e = r1
                    r5.f54789f = r2
                    java.lang.Object r6 = r4.d(r6, r5)
                    if (r6 != r0) goto L_0x0049
                    return r0
                L_0x0049:
                    int r3 = r3 + r2
                    goto L_0x002e
                L_0x004b:
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: l7.C8533b.a.C0869a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public static Iterator<Byte> a(C8533b bVar) {
            return C15768k.a(new C0869a(bVar, (C17164e<? super C0869a>) null));
        }
    }

    byte[] P2(int i10, int i11);

    int a();

    C8533b e0(int i10, int i11);

    byte get(int i10);
}
