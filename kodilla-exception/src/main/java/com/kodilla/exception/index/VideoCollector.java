package com.kodilla.exception.index;

import java.util.ArrayList;
import java.util.List;

public class VideoCollector {

    public List<String> getCollection() {
        ArrayList<String> videos = new ArrayList<>();
        videos.add("Extra Movie1");
        videos.add("Extra Movie2");
        videos.add("Extra Movie3");
        return videos;
    }
}