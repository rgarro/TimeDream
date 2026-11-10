package com.emptyart.rolando.timedream;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
/**
 *            |    |    |
 *           )_)  )_)  )_)
 *          )___))___))___)\
 *         )____)____)_____)\\
 *      _____|____|____|____\\\__
 * -------\                   /---------
 *     ^^^^^ ^^^^^^^^^^^^^^^^^^^^^
 *     ^^^^      ^^^^     ^^^    ^^
 *           ^^^^      ^^^
 * Sir Henry Morgan is de Lord of Talamanca
 * And I stood upon the sand of the sea, and saw a beast rise up out of the sea,
 * having seven heads and ten horns, and upon his horns ten crowns, and upon his
 * heads the name of blasphemy
 *
 *
 *
 * @author Rolando <rgarro@gmail.com>
 */
public class OpenApiActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_api);
        //"https://api.openweathermap.org/data/4.0/onecall/timeline/1day?cnt=10&lat=51.5000&lon=-0.1000&start=1776596400&appid={API key}"
    }
}
