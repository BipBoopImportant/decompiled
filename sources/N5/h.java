package N5;

import E5.h;
import GK.C15802u;
import H5.i;
import L5.c;
import N5.n;
import O5.e;
import O5.j;
import O5.l;
import QJ.M;
import R5.c;
import S5.d;
import XH.v;
import YH.C16877v;
import YH.X;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.r;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bh\u0018\u00002\u00020\u0001:\u0002SOB÷\u0002\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u001c\u0010\u0016\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015\u0018\u00010\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010$\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010&\u001a\u00020\"\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010)\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010-\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u0010/\u001a\u00020+\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00107\u001a\u000206\u0012\b\u00108\u001a\u0004\u0018\u00010\t\u0012\b\u0010:\u001a\u0004\u0018\u000109\u0012\b\u0010<\u001a\u0004\u0018\u00010;\u0012\b\u0010=\u001a\u0004\u0018\u000109\u0012\b\u0010>\u001a\u0004\u0018\u00010;\u0012\b\u0010?\u001a\u0004\u0018\u000109\u0012\b\u0010@\u001a\u0004\u0018\u00010;\u0012\u0006\u0010B\u001a\u00020A\u0012\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bE\u0010FJ\u0019\u0010H\u001a\u00020G2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\bH\u0010IJ\u001a\u0010K\u001a\u00020\"2\b\u0010J\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u000209H\u0016¢\u0006\u0004\bM\u0010NR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR-\u0010\u0016\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bi\u0010s\u001a\u0004\bt\u0010uR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bm\u0010v\u001a\u0004\bw\u0010xR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006¢\u0006\f\n\u0004\bQ\u0010y\u001a\u0004\bz\u0010{R\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bU\u0010|\u001a\u0004\b}\u0010~R\u001a\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\u000f\n\u0005\b\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001a\u0010!\u001a\u00020 8\u0006¢\u0006\u000f\n\u0005\bw\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001a\u0010#\u001a\u00020\"8\u0006¢\u0006\u000f\n\u0006\b\u0001\u0010\u0001\u001a\u0005\bg\u0010\u0001R\u001a\u0010$\u001a\u00020\"8\u0006¢\u0006\u000f\n\u0006\b\u0001\u0010\u0001\u001a\u0005\bk\u0010\u0001R\u0019\u0010%\u001a\u00020\"8\u0006¢\u0006\u000e\n\u0005\be\u0010\u0001\u001a\u0005\bo\u0010\u0001R\u001b\u0010&\u001a\u00020\"8\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001b\u0010(\u001a\u00020'8\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001b\u0010)\u001a\u00020'8\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001b\u0010*\u001a\u00020'8\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001a\u0010,\u001a\u00020+8\u0006¢\u0006\u000f\n\u0005\bt\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001b\u0010-\u001a\u00020+8\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001a\u0010.\u001a\u00020+8\u0006¢\u0006\u000f\n\u0006\b\u0001\u0010\u0001\u001a\u0005\b\u0010\u0001R\u001b\u0010/\u001a\u00020+8\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001a\u00101\u001a\u0002008\u0006¢\u0006\u000f\n\u0005\b]\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001a\u00103\u001a\u0002028\u0006¢\u0006\u000f\n\u0005\ba\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001b\u00105\u001a\u0002048\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001b\u00107\u001a\u0002068\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R\u001b\u00108\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b¡\u0001\u0010`\u001a\u0005\b£\u0001\u0010bR\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002X\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002X\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¦\u0001R\u0017\u0010=\u001a\u0004\u0018\u0001098\u0002X\u0004¢\u0006\u0007\n\u0005\bq\u0010¥\u0001R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010¦\u0001R\u0018\u0010?\u001a\u0004\u0018\u0001098\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010¥\u0001R\u0018\u0010@\u001a\u0004\u0018\u00010;8\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010¦\u0001R\u001b\u0010B\u001a\u00020A8\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010§\u0001\u001a\u0006\b\u0001\u0010¨\u0001R\u001a\u0010D\u001a\u00020C8\u0006¢\u0006\u000f\n\u0005\bY\u0010©\u0001\u001a\u0006\b\u0001\u0010ª\u0001R\u0016\u0010¬\u0001\u001a\u0004\u0018\u00010;8F¢\u0006\b\u001a\u0006\b¤\u0001\u0010«\u0001R\u0016\u0010­\u0001\u001a\u0004\u0018\u00010;8F¢\u0006\b\u001a\u0006\b\u0001\u0010«\u0001R\u0016\u0010®\u0001\u001a\u0004\u0018\u00010;8F¢\u0006\b\u001a\u0006\b\u0001\u0010«\u0001¨\u0006¯\u0001"}, d2 = {"LN5/h;", "", "Landroid/content/Context;", "context", "data", "LP5/a;", "target", "LN5/h$b;", "listener", "LL5/c$b;", "memoryCacheKey", "", "diskCacheKey", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Landroid/graphics/ColorSpace;", "colorSpace", "LO5/e;", "precision", "LXH/v;", "LH5/i$a;", "Ljava/lang/Class;", "fetcherFactory", "LE5/h$a;", "decoderFactory", "", "LQ5/a;", "transformations", "LR5/c$a;", "transitionFactory", "LGK/u;", "headers", "LN5/r;", "tags", "", "allowConversionToBitmap", "allowHardware", "allowRgb565", "premultipliedAlpha", "LN5/b;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "LQJ/M;", "interceptorDispatcher", "fetcherDispatcher", "decoderDispatcher", "transformationDispatcher", "Landroidx/lifecycle/r;", "lifecycle", "LO5/j;", "sizeResolver", "LO5/h;", "scale", "LN5/n;", "parameters", "placeholderMemoryCacheKey", "", "placeholderResId", "Landroid/graphics/drawable/Drawable;", "placeholderDrawable", "errorResId", "errorDrawable", "fallbackResId", "fallbackDrawable", "LN5/d;", "defined", "LN5/c;", "defaults", "<init>", "(Landroid/content/Context;Ljava/lang/Object;LP5/a;LN5/h$b;LL5/c$b;Ljava/lang/String;Landroid/graphics/Bitmap$Config;Landroid/graphics/ColorSpace;LO5/e;LXH/v;LE5/h$a;Ljava/util/List;LR5/c$a;LGK/u;LN5/r;ZZZZLN5/b;LN5/b;LN5/b;LQJ/M;LQJ/M;LQJ/M;LQJ/M;Landroidx/lifecycle/r;LO5/j;LO5/h;LN5/n;LL5/c$b;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;LN5/d;LN5/c;)V", "LN5/h$a;", "Q", "(Landroid/content/Context;)LN5/h$a;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Landroid/content/Context;", "l", "()Landroid/content/Context;", "b", "Ljava/lang/Object;", "m", "()Ljava/lang/Object;", "c", "LP5/a;", "M", "()LP5/a;", "d", "LN5/h$b;", "A", "()LN5/h$b;", "e", "LL5/c$b;", "B", "()LL5/c$b;", "f", "Ljava/lang/String;", "r", "()Ljava/lang/String;", "g", "Landroid/graphics/Bitmap$Config;", "j", "()Landroid/graphics/Bitmap$Config;", "h", "Landroid/graphics/ColorSpace;", "k", "()Landroid/graphics/ColorSpace;", "i", "LO5/e;", "H", "()LO5/e;", "LXH/v;", "w", "()LXH/v;", "LE5/h$a;", "o", "()LE5/h$a;", "Ljava/util/List;", "O", "()Ljava/util/List;", "LR5/c$a;", "P", "()LR5/c$a;", "n", "LGK/u;", "x", "()LGK/u;", "LN5/r;", "L", "()LN5/r;", "p", "Z", "()Z", "q", "s", "I", "t", "LN5/b;", "C", "()LN5/b;", "u", "v", "D", "LQJ/M;", "y", "()LQJ/M;", "z", "N", "Landroidx/lifecycle/r;", "()Landroidx/lifecycle/r;", "LO5/j;", "K", "()LO5/j;", "LO5/h;", "J", "()LO5/h;", "LN5/n;", "E", "()LN5/n;", "G", "F", "Ljava/lang/Integer;", "Landroid/graphics/drawable/Drawable;", "LN5/d;", "()LN5/d;", "LN5/c;", "()LN5/c;", "()Landroid/graphics/drawable/Drawable;", "placeholder", "error", "fallback", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h {

    /* renamed from: A  reason: collision with root package name */
    private final r f38993A;

    /* renamed from: B  reason: collision with root package name */
    private final j f38994B;

    /* renamed from: C  reason: collision with root package name */
    private final O5.h f38995C;

    /* renamed from: D  reason: collision with root package name */
    private final n f38996D;

    /* renamed from: E  reason: collision with root package name */
    private final c.b f38997E;
    /* access modifiers changed from: private */

    /* renamed from: F  reason: collision with root package name */
    public final Integer f38998F;
    /* access modifiers changed from: private */

    /* renamed from: G  reason: collision with root package name */
    public final Drawable f38999G;
    /* access modifiers changed from: private */

    /* renamed from: H  reason: collision with root package name */
    public final Integer f39000H;
    /* access modifiers changed from: private */

    /* renamed from: I  reason: collision with root package name */
    public final Drawable f39001I;
    /* access modifiers changed from: private */

    /* renamed from: J  reason: collision with root package name */
    public final Integer f39002J;
    /* access modifiers changed from: private */

    /* renamed from: K  reason: collision with root package name */
    public final Drawable f39003K;

    /* renamed from: L  reason: collision with root package name */
    private final d f39004L;

    /* renamed from: M  reason: collision with root package name */
    private final c f39005M;

    /* renamed from: a  reason: collision with root package name */
    private final Context f39006a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f39007b;

    /* renamed from: c  reason: collision with root package name */
    private final P5.a f39008c;

    /* renamed from: d  reason: collision with root package name */
    private final b f39009d;

    /* renamed from: e  reason: collision with root package name */
    private final c.b f39010e;

    /* renamed from: f  reason: collision with root package name */
    private final String f39011f;

    /* renamed from: g  reason: collision with root package name */
    private final Bitmap.Config f39012g;

    /* renamed from: h  reason: collision with root package name */
    private final ColorSpace f39013h;

    /* renamed from: i  reason: collision with root package name */
    private final e f39014i;

    /* renamed from: j  reason: collision with root package name */
    private final v<i.a<?>, Class<?>> f39015j;

    /* renamed from: k  reason: collision with root package name */
    private final h.a f39016k;

    /* renamed from: l  reason: collision with root package name */
    private final List<Q5.a> f39017l;

    /* renamed from: m  reason: collision with root package name */
    private final c.a f39018m;

    /* renamed from: n  reason: collision with root package name */
    private final C15802u f39019n;

    /* renamed from: o  reason: collision with root package name */
    private final r f39020o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f39021p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f39022q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f39023r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f39024s;

    /* renamed from: t  reason: collision with root package name */
    private final b f39025t;

    /* renamed from: u  reason: collision with root package name */
    private final b f39026u;

    /* renamed from: v  reason: collision with root package name */
    private final b f39027v;

    /* renamed from: w  reason: collision with root package name */
    private final M f39028w;

    /* renamed from: x  reason: collision with root package name */
    private final M f39029x;

    /* renamed from: y  reason: collision with root package name */
    private final M f39030y;

    /* renamed from: z  reason: collision with root package name */
    private final M f39031z;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\fH\u0017¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"LN5/h$b;", "", "LN5/h;", "request", "LXH/N;", "c", "(LN5/h;)V", "d", "LN5/f;", "result", "b", "(LN5/h;LN5/f;)V", "LN5/q;", "a", "(LN5/h;LN5/q;)V", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b {
        void a(h hVar, q qVar) {
        }

        void b(h hVar, f fVar) {
        }

        void c(h hVar) {
        }

        void d(h hVar) {
        }
    }

    public /* synthetic */ h(Context context, Object obj, P5.a aVar, b bVar, c.b bVar2, String str, Bitmap.Config config, ColorSpace colorSpace, e eVar, v vVar, h.a aVar2, List list, c.a aVar3, C15802u uVar, r rVar, boolean z10, boolean z11, boolean z12, boolean z13, b bVar3, b bVar4, b bVar5, M m10, M m11, M m12, M m13, r rVar2, j jVar, O5.h hVar, n nVar, c.b bVar6, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, d dVar, c cVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, aVar, bVar, bVar2, str, config, colorSpace, eVar, vVar, aVar2, list, aVar3, uVar, rVar, z10, z11, z12, z13, bVar3, bVar4, bVar5, m10, m11, m12, m13, rVar2, jVar, hVar, nVar, bVar6, num, drawable, num2, drawable2, num3, drawable3, dVar, cVar);
    }

    public static /* synthetic */ a R(h hVar, Context context, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = hVar.f39006a;
        }
        return hVar.Q(context);
    }

    public final b A() {
        return this.f39009d;
    }

    public final c.b B() {
        return this.f39010e;
    }

    public final b C() {
        return this.f39025t;
    }

    public final b D() {
        return this.f39027v;
    }

    public final n E() {
        return this.f38996D;
    }

    public final Drawable F() {
        return S5.i.c(this, this.f38999G, this.f38998F, this.f39005M.l());
    }

    public final c.b G() {
        return this.f38997E;
    }

    public final e H() {
        return this.f39014i;
    }

    public final boolean I() {
        return this.f39024s;
    }

    public final O5.h J() {
        return this.f38995C;
    }

    public final j K() {
        return this.f38994B;
    }

    public final r L() {
        return this.f39020o;
    }

    public final P5.a M() {
        return this.f39008c;
    }

    public final M N() {
        return this.f39031z;
    }

    public final List<Q5.a> O() {
        return this.f39017l;
    }

    public final c.a P() {
        return this.f39018m;
    }

    public final a Q(Context context) {
        return new a(this, context);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return C17542s.e(this.f39006a, hVar.f39006a) && C17542s.e(this.f39007b, hVar.f39007b) && C17542s.e(this.f39008c, hVar.f39008c) && C17542s.e(this.f39009d, hVar.f39009d) && C17542s.e(this.f39010e, hVar.f39010e) && C17542s.e(this.f39011f, hVar.f39011f) && this.f39012g == hVar.f39012g && C17542s.e(this.f39013h, hVar.f39013h) && this.f39014i == hVar.f39014i && C17542s.e(this.f39015j, hVar.f39015j) && C17542s.e(this.f39016k, hVar.f39016k) && C17542s.e(this.f39017l, hVar.f39017l) && C17542s.e(this.f39018m, hVar.f39018m) && C17542s.e(this.f39019n, hVar.f39019n) && C17542s.e(this.f39020o, hVar.f39020o) && this.f39021p == hVar.f39021p && this.f39022q == hVar.f39022q && this.f39023r == hVar.f39023r && this.f39024s == hVar.f39024s && this.f39025t == hVar.f39025t && this.f39026u == hVar.f39026u && this.f39027v == hVar.f39027v && C17542s.e(this.f39028w, hVar.f39028w) && C17542s.e(this.f39029x, hVar.f39029x) && C17542s.e(this.f39030y, hVar.f39030y) && C17542s.e(this.f39031z, hVar.f39031z) && C17542s.e(this.f38997E, hVar.f38997E) && C17542s.e(this.f38998F, hVar.f38998F) && C17542s.e(this.f38999G, hVar.f38999G) && C17542s.e(this.f39000H, hVar.f39000H) && C17542s.e(this.f39001I, hVar.f39001I) && C17542s.e(this.f39002J, hVar.f39002J) && C17542s.e(this.f39003K, hVar.f39003K) && C17542s.e(this.f38993A, hVar.f38993A) && C17542s.e(this.f38994B, hVar.f38994B) && this.f38995C == hVar.f38995C && C17542s.e(this.f38996D, hVar.f38996D) && C17542s.e(this.f39004L, hVar.f39004L) && C17542s.e(this.f39005M, hVar.f39005M);
        }
    }

    public final boolean g() {
        return this.f39021p;
    }

    public final boolean h() {
        return this.f39022q;
    }

    public int hashCode() {
        int hashCode = ((this.f39006a.hashCode() * 31) + this.f39007b.hashCode()) * 31;
        P5.a aVar = this.f39008c;
        int i10 = 0;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        b bVar = this.f39009d;
        int hashCode3 = (hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        c.b bVar2 = this.f39010e;
        int hashCode4 = (hashCode3 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
        String str = this.f39011f;
        int hashCode5 = (((hashCode4 + (str != null ? str.hashCode() : 0)) * 31) + this.f39012g.hashCode()) * 31;
        ColorSpace colorSpace = this.f39013h;
        int hashCode6 = (((hashCode5 + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31) + this.f39014i.hashCode()) * 31;
        v<i.a<?>, Class<?>> vVar = this.f39015j;
        int hashCode7 = (hashCode6 + (vVar != null ? vVar.hashCode() : 0)) * 31;
        h.a aVar2 = this.f39016k;
        int hashCode8 = (((((((((((((((((((((((((((((((((((((((hashCode7 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31) + this.f39017l.hashCode()) * 31) + this.f39018m.hashCode()) * 31) + this.f39019n.hashCode()) * 31) + this.f39020o.hashCode()) * 31) + Boolean.hashCode(this.f39021p)) * 31) + Boolean.hashCode(this.f39022q)) * 31) + Boolean.hashCode(this.f39023r)) * 31) + Boolean.hashCode(this.f39024s)) * 31) + this.f39025t.hashCode()) * 31) + this.f39026u.hashCode()) * 31) + this.f39027v.hashCode()) * 31) + this.f39028w.hashCode()) * 31) + this.f39029x.hashCode()) * 31) + this.f39030y.hashCode()) * 31) + this.f39031z.hashCode()) * 31) + this.f38993A.hashCode()) * 31) + this.f38994B.hashCode()) * 31) + this.f38995C.hashCode()) * 31) + this.f38996D.hashCode()) * 31;
        c.b bVar3 = this.f38997E;
        int hashCode9 = (hashCode8 + (bVar3 != null ? bVar3.hashCode() : 0)) * 31;
        Integer num = this.f38998F;
        int hashCode10 = (hashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        Drawable drawable = this.f38999G;
        int hashCode11 = (hashCode10 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Integer num2 = this.f39000H;
        int hashCode12 = (hashCode11 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Drawable drawable2 = this.f39001I;
        int hashCode13 = (hashCode12 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Integer num3 = this.f39002J;
        int hashCode14 = (hashCode13 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Drawable drawable3 = this.f39003K;
        if (drawable3 != null) {
            i10 = drawable3.hashCode();
        }
        return ((((hashCode14 + i10) * 31) + this.f39004L.hashCode()) * 31) + this.f39005M.hashCode();
    }

    public final boolean i() {
        return this.f39023r;
    }

    public final Bitmap.Config j() {
        return this.f39012g;
    }

    public final ColorSpace k() {
        return this.f39013h;
    }

    public final Context l() {
        return this.f39006a;
    }

    public final Object m() {
        return this.f39007b;
    }

    public final M n() {
        return this.f39030y;
    }

    public final h.a o() {
        return this.f39016k;
    }

    public final c p() {
        return this.f39005M;
    }

    public final d q() {
        return this.f39004L;
    }

    public final String r() {
        return this.f39011f;
    }

    public final b s() {
        return this.f39026u;
    }

    public final Drawable t() {
        return S5.i.c(this, this.f39001I, this.f39000H, this.f39005M.f());
    }

    public final Drawable u() {
        return S5.i.c(this, this.f39003K, this.f39002J, this.f39005M.g());
    }

    public final M v() {
        return this.f39029x;
    }

    public final v<i.a<?>, Class<?>> w() {
        return this.f39015j;
    }

    public final C15802u x() {
        return this.f39019n;
    }

    public final M y() {
        return this.f39028w;
    }

    public final r z() {
        return this.f38993A;
    }

    private h(Context context, Object obj, P5.a aVar, b bVar, c.b bVar2, String str, Bitmap.Config config, ColorSpace colorSpace, e eVar, v<? extends i.a<?>, ? extends Class<?>> vVar, h.a aVar2, List<? extends Q5.a> list, c.a aVar3, C15802u uVar, r rVar, boolean z10, boolean z11, boolean z12, boolean z13, b bVar3, b bVar4, b bVar5, M m10, M m11, M m12, M m13, r rVar2, j jVar, O5.h hVar, n nVar, c.b bVar6, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, d dVar, c cVar) {
        this.f39006a = context;
        this.f39007b = obj;
        this.f39008c = aVar;
        this.f39009d = bVar;
        this.f39010e = bVar2;
        this.f39011f = str;
        this.f39012g = config;
        this.f39013h = colorSpace;
        this.f39014i = eVar;
        this.f39015j = vVar;
        this.f39016k = aVar2;
        this.f39017l = list;
        this.f39018m = aVar3;
        this.f39019n = uVar;
        this.f39020o = rVar;
        this.f39021p = z10;
        this.f39022q = z11;
        this.f39023r = z12;
        this.f39024s = z13;
        this.f39025t = bVar3;
        this.f39026u = bVar4;
        this.f39027v = bVar5;
        this.f39028w = m10;
        this.f39029x = m11;
        this.f39030y = m12;
        this.f39031z = m13;
        this.f38993A = rVar2;
        this.f38994B = jVar;
        this.f38995C = hVar;
        this.f38996D = nVar;
        this.f38997E = bVar6;
        this.f38998F = num;
        this.f38999G = drawable;
        this.f39000H = num2;
        this.f39001I = drawable2;
        this.f39002J = num3;
        this.f39003K = drawable3;
        this.f39004L = dVar;
        this.f39005M = cVar;
    }

    @Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b(\u0010'J\u0017\u0010+\u001a\u00020\u00002\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J\u0015\u0010/\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u0006¢\u0006\u0004\b1\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00103R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u00104R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u00105R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u00106R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u00107R\u0018\u0010:\u001a\u0004\u0018\u0001088\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u00109R\u0018\u0010=\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010<R\u0018\u0010@\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010?R\u0018\u0010C\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010BR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010DR,\u0010I\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030F\u0012\b\u0012\u0006\u0012\u0002\b\u00030G\u0018\u00010E8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010HR\u0018\u0010L\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010KR\u001c\u0010P\u001a\b\u0012\u0004\u0012\u00020N0M8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010OR\u0018\u0010S\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010RR\u0018\u0010W\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bU\u0010VR(\u0010[\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030G\u0012\u0004\u0012\u00020\u0001\u0018\u00010X8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010_\u001a\u00020\\8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010b\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010d\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bc\u0010aR\u0016\u0010f\u001a\u00020\\8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\be\u0010^R\u0018\u0010i\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010k\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bj\u0010hR\u0018\u0010m\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bl\u0010hR\u0018\u0010q\u001a\u0004\u0018\u00010n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0018\u0010s\u001a\u0004\u0018\u00010n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\br\u0010pR\u0018\u0010u\u001a\u0004\u0018\u00010n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bt\u0010pR\u0018\u0010w\u001a\u0004\u0018\u00010n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bv\u0010pR\u0018\u0010{\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0018\u0010}\u001a\u0004\u0018\u0001088\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b|\u00109R\u001a\u0010\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0010\u0001R\u001c\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001b\u0010\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001c\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001b\u0010\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001c\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001b\u0010\u0001\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001b\u0010\u0001\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001b\u0010\u0001\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001b\u0010\u0001\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001b\u0010\u0001\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001b\u0010\u0001\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, d2 = {"LN5/h$a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "LN5/h;", "request", "(LN5/h;Landroid/content/Context;)V", "LXH/N;", "i", "()V", "h", "Landroidx/lifecycle/r;", "j", "()Landroidx/lifecycle/r;", "LO5/j;", "l", "()LO5/j;", "LO5/h;", "k", "()LO5/h;", "data", "b", "(Ljava/lang/Object;)LN5/h$a;", "LN5/h$b;", "listener", "e", "(LN5/h$b;)LN5/h$a;", "resolver", "m", "(LO5/j;)LN5/h$a;", "LO5/e;", "precision", "g", "(LO5/e;)LN5/h$a;", "LN5/b;", "policy", "f", "(LN5/b;)LN5/h$a;", "d", "LP5/a;", "target", "n", "(LP5/a;)LN5/h$a;", "LN5/c;", "defaults", "c", "(LN5/c;)LN5/h$a;", "a", "()LN5/h;", "Landroid/content/Context;", "LN5/c;", "Ljava/lang/Object;", "LP5/a;", "LN5/h$b;", "LL5/c$b;", "LL5/c$b;", "memoryCacheKey", "", "Ljava/lang/String;", "diskCacheKey", "Landroid/graphics/Bitmap$Config;", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Landroid/graphics/ColorSpace;", "Landroid/graphics/ColorSpace;", "colorSpace", "LO5/e;", "LXH/v;", "LH5/i$a;", "Ljava/lang/Class;", "LXH/v;", "fetcherFactory", "LE5/h$a;", "LE5/h$a;", "decoderFactory", "", "LQ5/a;", "Ljava/util/List;", "transformations", "LR5/c$a;", "LR5/c$a;", "transitionFactory", "LGK/u$a;", "o", "LGK/u$a;", "headers", "", "p", "Ljava/util/Map;", "tags", "", "q", "Z", "allowConversionToBitmap", "r", "Ljava/lang/Boolean;", "allowHardware", "s", "allowRgb565", "t", "premultipliedAlpha", "u", "LN5/b;", "memoryCachePolicy", "v", "diskCachePolicy", "w", "networkCachePolicy", "LQJ/M;", "x", "LQJ/M;", "interceptorDispatcher", "y", "fetcherDispatcher", "z", "decoderDispatcher", "A", "transformationDispatcher", "LN5/n$a;", "B", "LN5/n$a;", "parameters", "C", "placeholderMemoryCacheKey", "", "D", "Ljava/lang/Integer;", "placeholderResId", "Landroid/graphics/drawable/Drawable;", "E", "Landroid/graphics/drawable/Drawable;", "placeholderDrawable", "F", "errorResId", "G", "errorDrawable", "H", "fallbackResId", "I", "fallbackDrawable", "J", "Landroidx/lifecycle/r;", "lifecycle", "K", "LO5/j;", "sizeResolver", "L", "LO5/h;", "scale", "M", "resolvedLifecycle", "N", "resolvedSizeResolver", "O", "resolvedScale", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* renamed from: A  reason: collision with root package name */
        private M f39032A;

        /* renamed from: B  reason: collision with root package name */
        private n.a f39033B;

        /* renamed from: C  reason: collision with root package name */
        private c.b f39034C;

        /* renamed from: D  reason: collision with root package name */
        private Integer f39035D;

        /* renamed from: E  reason: collision with root package name */
        private Drawable f39036E;

        /* renamed from: F  reason: collision with root package name */
        private Integer f39037F;

        /* renamed from: G  reason: collision with root package name */
        private Drawable f39038G;

        /* renamed from: H  reason: collision with root package name */
        private Integer f39039H;

        /* renamed from: I  reason: collision with root package name */
        private Drawable f39040I;

        /* renamed from: J  reason: collision with root package name */
        private r f39041J;

        /* renamed from: K  reason: collision with root package name */
        private j f39042K;

        /* renamed from: L  reason: collision with root package name */
        private O5.h f39043L;

        /* renamed from: M  reason: collision with root package name */
        private r f39044M;

        /* renamed from: N  reason: collision with root package name */
        private j f39045N;

        /* renamed from: O  reason: collision with root package name */
        private O5.h f39046O;

        /* renamed from: a  reason: collision with root package name */
        private final Context f39047a;

        /* renamed from: b  reason: collision with root package name */
        private c f39048b;

        /* renamed from: c  reason: collision with root package name */
        private Object f39049c;

        /* renamed from: d  reason: collision with root package name */
        private P5.a f39050d;

        /* renamed from: e  reason: collision with root package name */
        private b f39051e;

        /* renamed from: f  reason: collision with root package name */
        private c.b f39052f;

        /* renamed from: g  reason: collision with root package name */
        private String f39053g;

        /* renamed from: h  reason: collision with root package name */
        private Bitmap.Config f39054h;

        /* renamed from: i  reason: collision with root package name */
        private ColorSpace f39055i;

        /* renamed from: j  reason: collision with root package name */
        private e f39056j;

        /* renamed from: k  reason: collision with root package name */
        private v<? extends i.a<?>, ? extends Class<?>> f39057k;

        /* renamed from: l  reason: collision with root package name */
        private h.a f39058l;

        /* renamed from: m  reason: collision with root package name */
        private List<? extends Q5.a> f39059m;

        /* renamed from: n  reason: collision with root package name */
        private c.a f39060n;

        /* renamed from: o  reason: collision with root package name */
        private C15802u.a f39061o;

        /* renamed from: p  reason: collision with root package name */
        private Map<Class<?>, Object> f39062p;

        /* renamed from: q  reason: collision with root package name */
        private boolean f39063q;

        /* renamed from: r  reason: collision with root package name */
        private Boolean f39064r;

        /* renamed from: s  reason: collision with root package name */
        private Boolean f39065s;

        /* renamed from: t  reason: collision with root package name */
        private boolean f39066t;

        /* renamed from: u  reason: collision with root package name */
        private b f39067u;

        /* renamed from: v  reason: collision with root package name */
        private b f39068v;

        /* renamed from: w  reason: collision with root package name */
        private b f39069w;

        /* renamed from: x  reason: collision with root package name */
        private M f39070x;

        /* renamed from: y  reason: collision with root package name */
        private M f39071y;

        /* renamed from: z  reason: collision with root package name */
        private M f39072z;

        public a(Context context) {
            this.f39047a = context;
            this.f39048b = S5.i.b();
            this.f39049c = null;
            this.f39050d = null;
            this.f39051e = null;
            this.f39052f = null;
            this.f39053g = null;
            this.f39054h = null;
            this.f39055i = null;
            this.f39056j = null;
            this.f39057k = null;
            this.f39058l = null;
            this.f39059m = C16877v.n();
            this.f39060n = null;
            this.f39061o = null;
            this.f39062p = null;
            this.f39063q = true;
            this.f39064r = null;
            this.f39065s = null;
            this.f39066t = true;
            this.f39067u = null;
            this.f39068v = null;
            this.f39069w = null;
            this.f39070x = null;
            this.f39071y = null;
            this.f39072z = null;
            this.f39032A = null;
            this.f39033B = null;
            this.f39034C = null;
            this.f39035D = null;
            this.f39036E = null;
            this.f39037F = null;
            this.f39038G = null;
            this.f39039H = null;
            this.f39040I = null;
            this.f39041J = null;
            this.f39042K = null;
            this.f39043L = null;
            this.f39044M = null;
            this.f39045N = null;
            this.f39046O = null;
        }

        private final void h() {
            this.f39046O = null;
        }

        private final void i() {
            this.f39044M = null;
            this.f39045N = null;
            this.f39046O = null;
        }

        private final r j() {
            P5.a aVar = this.f39050d;
            r c10 = d.c(aVar instanceof P5.b ? ((P5.b) aVar).c().getContext() : this.f39047a);
            return c10 == null ? g.f38991b : c10;
        }

        private final O5.h k() {
            View c10;
            j jVar = this.f39042K;
            View view = null;
            l lVar = jVar instanceof l ? (l) jVar : null;
            if (lVar == null || (c10 = lVar.c()) == null) {
                P5.a aVar = this.f39050d;
                P5.b bVar = aVar instanceof P5.b ? (P5.b) aVar : null;
                if (bVar != null) {
                    view = bVar.c();
                }
            } else {
                view = c10;
            }
            return view instanceof ImageView ? S5.j.p((ImageView) view) : O5.h.FIT;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            r1 = ((android.widget.ImageView) r0).getScaleType();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final O5.j l() {
            /*
                r4 = this;
                P5.a r0 = r4.f39050d
                boolean r1 = r0 instanceof P5.b
                if (r1 == 0) goto L_0x002e
                P5.b r0 = (P5.b) r0
                android.view.View r0 = r0.c()
                boolean r1 = r0 instanceof android.widget.ImageView
                if (r1 == 0) goto L_0x0026
                r1 = r0
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                android.widget.ImageView$ScaleType r1 = r1.getScaleType()
                android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.CENTER
                if (r1 == r2) goto L_0x001f
                android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.MATRIX
                if (r1 != r2) goto L_0x0026
            L_0x001f:
                O5.i r0 = O5.i.f39254d
                O5.j r0 = O5.k.a(r0)
                return r0
            L_0x0026:
                r1 = 2
                r2 = 0
                r3 = 0
                O5.l r0 = O5.m.b(r0, r3, r1, r2)
                return r0
            L_0x002e:
                O5.d r0 = new O5.d
                android.content.Context r1 = r4.f39047a
                r0.<init>(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: N5.h.a.l():O5.j");
        }

        public final h a() {
            Context context = this.f39047a;
            Object obj = this.f39049c;
            if (obj == null) {
                obj = j.f39073a;
            }
            Object obj2 = obj;
            P5.a aVar = this.f39050d;
            b bVar = this.f39051e;
            c.b bVar2 = this.f39052f;
            String str = this.f39053g;
            Bitmap.Config config = this.f39054h;
            if (config == null) {
                config = this.f39048b.c();
            }
            Bitmap.Config config2 = config;
            ColorSpace colorSpace = this.f39055i;
            e eVar = this.f39056j;
            if (eVar == null) {
                eVar = this.f39048b.m();
            }
            e eVar2 = eVar;
            v<? extends i.a<?>, ? extends Class<?>> vVar = this.f39057k;
            h.a aVar2 = this.f39058l;
            List<? extends Q5.a> list = this.f39059m;
            c.a aVar3 = this.f39060n;
            if (aVar3 == null) {
                aVar3 = this.f39048b.o();
            }
            c.a aVar4 = aVar3;
            C15802u.a aVar5 = this.f39061o;
            C15802u x10 = S5.j.x(aVar5 != null ? aVar5.f() : null);
            Map<Class<?>, Object> map = this.f39062p;
            r z10 = S5.j.z(map != null ? r.f39106b.a(map) : null);
            boolean z11 = this.f39063q;
            Boolean bool = this.f39064r;
            boolean booleanValue = bool != null ? bool.booleanValue() : this.f39048b.a();
            Boolean bool2 = this.f39065s;
            boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : this.f39048b.b();
            boolean z12 = this.f39066t;
            b bVar3 = this.f39067u;
            if (bVar3 == null) {
                bVar3 = this.f39048b.j();
            }
            b bVar4 = bVar3;
            b bVar5 = this.f39068v;
            if (bVar5 == null) {
                bVar5 = this.f39048b.e();
            }
            b bVar6 = bVar5;
            b bVar7 = this.f39069w;
            if (bVar7 == null) {
                bVar7 = this.f39048b.k();
            }
            b bVar8 = bVar7;
            M m10 = this.f39070x;
            if (m10 == null) {
                m10 = this.f39048b.i();
            }
            M m11 = m10;
            M m12 = this.f39071y;
            if (m12 == null) {
                m12 = this.f39048b.h();
            }
            M m13 = m12;
            M m14 = this.f39072z;
            if (m14 == null) {
                m14 = this.f39048b.d();
            }
            M m15 = m14;
            M m16 = this.f39032A;
            if (m16 == null) {
                m16 = this.f39048b.n();
            }
            M m17 = m16;
            r rVar = this.f39041J;
            if (rVar == null && (rVar = this.f39044M) == null) {
                rVar = j();
            }
            r rVar2 = rVar;
            j jVar = this.f39042K;
            if (jVar == null && (jVar = this.f39045N) == null) {
                jVar = l();
            }
            j jVar2 = jVar;
            O5.h hVar = this.f39043L;
            if (hVar == null && (hVar = this.f39046O) == null) {
                hVar = k();
            }
            O5.h hVar2 = hVar;
            n.a aVar6 = this.f39033B;
            n y10 = S5.j.y(aVar6 != null ? aVar6.a() : null);
            c.b bVar9 = this.f39034C;
            Integer num = this.f39035D;
            Drawable drawable = this.f39036E;
            Integer num2 = this.f39037F;
            Drawable drawable2 = this.f39038G;
            Integer num3 = this.f39039H;
            Drawable drawable3 = this.f39040I;
            d dVar = r43;
            boolean z13 = z11;
            c.a aVar7 = aVar4;
            List<? extends Q5.a> list2 = list;
            h.a aVar8 = aVar2;
            v<? extends i.a<?>, ? extends Class<?>> vVar2 = vVar;
            e eVar3 = eVar2;
            ColorSpace colorSpace2 = colorSpace;
            Bitmap.Config config3 = config2;
            String str2 = str;
            c.b bVar10 = bVar2;
            b bVar11 = bVar;
            P5.a aVar9 = aVar;
            Object obj3 = obj2;
            d dVar2 = new d(this.f39041J, this.f39042K, this.f39043L, this.f39070x, this.f39071y, this.f39072z, this.f39032A, this.f39060n, this.f39056j, this.f39054h, this.f39064r, this.f39065s, this.f39067u, this.f39068v, this.f39069w);
            return new h(context, obj3, aVar9, bVar11, bVar10, str2, config3, colorSpace2, eVar3, vVar2, aVar8, list2, aVar7, x10, z10, z13, booleanValue, booleanValue2, z12, bVar4, bVar6, bVar8, m11, m13, m15, m17, rVar2, jVar2, hVar2, y10, bVar9, num, drawable, num2, drawable2, num3, drawable3, dVar, this.f39048b, (DefaultConstructorMarker) null);
        }

        public final a b(Object obj) {
            this.f39049c = obj;
            return this;
        }

        public final a c(c cVar) {
            this.f39048b = cVar;
            h();
            return this;
        }

        public final a d(b bVar) {
            this.f39068v = bVar;
            return this;
        }

        public final a e(b bVar) {
            this.f39051e = bVar;
            return this;
        }

        public final a f(b bVar) {
            this.f39067u = bVar;
            return this;
        }

        public final a g(e eVar) {
            this.f39056j = eVar;
            return this;
        }

        public final a m(j jVar) {
            this.f39042K = jVar;
            i();
            return this;
        }

        public final a n(P5.a aVar) {
            this.f39050d = aVar;
            i();
            return this;
        }

        public a(h hVar, Context context) {
            this.f39047a = context;
            this.f39048b = hVar.p();
            this.f39049c = hVar.m();
            this.f39050d = hVar.M();
            this.f39051e = hVar.A();
            this.f39052f = hVar.B();
            this.f39053g = hVar.r();
            this.f39054h = hVar.q().c();
            this.f39055i = hVar.k();
            this.f39056j = hVar.q().k();
            this.f39057k = hVar.w();
            this.f39058l = hVar.o();
            this.f39059m = hVar.O();
            this.f39060n = hVar.q().o();
            this.f39061o = hVar.x().p();
            this.f39062p = X.z(hVar.L().a());
            this.f39063q = hVar.g();
            this.f39064r = hVar.q().a();
            this.f39065s = hVar.q().b();
            this.f39066t = hVar.I();
            this.f39067u = hVar.q().i();
            this.f39068v = hVar.q().e();
            this.f39069w = hVar.q().j();
            this.f39070x = hVar.q().g();
            this.f39071y = hVar.q().f();
            this.f39072z = hVar.q().d();
            this.f39032A = hVar.q().n();
            this.f39033B = hVar.E().k();
            this.f39034C = hVar.G();
            this.f39035D = hVar.f38998F;
            this.f39036E = hVar.f38999G;
            this.f39037F = hVar.f39000H;
            this.f39038G = hVar.f39001I;
            this.f39039H = hVar.f39002J;
            this.f39040I = hVar.f39003K;
            this.f39041J = hVar.q().h();
            this.f39042K = hVar.q().m();
            this.f39043L = hVar.q().l();
            if (hVar.l() == context) {
                this.f39044M = hVar.z();
                this.f39045N = hVar.K();
                this.f39046O = hVar.J();
                return;
            }
            this.f39044M = null;
            this.f39045N = null;
            this.f39046O = null;
        }
    }
}
