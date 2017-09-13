package com.example.broadcastbestpractice;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/9/1.
 */

public class ActivityCollector {

    public static List<Activity> activities=new ArrayList<Activity>();

    public static  void addActivity(Activity activity) {
        activities.add(activity);
    }

    public static  void removedActivity(Activity activity){
        activities.remove(activity);
    }

    public static void finishAll() {
        for(Activity activity:activities){
            activity.finish();
        }
    }
}
