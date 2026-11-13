package com.emptyart.rolando.timedream;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.Spinner;
import android.util.Base64;
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

    private String getVars = "?geoLocation=9.6150185,-84.6260356&checkIn=2027-11-01&checkOut=2027-11-02";
    //private String lodgeServiceUrl = "https://api.openweathermap.org/data/4.0/onecall/timeline/1day?cnt=10&lat=51.5000&lon=-0.1000&start=1776596400&appid={API key}";
    private String lodgeServiceUrl = "https://api.openweathermap.org/data/4.0/onecall/timeline/1day?cnt=10";
    private String apiKey = "34gggbdfgdf6";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_api);
        //"https://api.openweathermap.org/data/4.0/onecall/timeline/1day?cnt=10&lat=51.5000&lon=-0.1000&start=1776596400&appid={API key}"
        if (getIntent() != null) {
            String surfSpot = getIntent().getStringExtra("surf_spot");
            if (surfSpot == "Jaco"){
                this.getVars = "&lat=9.6150185&lon=-84.6260356";
            }
            if (surfSpot == "Barranca"){
                this.getVars = "&lat=9.9630624&lon=-84.7419429";
            }
            if (surfSpot == "Caldera"){
                this.getVars = "&lat=9.9168271&lon=-84.7206725";
            }
            if (surfSpot == "Tivives"){
                this.getVars = "&lat=9.875021&lon=-84.7022384";
            }
            this.lodgeServiceUrl = this.lodgeServiceUrl + this.getVars + "&start=1776596400&appid=" + this.apiKey;
        }
    }
}
