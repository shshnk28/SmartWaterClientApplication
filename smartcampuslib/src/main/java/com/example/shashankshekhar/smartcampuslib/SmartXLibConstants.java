package com.example.shashankshekhar.smartcampuslib;

import android.renderscript.ScriptIntrinsicYuvToRGB;

/**
 * Created by shashankshekhar on 27/10/15.
 */

public final class SmartXLibConstants {
    private SmartXLibConstants() {}; // no instantiation
    public static  final String MY_TAG = "S-WATER";
    public static  final String WATER_EVENTS_TOPIC = "iisc/smartx/mobile/water/data";
    public static  final String WATER_LEVEL_TOPIC_MOTE4 = "iisc/smartx/water/data/moteid4";
    public static  final String WATER_LEVEL_TOPIC_MOTE2 = "iisc/smartx/water/data/moteid2";
    public static  final String SOLAR_DATA_TOPIC_NAME = "solarDataMQTT";
    public static  final String EVENT_NAME = "WATER_LEAKAGE";
    public static  final int PUBLISH_MESSAGE = 3;
    public static  final int SUBSCRIBE_TO_TOPIC = 4;
    public static  final int UNSUBSCRIBE_TO_TOPIC = 5;

}
