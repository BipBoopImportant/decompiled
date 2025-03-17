package HJ;

import GJ.C15765h;
import XH.v;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;
import oI.C17693a;
import tI.C17974j;
import tI.C17978n;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012&\u0010\n\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R4\u0010\n\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t0\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LHJ/e;", "LGJ/h;", "LtI/j;", "", "input", "", "startIndex", "limit", "Lkotlin/Function2;", "LXH/v;", "getNextMatch", "<init>", "(Ljava/lang/CharSequence;IILnI/p;)V", "", "iterator", "()Ljava/util/Iterator;", "a", "Ljava/lang/CharSequence;", "b", "I", "c", "d", "LnI/p;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: HJ.e  reason: case insensitive filesystem */
final class C15839e implements C15765h<C17974j> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f135287a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final int f135288b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final int f135289c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final p<CharSequence, Integer, v<Integer, Integer>> f135290d;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\"\u0010\u0019\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011R$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\u001dR\"\u0010\"\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\r\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011¨\u0006#"}, d2 = {"HJ/e$a", "", "LtI/j;", "LXH/N;", "c", "()V", "d", "()LtI/j;", "", "hasNext", "()Z", "", "a", "I", "getNextState", "()I", "setNextState", "(I)V", "nextState", "b", "getCurrentStartIndex", "setCurrentStartIndex", "currentStartIndex", "getNextSearchIndex", "setNextSearchIndex", "nextSearchIndex", "LtI/j;", "getNextItem", "setNextItem", "(LtI/j;)V", "nextItem", "e", "getCounter", "setCounter", "counter", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: HJ.e$a */
    public static final class a implements Iterator<C17974j>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        private int f135291a = -1;

        /* renamed from: b  reason: collision with root package name */
        private int f135292b;

        /* renamed from: c  reason: collision with root package name */
        private int f135293c;

        /* renamed from: d  reason: collision with root package name */
        private C17974j f135294d;

        /* renamed from: e  reason: collision with root package name */
        private int f135295e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C15839e f135296f;

        a(C15839e eVar) {
            this.f135296f = eVar;
            int m10 = C17978n.m(eVar.f135288b, 0, eVar.f135287a.length());
            this.f135292b = m10;
            this.f135293c = m10;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
            if (r0 < HJ.C15839e.e(r6.f135296f)) goto L_0x0023;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void c() {
            /*
                r6 = this;
                int r0 = r6.f135293c
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r6.f135291a = r1
                r0 = 0
                r6.f135294d = r0
                goto L_0x009e
            L_0x000c:
                HJ.e r0 = r6.f135296f
                int r0 = r0.f135289c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0023
                int r0 = r6.f135295e
                int r0 = r0 + r3
                r6.f135295e = r0
                HJ.e r4 = r6.f135296f
                int r4 = r4.f135289c
                if (r0 >= r4) goto L_0x0031
            L_0x0023:
                int r0 = r6.f135293c
                HJ.e r4 = r6.f135296f
                java.lang.CharSequence r4 = r4.f135287a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0047
            L_0x0031:
                tI.j r0 = new tI.j
                int r1 = r6.f135292b
                HJ.e r4 = r6.f135296f
                java.lang.CharSequence r4 = r4.f135287a
                int r4 = HJ.C15854t.m0(r4)
                r0.<init>(r1, r4)
                r6.f135294d = r0
                r6.f135293c = r2
                goto L_0x009c
            L_0x0047:
                HJ.e r0 = r6.f135296f
                nI.p r0 = r0.f135290d
                HJ.e r4 = r6.f135296f
                java.lang.CharSequence r4 = r4.f135287a
                int r5 = r6.f135293c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                XH.v r0 = (XH.v) r0
                if (r0 != 0) goto L_0x0077
                tI.j r0 = new tI.j
                int r1 = r6.f135292b
                HJ.e r4 = r6.f135296f
                java.lang.CharSequence r4 = r4.f135287a
                int r4 = HJ.C15854t.m0(r4)
                r0.<init>(r1, r4)
                r6.f135294d = r0
                r6.f135293c = r2
                goto L_0x009c
            L_0x0077:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f135292b
                tI.j r4 = tI.C17978n.w(r4, r2)
                r6.f135294d = r4
                int r2 = r2 + r0
                r6.f135292b = r2
                if (r0 != 0) goto L_0x0099
                r1 = r3
            L_0x0099:
                int r2 = r2 + r1
                r6.f135293c = r2
            L_0x009c:
                r6.f135291a = r3
            L_0x009e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: HJ.C15839e.a.c():void");
        }

        /* renamed from: d */
        public C17974j next() {
            if (this.f135291a == -1) {
                c();
            }
            if (this.f135291a != 0) {
                C17974j jVar = this.f135294d;
                C17542s.h(jVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f135294d = null;
                this.f135291a = -1;
                return jVar;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f135291a == -1) {
                c();
            }
            return this.f135291a == 1;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C15839e(CharSequence charSequence, int i10, int i11, p<? super CharSequence, ? super Integer, v<Integer, Integer>> pVar) {
        C17542s.j(charSequence, "input");
        C17542s.j(pVar, "getNextMatch");
        this.f135287a = charSequence;
        this.f135288b = i10;
        this.f135289c = i11;
        this.f135290d = pVar;
    }

    public Iterator<C17974j> iterator() {
        return new a(this);
    }
}
