package k6;

import T5.l;
import T5.n;
import WK.C16777l;
import X5.C6724i;
import XH.v;
import YH.X;
import Z5.j;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import dI.C17168i;
import f6.C7853d;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.W;
import l6.C8531c;
import l6.f;
import l6.h;
import l6.k;
import nI.C17642l;
import o6.C8607a;
import r6.C8695c;
import r6.E;
import uI.C18055d;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\bC\u0018\u00002\u00020\u0001:\u0004?<76Bµ\u0002\b\u0002\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u001c\u0010\u0014\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\"0!\u0012\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\"0!\u0012\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\"0!\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b6\u00105J\u000f\u00107\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b7\u00105J\u001d\u00109\u001a\u0002082\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0007¢\u0006\u0004\b9\u0010:R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b6\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0005\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b7\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b<\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b?\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bO\u0010H\u001a\u0004\bP\u0010JR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR-\u0010\u0014\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bP\u0010U\u001a\u0004\bV\u0010WR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bK\u0010ZR\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u0017\u0010\u0019\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b_\u0010\\\u001a\u0004\b_\u0010^R\u0017\u0010\u001a\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bV\u0010\\\u001a\u0004\bG\u0010^R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bS\u0010`\u001a\u0004\ba\u0010bR\u0017\u0010\u001d\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b]\u0010`\u001a\u0004\bX\u0010bR\u0017\u0010\u001e\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bE\u0010`\u001a\u0004\bc\u0010bR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\bI\u0010d\u001a\u0004\be\u0010fR%\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\"0!8\u0006¢\u0006\f\n\u0004\bM\u0010g\u001a\u0004\bh\u0010iR%\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\"0!8\u0006¢\u0006\f\n\u0004\ba\u0010g\u001a\u0004\bj\u0010iR%\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\"0!8\u0006¢\u0006\f\n\u0004\bc\u0010g\u001a\u0004\bk\u0010iR\u0017\u0010'\u001a\u00020&8\u0006¢\u0006\f\n\u0004\be\u0010l\u001a\u0004\bm\u0010nR\u0017\u0010)\u001a\u00020(8\u0006¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u0017\u0010+\u001a\u00020*8\u0006¢\u0006\f\n\u0004\bq\u0010s\u001a\u0004\bo\u0010tR\u0017\u0010-\u001a\u00020,8\u0006¢\u0006\f\n\u0004\bm\u0010u\u001a\u0004\b[\u0010vR\u0017\u0010/\u001a\u00020.8\u0006¢\u0006\f\n\u0004\bB\u0010w\u001a\u0004\bQ\u0010xR\u0017\u00101\u001a\u0002008\u0006¢\u0006\f\n\u0004\b9\u0010y\u001a\u0004\bO\u0010z¨\u0006{"}, d2 = {"Lk6/h;", "", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "data", "Lo6/a;", "target", "Lk6/h$d;", "listener", "", "memoryCacheKey", "", "memoryCacheKeyExtras", "diskCacheKey", "LWK/l;", "fileSystem", "LXH/v;", "LZ5/j$a;", "LuI/d;", "fetcherFactory", "LX5/i$a;", "decoderFactory", "LdI/i;", "interceptorCoroutineContext", "fetcherCoroutineContext", "decoderCoroutineContext", "Lk6/c;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "Lf6/d$b;", "placeholderMemoryCacheKey", "Lkotlin/Function1;", "LT5/n;", "placeholderFactory", "errorFactory", "fallbackFactory", "Ll6/j;", "sizeResolver", "Ll6/f;", "scale", "Ll6/c;", "precision", "LT5/l;", "extras", "Lk6/h$c;", "defined", "Lk6/h$b;", "defaults", "<init>", "(Landroid/content/Context;Ljava/lang/Object;Lo6/a;Lk6/h$d;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;LWK/l;LXH/v;LX5/i$a;LdI/i;LdI/i;LdI/i;Lk6/c;Lk6/c;Lk6/c;Lf6/d$b;LnI/l;LnI/l;LnI/l;Ll6/j;Ll6/f;Ll6/c;LT5/l;Lk6/h$c;Lk6/h$b;)V", "B", "()LT5/n;", "a", "b", "Lk6/h$a;", "z", "(Landroid/content/Context;)Lk6/h$a;", "Landroid/content/Context;", "c", "()Landroid/content/Context;", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "Lo6/a;", "y", "()Lo6/a;", "Lk6/h$d;", "p", "()Lk6/h$d;", "e", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "f", "Ljava/util/Map;", "r", "()Ljava/util/Map;", "g", "i", "h", "LWK/l;", "n", "()LWK/l;", "LXH/v;", "m", "()LXH/v;", "j", "LX5/i$a;", "()LX5/i$a;", "k", "LdI/i;", "o", "()LdI/i;", "l", "Lk6/c;", "s", "()Lk6/c;", "t", "Lf6/d$b;", "u", "()Lf6/d$b;", "LnI/l;", "getPlaceholderFactory", "()LnI/l;", "getErrorFactory", "getFallbackFactory", "Ll6/j;", "x", "()Ll6/j;", "v", "Ll6/f;", "w", "()Ll6/f;", "Ll6/c;", "()Ll6/c;", "LT5/l;", "()LT5/l;", "Lk6/h$c;", "()Lk6/h$c;", "Lk6/h$b;", "()Lk6/h$b;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: k6.h  reason: case insensitive filesystem */
public final class C8441h {

    /* renamed from: a  reason: collision with root package name */
    private final Context f54156a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f54157b;

    /* renamed from: c  reason: collision with root package name */
    private final C8607a f54158c;

    /* renamed from: d  reason: collision with root package name */
    private final d f54159d;

    /* renamed from: e  reason: collision with root package name */
    private final String f54160e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f54161f;

    /* renamed from: g  reason: collision with root package name */
    private final String f54162g;

    /* renamed from: h  reason: collision with root package name */
    private final C16777l f54163h;

    /* renamed from: i  reason: collision with root package name */
    private final v<j.a<?>, C18055d<?>> f54164i;

    /* renamed from: j  reason: collision with root package name */
    private final C6724i.a f54165j;

    /* renamed from: k  reason: collision with root package name */
    private final C17168i f54166k;

    /* renamed from: l  reason: collision with root package name */
    private final C17168i f54167l;

    /* renamed from: m  reason: collision with root package name */
    private final C17168i f54168m;

    /* renamed from: n  reason: collision with root package name */
    private final C8436c f54169n;

    /* renamed from: o  reason: collision with root package name */
    private final C8436c f54170o;

    /* renamed from: p  reason: collision with root package name */
    private final C8436c f54171p;

    /* renamed from: q  reason: collision with root package name */
    private final C7853d.b f54172q;

    /* renamed from: r  reason: collision with root package name */
    private final C17642l<C8441h, n> f54173r;

    /* renamed from: s  reason: collision with root package name */
    private final C17642l<C8441h, n> f54174s;

    /* renamed from: t  reason: collision with root package name */
    private final C17642l<C8441h, n> f54175t;

    /* renamed from: u  reason: collision with root package name */
    private final l6.j f54176u;

    /* renamed from: v  reason: collision with root package name */
    private final f f54177v;

    /* renamed from: w  reason: collision with root package name */
    private final C8531c f54178w;

    /* renamed from: x  reason: collision with root package name */
    private final l f54179x;

    /* renamed from: y  reason: collision with root package name */
    private final c f54180y;

    /* renamed from: z  reason: collision with root package name */
    private final b f54181z;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\u0018\u0000 62\u00020\u0001:\u0001\u001cB½\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJÃ\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b%\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b'\u0010+R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010+R%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f8\u0006¢\u0006\f\n\u0004\b&\u0010/\u001a\u0004\b0\u00101R%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f8\u0006¢\u0006\f\n\u0004\b\u001f\u0010/\u001a\u0004\b(\u00101R%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f8\u0006¢\u0006\f\n\u0004\b#\u0010/\u001a\u0004\b-\u00101R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b*\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b.\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b0\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b9\u0010;\u001a\u0004\b,\u0010<¨\u0006="}, d2 = {"Lk6/h$b;", "", "LWK/l;", "fileSystem", "LdI/i;", "interceptorCoroutineContext", "fetcherCoroutineContext", "decoderCoroutineContext", "Lk6/c;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "Lkotlin/Function1;", "Lk6/h;", "LT5/n;", "placeholderFactory", "errorFactory", "fallbackFactory", "Ll6/j;", "sizeResolver", "Ll6/f;", "scale", "Ll6/c;", "precision", "LT5/l;", "extras", "<init>", "(LWK/l;LdI/i;LdI/i;LdI/i;Lk6/c;Lk6/c;Lk6/c;LnI/l;LnI/l;LnI/l;Ll6/j;Ll6/f;Ll6/c;LT5/l;)V", "a", "(LWK/l;LdI/i;LdI/i;LdI/i;Lk6/c;Lk6/c;Lk6/c;LnI/l;LnI/l;LnI/l;Ll6/j;Ll6/f;Ll6/c;LT5/l;)Lk6/h$b;", "LWK/l;", "i", "()LWK/l;", "b", "LdI/i;", "j", "()LdI/i;", "c", "h", "d", "e", "Lk6/c;", "k", "()Lk6/c;", "f", "g", "l", "LnI/l;", "m", "()LnI/l;", "Ll6/j;", "p", "()Ll6/j;", "Ll6/f;", "o", "()Ll6/f;", "Ll6/c;", "n", "()Ll6/c;", "LT5/l;", "()LT5/l;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: k6.h$b */
    public static final class b {

        /* renamed from: o  reason: collision with root package name */
        public static final a f54208o = new a((DefaultConstructorMarker) null);

        /* renamed from: p  reason: collision with root package name */
        public static final b f54209p = new b((C16777l) null, (C17168i) null, (C17168i) null, (C17168i) null, (C8436c) null, (C8436c) null, (C8436c) null, (C17642l) null, (C17642l) null, (C17642l) null, (l6.j) null, (f) null, (C8531c) null, (l) null, 16383, (DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final C16777l f54210a;

        /* renamed from: b  reason: collision with root package name */
        private final C17168i f54211b;

        /* renamed from: c  reason: collision with root package name */
        private final C17168i f54212c;

        /* renamed from: d  reason: collision with root package name */
        private final C17168i f54213d;

        /* renamed from: e  reason: collision with root package name */
        private final C8436c f54214e;

        /* renamed from: f  reason: collision with root package name */
        private final C8436c f54215f;

        /* renamed from: g  reason: collision with root package name */
        private final C8436c f54216g;

        /* renamed from: h  reason: collision with root package name */
        private final C17642l<C8441h, n> f54217h;

        /* renamed from: i  reason: collision with root package name */
        private final C17642l<C8441h, n> f54218i;

        /* renamed from: j  reason: collision with root package name */
        private final C17642l<C8441h, n> f54219j;

        /* renamed from: k  reason: collision with root package name */
        private final l6.j f54220k;

        /* renamed from: l  reason: collision with root package name */
        private final f f54221l;

        /* renamed from: m  reason: collision with root package name */
        private final C8531c f54222m;

        /* renamed from: n  reason: collision with root package name */
        private final l f54223n;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lk6/h$b$a;", "", "<init>", "()V", "Lk6/h$b;", "DEFAULT", "Lk6/h$b;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: k6.h$b$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public b() {
            this((C16777l) null, (C17168i) null, (C17168i) null, (C17168i) null, (C8436c) null, (C8436c) null, (C8436c) null, (C17642l) null, (C17642l) null, (C17642l) null, (l6.j) null, (f) null, (C8531c) null, (l) null, 16383, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ b b(b bVar, C16777l lVar, C17168i iVar, C17168i iVar2, C17168i iVar3, C8436c cVar, C8436c cVar2, C8436c cVar3, C17642l lVar2, C17642l lVar3, C17642l lVar4, l6.j jVar, f fVar, C8531c cVar4, l lVar5, int i10, Object obj) {
            b bVar2 = bVar;
            int i11 = i10;
            return bVar.a((i11 & 1) != 0 ? bVar2.f54210a : lVar, (i11 & 2) != 0 ? bVar2.f54211b : iVar, (i11 & 4) != 0 ? bVar2.f54212c : iVar2, (i11 & 8) != 0 ? bVar2.f54213d : iVar3, (i11 & 16) != 0 ? bVar2.f54214e : cVar, (i11 & 32) != 0 ? bVar2.f54215f : cVar2, (i11 & 64) != 0 ? bVar2.f54216g : cVar3, (i11 & 128) != 0 ? bVar2.f54217h : lVar2, (i11 & 256) != 0 ? bVar2.f54218i : lVar3, (i11 & 512) != 0 ? bVar2.f54219j : lVar4, (i11 & 1024) != 0 ? bVar2.f54220k : jVar, (i11 & RecyclerView.n.FLAG_MOVED) != 0 ? bVar2.f54221l : fVar, (i11 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? bVar2.f54222m : cVar4, (i11 & 8192) != 0 ? bVar2.f54223n : lVar5);
        }

        public final b a(C16777l lVar, C17168i iVar, C17168i iVar2, C17168i iVar3, C8436c cVar, C8436c cVar2, C8436c cVar3, C17642l<? super C8441h, ? extends n> lVar2, C17642l<? super C8441h, ? extends n> lVar3, C17642l<? super C8441h, ? extends n> lVar4, l6.j jVar, f fVar, C8531c cVar4, l lVar5) {
            return new b(lVar, iVar, iVar2, iVar3, cVar, cVar2, cVar3, lVar2, lVar3, lVar4, jVar, fVar, cVar4, lVar5);
        }

        public final C17168i c() {
            return this.f54213d;
        }

        public final C8436c d() {
            return this.f54215f;
        }

        public final C17642l<C8441h, n> e() {
            return this.f54218i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f54210a, bVar.f54210a) && C17542s.e(this.f54211b, bVar.f54211b) && C17542s.e(this.f54212c, bVar.f54212c) && C17542s.e(this.f54213d, bVar.f54213d) && this.f54214e == bVar.f54214e && this.f54215f == bVar.f54215f && this.f54216g == bVar.f54216g && C17542s.e(this.f54217h, bVar.f54217h) && C17542s.e(this.f54218i, bVar.f54218i) && C17542s.e(this.f54219j, bVar.f54219j) && C17542s.e(this.f54220k, bVar.f54220k) && this.f54221l == bVar.f54221l && this.f54222m == bVar.f54222m && C17542s.e(this.f54223n, bVar.f54223n);
        }

        public final l f() {
            return this.f54223n;
        }

        public final C17642l<C8441h, n> g() {
            return this.f54219j;
        }

        public final C17168i h() {
            return this.f54212c;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((this.f54210a.hashCode() * 31) + this.f54211b.hashCode()) * 31) + this.f54212c.hashCode()) * 31) + this.f54213d.hashCode()) * 31) + this.f54214e.hashCode()) * 31) + this.f54215f.hashCode()) * 31) + this.f54216g.hashCode()) * 31) + this.f54217h.hashCode()) * 31) + this.f54218i.hashCode()) * 31) + this.f54219j.hashCode()) * 31) + this.f54220k.hashCode()) * 31) + this.f54221l.hashCode()) * 31) + this.f54222m.hashCode()) * 31) + this.f54223n.hashCode();
        }

        public final C16777l i() {
            return this.f54210a;
        }

        public final C17168i j() {
            return this.f54211b;
        }

        public final C8436c k() {
            return this.f54214e;
        }

        public final C8436c l() {
            return this.f54216g;
        }

        public final C17642l<C8441h, n> m() {
            return this.f54217h;
        }

        public final C8531c n() {
            return this.f54222m;
        }

        public final f o() {
            return this.f54221l;
        }

        public final l6.j p() {
            return this.f54220k;
        }

        public String toString() {
            return "Defaults(fileSystem=" + this.f54210a + ", interceptorCoroutineContext=" + this.f54211b + ", fetcherCoroutineContext=" + this.f54212c + ", decoderCoroutineContext=" + this.f54213d + ", memoryCachePolicy=" + this.f54214e + ", diskCachePolicy=" + this.f54215f + ", networkCachePolicy=" + this.f54216g + ", placeholderFactory=" + this.f54217h + ", errorFactory=" + this.f54218i + ", fallbackFactory=" + this.f54219j + ", sizeResolver=" + this.f54220k + ", scale=" + this.f54221l + ", precision=" + this.f54222m + ", extras=" + this.f54223n + ')';
        }

        public b(C16777l lVar, C17168i iVar, C17168i iVar2, C17168i iVar3, C8436c cVar, C8436c cVar2, C8436c cVar3, C17642l<? super C8441h, ? extends n> lVar2, C17642l<? super C8441h, ? extends n> lVar3, C17642l<? super C8441h, ? extends n> lVar4, l6.j jVar, f fVar, C8531c cVar4, l lVar5) {
            this.f54210a = lVar;
            this.f54211b = iVar;
            this.f54212c = iVar2;
            this.f54213d = iVar3;
            this.f54214e = cVar;
            this.f54215f = cVar2;
            this.f54216g = cVar3;
            this.f54217h = lVar2;
            this.f54218i = lVar3;
            this.f54219j = lVar4;
            this.f54220k = jVar;
            this.f54221l = fVar;
            this.f54222m = cVar4;
            this.f54223n = lVar5;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ b(WK.C16777l r15, dI.C17168i r16, dI.C17168i r17, dI.C17168i r18, k6.C8436c r19, k6.C8436c r20, k6.C8436c r21, nI.C17642l r22, nI.C17642l r23, nI.C17642l r24, l6.j r25, l6.f r26, l6.C8531c r27, T5.l r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
            /*
                r14 = this;
                r0 = r29
                r1 = r0 & 1
                if (r1 == 0) goto L_0x000b
                WK.l r1 = r6.l.a()
                goto L_0x000c
            L_0x000b:
                r1 = r15
            L_0x000c:
                r2 = r0 & 2
                if (r2 == 0) goto L_0x0013
                dI.j r2 = dI.C17169j.f142968a
                goto L_0x0015
            L_0x0013:
                r2 = r16
            L_0x0015:
                r3 = r0 & 4
                if (r3 == 0) goto L_0x001e
                QJ.M r3 = r6.C8697e.a()
                goto L_0x0020
            L_0x001e:
                r3 = r17
            L_0x0020:
                r4 = r0 & 8
                if (r4 == 0) goto L_0x0029
                QJ.M r4 = r6.C8697e.a()
                goto L_0x002b
            L_0x0029:
                r4 = r18
            L_0x002b:
                r5 = r0 & 16
                if (r5 == 0) goto L_0x0032
                k6.c r5 = k6.C8436c.ENABLED
                goto L_0x0034
            L_0x0032:
                r5 = r19
            L_0x0034:
                r6 = r0 & 32
                if (r6 == 0) goto L_0x003b
                k6.c r6 = k6.C8436c.ENABLED
                goto L_0x003d
            L_0x003b:
                r6 = r20
            L_0x003d:
                r7 = r0 & 64
                if (r7 == 0) goto L_0x0044
                k6.c r7 = k6.C8436c.ENABLED
                goto L_0x0046
            L_0x0044:
                r7 = r21
            L_0x0046:
                r8 = r0 & 128(0x80, float:1.794E-43)
                if (r8 == 0) goto L_0x004f
                nI.l r8 = r6.E.k()
                goto L_0x0051
            L_0x004f:
                r8 = r22
            L_0x0051:
                r9 = r0 & 256(0x100, float:3.59E-43)
                if (r9 == 0) goto L_0x005a
                nI.l r9 = r6.E.k()
                goto L_0x005c
            L_0x005a:
                r9 = r23
            L_0x005c:
                r10 = r0 & 512(0x200, float:7.175E-43)
                if (r10 == 0) goto L_0x0065
                nI.l r10 = r6.E.k()
                goto L_0x0067
            L_0x0065:
                r10 = r24
            L_0x0067:
                r11 = r0 & 1024(0x400, float:1.435E-42)
                if (r11 == 0) goto L_0x006e
                l6.j r11 = l6.j.f54775c
                goto L_0x0070
            L_0x006e:
                r11 = r25
            L_0x0070:
                r12 = r0 & 2048(0x800, float:2.87E-42)
                if (r12 == 0) goto L_0x0077
                l6.f r12 = l6.f.FIT
                goto L_0x0079
            L_0x0077:
                r12 = r26
            L_0x0079:
                r13 = r0 & 4096(0x1000, float:5.74E-42)
                if (r13 == 0) goto L_0x0080
                l6.c r13 = l6.C8531c.EXACT
                goto L_0x0082
            L_0x0080:
                r13 = r27
            L_0x0082:
                r0 = r0 & 8192(0x2000, float:1.14794E-41)
                if (r0 == 0) goto L_0x0089
                T5.l r0 = T5.l.f40051c
                goto L_0x008b
            L_0x0089:
                r0 = r28
            L_0x008b:
                r15 = r14
                r16 = r1
                r17 = r2
                r18 = r3
                r19 = r4
                r20 = r5
                r21 = r6
                r22 = r7
                r23 = r8
                r24 = r9
                r25 = r10
                r26 = r11
                r27 = r12
                r28 = r13
                r29 = r0
                r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: k6.C8441h.b.<init>(WK.l, dI.i, dI.i, dI.i, k6.c, k6.c, k6.c, nI.l, nI.l, nI.l, l6.j, l6.f, l6.c, T5.l, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\u0018\u00002\u00020\u0001B³\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f\u0012\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b\u001a\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b\u001e\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010%\u001a\u0004\b(\u0010'R'\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b&\u0010)\u001a\u0004\b*\u0010+R'\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\"\u0010+R'\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b*\u0010)\u001a\u0004\b$\u0010+R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u00102R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b.\u00103\u001a\u0004\b,\u00104¨\u00065"}, d2 = {"Lk6/h$c;", "", "LWK/l;", "fileSystem", "LdI/i;", "interceptorCoroutineContext", "fetcherCoroutineContext", "decoderCoroutineContext", "Lk6/c;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "Lkotlin/Function1;", "Lk6/h;", "LT5/n;", "placeholderFactory", "errorFactory", "fallbackFactory", "Ll6/j;", "sizeResolver", "Ll6/f;", "scale", "Ll6/c;", "precision", "<init>", "(LWK/l;LdI/i;LdI/i;LdI/i;Lk6/c;Lk6/c;Lk6/c;LnI/l;LnI/l;LnI/l;Ll6/j;Ll6/f;Ll6/c;)V", "a", "LWK/l;", "f", "()LWK/l;", "b", "LdI/i;", "g", "()LdI/i;", "c", "e", "d", "Lk6/c;", "h", "()Lk6/c;", "i", "LnI/l;", "j", "()LnI/l;", "k", "Ll6/j;", "m", "()Ll6/j;", "l", "Ll6/f;", "()Ll6/f;", "Ll6/c;", "()Ll6/c;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: k6.h$c */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final C16777l f54224a;

        /* renamed from: b  reason: collision with root package name */
        private final C17168i f54225b;

        /* renamed from: c  reason: collision with root package name */
        private final C17168i f54226c;

        /* renamed from: d  reason: collision with root package name */
        private final C17168i f54227d;

        /* renamed from: e  reason: collision with root package name */
        private final C8436c f54228e;

        /* renamed from: f  reason: collision with root package name */
        private final C8436c f54229f;

        /* renamed from: g  reason: collision with root package name */
        private final C8436c f54230g;

        /* renamed from: h  reason: collision with root package name */
        private final C17642l<C8441h, n> f54231h;

        /* renamed from: i  reason: collision with root package name */
        private final C17642l<C8441h, n> f54232i;

        /* renamed from: j  reason: collision with root package name */
        private final C17642l<C8441h, n> f54233j;

        /* renamed from: k  reason: collision with root package name */
        private final l6.j f54234k;

        /* renamed from: l  reason: collision with root package name */
        private final f f54235l;

        /* renamed from: m  reason: collision with root package name */
        private final C8531c f54236m;

        public c(C16777l lVar, C17168i iVar, C17168i iVar2, C17168i iVar3, C8436c cVar, C8436c cVar2, C8436c cVar3, C17642l<? super C8441h, ? extends n> lVar2, C17642l<? super C8441h, ? extends n> lVar3, C17642l<? super C8441h, ? extends n> lVar4, l6.j jVar, f fVar, C8531c cVar4) {
            this.f54224a = lVar;
            this.f54225b = iVar;
            this.f54226c = iVar2;
            this.f54227d = iVar3;
            this.f54228e = cVar;
            this.f54229f = cVar2;
            this.f54230g = cVar3;
            this.f54231h = lVar2;
            this.f54232i = lVar3;
            this.f54233j = lVar4;
            this.f54234k = jVar;
            this.f54235l = fVar;
            this.f54236m = cVar4;
        }

        public final C17168i a() {
            return this.f54227d;
        }

        public final C8436c b() {
            return this.f54229f;
        }

        public final C17642l<C8441h, n> c() {
            return this.f54232i;
        }

        public final C17642l<C8441h, n> d() {
            return this.f54233j;
        }

        public final C17168i e() {
            return this.f54226c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f54224a, cVar.f54224a) && C17542s.e(this.f54225b, cVar.f54225b) && C17542s.e(this.f54226c, cVar.f54226c) && C17542s.e(this.f54227d, cVar.f54227d) && this.f54228e == cVar.f54228e && this.f54229f == cVar.f54229f && this.f54230g == cVar.f54230g && C17542s.e(this.f54231h, cVar.f54231h) && C17542s.e(this.f54232i, cVar.f54232i) && C17542s.e(this.f54233j, cVar.f54233j) && C17542s.e(this.f54234k, cVar.f54234k) && this.f54235l == cVar.f54235l && this.f54236m == cVar.f54236m;
        }

        public final C16777l f() {
            return this.f54224a;
        }

        public final C17168i g() {
            return this.f54225b;
        }

        public final C8436c h() {
            return this.f54228e;
        }

        public int hashCode() {
            C16777l lVar = this.f54224a;
            int i10 = 0;
            int hashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
            C17168i iVar = this.f54225b;
            int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
            C17168i iVar2 = this.f54226c;
            int hashCode3 = (hashCode2 + (iVar2 == null ? 0 : iVar2.hashCode())) * 31;
            C17168i iVar3 = this.f54227d;
            int hashCode4 = (hashCode3 + (iVar3 == null ? 0 : iVar3.hashCode())) * 31;
            C8436c cVar = this.f54228e;
            int hashCode5 = (hashCode4 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            C8436c cVar2 = this.f54229f;
            int hashCode6 = (hashCode5 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            C8436c cVar3 = this.f54230g;
            int hashCode7 = (hashCode6 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            C17642l<C8441h, n> lVar2 = this.f54231h;
            int hashCode8 = (hashCode7 + (lVar2 == null ? 0 : lVar2.hashCode())) * 31;
            C17642l<C8441h, n> lVar3 = this.f54232i;
            int hashCode9 = (hashCode8 + (lVar3 == null ? 0 : lVar3.hashCode())) * 31;
            C17642l<C8441h, n> lVar4 = this.f54233j;
            int hashCode10 = (hashCode9 + (lVar4 == null ? 0 : lVar4.hashCode())) * 31;
            l6.j jVar = this.f54234k;
            int hashCode11 = (hashCode10 + (jVar == null ? 0 : jVar.hashCode())) * 31;
            f fVar = this.f54235l;
            int hashCode12 = (hashCode11 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            C8531c cVar4 = this.f54236m;
            if (cVar4 != null) {
                i10 = cVar4.hashCode();
            }
            return hashCode12 + i10;
        }

        public final C8436c i() {
            return this.f54230g;
        }

        public final C17642l<C8441h, n> j() {
            return this.f54231h;
        }

        public final C8531c k() {
            return this.f54236m;
        }

        public final f l() {
            return this.f54235l;
        }

        public final l6.j m() {
            return this.f54234k;
        }

        public String toString() {
            return "Defined(fileSystem=" + this.f54224a + ", interceptorCoroutineContext=" + this.f54225b + ", fetcherCoroutineContext=" + this.f54226c + ", decoderCoroutineContext=" + this.f54227d + ", memoryCachePolicy=" + this.f54228e + ", diskCachePolicy=" + this.f54229f + ", networkCachePolicy=" + this.f54230g + ", placeholderFactory=" + this.f54231h + ", errorFactory=" + this.f54232i + ", fallbackFactory=" + this.f54233j + ", sizeResolver=" + this.f54234k + ", scale=" + this.f54235l + ", precision=" + this.f54236m + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lk6/h$d;", "", "Lk6/h;", "request", "LXH/N;", "b", "(Lk6/h;)V", "d", "Lk6/e;", "result", "c", "(Lk6/h;Lk6/e;)V", "Lk6/u;", "a", "(Lk6/h;Lk6/u;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: k6.h$d */
    public interface d {
        void a(C8441h hVar, C8454u uVar) {
        }

        void b(C8441h hVar) {
        }

        void c(C8441h hVar, C8438e eVar) {
        }

        void d(C8441h hVar) {
        }
    }

    public /* synthetic */ C8441h(Context context, Object obj, C8607a aVar, d dVar, String str, Map map, String str2, C16777l lVar, v vVar, C6724i.a aVar2, C17168i iVar, C17168i iVar2, C17168i iVar3, C8436c cVar, C8436c cVar2, C8436c cVar3, C7853d.b bVar, C17642l lVar2, C17642l lVar3, C17642l lVar4, l6.j jVar, f fVar, C8531c cVar4, l lVar5, c cVar5, b bVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, aVar, dVar, str, map, str2, lVar, vVar, aVar2, iVar, iVar2, iVar3, cVar, cVar2, cVar3, bVar, lVar2, lVar3, lVar4, jVar, fVar, cVar4, lVar5, cVar5, bVar2);
    }

    public static /* synthetic */ a A(C8441h hVar, Context context, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = hVar.f54156a;
        }
        return hVar.z(context);
    }

    public final n B() {
        n invoke = this.f54173r.invoke(this);
        return invoke == null ? this.f54181z.m().invoke(this) : invoke;
    }

    public final n a() {
        n invoke = this.f54174s.invoke(this);
        return invoke == null ? this.f54181z.e().invoke(this) : invoke;
    }

    public final n b() {
        n invoke = this.f54175t.invoke(this);
        return invoke == null ? this.f54181z.g().invoke(this) : invoke;
    }

    public final Context c() {
        return this.f54156a;
    }

    public final Object d() {
        return this.f54157b;
    }

    public final C17168i e() {
        return this.f54168m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8441h)) {
            return false;
        }
        C8441h hVar = (C8441h) obj;
        return C17542s.e(this.f54156a, hVar.f54156a) && C17542s.e(this.f54157b, hVar.f54157b) && C17542s.e(this.f54158c, hVar.f54158c) && C17542s.e(this.f54159d, hVar.f54159d) && C17542s.e(this.f54160e, hVar.f54160e) && C17542s.e(this.f54161f, hVar.f54161f) && C17542s.e(this.f54162g, hVar.f54162g) && C17542s.e(this.f54163h, hVar.f54163h) && C17542s.e(this.f54164i, hVar.f54164i) && C17542s.e(this.f54165j, hVar.f54165j) && C17542s.e(this.f54166k, hVar.f54166k) && C17542s.e(this.f54167l, hVar.f54167l) && C17542s.e(this.f54168m, hVar.f54168m) && this.f54169n == hVar.f54169n && this.f54170o == hVar.f54170o && this.f54171p == hVar.f54171p && C17542s.e(this.f54172q, hVar.f54172q) && C17542s.e(this.f54173r, hVar.f54173r) && C17542s.e(this.f54174s, hVar.f54174s) && C17542s.e(this.f54175t, hVar.f54175t) && C17542s.e(this.f54176u, hVar.f54176u) && this.f54177v == hVar.f54177v && this.f54178w == hVar.f54178w && C17542s.e(this.f54179x, hVar.f54179x) && C17542s.e(this.f54180y, hVar.f54180y) && C17542s.e(this.f54181z, hVar.f54181z);
    }

    public final C6724i.a f() {
        return this.f54165j;
    }

    public final b g() {
        return this.f54181z;
    }

    public final c h() {
        return this.f54180y;
    }

    public int hashCode() {
        int hashCode = ((this.f54156a.hashCode() * 31) + this.f54157b.hashCode()) * 31;
        C8607a aVar = this.f54158c;
        int i10 = 0;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        d dVar = this.f54159d;
        int hashCode3 = (hashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.f54160e;
        int hashCode4 = (((hashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.f54161f.hashCode()) * 31;
        String str2 = this.f54162g;
        int hashCode5 = (((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f54163h.hashCode()) * 31;
        v<j.a<?>, C18055d<?>> vVar = this.f54164i;
        int hashCode6 = (hashCode5 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        C6724i.a aVar2 = this.f54165j;
        int hashCode7 = (((((((((((((hashCode6 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31) + this.f54166k.hashCode()) * 31) + this.f54167l.hashCode()) * 31) + this.f54168m.hashCode()) * 31) + this.f54169n.hashCode()) * 31) + this.f54170o.hashCode()) * 31) + this.f54171p.hashCode()) * 31;
        C7853d.b bVar = this.f54172q;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return ((((((((((((((((((hashCode7 + i10) * 31) + this.f54173r.hashCode()) * 31) + this.f54174s.hashCode()) * 31) + this.f54175t.hashCode()) * 31) + this.f54176u.hashCode()) * 31) + this.f54177v.hashCode()) * 31) + this.f54178w.hashCode()) * 31) + this.f54179x.hashCode()) * 31) + this.f54180y.hashCode()) * 31) + this.f54181z.hashCode();
    }

    public final String i() {
        return this.f54162g;
    }

    public final C8436c j() {
        return this.f54170o;
    }

    public final l k() {
        return this.f54179x;
    }

    public final C17168i l() {
        return this.f54167l;
    }

    public final v<j.a<?>, C18055d<?>> m() {
        return this.f54164i;
    }

    public final C16777l n() {
        return this.f54163h;
    }

    public final C17168i o() {
        return this.f54166k;
    }

    public final d p() {
        return this.f54159d;
    }

    public final String q() {
        return this.f54160e;
    }

    public final Map<String, String> r() {
        return this.f54161f;
    }

    public final C8436c s() {
        return this.f54169n;
    }

    public final C8436c t() {
        return this.f54171p;
    }

    public String toString() {
        return "ImageRequest(context=" + this.f54156a + ", data=" + this.f54157b + ", target=" + this.f54158c + ", listener=" + this.f54159d + ", memoryCacheKey=" + this.f54160e + ", memoryCacheKeyExtras=" + this.f54161f + ", diskCacheKey=" + this.f54162g + ", fileSystem=" + this.f54163h + ", fetcherFactory=" + this.f54164i + ", decoderFactory=" + this.f54165j + ", interceptorCoroutineContext=" + this.f54166k + ", fetcherCoroutineContext=" + this.f54167l + ", decoderCoroutineContext=" + this.f54168m + ", memoryCachePolicy=" + this.f54169n + ", diskCachePolicy=" + this.f54170o + ", networkCachePolicy=" + this.f54171p + ", placeholderMemoryCacheKey=" + this.f54172q + ", placeholderFactory=" + this.f54173r + ", errorFactory=" + this.f54174s + ", fallbackFactory=" + this.f54175t + ", sizeResolver=" + this.f54176u + ", scale=" + this.f54177v + ", precision=" + this.f54178w + ", extras=" + this.f54179x + ", defined=" + this.f54180y + ", defaults=" + this.f54181z + ')';
    }

    public final C7853d.b u() {
        return this.f54172q;
    }

    public final C8531c v() {
        return this.f54178w;
    }

    public final f w() {
        return this.f54177v;
    }

    public final l6.j x() {
        return this.f54176u;
    }

    public final C8607a y() {
        return this.f54158c;
    }

    public final a z(Context context) {
        return new a(this, context);
    }

    private C8441h(Context context, Object obj, C8607a aVar, d dVar, String str, Map<String, String> map, String str2, C16777l lVar, v<? extends j.a<?>, ? extends C18055d<?>> vVar, C6724i.a aVar2, C17168i iVar, C17168i iVar2, C17168i iVar3, C8436c cVar, C8436c cVar2, C8436c cVar3, C7853d.b bVar, C17642l<? super C8441h, ? extends n> lVar2, C17642l<? super C8441h, ? extends n> lVar3, C17642l<? super C8441h, ? extends n> lVar4, l6.j jVar, f fVar, C8531c cVar4, l lVar5, c cVar5, b bVar2) {
        this.f54156a = context;
        this.f54157b = obj;
        this.f54158c = aVar;
        this.f54159d = dVar;
        this.f54160e = str;
        this.f54161f = map;
        this.f54162g = str2;
        this.f54163h = lVar;
        this.f54164i = vVar;
        this.f54165j = aVar2;
        this.f54166k = iVar;
        this.f54167l = iVar2;
        this.f54168m = iVar3;
        this.f54169n = cVar;
        this.f54170o = cVar2;
        this.f54171p = cVar3;
        this.f54172q = bVar;
        this.f54173r = lVar2;
        this.f54174s = lVar3;
        this.f54175t = lVar4;
        this.f54176u = jVar;
        this.f54177v = fVar;
        this.f54178w = cVar4;
        this.f54179x = lVar5;
        this.f54180y = cVar5;
        this.f54181z = bVar2;
    }

    @Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001f\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J#\u0010*\u001a\u00020\u00002\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010$0(¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b,\u0010'J#\u0010-\u001a\u00020\u00002\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010$0(¢\u0006\u0004\b-\u0010+J\u0015\u00100\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u0007¢\u0006\u0004\b2\u00103R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u00108R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u00109R\u0018\u0010<\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010;R\u0018\u0010?\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u0010>R\u0016\u0010B\u001a\u00020@8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010AR\u0016\u0010C\u001a\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u00108R\u0018\u0010E\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bD\u0010>R\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bG\u0010HR,\u0010N\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030K\u0012\b\u0012\u0006\u0012\u0002\b\u00030L\u0018\u00010J8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010MR\u0018\u0010Q\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010PR\u0018\u0010T\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010U\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010SR\u0018\u0010V\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010SR\u0018\u0010Y\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010XR\u0018\u0010Z\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010XR\u0018\u0010[\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010XR\u0018\u0010_\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b]\u0010^R&\u0010b\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010$\u0018\u00010(8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b`\u0010aR&\u0010d\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010$\u0018\u00010(8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bc\u0010aR&\u0010f\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010$\u0018\u00010(8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\be\u0010aR\u0018\u0010i\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0016\u0010o\u001a\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bn\u00108R\u0011\u0010r\u001a\u00020p8F¢\u0006\u0006\u001a\u0004\bG\u0010q¨\u0006s"}, d2 = {"Lk6/h$a;", "", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "<init>", "(Landroid/content/Context;)V", "Lk6/h;", "request", "(Lk6/h;Landroid/content/Context;)V", "data", "e", "(Ljava/lang/Object;)Lk6/h$a;", "Lo6/a;", "target", "r", "(Lo6/a;)Lk6/h$a;", "LdI/i;", "d", "(LdI/i;)Lk6/h$a;", "Ll6/h;", "size", "p", "(Ll6/h;)Lk6/h$a;", "Ll6/j;", "resolver", "q", "(Ll6/j;)Lk6/h$a;", "Ll6/f;", "scale", "o", "(Ll6/f;)Lk6/h$a;", "Ll6/c;", "precision", "n", "(Ll6/c;)Lk6/h$a;", "LT5/n;", "image", "k", "(LT5/n;)Lk6/h$a;", "Lkotlin/Function1;", "factory", "l", "(LnI/l;)Lk6/h$a;", "g", "h", "Lk6/h$b;", "defaults", "f", "(Lk6/h$b;)Lk6/h$a;", "c", "()Lk6/h;", "a", "Landroid/content/Context;", "b", "Lk6/h$b;", "Ljava/lang/Object;", "Lo6/a;", "Lk6/h$d;", "Lk6/h$d;", "listener", "", "Ljava/lang/String;", "memoryCacheKey", "", "Z", "memoryCacheKeyExtrasAreMutable", "lazyMemoryCacheKeyExtras", "i", "diskCacheKey", "LWK/l;", "j", "LWK/l;", "fileSystem", "LXH/v;", "LZ5/j$a;", "LuI/d;", "LXH/v;", "fetcherFactory", "LX5/i$a;", "LX5/i$a;", "decoderFactory", "m", "LdI/i;", "interceptorCoroutineContext", "fetcherCoroutineContext", "decoderCoroutineContext", "Lk6/c;", "Lk6/c;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "Lf6/d$b;", "s", "Lf6/d$b;", "placeholderMemoryCacheKey", "t", "LnI/l;", "placeholderFactory", "u", "errorFactory", "v", "fallbackFactory", "w", "Ll6/j;", "sizeResolver", "x", "Ll6/f;", "y", "Ll6/c;", "z", "lazyExtras", "LT5/l$a;", "()LT5/l$a;", "extras", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: k6.h$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f54182a;

        /* renamed from: b  reason: collision with root package name */
        private b f54183b;

        /* renamed from: c  reason: collision with root package name */
        private Object f54184c;

        /* renamed from: d  reason: collision with root package name */
        private C8607a f54185d;

        /* renamed from: e  reason: collision with root package name */
        private d f54186e;

        /* renamed from: f  reason: collision with root package name */
        private String f54187f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f54188g;

        /* renamed from: h  reason: collision with root package name */
        private Object f54189h;

        /* renamed from: i  reason: collision with root package name */
        private String f54190i;

        /* renamed from: j  reason: collision with root package name */
        private C16777l f54191j;

        /* renamed from: k  reason: collision with root package name */
        private v<? extends j.a<?>, ? extends C18055d<?>> f54192k;

        /* renamed from: l  reason: collision with root package name */
        private C6724i.a f54193l;

        /* renamed from: m  reason: collision with root package name */
        private C17168i f54194m;

        /* renamed from: n  reason: collision with root package name */
        private C17168i f54195n;

        /* renamed from: o  reason: collision with root package name */
        private C17168i f54196o;

        /* renamed from: p  reason: collision with root package name */
        private C8436c f54197p;

        /* renamed from: q  reason: collision with root package name */
        private C8436c f54198q;

        /* renamed from: r  reason: collision with root package name */
        private C8436c f54199r;

        /* renamed from: s  reason: collision with root package name */
        private C7853d.b f54200s;

        /* renamed from: t  reason: collision with root package name */
        private C17642l<? super C8441h, ? extends n> f54201t;

        /* renamed from: u  reason: collision with root package name */
        private C17642l<? super C8441h, ? extends n> f54202u;

        /* renamed from: v  reason: collision with root package name */
        private C17642l<? super C8441h, ? extends n> f54203v;

        /* renamed from: w  reason: collision with root package name */
        private l6.j f54204w;

        /* renamed from: x  reason: collision with root package name */
        private f f54205x;

        /* renamed from: y  reason: collision with root package name */
        private C8531c f54206y;

        /* renamed from: z  reason: collision with root package name */
        private Object f54207z;

        public a(Context context) {
            this.f54182a = context;
            this.f54183b = b.f54209p;
            this.f54184c = null;
            this.f54185d = null;
            this.f54186e = null;
            this.f54187f = null;
            this.f54189h = X.j();
            this.f54190i = null;
            this.f54191j = null;
            this.f54192k = null;
            this.f54193l = null;
            this.f54194m = null;
            this.f54195n = null;
            this.f54196o = null;
            this.f54197p = null;
            this.f54198q = null;
            this.f54199r = null;
            this.f54200s = null;
            this.f54201t = E.k();
            this.f54202u = E.k();
            this.f54203v = E.k();
            this.f54204w = null;
            this.f54205x = null;
            this.f54206y = null;
            this.f54207z = l.f40051c;
        }

        /* access modifiers changed from: private */
        public static final n i(n nVar, C8441h hVar) {
            return nVar;
        }

        /* access modifiers changed from: private */
        public static final n m(n nVar, C8441h hVar) {
            return nVar;
        }

        public final C8441h c() {
            Map map;
            l lVar;
            Context context = this.f54182a;
            Object obj = this.f54184c;
            if (obj == null) {
                obj = C8447n.f54251a;
            }
            Object obj2 = obj;
            C8607a aVar = this.f54185d;
            d dVar = this.f54186e;
            String str = this.f54187f;
            Object obj3 = this.f54189h;
            if (C17542s.e(obj3, Boolean.valueOf(this.f54188g))) {
                C17542s.h(obj3, "null cannot be cast to non-null type kotlin.collections.MutableMap<*, *>");
                map = C8695c.d(W.d(obj3));
            } else if (obj3 instanceof Map) {
                map = (Map) obj3;
            } else {
                throw new AssertionError();
            }
            Map map2 = map;
            C17542s.h(map2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            String str2 = this.f54190i;
            C16777l lVar2 = this.f54191j;
            if (lVar2 == null) {
                lVar2 = this.f54183b.i();
            }
            C16777l lVar3 = lVar2;
            v<? extends j.a<?>, ? extends C18055d<?>> vVar = this.f54192k;
            C6724i.a aVar2 = this.f54193l;
            C8436c cVar = this.f54197p;
            if (cVar == null) {
                cVar = this.f54183b.k();
            }
            C8436c cVar2 = cVar;
            C8436c cVar3 = this.f54198q;
            if (cVar3 == null) {
                cVar3 = this.f54183b.d();
            }
            C8436c cVar4 = cVar3;
            C8436c cVar5 = this.f54199r;
            if (cVar5 == null) {
                cVar5 = this.f54183b.l();
            }
            C8436c cVar6 = cVar5;
            C17168i iVar = this.f54194m;
            if (iVar == null) {
                iVar = this.f54183b.j();
            }
            C17168i iVar2 = iVar;
            C17168i iVar3 = this.f54195n;
            if (iVar3 == null) {
                iVar3 = this.f54183b.h();
            }
            C17168i iVar4 = iVar3;
            C17168i iVar5 = this.f54196o;
            if (iVar5 == null) {
                iVar5 = this.f54183b.c();
            }
            C17168i iVar6 = iVar5;
            C7853d.b bVar = this.f54200s;
            C17642l lVar4 = this.f54201t;
            if (lVar4 == null) {
                lVar4 = this.f54183b.m();
            }
            C17642l lVar5 = lVar4;
            C17642l lVar6 = this.f54202u;
            if (lVar6 == null) {
                lVar6 = this.f54183b.e();
            }
            C17642l lVar7 = lVar6;
            C17642l lVar8 = this.f54203v;
            if (lVar8 == null) {
                lVar8 = this.f54183b.g();
            }
            C17642l lVar9 = lVar8;
            l6.j jVar = this.f54204w;
            if (jVar == null) {
                jVar = this.f54183b.p();
            }
            l6.j jVar2 = jVar;
            f fVar = this.f54205x;
            if (fVar == null) {
                fVar = this.f54183b.o();
            }
            f fVar2 = fVar;
            C8531c cVar7 = this.f54206y;
            if (cVar7 == null) {
                cVar7 = this.f54183b.n();
            }
            C8531c cVar8 = cVar7;
            Object obj4 = this.f54207z;
            C8436c cVar9 = cVar2;
            if (obj4 instanceof l.a) {
                lVar = ((l.a) obj4).a();
            } else if (obj4 instanceof l) {
                lVar = (l) obj4;
            } else {
                throw new AssertionError();
            }
            l lVar10 = lVar;
            C16777l lVar11 = this.f54191j;
            C17168i iVar7 = this.f54194m;
            C17168i iVar8 = iVar6;
            C17168i iVar9 = this.f54195n;
            C17168i iVar10 = iVar4;
            C17168i iVar11 = this.f54196o;
            C17168i iVar12 = iVar2;
            C17642l<? super C8441h, ? extends n> lVar12 = this.f54201t;
            C6724i.a aVar3 = aVar2;
            C17642l<? super C8441h, ? extends n> lVar13 = this.f54202u;
            v<? extends j.a<?>, ? extends C18055d<?>> vVar2 = vVar;
            C17642l<? super C8441h, ? extends n> lVar14 = this.f54203v;
            C16777l lVar15 = lVar3;
            String str3 = str2;
            Map map3 = map2;
            String str4 = str;
            d dVar2 = dVar;
            c cVar10 = r30;
            c cVar11 = new c(lVar11, iVar7, iVar9, iVar11, this.f54197p, this.f54198q, this.f54199r, lVar12, lVar13, lVar14, this.f54204w, this.f54205x, this.f54206y);
            return new C8441h(context, obj2, aVar, dVar2, str4, map3, str3, lVar15, vVar2, aVar3, iVar12, iVar10, iVar8, cVar9, cVar4, cVar6, bVar, lVar5, lVar7, lVar9, jVar2, fVar2, cVar8, lVar10, cVar10, this.f54183b, (DefaultConstructorMarker) null);
        }

        public final a d(C17168i iVar) {
            this.f54194m = iVar;
            this.f54195n = iVar;
            this.f54196o = iVar;
            return this;
        }

        public final a e(Object obj) {
            this.f54184c = obj;
            return this;
        }

        public final a f(b bVar) {
            this.f54183b = bVar;
            return this;
        }

        public final a g(n nVar) {
            return h(new C8439f(nVar));
        }

        public final a h(C17642l<? super C8441h, ? extends n> lVar) {
            this.f54202u = lVar;
            return this;
        }

        public final l.a j() {
            Object obj = this.f54207z;
            if (obj instanceof l.a) {
                return (l.a) obj;
            }
            if (obj instanceof l) {
                l.a d10 = ((l) obj).d();
                this.f54207z = d10;
                return d10;
            }
            throw new AssertionError();
        }

        public final a k(n nVar) {
            return l(new C8440g(nVar));
        }

        public final a l(C17642l<? super C8441h, ? extends n> lVar) {
            this.f54201t = lVar;
            return this;
        }

        public final a n(C8531c cVar) {
            this.f54206y = cVar;
            return this;
        }

        public final a o(f fVar) {
            this.f54205x = fVar;
            return this;
        }

        public final a p(h hVar) {
            return q(k.a(hVar));
        }

        public final a q(l6.j jVar) {
            this.f54204w = jVar;
            return this;
        }

        public final a r(C8607a aVar) {
            this.f54185d = aVar;
            return this;
        }

        public a(C8441h hVar, Context context) {
            this.f54182a = context;
            this.f54183b = hVar.g();
            this.f54184c = hVar.d();
            this.f54185d = hVar.y();
            this.f54186e = hVar.p();
            this.f54187f = hVar.q();
            this.f54189h = hVar.r();
            this.f54190i = hVar.i();
            this.f54191j = hVar.h().f();
            this.f54192k = hVar.m();
            this.f54193l = hVar.f();
            this.f54194m = hVar.h().g();
            this.f54195n = hVar.h().e();
            this.f54196o = hVar.h().a();
            this.f54197p = hVar.h().h();
            this.f54198q = hVar.h().b();
            this.f54199r = hVar.h().i();
            this.f54200s = hVar.u();
            this.f54201t = hVar.h().j();
            this.f54202u = hVar.h().c();
            this.f54203v = hVar.h().d();
            this.f54204w = hVar.h().m();
            this.f54205x = hVar.h().l();
            this.f54206y = hVar.h().k();
            this.f54207z = hVar.k();
        }
    }
}
