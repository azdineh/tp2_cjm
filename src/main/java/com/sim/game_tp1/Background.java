package com.sim.game_tp1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Background {
    int x=0, y=0;
    Bitmap background;

    public Background(int screenX, int screenY, Resources res) {
        background= BitmapFactory.decodeResource(res,R.drawable.backgroundclear);
        background=Bitmap.createScaledBitmap(background,screenX,screenY,false);
    }
}
