package lp;

import com.ingka.ikea.core.model.Media;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Llp/a;", "", "", "id", "title", "Lcom/ingka/ikea/core/model/Media;", "headlineMedia", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/model/Media;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Lcom/ingka/ikea/core/model/Media;", "()Lcom/ingka/ikea/core/model/Media;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lp.a  reason: case insensitive filesystem */
public final class C11559a {

    /* renamed from: a  reason: collision with root package name */
    private final String f99458a;

    /* renamed from: b  reason: collision with root package name */
    private final String f99459b;

    /* renamed from: c  reason: collision with root package name */
    private final Media f99460c;

    public C11559a(String str, String str2, Media media) {
        C17542s.j(str, "id");
        C17542s.j(str2, "title");
        this.f99458a = str;
        this.f99459b = str2;
        this.f99460c = media;
    }

    public final Media a() {
        return this.f99460c;
    }

    public final String b() {
        return this.f99458a;
    }

    public final String c() {
        return this.f99459b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11559a)) {
            return false;
        }
        C11559a aVar = (C11559a) obj;
        return C17542s.e(this.f99458a, aVar.f99458a) && C17542s.e(this.f99459b, aVar.f99459b) && C17542s.e(this.f99460c, aVar.f99460c);
    }

    public int hashCode() {
        int hashCode = ((this.f99458a.hashCode() * 31) + this.f99459b.hashCode()) * 31;
        Media media = this.f99460c;
        return hashCode + (media == null ? 0 : media.hashCode());
    }

    public String toString() {
        String str = this.f99458a;
        String str2 = this.f99459b;
        Media media = this.f99460c;
        return "StoryLite(id=" + str + ", title=" + str2 + ", headlineMedia=" + media + ")";
    }
}
