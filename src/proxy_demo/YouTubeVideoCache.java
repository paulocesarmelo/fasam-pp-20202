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
public class YouTubeVideoCache implements ThirdPartyYouTubeLib{
    
    ThirdPartyYouTubeLib youtubeVideo = new YouTubeVideo();
    HashMap<String, Video> videoCache = new HashMap<String, Video>();

    @Override
    public HashMap<String, Video> popularVideos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = videoCache.get(videoId);
        
        if(video == null){
            video = youtubeVideo.getVideo(videoId);
            
            videoCache.put(videoId, video);
        }
        
        return video;
    }
    
    
    
    
}
