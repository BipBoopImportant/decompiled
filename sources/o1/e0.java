package O1;

import XH.C16814e;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0015\n\u0002\b\r\n\u0002\u0010\u0014\n\u0002\b\f\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0019\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u0017J\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017J\u000f\u0010\u001f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001f\u0010\u0017J+\u0010$\u001a\u00020\u00152\b\u0010\t\u001a\u0004\u0018\u00010 2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010#\u001a\u00020\u0015H\u0017¢\u0006\u0004\b$\u0010%J#\u0010$\u001a\u00020\u00152\b\u0010\t\u001a\u0004\u0018\u00010 2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b$\u0010&JA\u0010$\u001a\u00020\u00152\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010#\u001a\u00020\u0015H\u0017¢\u0006\u0004\b$\u0010,J9\u0010$\u001a\u00020\u00152\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b$\u0010-J)\u0010/\u001a\u00020\u00152\b\u0010\t\u001a\u0004\u0018\u00010 2\u0006\u0010.\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0015H\u0017¢\u0006\u0004\b/\u00100J!\u0010/\u001a\u00020\u00152\b\u0010\t\u001a\u0004\u0018\u00010 2\u0006\u0010.\u001a\u00020\u0015H\u0016¢\u0006\u0004\b/\u00101J?\u0010/\u001a\u00020\u00152\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'2\u0006\u0010.\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0015H\u0017¢\u0006\u0004\b/\u00102J7\u0010/\u001a\u00020\u00152\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'2\u0006\u0010.\u001a\u00020\u0015H\u0016¢\u0006\u0004\b/\u00103J\u000f\u00104\u001a\u00020\u0005H\u0016¢\u0006\u0004\b4\u0010\u0003J\u000f\u00105\u001a\u00020\u0015H\u0016¢\u0006\u0004\b5\u0010\u0017J\u0017\u00107\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u0015H\u0016¢\u0006\u0004\b7\u0010\u001cJ\u001f\u0010:\u001a\u00020\u00052\u0006\u00108\u001a\u00020'2\u0006\u00109\u001a\u00020'H\u0016¢\u0006\u0004\b:\u0010;J\u001f\u0010>\u001a\u00020\u00052\u0006\u0010<\u001a\u00020'2\u0006\u0010=\u001a\u00020'H\u0016¢\u0006\u0004\b>\u0010;J\u0017\u0010@\u001a\u00020\u00052\u0006\u0010?\u001a\u00020'H\u0016¢\u0006\u0004\b@\u0010AJ\u001f\u0010B\u001a\u00020\u00052\u0006\u0010<\u001a\u00020'2\u0006\u0010=\u001a\u00020'H\u0016¢\u0006\u0004\bB\u0010;J\u0019\u0010E\u001a\u00020\u00052\b\u0010D\u001a\u0004\u0018\u00010CH\u0016¢\u0006\u0004\bE\u0010FJ\u0019\u0010G\u001a\u00020\u00052\b\u0010D\u001a\u0004\u0018\u00010CH\u0016¢\u0006\u0004\bG\u0010FJ\u0017\u0010I\u001a\u00020\u00052\u0006\u0010H\u001a\u00020CH\u0017¢\u0006\u0004\bI\u0010FJ\u001f\u0010M\u001a\u00020\n2\u0006\u0010J\u001a\u00020 2\u0006\u0010L\u001a\u00020KH\u0017¢\u0006\u0004\bM\u0010NJ\u001f\u0010M\u001a\u00020\n2\u0006\u0010J\u001a\u00020\b2\u0006\u0010L\u001a\u00020KH\u0017¢\u0006\u0004\bM\u0010OJ\u0017\u0010M\u001a\u00020\n2\u0006\u0010J\u001a\u00020 H\u0016¢\u0006\u0004\bM\u0010PJ\u0017\u0010M\u001a\u00020\n2\u0006\u0010J\u001a\u00020\bH\u0016¢\u0006\u0004\bM\u0010\fJ7\u0010M\u001a\u00020\n2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'2\u0006\u0010L\u001a\u00020KH\u0017¢\u0006\u0004\bM\u0010QJ/\u0010M\u001a\u00020\n2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'H\u0016¢\u0006\u0004\bM\u0010RJ/\u0010M\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u0015H\u0016¢\u0006\u0004\bM\u0010SJ\u0017\u0010T\u001a\u00020\n2\u0006\u0010J\u001a\u00020 H\u0017¢\u0006\u0004\bT\u0010PJ\u0017\u0010T\u001a\u00020\n2\u0006\u0010J\u001a\u00020\bH\u0017¢\u0006\u0004\bT\u0010\fJ/\u0010T\u001a\u00020\n2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'H\u0017¢\u0006\u0004\bT\u0010RJ/\u0010T\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u0015H\u0017¢\u0006\u0004\bT\u0010SJ\u001f\u0010W\u001a\u00020\n2\u0006\u0010V\u001a\u00020U2\u0006\u0010L\u001a\u00020KH\u0017¢\u0006\u0004\bW\u0010XJ\u0017\u0010W\u001a\u00020\n2\u0006\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bW\u0010YJ\u0017\u0010Z\u001a\u00020\n2\u0006\u0010V\u001a\u00020UH\u0017¢\u0006\u0004\bZ\u0010YJ\u0011\u0010\\\u001a\u0004\u0018\u00010[H\u0016¢\u0006\u0004\b\\\u0010]J\u0019\u0010_\u001a\u00020\u00052\b\u0010^\u001a\u0004\u0018\u00010[H\u0016¢\u0006\u0004\b_\u0010`J\u001f\u0010c\u001a\u00020\n2\u0006\u0010J\u001a\u00020 2\u0006\u0010b\u001a\u00020aH\u0017¢\u0006\u0004\bc\u0010dJ\u0017\u0010c\u001a\u00020\n2\u0006\u0010J\u001a\u00020 H\u0017¢\u0006\u0004\bc\u0010PJ\u001f\u0010c\u001a\u00020\n2\u0006\u0010V\u001a\u00020U2\u0006\u0010b\u001a\u00020aH\u0017¢\u0006\u0004\bc\u0010eJ\u0017\u0010c\u001a\u00020\n2\u0006\u0010V\u001a\u00020UH\u0017¢\u0006\u0004\bc\u0010YJ7\u0010c\u001a\u00020\n2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'2\u0006\u0010b\u001a\u00020aH\u0017¢\u0006\u0004\bc\u0010fJ/\u0010c\u001a\u00020\n2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'H\u0017¢\u0006\u0004\bc\u0010RJ\u0017\u0010i\u001a\u00020\u00052\u0006\u0010h\u001a\u00020gH\u0016¢\u0006\u0004\bi\u0010jJ\u001f\u0010i\u001a\u00020\u00052\u0006\u0010h\u001a\u00020g2\u0006\u0010k\u001a\u00020 H\u0016¢\u0006\u0004\bi\u0010lJ\u001f\u0010i\u001a\u00020\u00052\u0006\u0010h\u001a\u00020g2\u0006\u0010k\u001a\u00020\bH\u0016¢\u0006\u0004\bi\u0010mJ7\u0010r\u001a\u00020\u00052\u0006\u0010n\u001a\u00020 2\u0006\u0010o\u001a\u00020'2\u0006\u0010p\u001a\u00020'2\u0006\u0010q\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\br\u0010sJO\u0010r\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'2\u0006\u0010o\u001a\u00020'2\u0006\u0010p\u001a\u00020'2\u0006\u0010q\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\br\u0010tJ/\u0010x\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00152\u0006\u0010u\u001a\u00020\u00152\u0006\u0010v\u001a\u00020\u00152\u0006\u0010w\u001a\u00020\u0015H\u0016¢\u0006\u0004\bx\u0010yJ1\u0010z\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\bz\u0010{J3\u0010z\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\b\u0010|\u001a\u0004\u0018\u00010\b2\u0006\u0010k\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\bz\u0010}J3\u0010z\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\b\u0010|\u001a\u0004\u0018\u00010\b2\u0006\u0010k\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\bz\u0010~Jb\u0010z\u001a\u00020\u00052\u0007\u0010\u0001\u001a\u000202\u0007\u0010\u0001\u001a\u00020\u00152\u0007\u0010\u0001\u001a\u00020\u00152\u0007\u0010\u0001\u001a\u00020'2\u0007\u0010\u0001\u001a\u00020'2\u0007\u0010\u0001\u001a\u00020\u00152\u0007\u0010\u0001\u001a\u00020\u00152\u0007\u0010\u0001\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0017¢\u0006\u0005\bz\u0010\u0001Jb\u0010z\u001a\u00020\u00052\u0007\u0010\u0001\u001a\u000202\u0007\u0010\u0001\u001a\u00020\u00152\u0007\u0010\u0001\u001a\u00020\u00152\u0007\u0010\u0001\u001a\u00020\u00152\u0007\u0010\u0001\u001a\u00020\u00152\u0007\u0010\u0001\u001a\u00020\u00152\u0007\u0010\u0001\u001a\u00020\u00152\u0007\u0010\u0001\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0017¢\u0006\u0005\bz\u0010\u0001J*\u0010z\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010D\u001a\u00020C2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0005\bz\u0010\u0001J]\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0007\u0010\u0001\u001a\u00020\u00152\u0007\u0010\u0001\u001a\u00020\u00152\b\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020\u00152\t\u0010\u0001\u001a\u0004\u0018\u000102\u0007\u0010\u0001\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J5\u0010\u0001\u001a\u00020\u00052\u0007\u0010\u0001\u001a\u00020'2\u0007\u0010\u0001\u001a\u00020'2\u0007\u0010\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u001a\u0010\u0001\u001a\u00020\u00052\u0007\u0010\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0005\b\u0001\u0010\u001cJ\u001c\u0010\u0001\u001a\u00020\u00052\b\u0010\u0001\u001a\u00030\u0001H\u0017¢\u0006\u0006\b\u0001\u0010\u0001J%\u0010\u0001\u001a\u00020\u00052\u0007\u0010\u0001\u001a\u00020\u00152\b\u0010\u0001\u001a\u00030\u0001H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J%\u0010\u0001\u001a\u00020\u00052\u0007\u0010\u0001\u001a\u00020\u00152\b\u0010\u0001\u001a\u00030\u0001H\u0017¢\u0006\u0006\b\u0001\u0010 \u0001J&\u0010\u0001\u001a\u00020\u00052\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0017¢\u0006\u0006\b\u0001\u0010¡\u0001J>\u0010¦\u0001\u001a\u00020\u00052\u0007\u0010¢\u0001\u001a\u00020'2\u0007\u0010£\u0001\u001a\u00020'2\u0007\u0010¤\u0001\u001a\u00020'2\u0007\u0010¥\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\b¦\u0001\u0010§\u0001J6\u0010ª\u0001\u001a\u00020\u00052\b\u0010¨\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020\u00152\u0007\u0010©\u0001\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bª\u0001\u0010«\u0001J$\u0010ª\u0001\u001a\u00020\u00052\b\u0010¨\u0001\u001a\u00030\u00012\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bª\u0001\u0010¬\u0001J\"\u0010­\u0001\u001a\u00020\u00052\u0006\u0010n\u001a\u00020 2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\b­\u0001\u0010®\u0001J:\u0010­\u0001\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\b­\u0001\u0010§\u0001J\u001a\u0010¯\u0001\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\b¯\u0001\u0010°\u0001J.\u0010³\u0001\u001a\u00020\u00052\b\u0010²\u0001\u001a\u00030±\u00012\u0006\u0010k\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0017¢\u0006\u0006\b³\u0001\u0010´\u0001J.\u0010³\u0001\u001a\u00020\u00052\b\u0010²\u0001\u001a\u00030±\u00012\u0006\u0010k\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0017¢\u0006\u0006\b³\u0001\u0010µ\u0001J\"\u0010¶\u0001\u001a\u00020\u00052\u0006\u0010V\u001a\u00020U2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\b¶\u0001\u0010·\u0001J,\u0010¸\u0001\u001a\u00020\u00052\u0007\u0010\u0001\u001a\u00020'2\u0007\u0010\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\b¸\u0001\u0010¹\u0001J8\u0010º\u0001\u001a\u00020\u00052\n\u0010¨\u0001\u001a\u0005\u0018\u00010\u00012\u0007\u0010\u0001\u001a\u00020\u00152\u0007\u0010©\u0001\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bº\u0001\u0010«\u0001J$\u0010º\u0001\u001a\u00020\u00052\b\u0010¨\u0001\u001a\u00030\u00012\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bº\u0001\u0010¬\u0001J@\u0010¿\u0001\u001a\u00020\u00052\b\u0010¼\u0001\u001a\u00030»\u00012\u0007\u0010½\u0001\u001a\u00020\u00152\u0007\u0010©\u0001\u001a\u00020\u00152\b\u0010¾\u0001\u001a\u00030\u00012\u0006\u0010\"\u001a\u00020!H\u0017¢\u0006\u0006\b¿\u0001\u0010À\u0001J.\u0010¿\u0001\u001a\u00020\u00052\b\u0010¼\u0001\u001a\u00030Á\u00012\b\u0010¾\u0001\u001a\u00030\u00012\u0006\u0010\"\u001a\u00020!H\u0017¢\u0006\u0006\b¿\u0001\u0010Â\u0001J\"\u0010Ã\u0001\u001a\u00020\u00052\u0006\u0010J\u001a\u00020 2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bÃ\u0001\u0010®\u0001J\"\u0010Ã\u0001\u001a\u00020\u00052\u0006\u0010u\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001J:\u0010Ã\u0001\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bÃ\u0001\u0010§\u0001J*\u0010Å\u0001\u001a\u00020\u00052\u0006\u0010u\u001a\u00020\u00152\u0006\u0010v\u001a\u00020\u00152\u0006\u0010w\u001a\u00020\u0015H\u0016¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J4\u0010É\u0001\u001a\u00020\u00052\u0006\u0010J\u001a\u00020 2\u0007\u0010Ç\u0001\u001a\u00020'2\u0007\u0010È\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001JL\u0010É\u0001\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'2\u0007\u0010Ç\u0001\u001a\u00020'2\u0007\u0010È\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bÉ\u0001\u0010Ë\u0001JP\u0010Ò\u0001\u001a\u00020\u00052\u0007\u0010Ì\u0001\u001a\u00020 2\u0007\u0010Í\u0001\u001a\u00020'2\u0007\u0010Î\u0001\u001a\u00020'2\u0007\u0010Ï\u0001\u001a\u00020 2\u0007\u0010Ð\u0001\u001a\u00020'2\u0007\u0010Ñ\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0017¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001J@\u0010Ò\u0001\u001a\u00020\u00052\u0007\u0010Ì\u0001\u001a\u00020 2\b\u0010Ô\u0001\u001a\u00030\u00012\u0007\u0010Ï\u0001\u001a\u00020 2\b\u0010Õ\u0001\u001a\u00030\u00012\u0006\u0010\"\u001a\u00020!H\u0017¢\u0006\u0006\bÒ\u0001\u0010Ö\u0001JR\u0010Þ\u0001\u001a\u00020\u00052\u0007\u0010×\u0001\u001a\u000202\u0007\u0010Ø\u0001\u001a\u00020\u00152\b\u0010Ù\u0001\u001a\u00030\u00012\u0007\u0010Ú\u0001\u001a\u00020\u00152\u0007\u0010Û\u0001\u001a\u00020\u00152\b\u0010Ý\u0001\u001a\u00030Ü\u00012\u0006\u0010\"\u001a\u00020!H\u0017¢\u0006\u0006\bÞ\u0001\u0010ß\u0001JH\u0010à\u0001\u001a\u00020\u00052\b\u0010¼\u0001\u001a\u00030»\u00012\u0007\u0010½\u0001\u001a\u00020\u00152\u0007\u0010©\u0001\u001a\u00020\u00152\u0007\u0010\u0001\u001a\u00020'2\u0007\u0010\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bà\u0001\u0010á\u0001J6\u0010à\u0001\u001a\u00020\u00052\b\u0010¼\u0001\u001a\u00030Á\u00012\u0007\u0010\u0001\u001a\u00020'2\u0007\u0010\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bà\u0001\u0010â\u0001JH\u0010à\u0001\u001a\u00020\u00052\b\u0010¼\u0001\u001a\u00030Á\u00012\u0007\u0010ã\u0001\u001a\u00020\u00152\u0007\u0010ä\u0001\u001a\u00020\u00152\u0007\u0010\u0001\u001a\u00020'2\u0007\u0010\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bà\u0001\u0010å\u0001JH\u0010à\u0001\u001a\u00020\u00052\b\u0010¼\u0001\u001a\u00030æ\u00012\u0007\u0010ã\u0001\u001a\u00020\u00152\u0007\u0010ä\u0001\u001a\u00020\u00152\u0007\u0010\u0001\u001a\u00020'2\u0007\u0010\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bà\u0001\u0010ç\u0001JP\u0010ê\u0001\u001a\u00020\u00052\b\u0010¼\u0001\u001a\u00030»\u00012\u0007\u0010½\u0001\u001a\u00020\u00152\u0007\u0010©\u0001\u001a\u00020\u00152\u0006\u0010V\u001a\u00020U2\u0007\u0010è\u0001\u001a\u00020'2\u0007\u0010é\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bê\u0001\u0010ë\u0001J>\u0010ê\u0001\u001a\u00020\u00052\b\u0010¼\u0001\u001a\u00030Á\u00012\u0006\u0010V\u001a\u00020U2\u0007\u0010è\u0001\u001a\u00020'2\u0007\u0010é\u0001\u001a\u00020'2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bê\u0001\u0010ì\u0001Jc\u0010ð\u0001\u001a\u00020\u00052\b\u0010¼\u0001\u001a\u00030»\u00012\u0007\u0010½\u0001\u001a\u00020\u00152\u0007\u0010©\u0001\u001a\u00020\u00152\u0007\u0010í\u0001\u001a\u00020\u00152\u0007\u0010î\u0001\u001a\u00020\u00152\u0007\u0010\u0001\u001a\u00020'2\u0007\u0010\u0001\u001a\u00020'2\u0007\u0010ï\u0001\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0017¢\u0006\u0006\bð\u0001\u0010ñ\u0001Jc\u0010ð\u0001\u001a\u00020\u00052\b\u0010¼\u0001\u001a\u00030æ\u00012\u0007\u0010ã\u0001\u001a\u00020\u00152\u0007\u0010ä\u0001\u001a\u00020\u00152\u0007\u0010ò\u0001\u001a\u00020\u00152\u0007\u0010ó\u0001\u001a\u00020\u00152\u0007\u0010\u0001\u001a\u00020'2\u0007\u0010\u0001\u001a\u00020'2\u0007\u0010ï\u0001\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0017¢\u0006\u0006\bð\u0001\u0010ô\u0001Jc\u0010ð\u0001\u001a\u00020\u00052\b\u0010¼\u0001\u001a\u00030õ\u00012\u0007\u0010ã\u0001\u001a\u00020\u00152\u0007\u0010ä\u0001\u001a\u00020\u00152\u0007\u0010ò\u0001\u001a\u00020\u00152\u0007\u0010ó\u0001\u001a\u00020\u00152\u0007\u0010\u0001\u001a\u00020'2\u0007\u0010\u0001\u001a\u00020'2\u0007\u0010ï\u0001\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0017¢\u0006\u0006\bð\u0001\u0010ö\u0001J\u0001\u0010ÿ\u0001\u001a\u00020\u00052\b\u0010\u0001\u001a\u00030÷\u00012\u0007\u0010ø\u0001\u001a\u00020\u00152\b\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020\u00152\n\u0010ù\u0001\u001a\u0005\u0018\u00010\u00012\u0007\u0010ú\u0001\u001a\u00020\u00152\t\u0010\u0001\u001a\u0004\u0018\u000102\u0007\u0010\u0001\u001a\u00020\u00152\n\u0010ü\u0001\u001a\u0005\u0018\u00010û\u00012\u0007\u0010ý\u0001\u001a\u00020\u00152\u0007\u0010þ\u0001\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0006\bÿ\u0001\u0010\u0002J\u001c\u0010\u0002\u001a\u00020\u00052\b\u0010\u0002\u001a\u00030\u0002H\u0017¢\u0006\u0006\b\u0002\u0010\u0002R\u0018\u0010\u0002\u001a\u00020\u00018\u0002@\u0002X.¢\u0006\u0007\n\u0005\b\u0006\u0010\u0002¨\u0006\u0002"}, d2 = {"LO1/e0;", "Landroid/graphics/Canvas;", "<init>", "()V", "canvas", "LXH/N;", "a", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Rect;", "bounds", "", "getClipBounds", "(Landroid/graphics/Rect;)Z", "Landroid/graphics/Bitmap;", "bitmap", "setBitmap", "(Landroid/graphics/Bitmap;)V", "enableZ", "disableZ", "isOpaque", "()Z", "", "getWidth", "()I", "getHeight", "getDensity", "density", "setDensity", "(I)V", "getMaximumBitmapWidth", "getMaximumBitmapHeight", "save", "Landroid/graphics/RectF;", "Landroid/graphics/Paint;", "paint", "saveFlags", "saveLayer", "(Landroid/graphics/RectF;Landroid/graphics/Paint;I)I", "(Landroid/graphics/RectF;Landroid/graphics/Paint;)I", "", "left", "top", "right", "bottom", "(FFFFLandroid/graphics/Paint;I)I", "(FFFFLandroid/graphics/Paint;)I", "alpha", "saveLayerAlpha", "(Landroid/graphics/RectF;II)I", "(Landroid/graphics/RectF;I)I", "(FFFFII)I", "(FFFFI)I", "restore", "getSaveCount", "saveCount", "restoreToCount", "dx", "dy", "translate", "(FF)V", "sx", "sy", "scale", "degrees", "rotate", "(F)V", "skew", "Landroid/graphics/Matrix;", "matrix", "concat", "(Landroid/graphics/Matrix;)V", "setMatrix", "ctm", "getMatrix", "rect", "Landroid/graphics/Region$Op;", "op", "clipRect", "(Landroid/graphics/RectF;Landroid/graphics/Region$Op;)Z", "(Landroid/graphics/Rect;Landroid/graphics/Region$Op;)Z", "(Landroid/graphics/RectF;)Z", "(FFFFLandroid/graphics/Region$Op;)Z", "(FFFF)Z", "(IIII)Z", "clipOutRect", "Landroid/graphics/Path;", "path", "clipPath", "(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z", "(Landroid/graphics/Path;)Z", "clipOutPath", "Landroid/graphics/DrawFilter;", "getDrawFilter", "()Landroid/graphics/DrawFilter;", "filter", "setDrawFilter", "(Landroid/graphics/DrawFilter;)V", "Landroid/graphics/Canvas$EdgeType;", "type", "quickReject", "(Landroid/graphics/RectF;Landroid/graphics/Canvas$EdgeType;)Z", "(Landroid/graphics/Path;Landroid/graphics/Canvas$EdgeType;)Z", "(FFFFLandroid/graphics/Canvas$EdgeType;)Z", "Landroid/graphics/Picture;", "picture", "drawPicture", "(Landroid/graphics/Picture;)V", "dst", "(Landroid/graphics/Picture;Landroid/graphics/RectF;)V", "(Landroid/graphics/Picture;Landroid/graphics/Rect;)V", "oval", "startAngle", "sweepAngle", "useCenter", "drawArc", "(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V", "(FFFFFFZLandroid/graphics/Paint;)V", "r", "g", "b", "drawARGB", "(IIII)V", "drawBitmap", "(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V", "src", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V", "", "colors", "offset", "stride", "x", "y", "width", "height", "hasAlpha", "([IIIFFIIZLandroid/graphics/Paint;)V", "([IIIIIIIZLandroid/graphics/Paint;)V", "(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V", "meshWidth", "meshHeight", "", "verts", "vertOffset", "colorOffset", "drawBitmapMesh", "(Landroid/graphics/Bitmap;II[FI[IILandroid/graphics/Paint;)V", "cx", "cy", "radius", "drawCircle", "(FFFLandroid/graphics/Paint;)V", "color", "drawColor", "", "(J)V", "Landroid/graphics/PorterDuff$Mode;", "mode", "(ILandroid/graphics/PorterDuff$Mode;)V", "Landroid/graphics/BlendMode;", "(ILandroid/graphics/BlendMode;)V", "(JLandroid/graphics/BlendMode;)V", "startX", "startY", "stopX", "stopY", "drawLine", "(FFFFLandroid/graphics/Paint;)V", "pts", "count", "drawLines", "([FIILandroid/graphics/Paint;)V", "([FLandroid/graphics/Paint;)V", "drawOval", "(Landroid/graphics/RectF;Landroid/graphics/Paint;)V", "drawPaint", "(Landroid/graphics/Paint;)V", "Landroid/graphics/NinePatch;", "patch", "drawPatch", "(Landroid/graphics/NinePatch;Landroid/graphics/Rect;Landroid/graphics/Paint;)V", "(Landroid/graphics/NinePatch;Landroid/graphics/RectF;Landroid/graphics/Paint;)V", "drawPath", "(Landroid/graphics/Path;Landroid/graphics/Paint;)V", "drawPoint", "(FFLandroid/graphics/Paint;)V", "drawPoints", "", "text", "index", "pos", "drawPosText", "([CII[FLandroid/graphics/Paint;)V", "", "(Ljava/lang/String;[FLandroid/graphics/Paint;)V", "drawRect", "(Landroid/graphics/Rect;Landroid/graphics/Paint;)V", "drawRGB", "(III)V", "rx", "ry", "drawRoundRect", "(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V", "(FFFFFFLandroid/graphics/Paint;)V", "outer", "outerRx", "outerRy", "inner", "innerRx", "innerRy", "drawDoubleRoundRect", "(Landroid/graphics/RectF;FFLandroid/graphics/RectF;FFLandroid/graphics/Paint;)V", "outerRadii", "innerRadii", "(Landroid/graphics/RectF;[FLandroid/graphics/RectF;[FLandroid/graphics/Paint;)V", "glyphIds", "glyphIdOffset", "positions", "positionOffset", "glyphCount", "Landroid/graphics/fonts/Font;", "font", "drawGlyphs", "([II[FIILandroid/graphics/fonts/Font;Landroid/graphics/Paint;)V", "drawText", "([CIIFFLandroid/graphics/Paint;)V", "(Ljava/lang/String;FFLandroid/graphics/Paint;)V", "start", "end", "(Ljava/lang/String;IIFFLandroid/graphics/Paint;)V", "", "(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V", "hOffset", "vOffset", "drawTextOnPath", "([CIILandroid/graphics/Path;FFLandroid/graphics/Paint;)V", "(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V", "contextIndex", "contextCount", "isRtl", "drawTextRun", "([CIIIIFFZLandroid/graphics/Paint;)V", "contextStart", "contextEnd", "(Ljava/lang/CharSequence;IIIIFFZLandroid/graphics/Paint;)V", "Landroid/graphics/text/MeasuredText;", "(Landroid/graphics/text/MeasuredText;IIIIFFZLandroid/graphics/Paint;)V", "Landroid/graphics/Canvas$VertexMode;", "vertexCount", "texs", "texOffset", "", "indices", "indexOffset", "indexCount", "drawVertices", "(Landroid/graphics/Canvas$VertexMode;I[FI[FI[II[SIILandroid/graphics/Paint;)V", "Landroid/graphics/RenderNode;", "renderNode", "drawRenderNode", "(Landroid/graphics/RenderNode;)V", "Landroid/graphics/Canvas;", "nativeCanvas", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e0 extends Canvas {

    /* renamed from: a  reason: collision with root package name */
    private Canvas f11734a;

    public final void a(Canvas canvas) {
        this.f11734a = canvas;
    }

    public boolean clipOutPath(Path path) {
        C4780n nVar = C4780n.f11760a;
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return nVar.a(canvas, path);
    }

    public boolean clipOutRect(RectF rectF) {
        C4780n nVar = C4780n.f11760a;
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return nVar.e(canvas, rectF);
    }

    @C16814e
    public boolean clipPath(Path path, Region.Op op2) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path, op2);
    }

    @C16814e
    public boolean clipRect(RectF rectF, Region.Op op2) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rectF, op2);
    }

    public void concat(Matrix matrix) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.concat(matrix);
    }

    public void disableZ() {
        C4785t tVar = C4785t.f11761a;
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        tVar.a(canvas);
    }

    public void drawARGB(int i10, int i11, int i12, int i13) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawARGB(i10, i11, i12, i13);
    }

    public void drawArc(RectF rectF, float f10, float f11, boolean z10, Paint paint) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(rectF, f10, f11, z10, paint);
    }

    public void drawBitmap(Bitmap bitmap, float f10, float f11, Paint paint) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, f10, f11, paint);
    }

    public void drawBitmapMesh(Bitmap bitmap, int i10, int i11, float[] fArr, int i12, int[] iArr, int i13, Paint paint) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmapMesh(bitmap, i10, i11, fArr, i12, iArr, i13, paint);
    }

    public void drawCircle(float f10, float f11, float f12, Paint paint) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawCircle(f10, f11, f12, paint);
    }

    public void drawColor(int i10) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i10);
    }

    public void drawDoubleRoundRect(RectF rectF, float f10, float f11, RectF rectF2, float f12, float f13, Paint paint) {
        C4785t tVar = C4785t.f11761a;
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        tVar.e(canvas, rectF, f10, f11, rectF2, f12, f13, paint);
    }

    public void drawGlyphs(int[] iArr, int i10, float[] fArr, int i11, int i12, Font font, Paint paint) {
        B b10 = B.f11674a;
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        b10.a(canvas, iArr, i10, fArr, i11, i12, font, paint);
    }

    public void drawLine(float f10, float f11, float f12, float f13, Paint paint) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawLine(f10, f11, f12, f13, paint);
    }

    public void drawLines(float[] fArr, int i10, int i11, Paint paint) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(fArr, i10, i11, paint);
    }

    public void drawOval(RectF rectF, Paint paint) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(rectF, paint);
    }

    public void drawPaint(Paint paint) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawPaint(paint);
    }

    public void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        B b10 = B.f11674a;
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        b10.b(canvas, ninePatch, rect, paint);
    }

    public void drawPath(Path path, Paint paint) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawPath(path, paint);
    }

    public void drawPicture(Picture picture) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture);
    }

    public void drawPoint(float f10, float f11, Paint paint) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoint(f10, f11, paint);
    }

    public void drawPoints(float[] fArr, int i10, int i11, Paint paint) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(fArr, i10, i11, paint);
    }

    @C16814e
    public void drawPosText(char[] cArr, int i10, int i11, float[] fArr, Paint paint) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(cArr, i10, i11, fArr, paint);
    }

    public void drawRGB(int i10, int i11, int i12) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawRGB(i10, i11, i12);
    }

    public void drawRect(RectF rectF, Paint paint) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rectF, paint);
    }

    public void drawRenderNode(RenderNode renderNode) {
        C4785t tVar = C4785t.f11761a;
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        tVar.g(canvas, renderNode);
    }

    public void drawRoundRect(RectF rectF, float f10, float f11, Paint paint) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(rectF, f10, f11, paint);
    }

    public void drawText(char[] cArr, int i10, int i11, float f10, float f11, Paint paint) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(cArr, i10, i11, f10, f11, paint);
    }

    public void drawTextOnPath(char[] cArr, int i10, int i11, Path path, float f10, float f11, Paint paint) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(cArr, i10, i11, path, f10, f11, paint);
    }

    public void drawTextRun(char[] cArr, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, Paint paint) {
        C4779m mVar = C4779m.f11759a;
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        mVar.b(canvas, cArr, i10, i11, i12, i13, f10, f11, z10, paint);
    }

    public void drawVertices(Canvas.VertexMode vertexMode, int i10, float[] fArr, int i11, float[] fArr2, int i12, int[] iArr, int i13, short[] sArr, int i14, int i15, Paint paint) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawVertices(vertexMode, i10, fArr, i11, fArr2, i12, iArr, i13, sArr, i14, i15, paint);
    }

    public void enableZ() {
        C4785t tVar = C4785t.f11761a;
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        tVar.i(canvas);
    }

    public boolean getClipBounds(Rect rect) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    public int getDensity() {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return canvas.getDensity();
    }

    public DrawFilter getDrawFilter() {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return canvas.getDrawFilter();
    }

    public int getHeight() {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return canvas.getHeight();
    }

    @C16814e
    public void getMatrix(Matrix matrix) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.getMatrix(matrix);
    }

    public int getMaximumBitmapHeight() {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapHeight();
    }

    public int getMaximumBitmapWidth() {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapWidth();
    }

    public int getSaveCount() {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return canvas.getSaveCount();
    }

    public int getWidth() {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return canvas.getWidth();
    }

    public boolean isOpaque() {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return canvas.isOpaque();
    }

    @C16814e
    public boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(rectF, edgeType);
    }

    public void restore() {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.restore();
    }

    public void restoreToCount(int i10) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.restoreToCount(i10);
    }

    public void rotate(float f10) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.rotate(f10);
    }

    public int save() {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return canvas.save();
    }

    @C16814e
    public int saveLayer(RectF rectF, Paint paint, int i10) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(rectF, paint, i10);
    }

    @C16814e
    public int saveLayerAlpha(RectF rectF, int i10, int i11) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(rectF, i10, i11);
    }

    public void scale(float f10, float f11) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.scale(f10, f11);
    }

    public void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.setBitmap(bitmap);
    }

    public void setDensity(int i10) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.setDensity(i10);
    }

    public void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.setDrawFilter(drawFilter);
    }

    public void setMatrix(Matrix matrix) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.setMatrix(matrix);
    }

    public void skew(float f10, float f11) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.skew(f10, f11);
    }

    public void translate(float f10, float f11) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.translate(f10, f11);
    }

    public boolean clipOutRect(Rect rect) {
        C4780n nVar = C4780n.f11760a;
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return nVar.d(canvas, rect);
    }

    public boolean clipPath(Path path) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path);
    }

    @C16814e
    public boolean clipRect(Rect rect, Region.Op op2) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect, op2);
    }

    public void drawArc(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, Paint paint) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(f10, f11, f12, f13, f14, f15, z10, paint);
    }

    public void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, rectF, paint);
    }

    public void drawColor(long j10) {
        C4785t tVar = C4785t.f11761a;
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        tVar.c(canvas, j10);
    }

    public void drawLines(float[] fArr, Paint paint) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(fArr, paint);
    }

    public void drawOval(float f10, float f11, float f12, float f13, Paint paint) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(f10, f11, f12, f13, paint);
    }

    public void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        B b10 = B.f11674a;
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        b10.c(canvas, ninePatch, rectF, paint);
    }

    public void drawPicture(Picture picture, RectF rectF) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, rectF);
    }

    public void drawPoints(float[] fArr, Paint paint) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(fArr, paint);
    }

    @C16814e
    public void drawPosText(String str, float[] fArr, Paint paint) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(str, fArr, paint);
    }

    public void drawRect(Rect rect, Paint paint) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rect, paint);
    }

    public void drawRoundRect(float f10, float f11, float f12, float f13, float f14, float f15, Paint paint) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(f10, f11, f12, f13, f14, f15, paint);
    }

    public void drawText(String str, float f10, float f11, Paint paint) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(str, f10, f11, paint);
    }

    public void drawTextOnPath(String str, Path path, float f10, float f11, Paint paint) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(str, path, f10, f11, paint);
    }

    public boolean quickReject(RectF rectF) {
        C4789x xVar = C4789x.f11762a;
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return xVar.c(canvas, rectF);
    }

    public int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(rectF, paint);
    }

    public int saveLayerAlpha(RectF rectF, int i10) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(rectF, i10);
    }

    public boolean clipOutRect(float f10, float f11, float f12, float f13) {
        C4780n nVar = C4780n.f11760a;
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return nVar.b(canvas, f10, f11, f12, f13);
    }

    public boolean clipRect(RectF rectF) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rectF);
    }

    public void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, rect2, paint);
    }

    public void drawColor(int i10, PorterDuff.Mode mode) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i10, mode);
    }

    public void drawPicture(Picture picture, Rect rect) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, rect);
    }

    public void drawRect(float f10, float f11, float f12, float f13, Paint paint) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(f10, f11, f12, f13, paint);
    }

    public void drawText(String str, int i10, int i11, float f10, float f11, Paint paint) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(str, i10, i11, f10, f11, paint);
    }

    @C16814e
    public boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(path, edgeType);
    }

    @C16814e
    public int saveLayer(float f10, float f11, float f12, float f13, Paint paint, int i10) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(f10, f11, f12, f13, paint, i10);
    }

    @C16814e
    public int saveLayerAlpha(float f10, float f11, float f12, float f13, int i10, int i11) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(f10, f11, f12, f13, i10, i11);
    }

    public boolean clipOutRect(int i10, int i11, int i12, int i13) {
        C4780n nVar = C4780n.f11760a;
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return nVar.c(canvas, i10, i11, i12, i13);
    }

    public boolean clipRect(Rect rect) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect);
    }

    @C16814e
    public void drawBitmap(int[] iArr, int i10, int i11, float f10, float f11, int i12, int i13, boolean z10, Paint paint) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(iArr, i10, i11, f10, f11, i12, i13, z10, paint);
    }

    public void drawColor(int i10, BlendMode blendMode) {
        C4785t tVar = C4785t.f11761a;
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        tVar.b(canvas, i10, blendMode);
    }

    public void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        C4785t tVar = C4785t.f11761a;
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        tVar.f(canvas, rectF, fArr, rectF2, fArr2, paint);
    }

    public void drawText(CharSequence charSequence, int i10, int i11, float f10, float f11, Paint paint) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(charSequence, i10, i11, f10, f11, paint);
    }

    public void drawTextRun(CharSequence charSequence, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, Paint paint) {
        C4779m mVar = C4779m.f11759a;
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        mVar.a(canvas, charSequence, i10, i11, i12, i13, f10, f11, z10, paint);
    }

    public boolean quickReject(Path path) {
        C4789x xVar = C4789x.f11762a;
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return xVar.b(canvas, path);
    }

    public int saveLayer(float f10, float f11, float f12, float f13, Paint paint) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(f10, f11, f12, f13, paint);
    }

    public int saveLayerAlpha(float f10, float f11, float f12, float f13, int i10) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(f10, f11, f12, f13, i10);
    }

    @C16814e
    public boolean clipRect(float f10, float f11, float f12, float f13, Region.Op op2) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(f10, f11, f12, f13, op2);
    }

    @C16814e
    public void drawBitmap(int[] iArr, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, Paint paint) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(iArr, i10, i11, i12, i13, i14, i15, z10, paint);
    }

    public void drawColor(long j10, BlendMode blendMode) {
        C4785t tVar = C4785t.f11761a;
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        tVar.d(canvas, j10, blendMode);
    }

    @C16814e
    public boolean quickReject(float f10, float f11, float f12, float f13, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(f10, f11, f12, f13, edgeType);
    }

    public boolean clipRect(float f10, float f11, float f12, float f13) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(f10, f11, f12, f13);
    }

    public void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, matrix, paint);
    }

    public boolean quickReject(float f10, float f11, float f12, float f13) {
        C4789x xVar = C4789x.f11762a;
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return xVar.a(canvas, f10, f11, f12, f13);
    }

    public boolean clipRect(int i10, int i11, int i12, int i13) {
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(i10, i11, i12, i13);
    }

    public void drawTextRun(MeasuredText measuredText, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, Paint paint) {
        C4785t tVar = C4785t.f11761a;
        Canvas canvas = this.f11734a;
        if (canvas == null) {
            C17542s.z("nativeCanvas");
            canvas = null;
        }
        tVar.h(canvas, measuredText, i10, i11, i12, i13, f10, f11, z10, paint);
    }
}
