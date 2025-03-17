package v0;

import XH.C16807N;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\u000fJ\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0004\u001a\u00020\u0003H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J=\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u000b0\nH&¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0001\u0001\u0012ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lv0/d;", "T", "", "", "index", "Lv0/d$a;", "get", "(I)Lv0/d$a;", "fromIndex", "toIndex", "Lkotlin/Function1;", "LXH/N;", "block", "b", "(IILnI/l;)V", "a", "()I", "size", "Lv0/I;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v0.d  reason: case insensitive filesystem */
public interface C6138d<T> {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B!\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0006\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lv0/d$a;", "T", "", "", "startIndex", "size", "value", "<init>", "(IILjava/lang/Object;)V", "a", "I", "b", "()I", "c", "Ljava/lang/Object;", "()Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v0.d$a */
    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final int f30858a;

        /* renamed from: b  reason: collision with root package name */
        private final int f30859b;

        /* renamed from: c  reason: collision with root package name */
        private final T f30860c;

        public a(int i10, int i11, T t10) {
            this.f30858a = i10;
            this.f30859b = i11;
            this.f30860c = t10;
            if (i10 < 0) {
                throw new IllegalArgumentException(("startIndex should be >= 0, but was " + i10).toString());
            } else if (i11 <= 0) {
                throw new IllegalArgumentException(("size should be >0, but was " + i11).toString());
            }
        }

        public final int a() {
            return this.f30859b;
        }

        public final int b() {
            return this.f30858a;
        }

        public final T c() {
            return this.f30860c;
        }
    }

    int a();

    void b(int i10, int i11, C17642l<? super a<? extends T>, C16807N> lVar);

    a<T> get(int i10);
}
