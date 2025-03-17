package DF;

import android.net.Uri;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\u001c\u0010\u0015\u001a\u00020\u00108&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00108&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001c\u0010\u001c\u001a\u00020\u00188&@&X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\"\u001a\u0004\u0018\u00010\u001d8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010(\u001a\u0004\u0018\u00010#8&@&X¦\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006)"}, d2 = {"LDF/d;", "", "<init>", "()V", "", "a", "Z", "g", "()Z", "i", "(Z)V", "isSelected", "b", "f", "h", "isHighlighted", "Ljava/util/UUID;", "e", "()Ljava/util/UUID;", "setUuid", "(Ljava/util/UUID;)V", "uuid", "setCompositionUuid", "compositionUuid", "", "()I", "setId", "(I)V", "id", "Landroid/net/Uri;", "c", "()Landroid/net/Uri;", "setImageUri", "(Landroid/net/Uri;)V", "imageUri", "", "d", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: DF.d  reason: case insensitive filesystem */
public abstract class C12787d {

    /* renamed from: a  reason: collision with root package name */
    private boolean f109027a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f109028b;

    public abstract UUID a();

    public abstract int b();

    public abstract Uri c();

    public abstract String d();

    public abstract UUID e();

    public final boolean f() {
        return this.f109028b;
    }

    public final boolean g() {
        return this.f109027a;
    }

    public final void h(boolean z10) {
        this.f109028b = z10;
    }

    public final void i(boolean z10) {
        this.f109027a = z10;
    }
}
