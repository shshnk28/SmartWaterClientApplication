package com.example.shashankshekhar.smartcampuslib;

import android.renderscript.ScriptIntrinsicYuvToRGB;

/**
 * Created by shashankshekhar on 27/10/15.
 */

public final class SmartXLibConstants {
    private SmartXLibConstants() {}; // no instantiation
    public static  final String MY_TAG = "S-WATER";

    public static  final String SOLAR_DATA_TOPIC_NAME = "solarDataMQTT";
    public static  final String EVENT_NAME = "WATER_LEAKAGE";
    public static  final int PUBLISH_MESSAGE = 3;
    public static  final int SUBSCRIBE_TO_TOPIC = 4;
    public static  final int UNSUBSCRIBE_TO_TOPIC = 5;
    public static  final int CHECK_SERVICE = 6;
    public static  final int CHECK_MQTT_CONNECTION = 7;
    public static  final int CONNECT_MQTT = 8;
    public static  final int DISCONNECT_MQTT = 9;

}
/*
work of library
1. init the reply messenger
2. parse the callback for ex message published, subscribed unsubscribed ,
 */