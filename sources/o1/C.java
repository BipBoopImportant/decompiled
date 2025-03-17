package O1;

import java.text.CharacterIterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010\u001e¨\u0006\""}, d2 = {"LO1/C;", "Ljava/lang/Object;", "Ljava/text/CharacterIterator;", "", "charSequence", "", "start", "end", "<init>", "(Ljava/lang/CharSequence;II)V", "", "first", "()C", "last", "current", "next", "previous", "position", "setIndex", "(I)C", "getBeginIndex", "()I", "getEndIndex", "getIndex", "", "clone", "()Ljava/lang/Object;", "a", "Ljava/lang/CharSequence;", "b", "I", "c", "d", "index", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class C implements CharacterIterator {

    /* renamed from: a  reason: collision with root package name */
    private final CharSequence f11675a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11676b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11677c;

    /* renamed from: d  reason: collision with root package name */
    private int f11678d;

    public C(CharSequence charSequence, int i10, int i11) {
        this.f11675a = charSequence;
        this.f11676b = i10;
        this.f11677c = i11;
        this.f11678d = i10;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public char current() {
        int i10 = this.f11678d;
        if (i10 == this.f11677c) {
            return 65535;
        }
        return this.f11675a.charAt(i10);
    }

    public char first() {
        this.f11678d = this.f11676b;
        return current();
    }

    public int getBeginIndex() {
        return this.f11676b;
    }

    public int getEndIndex() {
        return this.f11677c;
    }

    public int getIndex() {
        return this.f11678d;
    }

    public char last() {
        int i10 = this.f11676b;
        int i11 = this.f11677c;
        if (i10 == i11) {
            this.f11678d = i11;
            return 65535;
        }
        int i12 = i11 - 1;
        this.f11678d = i12;
        return this.f11675a.charAt(i12);
    }

    public char next() {
        int i10 = this.f11678d + 1;
        this.f11678d = i10;
        int i11 = this.f11677c;
        if (i10 < i11) {
            return this.f11675a.charAt(i10);
        }
        this.f11678d = i11;
        return 65535;
    }

    public char previous() {
        int i10 = this.f11678d;
        if (i10 <= this.f11676b) {
            return 65535;
        }
        int i11 = i10 - 1;
        this.f11678d = i11;
        return this.f11675a.charAt(i11);
    }

    public char setIndex(int i10) {
        int i11 = this.f11676b;
        if (i10 > this.f11677c || i11 > i10) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f11678d = i10;
        return current();
    }
}
