package com.sugarcube.app.base.data;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/sugarcube/app/base/data/Loadable;", "T", "", "<init>", "()V", "Loading", "Loaded", "Failure", "Lcom/sugarcube/app/base/data/Loadable$Failure;", "Lcom/sugarcube/app/base/data/Loadable$Loaded;", "Lcom/sugarcube/app/base/data/Loadable$Loading;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Loadable<T> {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/app/base/data/Loadable$Failure;", "T", "", "Lcom/sugarcube/app/base/data/Loadable;", "<init>", "()V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Failure<T> extends Loadable<T> {
        public static final int $stable = 0;

        public Failure() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\n\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\bJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0004\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/app/base/data/Loadable$Loaded;", "T", "", "Lcom/sugarcube/app/base/data/Loadable;", "data", "<init>", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/sugarcube/app/base/data/Loadable$Loaded;", "equals", "", "other", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Loaded<T> extends Loadable<T> {
        public static final int $stable = 0;
        private final T data;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Loaded(T t10) {
            super((DefaultConstructorMarker) null);
            C17542s.j(t10, "data");
            this.data = t10;
        }

        public static /* synthetic */ Loaded copy$default(Loaded loaded, T t10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                t10 = loaded.data;
            }
            return loaded.copy(t10);
        }

        public final T component1() {
            return this.data;
        }

        public final Loaded<T> copy(T t10) {
            C17542s.j(t10, "data");
            return new Loaded<>(t10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loaded) && C17542s.e(this.data, ((Loaded) obj).data);
        }

        public final T getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            T t10 = this.data;
            return "Loaded(data=" + t10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/app/base/data/Loadable$Loading;", "T", "", "Lcom/sugarcube/app/base/data/Loadable;", "<init>", "()V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Loading<T> extends Loadable<T> {
        public static final int $stable = 0;

        public Loading() {
            super((DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ Loadable(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Loadable() {
    }
}
