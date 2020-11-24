/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy_demo;

/**
 *
 * @author paulocesarmelo
 */
public class Demo2 {
    
    public static void main(String args[]){
        
        ThirdPartyYouTubeLib youtubeVideo = new YouTubeVideo();
        
        ThirdPartyYouTubeLib proxy = new YouTubeProxy(youtubeVideo);
        
        Video v = proxy.getVideo("exemplo");
        
        if ( v != null){
            System.out.println(v.title);
        }
        
    }
    
}
