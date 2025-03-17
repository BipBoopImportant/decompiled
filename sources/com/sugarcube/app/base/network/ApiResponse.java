package com.sugarcube.app.base.network;

import QL.x;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u0010*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0001\u0002\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/sugarcube/app/base/network/ApiResponse;", "T", "", "<init>", "()V", "body", "()Ljava/lang/Object;", "code", "", "getCode", "()I", "cause", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getCause", "()Ljava/lang/Exception;", "Companion", "Success", "Failure", "Lcom/sugarcube/app/base/network/ApiResponse$Failure;", "Lcom/sugarcube/app/base/network/ApiResponse$Success;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ApiResponse<T> {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final Exception cause;
    private final int code;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0001\u0010\u00042\"\u0010\b\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005H@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/network/ApiResponse$Companion;", "", "<init>", "()V", "T", "Lkotlin/Function1;", "LdI/e;", "LQL/x;", "apiCall", "Lcom/sugarcube/app/base/network/ApiResponse;", "call", "(LnI/l;LdI/e;)Ljava/lang/Object;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x005a A[Catch:{ Exception -> 0x0036 }] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0060 A[Catch:{ Exception -> 0x0036 }] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final <T> java.lang.Object call(nI.C17642l<? super dI.C17164e<? super QL.x<T>>, ? extends java.lang.Object> r7, dI.C17164e<? super com.sugarcube.app.base.network.ApiResponse<T>> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.sugarcube.app.base.network.ApiResponse$Companion$call$1
                if (r0 == 0) goto L_0x0013
                r0 = r8
                com.sugarcube.app.base.network.ApiResponse$Companion$call$1 r0 = (com.sugarcube.app.base.network.ApiResponse$Companion$call$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                com.sugarcube.app.base.network.ApiResponse$Companion$call$1 r0 = new com.sugarcube.app.base.network.ApiResponse$Companion$call$1
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r1 = r0.result
                java.lang.Object r2 = eI.C17187b.f()
                int r3 = r0.label
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L_0x0040
                if (r3 != r4) goto L_0x0038
                java.lang.Object r7 = r0.L$2
                dI.e r7 = (dI.C17164e) r7
                java.lang.Object r7 = r0.L$1
                nI.l r7 = (nI.C17642l) r7
                java.lang.Object r7 = r0.L$0
                com.sugarcube.app.base.network.ApiResponse$Companion r7 = (com.sugarcube.app.base.network.ApiResponse.Companion) r7
                XH.y.b(r1)     // Catch:{ Exception -> 0x0036 }
                goto L_0x0052
            L_0x0036:
                r7 = move-exception
                goto L_0x0067
            L_0x0038:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0040:
                XH.y.b(r1)
                r0.L$0 = r6     // Catch:{ Exception -> 0x0036 }
                r0.L$1 = r7     // Catch:{ Exception -> 0x0036 }
                r0.L$2 = r8     // Catch:{ Exception -> 0x0036 }
                r0.label = r4     // Catch:{ Exception -> 0x0036 }
                java.lang.Object r1 = r7.invoke(r0)     // Catch:{ Exception -> 0x0036 }
                if (r1 != r2) goto L_0x0052
                return r2
            L_0x0052:
                QL.x r1 = (QL.x) r1     // Catch:{ Exception -> 0x0036 }
                boolean r7 = r1.e()     // Catch:{ Exception -> 0x0036 }
                if (r7 == 0) goto L_0x0060
                com.sugarcube.app.base.network.ApiResponse$Success r7 = new com.sugarcube.app.base.network.ApiResponse$Success     // Catch:{ Exception -> 0x0036 }
                r7.<init>(r1)     // Catch:{ Exception -> 0x0036 }
                goto L_0x006d
            L_0x0060:
                com.sugarcube.app.base.network.ApiResponse$Failure r7 = new com.sugarcube.app.base.network.ApiResponse$Failure     // Catch:{ Exception -> 0x0036 }
                r8 = 2
                r7.<init>(r1, r5, r8, r5)     // Catch:{ Exception -> 0x0036 }
                goto L_0x006d
            L_0x0067:
                com.sugarcube.app.base.network.ApiResponse$Failure r8 = new com.sugarcube.app.base.network.ApiResponse$Failure
                r8.<init>(r5, r7)
                r7 = r8
            L_0x006d:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.network.ApiResponse.Companion.call(nI.l, dI.e):java.lang.Object");
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003HÂ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00108\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/sugarcube/app/base/network/ApiResponse$Success;", "T", "Lcom/sugarcube/app/base/network/ApiResponse;", "LQL/x;", "retrofitResponse", "<init>", "(LQL/x;)V", "component1", "()LQL/x;", "body", "()Ljava/lang/Object;", "copy", "(LQL/x;)Lcom/sugarcube/app/base/network/ApiResponse$Success;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LQL/x;", "code", "I", "getCode", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Success<T> extends ApiResponse<T> {
        public static final int $stable = 8;
        private final int code;
        private final x<T> retrofitResponse;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Success(x<T> xVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(xVar, "retrofitResponse");
            this.retrofitResponse = xVar;
            this.code = xVar.b();
        }

        private final x<T> component1() {
            return this.retrofitResponse;
        }

        public static /* synthetic */ Success copy$default(Success success, x<T> xVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                xVar = success.retrofitResponse;
            }
            return success.copy(xVar);
        }

        public T body() {
            return this.retrofitResponse.a();
        }

        public final Success<T> copy(x<T> xVar) {
            C17542s.j(xVar, "retrofitResponse");
            return new Success<>(xVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && C17542s.e(this.retrofitResponse, ((Success) obj).retrofitResponse);
        }

        public int getCode() {
            return this.code;
        }

        public int hashCode() {
            return this.retrofitResponse.hashCode();
        }

        public String toString() {
            x<T> xVar = this.retrofitResponse;
            return "Success(retrofitResponse=" + xVar + ")";
        }
    }

    public /* synthetic */ ApiResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract T body();

    public Exception getCause() {
        return this.cause;
    }

    public int getCode() {
        return this.code;
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B)\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003HÂ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ:\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010 \u001a\u00020\u00158\u0016X\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0017¨\u0006#"}, d2 = {"Lcom/sugarcube/app/base/network/ApiResponse$Failure;", "T", "Lcom/sugarcube/app/base/network/ApiResponse;", "LQL/x;", "retrofitResponse", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "<init>", "(LQL/x;Ljava/lang/Exception;)V", "component1", "()LQL/x;", "body", "()Ljava/lang/Object;", "component2", "()Ljava/lang/Exception;", "copy", "(LQL/x;Ljava/lang/Exception;)Lcom/sugarcube/app/base/network/ApiResponse$Failure;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LQL/x;", "Ljava/lang/Exception;", "getCause", "code", "I", "getCode", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Failure<T> extends ApiResponse<T> {
        public static final int $stable = 8;
        private final Exception cause;
        private final int code;
        private final x<T> retrofitResponse;

        public Failure(x<T> xVar, Exception exc) {
            super((DefaultConstructorMarker) null);
            this.retrofitResponse = xVar;
            this.cause = exc;
            this.code = xVar != null ? xVar.b() : 0;
        }

        private final x<T> component1() {
            return this.retrofitResponse;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, x<T> xVar, Exception exc, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                xVar = failure.retrofitResponse;
            }
            if ((i10 & 2) != 0) {
                exc = failure.cause;
            }
            return failure.copy(xVar, exc);
        }

        public T body() {
            x<T> xVar = this.retrofitResponse;
            if (xVar != null) {
                return xVar.a();
            }
            return null;
        }

        public final Exception component2() {
            return this.cause;
        }

        public final Failure<T> copy(x<T> xVar, Exception exc) {
            return new Failure<>(xVar, exc);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return C17542s.e(this.retrofitResponse, failure.retrofitResponse) && C17542s.e(this.cause, failure.cause);
        }

        public Exception getCause() {
            return this.cause;
        }

        public int getCode() {
            return this.code;
        }

        public int hashCode() {
            x<T> xVar = this.retrofitResponse;
            int i10 = 0;
            int hashCode = (xVar == null ? 0 : xVar.hashCode()) * 31;
            Exception exc = this.cause;
            if (exc != null) {
                i10 = exc.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            x<T> xVar = this.retrofitResponse;
            Exception exc = this.cause;
            return "Failure(retrofitResponse=" + xVar + ", cause=" + exc + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Failure(x xVar, Exception exc, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(xVar, (i10 & 2) != 0 ? null : exc);
        }
    }

    private ApiResponse() {
    }
}
