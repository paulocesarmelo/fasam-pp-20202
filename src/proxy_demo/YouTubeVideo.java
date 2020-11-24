/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy_demo;

import java.util.HashMap;

/**
 *
 * @author paulocesarmelo
 */
public class YouTubeVideo implements ThirdPartyYouTubeLib {

    @Override
    public HashMap<String, Video> popularVideos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = new Video(videoId, "New Video1");
        
        return video;
    }
    
}
