package dev.mvc.fairy_tale;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer{
  
  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    

//    registry.addResourceHandler("/emotion/images/**")
//    .addResourceLocations("classpath:/static/emotion/images/");
//    
//    registry.addResourceHandler("/weather/images/**")
//    .addResourceLocations("classpath:/static/weather/images/");
//  
//    // C:/kd/deploy/team2/board/storage ->  /board/storage -> http://localhost:9093/board/storage;
//    registry.addResourceHandler("/board/storage/**").addResourceLocations("file:///" +  Board.getUploadDir());
//    
//    //test
//    registry.addResourceHandler("/temp/storage/**").addResourceLocations("file:///" +  Illustration.getUploadDirTemp());
//    
//    // C:/kd/deploy/team2/illustration/storage ->  /illustration/storage -> http://localhost:9093/grade/storage;
////    registry.addResourceHandler("/upload/**") // HTTP 요청 경로
////    .addResourceLocations("file:C:/kd/deploy/team2/illustration/storage/");
//    
//    // C:/kd/deploy/team2/illustration/storage ->  /illustration/storage -> http://localhost:9093/grade/storage;
//    registry.addResourceHandler("/upload/**") // HTTP 요청 경로
//    .addResourceLocations("file:Users:/un2_unhH/deploy/team2/illustration/storage/");
//    
//    // C:/kd/deploy/team2/survey/storage ->  /survey/storage -> http://localhost:9093/survey/storage;
//    registry.addResourceHandler("/survey/storage/**").addResourceLocations("file:///" +  Survey.getUploadDir());
//    
//    System.out.println("Upload Directory: " + Board.getUploadDir());
//    
//    // C:/kd/deploy/team2/member/storage ->  /board/storage -> http://localhost:9093/board/storage;
//    registry.addResourceHandler("/member/storage/**").addResourceLocations("file:///" +  Member.getUploadDir());
//    
//    // C:/kd/deploy/team2/grade/storage ->  /board/storage -> http://localhost:9093/grade/storage;
//    registry.addResourceHandler("/grade/storage/**").addResourceLocations("file:///" +  Grade.getUploadDir());
//
//    // C:/kd/deploy/team2/grade/storage ->  /grade/storage -> http://localhost:9093/grade/storage;
//    registry.addResourceHandler("/emotion/storage/**").addResourceLocations("file:///" +  Emotion.getUploadDir());
//
//    // C:/kd/deploy/team2/grade/storage ->  /grade/storage -> http://localhost:9093/grade/storage;
//    registry.addResourceHandler("/weather/storage/**").addResourceLocations("file:///" +  Weather.getUploadDir());
//
//      // C:/kd/deploy/team2/board/storage ->  /board/storage -> http://localhost:9093/board/storage;
//      registry.addResourceHandler("/board/storage/**").addResourceLocations("file:///" +  Board.getUploadDir());
//      
//      // C:/kd/deploy/team2/illustration/storage ->  /illustration/storage -> http://localhost:9093/grade/storage;
//      registry.addResourceHandler("/upload/**") // HTTP 요청 경로
//      .addResourceLocations("file:C:/kd/deploy/team2/illustration/storage/");
//      
//      // C:/kd/deploy/team2/survey/storage ->  /survey/storage -> http://localhost:9093/survey/storage;
//      registry.addResourceHandler("/survey/storage/**").addResourceLocations("file:///" +  Survey.getUploadDir());
//      
//      // C:/kd/deploy/team2/member/storage ->  /board/storage -> http://localhost:9093/board/storage;
//      registry.addResourceHandler("/member/storage/**").addResourceLocations("file:///" +  Member.getUploadDir());
//      
//      // C:/kd/deploy/team2/grade/storage ->  /board/storage -> http://localhost:9093/grade/storage;
//      registry.addResourceHandler("/grade/storage/**").addResourceLocations("file:///" +  Grade.getUploadDir());
//
//      // C:/kd/deploy/team2/emotion/storage ->  /emotion/storage -> http://localhost:9093/emotion/storage;
//      registry.addResourceHandler("/emotion/storage/**").addResourceLocations("file:///" +  Emotion.getUploadDir());
//
//      // C:/kd/deploy/team2/weather/storage ->  /weather/storage -> http://localhost:9093/weather/storage;
//      registry.addResourceHandler("/weather/storage/**").addResourceLocations("file:///" +  Weather.getUploadDir());
//      
//      // C:/kd/deploy/team2/notice/storage ->  /notice/storage -> http://localhost:9093/notice/storage;
//      registry.addResourceHandler("/notice/storage/**").addResourceLocations("file:///" +  Notice.getUploadDir());

  }

}
