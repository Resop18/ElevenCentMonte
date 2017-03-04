package paradoxgames.resopproductions.elevencentmonte;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by Javier on 02-Mar-17.
 */

public class Coin {

    private float width, height;
    private int type;
    private boolean selected = false;

    public Coin(float xCord, float yCord, int initType){
        this.width = xCord;
        this.height = yCord;
        this.type = initType;
    }

    public Coin(int row, int initType){

    }

    public void drawCoin(Canvas canvas){
        Paint dime  = new Paint();
        Paint penny = new Paint();
        Paint outline = new Paint();

        outline.setStyle(Paint.Style.STROKE);

        outline.setColor(0xFF000000);
        penny.setColor(0xFFAD6F69);
        dime.setColor(0xFF747678);

        if(this.type==1) {
            canvas.drawCircle(width, height, 100, penny);
            canvas.drawCircle(width, height, 100, outline);
        }
        if(this.type==2) {
            canvas.drawCircle(width, height, 75, dime);
            canvas.drawCircle(width, height, 75, outline);
        }
    }

    public int getType(){return this.type;}

    public boolean isSelected(){return this.selected;}

    public void setSelected(boolean select){this.selected = select;}

}
