package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class na extends c {
    private final int height = 96;
    private final int width = 96;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 96;
            case 1:
                return 96;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix h = c.h(looper);
                float[] g = c.g(looper);
                Paint k = c.k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = c.k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                c.a(k2, looper).setStrokeWidth(1.0f);
                canvas.save();
                g = c.a(g, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 19.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a = c.a(k, looper);
                a.setColor(-3487030);
                g = c.a(g, 1.0f, 0.0f, 63.0f, 0.0f, 1.0f, 33.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a2 = c.a(a, looper);
                float[] a3 = c.a(g, -1.0f, 0.0f, 14.043456f, 0.0f, 1.0f, 0.0f);
                h.reset();
                h.setValues(a3);
                canvas.concat(h);
                Path l = c.l(looper);
                l.moveTo(0.0618892f, 1.0f);
                l.lineTo(0.0618892f, 24.0f);
                l.lineTo(13.981567f, 24.0f);
                l.lineTo(13.981567f, 1.0f);
                l.lineTo(0.0618892f, 1.0f);
                l.close();
                l.moveTo(1.0434566f, 2.0f);
                l.lineTo(1.0434566f, 21.0f);
                l.lineTo(13.018799f, 21.0f);
                l.lineTo(13.018799f, 2.0f);
                l.lineTo(1.0434566f, 2.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                a = c.a(a, looper);
                l = c.l(looper);
                l.moveTo(13.917834f, 1.0f);
                l.cubicTo(12.682228f, 0.4226382f, 10.33483f, 0.073879234f, 7.5238094f, 0.0f);
                l.cubicTo(7.6173635f, 0.003899288f, 7.3184175f, 0.0f, 7.5238094f, 0.0f);
                l.cubicTo(4.272239f, 0.0f, 1.4953619f, 0.36036247f, 0.10170941f, 1.0f);
                l.lineTo(13.917834f, 1.0f);
                l.close();
                l.moveTo(13.917834f, 24.0f);
                l.cubicTo(12.682228f, 24.577362f, 10.33483f, 24.92612f, 7.5238094f, 25.0f);
                l.cubicTo(7.6173635f, 24.996101f, 7.3184175f, 25.0f, 7.5238094f, 25.0f);
                l.cubicTo(4.272239f, 25.0f, 1.4953619f, 24.639637f, 0.10170941f, 24.0f);
                l.lineTo(13.917834f, 24.0f);
                l.lineTo(13.917834f, 24.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.restore();
                canvas.save();
                a = c.a(k, looper);
                a.setColor(-12337128);
                g = c.a(a3, 0.70710677f, 0.70710677f, -3.0619469f, -0.70710677f, 0.70710677f, 31.718912f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                l = c.l(looper);
                l.moveTo(24.9f, 28.444445f);
                l.lineTo(50.985714f, 28.444445f);
                l.lineTo(50.985714f, 23.703705f);
                l.lineTo(27.27143f, 23.703705f);
                l.lineTo(27.27143f, 10.666667f);
                l.lineTo(22.52857f, 10.666667f);
                l.lineTo(22.52857f, 28.444445f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 1);
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                Paint a4 = c.a(k, looper);
                a4.setColor(-3487030);
                Path l2 = c.l(looper);
                l2.moveTo(26.0f, 52.0f);
                l2.lineTo(44.0f, 52.0f);
                l2.lineTo(44.0f, 56.0f);
                l2.lineTo(26.0f, 56.0f);
                l2.lineTo(26.0f, 52.0f);
                l2.close();
                canvas.drawPath(l2, a4);
                canvas.restore();
                canvas.save();
                Paint a5 = c.a(k, looper);
                a5.setColor(-2105377);
                l = c.l(looper);
                l.moveTo(60.0f, 53.0f);
                l.lineTo(1.9917458f, 53.0f);
                l.cubicTo(0.89770234f, 53.0f, 0.0f, 52.105953f, 0.0f, 51.00309f);
                l.lineTo(0.0f, 1.9969095f);
                l.cubicTo(0.0f, 0.8976762f, 0.89173496f, 0.0f, 1.9917458f, 0.0f);
                l.lineTo(69.008255f, 0.0f);
                l.cubicTo(70.102295f, 0.0f, 71.0f, 0.89404684f, 71.0f, 1.9969095f);
                l.lineTo(71.0f, 32.0f);
                l.lineTo(68.0f, 32.0f);
                l.lineTo(68.0f, 4.9931736f);
                l.cubicTo(68.0f, 4.4446588f, 67.55714f, 4.0f, 66.99471f, 4.0f);
                l.lineTo(5.005287f, 4.0f);
                l.cubicTo(4.4500823f, 4.0f, 4.0f, 4.4464755f, 4.0f, 4.9931736f);
                l.lineTo(4.0f, 44.006824f);
                l.cubicTo(4.0f, 44.55534f, 4.4428625f, 45.0f, 5.005287f, 45.0f);
                l.lineTo(60.0f, 45.0f);
                l.lineTo(60.0f, 53.0f);
                l.close();
                l.moveTo(19.0f, 58.0f);
                l.lineTo(19.0f, 57.00937f);
                l.cubicTo(19.0f, 56.44335f, 19.444485f, 56.0f, 19.992786f, 56.0f);
                l.lineTo(50.007214f, 56.0f);
                l.cubicTo(50.547638f, 56.0f, 51.0f, 56.45191f, 51.0f, 57.00937f);
                l.lineTo(51.0f, 58.0f);
                l.lineTo(19.0f, 58.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a5);
                canvas.restore();
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
