package org.tvheadend.tvhclient.model;


public class TimerRecording implements Comparable<TimerRecording> {

    public String id;
    public boolean enabled = true;
    public long retention;
    public long daysOfWeek;
    public long priority;
    public long start;  // value is in seconds
    public long stop;   // value is in seconds
    public String title;
    public String name;
    public Channel channel;

    @Override
    public int compareTo(TimerRecording that) {
        return (this.id.equals(that.id)) ? 0 : 1;
    }
}