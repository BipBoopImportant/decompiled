package HJ;

import com.optimizely.ab.config.FeatureVariable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oI.C17693a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0016\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010¨\u0006\u0018"}, d2 = {"LHJ/i;", "", "", "", "string", "<init>", "(Ljava/lang/CharSequence;)V", "", "hasNext", "()Z", "c", "()Ljava/lang/String;", "a", "Ljava/lang/CharSequence;", "", "b", "I", "state", "tokenStartIndex", "d", "delimiterStartIndex", "e", "delimiterLength", "f", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: HJ.i  reason: case insensitive filesystem */
final class C15843i implements Iterator<String>, C17693a {

    /* renamed from: f  reason: collision with root package name */
    private static final a f135327f = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final CharSequence f135328a;

    /* renamed from: b  reason: collision with root package name */
    private int f135329b;

    /* renamed from: c  reason: collision with root package name */
    private int f135330c;

    /* renamed from: d  reason: collision with root package name */
    private int f135331d;

    /* renamed from: e  reason: collision with root package name */
    private int f135332e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"LHJ/i$a;", "", "<init>", "()V", "", "UNKNOWN", "I", "HAS_NEXT", "EXHAUSTED", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: HJ.i$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C15843i(CharSequence charSequence) {
        C17542s.j(charSequence, FeatureVariable.STRING_TYPE);
        this.f135328a = charSequence;
    }

    /* renamed from: c */
    public String next() {
        if (hasNext()) {
            this.f135329b = 0;
            int i10 = this.f135331d;
            int i11 = this.f135330c;
            this.f135330c = this.f135332e + i10;
            return this.f135328a.subSequence(i11, i10).toString();
        }
        throw new NoSuchElementException();
    }

    public boolean hasNext() {
        int i10;
        int i11 = this.f135329b;
        if (i11 != 0) {
            return i11 == 1;
        }
        int i12 = 2;
        if (this.f135332e < 0) {
            this.f135329b = 2;
            return false;
        }
        int length = this.f135328a.length();
        int i13 = this.f135330c;
        int length2 = this.f135328a.length();
        while (true) {
            if (i13 >= length2) {
                i12 = -1;
                break;
            }
            char charAt = this.f135328a.charAt(i13);
            if (charAt != 10 && charAt != 13) {
                i13++;
            } else if (!(charAt == 13 && (i10 = i13 + 1) < this.f135328a.length() && this.f135328a.charAt(i10) == 10)) {
                i12 = 1;
            }
        }
        i12 = 1;
        length = i13;
        this.f135329b = 1;
        this.f135332e = i12;
        this.f135331d = length;
        return true;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
