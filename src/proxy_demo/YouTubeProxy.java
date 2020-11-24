/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy_demo;

import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author paulocesarmelo
 */
public class YouTubeProxy implements ThirdPartyYouTubeLib{

    ThirdPartyYouTubeLib youtubeVideo = new YouTubeVideo();
    
    public YouTubeProxy(ThirdPartyYouTubeLib youtubeVideo){
        this.youtubeVideo = youtubeVideo;
    }
    
    @Override
    public HashMap<String, Video> popularVideos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Video getVideo(String videoId) {
        
        Video video = null;
        
        if(checkAccess()){
            video = youtubeVideo.getVideo(videoId);
        }
        
        return video;
    }
    
    public boolean checkAccess(){
        
        String user = JOptionPane.showInputDialog("User: ");
        
        if(user.equals("admin")){
            return true;
        }else{
            return false;
        }
    }
    
}
