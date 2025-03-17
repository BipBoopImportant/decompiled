package EH;

import YH.C16870n;
import com.sugarcube.app.base.data.analytics.OpeningSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0003\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bR\u001a\u0010\u000e\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0012\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0015\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\rR\u001a\u0010\u0018\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\rR\u001a\u0010\u001b\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\rR\u001a\u0010\u001e\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001d\u0010\rR\u001a\u0010!\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b \u0010\rR\u001a\u0010$\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\b\"\u0010\u000b\u001a\u0004\b#\u0010\rR\u001a\u0010&\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\b%\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u001a\u0010)\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\b'\u0010\u000b\u001a\u0004\b(\u0010\rR\u001a\u0010,\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\b*\u0010\u000b\u001a\u0004\b+\u0010\rR\u001a\u0010/\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\b-\u0010\u000b\u001a\u0004\b.\u0010\rR\u001a\u00101\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\b0\u0010\u000b\u001a\u0004\b\u0016\u0010\rR\u001a\u00104\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\b2\u0010\u000b\u001a\u0004\b3\u0010\rR\u001a\u00106\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\b5\u0010\u000b\u001a\u0004\b\u0019\u0010\rR\u001a\u00109\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\b7\u0010\u000b\u001a\u0004\b8\u0010\rR\u001a\u0010<\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\b:\u0010\u000b\u001a\u0004\b;\u0010\rR\u001a\u0010>\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\b=\u0010\u000b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010@\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\b?\u0010\u000b\u001a\u0004\b\u001f\u0010\rR\u001a\u0010C\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\bA\u0010\u000b\u001a\u0004\bB\u0010\rR\u001a\u0010E\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\bD\u0010\u000b\u001a\u0004\b\"\u0010\rR\u001a\u0010H\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\bF\u0010\u000b\u001a\u0004\bG\u0010\rR\u001a\u0010K\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\bI\u0010\u000b\u001a\u0004\bJ\u0010\rR\u001a\u0010N\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\bL\u0010\u000b\u001a\u0004\bM\u0010\rR\u001a\u0010Q\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\bO\u0010\u000b\u001a\u0004\bP\u0010\rR\u001a\u0010T\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\bR\u0010\u000b\u001a\u0004\bS\u0010\rR\u001a\u0010V\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\bU\u0010\u000b\u001a\u0004\b%\u0010\rR\u001a\u0010Y\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\bW\u0010\u000b\u001a\u0004\bX\u0010\rR\u001a\u0010\\\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\bZ\u0010\u000b\u001a\u0004\b[\u0010\rR\u001a\u0010_\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\b]\u0010\u000b\u001a\u0004\b^\u0010\rR\u001a\u0010b\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\b`\u0010\u000b\u001a\u0004\ba\u0010\rR\u001a\u0010e\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\bc\u0010\u000b\u001a\u0004\bd\u0010\rR\u001a\u0010h\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\bf\u0010\u000b\u001a\u0004\bg\u0010\rR\u001a\u0010j\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\bi\u0010\u000b\u001a\u0004\b'\u0010\rR\u001a\u0010m\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\bk\u0010\u000b\u001a\u0004\bl\u0010\rR\u001a\u0010p\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\bn\u0010\u000b\u001a\u0004\bo\u0010\rR\u001a\u0010s\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\bq\u0010\u000b\u001a\u0004\br\u0010\rR\u001a\u0010u\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\bt\u0010\u000b\u001a\u0004\b*\u0010\rR\u001a\u0010w\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\bv\u0010\u000b\u001a\u0004\b-\u0010\rR\u001a\u0010y\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\bx\u0010\u000b\u001a\u0004\b0\u0010\rR\u001a\u0010|\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\bz\u0010\u000b\u001a\u0004\b{\u0010\rR\u001a\u0010\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\b}\u0010\u000b\u001a\u0004\b~\u0010\rR\u001d\u0010\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\b\u0001\u0010\u000b\u001a\u0005\b\u0001\u0010\rR\u001d\u0010\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\b\u0001\u0010\u000b\u001a\u0005\b\u0001\u0010\rR\u001d\u0010\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\b\u0001\u0010\u000b\u001a\u0005\b\u0001\u0010\rR\u001d\u0010\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\b\u0001\u0010\u000b\u001a\u0005\b\u0001\u0010\rR\u001d\u0010\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\b\u0001\u0010\u000b\u001a\u0005\b\u0001\u0010\rR\u001d\u0010\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\b\u0001\u0010\u000b\u001a\u0005\b\u0001\u0010\rR\u001d\u0010\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\b\u0001\u0010\u000b\u001a\u0005\b\u0001\u0010\rR\u001d\u0010\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\b\u0001\u0010\u000b\u001a\u0005\b\u0001\u0010\rR\u001d\u0010\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\b\u0001\u0010\u000b\u001a\u0005\b\u0001\u0010\rR\u001d\u0010\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\b\u0001\u0010\u000b\u001a\u0005\b\u0001\u0010\rR\u001d\u0010 \u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\b\u0001\u0010\u000b\u001a\u0005\b\u0001\u0010\rR\u001d\u0010£\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\b¡\u0001\u0010\u000b\u001a\u0005\b¢\u0001\u0010\rR\u001d\u0010¦\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\b¤\u0001\u0010\u000b\u001a\u0005\b¥\u0001\u0010\rR\u001d\u0010©\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\b§\u0001\u0010\u000b\u001a\u0005\b¨\u0001\u0010\rR\u001d\u0010¬\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\bª\u0001\u0010\u000b\u001a\u0005\b«\u0001\u0010\rR\u001d\u0010¯\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\b­\u0001\u0010\u000b\u001a\u0005\b®\u0001\u0010\rR\u001d\u0010²\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\b°\u0001\u0010\u000b\u001a\u0005\b±\u0001\u0010\rR\u001d\u0010µ\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\b³\u0001\u0010\u000b\u001a\u0005\b´\u0001\u0010\rR\u001d\u0010¸\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\b¶\u0001\u0010\u000b\u001a\u0005\b·\u0001\u0010\rR\u001d\u0010»\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\b¹\u0001\u0010\u000b\u001a\u0005\bº\u0001\u0010\rR\u001d\u0010¾\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\b¼\u0001\u0010\u000b\u001a\u0005\b½\u0001\u0010\rR\u001d\u0010Á\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\b¿\u0001\u0010\u000b\u001a\u0005\bÀ\u0001\u0010\rR\u001d\u0010Ä\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\bÂ\u0001\u0010\u000b\u001a\u0005\bÃ\u0001\u0010\rR\u001d\u0010Ç\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\bÅ\u0001\u0010\u000b\u001a\u0005\bÆ\u0001\u0010\rR\u001d\u0010Ê\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\bÈ\u0001\u0010\u000b\u001a\u0005\bÉ\u0001\u0010\rR\u001d\u0010Í\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\bË\u0001\u0010\u000b\u001a\u0005\bÌ\u0001\u0010\rR\u001d\u0010Ð\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\bÎ\u0001\u0010\u000b\u001a\u0005\bÏ\u0001\u0010\rR\u001d\u0010Ó\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\bÑ\u0001\u0010\u000b\u001a\u0005\bÒ\u0001\u0010\rR\u001d\u0010Ö\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\bÔ\u0001\u0010\u000b\u001a\u0005\bÕ\u0001\u0010\rR\u001d\u0010Ù\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\b×\u0001\u0010\u000b\u001a\u0005\bØ\u0001\u0010\rR\u001d\u0010Ü\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\bÚ\u0001\u0010\u000b\u001a\u0005\bÛ\u0001\u0010\rR\u001d\u0010ß\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\bÝ\u0001\u0010\u000b\u001a\u0005\bÞ\u0001\u0010\rR\u001d\u0010â\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\bà\u0001\u0010\u000b\u001a\u0005\bá\u0001\u0010\rR\u001c\u0010ä\u0001\u001a\u00020\u00048\u0006XD¢\u0006\r\n\u0005\bã\u0001\u0010\u000b\u001a\u0004\b5\u0010\rR\u001d\u0010ç\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\bå\u0001\u0010\u000b\u001a\u0005\bæ\u0001\u0010\rR\u001d\u0010ê\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\bè\u0001\u0010\u000b\u001a\u0005\bé\u0001\u0010\rR\u001d\u0010í\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\bë\u0001\u0010\u000b\u001a\u0005\bì\u0001\u0010\rR\u001d\u0010ð\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\bî\u0001\u0010\u000b\u001a\u0005\bï\u0001\u0010\rR\u001d\u0010ó\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\bñ\u0001\u0010\u000b\u001a\u0005\bò\u0001\u0010\rR\u001d\u0010ö\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\bô\u0001\u0010\u000b\u001a\u0005\bõ\u0001\u0010\rR\u001d\u0010ù\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\b÷\u0001\u0010\u000b\u001a\u0005\bø\u0001\u0010\rR\u001d\u0010ü\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\bú\u0001\u0010\u000b\u001a\u0005\bû\u0001\u0010\rR\u001d\u0010ÿ\u0001\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\bý\u0001\u0010\u000b\u001a\u0005\bþ\u0001\u0010\rR\u001d\u0010\u0002\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\b\u0002\u0010\u000b\u001a\u0005\b\u0002\u0010\rR\u001d\u0010\u0002\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\b\u0002\u0010\u000b\u001a\u0005\b\u0002\u0010\rR\u001d\u0010\u0002\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\b\u0002\u0010\u000b\u001a\u0005\b\u0002\u0010\rR\u001d\u0010\u0002\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\b\u0002\u0010\u000b\u001a\u0005\b\u0002\u0010\rR\u001d\u0010\u0002\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\b\u0002\u0010\u000b\u001a\u0005\b\u0002\u0010\rR\u001d\u0010\u0002\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\b\u0002\u0010\u000b\u001a\u0005\b\u0002\u0010\rR\u001d\u0010\u0002\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\b\u0002\u0010\u000b\u001a\u0005\b\u0002\u0010\rR\u001d\u0010\u0002\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\b\u0002\u0010\u000b\u001a\u0005\b\u0002\u0010\rR\u001d\u0010\u0002\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\b\u0002\u0010\u000b\u001a\u0005\b\u0002\u0010\rR\u001d\u0010\u0002\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\b\u0002\u0010\u000b\u001a\u0005\b\u0002\u0010\rR\u001d\u0010 \u0002\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\b\u0002\u0010\u000b\u001a\u0005\b\u0002\u0010\rR\u001d\u0010£\u0002\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0005\b¡\u0002\u0010\u000b\u001a\u0005\b¢\u0002\u0010\rR\u001e\u0010§\u0002\u001a\t\u0012\u0004\u0012\u00020\u00040¤\u00028\u0002X\u0004¢\u0006\b\n\u0006\b¥\u0002\u0010¦\u0002R\"\u0010¬\u0002\u001a\t\u0012\u0004\u0012\u00020\u00040¨\u00028\u0006¢\u0006\u000f\n\u0006\b©\u0002\u0010ª\u0002\u001a\u0005\b2\u0010«\u0002¨\u0006­\u0002"}, d2 = {"LEH/p;", "", "<init>", "()V", "", "name", "LXH/N;", "a", "(Ljava/lang/String;)V", "value", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Accept", "d", "AcceptCharset", "getAcceptEncoding", "AcceptEncoding", "e", "getAcceptLanguage", "AcceptLanguage", "f", "getAcceptRanges", "AcceptRanges", "g", "getAge", "Age", "h", "getAllow", "Allow", "i", "getALPN", "ALPN", "j", "getAuthenticationInfo", "AuthenticationInfo", "k", "Authorization", "l", "getCacheControl", "CacheControl", "m", "getConnection", "Connection", "n", "getContentDisposition", "ContentDisposition", "o", "ContentEncoding", "p", "getContentLanguage", "ContentLanguage", "q", "ContentLength", "r", "getContentLocation", "ContentLocation", "s", "getContentRange", "ContentRange", "t", "ContentType", "u", "Cookie", "v", "getDASL", "DASL", "w", "Date", "x", "getDAV", "DAV", "y", "getDepth", "Depth", "z", "getDestination", "Destination", "A", "getETag", "ETag", "B", "getExpect", "Expect", "C", "Expires", "D", "getFrom", "From", "E", "getForwarded", "Forwarded", "F", "getHost", "Host", "G", "getHTTP2Settings", "HTTP2Settings", "H", "getIf", "If", "I", "getIfMatch", "IfMatch", "J", "IfModifiedSince", "K", "getIfNoneMatch", "IfNoneMatch", "L", "getIfRange", "IfRange", "M", "getIfScheduleTagMatch", "IfScheduleTagMatch", "N", "IfUnmodifiedSince", "O", "LastModified", "P", "Location", "Q", "getLockToken", "LockToken", "R", "getLink", "Link", "S", "getMaxForwards", "MaxForwards", "T", "getMIMEVersion", "MIMEVersion", "U", "getOrderingType", "OrderingType", "V", "getOrigin", "Origin", "W", "getOverwrite", "Overwrite", "X", "getPosition", "Position", "Y", "getPragma", "Pragma", "Z", "getPrefer", "Prefer", "a0", "getPreferenceApplied", "PreferenceApplied", "b0", "getProxyAuthenticate", "ProxyAuthenticate", "c0", "getProxyAuthenticationInfo", "ProxyAuthenticationInfo", "d0", "getProxyAuthorization", "ProxyAuthorization", "e0", "getPublicKeyPins", "PublicKeyPins", "f0", "getPublicKeyPinsReportOnly", "PublicKeyPinsReportOnly", "g0", "getRange", "Range", "h0", "getReferrer", "Referrer", "i0", "getRetryAfter", "RetryAfter", "j0", "getScheduleReply", "ScheduleReply", "k0", "getScheduleTag", "ScheduleTag", "l0", "getSecWebSocketAccept", "SecWebSocketAccept", "m0", "getSecWebSocketExtensions", "SecWebSocketExtensions", "n0", "getSecWebSocketKey", "SecWebSocketKey", "o0", "getSecWebSocketProtocol", "SecWebSocketProtocol", "p0", "getSecWebSocketVersion", "SecWebSocketVersion", "q0", "getServer", "Server", "r0", "getSetCookie", "SetCookie", "s0", "getSLUG", "SLUG", "t0", "getStrictTransportSecurity", "StrictTransportSecurity", "u0", "getTE", "TE", "v0", "getTimeout", "Timeout", "w0", "getTrailer", "Trailer", "x0", "getTransferEncoding", "TransferEncoding", "y0", "getUpgrade", "Upgrade", "z0", "UserAgent", "A0", "getVary", "Vary", "B0", "getVia", "Via", "C0", "getWarning", "Warning", "D0", "getWWWAuthenticate", "WWWAuthenticate", "E0", "getAccessControlAllowOrigin", "AccessControlAllowOrigin", "F0", "getAccessControlAllowMethods", "AccessControlAllowMethods", "G0", "getAccessControlAllowCredentials", "AccessControlAllowCredentials", "H0", "getAccessControlAllowHeaders", "AccessControlAllowHeaders", "I0", "getAccessControlRequestMethod", "AccessControlRequestMethod", "J0", "getAccessControlRequestHeaders", "AccessControlRequestHeaders", "K0", "getAccessControlExposeHeaders", "AccessControlExposeHeaders", "L0", "getAccessControlMaxAge", "AccessControlMaxAge", "M0", "getXHttpMethodOverride", "XHttpMethodOverride", "N0", "getXForwardedHost", "XForwardedHost", "O0", "getXForwardedServer", "XForwardedServer", "P0", "getXForwardedProto", "XForwardedProto", "Q0", "getXForwardedFor", "XForwardedFor", "R0", "getXForwardedPort", "XForwardedPort", "S0", "getXRequestId", "XRequestId", "T0", "getXCorrelationId", "XCorrelationId", "U0", "getXTotalCount", "XTotalCount", "", "V0", "[Ljava/lang/String;", "UnsafeHeadersArray", "", "W0", "Ljava/util/List;", "()Ljava/util/List;", "UnsafeHeadersList", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: EH.p  reason: case insensitive filesystem */
public final class C15631p {

    /* renamed from: A  reason: collision with root package name */
    private static final String f134039A = "ETag";

    /* renamed from: A0  reason: collision with root package name */
    private static final String f134040A0 = "Vary";

    /* renamed from: B  reason: collision with root package name */
    private static final String f134041B = "Expect";

    /* renamed from: B0  reason: collision with root package name */
    private static final String f134042B0 = "Via";

    /* renamed from: C  reason: collision with root package name */
    private static final String f134043C = "Expires";

    /* renamed from: C0  reason: collision with root package name */
    private static final String f134044C0 = "Warning";

    /* renamed from: D  reason: collision with root package name */
    private static final String f134045D = "From";

    /* renamed from: D0  reason: collision with root package name */
    private static final String f134046D0 = "WWW-Authenticate";

    /* renamed from: E  reason: collision with root package name */
    private static final String f134047E = "Forwarded";

    /* renamed from: E0  reason: collision with root package name */
    private static final String f134048E0 = "Access-Control-Allow-Origin";

    /* renamed from: F  reason: collision with root package name */
    private static final String f134049F = "Host";

    /* renamed from: F0  reason: collision with root package name */
    private static final String f134050F0 = "Access-Control-Allow-Methods";

    /* renamed from: G  reason: collision with root package name */
    private static final String f134051G = "HTTP2-Settings";

    /* renamed from: G0  reason: collision with root package name */
    private static final String f134052G0 = "Access-Control-Allow-Credentials";

    /* renamed from: H  reason: collision with root package name */
    private static final String f134053H = "If";

    /* renamed from: H0  reason: collision with root package name */
    private static final String f134054H0 = "Access-Control-Allow-Headers";

    /* renamed from: I  reason: collision with root package name */
    private static final String f134055I = "If-Match";

    /* renamed from: I0  reason: collision with root package name */
    private static final String f134056I0 = "Access-Control-Request-Method";

    /* renamed from: J  reason: collision with root package name */
    private static final String f134057J = "If-Modified-Since";

    /* renamed from: J0  reason: collision with root package name */
    private static final String f134058J0 = "Access-Control-Request-Headers";

    /* renamed from: K  reason: collision with root package name */
    private static final String f134059K = "If-None-Match";

    /* renamed from: K0  reason: collision with root package name */
    private static final String f134060K0 = "Access-Control-Expose-Headers";

    /* renamed from: L  reason: collision with root package name */
    private static final String f134061L = "If-Range";

    /* renamed from: L0  reason: collision with root package name */
    private static final String f134062L0 = "Access-Control-Max-Age";

    /* renamed from: M  reason: collision with root package name */
    private static final String f134063M = "If-Schedule-Tag-Match";

    /* renamed from: M0  reason: collision with root package name */
    private static final String f134064M0 = "X-Http-Method-Override";

    /* renamed from: N  reason: collision with root package name */
    private static final String f134065N = "If-Unmodified-Since";

    /* renamed from: N0  reason: collision with root package name */
    private static final String f134066N0 = "X-Forwarded-Host";

    /* renamed from: O  reason: collision with root package name */
    private static final String f134067O = "Last-Modified";

    /* renamed from: O0  reason: collision with root package name */
    private static final String f134068O0 = "X-Forwarded-Server";

    /* renamed from: P  reason: collision with root package name */
    private static final String f134069P = "Location";

    /* renamed from: P0  reason: collision with root package name */
    private static final String f134070P0 = "X-Forwarded-Proto";

    /* renamed from: Q  reason: collision with root package name */
    private static final String f134071Q = "Lock-Token";

    /* renamed from: Q0  reason: collision with root package name */
    private static final String f134072Q0 = "X-Forwarded-For";

    /* renamed from: R  reason: collision with root package name */
    private static final String f134073R = OpeningSource.Link.key;

    /* renamed from: R0  reason: collision with root package name */
    private static final String f134074R0 = "X-Forwarded-Port";

    /* renamed from: S  reason: collision with root package name */
    private static final String f134075S = "Max-Forwards";

    /* renamed from: S0  reason: collision with root package name */
    private static final String f134076S0 = "X-Request-ID";

    /* renamed from: T  reason: collision with root package name */
    private static final String f134077T = "MIME-Version";

    /* renamed from: T0  reason: collision with root package name */
    private static final String f134078T0 = "X-Correlation-ID";

    /* renamed from: U  reason: collision with root package name */
    private static final String f134079U = "Ordering-Type";

    /* renamed from: U0  reason: collision with root package name */
    private static final String f134080U0 = "X-Total-Count";

    /* renamed from: V  reason: collision with root package name */
    private static final String f134081V = "Origin";

    /* renamed from: V0  reason: collision with root package name */
    private static final String[] f134082V0;

    /* renamed from: W  reason: collision with root package name */
    private static final String f134083W = "Overwrite";

    /* renamed from: W0  reason: collision with root package name */
    private static final List<String> f134084W0;

    /* renamed from: X  reason: collision with root package name */
    private static final String f134085X = "Position";

    /* renamed from: Y  reason: collision with root package name */
    private static final String f134086Y = "Pragma";

    /* renamed from: Z  reason: collision with root package name */
    private static final String f134087Z = "Prefer";

    /* renamed from: a  reason: collision with root package name */
    public static final C15631p f134088a = new C15631p();

    /* renamed from: a0  reason: collision with root package name */
    private static final String f134089a0 = "Preference-Applied";

    /* renamed from: b  reason: collision with root package name */
    private static final String f134090b = "Accept";

    /* renamed from: b0  reason: collision with root package name */
    private static final String f134091b0 = "Proxy-Authenticate";

    /* renamed from: c  reason: collision with root package name */
    private static final String f134092c = "Accept-Charset";

    /* renamed from: c0  reason: collision with root package name */
    private static final String f134093c0 = "Proxy-Authentication-Info";

    /* renamed from: d  reason: collision with root package name */
    private static final String f134094d = "Accept-Encoding";

    /* renamed from: d0  reason: collision with root package name */
    private static final String f134095d0 = "Proxy-Authorization";

    /* renamed from: e  reason: collision with root package name */
    private static final String f134096e = "Accept-Language";

    /* renamed from: e0  reason: collision with root package name */
    private static final String f134097e0 = "Public-Key-Pins";

    /* renamed from: f  reason: collision with root package name */
    private static final String f134098f = "Accept-Ranges";

    /* renamed from: f0  reason: collision with root package name */
    private static final String f134099f0 = "Public-Key-Pins-Report-Only";

    /* renamed from: g  reason: collision with root package name */
    private static final String f134100g = "Age";

    /* renamed from: g0  reason: collision with root package name */
    private static final String f134101g0 = "Range";

    /* renamed from: h  reason: collision with root package name */
    private static final String f134102h = "Allow";

    /* renamed from: h0  reason: collision with root package name */
    private static final String f134103h0 = "Referer";

    /* renamed from: i  reason: collision with root package name */
    private static final String f134104i = "ALPN";

    /* renamed from: i0  reason: collision with root package name */
    private static final String f134105i0 = "Retry-After";

    /* renamed from: j  reason: collision with root package name */
    private static final String f134106j = "Authentication-Info";

    /* renamed from: j0  reason: collision with root package name */
    private static final String f134107j0 = "Schedule-Reply";

    /* renamed from: k  reason: collision with root package name */
    private static final String f134108k = "Authorization";

    /* renamed from: k0  reason: collision with root package name */
    private static final String f134109k0 = "Schedule-Tag";

    /* renamed from: l  reason: collision with root package name */
    private static final String f134110l = "Cache-Control";

    /* renamed from: l0  reason: collision with root package name */
    private static final String f134111l0 = "Sec-WebSocket-Accept";

    /* renamed from: m  reason: collision with root package name */
    private static final String f134112m = "Connection";

    /* renamed from: m0  reason: collision with root package name */
    private static final String f134113m0 = "Sec-WebSocket-Extensions";

    /* renamed from: n  reason: collision with root package name */
    private static final String f134114n = "Content-Disposition";

    /* renamed from: n0  reason: collision with root package name */
    private static final String f134115n0 = "Sec-WebSocket-Key";

    /* renamed from: o  reason: collision with root package name */
    private static final String f134116o = "Content-Encoding";

    /* renamed from: o0  reason: collision with root package name */
    private static final String f134117o0 = "Sec-WebSocket-Protocol";

    /* renamed from: p  reason: collision with root package name */
    private static final String f134118p = "Content-Language";

    /* renamed from: p0  reason: collision with root package name */
    private static final String f134119p0 = "Sec-WebSocket-Version";

    /* renamed from: q  reason: collision with root package name */
    private static final String f134120q = "Content-Length";

    /* renamed from: q0  reason: collision with root package name */
    private static final String f134121q0 = "Server";

    /* renamed from: r  reason: collision with root package name */
    private static final String f134122r = "Content-Location";

    /* renamed from: r0  reason: collision with root package name */
    private static final String f134123r0 = "Set-Cookie";

    /* renamed from: s  reason: collision with root package name */
    private static final String f134124s = "Content-Range";

    /* renamed from: s0  reason: collision with root package name */
    private static final String f134125s0 = "SLUG";

    /* renamed from: t  reason: collision with root package name */
    private static final String f134126t = "Content-Type";

    /* renamed from: t0  reason: collision with root package name */
    private static final String f134127t0 = "Strict-Transport-Security";

    /* renamed from: u  reason: collision with root package name */
    private static final String f134128u = "Cookie";

    /* renamed from: u0  reason: collision with root package name */
    private static final String f134129u0 = "TE";

    /* renamed from: v  reason: collision with root package name */
    private static final String f134130v = "DASL";

    /* renamed from: v0  reason: collision with root package name */
    private static final String f134131v0 = "Timeout";

    /* renamed from: w  reason: collision with root package name */
    private static final String f134132w = "Date";

    /* renamed from: w0  reason: collision with root package name */
    private static final String f134133w0 = "Trailer";

    /* renamed from: x  reason: collision with root package name */
    private static final String f134134x = "DAV";

    /* renamed from: x0  reason: collision with root package name */
    private static final String f134135x0 = "Transfer-Encoding";

    /* renamed from: y  reason: collision with root package name */
    private static final String f134136y = "Depth";

    /* renamed from: y0  reason: collision with root package name */
    private static final String f134137y0 = "Upgrade";

    /* renamed from: z  reason: collision with root package name */
    private static final String f134138z = "Destination";

    /* renamed from: z0  reason: collision with root package name */
    private static final String f134139z0 = "User-Agent";

    static {
        String[] strArr = {"Transfer-Encoding", "Upgrade"};
        f134082V0 = strArr;
        f134084W0 = C16870n.f(strArr);
    }

    private C15631p() {
    }

    public final void a(String str) {
        C17542s.j(str, "name");
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            int i12 = i11 + 1;
            if (C17542s.l(charAt, 32) <= 0 || C15632q.b(charAt)) {
                throw new C15640y(str, i11);
            }
            i10++;
            i11 = i12;
        }
    }

    public final void b(String str) {
        C17542s.j(str, "value");
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            int i12 = i11 + 1;
            if (C17542s.l(charAt, 32) >= 0 || charAt == 9) {
                i10++;
                i11 = i12;
            } else {
                throw new C15641z(str, i11);
            }
        }
    }

    public final String c() {
        return f134090b;
    }

    public final String d() {
        return f134092c;
    }

    public final String e() {
        return f134108k;
    }

    public final String f() {
        return f134116o;
    }

    public final String g() {
        return f134120q;
    }

    public final String h() {
        return f134126t;
    }

    public final String i() {
        return f134128u;
    }

    public final String j() {
        return f134132w;
    }

    public final String k() {
        return f134043C;
    }

    public final String l() {
        return f134057J;
    }

    public final String m() {
        return f134065N;
    }

    public final String n() {
        return f134067O;
    }

    public final String o() {
        return f134069P;
    }

    public final List<String> p() {
        return f134084W0;
    }

    public final String q() {
        return f134139z0;
    }
}
