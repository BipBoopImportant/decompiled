package P1;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010¨\u0006\u0011"}, d2 = {"LP1/j;", "LP1/f;", "", "text", "LP1/i;", "wordIterator", "<init>", "(Ljava/lang/CharSequence;LP1/i;)V", "", "offset", "b", "(I)I", "d", "a", "c", "Ljava/lang/CharSequence;", "LP1/i;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j implements f {

    /* renamed from: a  reason: collision with root package name */
    private final CharSequence f11845a;

    /* renamed from: b  reason: collision with root package name */
    private final i f11846b;

    public j(CharSequence charSequence, i iVar) {
        this.f11845a = charSequence;
        this.f11846b = iVar;
    }

    public int a(int i10) {
        do {
            i10 = this.f11846b.n(i10);
            if (i10 == -1 || i10 == this.f11845a.length()) {
                return -1;
            }
        } while (Character.isWhitespace(this.f11845a.charAt(i10)));
        return i10;
    }

    public int b(int i10) {
        do {
            i10 = this.f11846b.o(i10);
            if (i10 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.f11845a.charAt(i10)));
        return i10;
    }

    public int c(int i10) {
        do {
            i10 = this.f11846b.n(i10);
            if (i10 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.f11845a.charAt(i10 - 1)));
        return i10;
    }

    public int d(int i10) {
        do {
            i10 = this.f11846b.o(i10);
            if (i10 == -1 || i10 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(this.f11845a.charAt(i10 - 1)));
        return i10;
    }
}
