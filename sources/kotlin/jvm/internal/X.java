package kotlin.jvm.internal;

import XH.C16807N;
import XH.t;
import kotlin.Metadata;
import uI.C18069r;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/jvm/internal/X;", "LuI/r;", "a", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class X implements C18069r {

    /* renamed from: a  reason: collision with root package name */
    public static final a f144354a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/jvm/internal/X$a;", "", "<init>", "()V", "LuI/r;", "typeParameter", "", "a", "(LuI/r;)Ljava/lang/String;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: kotlin.jvm.internal.X$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C3522a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f144355a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    uI.t[] r0 = uI.C18071t.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    uI.t r1 = uI.C18071t.INVARIANT     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    uI.t r1 = uI.C18071t.IN     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    uI.t r1 = uI.C18071t.OUT     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f144355a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.X.a.C3522a.<clinit>():void");
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(C18069r rVar) {
            C17542s.j(rVar, "typeParameter");
            StringBuilder sb2 = new StringBuilder();
            int i10 = C3522a.f144355a[rVar.o().ordinal()];
            if (i10 == 1) {
                C16807N n10 = C16807N.f139792a;
            } else if (i10 == 2) {
                sb2.append("in ");
            } else if (i10 == 3) {
                sb2.append("out ");
            } else {
                throw new t();
            }
            sb2.append(rVar.getName());
            return sb2.toString();
        }

        private a() {
        }
    }
}
