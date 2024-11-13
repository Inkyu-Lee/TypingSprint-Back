package com.Typing.Typing.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameRoomController {

    private SimpMessagingTemplate messagingTemplate;

    @Autowired
    public GameRoomController(SimpMessagingTemplate messagingTemplate){
    }

    @MessageMapping("/Msg")
    public void SendMessage(){
        messagingTemplate.convertAndSend("/chat"); // 웹소켓 접두사 + 원하는 메시지 전송
    }
}
