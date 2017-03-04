package paradoxgames.resopproductions.elevencentmonte;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.Display;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowManager;

/**
 * Created by Javier on 01-Mar-17.
 */

public class Gui extends SurfaceView implements View.OnTouchListener {

    private Coin coins[] = new Coin[5];
    private WindowManager wm = null;
    private Display display = null;
    private Point size = null;
    private int width, height, row;
    private boolean coinSelected = false;

    public Gui(Context context, AttributeSet attrs) {

        super(context, attrs);
        setWillNotDraw(false);

        wm = (WindowManager) getContext().getSystemService(Context.WINDOW_SERVICE);
        display = wm.getDefaultDisplay();
        size = new Point();
        display.getSize(size);
        width = size.x;
        height = size.y;

        for (int i = 0; i < 5; ++i) {
            if (i == 0 || i == 2 || i == 4) {
                coins[i] = new Coin((i + 1) * width / 6, height / 2, 1);
            } else {
                coins[i] = new Coin((i + 1) * width / 6, height / 2, 2);
            }
        }

    }

    @Override
    public void onDraw(Canvas canvas) {

        Paint bg = new Paint();

        bg.setColor(0xFF0034FA);

        canvas.drawRect(0, 0, width, height, bg);
        for (int i = 0; i < 5; ++i) {
            if (coins[i] != null) {
                coins[i].drawCoin(canvas);

            }

        }
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if (event.getActionMasked() != MotionEvent.ACTION_UP) {
            return false;
        }
        return true;
    }
}
