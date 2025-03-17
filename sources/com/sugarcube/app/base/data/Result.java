package com.sugarcube.app.base.data;

import XH.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0002:\u0002\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/sugarcube/app/base/data/Result;", "T", "", "<init>", "()V", "toString", "", "Success", "Error", "Lcom/sugarcube/app/base/data/Result$Error;", "Lcom/sugarcube/app/base/data/Result$Success;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Result<T> {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/sugarcube/app/base/data/Result$Error;", "Lcom/sugarcube/app/base/data/Result;", "", "exception", "", "message", "", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "getException", "()Ljava/lang/Throwable;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Error extends Result {
        public static final int $stable = 8;
        private final Throwable exception;
        private final String message;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Error(Throwable th2, String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(th2, "exception");
            C17542s.j(str, "message");
            this.exception = th2;
            this.message = str;
        }

        public static /* synthetic */ Error copy$default(Error error, Throwable th2, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                th2 = error.exception;
            }
            if ((i10 & 2) != 0) {
                str = error.message;
            }
            return error.copy(th2, str);
        }

        public final Throwable component1() {
            return this.exception;
        }

        public final String component2() {
            return this.message;
        }

        public final Error copy(Throwable th2, String str) {
            C17542s.j(th2, "exception");
            C17542s.j(str, "message");
            return new Error(th2, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return C17542s.e(this.exception, error.exception) && C17542s.e(this.message, error.message);
        }

        public final Throwable getException() {
            return this.exception;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return (this.exception.hashCode() * 31) + this.message.hashCode();
        }

        public String toString() {
            Throwable th2 = this.exception;
            String str = this.message;
            return "Error(exception=" + th2 + ", message=" + str + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Error(Throwable th2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(th2, (i10 & 2) != 0 ? "" : str);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\n\b\u0001\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\n\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\bJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0004\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/app/base/data/Result$Success;", "T", "", "Lcom/sugarcube/app/base/data/Result;", "data", "<init>", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/sugarcube/app/base/data/Result$Success;", "equals", "", "other", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Success<T> extends Result<T> {
        public static final int $stable = 0;
        private final T data;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Success(T t10) {
            super((DefaultConstructorMarker) null);
            C17542s.j(t10, "data");
            this.data = t10;
        }

        public static /* synthetic */ Success copy$default(Success success, T t10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                t10 = success.data;
            }
            return success.copy(t10);
        }

        public final T component1() {
            return this.data;
        }

        public final Success<T> copy(T t10) {
            C17542s.j(t10, "data");
            return new Success<>(t10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && C17542s.e(this.data, ((Success) obj).data);
        }

        public final T getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            T t10 = this.data;
            return "Success(data=" + t10 + ")";
        }
    }

    public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public String toString() {
        if (this instanceof Success) {
            Object data = ((Success) this).getData();
            return "Success[data=" + data + "]";
        } else if (this instanceof Error) {
            Throwable exception = ((Error) this).getException();
            return "Error[exception=" + exception + "]";
        } else {
            throw new t();
        }
    }

    private Result() {
    }
}
